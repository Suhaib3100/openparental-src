package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Locale;

/* compiled from: Preconditions.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public final class q {
    private q() {
    }

    public static void a(boolean z5) {
        if (!z5) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z5, @o0 Object obj) {
        if (!z5) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z5, @o0 String str, @o0 Object... objArr) {
        if (!z5) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static float d(float f6, @o0 String str) {
        if (Float.isNaN(f6)) {
            throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, " must not be NaN"));
        }
        if (Float.isInfinite(f6)) {
            throw new IllegalArgumentException(androidx.concurrent.futures.b.a(str, " must not be infinite"));
        }
        return f6;
    }

    public static double e(double d6, double d7, double d8, @o0 String str) {
        if (d6 < d7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d7), Double.valueOf(d8)));
        }
        if (d6 <= d8) {
            return d6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d7), Double.valueOf(d8)));
    }

    public static float f(float f6, float f7, float f8, @o0 String str) {
        if (f6 < f7) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f7), Float.valueOf(f8)));
        }
        if (f6 <= f8) {
            return f6;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f7), Float.valueOf(f8)));
    }

    public static int g(int i5, int i6, int i7, @o0 String str) {
        if (i5 < i6) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i6), Integer.valueOf(i7)));
        }
        if (i5 <= i7) {
            return i5;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i6), Integer.valueOf(i7)));
    }

    public static long h(long j5, long j6, long j7, @o0 String str) {
        if (j5 < j6) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j6), Long.valueOf(j7)));
        }
        if (j5 <= j7) {
            return j5;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j6), Long.valueOf(j7)));
    }

    @g0(from = 0)
    public static int i(int i5) {
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException();
    }

    @g0(from = 0)
    public static int j(int i5, @q0 String str) {
        if (i5 >= 0) {
            return i5;
        }
        throw new IllegalArgumentException(str);
    }

    public static int k(int i5, int i6) {
        if ((i5 & i6) == i5) {
            return i5;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(i6) + " are allowed");
    }

    @o0
    public static <T> T l(@q0 T t5) {
        t5.getClass();
        return t5;
    }

    @o0
    public static <T> T m(@q0 T t5, @o0 Object obj) {
        if (t5 != null) {
            return t5;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void n(boolean z5) {
        o(z5, null);
    }

    public static void o(boolean z5, @q0 String str) {
        if (!z5) {
            throw new IllegalStateException(str);
        }
    }

    @o0
    public static <T extends CharSequence> T p(@q0 T t5) {
        if (TextUtils.isEmpty(t5)) {
            throw new IllegalArgumentException();
        }
        return t5;
    }

    @o0
    public static <T extends CharSequence> T q(@q0 T t5, @o0 Object obj) {
        if (TextUtils.isEmpty(t5)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t5;
    }

    @o0
    public static <T extends CharSequence> T r(@q0 T t5, @o0 String str, @o0 Object... objArr) {
        if (TextUtils.isEmpty(t5)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t5;
    }
}
