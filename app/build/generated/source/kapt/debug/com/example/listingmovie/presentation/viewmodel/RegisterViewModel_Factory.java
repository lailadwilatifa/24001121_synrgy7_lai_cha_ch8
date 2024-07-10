// Generated by Dagger (https://dagger.dev).
package com.example.listingmovie.presentation.viewmodel;

import com.example.data.local.UserDataStoreManager;
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
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class RegisterViewModel_Factory implements Factory<RegisterViewModel> {
  private final Provider<UserDataStoreManager> prefProvider;

  public RegisterViewModel_Factory(Provider<UserDataStoreManager> prefProvider) {
    this.prefProvider = prefProvider;
  }

  @Override
  public RegisterViewModel get() {
    return newInstance(prefProvider.get());
  }

  public static RegisterViewModel_Factory create(Provider<UserDataStoreManager> prefProvider) {
    return new RegisterViewModel_Factory(prefProvider);
  }

  public static RegisterViewModel newInstance(UserDataStoreManager pref) {
    return new RegisterViewModel(pref);
  }
}
