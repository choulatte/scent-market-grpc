package com.choulatte.scentproduct.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: ProductService.proto")
public final class ProductServiceGrpc {

  private ProductServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.ProductService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest,
      com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> getDoUserProductsPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doUserProductsPending",
      requestType = com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest.class,
      responseType = com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest,
      com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> getDoUserProductsPendingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest, com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> getDoUserProductsPendingMethod;
    if ((getDoUserProductsPendingMethod = ProductServiceGrpc.getDoUserProductsPendingMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDoUserProductsPendingMethod = ProductServiceGrpc.getDoUserProductsPendingMethod) == null) {
          ProductServiceGrpc.getDoUserProductsPendingMethod = getDoUserProductsPendingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest, com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doUserProductsPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("doUserProductsPending"))
              .build();
        }
      }
    }
    return getDoUserProductsPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest,
      com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> getUndoUserProductsPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "undoUserProductsPending",
      requestType = com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest.class,
      responseType = com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest,
      com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> getUndoUserProductsPendingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest, com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> getUndoUserProductsPendingMethod;
    if ((getUndoUserProductsPendingMethod = ProductServiceGrpc.getUndoUserProductsPendingMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getUndoUserProductsPendingMethod = ProductServiceGrpc.getUndoUserProductsPendingMethod) == null) {
          ProductServiceGrpc.getUndoUserProductsPendingMethod = getUndoUserProductsPendingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest, com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "undoUserProductsPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("undoUserProductsPending"))
              .build();
        }
      }
    }
    return getUndoUserProductsPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest,
      com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse> getDoUserProductsInvalidatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doUserProductsInvalidating",
      requestType = com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest.class,
      responseType = com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest,
      com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse> getDoUserProductsInvalidatingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest, com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse> getDoUserProductsInvalidatingMethod;
    if ((getDoUserProductsInvalidatingMethod = ProductServiceGrpc.getDoUserProductsInvalidatingMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getDoUserProductsInvalidatingMethod = ProductServiceGrpc.getDoUserProductsInvalidatingMethod) == null) {
          ProductServiceGrpc.getDoUserProductsInvalidatingMethod = getDoUserProductsInvalidatingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest, com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doUserProductsInvalidating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("doUserProductsInvalidating"))
              .build();
        }
      }
    }
    return getDoUserProductsInvalidatingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest,
      com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse> getGetProductDetailMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getProductDetail",
      requestType = com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest.class,
      responseType = com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest,
      com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse> getGetProductDetailMethod() {
    io.grpc.MethodDescriptor<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest, com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse> getGetProductDetailMethod;
    if ((getGetProductDetailMethod = ProductServiceGrpc.getGetProductDetailMethod) == null) {
      synchronized (ProductServiceGrpc.class) {
        if ((getGetProductDetailMethod = ProductServiceGrpc.getGetProductDetailMethod) == null) {
          ProductServiceGrpc.getGetProductDetailMethod = getGetProductDetailMethod =
              io.grpc.MethodDescriptor.<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest, com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getProductDetail"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ProductServiceMethodDescriptorSupplier("getProductDetail"))
              .build();
        }
      }
    }
    return getGetProductDetailMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ProductServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceStub>() {
        @java.lang.Override
        public ProductServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceStub(channel, callOptions);
        }
      };
    return ProductServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ProductServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceBlockingStub>() {
        @java.lang.Override
        public ProductServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceBlockingStub(channel, callOptions);
        }
      };
    return ProductServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ProductServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ProductServiceFutureStub>() {
        @java.lang.Override
        public ProductServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ProductServiceFutureStub(channel, callOptions);
        }
      };
    return ProductServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class ProductServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void doUserProductsPending(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoUserProductsPendingMethod(), responseObserver);
    }

    /**
     */
    public void undoUserProductsPending(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndoUserProductsPendingMethod(), responseObserver);
    }

    /**
     */
    public void doUserProductsInvalidating(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoUserProductsInvalidatingMethod(), responseObserver);
    }

    /**
     */
    public void getProductDetail(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetProductDetailMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoUserProductsPendingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest,
                com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse>(
                  this, METHODID_DO_USER_PRODUCTS_PENDING)))
          .addMethod(
            getUndoUserProductsPendingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest,
                com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse>(
                  this, METHODID_UNDO_USER_PRODUCTS_PENDING)))
          .addMethod(
            getDoUserProductsInvalidatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest,
                com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse>(
                  this, METHODID_DO_USER_PRODUCTS_INVALIDATING)))
          .addMethod(
            getGetProductDetailMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest,
                com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse>(
                  this, METHODID_GET_PRODUCT_DETAIL)))
          .build();
    }
  }

  /**
   */
  public static final class ProductServiceStub extends io.grpc.stub.AbstractAsyncStub<ProductServiceStub> {
    private ProductServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceStub(channel, callOptions);
    }

    /**
     */
    public void doUserProductsPending(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoUserProductsPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void undoUserProductsPending(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndoUserProductsPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doUserProductsInvalidating(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoUserProductsInvalidatingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getProductDetail(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetProductDetailMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ProductServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<ProductServiceBlockingStub> {
    private ProductServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse doUserProductsPending(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoUserProductsPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse undoUserProductsPending(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndoUserProductsPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse doUserProductsInvalidating(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoUserProductsInvalidatingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse getProductDetail(com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetProductDetailMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ProductServiceFutureStub extends io.grpc.stub.AbstractFutureStub<ProductServiceFutureStub> {
    private ProductServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ProductServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ProductServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> doUserProductsPending(
        com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoUserProductsPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse> undoUserProductsPending(
        com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndoUserProductsPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse> doUserProductsInvalidating(
        com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoUserProductsInvalidatingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse> getProductDetail(
        com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetProductDetailMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_USER_PRODUCTS_PENDING = 0;
  private static final int METHODID_UNDO_USER_PRODUCTS_PENDING = 1;
  private static final int METHODID_DO_USER_PRODUCTS_INVALIDATING = 2;
  private static final int METHODID_GET_PRODUCT_DETAIL = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ProductServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ProductServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_USER_PRODUCTS_PENDING:
          serviceImpl.doUserProductsPending((com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse>) responseObserver);
          break;
        case METHODID_UNDO_USER_PRODUCTS_PENDING:
          serviceImpl.undoUserProductsPending((com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsPendingResponse>) responseObserver);
          break;
        case METHODID_DO_USER_PRODUCTS_INVALIDATING:
          serviceImpl.doUserProductsInvalidating((com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductsInvalidatingResponse>) responseObserver);
          break;
        case METHODID_GET_PRODUCT_DETAIL:
          serviceImpl.getProductDetail((com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.scentproduct.grpc.ProductServiceOuterClass.ProductDetailResponse>) responseObserver);
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

  private static abstract class ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ProductServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.choulatte.scentproduct.grpc.ProductServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ProductService");
    }
  }

  private static final class ProductServiceFileDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier {
    ProductServiceFileDescriptorSupplier() {}
  }

  private static final class ProductServiceMethodDescriptorSupplier
      extends ProductServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ProductServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (ProductServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ProductServiceFileDescriptorSupplier())
              .addMethod(getDoUserProductsPendingMethod())
              .addMethod(getUndoUserProductsPendingMethod())
              .addMethod(getDoUserProductsInvalidatingMethod())
              .addMethod(getGetProductDetailMethod())
              .build();
        }
      }
    }
    return result;
  }
}
