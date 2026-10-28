package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.c1;
import androidx.core.view.s1;
import d.a;

/* loaded from: classes.dex */
public class AppCompatCheckBox extends CheckBox implements androidx.core.widget.u, s1, c0, androidx.core.widget.v {

    /* renamed from: b, reason: collision with root package name */
    private final g f1457b;

    /* renamed from: c, reason: collision with root package name */
    private final e f1458c;

    /* renamed from: d, reason: collision with root package name */
    private final q f1459d;

    /* renamed from: e, reason: collision with root package name */
    private j f1460e;

    public AppCompatCheckBox(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @androidx.annotation.o0
    private j h() {
        if (this.f1460e == null) {
            this.f1460e = new j(this);
        }
        return this.f1460e;
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void b(@androidx.annotation.q0 ColorStateList colorStateList) {
        g gVar = this.f1457b;
        if (gVar != null) {
            gVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList c() {
        g gVar = this.f1457b;
        if (gVar != null) {
            return gVar.c();
        }
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1458c;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1459d;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void f(@androidx.annotation.q0 PorterDuff.Mode mode) {
        g gVar = this.f1457b;
        if (gVar != null) {
            gVar.h(mode);
        }
    }

    @Override // androidx.core.widget.u
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode g() {
        g gVar = this.f1457b;
        if (gVar != null) {
            return gVar.d();
        }
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        g gVar = this.f1457b;
        return gVar != null ? gVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1458c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1458c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1459d.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1459d.k();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean isEmojiCompatEnabled() {
        return h().b();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        h().d(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1458c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i4) {
        super.setBackgroundResource(i4);
        e eVar = this.f1458c;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        g gVar = this.f1457b;
        if (gVar != null) {
            gVar.f();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1459d;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1459d;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // androidx.appcompat.widget.c0
    public void setEmojiCompatEnabled(boolean z4) {
        h().e(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.o0 InputFilter[] inputFilterArr) {
        super.setFilters(h().a(inputFilterArr));
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        e eVar = this.f1458c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        e eVar = this.f1458c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1459d.w(colorStateList);
        this.f1459d.b();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1459d.x(mode);
        this.f1459d.b();
    }

    public AppCompatCheckBox(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f73054v0);
    }

    public AppCompatCheckBox(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(q0.b(context), attributeSet, i4);
        o0.a(this, getContext());
        g gVar = new g(this);
        this.f1457b = gVar;
        gVar.e(attributeSet, i4);
        e eVar = new e(this);
        this.f1458c = eVar;
        eVar.e(attributeSet, i4);
        q qVar = new q(this);
        this.f1459d = qVar;
        qVar.m(attributeSet, i4);
        h().c(attributeSet, i4);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@androidx.annotation.v int i4) {
        setButtonDrawable(e.a.b(getContext(), i4));
    }
}
