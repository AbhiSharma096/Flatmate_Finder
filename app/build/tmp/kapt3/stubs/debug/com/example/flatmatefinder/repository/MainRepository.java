package com.example.flatmatefinder.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0011\u0010\u001a\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0011\u0010\u001c\u001a\u00020\u0015H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u0019\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/example/flatmatefinder/repository/MainRepository;", "", "mainAPI", "Lcom/example/flatmatefinder/api/MainAPI;", "(Lcom/example/flatmatefinder/api/MainAPI;)V", "_getFlatMatesMutableLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/flatmatefinder/Utils/NetworkResult;", "Lcom/example/flatmatefinder/models/FlatCardInfo;", "_getFlatsMutableLiveData", "_statusLiveData", "", "getFlatLiveData", "Landroidx/lifecycle/LiveData;", "getGetFlatLiveData", "()Landroidx/lifecycle/LiveData;", "getFlatMateLiveData", "getGetFlatMateLiveData", "statusLiveData", "getStatusLiveData", "dislike_Flat", "", "likeDislike", "Lcom/example/flatmatefinder/models/Like_Dislike;", "(Lcom/example/flatmatefinder/models/Like_Dislike;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dislike_Flatmate", "getFlatMates", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlats", "like", "app_debug"})
public final class MainRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.api.MainAPI mainAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatCardInfo>> _getFlatsMutableLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatCardInfo>> _getFlatMatesMutableLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<java.lang.String>> _statusLiveData = null;
    
    @javax.inject.Inject
    public MainRepository(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.api.MainAPI mainAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatCardInfo>> getGetFlatLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatCardInfo>> getGetFlatMateLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<java.lang.String>> getStatusLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFlats(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getFlatMates(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object dislike_Flat(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object like(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object dislike_Flatmate(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}