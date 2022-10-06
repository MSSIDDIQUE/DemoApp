package com.baymax.demoapp.ui.activity.main_activity.ui;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/baymax/demoapp/ui/activity/main_activity/ui/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/baymax/demoapp/ui/activity/main_activity/data/Repository;", "(Lcom/baymax/demoapp/ui/activity/main_activity/data/Repository;)V", "_mutableHoldingsPageViewState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/baymax/demoapp/ui/activity/main_activity/ui/HoldingsPageViewState;", "holdingsPageViewState", "getHoldingsPageViewState", "()Lkotlinx/coroutines/flow/MutableStateFlow;", "fetchHoldingsState", "Lkotlinx/coroutines/Job;", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    private final com.baymax.demoapp.ui.activity.main_activity.data.Repository repo = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.baymax.demoapp.ui.activity.main_activity.ui.HoldingsPageViewState> _mutableHoldingsPageViewState = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.MutableStateFlow<com.baymax.demoapp.ui.activity.main_activity.ui.HoldingsPageViewState> holdingsPageViewState = null;
    
    @javax.inject.Inject()
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull()
    com.baymax.demoapp.ui.activity.main_activity.data.Repository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.MutableStateFlow<com.baymax.demoapp.ui.activity.main_activity.ui.HoldingsPageViewState> getHoldingsPageViewState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job fetchHoldingsState() {
        return null;
    }
}