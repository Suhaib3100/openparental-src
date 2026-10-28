package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.List;

/* compiled from: ResourceCacheGenerator.java */
/* loaded from: classes3.dex */
class v implements f, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    private final f.a f44208b;

    /* renamed from: c, reason: collision with root package name */
    private final g<?> f44209c;

    /* renamed from: d, reason: collision with root package name */
    private int f44210d;

    /* renamed from: e, reason: collision with root package name */
    private int f44211e = -1;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.f f44212f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.o<File, ?>> f44213g;

    /* renamed from: h, reason: collision with root package name */
    private int f44214h;

    /* renamed from: i, reason: collision with root package name */
    private volatile o.a<?> f44215i;

    /* renamed from: j, reason: collision with root package name */
    private File f44216j;

    /* renamed from: k, reason: collision with root package name */
    private w f44217k;

    v(g<?> gVar, f.a aVar) {
        this.f44209c = gVar;
        this.f44208b = aVar;
    }

    private boolean a() {
        return this.f44214h < this.f44213g.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        String s4 = ProtectedSandApp.s("ृ");
        com.bumptech.glide.util.pool.b.a(ProtectedSandApp.s("ॄ"));
        List<com.bumptech.glide.load.f> c5 = this.f44209c.c();
        boolean z4 = false;
        if (c5.isEmpty()) {
            return false;
        }
        List<Class<?>> m4 = this.f44209c.m();
        if (m4.isEmpty()) {
            if (File.class.equals(this.f44209c.r())) {
                return false;
            }
            throw new IllegalStateException(s4 + this.f44209c.i() + ProtectedSandApp.s("ॅ") + this.f44209c.r());
        }
        while (true) {
            if (this.f44213g != null && a()) {
                this.f44215i = null;
                while (!z4 && a()) {
                    List<com.bumptech.glide.load.model.o<File, ?>> list = this.f44213g;
                    int i4 = this.f44214h;
                    this.f44214h = i4 + 1;
                    this.f44215i = list.get(i4).b(this.f44216j, this.f44209c.t(), this.f44209c.f(), this.f44209c.k());
                    if (this.f44215i != null && this.f44209c.u(this.f44215i.f44321c.a())) {
                        this.f44215i.f44321c.e(this.f44209c.l(), this);
                        z4 = true;
                    }
                }
                return z4;
            }
            int i5 = this.f44211e + 1;
            this.f44211e = i5;
            if (i5 >= m4.size()) {
                int i6 = this.f44210d + 1;
                this.f44210d = i6;
                if (i6 >= c5.size()) {
                    return false;
                }
                this.f44211e = 0;
            }
            com.bumptech.glide.load.f fVar = c5.get(this.f44210d);
            Class<?> cls = m4.get(this.f44211e);
            this.f44217k = new w(this.f44209c.b(), fVar, this.f44209c.p(), this.f44209c.t(), this.f44209c.f(), this.f44209c.s(cls), cls, this.f44209c.k());
            File b5 = this.f44209c.d().b(this.f44217k);
            this.f44216j = b5;
            if (b5 != null) {
                this.f44212f = fVar;
                this.f44213g = this.f44209c.j(b5);
                this.f44214h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@o0 Exception exc) {
        this.f44208b.a(this.f44217k, exc, this.f44215i.f44321c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f44215i;
        if (aVar != null) {
            aVar.f44321c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f44208b.e(this.f44212f, obj, this.f44215i.f44321c, com.bumptech.glide.load.a.RESOURCE_DISK_CACHE, this.f44217k);
    }
}
