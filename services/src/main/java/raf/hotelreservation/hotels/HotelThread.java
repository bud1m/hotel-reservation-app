package raf.hotelreservation.hotels;

import com.esotericsoftware.kryonet.Client;
import com.esotericsoftware.kryonet.Connection;
import com.esotericsoftware.kryonet.Listener;
import com.google.common.util.concurrent.AtomicDouble;
import raf.hotelreservation.grpc.Hotel;
import raf.hotelreservation.kyro.Network;
import raf.hotelreservation.kyro.Network.*;
import raf.hotelreservation.services.HotelService;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class HotelThread implements Runnable {

    private final Object updateLock = new Object();
    private volatile Thread thread = null;
    private final Lock clientLock = new ReentrantLock();

    private final Client client;
    private final Hotel hotelGrpc;

    private AtomicDouble currPrice;
    private AtomicDouble hotelBalance;
    private AtomicInteger reservedRooms;


    private boolean updateNeeded = false;


    public double getCurrPrice() {
        return currPrice.get();
    }

    public HotelThread(Hotel hotel, int reservedRooms, double currPrice, double hotelBalance) {
        this.hotelGrpc = hotel;
        this.reservedRooms = new AtomicInteger(reservedRooms);
        this.currPrice = new AtomicDouble(currPrice);
        this.hotelBalance = new AtomicDouble(hotelBalance);
        client = new Client();
        Network.register(client);
    }

    public int getReservedRooms() {
        if (reservedRooms.get() > 0)
            return reservedRooms.get();
        return 0;
    }

    public boolean reserveRoom() {
        int currentRooms;
        do {
            currentRooms = reservedRooms.get();
            if (currentRooms <= 0) {
                sendHotelFullMessage();
                return false;
            }
            currPrice.getAndAdd(2);
        } while (!reservedRooms.compareAndSet(currentRooms, currentRooms - 1));
        sendUpdateMessage();
        return true;
    }

    public boolean freeRoom() {
        int currentRooms;
        do {
            currentRooms = reservedRooms.get();
            currPrice.getAndAdd(-2);
        } while (!reservedRooms.compareAndSet(currentRooms, currentRooms + 1));
        sendUpdateMessage();
        return true;
    }


    public void setReservedRooms(AtomicInteger reservedRooms) {
        this.reservedRooms.getAndDecrement();
    }

    public Hotel getHotelGrpc() {
        return hotelGrpc;
    }

    private void sendHotelFullMessage() {
        HotelFull hotelFullMessage = new HotelFull();
        hotelFullMessage.hotelID = HotelService.hotelID(hotelGrpc);
        clientLock.lock();
        try {
            client.sendTCP(hotelFullMessage);
        } finally {
            clientLock.unlock();
        }
    }

    public void updateHotelBalance(double amount) {
        hotelBalance.addAndGet(amount);
    }

    private void sendUpdateMessage() {
        HotelUpdatedMessage hotelUpdatedMessage = new HotelUpdatedMessage();
        hotelUpdatedMessage.hotelID = HotelService.hotelID(hotelGrpc);

        synchronized (updateLock) {
            client.sendTCP(hotelUpdatedMessage);
            updateNeeded = false;
        }
    }

    public void start() throws IOException {
        client.start();
        client.connect(5000, "127.0.0.1", Network.PORT);

        if (thread == null) {
            thread = new Thread(this);
            thread.start();
        }
    }

    @Override
    public void run() {
        while (true) {
            synchronized (updateLock) {
                try {
                    while (!updateNeeded) {
                        updateLock.wait();
                    }
                    sendUpdateMessage();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
