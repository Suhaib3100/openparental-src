package com.google.android.gms.measurement.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zznf implements Runnable {
    long zza;
    long zzb;
    final /* synthetic */ zzng zzc;

    zznf(zzng zzngVar, long j4, long j5) {
        this.zzc = zzngVar;
        this.zza = j4;
        this.zzb = j5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzc.zza.zzl().zzb(new Runnable() { // from class: com.google.android.gms.measurement.internal.zzni
            @Override // java.lang.Runnable
            public final void run() {
                zznf zznfVar = zznf.this;
                zzng zzngVar = zznfVar.zzc;
                long j4 = zznfVar.zza;
                long j5 = zznfVar.zzb;
                zzngVar.zza.zzt();
                zzngVar.zza.zzj().zzc().zza(ProtectedSandApp.s("\ue203"));
                zzngVar.zza.zzk().zzn.zza(true);
                zzngVar.zza.zza(true);
                if (!zzngVar.zza.zze().zzw()) {
                    if (zzngVar.zza.zze().zza(zzbh.zzcp)) {
                        zzngVar.zza.zza(false, false, j5);
                        zzngVar.zza.zzb.zzb(j5);
                    } else {
                        zzngVar.zza.zzb.zzb(j5);
                        zzngVar.zza.zza(false, false, j5);
                    }
                }
                zzngVar.zza.zzj().zzo().zza(ProtectedSandApp.s("\ue204"), Long.valueOf(j4));
                if (zzngVar.zza.zze().zza(zzbh.zzdd)) {
                    zzngVar.zza.zzm().zzam();
                }
            }
        });
    }
}
