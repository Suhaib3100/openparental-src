package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: EngineResource.java */
/* loaded from: classes3.dex */
class p<Z> implements u<Z> {

    /* renamed from: o, reason: collision with root package name */
    private final boolean f11421o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f11422p;

    /* renamed from: q, reason: collision with root package name */
    private final u<Z> f11423q;

    /* renamed from: r, reason: collision with root package name */
    private final a f11424r;

    /* renamed from: s, reason: collision with root package name */
    private final com.bumptech.glide.load.f f11425s;

    /* renamed from: t, reason: collision with root package name */
    private int f11426t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f11427u;

    /* compiled from: EngineResource.java */
    /* loaded from: classes.dex */
    interface a {
        void d(com.bumptech.glide.load.f fVar, p<?> pVar);
    }

    p(u<Z> uVar, boolean z5, boolean z6, com.bumptech.glide.load.f fVar, a aVar) {
        this.f11423q = (u) com.bumptech.glide.util.l.d(uVar);
        this.f11421o = z5;
        this.f11422p = z6;
        this.f11425s = fVar;
        this.f11424r = (a) com.bumptech.glide.util.l.d(aVar);
    }

    @Override // com.bumptech.glide.load.engine.u
    public int a() {
        return this.f11423q.a();
    }

    synchronized void b() {
        if (this.f11427u) {
            throw new IllegalStateException(ProtectedSandApp.s("ᴂ"));
        }
        this.f11426t++;
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<Z> c() {
        return this.f11423q.c();
    }

    u<Z> d() {
        return this.f11423q;
    }

    boolean e() {
        return this.f11421o;
    }

    void f() {
        boolean z5;
        synchronized (this) {
            int i5 = this.f11426t;
            if (i5 <= 0) {
                throw new IllegalStateException(ProtectedSandApp.s("ᴃ"));
            }
            z5 = true;
            int i6 = i5 - 1;
            this.f11426t = i6;
            if (i6 != 0) {
                z5 = false;
            }
        }
        if (z5) {
            this.f11424r.d(this.f11425s, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Z get() {
        return this.f11423q.get();
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void recycle() {
        if (this.f11426t > 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ᴅ"));
        }
        if (this.f11427u) {
            throw new IllegalStateException(ProtectedSandApp.s("ᴄ"));
        }
        this.f11427u = true;
        if (this.f11422p) {
            this.f11423q.recycle();
        }
    }

    public synchronized String toString() {
        String str;
        String s5 = ProtectedSandApp.s("ᴆ");
        synchronized (this) {
            str = s5 + this.f11421o + ProtectedSandApp.s("ᴇ") + this.f11424r + ProtectedSandApp.s("ᴈ") + this.f11425s + ProtectedSandApp.s("ᴉ") + this.f11426t + ProtectedSandApp.s("ᴊ") + this.f11427u + ProtectedSandApp.s("ᴋ") + this.f11423q + '}';
        }
        return str;
    }
}
