package com.google.android.libraries.places.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.libraries.places:places@@2.6.0 */
/* loaded from: classes5.dex */
final class zzagd {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzagc zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Removed duplicated region for block: B:15:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071  */
    static {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.zzagd.<clinit>():void");
    }

    private zzagd() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zzi(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i4 = zzace.zza;
        Field zzC = zzC(Buffer.class, ProtectedSandApp.s("\ue7dd"));
        if (zzC != null) {
            return zzC;
        }
        Field zzC2 = zzC(Buffer.class, ProtectedSandApp.s("\ue7de"));
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
    public static void zzD(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        zzagc zzagcVar = zzf;
        int zzj = zzagcVar.zzj(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        zzagcVar.zzn(obj, j5, ((255 & b5) << i4) | (zzj & (~(255 << i4))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        zzagc zzagcVar = zzf;
        int i4 = (((int) j4) & 3) << 3;
        zzagcVar.zzn(obj, j5, ((255 & b5) << i4) | (zzagcVar.zzj(obj, j5) & (~(255 << i4))));
    }

    static double zza(Object obj, long j4) {
        return zzf.zza(obj, j4);
    }

    static float zzb(Object obj, long j4) {
        return zzf.zzb(obj, j4);
    }

    static int zzc(Object obj, long j4) {
        return zzf.zzj(obj, j4);
    }

    static long zzd(Object obj, long j4) {
        return zzf.zzk(obj, j4);
    }

    static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    static Object zzf(Object obj, long j4) {
        return zzf.zzm(obj, j4);
    }

    static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzafz());
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzagd.class.getName()).logp(Level.WARNING, ProtectedSandApp.s("\ue7e0"), ProtectedSandApp.s("\ue7e1"), ProtectedSandApp.s("\ue7df").concat(th.toString()));
    }

    static void zzm(Object obj, long j4, boolean z4) {
        zzf.zzc(obj, j4, z4);
    }

    static void zzn(byte[] bArr, long j4, byte b5) {
        zzf.zzd(bArr, zza + j4, b5);
    }

    static void zzo(Object obj, long j4, double d5) {
        zzf.zze(obj, j4, d5);
    }

    static void zzp(Object obj, long j4, float f4) {
        zzf.zzf(obj, j4, f4);
    }

    static void zzq(Object obj, long j4, int i4) {
        zzf.zzn(obj, j4, i4);
    }

    static void zzr(Object obj, long j4, long j5) {
        zzf.zzo(obj, j4, j5);
    }

    static void zzs(Object obj, long j4, Object obj2) {
        zzf.zzp(obj, j4, obj2);
    }

    static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j4) {
        return ((byte) ((zzf.zzj(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3))) & 255)) != 0;
    }

    static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j4) {
        return ((byte) ((zzf.zzj(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3))) & 255)) != 0;
    }

    static boolean zzv(Class cls) {
        int i4 = zzace.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod(ProtectedSandApp.s("\ue7e2"), cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("\ue7e3"), cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod(ProtectedSandApp.s("\ue7e4"), cls, cls4, cls3);
            cls2.getMethod(ProtectedSandApp.s("\ue7e5"), cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("\ue7e6"), cls, Byte.TYPE);
            cls2.getMethod(ProtectedSandApp.s("\ue7e7"), cls);
            cls2.getMethod(ProtectedSandApp.s("\ue7e8"), cls, byte[].class, cls4, cls4);
            cls2.getMethod(ProtectedSandApp.s("\ue7e9"), cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static boolean zzw(Object obj, long j4) {
        return zzf.zzg(obj, j4);
    }

    static boolean zzx() {
        return zzh;
    }

    static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zzh(cls);
        }
        return -1;
    }
}
