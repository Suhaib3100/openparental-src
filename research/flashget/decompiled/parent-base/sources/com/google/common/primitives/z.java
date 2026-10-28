package com.google.common.primitives;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;

/* compiled from: UnsignedLongs.java */
@d9.a
@f
@d9.b
/* loaded from: classes6.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public static final long f57556a = -1;

    /* compiled from: UnsignedLongs.java */
    enum a implements Comparator<long[]> {
        INSTANCE;

        @Override // java.lang.Enum
        public String toString() {
            return ProtectedSandApp.s("\uf8f8");
        }

        @Override // java.util.Comparator
        public int compare(long[] jArr, long[] jArr2) {
            int min = Math.min(jArr.length, jArr2.length);
            for (int i4 = 0; i4 < min; i4++) {
                long j4 = jArr[i4];
                long j5 = jArr2[i4];
                if (j4 != j5) {
                    return z.a(j4, j5);
                }
            }
            return jArr.length - jArr2.length;
        }
    }

    /* compiled from: UnsignedLongs.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final long[] f57557a = new long[37];

        /* renamed from: b, reason: collision with root package name */
        static final int[] f57558b = new int[37];

        /* renamed from: c, reason: collision with root package name */
        static final int[] f57559c = new int[37];

        static {
            BigInteger bigInteger = new BigInteger(ProtectedSandApp.s("\uf8f9"), 16);
            for (int i4 = 2; i4 <= 36; i4++) {
                long j4 = i4;
                f57557a[i4] = z.c(-1L, j4);
                f57558b[i4] = (int) z.k(-1L, j4);
                f57559c[i4] = bigInteger.toString(i4).length() - 1;
            }
        }

        private b() {
        }

        static boolean a(long j4, int i4, int i5) {
            if (j4 < 0) {
                return true;
            }
            long j5 = f57557a[i5];
            if (j4 < j5) {
                return false;
            }
            return j4 > j5 || i4 > f57558b[i5];
        }
    }

    private z() {
    }

    public static int a(long j4, long j5) {
        return n.d(j4 ^ Long.MIN_VALUE, j5 ^ Long.MIN_VALUE);
    }

    @f9.a
    public static long b(String str) {
        p a5 = p.a(str);
        try {
            return j(a5.f57528a, a5.f57529b);
        } catch (NumberFormatException e4) {
            String valueOf = String.valueOf(str);
            int length = valueOf.length();
            String s4 = ProtectedSandApp.s("\uf8fa");
            NumberFormatException numberFormatException = new NumberFormatException(length != 0 ? s4.concat(valueOf) : new String(s4));
            numberFormatException.initCause(e4);
            throw numberFormatException;
        }
    }

    public static long c(long j4, long j5) {
        if (j5 < 0) {
            return a(j4, j5) < 0 ? 0L : 1L;
        }
        if (j4 >= 0) {
            return j4 / j5;
        }
        long j6 = ((j4 >>> 1) / j5) << 1;
        return j6 + (a(j4 - (j6 * j5), j5) < 0 ? 0 : 1);
    }

    private static long d(long j4) {
        return j4 ^ Long.MIN_VALUE;
    }

    public static String e(String str, long... jArr) {
        str.getClass();
        if (jArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder(jArr.length * 5);
        sb.append(q(jArr[0], 10));
        for (int i4 = 1; i4 < jArr.length; i4++) {
            sb.append(str);
            sb.append(q(jArr[i4], 10));
        }
        return sb.toString();
    }

    public static Comparator<long[]> f() {
        return a.INSTANCE;
    }

    public static long g(long... jArr) {
        l0.d(jArr.length > 0);
        long j4 = jArr[0] ^ Long.MIN_VALUE;
        for (int i4 = 1; i4 < jArr.length; i4++) {
            long j5 = jArr[i4] ^ Long.MIN_VALUE;
            if (j5 > j4) {
                j4 = j5;
            }
        }
        return j4 ^ Long.MIN_VALUE;
    }

    public static long h(long... jArr) {
        l0.d(jArr.length > 0);
        long j4 = jArr[0] ^ Long.MIN_VALUE;
        for (int i4 = 1; i4 < jArr.length; i4++) {
            long j5 = jArr[i4] ^ Long.MIN_VALUE;
            if (j5 < j4) {
                j4 = j5;
            }
        }
        return j4 ^ Long.MIN_VALUE;
    }

    @f9.a
    public static long i(String str) {
        return j(str, 10);
    }

    @f9.a
    public static long j(String str, int i4) {
        str.getClass();
        if (str.length() == 0) {
            throw new NumberFormatException(ProtectedSandApp.s("\uf8fd"));
        }
        if (i4 < 2 || i4 > 36) {
            throw new NumberFormatException(com.google.android.gms.internal.location.a.a(26, ProtectedSandApp.s("\uf8fc"), i4));
        }
        int i5 = b.f57559c[i4] - 1;
        long j4 = 0;
        for (int i6 = 0; i6 < str.length(); i6++) {
            int digit = Character.digit(str.charAt(i6), i4);
            if (digit == -1) {
                throw new NumberFormatException(str);
            }
            if (i6 > i5 && b.a(j4, digit, i4)) {
                int length = str.length();
                String s4 = ProtectedSandApp.s("\uf8fb");
                throw new NumberFormatException(length != 0 ? s4.concat(str) : new String(s4));
            }
            j4 = (j4 * i4) + digit;
        }
        return j4;
    }

    public static long k(long j4, long j5) {
        if (j5 < 0) {
            return a(j4, j5) < 0 ? j4 : j4 - j5;
        }
        if (j4 >= 0) {
            return j4 % j5;
        }
        long j6 = j4 - ((((j4 >>> 1) / j5) << 1) * j5);
        if (a(j6, j5) < 0) {
            j5 = 0;
        }
        return j6 - j5;
    }

    public static void l(long[] jArr) {
        jArr.getClass();
        m(jArr, 0, jArr.length);
    }

    public static void m(long[] jArr, int i4, int i5) {
        jArr.getClass();
        l0.f0(i4, i5, jArr.length);
        for (int i6 = i4; i6 < i5; i6++) {
            jArr[i6] = Long.MIN_VALUE ^ jArr[i6];
        }
        Arrays.sort(jArr, i4, i5);
        while (i4 < i5) {
            jArr[i4] = jArr[i4] ^ Long.MIN_VALUE;
            i4++;
        }
    }

    public static void n(long[] jArr) {
        jArr.getClass();
        o(jArr, 0, jArr.length);
    }

    public static void o(long[] jArr, int i4, int i5) {
        jArr.getClass();
        l0.f0(i4, i5, jArr.length);
        for (int i6 = i4; i6 < i5; i6++) {
            jArr[i6] = Long.MAX_VALUE ^ jArr[i6];
        }
        Arrays.sort(jArr, i4, i5);
        while (i4 < i5) {
            jArr[i4] = jArr[i4] ^ Long.MAX_VALUE;
            i4++;
        }
    }

    public static String p(long j4) {
        return q(j4, 10);
    }

    public static String q(long j4, int i4) {
        l0.k(i4 >= 2 && i4 <= 36, ProtectedSandApp.s("\uf8fe"), i4);
        if (j4 == 0) {
            return ProtectedSandApp.s("\uf8ff");
        }
        if (j4 > 0) {
            return Long.toString(j4, i4);
        }
        int i5 = 64;
        char[] cArr = new char[64];
        int i6 = i4 - 1;
        if ((i4 & i6) == 0) {
            int numberOfTrailingZeros = Integer.numberOfTrailingZeros(i4);
            do {
                i5--;
                cArr[i5] = Character.forDigit(((int) j4) & i6, i4);
                j4 >>>= numberOfTrailingZeros;
            } while (j4 != 0);
        } else {
            long c5 = (i4 & 1) == 0 ? (j4 >>> 1) / (i4 >>> 1) : c(j4, i4);
            long j5 = i4;
            int i7 = 63;
            cArr[63] = Character.forDigit((int) (j4 - (c5 * j5)), i4);
            while (c5 > 0) {
                i7--;
                cArr[i7] = Character.forDigit((int) (c5 % j5), i4);
                c5 /= j5;
            }
            i5 = i7;
        }
        return new String(cArr, i5, 64 - i5);
    }
}
