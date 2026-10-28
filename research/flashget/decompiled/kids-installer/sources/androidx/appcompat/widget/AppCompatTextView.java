package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.core.graphics.l2;
import androidx.core.text.w;
import androidx.core.view.v1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes2.dex */
public class AppCompatTextView extends TextView implements v1, androidx.core.widget.f0, androidx.core.widget.b {

    /* renamed from: o, reason: collision with root package name */
    private final d f918o;

    /* renamed from: p, reason: collision with root package name */
    private final t f919p;

    /* renamed from: q, reason: collision with root package name */
    private final n f920q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f921r;

    /* renamed from: s, reason: collision with root package name */
    @androidx.annotation.q0
    private Future<androidx.core.text.w> f922s;

    public AppCompatTextView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private void p() {
        Future<androidx.core.text.w> future = this.f922s;
        if (future != null) {
            try {
                this.f922s = null;
                androidx.core.widget.s.D(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // androidx.core.widget.f0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void a(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.f919p.x(mode);
        this.f919p.b();
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        d dVar = this.f918o;
        if (dVar != null) {
            dVar.b();
        }
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.b();
        }
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList e() {
        d dVar = this.f918o;
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
        t tVar = this.f919p;
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
        t tVar = this.f919p;
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
        t tVar = this.f919p;
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
        t tVar = this.f919p;
        return tVar != null ? tVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (androidx.core.widget.b.f5874a) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        t tVar = this.f919p;
        if (tVar != null) {
            return tVar.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.s.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.s.j(this);
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        p();
        return super.getText();
    }

    @Override // android.widget.TextView
    @androidx.annotation.o0
    @androidx.annotation.x0(api = 26)
    public TextClassifier getTextClassifier() {
        n nVar;
        return (Build.VERSION.SDK_INT >= 28 || (nVar = this.f920q) == null) ? super.getTextClassifier() : nVar.a();
    }

    @Override // androidx.core.widget.f0
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode h() {
        return this.f919p.k();
    }

    @Override // androidx.core.widget.f0
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList i() {
        return this.f919p.j();
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode j() {
        d dVar = this.f918o;
        if (dVar != null) {
            return dVar.d();
        }
        return null;
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void m(@androidx.annotation.q0 ColorStateList colorStateList) {
        d dVar = this.f918o;
        if (dVar != null) {
            dVar.i(colorStateList);
        }
    }

    @Override // androidx.core.widget.f0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void n(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.f919p.w(colorStateList);
        this.f919p.b();
    }

    @Override // androidx.core.view.v1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void o(@androidx.annotation.q0 PorterDuff.Mode mode) {
        d dVar = this.f918o;
        if (dVar != null) {
            dVar.j(mode);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f919p.r(this, onCreateInputConnection, editorInfo);
        return g.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.o(z5, i5, i6, i7, i8);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i5, int i6) {
        p();
        super.onMeasure(i5, i6);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        super.onTextChanged(charSequence, i5, i6, i7);
        t tVar = this.f919p;
        if (tVar == null || androidx.core.widget.b.f5874a || !tVar.l()) {
            return;
        }
        this.f919p.c();
    }

    @androidx.annotation.o0
    public w.a q() {
        return androidx.core.widget.s.o(this);
    }

    public void r(@androidx.annotation.o0 androidx.core.text.w wVar) {
        androidx.core.widget.s.D(this, wVar);
    }

    public void s(@androidx.annotation.q0 Future<androidx.core.text.w> future) {
        this.f922s = future;
        if (future != null) {
            requestLayout();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i5, int i6, int i7, int i8) throws IllegalArgumentException {
        if (androidx.core.widget.b.f5874a) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i5, i6, i7, i8);
            return;
        }
        t tVar = this.f919p;
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
        t tVar = this.f919p;
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
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.v(i5);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        d dVar = this.f918o;
        if (dVar != null) {
            dVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i5) {
        super.setBackgroundResource(i5);
        d dVar = this.f918o;
        if (dVar != null) {
            dVar.g(i5);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(androidx.core.widget.s.H(this, callback));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@androidx.annotation.u0 @androidx.annotation.g0(from = 0) int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setFirstBaselineToTopHeight(i5);
        } else {
            androidx.core.widget.s.A(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@androidx.annotation.u0 @androidx.annotation.g0(from = 0) int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            super.setLastBaselineToBottomHeight(i5);
        } else {
            androidx.core.widget.s.B(this, i5);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@androidx.annotation.u0 @androidx.annotation.g0(from = 0) int i5) {
        androidx.core.widget.s.C(this, i5);
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.q(context, i5);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(api = 26)
    public void setTextClassifier(@androidx.annotation.q0 TextClassifier textClassifier) {
        n nVar;
        if (Build.VERSION.SDK_INT >= 28 || (nVar = this.f920q) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            nVar.b(textClassifier);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i5, float f6) {
        if (androidx.core.widget.b.f5874a) {
            super.setTextSize(i5, f6);
            return;
        }
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.A(i5, f6);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@androidx.annotation.q0 Typeface typeface, int i5) {
        if (this.f921r) {
            return;
        }
        Typeface b6 = (typeface == null || i5 <= 0) ? null : l2.b(getContext(), typeface, i5);
        this.f921r = true;
        if (b6 != null) {
            typeface = b6;
        }
        try {
            super.setTypeface(typeface, i5);
        } finally {
            this.f921r = false;
        }
    }

    public void t(@androidx.annotation.o0 w.a aVar) {
        androidx.core.widget.s.F(this, aVar);
    }

    public AppCompatTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i5) {
        super(w0.b(context), attributeSet, i5);
        this.f921r = false;
        u0.a(this, getContext());
        d dVar = new d(this);
        this.f918o = dVar;
        dVar.e(attributeSet, i5);
        t tVar = new t(this);
        this.f919p = tVar;
        tVar.m(attributeSet, i5);
        tVar.b();
        this.f920q = new n(this);
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i5 != 0 ? androidx.appcompat.content.res.a.d(context, i5) : null, i6 != 0 ? androidx.appcompat.content.res.a.d(context, i6) : null, i7 != 0 ? androidx.appcompat.content.res.a.d(context, i7) : null, i8 != 0 ? androidx.appcompat.content.res.a.d(context, i8) : null);
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i5, int i6, int i7, int i8) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i5 != 0 ? androidx.appcompat.content.res.a.d(context, i5) : null, i6 != 0 ? androidx.appcompat.content.res.a.d(context, i6) : null, i7 != 0 ? androidx.appcompat.content.res.a.d(context, i7) : null, i8 != 0 ? androidx.appcompat.content.res.a.d(context, i8) : null);
        t tVar = this.f919p;
        if (tVar != null) {
            tVar.p();
        }
    }
}
