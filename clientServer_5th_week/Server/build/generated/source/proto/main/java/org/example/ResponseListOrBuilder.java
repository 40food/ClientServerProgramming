// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClassSystem.proto

package org.example;

public interface ResponseListOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.example.ResponseList)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string type = 1;</code>
   * @return The type.
   */
  java.lang.String getType();
  /**
   * <code>string type = 1;</code>
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString
      getTypeBytes();

  /**
   * <code>repeated string Response = 2;</code>
   * @return A list containing the response.
   */
  java.util.List<java.lang.String>
      getResponseList();
  /**
   * <code>repeated string Response = 2;</code>
   * @return The count of response.
   */
  int getResponseCount();
  /**
   * <code>repeated string Response = 2;</code>
   * @param index The index of the element to return.
   * @return The response at the given index.
   */
  java.lang.String getResponse(int index);
  /**
   * <code>repeated string Response = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the response at the given index.
   */
  com.google.protobuf.ByteString
      getResponseBytes(int index);
}
