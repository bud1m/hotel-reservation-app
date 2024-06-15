package raf.hotelreservation.kyro;

import com.esotericsoftware.kryo.Kryo;
import com.esotericsoftware.kryonet.EndPoint;

public class Network {

    public static final int PORT = 8003;

    static public void register(EndPoint endPoint) {
        Kryo kryo = endPoint.getKryo();
        kryo.register(UpdateMessage.class);
        kryo.register(HotelFull.class);
        kryo.register(PaymentDueMessage.class);
        kryo.register(PaymentNotInTimeMessage.class);
        kryo.register(NewConnectionMessage.class);
        kryo.register(HotelUpdatedMessage.class);
        kryo.register(FindHotelMessage.class);


        kryo.register(String[].class);

    }

    public static class UpdateMessage {
        public String hotelID;
        public int reservedRooms;
        public double currPrice;

        public UpdateMessage() {

        }

        public UpdateMessage(String hotelID, int reservedRooms, double currPrice) {
            this.hotelID = hotelID;
            this.reservedRooms = reservedRooms;
            this.currPrice = currPrice;
        }
    }

    public static class FindHotelMessage {
    }

    public static class HotelUpdatedMessage {
        public String hotelID;

        public HotelUpdatedMessage() {

        }

        public HotelUpdatedMessage(String hotelID) {
            this.hotelID = hotelID;
        }
    }


    public static class HotelFull {
        public String hotelID;
    }

    public static class PaymentDueMessage {
        public String reservationID;
        public double amountToPay;

    }

    public static class PaymentNotInTimeMessage {
        public String clientID;

        public PaymentNotInTimeMessage() {
        }

        public PaymentNotInTimeMessage(String clientID) {
            this.clientID = clientID;
        }
    }

    public static class NewConnectionMessage {
        public String clientID;

        public NewConnectionMessage() {

        }

        public NewConnectionMessage(String clientID) {
            this.clientID = clientID;
        }
    }
}
