// Generated by Dagger (https://dagger.dev).
package com.baymax.demoapp.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import okhttp3.logging.HttpLoggingInterceptor;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class AppModule_ProvideLoggingInterceptorFactory implements Factory<HttpLoggingInterceptor> {
  private final AppModule module;

  public AppModule_ProvideLoggingInterceptorFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public HttpLoggingInterceptor get() {
    return provideLoggingInterceptor(module);
  }

  public static AppModule_ProvideLoggingInterceptorFactory create(AppModule module) {
    return new AppModule_ProvideLoggingInterceptorFactory(module);
  }

  public static HttpLoggingInterceptor provideLoggingInterceptor(AppModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.provideLoggingInterceptor());
  }
}
