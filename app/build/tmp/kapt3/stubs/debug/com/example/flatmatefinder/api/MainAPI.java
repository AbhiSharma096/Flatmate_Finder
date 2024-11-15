package com.example.flatmatefinder.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/flatmatefinder/api/MainAPI;", "", "addDislikeFlatmates", "Lretrofit2/Response;", "", "likeDislike", "Lcom/example/flatmatefinder/models/Like_Dislike;", "(Lcom/example/flatmatefinder/models/Like_Dislike;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "addLike", "dislikeFlats", "getFlat", "Lcom/example/flatmatefinder/models/FlatCardInfo;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFlatmates", "app_debug"})
public abstract interface MainAPI {
    
    @retrofit2.http.GET(value = "/flats")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFlat(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.flatmatefinder.models.FlatCardInfo>> $completion);
    
    @retrofit2.http.GET(value = "/flatmates")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getFlatmates(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.example.flatmatefinder.models.FlatCardInfo>> $completion);
    
    @retrofit2.http.POST(value = "/add-like")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addLike(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> $completion);
    
    @retrofit2.http.POST(value = "/dislike-flats")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object dislikeFlats(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> $completion);
    
    @retrofit2.http.POST(value = "/dislike-flatmates")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object addDislikeFlatmates(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.lang.String>> $completion);
}