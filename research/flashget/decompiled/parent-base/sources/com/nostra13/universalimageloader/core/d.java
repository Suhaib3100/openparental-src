package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.core.c;

/* compiled from: ImageLoader.java */
/* loaded from: classes6.dex */
public class d {

    /* renamed from: d, reason: collision with root package name */
    public static final String f70334d = ProtectedSandApp.s("ᩝ\u0001");

    /* renamed from: e, reason: collision with root package name */
    static final String f70335e = ProtectedSandApp.s("ᩞ\u0001");

    /* renamed from: f, reason: collision with root package name */
    static final String f70336f = ProtectedSandApp.s("\u1a5f\u0001");

    /* renamed from: g, reason: collision with root package name */
    static final String f70337g = ProtectedSandApp.s("᩠\u0001");

    /* renamed from: h, reason: collision with root package name */
    private static final String f70338h = ProtectedSandApp.s("ᩡ\u0001");

    /* renamed from: i, reason: collision with root package name */
    private static final String f70339i = ProtectedSandApp.s("ᩢ\u0001");

    /* renamed from: j, reason: collision with root package name */
    private static final String f70340j = ProtectedSandApp.s("ᩣ\u0001");

    /* renamed from: k, reason: collision with root package name */
    private static final String f70341k = ProtectedSandApp.s("ᩤ\u0001");

    /* renamed from: l, reason: collision with root package name */
    private static volatile d f70342l;

    /* renamed from: a, reason: collision with root package name */
    private e f70343a;

    /* renamed from: b, reason: collision with root package name */
    private f f70344b;

    /* renamed from: c, reason: collision with root package name */
    private pb.a f70345c = new pb.d();

    /* compiled from: ImageLoader.java */
    private static class b extends pb.d {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f70346a;

        private b() {
        }

        @Override // pb.d, pb.a
        public void c(String str, View view, Bitmap bitmap) {
            this.f70346a = bitmap;
        }

        public Bitmap e() {
            return this.f70346a;
        }

        b(a aVar) {
        }
    }

    protected d() {
    }

    private void c() {
        if (this.f70343a == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ᩣ\u0001"));
        }
    }

    private static Handler g(c cVar) {
        Handler y4 = cVar.y();
        if (cVar.J()) {
            return null;
        }
        return (y4 == null && Looper.myLooper() == Looper.getMainLooper()) ? new Handler() : y4;
    }

    public static d x() {
        if (f70342l == null) {
            synchronized (d.class) {
                try {
                    if (f70342l == null) {
                        f70342l = new d();
                    }
                } finally {
                }
            }
        }
        return f70342l;
    }

    public com.nostra13.universalimageloader.cache.memory.c A() {
        c();
        return this.f70343a.f70414n;
    }

    public void B(boolean z4) {
        this.f70344b.m(z4);
    }

    public synchronized void C(e eVar) {
        try {
            if (eVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ᩤ\u0001"));
            }
            if (this.f70343a == null) {
                com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("ᩞ\u0001"), new Object[0]);
                this.f70344b = new f(eVar);
                this.f70343a = eVar;
            } else {
                com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("ᩡ\u0001"), new Object[0]);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean D() {
        return this.f70343a != null;
    }

    public void E(String str, c cVar, pb.a aVar) {
        G(str, null, cVar, aVar, null);
    }

    public void F(String str, com.nostra13.universalimageloader.core.assist.e eVar, c cVar, pb.a aVar) {
        G(str, eVar, cVar, aVar, null);
    }

    public void G(String str, com.nostra13.universalimageloader.core.assist.e eVar, c cVar, pb.a aVar, pb.b bVar) {
        c();
        if (eVar == null) {
            eVar = this.f70343a.b();
        }
        if (cVar == null) {
            cVar = this.f70343a.f70418r;
        }
        t(str, new com.nostra13.universalimageloader.core.imageaware.c(str, eVar, com.nostra13.universalimageloader.core.assist.h.CROP), cVar, aVar, bVar);
    }

    public void H(String str, com.nostra13.universalimageloader.core.assist.e eVar, pb.a aVar) {
        G(str, eVar, null, aVar, null);
    }

    public void I(String str, pb.a aVar) {
        G(str, null, null, aVar, null);
    }

    public Bitmap J(String str) {
        return M(str, null, null);
    }

    public Bitmap K(String str, c cVar) {
        return M(str, null, cVar);
    }

    public Bitmap L(String str, com.nostra13.universalimageloader.core.assist.e eVar) {
        return M(str, eVar, null);
    }

    public Bitmap M(String str, com.nostra13.universalimageloader.core.assist.e eVar, c cVar) {
        if (cVar == null) {
            cVar = this.f70343a.f70418r;
        }
        c u4 = new c.b().A(cVar).T(true).u();
        b bVar = new b();
        F(str, eVar, u4, bVar);
        return bVar.e();
    }

    public void N() {
        if (D()) {
            this.f70344b.r();
        } else {
            com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("ᩥ\u0001"), new Object[0]);
        }
    }

