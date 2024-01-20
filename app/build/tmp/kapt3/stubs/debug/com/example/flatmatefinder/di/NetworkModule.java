package com.example.flatmatefinder.di;

@dagger.Module
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u0010\u001a\u00020\u0006H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/example/flatmatefinder/di/NetworkModule;", "", "()V", "provideMainAPI", "Lcom/example/flatmatefinder/api/MainAPI;", "retrofitBuilder", "Lretrofit2/Retrofit$Builder;", "okHttpClient", "Lokhttp3/OkHttpClient;", "providesAPI", "Lcom/example/flatmatefinder/api/API;", "providesOkHTTPClient", "authInterceptor", "Lcom/example/flatmatefinder/api/AuthInterceptor;", "providesOnboardingAPI", "Lcom/example/flatmatefinder/api/OnboardingAPI;", "providesRetrofitBuilder", "app_debug"})
@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
public final class NetworkModule {
    
    public NetworkModule() {
        super();
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final retrofit2.Retrofit.Builder providesRetrofitBuilder() {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final okhttp3.OkHttpClient providesOkHTTPClient(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.api.AuthInterceptor authInterceptor) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.api.OnboardingAPI providesOnboardingAPI(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit.Builder retrofitBuilder, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.api.API providesAPI(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit.Builder retrofitBuilder) {
        return null;
    }
    
    @javax.inject.Singleton
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.api.MainAPI provideMainAPI(@org.jetbrains.annotations.NotNull
    retrofit2.Retrofit.Builder retrofitBuilder, @org.jetbrains.annotations.NotNull
    okhttp3.OkHttpClient okHttpClient) {
        return null;
    }
}