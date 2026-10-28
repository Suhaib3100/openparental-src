package androidx.tracing;

import android.annotation.SuppressLint;
import android.os.Trace;
import androidx.annotation.o0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: Trace.java */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    static final String f9650a = "Trace";

    /* renamed from: b, reason: collision with root package name */
    private static long f9651b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f9652c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f9653d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f9654e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f9655f;

    private b() {
    }

    @SuppressLint({"NewApi"})
    public static void a(@o0 String str, int i5) {
        try {
            if (f9653d == null) {
                Trace.beginAsyncSection(str, i5);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i5);
    }

    private static void b(@o0 String str, int i5) {
        try {
            if (f9653d == null) {
                f9653d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f9653d.invoke(null, Long.valueOf(f9651b), str, Integer.valueOf(i5));
        } catch (Exception e6) {
            g("asyncTraceBegin", e6);
        }
    }

    public static void c(@o0 String str) {
        Trace.beginSection(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(@o0 String str, int i5) {
        try {
            if (f9654e == null) {
                Trace.endAsyncSection(str, i5);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i5);
    }

    private static void e(@o0 String str, int i5) {
        try {
            if (f9654e == null) {
                f9654e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f9654e.invoke(null, Long.valueOf(f9651b), str, Integer.valueOf(i5));
        } catch (Exception e6) {
            g("asyncTraceEnd", e6);
        }
    }

    public static void f() {
        Trace.endSection();
    }

    private static void g(@o0 String str, @o0 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        boolean isEnabled;
        try {
            if (f9652c == null) {
                isEnabled = Trace.isEnabled();
                return isEnabled;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (f9652c == null) {
                f9651b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f9652c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f9652c.invoke(null, Long.valueOf(f9651b))).booleanValue();
        } catch (Exception e6) {
            g("isTagEnabled", e6);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@o0 String str, int i5) {
        try {
            if (f9655f == null) {
                Trace.setCounter(str, i5);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        k(str, i5);
    }

    private static void k(@o0 String str, int i5) {
        try {
            if (f9655f == null) {
                f9655f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f9655f.invoke(null, Long.valueOf(f9651b), str, Integer.valueOf(i5));
        } catch (Exception e6) {
            g("traceCounter", e6);
        }
    }
}
