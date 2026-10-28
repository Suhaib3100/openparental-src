package com.bumptech.glide;

import android.content.Context;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.b;
import com.bumptech.glide.e;
import com.bumptech.glide.load.engine.cache.a;
import com.bumptech.glide.load.engine.cache.l;
import com.bumptech.glide.manager.q;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* compiled from: GlideBuilder.java */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.load.engine.k f10725c;

    /* renamed from: d, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.e f10726d;

    /* renamed from: e, reason: collision with root package name */
    private com.bumptech.glide.load.engine.bitmap_recycle.b f10727e;

    /* renamed from: f, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.j f10728f;

    /* renamed from: g, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f10729g;

    /* renamed from: h, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f10730h;

    /* renamed from: i, reason: collision with root package name */
    private a.InterfaceC0138a f10731i;

    /* renamed from: j, reason: collision with root package name */
    private com.bumptech.glide.load.engine.cache.l f10732j;

    /* renamed from: k, reason: collision with root package name */
    private com.bumptech.glide.manager.d f10733k;

    /* renamed from: n, reason: collision with root package name */
    @q0
    private q.b f10736n;

    /* renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.load.engine.executor.a f10737o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f10738p;

    /* renamed from: q, reason: collision with root package name */
    @q0
    private List<com.bumptech.glide.request.h<Object>> f10739q;

    /* renamed from: a, reason: collision with root package name */
    private final Map<Class<?>, m<?, ?>> f10723a = new androidx.collection.a();

    /* renamed from: b, reason: collision with root package name */
    private final e.a f10724b = new e.a();

    /* renamed from: l, reason: collision with root package name */
    private int f10734l = 4;

    /* renamed from: m, reason: collision with root package name */
    private b.a f10735m = new a();

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes3.dex */
    class a implements b.a {
        a() {
        }

        @Override // com.bumptech.glide.b.a
        @o0
        public com.bumptech.glide.request.i build() {
            return new com.bumptech.glide.request.i();
        }
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes3.dex */
    class b implements b.a {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.request.i f10741a;

        b(com.bumptech.glide.request.i iVar) {
            this.f10741a = iVar;
        }

        @Override // com.bumptech.glide.b.a
        @o0
        public com.bumptech.glide.request.i build() {
            com.bumptech.glide.request.i iVar = this.f10741a;
            return iVar != null ? iVar : new com.bumptech.glide.request.i();
        }
    }

    /* compiled from: GlideBuilder.java */
    /* renamed from: com.bumptech.glide.c$c, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    static final class C0131c implements e.b {
        C0131c() {
        }
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes3.dex */
    public static final class d implements e.b {
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes3.dex */
    static final class e implements e.b {

        /* renamed from: a, reason: collision with root package name */
        final int f10743a;

        e(int i5) {
            this.f10743a = i5;
        }
    }

    /* compiled from: GlideBuilder.java */
    /* loaded from: classes3.dex */
    public static final class f implements e.b {
        private f() {
        }
    }

    @o0
    public c a(@o0 com.bumptech.glide.request.h<Object> hVar) {
        if (this.f10739q == null) {
            this.f10739q = new ArrayList();
        }
        this.f10739q.add(hVar);
        return this;
    }

    @o0
    com.bumptech.glide.b b(@o0 Context context) {
        if (this.f10729g == null) {
            this.f10729g = com.bumptech.glide.load.engine.executor.a.j();
        }
        if (this.f10730h == null) {
            this.f10730h = com.bumptech.glide.load.engine.executor.a.f();
        }
        if (this.f10737o == null) {
            this.f10737o = com.bumptech.glide.load.engine.executor.a.c();
        }
        if (this.f10732j == null) {
            this.f10732j = new l.a(context).a();
        }
        if (this.f10733k == null) {
            this.f10733k = new com.bumptech.glide.manager.f();
        }
        if (this.f10726d == null) {
            int b6 = this.f10732j.b();
            if (b6 > 0) {
                this.f10726d = new com.bumptech.glide.load.engine.bitmap_recycle.k(b6);
            } else {
                this.f10726d = new com.bumptech.glide.load.engine.bitmap_recycle.f();
            }
        }
        if (this.f10727e == null) {
            this.f10727e = new com.bumptech.glide.load.engine.bitmap_recycle.j(this.f10732j.a());
        }
        if (this.f10728f == null) {
            this.f10728f = new com.bumptech.glide.load.engine.cache.i(this.f10732j.d());
        }
        if (this.f10731i == null) {
            this.f10731i = new com.bumptech.glide.load.engine.cache.h(context);
        }
        if (this.f10725c == null) {
            this.f10725c = new com.bumptech.glide.load.engine.k(this.f10728f, this.f10731i, this.f10730h, this.f10729g, com.bumptech.glide.load.engine.executor.a.n(), this.f10737o, this.f10738p);
        }
        List<com.bumptech.glide.request.h<Object>> list = this.f10739q;
        if (list == null) {
            this.f10739q = Collections.emptyList();
        } else {
            this.f10739q = Collections.unmodifiableList(list);
        }
        e.a aVar = this.f10724b;
        aVar.getClass();
        com.bumptech.glide.e eVar = new com.bumptech.glide.e(aVar);
        return new com.bumptech.glide.b(context, this.f10725c, this.f10728f, this.f10726d, this.f10727e, new q(this.f10736n, eVar), this.f10733k, this.f10734l, this.f10735m, this.f10723a, this.f10739q, eVar);
    }

    @o0
    public c c(@q0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f10737o = aVar;
        return this;
    }

    @o0
    public c d(@q0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f10727e = bVar;
        return this;
    }

    @o0
    public c e(@q0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f10726d = eVar;
        return this;
    }

    @o0
    public c f(@q0 com.bumptech.glide.manager.d dVar) {
        this.f10733k = dVar;
        return this;
    }

    @o0
    public c g(@o0 b.a aVar) {
        this.f10735m = (b.a) com.bumptech.glide.util.l.d(aVar);
        return this;
    }

    @o0
    public c h(@q0 com.bumptech.glide.request.i iVar) {
        return g(new b(iVar));
    }

    @o0
    public <T> c i(@o0 Class<T> cls, @q0 m<?, T> mVar) {
        this.f10723a.put(cls, mVar);
        return this;
    }

    @o0
    public c j(@q0 a.InterfaceC0138a interfaceC0138a) {
        this.f10731i = interfaceC0138a;
        return this;
    }

    @o0
    public c k(@q0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f10730h = aVar;
        return this;
    }

    c l(com.bumptech.glide.load.engine.k kVar) {
        this.f10725c = kVar;
        return this;
    }

    public c m(boolean z5) {
        this.f10724b.d(new C0131c(), z5 && Build.VERSION.SDK_INT >= 29);
        return this;
    }

    @o0
    public c n(boolean z5) {
        this.f10738p = z5;
        return this;
    }

    @o0
    public c o(int i5) {
        if (i5 < 2 || i5 > 6) {
            throw new IllegalArgumentException(ProtectedSandApp.s("©"));
        }
        this.f10734l = i5;
        return this;
    }

    public c p(boolean z5) {
        this.f10724b.d(new d(), z5);
        return this;
    }

    @o0
    public c q(@q0 com.bumptech.glide.load.engine.cache.j jVar) {
        this.f10728f = jVar;
        return this;
    }

    @o0
    public c r(@o0 l.a aVar) {
        this.f10732j = aVar.a();
        return this;
    }

    @o0
    public c s(@q0 com.bumptech.glide.load.engine.cache.l lVar) {
        this.f10732j = lVar;
        return this;
    }

    void t(@q0 q.b bVar) {
        this.f10736n = bVar;
    }

    @Deprecated
    public c u(@q0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f10729g = aVar;
        return this;
    }

    @o0
    public c v(@q0 com.bumptech.glide.load.engine.executor.a aVar) {
        this.f10729g = aVar;
        return this;
    }
}
