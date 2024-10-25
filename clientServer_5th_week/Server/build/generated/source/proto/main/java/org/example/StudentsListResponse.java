// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClassSystem.proto

package org.example;

/**
 * Protobuf type {@code org.example.StudentsListResponse}
 */
public final class StudentsListResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:org.example.StudentsListResponse)
    StudentsListResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StudentsListResponse.newBuilder() to construct.
  private StudentsListResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StudentsListResponse() {
    student_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StudentsListResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.example.ClassSystem.internal_static_org_example_StudentsListResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.example.ClassSystem.internal_static_org_example_StudentsListResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.example.StudentsListResponse.class, org.example.StudentsListResponse.Builder.class);
  }

  public static final int STUDENT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<org.example.Student> student_;
  /**
   * <code>repeated .org.example.Student student = 1;</code>
   */
  @java.lang.Override
  public java.util.List<org.example.Student> getStudentList() {
    return student_;
  }
  /**
   * <code>repeated .org.example.Student student = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends org.example.StudentOrBuilder> 
      getStudentOrBuilderList() {
    return student_;
  }
  /**
   * <code>repeated .org.example.Student student = 1;</code>
   */
  @java.lang.Override
  public int getStudentCount() {
    return student_.size();
  }
  /**
   * <code>repeated .org.example.Student student = 1;</code>
   */
  @java.lang.Override
  public org.example.Student getStudent(int index) {
    return student_.get(index);
  }
  /**
   * <code>repeated .org.example.Student student = 1;</code>
   */
  @java.lang.Override
  public org.example.StudentOrBuilder getStudentOrBuilder(
      int index) {
    return student_.get(index);
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
    for (int i = 0; i < student_.size(); i++) {
      output.writeMessage(1, student_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < student_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, student_.get(i));
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
    if (!(obj instanceof org.example.StudentsListResponse)) {
      return super.equals(obj);
    }
    org.example.StudentsListResponse other = (org.example.StudentsListResponse) obj;

    if (!getStudentList()
        .equals(other.getStudentList())) return false;
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
    if (getStudentCount() > 0) {
      hash = (37 * hash) + STUDENT_FIELD_NUMBER;
      hash = (53 * hash) + getStudentList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.example.StudentsListResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.StudentsListResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.StudentsListResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.StudentsListResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.StudentsListResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.example.StudentsListResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.example.StudentsListResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.StudentsListResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.example.StudentsListResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.example.StudentsListResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.example.StudentsListResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static org.example.StudentsListResponse parseFrom(
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
  public static Builder newBuilder(org.example.StudentsListResponse prototype) {
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
   * Protobuf type {@code org.example.StudentsListResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:org.example.StudentsListResponse)
      org.example.StudentsListResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.example.ClassSystem.internal_static_org_example_StudentsListResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.example.ClassSystem.internal_static_org_example_StudentsListResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.example.StudentsListResponse.class, org.example.StudentsListResponse.Builder.class);
    }

    // Construct using org.example.StudentsListResponse.newBuilder()
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
      if (studentBuilder_ == null) {
        student_ = java.util.Collections.emptyList();
      } else {
        student_ = null;
        studentBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.example.ClassSystem.internal_static_org_example_StudentsListResponse_descriptor;
    }

    @java.lang.Override
    public org.example.StudentsListResponse getDefaultInstanceForType() {
      return org.example.StudentsListResponse.getDefaultInstance();
    }

    @java.lang.Override
    public org.example.StudentsListResponse build() {
      org.example.StudentsListResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.example.StudentsListResponse buildPartial() {
      org.example.StudentsListResponse result = new org.example.StudentsListResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(org.example.StudentsListResponse result) {
      if (studentBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          student_ = java.util.Collections.unmodifiableList(student_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.student_ = student_;
      } else {
        result.student_ = studentBuilder_.build();
      }
    }

    private void buildPartial0(org.example.StudentsListResponse result) {
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
      if (other instanceof org.example.StudentsListResponse) {
        return mergeFrom((org.example.StudentsListResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.example.StudentsListResponse other) {
      if (other == org.example.StudentsListResponse.getDefaultInstance()) return this;
      if (studentBuilder_ == null) {
        if (!other.student_.isEmpty()) {
          if (student_.isEmpty()) {
            student_ = other.student_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStudentIsMutable();
            student_.addAll(other.student_);
          }
          onChanged();
        }
      } else {
        if (!other.student_.isEmpty()) {
          if (studentBuilder_.isEmpty()) {
            studentBuilder_.dispose();
            studentBuilder_ = null;
            student_ = other.student_;
            bitField0_ = (bitField0_ & ~0x00000001);
            studentBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getStudentFieldBuilder() : null;
          } else {
            studentBuilder_.addAllMessages(other.student_);
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
              org.example.Student m =
                  input.readMessage(
                      org.example.Student.parser(),
                      extensionRegistry);
              if (studentBuilder_ == null) {
                ensureStudentIsMutable();
                student_.add(m);
              } else {
                studentBuilder_.addMessage(m);
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

    private java.util.List<org.example.Student> student_ =
      java.util.Collections.emptyList();
    private void ensureStudentIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        student_ = new java.util.ArrayList<org.example.Student>(student_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.Student, org.example.Student.Builder, org.example.StudentOrBuilder> studentBuilder_;

    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public java.util.List<org.example.Student> getStudentList() {
      if (studentBuilder_ == null) {
        return java.util.Collections.unmodifiableList(student_);
      } else {
        return studentBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public int getStudentCount() {
      if (studentBuilder_ == null) {
        return student_.size();
      } else {
        return studentBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public org.example.Student getStudent(int index) {
      if (studentBuilder_ == null) {
        return student_.get(index);
      } else {
        return studentBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder setStudent(
        int index, org.example.Student value) {
      if (studentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentIsMutable();
        student_.set(index, value);
        onChanged();
      } else {
        studentBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder setStudent(
        int index, org.example.Student.Builder builderForValue) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        student_.set(index, builderForValue.build());
        onChanged();
      } else {
        studentBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder addStudent(org.example.Student value) {
      if (studentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentIsMutable();
        student_.add(value);
        onChanged();
      } else {
        studentBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder addStudent(
        int index, org.example.Student value) {
      if (studentBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStudentIsMutable();
        student_.add(index, value);
        onChanged();
      } else {
        studentBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder addStudent(
        org.example.Student.Builder builderForValue) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        student_.add(builderForValue.build());
        onChanged();
      } else {
        studentBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder addStudent(
        int index, org.example.Student.Builder builderForValue) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        student_.add(index, builderForValue.build());
        onChanged();
      } else {
        studentBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder addAllStudent(
        java.lang.Iterable<? extends org.example.Student> values) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, student_);
        onChanged();
      } else {
        studentBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder clearStudent() {
      if (studentBuilder_ == null) {
        student_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        studentBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public Builder removeStudent(int index) {
      if (studentBuilder_ == null) {
        ensureStudentIsMutable();
        student_.remove(index);
        onChanged();
      } else {
        studentBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public org.example.Student.Builder getStudentBuilder(
        int index) {
      return getStudentFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public org.example.StudentOrBuilder getStudentOrBuilder(
        int index) {
      if (studentBuilder_ == null) {
        return student_.get(index);  } else {
        return studentBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public java.util.List<? extends org.example.StudentOrBuilder> 
         getStudentOrBuilderList() {
      if (studentBuilder_ != null) {
        return studentBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(student_);
      }
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public org.example.Student.Builder addStudentBuilder() {
      return getStudentFieldBuilder().addBuilder(
          org.example.Student.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public org.example.Student.Builder addStudentBuilder(
        int index) {
      return getStudentFieldBuilder().addBuilder(
          index, org.example.Student.getDefaultInstance());
    }
    /**
     * <code>repeated .org.example.Student student = 1;</code>
     */
    public java.util.List<org.example.Student.Builder> 
         getStudentBuilderList() {
      return getStudentFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        org.example.Student, org.example.Student.Builder, org.example.StudentOrBuilder> 
        getStudentFieldBuilder() {
      if (studentBuilder_ == null) {
        studentBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            org.example.Student, org.example.Student.Builder, org.example.StudentOrBuilder>(
                student_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        student_ = null;
      }
      return studentBuilder_;
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


    // @@protoc_insertion_point(builder_scope:org.example.StudentsListResponse)
  }

  // @@protoc_insertion_point(class_scope:org.example.StudentsListResponse)
  private static final org.example.StudentsListResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.example.StudentsListResponse();
  }

  public static org.example.StudentsListResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StudentsListResponse>
      PARSER = new com.google.protobuf.AbstractParser<StudentsListResponse>() {
    @java.lang.Override
    public StudentsListResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<StudentsListResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StudentsListResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.example.StudentsListResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
