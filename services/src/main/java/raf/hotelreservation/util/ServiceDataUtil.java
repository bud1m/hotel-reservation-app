package raf.hotelreservation.util;

import raf.hotelreservation.grpc.Hotel;
import raf.hotelreservation.grpc.Reservation;
import raf.hotelreservation.hotels.HotelThread;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ServiceDataUtil {

    public static final ConcurrentHashMap<String, HotelThread> hotelThreadMap = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, List<Hotel>> clientHotelMap = new ConcurrentHashMap<>();

    public static final ConcurrentHashMap<String, Reservation> reservationMap = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, String> reservationClientMap = new ConcurrentHashMap<>();

    public static final ConcurrentHashMap<String, String> clientPaymentMap = new ConcurrentHashMap<>();

}
