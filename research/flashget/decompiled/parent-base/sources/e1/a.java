package e1;

/* compiled from: MathUtils.java */
/* loaded from: classes3.dex */
public class a {
    private a() {
    }

    public static int a(int i4, int i5) {
        int i6 = i4 + i5;
        if ((i4 >= 0) == (i5 >= 0)) {
            if ((i4 >= 0) != (i6 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i6;
    }

    public static long b(long j4, long j5) {
        long j6 = j4 + j5;
        if ((j4 >= 0) == (j5 >= 0)) {
            if ((j4 >= 0) != (j6 >= 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j6;
    }

    public static double c(double d5, double d6, double d7) {
        return d5 < d6 ? d6 : d5 > d7 ? d7 : d5;
    }

    public static float d(float f4, float f5, float f6) {
        return f4 < f5 ? f5 : f4 > f6 ? f6 : f4;
    }

    public static int e(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : i4 > i6 ? i6 : i4;
    }

    public static long f(long j4, long j5, long j6) {
        return j4 < j5 ? j5 : j4 > j6 ? j6 : j4;
    }

    public static int g(int i4) {
        if (i4 != Integer.MIN_VALUE) {
            return i4 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long h(long j4) {
        if (j4 != Long.MIN_VALUE) {
            return j4 - 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int i(int i4) {
        if (i4 != Integer.MAX_VALUE) {
            return i4 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long j(long j4) {
        if (j4 != Long.MAX_VALUE) {
            return j4 + 1;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int k(int i4, int i5) {
        int i6 = i4 * i5;
        if (i4 == 0 || i5 == 0 || (i6 / i4 == i5 && i6 / i5 == i4)) {
            return i6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long l(long j4, long j5) {
        long j6 = j4 * j5;
        if (j4 == 0 || j5 == 0 || (j6 / j4 == j5 && j6 / j5 == j4)) {
            return j6;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int m(int i4) {
        if (i4 != Integer.MIN_VALUE) {
            return -i4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static long n(long j4) {
        if (j4 != Long.MIN_VALUE) {
            return -j4;
        }
        throw new ArithmeticException("integer overflow");
    }

    public static int o(int i4, int i5) {
        int i6 = i4 - i5;
        if ((i4 < 0) != (i5 < 0)) {
            if ((i4 < 0) != (i6 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return i6;
    }

    public static long p(long j4, long j5) {
        long j6 = j4 - j5;
        if ((j4 < 0) != (j5 < 0)) {
            if ((j4 < 0) != (j6 < 0)) {
                throw new ArithmeticException("integer overflow");
            }
        }
        return j6;
    }

    public static int q(long j4) {
        if (j4 > 2147483647L || j4 < -2147483648L) {
            throw new ArithmeticException("integer overflow");
        }
        return (int) j4;
    }
}
