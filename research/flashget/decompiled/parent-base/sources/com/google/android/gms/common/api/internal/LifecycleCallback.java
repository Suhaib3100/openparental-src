package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class LifecycleCallback {

    @o0
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    protected LifecycleCallback(@o0 LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @o0
    @KeepForSdk
    public static LifecycleFragment getFragment(@o0 Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @KeepForSdk
    @l0
    public void dump(@o0 String str, @q0 FileDescriptor fileDescriptor, @o0 PrintWriter printWriter, @q0 String[] strArr) {
    }

    @o0
    @KeepForSdk
    public Activity getActivity() {
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        return lifecycleActivity;
    }

    @KeepForSdk
    @l0
    public void onActivityResult(int i4, int i5, @q0 Intent intent) {
    }

    @KeepForSdk
    @l0
    public void onCreate(@q0 Bundle bundle) {
    }

    @KeepForSdk
    @l0
    public void onDestroy() {
    }

    @KeepForSdk
    @l0
    public void onResume() {
    }

    @KeepForSdk
    @l0
    public void onSaveInstanceState(@o0 Bundle bundle) {
    }

    @KeepForSdk
    @l0
    public void onStart() {
    }

    @KeepForSdk
    @l0
    public void onStop() {
    }

    @o0
    @KeepForSdk
    public static LifecycleFragment getFragment(@o0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    @o0
    @KeepForSdk
    protected static LifecycleFragment getFragment(@o0 LifecycleActivity lifecycleActivity) {
        if (lifecycleActivity.zza()) {
            return zzd.zza(lifecycleActivity.zzd());
        }
        if (lifecycleActivity.zzb()) {
            return zza.zza(lifecycleActivity.zzc());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("째"));
    }
}
