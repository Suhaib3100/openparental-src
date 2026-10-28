package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import androidx.annotation.b0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.v;
import androidx.annotation.v0;
import com.bumptech.glide.manager.c;
import com.bumptech.glide.manager.r;
import com.bumptech.glide.manager.s;
import com.bumptech.glide.manager.u;
import com.bumptech.glide.request.target.p;
import com.bumptech.glide.util.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* loaded from: classes3.dex */
public class l implements ComponentCallbacks2, com.bumptech.glide.manager.m, h<k<Drawable>> {

    /* renamed from: o, reason: collision with root package name */
    protected final com.bumptech.glide.b f11036o;

    /* renamed from: p, reason: collision with root package name */
    protected final Context f11037p;

    /* renamed from: q, reason: collision with root package name */
    final com.bumptech.glide.manager.l f11038q;

    /* renamed from: r, reason: collision with root package name */
    @b0("this")
    private final s f11039r;

    /* renamed from: s, reason: collision with root package name */
    @b0("this")
    private final r f11040s;

    /* renamed from: t, reason: collision with root package name */
    @b0("this")
    private final u f11041t;

    /* renamed from: u, reason: collision with root package name */
    private final Runnable f11042u;

    /* renamed from: v, reason: collision with root package name */
    private final com.bumptech.glide.manager.c f11043v;

    /* renamed from: w, reason: collision with root package name */
    private final CopyOnWriteArrayList<com.bumptech.glide.request.h<Object>> f11044w;

    /* renamed from: x, reason: collision with root package name */
    @b0("this")
    private com.bumptech.glide.request.i f11045x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f11046y;

    /* renamed from: z, reason: collision with root package name */
    private static final com.bumptech.glide.request.i f11035z = com.bumptech.glide.request.i.o1(Bitmap.class).x0();
    private static final com.bumptech.glide.request.i A = com.bumptech.glide.request.i.o1(com.bumptech.glide.load.resource.gif.c.class).x0();
    private static final com.bumptech.glide.request.i B = com.bumptech.glide.request.i.p1(com.bumptech.glide.load.engine.j.f11362c).M0(i.LOW).W0(true);

