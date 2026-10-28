package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.c;
import com.bumptech.glide.f;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.l;
import com.bumptech.glide.manager.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: GlideBuilder.java */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.k f42812c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.e f42813d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f42814e;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.j f42815f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f42816g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f42817h;

    /* renamed from: i, reason: collision with root package name */
    private a.InterfaceC0737a f42818i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.l f42819j;

    /* renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.manager.c f42820k;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private o.b f42823n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f42824o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f42825p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private List<com.bumptech.glide.request.h<Object>> f42826q;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, o<?, ?>> f42810a = new androidx.collection.a();

    /* renamed from: b, reason: collision with root package name */
    private final f.a f42811b = new f.a();

    /* renamed from: l, reason: collision with root package name */
    private int f42821l = 4;

    /* renamed from: m, reason: collision with root package name */
    private c.a f42822m = new a();

    /* compiled from: GlideBuilder.java */
    class a implements c.a {
        a() {
        }

        @Override // com.bumptech.glide.c.a
        @o0
        public com.bumptech.glide.request.i a() {
            return new com.bumptech.glide.request.i();
        }
    }

    /* compiled from: GlideBuilder.java */
    class b implements c.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.request.i f42828a;

        b(com.bumptech.glide.request.i iVar) {
            this.f42828a = iVar;
        }

        @Override // com.bumptech.glide.c.a
        @o0
        public com.bumptech.glide.request.i a() {
            com.bumptech.glide.request.i iVar = this.f42828a;
            return iVar != null ? iVar : new com.bumptech.glide.request.i();
        }
    }

    /* compiled from: GlideBuilder.java */
    static final class c implements f.b {
        c() {
        }
    }

    /* compiled from: GlideBuilder.java */
    /* renamed from: com.bumptech.glide.d$d, reason: collision with other inner class name */
    public static final class C0730d implements f.b {
    }

    /* compiled from: GlideBuilder.java */
    static final class e implements f.b {

        /* renamed from: a, reason: collision with root package name */
        final int f42830a;

        e(int i4) {
            this.f42830a = i4;
        }
    }

    @o0
    public d a(@o0 com.bumptech.glide.request.h<Object> hVar) {
        if (this.f42826q == null) {
            this.f42826q = new ArrayList();
        }
        this.f42826q.add(hVar);
        return this;
    }

    @o0
    com.bumptech.glide.c b(@o0 Context context, List<com.bumptech.glide.module.c> list, com.bumptech.glide.module.a aVar) {
        if (this.f42816g == null) {
            this.f42816g = com.bumptech.glide.load.engine.executor.a.l();
        }
        if (this.f42817h == null) {
            this.f42817h = com.bumptech.glide.load.engine.executor.a.g();
        }
        if (this.f42824o == null) {
            this.f42824o = com.bumptech.glide.load.engine.executor.a.d();
        }
        if (this.f42819j == null) {
            this.f42819j = new l.a(context).a();
        }
        if (this.f42820k == null) {
            this.f42820k = new com.bumptech.glide.manager.e();
        }
        if (this.f42813d == null) {
            int b5 = this.f42819j.b();
            if (b5 > 0) {
                this.f42813d = new com.bumptech.glide.load.engine.bitmap_recycle.k(b5);
            } else {
                this.f42813d = new com.bumptech.glide.load.engine.bitmap_recycle.f();
            }
        }
        if (this.f42814e == null) {
            this.f42814e = new com.bumptech.glide.load.engine.bitmap_recycle.j(this.f42819j.a());
        }
        if (this.f42815f == null) {
            this.f42815f = new com.bumptech.glide.load.engine.cache.i(this.f42819j.d());
        }
        if (this.f42818i == null) {
            this.f42818i = new com.bumptech.glide.load.engine.cache.h(context);
        }
        if (this.f42812c == null) {
            this.f42812c = new com.bumptech.glide.load.engine.k(this.f42815f, this.f42818i, this.f42817h, this.f42816g, com.bumptech.glide.load.engine.executor.a.o(), this.f42824o, this.f42825p);
        }
        List<com.bumptech.glide.request.h<Object>> list2 = this.f42826q;
        if (list2 == null) {
            this.f42826q = Collections.emptyList();
        } else {
            this.f42826q = Collections.unmodifiableList(list2);
        }
        f.a aVar2 = this.f42811b;
        aVar2.getClass();
        return new com.bumptech.glide.c(context, this.f42812c, this.f42815f, this.f42813d, this.f42814e, new com.bumptech.glide.manager.o(this.f42823n), this.f42820k, this.f42821l, this.f42822m, this.f42810a, this.f42826q, list, aVar, new f(aVar2));
    }

    @o0
    public d c(@q0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f42824o = aVar;
        return this;
    }

    @o0
    public d d(@q0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f42814e = bVar;
        return this;
    }

    @o0
    public d e(@q0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f42813d = eVar;
        return this;
    }

    @o0
    public d f(@q0 com.bumptech.glide.manager.c cVar) {
        this.f42820k = cVar;
        return this;
    }

    @o0
    public d g(@o0 c.a aVar) {
        this.f42822m = (c.a) com.bumptech.glide.util.m.f(aVar, ProtectedSandApp.s("ࠒ"));
        return this;
    }

    @o0
    public d h(@q0 com.bumptech.glide.request.i iVar) {
        return g(new b(iVar));
    }

    @o0
    public <T> d i(@o0 Class<T> cls, @q0 o<?, T> oVar) {
        this.f42810a.put(cls, oVar);
        return this;
    }

    @Deprecated
    public d j(boolean z4) {
        return this;
    }

    @o0
    public d k(@q0 a.InterfaceC0737a interfaceC0737a) {
        this.f42818i = interfaceC0737a;
        return this;
    }

    @o0
    public d l(@q0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f42817h = aVar;
        return this;
    }

    d m(com.bumptech.glide.load.engine.k kVar) {
        this.f42812c = kVar;
        return this;
    }

    public d n(boolean z4) {
        this.f42811b.d(new c(), z4 && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @o0
    public d o(boolean z4) {
        this.f42825p = z4;
        return this;
    }

    @o0
    public d p(int i4) {
        if (i4 < 2 || i4 > 6) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ࠓ"));
        }
        this.f42821l = i4;
        return this;
    }

    public d q(boolean z4) {
        this.f42811b.d(new C0730d(), z4);
        return this;
    }

    @o0
    public d r(@q0 com.bumptech.glide.load.engine.cache.j jVar) {
        this.f42815f = jVar;
        return this;
    }

    @o0
    public d s(@o0 l.a aVar) {
        this.f42819j = aVar.a();
        return this;
    }

    @o0
    public d t(@q0 com.bumptech.glide.load.engine.cache.l lVar) {
        this.f42819j = lVar;
        return this;
    }

    void u(@q0 o.b bVar) {
        this.f42823n = bVar;
    }

    @Deprecated
    public d v(@q0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f42816g = aVar;
        return this;
    }

    @o0
    public d w(@q0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f42816g = aVar;
        return this;
    }
}
