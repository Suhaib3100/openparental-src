package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.3.0 */
/* loaded from: classes3.dex */
public final class zzpa implements zzoz {
    public static final zzib zza;
    public static final zzib zzb;
    public static final zzib zzc;
    public static final zzib zzd;

    static {
        zzhy zza2 = new zzhy(zzhq.zza(ProtectedSandApp.s("⏴"))).zza();
        zza = zza2.zzf(ProtectedSandApp.s("⏵"), true);
        zzb = zza2.zzf(ProtectedSandApp.s("⏶"), false);
        zzc = zza2.zzf(ProtectedSandApp.s("⏷"), false);
        zzd = zza2.zzf(ProtectedSandApp.s("⏸"), false);
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zza() {
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zzb() {
        return ((Boolean) zzb.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zzc() {
        return ((Boolean) zzc.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.measurement.zzoz
    public final boolean zzd() {
        return ((Boolean) zzd.zzb()).booleanValue();
    }
}
