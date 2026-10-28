package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: AccessibilityEventCompat.java */
/* loaded from: classes.dex */
public final class b {
    public static final int A = -1;

    /* renamed from: a, reason: collision with root package name */
    @Deprecated
    public static final int f5310a = 128;

    /* renamed from: b, reason: collision with root package name */
    @Deprecated
    public static final int f5311b = 256;

    /* renamed from: c, reason: collision with root package name */
    @Deprecated
    public static final int f5312c = 512;

    /* renamed from: d, reason: collision with root package name */
    @Deprecated
    public static final int f5313d = 1024;

    /* renamed from: e, reason: collision with root package name */
    @Deprecated
    public static final int f5314e = 2048;

    /* renamed from: f, reason: collision with root package name */
    @Deprecated
    public static final int f5315f = 4096;

    /* renamed from: g, reason: collision with root package name */
    @Deprecated
    public static final int f5316g = 8192;

    /* renamed from: h, reason: collision with root package name */
    public static final int f5317h = 16384;

    /* renamed from: i, reason: collision with root package name */
    public static final int f5318i = 32768;

    /* renamed from: j, reason: collision with root package name */
    public static final int f5319j = 65536;

    /* renamed from: k, reason: collision with root package name */
    public static final int f5320k = 131072;

    /* renamed from: l, reason: collision with root package name */
    public static final int f5321l = 262144;

    /* renamed from: m, reason: collision with root package name */
    public static final int f5322m = 524288;

    /* renamed from: n, reason: collision with root package name */
    public static final int f5323n = 1048576;

    /* renamed from: o, reason: collision with root package name */
    public static final int f5324o = 2097152;

    /* renamed from: p, reason: collision with root package name */
    public static final int f5325p = 4194304;

    /* renamed from: q, reason: collision with root package name */
    public static final int f5326q = 8388608;

    /* renamed from: r, reason: collision with root package name */
    public static final int f5327r = 16777216;

    /* renamed from: s, reason: collision with root package name */
    public static final int f5328s = 0;

    /* renamed from: t, reason: collision with root package name */
    public static final int f5329t = 1;

    /* renamed from: u, reason: collision with root package name */
    public static final int f5330u = 2;

    /* renamed from: v, reason: collision with root package name */
    public static final int f5331v = 4;

    /* renamed from: w, reason: collision with root package name */
    public static final int f5332w = 8;

    /* renamed from: x, reason: collision with root package name */
    public static final int f5333x = 16;

    /* renamed from: y, reason: collision with root package name */
    public static final int f5334y = 32;

    /* renamed from: z, reason: collision with root package name */
    public static final int f5335z = 64;

    /* compiled from: AccessibilityEventCompat.java */
    @x0(16)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getAction();
        }

        @androidx.annotation.u
        static int b(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getMovementGranularity();
        }

        @androidx.annotation.u
        static void c(AccessibilityEvent accessibilityEvent, int i5) {
            accessibilityEvent.setAction(i5);
        }

        @androidx.annotation.u
        static void d(AccessibilityEvent accessibilityEvent, int i5) {
            accessibilityEvent.setMovementGranularity(i5);
        }
    }

    /* compiled from: AccessibilityEventCompat.java */
    @x0(19)
    /* renamed from: androidx.core.view.accessibility.b$b, reason: collision with other inner class name */
    static class C0054b {
        private C0054b() {
        }

        @androidx.annotation.u
        static int a(AccessibilityEvent accessibilityEvent) {
            return accessibilityEvent.getContentChangeTypes();
        }

        @androidx.annotation.u
        static void b(AccessibilityEvent accessibilityEvent, int i5) {
            accessibilityEvent.setContentChangeTypes(i5);
        }
    }

    /* compiled from: AccessibilityEventCompat.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    private b() {
    }

    @Deprecated
    public static void a(AccessibilityEvent accessibilityEvent, l0 l0Var) {
        accessibilityEvent.appendRecord((AccessibilityRecord) l0Var.g());
    }

    @Deprecated
    public static l0 b(AccessibilityEvent accessibilityEvent) {
        return new l0(accessibilityEvent);
    }

    public static int c(@o0 AccessibilityEvent accessibilityEvent) {
        return a.a(accessibilityEvent);
    }

    public static int d(@o0 AccessibilityEvent accessibilityEvent) {
        return C0054b.a(accessibilityEvent);
    }

    public static int e(@o0 AccessibilityEvent accessibilityEvent) {
        return a.b(accessibilityEvent);
    }

    @Deprecated
    public static l0 f(AccessibilityEvent accessibilityEvent, int i5) {
        return new l0(accessibilityEvent.getRecord(i5));
    }

    @Deprecated
    public static int g(AccessibilityEvent accessibilityEvent) {
        return accessibilityEvent.getRecordCount();
    }

    public static void h(@o0 AccessibilityEvent accessibilityEvent, int i5) {
        a.c(accessibilityEvent, i5);
    }

    public static void i(@o0 AccessibilityEvent accessibilityEvent, int i5) {
        C0054b.b(accessibilityEvent, i5);
    }

    public static void j(@o0 AccessibilityEvent accessibilityEvent, int i5) {
        a.d(accessibilityEvent, i5);
    }
}
