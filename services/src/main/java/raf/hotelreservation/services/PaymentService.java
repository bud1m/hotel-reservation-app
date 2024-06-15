package raf.hotelreservation.services;

import io.grpc.Status;
import io.grpc.stub.StreamObserver;
import raf.hotelreservation.grpc.Hotel;
import raf.hotelreservation.grpc.PaymentRequest;
import raf.hotelreservation.grpc.PaymentResponse;
import raf.hotelreservation.grpc.PaymentServiceGrpc;
import raf.hotelreservation.hotels.HotelThread;
import raf.hotelreservation.util.ExecutorUtil;
import raf.hotelreservation.util.ServiceDataUtil;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;

public class PaymentService extends PaymentServiceGrpc.PaymentServiceImplBase {

    private static final ConcurrentHashMap<String, String> clientPaymentMap = ServiceDataUtil.clientPaymentMap;
    private static final ConcurrentHashMap<String, HotelThread> hotelThreadMap = ServiceDataUtil.hotelThreadMap;
    private static final ConcurrentHashMap<String, List<Hotel>> clientHotelMap = ServiceDataUtil.clientHotelMap;

    private final ExecutorService executor;

    public PaymentService() {
        this.executor = ExecutorUtil.getExecutor();
    }

    @Override
    public void processPayment(PaymentRequest request, StreamObserver<PaymentResponse> responseObserver) {

        String clientID = request.getClientID();
        double availableAmount = request.getAvailableAmount();

        String hotelID = clientPaymentMap.get(clientID);
        if (hotelID == null) {
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Client doesn't have any due payments!").asRuntimeException());
            return;
        }

        HotelThread ht = hotelThreadMap.get(hotelID);
        if (ht == null) {
            responseObserver.onError(Status.NOT_FOUND.withDescription("HotelThread not found for the associated hotel").asRuntimeException());
            return;
        }

        double price = ht.getCurrPrice();

        if (availableAmount < price) {
            PaymentResponse response = PaymentResponse.newBuilder()
                    .setSuccess(false)
                    .setAmount(0)
                    .build();
            responseObserver.onNext(response);
            responseObserver.onError(Status.INVALID_ARGUMENT.withDescription("Insufficient amount to cover the current price!").asRuntimeException());
            return;
        }

        executor.execute(() -> {
            ht.updateHotelBalance(price);
            PaymentResponse response = PaymentResponse.newBuilder()
                    .setSuccess(true)
                    .setAmount(price)
                    .build();
            clientPaymentMap.put(clientID, "PAYED");

            responseObserver.onNext(response);
            responseObserver.onCompleted();
        });
    }

}
