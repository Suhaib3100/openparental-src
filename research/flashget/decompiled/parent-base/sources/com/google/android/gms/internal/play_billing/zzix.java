package com.google.android.gms.internal.play_billing;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.android.billingclient:billing@@9.1.0 */
/* loaded from: classes5.dex */
final class zzix {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class zzc;
    private static final boolean zzd;
    private static final zziw zze;
    private static final boolean zzf;

    /* JADX WARN: Removed duplicated region for block: B:25:0x0130  */
    static {
        /*
            Method dump skipped, instructions count: 308
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.zzix.<clinit>():void");
    }

    private zzix() {
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
        Unsafe unsafe;
        try {
            unsafe = (Unsafe) AccessController.doPrivileged(new zzit());
        } catch (Throwable unused) {
            unsafe = null;
        }
        if (unsafe == null) {
            return null;
        }
        try {
            unsafe.arrayBaseOffset(byte[].class);
            return unsafe;
        } catch (Exception unused2) {
            Logger.getLogger(zzix.class.getName()).logp(Level.WARNING, ProtectedSandApp.s("\ud83a"), ProtectedSandApp.s("\ud838"), ProtectedSandApp.s("\ud839"));
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzix.class.getName()).logp(Level.WARNING, ProtectedSandApp.s("\ud83a"), ProtectedSandApp.s("\ud83c"), ProtectedSandApp.s("\ud83b").concat(th.toString()));
    }

    static /* synthetic */ void zzi(Object obj, long j4, boolean z4) {
        Unsafe unsafe = zze.zza;
        long j5 = (-4) & j4;
        int i4 = unsafe.getInt(obj, j5);
        int i5 = ((~((int) j4)) & 3) << 3;
        unsafe.putInt(obj, j5, ((z4 ? 1 : 0) << i5) | ((~(255 << i5)) & i4));
    }

    static /* synthetic */ void zzj(Object obj, long j4, boolean z4) {
        Unsafe unsafe = zze.zza;
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        unsafe.putInt(obj, j5, ((z4 ? 1 : 0) << i4) | ((~(255 << i4)) & unsafe.getInt(obj, j5)));
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
        int i4 = zzfc.zza;
        try {
            Class cls2 = zzc;
            String s4 = ProtectedSandApp.s("\ud83d");
            Class cls3 = Boolean.TYPE;
            cls2.getMethod(s4, cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("\ud83e"), cls, Long.TYPE, cls3);
            String s5 = ProtectedSandApp.s("\ud83f");
            Class cls4 = Integer.TYPE;
            cls2.getMethod(s5, cls, cls4, cls3);
            cls2.getMethod(ProtectedSandApp.s("\ud840"), cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("\ud841"), cls, Byte.TYPE);
            cls2.getMethod(ProtectedSandApp.s("\ud842"), cls);
            cls2.getMethod(ProtectedSandApp.s("\ud843"), cls, byte[].class, cls4, cls4);
            cls2.getMethod(ProtectedSandApp.s("\ud844"), cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzt(Object obj, long j4) {
        return zze.zzf(obj, j4);
    }

    private static int zzu(Class cls) {
        if (zzf) {
            return zze.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    private static int zzv(Class cls) {
        if (zzf) {
            return zze.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzw() {
        int i4 = zzfc.zza;
        Field zzx = zzx(Buffer.class, ProtectedSandApp.s("\ud845"));
        if (zzx != null) {
            return zzx;
        }
        Field zzx2 = zzx(Buffer.class, ProtectedSandApp.s("\ud846"));
        if (zzx2 == null || zzx2.getType() != Long.TYPE) {
            return null;
        }
        return zzx2;
    }

    private static Field zzx(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
