package com.choulatte.pay.grpc;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.38.0)",
    comments = "Source: AccountService.proto")
public final class AccountServiceGrpc {

  private AccountServiceGrpc() {}

  public static final String SERVICE_NAME = "grpc.AccountService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest,
      com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> getDoUserAccountsPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doUserAccountsPending",
      requestType = com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest.class,
      responseType = com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest,
      com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> getDoUserAccountsPendingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest, com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> getDoUserAccountsPendingMethod;
    if ((getDoUserAccountsPendingMethod = AccountServiceGrpc.getDoUserAccountsPendingMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getDoUserAccountsPendingMethod = AccountServiceGrpc.getDoUserAccountsPendingMethod) == null) {
          AccountServiceGrpc.getDoUserAccountsPendingMethod = getDoUserAccountsPendingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest, com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doUserAccountsPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("doUserAccountsPending"))
              .build();
        }
      }
    }
    return getDoUserAccountsPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest,
      com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> getUndoUserAccountsPendingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "undoUserAccountsPending",
      requestType = com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest.class,
      responseType = com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest,
      com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> getUndoUserAccountsPendingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest, com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> getUndoUserAccountsPendingMethod;
    if ((getUndoUserAccountsPendingMethod = AccountServiceGrpc.getUndoUserAccountsPendingMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getUndoUserAccountsPendingMethod = AccountServiceGrpc.getUndoUserAccountsPendingMethod) == null) {
          AccountServiceGrpc.getUndoUserAccountsPendingMethod = getUndoUserAccountsPendingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest, com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "undoUserAccountsPending"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("undoUserAccountsPending"))
              .build();
        }
      }
    }
    return getUndoUserAccountsPendingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest,
      com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse> getDoUserAccountsInvalidatingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "doUserAccountsInvalidating",
      requestType = com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest.class,
      responseType = com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest,
      com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse> getDoUserAccountsInvalidatingMethod() {
    io.grpc.MethodDescriptor<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest, com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse> getDoUserAccountsInvalidatingMethod;
    if ((getDoUserAccountsInvalidatingMethod = AccountServiceGrpc.getDoUserAccountsInvalidatingMethod) == null) {
      synchronized (AccountServiceGrpc.class) {
        if ((getDoUserAccountsInvalidatingMethod = AccountServiceGrpc.getDoUserAccountsInvalidatingMethod) == null) {
          AccountServiceGrpc.getDoUserAccountsInvalidatingMethod = getDoUserAccountsInvalidatingMethod =
              io.grpc.MethodDescriptor.<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest, com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "doUserAccountsInvalidating"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new AccountServiceMethodDescriptorSupplier("doUserAccountsInvalidating"))
              .build();
        }
      }
    }
    return getDoUserAccountsInvalidatingMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static AccountServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceStub>() {
        @java.lang.Override
        public AccountServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceStub(channel, callOptions);
        }
      };
    return AccountServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static AccountServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceBlockingStub>() {
        @java.lang.Override
        public AccountServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceBlockingStub(channel, callOptions);
        }
      };
    return AccountServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static AccountServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<AccountServiceFutureStub>() {
        @java.lang.Override
        public AccountServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new AccountServiceFutureStub(channel, callOptions);
        }
      };
    return AccountServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class AccountServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void doUserAccountsPending(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoUserAccountsPendingMethod(), responseObserver);
    }

    /**
     */
    public void undoUserAccountsPending(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUndoUserAccountsPendingMethod(), responseObserver);
    }

    /**
     */
    public void doUserAccountsInvalidating(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDoUserAccountsInvalidatingMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getDoUserAccountsPendingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest,
                com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse>(
                  this, METHODID_DO_USER_ACCOUNTS_PENDING)))
          .addMethod(
            getUndoUserAccountsPendingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest,
                com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse>(
                  this, METHODID_UNDO_USER_ACCOUNTS_PENDING)))
          .addMethod(
            getDoUserAccountsInvalidatingMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest,
                com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse>(
                  this, METHODID_DO_USER_ACCOUNTS_INVALIDATING)))
          .build();
    }
  }

  /**
   */
  public static final class AccountServiceStub extends io.grpc.stub.AbstractAsyncStub<AccountServiceStub> {
    private AccountServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceStub(channel, callOptions);
    }

    /**
     */
    public void doUserAccountsPending(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoUserAccountsPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void undoUserAccountsPending(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUndoUserAccountsPendingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void doUserAccountsInvalidating(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest request,
        io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDoUserAccountsInvalidatingMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class AccountServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<AccountServiceBlockingStub> {
    private AccountServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse doUserAccountsPending(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoUserAccountsPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse undoUserAccountsPending(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUndoUserAccountsPendingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse doUserAccountsInvalidating(com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDoUserAccountsInvalidatingMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class AccountServiceFutureStub extends io.grpc.stub.AbstractFutureStub<AccountServiceFutureStub> {
    private AccountServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected AccountServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new AccountServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> doUserAccountsPending(
        com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoUserAccountsPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse> undoUserAccountsPending(
        com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUndoUserAccountsPendingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse> doUserAccountsInvalidating(
        com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDoUserAccountsInvalidatingMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_DO_USER_ACCOUNTS_PENDING = 0;
  private static final int METHODID_UNDO_USER_ACCOUNTS_PENDING = 1;
  private static final int METHODID_DO_USER_ACCOUNTS_INVALIDATING = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AccountServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(AccountServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_DO_USER_ACCOUNTS_PENDING:
          serviceImpl.doUserAccountsPending((com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse>) responseObserver);
          break;
        case METHODID_UNDO_USER_ACCOUNTS_PENDING:
          serviceImpl.undoUserAccountsPending((com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsPendingResponse>) responseObserver);
          break;
        case METHODID_DO_USER_ACCOUNTS_INVALIDATING:
          serviceImpl.doUserAccountsInvalidating((com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingRequest) request,
              (io.grpc.stub.StreamObserver<com.choulatte.pay.grpc.AccountServiceOuterClass.AccountsInvalidatingResponse>) responseObserver);
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

  private static abstract class AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    AccountServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.choulatte.pay.grpc.AccountServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("AccountService");
    }
  }

  private static final class AccountServiceFileDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier {
    AccountServiceFileDescriptorSupplier() {}
  }

  private static final class AccountServiceMethodDescriptorSupplier
      extends AccountServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    AccountServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (AccountServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new AccountServiceFileDescriptorSupplier())
              .addMethod(getDoUserAccountsPendingMethod())
              .addMethod(getUndoUserAccountsPendingMethod())
              .addMethod(getDoUserAccountsInvalidatingMethod())
              .build();
        }
      }
    }
    return result;
  }
}
