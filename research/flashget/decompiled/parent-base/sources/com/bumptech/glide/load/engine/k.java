package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.v;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.util.pool.a;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Engine.java */
/* loaded from: classes3.dex */
public class k implements m, j.a, p.a {

    /* renamed from: j, reason: collision with root package name */
    private static final int f44091j = 150;

    /* renamed from: a, reason: collision with root package name */
    private final r f44093a;

    /* renamed from: b, reason: collision with root package name */
    private final o f44094b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f44095c;

    /* renamed from: d, reason: collision with root package name */
    private final b f44096d;

    /* renamed from: e, reason: collision with root package name */
    private final x f44097e;

    /* renamed from: f, reason: collision with root package name */
    private final c f44098f;

    /* renamed from: g, reason: collision with root package name */
    private final a f44099g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f44100h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f44090i = ProtectedSandApp.s("ऎ");

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f44092k = Log.isLoggable(ProtectedSandApp.s("ऎ"), 2);

    /* compiled from: Engine.java */
    @m1
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f44101a;

        /* renamed from: b, reason: collision with root package name */
        final v.a<h<?>> f44102b = com.bumptech.glide.util.pool.a.e(150, new C0743a());

        /* renamed from: c, reason: collision with root package name */
        private int f44103c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        class C0743a implements a.d<h<?>> {
            C0743a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public h<?> create() {
                a aVar = a.this;
                return new h<>(aVar.f44101a, aVar.f44102b);
            }
        }

