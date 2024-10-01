package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 * <pre>
 *서비스 협약Contract 정의
 * </pre>
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: NameSystem.proto")
public final class NameServiceGrpc {

  private NameServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.NameService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.SaveRequest,
      org.example.SaveResponse> getSaveNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveName",
      requestType = org.example.SaveRequest.class,
      responseType = org.example.SaveResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.SaveRequest,
      org.example.SaveResponse> getSaveNameMethod() {
    io.grpc.MethodDescriptor<org.example.SaveRequest, org.example.SaveResponse> getSaveNameMethod;
    if ((getSaveNameMethod = NameServiceGrpc.getSaveNameMethod) == null) {
      synchronized (NameServiceGrpc.class) {
        if ((getSaveNameMethod = NameServiceGrpc.getSaveNameMethod) == null) {
          NameServiceGrpc.getSaveNameMethod = getSaveNameMethod =
              io.grpc.MethodDescriptor.<org.example.SaveRequest, org.example.SaveResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "saveName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.SaveRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.SaveResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameServiceMethodDescriptorSupplier("saveName"))
              .build();
        }
      }
    }
    return getSaveNameMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.LoadRequest,
      org.example.LoadResponse> getLoadNameMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "loadName",
      requestType = org.example.LoadRequest.class,
      responseType = org.example.LoadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.LoadRequest,
      org.example.LoadResponse> getLoadNameMethod() {
    io.grpc.MethodDescriptor<org.example.LoadRequest, org.example.LoadResponse> getLoadNameMethod;
    if ((getLoadNameMethod = NameServiceGrpc.getLoadNameMethod) == null) {
      synchronized (NameServiceGrpc.class) {
        if ((getLoadNameMethod = NameServiceGrpc.getLoadNameMethod) == null) {
          NameServiceGrpc.getLoadNameMethod = getLoadNameMethod =
              io.grpc.MethodDescriptor.<org.example.LoadRequest, org.example.LoadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "loadName"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.LoadRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.LoadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new NameServiceMethodDescriptorSupplier("loadName"))
              .build();
        }
      }
    }
    return getLoadNameMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static NameServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServiceStub>() {
        @java.lang.Override
        public NameServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServiceStub(channel, callOptions);
        }
      };
    return NameServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static NameServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServiceBlockingStub>() {
        @java.lang.Override
        public NameServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServiceBlockingStub(channel, callOptions);
        }
      };
    return NameServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static NameServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<NameServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<NameServiceFutureStub>() {
        @java.lang.Override
        public NameServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new NameServiceFutureStub(channel, callOptions);
        }
      };
    return NameServiceFutureStub.newStub(factory, channel);
  }

  /**
   * <pre>
   *서비스 협약Contract 정의
   * </pre>
   */
  public static abstract class NameServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void saveName(org.example.SaveRequest request,
        io.grpc.stub.StreamObserver<org.example.SaveResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getSaveNameMethod(), responseObserver);
    }

    /**
     */
    public void loadName(org.example.LoadRequest request,
        io.grpc.stub.StreamObserver<org.example.LoadResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getLoadNameMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getSaveNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.SaveRequest,
                org.example.SaveResponse>(
                  this, METHODID_SAVE_NAME)))
          .addMethod(
            getLoadNameMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.LoadRequest,
                org.example.LoadResponse>(
                  this, METHODID_LOAD_NAME)))
          .build();
    }
  }

  /**
   * <pre>
   *서비스 협약Contract 정의
   * </pre>
   */
  public static final class NameServiceStub extends io.grpc.stub.AbstractAsyncStub<NameServiceStub> {
    private NameServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServiceStub(channel, callOptions);
    }

    /**
     */
    public void saveName(org.example.SaveRequest request,
        io.grpc.stub.StreamObserver<org.example.SaveResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getSaveNameMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void loadName(org.example.LoadRequest request,
        io.grpc.stub.StreamObserver<org.example.LoadResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getLoadNameMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * <pre>
   *서비스 협약Contract 정의
   * </pre>
   */
  public static final class NameServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<NameServiceBlockingStub> {
    private NameServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.SaveResponse saveName(org.example.SaveRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getSaveNameMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.LoadResponse loadName(org.example.LoadRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getLoadNameMethod(), getCallOptions(), request);
    }
  }

  /**
   * <pre>
   *서비스 협약Contract 정의
   * </pre>
   */
  public static final class NameServiceFutureStub extends io.grpc.stub.AbstractFutureStub<NameServiceFutureStub> {
    private NameServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected NameServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new NameServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.SaveResponse> saveName(
        org.example.SaveRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getSaveNameMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.LoadResponse> loadName(
        org.example.LoadRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getLoadNameMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_SAVE_NAME = 0;
  private static final int METHODID_LOAD_NAME = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final NameServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(NameServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_SAVE_NAME:
          serviceImpl.saveName((org.example.SaveRequest) request,
              (io.grpc.stub.StreamObserver<org.example.SaveResponse>) responseObserver);
          break;
        case METHODID_LOAD_NAME:
          serviceImpl.loadName((org.example.LoadRequest) request,
              (io.grpc.stub.StreamObserver<org.example.LoadResponse>) responseObserver);
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

  private static abstract class NameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    NameServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.NameSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("NameService");
    }
  }

  private static final class NameServiceFileDescriptorSupplier
      extends NameServiceBaseDescriptorSupplier {
    NameServiceFileDescriptorSupplier() {}
  }

  private static final class NameServiceMethodDescriptorSupplier
      extends NameServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    NameServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (NameServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new NameServiceFileDescriptorSupplier())
              .addMethod(getSaveNameMethod())
              .addMethod(getLoadNameMethod())
              .build();
        }
      }
    }
    return result;
  }
}
