package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatEditText;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.n;
import s8.a;

/* loaded from: classes6.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: h, reason: collision with root package name */
    private final Rect f54239h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f54240i;

    public TextInputEditText(@o0 Context context) {
        this(context, null);
    }

    @o0
    private String f(@o0 TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence n02 = textInputLayout.n0();
        boolean isEmpty = TextUtils.isEmpty(text);
        boolean isEmpty2 = TextUtils.isEmpty(n02);
        setLabelFor(a.h.x5);
        String charSequence = !isEmpty2 ? n02.toString() : "";
        if (isEmpty) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append(TextUtils.isEmpty(charSequence) ? "" : androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("\uf23e"), charSequence));
        return sb.toString();
    }

    @q0
    private CharSequence g() {
        TextInputLayout h4 = h();
        if (h4 != null) {
            return h4.n0();
        }
        return null;
    }

    @q0
    private TextInputLayout h() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@q0 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout h4 = h();
        if (h4 == null || !this.f54240i || rect == null) {
            return;
        }
        h4.getFocusedRect(this.f54239h);
        rect.bottom = this.f54239h.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@q0 Rect rect, @q0 Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout h4 = h();
        if (h4 != null && this.f54240i && rect != null) {
            h4.getGlobalVisibleRect(this.f54239h, point);
            rect.bottom = this.f54239h.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    @q0
    public CharSequence getHint() {
        TextInputLayout h4 = h();
        return (h4 == null || !h4.X0()) ? super.getHint() : h4.n0();
    }

    public boolean i() {
        return this.f54240i;
    }

    public void j(boolean z4) {
        this.f54240i = z4;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout h4 = h();
        if (h4 != null && h4.X0() && super.getHint() == null && com.google.android.material.internal.e.c()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @q0
    public InputConnection onCreateInputConnection(@o0 EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = g();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@q0 Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout h4 = h();
        if (h4 != null && this.f54240i) {
            this.f54239h.set(0, h4.getHeight() - getResources().getDimensionPixelOffset(a.f.w4), h4.getWidth(), h4.getHeight());
            h4.requestRectangleOnScreen(this.f54239h, true);
        }
        return requestRectangleOnScreen;
    }

    public TextInputEditText(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.E4);
    }

    public TextInputEditText(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(a9.a.c(context, attributeSet, i4, 0), attributeSet, i4);
        this.f54239h = new Rect();
        TypedArray j4 = n.j(context, attributeSet, a.o.Cs, i4, a.n.Ba, new int[0]);
        j(j4.getBoolean(a.o.Ds, false));
        j4.recycle();
    }
}
