package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzrc implements zzrb {
    public static final zzib zza;
    public static final zzib zzb;

    static {
        zzhy zza2 = new zzhy(zzhq.zza(ProtectedSandApp.s("⑄"))).zzb().zza();
        zza = zza2.zzf(ProtectedSandApp.s("⑅"), true);
        zzb = zza2.zzf(ProtectedSandApp.s("⑆"), true);
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzrb
    public final boolean zzc() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}
