package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import androidx.core.util.p;
import com.bumptech.glide.util.pool.a;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: LockedResource.java */
/* loaded from: classes3.dex */
final class t<Z> implements u<Z>, a.f {

    /* renamed from: s, reason: collision with root package name */
    private static final p.a<t<?>> f11463s = com.bumptech.glide.util.pool.a.e(20, new a());

    /* renamed from: o, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f11464o = com.bumptech.glide.util.pool.c.a();

    /* renamed from: p, reason: collision with root package name */
    private u<Z> f11465p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11466q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11467r;

    /* compiled from: LockedResource.java */
    class a implements a.d<t<?>> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public t<?> a() {
            return new t<>();
        }
    }

    t() {
    }

    private void b(u<Z> uVar) {
        this.f11467r = false;
        this.f11466q = true;
        this.f11465p = uVar;
    }

    @o0
    static <Z> t<Z> d(u<Z> uVar) {
        t<Z> tVar = (t) com.bumptech.glide.util.l.d(f11463s.b());
        tVar.b(uVar);
        return tVar;
    }

    private void e() {
        this.f11465p = null;
        f11463s.a(this);
    }

    @Override // com.bumptech.glide.load.engine.u
    public int a() {
        return this.f11465p.a();
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<Z> c() {
        return this.f11465p.c();
    }

    synchronized void f() {
        this.f11464o.c();
        if (!this.f11466q) {
            throw new IllegalStateException(ProtectedSandApp.s("ᴌ"));
        }
        this.f11466q = false;
        if (this.f11467r) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Z get() {
        return this.f11465p.get();
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @o0
    public com.bumptech.glide.util.pool.c l() {
        return this.f11464o;
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void recycle() {
        this.f11464o.c();
        this.f11467r = true;
        if (!this.f11466q) {
            this.f11465p.recycle();
            e();
        }
    }
}
