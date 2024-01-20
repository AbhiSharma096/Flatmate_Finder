package com.example.flatmatefinder.viewModels;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&J\u000e\u0010\'\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u001b2\u0006\u0010+\u001a\u00020,J\u000e\u0010-\u001a\u00020\u001b2\u0006\u0010.\u001a\u00020/J\u000e\u00100\u001a\u00020\u001b2\u0006\u00101\u001a\u000202R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\r\u0010\nR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\nR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\nR\u001d\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u0019\u0010\n\u00a8\u00063"}, d2 = {"Lcom/example/flatmatefinder/viewModels/OnboardingViewModel;", "Landroidx/lifecycle/ViewModel;", "onboardingRepository", "Lcom/example/flatmatefinder/repository/OnboardingRepository;", "(Lcom/example/flatmatefinder/repository/OnboardingRepository;)V", "branchYearRequestLiveData", "Landroidx/lifecycle/LiveData;", "Lcom/example/flatmatefinder/Utils/NetworkResult;", "Lcom/example/flatmatefinder/models/BranchYearResponse;", "getBranchYearRequestLiveData", "()Landroidx/lifecycle/LiveData;", "flatRequestLiveData", "Lcom/example/flatmatefinder/models/FlatResponse;", "getFlatRequestLiveData", "flatStatusRequestLiveData", "Lcom/example/flatmatefinder/models/FlatStatusResponse;", "getFlatStatusRequestLiveData", "storeDOBRequestLiveData", "Lcom/example/flatmatefinder/models/StoreDOBResponse;", "getStoreDOBRequestLiveData", "storeGenderRequestLiveData", "Lcom/example/flatmatefinder/models/GenderResponse;", "getStoreGenderRequestLiveData", "storeNameRequestLiveData", "Lcom/example/flatmatefinder/models/StoreNameResponse;", "getStoreNameRequestLiveData", "flatStatus", "", "flatStatusRequest", "Lcom/example/flatmatefinder/models/FlatStatusRequest;", "storeBranchYear", "branchYearRequest", "Lcom/example/flatmatefinder/models/BranchYearRequest;", "storeDOB", "storeDOBRequest", "Lcom/example/flatmatefinder/models/StoreDOBRequest;", "storeFlatInfo1", "flatInfoRequest1", "Lcom/example/flatmatefinder/models/FlatInfoRequest1;", "storeFlatInfo2", "flatInfoRequest2", "Lcom/example/flatmatefinder/models/FlatInfoRequest2;", "storeGender", "genderRequest", "Lcom/example/flatmatefinder/models/GenderRequest;", "storeLifestyle", "lifestyleRequest", "Lcom/example/flatmatefinder/models/LifestyleRequest;", "storeName", "storeNameRequest", "Lcom/example/flatmatefinder/models/StoreNameRequest;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class OnboardingViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.flatmatefinder.repository.OnboardingRepository onboardingRepository = null;
    
    @javax.inject.Inject
    public OnboardingViewModel(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.repository.OnboardingRepository onboardingRepository) {
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
    
    public final void storeFlatInfo1(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.FlatInfoRequest1 flatInfoRequest1) {
    }
    
    public final void storeFlatInfo2(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.FlatInfoRequest2 flatInfoRequest2) {
    }
    
    public final void storeLifestyle(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.LifestyleRequest lifestyleRequest) {
    }
    
    public final void storeBranchYear(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.BranchYearRequest branchYearRequest) {
    }
    
    public final void storeGender(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.GenderRequest genderRequest) {
    }
    
    public final void flatStatus(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.FlatStatusRequest flatStatusRequest) {
    }
    
    public final void storeName(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.StoreNameRequest storeNameRequest) {
    }
    
    public final void storeDOB(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.models.StoreDOBRequest storeDOBRequest) {
    }
}