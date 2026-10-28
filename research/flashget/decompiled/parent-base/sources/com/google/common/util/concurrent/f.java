package com.google.common.util.concurrent;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.util.concurrent.p1;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Logger;

/* compiled from: AbstractScheduledService.java */
@b0
@d9.c
/* loaded from: classes6.dex */
public abstract class f implements p1 {

    /* renamed from: b, reason: collision with root package name */
    private static final Logger f57767b = Logger.getLogger(f.class.getName());

    /* renamed from: a, reason: collision with root package name */
    private final com.google.common.util.concurrent.g f57768a = new g(this, null);

    /* compiled from: AbstractScheduledService.java */
    class a extends p1.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ScheduledExecutorService f57769a;

        a(f fVar, ScheduledExecutorService scheduledExecutorService) {
            this.f57769a = scheduledExecutorService;
        }

        @Override // com.google.common.util.concurrent.p1.a
        public void a(p1.b bVar, Throwable th) {
            this.f57769a.shutdown();
        }

        @Override // com.google.common.util.concurrent.p1.a
        public void e(p1.b bVar) {
            this.f57769a.shutdown();
        }
    }

    /* compiled from: AbstractScheduledService.java */
    class b implements ThreadFactory {
        b() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return g1.n(f.this.n(), runnable);
        }
    }

    /* compiled from: AbstractScheduledService.java */
    interface c {
        void cancel(boolean z4);

        boolean isCancelled();
    }

    /* compiled from: AbstractScheduledService.java */
    public static abstract class d extends AbstractC0890f {

        /* compiled from: AbstractScheduledService.java */
        private final class a implements Callable<Void> {

            /* renamed from: a, reason: collision with root package name */
            private final Runnable f57771a;

            /* renamed from: b, reason: collision with root package name */
            private final ScheduledExecutorService f57772b;

            /* renamed from: c, reason: collision with root package name */
            private final com.google.common.util.concurrent.g f57773c;

            /* renamed from: d, reason: collision with root package name */
            private final ReentrantLock f57774d = new ReentrantLock();

            /* renamed from: e, reason: collision with root package name */
            @g9.a("lock")
            @zc.a
            private c f57775e;

            a(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                this.f57771a = runnable;
                this.f57772b = scheduledExecutorService;
                this.f57773c = gVar;
            }

            @g9.a("lock")
            private c b(b bVar) {
                c cVar = this.f57775e;
                if (cVar == null) {
                    c cVar2 = new c(this.f57774d, d(bVar));
                    this.f57775e = cVar2;
                    return cVar2;
                }
                if (!cVar.f57780b.isCancelled()) {
                    this.f57775e.f57780b = d(bVar);
                }
                return this.f57775e;
            }

            private ScheduledFuture<Void> d(b bVar) {
                return this.f57772b.schedule(this, bVar.f57777a, bVar.f57778b);
            }

            @Override // java.util.concurrent.Callable
            @zc.a
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Void call() throws Exception {
                this.f57771a.run();
                c();
                return null;
            }

            @f9.a
            public c c() {
                c eVar;
                try {
                    b d5 = d.this.d();
                    this.f57774d.lock();
                    try {
                        eVar = b(d5);
                        this.f57774d.unlock();
                        th = null;
                    } catch (Throwable th) {
                        th = th;
                        try {
                            eVar = new e(s0.k());
                        } finally {
                            this.f57774d.unlock();
                        }
                    }
                    if (th != null) {
                        this.f57773c.t(th);
                    }
                    return eVar;
                } catch (Throwable th2) {
                    this.f57773c.t(th2);
                    return new e(s0.k());
                }
            }
        }

        /* compiled from: AbstractScheduledService.java */
        protected static final class b {

            /* renamed from: a, reason: collision with root package name */
            private final long f57777a;

            /* renamed from: b, reason: collision with root package name */
            private final TimeUnit f57778b;

            public b(long j4, TimeUnit timeUnit) {
                this.f57777a = j4;
                timeUnit.getClass();
                this.f57778b = timeUnit;
            }
        }

        /* compiled from: AbstractScheduledService.java */
        private static final class c implements c {

            /* renamed from: a, reason: collision with root package name */
            private final ReentrantLock f57779a;

            /* renamed from: b, reason: collision with root package name */
            @g9.a("lock")
            private Future<Void> f57780b;

            c(ReentrantLock reentrantLock, Future<Void> future) {
                this.f57779a = reentrantLock;
                this.f57780b = future;
            }

            @Override // com.google.common.util.concurrent.f.c
            public void cancel(boolean z4) {
                this.f57779a.lock();
                try {
                    this.f57780b.cancel(z4);
                } finally {
                    this.f57779a.unlock();
                }
            }

            @Override // com.google.common.util.concurrent.f.c
            public boolean isCancelled() {
                this.f57779a.lock();
                try {
                    return this.f57780b.isCancelled();
                } finally {
                    this.f57779a.unlock();
                }
            }
        }

        @Override // com.google.common.util.concurrent.f.AbstractC0890f
        final c c(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
            return new a(gVar, scheduledExecutorService, runnable).c();
        }

        protected abstract b d() throws Exception;
    }

    /* compiled from: AbstractScheduledService.java */
    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final Future<?> f57781a;

        e(Future<?> future) {
            this.f57781a = future;
        }

        @Override // com.google.common.util.concurrent.f.c
        public void cancel(boolean z4) {
            this.f57781a.cancel(z4);
        }

        @Override // com.google.common.util.concurrent.f.c
        public boolean isCancelled() {
            return this.f57781a.isCancelled();
        }
    }

    /* compiled from: AbstractScheduledService.java */
    /* renamed from: com.google.common.util.concurrent.f$f, reason: collision with other inner class name */
    public static abstract class AbstractC0890f {

        /* compiled from: AbstractScheduledService.java */
        /* renamed from: com.google.common.util.concurrent.f$f$a */
        class a extends AbstractC0890f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f57782a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f57783b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ TimeUnit f57784c;

            a(long j4, long j5, TimeUnit timeUnit) {
                this.f57782a = j4;
                this.f57783b = j5;
                this.f57784c = timeUnit;
            }

            @Override // com.google.common.util.concurrent.f.AbstractC0890f
            public c c(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new e(scheduledExecutorService.scheduleWithFixedDelay(runnable, this.f57782a, this.f57783b, this.f57784c));
            }
        }

        /* compiled from: AbstractScheduledService.java */
        /* renamed from: com.google.common.util.concurrent.f$f$b */
        class b extends AbstractC0890f {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ long f57785a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ long f57786b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ TimeUnit f57787c;

            b(long j4, long j5, TimeUnit timeUnit) {
                this.f57785a = j4;
                this.f57786b = j5;
                this.f57787c = timeUnit;
            }

            @Override // com.google.common.util.concurrent.f.AbstractC0890f
            public c c(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable) {
                return new e(scheduledExecutorService.scheduleAtFixedRate(runnable, this.f57785a, this.f57786b, this.f57787c));
            }
        }

        private AbstractC0890f() {
        }

        public static AbstractC0890f a(long j4, long j5, TimeUnit timeUnit) {
            timeUnit.getClass();
            com.google.common.base.l0.p(j5 > 0, ProtectedSandApp.s("領"), j5);
            return new a(j4, j5, timeUnit);
        }

        public static AbstractC0890f b(long j4, long j5, TimeUnit timeUnit) {
            timeUnit.getClass();
            com.google.common.base.l0.p(j5 > 0, ProtectedSandApp.s("例"), j5);
            return new b(j4, j5, timeUnit);
        }

        abstract c c(com.google.common.util.concurrent.g gVar, ScheduledExecutorService scheduledExecutorService, Runnable runnable);

        AbstractC0890f(a aVar) {
        }
    }

    protected f() {
    }

    @Override // com.google.common.util.concurrent.p1
    public final void a(p1.a aVar, Executor executor) {
        this.f57768a.a(aVar, executor);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void b(long j4, TimeUnit timeUnit) throws TimeoutException {
        this.f57768a.b(j4, timeUnit);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void c(long j4, TimeUnit timeUnit) throws TimeoutException {
        this.f57768a.c(j4, timeUnit);
    }

    @Override // com.google.common.util.concurrent.p1
    public final void d() {
        this.f57768a.d();
    }

    @Override // com.google.common.util.concurrent.p1
    @f9.a
    public final p1 e() {
        this.f57768a.e();
        return this;
    }

    @Override // com.google.common.util.concurrent.p1
    public final void f() {
        this.f57768a.f();
    }

    @Override // com.google.common.util.concurrent.p1
    public final Throwable g() {
        return this.f57768a.g();
    }

    @Override // com.google.common.util.concurrent.p1
    @f9.a
    public final p1 h() {
        this.f57768a.h();
        return this;
    }

    @Override // com.google.common.util.concurrent.p1
    public final boolean isRunning() {
        return this.f57768a.isRunning();
    }

    protected ScheduledExecutorService k() {
        ScheduledExecutorService newSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new b());
        a(new a(this, newSingleThreadScheduledExecutor), a0.INSTANCE);
        return newSingleThreadScheduledExecutor;
    }

    protected abstract void l() throws Exception;

    protected abstract AbstractC0890f m();

    protected String n() {
        return getClass().getSimpleName();
    }

    protected void o() throws Exception {
    }

    protected void p() throws Exception {
    }

    @Override // com.google.common.util.concurrent.p1
    public final p1.b state() {
        return this.f57768a.state();
    }

    public String toString() {
        String n4 = n();
        String valueOf = String.valueOf(this.f57768a.state());
        return com.google.common.base.e.a(valueOf.length() + com.google.android.gms.common.internal.b.a(n4, 3), n4, ProtectedSandApp.s("寮"), valueOf, ProtectedSandApp.s("尿"));
    }

    /* compiled from: AbstractScheduledService.java */
    private final class g extends com.google.common.util.concurrent.g {

        /* renamed from: p, reason: collision with root package name */
        @zc.a
        private volatile c f57788p;

        /* renamed from: q, reason: collision with root package name */
        @zc.a
        private volatile ScheduledExecutorService f57789q;

        /* renamed from: r, reason: collision with root package name */
        private final ReentrantLock f57790r;

        /* renamed from: s, reason: collision with root package name */
        private final Runnable f57791s;

        /* compiled from: AbstractScheduledService.java */
        class a implements com.google.common.base.u0<String> {
            a() {
            }

            @Override // com.google.common.base.u0
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public String get() {
                String n4 = f.this.n();
                String valueOf = String.valueOf(g.this.state());
                return com.google.common.base.h.a(valueOf.length() + com.google.android.gms.common.internal.b.a(n4, 1), n4, ProtectedSandApp.s("禮"), valueOf);
            }
        }

        /* compiled from: AbstractScheduledService.java */
        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                g.this.f57790r.lock();
                try {
                    f.this.p();
                    g gVar = g.this;
                    gVar.f57788p = f.this.m().c(f.this.f57768a, g.this.f57789q, g.this.f57791s);
                    g.this.u();
                } finally {
                    try {
                    } finally {
                    }
                }
            }
        }

        /* compiled from: AbstractScheduledService.java */
        class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    g.this.f57790r.lock();
                    try {
                        if (g.this.state() != p1.b.STOPPING) {
                            return;
                        }
                        f.this.o();
                        g.this.f57790r.unlock();
                        g.this.v();
                    } finally {
                        g.this.f57790r.unlock();
                    }
                } catch (Throwable th) {
                    g.this.t(th);
                }
            }
        }

        /* compiled from: AbstractScheduledService.java */
        class d implements Runnable {
            d() {
            }

            @Override // java.lang.Runnable
            public void run() {
                c cVar;
                g.this.f57790r.lock();
                try {
                    cVar = g.this.f57788p;
                    Objects.requireNonNull(cVar);
                } finally {
                    try {
                    } finally {
                    }
                }
                if (cVar.isCancelled()) {
                    return;
                }
                f.this.l();
            }
        }

        private g() {
            this.f57790r = new ReentrantLock();
            this.f57791s = new d();
        }

        @Override // com.google.common.util.concurrent.g
        protected final void m() {
            this.f57789q = g1.s(f.this.k(), new a());
            this.f57789q.execute(new b());
        }

        @Override // com.google.common.util.concurrent.g
        protected final void n() {
            Objects.requireNonNull(this.f57788p);
            Objects.requireNonNull(this.f57789q);
            this.f57788p.cancel(false);
            this.f57789q.execute(new c());
        }

        @Override // com.google.common.util.concurrent.g
        public String toString() {
            return f.this.toString();
        }

        /* synthetic */ g(f fVar, a aVar) {
            this();
        }
    }
}
