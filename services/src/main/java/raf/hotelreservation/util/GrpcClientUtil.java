package raf.hotelreservation.util;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class GrpcClientUtil {

    private static final int GRPC_PORT = 8001;

    public static ManagedChannel getChannel() {
        return ManagedChannelBuilder.forAddress("localhost", GRPC_PORT)
                .usePlaintext()
                .build();
    }
}