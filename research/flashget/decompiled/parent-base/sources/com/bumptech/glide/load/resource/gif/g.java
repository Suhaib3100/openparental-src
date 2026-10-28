package com.bumptech.glide.load.resource.gif;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.m;
import com.bumptech.glide.n;
import com.bumptech.glide.util.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes3.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.gifdecoder.a f44620a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f44621b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f44622c;

    /* renamed from: d, reason: collision with root package name */
    final n f44623d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44624e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44625f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f44626g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f44627h;

    /* renamed from: i, reason: collision with root package name */
    private m<Bitmap> f44628i;

    /* renamed from: j, reason: collision with root package name */
    private a f44629j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f44630k;

    /* renamed from: l, reason: collision with root package name */
    private a f44631l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f44632m;

    /* renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.m<Bitmap> f44633n;

    /* renamed from: o, reason: collision with root package name */
    private a f44634o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private d f44635p;

    /* renamed from: q, reason: collision with root package name */
    private int f44636q;

    /* renamed from: r, reason: collision with root package name */
    private int f44637r;

    /* renamed from: s, reason: collision with root package name */
    private int f44638s;

    /* compiled from: GifFrameLoader.java */
    @m1
    static class a extends com.bumptech.glide.request.target.e<Bitmap> {

        /* renamed from: e, reason: collision with root package name */
        private final Handler f44639e;

        /* renamed from: f, reason: collision with root package name */
        final int f44640f;

        /* renamed from: g, reason: collision with root package name */
        private final long f44641g;

        /* renamed from: h, reason: collision with root package name */
        private Bitmap f44642h;

        a(Handler handler, int i4, long j4) {
            this.f44639e = handler;
            this.f44640f = i4;
            this.f44641g = j4;
        }

        Bitmap b() {
            return this.f44642h;
        }

        @Override // com.bumptech.glide.request.target.p
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void j(@o0 Bitmap bitmap, @q0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            this.f44642h = bitmap;
            this.f44639e.sendMessageAtTime(this.f44639e.obtainMessage(1, this), this.f44641g);
        }

        @Override // com.bumptech.glide.request.target.p
        public void i(@q0 Drawable drawable) {
            this.f44642h = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    private class c implements Handler.Callback {

        /* renamed from: c, reason: collision with root package name */
        static final int f44643c = 1;

        /* renamed from: d, reason: collision with root package name */
        static final int f44644d = 2;

        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i4 = message.what;
            if (i4 == 1) {
                g.this.o((a) message.obj);
                return true;
            }
            if (i4 != 2) {
                return false;
            }
            g.this.f44623d.y((a) message.obj);
            return false;
        }
    }

    /* compiled from: GifFrameLoader.java */
    @m1
    interface d {
        void a();
    }

    g(com.bumptech.glide.c cVar, com.bumptech.glide.gifdecoder.a aVar, int i4, int i5, com.bumptech.glide.load.m<Bitmap> mVar, Bitmap bitmap) {
        this(cVar.h(), com.bumptech.glide.c.F(cVar.j()), aVar, null, k(com.bumptech.glide.c.F(cVar.j()), i4, i5), mVar, bitmap);
    }

    private static com.bumptech.glide.load.f g() {
        return new com.bumptech.glide.signature.e(Double.valueOf(Math.random()));
    }

    private static m<Bitmap> k(n nVar, int i4, int i5) {
        return nVar.t().g(com.bumptech.glide.request.i.k1(com.bumptech.glide.load.engine.j.f44086b).d1(true).T0(true).F0(i4, i5));
    }

    private void n() {
        if (!this.f44625f || this.f44626g) {
            return;
        }
        if (this.f44627h) {
            com.bumptech.glide.util.m.b(this.f44634o == null, ProtectedSandApp.s("ਙ"));
            this.f44620a.k();
            this.f44627h = false;
        }
        a aVar = this.f44634o;
        if (aVar != null) {
            this.f44634o = null;
            o(aVar);
            return;
        }
        this.f44626g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f44620a.j();
        this.f44620a.c();
        this.f44631l = new a(this.f44621b, this.f44620a.m(), uptimeMillis);
        this.f44628i.g(com.bumptech.glide.request.i.F1(g())).n(this.f44620a).z1(this.f44631l);
    }

    private void p() {
        Bitmap bitmap = this.f44632m;
        if (bitmap != null) {
            this.f44624e.e(bitmap);
            this.f44632m = null;
        }
    }

    private void t() {
        if (this.f44625f) {
            return;
        }
        this.f44625f = true;
        this.f44630k = false;
        n();
    }

    private void u() {
        this.f44625f = false;
    }

    void a() {
        this.f44622c.clear();
        p();
        this.f44625f = false;
        a aVar = this.f44629j;
        if (aVar != null) {
            this.f44623d.y(aVar);
            this.f44629j = null;
        }
        a aVar2 = this.f44631l;
        if (aVar2 != null) {
            this.f44623d.y(aVar2);
            this.f44631l = null;
        }
        a aVar3 = this.f44634o;
        if (aVar3 != null) {
            this.f44623d.y(aVar3);
            this.f44634o = null;
        }
        this.f44620a.clear();
        this.f44630k = true;
    }

    ByteBuffer b() {
        return this.f44620a.b().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f44629j;
        return aVar != null ? aVar.b() : this.f44632m;
    }

    int d() {
        a aVar = this.f44629j;
        if (aVar != null) {
            return aVar.f44640f;
        }
        return -1;
    }

    Bitmap e() {
        return this.f44632m;
    }

    int f() {
        return this.f44620a.d();
    }

    com.bumptech.glide.load.m<Bitmap> h() {
        return this.f44633n;
    }

    int i() {
        return this.f44638s;
    }

    int j() {
        return this.f44620a.g();
    }

    int l() {
        return this.f44620a.p() + this.f44636q;
    }

    int m() {
        return this.f44637r;
    }

    @m1
    void o(a aVar) {
        d dVar = this.f44635p;
        if (dVar != null) {
            dVar.a();
        }
        this.f44626g = false;
        if (this.f44630k) {
            this.f44621b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f44625f) {
            if (this.f44627h) {
                this.f44621b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f44634o = aVar;
                return;
            }
        }
        if (aVar.b() != null) {
            p();
            a aVar2 = this.f44629j;
            this.f44629j = aVar;
            for (int size = this.f44622c.size() - 1; size >= 0; size--) {
                this.f44622c.get(size).a();
            }
            if (aVar2 != null) {
                this.f44621b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        n();
    }

    void q(com.bumptech.glide.load.m<Bitmap> mVar, Bitmap bitmap) {
        String s4 = ProtectedSandApp.s("ਚ");
        this.f44633n = (com.bumptech.glide.load.m) com.bumptech.glide.util.m.f(mVar, s4);
        this.f44632m = (Bitmap) com.bumptech.glide.util.m.f(bitmap, s4);
        this.f44628i = this.f44628i.g(new com.bumptech.glide.request.i().W0(mVar));
        this.f44636q = o.i(bitmap);
        this.f44637r = bitmap.getWidth();
        this.f44638s = bitmap.getHeight();
    }

    void r() {
        com.bumptech.glide.util.m.b(!this.f44625f, ProtectedSandApp.s("ਛ"));
        this.f44627h = true;
        a aVar = this.f44634o;
        if (aVar != null) {
            this.f44623d.y(aVar);
            this.f44634o = null;
        }
    }

    @m1
    void s(@q0 d dVar) {
        this.f44635p = dVar;
    }

    void v(b bVar) {
        if (this.f44630k) {
            throw new IllegalStateException(ProtectedSandApp.s("ਝ"));
        }
        if (this.f44622c.contains(bVar)) {
            throw new IllegalStateException(ProtectedSandApp.s("ਜ"));
        }
        boolean isEmpty = this.f44622c.isEmpty();
        this.f44622c.add(bVar);
        if (isEmpty) {
            t();
        }
    }

    void w(b bVar) {
        this.f44622c.remove(bVar);
        if (this.f44622c.isEmpty()) {
            this.f44625f = false;
        }
    }

    g(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, n nVar, com.bumptech.glide.gifdecoder.a aVar, Handler handler, m<Bitmap> mVar, com.bumptech.glide.load.m<Bitmap> mVar2, Bitmap bitmap) {
        this.f44622c = new ArrayList();
        this.f44623d = nVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f44624e = eVar;
        this.f44621b = handler;
        this.f44628i = mVar;
        this.f44620a = aVar;
        q(mVar2, bitmap);
    }
}
