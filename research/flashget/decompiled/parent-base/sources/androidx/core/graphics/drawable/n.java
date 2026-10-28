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
class n extends m {

    /* renamed from: i, reason: collision with root package name */
    private static final String f26238i = "WrappedDrawableApi21";

    /* renamed from: j, reason: collision with root package name */
    private static Method f26239j;

    n(Drawable drawable) {
        super(drawable);
        g();
    }

    private void g() {
        if (f26239j == null) {
            try {
                f26239j = Drawable.class.getDeclaredMethod("isProjected", null);
            } catch (Exception unused) {
            }
        }
    }

    @Override // androidx.core.graphics.drawable.m
    protected boolean c() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    @o0
    public Rect getDirtyBounds() {
        return this.f26237g.getDirtyBounds();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(@o0 Outline outline) {
        this.f26237g.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isProjected() {
        Method method;
        Drawable drawable = this.f26237g;
        if (drawable == null || (method = f26239j) == null) {
            return false;
        }
        try {
            return ((Boolean) method.invoke(drawable, null)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspot(float f4, float f5) {
        this.f26237g.setHotspot(f4, f5);
    }

    @Override // android.graphics.drawable.Drawable
    public void setHotspotBounds(int i4, int i5, int i6, int i7) {
        this.f26237g.setHotspotBounds(i4, i5, i6, i7);
    }

    @Override // androidx.core.graphics.drawable.m, android.graphics.drawable.Drawable
    public boolean setState(@o0 int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    @Override // androidx.core.graphics.drawable.m, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTint(int i4) {
        if (c()) {
            super.setTint(i4);
        } else {
            this.f26237g.setTint(i4);
        }
    }

    @Override // androidx.core.graphics.drawable.m, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintList(ColorStateList colorStateList) {
        if (c()) {
            super.setTintList(colorStateList);
        } else {
            this.f26237g.setTintList(colorStateList);
        }
    }

    @Override // androidx.core.graphics.drawable.m, android.graphics.drawable.Drawable, androidx.core.graphics.drawable.k
    public void setTintMode(@o0 PorterDuff.Mode mode) {
        if (c()) {
            super.setTintMode(mode);
        } else {
            this.f26237g.setTintMode(mode);
        }
    }

    n(o oVar, Resources resources) {
        super(oVar, resources);
        g();
    }
}
