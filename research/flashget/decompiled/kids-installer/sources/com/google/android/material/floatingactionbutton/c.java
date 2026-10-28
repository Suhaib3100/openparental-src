package com.google.android.material.floatingactionbutton;

import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.c1;
import androidx.annotation.g0;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.core.graphics.r1;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;

/* compiled from: BorderDrawable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
class c extends Drawable {

    /* renamed from: q, reason: collision with root package name */
    private static final float f13505q = 1.3333f;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Paint f13507b;

    /* renamed from: h, reason: collision with root package name */
    @r
    float f13513h;

    /* renamed from: i, reason: collision with root package name */
    @l
    private int f13514i;

    /* renamed from: j, reason: collision with root package name */
    @l
    private int f13515j;

    /* renamed from: k, reason: collision with root package name */
    @l
    private int f13516k;

    /* renamed from: l, reason: collision with root package name */
    @l
    private int f13517l;

    /* renamed from: m, reason: collision with root package name */
    @l
    private int f13518m;

    /* renamed from: o, reason: collision with root package name */
    private o f13520o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private ColorStateList f13521p;

    /* renamed from: a, reason: collision with root package name */
    private final p f13506a = p.k();

    /* renamed from: c, reason: collision with root package name */
    private final Path f13508c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f13509d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final RectF f13510e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private final RectF f13511f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final b f13512g = new b();

    /* renamed from: n, reason: collision with root package name */
    private boolean f13519n = true;

    /* compiled from: BorderDrawable.java */
    private class b extends Drawable.ConstantState {
        private b() {
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @o0
        public Drawable newDrawable() {
            return c.this;
        }
    }

    c(o oVar) {
        this.f13520o = oVar;
        Paint paint = new Paint(1);
        this.f13507b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @o0
    private Shader a() {
        copyBounds(this.f13509d);
        float height = this.f13513h / r0.height();
        return new LinearGradient(0.0f, r0.top, 0.0f, r0.bottom, new int[]{r1.t(this.f13514i, this.f13518m), r1.t(this.f13515j, this.f13518m), r1.t(r1.B(this.f13515j, 0), this.f13518m), r1.t(r1.B(this.f13517l, 0), this.f13518m), r1.t(this.f13517l, this.f13518m), r1.t(this.f13516k, this.f13518m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @o0
    protected RectF b() {
        this.f13511f.set(getBounds());
        return this.f13511f;
    }

    public o c() {
        return this.f13520o;
    }

    void d(@q0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f13518m = colorStateList.getColorForState(getState(), this.f13518m);
        }
        this.f13521p = colorStateList;
        this.f13519n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        if (this.f13519n) {
            this.f13507b.setShader(a());
            this.f13519n = false;
        }
        float strokeWidth = this.f13507b.getStrokeWidth() / 2.0f;
        copyBounds(this.f13509d);
        this.f13510e.set(this.f13509d);
        float min = Math.min(this.f13520o.r().a(b()), this.f13510e.width() / 2.0f);
        if (this.f13520o.u(b())) {
            this.f13510e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f13510e, min, min, this.f13507b);
        }
    }

    public void e(@r float f6) {
        if (this.f13513h != f6) {
            this.f13513h = f6;
            this.f13507b.setStrokeWidth(f6 * f13505q);
            this.f13519n = true;
            invalidateSelf();
        }
    }

    void f(@l int i5, @l int i6, @l int i7, @l int i8) {
        this.f13514i = i5;
        this.f13515j = i6;
        this.f13516k = i7;
        this.f13517l = i8;
    }

    public void g(o oVar) {
        this.f13520o = oVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        return this.f13512g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f13513h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@o0 Outline outline) {
        if (this.f13520o.u(b())) {
            outline.setRoundRect(getBounds(), this.f13520o.r().a(b()));
            return;
        }
        copyBounds(this.f13509d);
        this.f13510e.set(this.f13509d);
        this.f13506a.d(this.f13520o, 1.0f, this.f13510e, this.f13508c);
        if (this.f13508c.isConvex()) {
            outline.setConvexPath(this.f13508c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        if (!this.f13520o.u(b())) {
            return true;
        }
        int round = Math.round(this.f13513h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f13521p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f13519n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f13521p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f13518m)) != this.f13518m) {
            this.f13519n = true;
            this.f13518m = colorForState;
        }
        if (this.f13519n) {
            invalidateSelf();
        }
        return this.f13519n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = 255) int i5) {
        this.f13507b.setAlpha(i5);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.f13507b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
