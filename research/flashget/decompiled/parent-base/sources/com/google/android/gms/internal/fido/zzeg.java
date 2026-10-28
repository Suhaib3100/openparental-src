package com.google.android.gms.internal.fido;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-fido@@21.0.0 */
/* loaded from: classes5.dex */
public abstract class zzeg {
    private static String zza = ProtectedSandApp.s("큔");
    private static String zzc = ProtectedSandApp.s("큕");
    private static String zzb = ProtectedSandApp.s("큖");
    private static final String[] zzd = {ProtectedSandApp.s("큔"), ProtectedSandApp.s("큖"), ProtectedSandApp.s("큕")};

    public static int zza() {
        return zzfm.zza();
    }

    public static long zzb() {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zzc();
    }

    public static zzdp zzd(String str) {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zze(str);
    }

    public static zzdr zzf() {
        return zzi().zza();
    }

    public static zzef zzg() {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zzh();
    }

    public static zzev zzi() {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zzj();
    }

    public static zzfi zzk() {
        return zzi().zzc();
    }

    public static String zzl() {
        zzeg zzegVar;
        zzegVar = zzee.zza;
        return zzegVar.zzm();
    }

    public static boolean zzn(String str, Level level, boolean z4) {
        zzi().zzd(str, level, z4);
        return false;
    }

    protected long zzc() {
        return TimeUnit.MILLISECONDS.toNanos(System.currentTimeMillis());
    }

    protected abstract zzdp zze(String str);

    protected abstract zzef zzh();

    protected zzev zzj() {
        return zzev.zze();
    }

    protected abstract String zzm();
}
