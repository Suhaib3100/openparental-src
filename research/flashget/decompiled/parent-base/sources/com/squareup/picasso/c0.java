package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.squareup.picasso.a0;
import com.squareup.picasso.b0;
import com.squareup.picasso.w;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestCreator.java */
/* loaded from: classes6.dex */
public class c0 {

    /* renamed from: m, reason: collision with root package name */
    private static final AtomicInteger f70812m = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    private final w f70813a;

    /* renamed from: b, reason: collision with root package name */
    private final b0.b f70814b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f70815c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f70816d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70817e;

    /* renamed from: f, reason: collision with root package name */
    private int f70818f;

    /* renamed from: g, reason: collision with root package name */
    private int f70819g;

    /* renamed from: h, reason: collision with root package name */
    private int f70820h;

    /* renamed from: i, reason: collision with root package name */
    private int f70821i;

    /* renamed from: j, reason: collision with root package name */
    private Drawable f70822j;

    /* renamed from: k, reason: collision with root package name */
    private Drawable f70823k;

    /* renamed from: l, reason: collision with root package name */
    private Object f70824l;

    c0(w wVar, Uri uri, int i4) {
        this.f70817e = true;
        if (wVar.f70985o) {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        }
        this.f70813a = wVar;
        this.f70814b = new b0.b(uri, i4, wVar.f70982l);
    }

    private void B(a0 a0Var) {
        Bitmap w4;
        if (s.shouldReadFromMemoryCache(this.f70820h) && (w4 = this.f70813a.w(a0Var.d())) != null) {
            a0Var.b(w4, w.e.MEMORY);
            return;
        }
        int i4 = this.f70818f;
        if (i4 != 0) {
            a0Var.o(i4);
        }
        this.f70813a.j(a0Var);
    }

    private b0 f(long j4) {
        int andIncrement = f70812m.getAndIncrement();
        b0 a5 = this.f70814b.a();
        a5.f70747a = andIncrement;
        a5.f70748b = j4;
        boolean z4 = this.f70813a.f70984n;
        if (z4) {
            k0.u("Main", "created", a5.h(), a5.toString());
        }
        b0 E = this.f70813a.E(a5);
        if (E != a5) {
            E.f70747a = andIncrement;
            E.f70748b = j4;
            if (z4) {
                k0.u("Main", "changed", E.e(), "into " + E);
            }
        }
        return E;
    }

    private Drawable m() {
        int i4 = this.f70818f;
        return i4 != 0 ? this.f70813a.f70975e.getDrawable(i4) : this.f70822j;
    }

    public c0 A() {
        this.f70814b.n();
        return this;
    }

