package raf.hotelreservation.hotels;


import raf.hotelreservation.grpc.Hotel;

public class InitHotels {

    static String[][] hotelData = {
            {"Grand Hotel", "4", "Belgrade", "2.5", "15", "250.00",},
            {"Beach Resort", "3", "Belgrade", "0.8", "8", "180.50"},
            {"Mountain Lodge", "2", "Belgrade", "5.0", "3", "120.00"},
            {"Riverside Inn", "3", "Paris", "1.2", "10", "210.75"},
            {"Lakeside Retreat", "4", "Paris", "3.5", "20", "320.00"},
            {"Sunset Paradise Inn", "5", "Paris", "4.2", "12", "360.00"},
            {"City Lights Hotel", "3", "Copenhagen", "1.0", "5", "190.25"},
            {"Seaside Retreat", "4", "Copenhagen", "3.8", "18", "280.00"},
            {"The Royal Plaza", "5", "Copenhagen", "2.0", "7", "400.00"},
            {"Lakeside Manor", "4", "Dubai", "3.0", "10", "290.50"},
            {"Golden Sands Resort", "3", "Dubai", "6.5", "25", "220.75"},
            {"Silver Star Hotel", "4", "Dubai", "1.5", "9", "280.00"},
            {"Green Valley Inn", "3", "Bali", "4.2", "16", "210.50"},
            {"Harbor View Hotel", "5", "Bali", "0.5", "3", "480.00"},
            {"Skyline Suites", "4", "Bali", "1.0", "6", "350.00"},
    };

    public static HotelThread[] HotelThreads() {
        HotelThread[] hotelThreadsArr = new HotelThread[hotelData.length];
        int i = 0;
        for (String[] data : hotelData) {
            HotelThread ht = new HotelThread(Hotel.newBuilder()
                    .setName(data[0])
                    .setStars(Integer.parseInt(data[1]))
                    .setLocation(data[2])
                    .setDistanceFromCenter(Double.parseDouble(data[3]))
                    .build(),
                    Integer.parseInt(data[4]),
                    Double.parseDouble(data[5]), 5000);
            hotelThreadsArr[i++] = ht;
        }

        return hotelThreadsArr;
    }

}
