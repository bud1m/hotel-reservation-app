package raf.hotelreservation.client;

import raf.hotelreservation.client.ClientThread;
import raf.hotelreservation.kyro.Network;

import java.io.IOException;
import java.time.Instant;
import java.util.Random;

public class ClientTestRunner {

    public static void main(String[] args) {
        ClientThread clientThread = new ClientThread();

        try {
            clientThread.start();

            String clientID = clientThread.getClientID();

            clientThread.findHotels("Copenhagen", 3, 10.00);

            Network.NewConnectionMessage connectionMessage = new Network.NewConnectionMessage(clientID);
            clientThread.getClient().sendTCP(connectionMessage);

            long startDate = Instant.now().toEpochMilli();
            clientThread.makeNewReservation("City Lights Hotel-Copenhagen", startDate, 50);
            clientThread.payHotel();

            System.out.println("Payed " + clientThread.getMoney());

        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error:" + e.getMessage());
        }
    }
}
