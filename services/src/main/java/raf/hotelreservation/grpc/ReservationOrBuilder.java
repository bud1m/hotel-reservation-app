// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReservationService.proto

// Protobuf Java Version: 4.26.1
package raf.hotelreservation.grpc;

public interface ReservationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Reservation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string hotelID = 1;</code>
   * @return The hotelID.
   */
  java.lang.String getHotelID();
  /**
   * <code>string hotelID = 1;</code>
   * @return The bytes for hotelID.
   */
  com.google.protobuf.ByteString
      getHotelIDBytes();

  /**
   * <code>int64 startDate = 2;</code>
   * @return The startDate.
   */
  long getStartDate();

  /**
   * <code>int32 numDays = 3;</code>
   * @return The numDays.
   */
  int getNumDays();

  /**
   * <code>int64 dateToPay = 4;</code>
   * @return The dateToPay.
   */
  long getDateToPay();
}
