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
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: GifDrawable.java */
/* loaded from: classes3.dex */
public class c extends Drawable implements g.b, Animatable, androidx.vectordrawable.graphics.drawable.b {

    /* renamed from: m, reason: collision with root package name */
    public static final int f44603m = -1;

    /* renamed from: n, reason: collision with root package name */
    public static final int f44604n = 0;

    /* renamed from: o, reason: collision with root package name */
    private static final int f44605o = 119;

    /* renamed from: b, reason: collision with root package name */
    private final a f44606b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f44607c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f44608d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44609e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44610f;

    /* renamed from: g, reason: collision with root package name */
    private int f44611g;

    /* renamed from: h, reason: collision with root package name */
    private int f44612h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f44613i;

    /* renamed from: j, reason: collision with root package name */
    private Paint f44614j;

    /* renamed from: k, reason: collision with root package name */
    private Rect f44615k;

    /* renamed from: l, reason: collision with root package name */
    private List<b.a> f44616l;

    /* compiled from: GifDrawable.java */
    static final class a extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @m1
        final g f44617a;

        a(g gVar) {
            this.f44617a = gVar;
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
    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, m<Bitmap> mVar, int i4, int i5, Bitmap bitmap) {
        this(context, aVar, mVar, i4, i5, bitmap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Drawable.Callback c() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        return callback;
    }

    private Rect g() {
        if (this.f44615k == null) {
            this.f44615k = new Rect();
        }
        return this.f44615k;
    }

    private Paint l() {
        if (this.f44614j == null) {
            this.f44614j = new Paint(2);
        }
        return this.f44614j;
    }

    private void o() {
        List<b.a> list = this.f44616l;
        if (list != null) {
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                this.f44616l.get(i4).b(this);
            }
        }
    }

    private void q() {
        this.f44611g = 0;
    }

    private void v() {
        com.bumptech.glide.util.m.b(!this.f44609e, ProtectedSandApp.s("\u0a11"));
        if (this.f44606b.f44617a.f() == 1) {
            invalidateSelf();
        } else {
            if (this.f44607c) {
                return;
            }
            this.f44607c = true;
            this.f44606b.f44617a.v(this);
            invalidateSelf();
        }
    }

    private void w() {
        this.f44607c = false;
        this.f44606b.f44617a.w(this);
    }

    @Override // com.bumptech.glide.load.resource.gif.g.b
    public void a() {
        if (c() == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        if (j() == i() - 1) {
            this.f44611g++;
        }
        int i4 = this.f44612h;
        if (i4 == -1 || this.f44611g < i4) {
            return;
        }
        o();
        stop();
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void b(@o0 b.a aVar) {
        if (aVar == null) {
            return;
        }
        if (this.f44616l == null) {
            this.f44616l = new ArrayList();
        }
        this.f44616l.add(aVar);
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public void d() {
        List<b.a> list = this.f44616l;
        if (list != null) {
            list.clear();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        if (this.f44609e) {
            return;
        }
        if (this.f44613i) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), g());
            this.f44613i = false;
        }
        canvas.drawBitmap(this.f44606b.f44617a.c(), (Rect) null, g(), l());
    }

    @Override // androidx.vectordrawable.graphics.drawable.b
    public boolean e(@o0 b.a aVar) {
        List<b.a> list = this.f44616l;
        if (list == null || aVar == null) {
            return false;
        }
        return list.remove(aVar);
    }

    public ByteBuffer f() {
        return this.f44606b.f44617a.b();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f44606b;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f44606b.f44617a.i();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f44606b.f44617a.m();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public Bitmap h() {
        return this.f44606b.f44617a.e();
    }

    public int i() {
        return this.f44606b.f44617a.f();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.f44607c;
    }

    public int j() {
        return this.f44606b.f44617a.d();
    }

    public m<Bitmap> k() {
        return this.f44606b.f44617a.h();
    }

    public int m() {
        return this.f44606b.f44617a.l();
    }

    boolean n() {
        return this.f44609e;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f44613i = true;
    }

    public void p() {
        this.f44609e = true;
        this.f44606b.f44617a.a();
    }

    public void r(m<Bitmap> mVar, Bitmap bitmap) {
        this.f44606b.f44617a.q(mVar, bitmap);
    }

    void s(boolean z4) {
        this.f44607c = z4;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        l().setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        l().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        com.bumptech.glide.util.m.b(!this.f44609e, ProtectedSandApp.s("\u0a12"));
        this.f44610f = z4;
        if (!z4) {
            w();
        } else if (this.f44608d) {
            v();
        }
        return super.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.f44608d = true;
        this.f44611g = 0;
        if (this.f44610f) {
            v();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.f44608d = false;
        w();
    }

    public void t(int i4) {
        if (i4 <= 0 && i4 != -1 && i4 != 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ਓ"));
        }
        if (i4 != 0) {
            this.f44612h = i4;
        } else {
            int j4 = this.f44606b.f44617a.j();
            this.f44612h = j4 != 0 ? j4 : -1;
        }
    }

    public void u() {
        com.bumptech.glide.util.m.b(!this.f44607c, ProtectedSandApp.s("ਔ"));
        this.f44606b.f44617a.r();
        start();
    }

    public c(Context context, com.bumptech.glide.gifdecoder.a aVar, m<Bitmap> mVar, int i4, int i5, Bitmap bitmap) {
        this(new a(new g(com.bumptech.glide.c.e(context), aVar, i4, i5, mVar, bitmap)));
    }

    c(a aVar) {
        this.f44610f = true;
        this.f44612h = -1;
        this.f44606b = (a) com.bumptech.glide.util.m.f(aVar, ProtectedSandApp.s("ਐ"));
    }

    @m1
    c(g gVar, Paint paint) {
        this(new a(gVar));
        this.f44614j = paint;
    }
}
