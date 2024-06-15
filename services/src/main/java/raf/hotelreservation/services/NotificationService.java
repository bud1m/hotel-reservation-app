package raf.hotelreservation.services;

import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.esotericsoftware.kryonet.Server;
import raf.hotelreservation.grpc.Hotel;
import raf.hotelreservation.grpc.Reservation;
import raf.hotelreservation.hotels.HotelThread;
import raf.hotelreservation.kyro.Network;
import raf.hotelreservation.util.ServiceDataUtil;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class NotificationService implements Runnable {

    private static final ConcurrentHashMap<String, HotelThread> hotelThreadMap = ServiceDataUtil.hotelThreadMap;
    private static final ConcurrentHashMap<String, List<Hotel>> clientHotelMap = ServiceDataUtil.clientHotelMap;

    private static final ConcurrentHashMap<String, Reservation> resarvationMap = ServiceDataUtil.reservationMap;
    private static final ConcurrentHashMap<String, String> reservationClientMap = ServiceDataUtil.reservationClientMap;

    private static final ConcurrentHashMap<String, String> clientPaymentMap = ServiceDataUtil.clientPaymentMap;

    private static final ConcurrentHashMap<String, Connection> userConnectionMap = new ConcurrentHashMap<String, Connection>();
    private static final ConcurrentHashMap<Connection, String> connectionUserMap = new ConcurrentHashMap<Connection, String>();

    private volatile Thread thread = null;
    private volatile boolean running = false;
    private final Server server;
    private final ScheduledExecutorService scheduler;

    public NotificationService() {
        this.scheduler = Executors.newScheduledThreadPool(1);
        this.server = new Server();
        Network.register(server);
        registerListener();
        scheduleExpiredReservationCheck();
    }

    private void registerListener() {
        server.addListener(new Listener() {
            public void received(Connection conn, Object object) {
                if (object instanceof Network.NewConnectionMessage) {
                    Network.NewConnectionMessage connectionMessage = (Network.NewConnectionMessage) object;
                    userConnectionMap.put(connectionMessage.clientID, conn);
                    System.out.println("New connection from " + connectionMessage.clientID);
                    myHotelsInit(connectionMessage.clientID);
                }

                if (object instanceof Network.HotelUpdatedMessage) {
                    Network.HotelUpdatedMessage hotelUpdatedMessage = (Network.HotelUpdatedMessage) object;
                    notifyClientForUpdates(hotelUpdatedMessage.hotelID);
                }

            }
        });
    }

    private void scheduleExpiredReservationCheck() {
        scheduler.scheduleAtFixedRate(this::checkExpiredReservations, 0, 5, TimeUnit.SECONDS);
    }

    public void notifyClientForUpdates(String hotelID) {
        for (Map.Entry<String, List<Hotel>> entry : clientHotelMap.entrySet()) {
            String clientID = entry.getKey();
            List<Hotel> hotels = entry.getValue();

            for (Hotel h : hotels) {
                String currHotelID = HotelService.hotelID(h);

                if (currHotelID.equals(hotelID)) {
                    Connection clientConn = userConnectionMap.get(clientID);
                    if (clientConn == null) {
                        continue;
                    }
                    HotelThread ht = hotelThreadMap.get(hotelID);

                    if (ht != null) {
                        Network.UpdateMessage updateMessage = new Network.UpdateMessage(
                                hotelID,
                                ht.getReservedRooms(),
                                ht.getCurrPrice()
                        );

                        server.sendToTCP(clientConn.getID(), updateMessage);
                    }
                }


            }
        }
    }

    private void myHotelsInit(String clientID) {
        List<Hotel> availableHotels = clientHotelMap.get(clientID);
        if (availableHotels == null) {
            return;
        }

        Connection clientConn = userConnectionMap.get(clientID);
        if (clientConn == null) {
            return;
        }

        for (Hotel hotel : availableHotels) {
            String hotelID = HotelService.hotelID(hotel);
            HotelThread ht = hotelThreadMap.get(hotelID);

            if (ht != null) {
                Network.UpdateMessage updateMessage = new Network.UpdateMessage(
                        hotelID,
                        ht.getReservedRooms(),
                        ht.getCurrPrice()
                );

                server.sendToTCP(clientConn.getID(), updateMessage);
            } else {
                System.err.println("HotelThread not found for hotel ID: " + hotelID);
            }
        }
    }

    private void checkExpiredReservations() {
        Instant now = Instant.now();
        List<String> reservationsToRemove = new ArrayList<>();

        for (String reservationID : new ArrayList<>(resarvationMap.keySet())) {
            Reservation reservation = resarvationMap.get(reservationID);
            if (reservation != null && now.isAfter(Instant.ofEpochMilli(reservation.getDateToPay()))) {
                reservationsToRemove.add(reservationID);

                String clientID = reservationClientMap.get(reservationID);
                if (clientID != null) {
                    boolean isPayed = clientPaymentMap.get(clientID).equals("PAYED");
                    clientPaymentMap.remove(clientID);
                    if (isPayed) {
                        continue;
                    }

                    HotelThread ht = hotelThreadMap.get(reservation.getHotelID());
                    ht.freeRoom();

                    Connection connection = userConnectionMap.get(clientID);
                    if (connection != null) {
                        try {
                            server.sendToTCP(connection.getID(), new Network.PaymentNotInTimeMessage(clientID));
                        } catch (Exception e) {
                            System.err.println("Failed to send payment not in time message to client: " + clientID);
                            e.printStackTrace();
                        }
                    } else {
                        System.err.println("Connection not found for client: " + clientID);
                    }
                }

                resarvationMap.remove(reservationID);
            }
        }

        for (String reservationID : reservationsToRemove) {
            reservationClientMap.remove(reservationID);
        }
    }


    public void start() throws IOException {
        server.start();
        server.bind(Network.PORT);

        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    @Override
    public void run() {
        running = true;
        while (running) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stop() {
        Thread stopThread = thread;
        thread = null;
        running = false;
        if (stopThread != null)
            stopThread.interrupt();
    }
}
