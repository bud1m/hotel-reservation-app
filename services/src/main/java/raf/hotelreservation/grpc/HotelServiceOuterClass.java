// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HotelService.proto
// Protobuf Java Version: 4.26.1

package raf.hotelreservation.grpc;

public final class HotelServiceOuterClass {
  private HotelServiceOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      HotelServiceOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_QueryRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_QueryRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Hotel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_Hotel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022HotelService.proto\032\033google/protobuf/em" +
      "pty.proto\"U\n\014QueryRequest\022\020\n\010clientID\030\001 " +
      "\001(\t\022\014\n\004city\030\002 \001(\t\022\023\n\013maxDistance\030\003 \001(\001\022\020" +
      "\n\010minStars\030\004 \001(\005\"R\n\005Hotel\022\014\n\004name\030\001 \001(\t\022" +
      "\r\n\005stars\030\002 \001(\005\022\020\n\010location\030\003 \001(\t\022\032\n\022dist" +
      "anceFromCenter\030\004 \001(\0012p\n\014HotelService\0220\n\014" +
      "GetAllHotels\022\026.google.protobuf.Empty\032\006.H" +
      "otel0\001\022.\n\023FindAvailableHotels\022\r.QueryReq" +
      "uest\032\006.Hotel0\001B\035\n\031raf.hotelreservation.g" +
      "rpcP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.EmptyProto.getDescriptor(),
        });
    internal_static_QueryRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_QueryRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_QueryRequest_descriptor,
        new java.lang.String[] { "ClientID", "City", "MaxDistance", "MinStars", });
    internal_static_Hotel_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_Hotel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_Hotel_descriptor,
        new java.lang.String[] { "Name", "Stars", "Location", "DistanceFromCenter", });
    descriptor.resolveAllFeaturesImmutable();
    com.google.protobuf.EmptyProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
