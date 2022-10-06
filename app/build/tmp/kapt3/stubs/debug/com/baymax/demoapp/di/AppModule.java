package com.baymax.demoapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J1\u0010\t\u001a\u0002H\n\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0002\u00a2\u0006\u0002\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0007J\b\u0010\u0013\u001a\u00020\bH\u0007J\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0017H\u0007J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0015H\u0007J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001bH\u0007\u00a8\u0006 "}, d2 = {"Lcom/baymax/demoapp/di/AppModule;", "", "()V", "createRetrofit", "Lretrofit2/Retrofit;", "client", "Lokhttp3/OkHttpClient;", "converterFactory", "Lretrofit2/converter/gson/GsonConverterFactory;", "provideApiServices", "T", "okHttpClient", "clazz", "Ljava/lang/Class;", "(Lokhttp3/OkHttpClient;Lretrofit2/converter/gson/GsonConverterFactory;Ljava/lang/Class;)Ljava/lang/Object;", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideConvertorFactory", "provideGithubApiServices", "Lcom/baymax/demoapp/api/ApiService;", "provideLoggingInterceptor", "Lokhttp3/logging/HttpLoggingInterceptor;", "provideOkhttpClient", "loggingInterceptor", "provideRemoteDataSource", "Lcom/baymax/demoapp/ui/activity/main_activity/data/RemoteDataSource;", "apiService", "provideRepository", "Lcom/baymax/demoapp/ui/activity/main_activity/data/Repository;", "remoteDataSource", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    public AppModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final retrofit2.converter.gson.GsonConverterFactory provideConvertorFactory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.logging.HttpLoggingInterceptor provideLoggingInterceptor() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final okhttp3.OkHttpClient provideOkhttpClient(@org.jetbrains.annotations.NotNull()
    okhttp3.logging.HttpLoggingInterceptor loggingInterceptor) {
        return null;
    }
    
    private final retrofit2.Retrofit createRetrofit(okhttp3.OkHttpClient client, retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    private final <T extends java.lang.Object>T provideApiServices(okhttp3.OkHttpClient okHttpClient, retrofit2.converter.gson.GsonConverterFactory converterFactory, java.lang.Class<T> clazz) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.baymax.demoapp.api.ApiService provideGithubApiServices(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient okHttpClient, @org.jetbrains.annotations.NotNull()
    retrofit2.converter.gson.GsonConverterFactory converterFactory) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.baymax.demoapp.ui.activity.main_activity.data.RemoteDataSource provideRemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.baymax.demoapp.api.ApiService apiService) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    @javax.inject.Singleton()
    public final com.baymax.demoapp.ui.activity.main_activity.data.Repository provideRepository(@org.jetbrains.annotations.NotNull()
    com.baymax.demoapp.ui.activity.main_activity.data.RemoteDataSource remoteDataSource) {
        return null;
    }
}