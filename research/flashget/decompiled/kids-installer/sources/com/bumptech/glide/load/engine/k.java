package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.p;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.j;
import com.bumptech.glide.load.engine.h;
import com.bumptech.glide.load.engine.p;
import com.bumptech.glide.util.pool.a;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;

/* compiled from: Engine.java */
/* loaded from: classes3.dex */
public class k implements m, j.a, p.a {

    /* renamed from: j, reason: collision with root package name */
    private static final int f11366j = 150;

    /* renamed from: a, reason: collision with root package name */
    private final r f11368a;

    /* renamed from: b, reason: collision with root package name */
    private final o f11369b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.cache.j f11370c;

    /* renamed from: d, reason: collision with root package name */
    private final b f11371d;

    /* renamed from: e, reason: collision with root package name */
    private final x f11372e;

    /* renamed from: f, reason: collision with root package name */
    private final c f11373f;

    /* renamed from: g, reason: collision with root package name */
    private final a f11374g;

    /* renamed from: h, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.a f11375h;

    /* renamed from: i, reason: collision with root package name */
    private static final String f11365i = ProtectedSandApp.s("᳧");

    /* renamed from: k, reason: collision with root package name */
    private static final boolean f11367k = Log.isLoggable(ProtectedSandApp.s("᳨"), 2);

    /* compiled from: Engine.java */
    @m1
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        final h.e f11376a;

        /* renamed from: b, reason: collision with root package name */
        final p.a<h<?>> f11377b = com.bumptech.glide.util.pool.a.e(k.f11366j, new C0144a());

