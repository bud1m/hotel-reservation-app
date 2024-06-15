package raf.hotelreservation.util;

import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import raf.hotelreservation.services.HotelService;
import raf.hotelreservation.services.PaymentService;
import raf.hotelreservation.services.ReservationService;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class GrpcServerUtil {

    private static final int GRPC_PORT = 8001;
    private final Server server;

    public GrpcServerUtil() throws IOException {
        this.server = ServerBuilder.forPort(GRPC_PORT)
                .addService(new HotelService())
                .addService(new ReservationService())
                .addService(new PaymentService()).build();
    }

    public void start() throws IOException {
        server.start();
        Runtime.getRuntime()
                .addShutdownHook(
                        new Thread(
                                () -> {
                                    try {
                                        this.stop();
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                }));
    }

    private void stop() throws InterruptedException {
        if (server != null) {
            server.shutdown().awaitTermination(30, TimeUnit.SECONDS);
        }
    }

    public void blockUntilShutDown() throws InterruptedException {
        if (this.server != null) {
            server.awaitTermination();
        }
    }
}
