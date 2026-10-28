package o;

import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: MathUtils.java */
/* loaded from: classes2.dex */
public class a {
    private a() {
    }

    public static int a(int i5, int i6) {
        int i7 = i5 + i6;
        if (((i5 ^ i7) & (i6 ^ i7)) >= 0) {
            return i7;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭓"));
    }

    public static long b(long j5, long j6) {
        long j7 = j5 + j6;
        if (((j5 ^ j7) & (j6 ^ j7)) >= 0) {
            return j7;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭔"));
    }

    public static double c(double d6, double d7, double d8) {
        return d6 < d7 ? d7 : d6 > d8 ? d8 : d6;
    }

    public static float d(float f6, float f7, float f8) {
        return f6 < f7 ? f7 : f6 > f8 ? f8 : f6;
    }

    public static int e(int i5, int i6, int i7) {
        return i5 < i6 ? i6 : i5 > i7 ? i7 : i5;
    }

    public static long f(long j5, long j6, long j7) {
        return j5 < j6 ? j6 : j5 > j7 ? j7 : j5;
    }

    public static int g(int i5) {
        if (i5 != Integer.MIN_VALUE) {
            return i5 - 1;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭕"));
    }

    public static long h(long j5) {
        if (j5 != Long.MIN_VALUE) {
            return j5 - 1;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭖"));
    }

    public static int i(int i5) {
        if (i5 != Integer.MAX_VALUE) {
            return i5 + 1;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭗"));
    }

    public static long j(long j5) {
        if (j5 != Long.MAX_VALUE) {
            return j5 + 1;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭘"));
    }

    public static int k(int i5, int i6) {
        long j5 = i5 * i6;
        int i7 = (int) j5;
        if (i7 == j5) {
            return i7;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭙"));
    }

    public static long l(long j5, long j6) {
        long j7 = j5 * j6;
        if (((Math.abs(j5) | Math.abs(j6)) >>> 31) == 0 || ((j6 == 0 || j7 / j6 == j5) && !(j5 == Long.MIN_VALUE && j6 == -1))) {
            return j7;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭚"));
    }

    public static int m(int i5) {
        if (i5 != Integer.MIN_VALUE) {
            return -i5;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭛"));
    }

    public static long n(long j5) {
        if (j5 != Long.MIN_VALUE) {
            return -j5;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭜"));
    }

    public static int o(int i5, int i6) {
        int i7 = i5 - i6;
        if (((i5 ^ i7) & (i6 ^ i5)) >= 0) {
            return i7;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭝"));
    }

    public static long p(long j5, long j6) {
        long j7 = j5 - j6;
        if (((j5 ^ j7) & (j6 ^ j5)) >= 0) {
            return j7;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭞"));
    }

    public static int q(long j5) {
        int i5 = (int) j5;
        if (i5 == j5) {
            return i5;
        }
        throw new ArithmeticException(ProtectedSandApp.s("᭟"));
    }
}