        /* renamed from: c, reason: collision with root package name */
        private int f11378c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.engine.k$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0144a implements a.d<h<?>> {
            C0144a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.f11376a, aVar.f11377b);
            }
        }

        a(h.e eVar) {
            this.f11376a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, com.bumptech.glide.load.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.i iVar, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z5, boolean z6, boolean z7, com.bumptech.glide.load.i iVar2, h.b<R> bVar) {
            h hVar = (h) com.bumptech.glide.util.l.d(this.f11377b.b());
            int i7 = this.f11378c;
            this.f11378c = i7 + 1;
            return hVar.x(dVar, obj, nVar, fVar, i5, i6, cls, cls2, iVar, jVar, map, z5, z6, z7, iVar2, bVar, i7);
        }
    }

    /* compiled from: Engine.java */
    @m1
    /* loaded from: classes.dex */
    static class b {

        /* renamed from: a, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f11380a;

        /* renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f11381b;

        /* renamed from: c, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f11382c;

        /* renamed from: d, reason: collision with root package name */
        final com.bumptech.glide.load.engine.executor.a f11383d;

        /* renamed from: e, reason: collision with root package name */
        final m f11384e;

        /* renamed from: f, reason: collision with root package name */
        final p.a f11385f;

        /* renamed from: g, reason: collision with root package name */
        final p.a<l<?>> f11386g = com.bumptech.glide.util.pool.a.e(k.f11366j, new a());

        /* compiled from: Engine.java */
        /* loaded from: classes3.dex */
        class a implements a.d<l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.util.pool.a.d
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.f11380a, bVar.f11381b, bVar.f11382c, bVar.f11383d, bVar.f11384e, bVar.f11385f, bVar.f11386g);
            }
        }

        b(com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, m mVar, p.a aVar5) {
            this.f11380a = aVar;
            this.f11381b = aVar2;
            this.f11382c = aVar3;
            this.f11383d = aVar4;
            this.f11384e = mVar;
            this.f11385f = aVar5;
        }

        <R> l<R> a(com.bumptech.glide.load.f fVar, boolean z5, boolean z6, boolean z7, boolean z8) {
            return ((l) com.bumptech.glide.util.l.d(this.f11386g.b())).k(fVar, z5, z6, z7, z8);
        }

        @m1
        void b() {
            com.bumptech.glide.util.f.c(this.f11380a);
            com.bumptech.glide.util.f.c(this.f11381b);
            com.bumptech.glide.util.f.c(this.f11382c);
            com.bumptech.glide.util.f.c(this.f11383d);
        }
    }

    /* compiled from: Engine.java */
    private static class c implements h.e {

        /* renamed from: a, reason: collision with root package name */
        private final a.InterfaceC0138a f11388a;

        /* renamed from: b, reason: collision with root package name */
        private volatile com.bumptech.glide.load.engine.cache.a f11389b;

        c(a.InterfaceC0138a interfaceC0138a) {
            this.f11388a = interfaceC0138a;
        }

        @Override // com.bumptech.glide.load.engine.h.e
        public com.bumptech.glide.load.engine.cache.a a() {
            if (this.f11389b == null) {
                synchronized (this) {
                    if (this.f11389b == null) {
                        this.f11389b = this.f11388a.build();
                    }
                    if (this.f11389b == null) {
                        this.f11389b = new com.bumptech.glide.load.engine.cache.b();
                    }
                }
            }
            return this.f11389b;
        }

        @m1
        synchronized void b() {
            if (this.f11389b == null) {
                return;
            }
            this.f11389b.clear();
        }
    }

    /* compiled from: Engine.java */
    /* loaded from: classes.dex */
    public class d {

        /* renamed from: a, reason: collision with root package name */
        private final l<?> f11390a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.request.j f11391b;

        d(com.bumptech.glide.request.j jVar, l<?> lVar) {
            this.f11391b = jVar;
            this.f11390a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.f11390a.s(this.f11391b);
            }
        }
    }

    public k(com.bumptech.glide.load.engine.cache.j jVar, a.InterfaceC0138a interfaceC0138a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, boolean z5) {
        this(jVar, interfaceC0138a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z5);
    }

    private p<?> f(com.bumptech.glide.load.f fVar) {
        u<?> g5 = this.f11370c.g(fVar);
        if (g5 == null) {
            return null;
        }
        return g5 instanceof p ? (p) g5 : new p<>(g5, true, true, fVar, this);
    }

    @q0
    private p<?> h(com.bumptech.glide.load.f fVar) {
        p<?> e6 = this.f11375h.e(fVar);
        if (e6 != null) {
            e6.b();
        }
        return e6;
    }

    private p<?> i(com.bumptech.glide.load.f fVar) {
        p<?> f6 = f(fVar);
        if (f6 != null) {
            f6.b();
            this.f11375h.a(fVar, f6);
        }
        return f6;
    }

    @q0
    private p<?> j(n nVar, boolean z5, long j5) {
        if (!z5) {
            return null;
        }
        p<?> h5 = h(nVar);
        if (h5 != null) {
            if (f11367k) {
                k(ProtectedSandApp.s("ᳩ"), j5, nVar);
            }
            return h5;
        }
        p<?> i5 = i(nVar);
        if (i5 == null) {
            return null;
        }
        if (f11367k) {
            k(ProtectedSandApp.s("ᳪ"), j5, nVar);
        }
        return i5;
    }

    private static void k(String str, long j5, com.bumptech.glide.load.f fVar) {
        com.bumptech.glide.util.h.a(j5);
        Objects.toString(fVar);
    }

    private <R> d n(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.i iVar, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z5, boolean z6, com.bumptech.glide.load.i iVar2, boolean z7, boolean z8, boolean z9, boolean z10, com.bumptech.glide.request.j jVar2, Executor executor, n nVar, long j5) {
        l<?> a6 = this.f11368a.a(nVar, z10);
        if (a6 != null) {
            a6.b(jVar2, executor);
            if (f11367k) {
                k(ProtectedSandApp.s("ᳫ"), j5, nVar);
            }
            return new d(jVar2, a6);
        }
        l<R> a7 = this.f11371d.a(nVar, z7, z8, z9, z10);
        h<R> a8 = this.f11374g.a(dVar, obj, nVar, fVar, i5, i6, cls, cls2, iVar, jVar, map, z5, z6, z10, iVar2, a7);
        this.f11368a.d(nVar, a7);
        a7.b(jVar2, executor);
        a7.t(a8);
        if (f11367k) {
            k(ProtectedSandApp.s("ᳬ"), j5, nVar);
        }
        return new d(jVar2, a7);
    }

    @Override // com.bumptech.glide.load.engine.cache.j.a
    public void a(@o0 u<?> uVar) {
        this.f11372e.a(uVar, true);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void b(l<?> lVar, com.bumptech.glide.load.f fVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.e()) {
                this.f11375h.a(fVar, pVar);
            }
        }
        this.f11368a.e(fVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.m
    public synchronized void c(l<?> lVar, com.bumptech.glide.load.f fVar) {
        this.f11368a.e(fVar, lVar);
    }

    @Override // com.bumptech.glide.load.engine.p.a
    public void d(com.bumptech.glide.load.f fVar, p<?> pVar) {
        this.f11375h.d(fVar);
        if (pVar.e()) {
            this.f11370c.f(fVar, pVar);
        } else {
            this.f11372e.a(pVar, false);
        }
    }

    public void e() {
        this.f11373f.a().clear();
    }

    public <R> d g(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.f fVar, int i5, int i6, Class<?> cls, Class<R> cls2, com.bumptech.glide.i iVar, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z5, boolean z6, com.bumptech.glide.load.i iVar2, boolean z7, boolean z8, boolean z9, boolean z10, com.bumptech.glide.request.j jVar2, Executor executor) {
        long b6 = f11367k ? com.bumptech.glide.util.h.b() : 0L;
        n a6 = this.f11369b.a(obj, fVar, i5, i6, map, cls, cls2, iVar2);
        synchronized (this) {
            p<?> j5 = j(a6, z7, b6);
            if (j5 == null) {
                return n(dVar, obj, fVar, i5, i6, cls, cls2, iVar, jVar, map, z5, z6, iVar2, z7, z8, z9, z10, jVar2, executor, a6, b6);
            }
            jVar2.c(j5, com.bumptech.glide.load.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public void l(u<?> uVar) {
        if (!(uVar instanceof p)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("᳭"));
        }
        ((p) uVar).f();
    }

    @m1
    public void m() {
        this.f11371d.b();
        this.f11373f.b();
        this.f11375h.h();
    }

    @m1
    k(com.bumptech.glide.load.engine.cache.j jVar, a.InterfaceC0138a interfaceC0138a, com.bumptech.glide.load.engine.executor.a aVar, com.bumptech.glide.load.engine.executor.a aVar2, com.bumptech.glide.load.engine.executor.a aVar3, com.bumptech.glide.load.engine.executor.a aVar4, r rVar, o oVar, com.bumptech.glide.load.engine.a aVar5, b bVar, a aVar6, x xVar, boolean z5) {
        this.f11370c = jVar;
        c cVar = new c(interfaceC0138a);
        this.f11373f = cVar;
        com.bumptech.glide.load.engine.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.engine.a(z5) : aVar5;
        this.f11375h = aVar7;
        aVar7.g(this);
        this.f11369b = oVar == null ? new o() : oVar;
        this.f11368a = rVar == null ? new r() : rVar;
        this.f11371d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f11374g = aVar6 == null ? new a(cVar) : aVar6;
        this.f11372e = xVar == null ? new x() : xVar;
        jVar.h(this);
    }
}
