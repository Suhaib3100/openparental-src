package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.NetworkInfo;
import androidx.compose.material3.j4;
import com.squareup.picasso.d0;
import com.squareup.picasso.u;
import com.squareup.picasso.w;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicInteger;
import okio.o0;

/* compiled from: BitmapHunter.java */
/* loaded from: classes6.dex */
class c implements Runnable {

    /* renamed from: u, reason: collision with root package name */
    private static final Object f70784u = new Object();

    /* renamed from: v, reason: collision with root package name */
    private static final ThreadLocal<StringBuilder> f70785v = new a();

    /* renamed from: w, reason: collision with root package name */
    private static final AtomicInteger f70786w = new AtomicInteger();

    /* renamed from: x, reason: collision with root package name */
    private static final d0 f70787x = new b();

    /* renamed from: b, reason: collision with root package name */
    final int f70788b = f70786w.incrementAndGet();

    /* renamed from: c, reason: collision with root package name */
    final w f70789c;

    /* renamed from: d, reason: collision with root package name */
    final j f70790d;

    /* renamed from: e, reason: collision with root package name */
    final com.squareup.picasso.e f70791e;

    /* renamed from: f, reason: collision with root package name */
    final f0 f70792f;

    /* renamed from: g, reason: collision with root package name */
    final String f70793g;

    /* renamed from: h, reason: collision with root package name */
    final b0 f70794h;

    /* renamed from: i, reason: collision with root package name */
    final int f70795i;

    /* renamed from: j, reason: collision with root package name */
    int f70796j;

    /* renamed from: k, reason: collision with root package name */
    final d0 f70797k;

    /* renamed from: l, reason: collision with root package name */
    com.squareup.picasso.a f70798l;

    /* renamed from: m, reason: collision with root package name */
    List<com.squareup.picasso.a> f70799m;

    /* renamed from: n, reason: collision with root package name */
    Bitmap f70800n;

    /* renamed from: o, reason: collision with root package name */
    Future<?> f70801o;

    /* renamed from: p, reason: collision with root package name */
    w.e f70802p;

    /* renamed from: q, reason: collision with root package name */
    Exception f70803q;

    /* renamed from: r, reason: collision with root package name */
    int f70804r;

    /* renamed from: s, reason: collision with root package name */
    int f70805s;

    /* renamed from: t, reason: collision with root package name */
    w.f f70806t;

