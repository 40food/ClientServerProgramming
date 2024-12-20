// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClassSystem.proto

package org.example;

/**
 * Protobuf type {@code org.example.RegistrationListResponse}
 */
public final class RegistrationListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.RegistrationListResponse)
    RegistrationListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use RegistrationListResponse.newBuilder() to construct.
  private RegistrationListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private RegistrationListResponse() {
    registration_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new RegistrationListResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.ClassSystem.internal_static_org_example_RegistrationListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.ClassSystem.internal_static_org_example_RegistrationListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.RegistrationListResponse.class, org.example.RegistrationListResponse.Builder.class);
  }

  public static final int REGISTRATION_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.example.RegistrationResponse> registration_;
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.RegistrationResponse> getRegistrationList() {
    return registration_;
  }
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.RegistrationResponseOrBuilder> 
      getRegistrationOrBuilderList() {
    return registration_;
  }
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  @java.lang.Override
  public int getRegistrationCount() {
    return registration_.size();
  }
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  @java.lang.Override
  public org.example.RegistrationResponse getRegistration(int index) {
    return registration_.get(index);
  }
  /**
   * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
   */
  @java.lang.Override
  public org.example.RegistrationResponseOrBuilder getRegistrationOrBuilder(
      int index) {
    return registration_.get(index);
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
    for (int i = 0; i < registration_.size(); i++) {
      output.writeMessage(1, registration_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < registration_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, registration_.get(i));
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
    if (!(obj instanceof org.example.RegistrationListResponse)) {
      return super.equals(obj);
    }
    org.example.RegistrationListResponse other = (org.example.RegistrationListResponse) obj;

    if (!getRegistrationList()
        .equals(other.getRegistrationList())) return false;
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
    if (getRegistrationCount() > 0) {
      hash = (37 * hash) + REGISTRATION_FIELD_NUMBER;
      hash = (53 * hash) + getRegistrationList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.RegistrationListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.RegistrationListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.RegistrationListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.RegistrationListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.RegistrationListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.RegistrationListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.RegistrationListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.RegistrationListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.RegistrationListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.RegistrationListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.RegistrationListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.RegistrationListResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(org.example.RegistrationListResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code org.example.RegistrationListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.RegistrationListResponse)
      org.example.RegistrationListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.ClassSystem.internal_static_org_example_RegistrationListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.ClassSystem.internal_static_org_example_RegistrationListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.RegistrationListResponse.class, org.example.RegistrationListResponse.Builder.class);
    }

    // Construct using org.example.RegistrationListResponse.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (registrationBuilder_ == null) {
        registration_ = java.util.Collections.emptyList();
      } else {
        registration_ = null;
        registrationBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.ClassSystem.internal_static_org_example_RegistrationListResponse_descriptor;
    }

    @java.lang.Override
    public org.example.RegistrationListResponse getDefaultInstanceForType() {
      return org.example.RegistrationListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.RegistrationListResponse build() {
      org.example.RegistrationListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.RegistrationListResponse buildPartial() {
      org.example.RegistrationListResponse result = new org.example.RegistrationListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.example.RegistrationListResponse result) {
      if (registrationBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          registration_ = java.util.Collections.unmodifiableList(registration_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.registration_ = registration_;
      } else {
        result.registration_ = registrationBuilder_.build();
      }
    }

    private void buildPartial0(org.example.RegistrationListResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.example.RegistrationListResponse) {
        return mergeFrom((org.example.RegistrationListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.RegistrationListResponse other) {
      if (other == org.example.RegistrationListResponse.getDefaultInstance()) return this;
      if (registrationBuilder_ == null) {
        if (!other.registration_.isEmpty()) {
          if (registration_.isEmpty()) {
            registration_ = other.registration_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureRegistrationIsMutable();
            registration_.addAll(other.registration_);
          }
          onChanged();
        }
      } else {
        if (!other.registration_.isEmpty()) {
          if (registrationBuilder_.isEmpty()) {
            registrationBuilder_.dispose();
            registrationBuilder_ = null;
            registration_ = other.registration_;
            bitField0_ = (bitField0_ & ~0x00000001);
            registrationBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getRegistrationFieldBuilder() : null;
          } else {
            registrationBuilder_.addAllMessages(other.registration_);
          }
        }
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
              org.example.RegistrationResponse m =
                  input.readMessage(
                      org.example.RegistrationResponse.parser(),
                      extensionRegistry);
              if (registrationBuilder_ == null) {
                ensureRegistrationIsMutable();
                registration_.add(m);
              } else {
                registrationBuilder_.addMessage(m);
              }
              break;
            } // case 10
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

    private java.util.List<org.example.RegistrationResponse> registration_ =
      java.util.Collections.emptyList();
    private void ensureRegistrationIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        registration_ = new java.util.ArrayList<org.example.RegistrationResponse>(registration_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.RegistrationResponse, org.example.RegistrationResponse.Builder, org.example.RegistrationResponseOrBuilder> registrationBuilder_;

    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public java.util.List<org.example.RegistrationResponse> getRegistrationList() {
      if (registrationBuilder_ == null) {
        return java.util.Collections.unmodifiableList(registration_);
      } else {
        return registrationBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public int getRegistrationCount() {
      if (registrationBuilder_ == null) {
        return registration_.size();
      } else {
        return registrationBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public org.example.RegistrationResponse getRegistration(int index) {
      if (registrationBuilder_ == null) {
        return registration_.get(index);
      } else {
        return registrationBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder setRegistration(
        int index, org.example.RegistrationResponse value) {
      if (registrationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegistrationIsMutable();
        registration_.set(index, value);
        onChanged();
      } else {
        registrationBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder setRegistration(
        int index, org.example.RegistrationResponse.Builder builderForValue) {
      if (registrationBuilder_ == null) {
        ensureRegistrationIsMutable();
        registration_.set(index, builderForValue.build());
        onChanged();
      } else {
        registrationBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder addRegistration(org.example.RegistrationResponse value) {
      if (registrationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegistrationIsMutable();
        registration_.add(value);
        onChanged();
      } else {
        registrationBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder addRegistration(
        int index, org.example.RegistrationResponse value) {
      if (registrationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureRegistrationIsMutable();
        registration_.add(index, value);
        onChanged();
      } else {
        registrationBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder addRegistration(
        org.example.RegistrationResponse.Builder builderForValue) {
      if (registrationBuilder_ == null) {
        ensureRegistrationIsMutable();
        registration_.add(builderForValue.build());
        onChanged();
      } else {
        registrationBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder addRegistration(
        int index, org.example.RegistrationResponse.Builder builderForValue) {
      if (registrationBuilder_ == null) {
        ensureRegistrationIsMutable();
        registration_.add(index, builderForValue.build());
        onChanged();
      } else {
        registrationBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder addAllRegistration(
        java.lang.Iterable<? extends org.example.RegistrationResponse> values) {
      if (registrationBuilder_ == null) {
        ensureRegistrationIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, registration_);
        onChanged();
      } else {
        registrationBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder clearRegistration() {
      if (registrationBuilder_ == null) {
        registration_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        registrationBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public Builder removeRegistration(int index) {
      if (registrationBuilder_ == null) {
        ensureRegistrationIsMutable();
        registration_.remove(index);
        onChanged();
      } else {
        registrationBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public org.example.RegistrationResponse.Builder getRegistrationBuilder(
        int index) {
      return getRegistrationFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public org.example.RegistrationResponseOrBuilder getRegistrationOrBuilder(
        int index) {
      if (registrationBuilder_ == null) {
        return registration_.get(index);  } else {
        return registrationBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public java.util.List<? extends org.example.RegistrationResponseOrBuilder> 
         getRegistrationOrBuilderList() {
      if (registrationBuilder_ != null) {
        return registrationBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(registration_);
      }
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public org.example.RegistrationResponse.Builder addRegistrationBuilder() {
      return getRegistrationFieldBuilder().addBuilder(
          org.example.RegistrationResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public org.example.RegistrationResponse.Builder addRegistrationBuilder(
        int index) {
      return getRegistrationFieldBuilder().addBuilder(
          index, org.example.RegistrationResponse.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.RegistrationResponse registration = 1;</code>
     */
    public java.util.List<org.example.RegistrationResponse.Builder> 
         getRegistrationBuilderList() {
      return getRegistrationFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.RegistrationResponse, org.example.RegistrationResponse.Builder, org.example.RegistrationResponseOrBuilder> 
        getRegistrationFieldBuilder() {
      if (registrationBuilder_ == null) {
        registrationBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.RegistrationResponse, org.example.RegistrationResponse.Builder, org.example.RegistrationResponseOrBuilder>(
                registration_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        registration_ = null;
      }
      return registrationBuilder_;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:org.example.RegistrationListResponse)
  }

  // @@protoc_insertion_point(class_scope:org.example.RegistrationListResponse)
  private static final org.example.RegistrationListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.RegistrationListResponse();
  }

  public static org.example.RegistrationListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RegistrationListResponse>
      PARSER = new com.google.protobuf.AbstractParser<RegistrationListResponse>() {
    @java.lang.Override
    public RegistrationListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RegistrationListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RegistrationListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.RegistrationListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

