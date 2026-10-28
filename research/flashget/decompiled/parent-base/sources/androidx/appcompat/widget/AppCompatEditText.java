package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.c1;
import androidx.annotation.l1;
import androidx.core.view.s1;
import androidx.core.view.x1;
import d.a;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements s1, androidx.core.view.f1, c0, androidx.core.widget.v {

    /* renamed from: b, reason: collision with root package name */
    private final e f1465b;

    /* renamed from: c, reason: collision with root package name */
    private final q f1466c;

    /* renamed from: d, reason: collision with root package name */
    private final p f1467d;

    /* renamed from: e, reason: collision with root package name */
    private final androidx.core.widget.s f1468e;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.o0
    private final i f1469f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.q0
    private a f1470g;

    @androidx.annotation.x0(api = 26)
    class a {
        a() {
        }

        @androidx.annotation.q0
        public TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @l1
    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    private a d() {
        if (this.f1470g == null) {
            this.f1470g = new a();
        }
        return this.f1470g;
    }

    @Override // androidx.core.view.f1
    @androidx.annotation.q0
    public androidx.core.view.e a(@androidx.annotation.o0 androidx.core.view.e eVar) {
        return this.f1468e.a(this, eVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.f1465b;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.f1466c;
        if (qVar != null) {
            qVar.b();
        }
    }

    void e(i iVar) {
        KeyListener keyListener = getKeyListener();
        if (iVar.b(keyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener a5 = iVar.a(keyListener);
            if (a5 == keyListener) {
                return;
            }
            super.setKeyListener(a5);
            super.setRawInputType(inputType);
            super.setFocusable(isFocusable);
            super.setClickable(isClickable);
            super.setLongClickable(isLongClickable);
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
        e eVar = this.f1465b;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.f1465b;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f1466c.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f1466c.k();
    }

    @Override // android.widget.TextView
    @androidx.annotation.o0
    @androidx.annotation.x0(api = 26)
    public TextClassifier getTextClassifier() {
        p pVar;
        return (Build.VERSION.SDK_INT >= 28 || (pVar = this.f1467d) == null) ? d().a() : pVar.a();
    }

    @Override // androidx.appcompat.widget.c0
    public boolean isEmojiCompatEnabled() {
        return this.f1469f.c();
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.q0
    public InputConnection onCreateInputConnection(@androidx.annotation.o0 EditorInfo editorInfo) {
        String[] k02;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f1466c.r(this, onCreateInputConnection, editorInfo);
        InputConnection a5 = k.a(onCreateInputConnection, editorInfo, this);
        if (a5 != null && Build.VERSION.SDK_INT <= 30 && (k02 = x1.k0(this)) != null) {
            androidx.core.view.inputmethod.c.i(editorInfo, k02);
            a5 = androidx.core.view.inputmethod.f.d(this, a5, editorInfo);
        }
        return this.f1469f.e(a5, editorInfo);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (n.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i4) {
        if (n.b(this, i4)) {
            return true;
        }
        return super.onTextContextMenuItem(i4);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.f1465b;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i4) {
        super.setBackgroundResource(i4);
        e eVar = this.f1465b;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1466c;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.f1466c;
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
        this.f1469f.f(z4);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@androidx.annotation.q0 KeyListener keyListener) {
        super.setKeyListener(this.f1469f.a(keyListener));
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        e eVar = this.f1465b;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        e eVar = this.f1465b;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f1466c.w(colorStateList);
        this.f1466c.b();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f1466c.x(mode);
        this.f1466c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        q qVar = this.f1466c;
        if (qVar != null) {
            qVar.q(context, i4);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(api = 26)
    public void setTextClassifier(@androidx.annotation.q0 TextClassifier textClassifier) {
        p pVar;
        if (Build.VERSION.SDK_INT >= 28 || (pVar = this.f1467d) == null) {
            d().b(textClassifier);
        } else {
            pVar.b(textClassifier);
        }
    }

    public AppCompatEditText(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.b.f73045t1);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @androidx.annotation.q0
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public AppCompatEditText(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(q0.b(context), attributeSet, i4);
        o0.a(this, getContext());
        e eVar = new e(this);
        this.f1465b = eVar;
        eVar.e(attributeSet, i4);
        q qVar = new q(this);
        this.f1466c = qVar;
        qVar.m(attributeSet, i4);
        qVar.b();
        this.f1467d = new p(this);
        this.f1468e = new androidx.core.widget.s();
        i iVar = new i(this);
        this.f1469f = iVar;
        iVar.d(attributeSet, i4);
        e(iVar);
    }
}
