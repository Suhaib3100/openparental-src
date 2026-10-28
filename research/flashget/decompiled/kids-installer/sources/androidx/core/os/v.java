package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4996a = "TraceCompat";

    /* renamed from: b, reason: collision with root package name */
    private static long f4997b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f4998c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f4999d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f5000e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f5001f;

    /* compiled from: TraceCompat.java */
    @x0(18)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(String str) {
            Trace.beginSection(str);
        }

        @androidx.annotation.u
        static void b() {
            Trace.endSection();
        }
    }

    /* compiled from: TraceCompat.java */
    @x0(29)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(String str, int i5) {
            Trace.beginAsyncSection(str, i5);
        }

        @androidx.annotation.u
        static void b(String str, int i5) {
            Trace.endAsyncSection(str, i5);
        }

        @androidx.annotation.u
        static boolean c() {
            boolean isEnabled;
            isEnabled = Trace.isEnabled();
            return isEnabled;
        }

        @androidx.annotation.u
        static void d(String str, long j5) {
            Trace.setCounter(str, j5);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f4997b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f4998c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f4999d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f5000e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f5001f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    private v() {
    }

    public static void a(@o0 String str, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(str, i5);
        } else {
            try {
                f4999d.invoke(null, Long.valueOf(f4997b), str, Integer.valueOf(i5));
            } catch (Exception unused) {
            }
        }
    }

    public static void b(@o0 String str) {
        a.a(str);
    }

    public static void c(@o0 String str, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(str, i5);
        } else {
            try {
                f5000e.invoke(null, Long.valueOf(f4997b), str, Integer.valueOf(i5));
            } catch (Exception unused) {
            }
        }
    }

    public static void d() {
        a.b();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.c();
        }
        try {
            return ((Boolean) f4998c.invoke(null, Long.valueOf(f4997b))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void f(@o0 String str, int i5) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.d(str, i5);
        } else {
            try {
                f5001f.invoke(null, Long.valueOf(f4997b), str, Integer.valueOf(i5));
            } catch (Exception unused) {
            }
        }
    }
}
