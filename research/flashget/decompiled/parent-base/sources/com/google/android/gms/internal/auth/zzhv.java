package com.google.android.gms.internal.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class zzhv implements zzhu {
    public static final zzdc zza;
    public static final zzdc zzb;
    public static final zzdc zzc;
    public static final zzdc zzd;
    public static final zzdc zze;

    static {
        zzcz zza2 = new zzcz(zzcr.zza(ProtectedSandApp.s("쾴"))).zzb().zza();
        zza = zza2.zze(ProtectedSandApp.s("쾵"), false);
        zzb = zza2.zze(ProtectedSandApp.s("쾶"), false);
        zzc = zza2.zze(ProtectedSandApp.s("쾷"), true);
        zzd = zza2.zze(ProtectedSandApp.s("쾸"), true);
        zze = zza2.zze(ProtectedSandApp.s("쾹"), false);
    }

    @Override // com.google.android.gms.internal.auth.zzhu
    public final boolean zza() {
        return ((Boolean) zza.zzb()).booleanValue();
    }
}
