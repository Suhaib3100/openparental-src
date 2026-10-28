package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* compiled from: SourceGenerator.java */
/* loaded from: classes3.dex */
class y implements f, f.a {

    /* renamed from: v, reason: collision with root package name */
    private static final String f11490v = ProtectedSandApp.s("ᴗ");

    /* renamed from: o, reason: collision with root package name */
    private final g<?> f11491o;

    /* renamed from: p, reason: collision with root package name */
    private final f.a f11492p;

    /* renamed from: q, reason: collision with root package name */
    private int f11493q;

    /* renamed from: r, reason: collision with root package name */
    private c f11494r;

    /* renamed from: s, reason: collision with root package name */
    private Object f11495s;

    /* renamed from: t, reason: collision with root package name */
    private volatile n.a<?> f11496t;

    /* renamed from: u, reason: collision with root package name */
    private d f11497u;

    /* compiled from: SourceGenerator.java */
    class a implements d.a<Object> {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ n.a f11498o;

        a(n.a aVar) {
            this.f11498o = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void c(@o0 Exception exc) {
            if (y.this.d(this.f11498o)) {
                y.this.f(this.f11498o, exc);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void f(@q0 Object obj) {
            if (y.this.d(this.f11498o)) {
                y.this.e(this.f11498o, obj);
            }
        }
    }

    y(g<?> gVar, f.a aVar) {
        this.f11491o = gVar;
        this.f11492p = aVar;
    }

    private void b(Object obj) {
        long b6 = com.bumptech.glide.util.h.b();
        try {
            com.bumptech.glide.load.d<X> p5 = this.f11491o.p(obj);
            e eVar = new e(p5, obj, this.f11491o.k());
            this.f11497u = new d(this.f11496t.f11569a, this.f11491o.o());
            this.f11491o.d().a(this.f11497u, eVar);
            if (Log.isLoggable(ProtectedSandApp.s("ᴖ"), 2)) {
                Objects.toString(this.f11497u);
                Objects.toString(obj);
                Objects.toString(p5);
                com.bumptech.glide.util.h.a(b6);
            }
            this.f11496t.f11571c.b();
            this.f11494r = new c(Collections.singletonList(this.f11496t.f11569a), this.f11491o, this);
        } catch (Throwable th) {
            this.f11496t.f11571c.b();
            throw th;
        }
    }

    private boolean c() {
        return this.f11493q < this.f11491o.g().size();
    }

    private void i(n.a<?> aVar) {
        this.f11496t.f11571c.e(this.f11491o.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        Object obj = this.f11495s;
        if (obj != null) {
            this.f11495s = null;
            b(obj);
        }
        c cVar = this.f11494r;
        if (cVar != null && cVar.a()) {
            return true;
        }
        this.f11494r = null;
        this.f11496t = null;
        boolean z5 = false;
        while (!z5 && c()) {
            List<n.a<?>> g5 = this.f11491o.g();
            int i5 = this.f11493q;
            this.f11493q = i5 + 1;
            this.f11496t = g5.get(i5);
            if (this.f11496t != null && (this.f11491o.e().c(this.f11496t.f11571c.d()) || this.f11491o.t(this.f11496t.f11571c.a()))) {
                i(this.f11496t);
                z5 = true;
            }
        }
        return z5;
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f11496t;
        if (aVar != null) {
            aVar.f11571c.cancel();
        }
    }

    boolean d(n.a<?> aVar) {
        n.a<?> aVar2 = this.f11496t;
        return aVar2 != null && aVar2 == aVar;
    }

    void e(n.a<?> aVar, Object obj) {
        j e6 = this.f11491o.e();
        if (obj != null && e6.c(aVar.f11571c.d())) {
            this.f11495s = obj;
            this.f11492p.h();
        } else {
            f.a aVar2 = this.f11492p;
            com.bumptech.glide.load.f fVar = aVar.f11569a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f11571c;
            aVar2.j(fVar, obj, dVar, dVar.d(), this.f11497u);
        }
    }

    void f(n.a<?> aVar, @o0 Exception exc) {
        f.a aVar2 = this.f11492p;
        d dVar = this.f11497u;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f11571c;
        aVar2.g(dVar, exc, dVar2, dVar2.d());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void g(com.bumptech.glide.load.f fVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.f11492p.g(fVar, exc, dVar, this.f11496t.f11571c.d());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void h() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void j(com.bumptech.glide.load.f fVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.f fVar2) {
        this.f11492p.j(fVar, obj, dVar, this.f11496t.f11571c.d(), fVar);
    }
}
