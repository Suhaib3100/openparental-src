package androidx.core.view.accessibility;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.c1;
import androidx.annotation.w0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: AccessibilityEventCompat.java */
/* loaded from: classes3.dex */
public final class b {
    public static final int A = 64;
    public static final int B = 128;
    public static final int C = 256;
    public static final int D = 512;
    public static final int E = 1024;
    public static final int F = 2048;
    public static final int G = 4096;
    public static final int H = -1;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f26925a = 128;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f26926b = 256;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f26927c = 512;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f26928d = 1024;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f26929e = 2048;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f26930f = 4096;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f26931g = 8192;

    /* renamed from: h, reason: collision with root package name */
    public static final int f26932h = 16384;

    /* renamed from: i, reason: collision with root package name */
    public static final int f26933i = 32768;

    /* renamed from: j, reason: collision with root package name */
    public static final int f26934j = 65536;

    /* renamed from: k, reason: collision with root package name */
    public static final int f26935k = 131072;

    /* renamed from: l, reason: collision with root package name */
    public static final int f26936l = 262144;

    /* renamed from: m, reason: collision with root package name */
    public static final int f26937m = 524288;

    /* renamed from: n, reason: collision with root package name */
    public static final int f26938n = 1048576;

    /* renamed from: o, reason: collision with root package name */
    public static final int f26939o = 2097152;

    /* renamed from: p, reason: collision with root package name */
    public static final int f26940p = 4194304;

    /* renamed from: q, reason: collision with root package name */
    public static final int f26941q = 8388608;

    /* renamed from: r, reason: collision with root package name */
    public static final int f26942r = 16777216;

    /* renamed from: s, reason: collision with root package name */
    public static final int f26943s = 67108864;

    /* renamed from: t, reason: collision with root package name */
    public static final int f26944t = 0;

    /* renamed from: u, reason: collision with root package name */
    public static final int f26945u = 1;

    /* renamed from: v, reason: collision with root package name */
    public static final int f26946v = 2;

    /* renamed from: w, reason: collision with root package name */
    public static final int f26947w = 4;

    /* renamed from: x, reason: collision with root package name */
    public static final int f26948x = 8;

    /* renamed from: y, reason: collision with root package name */
    public static final int f26949y = 16;

    /* renamed from: z, reason: collision with root package name */
    public static final int f26950z = 32;

    /* compiled from: AccessibilityEventCompat.java */
    @x0(34)
    static class a {
        private a() {
        }

        static boolean a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.isAccessibilityDataSensitive();
        }

        static void b(AccessibilityEvent accessibilityEvent, boolean z4) {
            accessibilityEvent.setAccessibilityDataSensitive(z4);
        }
    }

    /* compiled from: AccessibilityEventCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: androidx.core.view.accessibility.b$b, reason: collision with other inner class name */
    public @interface InterfaceC0436b {
    }

    private b() {
    }

    @w0(expression = "event.appendRecord(record)")
    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, n0 n0Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) n0Var.g());
    }

    @Deprecated
    public static n0 b(AccessibilityEvent accessibilityEvent) {
        return new n0(accessibilityEvent);
    }

    @w0(expression = "event.getAction()")
    @Deprecated
    public static int c(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getAction();
    }

    @w0(expression = "event.getContentChangeTypes()")
    @SuppressLint({"WrongConstant"})
    @Deprecated
    public static int d(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getContentChangeTypes();
    }

    @w0(expression = "event.getMovementGranularity()")
    @Deprecated
    public static int e(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getMovementGranularity();
    }

    @Deprecated
    public static n0 f(AccessibilityEvent accessibilityEvent, int i4) {
        return new n0(accessibilityEvent.getRecord(i4));
    }

    @w0(expression = "event.getRecordCount()")
    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static boolean h(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(accessibilityEvent);
        }
        return false;
    }

    public static void i(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent, boolean z4) {
        if (Build.VERSION.SDK_INT >= 34) {
            a.b(accessibilityEvent, z4);
        }
    }

    @w0(expression = "event.setAction(action)")
    @Deprecated
    public static void j(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent, int i4) {
        accessibilityEvent.setAction(i4);
    }

    @w0(expression = "event.setContentChangeTypes(changeTypes)")
    @Deprecated
    public static void k(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent, int i4) {
        accessibilityEvent.setContentChangeTypes(i4);
    }

    @w0(expression = "event.setMovementGranularity(granularity)")
    @Deprecated
    public static void l(@androidx.annotation.o0 AccessibilityEvent accessibilityEvent, int i4) {
        accessibilityEvent.setMovementGranularity(i4);
    }
}
