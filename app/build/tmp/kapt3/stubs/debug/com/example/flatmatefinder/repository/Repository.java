package com.example.flatmatefinder.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0015\u001a\u00020\u00162\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u0018H\u0002J\u0019\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ\u0019\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\u0019\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020#H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010%\u001a\u00020\u00162\u0006\u0010&\u001a\u00020\'H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010(R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006)"}, d2 = {"Lcom/example/flatmatefinder/repository/Repository;", "", "api", "Lcom/example/flatmatefinder/api/API;", "(Lcom/example/flatmatefinder/api/API;)V", "_loginResponseLivedata", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/flatmatefinder/Utils/NetworkResult;", "Lcom/example/flatmatefinder/models/LoginResponse;", "_otpResponseLivedata", "Lcom/example/flatmatefinder/models/OTPResponse;", "_signUpResponseLivedata", "Lcom/example/flatmatefinder/models/SignUpResponse;", "loginResponseLiveData", "Landroidx/lifecycle/LiveData;", "getLoginResponseLiveData", "()Landroidx/lifecycle/LiveData;", "otpResponseLiveData", "getOtpResponseLiveData", "signUpRequestLiveData", "getSignUpRequestLiveData", "handleResponse", "", "response", "Lretrofit2/Response;", "loginUser", "loginRequest", "Lcom/example/flatmatefinder/models/LoginRequest;", "(Lcom/example/flatmatefinder/models/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOTP", "otpRequest", "Lcom/example/flatmatefinder/models/OTPRequest;", "(Lcom/example/flatmatefinder/models/OTPRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUpUser", "signUpRequest", "Lcom/example/flatmatefinder/models/SignUpRequest;", "(Lcom/example/flatmatefinder/models/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOTP", "verifyOTPRequest", "Lcom/example/flatmatefinder/models/VerifyOTPRequest;", "(Lcom/example/flatmatefinder/models/VerifyOTPRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class Repository {
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.api.API api = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.LoginResponse>> _loginResponseLivedata = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.OTPResponse>> _otpResponseLivedata = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.SignUpResponse>> _signUpResponseLivedata = null;
    
    @javax.inject.Inject
    public Repository(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.api.API api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.LoginResponse>> getLoginResponseLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.OTPResponse>> getOtpResponseLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.SignUpResponse>> getSignUpRequestLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loginUser(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object sendOTP(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.OTPRequest otpRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object verifyOTP(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.VerifyOTPRequest verifyOTPRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object signUpUser(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.SignUpRequest signUpRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    private final void handleResponse(retrofit2.Response<com.example.flatmatefinder.models.LoginResponse> response) {
    }
}