package com.google.android.material.textfield;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.x1;
import java.util.ArrayList;
import java.util.List;
import s8.a;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes6.dex */
final class f {
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 2;

    /* renamed from: v, reason: collision with root package name */
    private static final int f54356v = 217;

    /* renamed from: w, reason: collision with root package name */
    private static final int f54357w = 167;

    /* renamed from: x, reason: collision with root package name */
    static final int f54358x = 0;

    /* renamed from: y, reason: collision with root package name */
    static final int f54359y = 1;

    /* renamed from: z, reason: collision with root package name */
    static final int f54360z = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Context f54361a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final TextInputLayout f54362b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f54363c;

    /* renamed from: d, reason: collision with root package name */
    private int f54364d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f54365e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private Animator f54366f;

    /* renamed from: g, reason: collision with root package name */
    private final float f54367g;

    /* renamed from: h, reason: collision with root package name */
    private int f54368h;

    /* renamed from: i, reason: collision with root package name */
    private int f54369i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private CharSequence f54370j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f54371k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private TextView f54372l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private CharSequence f54373m;

    /* renamed from: n, reason: collision with root package name */
    private int f54374n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private ColorStateList f54375o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f54376p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f54377q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private TextView f54378r;

    /* renamed from: s, reason: collision with root package name */
    private int f54379s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private ColorStateList f54380t;

    /* renamed from: u, reason: collision with root package name */
    private Typeface f54381u;