    public void O() {
        if (D()) {
            this.f70344b.t();
        } else {
            com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("ᩦ\u0001"), new Object[0]);
        }
    }

    public void P(pb.a aVar) {
        if (aVar == null) {
            aVar = new pb.d();
        }
        this.f70345c = aVar;
    }

    public void Q() {
        if (D()) {
            this.f70344b.u();
        } else {
            com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("ᩧ\u0001"), new Object[0]);
        }
    }

    public void a(ImageView imageView) {
        this.f70344b.e(new com.nostra13.universalimageloader.core.imageaware.b((View) imageView, true));
    }

    public void b(com.nostra13.universalimageloader.core.imageaware.a aVar) {
        this.f70344b.e(aVar);
    }

    @Deprecated
    public void d() {
        e();
    }

    public void e() {
        c();
        this.f70343a.f70415o.clear();
    }

    public void f() {
        c();
        this.f70343a.f70414n.clear();
    }

    public void h(boolean z4) {
        this.f70344b.g(z4);
    }

    public void i() {
        if (!D()) {
            com.nostra13.universalimageloader.utils.d.i(ProtectedSandApp.s("ᩨ\u0001"), new Object[0]);
            return;
        }
        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("\u1a5f\u0001"), new Object[0]);
        Q();
        this.f70343a.f70415o.close();
        this.f70344b = null;
        this.f70343a = null;
    }

    public void j(String str, ImageView imageView) {
        t(str, new com.nostra13.universalimageloader.core.imageaware.b((View) imageView, true), null, null, null);
    }

    public void k(String str, ImageView imageView, c cVar) {
        t(str, new com.nostra13.universalimageloader.core.imageaware.b((View) imageView, true), cVar, null, null);
    }

    public void l(String str, ImageView imageView, c cVar, pb.a aVar) {
        m(str, imageView, cVar, aVar, null);
    }

    public void m(String str, ImageView imageView, c cVar, pb.a aVar, pb.b bVar) {
        t(str, new com.nostra13.universalimageloader.core.imageaware.b((View) imageView, true), cVar, aVar, bVar);
    }

    public void n(String str, ImageView imageView, com.nostra13.universalimageloader.core.assist.e eVar) {
        r(str, new com.nostra13.universalimageloader.core.imageaware.b((View) imageView, true), null, eVar, null, null);
    }

    public void o(String str, ImageView imageView, pb.a aVar) {
        t(str, new com.nostra13.universalimageloader.core.imageaware.b((View) imageView, true), null, aVar, null);
    }

    public void p(String str, com.nostra13.universalimageloader.core.imageaware.a aVar) {
        t(str, aVar, null, null, null);
    }

    public void q(String str, com.nostra13.universalimageloader.core.imageaware.a aVar, c cVar) {
        t(str, aVar, cVar, null, null);
    }

    public void r(String str, com.nostra13.universalimageloader.core.imageaware.a aVar, c cVar, com.nostra13.universalimageloader.core.assist.e eVar, pb.a aVar2, pb.b bVar) {
        c();
        if (aVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᩢ\u0001"));
        }
        if (aVar2 == null) {
            aVar2 = this.f70345c;
        }
        pb.a aVar3 = aVar2;
        if (cVar == null) {
            cVar = this.f70343a.f70418r;
        }
        if (TextUtils.isEmpty(str)) {
            this.f70344b.e(aVar);
            aVar3.b(str, aVar.b());
            if (cVar.N()) {
                aVar.c(cVar.z(this.f70343a.f70401a));
            } else {
                aVar.c(null);
            }
            aVar3.c(str, aVar.b(), null);
            return;
        }
        if (eVar == null) {
            eVar = com.nostra13.universalimageloader.utils.b.e(aVar, this.f70343a.b());
        }
        com.nostra13.universalimageloader.core.assist.e eVar2 = eVar;
        String d5 = com.nostra13.universalimageloader.utils.e.d(str, eVar2);
        this.f70344b.s(aVar, d5);
        aVar3.b(str, aVar.b());
        Bitmap bitmap = this.f70343a.f70414n.get(d5);
        if (bitmap == null || bitmap.isRecycled()) {
            if (cVar.P()) {
                aVar.c(cVar.B(this.f70343a.f70401a));
            } else if (cVar.I()) {
                aVar.c(null);
            }
            h hVar = new h(this.f70344b, new g(str, aVar, eVar2, d5, cVar, aVar3, bVar, this.f70344b.j(str)), g(cVar));
            if (cVar.J()) {
                hVar.run();
                return;
            } else {
                this.f70344b.v(hVar);
                return;
            }
        }
        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("᩠\u0001"), d5);
        if (!cVar.L()) {
            cVar.w().a(bitmap, aVar, com.nostra13.universalimageloader.core.assist.f.MEMORY_CACHE);
            aVar3.c(str, aVar.b(), bitmap);
            return;
        }
        i iVar = new i(this.f70344b, bitmap, new g(str, aVar, eVar2, d5, cVar, aVar3, bVar, this.f70344b.j(str)), g(cVar));
        if (cVar.J()) {
            iVar.run();
        } else {
            this.f70344b.w(iVar);
        }
    }

    public void s(String str, com.nostra13.universalimageloader.core.imageaware.a aVar, c cVar, pb.a aVar2) {
        t(str, aVar, cVar, aVar2, null);
    }

    public void t(String str, com.nostra13.universalimageloader.core.imageaware.a aVar, c cVar, pb.a aVar2, pb.b bVar) {
        r(str, aVar, cVar, null, aVar2, bVar);
    }

    public void u(String str, com.nostra13.universalimageloader.core.imageaware.a aVar, pb.a aVar2) {
        t(str, aVar, null, aVar2, null);
    }

    @Deprecated
    public nb.a v() {
        return w();
    }

    public nb.a w() {
        c();
        return this.f70343a.f70415o;
    }

    public String y(ImageView imageView) {
        return this.f70344b.i(new com.nostra13.universalimageloader.core.imageaware.b((View) imageView, true));
    }

    public String z(com.nostra13.universalimageloader.core.imageaware.a aVar) {
        return this.f70344b.i(aVar);
    }
}
