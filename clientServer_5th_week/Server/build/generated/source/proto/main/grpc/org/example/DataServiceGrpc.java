package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *서비스 협약Contract 정의
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: ClassSystem.proto")
public final class DataServiceGrpc {

  private DataServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.DataService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "request",
      requestType = org.example.Request.class,
      responseType = org.example.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getRequestMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.Response> getRequestMethod;
    if ((getRequestMethod = DataServiceGrpc.getRequestMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getRequestMethod = DataServiceGrpc.getRequestMethod) == null) {
          DataServiceGrpc.getRequestMethod = getRequestMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "request"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("request"))
              .build();
        }
      }
    }
    return getRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.ResponseList> getMultiRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "multiRequest",
      requestType = org.example.Request.class,
      responseType = org.example.ResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.ResponseList> getMultiRequestMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.ResponseList> getMultiRequestMethod;
    if ((getMultiRequestMethod = DataServiceGrpc.getMultiRequestMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getMultiRequestMethod = DataServiceGrpc.getMultiRequestMethod) == null) {
          DataServiceGrpc.getMultiRequestMethod = getMultiRequestMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.ResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "multiRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.ResponseList.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("multiRequest"))
              .build();
        }
      }
    }
    return getMultiRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.StudentCertRequest,
      org.example.StudentResponse> getLoginMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "login",
      requestType = org.example.StudentCertRequest.class,
      responseType = org.example.StudentResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.StudentCertRequest,
      org.example.StudentResponse> getLoginMethod() {
    io.grpc.MethodDescriptor<org.example.StudentCertRequest, org.example.StudentResponse> getLoginMethod;
    if ((getLoginMethod = DataServiceGrpc.getLoginMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getLoginMethod = DataServiceGrpc.getLoginMethod) == null) {
          DataServiceGrpc.getLoginMethod = getLoginMethod =
              io.grpc.MethodDescriptor.<org.example.StudentCertRequest, org.example.StudentResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "login"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.StudentCertRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.StudentResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("login"))
              .build();
        }
      }
    }
    return getLoginMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.StudentsListResponse> getGetStudentListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStudentList",
      requestType = org.example.Request.class,
      responseType = org.example.StudentsListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.StudentsListResponse> getGetStudentListMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.StudentsListResponse> getGetStudentListMethod;
    if ((getGetStudentListMethod = DataServiceGrpc.getGetStudentListMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getGetStudentListMethod = DataServiceGrpc.getGetStudentListMethod) == null) {
          DataServiceGrpc.getGetStudentListMethod = getGetStudentListMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.StudentsListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStudentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.StudentsListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("getStudentList"))
              .build();
        }
      }
    }
    return getGetStudentListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.CourseListResponse> getGetCourseListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCourseList",
      requestType = org.example.Request.class,
      responseType = org.example.CourseListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.CourseListResponse> getGetCourseListMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.CourseListResponse> getGetCourseListMethod;
    if ((getGetCourseListMethod = DataServiceGrpc.getGetCourseListMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getGetCourseListMethod = DataServiceGrpc.getGetCourseListMethod) == null) {
          DataServiceGrpc.getGetCourseListMethod = getGetCourseListMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.CourseListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCourseList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CourseListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("getCourseList"))
              .build();
        }
      }
    }
    return getGetCourseListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getAddStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addStudent",
      requestType = org.example.Request.class,
      responseType = org.example.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getAddStudentMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.Response> getAddStudentMethod;
    if ((getAddStudentMethod = DataServiceGrpc.getAddStudentMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getAddStudentMethod = DataServiceGrpc.getAddStudentMethod) == null) {
          DataServiceGrpc.getAddStudentMethod = getAddStudentMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("addStudent"))
              .build();
        }
      }
    }
    return getAddStudentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getDeleteStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteStudent",
      requestType = org.example.Request.class,
      responseType = org.example.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getDeleteStudentMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.Response> getDeleteStudentMethod;
    if ((getDeleteStudentMethod = DataServiceGrpc.getDeleteStudentMethod) == null) {
      synchronized (DataServiceGrpc.class) {
        if ((getDeleteStudentMethod = DataServiceGrpc.getDeleteStudentMethod) == null) {
          DataServiceGrpc.getDeleteStudentMethod = getDeleteStudentMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new DataServiceMethodDescriptorSupplier("deleteStudent"))
              .build();
        }
      }
    }
    return getDeleteStudentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static DataServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceStub>() {
        @java.lang.Override
        public DataServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceStub(channel, callOptions);
        }
      };
    return DataServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static DataServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceBlockingStub>() {
        @java.lang.Override
        public DataServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceBlockingStub(channel, callOptions);
        }
      };
    return DataServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static DataServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<DataServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<DataServiceFutureStub>() {
        @java.lang.Override
        public DataServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new DataServiceFutureStub(channel, callOptions);
        }
      };
    return DataServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *서비스 협약Contract 정의
   * </pre>
   */
  public static abstract class DataServiceImplBase implements io.grpc.BindableService {

    /**
     * <pre>
     *client-server
     * </pre>
     */
    public void request(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRequestMethod(), responseObserver);
    }

    /**
     */
    public void multiRequest(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.ResponseList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getMultiRequestMethod(), responseObserver);
    }

    /**
     * <pre>
     *client-server, server-data
     * </pre>
     */
    public void login(org.example.StudentCertRequest request,
        io.grpc.stub.StreamObserver<org.example.StudentResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoginMethod(), responseObserver);
    }

    /**
     * <pre>
     *server-data
     * </pre>
     */
    public void getStudentList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.StudentsListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentListMethod(), responseObserver);
    }

    /**
     */
    public void getCourseList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.CourseListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseListMethod(), responseObserver);
    }

    /**
     */
    public void addStudent(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddStudentMethod(), responseObserver);
    }

    /**
     */
    public void deleteStudent(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteStudentMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.Response>(
                  this, METHODID_REQUEST)))
          .addMethod(
            getMultiRequestMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.ResponseList>(
                  this, METHODID_MULTI_REQUEST)))
          .addMethod(
            getLoginMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.StudentCertRequest,
                org.example.StudentResponse>(
                  this, METHODID_LOGIN)))
          .addMethod(
            getGetStudentListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.StudentsListResponse>(
                  this, METHODID_GET_STUDENT_LIST)))
          .addMethod(
            getGetCourseListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.CourseListResponse>(
                  this, METHODID_GET_COURSE_LIST)))
          .addMethod(
            getAddStudentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.Response>(
                  this, METHODID_ADD_STUDENT)))
          .addMethod(
            getDeleteStudentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.Response>(
                  this, METHODID_DELETE_STUDENT)))
          .build();
    }
  }

  /**
   * <pre>
   *서비스 협약Contract 정의
   * </pre>
   */
  public static final class DataServiceStub extends io.grpc.stub.AbstractAsyncStub<DataServiceStub> {
    private DataServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceStub(channel, callOptions);
    }

    /**
     * <pre>
     *client-server
     * </pre>
     */
    public void request(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void multiRequest(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.ResponseList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getMultiRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *client-server, server-data
     * </pre>
     */
    public void login(org.example.StudentCertRequest request,
        io.grpc.stub.StreamObserver<org.example.StudentResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     * <pre>
     *server-data
     * </pre>
     */
    public void getStudentList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.StudentsListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getCourseList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.CourseListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCourseListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addStudent(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteStudent(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *서비스 협약Contract 정의
   * </pre>
   */
  public static final class DataServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<DataServiceBlockingStub> {
    private DataServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceBlockingStub(channel, callOptions);
    }

    /**
     * <pre>
     *client-server
     * </pre>
     */
    public org.example.Response request(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.ResponseList multiRequest(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getMultiRequestMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *client-server, server-data
     * </pre>
     */
    public org.example.StudentResponse login(org.example.StudentCertRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoginMethod(), getCallOptions(), request);
    }

    /**
     * <pre>
     *server-data
     * </pre>
     */
    public org.example.StudentsListResponse getStudentList(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.CourseListResponse getCourseList(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Response addStudent(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddStudentMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Response deleteStudent(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteStudentMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *서비스 협약Contract 정의
   * </pre>
   */
  public static final class DataServiceFutureStub extends io.grpc.stub.AbstractFutureStub<DataServiceFutureStub> {
    private DataServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected DataServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new DataServiceFutureStub(channel, callOptions);
    }

    /**
     * <pre>
     *client-server
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Response> request(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.ResponseList> multiRequest(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getMultiRequestMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *client-server, server-data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.StudentResponse> login(
        org.example.StudentCertRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoginMethod(), getCallOptions()), request);
    }

    /**
     * <pre>
     *server-data
     * </pre>
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.StudentsListResponse> getStudentList(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.CourseListResponse> getCourseList(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCourseListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Response> addStudent(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddStudentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Response> deleteStudent(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteStudentMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REQUEST = 0;
  private static final int METHODID_MULTI_REQUEST = 1;
  private static final int METHODID_LOGIN = 2;
  private static final int METHODID_GET_STUDENT_LIST = 3;
  private static final int METHODID_GET_COURSE_LIST = 4;
  private static final int METHODID_ADD_STUDENT = 5;
  private static final int METHODID_DELETE_STUDENT = 6;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final DataServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(DataServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REQUEST:
          serviceImpl.request((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.Response>) responseObserver);
          break;
        case METHODID_MULTI_REQUEST:
          serviceImpl.multiRequest((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.ResponseList>) responseObserver);
          break;
        case METHODID_LOGIN:
          serviceImpl.login((org.example.StudentCertRequest) request,
              (io.grpc.stub.StreamObserver<org.example.StudentResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT_LIST:
          serviceImpl.getStudentList((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.StudentsListResponse>) responseObserver);
          break;
        case METHODID_GET_COURSE_LIST:
          serviceImpl.getCourseList((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.CourseListResponse>) responseObserver);
          break;
        case METHODID_ADD_STUDENT:
          serviceImpl.addStudent((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.Response>) responseObserver);
          break;
        case METHODID_DELETE_STUDENT:
          serviceImpl.deleteStudent((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.Response>) responseObserver);
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

  private static abstract class DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    DataServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.ClassSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("DataService");
    }
  }

  private static final class DataServiceFileDescriptorSupplier
      extends DataServiceBaseDescriptorSupplier {
    DataServiceFileDescriptorSupplier() {}
  }

  private static final class DataServiceMethodDescriptorSupplier
      extends DataServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    DataServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (DataServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new DataServiceFileDescriptorSupplier())
              .addMethod(getRequestMethod())
              .addMethod(getMultiRequestMethod())
              .addMethod(getLoginMethod())
              .addMethod(getGetStudentListMethod())
              .addMethod(getGetCourseListMethod())
              .addMethod(getAddStudentMethod())
              .addMethod(getDeleteStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