    /* compiled from: IndicatorViewController.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f54382b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ TextView f54383c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f54384d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ TextView f54385e;

        a(int i4, TextView textView, int i5, TextView textView2) {
            this.f54382b = i4;
            this.f54383c = textView;
            this.f54384d = i5;
            this.f54385e = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f54368h = this.f54382b;
            f.this.f54366f = null;
            TextView textView = this.f54383c;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f54384d == 1 && f.this.f54372l != null) {
                    f.this.f54372l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f54385e;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f54385e.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f54385e;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(@o0 TextInputLayout textInputLayout) {
        this.f54361a = textInputLayout.getContext();
        this.f54362b = textInputLayout;
        this.f54367g = r0.getResources().getDimensionPixelSize(a.f.I1);
    }

    private boolean A(int i4) {
        return (i4 != 2 || this.f54378r == null || TextUtils.isEmpty(this.f54376p)) ? false : true;
    }

    private void F(int i4, int i5) {
        TextView m4;
        TextView m5;
        if (i4 == i5) {
            return;
        }
        if (i5 != 0 && (m5 = m(i5)) != null) {
            m5.setVisibility(0);
            m5.setAlpha(1.0f);
        }
        if (i4 != 0 && (m4 = m(i4)) != null) {
            m4.setVisibility(4);
            if (i4 == 1) {
                m4.setText((CharSequence) null);
            }
        }
        this.f54368h = i5;
    }

    private void N(@q0 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void P(@o0 ViewGroup viewGroup, int i4) {
        if (i4 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean Q(@q0 TextView textView, @q0 CharSequence charSequence) {
        return x1.Y0(this.f54362b) && this.f54362b.isEnabled() && !(this.f54369i == this.f54368h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void T(int i4, int i5, boolean z4) {
        if (i4 == i5) {
            return;
        }
        if (z4) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f54366f = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.f54377q, this.f54378r, 2, i4, i5);
            h(arrayList, this.f54371k, this.f54372l, 1, i4, i5);
            com.google.android.material.animation.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i5, m(i4), i4, m(i5)));
            animatorSet.start();
        } else {
            F(i4, i5);
        }
        this.f54362b.r3();
        this.f54362b.u3(z4);
        this.f54362b.E3();
    }

    private boolean f() {
        return (this.f54363c == null || this.f54362b.Z() == null) ? false : true;
    }

    private void h(@o0 List<Animator> list, boolean z4, @q0 TextView textView, int i4, int i5, int i6) {
        if (textView == null || !z4) {
            return;
        }
        if (i4 == i6 || i4 == i5) {
            list.add(i(textView, i6 == i4));
            if (i6 == i4) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z4) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z4 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f52466a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f54367g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f52469d);
        return ofFloat;
    }

    @q0
    private TextView m(int i4) {
        if (i4 == 1) {
            return this.f54372l;
        }
        if (i4 != 2) {
            return null;
        }
        return this.f54378r;
    }

    private int u(boolean z4, @q int i4, int i5) {
        return z4 ? this.f54361a.getResources().getDimensionPixelSize(i4) : i5;
    }

    private boolean z(int i4) {
        return (i4 != 1 || this.f54372l == null || TextUtils.isEmpty(this.f54370j)) ? false : true;
    }

    boolean B(int i4) {
        return i4 == 0 || i4 == 1;
    }

    boolean C() {
        return this.f54371k;
    }

    boolean D() {
        return this.f54377q;
    }

    void E(TextView textView, int i4) {
        FrameLayout frameLayout;
        if (this.f54363c == null) {
            return;
        }
        if (!B(i4) || (frameLayout = this.f54365e) == null) {
            this.f54363c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i5 = this.f54364d - 1;
        this.f54364d = i5;
        P(this.f54363c, i5);
    }

    void G(@q0 CharSequence charSequence) {
        this.f54373m = charSequence;
        TextView textView = this.f54372l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void H(boolean z4) {
        if (this.f54371k == z4) {
            return;
        }
        g();
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f54361a);
            this.f54372l = appCompatTextView;
            appCompatTextView.setId(a.h.w5);
            this.f54372l.setTextAlignment(5);
            Typeface typeface = this.f54381u;
            if (typeface != null) {
                this.f54372l.setTypeface(typeface);
            }
            I(this.f54374n);
            J(this.f54375o);
            G(this.f54373m);
            this.f54372l.setVisibility(4);
            x1.J1(this.f54372l, 1);
            d(this.f54372l, 0);
        } else {
            x();
            E(this.f54372l, 0);
            this.f54372l = null;
            this.f54362b.r3();
            this.f54362b.E3();
        }
        this.f54371k = z4;
    }

    void I(@h1 int i4) {
        this.f54374n = i4;
        TextView textView = this.f54372l;
        if (textView != null) {
            this.f54362b.b3(textView, i4);
        }
    }

    void J(@q0 ColorStateList colorStateList) {
        this.f54375o = colorStateList;
        TextView textView = this.f54372l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void K(@h1 int i4) {
        this.f54379s = i4;
        TextView textView = this.f54378r;
        if (textView != null) {
            textView.setTextAppearance(i4);
        }
    }

    void L(boolean z4) {
        if (this.f54377q == z4) {
            return;
        }
        g();
        if (z4) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f54361a);
            this.f54378r = appCompatTextView;
            appCompatTextView.setId(a.h.x5);
            this.f54378r.setTextAlignment(5);
            Typeface typeface = this.f54381u;
            if (typeface != null) {
                this.f54378r.setTypeface(typeface);
            }
            this.f54378r.setVisibility(4);
            x1.J1(this.f54378r, 1);
            K(this.f54379s);
            M(this.f54380t);
            d(this.f54378r, 1);
        } else {
            y();
            E(this.f54378r, 1);
            this.f54378r = null;
            this.f54362b.r3();
            this.f54362b.E3();
        }
        this.f54377q = z4;
    }

    void M(@q0 ColorStateList colorStateList) {
        this.f54380t = colorStateList;
        TextView textView = this.f54378r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void O(Typeface typeface) {
        if (typeface != this.f54381u) {
            this.f54381u = typeface;
            N(this.f54372l, typeface);
            N(this.f54378r, typeface);
        }
    }

    void R(CharSequence charSequence) {
        g();
        this.f54370j = charSequence;
        this.f54372l.setText(charSequence);
        int i4 = this.f54368h;
        if (i4 != 1) {
            this.f54369i = 1;
        }
        T(i4, this.f54369i, Q(this.f54372l, charSequence));
    }

    void S(CharSequence charSequence) {
        g();
        this.f54376p = charSequence;
        this.f54378r.setText(charSequence);
        int i4 = this.f54368h;
        if (i4 != 2) {
            this.f54369i = 2;
        }
        T(i4, this.f54369i, Q(this.f54378r, charSequence));
    }

    void d(TextView textView, int i4) {
        if (this.f54363c == null && this.f54365e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f54361a);
            this.f54363c = linearLayout;
            linearLayout.setOrientation(0);
            this.f54362b.addView(this.f54363c, -1, -2);
            this.f54365e = new FrameLayout(this.f54361a);
            this.f54363c.addView(this.f54365e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f54362b.Z() != null) {
                e();
            }
        }
        if (B(i4)) {
            this.f54365e.setVisibility(0);
            this.f54365e.addView(textView);
        } else {
            this.f54363c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f54363c.setVisibility(0);
        this.f54364d++;
    }

    void e() {
        if (f()) {
            EditText Z = this.f54362b.Z();
            boolean g4 = com.google.android.material.resources.c.g(this.f54361a);
            LinearLayout linearLayout = this.f54363c;
            int i4 = a.f.f90883w2;
            linearLayout.setPaddingRelative(u(g4, i4, x1.n0(Z)), u(g4, a.f.f90888x2, this.f54361a.getResources().getDimensionPixelSize(a.f.f90878v2)), u(g4, i4, Z.getPaddingEnd()), 0);
        }
    }

    void g() {
        Animator animator = this.f54366f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean k() {
        return z(this.f54368h);
    }

    boolean l() {
        return z(this.f54369i);
    }

    @q0
    CharSequence n() {
        return this.f54373m;
    }

    @q0
    CharSequence o() {
        return this.f54370j;
    }

    @androidx.annotation.l
    int p() {
        TextView textView = this.f54372l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @q0
    ColorStateList q() {
        TextView textView = this.f54372l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence r() {
        return this.f54376p;
    }

    @q0
    ColorStateList s() {
        TextView textView = this.f54378r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @androidx.annotation.l
    int t() {
        TextView textView = this.f54378r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    boolean v() {
        return A(this.f54368h);
    }

    boolean w() {
        return A(this.f54369i);
    }

    void x() {
        this.f54370j = null;
        g();
        if (this.f54368h == 1) {
            if (!this.f54377q || TextUtils.isEmpty(this.f54376p)) {
                this.f54369i = 0;
            } else {
                this.f54369i = 2;
            }
        }
        T(this.f54368h, this.f54369i, Q(this.f54372l, null));
    }

    void y() {
        g();
        int i4 = this.f54368h;
        if (i4 == 2) {
            this.f54369i = 0;
        }
        T(i4, this.f54369i, Q(this.f54378r, null));
    }
}
