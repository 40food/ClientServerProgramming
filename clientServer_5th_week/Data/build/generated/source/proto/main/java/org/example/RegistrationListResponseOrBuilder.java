// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClassSystem.proto

package org.example;

public interface RegistrationListResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:org.example.RegistrationListResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  java.util.List<org.example.RegistrationResponse> 
      getRegistrationList();
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  org.example.RegistrationResponse getRegistration(int index);
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  int getRegistrationCount();
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  java.util.List<? extends org.example.RegistrationResponseOrBuilder> 
      getRegistrationOrBuilderList();
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  org.example.RegistrationResponseOrBuilder getRegistrationOrBuilder(
      int index);
}