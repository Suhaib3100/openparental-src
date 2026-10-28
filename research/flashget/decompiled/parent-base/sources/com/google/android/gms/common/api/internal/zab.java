package com.google.android.gms.common.api.internal;

import androidx.annotation.m1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import f9.a;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes5.dex */
public final class zab extends ActivityLifecycleObserver {
    private final WeakReference zaa;

    @m1(otherwise = 2)
    zab(zaa zaaVar) {
        this.zaa = new WeakReference(zaaVar);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    @a
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        zaa zaaVar = (zaa) this.zaa.get();
        if (zaaVar == null) {
            throw new IllegalStateException(ProtectedSandApp.s("쨰"));
        }
        zaaVar.zac(runnable);
        return this;
    }
}
