package com.google.android.gms.measurement.internal;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzho implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzik zzb;

    zzho(zzik zzikVar, long j5) {
        this.zzb = zzikVar;
        this.zza = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzt.zzm().zzf.zzb(this.zza);
        this.zzb.zzt.zzaA().zzc().zzb(ProtectedSandApp.s("ᄆ"), Long.valueOf(this.zza));
    }
}
