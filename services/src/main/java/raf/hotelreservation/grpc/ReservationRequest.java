// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

// Protobuf Java Version: 4.26.1
package raf.hotelreservation.grpc;

/**
 * Protobuf type {@code ReservationRequest}
 */
public final class ReservationRequest extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:ReservationRequest)
    ReservationRequestOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      ReservationRequest.class.getName());
  }
  // Use ReservationRequest.newBuilder() to construct.
  private ReservationRequest(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private ReservationRequest() {
    clientID_ = "";
    hotelID_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_ReservationRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_ReservationRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            raf.hotelreservation.grpc.ReservationRequest.class, raf.hotelreservation.grpc.ReservationRequest.Builder.class);
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

  public static final int HOTELID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hotelID_ = "";
  /**
   * <code>string hotelID = 2;</code>
   * @return The hotelID.
   */
  @java.lang.Override
  public java.lang.String getHotelID() {
    java.lang.Object ref = hotelID_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      hotelID_ = s;
      return s;
    }
  }
  /**
   * <code>string hotelID = 2;</code>
   * @return The bytes for hotelID.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getHotelIDBytes() {
    java.lang.Object ref = hotelID_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      hotelID_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STARTDATE_FIELD_NUMBER = 3;
  private long startDate_ = 0L;
  /**
   * <code>int64 startDate = 3;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public long getStartDate() {
    return startDate_;
  }

  public static final int NUMDAYS_FIELD_NUMBER = 4;
  private int numDays_ = 0;
  /**
   * <code>int32 numDays = 4;</code>
   * @return The numDays.
   */
  @java.lang.Override
  public int getNumDays() {
    return numDays_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(hotelID_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, hotelID_);
    }
    if (startDate_ != 0L) {
      output.writeInt64(3, startDate_);
    }
    if (numDays_ != 0) {
      output.writeInt32(4, numDays_);
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(hotelID_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, hotelID_);
    }
    if (startDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(3, startDate_);
    }
    if (numDays_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, numDays_);
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
    if (!(obj instanceof raf.hotelreservation.grpc.ReservationRequest)) {
      return super.equals(obj);
    }
    raf.hotelreservation.grpc.ReservationRequest other = (raf.hotelreservation.grpc.ReservationRequest) obj;

    if (!getClientID()
        .equals(other.getClientID())) return false;
    if (!getHotelID()
        .equals(other.getHotelID())) return false;
    if (getStartDate()
        != other.getStartDate()) return false;
    if (getNumDays()
        != other.getNumDays()) return false;
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
    hash = (37 * hash) + HOTELID_FIELD_NUMBER;
    hash = (53 * hash) + getHotelID().hashCode();
    hash = (37 * hash) + STARTDATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartDate());
    hash = (37 * hash) + NUMDAYS_FIELD_NUMBER;
    hash = (53 * hash) + getNumDays();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static raf.hotelreservation.grpc.ReservationRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static raf.hotelreservation.grpc.ReservationRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static raf.hotelreservation.grpc.ReservationRequest parseFrom(
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
  public static Builder newBuilder(raf.hotelreservation.grpc.ReservationRequest prototype) {
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
   * Protobuf type {@code ReservationRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ReservationRequest)
      raf.hotelreservation.grpc.ReservationRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_ReservationRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_ReservationRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raf.hotelreservation.grpc.ReservationRequest.class, raf.hotelreservation.grpc.ReservationRequest.Builder.class);
    }

    // Construct using raf.hotelreservation.grpc.ReservationRequest.newBuilder()
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
      hotelID_ = "";
      startDate_ = 0L;
      numDays_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_ReservationRequest_descriptor;
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.ReservationRequest getDefaultInstanceForType() {
      return raf.hotelreservation.grpc.ReservationRequest.getDefaultInstance();
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.ReservationRequest build() {
      raf.hotelreservation.grpc.ReservationRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.ReservationRequest buildPartial() {
      raf.hotelreservation.grpc.ReservationRequest result = new raf.hotelreservation.grpc.ReservationRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(raf.hotelreservation.grpc.ReservationRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientID_ = clientID_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.hotelID_ = hotelID_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.startDate_ = startDate_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.numDays_ = numDays_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof raf.hotelreservation.grpc.ReservationRequest) {
        return mergeFrom((raf.hotelreservation.grpc.ReservationRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(raf.hotelreservation.grpc.ReservationRequest other) {
      if (other == raf.hotelreservation.grpc.ReservationRequest.getDefaultInstance()) return this;
      if (!other.getClientID().isEmpty()) {
        clientID_ = other.clientID_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getHotelID().isEmpty()) {
        hotelID_ = other.hotelID_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getStartDate() != 0L) {
        setStartDate(other.getStartDate());
      }
      if (other.getNumDays() != 0) {
        setNumDays(other.getNumDays());
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
              hotelID_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              startDate_ = input.readInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              numDays_ = input.readInt32();
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

    private java.lang.Object hotelID_ = "";
    /**
     * <code>string hotelID = 2;</code>
     * @return The hotelID.
     */
    public java.lang.String getHotelID() {
      java.lang.Object ref = hotelID_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        hotelID_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string hotelID = 2;</code>
     * @return The bytes for hotelID.
     */
    public com.google.protobuf.ByteString
        getHotelIDBytes() {
      java.lang.Object ref = hotelID_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        hotelID_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string hotelID = 2;</code>
     * @param value The hotelID to set.
     * @return This builder for chaining.
     */
    public Builder setHotelID(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hotelID_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string hotelID = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearHotelID() {
      hotelID_ = getDefaultInstance().getHotelID();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string hotelID = 2;</code>
     * @param value The bytes for hotelID to set.
     * @return This builder for chaining.
     */
    public Builder setHotelIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hotelID_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long startDate_ ;
    /**
     * <code>int64 startDate = 3;</code>
     * @return The startDate.
     */
    @java.lang.Override
    public long getStartDate() {
      return startDate_;
    }
    /**
     * <code>int64 startDate = 3;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(long value) {

      startDate_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int64 startDate = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      bitField0_ = (bitField0_ & ~0x00000004);
      startDate_ = 0L;
      onChanged();
      return this;
    }

    private int numDays_ ;
    /**
     * <code>int32 numDays = 4;</code>
     * @return The numDays.
     */
    @java.lang.Override
    public int getNumDays() {
      return numDays_;
    }
    /**
     * <code>int32 numDays = 4;</code>
     * @param value The numDays to set.
     * @return This builder for chaining.
     */
    public Builder setNumDays(int value) {

      numDays_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numDays = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumDays() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numDays_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:ReservationRequest)
  }

  // @@protoc_insertion_point(class_scope:ReservationRequest)
  private static final raf.hotelreservation.grpc.ReservationRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new raf.hotelreservation.grpc.ReservationRequest();
  }

  public static raf.hotelreservation.grpc.ReservationRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReservationRequest>
      PARSER = new com.google.protobuf.AbstractParser<ReservationRequest>() {
    @java.lang.Override
    public ReservationRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReservationRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReservationRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public raf.hotelreservation.grpc.ReservationRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
