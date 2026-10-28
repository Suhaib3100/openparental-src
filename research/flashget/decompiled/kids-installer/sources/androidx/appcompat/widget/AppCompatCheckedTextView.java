package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;

/* loaded from: classes.dex */
public class AppCompatCheckedTextView extends CheckedTextView {

    /* renamed from: p, reason: collision with root package name */
    private static final int[] f866p = {R.attr.checkMark};

    /* renamed from: o, reason: collision with root package name */
    private final t f867o;

    public AppCompatCheckedTextView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        t tVar = this.f867o;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return g.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(@androidx.annotation.v int i5) {
        setCheckMarkDrawable(androidx.appcompat.content.res.a.d(getContext(), i5));
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.H(this, callback));
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        t tVar = this.f867o;
        if (tVar != null) {
            tVar.q(context, i5);
        }
    }

    public AppCompatCheckedTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.checkedTextViewStyle);
    }

    public AppCompatCheckedTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(w0.b(context), attributeSet, i5);
        u0.a(this, getContext());
        t tVar = new t(this);
        this.f867o = tVar;
        tVar.m(attributeSet, i5);
        tVar.b();
        z0 G = z0.G(getContext(), attributeSet, f866p, i5, 0);
        setCheckMarkDrawable(G.h(0));
        G.I();
    }
}
