package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.c1;
import androidx.core.view.v1;

/* loaded from: classes2.dex */
public class AppCompatToggleButton extends ToggleButton implements v1 {

    /* renamed from: o, reason: collision with root package name */
    private final d f923o;

    /* renamed from: p, reason: collision with root package name */
    private final t f924p;

    public AppCompatToggleButton(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f923o;
        if (dVar != null) {
            dVar.b();
        }
        t tVar = this.f924p;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList e() {
        d dVar = this.f923o;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode j() {
        d dVar = this.f923o;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(@androidx.annotation.q0 ColorStateList colorStateList) {
        d dVar = this.f923o;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        d dVar = this.f923o;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f923o;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i5) {
        super.setBackgroundResource(i5);
        d dVar = this.f923o;
        if (dVar != null) {
            dVar.g(i5);
        }
    }

    public AppCompatToggleButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f923o = dVar;
        dVar.e(attributeSet, i5);
        t tVar = new t(this);
        this.f924p = tVar;
        tVar.m(attributeSet, i5);
    }
}
