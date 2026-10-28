package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import android.os.Handler;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.nostra13.universalimageloader.core.assist.b;
import com.nostra13.universalimageloader.core.c;
import com.nostra13.universalimageloader.core.download.b;
import com.nostra13.universalimageloader.utils.c;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: LoadAndDisplayImageTask.java */
/* loaded from: classes6.dex */
final class h implements Runnable, c.a {
    private static final String A = ProtectedSandApp.s("\u1a9a\u0001");
    private static final String B = ProtectedSandApp.s("᪢\u0001");
    private static final String C = ProtectedSandApp.s("᪥\u0001");
    private static final String D = ProtectedSandApp.s("᪤\u0001");
    private static final String E = ProtectedSandApp.s("᪙\u0001");
    private static final String F = ProtectedSandApp.s("᪗\u0001");
    private static final String G = ProtectedSandApp.s("᪖\u0001");
    private static final String H = ProtectedSandApp.s("᪕\u0001");
    private static final String I = ProtectedSandApp.s("᪓\u0001");
    private static final String J = ProtectedSandApp.s("᪔\u0001");
    private static final String K = ProtectedSandApp.s("᪣\u0001");
    private static final String L = ProtectedSandApp.s("᪦\u0001");
    private static final String M = ProtectedSandApp.s("᪘\u0001");

    /* renamed from: s, reason: collision with root package name */
    private static final String f70470s = ProtectedSandApp.s("\u1a9d\u0001");

    /* renamed from: t, reason: collision with root package name */
    private static final String f70471t = ProtectedSandApp.s("\u1a9e\u0001");

    /* renamed from: u, reason: collision with root package name */
    private static final String f70472u = ProtectedSandApp.s("᪒\u0001");

    /* renamed from: v, reason: collision with root package name */
    private static final String f70473v = ProtectedSandApp.s("\u1a9f\u0001");

    /* renamed from: w, reason: collision with root package name */
    private static final String f70474w = ProtectedSandApp.s("᪠\u0001");

    /* renamed from: x, reason: collision with root package name */
    private static final String f70475x = ProtectedSandApp.s("᪡\u0001");

    /* renamed from: y, reason: collision with root package name */
    private static final String f70476y = ProtectedSandApp.s("\u1a9c\u0001");

    /* renamed from: z, reason: collision with root package name */
    private static final String f70477z = ProtectedSandApp.s("\u1a9b\u0001");

    /* renamed from: b, reason: collision with root package name */
    private final f f70478b;

    /* renamed from: c, reason: collision with root package name */
    private final g f70479c;

    /* renamed from: d, reason: collision with root package name */
    private final Handler f70480d;

    /* renamed from: e, reason: collision with root package name */
    private final e f70481e;

    /* renamed from: f, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.download.b f70482f;

    /* renamed from: g, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.download.b f70483g;

    /* renamed from: h, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.download.b f70484h;

    /* renamed from: i, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.decode.b f70485i;

    /* renamed from: j, reason: collision with root package name */
    final String f70486j;

    /* renamed from: k, reason: collision with root package name */
    private final String f70487k;

    /* renamed from: l, reason: collision with root package name */
    final com.nostra13.universalimageloader.core.imageaware.a f70488l;

    /* renamed from: m, reason: collision with root package name */
    private final com.nostra13.universalimageloader.core.assist.e f70489m;

    /* renamed from: n, reason: collision with root package name */
    final com.nostra13.universalimageloader.core.c f70490n;

    /* renamed from: o, reason: collision with root package name */
    final pb.a f70491o;

    /* renamed from: p, reason: collision with root package name */
    final pb.b f70492p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f70493q;

    /* renamed from: r, reason: collision with root package name */
    private com.nostra13.universalimageloader.core.assist.f f70494r = com.nostra13.universalimageloader.core.assist.f.NETWORK;

    /* compiled from: LoadAndDisplayImageTask.java */
    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f70495b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f70496c;

