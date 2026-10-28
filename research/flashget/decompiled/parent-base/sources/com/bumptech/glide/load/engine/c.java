package com.bumptech.glide.load.engine;

import androidx.annotation.o0;
import com.bumptech.glide.load.data.d;
import com.bumptech.glide.load.engine.f;
import com.bumptech.glide.load.model.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.util.List;

/* compiled from: DataCacheGenerator.java */
/* loaded from: classes3.dex */
class c implements f, d.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.f> f43920b;

    /* renamed from: c, reason: collision with root package name */
    private final g<?> f43921c;

    /* renamed from: d, reason: collision with root package name */
    private final f.a f43922d;

    /* renamed from: e, reason: collision with root package name */
    private int f43923e;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.f f43924f;

    /* renamed from: g, reason: collision with root package name */
    private List<com.bumptech.glide.load.model.o<File, ?>> f43925g;

    /* renamed from: h, reason: collision with root package name */
    private int f43926h;

    /* renamed from: i, reason: collision with root package name */
    private volatile o.a<?> f43927i;

    /* renamed from: j, reason: collision with root package name */
    private File f43928j;

    c(g<?> gVar, f.a aVar) {
        this(gVar.c(), gVar, aVar);
    }

    private boolean a() {
        return this.f43926h < this.f43925g.size();
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean b() {
        com.bumptech.glide.util.pool.b.a(ProtectedSandApp.s("ࣂ"));
        while (true) {
            boolean z4 = false;
            if (this.f43925g != null && a()) {
                this.f43927i = null;
                while (!z4 && a()) {
                    List<com.bumptech.glide.load.model.o<File, ?>> list = this.f43925g;
                    int i4 = this.f43926h;
                    this.f43926h = i4 + 1;
                    this.f43927i = list.get(i4).b(this.f43928j, this.f43921c.t(), this.f43921c.f(), this.f43921c.k());
                    if (this.f43927i != null && this.f43921c.u(this.f43927i.f44321c.a())) {
                        this.f43927i.f44321c.e(this.f43921c.l(), this);
                        z4 = true;
                    }
                }
                return z4;
            }
            int i5 = this.f43923e + 1;
            this.f43923e = i5;
            if (i5 >= this.f43920b.size()) {
                return false;
            }
            com.bumptech.glide.load.f fVar = this.f43920b.get(this.f43923e);
            File b5 = this.f43921c.d().b(new d(fVar, this.f43921c.p()));
            this.f43928j = b5;
            if (b5 != null) {
                this.f43924f = fVar;
                this.f43925g = this.f43921c.j(b5);
                this.f43926h = 0;
            }
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void c(@o0 Exception exc) {
        this.f43922d.a(this.f43924f, exc, this.f43927i.f44321c, com.bumptech.glide.load.a.DATA_DISK_CACHE);
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        o.a<?> aVar = this.f43927i;
        if (aVar != null) {
            aVar.f44321c.cancel();
        }
    }

    @Override // com.bumptech.glide.load.data.d.a
    public void f(Object obj) {
        this.f43922d.e(this.f43924f, obj, this.f43927i.f44321c, com.bumptech.glide.load.a.DATA_DISK_CACHE, this.f43924f);
    }

    c(List<com.bumptech.glide.load.f> list, g<?> gVar, f.a aVar) {
        this.f43923e = -1;
        this.f43920b = list;
        this.f43921c = gVar;
        this.f43922d = aVar;
    }
}
