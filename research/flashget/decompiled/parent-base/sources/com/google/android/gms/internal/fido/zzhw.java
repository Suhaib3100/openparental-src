package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzhw implements zzhv {
    public static final zzaq zza;
    public static final zzaq zzb;
    public static final zzaq zzc;
    public static final zzaq zzd;
    public static final zzaq zze;
    public static final zzaq zzf;
    public static final zzaq zzg;
    public static final zzaq zzh;

    static {
        zzay zzd2 = new zzay(ProtectedSandApp.s("탿")).zze(zzcf.zzl(ProtectedSandApp.s("턀"))).zzd();
        zza = zzd2.zzc(ProtectedSandApp.s("턁"), true);
        zzb = zzd2.zzc(ProtectedSandApp.s("턂"), true);
        zzc = zzd2.zzc(ProtectedSandApp.s("턃"), false);
        zzd = zzd2.zzc(ProtectedSandApp.s("턄"), true);
        zze = zzd2.zzc(ProtectedSandApp.s("턅"), false);
        zzf = zzd2.zzc(ProtectedSandApp.s("턆"), false);
        zzg = zzd2.zzc(ProtectedSandApp.s("턇"), false);
        zzh = zzd2.zzc(ProtectedSandApp.s("턈"), false);
    }

    @Override // com.google.android.gms.internal.fido.zzhv
    public final boolean zza() {
        return ((Boolean) zzc.zza()).booleanValue();
    }
}
