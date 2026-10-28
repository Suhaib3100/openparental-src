package com.google.android.gms.internal.auth;

import android.util.Base64;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
public final class zzhz implements zzhx {
    public static final zzdc zza;
    public static final zzdc zzb;
    public static final zzdc zzc;
    public static final zzdc zzd;
    public static final zzdc zze;
    public static final zzdc zzf;
    public static final zzdc zzg;
    public static final zzdc zzh;
    public static final zzdc zzi;
    public static final zzdc zzj;
    public static final zzdc zzk;
    public static final zzdc zzl;
    public static final zzdc zzm;

    static {
        zzcz zza2 = new zzcz(zzcr.zza(ProtectedSandApp.s("쾺"))).zzb().zza();
        zza = zza2.zzc(ProtectedSandApp.s("쾻"), p.f60679p);
        zzb = zza2.zze(ProtectedSandApp.s("쾼"), true);
        zzc = zza2.zzd(ProtectedSandApp.s("쾽"), 20L);
        zzd = zza2.zzd(ProtectedSandApp.s("쾾"), 0L);
        try {
            zze = zza2.zzf(ProtectedSandApp.s("쾿"), zzhs.zzp(Base64.decode(ProtectedSandApp.s("쿀"), 3)), zzhy.zza);
            zzf = zza2.zze(ProtectedSandApp.s("쿁"), true);
            zzg = zza2.zzd(ProtectedSandApp.s("쿂"), 20L);
            zzh = zza2.zzd(ProtectedSandApp.s("쿃"), 20L);
            zzi = zza2.zze(ProtectedSandApp.s("쿄"), false);
            zzj = zza2.zze(ProtectedSandApp.s("쿅"), false);
            zzk = zza2.zzd(ProtectedSandApp.s("쿆"), 120L);
            zzl = zza2.zze(ProtectedSandApp.s("쿇"), true);
            zzm = zza2.zzc(ProtectedSandApp.s("쿈"), p.f60679p);
        } catch (Exception e4) {
            throw new AssertionError(e4);
        }
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final zzhs zza() {
        return (zzhs) zze.zzb();
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final boolean zzb() {
        return ((Boolean) zzi.zzb()).booleanValue();
    }

    @Override // com.google.android.gms.internal.auth.zzhx
    public final boolean zzc() {
        return ((Boolean) zzj.zzb()).booleanValue();
    }
}
