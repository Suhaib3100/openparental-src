package androidx.appcompat.widget;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.l1;
import androidx.core.text.p;
import androidx.core.view.s1;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/* loaded from: classes.dex */
public class AppCompatTextView extends TextView implements s1, androidx.core.widget.v, androidx.core.widget.b, c0 {
    private final e mBackgroundTintHelper;

    @androidx.annotation.o0
    private j mEmojiTextViewHelper;
    private boolean mIsSetTypefaceProcessing;

    @androidx.annotation.q0
    private Future<androidx.core.text.p> mPrecomputedTextFuture;

    @androidx.annotation.q0
    private a mSuperCaller;
    private final p mTextClassifierHelper;
    private final q mTextHelper;

    private interface a {
        void a(@androidx.annotation.u0 int i4);

        TextClassifier b();

        void c(@androidx.annotation.q0 TextClassifier textClassifier);

        void d(@androidx.annotation.u0 int i4);

        int getAutoSizeMaxTextSize();

        int getAutoSizeMinTextSize();

        int getAutoSizeStepGranularity();

        int[] getAutoSizeTextAvailableSizes();

        int getAutoSizeTextType();

        void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7);

        void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4);

        void setAutoSizeTextTypeWithDefaults(int i4);
    }

    @androidx.annotation.x0(api = 26)
    class b implements a {
        b() {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void a(int i4) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public TextClassifier b() {
            return AppCompatTextView.super.getTextClassifier();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void c(@androidx.annotation.q0 TextClassifier textClassifier) {
            AppCompatTextView.super.setTextClassifier(textClassifier);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void d(int i4) {
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMaxTextSize() {
            return AppCompatTextView.super.getAutoSizeMaxTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeMinTextSize() {
            return AppCompatTextView.super.getAutoSizeMinTextSize();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeStepGranularity() {
            return AppCompatTextView.super.getAutoSizeStepGranularity();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int[] getAutoSizeTextAvailableSizes() {
            return AppCompatTextView.super.getAutoSizeTextAvailableSizes();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public int getAutoSizeTextType() {
            return AppCompatTextView.super.getAutoSizeTextType();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.a
        public void setAutoSizeTextTypeWithDefaults(int i4) {
            AppCompatTextView.super.setAutoSizeTextTypeWithDefaults(i4);
        }
    }

    @androidx.annotation.x0(api = 28)
    class c extends b {
        c() {
            super();
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void a(@androidx.annotation.u0 int i4) {
            AppCompatTextView.super.setLastBaselineToBottomHeight(i4);
        }

        @Override // androidx.appcompat.widget.AppCompatTextView.b, androidx.appcompat.widget.AppCompatTextView.a
        public void d(@androidx.annotation.u0 int i4) {
            AppCompatTextView.super.setFirstBaselineToTopHeight(i4);
        }
    }

    public AppCompatTextView(@androidx.annotation.o0 Context context) {
        this(context, null);
    }

    private void consumeTextFutureAndSetBlocking() {
        Future<androidx.core.text.p> future = this.mPrecomputedTextFuture;
        if (future != null) {
            try {
                this.mPrecomputedTextFuture = null;
                androidx.core.widget.q.C(this, future.get());
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @androidx.annotation.o0
    private j getEmojiTextViewHelper() {
        if (this.mEmojiTextViewHelper == null) {
            this.mEmojiTextViewHelper = new j(this);
        }
        return this.mEmojiTextViewHelper;
    }

    @Override // android.widget.TextView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.b();
        }
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.b();
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMaxTextSize() {
        if (e1.f1834c) {
            return getSuperCaller().getAutoSizeMaxTextSize();
        }
        q qVar = this.mTextHelper;
        if (qVar != null) {
            return qVar.e();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeMinTextSize() {
        if (e1.f1834c) {
            return getSuperCaller().getAutoSizeMinTextSize();
        }
        q qVar = this.mTextHelper;
        if (qVar != null) {
            return qVar.f();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int getAutoSizeStepGranularity() {
        if (e1.f1834c) {
            return getSuperCaller().getAutoSizeStepGranularity();
        }
        q qVar = this.mTextHelper;
        if (qVar != null) {
            return qVar.g();
        }
        return -1;
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public int[] getAutoSizeTextAvailableSizes() {
        if (e1.f1834c) {
            return getSuperCaller().getAutoSizeTextAvailableSizes();
        }
        q qVar = this.mTextHelper;
        return qVar != null ? qVar.h() : new int[0];
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    @SuppressLint({"WrongConstant"})
    public int getAutoSizeTextType() {
        if (e1.f1834c) {
            return getSuperCaller().getAutoSizeTextType() == 1 ? 1 : 0;
        }
        q qVar = this.mTextHelper;
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

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return androidx.core.widget.q.i(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return androidx.core.widget.q.j(this);
    }

    @l1
    @androidx.annotation.x0(api = 26)
    a getSuperCaller() {
        if (this.mSuperCaller == null) {
            int i4 = Build.VERSION.SDK_INT;
            if (i4 >= 28) {
                this.mSuperCaller = new c();
            } else if (i4 >= 26) {
                this.mSuperCaller = new b();
            }
        }
        return this.mSuperCaller;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportBackgroundTintList() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.c();
        }
        return null;
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            return eVar.d();
        }
        return null;
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.j();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.q0
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        consumeTextFutureAndSetBlocking();
        return super.getText();
    }

    @Override // android.widget.TextView
    @androidx.annotation.o0
    @androidx.annotation.x0(api = 26)
    public TextClassifier getTextClassifier() {
        p pVar;
        return (Build.VERSION.SDK_INT >= 28 || (pVar = this.mTextClassifierHelper) == null) ? getSuperCaller().b() : pVar.a();
    }

    @androidx.annotation.o0
    public p.b getTextMetricsParamsCompat() {
        return androidx.core.widget.q.o(this);
    }

    @Override // androidx.appcompat.widget.c0
    public boolean isEmojiCompatEnabled() {
        return getEmojiTextViewHelper().b();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.r(this, onCreateInputConnection, editorInfo);
        return k.a(onCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.o(z4, i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i4, int i5) {
        consumeTextFutureAndSetBlocking();
        super.onMeasure(i4, i5);
    }

    @Override // android.widget.TextView
    protected void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        super.onTextChanged(charSequence, i4, i5, i6);
        q qVar = this.mTextHelper;
        if (qVar == null || e1.f1834c || !qVar.l()) {
            return;
        }
        this.mTextHelper.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z4) {
        super.setAllCaps(z4);
        getEmojiTextViewHelper().d(z4);
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithConfiguration(int i4, int i5, int i6, int i7) throws IllegalArgumentException {
        if (e1.f1834c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithConfiguration(i4, i5, i6, i7);
            return;
        }
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.t(i4, i5, i6, i7);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeUniformWithPresetSizes(@androidx.annotation.o0 int[] iArr, int i4) throws IllegalArgumentException {
        if (e1.f1834c) {
            getSuperCaller().setAutoSizeTextTypeUniformWithPresetSizes(iArr, i4);
            return;
        }
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.u(iArr, i4);
        }
    }

    @Override // android.widget.TextView, androidx.core.widget.b
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setAutoSizeTextTypeWithDefaults(int i4) {
        if (e1.f1834c) {
            getSuperCaller().setAutoSizeTextTypeWithDefaults(i4);
            return;
        }
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.v(i4);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@androidx.annotation.q0 Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(@androidx.annotation.v int i4) {
        super.setBackgroundResource(i4);
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.g(i4);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelative(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(@androidx.annotation.q0 Drawable drawable, @androidx.annotation.q0 Drawable drawable2, @androidx.annotation.q0 Drawable drawable3, @androidx.annotation.q0 Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        q qVar = this.mTextHelper;
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
        getEmojiTextViewHelper().e(z4);
    }

    @Override // android.widget.TextView
    public void setFilters(@androidx.annotation.o0 InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(@androidx.annotation.u0 @androidx.annotation.g0(from = 0) int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().d(i4);
        } else {
            androidx.core.widget.q.y(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(@androidx.annotation.u0 @androidx.annotation.g0(from = 0) int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            getSuperCaller().a(i4);
        } else {
            androidx.core.widget.q.z(this, i4);
        }
    }

    @Override // android.widget.TextView
    public void setLineHeight(@androidx.annotation.u0 @androidx.annotation.g0(from = 0) int i4) {
        androidx.core.widget.q.A(this, i4);
    }

    public void setPrecomputedText(@androidx.annotation.o0 androidx.core.text.p pVar) {
        androidx.core.widget.q.C(this, pVar);
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.i(colorStateList);
        }
    }

    @Override // androidx.core.view.s1
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportBackgroundTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        e eVar = this.mBackgroundTintHelper;
        if (eVar != null) {
            eVar.j(mode);
        }
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintList(@androidx.annotation.q0 ColorStateList colorStateList) {
        this.mTextHelper.w(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.v
    @androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setSupportCompoundDrawablesTintMode(@androidx.annotation.q0 PorterDuff.Mode mode) {
        this.mTextHelper.x(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i4) {
        super.setTextAppearance(context, i4);
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.q(context, i4);
        }
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(api = 26)
    public void setTextClassifier(@androidx.annotation.q0 TextClassifier textClassifier) {
        p pVar;
        if (Build.VERSION.SDK_INT >= 28 || (pVar = this.mTextClassifierHelper) == null) {
            getSuperCaller().c(textClassifier);
        } else {
            pVar.b(textClassifier);
        }
    }

    public void setTextFuture(@androidx.annotation.q0 Future<androidx.core.text.p> future) {
        this.mPrecomputedTextFuture = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(@androidx.annotation.o0 p.b bVar) {
        androidx.core.widget.q.E(this, bVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i4, float f4) {
        if (e1.f1834c) {
            super.setTextSize(i4, f4);
            return;
        }
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.A(i4, f4);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(@androidx.annotation.q0 Typeface typeface, int i4) {
        if (this.mIsSetTypefaceProcessing) {
            return;
        }
        Typeface b5 = (typeface == null || i4 <= 0) ? null : androidx.core.graphics.v0.b(getContext(), typeface, i4);
        this.mIsSetTypefaceProcessing = true;
        if (b5 != null) {
            typeface = b5;
        }
        try {
            super.setTypeface(typeface, i4);
        } finally {
            this.mIsSetTypefaceProcessing = false;
        }
    }

    public AppCompatTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    public AppCompatTextView(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet, int i4) {
        super(q0.b(context), attributeSet, i4);
        this.mIsSetTypefaceProcessing = false;
        this.mSuperCaller = null;
        o0.a(this, getContext());
        e eVar = new e(this);
        this.mBackgroundTintHelper = eVar;
        eVar.e(attributeSet, i4);
        q qVar = new q(this);
        this.mTextHelper = qVar;
        qVar.m(attributeSet, i4);
        qVar.b();
        this.mTextClassifierHelper = new p(this);
        getEmojiTextViewHelper().c(attributeSet, i4);
    }

    @Override // android.widget.TextView
    @androidx.annotation.x0(17)
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i4 != 0 ? e.a.b(context, i4) : null, i5 != 0 ? e.a.b(context, i5) : null, i6 != 0 ? e.a.b(context, i6) : null, i7 != 0 ? e.a.b(context, i7) : null);
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i4, int i5, int i6, int i7) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i4 != 0 ? e.a.b(context, i4) : null, i5 != 0 ? e.a.b(context, i5) : null, i6 != 0 ? e.a.b(context, i6) : null, i7 != 0 ? e.a.b(context, i7) : null);
        q qVar = this.mTextHelper;
        if (qVar != null) {
            qVar.p();
        }
    }
}
