package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.core.graphics.drawable.d;

/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes3.dex */
class r extends Drawable implements Drawable.Callback, q, p {

    /* renamed from: u, reason: collision with root package name */
    static final PorterDuff.Mode f4743u = PorterDuff.Mode.SRC_IN;

    /* renamed from: o, reason: collision with root package name */
    private int f4744o;

    /* renamed from: p, reason: collision with root package name */
    private PorterDuff.Mode f4745p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f4746q;

    /* renamed from: r, reason: collision with root package name */
    t f4747r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f4748s;

    /* renamed from: t, reason: collision with root package name */
    Drawable f4749t;

    r(@o0 t tVar, @q0 Resources resources) {
        this.f4747r = tVar;
        e(resources);
    }

    @o0
    private t d() {
        return new t(this.f4747r);
    }

    private void e(@q0 Resources resources) {
        Drawable.ConstantState constantState;
        t tVar = this.f4747r;
        if (tVar == null || (constantState = tVar.f4753b) == null) {
            return;
        }
        a(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        t tVar = this.f4747r;
        ColorStateList colorStateList = tVar.f4754c;
        PorterDuff.Mode mode = tVar.f4755d;
        if (colorStateList == null || mode == null) {
            this.f4746q = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f4746q || colorForState != this.f4744o || mode != this.f4745p) {
                setColorFilter(colorForState, mode);
                this.f4744o = colorForState;
                this.f4745p = mode;
                this.f4746q = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.q
    public final void a(Drawable drawable) {
        Drawable drawable2 = this.f4749t;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f4749t = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            t tVar = this.f4747r;
            if (tVar != null) {
                tVar.f4753b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    @Override // androidx.core.graphics.drawable.q
    public final Drawable b() {
        return this.f4749t;
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        this.f4749t.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        t tVar = this.f4747r;
        return changingConfigurations | (tVar != null ? tVar.getChangingConfigurations() : 0) | this.f4749t.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        t tVar = this.f4747r;
        if (tVar == null || !tVar.a()) {
            return null;
        }
        this.f4747r.f4752a = getChangingConfigurations();
        return this.f4747r;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable getCurrent() {
        return this.f4749t.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f4749t.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f4749t.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @x0(23)
    public int getLayoutDirection() {
        return d.c.a(this.f4749t);
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f4749t.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f4749t.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f4749t.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        return this.f4749t.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public int[] getState() {
        return this.f4749t.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f4749t.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@o0 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    @x0(19)
    public boolean isAutoMirrored() {
        return d.a.d(this.f4749t);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        t tVar;
        ColorStateList colorStateList = (!c() || (tVar = this.f4747r) == null) ? null : tVar.f4754c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f4749t.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f4749t.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f4748s && super.mutate() == this) {
            this.f4747r = d();
            Drawable drawable = this.f4749t;
            if (drawable != null) {
                drawable.mutate();
            }
            t tVar = this.f4747r;
            if (tVar != null) {
                Drawable drawable2 = this.f4749t;
                tVar.f4753b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f4748s = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f4749t;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @x0(23)
    public boolean onLayoutDirectionChanged(int i5) {
        return d.c.b(this.f4749t, i5);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i5) {
        return this.f4749t.setLevel(i5);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j5) {
        scheduleSelf(runnable, j5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i5) {
        this.f4749t.setAlpha(i5);
    }

    @Override // android.graphics.drawable.Drawable
    @x0(19)
    public void setAutoMirrored(boolean z5) {
        d.a.e(this.f4749t, z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i5) {
        this.f4749t.setChangingConfigurations(i5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f4749t.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z5) {
        this.f4749t.setDither(z5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z5) {
        this.f4749t.setFilterBitmap(z5);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@o0 int[] iArr) {
        return f(iArr) || this.f4749t.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(int i5) {
        setTintList(ColorStateList.valueOf(i5));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        this.f4747r.f4754c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        this.f4747r.f4755d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z5, boolean z6) {
        return super.setVisible(z5, z6) || this.f4749t.setVisible(z5, z6);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
        unscheduleSelf(runnable);
    }

    r(@q0 Drawable drawable) {
        this.f4747r = d();
        a(drawable);
    }
}
