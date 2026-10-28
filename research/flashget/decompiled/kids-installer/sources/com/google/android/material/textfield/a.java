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
import n1.a;

/* compiled from: ClearTextEndIconDelegate.java */
/* loaded from: classes3.dex */
class a extends com.google.android.material.textfield.e {

    /* renamed from: j, reason: collision with root package name */
    private static final int f14447j = 100;

    /* renamed from: k, reason: collision with root package name */
    private static final int f14448k = 150;

    /* renamed from: l, reason: collision with root package name */
    private static final float f14449l = 0.8f;

    /* renamed from: d, reason: collision with root package name */
    private final TextWatcher f14450d;

    /* renamed from: e, reason: collision with root package name */
    private final View.OnFocusChangeListener f14451e;

    /* renamed from: f, reason: collision with root package name */
    private final TextInputLayout.h f14452f;

    /* renamed from: g, reason: collision with root package name */
    private final TextInputLayout.i f14453g;

    /* renamed from: h, reason: collision with root package name */
    private AnimatorSet f14454h;

    /* renamed from: i, reason: collision with root package name */
    private ValueAnimator f14455i;

    /* compiled from: ClearTextEndIconDelegate.java */
    /* renamed from: com.google.android.material.textfield.a$a, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C0183a implements TextWatcher {
        C0183a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(@o0 Editable editable) {
            if (a.this.f14498a.F0() != null) {
                return;
            }
            a aVar = a.this;
            aVar.i(aVar.f14498a.hasFocus() && a.l(editable));
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i5, int i6, int i7) {
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class b implements View.OnFocusChangeListener {
        b() {
        }

        @Override // android.view.View.OnFocusChangeListener
        public void onFocusChange(View view, boolean z5) {
            a.this.i((TextUtils.isEmpty(((EditText) view).getText()) ^ true) && z5);
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
            Z.setOnFocusChangeListener(a.this.f14451e);
            Z.removeTextChangedListener(a.this.f14450d);
            Z.addTextChangedListener(a.this.f14450d);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    class d implements TextInputLayout.i {

        /* compiled from: ClearTextEndIconDelegate.java */
        /* renamed from: com.google.android.material.textfield.a$d$a, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        class RunnableC0184a implements Runnable {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ EditText f14460o;

            RunnableC0184a(EditText editText) {
                this.f14460o = editText;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f14460o.removeTextChangedListener(a.this.f14450d);
            }
        }

        d() {
        }

        @Override // com.google.android.material.textfield.TextInputLayout.i
        public void a(@o0 TextInputLayout textInputLayout, int i5) {
            EditText Z = textInputLayout.Z();
            if (Z == null || i5 != 2) {
                return;
            }
            Z.post(new RunnableC0184a(Z));
            if (Z.getOnFocusChangeListener() == a.this.f14451e) {
                Z.setOnFocusChangeListener(null);
            }
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class e implements View.OnClickListener {
        e() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Editable text = a.this.f14498a.Z().getText();
            if (text != null) {
                text.clear();
            }
            a.this.f14498a.g1();
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class f extends AnimatorListenerAdapter {
        f() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            a.this.f14498a.U1(true);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class g extends AnimatorListenerAdapter {
        g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            a.this.f14498a.U1(false);
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class h implements ValueAnimator.AnimatorUpdateListener {
        h() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            a.this.f14500c.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* compiled from: ClearTextEndIconDelegate.java */
    /* loaded from: classes2.dex */
    class i implements ValueAnimator.AnimatorUpdateListener {
        i() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@o0 ValueAnimator valueAnimator) {
            float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            a.this.f14500c.setScaleX(floatValue);
            a.this.f14500c.setScaleY(floatValue);
        }
    }

    a(@o0 TextInputLayout textInputLayout) {
        super(textInputLayout);
        this.f14450d = new C0183a();
        this.f14451e = new b();
        this.f14452f = new c();
        this.f14453g = new d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(boolean z5) {
        boolean z6 = this.f14498a.N0() == z5;
        if (z5 && !this.f14454h.isRunning()) {
            this.f14455i.cancel();
            this.f14454h.start();
            if (z6) {
                this.f14454h.end();
                return;
            }
            return;
        }
        if (z5) {
            return;
        }
        this.f14454h.cancel();
        this.f14455i.start();
        if (z6) {
            this.f14455i.end();
        }
    }

    private ValueAnimator j(float... fArr) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f12778a);
        ofFloat.setDuration(100L);
        ofFloat.addUpdateListener(new h());
        return ofFloat;
    }

    private ValueAnimator k() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f14449l, 1.0f);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f12781d);
        ofFloat.setDuration(150L);
        ofFloat.addUpdateListener(new i());
        return ofFloat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean l(@o0 Editable editable) {
        return editable.length() > 0;
    }

    private void m() {
        ValueAnimator k5 = k();
        ValueAnimator j5 = j(0.0f, 1.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        this.f14454h = animatorSet;
        animatorSet.playTogether(k5, j5);
        this.f14454h.addListener(new f());
        ValueAnimator j6 = j(1.0f, 0.0f);
        this.f14455i = j6;
        j6.addListener(new g());
    }

    @Override // com.google.android.material.textfield.e
    void a() {
        this.f14498a.O1(androidx.appcompat.content.res.a.d(this.f14499b, a.g.f29617f1));
        TextInputLayout textInputLayout = this.f14498a;
        textInputLayout.M1(textInputLayout.getResources().getText(a.m.I));
        this.f14498a.Q1(new e());
        this.f14498a.e(this.f14452f);
        this.f14498a.f(this.f14453g);
        m();
    }

    @Override // com.google.android.material.textfield.e
    void c(boolean z5) {
        if (this.f14498a.F0() == null) {
            return;
        }
        i(z5);
    }
}
