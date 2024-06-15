//package raf.hotelreservation.client;
//
//import io.grpc.ManagedChannel;
//import io.grpc.ManagedChannelBuilder;
//import io.grpc.StatusRuntimeException;
//import raf.hotelreservation.grpc.*;
//
//import java.util.*;
//
//public class HotelGRPCClient {
//
//    private static final int GRPC_PORT = 8001;
//
//    private ManagedChannel channel;
//    private HotelServiceGrpc.HotelServiceBlockingStub blockingStub;
//    private HotelServiceGrpc.HotelServiceStub asyncStub;
//
//    public HotelGRPCClient() {
//        this.channel = ManagedChannelBuilder.forAddress("localhost", GRPC_PORT)
//                .usePlaintext()
//                .build();
//        this.asyncStub = HotelServiceGrpc.newStub(channel);
//        this.blockingStub = HotelServiceGrpc.newBlockingStub(channel);
//
//    }
//
//    public void findAvailableHotels(String clientId, String city, int minStars, int maxDistance) {
//        try {
//            QueryRequest request = QueryRequest.newBuilder()
//                    .setClientID(clientId)
//                    .setCity(city)
//                    .setMinStars(minStars)
//                    .setMaxDistance(maxDistance)
//                    .build();
//
//            Iterator<Hotel> response = blockingStub.findAvailableHotels(request);
//
//            System.out.println("Available Hotels:");
//            while (response.hasNext()) {
//                Hotel hotel = response.next();
//                System.out.println("Hotel Name: " + hotel.getName() + ", Location: " + hotel.getLocation());
//            }
//
//        } catch (StatusRuntimeException e) {
//            System.err.println("RPC failed: " + e.getStatus());
//        } finally {
//            shutdown();
//        }
//    }
//
//    public List<Hotel> findHotels(String city, int minStars, double maxDistance) {
//
//        QueryRequest request = QueryRequest.newBuilder()
//                .setCity(city)
//                .setMinStars(minStars)
//                .setMaxDistance(maxDistance)
//                .build();
//
//        Iterator<Hotel> availableHotels = blockingStub.findAvailableHotels(request);
//
//        List<Hotel> hotels = new ArrayList<>();
//        while (availableHotels.hasNext()) {
//            hotels.add(availableHotels.next());
//        }
//
//        return hotels;
//    }
//
//    public List<String> getAllUniqueLocations() {
//        List<String> locations = new ArrayList<>();
//        try {
//            Iterator<Hotel> allHotels = blockingStub.getAllHotels(null);
//            Set<String> locationSet = new HashSet<>();
//            while (allHotels.hasNext()) {
//                Hotel hotel = allHotels.next();
//                locationSet.add(hotel.getLocation());
//            }
//            locations.addAll(locationSet);
//            locations.sort(String::compareTo);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return locations;
//    }
//
//    public List<Hotel> allHotels() {
//        Iterator<Hotel> allHotelsIterator = blockingStub.getAllHotels(null);
//
//        List<Hotel> hotels = new ArrayList<>();
//        while (allHotelsIterator.hasNext()) {
//            hotels.add(allHotelsIterator.next());
//        }
//
//        return hotels;
//    }
//}
