package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.c1;
import androidx.appcompat.widget.j;
import androidx.core.view.q1;
import androidx.core.view.v1;
import androidx.core.view.y1;
import d.a;

/* loaded from: classes2.dex */
public class AppCompatEditText extends EditText implements v1, q1 {

    /* renamed from: o, reason: collision with root package name */
    private final d f868o;

    /* renamed from: p, reason: collision with root package name */
    private final t f869p;

    /* renamed from: q, reason: collision with root package name */
    private final n f870q;

    /* renamed from: r, reason: collision with root package name */
    private final androidx.core.widget.c0 f871r;

    public AppCompatEditText(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // androidx.core.view.q1
    @androidx.annotation.q0
    public androidx.core.view.g a(@androidx.annotation.o0 androidx.core.view.g gVar) {
        return this.f871r.a(this, gVar);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f868o;
        if (dVar != null) {
            dVar.b();
        }
        t tVar = this.f869p;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList e() {
        d dVar = this.f868o;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // android.widget.TextView
    @androidx.annotation.o0
    @androidx.annotation.x0(api = 26)
    public TextClassifier getTextClassifier() {
        n nVar;
        return (Build.VERSION.SDK_INT >= 28 || (nVar = this.f870q) == null) ? super.getTextClassifier() : nVar.a();
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode j() {
        d dVar = this.f868o;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(@androidx.annotation.q0 ColorStateList colorStateList) {
        d dVar = this.f868o;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        d dVar = this.f868o;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.TextView, android.view.View
    @androidx.annotation.q0
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f869p.r(this, onCreateInputConnection, editorInfo);
        InputConnection a6 = g.a(onCreateInputConnection, editorInfo, this);
        String[] h02 = y1.h0(this);
        if (a6 == null || h02 == null) {
            return a6;
        }
        androidx.core.view.inputmethod.g.h(editorInfo, h02);
        return androidx.core.view.inputmethod.i.e(a6, editorInfo, new j.a(this));
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (j.b(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i5) {
        if (j.c(this, i5)) {
            return true;
        }
        return super.onTextContextMenuItem(i5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f868o;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i5) {
        super.setBackgroundResource(i5);
        d dVar = this.f868o;
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
        t tVar = this.f869p;
        if (tVar != null) {
            tVar.q(context, i5);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(api = 26)
    public void setTextClassifier(@androidx.annotation.q0 TextClassifier textClassifier) {
        n nVar;
        if (Build.VERSION.SDK_INT >= 28 || (nVar = this.f870q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            nVar.b(textClassifier);
        }
    }

    public AppCompatEditText(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f21633r1);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @androidx.annotation.q0
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    public AppCompatEditText(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(w0.b(context), attributeSet, i5);
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f868o = dVar;
        dVar.e(attributeSet, i5);
        t tVar = new t(this);
        this.f869p = tVar;
        tVar.m(attributeSet, i5);
        tVar.b();
        this.f870q = new n(this);
        this.f871r = new androidx.core.widget.c0();
    }
}
