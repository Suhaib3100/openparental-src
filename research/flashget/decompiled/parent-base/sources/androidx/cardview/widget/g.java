package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.q0;
import l.a;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
class g extends Drawable {

    /* renamed from: q, reason: collision with root package name */
    private static final double f2137q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r, reason: collision with root package name */
    private static final float f2138r = 1.5f;

    /* renamed from: s, reason: collision with root package name */
    static a f2139s;

    /* renamed from: a, reason: collision with root package name */
    private final int f2140a;

    /* renamed from: c, reason: collision with root package name */
    private Paint f2142c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f2143d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f2144e;

    /* renamed from: f, reason: collision with root package name */
    private float f2145f;

    /* renamed from: g, reason: collision with root package name */
    private Path f2146g;

    /* renamed from: h, reason: collision with root package name */
    private float f2147h;

    /* renamed from: i, reason: collision with root package name */
    private float f2148i;

    /* renamed from: j, reason: collision with root package name */
    private float f2149j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f2150k;

    /* renamed from: m, reason: collision with root package name */
    private final int f2152m;

    /* renamed from: n, reason: collision with root package name */
    private final int f2153n;

    /* renamed from: l, reason: collision with root package name */
    private boolean f2151l = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f2154o = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f2155p = false;

    /* renamed from: b, reason: collision with root package name */
    private Paint f2141b = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    interface a {
        void a(Canvas canvas, RectF rectF, float f4, Paint paint);
    }

