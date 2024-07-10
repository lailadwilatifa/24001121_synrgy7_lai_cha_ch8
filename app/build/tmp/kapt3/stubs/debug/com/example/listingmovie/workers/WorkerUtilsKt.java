package com.example.listingmovie.workers;

import android.Manifest;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.example.listingmovie.R;
import com.example.common.Constants;
import okio.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

@kotlin.Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u001a\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0006\u001a\u0006\u0010\u000b\u001a\u00020\b\u001a\u0016\u0010\f\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u0003\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"TAG", "", "blurBitmap", "Landroid/graphics/Bitmap;", "bitmap", "applicationContext", "Landroid/content/Context;", "makeStatusNotification", "", "message", "context", "sleep", "writeBitmapToFile", "Landroid/net/Uri;", "app_debug"})
public final class WorkerUtilsKt {
    @org.jetbrains.annotations.NotNull
    private static final java.lang.String TAG = "workerutils";
    
    public static final void makeStatusNotification(@org.jetbrains.annotations.NotNull
    java.lang.String message, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
    }
    
    /**
     * Method for sleeping for a fixed amount of time to emulate slower work
     */
    public static final void sleep() {
    }
    
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap blurBitmap(@org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull
    android.content.Context applicationContext) {
        return null;
    }
    
    /**
     * Writes bitmap to a temporary file and returns the Uri for the file
     * @param applicationContext Application context
     * @param bitmap Bitmap to write to temp file
     * @return Uri for temp file with bitmap
     * @throws FileNotFoundException Throws if bitmap file cannot be found
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.io.FileNotFoundException.class})
    @org.jetbrains.annotations.NotNull
    public static final android.net.Uri writeBitmapToFile(@org.jetbrains.annotations.NotNull
    android.content.Context applicationContext, @org.jetbrains.annotations.NotNull
    android.graphics.Bitmap bitmap) throws java.io.FileNotFoundException {
        return null;
    }
}