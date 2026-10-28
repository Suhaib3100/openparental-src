package com.google.common.math;

import androidx.work.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.google.common.primitives.z;
import java.math.RoundingMode;
import org.apache.http.HttpStatus;

/* compiled from: LongMath.java */
@e
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    @d9.d
    static final long f57216a = 4611686018427387904L;

    /* renamed from: b, reason: collision with root package name */
    @d9.d
    static final long f57217b = -5402926248376769404L;

    /* renamed from: f, reason: collision with root package name */
    @d9.d
    static final long f57221f = 3037000499L;

    /* renamed from: j, reason: collision with root package name */
    private static final int f57225j = -545925251;

    /* renamed from: c, reason: collision with root package name */
    @d9.d
    static final byte[] f57218c = {19, com.google.common.base.c.f54875u, com.google.common.base.c.f54875u, com.google.common.base.c.f54875u, com.google.common.base.c.f54875u, 17, 17, 17, com.google.common.base.c.f54872r, com.google.common.base.c.f54872r, com.google.common.base.c.f54872r, com.google.common.base.c.f54871q, com.google.common.base.c.f54871q, com.google.common.base.c.f54871q, com.google.common.base.c.f54871q, 14, 14, 14, 13, 13, 13, 12, 12, 12, 12, 11, 11, 11, 10, 10, 10, 9, 9, 9, 9, 8, 8, 8, 7, 7, 7, 6, 6, 6, 6, 5, 5, 5, 4, 4, 4, 3, 3, 3, 3, 2, 2, 2, 1, 1, 1, 0, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    @d9.d
    @d9.c
    static final long[] f57219d = {1, 10, 100, 1000, i0.f35991f, 100000, 1000000, 10000000, 100000000, 1000000000, okhttp3.internal.connection.f.f84407v, 100000000000L, 1000000000000L, 10000000000000L, 100000000000000L, 1000000000000000L, 10000000000000000L, 100000000000000000L, 1000000000000000000L};

    /* renamed from: e, reason: collision with root package name */
    @d9.d
    @d9.c
    static final long[] f57220e = {3, 31, 316, 3162, 31622, 316227, 3162277, 31622776, 316227766, 3162277660L, 31622776601L, 316227766016L, 3162277660168L, 31622776601683L, 316227766016837L, 3162277660168379L, 31622776601683793L, 316227766016837933L, 3162277660168379331L};

    /* renamed from: g, reason: collision with root package name */
    static final long[] f57222g = {1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800, 39916800, 479001600, 6227020800L, 87178291200L, 1307674368000L, 20922789888000L, 355687428096000L, 6402373705728000L, 121645100408832000L, 2432902008176640000L};

    /* renamed from: h, reason: collision with root package name */
    static final int[] f57223h = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 3810779, 121977, 16175, 4337, 1733, 887, 534, 361, 265, 206, 169, 143, 125, 111, 101, 94, 88, 83, 79, 76, 74, 72, 70, 69, 68, 67, 67, 66, 66, 66, 66};

    /* renamed from: i, reason: collision with root package name */
    @d9.d
    static final int[] f57224i = {Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, 2642246, 86251, 11724, 3218, 1313, 684, HttpStatus.SC_INSUFFICIENT_SPACE_ON_RESOURCE, 287, 214, 169, 139, 119, 105, 95, 87, 81, 76, 73, 70, 68, 66, 64, 63, 62, 62, 61, 61, 61};

    /* renamed from: k, reason: collision with root package name */
    private static final long[][] f57226k = {new long[]{291830, 126401071349994536L}, new long[]{885594168, 725270293939359937L, 3569819667048198375L}, new long[]{273919523040L, 15, 7363882082L, 992620450144556L}, new long[]{47636622961200L, 2, 2570940, 211991001, 3749873356L}, new long[]{7999252175582850L, 2, 4130806001517L, 149795463772692060L, 186635894390467037L, 3967304179347715805L}, new long[]{585226005592931976L, 2, 123635709730000L, 9233062284813009L, 43835965440333360L, 761179012939631437L, 1263739024124850375L}, new long[]{Long.MAX_VALUE, 2, 325, 9375, 28178, 450775, 9780504, 1795265022}};

    /* compiled from: LongMath.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57227a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f57227a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57227a[RoundingMode.DOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57227a[RoundingMode.FLOOR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57227a[RoundingMode.UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57227a[RoundingMode.CEILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57227a[RoundingMode.HALF_DOWN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57227a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57227a[RoundingMode.HALF_EVEN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LongMath.java */
    private static abstract class b {
        public static final b SMALL = new a(ProtectedSandApp.s("\uf6fd"), 0);
        public static final b LARGE = new C0876b(ProtectedSandApp.s("\uf6fe"), 1);
        private static final /* synthetic */ b[] $VALUES = $values();

        /* compiled from: LongMath.java */
        enum a extends b {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.math.h.b
            long mulMod(long j4, long j5, long j6) {
                return (j4 * j5) % j6;
            }

            @Override // com.google.common.math.h.b
            long squareMod(long j4, long j5) {
                return (j4 * j4) % j5;
            }
        }

        /* compiled from: LongMath.java */
        /* renamed from: com.google.common.math.h$b$b, reason: collision with other inner class name */
        enum C0876b extends b {
            C0876b(String str, int i4) {
                super(str, i4, null);
            }

            private long plusMod(long j4, long j5, long j6) {
                long j7 = j4 + j5;
                return j4 >= j6 - j5 ? j7 - j6 : j7;
            }

            private long times2ToThe32Mod(long j4, long j5) {
                int i4 = 32;
                do {
                    int min = Math.min(i4, Long.numberOfLeadingZeros(j4));
                    j4 = z.k(j4 << min, j5);
                    i4 -= min;
                } while (i4 > 0);
                return j4;
            }

            @Override // com.google.common.math.h.b
            long mulMod(long j4, long j5, long j6) {
                long j7 = j4 >>> 32;
                long j10 = j5 >>> 32;
                long j11 = j4 & 4294967295L;
                long j12 = j5 & 4294967295L;
                long times2ToThe32Mod = (j7 * j12) + times2ToThe32Mod(j7 * j10, j6);
                if (times2ToThe32Mod < 0) {
                    times2ToThe32Mod = z.k(times2ToThe32Mod, j6);
                }
                return plusMod(times2ToThe32Mod((j10 * j11) + times2ToThe32Mod, j6), z.k(j11 * j12, j6), j6);
            }

            @Override // com.google.common.math.h.b
            long squareMod(long j4, long j5) {
                long j6 = j4 >>> 32;
                long j7 = j4 & 4294967295L;
                long times2ToThe32Mod = times2ToThe32Mod(j6 * j6, j5);
                long j10 = j6 * j7 * 2;
                if (j10 < 0) {
                    j10 = z.k(j10, j5);
                }
                return plusMod(times2ToThe32Mod(times2ToThe32Mod + j10, j5), z.k(j7 * j7, j5), j5);
            }
        }

        private static /* synthetic */ b[] $values() {
            return new b[]{SMALL, LARGE};
        }

        private b(String str, int i4) {
        }

        private long powMod(long j4, long j5, long j6) {
            long j7 = 1;
            while (j5 != 0) {
                if ((j5 & 1) != 0) {
                    j7 = mulMod(j7, j4, j6);
                }
                j4 = squareMod(j4, j6);
                j5 >>= 1;
            }
            return j7;
        }

        static boolean test(long j4, long j5) {
            return (j5 <= h.f57221f ? SMALL : LARGE).testWitness(j4, j5);
        }

        private boolean testWitness(long j4, long j5) {
            long j6 = j5 - 1;
            int numberOfTrailingZeros = Long.numberOfTrailingZeros(j6);
            long j7 = j6 >> numberOfTrailingZeros;
            long j10 = j4 % j5;
            if (j10 == 0) {
                return true;
            }
            long powMod = powMod(j10, j7, j5);
            if (powMod == 1) {
                return true;
            }
            int i4 = 0;
            while (powMod != j6) {
                i4++;
                if (i4 == numberOfTrailingZeros) {
                    return false;
                }
                powMod = squareMod(powMod, j5);
            }
            return true;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }

        abstract long mulMod(long j4, long j5, long j6);

        abstract long squareMod(long j4, long j5);

        /* synthetic */ b(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    private h() {
    }

    @d9.a
    public static long A(long j4, long j5) {
        long j6 = j4 - j5;
        return (((j5 ^ j4) > 0L ? 1 : ((j5 ^ j4) == 0L ? 0 : -1)) >= 0) | ((j4 ^ j6) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @d9.c
    public static long B(long j4, RoundingMode roundingMode) {
        i.f(ProtectedSandApp.s("\uf6ff"), j4);
        if (i(j4)) {
            return f.x((int) j4, roundingMode);
        }
        long sqrt = (long) Math.sqrt(j4);
        long j5 = sqrt * sqrt;
        switch (a.f57227a[roundingMode.ordinal()]) {
            case 1:
                i.k(j5 == j4);
                return sqrt;
            case 2:
            case 3:
                return j4 < j5 ? sqrt - 1 : sqrt;
            case 4:
            case 5:
                return j4 > j5 ? sqrt + 1 : sqrt;
            case 6:
            case 7:
            case 8:
                return (sqrt - (j4 < j5 ? 1 : 0)) + n((r0 * r0) + r0, j4);
            default:
                throw new AssertionError();
        }
    }

    public static long a(int i4, int i5) {
        i.e(ProtectedSandApp.s("\uf700"), i4);
        i.e(ProtectedSandApp.s("\uf701"), i5);
        l0.m(i5 <= i4, ProtectedSandApp.s("\uf702"), i5, i4);
        if (i5 > (i4 >> 1)) {
            i5 = i4 - i5;
        }
        long j4 = 1;
        if (i5 == 0) {
            return 1L;
        }
        if (i5 == 1) {
            return i4;
        }
        long[] jArr = f57222g;
        if (i4 < jArr.length) {
            return jArr[i4] / (jArr[i5] * jArr[i4 - i5]);
        }
        int[] iArr = f57223h;
        if (i5 >= iArr.length || i4 > iArr[i5]) {
            return Long.MAX_VALUE;
        }
        int[] iArr2 = f57224i;
        if (i5 < iArr2.length && i4 <= iArr2[i5]) {
            int i6 = i4 - 1;
            long j5 = i4;
            for (int i7 = 2; i7 <= i5; i7++) {
                j5 = (j5 * i6) / i7;
                i6--;
            }
            return j5;
        }
        long j6 = i4;
        int q4 = q(j6, RoundingMode.CEILING);
        int i10 = i4 - 1;
        int i11 = q4;
        int i12 = 2;
        long j7 = j6;
        long j10 = 1;
        while (i12 <= i5) {
            i11 += q4;
            if (i11 < 63) {
                j7 *= i10;
                j10 *= i12;
            } else {
                j4 = u(j4, j7, j10);
                j7 = i10;
                j10 = i12;
                i11 = q4;
            }
            i12++;
            i10--;
        }
        return u(j4, j7, j10);
    }

    @d9.a
    public static long b(long j4) {
        i.i(ProtectedSandApp.s("\uf6ff"), j4);
        if (j4 <= 4611686018427387904L) {
            return 1 << (-Long.numberOfLeadingZeros(j4 - 1));
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append(ProtectedSandApp.s("\uf703"));
        sb.append(j4);
        sb.append(ProtectedSandApp.s("\uf704"));
        throw new ArithmeticException(sb.toString());
    }

    @d9.c
    public static long c(long j4, long j5) {
        long j6 = j4 + j5;
        i.c(((j4 ^ j5) < 0) | ((j4 ^ j6) >= 0), ProtectedSandApp.s("\uf705"), j4, j5);
        return j6;
    }

    public static long d(long j4, long j5) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j5) + Long.numberOfLeadingZeros(j5) + Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4);
        if (numberOfLeadingZeros > 65) {
            return j4 * j5;
        }
        i.c(numberOfLeadingZeros >= 64, ProtectedSandApp.s("\uf706"), j4, j5);
        i.c((j4 >= 0) | (j5 != Long.MIN_VALUE), ProtectedSandApp.s("\uf706"), j4, j5);
        long j6 = j4 * j5;
        i.c(j4 == 0 || j6 / j4 == j5, ProtectedSandApp.s("\uf706"), j4, j5);
        return j6;
    }

    @d9.c
    public static long e(long j4, int i4) {
        i.e(ProtectedSandApp.s("\uf707"), i4);
        long j5 = 1;
        if ((j4 >= -2) && (j4 <= 2)) {
            int i5 = (int) j4;
            if (i5 == -2) {
                i.c(i4 < 64, ProtectedSandApp.s("\uf708"), j4, i4);
                return (i4 & 1) == 0 ? 1 << i4 : (-1) << i4;
            }
            if (i5 == -1) {
                return (i4 & 1) == 0 ? 1L : -1L;
            }
            if (i5 == 0) {
                return i4 == 0 ? 1L : 0L;
            }
            if (i5 == 1) {
                return 1L;
            }
            if (i5 != 2) {
                throw new AssertionError();
            }
            i.c(i4 < 63, ProtectedSandApp.s("\uf708"), j4, i4);
            return 1 << i4;
        }
        long j6 = j4;
        int i6 = i4;
        while (i6 != 0) {
            if (i6 == 1) {
                return d(j5, j6);
            }
            if ((i6 & 1) != 0) {
                j5 = d(j5, j6);
            }
            long j7 = j5;
            int i7 = i6 >> 1;
            if (i7 > 0) {
                i.c(-3037000499L <= j6 && j6 <= f57221f, ProtectedSandApp.s("\uf708"), j6, i7);
                j6 *= j6;
            }
            i6 = i7;
            j5 = j7;
        }
        return j5;
    }

    @d9.c
    public static long f(long j4, long j5) {
        long j6 = j4 - j5;
        i.c(((j4 ^ j5) >= 0) | ((j4 ^ j6) >= 0), ProtectedSandApp.s("\uf709"), j4, j5);
        return j6;
    }

    @d9.c
    public static long g(long j4, long j5, RoundingMode roundingMode) {
        roundingMode.getClass();
        long j6 = j4 / j5;
        long j7 = j4 - (j5 * j6);
        if (j7 == 0) {
            return j6;
        }
        int i4 = ((int) ((j4 ^ j5) >> 63)) | 1;
        switch (a.f57227a[roundingMode.ordinal()]) {
            case 1:
                i.k(j7 == 0);
                return j6;
            case 2:
                return j6;
            case 3:
                if (i4 >= 0) {
                    return j6;
                }
                break;
            case 4:
                break;
            case 5:
                if (i4 <= 0) {
                    return j6;
                }
                break;
            case 6:
            case 7:
            case 8:
                long abs = Math.abs(j7);
                long abs2 = abs - (Math.abs(j5) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP && (roundingMode != RoundingMode.HALF_EVEN || (1 & j6) == 0)) {
                        return j6;
                    }
                } else if (abs2 <= 0) {
                    return j6;
                }
                break;
            default:
                throw new AssertionError();
        }
        return j6 + i4;
    }

    @d9.c
    public static long h(int i4) {
        i.e(ProtectedSandApp.s("\uf700"), i4);
        long[] jArr = f57222g;
        if (i4 < jArr.length) {
            return jArr[i4];
        }
        return Long.MAX_VALUE;
    }

    static boolean i(long j4) {
        return ((long) ((int) j4)) == j4;
    }

    @d9.a
    public static long j(long j4) {
        i.i(ProtectedSandApp.s("\uf6ff"), j4);
        return 1 << (63 - Long.numberOfLeadingZeros(j4));
    }

    public static long k(long j4, long j5) {
        i.f(ProtectedSandApp.s("\uf70a"), j4);
        i.f(ProtectedSandApp.s("\uf70b"), j5);
        if (j4 == 0) {
            return j5;
        }
        if (j5 == 0) {
            return j4;
        }
        int numberOfTrailingZeros = Long.numberOfTrailingZeros(j4);
        long j6 = j4 >> numberOfTrailingZeros;
        int numberOfTrailingZeros2 = Long.numberOfTrailingZeros(j5);
        long j7 = j5 >> numberOfTrailingZeros2;
        while (j6 != j7) {
            long j10 = j6 - j7;
            long j11 = (j10 >> 63) & j10;
            long j12 = (j10 - j11) - j11;
            j7 += j11;
            j6 = j12 >> Long.numberOfTrailingZeros(j12);
        }
        return j6 << Math.min(numberOfTrailingZeros, numberOfTrailingZeros2);
    }

    public static boolean l(long j4) {
        return (j4 > 0) & ((j4 & (j4 - 1)) == 0);
    }

    @d9.a
    @d9.c
    public static boolean m(long j4) {
        if (j4 < 2) {
            i.f(ProtectedSandApp.s("\uf700"), j4);
            return false;
        }
        if (j4 < 66) {
            return ((722865708377213483 >> (((int) j4) + (-2))) & 1) != 0;
        }
        if (((1 << ((int) (j4 % 30))) & f57225j) != 0 || j4 % 7 == 0 || j4 % 11 == 0 || j4 % 13 == 0) {
            return false;
        }
        if (j4 < 289) {
            return true;
        }
        for (long[] jArr : f57226k) {
            if (j4 <= jArr[0]) {
                for (int i4 = 1; i4 < jArr.length; i4++) {
                    if (!b.test(jArr[i4], j4)) {
                        return false;
                    }
                }
                return true;
            }
        }
        throw new AssertionError();
    }

    @d9.d
    static int n(long j4, long j5) {
        return (int) ((~(~(j4 - j5))) >>> 63);
    }

    @d9.c
    public static int o(long j4, RoundingMode roundingMode) {
        int n4;
        i.i(ProtectedSandApp.s("\uf6ff"), j4);
        int p4 = p(j4);
        long j5 = f57219d[p4];
        switch (a.f57227a[roundingMode.ordinal()]) {
            case 1:
                i.k(j4 == j5);
            case 2:
            case 3:
                return p4;
            case 4:
            case 5:
                n4 = n(j5, j4);
                return p4 + n4;
            case 6:
            case 7:
            case 8:
                n4 = n(f57220e[p4], j4);
                return p4 + n4;
            default:
                throw new AssertionError();
        }
    }

    @d9.c
    static int p(long j4) {
        byte b5 = f57218c[Long.numberOfLeadingZeros(j4)];
        return b5 - n(j4, f57219d[b5]);
    }

    public static int q(long j4, RoundingMode roundingMode) {
        i.i(ProtectedSandApp.s("\uf6ff"), j4);
        switch (a.f57227a[roundingMode.ordinal()]) {
            case 1:
                i.k(l(j4));
                break;
            case 2:
            case 3:
                break;
            case 4:
            case 5:
                return 64 - Long.numberOfLeadingZeros(j4 - 1);
            case 6:
            case 7:
            case 8:
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j4);
                return (63 - numberOfLeadingZeros) + n(f57217b >>> numberOfLeadingZeros, j4);
            default:
                throw new AssertionError(ProtectedSandApp.s("\uf70c"));
        }
        return 63 - Long.numberOfLeadingZeros(j4);
    }

    public static long r(long j4, long j5) {
        return (j4 & j5) + ((j4 ^ j5) >> 1);
    }

    @d9.c
    public static int s(long j4, int i4) {
        return (int) t(j4, i4);
    }

    @d9.c
    public static long t(long j4, long j5) {
        if (j5 <= 0) {
            throw new ArithmeticException(ProtectedSandApp.s("\uf70d"));
        }
        long j6 = j4 % j5;
        return j6 >= 0 ? j6 : j6 + j5;
    }

    static long u(long j4, long j5, long j6) {
        if (j4 == 1) {
            return j5 / j6;
        }
        long k4 = k(j4, j6);
        return (j5 / (j6 / k4)) * (j4 / k4);
    }

    @d9.c
    public static long v(long j4, int i4) {
        i.e(ProtectedSandApp.s("\uf707"), i4);
        if (-2 > j4 || j4 > 2) {
            long j5 = 1;
            while (i4 != 0) {
                if (i4 == 1) {
                    return j5 * j4;
                }
                j5 *= (i4 & 1) == 0 ? 1L : j4;
                j4 *= j4;
                i4 >>= 1;
            }
            return j5;
        }
        int i5 = (int) j4;
        if (i5 == -2) {
            if (i4 < 64) {
                return (i4 & 1) == 0 ? 1 << i4 : -(1 << i4);
            }
            return 0L;
        }
        if (i5 == -1) {
            return (i4 & 1) == 0 ? 1L : -1L;
        }
        if (i5 == 0) {
            return i4 == 0 ? 1L : 0L;
        }
        if (i5 == 1) {
            return 1L;
        }
        if (i5 != 2) {
            throw new AssertionError();
        }
        if (i4 < 64) {
            return 1 << i4;
        }
        return 0L;
    }

    @d9.c
    public static double w(long j4, RoundingMode roundingMode) {
        double d5;
        long j5;
        double d6 = j4;
        long j6 = (long) d6;
        int d7 = j6 == Long.MAX_VALUE ? -1 : com.google.common.primitives.n.d(j4, j6);
        int[] iArr = a.f57227a;
        int i4 = iArr[roundingMode.ordinal()];
        String s4 = ProtectedSandApp.s("\uf70c");
        switch (i4) {
            case 1:
                i.k(d7 == 0);
                return d6;
            case 2:
                return j4 >= 0 ? d7 >= 0 ? d6 : -Math.nextUp(-d6) : d7 <= 0 ? d6 : Math.nextUp(d6);
            case 3:
                return d7 >= 0 ? d6 : -Math.nextUp(-d6);
            case 4:
                return j4 >= 0 ? d7 <= 0 ? d6 : Math.nextUp(d6) : d7 >= 0 ? d6 : -Math.nextUp(-d6);
            case 5:
                return d7 <= 0 ? d6 : Math.nextUp(d6);
            case 6:
            case 7:
            case 8:
                if (d7 >= 0) {
                    d5 = Math.nextUp(d6);
                    j5 = (long) Math.ceil(d5);
                } else {
                    double d10 = -Math.nextUp(-d6);
                    j6 = (long) Math.floor(d10);
                    d5 = d6;
                    d6 = d10;
                    j5 = j6;
                }
                long j7 = j4 - j6;
                long j10 = j5 - j4;
                if (j5 == Long.MAX_VALUE) {
                    j10++;
                }
                int d11 = com.google.common.primitives.n.d(j7, j10);
                if (d11 < 0) {
                    return d6;
                }
                if (d11 > 0) {
                    return d5;
                }
                int i5 = iArr[roundingMode.ordinal()];
                if (i5 == 6) {
                    return j4 >= 0 ? d6 : d5;
                }
                if (i5 == 7) {
                    return j4 >= 0 ? d5 : d6;
                }
                if (i5 == 8) {
                    return (d.c(d6) & 1) == 0 ? d6 : d5;
                }
                throw new AssertionError(s4);
            default:
                throw new AssertionError(s4);
        }
    }

    @d9.a
    public static long x(long j4, long j5) {
        long j6 = j4 + j5;
        return (((j5 ^ j4) > 0L ? 1 : ((j5 ^ j4) == 0L ? 0 : -1)) < 0) | ((j4 ^ j6) >= 0) ? j6 : ((j6 >>> 63) ^ 1) + Long.MAX_VALUE;
    }

    @d9.a
    public static long y(long j4, long j5) {
        int numberOfLeadingZeros = Long.numberOfLeadingZeros(~j5) + Long.numberOfLeadingZeros(j5) + Long.numberOfLeadingZeros(~j4) + Long.numberOfLeadingZeros(j4);
        if (numberOfLeadingZeros > 65) {
            return j4 * j5;
        }
        long j6 = ((j4 ^ j5) >>> 63) + Long.MAX_VALUE;
        if ((numberOfLeadingZeros < 64) || ((j5 == Long.MIN_VALUE) & (j4 < 0))) {
            return j6;
        }
        long j7 = j4 * j5;
        return (j4 == 0 || j7 / j4 == j5) ? j7 : j6;
    }

    @d9.a
    public static long z(long j4, int i4) {
        i.e(ProtectedSandApp.s("\uf707"), i4);
        long j5 = 1;
        if (!(j4 >= -2) || !(j4 <= 2)) {
            long j6 = ((j4 >>> 63) & i4 & 1) + Long.MAX_VALUE;
            while (i4 != 0) {
                if (i4 == 1) {
                    return y(j5, j4);
                }
                if ((i4 & 1) != 0) {
                    j5 = y(j5, j4);
                }
                i4 >>= 1;
                if (i4 > 0) {
                    if ((-3037000499L > j4) || (j4 > f57221f)) {
                        return j6;
                    }
                    j4 *= j4;
                }
            }
            return j5;
        }
        int i5 = (int) j4;
        if (i5 == -2) {
            return i4 >= 64 ? (i4 & 1) + Long.MAX_VALUE : (i4 & 1) == 0 ? 1 << i4 : (-1) << i4;
        }
        if (i5 == -1) {
            return (i4 & 1) == 0 ? 1L : -1L;
        }
        if (i5 == 0) {
            return i4 == 0 ? 1L : 0L;
        }
        if (i5 == 1) {
            return 1L;
        }
        if (i5 != 2) {
            throw new AssertionError();
        }
        if (i4 >= 63) {
            return Long.MAX_VALUE;
        }
        return 1 << i4;
    }
}
