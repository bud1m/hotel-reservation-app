package raf.hotelreservation.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.62.2)",
    comments = "Source: HotelService.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HotelServiceGrpc {

  private HotelServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "HotelService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      raf.hotelreservation.grpc.Hotel> getGetAllHotelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAllHotels",
      requestType = com.google.protobuf.Empty.class,
      responseType = raf.hotelreservation.grpc.Hotel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      raf.hotelreservation.grpc.Hotel> getGetAllHotelsMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, raf.hotelreservation.grpc.Hotel> getGetAllHotelsMethod;
    if ((getGetAllHotelsMethod = HotelServiceGrpc.getGetAllHotelsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getGetAllHotelsMethod = HotelServiceGrpc.getGetAllHotelsMethod) == null) {
          HotelServiceGrpc.getGetAllHotelsMethod = getGetAllHotelsMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, raf.hotelreservation.grpc.Hotel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAllHotels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  raf.hotelreservation.grpc.Hotel.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("GetAllHotels"))
              .build();
        }
      }
    }
    return getGetAllHotelsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<raf.hotelreservation.grpc.QueryRequest,
      raf.hotelreservation.grpc.Hotel> getFindAvailableHotelsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FindAvailableHotels",
      requestType = raf.hotelreservation.grpc.QueryRequest.class,
      responseType = raf.hotelreservation.grpc.Hotel.class,
      methodType = io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
  public static io.grpc.MethodDescriptor<raf.hotelreservation.grpc.QueryRequest,
      raf.hotelreservation.grpc.Hotel> getFindAvailableHotelsMethod() {
    io.grpc.MethodDescriptor<raf.hotelreservation.grpc.QueryRequest, raf.hotelreservation.grpc.Hotel> getFindAvailableHotelsMethod;
    if ((getFindAvailableHotelsMethod = HotelServiceGrpc.getFindAvailableHotelsMethod) == null) {
      synchronized (HotelServiceGrpc.class) {
        if ((getFindAvailableHotelsMethod = HotelServiceGrpc.getFindAvailableHotelsMethod) == null) {
          HotelServiceGrpc.getFindAvailableHotelsMethod = getFindAvailableHotelsMethod =
              io.grpc.MethodDescriptor.<raf.hotelreservation.grpc.QueryRequest, raf.hotelreservation.grpc.Hotel>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FindAvailableHotels"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  raf.hotelreservation.grpc.QueryRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  raf.hotelreservation.grpc.Hotel.getDefaultInstance()))
              .setSchemaDescriptor(new HotelServiceMethodDescriptorSupplier("FindAvailableHotels"))
              .build();
        }
      }
    }
    return getFindAvailableHotelsMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HotelServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceStub>() {
        @java.lang.Override
        public HotelServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceStub(channel, callOptions);
        }
      };
    return HotelServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HotelServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceBlockingStub>() {
        @java.lang.Override
        public HotelServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceBlockingStub(channel, callOptions);
        }
      };
    return HotelServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HotelServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HotelServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HotelServiceFutureStub>() {
        @java.lang.Override
        public HotelServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HotelServiceFutureStub(channel, callOptions);
        }
      };
    return HotelServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getAllHotels(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Hotel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAllHotelsMethod(), responseObserver);
    }

    /**
     */
    default void findAvailableHotels(raf.hotelreservation.grpc.QueryRequest request,
        io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Hotel> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFindAvailableHotelsMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service HotelService.
   */
  public static abstract class HotelServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return HotelServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service HotelService.
   */
  public static final class HotelServiceStub
      extends io.grpc.stub.AbstractAsyncStub<HotelServiceStub> {
    private HotelServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceStub(channel, callOptions);
    }

    /**
     */
    public void getAllHotels(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Hotel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getGetAllHotelsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findAvailableHotels(raf.hotelreservation.grpc.QueryRequest request,
        io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Hotel> responseObserver) {
      io.grpc.stub.ClientCalls.asyncServerStreamingCall(
          getChannel().newCall(getFindAvailableHotelsMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service HotelService.
   */
  public static final class HotelServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<HotelServiceBlockingStub> {
    private HotelServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public java.util.Iterator<raf.hotelreservation.grpc.Hotel> getAllHotels(
        com.google.protobuf.Empty request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getGetAllHotelsMethod(), getCallOptions(), request);
    }

    /**
     */
    public java.util.Iterator<raf.hotelreservation.grpc.Hotel> findAvailableHotels(
        raf.hotelreservation.grpc.QueryRequest request) {
      return io.grpc.stub.ClientCalls.blockingServerStreamingCall(
          getChannel(), getFindAvailableHotelsMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service HotelService.
   */
  public static final class HotelServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<HotelServiceFutureStub> {
    private HotelServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HotelServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HotelServiceFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_GET_ALL_HOTELS = 0;
  private static final int METHODID_FIND_AVAILABLE_HOTELS = 1;

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
        case METHODID_GET_ALL_HOTELS:
          serviceImpl.getAllHotels((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Hotel>) responseObserver);
          break;
        case METHODID_FIND_AVAILABLE_HOTELS:
          serviceImpl.findAvailableHotels((raf.hotelreservation.grpc.QueryRequest) request,
              (io.grpc.stub.StreamObserver<raf.hotelreservation.grpc.Hotel>) responseObserver);
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
          getGetAllHotelsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              com.google.protobuf.Empty,
              raf.hotelreservation.grpc.Hotel>(
                service, METHODID_GET_ALL_HOTELS)))
        .addMethod(
          getFindAvailableHotelsMethod(),
          io.grpc.stub.ServerCalls.asyncServerStreamingCall(
            new MethodHandlers<
              raf.hotelreservation.grpc.QueryRequest,
              raf.hotelreservation.grpc.Hotel>(
                service, METHODID_FIND_AVAILABLE_HOTELS)))
        .build();
  }

  private static abstract class HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HotelServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return raf.hotelreservation.grpc.HotelServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HotelService");
    }
  }

  private static final class HotelServiceFileDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier {
    HotelServiceFileDescriptorSupplier() {}
  }

  private static final class HotelServiceMethodDescriptorSupplier
      extends HotelServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    HotelServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (HotelServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HotelServiceFileDescriptorSupplier())
              .addMethod(getGetAllHotelsMethod())
              .addMethod(getFindAvailableHotelsMethod())
              .build();
        }
      }
    }
    return result;
  }
}
