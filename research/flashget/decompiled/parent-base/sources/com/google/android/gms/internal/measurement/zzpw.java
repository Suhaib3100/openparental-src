package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzpw implements zzpx {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;
    private static final zzhj<Boolean> zzc;
    private static final zzhj<Boolean> zzd;
    private static final zzhj<Boolean> zze;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("홍"))).zzb().zza();
        zza = zza2.zza(ProtectedSandApp.s("홎"), false);
        zzb = zza2.zza(ProtectedSandApp.s("홏"), true);
        zzc = zza2.zza(ProtectedSandApp.s("홐"), false);
        zzd = zza2.zza(ProtectedSandApp.s("홑"), true);
        zze = zza2.zza(ProtectedSandApp.s("홒"), false);
        zza2.zza(ProtectedSandApp.s("홓"), 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zze() {
        return zzd.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zzf() {
        return zze.zza().booleanValue();
    }
}
