package raf.hotelreservation.services;

import raf.hotelreservation.util.GrpcClientUtil;
import raf.hotelreservation.util.GrpcServerUtil;

import java.io.IOException;

public class RunAllServices {

    public static void main(String[] args) throws IOException {
        NotificationService notificationService = new NotificationService();
        notificationService.start();

        GrpcServerUtil grpcServerUtil = new GrpcServerUtil();
        try {

            grpcServerUtil.start();
            grpcServerUtil.blockUntilShutDown();
        } catch (IOException | InterruptedException e) {
            System.err.println("Error starting or running gRPC server: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

