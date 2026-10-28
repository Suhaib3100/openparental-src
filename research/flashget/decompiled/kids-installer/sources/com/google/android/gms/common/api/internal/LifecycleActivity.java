package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import androidx.annotation.o0;
import androidx.fragment.app.FragmentActivity;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
@KeepForSdk
/* loaded from: classes2.dex */
public class LifecycleActivity {
    private final Object zza;

    public LifecycleActivity(@o0 Activity activity) {
        Preconditions.checkNotNull(activity, ProtectedSandApp.s("૬"));
        this.zza = activity;
    }

    @o0
    public final Activity zza() {
        return (Activity) this.zza;
    }

    @o0
    public final FragmentActivity zzb() {
        return (FragmentActivity) this.zza;
    }

    public final boolean zzc() {
        return this.zza instanceof Activity;
    }

    public final boolean zzd() {
        return this.zza instanceof FragmentActivity;
    }

    @KeepForSdk
    public LifecycleActivity(@o0 ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