        a(int i4, int i5) {
            this.f70495b = i4;
            this.f70496c = i5;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f70492p.a(hVar.f70486j, hVar.f70488l.b(), this.f70495b, this.f70496c);
        }
    }

    /* compiled from: LoadAndDisplayImageTask.java */
    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ b.a f70498b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Throwable f70499c;

        b(b.a aVar, Throwable th) {
            this.f70498b = aVar;
            this.f70499c = th;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f70490n.O()) {
                h hVar = h.this;
                hVar.f70488l.c(hVar.f70490n.A(hVar.f70481e.f70401a));
            }
            h hVar2 = h.this;
            hVar2.f70491o.a(hVar2.f70486j, hVar2.f70488l.b(), new com.nostra13.universalimageloader.core.assist.b(this.f70498b, this.f70499c));
        }
    }

    /* compiled from: LoadAndDisplayImageTask.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = h.this;
            hVar.f70491o.d(hVar.f70486j, hVar.f70488l.b());
        }
    }

    /* compiled from: LoadAndDisplayImageTask.java */
    class d extends Exception {
        d() {
        }
    }

    public h(f fVar, g gVar, Handler handler) {
        this.f70478b = fVar;
        this.f70479c = gVar;
        this.f70480d = handler;
        e eVar = fVar.f70450a;
        this.f70481e = eVar;
        this.f70482f = eVar.f70416p;
        this.f70483g = eVar.f70419s;
        this.f70484h = eVar.f70420t;
        this.f70485i = eVar.f70417q;
        this.f70486j = gVar.f70462a;
        this.f70487k = gVar.f70463b;
        this.f70488l = gVar.f70464c;
        this.f70489m = gVar.f70465d;
        com.nostra13.universalimageloader.core.c cVar = gVar.f70466e;
        this.f70490n = cVar;
        this.f70491o = gVar.f70467f;
        this.f70492p = gVar.f70468g;
        this.f70493q = cVar.J();
    }

    private void c() throws d {
        if (o()) {
            throw new d();
        }
    }

    private void d() throws d {
        e();
        f();
    }

    private void e() throws d {
        if (q()) {
            throw new d();
        }
    }

    private void f() throws d {
        if (r()) {
            throw new d();
        }
    }

    private Bitmap g(String str) throws IOException {
        return this.f70485i.a(new com.nostra13.universalimageloader.core.decode.c(this.f70487k, str, this.f70486j, this.f70489m, this.f70488l.e(), m(), this.f70490n));
    }

    private boolean h() {
        if (!this.f70490n.K()) {
            return false;
        }
        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("᪒\u0001"), Integer.valueOf(this.f70490n.v()), this.f70487k);
        try {
            Thread.sleep(this.f70490n.v());
            return p();
        } catch (InterruptedException unused) {
            com.nostra13.universalimageloader.utils.d.c(ProtectedSandApp.s("᪓\u0001"), this.f70487k);
            return true;
        }
    }

    private boolean i() throws IOException {
        InputStream a5 = m().a(this.f70486j, this.f70490n.x());
        if (a5 == null) {
            com.nostra13.universalimageloader.utils.d.c(ProtectedSandApp.s("᪔\u0001"), this.f70487k);
            return false;
        }
        try {
            return this.f70481e.f70415o.c(this.f70486j, a5, this);
        } finally {
            com.nostra13.universalimageloader.utils.c.a(a5);
        }
    }

    private void j() {
        if (this.f70493q || o()) {
            return;
        }
        t(new c(), false, this.f70480d, this.f70478b);
    }

    private void k(b.a aVar, Throwable th) {
        if (this.f70493q || o() || p()) {
            return;
        }
        t(new b(aVar, th), false, this.f70480d, this.f70478b);
    }

    private boolean l(int i4, int i5) {
        if (o() || p()) {
            return false;
        }
        if (this.f70492p == null) {
            return true;
        }
        t(new a(i4, i5), false, this.f70480d, this.f70478b);
        return true;
    }

    private com.nostra13.universalimageloader.core.download.b m() {
        return this.f70478b.p() ? this.f70483g : this.f70478b.q() ? this.f70484h : this.f70482f;
    }

    private boolean o() {
        if (!Thread.interrupted()) {
            return false;
        }
        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("᪓\u0001"), this.f70487k);
        return true;
    }

    private boolean p() {
        return q() || r();
    }

    private boolean q() {
        if (!this.f70488l.d()) {
            return false;
        }
        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("᪕\u0001"), this.f70487k);
        return true;
    }

    private boolean r() {
        if (this.f70487k.equals(this.f70478b.i(this.f70488l))) {
            return false;
        }
        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("᪖\u0001"), this.f70487k);
        return true;
    }

    private boolean s(int i4, int i5) throws IOException {
        File file = this.f70481e.f70415o.get(this.f70486j);
        if (file != null && file.exists()) {
            Bitmap a5 = this.f70485i.a(new com.nostra13.universalimageloader.core.decode.c(this.f70487k, b.a.FILE.wrap(file.getAbsolutePath()), this.f70486j, new com.nostra13.universalimageloader.core.assist.e(i4, i5), com.nostra13.universalimageloader.core.assist.h.FIT_INSIDE, m(), new c.b().A(this.f70490n).H(com.nostra13.universalimageloader.core.assist.d.IN_SAMPLE_INT).u()));
            if (a5 != null && this.f70481e.f70406f != null) {
                com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("᪗\u0001"), this.f70487k);
                a5 = this.f70481e.f70406f.a(a5);
                if (a5 == null) {
                    com.nostra13.universalimageloader.utils.d.c(ProtectedSandApp.s("᪘\u0001"), this.f70487k);
                }
            }
            if (a5 != null) {
                boolean b5 = this.f70481e.f70415o.b(this.f70486j, a5);
                a5.recycle();
                return b5;
            }
        }
        return false;
    }

    static void t(Runnable runnable, boolean z4, Handler handler, f fVar) {
        if (z4) {
            runnable.run();
        } else if (handler == null) {
            fVar.h(runnable);
        } else {
            handler.post(runnable);
        }
    }

    private boolean u() throws d {
        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("᪙\u0001"), this.f70487k);
        try {
            boolean i4 = i();
            if (!i4) {
                return i4;
            }
            e eVar = this.f70481e;
            int i5 = eVar.f70404d;
            int i6 = eVar.f70405e;
            if (i5 <= 0 && i6 <= 0) {
                return i4;
            }
            com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("\u1a9a\u0001"), this.f70487k);
            s(i5, i6);
            return i4;
        } catch (IOException e4) {
            com.nostra13.universalimageloader.utils.d.d(e4);
            return false;
        }
    }

    private Bitmap v() throws d {
        Bitmap bitmap;
        File file;
        Bitmap bitmap2 = null;
        try {
            try {
                File file2 = this.f70481e.f70415o.get(this.f70486j);
                if (file2 == null || !file2.exists() || file2.length() <= 0) {
                    bitmap = null;
                } else {
                    com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("\u1a9b\u0001"), this.f70487k);
                    this.f70494r = com.nostra13.universalimageloader.core.assist.f.DISC_CACHE;
                    d();
                    bitmap = g(b.a.FILE.wrap(file2.getAbsolutePath()));
                }
                if (bitmap != null) {
                    try {
                        if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                            return bitmap;
                        }
                    } catch (IOException e4) {
                        Bitmap bitmap3 = bitmap;
                        e = e4;
                        bitmap2 = bitmap3;
                        com.nostra13.universalimageloader.utils.d.d(e);
                        k(b.a.IO_ERROR, e);
                        return bitmap2;
                    } catch (IllegalStateException unused) {
                        k(b.a.NETWORK_DENIED, null);
                        return bitmap;
                    } catch (OutOfMemoryError e5) {
                        Bitmap bitmap4 = bitmap;
                        e = e5;
                        bitmap2 = bitmap4;
                        com.nostra13.universalimageloader.utils.d.d(e);
                        k(b.a.OUT_OF_MEMORY, e);
                        return bitmap2;
                    } catch (Throwable th) {
                        Bitmap bitmap5 = bitmap;
                        th = th;
                        bitmap2 = bitmap5;
                        com.nostra13.universalimageloader.utils.d.d(th);
                        k(b.a.UNKNOWN, th);
                        return bitmap2;
                    }
                }
                com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("\u1a9c\u0001"), this.f70487k);
                this.f70494r = com.nostra13.universalimageloader.core.assist.f.NETWORK;
                String str = this.f70486j;
                if (this.f70490n.G() && u() && (file = this.f70481e.f70415o.get(this.f70486j)) != null) {
                    str = b.a.FILE.wrap(file.getAbsolutePath());
                }
                d();
                bitmap = g(str);
                if (bitmap != null && bitmap.getWidth() > 0 && bitmap.getHeight() > 0) {
                    return bitmap;
                }
                k(b.a.DECODING_ERROR, null);
                return bitmap;
            } catch (d e6) {
                throw e6;
            }
        } catch (IOException e7) {
            e = e7;
        } catch (IllegalStateException unused2) {
            bitmap = null;
        } catch (OutOfMemoryError e10) {
            e = e10;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean w() {
        AtomicBoolean k4 = this.f70478b.k();
        if (k4.get()) {
            synchronized (this.f70478b.l()) {
                try {
                    if (k4.get()) {
                        com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("\u1a9d\u0001"), this.f70487k);
                        try {
                            this.f70478b.l().wait();
                            com.nostra13.universalimageloader.utils.d.a(ProtectedSandApp.s("\u1a9e\u0001"), this.f70487k);
                        } catch (InterruptedException unused) {
                            com.nostra13.universalimageloader.utils.d.c(ProtectedSandApp.s("᪓\u0001"), this.f70487k);
                            return true;
                        }
                    }
                } finally {
                }
            }
        }
        return p();
    }

    @Override // com.nostra13.universalimageloader.utils.c.a
    public boolean a(int i4, int i5) {
        return this.f70493q || l(i4, i5);
    }

    String n() {
        return this.f70486j;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00ef A[Catch: all -> 0x0063, d -> 0x011c, TryCatch #1 {d -> 0x011c, blocks: (B:13:0x0039, B:15:0x0048, B:18:0x004f, B:20:0x00cc, B:22:0x00d4, B:24:0x00ef, B:25:0x00fe, B:29:0x0066, B:33:0x0070, B:35:0x007e, B:37:0x0099, B:39:0x00aa, B:41:0x00b2), top: B:12:0x0039, outer: #0 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 295
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.nostra13.universalimageloader.core.h.run():void");
    }
}
