package com.baymax.demoapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0002H&\u00a8\u0006\u0007"}, d2 = {"Lcom/baymax/demoapp/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lcom/baymax/demoapp/App;", "inject", "", "application", "Builder", "app_debug"})
@javax.inject.Singleton()
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.baymax.demoapp.di.AppModule.class, com.baymax.demoapp.di.ViewModelModule.class, com.baymax.demoapp.di.ActivityBuildersModule.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<com.baymax.demoapp.App> {
    
    @java.lang.Override()
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.baymax.demoapp.App application);
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/baymax/demoapp/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lcom/baymax/demoapp/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.baymax.demoapp.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.baymax.demoapp.di.AppComponent build();
    }
}