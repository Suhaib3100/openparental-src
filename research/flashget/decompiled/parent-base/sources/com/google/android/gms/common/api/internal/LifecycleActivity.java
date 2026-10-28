package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.o0;
import androidx.fragment.app.FragmentActivity;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.9.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(@o0 Activity activity) {
        Preconditions.checkNotNull(activity, ProtectedSandApp.s("짷"));
        this.zza = activity;
    }

    public final boolean zza() {
        return this.zza instanceof FragmentActivity;
    }

    public final boolean zzb() {
        return this.zza instanceof Activity;
    }

    @o0
    public final Activity zzc() {
        return (Activity) this.zza;
    }

    @o0
    public final FragmentActivity zzd() {
        return (FragmentActivity) this.zza;
    }

    @KeepForSdk
    @Deprecated
    public LifecycleActivity(@o0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
