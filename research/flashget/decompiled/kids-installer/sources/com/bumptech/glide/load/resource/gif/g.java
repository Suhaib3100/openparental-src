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
import com.bumptech.glide.k;
import com.bumptech.glide.l;
import com.bumptech.glide.load.m;
import com.bumptech.glide.util.n;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifFrameLoader.java */
/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.gifdecoder.a f11840a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f11841b;

    /* renamed from: c, reason: collision with root package name */
    private final List<b> f11842c;

    /* renamed from: d, reason: collision with root package name */
    final l f11843d;

    /* renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11844e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f11845f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f11846g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f11847h;

    /* renamed from: i, reason: collision with root package name */
    private k<Bitmap> f11848i;

    /* renamed from: j, reason: collision with root package name */
    private a f11849j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f11850k;

    /* renamed from: l, reason: collision with root package name */
    private a f11851l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f11852m;

    /* renamed from: n, reason: collision with root package name */
    private m<Bitmap> f11853n;

    /* renamed from: o, reason: collision with root package name */
    private a f11854o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private d f11855p;

    /* renamed from: q, reason: collision with root package name */
    private int f11856q;

    /* renamed from: r, reason: collision with root package name */
    private int f11857r;

    /* renamed from: s, reason: collision with root package name */
    private int f11858s;

    /* compiled from: GifFrameLoader.java */
    @m1
    /* loaded from: classes3.dex */
    static class a extends com.bumptech.glide.request.target.e<Bitmap> {

        /* renamed from: r, reason: collision with root package name */
        private final Handler f11859r;

        /* renamed from: s, reason: collision with root package name */
        final int f11860s;

        /* renamed from: t, reason: collision with root package name */
        private final long f11861t;

        /* renamed from: u, reason: collision with root package name */
        private Bitmap f11862u;

        a(Handler handler, int i5, long j5) {
            this.f11859r = handler;
            this.f11860s = i5;
            this.f11861t = j5;
        }

        Bitmap c() {
            return this.f11862u;
        }

        @Override // com.bumptech.glide.request.target.p
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(@o0 Bitmap bitmap, @q0 com.bumptech.glide.request.transition.f<? super Bitmap> fVar) {
            this.f11862u = bitmap;
            this.f11859r.sendMessageAtTime(this.f11859r.obtainMessage(1, this), this.f11861t);
        }

        @Override // com.bumptech.glide.request.target.p
        public void p(@q0 Drawable drawable) {
            this.f11862u = null;
        }
    }

    /* compiled from: GifFrameLoader.java */
    public interface b {
        void a();
    }

    /* compiled from: GifFrameLoader.java */
    private class c implements Handler.Callback {

        /* renamed from: b, reason: collision with root package name */
        static final int f11863b = 1;

        /* renamed from: c, reason: collision with root package name */
        static final int f11864c = 2;

        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i5 = message.what;
            if (i5 == 1) {
                g.this.o((a) message.obj);
                return true;
            }
            if (i5 != 2) {
                return false;
            }
            g.this.f11843d.z((a) message.obj);
            return false;
        }
    }

    /* compiled from: GifFrameLoader.java */
    @m1
    interface d {
        void a();
    }

    g(com.bumptech.glide.b bVar, com.bumptech.glide.gifdecoder.a aVar, int i5, int i6, m<Bitmap> mVar, Bitmap bitmap) {
        this(bVar.h(), com.bumptech.glide.b.E(bVar.j()), aVar, null, k(com.bumptech.glide.b.E(bVar.j()), i5, i6), mVar, bitmap);
    }

    private static com.bumptech.glide.load.f g() {
        return new com.bumptech.glide.signature.e(Double.valueOf(Math.random()));
    }

    private static k<Bitmap> k(l lVar, int i5, int i6) {
        return lVar.u().a(com.bumptech.glide.request.i.p1(com.bumptech.glide.load.engine.j.f11361b).h1(true).W0(true).J0(i5, i6));
    }

    private void n() {
        if (!this.f11845f || this.f11846g) {
            return;
        }
        if (this.f11847h) {
            com.bumptech.glide.util.l.a(this.f11854o == null, ProtectedSandApp.s("Ǣ"));
            this.f11840a.k();
            this.f11847h = false;
        }
        a aVar = this.f11854o;
        if (aVar != null) {
            this.f11854o = null;
            o(aVar);
            return;
        }
        this.f11846g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f11840a.h();
        this.f11840a.e();
        this.f11851l = new a(this.f11841b, this.f11840a.m(), uptimeMillis);
        this.f11848i.a(com.bumptech.glide.request.i.J1(g())).l(this.f11840a).C1(this.f11851l);
    }

    private void p() {
        Bitmap bitmap = this.f11852m;
        if (bitmap != null) {
            this.f11844e.d(bitmap);
            this.f11852m = null;
        }
    }

    private void t() {
        if (this.f11845f) {
            return;
        }
        this.f11845f = true;
        this.f11850k = false;
        n();
    }

    private void u() {
        this.f11845f = false;
    }

    void a() {
        this.f11842c.clear();
        p();
        this.f11845f = false;
        a aVar = this.f11849j;
        if (aVar != null) {
            this.f11843d.z(aVar);
            this.f11849j = null;
        }
        a aVar2 = this.f11851l;
        if (aVar2 != null) {
            this.f11843d.z(aVar2);
            this.f11851l = null;
        }
        a aVar3 = this.f11854o;
        if (aVar3 != null) {
            this.f11843d.z(aVar3);
            this.f11854o = null;
        }
        this.f11840a.clear();
        this.f11850k = true;
    }

    ByteBuffer b() {
        return this.f11840a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f11849j;
        return aVar != null ? aVar.c() : this.f11852m;
    }

    int d() {
        a aVar = this.f11849j;
        if (aVar != null) {
            return aVar.f11860s;
        }
        return -1;
    }

    Bitmap e() {
        return this.f11852m;
    }

    int f() {
        return this.f11840a.g();
    }

    m<Bitmap> h() {
        return this.f11853n;
    }

    int i() {
        return this.f11858s;
    }

    int j() {
        return this.f11840a.q();
    }

    int l() {
        return this.f11840a.p() + this.f11856q;
    }

    int m() {
        return this.f11857r;
    }

    @m1
    void o(a aVar) {
        d dVar = this.f11855p;
        if (dVar != null) {
            dVar.a();
        }
        this.f11846g = false;
        if (this.f11850k) {
            this.f11841b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f11845f) {
            if (this.f11847h) {
                this.f11841b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f11854o = aVar;
                return;
            }
        }
        if (aVar.c() != null) {
            p();
            a aVar2 = this.f11849j;
            this.f11849j = aVar;
            int size = this.f11842c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                } else {
                    this.f11842c.get(size).a();
                }
            }
            if (aVar2 != null) {
                this.f11841b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        n();
    }

    void q(m<Bitmap> mVar, Bitmap bitmap) {
        this.f11853n = (m) com.bumptech.glide.util.l.d(mVar);
        this.f11852m = (Bitmap) com.bumptech.glide.util.l.d(bitmap);
        this.f11848i = this.f11848i.a(new com.bumptech.glide.request.i().Z0(mVar));
        this.f11856q = n.h(bitmap);
        this.f11857r = bitmap.getWidth();
        this.f11858s = bitmap.getHeight();
    }

    void r() {
        com.bumptech.glide.util.l.a(!this.f11845f, ProtectedSandApp.s("ǣ"));
        this.f11847h = true;
        a aVar = this.f11854o;
        if (aVar != null) {
            this.f11843d.z(aVar);
            this.f11854o = null;
        }
    }

    @m1
    void s(@q0 d dVar) {
        this.f11855p = dVar;
    }

    void v(b bVar) {
        if (this.f11850k) {
            throw new IllegalStateException(ProtectedSandApp.s("ǥ"));
        }
        if (this.f11842c.contains(bVar)) {
            throw new IllegalStateException(ProtectedSandApp.s("Ǥ"));
        }
        boolean isEmpty = this.f11842c.isEmpty();
        this.f11842c.add(bVar);
        if (isEmpty) {
            t();
        }
    }

    void w(b bVar) {
        this.f11842c.remove(bVar);
        if (this.f11842c.isEmpty()) {
            this.f11845f = false;
        }
    }

    g(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, l lVar, com.bumptech.glide.gifdecoder.a aVar, Handler handler, k<Bitmap> kVar, m<Bitmap> mVar, Bitmap bitmap) {
        this.f11842c = new ArrayList();
        this.f11843d = lVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f11844e = eVar;
        this.f11841b = handler;
        this.f11848i = kVar;
        this.f11840a = aVar;
        q(mVar, bitmap);
    }
}
