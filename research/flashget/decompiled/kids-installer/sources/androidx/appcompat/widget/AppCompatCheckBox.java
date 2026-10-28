package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckBox;
import androidx.annotation.c1;
import androidx.core.view.v1;
import d.a;

/* loaded from: classes2.dex */
public class AppCompatCheckBox extends CheckBox implements androidx.core.widget.e0, v1 {

    /* renamed from: o, reason: collision with root package name */
    private final e f863o;

    /* renamed from: p, reason: collision with root package name */
    private final d f864p;

    /* renamed from: q, reason: collision with root package name */
    private final t f865q;

    public AppCompatCheckBox(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // androidx.core.widget.e0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void b(@androidx.annotation.q0 ColorStateList colorStateList) {
        e eVar = this.f863o;
        if (eVar != null) {
            eVar.g(colorStateList);
        }
    }

    @Override // androidx.core.widget.e0
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList c() {
        e eVar = this.f863o;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.e0
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode d() {
        e eVar = this.f863o;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f864p;
        if (dVar != null) {
            dVar.b();
        }
        t tVar = this.f865q;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList e() {
        d dVar = this.f864p;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.e0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void f(@androidx.annotation.q0 PorterDuff.Mode mode) {
        e eVar = this.f863o;
        if (eVar != null) {
            eVar.h(mode);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView
    public int getCompoundPaddingLeft() {
        int compoundPaddingLeft = super.getCompoundPaddingLeft();
        e eVar = this.f863o;
        return eVar != null ? eVar.b(compoundPaddingLeft) : compoundPaddingLeft;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode j() {
        d dVar = this.f864p;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(@androidx.annotation.q0 ColorStateList colorStateList) {
        d dVar = this.f864p;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        d dVar = this.f864p;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f864p;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i5) {
        super.setBackgroundResource(i5);
        d dVar = this.f864p;
        if (dVar != null) {
            dVar.g(i5);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        e eVar = this.f863o;
        if (eVar != null) {
            eVar.f();
        }
    }

    public AppCompatCheckBox(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f21644t0);
    }

    public AppCompatCheckBox(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(w0.b(context), attributeSet, i5);
        u0.a(this, getContext());
        e eVar = new e(this);
        this.f863o = eVar;
        eVar.e(attributeSet, i5);
        d dVar = new d(this);
        this.f864p = dVar;
        dVar.e(attributeSet, i5);
        t tVar = new t(this);
        this.f865q = tVar;
        tVar.m(attributeSet, i5);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(@androidx.annotation.v int i5) {
        setButtonDrawable(androidx.appcompat.content.res.a.d(getContext(), i5));
    }
}
