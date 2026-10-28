package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import androidx.annotation.c1;
import androidx.core.view.v1;
import d.a;

/* loaded from: classes2.dex */
public class AppCompatAutoCompleteTextView extends AutoCompleteTextView implements v1 {

    /* renamed from: q, reason: collision with root package name */
    private static final int[] f858q = {R.attr.popupBackground};

    /* renamed from: o, reason: collision with root package name */
    private final d f859o;

    /* renamed from: p, reason: collision with root package name */
    private final t f860p;

    public AppCompatAutoCompleteTextView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f859o;
        if (dVar != null) {
            dVar.b();
        }
        t tVar = this.f860p;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList e() {
        d dVar = this.f859o;
        if (dVar != null) {
            return dVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode j() {
        d dVar = this.f859o;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(@androidx.annotation.q0 ColorStateList colorStateList) {
        d dVar = this.f859o;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        d dVar = this.f859o;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return g.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f859o;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i5) {
        super.setBackgroundResource(i5);
        d dVar = this.f859o;
        if (dVar != null) {
            dVar.g(i5);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.H(this, callback));
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(@androidx.annotation.v int i5) {
        setDropDownBackgroundDrawable(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        t tVar = this.f860p;
        if (tVar != null) {
            tVar.q(context, i5);
        }
    }

    public AppCompatAutoCompleteTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.T);
    }

    public AppCompatAutoCompleteTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(w0.b(context), attributeSet, i5);
        u0.a(this, getContext());
        z0 G = z0.G(getContext(), attributeSet, f858q, i5, 0);
        if (G.C(0)) {
            setDropDownBackgroundDrawable(G.h(0));
        }
        G.I();
        d dVar = new d(this);
        this.f859o = dVar;
        dVar.e(attributeSet, i5);
        t tVar = new t(this);
        this.f860p = tVar;
        tVar.m(attributeSet, i5);
        tVar.b();
    }
}
