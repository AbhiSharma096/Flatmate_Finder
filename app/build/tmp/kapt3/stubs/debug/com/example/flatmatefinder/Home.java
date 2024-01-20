package com.example.flatmatefinder;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0019H\u0016J\u001a\u0010$\u001a\u00020\u00192\u0006\u0010%\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"}, d2 = {"Lcom/example/flatmatefinder/Home;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/example/flatmatefinder/databinding/FragmentHomeBinding;", "binding", "getBinding", "()Lcom/example/flatmatefinder/databinding/FragmentHomeBinding;", "flatCardInfo", "Lcom/example/flatmatefinder/models/FlatCardInfo;", "mainAPI", "Lcom/example/flatmatefinder/api/MainAPI;", "getMainAPI", "()Lcom/example/flatmatefinder/api/MainAPI;", "setMainAPI", "(Lcom/example/flatmatefinder/api/MainAPI;)V", "mainViewModel", "Lcom/example/flatmatefinder/viewModels/MainViewModel;", "getMainViewModel", "()Lcom/example/flatmatefinder/viewModels/MainViewModel;", "mainViewModel$delegate", "Lkotlin/Lazy;", "manager", "Lcom/yuyakaido/android/cardstackview/CardStackLayoutManager;", "bindObservers", "", "init", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onViewCreated", "view", "app_debug"})
public final class Home extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.Nullable
    private com.example.flatmatefinder.databinding.FragmentHomeBinding _binding;
    @javax.inject.Inject
    public com.example.flatmatefinder.api.MainAPI mainAPI;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy mainViewModel$delegate = null;
    private com.yuyakaido.android.cardstackview.CardStackLayoutManager manager;
    @org.jetbrains.annotations.Nullable
    private com.example.flatmatefinder.models.FlatCardInfo flatCardInfo;
    
    public Home() {
        super();
    }
    
    private final com.example.flatmatefinder.databinding.FragmentHomeBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.flatmatefinder.api.MainAPI getMainAPI() {
        return null;
    }
    
    public final void setMainAPI(@org.jetbrains.annotations.NotNull
    com.example.flatmatefinder.api.MainAPI p0) {
    }
    
    private final com.example.flatmatefinder.viewModels.MainViewModel getMainViewModel() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    private final void init() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void bindObservers() {
    }
    
    @java.lang.Override
    public void onDestroyView() {
    }
}