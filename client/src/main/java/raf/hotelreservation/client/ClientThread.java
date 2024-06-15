package raf.hotelreservation.client;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import io.grpc.StatusRuntimeException;
import raf.hotelreservation.grpc.*;
import raf.hotelreservation.grpc.HotelServiceGrpc.*;
import raf.hotelreservation.kyro.Network;
import raf.hotelreservation.util.GrpcClientUtil;
import raf.hotelreservation.grpc.ReservationServiceGrpc.*;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class ClientThread implements Runnable {

    private volatile Thread thread = null;
    private volatile boolean running = false;
    private final String clientID;
    private final Client client;


    private double money = 1000;

    private double minPrice = 1000;
    private double maxPrice = 0;

    private final HotelServiceBlockingStub hotelServiceBlockingStub = HotelServiceGrpc
            .newBlockingStub(GrpcClientUtil.getChannel());
    private final ReservationServiceBlockingStub reservationServiceBlockingStub = ReservationServiceGrpc
            .newBlockingStub(GrpcClientUtil.getChannel());
    private final PaymentServiceGrpc.PaymentServiceBlockingStub paymentServiceBlockingStub = PaymentServiceGrpc
            .newBlockingStub(GrpcClientUtil.getChannel());


    // GUI components
    private JFrame frame;
    private JTextArea messageArea;

    public ClientThread() {
        client = new Client();
        Network.register(client);
        clientID = generateClientID();
        registerListener();
        initializeGUI();
    }

    private void initializeGUI() {
        frame = new JFrame("Client Thread - " + clientID);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        messageArea = new JTextArea();
        messageArea.setEditable(false);

        JScrollPane scrollPane = new JScrollPane(messageArea);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setVisible(true);
    }

    private void displayMessage(String message) {
        SwingUtilities.invokeLater(() -> {
            messageArea.append(message + "\n");
            messageArea.setCaretPosition(messageArea.getDocument().getLength()); // Scroll to bottom
        });
    }

    private void calcMinMax(double currPrice) {
        if (currPrice > maxPrice) {
            this.maxPrice = currPrice;
        }
        if (currPrice < minPrice) {
            this.minPrice = currPrice;
        }
    }

    private void registerListener() {
        client.addListener(new Listener() {
            public void received(Connection conn, Object obj) {
                if (obj instanceof Network.UpdateMessage) {
                    Network.UpdateMessage updateMessage = (Network.UpdateMessage) obj;
                    calcMinMax(updateMessage.currPrice);
                    displayMessage("[UPDATE]------------ " + updateMessage.hotelID);
                    displayMessage("Hotel ID: " + updateMessage.hotelID);
                    displayMessage("Reserved Rooms: " + updateMessage.reservedRooms);
                    displayMessage("Current Price: " + updateMessage.currPrice);
//                    displayMessage("Minimum Price: " + minPrice);
//                    displayMessage("Maximum Price: " + maxPrice);
                }
                if (obj instanceof Network.PaymentNotInTimeMessage) {
                    Network.PaymentNotInTimeMessage paymentNotInTimeMessage = (Network.PaymentNotInTimeMessage) obj;
                    displayMessage("Reservation canceled! " + paymentNotInTimeMessage.clientID);
                }


            }
        });
    }

    private String generateClientID() {
        return UUID.randomUUID().toString();
    }

    public void start() throws IOException {
        client.start();
        client.connect(5000, "127.0.0.1", Network.PORT);
        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }


    public Client getClient() {
        return client;
    }

    public void stop() {
        Thread stopThread = thread;
        thread = null;
        running = false;
        if (stopThread != null)
            stopThread.interrupt();
    }

    public void shutdown() {
        stop();
        client.stop();
        frame.dispose();
    }

    @Override
    public void run() {
        running = true;
        while (running) {
        }
    }


    public Reservation makeNewReservation(String hotelID, long startDate, int numDays) {
        try {
            ReservationRequest request = ReservationRequest.newBuilder()
                    .setClientID(clientID)
                    .setHotelID(hotelID)
                    .setStartDate(startDate)
                    .setNumDays(numDays)
                    .build();

            Reservation reservation = reservationServiceBlockingStub.reserveHotel(request);

            System.out.println("Reservation successful.");

            return reservation;
        } catch (Exception e) {
            System.err.println("Error occurred during reservation: " + e.getMessage());
            return null;
        }
    }

    public List<Hotel> findHotels(String city, int minStars, double maxDistance) {

        QueryRequest request = QueryRequest.newBuilder()
                .setClientID(clientID)
                .setCity(city)
                .setMinStars(minStars)
                .setMaxDistance(maxDistance)
                .build();

        Iterator<Hotel> availableHotels = hotelServiceBlockingStub.findAvailableHotels(request);

        List<Hotel> hotels = new ArrayList<>();
        while (availableHotels.hasNext()) {
            hotels.add(availableHotels.next());
        }

        return hotels;
    }

    public void payHotel() {
        PaymentRequest request = PaymentRequest.newBuilder()
                .setClientID(clientID)
                .setAvailableAmount(money)
                .build();

        try {
            PaymentResponse response = paymentServiceBlockingStub.processPayment(request);
            double amountToPay = response.getAmount();
            if (amountToPay == 0) {
                System.err.println("Payment failed!");
                return;
            }
            money -= amountToPay;
        } catch (StatusRuntimeException e) {
            System.err.println("Error occurred during payment: " + e.getMessage());
        }
    }

    public String getClientID() {
        return clientID;
    }

    public double getMoney() {
        return money;
    }
}
