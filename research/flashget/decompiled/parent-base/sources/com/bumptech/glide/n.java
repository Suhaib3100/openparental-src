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
import com.bumptech.glide.manager.b;
import com.bumptech.glide.manager.p;
import com.bumptech.glide.manager.q;
import com.bumptech.glide.manager.t;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* loaded from: classes3.dex */
public class n implements ComponentCallbacks2, com.bumptech.glide.manager.k, i<m<Drawable>> {

    /* renamed from: n, reason: collision with root package name */
    private static final com.bumptech.glide.request.i f44739n = com.bumptech.glide.request.i.j1(Bitmap.class).u0();

    /* renamed from: o, reason: collision with root package name */
    private static final com.bumptech.glide.request.i f44740o = com.bumptech.glide.request.i.j1(com.bumptech.glide.load.resource.gif.c.class).u0();

    /* renamed from: p, reason: collision with root package name */
    private static final com.bumptech.glide.request.i f44741p = com.bumptech.glide.request.i.k1(com.bumptech.glide.load.engine.j.f44087c).I0(j.LOW).T0(true);

    /* renamed from: b, reason: collision with root package name */
    protected final com.bumptech.glide.c f44742b;

    /* renamed from: c, reason: collision with root package name */
    protected final Context f44743c;

    /* renamed from: d, reason: collision with root package name */
    final com.bumptech.glide.manager.j f44744d;

    /* renamed from: e, reason: collision with root package name */
    @b0("this")
    private final q f44745e;

    /* renamed from: f, reason: collision with root package name */
    @b0("this")
    private final p f44746f;

    /* renamed from: g, reason: collision with root package name */
    @b0("this")
    private final t f44747g;

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f44748h;

    /* renamed from: i, reason: collision with root package name */
    private final com.bumptech.glide.manager.b f44749i;

    /* renamed from: j, reason: collision with root package name */
    private final CopyOnWriteArrayList<com.bumptech.glide.request.h<Object>> f44750j;

    /* renamed from: k, reason: collision with root package name */
    @b0("this")
    private com.bumptech.glide.request.i f44751k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f44752l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f44753m;

    /* compiled from: RequestManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n nVar = n.this;
            nVar.f44744d.b(nVar);
        }
    }

    /* compiled from: RequestManager.java */
    private static class b extends com.bumptech.glide.request.target.f<View, Object> {
        b(@o0 View view) {
            super(view);
        }

        @Override // com.bumptech.glide.request.target.p
        public void j(@o0 Object obj, @q0 com.bumptech.glide.request.transition.f<? super Object> fVar) {
        }

        @Override // com.bumptech.glide.request.target.f
        protected void k(@q0 Drawable drawable) {
        }

        @Override // com.bumptech.glide.request.target.p
        public void m(@q0 Drawable drawable) {
        }
    }

    /* compiled from: RequestManager.java */
    private class c implements b.a {

        /* renamed from: a, reason: collision with root package name */
        @b0("RequestManager.this")
        private final q f44755a;

        c(@o0 q qVar) {
            this.f44755a = qVar;
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z4) {
            if (z4) {
                synchronized (n.this) {
                    this.f44755a.g();
                }
            }
        }
    }

    public n(@o0 com.bumptech.glide.c cVar, @o0 com.bumptech.glide.manager.j jVar, @o0 p pVar, @o0 Context context) {
        this(cVar, jVar, pVar, new q(), cVar.i(), context);
    }

    private synchronized void A() {
        try {
            Iterator<com.bumptech.glide.request.target.p<?>> it = this.f44747g.c().iterator();
            while (it.hasNext()) {
                y(it.next());
            }
            this.f44747g.b();
        } catch (Throwable th) {
            throw th;
        }
    }

    private void b0(@o0 com.bumptech.glide.request.target.p<?> pVar) {
        boolean a02 = a0(pVar);
        com.bumptech.glide.request.e h4 = pVar.h();
        if (a02 || this.f44742b.x(pVar) || h4 == null) {
            return;
        }
        pVar.l(null);
        h4.clear();
    }

    private synchronized void c0(@o0 com.bumptech.glide.request.i iVar) {
        this.f44751k = this.f44751k.g(iVar);
    }

    @androidx.annotation.j
    @o0
    public m<File> B(@q0 Object obj) {
        return C().n(obj);
    }

    @androidx.annotation.j
    @o0
    public m<File> C() {
        return s(File.class).g(f44741p);
    }

    List<com.bumptech.glide.request.h<Object>> D() {
        return this.f44750j;
    }

    synchronized com.bumptech.glide.request.i E() {
        return this.f44751k;
    }

    @o0
    <T> o<?, T> F(Class<T> cls) {
        return this.f44742b.k().e(cls);
    }

