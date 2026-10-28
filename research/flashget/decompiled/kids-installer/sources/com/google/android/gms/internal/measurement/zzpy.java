package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzpy implements zzpx {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;

    static {
        zzhy zza2 = new zzhy(zzhq.zza(ProtectedSandApp.s("␑"))).zza();
        zza = zza2.zzd(ProtectedSandApp.s("␒"), 0L);
        zzb = zza2.zzf(ProtectedSandApp.s("␓"), true);
        zzc = zza2.zzf(ProtectedSandApp.s("␔"), false);
    }

    @Override // com.google.android.gms.internal.measurement.zzpx
    public final boolean zza() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }
}
