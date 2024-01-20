package com.example.flatmatefinder.viewModels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u000e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u001aJ\"\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e0\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u001eJ\u000e\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020#R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\n\u00a8\u0006$"}, d2 = {"Lcom/example/flatmatefinder/viewModels/AuthViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/flatmatefinder/repository/Repository;", "(Lcom/example/flatmatefinder/repository/Repository;)V", "loginResponseLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/flatmatefinder/Utils/NetworkResult;", "Lcom/example/flatmatefinder/models/LoginResponse;", "getLoginResponseLiveData", "()Landroidx/lifecycle/LiveData;", "otpResponseLiveData", "Lcom/example/flatmatefinder/models/OTPResponse;", "getOtpResponseLiveData", "signUpRequestLiveData", "Lcom/example/flatmatefinder/models/SignUpResponse;", "getSignUpRequestLiveData", "loginUser", "", "loginRequest", "Lcom/example/flatmatefinder/models/LoginRequest;", "sendOTP", "otpRequest", "Lcom/example/flatmatefinder/models/OTPRequest;", "signUpUser", "signUpRequest", "Lcom/example/flatmatefinder/models/SignUpRequest;", "validateCredentials", "Lkotlin/Pair;", "", "", "email", "password", "verifyOTP", "verifyOTPRequest", "Lcom/example/flatmatefinder/models/VerifyOTPRequest;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class AuthViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.repository.Repository repository = null;
    
    @javax.inject.Inject
    public AuthViewModel(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.repository.Repository repository) {
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
    
    public final void loginUser(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.LoginRequest loginRequest) {
    }
    
    public final void signUpUser(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.SignUpRequest signUpRequest) {
    }
    
    public final void sendOTP(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.OTPRequest otpRequest) {
    }
    
    public final void verifyOTP(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.VerifyOTPRequest verifyOTPRequest) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlin.Pair<java.lang.Boolean, java.lang.String> validateCredentials(@org.jetbrains.annotations.NotNull
    java.lang.String email, @org.jetbrains.annotations.NotNull
    java.lang.String password) {
        return null;
    }
}