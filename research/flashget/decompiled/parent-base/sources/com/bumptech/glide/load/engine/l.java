package com.bumptech.glide.load.engine;

import androidx.annotation.b0;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.core.util.v;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.util.pool.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob.java */
/* loaded from: classes3.dex */
class l<R> implements h.b<R>, a.f {
    private static final c A = new c();

    /* renamed from: b, reason: collision with root package name */
    final e f44118b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f44119c;

    /* renamed from: d, reason: collision with root package name */
    private final p.a f44120d;

    /* renamed from: e, reason: collision with root package name */
    private final v.a<l<?>> f44121e;

    /* renamed from: f, reason: collision with root package name */
    private final c f44122f;

    /* renamed from: g, reason: collision with root package name */
    private final m f44123g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f44124h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f44125i;

    /* renamed from: j, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f44126j;

    /* renamed from: k, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.executor.a f44127k;

    /* renamed from: l, reason: collision with root package name */
    private final AtomicInteger f44128l;

    /* renamed from: m, reason: collision with root package name */
    private com.bumptech.glide.load.f f44129m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f44130n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f44131o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f44132p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f44133q;

    /* renamed from: r, reason: collision with root package name */
    private u<?> f44134r;

    /* renamed from: s, reason: collision with root package name */
    com.bumptech.glide.load.a f44135s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f44136t;

    /* renamed from: u, reason: collision with root package name */
    GlideException f44137u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f44138v;

    /* renamed from: w, reason: collision with root package name */
    p<?> f44139w;

    /* renamed from: x, reason: collision with root package name */
    private h<R> f44140x;

    /* renamed from: y, reason: collision with root package name */
    private volatile boolean f44141y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f44142z;

    /* compiled from: EngineJob.java */
    private class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.j f44143b;

