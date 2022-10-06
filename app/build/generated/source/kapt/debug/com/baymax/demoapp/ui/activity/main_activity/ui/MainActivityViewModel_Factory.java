// Generated by Dagger (https://dagger.dev).
package com.baymax.demoapp.ui.activity.main_activity.ui;

import com.baymax.demoapp.ui.activity.main_activity.data.Repository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
  private final Provider<Repository> repoProvider;

  public MainActivityViewModel_Factory(Provider<Repository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public MainActivityViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static MainActivityViewModel_Factory create(Provider<Repository> repoProvider) {
    return new MainActivityViewModel_Factory(repoProvider);
  }

  public static MainActivityViewModel newInstance(Repository repo) {
    return new MainActivityViewModel(repo);
  }
}
