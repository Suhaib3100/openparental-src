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
import androidx.core.view.v1;
import d.a;

/* loaded from: classes2.dex */
public class AppCompatImageButton extends ImageButton implements v1, androidx.core.widget.g0 {

    /* renamed from: o, reason: collision with root package name */
    private final d f872o;

    /* renamed from: p, reason: collision with root package name */
    private final h f873p;

    public AppCompatImageButton(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // androidx.core.widget.g0
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList a() {
        h hVar = this.f873p;
        if (hVar != null) {
            return hVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.g0
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode c() {
        h hVar = this.f873p;
        if (hVar != null) {
            return hVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.g0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void d(@androidx.annotation.q0 ColorStateList colorStateList) {
        h hVar = this.f873p;
        if (hVar != null) {
            hVar.i(colorStateList);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f872o;
        if (dVar != null) {
            dVar.b();
        }
        h hVar = this.f873p;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList e() {
        d dVar = this.f872o;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f873p.e() && super.hasOverlappingRendering();
    }

    @Override // androidx.core.widget.g0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void i(@androidx.annotation.q0 PorterDuff.Mode mode) {
        h hVar = this.f873p;
        if (hVar != null) {
            hVar.j(mode);
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode j() {
        d dVar = this.f872o;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(@androidx.annotation.q0 ColorStateList colorStateList) {
        d dVar = this.f872o;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        d dVar = this.f872o;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f872o;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i5) {
        super.setBackgroundResource(i5);
        d dVar = this.f872o;
        if (dVar != null) {
            dVar.g(i5);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        h hVar = this.f873p;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setImageDrawable(drawable);
        h hVar = this.f873p;
        if (hVar != null) {
            hVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@androidx.annotation.v int i5) {
        this.f873p.g(i5);
    }

    @Override // android.widget.ImageView
    public void setImageURI(@androidx.annotation.q0 Uri uri) {
        super.setImageURI(uri);
        h hVar = this.f873p;
        if (hVar != null) {
            hVar.b();
        }
    }

    public AppCompatImageButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.R1);
    }

    public AppCompatImageButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(w0.b(context), attributeSet, i5);
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f872o = dVar;
        dVar.e(attributeSet, i5);
        h hVar = new h(this);
        this.f873p = hVar;
        hVar.f(attributeSet, i5);
    }
}
