package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.model.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes3.dex */
class v implements f, d.a<Object> {

    /* renamed from: o, reason: collision with root package name */
    private final f.a f11468o;

    /* renamed from: p, reason: collision with root package name */
    private final g<?> f11469p;

    /* renamed from: q, reason: collision with root package name */
    private int f11470q;

    /* renamed from: r, reason: collision with root package name */
    private int f11471r = -1;

    /* renamed from: s, reason: collision with root package name */
    private com.bumptech.glide.load.f f11472s;

    /* renamed from: t, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.n<File, ?>> f11473t;

    /* renamed from: u, reason: collision with root package name */
    private int f11474u;

    /* renamed from: v, reason: collision with root package name */
    private volatile n.a<?> f11475v;

    /* renamed from: w, reason: collision with root package name */
    private File f11476w;

    /* renamed from: x, reason: collision with root package name */
    private w f11477x;

    v(g<?> gVar, f.a aVar) {
        this.f11469p = gVar;
        this.f11468o = aVar;
    }

    private boolean b() {
        return this.f11474u < this.f11473t.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        List<com.bumptech.glide.load.f> c6 = this.f11469p.c();
        boolean z5 = false;
        if (c6.isEmpty()) {
            return false;
        }
        List<Class<?>> m5 = this.f11469p.m();
        if (m5.isEmpty()) {
            if (File.class.equals(this.f11469p.q())) {
                return false;
            }
            throw new IllegalStateException(ProtectedSandApp.s("ᴍ") + this.f11469p.i() + ProtectedSandApp.s("ᴎ") + this.f11469p.q());
        }
        while (true) {
            if (this.f11473t != null && b()) {
                this.f11475v = null;
                while (!z5 && b()) {
                    List<com.bumptech.glide.load.model.n<File, ?>> list = this.f11473t;
                    int i5 = this.f11474u;
                    this.f11474u = i5 + 1;
                    this.f11475v = list.get(i5).b(this.f11476w, this.f11469p.s(), this.f11469p.f(), this.f11469p.k());
                    if (this.f11475v != null && this.f11469p.t(this.f11475v.f11571c.a())) {
                        this.f11475v.f11571c.e(this.f11469p.l(), this);
                        z5 = true;
                    }
                }
                return z5;
            }
            int i6 = this.f11471r + 1;
            this.f11471r = i6;
            if (i6 >= m5.size()) {
                int i7 = this.f11470q + 1;
                this.f11470q = i7;
                if (i7 >= c6.size()) {
                    return false;
                }
                this.f11471r = 0;
            }
            com.bumptech.glide.load.f fVar = c6.get(this.f11470q);
            Class<?> cls = m5.get(this.f11471r);
            this.f11477x = new w(this.f11469p.b(), fVar, this.f11469p.o(), this.f11469p.s(), this.f11469p.f(), this.f11469p.r(cls), cls, this.f11469p.k());
            File b6 = this.f11469p.d().b(this.f11477x);
            this.f11476w = b6;
            if (b6 != null) {
                this.f11472s = fVar;
                this.f11473t = this.f11469p.j(b6);
                this.f11474u = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@o0 Exception exc) {
        this.f11468o.g(this.f11477x, exc, this.f11475v.f11571c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f11475v;
        if (aVar != null) {
            aVar.f11571c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f11468o.j(this.f11472s, obj, this.f11475v.f11571c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.f11477x);
    }
}
