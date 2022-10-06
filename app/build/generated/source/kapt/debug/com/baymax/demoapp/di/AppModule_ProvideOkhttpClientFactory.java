// Generated by Dagger (https://dagger.dev).
package com.baymax.demoapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideOkhttpClientFactory implements Factory<OkHttpClient> {
  private final AppModule module;

  private final Provider<HttpLoggingInterceptor> loggingInterceptorProvider;

  public AppModule_ProvideOkhttpClientFactory(AppModule module,
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    this.module = module;
    this.loggingInterceptorProvider = loggingInterceptorProvider;
  }

  @Override
  public OkHttpClient get() {
    return provideOkhttpClient(module, loggingInterceptorProvider.get());
  }

  public static AppModule_ProvideOkhttpClientFactory create(AppModule module,
      Provider<HttpLoggingInterceptor> loggingInterceptorProvider) {
    return new AppModule_ProvideOkhttpClientFactory(module, loggingInterceptorProvider);
  }

  public static OkHttpClient provideOkhttpClient(AppModule instance,
      HttpLoggingInterceptor loggingInterceptor) {
    return Preconditions.checkNotNullFromProvides(instance.provideOkhttpClient(loggingInterceptor));
  }
}
