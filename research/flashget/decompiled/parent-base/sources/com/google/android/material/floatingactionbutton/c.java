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
import androidx.core.graphics.z;
import com.google.android.material.shape.o;
import com.google.android.material.shape.p;

/* compiled from: BorderDrawable.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
class c extends Drawable {

    /* renamed from: q, reason: collision with root package name */
    private static final float f53286q = 1.3333f;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final Paint f53288b;

    /* renamed from: h, reason: collision with root package name */
    @r
    float f53294h;

    /* renamed from: i, reason: collision with root package name */
    @l
    private int f53295i;

    /* renamed from: j, reason: collision with root package name */
    @l
    private int f53296j;

    /* renamed from: k, reason: collision with root package name */
    @l
    private int f53297k;

    /* renamed from: l, reason: collision with root package name */
    @l
    private int f53298l;

    /* renamed from: m, reason: collision with root package name */
    @l
    private int f53299m;

    /* renamed from: o, reason: collision with root package name */
    private o f53301o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private ColorStateList f53302p;

    /* renamed from: a, reason: collision with root package name */
    private final p f53287a = p.k();

    /* renamed from: c, reason: collision with root package name */
    private final Path f53289c = new Path();

    /* renamed from: d, reason: collision with root package name */
    private final Rect f53290d = new Rect();

    /* renamed from: e, reason: collision with root package name */
    private final RectF f53291e = new RectF();

    /* renamed from: f, reason: collision with root package name */
    private final RectF f53292f = new RectF();

    /* renamed from: g, reason: collision with root package name */
    private final b f53293g = new b();

    /* renamed from: n, reason: collision with root package name */
    private boolean f53300n = true;

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
        this.f53301o = oVar;
        Paint paint = new Paint(1);
        this.f53288b = paint;
        paint.setStyle(Paint.Style.STROKE);
    }

    @o0
    private Shader a() {
        copyBounds(this.f53290d);
        float height = this.f53294h / r1.height();
        return new LinearGradient(0.0f, r1.top, 0.0f, r1.bottom, new int[]{z.v(this.f53295i, this.f53299m), z.v(this.f53296j, this.f53299m), z.v(z.D(this.f53296j, 0), this.f53299m), z.v(z.D(this.f53298l, 0), this.f53299m), z.v(this.f53298l, this.f53299m), z.v(this.f53297k, this.f53299m)}, new float[]{0.0f, height, 0.5f, 0.5f, 1.0f - height, 1.0f}, Shader.TileMode.CLAMP);
    }

    @o0
    protected RectF b() {
        this.f53292f.set(getBounds());
        return this.f53292f;
    }

    public o c() {
        return this.f53301o;
    }

    void d(@q0 ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f53299m = colorStateList.getColorForState(getState(), this.f53299m);
        }
        this.f53302p = colorStateList;
        this.f53300n = true;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        if (this.f53300n) {
            this.f53288b.setShader(a());
            this.f53300n = false;
        }
        float strokeWidth = this.f53288b.getStrokeWidth() / 2.0f;
        copyBounds(this.f53290d);
        this.f53291e.set(this.f53290d);
        float min = Math.min(this.f53301o.r().a(b()), this.f53291e.width() / 2.0f);
        if (this.f53301o.u(b())) {
            this.f53291e.inset(strokeWidth, strokeWidth);
            canvas.drawRoundRect(this.f53291e, min, min, this.f53288b);
        }
    }

    public void e(@r float f4) {
        if (this.f53294h != f4) {
            this.f53294h = f4;
            this.f53288b.setStrokeWidth(f4 * f53286q);
            this.f53300n = true;
            invalidateSelf();
        }
    }

    void f(@l int i4, @l int i5, @l int i6, @l int i7) {
        this.f53295i = i4;
        this.f53296j = i5;
        this.f53297k = i6;
        this.f53298l = i7;
    }

    public void g(o oVar) {
        this.f53301o = oVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        return this.f53293g;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f53294h > 0.0f ? -3 : -2;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@o0 Outline outline) {
        if (this.f53301o.u(b())) {
            outline.setRoundRect(getBounds(), this.f53301o.r().a(b()));
            return;
        }
        copyBounds(this.f53290d);
        this.f53291e.set(this.f53290d);
        this.f53287a.d(this.f53301o, 1.0f, this.f53291e, this.f53289c);
        if (this.f53289c.isConvex()) {
            outline.setConvexPath(this.f53289c);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        if (!this.f53301o.u(b())) {
            return true;
        }
        int round = Math.round(this.f53294h);
        rect.set(round, round, round, round);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f53302p;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        this.f53300n = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int colorForState;
        ColorStateList colorStateList = this.f53302p;
        if (colorStateList != null && (colorForState = colorStateList.getColorForState(iArr, this.f53299m)) != this.f53299m) {
            this.f53300n = true;
            this.f53299m = colorForState;
        }
        if (this.f53300n) {
            invalidateSelf();
        }
        return this.f53300n;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@g0(from = 0, to = 255) int i4) {
        this.f53288b.setAlpha(i4);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@q0 ColorFilter colorFilter) {
        this.f53288b.setColorFilter(colorFilter);
        invalidateSelf();
    }
}
