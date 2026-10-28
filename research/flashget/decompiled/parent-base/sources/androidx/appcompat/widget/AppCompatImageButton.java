package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import androidx.annotation.c1;
import androidx.core.view.s1;
import d.a;

/* loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton implements s1, androidx.core.widget.w {

    /* renamed from: b, reason: collision with root package name */
    private final e f1472b;

    /* renamed from: c, reason: collision with root package name */
    private final l f1473c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1474d;

    public AppCompatImageButton(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1472b;
        if (eVar != null) {
            eVar.b();
        }
        l lVar = this.f1473c;
        if (lVar != null) {
            lVar.c();
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1472b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1472b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportImageTintList() {
        l lVar = this.f1473c;
        if (lVar != null) {
            return lVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportImageTintMode() {
        l lVar = this.f1473c;
        if (lVar != null) {
            return lVar.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f1473c.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1472b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i4) {
        super.setBackgroundResource(i4);
        e eVar = this.f1472b;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        l lVar = this.f1473c;
        if (lVar != null) {
            lVar.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.q0 Drawable drawable) {
        l lVar = this.f1473c;
        if (lVar != null && drawable != null && !this.f1474d) {
            lVar.h(drawable);
        }
        super.setImageDrawable(drawable);
        l lVar2 = this.f1473c;
        if (lVar2 != null) {
            lVar2.c();
            if (this.f1474d) {
                return;
            }
            this.f1473c.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i4) {
        super.setImageLevel(i4);
        this.f1474d = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(@androidx.annotation.v int i4) {
        this.f1473c.i(i4);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.q0 Uri uri) {
        super.setImageURI(uri);
        l lVar = this.f1473c;
        if (lVar != null) {
            lVar.c();
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        e eVar = this.f1472b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        e eVar = this.f1472b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        l lVar = this.f1473c;
        if (lVar != null) {
            lVar.k(colorStateList);
        }
    }

    @Override // androidx.core.widget.w
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportImageTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        l lVar = this.f1473c;
        if (lVar != null) {
            lVar.l(mode);
        }
    }

    public AppCompatImageButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.K1);
    }

    public AppCompatImageButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(q0.b(context), attributeSet, i4);
        this.f1474d = false;
        o0.a(this, getContext());
        e eVar = new e(this);
        this.f1472b = eVar;
        eVar.e(attributeSet, i4);
        l lVar = new l(this);
        this.f1473c = lVar;
        lVar.g(attributeSet, i4);
    }
}
