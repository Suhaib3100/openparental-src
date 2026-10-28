package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzof implements zzoc {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("현"))).zzb().zza();
        zza2.zza(ProtectedSandApp.s("혅"), true);
        zza2.zza(ProtectedSandApp.s("혆"), false);
        zza2.zza(ProtectedSandApp.s("혇"), true);
        zza2.zza(ProtectedSandApp.s("혈"), true);
        zza = zza2.zza(ProtectedSandApp.s("혉"), true);
        zzb = zza2.zza(ProtectedSandApp.s("혊"), true);
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoc
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }
}
