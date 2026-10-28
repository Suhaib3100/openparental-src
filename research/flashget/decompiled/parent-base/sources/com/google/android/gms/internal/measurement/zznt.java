package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zznt implements zznq {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;
    private static final zzhj<Boolean> zzc;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("헬"))).zzb().zza();
        zza = zza2.zza(ProtectedSandApp.s("헭"), false);
        zzb = zza2.zza(ProtectedSandApp.s("헮"), true);
        zzc = zza2.zza(ProtectedSandApp.s("헯"), false);
    }

    @Override // com.google.android.gms.internal.measurement.zznq
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zznq
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznq
    public final boolean zzc() {
        return zzb.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznq
    public final boolean zzd() {
        return zzc.zza().booleanValue();
    }
}
