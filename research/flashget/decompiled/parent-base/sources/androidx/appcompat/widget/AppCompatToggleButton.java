package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;
import androidx.annotation.c1;
import androidx.core.view.s1;

/* loaded from: classes.dex */
public class AppCompatToggleButton extends ToggleButton implements s1, c0, androidx.core.widget.v {

    /* renamed from: b, reason: collision with root package name */
    private final e f1518b;

    /* renamed from: c, reason: collision with root package name */
    private final q f1519c;

    /* renamed from: d, reason: collision with root package name */
    private j f1520d;

    public AppCompatToggleButton(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @androidx.annotation.o0
    private j a() {
        if (this.f1520d == null) {
            this.f1520d = new j(this);
        }
        return this.f1520d;
    }

    @Override // android.widget.ToggleButton, android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1518b;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1519c;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1518b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1518b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1519c.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1519c.k();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean isEmojiCompatEnabled() {
        return a().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        a().d(z4);
    }

    @Override // android.widget.ToggleButton, android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1518b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i4) {
        super.setBackgroundResource(i4);
        e eVar = this.f1518b;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1519c;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1519c;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void setEmojiCompatEnabled(boolean z4) {
        a().e(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.o0 InputFilter[] inputFilterArr) {
        super.setFilters(a().a(inputFilterArr));
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        e eVar = this.f1518b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        e eVar = this.f1518b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1519c.w(colorStateList);
        this.f1519c.b();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1519c.x(mode);
        this.f1519c.b();
    }

    public AppCompatToggleButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.buttonStyleToggle);
    }

    public AppCompatToggleButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        o0.a(this, getContext());
        e eVar = new e(this);
        this.f1518b = eVar;
        eVar.e(attributeSet, i4);
        q qVar = new q(this);
        this.f1519c = qVar;
        qVar.m(attributeSet, i4);
        a().c(attributeSet, i4);
    }
}
