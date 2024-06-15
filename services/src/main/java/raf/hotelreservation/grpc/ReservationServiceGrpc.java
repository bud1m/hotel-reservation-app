package raf.hotelreservation.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: ReservationService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class ReservationServiceGrpc {

  private ReservationServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "ReservationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<raf.hotelreservation.grpc.ReservationRequest,
      raf.hotelreservation.grpc.Reservation> getReserveHotelMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "reserveHotel",
      requestType = raf.hotelreservation.grpc.ReservationRequest.class,
      responseType = raf.hotelreservation.grpc.Reservation.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<raf.hotelreservation.grpc.ReservationRequest,
      raf.hotelreservation.grpc.Reservation> getReserveHotelMethod() {
    io.grpc.MethodDescriptor<raf.hotelreservation.grpc.ReservationRequest, raf.hotelreservation.grpc.Reservation> getReserveHotelMethod;
    if ((getReserveHotelMethod = ReservationServiceGrpc.getReserveHotelMethod) == null) {
      synchronized (ReservationServiceGrpc.class) {
        if ((getReserveHotelMethod = ReservationServiceGrpc.getReserveHotelMethod) == null) {
          ReservationServiceGrpc.getReserveHotelMethod = getReserveHotelMethod =
              io.grpc.MethodDescriptor.<raf.hotelreservation.grpc.ReservationRequest, raf.hotelreservation.grpc.Reservation>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "reserveHotel"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  raf.hotelreservation.grpc.ReservationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  raf.hotelreservation.grpc.Reservation.getDefaultInstance()))
              .setSchemaDescriptor(new ReservationServiceMethodDescriptorSupplier("reserveHotel"))
              .build();
        }
      }
    }
    return getReserveHotelMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ReservationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceStub>() {
        @java.lang.Override
        public ReservationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceStub(channel, callOptions);
        }
      };
    return ReservationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ReservationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceBlockingStub>() {
        @java.lang.Override
        public ReservationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceBlockingStub(channel, callOptions);
        }
      };
    return ReservationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ReservationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ReservationServiceFutureStub>() {
        @java.lang.Override
        public ReservationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ReservationServiceFutureStub(channel, callOptions);
        }
      };
    return ReservationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void reserveHotel(raf.hotelreservation.grpc.ReservationRequest request,
        io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Reservation> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getReserveHotelMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service ReservationService.
   */
  public static abstract class ReservationServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ReservationServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service ReservationService.
   */
  public static final class ReservationServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ReservationServiceStub> {
    private ReservationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceStub(channel, callOptions);
    }

    /**
     */
    public void reserveHotel(raf.hotelreservation.grpc.ReservationRequest request,
        io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Reservation> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getReserveHotelMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service ReservationService.
   */
  public static final class ReservationServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ReservationServiceBlockingStub> {
    private ReservationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public raf.hotelreservation.grpc.Reservation reserveHotel(raf.hotelreservation.grpc.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getReserveHotelMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service ReservationService.
   */
  public static final class ReservationServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ReservationServiceFutureStub> {
    private ReservationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ReservationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ReservationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<raf.hotelreservation.grpc.Reservation> reserveHotel(
        raf.hotelreservation.grpc.ReservationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getReserveHotelMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RESERVE_HOTEL = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RESERVE_HOTEL:
          serviceImpl.reserveHotel((raf.hotelreservation.grpc.ReservationRequest) request,
              (io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Reservation>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getReserveHotelMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              raf.hotelreservation.grpc.ReservationRequest,
              raf.hotelreservation.grpc.Reservation>(
                service, METHODID_RESERVE_HOTEL)))
        .build();
  }

  private static abstract class ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ReservationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return raf.hotelreservation.grpc.ReservationServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ReservationService");
    }
  }

  private static final class ReservationServiceFileDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier {
    ReservationServiceFileDescriptorSupplier() {}
  }

  private static final class ReservationServiceMethodDescriptorSupplier
      extends ReservationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ReservationServiceMethodDescriptorSupplier(java.lang.String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ReservationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ReservationServiceFileDescriptorSupplier())
              .addMethod(getReserveHotelMethod())
              .build();
        }
      }
    }
    return result;
  }
}
