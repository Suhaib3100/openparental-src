package com.google.android.gms.measurement.internal;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzhs implements Runnable {
    final /* synthetic */ long zza;
    final /* synthetic */ zzik zzb;

    zzhs(zzik zzikVar, long j5) {
        this.zzb = zzikVar;
        this.zza = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzL(this.zza, true);
        this.zzb.zzt.zzt().zzu(new AtomicReference());
    }
}
