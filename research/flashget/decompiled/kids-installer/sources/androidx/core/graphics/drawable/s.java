package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.annotation.o0;
import androidx.annotation.x0;
import java.lang.reflect.Method;

/* compiled from: WrappedDrawableApi21.java */
@x0(21)
/* loaded from: classes3.dex */
class s extends r {

    /* renamed from: v, reason: collision with root package name */
    private static final String f4750v = "WrappedDrawableApi21";

    /* renamed from: w, reason: collision with root package name */
    private static Method f4751w;

    s(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f4751w == null) {
            try {
                f4751w = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.core.graphics.drawable.r
    protected boolean c() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Rect getDirtyBounds() {
        return this.f4749t.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@o0 Outline outline) {
        this.f4749t.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f4749t;
        if (drawable != null && (method = f4751w) != null) {
            try {
                return ((Boolean) method.invoke(drawable, new Object[0])).booleanValue();
            } catch (Exception unused) {
            }
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f6, float f7) {
        this.f4749t.setHotspot(f6, f7);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i5, int i6, int i7, int i8) {
        this.f4749t.setHotspotBounds(i5, i6, i7, i8);
    }

    @Override // androidx.core.graphics.drawable.r, android.graphics.drawable.Drawable
    public boolean setState(@o0 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.r, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTint(int i5) {
        if (c()) {
            super.setTint(i5);
        } else {
            this.f4749t.setTint(i5);
        }
    }

    @Override // androidx.core.graphics.drawable.r, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f4749t.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.r, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.p
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f4749t.setTintMode(mode);
        }
    }

    s(t tVar, Resources resources) {
        super(tVar, resources);
        g();
    }
}
