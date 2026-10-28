package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@21.3.0 */
/* loaded from: classes3.dex */
final class zzds extends zzdu {
    final /* synthetic */ Long zza;
    final /* synthetic */ String zzb;
    final /* synthetic */ String zzc;
    final /* synthetic */ Bundle zzd;
    final /* synthetic */ boolean zze;
    final /* synthetic */ boolean zzf;
    final /* synthetic */ zzef zzg;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzds(zzef zzefVar, Long l5, String str, String str2, Bundle bundle, boolean z5, boolean z6) {
        super(zzefVar, true);
        this.zzg = zzefVar;
        this.zza = l5;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = bundle;
        this.zze = z5;
        this.zzf = z6;
    }

    @Override // com.google.android.gms.internal.measurement.zzdu
    final void zza() throws RemoteException {
        zzcc zzccVar;
        Long l5 = this.zza;
        long longValue = l5 == null ? this.zzh : l5.longValue();
        zzccVar = this.zzg.zzj;
        ((zzcc) Preconditions.checkNotNull(zzccVar)).logEvent(this.zzb, this.zzc, this.zzd, this.zze, this.zzf, longValue);
    }
}
