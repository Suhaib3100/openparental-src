package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzpv implements zzps {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("홅"))).zzb().zza();
        zza2.zza(ProtectedSandApp.s("홆"), true);
        zza = zza2.zza(ProtectedSandApp.s("홇"), false);
        zza2.zza(ProtectedSandApp.s("홈"), true);
        zzb = zza2.zza(ProtectedSandApp.s("홉"), true);
        zza2.zza(ProtectedSandApp.s("홊"), true);
        zza2.zza(ProtectedSandApp.s("홋"), true);
        zza2.zza(ProtectedSandApp.s("홌"), 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzps
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }
}
