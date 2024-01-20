package com.example.flatmatefinder.viewModels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0011J\u0006\u0010\u0016\u001a\u00020\u0011J\u000e\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n\u00a8\u0006\u0018"}, d2 = {"Lcom/example/flatmatefinder/viewModels/MainViewModel;", "Landroidx/lifecycle/ViewModel;", "mainRepository", "Lcom/example/flatmatefinder/repository/MainRepository;", "(Lcom/example/flatmatefinder/repository/MainRepository;)V", "getFlatMatesLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/flatmatefinder/Utils/NetworkResult;", "Lcom/example/flatmatefinder/models/FlatCardInfo;", "getGetFlatMatesLiveData", "()Landroidx/lifecycle/LiveData;", "getFlatsLiveData", "getGetFlatsLiveData", "statusLiveData", "", "getStatusLiveData", "dislike_Flat", "", "likeDislike", "Lcom/example/flatmatefinder/models/Like_Dislike;", "dislike_Flatmate", "getFlatmates", "getFlats", "like", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class MainViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.repository.MainRepository mainRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatCardInfo>> getFlatsLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatCardInfo>> getFlatMatesLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<java.lang.String>> statusLiveData = null;
    
    @javax.inject.Inject
    public MainViewModel(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.repository.MainRepository mainRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatCardInfo>> getGetFlatsLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatCardInfo>> getGetFlatMatesLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<java.lang.String>> getStatusLiveData() {
        return null;
    }
    
    public final void getFlats() {
    }
    
    public final void getFlatmates() {
    }
    
    public final void like(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike) {
    }
    
    public final void dislike_Flatmate(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike) {
    }
    
    public final void dislike_Flat(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.Like_Dislike likeDislike) {
    }
}