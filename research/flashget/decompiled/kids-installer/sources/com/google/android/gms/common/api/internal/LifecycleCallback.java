package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.l0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleCallback {

    @o0
    @KeepForSdk
    protected final LifecycleFragment mLifecycleFragment;

    @KeepForSdk
    protected LifecycleCallback(@o0 LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    @Keep
    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        throw new IllegalStateException(ProtectedSandApp.s("૭"));
    }

    @o0
    @KeepForSdk
    public static LifecycleFragment getFragment(@o0 Activity activity) {
        return getFragment(new LifecycleActivity(activity));
    }

    @KeepForSdk
    @l0
    public void dump(@o0 String str, @o0 FileDescriptor fileDescriptor, @o0 PrintWriter printWriter, @o0 String[] strArr) {
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
    public void onActivityResult(int i5, int i6, @o0 Intent intent) {
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
        if (lifecycleActivity.zzd()) {
            return zzd.zzc(lifecycleActivity.zzb());
        }
        if (lifecycleActivity.zzc()) {
            return zzb.zzc(lifecycleActivity.zza());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("૮"));
    }
}
