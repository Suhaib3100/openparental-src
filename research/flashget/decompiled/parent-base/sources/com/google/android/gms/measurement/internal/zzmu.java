package com.google.android.gms.measurement.internal;

import android.content.ComponentName;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzmu implements Runnable {
    private final /* synthetic */ zzmq zza;

    zzmu(zzmq zzmqVar) {
        this.zza = zzmqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzls.zza(this.zza.zza, new ComponentName(this.zza.zza.zza(), ProtectedSandApp.s("\ue1e0")));
    }
}
