package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Iterator;

/* compiled from: DoubleMath.java */
@e
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private static final double f57184a = -2.147483648E9d;

    /* renamed from: b, reason: collision with root package name */
    private static final double f57185b = 2.147483647E9d;

    /* renamed from: c, reason: collision with root package name */
    private static final double f57186c = -9.223372036854776E18d;

    /* renamed from: d, reason: collision with root package name */
    private static final double f57187d = 9.223372036854776E18d;

    /* renamed from: f, reason: collision with root package name */
    @d9.d
    static final int f57189f = 170;

    /* renamed from: e, reason: collision with root package name */
    private static final double f57188e = Math.log(2.0d);

    /* renamed from: g, reason: collision with root package name */
    @d9.d
    static final double[] f57190g = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    /* compiled from: DoubleMath.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57191a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f57191a = iArr;
            try {
                iArr[RoundingMode.UNNECESSARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57191a[RoundingMode.FLOOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57191a[RoundingMode.CEILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57191a[RoundingMode.DOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57191a[RoundingMode.UP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57191a[RoundingMode.HALF_EVEN.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57191a[RoundingMode.HALF_UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57191a[RoundingMode.HALF_DOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private c() {
    }

    @d9.c
    @f9.a
    private static double a(double d5) {
        l0.d(d.d(d5));
        return d5;
    }

    public static double b(int i4) {
        i.e(ProtectedSandApp.s("\uf6e4"), i4);
        if (i4 > f57189f) {
            return Double.POSITIVE_INFINITY;
        }
        double d5 = 1.0d;
        for (int i5 = (i4 & (-16)) + 1; i5 <= i4; i5++) {
            d5 *= i5;
        }
        return d5 * f57190g[i4 >> 4];
    }

    public static int c(double d5, double d6, double d7) {
        if (d(d5, d6, d7)) {
            return 0;
        }
        if (d5 < d6) {
            return -1;
        }
        if (d5 > d6) {
            return 1;
        }
        return com.google.common.primitives.a.d(Double.isNaN(d5), Double.isNaN(d6));
    }

    public static boolean d(double d5, double d6, double d7) {
        i.d(ProtectedSandApp.s("\uf6e5"), d7);
        return Math.copySign(d5 - d6, 1.0d) <= d7 || d5 == d6 || (Double.isNaN(d5) && Double.isNaN(d6));
    }

    @d9.c
    public static boolean e(double d5) {
        return d.d(d5) && (d5 == 0.0d || 52 - Long.numberOfTrailingZeros(d.c(d5)) <= Math.getExponent(d5));
    }

    @d9.c
    public static boolean f(double d5) {
        if (d5 <= 0.0d || !d.d(d5)) {
            return false;
        }
        long c5 = d.c(d5);
        return (c5 & (c5 - 1)) == 0;
    }

    public static double g(double d5) {
        return Math.log(d5) / f57188e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    @d9.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int h(double r5, java.math.RoundingMode r7) {
        /*
            r0 = 0
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            r1 = 0
            r2 = 1
            if (r0 <= 0) goto L10
            boolean r0 = com.google.common.math.d.d(r5)
            if (r0 == 0) goto L10
            r0 = r2
            goto L11
        L10:
            r0 = r1
        L11:
            java.lang.String r3 = "\uf6e6"
            java.lang.String r3 = com.flashget.parentalcontrol.ProtectedSandApp.s(r3)
            com.google.common.base.l0.e(r0, r3)
            int r0 = java.lang.Math.getExponent(r5)
            boolean r3 = com.google.common.math.d.e(r5)
            if (r3 != 0) goto L2e
            r0 = 4841369599423283200(0x4330000000000000, double:4.503599627370496E15)
            double r5 = r5 * r0
            int r5 = h(r5, r7)
            int r5 = r5 + (-52)
            return r5
        L2e:
            int[] r3 = com.google.common.math.c.a.f57191a
            int r7 = r7.ordinal()
            r7 = r3[r7]
            switch(r7) {
                case 1: goto L65;
                case 2: goto L6c;
                case 3: goto L5e;
                case 4: goto L56;
                case 5: goto L4c;
                case 6: goto L3f;
                case 7: goto L3f;
                case 8: goto L3f;
                default: goto L39;
            }
        L39:
            java.lang.AssertionError r5 = new java.lang.AssertionError
            r5.<init>()
            throw r5
        L3f:
            double r5 = com.google.common.math.d.g(r5)
            double r5 = r5 * r5
            r3 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r5 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r5 <= 0) goto L6c
            r1 = r2
            goto L6c
        L4c:
            if (r0 < 0) goto L4f
            r1 = r2
        L4f:
            boolean r5 = f(r5)
        L53:
            r5 = r5 ^ r2
            r1 = r1 & r5
            goto L6c
        L56:
            if (r0 >= 0) goto L59
            r1 = r2
        L59:
            boolean r5 = f(r5)
            goto L53
        L5e:
            boolean r5 = f(r5)
            r1 = r5 ^ 1
            goto L6c
        L65:
            boolean r5 = f(r5)
            com.google.common.math.i.k(r5)
        L6c:
            if (r1 == 0) goto L70
            int r0 = r0 + 1
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.math.c.h(double, java.math.RoundingMode):int");
    }

    @d9.c
    @Deprecated
    public static double i(Iterable<? extends Number> iterable) {
        return j(iterable.iterator());
    }

    @d9.c
    @Deprecated
    public static double j(Iterator<? extends Number> it) {
        l0.e(it.hasNext(), ProtectedSandApp.s("\uf6e7"));
        double a5 = a(it.next().doubleValue());
        long j4 = 1;
        while (it.hasNext()) {
            j4++;
            a5 += (a(it.next().doubleValue()) - a5) / j4;
        }
        return a5;
    }

    @d9.c
    @Deprecated
    public static double k(double... dArr) {
        l0.e(dArr.length > 0, ProtectedSandApp.s("\uf6e7"));
        double a5 = a(dArr[0]);
        long j4 = 1;
        for (int i4 = 1; i4 < dArr.length; i4++) {
            a(dArr[i4]);
            j4++;
            a5 += (dArr[i4] - a5) / j4;
        }
        return a5;
    }

    @Deprecated
    public static double l(int... iArr) {
        l0.e(iArr.length > 0, ProtectedSandApp.s("\uf6e7"));
        long j4 = 0;
        for (int i4 : iArr) {
            j4 += i4;
        }
        return j4 / iArr.length;
    }

    @Deprecated
    public static double m(long... jArr) {
        l0.e(jArr.length > 0, ProtectedSandApp.s("\uf6e7"));
        double d5 = jArr[0];
        long j4 = 1;
        for (int i4 = 1; i4 < jArr.length; i4++) {
            j4++;
            d5 += (jArr[i4] - d5) / j4;
        }
        return d5;
    }

    @d9.c
    static double n(double d5, RoundingMode roundingMode) {
        if (!d.d(d5)) {
            throw new ArithmeticException(ProtectedSandApp.s("\uf6e8"));
        }
        switch (a.f57191a[roundingMode.ordinal()]) {
            case 1:
                i.k(e(d5));
                return d5;
            case 2:
                return (d5 >= 0.0d || e(d5)) ? d5 : ((long) d5) - 1;
            case 3:
                return (d5 <= 0.0d || e(d5)) ? d5 : ((long) d5) + 1;
            case 4:
                return d5;
            case 5:
                if (e(d5)) {
                    return d5;
                }
                return ((long) d5) + (d5 > 0.0d ? 1 : -1);
            case 6:
                return Math.rint(d5);
            case 7:
                double rint = Math.rint(d5);
                return Math.abs(d5 - rint) == 0.5d ? Math.copySign(0.5d, d5) + d5 : rint;
            case 8:
                double rint2 = Math.rint(d5);
                return Math.abs(d5 - rint2) == 0.5d ? d5 : rint2;
            default:
                throw new AssertionError();
        }
    }

    @d9.c
    public static BigInteger o(double d5, RoundingMode roundingMode) {
        double n4 = n(d5, roundingMode);
        if ((f57186c - n4 < 1.0d) && (n4 < f57187d)) {
            return BigInteger.valueOf((long) n4);
        }
        BigInteger shiftLeft = BigInteger.valueOf(d.c(n4)).shiftLeft(Math.getExponent(n4) - 52);
        return n4 < 0.0d ? shiftLeft.negate() : shiftLeft;
    }

    @d9.c
    public static int p(double d5, RoundingMode roundingMode) {
        double n4 = n(d5, roundingMode);
        i.a((n4 > -2.147483649E9d) & (n4 < 2.147483648E9d), d5, roundingMode);
        return (int) n4;
    }

    @d9.c
    public static long q(double d5, RoundingMode roundingMode) {
        double n4 = n(d5, roundingMode);
        i.a((f57186c - n4 < 1.0d) & (n4 < f57187d), d5, roundingMode);
        return (long) n4;
    }
}
