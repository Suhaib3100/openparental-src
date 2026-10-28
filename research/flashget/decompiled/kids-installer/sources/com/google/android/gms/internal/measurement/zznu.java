package com.google.android.gms.internal.measurement;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.3.0 */
/* loaded from: classes2.dex */
final class zznu {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zznt zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    static {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zznu.<clinit>():void");
    }

    private zznu() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i5 = zzjm.zza;
        Field zzC = zzC(Buffer.class, ProtectedSandApp.s("๎"));
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, ProtectedSandApp.s("๏"));
        if (zzC2 == null || zzC2.getType() != Long.TYPE) {
            return null;
        }
        return zzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j5, byte b6) {
        zznt zzntVar = zzf;
        long j6 = (-4) & j5;
        int i5 = zzntVar.zza.getInt(obj, j6);
        int i6 = ((~((int) j5)) & 3) << 3;
        zzntVar.zza.putInt(obj, j6, ((255 & b6) << i6) | (i5 & (~(255 << i6))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j5, byte b6) {
        zznt zzntVar = zzf;
        long j6 = (-4) & j5;
        int i5 = (((int) j5) & 3) << 3;
        zzntVar.zza.putInt(obj, j6, ((255 & b6) << i5) | (zzntVar.zza.getInt(obj, j6) & (~(255 << i5))));
    }

    static double zza(Object obj, long j5) {
        return zzf.zza(obj, j5);
    }

    static float zzb(Object obj, long j5) {
        return zzf.zzb(obj, j5);
    }

    static int zzc(Object obj, long j5) {
        return zzf.zza.getInt(obj, j5);
    }

    static long zzd(Object obj, long j5) {
        return zzf.zza.getLong(obj, j5);
    }

    static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e6) {
            throw new IllegalStateException(e6);
        }
    }

    static Object zzf(Object obj, long j5) {
        return zzf.zza.getObject(obj, j5);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zznq());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zznu.class.getName()).logp(Level.WARNING, ProtectedSandApp.s("๑"), ProtectedSandApp.s("๒"), ProtectedSandApp.s("๐").concat(th.toString()));
    }

    static void zzm(Object obj, long j5, boolean z5) {
        zzf.zzc(obj, j5, z5);
    }

    static void zzn(byte[] bArr, long j5, byte b6) {
        zzf.zzd(bArr, zza + j5, b6);
    }

    static void zzo(Object obj, long j5, double d6) {
        zzf.zze(obj, j5, d6);
    }

    static void zzp(Object obj, long j5, float f6) {
        zzf.zzf(obj, j5, f6);
    }

    static void zzq(Object obj, long j5, int i5) {
        zzf.zza.putInt(obj, j5, i5);
    }

    static void zzr(Object obj, long j5, long j6) {
        zzf.zza.putLong(obj, j5, j6);
    }

    static void zzs(Object obj, long j5, Object obj2) {
        zzf.zza.putObject(obj, j5, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j5) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j5) >>> ((int) (((~j5) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j5) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j5) >>> ((int) ((j5 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static boolean zzv(Class cls) {
        int i5 = zzjm.zza;
        try {
            Class cls2 = zzd;
            String s5 = ProtectedSandApp.s("๓");
            Class cls3 = Boolean.TYPE;
            cls2.getMethod(s5, cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("๔"), cls, Long.TYPE, cls3);
            String s6 = ProtectedSandApp.s("๕");
            Class cls4 = Integer.TYPE;
            cls2.getMethod(s6, cls, cls4, cls3);
            cls2.getMethod(ProtectedSandApp.s("๖"), cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("๗"), cls, Byte.TYPE);
            cls2.getMethod(ProtectedSandApp.s("๘"), cls);
            cls2.getMethod(ProtectedSandApp.s("๙"), cls, byte[].class, cls4, cls4);
            cls2.getMethod(ProtectedSandApp.s("๚"), cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzw(Object obj, long j5) {
        return zzf.zzg(obj, j5);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
