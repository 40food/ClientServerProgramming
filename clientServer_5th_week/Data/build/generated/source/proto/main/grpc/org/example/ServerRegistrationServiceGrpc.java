package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: ClassSystem.proto")
public final class ServerRegistrationServiceGrpc {

  private ServerRegistrationServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.ServerRegistrationService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.RegistrationListResponse> getGetRegistrationListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRegistrationList",
      requestType = org.example.Request.class,
      responseType = org.example.RegistrationListResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.RegistrationListResponse> getGetRegistrationListMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.RegistrationListResponse> getGetRegistrationListMethod;
    if ((getGetRegistrationListMethod = ServerRegistrationServiceGrpc.getGetRegistrationListMethod) == null) {
      synchronized (ServerRegistrationServiceGrpc.class) {
        if ((getGetRegistrationListMethod = ServerRegistrationServiceGrpc.getGetRegistrationListMethod) == null) {
          ServerRegistrationServiceGrpc.getGetRegistrationListMethod = getGetRegistrationListMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.RegistrationListResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRegistrationList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.RegistrationListResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerRegistrationServiceMethodDescriptorSupplier("getRegistrationList"))
              .build();
        }
      }
    }
    return getGetRegistrationListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.RegistrationResponse> getGetRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRegistration",
      requestType = org.example.Request.class,
      responseType = org.example.RegistrationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.RegistrationResponse> getGetRegistrationMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.RegistrationResponse> getGetRegistrationMethod;
    if ((getGetRegistrationMethod = ServerRegistrationServiceGrpc.getGetRegistrationMethod) == null) {
      synchronized (ServerRegistrationServiceGrpc.class) {
        if ((getGetRegistrationMethod = ServerRegistrationServiceGrpc.getGetRegistrationMethod) == null) {
          ServerRegistrationServiceGrpc.getGetRegistrationMethod = getGetRegistrationMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.RegistrationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.RegistrationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServerRegistrationServiceMethodDescriptorSupplier("getRegistration"))
              .build();
        }
      }
    }
    return getGetRegistrationMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getAddRegistrationMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addRegistration",
      requestType = org.example.Request.class,
      responseType = org.example.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.Response> getAddRegistrationMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.Response> getAddRegistrationMethod;
    if ((getAddRegistrationMethod = ServerRegistrationServiceGrpc.getAddRegistrationMethod) == null) {
      synchronized (ServerRegistrationServiceGrpc.class) {
        if ((getAddRegistrationMethod = ServerRegistrationServiceGrpc.getAddRegistrationMethod) == null) {
          ServerRegistrationServiceGrpc.getAddRegistrationMethod = getAddRegistrationMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addRegistration"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new ServerRegistrationServiceMethodDescriptorSupplier("addRegistration"))
              .build();
        }
      }
    }
    return getAddRegistrationMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServerRegistrationServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerRegistrationServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerRegistrationServiceStub>() {
        @java.lang.Override
        public ServerRegistrationServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerRegistrationServiceStub(channel, callOptions);
        }
      };
    return ServerRegistrationServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServerRegistrationServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerRegistrationServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerRegistrationServiceBlockingStub>() {
        @java.lang.Override
        public ServerRegistrationServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerRegistrationServiceBlockingStub(channel, callOptions);
        }
      };
    return ServerRegistrationServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServerRegistrationServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServerRegistrationServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServerRegistrationServiceFutureStub>() {
        @java.lang.Override
        public ServerRegistrationServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServerRegistrationServiceFutureStub(channel, callOptions);
        }
      };
    return ServerRegistrationServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ServerRegistrationServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRegistrationList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.RegistrationListResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegistrationListMethod(), responseObserver);
    }

    /**
     */
    public void getRegistration(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.RegistrationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRegistrationMethod(), responseObserver);
    }

    /**
     */
    public void addRegistration(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddRegistrationMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRegistrationListMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.RegistrationListResponse>(
                  this, METHODID_GET_REGISTRATION_LIST)))
          .addMethod(
            getGetRegistrationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.RegistrationResponse>(
                  this, METHODID_GET_REGISTRATION)))
          .addMethod(
            getAddRegistrationMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Request,
                org.example.Response>(
                  this, METHODID_ADD_REGISTRATION)))
          .build();
    }
  }

  /**
   */
  public static final class ServerRegistrationServiceStub extends io.grpc.stub.AbstractAsyncStub<ServerRegistrationServiceStub> {
    private ServerRegistrationServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerRegistrationServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerRegistrationServiceStub(channel, callOptions);
    }

    /**
     */
    public void getRegistrationList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.RegistrationListResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegistrationListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRegistration(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.RegistrationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRegistrationMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addRegistration(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddRegistrationMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ServerRegistrationServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ServerRegistrationServiceBlockingStub> {
    private ServerRegistrationServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerRegistrationServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerRegistrationServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.RegistrationListResponse getRegistrationList(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegistrationListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.RegistrationResponse getRegistration(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRegistrationMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Response addRegistration(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddRegistrationMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ServerRegistrationServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ServerRegistrationServiceFutureStub> {
    private ServerRegistrationServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServerRegistrationServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServerRegistrationServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.RegistrationListResponse> getRegistrationList(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegistrationListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.RegistrationResponse> getRegistration(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRegistrationMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Response> addRegistration(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddRegistrationMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_REGISTRATION_LIST = 0;
  private static final int METHODID_GET_REGISTRATION = 1;
  private static final int METHODID_ADD_REGISTRATION = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ServerRegistrationServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ServerRegistrationServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_REGISTRATION_LIST:
          serviceImpl.getRegistrationList((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.RegistrationListResponse>) responseObserver);
          break;
        case METHODID_GET_REGISTRATION:
          serviceImpl.getRegistration((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.RegistrationResponse>) responseObserver);
          break;
        case METHODID_ADD_REGISTRATION:
          serviceImpl.addRegistration((org.example.Request) request,
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

  private static abstract class ServerRegistrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServerRegistrationServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.ClassSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ServerRegistrationService");
    }
  }

  private static final class ServerRegistrationServiceFileDescriptorSupplier
      extends ServerRegistrationServiceBaseDescriptorSupplier {
    ServerRegistrationServiceFileDescriptorSupplier() {}
  }

  private static final class ServerRegistrationServiceMethodDescriptorSupplier
      extends ServerRegistrationServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ServerRegistrationServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ServerRegistrationServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServerRegistrationServiceFileDescriptorSupplier())
              .addMethod(getGetRegistrationListMethod())
              .addMethod(getGetRegistrationMethod())
              .addMethod(getAddRegistrationMethod())
              .build();
        }
      }
    }
    return result;
  }
}
