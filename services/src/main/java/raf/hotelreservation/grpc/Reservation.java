// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

// Protobuf Java Version: 4.26.1
package raf.hotelreservation.grpc;

/**
 * Protobuf type {@code Reservation}
 */
public final class Reservation extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:Reservation)
    ReservationOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 26,
      /* patch= */ 1,
      /* suffix= */ "",
      Reservation.class.getName());
  }
  // Use Reservation.newBuilder() to construct.
  private Reservation(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Reservation() {
    hotelID_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_Reservation_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_Reservation_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            raf.hotelreservation.grpc.Reservation.class, raf.hotelreservation.grpc.Reservation.Builder.class);
  }

  public static final int HOTELID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object hotelID_ = "";
  /**
   * <code>string hotelID = 1;</code>
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
   * <code>string hotelID = 1;</code>
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

  public static final int STARTDATE_FIELD_NUMBER = 2;
  private long startDate_ = 0L;
  /**
   * <code>int64 startDate = 2;</code>
   * @return The startDate.
   */
  @java.lang.Override
  public long getStartDate() {
    return startDate_;
  }

  public static final int NUMDAYS_FIELD_NUMBER = 3;
  private int numDays_ = 0;
  /**
   * <code>int32 numDays = 3;</code>
   * @return The numDays.
   */
  @java.lang.Override
  public int getNumDays() {
    return numDays_;
  }

  public static final int DATETOPAY_FIELD_NUMBER = 4;
  private long dateToPay_ = 0L;
  /**
   * <code>int64 dateToPay = 4;</code>
   * @return The dateToPay.
   */
  @java.lang.Override
  public long getDateToPay() {
    return dateToPay_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(hotelID_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, hotelID_);
    }
    if (startDate_ != 0L) {
      output.writeInt64(2, startDate_);
    }
    if (numDays_ != 0) {
      output.writeInt32(3, numDays_);
    }
    if (dateToPay_ != 0L) {
      output.writeInt64(4, dateToPay_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(hotelID_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, hotelID_);
    }
    if (startDate_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(2, startDate_);
    }
    if (numDays_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, numDays_);
    }
    if (dateToPay_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(4, dateToPay_);
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
    if (!(obj instanceof raf.hotelreservation.grpc.Reservation)) {
      return super.equals(obj);
    }
    raf.hotelreservation.grpc.Reservation other = (raf.hotelreservation.grpc.Reservation) obj;

    if (!getHotelID()
        .equals(other.getHotelID())) return false;
    if (getStartDate()
        != other.getStartDate()) return false;
    if (getNumDays()
        != other.getNumDays()) return false;
    if (getDateToPay()
        != other.getDateToPay()) return false;
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
    hash = (37 * hash) + HOTELID_FIELD_NUMBER;
    hash = (53 * hash) + getHotelID().hashCode();
    hash = (37 * hash) + STARTDATE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getStartDate());
    hash = (37 * hash) + NUMDAYS_FIELD_NUMBER;
    hash = (53 * hash) + getNumDays();
    hash = (37 * hash) + DATETOPAY_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDateToPay());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static raf.hotelreservation.grpc.Reservation parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static raf.hotelreservation.grpc.Reservation parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static raf.hotelreservation.grpc.Reservation parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static raf.hotelreservation.grpc.Reservation parseFrom(
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
  public static Builder newBuilder(raf.hotelreservation.grpc.Reservation prototype) {
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
   * Protobuf type {@code Reservation}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:Reservation)
      raf.hotelreservation.grpc.ReservationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_Reservation_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_Reservation_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              raf.hotelreservation.grpc.Reservation.class, raf.hotelreservation.grpc.Reservation.Builder.class);
    }

    // Construct using raf.hotelreservation.grpc.Reservation.newBuilder()
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
      hotelID_ = "";
      startDate_ = 0L;
      numDays_ = 0;
      dateToPay_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return raf.hotelreservation.grpc.ReservationServiceOuterClass.internal_static_Reservation_descriptor;
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.Reservation getDefaultInstanceForType() {
      return raf.hotelreservation.grpc.Reservation.getDefaultInstance();
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.Reservation build() {
      raf.hotelreservation.grpc.Reservation result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public raf.hotelreservation.grpc.Reservation buildPartial() {
      raf.hotelreservation.grpc.Reservation result = new raf.hotelreservation.grpc.Reservation(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(raf.hotelreservation.grpc.Reservation result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.hotelID_ = hotelID_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.startDate_ = startDate_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numDays_ = numDays_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.dateToPay_ = dateToPay_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof raf.hotelreservation.grpc.Reservation) {
        return mergeFrom((raf.hotelreservation.grpc.Reservation)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(raf.hotelreservation.grpc.Reservation other) {
      if (other == raf.hotelreservation.grpc.Reservation.getDefaultInstance()) return this;
      if (!other.getHotelID().isEmpty()) {
        hotelID_ = other.hotelID_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getStartDate() != 0L) {
        setStartDate(other.getStartDate());
      }
      if (other.getNumDays() != 0) {
        setNumDays(other.getNumDays());
      }
      if (other.getDateToPay() != 0L) {
        setDateToPay(other.getDateToPay());
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
              hotelID_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              startDate_ = input.readInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              numDays_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              dateToPay_ = input.readInt64();
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

    private java.lang.Object hotelID_ = "";
    /**
     * <code>string hotelID = 1;</code>
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
     * <code>string hotelID = 1;</code>
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
     * <code>string hotelID = 1;</code>
     * @param value The hotelID to set.
     * @return This builder for chaining.
     */
    public Builder setHotelID(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      hotelID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string hotelID = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearHotelID() {
      hotelID_ = getDefaultInstance().getHotelID();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string hotelID = 1;</code>
     * @param value The bytes for hotelID to set.
     * @return This builder for chaining.
     */
    public Builder setHotelIDBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      hotelID_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long startDate_ ;
    /**
     * <code>int64 startDate = 2;</code>
     * @return The startDate.
     */
    @java.lang.Override
    public long getStartDate() {
      return startDate_;
    }
    /**
     * <code>int64 startDate = 2;</code>
     * @param value The startDate to set.
     * @return This builder for chaining.
     */
    public Builder setStartDate(long value) {

      startDate_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int64 startDate = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearStartDate() {
      bitField0_ = (bitField0_ & ~0x00000002);
      startDate_ = 0L;
      onChanged();
      return this;
    }

    private int numDays_ ;
    /**
     * <code>int32 numDays = 3;</code>
     * @return The numDays.
     */
    @java.lang.Override
    public int getNumDays() {
      return numDays_;
    }
    /**
     * <code>int32 numDays = 3;</code>
     * @param value The numDays to set.
     * @return This builder for chaining.
     */
    public Builder setNumDays(int value) {

      numDays_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 numDays = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearNumDays() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numDays_ = 0;
      onChanged();
      return this;
    }

    private long dateToPay_ ;
    /**
     * <code>int64 dateToPay = 4;</code>
     * @return The dateToPay.
     */
    @java.lang.Override
    public long getDateToPay() {
      return dateToPay_;
    }
    /**
     * <code>int64 dateToPay = 4;</code>
     * @param value The dateToPay to set.
     * @return This builder for chaining.
     */
    public Builder setDateToPay(long value) {

      dateToPay_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int64 dateToPay = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearDateToPay() {
      bitField0_ = (bitField0_ & ~0x00000008);
      dateToPay_ = 0L;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:Reservation)
  }

  // @@protoc_insertion_point(class_scope:Reservation)
  private static final raf.hotelreservation.grpc.Reservation DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new raf.hotelreservation.grpc.Reservation();
  }

  public static raf.hotelreservation.grpc.Reservation getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Reservation>
      PARSER = new com.google.protobuf.AbstractParser<Reservation>() {
    @java.lang.Override
    public Reservation parsePartialFrom(
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

  public static com.google.protobuf.Parser<Reservation> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Reservation> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public raf.hotelreservation.grpc.Reservation getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
