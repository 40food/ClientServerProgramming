package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *data
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: ClassSystem.proto")
public final class ServerStudentServiceGrpc {

  private ServerStudentServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.ServerStudentService";

  // Static method descriptors that strictly reflect the proto.
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
    if ((getGetStudentListMethod = ServerStudentServiceGrpc.getGetStudentListMethod) == null) {
      synchronized (ServerStudentServiceGrpc.class) {
        if ((getGetStudentListMethod = ServerStudentServiceGrpc.getGetStudentListMethod) == null) {
          ServerStudentServiceGrpc.getGetStudentListMethod = getGetStudentListMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.StudentsListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStudentList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.StudentsListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerStudentServiceMethodDescriptorSupplier("getStudentList"))
              .build();
        }
      }
    }
    return getGetStudentListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.Student> getGetStudentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getStudent",
      requestType = org.example.Request.class,
      responseType = org.example.Student.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.Student> getGetStudentMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.Student> getGetStudentMethod;
    if ((getGetStudentMethod = ServerStudentServiceGrpc.getGetStudentMethod) == null) {
      synchronized (ServerStudentServiceGrpc.class) {
        if ((getGetStudentMethod = ServerStudentServiceGrpc.getGetStudentMethod) == null) {
          ServerStudentServiceGrpc.getGetStudentMethod = getGetStudentMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Student>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Student.getDefaultInstance()))
              .setSchemaDescriptor(new ServerStudentServiceMethodDescriptorSupplier("getStudent"))
              .build();
        }
      }
    }
    return getGetStudentMethod;
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
    if ((getAddStudentMethod = ServerStudentServiceGrpc.getAddStudentMethod) == null) {
      synchronized (ServerStudentServiceGrpc.class) {
        if ((getAddStudentMethod = ServerStudentServiceGrpc.getAddStudentMethod) == null) {
          ServerStudentServiceGrpc.getAddStudentMethod = getAddStudentMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ServerStudentServiceMethodDescriptorSupplier("addStudent"))
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
    if ((getDeleteStudentMethod = ServerStudentServiceGrpc.getDeleteStudentMethod) == null) {
      synchronized (ServerStudentServiceGrpc.class) {
        if ((getDeleteStudentMethod = ServerStudentServiceGrpc.getDeleteStudentMethod) == null) {
          ServerStudentServiceGrpc.getDeleteStudentMethod = getDeleteStudentMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteStudent"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ServerStudentServiceMethodDescriptorSupplier("deleteStudent"))
              .build();
        }
      }
    }
    return getDeleteStudentMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerStudentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerStudentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerStudentServiceStub>() {
        @java.lang.Override
        public ServerStudentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerStudentServiceStub(channel, callOptions);
        }
      };
    return ServerStudentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerStudentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerStudentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerStudentServiceBlockingStub>() {
        @java.lang.Override
        public ServerStudentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerStudentServiceBlockingStub(channel, callOptions);
        }
      };
    return ServerStudentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerStudentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerStudentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerStudentServiceFutureStub>() {
        @java.lang.Override
        public ServerStudentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerStudentServiceFutureStub(channel, callOptions);
        }
      };
    return ServerStudentServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *data
   * </pre>
   */
  public static abstract class ServerStudentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getStudentList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.StudentsListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentListMethod(), responseObserver);
    }

    /**
     */
    public void getStudent(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Student> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetStudentMethod(), responseObserver);
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
            getGetStudentListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.StudentsListResponse>(
                  this, METHODID_GET_STUDENT_LIST)))
          .addMethod(
            getGetStudentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.Student>(
                  this, METHODID_GET_STUDENT)))
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
   *data
   * </pre>
   */
  public static final class ServerStudentServiceStub extends io.grpc.stub.AbstractAsyncStub<ServerStudentServiceStub> {
    private ServerStudentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStudentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerStudentServiceStub(channel, callOptions);
    }

    /**
     */
    public void getStudentList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.StudentsListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getStudent(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Student> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request, responseObserver);
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
   *data
   * </pre>
   */
  public static final class ServerStudentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServerStudentServiceBlockingStub> {
    private ServerStudentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStudentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerStudentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.StudentsListResponse getStudentList(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Student getStudent(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetStudentMethod(), getCallOptions(), request);
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
   *data
   * </pre>
   */
  public static final class ServerStudentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServerStudentServiceFutureStub> {
    private ServerStudentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerStudentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerStudentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.StudentsListResponse> getStudentList(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Student> getStudent(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetStudentMethod(), getCallOptions()), request);
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

  private static final int METHODID_GET_STUDENT_LIST = 0;
  private static final int METHODID_GET_STUDENT = 1;
  private static final int METHODID_ADD_STUDENT = 2;
  private static final int METHODID_DELETE_STUDENT = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerStudentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerStudentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_STUDENT_LIST:
          serviceImpl.getStudentList((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.StudentsListResponse>) responseObserver);
          break;
        case METHODID_GET_STUDENT:
          serviceImpl.getStudent((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.Student>) responseObserver);
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

  private static abstract class ServerStudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerStudentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.ClassSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerStudentService");
    }
  }

  private static final class ServerStudentServiceFileDescriptorSupplier
      extends ServerStudentServiceBaseDescriptorSupplier {
    ServerStudentServiceFileDescriptorSupplier() {}
  }

  private static final class ServerStudentServiceMethodDescriptorSupplier
      extends ServerStudentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerStudentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServerStudentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerStudentServiceFileDescriptorSupplier())
              .addMethod(getGetStudentListMethod())
              .addMethod(getGetStudentMethod())
              .addMethod(getAddStudentMethod())
              .addMethod(getDeleteStudentMethod())
              .build();
        }
      }
    }
    return result;
  }
}
