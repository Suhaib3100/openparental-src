package androidx.core.util;

import android.text.TextUtils;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Locale;

/* compiled from: Preconditions.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public final class w {
    private w() {
    }

    public static void a(boolean z4) {
        if (!z4) {
            throw new IllegalArgumentException();
        }
    }

    public static void b(boolean z4, @o0 Object obj) {
        if (!z4) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void c(boolean z4, @o0 String str, @o0 Object... objArr) {
        if (!z4) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
    }

    public static float d(float f4, @o0 String str) {
        if (Float.isNaN(f4)) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, " must not be NaN"));
        }
        if (Float.isInfinite(f4)) {
            throw new IllegalArgumentException(androidx.compose.runtime.changelist.j.a(str, " must not be infinite"));
        }
        return f4;
    }

    public static double e(double d5, double d6, double d7, @o0 String str) {
        if (d5 < d6) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Double.valueOf(d6), Double.valueOf(d7)));
        }
        if (d5 <= d7) {
            return d5;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Double.valueOf(d6), Double.valueOf(d7)));
    }

    public static float f(float f4, float f5, float f6, @o0 String str) {
        if (f4 < f5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too low)", str, Float.valueOf(f5), Float.valueOf(f6)));
        }
        if (f4 <= f6) {
            return f4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%f, %f] (too high)", str, Float.valueOf(f5), Float.valueOf(f6)));
    }

    public static int g(int i4, int i5, int i6, @o0 String str) {
        if (i4 < i5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
        }
        if (i4 <= i6) {
            return i4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Integer.valueOf(i5), Integer.valueOf(i6)));
    }

    public static long h(long j4, long j5, long j6, @o0 String str) {
        if (j4 < j5) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", str, Long.valueOf(j5), Long.valueOf(j6)));
        }
        if (j4 <= j6) {
            return j4;
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", str, Long.valueOf(j5), Long.valueOf(j6)));
    }

    @androidx.annotation.g0(from = 0)
    public static int i(int i4) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException();
    }

    @androidx.annotation.g0(from = 0)
    public static int j(int i4, @q0 String str) {
        if (i4 >= 0) {
            return i4;
        }
        throw new IllegalArgumentException(str);
    }

    public static int k(int i4, int i5) {
        if ((i4 & i5) == i4) {
            return i4;
        }
        throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i4) + ", but only 0x" + Integer.toHexString(i5) + " are allowed");
    }

    @o0
    public static <T> T l(@q0 T t4) {
        t4.getClass();
        return t4;
    }

    @o0
    public static <T> T m(@q0 T t4, @o0 Object obj) {
        if (t4 != null) {
            return t4;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void n(boolean z4) {
        o(z4, null);
    }

    public static void o(boolean z4, @q0 String str) {
        if (!z4) {
            throw new IllegalStateException(str);
        }
    }

    @o0
    public static <T extends CharSequence> T p(@q0 T t4) {
        if (TextUtils.isEmpty(t4)) {
            throw new IllegalArgumentException();
        }
        return t4;
    }

    @o0
    public static <T extends CharSequence> T q(@q0 T t4, @o0 Object obj) {
        if (TextUtils.isEmpty(t4)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return t4;
    }

    @o0
    public static <T extends CharSequence> T r(@q0 T t4, @o0 String str, @o0 Object... objArr) {
        if (TextUtils.isEmpty(t4)) {
            throw new IllegalArgumentException(String.format(str, objArr));
        }
        return t4;
    }
}
