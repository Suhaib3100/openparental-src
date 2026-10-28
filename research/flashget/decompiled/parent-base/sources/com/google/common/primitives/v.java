package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.lang.reflect.Field;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import sun.misc.Unsafe;

/* compiled from: UnsignedBytes.java */
@f
@d9.c
/* loaded from: classes6.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public static final byte f57541a = Byte.MIN_VALUE;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f57542b = -1;

    /* renamed from: c, reason: collision with root package name */
    private static final int f57543c = 255;

    /* compiled from: UnsignedBytes.java */
    @d9.d
    static class a {

        /* renamed from: a, reason: collision with root package name */
        static final String f57544a = a.class.getName().concat(ProtectedSandApp.s("\uf8ea"));

        /* renamed from: b, reason: collision with root package name */
        static final Comparator<byte[]> f57545b = a();

        /* compiled from: UnsignedBytes.java */
        /* renamed from: com.google.common.primitives.v$a$a, reason: collision with other inner class name */
        enum EnumC0878a implements Comparator<byte[]> {
            INSTANCE;

            @Override // java.lang.Enum
            public String toString() {
                return ProtectedSandApp.s("\uf8e3");
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                for (int i4 = 0; i4 < min; i4++) {
                    int b5 = v.b(bArr[i4], bArr2[i4]);
                    if (b5 != 0) {
                        return b5;
                    }
                }
                return bArr.length - bArr2.length;
            }
        }

        /* compiled from: UnsignedBytes.java */
        @d9.d
        enum b implements Comparator<byte[]> {
            INSTANCE;

            static final boolean BIG_ENDIAN = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN);
            static final int BYTE_ARRAY_BASE_OFFSET;
            static final Unsafe theUnsafe;

            /* compiled from: UnsignedBytes.java */
            /* renamed from: com.google.common.primitives.v$a$b$a, reason: collision with other inner class name */
            class C0879a implements PrivilegedExceptionAction<Unsafe> {
                C0879a() {
                }

                @Override // java.security.PrivilegedExceptionAction
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Unsafe run() throws Exception {
                    for (Field field : Unsafe.class.getDeclaredFields()) {
                        field.setAccessible(true);
                        Object obj = field.get(null);
                        if (Unsafe.class.isInstance(obj)) {
                            return (Unsafe) Unsafe.class.cast(obj);
                        }
                    }
                    throw new NoSuchFieldError(ProtectedSandApp.s("\uf8e4"));
                }
            }

            static {
                Unsafe unsafe = getUnsafe();
                theUnsafe = unsafe;
                int arrayBaseOffset = unsafe.arrayBaseOffset(byte[].class);
                BYTE_ARRAY_BASE_OFFSET = arrayBaseOffset;
                if (!ProtectedSandApp.s("\uf8e7").equals(System.getProperty(ProtectedSandApp.s("\uf8e6"))) || arrayBaseOffset % 8 != 0 || unsafe.arrayIndexScale(byte[].class) != 1) {
                    throw new Error();
                }
            }

            private static Unsafe getUnsafe() {
                try {
                    try {
                        return Unsafe.getUnsafe();
                    } catch (PrivilegedActionException e4) {
                        throw new RuntimeException(ProtectedSandApp.s("\uf8e8"), e4.getCause());
                    }
                } catch (SecurityException unused) {
                    return (Unsafe) AccessController.doPrivileged(new C0879a());
                }
            }

            @Override // java.lang.Enum
            public String toString() {
                return ProtectedSandApp.s("\uf8e9");
            }

            @Override // java.util.Comparator
            public int compare(byte[] bArr, byte[] bArr2) {
                int min = Math.min(bArr.length, bArr2.length);
                int i4 = min & (-8);
                int i5 = 0;
                while (i5 < i4) {
                    Unsafe unsafe = theUnsafe;
                    int i6 = BYTE_ARRAY_BASE_OFFSET;
                    long j4 = i5;
                    long j5 = unsafe.getLong(bArr, i6 + j4);
                    long j6 = unsafe.getLong(bArr2, i6 + j4);
                    if (j5 != j6) {
                        if (BIG_ENDIAN) {
                            return z.a(j5, j6);
                        }
                        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j5 ^ j6) & (-8);
                        return ((int) ((j5 >>> numberOfTrailingZeros) & 255)) - ((int) ((j6 >>> numberOfTrailingZeros) & 255));
                    }
                    i5 += 8;
                }
                while (i5 < min) {
                    int b5 = v.b(bArr[i5], bArr2[i5]);
                    if (b5 != 0) {
                        return b5;
                    }
                    i5++;
                }
                return bArr.length - bArr2.length;
            }
        }

        a() {
        }

        static Comparator<byte[]> a() {
            try {
                Object[] enumConstants = Class.forName(f57544a).getEnumConstants();
                Objects.requireNonNull(enumConstants);
                return (Comparator) enumConstants[0];
            } catch (Throwable unused) {
                return EnumC0878a.INSTANCE;
            }
        }
    }

    private v() {
    }

    @f9.a
    public static byte a(long j4) {
        l0.p((j4 >> 8) == 0, ProtectedSandApp.s("\uf8eb"), j4);
        return (byte) j4;
    }

    public static int b(byte b5, byte b6) {
        return (b5 & 255) - (b6 & 255);
    }

    private static byte c(byte b5) {
        return (byte) (b5 ^ 128);
    }

    public static String d(String str, byte... bArr) {
        str.getClass();
        if (bArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder((str.length() + 3) * bArr.length);
        sb.append(bArr[0] & 255);
        for (int i4 = 1; i4 < bArr.length; i4++) {
            sb.append(str);
            sb.append(r(bArr[i4], 10));
        }
        return sb.toString();
    }

    public static Comparator<byte[]> e() {
        return a.f57545b;
    }

    @d9.d
    static Comparator<byte[]> f() {
        return a.EnumC0878a.INSTANCE;
    }

    public static byte g(byte... bArr) {
        l0.d(bArr.length > 0);
        int i4 = bArr[0] & 255;
        for (int i5 = 1; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & 255;
            if (i6 > i4) {
                i4 = i6;
            }
        }
        return (byte) i4;
    }

    public static byte h(byte... bArr) {
        l0.d(bArr.length > 0);
        int i4 = bArr[0] & 255;
        for (int i5 = 1; i5 < bArr.length; i5++) {
            int i6 = bArr[i5] & 255;
            if (i6 < i4) {
                i4 = i6;
            }
        }
        return (byte) i4;
    }

    @d9.a
    @f9.a
    public static byte i(String str) {
        return j(str, 10);
    }

    @d9.a
    @f9.a
    public static byte j(String str, int i4) {
        str.getClass();
        int parseInt = Integer.parseInt(str, i4);
        if ((parseInt >> 8) == 0) {
            return (byte) parseInt;
        }
        throw new NumberFormatException(com.google.android.gms.internal.location.a.a(25, ProtectedSandApp.s("\uf8ec"), parseInt));
    }

    public static byte k(long j4) {
        if (j4 > 255) {
            return (byte) -1;
        }
        if (j4 < 0) {
            return (byte) 0;
        }
        return (byte) j4;
    }

    public static void l(byte[] bArr) {
        bArr.getClass();
        m(bArr, 0, bArr.length);
    }

    public static void m(byte[] bArr, int i4, int i5) {
        bArr.getClass();
        l0.f0(i4, i5, bArr.length);
        for (int i6 = i4; i6 < i5; i6++) {
            bArr[i6] = (byte) (bArr[i6] ^ 128);
        }
        Arrays.sort(bArr, i4, i5);
        while (i4 < i5) {
            bArr[i4] = (byte) (bArr[i4] ^ 128);
            i4++;
        }
    }

    public static void n(byte[] bArr) {
        bArr.getClass();
        o(bArr, 0, bArr.length);
    }

    public static void o(byte[] bArr, int i4, int i5) {
        bArr.getClass();
        l0.f0(i4, i5, bArr.length);
        for (int i6 = i4; i6 < i5; i6++) {
            bArr[i6] = (byte) (bArr[i6] ^ Byte.MAX_VALUE);
        }
        Arrays.sort(bArr, i4, i5);
        while (i4 < i5) {
            bArr[i4] = (byte) (bArr[i4] ^ Byte.MAX_VALUE);
            i4++;
        }
    }

    public static int p(byte b5) {
        return b5 & 255;
    }

    @d9.a
    public static String q(byte b5) {
        return r(b5, 10);
    }

    @d9.a
    public static String r(byte b5, int i4) {
        l0.k(i4 >= 2 && i4 <= 36, ProtectedSandApp.s("\uf8ed"), i4);
        return Integer.toString(b5 & 255, i4);
    }
}
