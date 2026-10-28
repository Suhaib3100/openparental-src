package com.android.volley;

import android.os.SystemClock;
import android.util.Log;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: VolleyLog.java */
/* loaded from: classes3.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public static String f40942a = ProtectedSandApp.s("ڧ");

    /* renamed from: b, reason: collision with root package name */
    public static boolean f40943b = Log.isLoggable(ProtectedSandApp.s("ڧ"), 2);

    /* renamed from: c, reason: collision with root package name */
    private static final String f40944c = t.class.getName();

    /* compiled from: VolleyLog.java */
    static class a {

        /* renamed from: c, reason: collision with root package name */
        public static final boolean f40945c = t.f40943b;

        /* renamed from: d, reason: collision with root package name */
        private static final long f40946d = 0;

        /* renamed from: a, reason: collision with root package name */
        private final List<C0676a> f40947a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private boolean f40948b = false;

        /* compiled from: VolleyLog.java */
        /* renamed from: com.android.volley.t$a$a, reason: collision with other inner class name */
        private static class C0676a {

            /* renamed from: a, reason: collision with root package name */
            public final String f40949a;

            /* renamed from: b, reason: collision with root package name */
            public final long f40950b;

            /* renamed from: c, reason: collision with root package name */
            public final long f40951c;

            public C0676a(String str, long j4, long j5) {
                this.f40949a = str;
                this.f40950b = j4;
                this.f40951c = j5;
            }
        }

        a() {
        }

        private long c() {
            if (this.f40947a.size() == 0) {
                return 0L;
            }
            return ((C0676a) androidx.appcompat.view.menu.d.a(this.f40947a, 1)).f40951c - this.f40947a.get(0).f40951c;
        }

        public synchronized void a(String str, long j4) {
            if (this.f40948b) {
                throw new IllegalStateException(ProtectedSandApp.s("ڢ"));
            }
            this.f40947a.add(new C0676a(str, j4, SystemClock.elapsedRealtime()));
        }

        public synchronized void b(String str) {
            this.f40948b = true;
            long c5 = c();
            if (c5 <= 0) {
                return;
            }
            long j4 = this.f40947a.get(0).f40951c;
            t.b(ProtectedSandApp.s("ڣ"), Long.valueOf(c5), str);
            for (C0676a c0676a : this.f40947a) {
                long j5 = c0676a.f40951c;
                t.b(ProtectedSandApp.s("ڤ"), Long.valueOf(j5 - j4), Long.valueOf(c0676a.f40950b), c0676a.f40949a);
                j4 = j5;
            }
        }

        protected void finalize() throws Throwable {
            if (this.f40948b) {
                return;
            }
            b(ProtectedSandApp.s("ڥ"));
            t.c(ProtectedSandApp.s("ڦ"), new Object[0]);
        }
    }

    private static String a(String str, Object... objArr) {
        String s4;
        if (objArr != null) {
            str = String.format(Locale.US, str, objArr);
        }
        StackTraceElement[] stackTrace = new Throwable().fillInStackTrace().getStackTrace();
        int i4 = 2;
        while (true) {
            if (i4 >= stackTrace.length) {
                s4 = ProtectedSandApp.s("ک");
                break;
            }
            if (!stackTrace[i4].getClassName().equals(f40944c)) {
                String className = stackTrace[i4].getClassName();
                String substring = className.substring(className.lastIndexOf(46) + 1);
                StringBuilder a5 = androidx.constraintlayout.core.e.a(substring.substring(substring.lastIndexOf(36) + 1), ProtectedSandApp.s("ڨ"));
                a5.append(stackTrace[i4].getMethodName());
                s4 = a5.toString();
                break;
            }
            i4++;
        }
        return String.format(Locale.US, ProtectedSandApp.s("ڪ"), Long.valueOf(Thread.currentThread().getId()), s4, str);
    }

    public static void b(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void c(String str, Object... objArr) {
        a(str, objArr);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        a(str, objArr);
    }

    public static void e(String str) {
        a(ProtectedSandApp.s("ګ"), str);
        f40942a = str;
        f40943b = Log.isLoggable(str, 2);
    }

    public static void f(String str, Object... objArr) {
        if (f40943b) {
            a(str, objArr);
        }
    }

    public static void g(String str, Object... objArr) {
        Log.wtf(f40942a, a(str, objArr));
    }

    public static void h(Throwable th, String str, Object... objArr) {
        Log.wtf(f40942a, a(str, objArr), th);
    }
}