    public c0 C(@androidx.annotation.v int i4) {
        if (!this.f70817e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i4 == 0) {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (this.f70822j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f70818f = i4;
        return this;
    }

    public c0 D(@o0 Drawable drawable) {
        if (!this.f70817e) {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (this.f70818f != 0) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f70822j = drawable;
        return this;
    }

    public c0 E(@o0 w.f fVar) {
        this.f70814b.o(fVar);
        return this;
    }

    public c0 F() {
        this.f70814b.p();
        return this;
    }

    public c0 G(int i4, int i5) {
        this.f70814b.q(i4, i5);
        return this;
    }

    public c0 H(int i4, int i5) {
        Resources resources = this.f70813a.f70975e.getResources();
        return G(resources.getDimensionPixelSize(i4), resources.getDimensionPixelSize(i5));
    }

    public c0 I(float f4) {
        this.f70814b.r(f4);
        return this;
    }

    public c0 J(float f4, float f5, float f6) {
        this.f70814b.s(f4, f5, f6);
        return this;
    }

    public c0 K(@o0 String str) {
        this.f70814b.v(str);
        return this;
    }

    public c0 L(@o0 Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("Tag invalid.");
        }
        if (this.f70824l != null) {
            throw new IllegalStateException("Tag already set.");
        }
        this.f70824l = obj;
        return this;
    }

    public c0 M(@o0 j0 j0Var) {
        this.f70814b.w(j0Var);
        return this;
    }

    public c0 N(@o0 List<? extends j0> list) {
        this.f70814b.x(list);
        return this;
    }

    c0 O() {
        this.f70816d = false;
        return this;
    }

    public c0 a() {
        this.f70814b.c(17);
        return this;
    }

    public c0 b(int i4) {
        this.f70814b.c(i4);
        return this;
    }

    public c0 c() {
        this.f70814b.d();
        return this;
    }

    c0 d() {
        this.f70824l = null;
        return this;
    }

    public c0 e(@o0 Bitmap.Config config) {
        this.f70814b.j(config);
        return this;
    }

    public c0 g(@androidx.annotation.v int i4) {
        if (i4 == 0) {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (this.f70823k != null) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f70819g = i4;
        return this;
    }

    public c0 h(@o0 Drawable drawable) {
        if (drawable == null) {
            throw new IllegalArgumentException("Error image may not be null.");
        }
        if (this.f70819g != 0) {
            throw new IllegalStateException("Error image already set.");
        }
        this.f70823k = drawable;
        return this;
    }

    public void i() {
        j(null);
    }

    public void j(@q0 f fVar) {
        long nanoTime = System.nanoTime();
        if (this.f70816d) {
            throw new IllegalStateException("Fit cannot be used with fetch.");
        }
        if (this.f70814b.k()) {
            if (!this.f70814b.l()) {
                this.f70814b.o(w.f.LOW);
            }
            b0 f4 = f(nanoTime);
            String h4 = k0.h(f4, new StringBuilder());
            if (!s.shouldReadFromMemoryCache(this.f70820h) || this.f70813a.w(h4) == null) {
                this.f70813a.D(new l(this.f70813a, f4, this.f70820h, this.f70821i, this.f70824l, h4, fVar));
                return;
            }
            if (this.f70813a.f70984n) {
                k0.u("Main", "completed", f4.h(), "from " + w.e.MEMORY);
            }
            if (fVar != null) {
                fVar.onSuccess();
            }
        }
    }

    public c0 k() {
        this.f70816d = true;
        return this;
    }

    public Bitmap l() throws IOException {
        long nanoTime = System.nanoTime();
        k0.d();
        if (this.f70816d) {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!this.f70814b.k()) {
            return null;
        }
        b0 f4 = f(nanoTime);
        n nVar = new n(this.f70813a, f4, this.f70820h, this.f70821i, this.f70824l, k0.h(f4, new StringBuilder()));
        w wVar = this.f70813a;
        return c.g(wVar, wVar.f70976f, wVar.f70977g, wVar.f70978h, nVar).t();
    }

    Object n() {
        return this.f70824l;
    }

    public void o(ImageView imageView) {
        p(imageView, null);
    }

    public void p(ImageView imageView, f fVar) {
        Bitmap w4;
        long nanoTime = System.nanoTime();
        k0.c();
        if (imageView == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (!this.f70814b.k()) {
            this.f70813a.c(imageView);
            if (this.f70817e) {
                x.d(imageView, m());
                return;
            }
            return;
        }
        if (this.f70816d) {
            if (this.f70814b.m()) {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int width = imageView.getWidth();
            int height = imageView.getHeight();
            if (width == 0 || height == 0) {
                if (this.f70817e) {
                    x.d(imageView, m());
                }
                this.f70813a.h(imageView, new i(this, imageView, fVar));
                return;
            }
            this.f70814b.q(width, height);
        }
        b0 f4 = f(nanoTime);
        String g4 = k0.g(f4);
        if (!s.shouldReadFromMemoryCache(this.f70820h) || (w4 = this.f70813a.w(g4)) == null) {
            if (this.f70817e) {
                x.d(imageView, m());
            }
            this.f70813a.j(new o(this.f70813a, imageView, f4, this.f70820h, this.f70821i, this.f70819g, this.f70823k, g4, this.f70824l, fVar, this.f70815c));
            return;
        }
        this.f70813a.c(imageView);
        w wVar = this.f70813a;
        Context context = wVar.f70975e;
        w.e eVar = w.e.MEMORY;
        x.c(imageView, context, w4, eVar, this.f70815c, wVar.f70983m);
        if (this.f70813a.f70984n) {
            k0.u("Main", "completed", f4.h(), "from " + eVar);
        }
        if (fVar != null) {
            fVar.onSuccess();
        }
    }

    public void q(@o0 RemoteViews remoteViews, @androidx.annotation.d0 int i4, int i5, @o0 Notification notification) {
        r(remoteViews, i4, i5, notification, null);
    }

    public void r(@o0 RemoteViews remoteViews, @androidx.annotation.d0 int i4, int i5, @o0 Notification notification, @q0 String str) {
        s(remoteViews, i4, i5, notification, str, null);
    }

    public void s(@o0 RemoteViews remoteViews, @androidx.annotation.d0 int i4, int i5, @o0 Notification notification, @q0 String str, f fVar) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification == null) {
            throw new IllegalArgumentException("Notification must not be null.");
        }
        if (this.f70816d) {
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        if (this.f70822j != null || this.f70818f != 0 || this.f70823k != null) {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
        b0 f4 = f(nanoTime);
        B(new a0.b(this.f70813a, f4, remoteViews, i4, i5, notification, str, this.f70820h, this.f70821i, k0.h(f4, new StringBuilder()), this.f70824l, this.f70819g, fVar));
    }

    public void t(@o0 RemoteViews remoteViews, @androidx.annotation.d0 int i4, @o0 int[] iArr) {
        u(remoteViews, i4, iArr, null);
    }

    public void u(@o0 RemoteViews remoteViews, @androidx.annotation.d0 int i4, @o0 int[] iArr, f fVar) {
        long nanoTime = System.nanoTime();
        if (remoteViews == null) {
            throw new IllegalArgumentException("remoteViews must not be null.");
        }
        if (iArr == null) {
            throw new IllegalArgumentException("appWidgetIds must not be null.");
        }
        if (this.f70816d) {
            throw new IllegalStateException("Fit cannot be used with remote views.");
        }
        if (this.f70822j != null || this.f70818f != 0 || this.f70823k != null) {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        }
        b0 f4 = f(nanoTime);
        B(new a0.a(this.f70813a, f4, remoteViews, i4, iArr, this.f70820h, this.f70821i, k0.h(f4, new StringBuilder()), this.f70824l, this.f70819g, fVar));
    }

    public void v(@o0 h0 h0Var) {
        Bitmap w4;
        long nanoTime = System.nanoTime();
        k0.c();
        if (h0Var == null) {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (this.f70816d) {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!this.f70814b.k()) {
            this.f70813a.e(h0Var);
            h0Var.c(this.f70817e ? m() : null);
            return;
        }
        b0 f4 = f(nanoTime);
        String g4 = k0.g(f4);
        if (!s.shouldReadFromMemoryCache(this.f70820h) || (w4 = this.f70813a.w(g4)) == null) {
            h0Var.c(this.f70817e ? m() : null);
            this.f70813a.j(new i0(this.f70813a, h0Var, f4, this.f70820h, this.f70821i, this.f70819g, this.f70823k, g4, this.f70824l, false));
        } else {
            this.f70813a.e(h0Var);
            h0Var.a(w4, w.e.MEMORY);
        }
    }

    public c0 w(@o0 s sVar, @o0 s... sVarArr) {
        if (sVar == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        this.f70820h = sVar.index | this.f70820h;
        if (sVarArr == null) {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (sVarArr.length > 0) {
            for (s sVar2 : sVarArr) {
                if (sVar2 == null) {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                this.f70820h = sVar2.index | this.f70820h;
            }
        }
        return this;
    }

    public c0 x(@o0 t tVar, @o0 t... tVarArr) {
        if (tVar == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        this.f70821i = tVar.index | this.f70821i;
        if (tVarArr == null) {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        if (tVarArr.length > 0) {
            for (t tVar2 : tVarArr) {
                if (tVar2 == null) {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
                this.f70821i = tVar2.index | this.f70821i;
            }
        }
        return this;
    }

    public c0 y() {
        this.f70815c = true;
        return this;
    }

    public c0 z() {
        if (this.f70818f != 0) {
            throw new IllegalStateException("Placeholder resource already set.");
        }
        if (this.f70822j != null) {
            throw new IllegalStateException("Placeholder image already set.");
        }
        this.f70817e = false;
        return this;
    }

    @m1
    c0() {
        this.f70817e = true;
        this.f70813a = null;
        this.f70814b = new b0.b(null, 0, null);
    }
}
