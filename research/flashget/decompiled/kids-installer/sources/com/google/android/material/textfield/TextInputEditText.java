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
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.n;
import n1.a;

/* loaded from: classes3.dex */
public class TextInputEditText extends AppCompatEditText {

    /* renamed from: s, reason: collision with root package name */
    private final Rect f14384s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f14385t;

    public TextInputEditText(@o0 Context context) {
        this(context, null);
    }

    @o0
    private String b(@o0 TextInputLayout textInputLayout) {
        Editable text = getText();
        CharSequence n02 = textInputLayout.n0();
        boolean z5 = !TextUtils.isEmpty(text);
        boolean z6 = !TextUtils.isEmpty(n02);
        setLabelFor(a.h.x5);
        String charSequence = z6 ? n02.toString() : "";
        if (!z5) {
            return !TextUtils.isEmpty(charSequence) ? charSequence : "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append((Object) text);
        sb.append(TextUtils.isEmpty(charSequence) ? "" : androidx.constraintlayout.motion.widget.g.a(ProtectedSandApp.s("✨"), charSequence));
        return sb.toString();
    }

    @q0
    private CharSequence c() {
        TextInputLayout d6 = d();
        if (d6 != null) {
            return d6.n0();
        }
        return null;
    }

    @q0
    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    public boolean f() {
        return this.f14385t;
    }

    public void g(boolean z5) {
        this.f14385t = z5;
    }

    @Override // android.widget.TextView, android.view.View
    public void getFocusedRect(@q0 Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout d6 = d();
        if (d6 == null || !this.f14385t || rect == null) {
            return;
        }
        d6.getFocusedRect(this.f14384s);
        rect.bottom = this.f14384s.bottom;
    }

    @Override // android.view.View
    public boolean getGlobalVisibleRect(@q0 Rect rect, @q0 Point point) {
        boolean globalVisibleRect = super.getGlobalVisibleRect(rect, point);
        TextInputLayout d6 = d();
        if (d6 != null && this.f14385t && rect != null) {
            d6.getGlobalVisibleRect(this.f14384s, point);
            rect.bottom = this.f14384s.bottom;
        }
        return globalVisibleRect;
    }

    @Override // android.widget.TextView
    @q0
    public CharSequence getHint() {
        TextInputLayout d6 = d();
        return (d6 == null || !d6.X0()) ? super.getHint() : d6.n0();
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d6 = d();
        if (d6 != null && d6.X0() && super.getHint() == null && com.google.android.material.internal.e.c()) {
            setHint("");
        }
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView, android.view.View
    @q0
    public InputConnection onCreateInputConnection(@o0 EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = c();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d();
    }

    @Override // android.view.View
    public boolean requestRectangleOnScreen(@q0 Rect rect) {
        boolean requestRectangleOnScreen = super.requestRectangleOnScreen(rect);
        TextInputLayout d6 = d();
        if (d6 != null && this.f14385t) {
            this.f14384s.set(0, d6.getHeight() - getResources().getDimensionPixelOffset(a.f.f29581w4), d6.getWidth(), d6.getHeight());
            d6.requestRectangleOnScreen(this.f14384s, true);
        }
        return requestRectangleOnScreen;
    }

    public TextInputEditText(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.F4);
    }

    public TextInputEditText(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(v1.a.c(context, attributeSet, i5, 0), attributeSet, i5);
        this.f14384s = new Rect();
        TypedArray j5 = n.j(context, attributeSet, a.o.Xq, i5, a.n.Ba, new int[0]);
        g(j5.getBoolean(a.o.Yq, false));
        j5.recycle();
    }
}
