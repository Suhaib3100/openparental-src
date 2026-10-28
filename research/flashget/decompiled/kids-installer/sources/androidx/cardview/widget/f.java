package androidx.cardview.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: RoundRectDrawable.java */
@x0(21)
/* loaded from: classes.dex */
class f extends Drawable {

    /* renamed from: a, reason: collision with root package name */
    private float f1452a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f1454c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f1455d;

    /* renamed from: e, reason: collision with root package name */
    private float f1456e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f1459h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f1460i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f1461j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1457f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1458g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f1462k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f1453b = new Paint(5);

    f(ColorStateList colorStateList, float f6) {
        this.f1452a = f6;
        e(colorStateList);
        this.f1454c = new RectF();
        this.f1455d = new Rect();
    }

    private PorterDuffColorFilter a(ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    private void e(ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(0);
        }
        this.f1459h = colorStateList;
        this.f1453b.setColor(colorStateList.getColorForState(getState(), this.f1459h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f1454c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f1455d.set(rect);
        if (this.f1457f) {
            this.f1455d.inset((int) Math.ceil(g.c(this.f1456e, this.f1452a, this.f1458g)), (int) Math.ceil(g.d(this.f1456e, this.f1452a, this.f1458g)));
            this.f1454c.set(this.f1455d);
        }
    }

    public ColorStateList b() {
        return this.f1459h;
    }

    float c() {
        return this.f1456e;
    }

    public float d() {
        return this.f1452a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z5;
        Paint paint = this.f1453b;
        if (this.f1460i == null || paint.getColorFilter() != null) {
            z5 = false;
        } else {
            paint.setColorFilter(this.f1460i);
            z5 = true;
        }
        RectF rectF = this.f1454c;
        float f6 = this.f1452a;
        canvas.drawRoundRect(rectF, f6, f6, paint);
        if (z5) {
            paint.setColorFilter(null);
        }
    }

    public void f(@q0 ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f6, boolean z5, boolean z6) {
        if (f6 == this.f1456e && this.f1457f == z5 && this.f1458g == z6) {
            return;
        }
        this.f1456e = f6;
        this.f1457f = z5;
        this.f1458g = z6;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f1455d, this.f1452a);
    }

    void h(float f6) {
        if (f6 == this.f1452a) {
            return;
        }
        this.f1452a = f6;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f1461j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f1459h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f1459h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z5 = colorForState != this.f1453b.getColor();
        if (z5) {
            this.f1453b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f1461j;
        if (colorStateList2 == null || (mode = this.f1462k) == null) {
            return z5;
        }
        this.f1460i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f1453b.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f1453b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f1461j = colorStateList;
        this.f1460i = a(colorStateList, this.f1462k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f1462k = mode;
        this.f1460i = a(this.f1461j, mode);
        invalidateSelf();
    }
}
