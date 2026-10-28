package com.bumptech.glide.load.resource.gif;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.vectordrawable.graphics.drawable.b;
import com.bumptech.glide.load.m;
import com.bumptech.glide.load.resource.gif.g;
import com.bumptech.glide.util.l;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifDrawable.java */
/* loaded from: classes3.dex */
public class c extends Drawable implements g.b, Animatable, androidx.vectordrawable.graphics.drawable.b {
    public static final int A = 0;
    private static final int B = 119;

    /* renamed from: z, reason: collision with root package name */
    public static final int f11825z = -1;

    /* renamed from: o, reason: collision with root package name */
    private final a f11826o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f11827p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f11828q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f11829r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f11830s;

    /* renamed from: t, reason: collision with root package name */
    private int f11831t;

    /* renamed from: u, reason: collision with root package name */
    private int f11832u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f11833v;

    /* renamed from: w, reason: collision with root package name */
    private Paint f11834w;

    /* renamed from: x, reason: collision with root package name */
    private Rect f11835x;

    /* renamed from: y, reason: collision with root package name */
    private List<b.a> f11836y;

    /* compiled from: GifDrawable.java */
    /* loaded from: classes.dex */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @m1
        final g f11837a;

        a(g gVar) {
            this.f11837a = gVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return new c(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable(Resources resources) {
            return new c(this);
        }
    }

    @Deprecated
    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, m<Bitmap> mVar, int i5, int i6, Bitmap bitmap) {
        this(context, aVar, mVar, i5, i6, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback d() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect f() {
        if (this.f11835x == null) {
            this.f11835x = new Rect();
        }
        return this.f11835x;
    }

    private Paint k() {
        if (this.f11834w == null) {
            this.f11834w = new Paint(2);
        }
        return this.f11834w;
    }

    private void n() {
        List<b.a> list = this.f11836y;
        if (list != null) {
            int size = list.size();
            for (int i5 = 0; i5 < size; i5++) {
                this.f11836y.get(i5).b(this);
            }
        }
    }

    private void p() {
        this.f11831t = 0;
    }

    private void u() {
        l.a(!this.f11829r, ProtectedSandApp.s("ᵿ"));
        if (this.f11826o.f11837a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f11827p) {
                return;
            }
            this.f11827p = true;
            this.f11826o.f11837a.v(this);
            invalidateSelf();
        }
    }

    private void v() {
        this.f11827p = false;
        this.f11826o.f11837a.w(this);
    }

    @Override // com.bumptech.glide.load.resource.gif.g.b
    public void a() {
        if (d() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (i() == h() - 1) {
            this.f11831t++;
        }
        int i5 = this.f11832u;
        if (i5 == -1 || this.f11831t < i5) {
            return;
        }
        n();
        stop();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void b(@o0 b.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f11836y == null) {
            this.f11836y = new ArrayList();
        }
        this.f11836y.add(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean c(@o0 b.a aVar) {
        List<b.a> list = this.f11836y;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void clearAnimationCallbacks() {
        List<b.a> list = this.f11836y;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        if (this.f11829r) {
            return;
        }
        if (this.f11833v) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
            this.f11833v = false;
        }
        canvas.drawBitmap(this.f11826o.f11837a.c(), (Rect) null, f(), k());
    }

    public ByteBuffer e() {
        return this.f11826o.f11837a.b();
    }

    public Bitmap g() {
        return this.f11826o.f11837a.e();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f11826o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f11826o.f11837a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f11826o.f11837a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public int h() {
        return this.f11826o.f11837a.f();
    }

    public int i() {
        return this.f11826o.f11837a.d();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f11827p;
    }

    public m<Bitmap> j() {
        return this.f11826o.f11837a.h();
    }

    public int l() {
        return this.f11826o.f11837a.l();
    }

    boolean m() {
        return this.f11829r;
    }

    public void o() {
        this.f11829r = true;
        this.f11826o.f11837a.a();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f11833v = true;
    }

    public void q(m<Bitmap> mVar, Bitmap bitmap) {
        this.f11826o.f11837a.q(mVar, bitmap);
    }

    void r(boolean z5) {
        this.f11827p = z5;
    }

    public void s(int i5) {
        if (i5 <= 0 && i5 != -1 && i5 != 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᶀ"));
        }
        if (i5 != 0) {
            this.f11832u = i5;
        } else {
            int j5 = this.f11826o.f11837a.j();
            this.f11832u = j5 != 0 ? j5 : -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        k().setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        k().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        l.a(!this.f11829r, ProtectedSandApp.s("ᶁ"));
        this.f11830s = z5;
        if (!z5) {
            v();
        } else if (this.f11828q) {
            u();
        }
        return super.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f11828q = true;
        this.f11831t = 0;
        if (this.f11830s) {
            u();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f11828q = false;
        v();
    }

    public void t() {
        l.a(!this.f11827p, ProtectedSandApp.s("ᶂ"));
        this.f11826o.f11837a.r();
        start();
    }

    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, m<Bitmap> mVar, int i5, int i6, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.b.e(context), aVar, i5, i6, mVar, bitmap)));
    }

    c(a aVar) {
        this.f11830s = true;
        this.f11832u = -1;
        this.f11826o = (a) l.d(aVar);
    }

    @m1
    c(g gVar, Paint paint) {
        this(new a(gVar));
        this.f11834w = paint;
    }
}
