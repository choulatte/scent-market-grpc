package com.choulatte.scentpay.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: PaymentService.proto")
public final class PaymentServiceGrpc {

  private PaymentServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.PaymentService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest,
      com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse> getDoPaymentMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doPayment",
      requestType = com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest.class,
      responseType = com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest,
      com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse> getDoPaymentMethod() {
    io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest, com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse> getDoPaymentMethod;
    if ((getDoPaymentMethod = PaymentServiceGrpc.getDoPaymentMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getDoPaymentMethod = PaymentServiceGrpc.getDoPaymentMethod) == null) {
          PaymentServiceGrpc.getDoPaymentMethod = getDoPaymentMethod =
              io.grpc.MethodDescriptor.<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest, com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doPayment"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("doPayment"))
              .build();
        }
      }
    }
    return getDoPaymentMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
      com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> getDoHoldingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doHolding",
      requestType = com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest.class,
      responseType = com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
      com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> getDoHoldingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest, com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> getDoHoldingMethod;
    if ((getDoHoldingMethod = PaymentServiceGrpc.getDoHoldingMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getDoHoldingMethod = PaymentServiceGrpc.getDoHoldingMethod) == null) {
          PaymentServiceGrpc.getDoHoldingMethod = getDoHoldingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest, com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doHolding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("doHolding"))
              .build();
        }
      }
    }
    return getDoHoldingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
      com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> getExtendHoldingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "extendHolding",
      requestType = com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest.class,
      responseType = com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
      com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> getExtendHoldingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest, com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> getExtendHoldingMethod;
    if ((getExtendHoldingMethod = PaymentServiceGrpc.getExtendHoldingMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getExtendHoldingMethod = PaymentServiceGrpc.getExtendHoldingMethod) == null) {
          PaymentServiceGrpc.getExtendHoldingMethod = getExtendHoldingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest, com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "extendHolding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("extendHolding"))
              .build();
        }
      }
    }
    return getExtendHoldingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
      com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response> getClearHoldingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "clearHolding",
      requestType = com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest.class,
      responseType = com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
      com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response> getClearHoldingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest, com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response> getClearHoldingMethod;
    if ((getClearHoldingMethod = PaymentServiceGrpc.getClearHoldingMethod) == null) {
      synchronized (PaymentServiceGrpc.class) {
        if ((getClearHoldingMethod = PaymentServiceGrpc.getClearHoldingMethod) == null) {
          PaymentServiceGrpc.getClearHoldingMethod = getClearHoldingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest, com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "clearHolding"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response.getDefaultInstance()))
              .setSchemaDescriptor(new PaymentServiceMethodDescriptorSupplier("clearHolding"))
              .build();
        }
      }
    }
    return getClearHoldingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static PaymentServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceStub>() {
        @java.lang.Override
        public PaymentServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceStub(channel, callOptions);
        }
      };
    return PaymentServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static PaymentServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceBlockingStub>() {
        @java.lang.Override
        public PaymentServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceBlockingStub(channel, callOptions);
        }
      };
    return PaymentServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static PaymentServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<PaymentServiceFutureStub>() {
        @java.lang.Override
        public PaymentServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new PaymentServiceFutureStub(channel, callOptions);
        }
      };
    return PaymentServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class PaymentServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void doPayment(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoPaymentMethod(), responseObserver);
    }

    /**
     */
    public void doHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoHoldingMethod(), responseObserver);
    }

    /**
     */
    public void extendHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getExtendHoldingMethod(), responseObserver);
    }

    /**
     */
    public void clearHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getClearHoldingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoPaymentMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest,
                com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse>(
                  this, METHODID_DO_PAYMENT)))
          .addMethod(
            getDoHoldingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
                com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse>(
                  this, METHODID_DO_HOLDING)))
          .addMethod(
            getExtendHoldingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
                com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse>(
                  this, METHODID_EXTEND_HOLDING)))
          .addMethod(
            getClearHoldingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest,
                com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response>(
                  this, METHODID_CLEAR_HOLDING)))
          .build();
    }
  }

  /**
   */
  public static final class PaymentServiceStub extends io.grpc.stub.AbstractAsyncStub<PaymentServiceStub> {
    private PaymentServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceStub(channel, callOptions);
    }

    /**
     */
    public void doPayment(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoPaymentMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoHoldingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void extendHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getExtendHoldingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void clearHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getClearHoldingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class PaymentServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<PaymentServiceBlockingStub> {
    private PaymentServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse doPayment(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoPaymentMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse doHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoHoldingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse extendHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getExtendHoldingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response clearHolding(com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getClearHoldingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class PaymentServiceFutureStub extends io.grpc.stub.AbstractFutureStub<PaymentServiceFutureStub> {
    private PaymentServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected PaymentServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new PaymentServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse> doPayment(
        com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoPaymentMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> doHolding(
        com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoHoldingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse> extendHolding(
        com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getExtendHoldingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response> clearHolding(
        com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getClearHoldingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_PAYMENT = 0;
  private static final int METHODID_DO_HOLDING = 1;
  private static final int METHODID_EXTEND_HOLDING = 2;
  private static final int METHODID_CLEAR_HOLDING = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final PaymentServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(PaymentServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_PAYMENT:
          serviceImpl.doPayment((com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.TransactionResponse>) responseObserver);
          break;
        case METHODID_DO_HOLDING:
          serviceImpl.doHolding((com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse>) responseObserver);
          break;
        case METHODID_EXTEND_HOLDING:
          serviceImpl.extendHolding((com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingResponse>) responseObserver);
          break;
        case METHODID_CLEAR_HOLDING:
          serviceImpl.clearHolding((com.choulatte.scentpay.grpc.PaymentServiceOuterClass.HoldingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.scentpay.grpc.PaymentServiceOuterClass.Response>) responseObserver);
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

  private static abstract class PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    PaymentServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.choulatte.scentpay.grpc.PaymentServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("PaymentService");
    }
  }

  private static final class PaymentServiceFileDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier {
    PaymentServiceFileDescriptorSupplier() {}
  }

  private static final class PaymentServiceMethodDescriptorSupplier
      extends PaymentServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    PaymentServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (PaymentServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new PaymentServiceFileDescriptorSupplier())
              .addMethod(getDoPaymentMethod())
              .addMethod(getDoHoldingMethod())
              .addMethod(getExtendHoldingMethod())
              .addMethod(getClearHoldingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
