package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.model.n;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes3.dex */
class c implements f, d.a<Object> {

    /* renamed from: o, reason: collision with root package name */
    private final List<com.bumptech.glide.load.f> f11212o;

    /* renamed from: p, reason: collision with root package name */
    private final g<?> f11213p;

    /* renamed from: q, reason: collision with root package name */
    private final f.a f11214q;

    /* renamed from: r, reason: collision with root package name */
    private int f11215r;

    /* renamed from: s, reason: collision with root package name */
    private com.bumptech.glide.load.f f11216s;

    /* renamed from: t, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.n<File, ?>> f11217t;

    /* renamed from: u, reason: collision with root package name */
    private int f11218u;

    /* renamed from: v, reason: collision with root package name */
    private volatile n.a<?> f11219v;

    /* renamed from: w, reason: collision with root package name */
    private File f11220w;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean b() {
        return this.f11218u < this.f11217t.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        while (true) {
            boolean z5 = false;
            if (this.f11217t != null && b()) {
                this.f11219v = null;
                while (!z5 && b()) {
                    List<com.bumptech.glide.load.model.n<File, ?>> list = this.f11217t;
                    int i5 = this.f11218u;
                    this.f11218u = i5 + 1;
                    this.f11219v = list.get(i5).b(this.f11220w, this.f11213p.s(), this.f11213p.f(), this.f11213p.k());
                    if (this.f11219v != null && this.f11213p.t(this.f11219v.f11571c.a())) {
                        this.f11219v.f11571c.e(this.f11213p.l(), this);
                        z5 = true;
                    }
                }
                return z5;
            }
            int i6 = this.f11215r + 1;
            this.f11215r = i6;
            if (i6 >= this.f11212o.size()) {
                return false;
            }
            com.bumptech.glide.load.f fVar = this.f11212o.get(this.f11215r);
            File b6 = this.f11213p.d().b(new d(fVar, this.f11213p.o()));
            this.f11220w = b6;
            if (b6 != null) {
                this.f11216s = fVar;
                this.f11217t = this.f11213p.j(b6);
                this.f11218u = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@o0 Exception exc) {
        this.f11214q.g(this.f11216s, exc, this.f11219v.f11571c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        n.a<?> aVar = this.f11219v;
        if (aVar != null) {
            aVar.f11571c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f11214q.j(this.f11216s, obj, this.f11219v.f11571c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f11216s);
    }

    c(List<com.bumptech.glide.load.f> list, g<?> gVar, f.a aVar) {
        this.f11215r = -1;
        this.f11212o = list;
        this.f11213p = gVar;
        this.f11214q = aVar;
    }
}
