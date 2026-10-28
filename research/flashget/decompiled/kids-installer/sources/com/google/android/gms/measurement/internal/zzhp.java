package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes2.dex */
final class zzhp implements Runnable {
    final /* synthetic */ String zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ long zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ boolean zzg;
    final /* synthetic */ String zzh;
    final /* synthetic */ zzik zzi;

    zzhp(zzik zzikVar, String str, String str2, long j5, Bundle bundle, boolean z5, boolean z6, boolean z7, String str3) {
        this.zzi = zzikVar;
        this.zza = str;
        this.zzb = str2;
        this.zzc = j5;
        this.zzd = bundle;
        this.zze = z5;
        this.zzf = z6;
        this.zzg = z7;
        this.zzh = str3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zzI(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
