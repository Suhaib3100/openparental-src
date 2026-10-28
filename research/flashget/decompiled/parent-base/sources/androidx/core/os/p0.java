package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import androidx.annotation.x0;
import java.lang.reflect.Method;

/* compiled from: TraceCompat.java */
@Deprecated
/* loaded from: classes3.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f26540a = "TraceCompat";

    /* renamed from: b, reason: collision with root package name */
    private static long f26541b;

    /* renamed from: c, reason: collision with root package name */
    private static Method f26542c;

    /* renamed from: d, reason: collision with root package name */
    private static Method f26543d;

    /* renamed from: e, reason: collision with root package name */
    private static Method f26544e;

    /* renamed from: f, reason: collision with root package name */
    private static Method f26545f;

    /* compiled from: TraceCompat.java */
    @x0(29)
    static class a {
        private a() {
        }

        static void a(String str, int i4) {
            Trace.beginAsyncSection(str, i4);
        }

        static void b(String str, int i4) {
            Trace.endAsyncSection(str, i4);
        }

        static boolean c() {
            return Trace.isEnabled();
        }

        static void d(String str, long j4) {
            Trace.setCounter(str, j4);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f26541b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f26542c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f26543d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f26544e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f26545f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception unused) {
            }
        }
    }

    private p0() {
    }

    public static void a(@androidx.annotation.o0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.a(str, i4);
        } else {
            try {
                f26543d.invoke(null, Long.valueOf(f26541b), str, Integer.valueOf(i4));
            } catch (Exception unused) {
            }
        }
    }

    public static void b(@androidx.annotation.o0 String str) {
        Trace.beginSection(str);
    }

    public static void c(@androidx.annotation.o0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.b(str, i4);
        } else {
            try {
                f26544e.invoke(null, Long.valueOf(f26541b), str, Integer.valueOf(i4));
            } catch (Exception unused) {
            }
        }
    }

    public static void d() {
        Trace.endSection();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return a.c();
        }
        try {
            return ((Boolean) f26542c.invoke(null, Long.valueOf(f26541b))).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static void f(@androidx.annotation.o0 String str, int i4) {
        if (Build.VERSION.SDK_INT >= 29) {
            a.d(str, i4);
        } else {
            try {
                f26545f.invoke(null, Long.valueOf(f26541b), str, Integer.valueOf(i4));
            } catch (Exception unused) {
            }
        }
    }
}
