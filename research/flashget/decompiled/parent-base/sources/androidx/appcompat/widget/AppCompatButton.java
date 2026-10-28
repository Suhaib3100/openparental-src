package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import androidx.annotation.c1;
import androidx.core.view.s1;
import d.a;

/* loaded from: classes.dex */
public class AppCompatButton extends Button implements s1, androidx.core.widget.b, androidx.core.widget.v, c0 {

    /* renamed from: b, reason: collision with root package name */
    private final e f1454b;

    /* renamed from: c, reason: collision with root package name */
    private final q f1455c;

    /* renamed from: d, reason: collision with root package name */
    @androidx.annotation.o0
    private j f1456d;

    public AppCompatButton(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @androidx.annotation.o0
    private j a() {
        if (this.f1456d == null) {
            this.f1456d = new j(this);
        }
        return this.f1456d;
    }

    public void c(boolean z4) {
        q qVar = this.f1455c;
        if (qVar != null) {
            qVar.s(z4);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1454b;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (e1.f1834c) {
            return super.getAutoSizeMaxTextSize();
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            return qVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (e1.f1834c) {
            return super.getAutoSizeMinTextSize();
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            return qVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (e1.f1834c) {
            return super.getAutoSizeStepGranularity();
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            return qVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (e1.f1834c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        q qVar = this.f1455c;
        return qVar != null ? qVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (e1.f1834c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            return qVar.i();
        }
        return 0;
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
        e eVar = this.f1454b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1454b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1455c.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1455c.k();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean isEmojiCompatEnabled() {
        return a().b();
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
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        q qVar = this.f1455c;
        if (qVar != null) {
            qVar.o(z4, i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        q qVar = this.f1455c;
        if (qVar == null || e1.f1834c || !qVar.l()) {
            return;
        }
        this.f1455c.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        a().d(z4);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (e1.f1834c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            qVar.t(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.o0 int[] iArr, int i4) throws IllegalArgumentException {
        if (e1.f1834c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            qVar.u(iArr, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (e1.f1834c) {
            super.setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            qVar.v(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1454b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i4) {
        super.setBackgroundResource(i4);
        e eVar = this.f1454b;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@androidx.annotation.q0 ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.q.G(this, callback));
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
        e eVar = this.f1454b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        e eVar = this.f1454b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1455c.w(colorStateList);
        this.f1455c.b();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1455c.x(mode);
        this.f1455c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        q qVar = this.f1455c;
        if (qVar != null) {
            qVar.q(context, i4);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (e1.f1834c) {
            super.setTextSize(i4, f4);
            return;
        }
        q qVar = this.f1455c;
        if (qVar != null) {
            qVar.A(i4, f4);
        }
    }

    public AppCompatButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f73019o0);
    }

    public AppCompatButton(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(q0.b(context), attributeSet, i4);
        o0.a(this, getContext());
        e eVar = new e(this);
        this.f1454b = eVar;
        eVar.e(attributeSet, i4);
        q qVar = new q(this);
        this.f1455c = qVar;
        qVar.m(attributeSet, i4);
        qVar.b();
        a().c(attributeSet, i4);
    }
}
