package net.time4j.base;

import androidx.collection.p0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: MathUtils.java */
/* loaded from: classes7.dex */
public final class c {
    private c() {
    }

    public static int a(int i4, int i5) {
        return i4 >= 0 ? i4 / i5 : ((i4 + 1) / i5) - 1;
    }

    public static long b(long j4, int i4) {
        return j4 >= 0 ? j4 / i4 : ((j4 + 1) / i4) - 1;
    }

    public static int c(int i4, int i5) {
        return i4 - (a(i4, i5) * i5);
    }

    public static int d(long j4, int i4) {
        return (int) (j4 - (b(j4, i4) * i4));
    }

    public static int e(int i4, int i5) {
        if (i5 == 0) {
            return i4;
        }
        long j4 = i4 + i5;
        if (j4 >= -2147483648L && j4 <= 2147483647L) {
            return (int) j4;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(ProtectedSandApp.s("訅\u0001"));
        sb.append(i4);
        sb.append(',');
        sb.append(i5);
        sb.append(')');
        throw new ArithmeticException(sb.toString());
    }

    public static long f(long j4, long j5) {
        if (j5 == 0) {
            return j4;
        }
        if (j5 <= 0 ? j4 >= Long.MIN_VALUE - j5 : j4 <= Long.MAX_VALUE - j5) {
            return j4 + j5;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(ProtectedSandApp.s("訆\u0001"));
        sb.append(j4);
        sb.append(',');
        sb.append(j5);
        sb.append(')');
        throw new ArithmeticException(sb.toString());
    }

    public static int g(long j4) {
        if (j4 < -2147483648L || j4 > 2147483647L) {
            throw new ArithmeticException(p0.a(ProtectedSandApp.s("訇\u0001"), j4));
        }
        return (int) j4;
    }

    public static int h(int i4, int i5) {
        if (i5 == 1) {
            return i4;
        }
        long j4 = i4 * i5;
        if (j4 >= -2147483648L && j4 <= 2147483647L) {
            return (int) j4;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(ProtectedSandApp.s("訅\u0001"));
        sb.append(i4);
        sb.append(',');
        sb.append(i5);
        sb.append(')');
        throw new ArithmeticException(sb.toString());
    }

    public static long i(long j4, long j5) {
        if (j5 == 1) {
            return j4;
        }
        if (j5 <= 0 ? j5 >= -1 ? !(j5 == -1 && j4 == Long.MIN_VALUE) : j4 <= Long.MIN_VALUE / j5 && j4 >= Long.MAX_VALUE / j5 : j4 <= Long.MAX_VALUE / j5 && j4 >= Long.MIN_VALUE / j5) {
            return j4 * j5;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(ProtectedSandApp.s("訆\u0001"));
        sb.append(j4);
        sb.append(',');
        sb.append(j5);
        sb.append(')');
        throw new ArithmeticException(sb.toString());
    }

    public static int j(int i4) {
        if (i4 != Integer.MIN_VALUE) {
            return -i4;
        }
        throw new ArithmeticException(android.support.v4.media.a.a(ProtectedSandApp.s("計\u0001"), i4));
    }

    public static long k(long j4) {
        if (j4 != Long.MIN_VALUE) {
            return -j4;
        }
        throw new ArithmeticException(p0.a(ProtectedSandApp.s("計\u0001"), j4));
    }

    public static int l(int i4, int i5) {
        if (i5 == 0) {
            return i4;
        }
        long j4 = i4 - i5;
        if (j4 >= -2147483648L && j4 <= 2147483647L) {
            return (int) j4;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(ProtectedSandApp.s("訅\u0001"));
        sb.append(i4);
        sb.append(',');
        sb.append(i5);
        sb.append(')');
        throw new ArithmeticException(sb.toString());
    }

    public static long m(long j4, long j5) {
        if (j5 == 0) {
            return j4;
        }
        if (j5 <= 0 ? j4 <= Long.MAX_VALUE + j5 : j4 >= Long.MIN_VALUE + j5) {
            return j4 - j5;
        }
        StringBuilder sb = new StringBuilder(32);
        sb.append(ProtectedSandApp.s("訆\u0001"));
        sb.append(j4);
        sb.append(',');
        sb.append(j5);
        sb.append(')');
        throw new ArithmeticException(sb.toString());
    }
}
