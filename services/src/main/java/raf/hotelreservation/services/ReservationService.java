package raf.hotelreservation.services;

import io.grpc.stub.StreamObserver;
import raf.hotelreservation.grpc.Reservation;
import raf.hotelreservation.grpc.ReservationRequest;
import raf.hotelreservation.grpc.ReservationServiceGrpc;
import raf.hotelreservation.hotels.HotelThread;
import raf.hotelreservation.util.ExecutorUtil;
import raf.hotelreservation.util.ServiceDataUtil;

import java.util.UUID;
import java.util.concurrent.*;

public class ReservationService extends ReservationServiceGrpc.ReservationServiceImplBase {

    private final ConcurrentHashMap<String, Reservation> reservationMap = ServiceDataUtil.reservationMap;
    private final ConcurrentHashMap<String, String> reservationClientMap = ServiceDataUtil.reservationClientMap;
    private final ConcurrentHashMap<String, String> clientPaymentMap = ServiceDataUtil.clientPaymentMap;

    private final ExecutorService executor;

    public ReservationService() {
        this.executor = ExecutorUtil.getExecutor();
    }

    private String generateReservationId() {
        return UUID.randomUUID().toString();
    }

    @Override
    public void reserveHotel(ReservationRequest request, StreamObserver<Reservation> responseObserver) {
        executor.submit(() -> {
            try {
                String reservationId = generateReservationId();

                Reservation reservation = Reservation.newBuilder()
                        .setHotelID(request.getHotelID())
                        .setStartDate(request.getStartDate())
                        .setNumDays(request.getNumDays())
                        .setDateToPay(request.getStartDate() + 10000) // 10sek delay do isteka za placanje
                        .build();

                String clientID = request.getClientID();

                reservationMap.put(reservationId, reservation);
                reservationClientMap.put(reservationId, clientID);

                HotelThread ht = ServiceDataUtil.hotelThreadMap.get(request.getHotelID());
                ht.reserveRoom();

                clientPaymentMap.put(clientID, request.getHotelID());

                responseObserver.onNext(reservation);
                responseObserver.onCompleted();

            } catch (Exception e) {
                responseObserver.onError(e);
            }
        });
    }
}