    /* compiled from: BitmapHunter.java */
    static class a extends ThreadLocal<StringBuilder> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public StringBuilder initialValue() {
            return new StringBuilder("Picasso-");
        }
    }

    /* compiled from: BitmapHunter.java */
    static class b extends d0 {
        b() {
        }

        @Override // com.squareup.picasso.d0
        public boolean c(b0 b0Var) {
            return true;
        }

        @Override // com.squareup.picasso.d0
        public d0.a f(b0 b0Var, int i4) throws IOException {
            throw new IllegalStateException("Unrecognized type of request: " + b0Var);
        }
    }

    /* compiled from: BitmapHunter.java */
    /* renamed from: com.squareup.picasso.c$c, reason: collision with other inner class name */
    static class RunnableC0993c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f70807b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ RuntimeException f70808c;

        RunnableC0993c(j0 j0Var, RuntimeException runtimeException) {
            this.f70807b = j0Var;
            this.f70808c = runtimeException;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new RuntimeException("Transformation " + this.f70807b.key() + " crashed with exception.", this.f70808c);
        }
    }

    /* compiled from: BitmapHunter.java */
    static class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ StringBuilder f70809b;

        d(StringBuilder sb) {
            this.f70809b = sb;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new NullPointerException(this.f70809b.toString());
        }
    }

    /* compiled from: BitmapHunter.java */
    static class e implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f70810b;

        e(j0 j0Var) {
            this.f70810b = j0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f70810b.key() + " returned input Bitmap but recycled it.");
        }
    }

    /* compiled from: BitmapHunter.java */
    static class f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j0 f70811b;

        f(j0 j0Var) {
            this.f70811b = j0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            throw new IllegalStateException("Transformation " + this.f70811b.key() + " mutated input Bitmap but failed to recycle the original.");
        }
    }

    c(w wVar, j jVar, com.squareup.picasso.e eVar, f0 f0Var, com.squareup.picasso.a aVar, d0 d0Var) {
        this.f70789c = wVar;
        this.f70790d = jVar;
        this.f70791e = eVar;
        this.f70792f = f0Var;
        this.f70798l = aVar;
        this.f70793g = aVar.d();
        this.f70794h = aVar.i();
        this.f70806t = aVar.h();
        this.f70795i = aVar.e();
        this.f70796j = aVar.f();
        this.f70797k = d0Var;
        this.f70805s = d0Var.e();
    }

    static Bitmap a(List<j0> list, Bitmap bitmap) {
        int size = list.size();
        int i4 = 0;
        while (i4 < size) {
            j0 j0Var = list.get(i4);
            try {
                Bitmap a5 = j0Var.a(bitmap);
                if (a5 == null) {
                    StringBuilder a6 = j4.a("Transformation ");
                    a6.append(j0Var.key());
                    a6.append(" returned null after ");
                    a6.append(i4);
                    a6.append(" previous transformation(s).\n\nTransformation list:\n");
                    Iterator<j0> it = list.iterator();
                    while (it.hasNext()) {
                        a6.append(it.next().key());
                        a6.append('\n');
                    }
                    w.f70969q.post(new d(a6));
                    return null;
                }
                if (a5 == bitmap && bitmap.isRecycled()) {
                    w.f70969q.post(new e(j0Var));
                    return null;
                }
                if (a5 != bitmap && !bitmap.isRecycled()) {
                    w.f70969q.post(new f(j0Var));
                    return null;
                }
                i4++;
                bitmap = a5;
            } catch (RuntimeException e4) {
                w.f70969q.post(new RunnableC0993c(j0Var, e4));
                return null;
            }
        }
        return bitmap;
    }

    private w.f d() {
        w.f fVar = w.f.LOW;
        List<com.squareup.picasso.a> list = this.f70799m;
        boolean z4 = (list == null || list.isEmpty()) ? false : true;
        com.squareup.picasso.a aVar = this.f70798l;
        if (aVar == null && !z4) {
            return fVar;
        }
        if (aVar != null) {
            fVar = aVar.h();
        }
        if (z4) {
            int size = this.f70799m.size();
            for (int i4 = 0; i4 < size; i4++) {
                w.f h4 = this.f70799m.get(i4).h();
                if (h4.ordinal() > fVar.ordinal()) {
                    fVar = h4;
                }
            }
        }
        return fVar;
    }

    static Bitmap e(o0 o0Var, b0 b0Var) throws IOException {
        okio.o d5 = okio.a0.d(o0Var);
        boolean s4 = k0.s(d5);
        boolean z4 = b0Var.f70764r;
        BitmapFactory.Options d6 = d0.d(b0Var);
        boolean g4 = d0.g(d6);
        if (s4) {
            byte[] p22 = d5.p2();
            if (g4) {
                BitmapFactory.decodeByteArray(p22, 0, p22.length, d6);
                d0.b(b0Var.f70754h, b0Var.f70755i, d6, b0Var);
            }
            return BitmapFactory.decodeByteArray(p22, 0, p22.length, d6);
        }
        InputStream J3 = d5.J3();
        if (g4) {
            q qVar = new q(J3);
            qVar.a(false);
            long c5 = qVar.c(1024);
            BitmapFactory.decodeStream(qVar, null, d6);
            d0.b(b0Var.f70754h, b0Var.f70755i, d6, b0Var);
            qVar.b(c5);
            qVar.a(true);
            J3 = qVar;
        }
        Bitmap decodeStream = BitmapFactory.decodeStream(J3, null, d6);
        if (decodeStream != null) {
            return decodeStream;
        }
        throw new IOException("Failed to decode stream.");
    }

    static c g(w wVar, j jVar, com.squareup.picasso.e eVar, f0 f0Var, com.squareup.picasso.a aVar) {
        b0 i4 = aVar.i();
        List<d0> l4 = wVar.l();
        int size = l4.size();
        for (int i5 = 0; i5 < size; i5++) {
            d0 d0Var = l4.get(i5);
            if (d0Var.c(i4)) {
                return new c(wVar, jVar, eVar, f0Var, aVar, d0Var);
            }
        }
        return new c(wVar, jVar, eVar, f0Var, aVar, f70787x);
    }

    static int l(int i4) {
        switch (i4) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    static int m(int i4) {
        return (i4 == 2 || i4 == 7 || i4 == 4 || i4 == 5) ? -1 : 1;
    }

    private static boolean v(boolean z4, int i4, int i5, int i6, int i7) {
        return !z4 || (i6 != 0 && i4 > i6) || (i7 != 0 && i5 > i7);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x024c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static android.graphics.Bitmap y(com.squareup.picasso.b0 r26, android.graphics.Bitmap r27, int r28) {
        /*
            Method dump skipped, instructions count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.y(com.squareup.picasso.b0, android.graphics.Bitmap, int):android.graphics.Bitmap");
    }

    static void z(b0 b0Var) {
        String b5 = b0Var.b();
        StringBuilder sb = f70785v.get();
        sb.ensureCapacity(b5.length() + 8);
        sb.replace(8, sb.length(), b5);
        Thread.currentThread().setName(sb.toString());
    }

    void b(com.squareup.picasso.a aVar) {
        boolean z4 = this.f70789c.f70984n;
        b0 b0Var = aVar.f70719b;
        if (this.f70798l == null) {
            this.f70798l = aVar;
            if (z4) {
                List<com.squareup.picasso.a> list = this.f70799m;
                if (list == null || list.isEmpty()) {
                    k0.u("Hunter", "joined", b0Var.e(), "to empty hunter");
                    return;
                } else {
                    k0.u("Hunter", "joined", b0Var.e(), k0.l(this, "to "));
                    return;
                }
            }
            return;
        }
        if (this.f70799m == null) {
            this.f70799m = new ArrayList(3);
        }
        this.f70799m.add(aVar);
        if (z4) {
            k0.u("Hunter", "joined", b0Var.e(), k0.l(this, "to "));
        }
        w.f h4 = aVar.h();
        if (h4.ordinal() > this.f70806t.ordinal()) {
            this.f70806t = h4;
        }
    }

    boolean c() {
        Future<?> future;
        if (this.f70798l != null) {
            return false;
        }
        List<com.squareup.picasso.a> list = this.f70799m;
        return (list == null || list.isEmpty()) && (future = this.f70801o) != null && future.cancel(false);
    }

    void f(com.squareup.picasso.a aVar) {
        boolean remove;
        if (this.f70798l == aVar) {
            this.f70798l = null;
            remove = true;
        } else {
            List<com.squareup.picasso.a> list = this.f70799m;
            remove = list != null ? list.remove(aVar) : false;
        }
        if (remove && aVar.h() == this.f70806t) {
            this.f70806t = d();
        }
        if (this.f70789c.f70984n) {
            k0.u("Hunter", "removed", aVar.f70719b.e(), k0.l(this, "from "));
        }
    }

    com.squareup.picasso.a h() {
        return this.f70798l;
    }

    List<com.squareup.picasso.a> i() {
        return this.f70799m;
    }

    b0 j() {
        return this.f70794h;
    }

    Exception k() {
        return this.f70803q;
    }

    String n() {
        return this.f70793g;
    }

    w.e o() {
        return this.f70802p;
    }

    int p() {
        return this.f70795i;
    }

    w q() {
        return this.f70789c;
    }

    w.f r() {
        return this.f70806t;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                try {
                    try {
                        z(this.f70794h);
                        if (this.f70789c.f70984n) {
                            k0.t("Hunter", "executing", k0.k(this));
                        }
                        Bitmap t4 = t();
                        this.f70800n = t4;
                        if (t4 == null) {
                            this.f70790d.e(this);
                        } else {
                            this.f70790d.d(this);
                        }
                    } catch (IOException e4) {
                        this.f70803q = e4;
                        this.f70790d.i(this);
                    }
                } catch (u.b e5) {
                    if (!t.isOfflineOnly(e5.f70964c) || e5.f70963b != 504) {
                        this.f70803q = e5;
                    }
                    this.f70790d.e(this);
                }
            } catch (Exception e6) {
                this.f70803q = e6;
                this.f70790d.e(this);
            } catch (OutOfMemoryError e7) {
                StringWriter stringWriter = new StringWriter();
                this.f70792f.a().b(new PrintWriter(stringWriter));
                this.f70803q = new RuntimeException(stringWriter.toString(), e7);
                this.f70790d.e(this);
            }
            Thread.currentThread().setName("Picasso-Idle");
        } catch (Throwable th) {
            Thread.currentThread().setName("Picasso-Idle");
            throw th;
        }
    }

    Bitmap s() {
        return this.f70800n;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00ca A[Catch: all -> 0x00a5, TryCatch #1 {all -> 0x00a5, blocks: (B:43:0x0098, B:45:0x00a0, B:48:0x00c2, B:50:0x00ca, B:52:0x00d8, B:53:0x00e7, B:57:0x00a7, B:59:0x00b5), top: B:42:0x0098 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.graphics.Bitmap t() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.c.t():android.graphics.Bitmap");
    }

    boolean u() {
        Future<?> future = this.f70801o;
        return future != null && future.isCancelled();
    }

    boolean w(boolean z4, NetworkInfo networkInfo) {
        int i4 = this.f70805s;
        if (i4 <= 0) {
            return false;
        }
        this.f70805s = i4 - 1;
        return this.f70797k.h(z4, networkInfo);
    }

    boolean x() {
        return this.f70797k.i();
    }
}
