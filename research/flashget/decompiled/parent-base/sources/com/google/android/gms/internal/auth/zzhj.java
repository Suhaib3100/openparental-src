package com.google.android.gms.internal.auth;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes5.dex */
final class zzhj {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zzhi zze;
    private static final boolean zzf;
    private static final boolean zzg;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    static {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.auth.zzhj.<clinit>():void");
    }

    private zzhj() {
    }

    static double zza(Object obj, long j4) {
        return zze.zza(obj, j4);
    }

    static float zzb(Object obj, long j4) {
        return zze.zzb(obj, j4);
    }

    static int zzc(Object obj, long j4) {
        return zze.zza.getInt(obj, j4);
    }

    static long zzd(Object obj, long j4) {
        return zze.zza.getLong(obj, j4);
    }

    static Object zze(Class cls) {
        try {
            return zzb.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    static Object zzf(Object obj, long j4) {
        return zze.zza.getObject(obj, j4);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzhf());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzhj.class.getName()).logp(Level.WARNING, ProtectedSandApp.s("쾋"), ProtectedSandApp.s("쾌"), ProtectedSandApp.s("쾊").concat(th.toString()));
    }

    static /* synthetic */ void zzi(Object obj, long j4, boolean z4) {
        zzhi zzhiVar = zze;
        long j5 = (-4) & j4;
        int i4 = zzhiVar.zza.getInt(obj, j5);
        int i5 = ((~((int) j4)) & 3) << 3;
        zzhiVar.zza.putInt(obj, j5, ((z4 ? 1 : 0) << i5) | ((~(255 << i5)) & i4));
    }

    static /* synthetic */ void zzj(Object obj, long j4, boolean z4) {
        zzhi zzhiVar = zze;
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        zzhiVar.zza.putInt(obj, j5, ((z4 ? 1 : 0) << i4) | ((~(255 << i4)) & zzhiVar.zza.getInt(obj, j5)));
    }

    static void zzk(Object obj, long j4, boolean z4) {
        zze.zzc(obj, j4, z4);
    }

    static void zzl(Object obj, long j4, double d5) {
        zze.zzd(obj, j4, d5);
    }

    static void zzm(Object obj, long j4, float f4) {
        zze.zze(obj, j4, f4);
    }

    static void zzn(Object obj, long j4, int i4) {
        zze.zza.putInt(obj, j4, i4);
    }

    static void zzo(Object obj, long j4, long j5) {
        zze.zza.putLong(obj, j4, j5);
    }

    static void zzp(Object obj, long j4, Object obj2) {
        zze.zza.putObject(obj, j4, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzq(Object obj, long j4) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzr(Object obj, long j4) {
        return ((byte) ((zze.zza.getInt(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzs(Class cls) {
        int i4 = zzds.zza;
        try {
            Class cls2 = zzc;
            String s4 = ProtectedSandApp.s("쾍");
            Class cls3 = Boolean.TYPE;
            cls2.getMethod(s4, cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("쾎"), cls, Long.TYPE, cls3);
            String s5 = ProtectedSandApp.s("쾏");
            Class cls4 = Integer.TYPE;
            cls2.getMethod(s5, cls, cls4, cls3);
            cls2.getMethod(ProtectedSandApp.s("쾐"), cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("쾑"), cls, Byte.TYPE);
            cls2.getMethod(ProtectedSandApp.s("쾒"), cls);
            cls2.getMethod(ProtectedSandApp.s("쾓"), cls, byte[].class, cls4, cls4);
            cls2.getMethod(ProtectedSandApp.s("쾔"), cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzt(Object obj, long j4) {
        return zze.zzf(obj, j4);
    }

    static boolean zzu() {
        return zzg;
    }

    static boolean zzv() {
        return zzf;
    }

    private static int zzw(Class cls) {
        if (zzg) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzx(Class cls) {
        if (zzg) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzy() {
        int i4 = zzds.zza;
        Field zzz = zzz(Buffer.class, ProtectedSandApp.s("쾕"));
        if (zzz != null) {
            return zzz;
        }
        Field zzz2 = zzz(Buffer.class, ProtectedSandApp.s("쾖"));
        if (zzz2 == null || zzz2.getType() != Long.TYPE) {
            return null;
        }
        return zzz2;
    }

    private static Field zzz(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
