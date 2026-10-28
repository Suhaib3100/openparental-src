package androidx.vectordrawable.graphics.drawable;

import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.k;

/* compiled from: VectorDrawableCommon.java */
/* loaded from: classes3.dex */
abstract class h extends Drawable implements k {

    /* renamed from: b, reason: collision with root package name */
    Drawable f35347b;

    h() {
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.applyTheme(theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void clearColorFilter() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable getCurrent() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getCurrent() : super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getMinimumHeight() : super.getMinimumHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getMinimumWidth() : super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public int[] getState() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getState() : super.getState();
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.getTransparentRegion() : super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i4) {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.setLevel(i4) : super.onLevelChange(i4);
    }

    @Override // android.graphics.drawable.Drawable
    public void setChangingConfigurations(int i4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setChangingConfigurations(i4);
        } else {
            super.setChangingConfigurations(i4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(int i4, PorterDuff.Mode mode) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setColorFilter(i4, mode);
        } else {
            super.setColorFilter(i4, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z4) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setFilterBitmap(z4);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Drawable drawable = this.f35347b;
        if (drawable != null) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setState(int[] iArr) {
        Drawable drawable = this.f35347b;
        return drawable != null ? drawable.setState(iArr) : super.setState(iArr);
    }
}
