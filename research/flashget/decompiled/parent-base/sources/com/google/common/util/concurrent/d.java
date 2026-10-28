package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: AbstractIdleService.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public abstract class d implements p1 {

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.base.u0<String> f57738a;

    /* renamed from: b, reason: collision with root package name */
    private final p1 f57739b;

    /* compiled from: AbstractIdleService.java */
    class a implements Executor {
        a() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            g1.n((String) d.this.f57738a.get(), runnable).start();
        }
    }

    /* compiled from: AbstractIdleService.java */
    private final class b extends g {

        /* compiled from: AbstractIdleService.java */
        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    d.this.m();
                    b.this.u();
                } catch (Throwable th) {
                    b.this.t(th);
                }
            }
        }

        /* compiled from: AbstractIdleService.java */
        /* renamed from: com.google.common.util.concurrent.d$b$b, reason: collision with other inner class name */
        class RunnableC0889b implements Runnable {
            RunnableC0889b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    d.this.l();
                    b.this.v();
                } catch (Throwable th) {
                    b.this.t(th);
                }
            }
        }

        private b() {
        }

        @Override // com.google.common.util.concurrent.g
        protected final void m() {
            g1.q(d.this.j(), d.this.f57738a).execute(new a());
        }

        @Override // com.google.common.util.concurrent.g
        protected final void n() {
            g1.q(d.this.j(), d.this.f57738a).execute(new RunnableC0889b());
        }

        @Override // com.google.common.util.concurrent.g
        public String toString() {
            return d.this.toString();
        }

        /* synthetic */ b(d dVar, a aVar) {
            this();
        }
    }

    /* compiled from: AbstractIdleService.java */
    private final class c implements com.google.common.base.u0<String> {
        private c() {
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            String k4 = d.this.k();
            String valueOf = String.valueOf(d.this.state());
            return com.google.common.base.h.a(valueOf.length() + com.google.android.gms.common.internal.b.a(k4, 1), k4, ProtectedSandApp.s("嶺"), valueOf);
        }

        /* synthetic */ c(d dVar, a aVar) {
            this();
        }
    }

    protected d() {
        a aVar = null;
        this.f57738a = new c(this, aVar);
        this.f57739b = new b(this, aVar);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void a(p1.a aVar, Executor executor) {
        this.f57739b.a(aVar, executor);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void b(long j4, TimeUnit timeUnit) throws TimeoutException {
        this.f57739b.b(j4, timeUnit);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void c(long j4, TimeUnit timeUnit) throws TimeoutException {
        this.f57739b.c(j4, timeUnit);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void d() {
        this.f57739b.d();
    }

    @Override // com.google.common.util.concurrent.p1
    @f9.a
    public final p1 e() {
        this.f57739b.e();
        return this;
    }

    @Override // com.google.common.util.concurrent.p1
    public final void f() {
        this.f57739b.f();
    }

    @Override // com.google.common.util.concurrent.p1
    public final Throwable g() {
        return this.f57739b.g();
    }

    @Override // com.google.common.util.concurrent.p1
    @f9.a
    public final p1 h() {
        this.f57739b.h();
        return this;
    }

    @Override // com.google.common.util.concurrent.p1
    public final boolean isRunning() {
        return this.f57739b.isRunning();
    }

    protected Executor j() {
        return new a();
    }

    protected String k() {
        return getClass().getSimpleName();
    }

    protected abstract void l() throws Exception;

    protected abstract void m() throws Exception;

    @Override // com.google.common.util.concurrent.p1
    public final p1.b state() {
        return this.f57739b.state();
    }

    public String toString() {
        String k4 = k();
        String valueOf = String.valueOf(this.f57739b.state());
        return com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(k4, 3), k4, ProtectedSandApp.s("聆"), valueOf, ProtectedSandApp.s("鈴"));
    }
}