        a(com.bumptech.glide.request.j jVar) {
            this.f44143b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f44143b.f()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f44118b.c(this.f44143b)) {
                            l.this.f(this.f44143b);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    private class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.j f44145b;

        b(com.bumptech.glide.request.j jVar) {
            this.f44145b = jVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f44145b.f()) {
                synchronized (l.this) {
                    try {
                        if (l.this.f44118b.c(this.f44145b)) {
                            l.this.f44139w.b();
                            l.this.g(this.f44145b);
                            l.this.s(this.f44145b);
                        }
                        l.this.i();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    @m1
    static class c {
        c() {
        }

        public <R> p<R> a(u<R> uVar, boolean z4, com.bumptech.glide.load.f fVar, p.a aVar) {
            return new p<>(uVar, z4, true, fVar, aVar);
        }
    }

    /* compiled from: EngineJob.java */
    static final class d {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.request.j f44147a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f44148b;

        d(com.bumptech.glide.request.j jVar, Executor executor) {
            this.f44147a = jVar;
            this.f44148b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f44147a.equals(((d) obj).f44147a);
            }
            return false;
        }

        public int hashCode() {
            return this.f44147a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    static final class e implements Iterable<d> {

        /* renamed from: b, reason: collision with root package name */
        private final List<d> f44149b;

        e() {
            this(new ArrayList(2));
        }

        private static d h(com.bumptech.glide.request.j jVar) {
            return new d(jVar, com.bumptech.glide.util.f.a());
        }

        void b(com.bumptech.glide.request.j jVar, Executor executor) {
            this.f44149b.add(new d(jVar, executor));
        }

        boolean c(com.bumptech.glide.request.j jVar) {
            return this.f44149b.contains(h(jVar));
        }

        void clear() {
            this.f44149b.clear();
        }

        e f() {
            return new e(new ArrayList(this.f44149b));
        }

        void i(com.bumptech.glide.request.j jVar) {
            this.f44149b.remove(h(jVar));
        }

        boolean isEmpty() {
            return this.f44149b.isEmpty();
        }

        @Override // java.lang.Iterable
        @o0
        public Iterator<d> iterator() {
            return this.f44149b.iterator();
        }

        int size() {
            return this.f44149b.size();
        }

        e(List<d> list) {
            this.f44149b = list;
        }
    }

    l(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5, v.a<l<?>> aVar6) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, aVar6, A);
    }

    private com.bumptech.glide.load.engine.executor.a j() {
        return this.f44131o ? this.f44126j : this.f44132p ? this.f44127k : this.f44125i;
    }

    private boolean n() {
        return this.f44138v || this.f44136t || this.f44141y;
    }

    private synchronized void r() {
        if (this.f44129m == null) {
            throw new IllegalArgumentException();
        }
        this.f44118b.clear();
        this.f44129m = null;
        this.f44139w = null;
        this.f44134r = null;
        this.f44138v = false;
        this.f44141y = false;
        this.f44136t = false;
        this.f44142z = false;
        this.f44140x.v(false);
        this.f44140x = null;
        this.f44137u = null;
        this.f44135s = null;
        this.f44121e.release(this);
    }

    synchronized void a(com.bumptech.glide.request.j jVar, Executor executor) {
        try {
            this.f44119c.c();
            this.f44118b.b(jVar, executor);
            if (this.f44136t) {
                k(1);
                executor.execute(new b(jVar));
            } else if (this.f44138v) {
                k(1);
                executor.execute(new a(jVar));
            } else {
                com.bumptech.glide.util.m.b(!this.f44141y, ProtectedSandApp.s("औ"));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.engine.h.b
    public void b(u<R> uVar, com.bumptech.glide.load.a aVar, boolean z4) {
        synchronized (this) {
            this.f44134r = uVar;
            this.f44135s = aVar;
            this.f44142z = z4;
        }
        p();
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void c(GlideException glideException) {
        synchronized (this) {
            this.f44137u = glideException;
        }
        o();
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @o0
    public com.bumptech.glide.util.pool.c d() {
        return this.f44119c;
    }

    @Override // com.bumptech.glide.load.engine.h.b
    public void e(h<?> hVar) {
        j().execute(hVar);
    }

    @b0("this")
    void f(com.bumptech.glide.request.j jVar) {
        try {
            jVar.c(this.f44137u);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    @b0("this")
    void g(com.bumptech.glide.request.j jVar) {
        try {
            jVar.b(this.f44139w, this.f44135s, this.f44142z);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.engine.b(th);
        }
    }

    void h() {
        if (n()) {
            return;
        }
        this.f44141y = true;
        this.f44140x.b();
        this.f44123g.c(this, this.f44129m);
    }

    void i() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f44119c.c();
                com.bumptech.glide.util.m.b(n(), ProtectedSandApp.s("क"));
                int decrementAndGet = this.f44128l.decrementAndGet();
                com.bumptech.glide.util.m.b(decrementAndGet >= 0, ProtectedSandApp.s("ख"));
                if (decrementAndGet == 0) {
                    pVar = this.f44139w;
                    r();
                } else {
                    pVar = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (pVar != null) {
            pVar.e();
        }
    }

    synchronized void k(int i4) {
        p<?> pVar;
        com.bumptech.glide.util.m.b(n(), ProtectedSandApp.s("क"));
        if (this.f44128l.getAndAdd(i4) == 0 && (pVar = this.f44139w) != null) {
            pVar.b();
        }
    }

    @m1
    synchronized l<R> l(com.bumptech.glide.load.f fVar, boolean z4, boolean z5, boolean z6, boolean z7) {
        this.f44129m = fVar;
        this.f44130n = z4;
        this.f44131o = z5;
        this.f44132p = z6;
        this.f44133q = z7;
        return this;
    }

    synchronized boolean m() {
        return this.f44141y;
    }

    void o() {
        synchronized (this) {
            try {
                this.f44119c.c();
                if (this.f44141y) {
                    r();
                    return;
                }
                if (this.f44118b.isEmpty()) {
                    throw new IllegalStateException(ProtectedSandApp.s("घ"));
                }
                if (this.f44138v) {
                    throw new IllegalStateException(ProtectedSandApp.s("ग"));
                }
                this.f44138v = true;
                com.bumptech.glide.load.f fVar = this.f44129m;
                e f4 = this.f44118b.f();
                k(f4.size() + 1);
                this.f44123g.b(this, fVar, null);
                Iterator<d> it = f4.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f44148b.execute(new a(next.f44147a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    void p() {
        synchronized (this) {
            try {
                this.f44119c.c();
                if (this.f44141y) {
                    this.f44134r.recycle();
                    r();
                    return;
                }
                if (this.f44118b.isEmpty()) {
                    throw new IllegalStateException(ProtectedSandApp.s("च"));
                }
                if (this.f44136t) {
                    throw new IllegalStateException(ProtectedSandApp.s("ङ"));
                }
                this.f44139w = this.f44122f.a(this.f44134r, this.f44130n, this.f44129m, this.f44120d);
                this.f44136t = true;
                e f4 = this.f44118b.f();
                k(f4.size() + 1);
                this.f44123g.b(this, this.f44129m, this.f44139w);
                Iterator<d> it = f4.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.f44148b.execute(new b(next.f44147a));
                }
                i();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    boolean q() {
        return this.f44133q;
    }

    synchronized void s(com.bumptech.glide.request.j jVar) {
        try {
            this.f44119c.c();
            this.f44118b.i(jVar);
            if (this.f44118b.isEmpty()) {
                h();
                if (!this.f44136t) {
                    if (this.f44138v) {
                    }
                }
                if (this.f44128l.get() == 0) {
                    r();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void t(h<R> hVar) {
        try {
            this.f44140x = hVar;
            (hVar.C() ? this.f44124h : j()).execute(hVar);
        } catch (Throwable th) {
            throw th;
        }
    }

    @m1
    l(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5, v.a<l<?>> aVar6, c cVar) {
        this.f44118b = new e();
        this.f44119c = com.bumptech.glide.util.pool.c.a();
        this.f44128l = new AtomicInteger();
        this.f44124h = aVar;
        this.f44125i = aVar2;
        this.f44126j = aVar3;
        this.f44127k = aVar4;
        this.f44123g = mVar;
        this.f44120d = aVar5;
        this.f44121e = aVar6;
        this.f44122f = cVar;
    }
}
