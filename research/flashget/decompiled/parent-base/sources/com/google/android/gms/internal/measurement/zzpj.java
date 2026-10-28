package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzpj implements zzpg {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Long> zzb;
    private static final zzhj<Double> zzc;
    private static final zzhj<Long> zzd;
    private static final zzhj<Long> zze;
    private static final zzhj<String> zzf;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("혧"))).zzb().zza();
        zza = zza2.zza(ProtectedSandApp.s("혨"), false);
        zzb = zza2.zza(ProtectedSandApp.s("혩"), -1L);
        zzc = zza2.zza(ProtectedSandApp.s("혪"), -3.0d);
        zzd = zza2.zza(ProtectedSandApp.s("혫"), -2L);
        zze = zza2.zza(ProtectedSandApp.s("혬"), -1L);
        zzf = zza2.zza(ProtectedSandApp.s("혭"), ProtectedSandApp.s("혮"));
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final double zza() {
        return zzc.zza().doubleValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final long zzb() {
        return zzb.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final long zzc() {
        return zzd.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final long zzd() {
        return zze.zza().longValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final String zze() {
        return zzf.zza();
    }

    @Override // com.google.android.gms.internal.measurement.zzpg
    public final boolean zzf() {
        return zza.zza().booleanValue();
    }
}
