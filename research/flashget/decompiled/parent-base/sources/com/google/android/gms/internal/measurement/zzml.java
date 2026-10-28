package com.google.android.gms.internal.measurement;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import sun.misc.Unsafe;

/* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
/* loaded from: classes5.dex */
final class zzml {
    static final boolean zza;
    private static final Unsafe zzb;
    private static final Class<?> zzc;
    private static final boolean zzd;
    private static final boolean zze;
    private static final zzb zzf;
    private static final boolean zzg;
    private static final boolean zzh;
    private static final long zzi;

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    private static final class zza extends zzb {
        zza(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final double zza(Object obj, long j4) {
            return Double.longBitsToDouble(zze(obj, j4));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final float zzb(Object obj, long j4) {
            return Float.intBitsToFloat(zzd(obj, j4));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final boolean zzc(Object obj, long j4) {
            return zzml.zza ? zzml.zzf(obj, j4) : zzml.zzg(obj, j4);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j4, boolean z4) {
            if (zzml.zza) {
                zzml.zza(obj, j4, z4);
            } else {
                zzml.zzb(obj, j4, z4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j4, byte b5) {
            if (!zzml.zza) {
                zzml.zzd(obj, j4, b5);
            } else {
                zzml.zzc(obj, j4, b5);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j4, double d5) {
            zza(obj, j4, Double.doubleToLongBits(d5));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j4, float f4) {
            zza(obj, j4, Float.floatToIntBits(f4));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    private static abstract class zzb {
        Unsafe zza;

        zzb(Unsafe unsafe) {
            this.zza = unsafe;
        }

        public abstract double zza(Object obj, long j4);

        public abstract void zza(Object obj, long j4, byte b5);

        public abstract void zza(Object obj, long j4, double d5);

        public abstract void zza(Object obj, long j4, float f4);

        public final void zza(Object obj, long j4, int i4) {
            this.zza.putInt(obj, j4, i4);
        }

        public abstract void zza(Object obj, long j4, boolean z4);

        public abstract float zzb(Object obj, long j4);

        public final boolean zzb() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod(ProtectedSandApp.s("핓"), Field.class);
                cls.getMethod(ProtectedSandApp.s("하"), Object.class, Long.TYPE);
                return zzml.zze() != null;
            } catch (Throwable th) {
                zzml.zza(th);
                return false;
            }
        }

        public abstract boolean zzc(Object obj, long j4);

        public final int zzd(Object obj, long j4) {
            return this.zza.getInt(obj, j4);
        }

        public final long zze(Object obj, long j4) {
            return this.zza.getLong(obj, j4);
        }

        public final void zza(Object obj, long j4, long j5) {
            this.zza.putLong(obj, j4, j5);
        }

        public final boolean zza() {
            Unsafe unsafe = this.zza;
            if (unsafe == null) {
                return false;
            }
            try {
                Class<?> cls = unsafe.getClass();
                cls.getMethod(ProtectedSandApp.s("핓"), Field.class);
                cls.getMethod(ProtectedSandApp.s("핔"), Class.class);
                cls.getMethod(ProtectedSandApp.s("핕"), Class.class);
                String s4 = ProtectedSandApp.s("핖");
                Class cls2 = Long.TYPE;
                cls.getMethod(s4, Object.class, cls2);
                cls.getMethod(ProtectedSandApp.s("핗"), Object.class, cls2, Integer.TYPE);
                cls.getMethod(ProtectedSandApp.s("하"), Object.class, cls2);
                cls.getMethod(ProtectedSandApp.s("학"), Object.class, cls2, cls2);
                cls.getMethod(ProtectedSandApp.s("핚"), Object.class, cls2);
                cls.getMethod(ProtectedSandApp.s("핛"), Object.class, cls2, Object.class);
                return true;
            } catch (Throwable th) {
                zzml.zza(th);
                return false;
            }
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-base@@22.1.2 */
    private static final class zzc extends zzb {
        zzc(Unsafe unsafe) {
            super(unsafe);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final double zza(Object obj, long j4) {
            return Double.longBitsToDouble(zze(obj, j4));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final float zzb(Object obj, long j4) {
            return Float.intBitsToFloat(zzd(obj, j4));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final boolean zzc(Object obj, long j4) {
            return zzml.zza ? zzml.zzf(obj, j4) : zzml.zzg(obj, j4);
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j4, boolean z4) {
            if (zzml.zza) {
                zzml.zza(obj, j4, z4);
            } else {
                zzml.zzb(obj, j4, z4);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j4, byte b5) {
            if (!zzml.zza) {
                zzml.zzd(obj, j4, b5);
            } else {
                zzml.zzc(obj, j4, b5);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j4, double d5) {
            zza(obj, j4, Double.doubleToLongBits(d5));
        }

        @Override // com.google.android.gms.internal.measurement.zzml.zzb
        public final void zza(Object obj, long j4, float f4) {
            zza(obj, j4, Float.floatToIntBits(f4));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0034  */
    static {
        /*
            sun.misc.Unsafe r0 = zzb()
            com.google.android.gms.internal.measurement.zzml.zzb = r0
            java.lang.Class r1 = com.google.android.gms.internal.measurement.zzih.zza()
            com.google.android.gms.internal.measurement.zzml.zzc = r1
            java.lang.Class r1 = java.lang.Long.TYPE
            boolean r1 = zzd(r1)
            com.google.android.gms.internal.measurement.zzml.zzd = r1
            java.lang.Class r2 = java.lang.Integer.TYPE
            boolean r2 = zzd(r2)
            com.google.android.gms.internal.measurement.zzml.zze = r2
            if (r0 == 0) goto L2e
            if (r1 == 0) goto L26
            com.google.android.gms.internal.measurement.zzml$zzc r1 = new com.google.android.gms.internal.measurement.zzml$zzc
            r1.<init>(r0)
            goto L2f
        L26:
            if (r2 == 0) goto L2e
            com.google.android.gms.internal.measurement.zzml$zza r1 = new com.google.android.gms.internal.measurement.zzml$zza
            r1.<init>(r0)
            goto L2f
        L2e:
            r1 = 0
        L2f:
            com.google.android.gms.internal.measurement.zzml.zzf = r1
            r0 = 0
            if (r1 != 0) goto L36
            r2 = r0
            goto L3a
        L36:
            boolean r2 = r1.zzb()
        L3a:
            com.google.android.gms.internal.measurement.zzml.zzg = r2
            if (r1 != 0) goto L40
            r2 = r0
            goto L44
        L40:
            boolean r2 = r1.zza()
        L44:
            com.google.android.gms.internal.measurement.zzml.zzh = r2
            java.lang.Class<byte[]> r2 = byte[].class
            int r2 = zzb(r2)
            long r2 = (long) r2
            com.google.android.gms.internal.measurement.zzml.zzi = r2
            java.lang.Class<boolean[]> r2 = boolean[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<int[]> r2 = int[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<long[]> r2 = long[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<float[]> r2 = float[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<double[]> r2 = double[].class
            zzb(r2)
            zzc(r2)
            java.lang.Class<java.lang.Object[]> r2 = java.lang.Object[].class
            zzb(r2)
            zzc(r2)
            java.lang.reflect.Field r2 = zze()
            if (r2 == 0) goto L8d
            if (r1 != 0) goto L88
            goto L8d
        L88:
            sun.misc.Unsafe r1 = r1.zza
            r1.objectFieldOffset(r2)
        L8d:
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r1 != r2) goto L96
            r0 = 1
        L96:
            com.google.android.gms.internal.measurement.zzml.zza = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzml.<clinit>():void");
    }

    private zzml() {
    }

    private static int zzc(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    static long zzd(Object obj, long j4) {
        return zzf.zze(obj, j4);
    }

    static Object zze(Object obj, long j4) {
        return zzf.zza.getObject(obj, j4);
    }

    static /* synthetic */ boolean zzf(Object obj, long j4) {
        return ((byte) (zzc(obj, (-4) & j4) >>> ((int) (((~j4) & 3) << 3)))) != 0;
    }

    static /* synthetic */ boolean zzg(Object obj, long j4) {
        return ((byte) (zzc(obj, (-4) & j4) >>> ((int) ((j4 & 3) << 3)))) != 0;
    }

    static boolean zzh(Object obj, long j4) {
        return zzf.zzc(obj, j4);
    }

    static float zzb(Object obj, long j4) {
        return zzf.zzb(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzd(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        int i4 = (((int) j4) & 3) << 3;
        zza(obj, j5, ((255 & b5) << i4) | (zzc(obj, j5) & (~(255 << i4))));
    }

    static double zza(Object obj, long j4) {
        return zzf.zza(obj, j4);
    }

    private static int zzb(Class<?> cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }

    static int zzc(Object obj, long j4) {
        return zzf.zzd(obj, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Field zze() {
        Field zza2 = zza((Class<?>) Buffer.class, ProtectedSandApp.s("핧"));
        if (zza2 != null) {
            return zza2;
        }
        Field zza3 = zza((Class<?>) Buffer.class, ProtectedSandApp.s("함"));
        if (zza3 == null || zza3.getType() != Long.TYPE) {
            return null;
        }
        return zza3;
    }

    static <T> T zza(Class<T> cls) {
        try {
            return (T) zzb.allocateInstance(cls);
        } catch (InstantiationException e4) {
            throw new IllegalStateException(e4);
        }
    }

    static void zzc(Object obj, long j4, boolean z4) {
        zzf.zza(obj, j4, z4);
    }

    private static boolean zzd(Class<?> cls) {
        try {
            Class<?> cls2 = zzc;
            String s4 = ProtectedSandApp.s("핟");
            Class cls3 = Boolean.TYPE;
            cls2.getMethod(s4, cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("할"), cls, Long.TYPE, cls3);
            String s5 = ProtectedSandApp.s("핡");
            Class cls4 = Integer.TYPE;
            cls2.getMethod(s5, cls, cls4, cls3);
            cls2.getMethod(ProtectedSandApp.s("핢"), cls, cls3);
            cls2.getMethod(ProtectedSandApp.s("핣"), cls, Byte.TYPE);
            cls2.getMethod(ProtectedSandApp.s("핤"), cls);
            cls2.getMethod(ProtectedSandApp.s("핥"), cls, byte[].class, cls4, cls4);
            cls2.getMethod(ProtectedSandApp.s("핦"), cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static Unsafe zzb() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzmn());
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzc(Object obj, long j4, byte b5) {
        long j5 = (-4) & j4;
        int zzc2 = zzc(obj, j5);
        int i4 = ((~((int) j4)) & 3) << 3;
        zza(obj, j5, ((255 & b5) << i4) | (zzc2 & (~(255 << i4))));
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    static /* synthetic */ void zza(Throwable th) {
        Logger.getLogger(zzml.class.getName()).logp(Level.WARNING, ProtectedSandApp.s("핝"), ProtectedSandApp.s("핞"), ProtectedSandApp.s("한").concat(String.valueOf(th)));
    }

    static /* synthetic */ void zzb(Object obj, long j4, boolean z4) {
        zzd(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    static boolean zzc() {
        return zzh;
    }

    static /* synthetic */ void zza(Object obj, long j4, boolean z4) {
        zzc(obj, j4, z4 ? (byte) 1 : (byte) 0);
    }

    static void zza(byte[] bArr, long j4, byte b5) {
        zzf.zza((Object) bArr, zzi + j4, b5);
    }

    static void zza(Object obj, long j4, double d5) {
        zzf.zza(obj, j4, d5);
    }

    static void zza(Object obj, long j4, float f4) {
        zzf.zza(obj, j4, f4);
    }

    static void zza(Object obj, long j4, int i4) {
        zzf.zza(obj, j4, i4);
    }

    static boolean zzd() {
        return zzg;
    }

    static void zza(Object obj, long j4, long j5) {
        zzf.zza(obj, j4, j5);
    }

    static void zza(Object obj, long j4, Object obj2) {
        zzf.zza.putObject(obj, j4, obj2);
    }
}
