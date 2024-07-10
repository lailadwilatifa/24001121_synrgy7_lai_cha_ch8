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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<UserDataStoreManager> prefProvider;

  public LoginViewModel_Factory(Provider<UserDataStoreManager> prefProvider) {
    this.prefProvider = prefProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(prefProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<UserDataStoreManager> prefProvider) {
    return new LoginViewModel_Factory(prefProvider);
  }

  public static LoginViewModel newInstance(UserDataStoreManager pref) {
    return new LoginViewModel(pref);
  }
}