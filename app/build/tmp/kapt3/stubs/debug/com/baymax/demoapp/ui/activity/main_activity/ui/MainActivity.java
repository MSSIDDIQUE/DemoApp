package com.baymax.demoapp.ui.activity.main_activity.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0010\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001d\u001a\u00020\u001e2\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013\u00a8\u0006\""}, d2 = {"Lcom/baymax/demoapp/ui/activity/main_activity/ui/MainActivity;", "Ldagger/android/support/DaggerAppCompatActivity;", "()V", "_binding", "Lcom/baymax/demoapp/databinding/ActivityMainBinding;", "binding", "getBinding", "()Lcom/baymax/demoapp/databinding/ActivityMainBinding;", "holdingsListAdapter", "Lcom/baymax/demoapp/ui/activity/main_activity/ui/HoldingsListAdapter;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "viewModel", "Lcom/baymax/demoapp/ui/activity/main_activity/ui/MainActivityViewModel;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "setHoldingsPageState", "state", "Lcom/baymax/demoapp/ui/activity/main_activity/ui/HoldingsPageViewState;", "setupObservers", "Lkotlinx/coroutines/Job;", "setupRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "list", "", "Lcom/baymax/demoapp/api/domain_model/HoldingDM;", "app_debug"})
public final class MainActivity extends dagger.android.support.DaggerAppCompatActivity {
    private com.baymax.demoapp.databinding.ActivityMainBinding _binding;
    private com.baymax.demoapp.ui.activity.main_activity.ui.HoldingsListAdapter holdingsListAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    private com.baymax.demoapp.ui.activity.main_activity.ui.MainActivityViewModel viewModel;
    
    public MainActivity() {
        super();
    }
    
    private final com.baymax.demoapp.databinding.ActivityMainBinding getBinding() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final kotlinx.coroutines.Job setupObservers() {
        return null;
    }
    
    private final com.baymax.demoapp.databinding.ActivityMainBinding setHoldingsPageState(com.baymax.demoapp.ui.activity.main_activity.ui.HoldingsPageViewState state) {
        return null;
    }
    
    private final androidx.recyclerview.widget.RecyclerView setupRecyclerView(java.util.List<com.baymax.demoapp.api.domain_model.HoldingDM> list) {
        return null;
    }
}