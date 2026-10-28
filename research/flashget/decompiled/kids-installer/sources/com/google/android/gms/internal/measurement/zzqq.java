package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzqq implements zzqp {
    public static final zzib zza;
    public static final zzib zzb;

    static {
        zzhy zza2 = new zzhy(zzhq.zza(ProtectedSandApp.s("\u2433"))).zzb().zza();
        zza = zza2.zzf(ProtectedSandApp.s("\u2434"), false);
        zzb = zza2.zzd(ProtectedSandApp.s("\u2435"), 0L);
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzqp
    public final boolean zzb() {
        return ((Boolean) zza.zzb()).booleanValue();
    }
}
