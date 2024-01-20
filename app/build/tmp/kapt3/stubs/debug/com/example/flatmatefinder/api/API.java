package com.example.flatmatefinder.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00032\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/flatmatefinder/api/API;", "", "login", "Lretrofit2/Response;", "Lcom/example/flatmatefinder/models/LoginResponse;", "loginRequest", "Lcom/example/flatmatefinder/models/LoginRequest;", "(Lcom/example/flatmatefinder/models/LoginRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendOTP", "Lcom/example/flatmatefinder/models/OTPResponse;", "otpRequest", "Lcom/example/flatmatefinder/models/OTPRequest;", "(Lcom/example/flatmatefinder/models/OTPRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signUp", "Lcom/example/flatmatefinder/models/SignUpResponse;", "signUpRequest", "Lcom/example/flatmatefinder/models/SignUpRequest;", "(Lcom/example/flatmatefinder/models/SignUpRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyOTP", "verifyOTPRequest", "Lcom/example/flatmatefinder/models/VerifyOTPRequest;", "(Lcom/example/flatmatefinder/models/VerifyOTPRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface API {
    
    @retrofit2.http.POST(value = "/login")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object login(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.LoginRequest loginRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.flatmatefinder.models.LoginResponse>> $completion);
    
    @retrofit2.http.POST(value = "/send-otp")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object sendOTP(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.OTPRequest otpRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.flatmatefinder.models.OTPResponse>> $completion);
    
    @retrofit2.http.POST(value = "/verify-otp")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object verifyOTP(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.VerifyOTPRequest verifyOTPRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.flatmatefinder.models.OTPResponse>> $completion);
    
    @retrofit2.http.POST(value = "/signup")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object signUp(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.SignUpRequest signUpRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.flatmatefinder.models.SignUpResponse>> $completion);
}