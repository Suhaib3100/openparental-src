package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.c1;
import androidx.core.view.v1;
import d.a;

/* loaded from: classes2.dex */
public class AppCompatButton extends Button implements v1, androidx.core.widget.b, androidx.core.widget.f0 {

    /* renamed from: o, reason: collision with root package name */
    private final d f861o;

    /* renamed from: p, reason: collision with root package name */
    private final t f862p;

    public AppCompatButton(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // androidx.core.widget.f0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void a(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f862p.x(mode);
        this.f862p.b();
    }

    public void b(boolean z5) {
        t tVar = this.f862p;
        if (tVar != null) {
            tVar.s(z5);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f861o;
        if (dVar != null) {
            dVar.b();
        }
        t tVar = this.f862p;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList e() {
        d dVar = this.f861o;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (androidx.core.widget.b.f5874a) {
            return super.getAutoSizeMaxTextSize();
        }
        t tVar = this.f862p;
        if (tVar != null) {
            return tVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (androidx.core.widget.b.f5874a) {
            return super.getAutoSizeMinTextSize();
        }
        t tVar = this.f862p;
        if (tVar != null) {
            return tVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (androidx.core.widget.b.f5874a) {
            return super.getAutoSizeStepGranularity();
        }
        t tVar = this.f862p;
        if (tVar != null) {
            return tVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (androidx.core.widget.b.f5874a) {
            return super.getAutoSizeTextAvailableSizes();
        }
        t tVar = this.f862p;
        return tVar != null ? tVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f5874a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        t tVar = this.f862p;
        if (tVar != null) {
            return tVar.i();
        }
        return 0;
    }

    @Override // androidx.core.widget.f0
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode h() {
        return this.f862p.k();
    }

    @Override // androidx.core.widget.f0
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList i() {
        return this.f862p.j();
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode j() {
        d dVar = this.f861o;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(@androidx.annotation.q0 ColorStateList colorStateList) {
        d dVar = this.f861o;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.widget.f0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void n(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f862p.w(colorStateList);
        this.f862p.b();
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        d dVar = this.f861o;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        t tVar = this.f862p;
        if (tVar != null) {
            tVar.o(z5, i5, i6, i7, i8);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        super.onTextChanged(charSequence, i5, i6, i7);
        t tVar = this.f862p;
        if (tVar == null || androidx.core.widget.b.f5874a || !tVar.l()) {
            return;
        }
        this.f862p.c();
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i6, int i7, int i8) throws IllegalArgumentException {
        if (androidx.core.widget.b.f5874a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
            return;
        }
        t tVar = this.f862p;
        if (tVar != null) {
            tVar.t(i5, i6, i7, i8);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.o0 int[] iArr, int i5) throws IllegalArgumentException {
        if (androidx.core.widget.b.f5874a) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i5);
            return;
        }
        t tVar = this.f862p;
        if (tVar != null) {
            tVar.u(iArr, i5);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i5) {
        if (androidx.core.widget.b.f5874a) {
            super.setAutoSizeTextTypeWithDefaults(i5);
            return;
        }
        t tVar = this.f862p;
        if (tVar != null) {
            tVar.v(i5);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f861o;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i5) {
        super.setBackgroundResource(i5);
        d dVar = this.f861o;
        if (dVar != null) {
            dVar.g(i5);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.H(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        t tVar = this.f862p;
        if (tVar != null) {
            tVar.q(context, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i5, float f6) {
        if (androidx.core.widget.b.f5874a) {
            super.setTextSize(i5, f6);
            return;
        }
        t tVar = this.f862p;
        if (tVar != null) {
            tVar.A(i5, f6);
        }
    }

    public AppCompatButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f21620p0);
    }

    public AppCompatButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(w0.b(context), attributeSet, i5);
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f861o = dVar;
        dVar.e(attributeSet, i5);
        t tVar = new t(this);
        this.f862p = tVar;
        tVar.m(attributeSet, i5);
        tVar.b();
    }
}
