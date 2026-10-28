package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import androidx.core.util.v;
import com.bumptech.glide.util.pool.a;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LockedResource.java */
/* loaded from: classes3.dex */
final class t<Z> implements u<Z>, a.f {

    /* renamed from: f, reason: collision with root package name */
    private static final v.a<t<?>> f44203f = com.bumptech.glide.util.pool.a.e(20, new a());

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.util.pool.c f44204b = com.bumptech.glide.util.pool.c.a();

    /* renamed from: c, reason: collision with root package name */
    private u<Z> f44205c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44206d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44207e;

    /* compiled from: LockedResource.java */
    class a implements a.d<t<?>> {
        a() {
        }

        @Override // com.bumptech.glide.util.pool.a.d
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public t<?> create() {
            return new t<>();
        }
    }

    t() {
    }

    private void b(u<Z> uVar) {
        this.f44207e = false;
        this.f44206d = true;
        this.f44205c = uVar;
    }

    @o0
    static <Z> t<Z> c(u<Z> uVar) {
        t<Z> tVar = (t) com.bumptech.glide.util.m.f(f44203f.acquire(), ProtectedSandApp.s("ु"));
        tVar.b(uVar);
        return tVar;
    }

    private void e() {
        this.f44205c = null;
        f44203f.release(this);
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<Z> a() {
        return this.f44205c.a();
    }

    @Override // com.bumptech.glide.util.pool.a.f
    @o0
    public com.bumptech.glide.util.pool.c d() {
        return this.f44204b;
    }

    synchronized void f() {
        this.f44204b.c();
        if (!this.f44206d) {
            throw new IllegalStateException(ProtectedSandApp.s("ू"));
        }
        this.f44206d = false;
        if (this.f44207e) {
            recycle();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Z get() {
        return this.f44205c.get();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
        return this.f44205c.getSize();
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void recycle() {
        this.f44204b.c();
        this.f44207e = true;
        if (!this.f44206d) {
            this.f44205c.recycle();
            e();
        }
    }
}
