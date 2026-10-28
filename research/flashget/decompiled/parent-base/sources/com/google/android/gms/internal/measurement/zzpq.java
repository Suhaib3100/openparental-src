package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzpq implements zzpr {
    private static final zzhj<Boolean> zza;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("홀"))).zzb().zza();
        zza2.zza(ProtectedSandApp.s("홁"), true);
        zza2.zza(ProtectedSandApp.s("홂"), true);
        zza = zza2.zza(ProtectedSandApp.s("홃"), false);
        zza2.zza(ProtectedSandApp.s("홄"), true);
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzpr
    public final boolean zzb() {
        return zza.zza().booleanValue();
    }
}
