package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.p1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: AbstractExecutionThreadService.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public abstract class b implements p1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f57667b = Logger.getLogger(b.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final p1 f57668a = new a();

    /* compiled from: AbstractExecutionThreadService.java */
    class a extends g {

        /* compiled from: AbstractExecutionThreadService.java */
        /* renamed from: com.google.common.util.concurrent.b$a$a, reason: collision with other inner class name */
        class C0885a implements com.google.common.base.u0<String> {
            C0885a() {
            }

            @Override // com.google.common.base.u0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                return b.this.l();
            }
        }

        /* compiled from: AbstractExecutionThreadService.java */
        /* renamed from: com.google.common.util.concurrent.b$a$b, reason: collision with other inner class name */
        class RunnableC0886b implements Runnable {
            RunnableC0886b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    b.this.n();
                    a.this.u();
                    if (a.this.isRunning()) {
                        try {
                            b.this.k();
                        } catch (Throwable th) {
                            try {
                                b.this.m();
                            } catch (Exception e4) {
                                b.f57667b.log(Level.WARNING, ProtectedSandApp.s("麗"), (Throwable) e4);
                            }
                            a.this.t(th);
                            return;
                        }
                    }
                    b.this.m();
                    a.this.v();
                } catch (Throwable th2) {
                    a.this.t(th2);
                }
            }
        }

        a() {
        }

        @Override // com.google.common.util.concurrent.g
        protected final void m() {
            g1.q(b.this.j(), new C0885a()).execute(new RunnableC0886b());
        }

        @Override // com.google.common.util.concurrent.g
        protected void n() {
            b.this.o();
        }

        @Override // com.google.common.util.concurrent.g
        public String toString() {
            return b.this.toString();
        }
    }

    /* compiled from: AbstractExecutionThreadService.java */
    /* renamed from: com.google.common.util.concurrent.b$b, reason: collision with other inner class name */
    class ExecutorC0887b implements Executor {
        ExecutorC0887b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            g1.n(b.this.l(), runnable).start();
        }
    }

    protected b() {
    }

    @Override // com.google.common.util.concurrent.p1
    public final void a(p1.a aVar, Executor executor) {
        this.f57668a.a(aVar, executor);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void b(long j4, TimeUnit timeUnit) throws TimeoutException {
        this.f57668a.b(j4, timeUnit);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void c(long j4, TimeUnit timeUnit) throws TimeoutException {
        this.f57668a.c(j4, timeUnit);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void d() {
        this.f57668a.d();
    }

    @Override // com.google.common.util.concurrent.p1
    @f9.a
    public final p1 e() {
        this.f57668a.e();
        return this;
    }

    @Override // com.google.common.util.concurrent.p1
    public final void f() {
        this.f57668a.f();
    }

    @Override // com.google.common.util.concurrent.p1
    public final Throwable g() {
        return this.f57668a.g();
    }

    @Override // com.google.common.util.concurrent.p1
    @f9.a
    public final p1 h() {
        this.f57668a.h();
        return this;
    }

    @Override // com.google.common.util.concurrent.p1
    public final boolean isRunning() {
        return this.f57668a.isRunning();
    }

    protected Executor j() {
        return new ExecutorC0887b();
    }

    protected abstract void k() throws Exception;

    protected String l() {
        return getClass().getSimpleName();
    }

    protected void m() throws Exception {
    }

    protected void n() throws Exception {
    }

    @d9.a
    protected void o() {
    }

    @Override // com.google.common.util.concurrent.p1
    public final p1.b state() {
        return this.f57668a.state();
    }

    public String toString() {
        String l4 = l();
        String valueOf = String.valueOf(this.f57668a.state());
        return com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(l4, 3), l4, ProtectedSandApp.s("輦"), valueOf, ProtectedSandApp.s("蓮"));
    }
}
