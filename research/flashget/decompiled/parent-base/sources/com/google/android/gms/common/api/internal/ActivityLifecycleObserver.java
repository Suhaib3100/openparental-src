package com.google.android.gms.common.api.internal;

import android.app.Activity;
import androidx.annotation.o0;
import com.google.android.gms.common.annotation.KeepForSdk;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
@KeepForSdk
/* loaded from: classes5.dex */
public abstract class ActivityLifecycleObserver {
    @o0
    @KeepForSdk
    public static final ActivityLifecycleObserver of(@o0 Activity activity) {
        return new zab(zaa.zaa(activity));
    }

    @o0
    @KeepForSdk
    public abstract ActivityLifecycleObserver onStopCallOnce(@o0 Runnable runnable);
}
