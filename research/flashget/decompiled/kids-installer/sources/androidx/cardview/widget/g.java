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
import i.a;

/* compiled from: RoundRectDrawableWithShadow.java */
/* loaded from: classes.dex */
class g extends Drawable {

    /* renamed from: q, reason: collision with root package name */
    private static final double f1463q = Math.cos(Math.toRadians(45.0d));

    /* renamed from: r, reason: collision with root package name */
    private static final float f1464r = 1.5f;

    /* renamed from: s, reason: collision with root package name */
    static a f1465s;

    /* renamed from: a, reason: collision with root package name */
    private final int f1466a;

    /* renamed from: c, reason: collision with root package name */
    private Paint f1468c;

    /* renamed from: d, reason: collision with root package name */
    private Paint f1469d;

    /* renamed from: e, reason: collision with root package name */
    private final RectF f1470e;

    /* renamed from: f, reason: collision with root package name */
    private float f1471f;

    /* renamed from: g, reason: collision with root package name */
    private Path f1472g;

    /* renamed from: h, reason: collision with root package name */
    private float f1473h;

    /* renamed from: i, reason: collision with root package name */
    private float f1474i;

    /* renamed from: j, reason: collision with root package name */
    private float f1475j;

    /* renamed from: k, reason: collision with root package name */
    private ColorStateList f1476k;

    /* renamed from: m, reason: collision with root package name */
    private final int f1478m;

    /* renamed from: n, reason: collision with root package name */
    private final int f1479n;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1477l = true;

    /* renamed from: o, reason: collision with root package name */
    private boolean f1480o = true;

    /* renamed from: p, reason: collision with root package name */
    private boolean f1481p = false;

    /* renamed from: b, reason: collision with root package name */
    private Paint f1467b = new Paint(5);

    /* compiled from: RoundRectDrawableWithShadow.java */
    interface a {
        void a(Canvas canvas, RectF rectF, float f6, Paint paint);
    }

    g(Resources resources, ColorStateList colorStateList, float f6, float f7, float f8) {
        this.f1478m = resources.getColor(a.b.f22741d);
        this.f1479n = resources.getColor(a.b.f22740c);
        this.f1466a = resources.getDimensionPixelSize(a.c.f22742a);
        n(colorStateList);
        Paint paint = new Paint(5);
        this.f1468c = paint;
        paint.setStyle(Paint.Style.FILL);
        this.f1471f = (int) (f6 + 0.5f);
        this.f1470e = new RectF();
        Paint paint2 = new Paint(this.f1468c);
        this.f1469d = paint2;
        paint2.setAntiAlias(false);
        s(f7, f8);
    }

    private void a(Rect rect) {
        float f6 = this.f1473h;
        float f7 = f1464r * f6;
        this.f1470e.set(rect.left + f6, rect.top + f7, rect.right - f6, rect.bottom - f7);
        b();
    }

    private void b() {
        float f6 = this.f1471f;
        RectF rectF = new RectF(-f6, -f6, f6, f6);
        RectF rectF2 = new RectF(rectF);
        float f7 = this.f1474i;
        rectF2.inset(-f7, -f7);
        Path path = this.f1472g;
        if (path == null) {
            this.f1472g = new Path();
        } else {
            path.reset();
        }
        this.f1472g.setFillType(Path.FillType.EVEN_ODD);
        this.f1472g.moveTo(-this.f1471f, 0.0f);
        this.f1472g.rLineTo(-this.f1474i, 0.0f);
        this.f1472g.arcTo(rectF2, 180.0f, 90.0f, false);
        this.f1472g.arcTo(rectF, 270.0f, -90.0f, false);
        this.f1472g.close();
        float f8 = this.f1471f;
        float f9 = f8 / (this.f1474i + f8);
        Paint paint = this.f1468c;
        float f10 = this.f1471f + this.f1474i;
        int i5 = this.f1478m;
        paint.setShader(new RadialGradient(0.0f, 0.0f, f10, new int[]{i5, i5, this.f1479n}, new float[]{0.0f, f9, 1.0f}, Shader.TileMode.CLAMP));
        Paint paint2 = this.f1469d;
        float f11 = this.f1471f;
        float f12 = this.f1474i;
        int i6 = this.f1478m;
        paint2.setShader(new LinearGradient(0.0f, (-f11) + f12, 0.0f, (-f11) - f12, new int[]{i6, i6, this.f1479n}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP));
        this.f1469d.setAntiAlias(false);
    }

    static float c(float f6, float f7, boolean z5) {
        if (!z5) {
            return f6;
        }
        return (float) (((1.0d - f1463q) * f7) + f6);
    }

    static float d(float f6, float f7, boolean z5) {
        if (!z5) {
            return f6 * f1464r;
        }
        return (float) (((1.0d - f1463q) * f7) + (f6 * f1464r));
    }