        a(h.e eVar) {
            this.f44101a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.e eVar, Object obj, n nVar, com.bumptech.glide.load.f fVar, int i4, int i5, Class<?> cls, Class<R> cls2, com.bumptech.glide.j jVar, j jVar2, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z4, boolean z5, boolean z6, com.bumptech.glide.load.i iVar, h.b<R> bVar) {
            h hVar = (h) com.bumptech.glide.util.m.f(this.f44102b.acquire(), ProtectedSandApp.s("ऌ"));
            int i6 = this.f44103c;
            this.f44103c = i6 + 1;
            return hVar.m(eVar, obj, nVar, fVar, i4, i5, cls, cls2, jVar, jVar2, map, z4, z5, z6, iVar, bVar, i6);
        }
    }

    /* compiled from: Engine.java */
    @m1
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f44105a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f44106b;

        /* renamed from: c, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f44107c;

        /* renamed from: d, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f44108d;

        /* renamed from: e, reason: collision with root package name */
        final m f44109e;

        /* renamed from: f, reason: collision with root package name */
        final p.a f44110f;

        /* renamed from: g, reason: collision with root package name */
        final v.a<l<?>> f44111g = com.bumptech.glide.util.pool.a.e(150, new a());

        /* compiled from: Engine.java */
        class a implements a.d<l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public l<?> create() {
                b bVar = b.this;
                return new l<>(bVar.f44105a, bVar.f44106b, bVar.f44107c, bVar.f44108d, bVar.f44109e, bVar.f44110f, bVar.f44111g);
            }
        }

        b(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5) {
            this.f44105a = aVar;
            this.f44106b = aVar2;
            this.f44107c = aVar3;
            this.f44108d = aVar4;
            this.f44109e = mVar;
            this.f44110f = aVar5;
        }

        <R> l<R> a(com.bumptech.glide.load.f fVar, boolean z4, boolean z5, boolean z6, boolean z7) {
            return ((l) com.bumptech.glide.util.m.f(this.f44111g.acquire(), ProtectedSandApp.s("ऍ"))).l(fVar, z4, z5, z6, z7);
        }

        @m1
        void b() {
            com.bumptech.glide.util.f.c(this.f44105a);
            com.bumptech.glide.util.f.c(this.f44106b);
            com.bumptech.glide.util.f.c(this.f44107c);
            com.bumptech.glide.util.f.c(this.f44108d);
        }
    }

    /* compiled from: Engine.java */
    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0737a f44113a;

        /* renamed from: b, reason: collision with root package name */
        private volatile com.bumptech.glide.load.engine.cache.a f44114b;

        c(a.InterfaceC0737a interfaceC0737a) {
            this.f44113a = interfaceC0737a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public com.bumptech.glide.load.engine.cache.a a() {
            if (this.f44114b == null) {
                synchronized (this) {
                    try {
                        if (this.f44114b == null) {
                            this.f44114b = this.f44113a.a();
                        }
                        if (this.f44114b == null) {
                            this.f44114b = new com.bumptech.glide.load.engine.cache.b();
                        }
                    } finally {
                    }
                }
            }
            return this.f44114b;
        }

        @m1
        synchronized void b() {
            if (this.f44114b == null) {
                return;
            }
            this.f44114b.clear();
        }
    }

    /* compiled from: Engine.java */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final l<?> f44115a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.j f44116b;

        d(com.bumptech.glide.request.j jVar, l<?> lVar) {
            this.f44116b = jVar;
            this.f44115a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f44115a.s(this.f44116b);
            }
        }
    }

    public k(com.bumptech.glide.load.engine.cache.j jVar, a.InterfaceC0737a interfaceC0737a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, boolean z4) {
        this(jVar, interfaceC0737a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z4);
    }

    private p<?> f(com.bumptech.glide.load.f fVar) {
        u<?> g4 = this.f44095c.g(fVar);
        if (g4 == null) {
            return null;
        }
        return g4 instanceof p ? (p) g4 : new p<>(g4, true, true, fVar, this);
    }

    @q0
    private p<?> h(com.bumptech.glide.load.f fVar) {
        p<?> e4 = this.f44100h.e(fVar);
        if (e4 != null) {
            e4.b();
        }
        return e4;
    }

    private p<?> i(com.bumptech.glide.load.f fVar) {
        p<?> f4 = f(fVar);
        if (f4 != null) {
            f4.b();
            this.f44100h.a(fVar, f4);
        }
        return f4;
    }

    @q0
    private p<?> j(n nVar, boolean z4, long j4) {
        if (!z4) {
            return null;
        }
        p<?> h4 = h(nVar);
        if (h4 != null) {
            if (f44092k) {
                k(ProtectedSandApp.s("ए"), j4, nVar);
            }
            return h4;
        }
        p<?> i4 = i(nVar);
        if (i4 == null) {
            return null;
        }
        if (f44092k) {
            k(ProtectedSandApp.s("ऐ"), j4, nVar);
        }
        return i4;
    }

    private static void k(String str, long j4, com.bumptech.glide.load.f fVar) {
        com.bumptech.glide.util.i.a(j4);
        Objects.toString(fVar);
    }

    private <R> d n(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.f fVar, int i4, int i5, Class<?> cls, Class<R> cls2, com.bumptech.glide.j jVar, j jVar2, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z4, boolean z5, com.bumptech.glide.load.i iVar, boolean z6, boolean z7, boolean z10, boolean z11, com.bumptech.glide.request.j jVar3, Executor executor, n nVar, long j4) {
        l<?> a5 = this.f44093a.a(nVar, z11);
        if (a5 != null) {
            a5.a(jVar3, executor);
            if (f44092k) {
                k(ProtectedSandApp.s("ऑ"), j4, nVar);
            }
            return new d(jVar3, a5);
        }
        l<R> a6 = this.f44096d.a(nVar, z6, z7, z10, z11);
        h<R> a7 = this.f44099g.a(eVar, obj, nVar, fVar, i4, i5, cls, cls2, jVar, jVar2, map, z4, z5, z11, iVar, a6);
        this.f44093a.d(nVar, a6);
        a6.a(jVar3, executor);
        a6.t(a7);
        if (f44092k) {
            k(ProtectedSandApp.s("ऒ"), j4, nVar);
        }
        return new d(jVar3, a6);
    }

    @Override // com.bumptech.glide.load.engine.cache.j.a
    public void a(@o0 u<?> uVar) {
        this.f44097e.a(uVar, true);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void b(l<?> lVar, com.bumptech.glide.load.f fVar, p<?> pVar) {
        if (pVar != null) {
            try {
                if (pVar.d()) {
                    this.f44100h.a(fVar, pVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f44093a.e(fVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void c(l<?> lVar, com.bumptech.glide.load.f fVar) {
        this.f44093a.e(fVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.p.a
    public void d(com.bumptech.glide.load.f fVar, p<?> pVar) {
        this.f44100h.d(fVar);
        if (pVar.d()) {
            this.f44095c.f(fVar, pVar);
        } else {
            this.f44097e.a(pVar, false);
        }
    }

    public void e() {
        this.f44098f.a().clear();
    }

    public <R> d g(com.bumptech.glide.e eVar, Object obj, com.bumptech.glide.load.f fVar, int i4, int i5, Class<?> cls, Class<R> cls2, com.bumptech.glide.j jVar, j jVar2, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z4, boolean z5, com.bumptech.glide.load.i iVar, boolean z6, boolean z7, boolean z10, boolean z11, com.bumptech.glide.request.j jVar3, Executor executor) {
        long b5 = f44092k ? com.bumptech.glide.util.i.b() : 0L;
        n a5 = this.f44094b.a(obj, fVar, i4, i5, map, cls, cls2, iVar);
        synchronized (this) {
            try {
                p<?> j4 = j(a5, z6, b5);
                if (j4 == null) {
                    return n(eVar, obj, fVar, i4, i5, cls, cls2, jVar, jVar2, map, z4, z5, iVar, z6, z7, z10, z11, jVar3, executor, a5, b5);
                }
                jVar3.b(j4, com.bumptech.glide.load.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void l(u<?> uVar) {
        if (!(uVar instanceof p)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ओ"));
        }
        ((p) uVar).e();
    }

    @m1
    public void m() {
        this.f44096d.b();
        this.f44098f.b();
        this.f44100h.h();
    }

    @m1
    k(com.bumptech.glide.load.engine.cache.j jVar, a.InterfaceC0737a interfaceC0737a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, r rVar, o oVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, x xVar, boolean z4) {
        this.f44095c = jVar;
        c cVar = new c(interfaceC0737a);
        this.f44098f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z4) : aVar5;
        this.f44100h = aVar7;
        aVar7.g(this);
        this.f44094b = oVar == null ? new o() : oVar;
        this.f44093a = rVar == null ? new r() : rVar;
        this.f44096d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f44099g = aVar6 == null ? new a(cVar) : aVar6;
        this.f44097e = xVar == null ? new x() : xVar;
        jVar.h(this);
    }
}
