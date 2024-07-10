package com.example.listingmovie.presentation.fragments;

import android.Manifest;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.util.Log;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavOptions;
import androidx.work.WorkInfo;
import com.example.common.Constants;
import com.example.listingmovie.databinding.FragmentProfileBinding;
import com.example.domain.model.User;
import com.example.listingmovie.R;
import com.example.listingmovie.presentation.viewmodel.ProfileViewModel;
import dagger.hilt.android.AndroidEntryPoint;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u000eH\u0002J+\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001eH\u0002\u00a2\u0006\u0002\u0010\u001fJ\u0012\u0010 \u001a\u00020\u00152\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J$\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010)\u001a\u00020\u00152\u0006\u0010*\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010+\u001a\u00020\u0015H\u0002J\b\u0010,\u001a\u00020\u0015H\u0002J\u0010\u0010-\u001a\u00020\u00152\u0006\u0010.\u001a\u00020\u0019H\u0002J\b\u0010/\u001a\u00020\u0015H\u0002J\b\u00100\u001a\u00020\u0015H\u0002J\u0014\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002040302H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u000e0\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00060\u00060\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u00065"}, d2 = {"Lcom/example/listingmovie/presentation/fragments/ProfileFragment;", "Landroidx/fragment/app/Fragment;", "()V", "REQUEST_CODE_PERMISSION", "", "TAG", "", "_binding", "Lcom/example/listingmovie/databinding/FragmentProfileBinding;", "binding", "getBinding", "()Lcom/example/listingmovie/databinding/FragmentProfileBinding;", "cameraResult", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "galleryResult", "imageUri", "viewModel", "Lcom/example/listingmovie/presentation/viewmodel/ProfileViewModel;", "checkingPermissions", "", "handleCameraImage", "intent", "isGranted", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "permission", "permissions", "", "(Landroidx/fragment/app/FragmentActivity;Ljava/lang/String;[Ljava/lang/String;)Z", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "openCamera", "openGallery", "progressBar", "state", "setObserver", "showPermissionDeniedDialog", "workInfoObserver", "Landroidx/lifecycle/Observer;", "", "Landroidx/work/WorkInfo;", "app_debug"})
public final class ProfileFragment extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String TAG = "cobablur";
    @org.jetbrains.annotations.Nullable
    private com.example.listingmovie.databinding.FragmentProfileBinding _binding;
    private com.example.listingmovie.presentation.viewmodel.ProfileViewModel viewModel;
    @org.jetbrains.annotations.NotNull
    private java.lang.String imageUri = "";
    private final int REQUEST_CODE_PERMISSION = 100;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<android.content.Intent> cameraResult = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.activity.result.ActivityResultLauncher<java.lang.String> galleryResult = null;
    
    public ProfileFragment() {
        super();
    }
    
    private final com.example.listingmovie.databinding.FragmentProfileBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final androidx.lifecycle.Observer<java.util.List<androidx.work.WorkInfo>> workInfoObserver() {
        return null;
    }
    
    private final void progressBar(boolean state) {
    }
    
    private final void checkingPermissions() {
    }
    
    private final boolean isGranted(androidx.fragment.app.FragmentActivity activity, java.lang.String permission, java.lang.String[] permissions) {
        return false;
    }
    
    private final void showPermissionDeniedDialog() {
    }
    
    private final void openCamera() {
    }
    
    private final void openGallery() {
    }
    
    private final void handleCameraImage(android.content.Intent intent) {
    }
    
    private final void setObserver() {
    }
}