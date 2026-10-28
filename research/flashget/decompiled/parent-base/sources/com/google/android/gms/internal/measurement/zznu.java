package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zznu implements zznv {
    private static final zzhj<Boolean> zza;
    private static final zzhj<Boolean> zzb;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("헰"))).zzb().zza();
        zza = zza2.zza(ProtectedSandApp.s("헱"), false);
        zzb = zza2.zza(ProtectedSandApp.s("헲"), false);
        zza2.zza(ProtectedSandApp.s("헳"), 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zza() {
        return zza.zza().booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zznv
    public final boolean zzb() {
        return zzb.zza().booleanValue();
    }
}