    private void e(Canvas canvas) {
        float f6 = this.f1471f;
        float f7 = (-f6) - this.f1474i;
        float f8 = (this.f1475j / 2.0f) + f6 + this.f1466a;
        float f9 = f8 * 2.0f;
        boolean z5 = this.f1470e.width() - f9 > 0.0f;
        boolean z6 = this.f1470e.height() - f9 > 0.0f;
        int save = canvas.save();
        RectF rectF = this.f1470e;
        canvas.translate(rectF.left + f8, rectF.top + f8);
        canvas.drawPath(this.f1472g, this.f1468c);
        if (z5) {
            canvas.drawRect(0.0f, f7, this.f1470e.width() - f9, -this.f1471f, this.f1469d);
        }
        canvas.restoreToCount(save);
        int save2 = canvas.save();
        RectF rectF2 = this.f1470e;
        canvas.translate(rectF2.right - f8, rectF2.bottom - f8);
        canvas.rotate(180.0f);
        canvas.drawPath(this.f1472g, this.f1468c);
        if (z5) {
            canvas.drawRect(0.0f, f7, this.f1470e.width() - f9, (-this.f1471f) + this.f1474i, this.f1469d);
        }
        canvas.restoreToCount(save2);
        int save3 = canvas.save();
        RectF rectF3 = this.f1470e;
        canvas.translate(rectF3.left + f8, rectF3.bottom - f8);
        canvas.rotate(270.0f);
        canvas.drawPath(this.f1472g, this.f1468c);
        if (z6) {
            canvas.drawRect(0.0f, f7, this.f1470e.height() - f9, -this.f1471f, this.f1469d);
        }
        canvas.restoreToCount(save3);
        int save4 = canvas.save();
        RectF rectF4 = this.f1470e;
        canvas.translate(rectF4.right - f8, rectF4.top + f8);
        canvas.rotate(90.0f);
        canvas.drawPath(this.f1472g, this.f1468c);
        if (z6) {
            canvas.drawRect(0.0f, f7, this.f1470e.height() - f9, -this.f1471f, this.f1469d);
        }
        canvas.restoreToCount(save4);
    }

    private void n(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1476k = colorStateList;
        this.f1467b.setColor(colorStateList.getColorForState(getState(), this.f1476k.getDefaultColor()));
    }

    private void s(float f6, float f7) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Invalid shadow size " + f6 + ". Must be >= 0");
        }
        if (f7 < 0.0f) {
            throw new IllegalArgumentException("Invalid max shadow size " + f7 + ". Must be >= 0");
        }
        float t5 = t(f6);
        float t6 = t(f7);
        if (t5 > t6) {
            if (!this.f1481p) {
                this.f1481p = true;
            }
            t5 = t6;
        }
        if (this.f1475j == t5 && this.f1473h == t6) {
            return;
        }
        this.f1475j = t5;
        this.f1473h = t6;
        this.f1474i = (int) ((t5 * f1464r) + this.f1466a + 0.5f);
        this.f1477l = true;
        invalidateSelf();
    }

    private int t(float f6) {
        int i5 = (int) (f6 + 0.5f);
        return i5 % 2 == 1 ? i5 - 1 : i5;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (this.f1477l) {
            a(getBounds());
            this.f1477l = false;
        }
        canvas.translate(0.0f, this.f1475j / 2.0f);
        e(canvas);
        canvas.translate(0.0f, (-this.f1475j) / 2.0f);
        f1465s.a(canvas, this.f1470e, this.f1471f, this.f1467b);
    }

    ColorStateList f() {
        return this.f1476k;
    }

    float g() {
        return this.f1471f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        int ceil = (int) Math.ceil(d(this.f1473h, this.f1471f, this.f1480o));
        int ceil2 = (int) Math.ceil(c(this.f1473h, this.f1471f, this.f1480o));
        rect.set(ceil2, ceil, ceil2, ceil);
        return true;
    }

    void h(Rect rect) {
        getPadding(rect);
    }

    float i() {
        return this.f1473h;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList = this.f1476k;
        return (colorStateList != null && colorStateList.isStateful()) || super.isStateful();
    }

    float j() {
        float f6 = this.f1473h;
        return (((this.f1473h * f1464r) + this.f1466a) * 2.0f) + (Math.max(f6, ((f6 * f1464r) / 2.0f) + this.f1471f + this.f1466a) * 2.0f);
    }

    float k() {
        float f6 = this.f1473h;
        return ((this.f1473h + this.f1466a) * 2.0f) + (Math.max(f6, (f6 / 2.0f) + this.f1471f + this.f1466a) * 2.0f);
    }

    float l() {
        return this.f1475j;
    }

    void m(boolean z5) {
        this.f1480o = z5;
        invalidateSelf();
    }

    void o(@q0 ColorStateList colorStateList) {
        n(colorStateList);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f1477l = true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        ColorStateList colorStateList = this.f1476k;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (this.f1467b.getColor() == colorForState) {
            return false;
        }
        this.f1467b.setColor(colorForState);
        this.f1477l = true;
        invalidateSelf();
        return true;
    }

    void p(float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException("Invalid radius " + f6 + ". Must be >= 0");
        }
        float f7 = (int) (f6 + 0.5f);
        if (this.f1471f == f7) {
            return;
        }
        this.f1471f = f7;
        this.f1477l = true;
        invalidateSelf();
    }

    void q(float f6) {
        s(this.f1475j, f6);
    }

    void r(float f6) {
        s(f6, this.f1473h);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f1467b.setAlpha(i5);
        this.f1468c.setAlpha(i5);
        this.f1469d.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1467b.setColorFilter(colorFilter);
    }
}
