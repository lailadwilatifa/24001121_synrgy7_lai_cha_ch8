package com.example.listingmovie.presentation.viewmodel;

import androidx.lifecycle.ViewModel;
import com.example.data.local.UserDataStoreManager;
import com.example.domain.model.User;
import dagger.hilt.android.lifecycle.HiltViewModel;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/listingmovie/presentation/viewmodel/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "pref", "Lcom/example/data/local/UserDataStoreManager;", "(Lcom/example/data/local/UserDataStoreManager;)V", "saveUser", "", "user", "Lcom/example/domain/model/User;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.data.local.UserDataStoreManager pref = null;
    
    @javax.inject.Inject
    public RegisterViewModel(@org.jetbrains.annotations.NotNull
    com.example.data.local.UserDataStoreManager pref) {
        super();
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull
    com.example.domain.model.User user) {
    }
}