    public synchronized boolean G() {
        return this.f44745e.d();
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public m<Drawable> k(@q0 Bitmap bitmap) {
        return u().k(bitmap);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public m<Drawable> f(@q0 Drawable drawable) {
        return u().f(drawable);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public m<Drawable> c(@q0 Uri uri) {
        return u().c(uri);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public m<Drawable> e(@q0 File file) {
        return u().e(file);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public m<Drawable> o(@q0 @v0 @v Integer num) {
        return u().o(num);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public m<Drawable> n(@q0 Object obj) {
        return u().n(obj);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public m<Drawable> load(@q0 String str) {
        return u().load(str);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @Deprecated
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public m<Drawable> b(@q0 URL url) {
        return u().b(url);
    }

    @Override // com.bumptech.glide.i
    @androidx.annotation.j
    @o0
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public m<Drawable> d(@q0 byte[] bArr) {
        return u().d(bArr);
    }

    public synchronized void Q() {
        this.f44745e.e();
    }

    public synchronized void R() {
        Q();
        Iterator<n> it = this.f44746f.a().iterator();
        while (it.hasNext()) {
            it.next().Q();
        }
    }

    public synchronized void S() {
        this.f44745e.f();
    }

    public synchronized void T() {
        S();
        Iterator<n> it = this.f44746f.a().iterator();
        while (it.hasNext()) {
            it.next().S();
        }
    }

    public synchronized void U() {
        this.f44745e.h();
    }

    public synchronized void V() {
        com.bumptech.glide.util.o.b();
        U();
        Iterator<n> it = this.f44746f.a().iterator();
        while (it.hasNext()) {
            it.next().U();
        }
    }

    @o0
    public synchronized n W(@o0 com.bumptech.glide.request.i iVar) {
        Y(iVar);
        return this;
    }

    public void X(boolean z4) {
        this.f44752l = z4;
    }

    protected synchronized void Y(@o0 com.bumptech.glide.request.i iVar) {
        this.f44751k = iVar.clone().i();
    }

    synchronized void Z(@o0 com.bumptech.glide.request.target.p<?> pVar, @o0 com.bumptech.glide.request.e eVar) {
        this.f44747g.d(pVar);
        this.f44745e.i(eVar);
    }

    synchronized boolean a0(@o0 com.bumptech.glide.request.target.p<?> pVar) {
        com.bumptech.glide.request.e h4 = pVar.h();
        if (h4 == null) {
            return true;
        }
        if (!this.f44745e.b(h4)) {
            return false;
        }
        this.f44747g.e(pVar);
        pVar.l(null);
        return true;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onDestroy() {
        this.f44747g.onDestroy();
        A();
        this.f44745e.c();
        this.f44744d.a(this);
        this.f44744d.a(this.f44749i);
        com.bumptech.glide.util.o.z(this.f44748h);
        this.f44742b.C(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onStart() {
        U();
        this.f44747g.onStart();
    }

    @Override // com.bumptech.glide.manager.k
    public synchronized void onStop() {
        try {
            this.f44747g.onStop();
            if (this.f44753m) {
                A();
            } else {
                S();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i4) {
        if (i4 == 60 && this.f44752l) {
            R();
        }
    }

    public n q(com.bumptech.glide.request.h<Object> hVar) {
        this.f44750j.add(hVar);
        return this;
    }

    @o0
    public synchronized n r(@o0 com.bumptech.glide.request.i iVar) {
        c0(iVar);
        return this;
    }

    @androidx.annotation.j
    @o0
    public <ResourceType> m<ResourceType> s(@o0 Class<ResourceType> cls) {
        return new m<>(this.f44742b, this, cls, this.f44743c);
    }

    @androidx.annotation.j
    @o0
    public m<Bitmap> t() {
        return s(Bitmap.class).g(f44739n);
    }

    public synchronized String toString() {
        return super.toString() + ProtectedSandApp.s("ੌ") + this.f44745e + ProtectedSandApp.s("੍") + this.f44746f + ProtectedSandApp.s("\u0a4e");
    }

    @androidx.annotation.j
    @o0
    public m<Drawable> u() {
        return s(Drawable.class);
    }

    @androidx.annotation.j
    @o0
    public m<File> v() {
        return s(File.class).g(com.bumptech.glide.request.i.I1(true));
    }

    @androidx.annotation.j
    @o0
    public m<com.bumptech.glide.load.resource.gif.c> w() {
        return s(com.bumptech.glide.load.resource.gif.c.class).g(f44740o);
    }

    public void x(@o0 View view) {
        y(new b(view));
    }

    public void y(@q0 com.bumptech.glide.request.target.p<?> pVar) {
        if (pVar == null) {
            return;
        }
        b0(pVar);
    }

    @o0
    public synchronized n z() {
        this.f44753m = true;
        return this;
    }

    n(com.bumptech.glide.c cVar, com.bumptech.glide.manager.j jVar, p pVar, q qVar, com.bumptech.glide.manager.c cVar2, Context context) {
        this.f44747g = new t();
        a aVar = new a();
        this.f44748h = aVar;
        this.f44742b = cVar;
        this.f44744d = jVar;
        this.f44746f = pVar;
        this.f44745e = qVar;
        this.f44743c = context;
        com.bumptech.glide.manager.b a5 = cVar2.a(context.getApplicationContext(), new c(qVar));
        this.f44749i = a5;
        cVar.w(this);
        if (com.bumptech.glide.util.o.u()) {
            com.bumptech.glide.util.o.y(aVar);
        } else {
            jVar.b(this);
        }
        jVar.b(a5);
        this.f44750j = new CopyOnWriteArrayList<>(cVar.k().c());
        Y(cVar.k().d());
    }
}
