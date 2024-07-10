package com.example.listingmovie.presentation.viewmodel;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.ExistingWorkPolicy;
import androidx.work.OneTimeWorkRequest;
import androidx.work.WorkInfo;
import androidx.work.WorkManager;
import com.example.common.Constants;
import com.example.domain.model.User;
import com.example.listingmovie.workers.BlurWorker;
import com.example.listingmovie.workers.CleanupWorker;
import com.example.listingmovie.workers.SaveImageToFileWorker;
import dagger.hilt.android.lifecycle.HiltViewModel;
import dagger.hilt.android.qualifiers.ApplicationContext;
import javax.inject.Inject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0015\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0000\u00a2\u0006\u0002\b\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u000bJ\u000e\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001dJ\u000e\u0010\u001e\u001a\u00020\u00132\u0006\u0010\u001f\u001a\u00020\u001aJ\u0010\u0010 \u001a\u00020\u00132\b\u0010!\u001a\u0004\u0018\u00010\bJ\u0017\u0010\"\u001a\u00020\u00132\b\u0010#\u001a\u0004\u0018\u00010$H\u0000\u00a2\u0006\u0002\b%J\u0014\u0010&\u001a\u0004\u0018\u00010\b2\b\u0010\'\u001a\u0004\u0018\u00010$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000bX\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006("}, d2 = {"Lcom/example/listingmovie/presentation/viewmodel/ProfileViewModel;", "Landroidx/lifecycle/ViewModel;", "pref", "Lcom/example/data/local/UserDataStoreManager;", "context", "Landroid/content/Context;", "(Lcom/example/data/local/UserDataStoreManager;Landroid/content/Context;)V", "imageUri", "Landroid/net/Uri;", "outputUri", "outputWorkInfos", "Landroidx/lifecycle/LiveData;", "", "Landroidx/work/WorkInfo;", "getOutputWorkInfos$app_debug", "()Landroidx/lifecycle/LiveData;", "workManager", "Landroidx/work/WorkManager;", "applyBlur", "", "blurLevel", "", "applyBlur$app_debug", "createInputDataForUri", "Landroidx/work/Data;", "getUser", "Lcom/example/domain/model/User;", "saveLogin", "isLogged", "", "saveProfile", "user", "setImageUri", "uri", "setOutputUri", "outputImageUri", "", "setOutputUri$app_debug", "uriOrNull", "uriString", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ProfileViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.data.local.UserDataStoreManager pref = null;
    @org.jetbrains.annotations.NotNull
    private final android.content.Context context = null;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri imageUri;
    @org.jetbrains.annotations.Nullable
    private android.net.Uri outputUri;
    @org.jetbrains.annotations.NotNull
    private final androidx.work.WorkManager workManager = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> outputWorkInfos = null;
    
    @javax.inject.Inject
    public ProfileViewModel(@org.jetbrains.annotations.NotNull
    com.example.data.local.UserDataStoreManager pref, @dagger.hilt.android.qualifiers.ApplicationContext
    @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<androidx.work.WorkInfo>> getOutputWorkInfos$app_debug() {
        return null;
    }
    
    private final androidx.work.Data createInputDataForUri() {
        return null;
    }
    
    public final void applyBlur$app_debug(int blurLevel) {
    }
    
    private final android.net.Uri uriOrNull(java.lang.String uriString) {
        return null;
    }
    
    public final void setImageUri(@org.jetbrains.annotations.Nullable
    android.net.Uri uri) {
    }
    
    public final void setOutputUri$app_debug(@org.jetbrains.annotations.Nullable
    java.lang.String outputImageUri) {
    }
    
    public final void saveProfile(@org.jetbrains.annotations.NotNull
    com.example.domain.model.User user) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.example.domain.model.User> getUser() {
        return null;
    }
    
    public final void saveLogin(boolean isLogged) {
    }
}