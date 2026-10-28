package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzdy;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@22.1.2 */
/* loaded from: classes5.dex */
final class zzff extends zzdy.zza {
    private final /* synthetic */ Long zzc;
    private final /* synthetic */ String zzd;
    private final /* synthetic */ String zze;
    private final /* synthetic */ Bundle zzf;
    private final /* synthetic */ boolean zzg;
    private final /* synthetic */ boolean zzh;
    private final /* synthetic */ zzdy zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzff(zzdy zzdyVar, Long l4, String str, String str2, Bundle bundle, boolean z4, boolean z5) {
        super(zzdyVar);
        this.zzc = l4;
        this.zzd = str;
        this.zze = str2;
        this.zzf = bundle;
        this.zzg = z4;
        this.zzh = z5;
        this.zzi = zzdyVar;
    }

    @Override // com.google.android.gms.internal.measurement.zzdy.zza
    final void zza() throws RemoteException {
        zzdj zzdjVar;
        Long l4 = this.zzc;
        long longValue = l4 == null ? this.zza : l4.longValue();
        zzdjVar = this.zzi.zzj;
        ((zzdj) Preconditions.checkNotNull(zzdjVar)).logEvent(this.zzd, this.zze, this.zzf, this.zzg, this.zzh, longValue);
    }
}
