package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: EngineResource.java */
/* loaded from: classes3.dex */
class p<Z> implements u<Z> {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f44159b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f44160c;

    /* renamed from: d, reason: collision with root package name */
    private final u<Z> f44161d;

    /* renamed from: e, reason: collision with root package name */
    private final a f44162e;

    /* renamed from: f, reason: collision with root package name */
    private final com.bumptech.glide.load.f f44163f;

    /* renamed from: g, reason: collision with root package name */
    private int f44164g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44165h;

    /* compiled from: EngineResource.java */
    interface a {
        void d(com.bumptech.glide.load.f fVar, p<?> pVar);
    }

    p(u<Z> uVar, boolean z4, boolean z5, com.bumptech.glide.load.f fVar, a aVar) {
        String s4 = ProtectedSandApp.s("न");
        this.f44161d = (u) com.bumptech.glide.util.m.f(uVar, s4);
        this.f44159b = z4;
        this.f44160c = z5;
        this.f44163f = fVar;
        this.f44162e = (a) com.bumptech.glide.util.m.f(aVar, s4);
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Class<Z> a() {
        return this.f44161d.a();
    }

    synchronized void b() {
        if (this.f44165h) {
            throw new IllegalStateException(ProtectedSandApp.s("ऩ"));
        }
        this.f44164g++;
    }

    u<Z> c() {
        return this.f44161d;
    }

    boolean d() {
        return this.f44159b;
    }

    void e() {
        boolean z4;
        synchronized (this) {
            int i4 = this.f44164g;
            if (i4 <= 0) {
                throw new IllegalStateException(ProtectedSandApp.s("प"));
            }
            z4 = true;
            int i5 = i4 - 1;
            this.f44164g = i5;
            if (i5 != 0) {
                z4 = false;
            }
        }
        if (z4) {
            this.f44162e.d(this.f44163f, this);
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    @o0
    public Z get() {
        return this.f44161d.get();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
        return this.f44161d.getSize();
    }

    @Override // com.bumptech.glide.load.engine.u
    public synchronized void recycle() {
        if (this.f44164g > 0) {
            throw new IllegalStateException(ProtectedSandApp.s("ब"));
        }
        if (this.f44165h) {
            throw new IllegalStateException(ProtectedSandApp.s("फ"));
        }
        this.f44165h = true;
        if (this.f44160c) {
            this.f44161d.recycle();
        }
    }

    public synchronized String toString() {
        String str;
        String s4 = ProtectedSandApp.s("भ");
        synchronized (this) {
            str = s4 + this.f44159b + ProtectedSandApp.s("म") + this.f44162e + ProtectedSandApp.s("य") + this.f44163f + ProtectedSandApp.s("र") + this.f44164g + ProtectedSandApp.s("ऱ") + this.f44165h + ProtectedSandApp.s("ल") + this.f44161d + '}';
        }
        return str;
    }
}
