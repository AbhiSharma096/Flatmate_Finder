package com.example.flatmatefinder.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010%J\u0019\u0010&\u001a\u00020\"2\u0006\u0010\'\u001a\u00020(H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J\u0019\u0010*\u001a\u00020\"2\u0006\u0010+\u001a\u00020,H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010-J\u0019\u0010.\u001a\u00020\"2\u0006\u0010/\u001a\u000200H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00101J\u0019\u00102\u001a\u00020\"2\u0006\u00103\u001a\u000204H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00105J\u0019\u00106\u001a\u00020\"2\u0006\u00107\u001a\u000208H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u00109J\u0019\u0010:\u001a\u00020\"2\u0006\u0010;\u001a\u00020<H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010=J\u0019\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020@H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010AR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u0018\u0010\u0016R\u001d\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001a\u0010\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001c\u0010\u0016R\u001d\u0010\u001d\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u0016R\u001d\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00148F\u00a2\u0006\u0006\u001a\u0004\b \u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006B"}, d2 = {"Lcom/example/flatmatefinder/repository/OnboardingRepository;", "", "onboardingAPI", "Lcom/example/flatmatefinder/api/OnboardingAPI;", "(Lcom/example/flatmatefinder/api/OnboardingAPI;)V", "_branchYearRequestLivedata", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/flatmatefinder/Utils/NetworkResult;", "Lcom/example/flatmatefinder/models/BranchYearResponse;", "_flatRequestLivedata", "Lcom/example/flatmatefinder/models/FlatResponse;", "_flatStatusRequestLivedata", "Lcom/example/flatmatefinder/models/FlatStatusResponse;", "_storeDOBRequestLivedata", "Lcom/example/flatmatefinder/models/StoreDOBResponse;", "_storeGenderRequestLivedata", "Lcom/example/flatmatefinder/models/GenderResponse;", "_storeNameRequestLivedata", "Lcom/example/flatmatefinder/models/StoreNameResponse;", "branchYearRequestLiveData", "Landroidx/lifecycle/LiveData;", "getBranchYearRequestLiveData", "()Landroidx/lifecycle/LiveData;", "flatRequestLiveData", "getFlatRequestLiveData", "flatStatusRequestLiveData", "getFlatStatusRequestLiveData", "storeDOBRequestLiveData", "getStoreDOBRequestLiveData", "storeGenderRequestLiveData", "getStoreGenderRequestLiveData", "storeNameRequestLiveData", "getStoreNameRequestLiveData", "flatStatus", "", "flatStatusRequest", "Lcom/example/flatmatefinder/models/FlatStatusRequest;", "(Lcom/example/flatmatefinder/models/FlatStatusRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeBranchYear", "branchYearRequest", "Lcom/example/flatmatefinder/models/BranchYearRequest;", "(Lcom/example/flatmatefinder/models/BranchYearRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeDOB", "storeDOBRequest", "Lcom/example/flatmatefinder/models/StoreDOBRequest;", "(Lcom/example/flatmatefinder/models/StoreDOBRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeFlatInfo1", "flatInfoRequest1", "Lcom/example/flatmatefinder/models/FlatInfoRequest1;", "(Lcom/example/flatmatefinder/models/FlatInfoRequest1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeFlatInfo2", "flatInfoRequest2", "Lcom/example/flatmatefinder/models/FlatInfoRequest2;", "(Lcom/example/flatmatefinder/models/FlatInfoRequest2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeGender", "genderRequest", "Lcom/example/flatmatefinder/models/GenderRequest;", "(Lcom/example/flatmatefinder/models/GenderRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeLifestyle", "lifestyleRequest", "Lcom/example/flatmatefinder/models/LifestyleRequest;", "(Lcom/example/flatmatefinder/models/LifestyleRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "storeName", "storeNameRequest", "Lcom/example/flatmatefinder/models/StoreNameRequest;", "(Lcom/example/flatmatefinder/models/StoreNameRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class OnboardingRepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.api.OnboardingAPI onboardingAPI = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.StoreNameResponse>> _storeNameRequestLivedata = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.StoreDOBResponse>> _storeDOBRequestLivedata = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatStatusResponse>> _flatStatusRequestLivedata = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.GenderResponse>> _storeGenderRequestLivedata = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.BranchYearResponse>> _branchYearRequestLivedata = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatResponse>> _flatRequestLivedata = null;
    
    @javax.inject.Inject
    public OnboardingRepository(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.api.OnboardingAPI onboardingAPI) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.StoreNameResponse>> getStoreNameRequestLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.StoreDOBResponse>> getStoreDOBRequestLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatStatusResponse>> getFlatStatusRequestLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.GenderResponse>> getStoreGenderRequestLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.BranchYearResponse>> getBranchYearRequestLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.flatmatefinder.Utils.NetworkResult<com.example.flatmatefinder.models.FlatResponse>> getFlatRequestLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object storeFlatInfo1(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.FlatInfoRequest1 flatInfoRequest1, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object storeLifestyle(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.LifestyleRequest lifestyleRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object storeFlatInfo2(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.FlatInfoRequest2 flatInfoRequest2, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object storeBranchYear(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.BranchYearRequest branchYearRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object storeGender(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.GenderRequest genderRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object flatStatus(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.FlatStatusRequest flatStatusRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object storeDOB(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.StoreDOBRequest storeDOBRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object storeName(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.StoreNameRequest storeNameRequest, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}