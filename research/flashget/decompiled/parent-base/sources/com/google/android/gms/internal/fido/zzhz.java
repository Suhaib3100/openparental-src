package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public final class zzhz implements zzhy {
    public static final zzaq zza;
    public static final zzaq zzb;
    public static final zzaq zzc;
    public static final zzaq zzd;
    public static final zzaq zze;
    public static final zzaq zzf;
    public static final zzaq zzg;

    static {
        zzay zzd2 = new zzay(ProtectedSandApp.s("턉")).zze(zzcf.zzl(ProtectedSandApp.s("턊"))).zzd();
        zza = zzd2.zzc(ProtectedSandApp.s("턋"), false);
        zzb = zzd2.zzc(ProtectedSandApp.s("턌"), true);
        zzc = zzd2.zza(ProtectedSandApp.s("턍"), 3L);
        zzd = zzd2.zza(ProtectedSandApp.s("턎"), 3L);
        zze = zzd2.zzc(ProtectedSandApp.s("턏"), true);
        zzf = zzd2.zzc(ProtectedSandApp.s("턐"), false);
        zzg = zzd2.zzc(ProtectedSandApp.s("턑"), true);
    }

    @Override // com.google.android.gms.internal.fido.zzhy
    public final boolean zza() {
        return ((Boolean) zza.zza()).booleanValue();
    }
}
