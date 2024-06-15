package raf.hotelreservation.services;


import com.google.protobuf.Empty;
import io.grpc.stub.StreamObserver;
import raf.hotelreservation.grpc.*;
import raf.hotelreservation.hotels.HotelThread;
import raf.hotelreservation.hotels.InitHotels;
import raf.hotelreservation.kyro.Network;
import raf.hotelreservation.util.ExecutorUtil;
import raf.hotelreservation.util.GrpcServerUtil;
import raf.hotelreservation.util.ServiceDataUtil;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;


public class HotelService extends HotelServiceGrpc.HotelServiceImplBase {

    private static final ConcurrentHashMap<String, HotelThread> hotelThreadMap = ServiceDataUtil.hotelThreadMap;
    private static final ConcurrentHashMap<String, List<Hotel>> clientHotelMap = ServiceDataUtil.clientHotelMap;

    private final ExecutorService executor = ExecutorUtil.getExecutor();

    public HotelService() throws IOException {
        runHotelThreads();
    }

    private void runHotelThreads() throws IOException {
        for (HotelThread ht : InitHotels.HotelThreads()) {
            ht.start();

            hotelThreadMap.put(hotelID(ht.getHotelGrpc()), ht);
        }
    }

    public static String hotelID(Hotel h) {
        return h.getName() + '-' + h.getLocation();
    }


    @Override
    public void getAllHotels(Empty request, StreamObserver<Hotel> responseObserver) {
        executor.submit(() -> {
            try {
                for (HotelThread hotel : hotelThreadMap.values()) {
                    responseObserver.onNext(hotel.getHotelGrpc());
                }
                responseObserver.onCompleted();
            } catch (Exception e) {
                responseObserver.onError(e);
            }
        });
    }

    @Override
    public void findAvailableHotels(QueryRequest request, StreamObserver<Hotel> responseObserver) {
        executor.submit(() -> {
            try {
                List<Hotel> availableHotels = hotelThreadMap.values().stream()
                        .filter(hotelThread -> hotelThread.getHotelGrpc().getLocation().equals(request.getCity()))
                        .filter(hotelThread -> hotelThread.getHotelGrpc().getStars() >= request.getMinStars())
                        .filter(hotelThread -> hotelThread.getHotelGrpc().getDistanceFromCenter() <= request.getMaxDistance())
                        .filter(hotelThread -> hotelThread.getReservedRooms() >= 0) // Filter based on available rooms
                        .map(HotelThread::getHotelGrpc)
                        .toList();

                String clientId = request.getClientID();
                clientHotelMap.put(clientId, availableHotels);

                for (Hotel hotel : availableHotels) {
                    responseObserver.onNext(hotel);
                }
                responseObserver.onCompleted();
            } catch (Exception e) {
                responseObserver.onError(e);
            }
        });
    }
}
