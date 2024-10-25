package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: ClassSystem.proto")
public final class ServerCourseServiceGrpc {

  private ServerCourseServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.ServerCourseService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getGetCourseListMethod = ServerCourseServiceGrpc.getGetCourseListMethod) == null) {
      synchronized (ServerCourseServiceGrpc.class) {
        if ((getGetCourseListMethod = ServerCourseServiceGrpc.getGetCourseListMethod) == null) {
          ServerCourseServiceGrpc.getGetCourseListMethod = getGetCourseListMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.CourseListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCourseList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.CourseListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerCourseServiceMethodDescriptorSupplier("getCourseList"))
              .build();
        }
      }
    }
    return getGetCourseListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.Course> getGetCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCourse",
      requestType = org.example.Request.class,
      responseType = org.example.Course.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.Course> getGetCourseMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.Course> getGetCourseMethod;
    if ((getGetCourseMethod = ServerCourseServiceGrpc.getGetCourseMethod) == null) {
      synchronized (ServerCourseServiceGrpc.class) {
        if ((getGetCourseMethod = ServerCourseServiceGrpc.getGetCourseMethod) == null) {
          ServerCourseServiceGrpc.getGetCourseMethod = getGetCourseMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Course>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Course.getDefaultInstance()))
              .setSchemaDescriptor(new ServerCourseServiceMethodDescriptorSupplier("getCourse"))
              .build();
        }
      }
    }
    return getGetCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getAddCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCourse",
      requestType = org.example.Request.class,
      responseType = org.example.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getAddCourseMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.Response> getAddCourseMethod;
    if ((getAddCourseMethod = ServerCourseServiceGrpc.getAddCourseMethod) == null) {
      synchronized (ServerCourseServiceGrpc.class) {
        if ((getAddCourseMethod = ServerCourseServiceGrpc.getAddCourseMethod) == null) {
          ServerCourseServiceGrpc.getAddCourseMethod = getAddCourseMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ServerCourseServiceMethodDescriptorSupplier("addCourse"))
              .build();
        }
      }
    }
    return getAddCourseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getDeleteCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "deleteCourse",
      requestType = org.example.Request.class,
      responseType = org.example.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getDeleteCourseMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.Response> getDeleteCourseMethod;
    if ((getDeleteCourseMethod = ServerCourseServiceGrpc.getDeleteCourseMethod) == null) {
      synchronized (ServerCourseServiceGrpc.class) {
        if ((getDeleteCourseMethod = ServerCourseServiceGrpc.getDeleteCourseMethod) == null) {
          ServerCourseServiceGrpc.getDeleteCourseMethod = getDeleteCourseMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ServerCourseServiceMethodDescriptorSupplier("deleteCourse"))
              .build();
        }
      }
    }
    return getDeleteCourseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerCourseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerCourseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerCourseServiceStub>() {
        @java.lang.Override
        public ServerCourseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerCourseServiceStub(channel, callOptions);
        }
      };
    return ServerCourseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerCourseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerCourseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerCourseServiceBlockingStub>() {
        @java.lang.Override
        public ServerCourseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerCourseServiceBlockingStub(channel, callOptions);
        }
      };
    return ServerCourseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerCourseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerCourseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerCourseServiceFutureStub>() {
        @java.lang.Override
        public ServerCourseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerCourseServiceFutureStub(channel, callOptions);
        }
      };
    return ServerCourseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServerCourseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCourseList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.CourseListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseListMethod(), responseObserver);
    }

    /**
     */
    public void getCourse(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Course> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseMethod(), responseObserver);
    }

    /**
     */
    public void addCourse(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddCourseMethod(), responseObserver);
    }

    /**
     */
    public void deleteCourse(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteCourseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetCourseListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.CourseListResponse>(
                  this, METHODID_GET_COURSE_LIST)))
          .addMethod(
            getGetCourseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.Course>(
                  this, METHODID_GET_COURSE)))
          .addMethod(
            getAddCourseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.Response>(
                  this, METHODID_ADD_COURSE)))
          .addMethod(
            getDeleteCourseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.Response>(
                  this, METHODID_DELETE_COURSE)))
          .build();
    }
  }

  /**
   */
  public static final class ServerCourseServiceStub extends io.grpc.stub.AbstractAsyncStub<ServerCourseServiceStub> {
    private ServerCourseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerCourseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerCourseServiceStub(channel, callOptions);
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
    public void getCourse(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Course> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCourse(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddCourseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteCourse(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteCourseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerCourseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServerCourseServiceBlockingStub> {
    private ServerCourseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerCourseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerCourseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.CourseListResponse getCourseList(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Course getCourse(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Response addCourse(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddCourseMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Response deleteCourse(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteCourseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerCourseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServerCourseServiceFutureStub> {
    private ServerCourseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerCourseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerCourseServiceFutureStub(channel, callOptions);
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
    public com.google.common.util.concurrent.ListenableFuture<org.example.Course> getCourse(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Response> addCourse(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddCourseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Response> deleteCourse(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteCourseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_COURSE_LIST = 0;
  private static final int METHODID_GET_COURSE = 1;
  private static final int METHODID_ADD_COURSE = 2;
  private static final int METHODID_DELETE_COURSE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerCourseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerCourseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COURSE_LIST:
          serviceImpl.getCourseList((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.CourseListResponse>) responseObserver);
          break;
        case METHODID_GET_COURSE:
          serviceImpl.getCourse((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.Course>) responseObserver);
          break;
        case METHODID_ADD_COURSE:
          serviceImpl.addCourse((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.Response>) responseObserver);
          break;
        case METHODID_DELETE_COURSE:
          serviceImpl.deleteCourse((org.example.Request) request,
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

  private static abstract class ServerCourseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerCourseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.ClassSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerCourseService");
    }
  }

  private static final class ServerCourseServiceFileDescriptorSupplier
      extends ServerCourseServiceBaseDescriptorSupplier {
    ServerCourseServiceFileDescriptorSupplier() {}
  }

  private static final class ServerCourseServiceMethodDescriptorSupplier
      extends ServerCourseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerCourseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServerCourseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerCourseServiceFileDescriptorSupplier())
              .addMethod(getGetCourseListMethod())
              .addMethod(getGetCourseMethod())
              .addMethod(getAddCourseMethod())
              .addMethod(getDeleteCourseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
