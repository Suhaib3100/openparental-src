package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzoa implements zzob {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("혀"))).zzb().zza();
        zza2.zza(ProtectedSandApp.s("혁"), true);
        zza = zza2.zza(ProtectedSandApp.s("혂"), true);
        zzb = zza2.zza(ProtectedSandApp.s("혃"), true);
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzob
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }
}
