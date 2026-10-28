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

/* compiled from: WrappedDrawableApi14.java */
/* loaded from: classes3.dex */
class m extends Drawable implements Drawable.Callback, l, k {

    /* renamed from: h, reason: collision with root package name */
    static final PorterDuff.Mode f26231h = PorterDuff.Mode.SRC_IN;

    /* renamed from: b, reason: collision with root package name */
    private int f26232b;

    /* renamed from: c, reason: collision with root package name */
    private PorterDuff.Mode f26233c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f26234d;

    /* renamed from: e, reason: collision with root package name */
    o f26235e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26236f;

    /* renamed from: g, reason: collision with root package name */
    Drawable f26237g;

    m(@o0 o oVar, @q0 Resources resources) {
        this.f26235e = oVar;
        e(resources);
    }

    @o0
    private o d() {
        return new o(this.f26235e);
    }

    private void e(@q0 Resources resources) {
        Drawable.ConstantState constantState;
        o oVar = this.f26235e;
        if (oVar == null || (constantState = oVar.f26241b) == null) {
            return;
        }
        b(constantState.newDrawable(resources));
    }

    private boolean f(int[] iArr) {
        if (!c()) {
            return false;
        }
        o oVar = this.f26235e;
        ColorStateList colorStateList = oVar.f26242c;
        PorterDuff.Mode mode = oVar.f26243d;
        if (colorStateList == null || mode == null) {
            this.f26234d = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!this.f26234d || colorForState != this.f26232b || mode != this.f26233c) {
                setColorFilter(colorForState, mode);
                this.f26232b = colorForState;
                this.f26233c = mode;
                this.f26234d = true;
                return true;
            }
        }
        return false;
    }

    @Override // androidx.core.graphics.drawable.l
    public final Drawable a() {
        return this.f26237g;
    }

    @Override // androidx.core.graphics.drawable.l
    public final void b(Drawable drawable) {
        Drawable drawable2 = this.f26237g;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f26237g = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            o oVar = this.f26235e;
            if (oVar != null) {
                oVar.f26241b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    protected boolean c() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@o0 Canvas canvas) {
        this.f26237g.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        o oVar = this.f26235e;
        return changingConfigurations | (oVar != null ? oVar.getChangingConfigurations() : 0) | this.f26237g.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    @q0
    public Drawable.ConstantState getConstantState() {
        o oVar = this.f26235e;
        if (oVar == null || !oVar.a()) {
            return null;
        }
        this.f26235e.f26240a = getChangingConfigurations();
        return this.f26235e;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable getCurrent() {
        return this.f26237g.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f26237g.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f26237g.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    @x0(23)
    public int getLayoutDirection() {
        return this.f26237g.getLayoutDirection();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f26237g.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f26237g.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f26237g.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@o0 Rect rect) {
        return this.f26237g.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public int[] getState() {
        return this.f26237g.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        return this.f26237g.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(@o0 Drawable drawable) {
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        return this.f26237g.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        o oVar;
        ColorStateList colorStateList = (!c() || (oVar = this.f26235e) == null) ? null : oVar.f26242c;
        return (colorStateList != null && colorStateList.isStateful()) || this.f26237g.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f26237g.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Drawable mutate() {
        if (!this.f26236f && super.mutate() == this) {
            this.f26235e = d();
            Drawable drawable = this.f26237g;
            if (drawable != null) {
                drawable.mutate();
            }
            o oVar = this.f26235e;
            if (oVar != null) {
                Drawable drawable2 = this.f26237g;
                oVar.f26241b = drawable2 != null ? drawable2.getConstantState() : null;
            }
            this.f26236f = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f26237g;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    @x0(23)
    public boolean onLayoutDirectionChanged(int i4) {
        return this.f26237g.setLayoutDirection(i4);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        return this.f26237g.setLevel(i4);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable, long j4) {
        scheduleSelf(runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i4) {
        this.f26237g.setAlpha(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z4) {
        this.f26237g.setAutoMirrored(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        this.f26237g.setChangingConfigurations(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f26237g.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setDither(boolean z4) {
        this.f26237g.setDither(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z4) {
        this.f26237g.setFilterBitmap(z4);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(@o0 int[] iArr) {
        return f(iArr) || this.f26237g.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(int i4) {
        setTintList(ColorStateList.valueOf(i4));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(ColorStateList colorStateList) {
        this.f26235e.f26242c = colorStateList;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        this.f26235e.f26243d = mode;
        f(getState());
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z4, boolean z5) {
        return super.setVisible(z4, z5) || this.f26237g.setVisible(z4, z5);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(@o0 Drawable drawable, @o0 Runnable runnable) {
        unscheduleSelf(runnable);
    }

    m(@q0 Drawable drawable) {
        this.f26235e = d();
        b(drawable);
    }
}
