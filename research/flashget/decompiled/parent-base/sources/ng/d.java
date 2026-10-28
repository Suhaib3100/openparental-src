package ng;

import androidx.collection.p0;
import androidx.compose.foundation.text.q;
import androidx.compose.runtime.changelist.j;
import androidx.compose.runtime.snapshots.f0;

/* compiled from: Jdk8Methods.java */
/* loaded from: classes9.dex */
public final class d {
    private d() {
    }

    public static int a(int i4, int i5) {
        if (i4 < i5) {
            return -1;
        }
        return i4 > i5 ? 1 : 0;
    }

    public static int b(long j4, long j5) {
        if (j4 < j5) {
            return -1;
        }
        return j4 > j5 ? 1 : 0;
    }

    public static boolean c(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        if (obj2 == null) {
            return false;
        }
        return obj.equals(obj2);
    }

    public static int d(int i4, int i5) {
        return i4 >= 0 ? i4 / i5 : ((i4 + 1) / i5) - 1;
    }

    public static long e(long j4, long j5) {
        return j4 >= 0 ? j4 / j5 : ((j4 + 1) / j5) - 1;
    }

    public static int f(int i4, int i5) {
        return ((i4 % i5) + i5) % i5;
    }

    public static int g(long j4, int i4) {
        long j5 = i4;
        return (int) (((j4 % j5) + j5) % j5);
    }

    public static long h(long j4, long j5) {
        return ((j4 % j5) + j5) % j5;
    }

    public static <T> T i(T t4) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException("Value must not be null");
    }

    public static <T> T j(T t4, String str) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(j.a(str, " must not be null"));
    }

    public static int k(int i4, int i5) {
        int i6 = i4 + i5;
        if ((i4 ^ i6) >= 0 || (i4 ^ i5) < 0) {
            return i6;
        }
        throw new ArithmeticException(q.a("Addition overflows an int: ", i4, " + ", i5));
    }

    public static long l(long j4, long j5) {
        long j6 = j4 + j5;
        if ((j4 ^ j6) >= 0 || (j4 ^ j5) < 0) {
            return j6;
        }
        StringBuilder a5 = f0.a("Addition overflows a long: ", j4, " + ");
        a5.append(j5);
        throw new ArithmeticException(a5.toString());
    }

    public static int m(int i4, int i5) {
        long j4 = i4 * i5;
        if (j4 < -2147483648L || j4 > 2147483647L) {
            throw new ArithmeticException(q.a("Multiplication overflows an int: ", i4, " * ", i5));
        }
        return (int) j4;
    }

    public static long n(long j4, int i4) {
        if (i4 == -1) {
            if (j4 != Long.MIN_VALUE) {
                return -j4;
            }
            throw new ArithmeticException("Multiplication overflows a long: " + j4 + " * " + i4);
        }
        if (i4 == 0) {
            return 0L;
        }
        if (i4 == 1) {
            return j4;
        }
        long j5 = i4;
        long j6 = j4 * j5;
        if (j6 / j5 == j4) {
            return j6;
        }
        throw new ArithmeticException("Multiplication overflows a long: " + j4 + " * " + i4);
    }

    public static long o(long j4, long j5) {
        if (j5 == 1) {
            return j4;
        }
        if (j4 == 1) {
            return j5;
        }
        if (j4 == 0 || j5 == 0) {
            return 0L;
        }
        long j6 = j4 * j5;
        if (j6 / j5 == j4 && ((j4 != Long.MIN_VALUE || j5 != -1) && (j5 != Long.MIN_VALUE || j4 != -1))) {
            return j6;
        }
        StringBuilder a5 = f0.a("Multiplication overflows a long: ", j4, " * ");
        a5.append(j5);
        throw new ArithmeticException(a5.toString());
    }

    public static int p(int i4, int i5) {
        int i6 = i4 - i5;
        if ((i4 ^ i6) >= 0 || (i4 ^ i5) >= 0) {
            return i6;
        }
        throw new ArithmeticException(q.a("Subtraction overflows an int: ", i4, " - ", i5));
    }

    public static long q(long j4, long j5) {
        long j6 = j4 - j5;
        if ((j4 ^ j6) >= 0 || (j4 ^ j5) >= 0) {
            return j6;
        }
        StringBuilder a5 = f0.a("Subtraction overflows a long: ", j4, " - ");
        a5.append(j5);
        throw new ArithmeticException(a5.toString());
    }

    public static int r(long j4) {
        if (j4 > 2147483647L || j4 < -2147483648L) {
            throw new ArithmeticException(p0.a("Calculation overflows an int: ", j4));
        }
        return (int) j4;
    }
}
