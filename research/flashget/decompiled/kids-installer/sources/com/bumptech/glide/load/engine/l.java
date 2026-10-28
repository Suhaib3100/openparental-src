package com.bumptech.glide.load.engine;

import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.core.util.p;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.util.pool.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob.java */
/* loaded from: classes3.dex */
class l<R> implements h.b<R>, a.f {
    private static final c N = new c();
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private u<?> E;
    com.bumptech.glide.load.a F;
    private boolean G;
    GlideException H;
    private boolean I;
    p<?> J;
    private h<R> K;
    private volatile boolean L;
    private boolean M;

    /* renamed from: o, reason: collision with root package name */
    final e f11393o;

    /* renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f11394p;

    /* renamed from: q, reason: collision with root package name */
    private final p.a f11395q;

    /* renamed from: r, reason: collision with root package name */
    private final p.a<l<?>> f11396r;

    /* renamed from: s, reason: collision with root package name */
    private final c f11397s;

    /* renamed from: t, reason: collision with root package name */
    private final m f11398t;

    /* renamed from: u, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f11399u;

    /* renamed from: v, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f11400v;

    /* renamed from: w, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f11401w;

    /* renamed from: x, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f11402x;

    /* renamed from: y, reason: collision with root package name */
    private final AtomicInteger f11403y;

    /* renamed from: z, reason: collision with root package name */
    private com.bumptech.glide.load.f f11404z;

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    private class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final com.bumptech.glide.request.j f11405o;

