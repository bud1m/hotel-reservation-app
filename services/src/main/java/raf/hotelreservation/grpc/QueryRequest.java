// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HotelService.proto

// Protobuf Java Version: 4.26.1
package raf.hotelreservation.grpc;

/**
 * Protobuf type {@code QueryRequest}
 */
public final class QueryRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:QueryRequest)
    QueryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      QueryRequest.class.getName());
  }
  // Use QueryRequest.newBuilder() to construct.
  private QueryRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private QueryRequest() {
    clientID_ = "";
    city_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return raf.hotelreservation.grpc.HotelServiceOuterClass.internal_static_QueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return raf.hotelreservation.grpc.HotelServiceOuterClass.internal_static_QueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            raf.hotelreservation.grpc.QueryRequest.class, raf.hotelreservation.grpc.QueryRequest.Builder.class);
  }

  public static final int CLIENTID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientID_ = "";
  /**
   * <code>string clientID = 1;</code>
   * @return The clientID.
   */
  @java.lang.Override
  public java.lang.String getClientID() {
    java.lang.Object ref = clientID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientID_ = s;
      return s;
    }
  }
  /**
   * <code>string clientID = 1;</code>
   * @return The bytes for clientID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIDBytes() {
    java.lang.Object ref = clientID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CITY_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object city_ = "";
  /**
   * <code>string city = 2;</code>
   * @return The city.
   */
  @java.lang.Override
  public java.lang.String getCity() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      city_ = s;
      return s;
    }
  }
  /**
   * <code>string city = 2;</code>
   * @return The bytes for city.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCityBytes() {
    java.lang.Object ref = city_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      city_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MAXDISTANCE_FIELD_NUMBER = 3;
  private double maxDistance_ = 0D;
  /**
   * <code>double maxDistance = 3;</code>
   * @return The maxDistance.
   */
  @java.lang.Override
  public double getMaxDistance() {
    return maxDistance_;
  }

  public static final int MINSTARS_FIELD_NUMBER = 4;
  private int minStars_ = 0;
  /**
   * <code>int32 minStars = 4;</code>
   * @return The minStars.
   */
  @java.lang.Override
  public int getMinStars() {
    return minStars_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(clientID_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, clientID_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(city_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, city_);
    }
    if (java.lang.Double.doubleToRawLongBits(maxDistance_) != 0) {
      output.writeDouble(3, maxDistance_);
    }
    if (minStars_ != 0) {
      output.writeInt32(4, minStars_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(clientID_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, clientID_);
    }
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(city_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, city_);
    }
    if (java.lang.Double.doubleToRawLongBits(maxDistance_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(3, maxDistance_);
    }
    if (minStars_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, minStars_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof raf.hotelreservation.grpc.QueryRequest)) {
      return super.equals(obj);
    }
    raf.hotelreservation.grpc.QueryRequest other = (raf.hotelreservation.grpc.QueryRequest) obj;

    if (!getClientID()
        .equals(other.getClientID())) return false;
    if (!getCity()
        .equals(other.getCity())) return false;
    if (java.lang.Double.doubleToLongBits(getMaxDistance())
        != java.lang.Double.doubleToLongBits(
            other.getMaxDistance())) return false;
    if (getMinStars()
        != other.getMinStars()) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + CLIENTID_FIELD_NUMBER;
    hash = (53 * hash) + getClientID().hashCode();
    hash = (37 * hash) + CITY_FIELD_NUMBER;
    hash = (53 * hash) + getCity().hashCode();
    hash = (37 * hash) + MAXDISTANCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMaxDistance()));
    hash = (37 * hash) + MINSTARS_FIELD_NUMBER;
    hash = (53 * hash) + getMinStars();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static raf.hotelreservation.grpc.QueryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static raf.hotelreservation.grpc.QueryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static raf.hotelreservation.grpc.QueryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static raf.hotelreservation.grpc.QueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(raf.hotelreservation.grpc.QueryRequest prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code QueryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:QueryRequest)
      raf.hotelreservation.grpc.QueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return raf.hotelreservation.grpc.HotelServiceOuterClass.internal_static_QueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raf.hotelreservation.grpc.HotelServiceOuterClass.internal_static_QueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raf.hotelreservation.grpc.QueryRequest.class, raf.hotelreservation.grpc.QueryRequest.Builder.class);
    }

    // Construct using raf.hotelreservation.grpc.QueryRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      clientID_ = "";
      city_ = "";
      maxDistance_ = 0D;
      minStars_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return raf.hotelreservation.grpc.HotelServiceOuterClass.internal_static_QueryRequest_descriptor;
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.QueryRequest getDefaultInstanceForType() {
      return raf.hotelreservation.grpc.QueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.QueryRequest build() {
      raf.hotelreservation.grpc.QueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.QueryRequest buildPartial() {
      raf.hotelreservation.grpc.QueryRequest result = new raf.hotelreservation.grpc.QueryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(raf.hotelreservation.grpc.QueryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientID_ = clientID_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.city_ = city_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxDistance_ = maxDistance_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.minStars_ = minStars_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof raf.hotelreservation.grpc.QueryRequest) {
        return mergeFrom((raf.hotelreservation.grpc.QueryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(raf.hotelreservation.grpc.QueryRequest other) {
      if (other == raf.hotelreservation.grpc.QueryRequest.getDefaultInstance()) return this;
      if (!other.getClientID().isEmpty()) {
        clientID_ = other.clientID_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getCity().isEmpty()) {
        city_ = other.city_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getMaxDistance() != 0D) {
        setMaxDistance(other.getMaxDistance());
      }
      if (other.getMinStars() != 0) {
        setMinStars(other.getMinStars());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              clientID_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              city_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 25: {
              maxDistance_ = input.readDouble();
              bitField0_ |= 0x00000004;
              break;
            } // case 25
            case 32: {
              minStars_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private java.lang.Object clientID_ = "";
    /**
     * <code>string clientID = 1;</code>
     * @return The clientID.
     */
    public java.lang.String getClientID() {
      java.lang.Object ref = clientID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string clientID = 1;</code>
     * @return The bytes for clientID.
     */
    public com.google.protobuf.ByteString
        getClientIDBytes() {
      java.lang.Object ref = clientID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string clientID = 1;</code>
     * @param value The clientID to set.
     * @return This builder for chaining.
     */
    public Builder setClientID(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string clientID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientID() {
      clientID_ = getDefaultInstance().getClientID();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string clientID = 1;</code>
     * @param value The bytes for clientID to set.
     * @return This builder for chaining.
     */
    public Builder setClientIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object city_ = "";
    /**
     * <code>string city = 2;</code>
     * @return The city.
     */
    public java.lang.String getCity() {
      java.lang.Object ref = city_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        city_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string city = 2;</code>
     * @return The bytes for city.
     */
    public com.google.protobuf.ByteString
        getCityBytes() {
      java.lang.Object ref = city_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        city_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string city = 2;</code>
     * @param value The city to set.
     * @return This builder for chaining.
     */
    public Builder setCity(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      city_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string city = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearCity() {
      city_ = getDefaultInstance().getCity();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string city = 2;</code>
     * @param value The bytes for city to set.
     * @return This builder for chaining.
     */
    public Builder setCityBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      city_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private double maxDistance_ ;
    /**
     * <code>double maxDistance = 3;</code>
     * @return The maxDistance.
     */
    @java.lang.Override
    public double getMaxDistance() {
      return maxDistance_;
    }
    /**
     * <code>double maxDistance = 3;</code>
     * @param value The maxDistance to set.
     * @return This builder for chaining.
     */
    public Builder setMaxDistance(double value) {

      maxDistance_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>double maxDistance = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxDistance() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxDistance_ = 0D;
      onChanged();
      return this;
    }

    private int minStars_ ;
    /**
     * <code>int32 minStars = 4;</code>
     * @return The minStars.
     */
    @java.lang.Override
    public int getMinStars() {
      return minStars_;
    }
    /**
     * <code>int32 minStars = 4;</code>
     * @param value The minStars to set.
     * @return This builder for chaining.
     */
    public Builder setMinStars(int value) {

      minStars_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 minStars = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMinStars() {
      bitField0_ = (bitField0_ & ~0x00000008);
      minStars_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:QueryRequest)
  }

  // @@protoc_insertion_point(class_scope:QueryRequest)
  private static final raf.hotelreservation.grpc.QueryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new raf.hotelreservation.grpc.QueryRequest();
  }

  public static raf.hotelreservation.grpc.QueryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryRequest>() {
    @java.lang.Override
    public QueryRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<QueryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public raf.hotelreservation.grpc.QueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

