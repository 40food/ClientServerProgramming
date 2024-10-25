package org.example;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.35.0)",
    comments = "Source: ClassSystem.proto")
public final class CourseServiceGrpc {

  private CourseServiceGrpc() {}

  public static final String SERVICE_NAME = "org.example.CourseService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.example.Request,
      org.example.ResponseList> getGetCourseListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getCourseList",
      requestType = org.example.Request.class,
      responseType = org.example.ResponseList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Request,
      org.example.ResponseList> getGetCourseListMethod() {
    io.grpc.MethodDescriptor<org.example.Request, org.example.ResponseList> getGetCourseListMethod;
    if ((getGetCourseListMethod = CourseServiceGrpc.getGetCourseListMethod) == null) {
      synchronized (CourseServiceGrpc.class) {
        if ((getGetCourseListMethod = CourseServiceGrpc.getGetCourseListMethod) == null) {
          CourseServiceGrpc.getGetCourseListMethod = getGetCourseListMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.ResponseList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getCourseList"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.ResponseList.getDefaultInstance()))
              .setSchemaDescriptor(new CourseServiceMethodDescriptorSupplier("getCourseList"))
              .build();
        }
      }
    }
    return getGetCourseListMethod;
  }

  private static volatile io.grpc.MethodDescriptor<org.example.Course,
      org.example.Response> getAddCourseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addCourse",
      requestType = org.example.Course.class,
      responseType = org.example.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.example.Course,
      org.example.Response> getAddCourseMethod() {
    io.grpc.MethodDescriptor<org.example.Course, org.example.Response> getAddCourseMethod;
    if ((getAddCourseMethod = CourseServiceGrpc.getAddCourseMethod) == null) {
      synchronized (CourseServiceGrpc.class) {
        if ((getAddCourseMethod = CourseServiceGrpc.getAddCourseMethod) == null) {
          CourseServiceGrpc.getAddCourseMethod = getAddCourseMethod =
              io.grpc.MethodDescriptor.<org.example.Course, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Course.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new CourseServiceMethodDescriptorSupplier("addCourse"))
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
    if ((getDeleteCourseMethod = CourseServiceGrpc.getDeleteCourseMethod) == null) {
      synchronized (CourseServiceGrpc.class) {
        if ((getDeleteCourseMethod = CourseServiceGrpc.getDeleteCourseMethod) == null) {
          CourseServiceGrpc.getDeleteCourseMethod = getDeleteCourseMethod =
              io.grpc.MethodDescriptor.<org.example.Request, org.example.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "deleteCourse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Request.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.example.Response.getDefaultInstance()))
              .setSchemaDescriptor(new CourseServiceMethodDescriptorSupplier("deleteCourse"))
              .build();
        }
      }
    }
    return getDeleteCourseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static CourseServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseServiceStub>() {
        @java.lang.Override
        public CourseServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseServiceStub(channel, callOptions);
        }
      };
    return CourseServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static CourseServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseServiceBlockingStub>() {
        @java.lang.Override
        public CourseServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseServiceBlockingStub(channel, callOptions);
        }
      };
    return CourseServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static CourseServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<CourseServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<CourseServiceFutureStub>() {
        @java.lang.Override
        public CourseServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new CourseServiceFutureStub(channel, callOptions);
        }
      };
    return CourseServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class CourseServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getCourseList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.ResponseList> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetCourseListMethod(), responseObserver);
    }

    /**
     */
    public void addCourse(org.example.Course request,
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
                org.example.ResponseList>(
                  this, METHODID_GET_COURSE_LIST)))
          .addMethod(
            getAddCourseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.example.Course,
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
  public static final class CourseServiceStub extends io.grpc.stub.AbstractAsyncStub<CourseServiceStub> {
    private CourseServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseServiceStub(channel, callOptions);
    }

    /**
     */
    public void getCourseList(org.example.Request request,
        io.grpc.stub.StreamObserver<org.example.ResponseList> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetCourseListMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addCourse(org.example.Course request,
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
  public static final class CourseServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<CourseServiceBlockingStub> {
    private CourseServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.example.ResponseList getCourseList(org.example.Request request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetCourseListMethod(), getCallOptions(), request);
    }

    /**
     */
    public org.example.Response addCourse(org.example.Course request) {
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
  public static final class CourseServiceFutureStub extends io.grpc.stub.AbstractFutureStub<CourseServiceFutureStub> {
    private CourseServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected CourseServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new CourseServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.ResponseList> getCourseList(
        org.example.Request request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetCourseListMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.example.Response> addCourse(
        org.example.Course request) {
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
  private static final int METHODID_ADD_COURSE = 1;
  private static final int METHODID_DELETE_COURSE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final CourseServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(CourseServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_COURSE_LIST:
          serviceImpl.getCourseList((org.example.Request) request,
              (io.grpc.stub.StreamObserver<org.example.ResponseList>) responseObserver);
          break;
        case METHODID_ADD_COURSE:
          serviceImpl.addCourse((org.example.Course) request,
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

  private static abstract class CourseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    CourseServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.example.ClassSystem.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("CourseService");
    }
  }

  private static final class CourseServiceFileDescriptorSupplier
      extends CourseServiceBaseDescriptorSupplier {
    CourseServiceFileDescriptorSupplier() {}
  }

  private static final class CourseServiceMethodDescriptorSupplier
      extends CourseServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    CourseServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (CourseServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new CourseServiceFileDescriptorSupplier())
              .addMethod(getGetCourseListMethod())
              .addMethod(getAddCourseMethod())
              .addMethod(getDeleteCourseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
