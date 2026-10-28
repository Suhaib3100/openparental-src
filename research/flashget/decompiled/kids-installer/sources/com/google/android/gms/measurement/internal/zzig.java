package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.zzqu;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzig implements Runnable {
    final /* synthetic */ zzhb zza;
    final /* synthetic */ long zzb;
    final /* synthetic */ boolean zzc;
    final /* synthetic */ zzhb zzd;
    final /* synthetic */ zzik zze;

    zzig(zzik zzikVar, zzhb zzhbVar, long j5, boolean z5, zzhb zzhbVar2) {
        this.zze = zzikVar;
        this.zza = zzhbVar;
        this.zzb = j5;
        this.zzc = z5;
        this.zzd = zzhbVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzV(this.zza);
        zzik.zzw(this.zze, this.zza, this.zzb, false, this.zzc);
        zzqu.zzc();
        if (this.zze.zzt.zzf().zzs(null, zzeg.zzan)) {
            zzik.zzv(this.zze, this.zza, this.zzd);
        }
    }
}
