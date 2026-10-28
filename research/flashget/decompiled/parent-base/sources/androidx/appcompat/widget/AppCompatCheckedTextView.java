package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.c1;
import androidx.core.view.s1;
import d.a;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView implements androidx.core.widget.t, s1, c0, androidx.core.widget.v {

    /* renamed from: b, reason: collision with root package name */
    private final f f1461b;

    /* renamed from: c, reason: collision with root package name */
    private final e f1462c;

    /* renamed from: d, reason: collision with root package name */
    private final q f1463d;

    /* renamed from: e, reason: collision with root package name */
    @androidx.annotation.o0
    private j f1464e;

    public AppCompatCheckedTextView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @androidx.annotation.o0
    private j e() {
        if (this.f1464e == null) {
            this.f1464e = new j(this);
        }
        return this.f1464e;
    }

    @Override // androidx.core.widget.t
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void a(@androidx.annotation.q0 PorterDuff.Mode mode) {
        f fVar = this.f1461b;
        if (fVar != null) {
            fVar.g(mode);
        }
    }

    @Override // androidx.core.widget.t
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode b() {
        f fVar = this.f1461b;
        if (fVar != null) {
            return fVar.c();
        }
        return null;
    }

    @Override // androidx.core.widget.t
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList c() {
        f fVar = this.f1461b;
        if (fVar != null) {
            return fVar.b();
        }
        return null;
    }

    @Override // androidx.core.widget.t
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void d(@androidx.annotation.q0 ColorStateList colorStateList) {
        f fVar = this.f1461b;
        if (fVar != null) {
            fVar.f(colorStateList);
        }
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        q qVar = this.f1463d;
        if (qVar != null) {
            qVar.b();
        }
        e eVar = this.f1462c;
        if (eVar != null) {
            eVar.b();
        }
        f fVar = this.f1461b;
        if (fVar != null) {
            fVar.a();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.q0
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return androidx.core.widget.q.F(super.getCustomSelectionActionModeCallback());
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.f1462c;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1462c;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1463d.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1463d.k();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean isEmojiCompatEnabled() {
        return e().b();
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.q0
    public InputConnection onCreateInputConnection(@androidx.annotation.o0 EditorInfo editorInfo) {
        return k.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        e().d(z4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1462c;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i4) {
        super.setBackgroundResource(i4);
        e eVar = this.f1462c;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        f fVar = this.f1461b;
        if (fVar != null) {
            fVar.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1463d;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1463d;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.q0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
    }

    @Override // androidx.appcompat.widget.c0
    public void setEmojiCompatEnabled(boolean z4) {
        e().e(z4);
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        e eVar = this.f1462c;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        e eVar = this.f1462c;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1463d.w(colorStateList);
        this.f1463d.b();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1463d.x(mode);
        this.f1463d.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(@androidx.annotation.o0 Context context, int i4) {
        super.setTextAppearance(context, i4);
        q qVar = this.f1463d;
        if (qVar != null) {
            qVar.q(context, i4);
        }
    }

    public AppCompatCheckedTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f73059w0);
    }

    public AppCompatCheckedTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(q0.b(context), attributeSet, i4);
        o0.a(this, getContext());
        q qVar = new q(this);
        this.f1463d = qVar;
        qVar.m(attributeSet, i4);
        qVar.b();
        e eVar = new e(this);
        this.f1462c = eVar;
        eVar.e(attributeSet, i4);
        f fVar = new f(this);
        this.f1461b = fVar;
        fVar.d(attributeSet, i4);
        e().c(attributeSet, i4);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.v int i4) {
        setCheckMarkDrawable(e.a.b(getContext(), i4));
    }
}
