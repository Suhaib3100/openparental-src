package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
public abstract class zzjq {
    private static String zza = ProtectedSandApp.s("\uea07");
    private static String zzc = ProtectedSandApp.s("\uea08");
    private static String zzb = ProtectedSandApp.s("\uea09");
    private static final String[] zzd = {ProtectedSandApp.s("\uea07"), ProtectedSandApp.s("\uea09"), ProtectedSandApp.s("\uea08")};

    public static int zza() {
        return zzkv.zza();
    }

    public static long zzb() {
        zzjq zzjqVar;
        zzjqVar = zzjo.zza;
        return zzjqVar.zzc();
    }

    public static zzja zzd(String str) {
        zzjq zzjqVar;
        zzjqVar = zzjo.zza;
        return zzjqVar.zze(str);
    }

    public static zzjc zzf() {
        return zzi().zza();
    }

    public static zzjp zzg() {
        zzjq zzjqVar;
        zzjqVar = zzjo.zza;
        return zzjqVar.zzh();
    }

    public static zzke zzi() {
        zzjq zzjqVar;
        zzjqVar = zzjo.zza;
        return zzjqVar.zzj();
    }

    public static zzkr zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        zzjq zzjqVar;
        zzjqVar = zzjo.zza;
        return zzjqVar.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z4) {
        zzi().zzd(str, level, z4);
        return false;
    }

    protected long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract zzja zze(String str);

    protected abstract zzjp zzh();

    protected zzke zzj() {
        return zzke.zze();
    }

    protected abstract String zzm();
}