    g(Resources resources, ColorStateList colorStateList, float f4, float f5, float f6) {
        this.f2152m = resources.getColor(a.b.f81222d);
        this.f2153n = resources.getColor(a.b.f81221c);
        this.f2140a = resources.getDimensionPixelSize(a.c.f81223a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f2142c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f2145f = (int) (f4 + 0.5f);
        this.f2144e = new RectF();
        Paint paint2 = new Paint(this.f2142c);
        this.f2143d = paint2;
        paint2.setAntiAlias(false);
        s(f5, f6);
    }

    private void a(Rect rect) {
        float f4 = this.f2147h;
        float f5 = f2138r * f4;
        this.f2144e.set(rect.left + f4, rect.top + f5, rect.right - f4, rect.bottom - f5);
        b();
    }

    private void b() {
        float f4 = this.f2145f;
        RectF rectF = new RectF(-f4, -f4, f4, f4);
        RectF rectF2 = new RectF(rectF);
        float f5 = this.f2148i;
        rectF2.inset(-f5, -f5);
        Path path = this.f2146g;
        if (path == null) {
            this.f2146g = new Path();
        } else {
            path.reset();
        }
        this.f2146g.setFillType(Path.FillType.EVEN_ODD);
        this.f2146g.moveTo(-this.f2145f, 0.0f);
        this.f2146g.rLineTo(-this.f2148i, 0.0f);
        this.f2146g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f2146g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f2146g.close();
        float f6 = this.f2145f;
        float f7 = f6 / (this.f2148i + f6);
        Paint paint = this.f2142c;
        float f10 = this.f2145f + this.f2148i;
        int i4 = this.f2152m;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f10, new int[]{i4, i4, this.f2153n}, new float[]{0.0f, f7, 1.0f}, tileMode));
        Paint paint2 = this.f2143d;
        float f11 = this.f2145f;
        float f12 = this.f2148i;
        float f13 = (-f11) + f12;
        float f14 = (-f11) - f12;
        int i5 = this.f2152m;
        paint2.setShader(new LinearGradient(0.0f, f13, 0.0f, f14, new int[]{i5, i5, this.f2153n}, new float[]{0.0f, 0.5f, 1.0f}, tileMode));
        this.f2143d.setAntiAlias(false);
    }

    static float c(float f4, float f5, boolean z4) {
        if (!z4) {
            return f4;
        }
        return (float) (((1.0d - f2137q) * f5) + f4);
    }

    static float d(float f4, float f5, boolean z4) {
        if (!z4) {
            return f4 * f2138r;
        }
        return (float) (((1.0d - f2137q) * f5) + (f4 * f2138r));
    }

    private void e(Canvas canvas) {
        float f4 = this.f2145f;
        float f5 = (-f4) - this.f2148i;
        float f6 = (this.f2149j / 2.0f) + f4 + this.f2140a;
        float f7 = f6 * 2.0f;
        boolean z4 = this.f2144e.width() - f7 > 0.0f;
        boolean z5 = this.f2144e.height() - f7 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f2144e;
        canvas.translate(rectF.left + f6, rectF.top + f6);
        canvas.drawPath(this.f2146g, this.f2142c);
        if (z4) {
            canvas.drawRect(0.0f, f5, this.f2144e.width() - f7, -this.f2145f, this.f2143d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f2144e;
        canvas.translate(rectF2.right - f6, rectF2.bottom - f6);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f2146g, this.f2142c);
        if (z4) {
            canvas.drawRect(0.0f, f5, this.f2144e.width() - f7, (-this.f2145f) + this.f2148i, this.f2143d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f2144e;
        canvas.translate(rectF3.left + f6, rectF3.bottom - f6);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f2146g, this.f2142c);
        if (z5) {
            canvas.drawRect(0.0f, f5, this.f2144e.height() - f7, -this.f2145f, this.f2143d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f2144e;
        canvas.translate(rectF4.right - f6, rectF4.top + f6);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f2146g, this.f2142c);
        if (z5) {
            canvas.drawRect(0.0f, f5, this.f2144e.height() - f7, -this.f2145f, this.f2143d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f2150k = colorStateList;
        this.f2141b.setColor(colorStateList.getColorForState(getState(), this.f2150k.getDefaultColor()));
    }

    private void s(float f4, float f5) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f4 + ". Must be >= 0");
        }
        if (f5 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f5 + ". Must be >= 0");
        }
        float t4 = t(f4);
        float t5 = t(f5);
        if (t4 > t5) {
            if (!this.f2155p) {
                this.f2155p = true;
            }
            t4 = t5;
        }
        if (this.f2149j == t4 && this.f2147h == t5) {
            return;
        }
        this.f2149j = t4;
        this.f2147h = t5;
        this.f2148i = (int) ((t4 * f2138r) + this.f2140a + 0.5f);
        this.f2151l = true;
        invalidateSelf();
    }

    private int t(float f4) {
        int i4 = (int) (f4 + 0.5f);
        return i4 % 2 == 1 ? i4 - 1 : i4;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f2151l) {
            a(getBounds());
            this.f2151l = false;
        }
        canvas.translate(0.0f, this.f2149j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f2149j) / 2.0f);
        f2139s.a(canvas, this.f2144e, this.f2145f, this.f2141b);
    }

    ColorStateList f() {
        return this.f2150k;
    }

    float g() {
        return this.f2145f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f2147h, this.f2145f, this.f2154o));
        int ceil2 = (int) Math.ceil(c(this.f2147h, this.f2145f, this.f2154o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    void h(Rect rect) {
        getPadding(rect);
    }

    float i() {
        return this.f2147h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f2150k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    float j() {
        float f4 = this.f2147h;
        return (((this.f2147h * f2138r) + this.f2140a) * 2.0f) + (Math.max(f4, ((f4 * f2138r) / 2.0f) + this.f2145f + this.f2140a) * 2.0f);
    }

    float k() {
        float f4 = this.f2147h;
        return ((this.f2147h + this.f2140a) * 2.0f) + (Math.max(f4, (f4 / 2.0f) + this.f2145f + this.f2140a) * 2.0f);
    }

    float l() {
        return this.f2149j;
    }

    void m(boolean z4) {
        this.f2154o = z4;
        invalidateSelf();
    }

    void o(@q0 ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f2151l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f2150k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f2141b.getColor() == colorForState) {
            return false;
        }
        this.f2141b.setColor(colorForState);
        this.f2151l = true;
        invalidateSelf();
        return true;
    }

    void p(float f4) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f4 + ". Must be >= 0");
        }
        float f5 = (int) (f4 + 0.5f);
        if (this.f2145f == f5) {
            return;
        }
        this.f2145f = f5;
        this.f2151l = true;
        invalidateSelf();
    }

    void q(float f4) {
        s(this.f2149j, f4);
    }

    void r(float f4) {
        s(f4, this.f2147h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f2141b.setAlpha(i4);
        this.f2142c.setAlpha(i4);
        this.f2143d.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2141b.setColorFilter(colorFilter);
    }
}
