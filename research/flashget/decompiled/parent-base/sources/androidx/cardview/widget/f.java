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
    private float f2126a;

    /* renamed from: c, reason: collision with root package name */
    private final RectF f2128c;

    /* renamed from: d, reason: collision with root package name */
    private final Rect f2129d;

    /* renamed from: e, reason: collision with root package name */
    private float f2130e;

    /* renamed from: h, reason: collision with root package name */
    private ColorStateList f2133h;

    /* renamed from: i, reason: collision with root package name */
    private PorterDuffColorFilter f2134i;

    /* renamed from: j, reason: collision with root package name */
    private ColorStateList f2135j;

    /* renamed from: f, reason: collision with root package name */
    private boolean f2131f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f2132g = true;

    /* renamed from: k, reason: collision with root package name */
    private PorterDuff.Mode f2136k = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private final Paint f2127b = new Paint(5);

    f(ColorStateList colorStateList, float f4) {
        this.f2126a = f4;
        e(colorStateList);
        this.f2128c = new RectF();
        this.f2129d = new Rect();
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
        this.f2133h = colorStateList;
        this.f2127b.setColor(colorStateList.getColorForState(getState(), this.f2133h.getDefaultColor()));
    }

    private void i(Rect rect) {
        if (rect == null) {
            rect = getBounds();
        }
        this.f2128c.set(rect.left, rect.top, rect.right, rect.bottom);
        this.f2129d.set(rect);
        if (this.f2131f) {
            this.f2129d.inset((int) Math.ceil(g.c(this.f2130e, this.f2126a, this.f2132g)), (int) Math.ceil(g.d(this.f2130e, this.f2126a, this.f2132g)));
            this.f2128c.set(this.f2129d);
        }
    }

    public ColorStateList b() {
        return this.f2133h;
    }

    float c() {
        return this.f2130e;
    }

    public float d() {
        return this.f2126a;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        boolean z4;
        Paint paint = this.f2127b;
        if (this.f2134i == null || paint.getColorFilter() != null) {
            z4 = false;
        } else {
            paint.setColorFilter(this.f2134i);
            z4 = true;
        }
        RectF rectF = this.f2128c;
        float f4 = this.f2126a;
        canvas.drawRoundRect(rectF, f4, f4, paint);
        if (z4) {
            paint.setColorFilter(null);
        }
    }

    public void f(@q0 ColorStateList colorStateList) {
        e(colorStateList);
        invalidateSelf();
    }

    void g(float f4, boolean z4, boolean z5) {
        if (f4 == this.f2130e && this.f2131f == z4 && this.f2132g == z5) {
            return;
        }
        this.f2130e = f4;
        this.f2131f = z4;
        this.f2132g = z5;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        outline.setRoundRect(this.f2129d, this.f2126a);
    }

    void h(float f4) {
        if (f4 == this.f2126a) {
            return;
        }
        this.f2126a = f4;
        i(null);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2 = this.f2135j;
        return (colorStateList2 != null && colorStateList2.isStateful()) || ((colorStateList = this.f2133h) != null && colorStateList.isStateful()) || super.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        i(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        PorterDuff.Mode mode;
        ColorStateList colorStateList = this.f2133h;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        boolean z4 = colorForState != this.f2127b.getColor();
        if (z4) {
            this.f2127b.setColor(colorForState);
        }
        ColorStateList colorStateList2 = this.f2135j;
        if (colorStateList2 == null || (mode = this.f2136k) == null) {
            return z4;
        }
        this.f2134i = a(colorStateList2, mode);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f2127b.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f2127b.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f2135j = colorStateList;
        this.f2134i = a(colorStateList, this.f2136k);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f2136k = mode;
        this.f2134i = a(this.f2135j, mode);
        invalidateSelf();
    }
}