        a(com.bumptech.glide.request.j jVar) {
            this.f11405o = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f11405o.g()) {
                synchronized (l.this) {
                    if (l.this.f11393o.f(this.f11405o)) {
                        l.this.e(this.f11405o);
                    }
                    l.this.h();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    private class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        private final com.bumptech.glide.request.j f11407o;

        b(com.bumptech.glide.request.j jVar) {
            this.f11407o = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f11407o.g()) {
                synchronized (l.this) {
                    if (l.this.f11393o.f(this.f11407o)) {
                        l.this.J.b();
                        l.this.f(this.f11407o);
                        l.this.s(this.f11407o);
                    }
                    l.this.h();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    @m1
    /* loaded from: classes.dex */
    static class c {
        c() {
        }

        public <R> p<R> a(u<R> uVar, boolean z5, com.bumptech.glide.load.f fVar, p.a aVar) {
            return new p<>(uVar, z5, true, fVar, aVar);
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.request.j f11409a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f11410b;

        d(com.bumptech.glide.request.j jVar, Executor executor) {
            this.f11409a = jVar;
            this.f11410b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f11409a.equals(((d) obj).f11409a);
            }
            return false;
        }

        public int hashCode() {
            return this.f11409a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    /* loaded from: classes.dex */
    static final class e implements Iterable<d> {

        /* renamed from: o, reason: collision with root package name */
        private final List<d> f11411o;

        e() {
            this(new ArrayList(2));
        }

        private static d h(com.bumptech.glide.request.j jVar) {
            return new d(jVar, com.bumptech.glide.util.f.a());
        }

        void b(com.bumptech.glide.request.j jVar, Executor executor) {
            this.f11411o.add(new d(jVar, executor));
        }

        void clear() {
            this.f11411o.clear();
        }

        boolean f(com.bumptech.glide.request.j jVar) {
            return this.f11411o.contains(h(jVar));
        }

        e g() {
            return new e(new ArrayList(this.f11411o));
        }

        void i(com.bumptech.glide.request.j jVar) {
            this.f11411o.remove(h(jVar));
        }

        boolean isEmpty() {
            return this.f11411o.isEmpty();
        }

        @Override // java.lang.Iterable
        @o0
        public Iterator<d> iterator() {
            return this.f11411o.iterator();
        }

        int size() {
            return this.f11411o.size();
        }

        e(List<d> list) {
            this.f11411o = list;
        }
    }

    l(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5, p.a<l<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, aVar6, N);
    }

    private com.bumptech.glide.load.engine.executor.a i() {
        return this.B ? this.f11401w : this.C ? this.f11402x : this.f11400v;
    }

    private boolean n() {
        return this.I || this.G || this.L;
    }

    private synchronized void r() {
        if (this.f11404z == null) {
            throw new IllegalArgumentException();
        }
        this.f11393o.clear();
        this.f11404z = null;
        this.J = null;
        this.E = null;
        this.I = false;
        this.L = false;
        this.G = false;
        this.M = false;
        this.K.G(false);
        this.K = null;
        this.H = null;
        this.F = null;
        this.f11396r.a(this);
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void a(GlideException glideException) {
        synchronized (this) {
            this.H = glideException;
        }
        o();
    }

    synchronized void b(com.bumptech.glide.request.j jVar, Executor executor) {
        this.f11394p.c();
        this.f11393o.b(jVar, executor);
        boolean z5 = true;
        if (this.G) {
            j(1);
            executor.execute(new b(jVar));
        } else if (this.I) {
            j(1);
            executor.execute(new a(jVar));
        } else {
            if (this.L) {
                z5 = false;
            }
            com.bumptech.glide.util.l.a(z5, ProtectedSandApp.s("ᳮ"));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void c(u<R> uVar, com.bumptech.glide.load.a aVar, boolean z5) {
        synchronized (this) {
            this.E = uVar;
            this.F = aVar;
            this.M = z5;
        }
        p();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void d(h<?> hVar) {
        i().execute(hVar);
    }

    @b0("this")
    void e(com.bumptech.glide.request.j jVar) {
        try {
            jVar.a(this.H);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    @b0("this")
    void f(com.bumptech.glide.request.j jVar) {
        try {
            jVar.c(this.J, this.F, this.M);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    void g() {
        if (n()) {
            return;
        }
        this.L = true;
        this.K.o();
        this.f11398t.c(this, this.f11404z);
    }

    void h() {
        p<?> pVar;
        synchronized (this) {
            this.f11394p.c();
            com.bumptech.glide.util.l.a(n(), ProtectedSandApp.s("ᳯ"));
            int decrementAndGet = this.f11403y.decrementAndGet();
            com.bumptech.glide.util.l.a(decrementAndGet >= 0, ProtectedSandApp.s("ᳰ"));
            if (decrementAndGet == 0) {
                pVar = this.J;
                r();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.f();
        }
    }

    synchronized void j(int i5) {
        p<?> pVar;
        com.bumptech.glide.util.l.a(n(), ProtectedSandApp.s("ᳱ"));
        if (this.f11403y.getAndAdd(i5) == 0 && (pVar = this.J) != null) {
            pVar.b();
        }
    }

    @m1
    synchronized l<R> k(com.bumptech.glide.load.f fVar, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.f11404z = fVar;
        this.A = z5;
        this.B = z6;
        this.C = z7;
        this.D = z8;
        return this;
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @o0
    public com.bumptech.glide.util.pool.c l() {
        return this.f11394p;
    }

    synchronized boolean m() {
        return this.L;
    }

    void o() {
        synchronized (this) {
            this.f11394p.c();
            if (this.L) {
                r();
                return;
            }
            if (this.f11393o.isEmpty()) {
                throw new IllegalStateException(ProtectedSandApp.s("ᳳ"));
            }
            if (this.I) {
                throw new IllegalStateException(ProtectedSandApp.s("ᳲ"));
            }
            this.I = true;
            com.bumptech.glide.load.f fVar = this.f11404z;
            e g5 = this.f11393o.g();
            j(g5.size() + 1);
            this.f11398t.b(this, fVar, null);
            Iterator<d> it = g5.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f11410b.execute(new a(next.f11409a));
            }
            h();
        }
    }

    void p() {
        synchronized (this) {
            this.f11394p.c();
            if (this.L) {
                this.E.recycle();
                r();
                return;
            }
            if (this.f11393o.isEmpty()) {
                throw new IllegalStateException(ProtectedSandApp.s("ᳵ"));
            }
            if (this.G) {
                throw new IllegalStateException(ProtectedSandApp.s("᳴"));
            }
            this.J = this.f11397s.a(this.E, this.A, this.f11404z, this.f11395q);
            this.G = true;
            e g5 = this.f11393o.g();
            j(g5.size() + 1);
            this.f11398t.b(this, this.f11404z, this.J);
            Iterator<d> it = g5.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f11410b.execute(new b(next.f11409a));
            }
            h();
        }
    }

    boolean q() {
        return this.D;
    }

    synchronized void s(com.bumptech.glide.request.j jVar) {
        boolean z5;
        this.f11394p.c();
        this.f11393o.i(jVar);
        if (this.f11393o.isEmpty()) {
            g();
            if (!this.G && !this.I) {
                z5 = false;
                if (z5 && this.f11403y.get() == 0) {
                    r();
                }
            }
            z5 = true;
            if (z5) {
                r();
            }
        }
    }

    public synchronized void t(h<R> hVar) {
        this.K = hVar;
        (hVar.M() ? this.f11399u : i()).execute(hVar);
    }

    @m1
    l(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5, p.a<l<?>> aVar6, c cVar) {
        this.f11393o = new e();
        this.f11394p = com.bumptech.glide.util.pool.c.a();
        this.f11403y = new AtomicInteger();
        this.f11399u = aVar;
        this.f11400v = aVar2;
        this.f11401w = aVar3;
        this.f11402x = aVar4;
        this.f11398t = mVar;
        this.f11395q = aVar5;
        this.f11396r = aVar6;
        this.f11397s = cVar;
    }
}
