package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzqz implements zzqy {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;
    public static final zzib zze;
    public static final zzib zzf;

    static {
        zzhy zza2 = new zzhy(zzhq.zza(ProtectedSandApp.s("\u243d"))).zzb().zza();
        zza = zza2.zzf(ProtectedSandApp.s("\u243e"), true);
        zzb = zza2.zzf(ProtectedSandApp.s("\u243f"), false);
        zzc = zza2.zzf(ProtectedSandApp.s("⑀"), true);
        zzd = zza2.zzf(ProtectedSandApp.s("⑁"), true);
        zze = zza2.zzf(ProtectedSandApp.s("⑂"), true);
        zzf = zza2.zzd(ProtectedSandApp.s("⑃"), 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqy
    public final boolean zza() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }
}
