package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.v1;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: RateLimiter.java */
@b0
@d9.a
@d9.c
/* loaded from: classes6.dex */
public abstract class m1 {

    /* renamed from: a, reason: collision with root package name */
    private final a f57892a;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private volatile Object f57893b;

    /* compiled from: RateLimiter.java */
    static abstract class a {

        /* compiled from: RateLimiter.java */
        /* renamed from: com.google.common.util.concurrent.m1$a$a, reason: collision with other inner class name */
        class C0892a extends a {

            /* renamed from: a, reason: collision with root package name */
            final com.google.common.base.s0 f57894a = com.google.common.base.s0.c();

            C0892a() {
            }

            @Override // com.google.common.util.concurrent.m1.a
            protected long b() {
                return this.f57894a.g(TimeUnit.MICROSECONDS);
            }

            @Override // com.google.common.util.concurrent.m1.a
            protected void c(long j4) {
                if (j4 > 0) {
                    j2.k(j4, TimeUnit.MICROSECONDS);
                }
            }
        }

        protected a() {
        }

        public static a a() {
            return new C0892a();
        }

        protected abstract long b();

        protected abstract void c(long j4);
    }

    m1(a aVar) {
        aVar.getClass();
        this.f57892a = aVar;
    }

    private boolean c(long j4, long j5) {
        return m(j4) - j5 <= j4;
    }

    private static void d(int i4) {
        com.google.common.base.l0.k(i4 > 0, ProtectedSandApp.s("立"), i4);
    }

    public static m1 e(double d5) {
        return h(d5, new a.C0892a());
    }

    public static m1 f(double d5, long j4, TimeUnit timeUnit) {
        com.google.common.base.l0.p(j4 >= 0, ProtectedSandApp.s("笠"), j4);
        return g(d5, j4, timeUnit, 3.0d, new a.C0892a());
    }

    @d9.d
    static m1 g(double d5, long j4, TimeUnit timeUnit, double d6, a aVar) {
        v1.c cVar = new v1.c(aVar, j4, timeUnit, d6);
        cVar.q(d5);
        return cVar;
    }

    @d9.d
    static m1 h(double d5, a aVar) {
        v1.b bVar = new v1.b(aVar, 1.0d);
        bVar.q(d5);
        return bVar;
    }

    private Object l() {
        Object obj = this.f57893b;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.f57893b;
                    if (obj == null) {
                        obj = new Object();
                        this.f57893b = obj;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    @f9.a
    public double a() {
        return b(1);
    }

    @f9.a
    public double b(int i4) {
        long n4 = n(i4);
        this.f57892a.c(n4);
        return (n4 * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    abstract double i();

    abstract void j(double d5, long j4);

    public final double k() {
        double i4;
        synchronized (l()) {
            i4 = i();
        }
        return i4;
    }

    abstract long m(long j4);

    final long n(int i4) {
        long o4;
        d(i4);
        synchronized (l()) {
            o4 = o(i4, this.f57892a.b());
        }
        return o4;
    }

    final long o(int i4, long j4) {
        return Math.max(p(i4, j4) - j4, 0L);
    }

    abstract long p(int i4, long j4);

    public final void q(double d5) {
        com.google.common.base.l0.e(d5 > com.google.firebase.remoteconfig.p.f60679p && !Double.isNaN(d5), ProtectedSandApp.s("粒"));
        synchronized (l()) {
            j(d5, this.f57892a.b());
        }
    }

    public boolean r() {
        return t(1, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean s(int i4) {
        return t(i4, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean t(int i4, long j4, TimeUnit timeUnit) {
        long max = Math.max(timeUnit.toMicros(j4), 0L);
        d(i4);
        synchronized (l()) {
            try {
                long b5 = this.f57892a.b();
                if (!c(b5, max)) {
                    return false;
                }
                this.f57892a.c(o(i4, b5));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, ProtectedSandApp.s("狀"), Double.valueOf(k()));
    }

    public boolean u(long j4, TimeUnit timeUnit) {
        return t(1, j4, timeUnit);
    }
}
