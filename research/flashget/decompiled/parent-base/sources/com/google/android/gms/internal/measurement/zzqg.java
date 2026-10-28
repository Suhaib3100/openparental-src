package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.1.2 */
/* loaded from: classes5.dex */
public final class zzqg implements zzqe {
    private static final zzhj<Boolean> zza;

    static {
        zzhr zza2 = new zzhr(zzhk.zza(ProtectedSandApp.s("환"))).zzb().zza();
        zza = zza2.zza(ProtectedSandApp.s("홙"), true);
        zza2.zza(ProtectedSandApp.s("홚"), true);
    }

    @Override // com.google.android.gms.internal.measurement.zzqe
    public final boolean zza() {
        return zza.zza().booleanValue();
    }
}