    /* compiled from: RequestManager.java */
    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l lVar = l.this;
            lVar.f11038q.a(lVar);
        }
    }

    /* compiled from: RequestManager.java */
    private static class b extends com.bumptech.glide.request.target.f<View, Object> {
        b(@o0 View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.p
        public void b(@o0 Object obj, @q0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.f
        protected void i(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void k(@q0 Drawable drawable) {
        }
    }

    /* compiled from: RequestManager.java */
    private class c implements c.a {

        /* renamed from: a, reason: collision with root package name */
        @b0("RequestManager.this")
        private final s f11048a;

        c(@o0 s sVar) {
            this.f11048a = sVar;
        }

        @Override // com.bumptech.glide.manager.c.a
        public void a(boolean z5) {
            if (z5) {
                synchronized (l.this) {
                    this.f11048a.g();
                }
            }
        }
    }

    public l(@o0 com.bumptech.glide.b bVar, @o0 com.bumptech.glide.manager.l lVar, @o0 r rVar, @o0 Context context) {
        this(bVar, lVar, rVar, new s(), bVar.i(), context);
    }

    private void a0(@o0 p<?> pVar) {
        boolean Z = Z(pVar);
        com.bumptech.glide.request.e o5 = pVar.o();
        if (Z || this.f11036o.w(pVar) || o5 == null) {
            return;
        }
        pVar.h(null);
        o5.clear();
    }

    private synchronized void b0(@o0 com.bumptech.glide.request.i iVar) {
        this.f11045x = this.f11045x.a(iVar);
    }

    @androidx.annotation.j
    @o0
    public k<File> A(@q0 Object obj) {
        return B().l(obj);
    }

    @androidx.annotation.j
    @o0
    public k<File> B() {
        return t(File.class).a(B);
    }

    List<com.bumptech.glide.request.h<Object>> C() {
        return this.f11044w;
    }

    synchronized com.bumptech.glide.request.i D() {
        return this.f11045x;
    }

    @o0
    <T> m<?, T> E(Class<T> cls) {
        return this.f11036o.k().e(cls);
    }

    public synchronized boolean F() {
        return this.f11039r.d();
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public k<Drawable> j(@q0 Bitmap bitmap) {
        return v().j(bitmap);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public k<Drawable> i(@q0 Drawable drawable) {
        return v().i(drawable);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public k<Drawable> d(@q0 Uri uri) {
        return v().d(uri);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public k<Drawable> f(@q0 File file) {
        return v().f(file);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public k<Drawable> m(@q0 @v0 @v Integer num) {
        return v().m(num);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public k<Drawable> l(@q0 Object obj) {
        return v().l(obj);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public k<Drawable> s(@q0 String str) {
        return v().s(str);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @Deprecated
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public k<Drawable> c(@q0 URL url) {
        return v().c(url);
    }

    @Override // com.bumptech.glide.h
    @androidx.annotation.j
    @o0
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public k<Drawable> e(@q0 byte[] bArr) {
        return v().e(bArr);
    }

    public synchronized void P() {
        this.f11039r.e();
    }

    public synchronized void Q() {
        P();
        Iterator<l> it = this.f11040s.a().iterator();
        while (it.hasNext()) {
            it.next().P();
        }
    }

    public synchronized void R() {
        this.f11039r.f();
    }

    public synchronized void S() {
        R();
        Iterator<l> it = this.f11040s.a().iterator();
        while (it.hasNext()) {
            it.next().R();
        }
    }

    public synchronized void T() {
        this.f11039r.h();
    }

    public synchronized void U() {
        n.b();
        T();
        Iterator<l> it = this.f11040s.a().iterator();
        while (it.hasNext()) {
            it.next().T();
        }
    }

    @o0
    public synchronized l V(@o0 com.bumptech.glide.request.i iVar) {
        X(iVar);
        return this;
    }

    public void W(boolean z5) {
        this.f11046y = z5;
    }

    protected synchronized void X(@o0 com.bumptech.glide.request.i iVar) {
        this.f11045x = iVar.p().b();
    }

    synchronized void Y(@o0 p<?> pVar, @o0 com.bumptech.glide.request.e eVar) {
        this.f11041t.e(pVar);
        this.f11039r.i(eVar);
    }

    synchronized boolean Z(@o0 p<?> pVar) {
        com.bumptech.glide.request.e o5 = pVar.o();
        if (o5 == null) {
            return true;
        }
        if (!this.f11039r.b(o5)) {
            return false;
        }
        this.f11041t.f(pVar);
        pVar.h(null);
        return true;
    }

    public l g(com.bumptech.glide.request.h<Object> hVar) {
        this.f11044w.add(hVar);
        return this;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onDestroy() {
        this.f11041t.onDestroy();
        Iterator<p<?>> it = this.f11041t.d().iterator();
        while (it.hasNext()) {
            z(it.next());
        }
        this.f11041t.c();
        this.f11039r.c();
        this.f11038q.b(this);
        this.f11038q.b(this.f11043v);
        n.y(this.f11042u);
        this.f11036o.B(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onStart() {
        T();
        this.f11041t.onStart();
    }

    @Override // com.bumptech.glide.manager.m
    public synchronized void onStop() {
        R();
        this.f11041t.onStop();
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i5) {
        if (i5 == 60 && this.f11046y) {
            Q();
        }
    }

    @o0
    public synchronized l r(@o0 com.bumptech.glide.request.i iVar) {
        b0(iVar);
        return this;
    }

    @androidx.annotation.j
    @o0
    public <ResourceType> k<ResourceType> t(@o0 Class<ResourceType> cls) {
        return new k<>(this.f11036o, this, cls, this.f11037p);
    }

    public synchronized String toString() {
        return super.toString() + ProtectedSandApp.s("ᱬ") + this.f11039r + ProtectedSandApp.s("ᱭ") + this.f11040s + ProtectedSandApp.s("ᱮ");
    }

    @androidx.annotation.j
    @o0
    public k<Bitmap> u() {
        return t(Bitmap.class).a(f11035z);
    }

    @androidx.annotation.j
    @o0
    public k<Drawable> v() {
        return t(Drawable.class);
    }

    @androidx.annotation.j
    @o0
    public k<File> w() {
        return t(File.class).a(com.bumptech.glide.request.i.L1(true));
    }

    @androidx.annotation.j
    @o0
    public k<com.bumptech.glide.load.resource.gif.c> x() {
        return t(com.bumptech.glide.load.resource.gif.c.class).a(A);
    }

    public void y(@o0 View view) {
        z(new b(view));
    }

    public void z(@q0 p<?> pVar) {
        if (pVar == null) {
            return;
        }
        a0(pVar);
    }

    l(com.bumptech.glide.b bVar, com.bumptech.glide.manager.l lVar, r rVar, s sVar, com.bumptech.glide.manager.d dVar, Context context) {
        this.f11041t = new u();
        a aVar = new a();
        this.f11042u = aVar;
        this.f11036o = bVar;
        this.f11038q = lVar;
        this.f11040s = rVar;
        this.f11039r = sVar;
        this.f11037p = context;
        com.bumptech.glide.manager.c a6 = dVar.a(context.getApplicationContext(), new c(sVar));
        this.f11043v = a6;
        if (n.t()) {
            n.x(aVar);
        } else {
            lVar.a(this);
        }
        lVar.a(a6);
        this.f11044w = new CopyOnWriteArrayList<>(bVar.k().c());
        X(bVar.k().d());
        bVar.v(this);
    }
}
