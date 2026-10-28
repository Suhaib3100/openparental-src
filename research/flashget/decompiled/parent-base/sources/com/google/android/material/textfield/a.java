package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.o0;
import com.google.android.material.textfield.TextInputLayout;
import s8.a;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes6.dex */
class a extends com.google.android.material.textfield.e {

    /* renamed from: j, reason: collision with root package name */
    private static final int f54302j = 100;

    /* renamed from: k, reason: collision with root package name */
    private static final int f54303k = 150;

    /* renamed from: l, reason: collision with root package name */
    private static final float f54304l = 0.8f;

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f54305d;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnFocusChangeListener f54306e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.h f54307f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.i f54308g;

    /* renamed from: h, reason: collision with root package name */
    private AnimatorSet f54309h;

    /* renamed from: i, reason: collision with root package name */
    private ValueAnimator f54310i;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    class C0817a implements TextWatcher {
        C0817a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@o0 Editable editable) {
            if (a.this.f54353a.F0() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.f54353a.hasFocus() && a.l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i4, int i5, int i6) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z4) {
            a.this.i(!TextUtils.isEmpty(((EditText) view).getText()) && z4);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class c implements TextInputLayout.h {
        c() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.h
        public void a(@o0 TextInputLayout textInputLayout) {
            EditText Z = textInputLayout.Z();
            textInputLayout.U1(Z.hasFocus() && a.l(Z.getText()));
            textInputLayout.K1(false);
            Z.setOnFocusChangeListener(a.this.f54306e);
            Z.removeTextChangedListener(a.this.f54305d);
            Z.addTextChangedListener(a.this.f54305d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class d implements TextInputLayout.i {

        /* compiled from: ClearTextEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        class RunnableC0818a implements Runnable {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ EditText f54315b;

            RunnableC0818a(EditText editText) {
                this.f54315b = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f54315b.removeTextChangedListener(a.this.f54305d);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@o0 TextInputLayout textInputLayout, int i4) {
            EditText Z = textInputLayout.Z();
            if (Z == null || i4 != 2) {
                return;
            }
            Z.post(new RunnableC0818a(Z));
            if (Z.getOnFocusChangeListener() == a.this.f54306e) {
                Z.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f54353a.Z().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f54353a.g1();
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f54353a.U1(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f54353a.U1(false);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            a.this.f54355c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f54355c.setScaleX(floatValue);
            a.this.f54355c.setScaleY(floatValue);
        }
    }

    a(@o0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f54305d = new C0817a();
        this.f54306e = new b();
        this.f54307f = new c();
        this.f54308g = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z4) {
        boolean z5 = this.f54353a.N0() == z4;
        if (z4 && !this.f54309h.isRunning()) {
            this.f54310i.cancel();
            this.f54309h.start();
            if (z5) {
                this.f54309h.end();
                return;
            }
            return;
        }
        if (z4) {
            return;
        }
        this.f54309h.cancel();
        this.f54310i.start();
        if (z5) {
            this.f54310i.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f52466a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f54304l, 1.0f);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f52469d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(@o0 Editable editable) {
        return editable.length() > 0;
    }

    private void m() {
        ValueAnimator k4 = k();
        ValueAnimator j4 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f54309h = animatorSet;
        animatorSet.playTogether(k4, j4);
        this.f54309h.addListener(new f());
        ValueAnimator j5 = j(1.0f, 0.0f);
        this.f54310i = j5;
        j5.addListener(new g());
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f54353a.O1(e.a.b(this.f54354b, a.g.f90917f1));
        TextInputLayout textInputLayout = this.f54353a;
        textInputLayout.M1(textInputLayout.getResources().getText(a.m.I));
        this.f54353a.Q1(new e());
        this.f54353a.e(this.f54307f);
        this.f54353a.f(this.f54308g);
        m();
    }

    @Override // com.google.android.material.textfield.e
    void c(boolean z4) {
        if (this.f54353a.F0() == null) {
            return;
        }
        i(z4);
    }
}
