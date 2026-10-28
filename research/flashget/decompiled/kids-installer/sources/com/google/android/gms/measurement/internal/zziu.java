package com.google.android.gms.measurement.internal;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zziu implements Runnable {
    final /* synthetic */ zzir zza;
    final /* synthetic */ zzir zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ zziz zze;

    zziu(zziz zzizVar, zzir zzirVar, zzir zzirVar2, long j5, boolean z5) {
        this.zze = zzizVar;
        this.zza = zzirVar;
        this.zzb = zzirVar2;
        this.zzc = j5;
        this.zzd = z5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzA(this.zza, this.zzb, this.zzc, this.zzd, null);
    }
}
