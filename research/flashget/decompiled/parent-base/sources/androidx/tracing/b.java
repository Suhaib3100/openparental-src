package androidx.tracing;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final String f34216a = "Trace";

    /* renamed from: b, reason: collision with root package name */
    static final int f34217b = 127;

    /* renamed from: c, reason: collision with root package name */
    private static long f34218c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f34219d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f34220e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f34221f;

    /* renamed from: g, reason: collision with root package name */
    private static Method f34222g;

    /* renamed from: h, reason: collision with root package name */
    private static boolean f34223h;

    private b() {
    }

    public static void a(@o0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.a(m(str), i4);
        } else {
            b(m(str), i4);
        }
    }

    private static void b(@o0 String str, int i4) {
        try {
            if (f34220e == null) {
                f34220e = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f34220e.invoke(null, Long.valueOf(f34218c), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            h("asyncTraceBegin", e4);
        }
    }

    public static void c(@o0 String str) {
        Trace.beginSection(m(str));
    }

    public static void d(@o0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.b(m(str), i4);
        } else {
            e(m(str), i4);
        }
    }

    private static void e(@o0 String str, int i4) {
        try {
            if (f34221f == null) {
                f34221f = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f34221f.invoke(null, Long.valueOf(f34218c), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            h("asyncTraceEnd", e4);
        }
    }

    public static void f() {
        Trace.endSection();
    }

    public static void g() {
        if (Build.VERSION.SDK_INT < 31) {
            try {
                if (f34223h) {
                    return;
                }
                f34223h = true;
                Trace.class.getMethod("setAppTracingAllowed", Boolean.TYPE).invoke(null, Boolean.TRUE);
            } catch (Exception e4) {
                h("setAppTracingAllowed", e4);
            }
        }
    }

    private static void h(@o0 String str, @o0 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static boolean i() {
        return Build.VERSION.SDK_INT >= 29 ? d.c() : j();
    }

    private static boolean j() {
        try {
            if (f34219d == null) {
                f34218c = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f34219d = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f34219d.invoke(null, Long.valueOf(f34218c))).booleanValue();
        } catch (Exception e4) {
            h("isTagEnabled", e4);
            return false;
        }
    }

    public static void k(@o0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            d.d(m(str), i4);
        } else {
            l(m(str), i4);
        }
    }

    private static void l(@o0 String str, int i4) {
        try {
            if (f34222g == null) {
                f34222g = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f34222g.invoke(null, Long.valueOf(f34218c), str, Integer.valueOf(i4));
        } catch (Exception e4) {
            h("traceCounter", e4);
        }
    }

    @o0
    private static String m(@o0 String str) {
        return str.length() <= 127 ? str : str.substring(0, 127);
    }
}
