package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
final class zzki implements Runnable {
    private final /* synthetic */ String zza;
    private final /* synthetic */ String zzb;
    private final /* synthetic */ long zzc;
    private final /* synthetic */ Bundle zzd;
    private final /* synthetic */ boolean zze;
    private final /* synthetic */ boolean zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ String zzh;
    private final /* synthetic */ zzjq zzi;

    zzki(zzjq zzjqVar, String str, String str2, long j4, Bundle bundle, boolean z4, boolean z5, boolean z6, String str3) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = j4;
        this.zzd = bundle;
        this.zze = z4;
        this.zzf = z5;
        this.zzg = z6;
        this.zzh = str3;
        this.zzi = zzjqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzi.zza(this.zza, this.zzb, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }
}
