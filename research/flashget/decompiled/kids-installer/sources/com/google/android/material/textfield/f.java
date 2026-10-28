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
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.y1;
import java.util.ArrayList;
import java.util.List;
import n1.a;

/* compiled from: IndicatorViewController.java */
/* loaded from: classes2.dex */
final class f {
    private static final int A = 0;
    private static final int B = 1;
    private static final int C = 2;

    /* renamed from: v, reason: collision with root package name */
    private static final int f14501v = 217;

    /* renamed from: w, reason: collision with root package name */
    private static final int f14502w = 167;

    /* renamed from: x, reason: collision with root package name */
    static final int f14503x = 0;

    /* renamed from: y, reason: collision with root package name */
    static final int f14504y = 1;

    /* renamed from: z, reason: collision with root package name */
    static final int f14505z = 2;

    /* renamed from: a, reason: collision with root package name */
    private final Context f14506a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final TextInputLayout f14507b;

    /* renamed from: c, reason: collision with root package name */
    private LinearLayout f14508c;

    /* renamed from: d, reason: collision with root package name */
    private int f14509d;

    /* renamed from: e, reason: collision with root package name */
    private FrameLayout f14510e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private Animator f14511f;

    /* renamed from: g, reason: collision with root package name */
    private final float f14512g;

    /* renamed from: h, reason: collision with root package name */
    private int f14513h;

    /* renamed from: i, reason: collision with root package name */
    private int f14514i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private CharSequence f14515j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14516k;

    /* renamed from: l, reason: collision with root package name */
    @q0
    private TextView f14517l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private CharSequence f14518m;

    /* renamed from: n, reason: collision with root package name */
    private int f14519n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private ColorStateList f14520o;

    /* renamed from: p, reason: collision with root package name */
    private CharSequence f14521p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f14522q;

    /* renamed from: r, reason: collision with root package name */
    @q0
    private TextView f14523r;

    /* renamed from: s, reason: collision with root package name */
    private int f14524s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private ColorStateList f14525t;

    /* renamed from: u, reason: collision with root package name */
    private Typeface f14526u;

    /* compiled from: IndicatorViewController.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f14527a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ TextView f14528b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f14529c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f14530d;

        a(int i5, TextView textView, int i6, TextView textView2) {
            this.f14527a = i5;
            this.f14528b = textView;
            this.f14529c = i6;
            this.f14530d = textView2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            f.this.f14513h = this.f14527a;
            f.this.f14511f = null;
            TextView textView = this.f14528b;
            if (textView != null) {
                textView.setVisibility(4);
                if (this.f14529c == 1 && f.this.f14517l != null) {
                    f.this.f14517l.setText((CharSequence) null);
                }
            }
            TextView textView2 = this.f14530d;
            if (textView2 != null) {
                textView2.setTranslationY(0.0f);
                this.f14530d.setAlpha(1.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            TextView textView = this.f14530d;
            if (textView != null) {
                textView.setVisibility(0);
            }
        }
    }

    public f(@o0 TextInputLayout textInputLayout) {
        this.f14506a = textInputLayout.getContext();
        this.f14507b = textInputLayout;
        this.f14512g = r0.getResources().getDimensionPixelSize(a.f.I1);
    }

    private boolean A(int i5) {
        return (i5 != 2 || this.f14523r == null || TextUtils.isEmpty(this.f14521p)) ? false : true;
    }

    private void F(int i5, int i6) {
        TextView m5;
        TextView m6;
        if (i5 == i6) {
            return;
        }
        if (i6 != 0 && (m6 = m(i6)) != null) {
            m6.setVisibility(0);
            m6.setAlpha(1.0f);
        }
        if (i5 != 0 && (m5 = m(i5)) != null) {
            m5.setVisibility(4);
            if (i5 == 1) {
                m5.setText((CharSequence) null);
            }
        }
        this.f14513h = i6;
    }

    private void N(@q0 TextView textView, Typeface typeface) {
        if (textView != null) {
            textView.setTypeface(typeface);
        }
    }

    private void P(@o0 ViewGroup viewGroup, int i5) {
        if (i5 == 0) {
            viewGroup.setVisibility(8);
        }
    }

    private boolean Q(@q0 TextView textView, @q0 CharSequence charSequence) {
        return y1.U0(this.f14507b) && this.f14507b.isEnabled() && !(this.f14514i == this.f14513h && textView != null && TextUtils.equals(textView.getText(), charSequence));
    }

    private void T(int i5, int i6, boolean z5) {
        if (i5 == i6) {
            return;
        }
        if (z5) {
            AnimatorSet animatorSet = new AnimatorSet();
            this.f14511f = animatorSet;
            ArrayList arrayList = new ArrayList();
            h(arrayList, this.f14522q, this.f14523r, 2, i5, i6);
            h(arrayList, this.f14516k, this.f14517l, 1, i5, i6);
            com.google.android.material.animation.b.a(animatorSet, arrayList);
            animatorSet.addListener(new a(i6, m(i5), i5, m(i6)));
            animatorSet.start();
        } else {
            F(i5, i6);
        }
        this.f14507b.r3();
        this.f14507b.u3(z5);
        this.f14507b.E3();
    }

    private boolean f() {
        return (this.f14508c == null || this.f14507b.Z() == null) ? false : true;
    }

    private void h(@o0 List<Animator> list, boolean z5, @q0 TextView textView, int i5, int i6, int i7) {
        if (textView == null || !z5) {
            return;
        }
        if (i5 == i7 || i5 == i6) {
            list.add(i(textView, i7 == i5));
            if (i7 == i5) {
                list.add(j(textView));
            }
        }
    }

    private ObjectAnimator i(TextView textView, boolean z5) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.ALPHA, z5 ? 1.0f : 0.0f);
        ofFloat.setDuration(167L);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f12778a);
        return ofFloat;
    }

    private ObjectAnimator j(TextView textView) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(textView, (Property<TextView, Float>) View.TRANSLATION_Y, -this.f14512g, 0.0f);
        ofFloat.setDuration(217L);
        ofFloat.setInterpolator(com.google.android.material.animation.a.f12781d);
        return ofFloat;
    }

    @q0
    private TextView m(int i5) {
        if (i5 == 1) {
            return this.f14517l;
        }
        if (i5 != 2) {
            return null;
        }
        return this.f14523r;
    }

    private int u(boolean z5, @q int i5, int i6) {
        return z5 ? this.f14506a.getResources().getDimensionPixelSize(i5) : i6;
    }

    private boolean z(int i5) {
        return (i5 != 1 || this.f14517l == null || TextUtils.isEmpty(this.f14515j)) ? false : true;
    }

    boolean B(int i5) {
        return i5 == 0 || i5 == 1;
    }

    boolean C() {
        return this.f14516k;
    }

    boolean D() {
        return this.f14522q;
    }

    void E(TextView textView, int i5) {
        FrameLayout frameLayout;
        if (this.f14508c == null) {
            return;
        }
        if (!B(i5) || (frameLayout = this.f14510e) == null) {
            this.f14508c.removeView(textView);
        } else {
            frameLayout.removeView(textView);
        }
        int i6 = this.f14509d - 1;
        this.f14509d = i6;
        P(this.f14508c, i6);
    }

    void G(@q0 CharSequence charSequence) {
        this.f14518m = charSequence;
        TextView textView = this.f14517l;
        if (textView != null) {
            textView.setContentDescription(charSequence);
        }
    }

    void H(boolean z5) {
        if (this.f14516k == z5) {
            return;
        }
        g();
        if (z5) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f14506a, null);
            this.f14517l = appCompatTextView;
            appCompatTextView.setId(a.h.w5);
            this.f14517l.setTextAlignment(5);
            Typeface typeface = this.f14526u;
            if (typeface != null) {
                this.f14517l.setTypeface(typeface);
            }
            I(this.f14519n);
            J(this.f14520o);
            G(this.f14518m);
            this.f14517l.setVisibility(4);
            y1.D1(this.f14517l, 1);
            d(this.f14517l, 0);
        } else {
            x();
            E(this.f14517l, 0);
            this.f14517l = null;
            this.f14507b.r3();
            this.f14507b.E3();
        }
        this.f14516k = z5;
    }

    void I(@h1 int i5) {
        this.f14519n = i5;
        TextView textView = this.f14517l;
        if (textView != null) {
            this.f14507b.b3(textView, i5);
        }
    }

    void J(@q0 ColorStateList colorStateList) {
        this.f14520o = colorStateList;
        TextView textView = this.f14517l;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void K(@h1 int i5) {
        this.f14524s = i5;
        TextView textView = this.f14523r;
        if (textView != null) {
            textView.setTextAppearance(i5);
        }
    }

    void L(boolean z5) {
        if (this.f14522q == z5) {
            return;
        }
        g();
        if (z5) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(this.f14506a, null);
            this.f14523r = appCompatTextView;
            appCompatTextView.setId(a.h.x5);
            this.f14523r.setTextAlignment(5);
            Typeface typeface = this.f14526u;
            if (typeface != null) {
                this.f14523r.setTypeface(typeface);
            }
            this.f14523r.setVisibility(4);
            y1.D1(this.f14523r, 1);
            K(this.f14524s);
            M(this.f14525t);
            d(this.f14523r, 1);
        } else {
            y();
            E(this.f14523r, 1);
            this.f14523r = null;
            this.f14507b.r3();
            this.f14507b.E3();
        }
        this.f14522q = z5;
    }

    void M(@q0 ColorStateList colorStateList) {
        this.f14525t = colorStateList;
        TextView textView = this.f14523r;
        if (textView == null || colorStateList == null) {
            return;
        }
        textView.setTextColor(colorStateList);
    }

    void O(Typeface typeface) {
        if (typeface != this.f14526u) {
            this.f14526u = typeface;
            N(this.f14517l, typeface);
            N(this.f14523r, typeface);
        }
    }

    void R(CharSequence charSequence) {
        g();
        this.f14515j = charSequence;
        this.f14517l.setText(charSequence);
        int i5 = this.f14513h;
        if (i5 != 1) {
            this.f14514i = 1;
        }
        T(i5, this.f14514i, Q(this.f14517l, charSequence));
    }

    void S(CharSequence charSequence) {
        g();
        this.f14521p = charSequence;
        this.f14523r.setText(charSequence);
        int i5 = this.f14513h;
        if (i5 != 2) {
            this.f14514i = 2;
        }
        T(i5, this.f14514i, Q(this.f14523r, charSequence));
    }

    void d(TextView textView, int i5) {
        if (this.f14508c == null && this.f14510e == null) {
            LinearLayout linearLayout = new LinearLayout(this.f14506a);
            this.f14508c = linearLayout;
            linearLayout.setOrientation(0);
            this.f14507b.addView(this.f14508c, -1, -2);
            this.f14510e = new FrameLayout(this.f14506a);
            this.f14508c.addView(this.f14510e, new LinearLayout.LayoutParams(0, -2, 1.0f));
            if (this.f14507b.Z() != null) {
                e();
            }
        }
        if (B(i5)) {
            this.f14510e.setVisibility(0);
            this.f14510e.addView(textView);
        } else {
            this.f14508c.addView(textView, new LinearLayout.LayoutParams(-2, -2));
        }
        this.f14508c.setVisibility(0);
        this.f14509d++;
    }

    void e() {
        if (f()) {
            EditText Z = this.f14507b.Z();
            boolean g5 = com.google.android.material.resources.c.g(this.f14506a);
            LinearLayout linearLayout = this.f14508c;
            int i5 = a.f.f29579w2;
            y1.d2(linearLayout, u(g5, i5, y1.k0(Z)), u(g5, a.f.f29585x2, this.f14506a.getResources().getDimensionPixelSize(a.f.f29573v2)), u(g5, i5, y1.j0(Z)), 0);
        }
    }

    void g() {
        Animator animator = this.f14511f;
        if (animator != null) {
            animator.cancel();
        }
    }

    boolean k() {
        return z(this.f14513h);
    }

    boolean l() {
        return z(this.f14514i);
    }

    @q0
    CharSequence n() {
        return this.f14518m;
    }

    @q0
    CharSequence o() {
        return this.f14515j;
    }

    @l
    int p() {
        TextView textView = this.f14517l;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    @q0
    ColorStateList q() {
        TextView textView = this.f14517l;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    CharSequence r() {
        return this.f14521p;
    }

    @q0
    ColorStateList s() {
        TextView textView = this.f14523r;
        if (textView != null) {
            return textView.getTextColors();
        }
        return null;
    }

    @l
    int t() {
        TextView textView = this.f14523r;
        if (textView != null) {
            return textView.getCurrentTextColor();
        }
        return -1;
    }

    boolean v() {
        return A(this.f14513h);
    }

    boolean w() {
        return A(this.f14514i);
    }

    void x() {
        this.f14515j = null;
        g();
        if (this.f14513h == 1) {
            if (!this.f14522q || TextUtils.isEmpty(this.f14521p)) {
                this.f14514i = 0;
            } else {
                this.f14514i = 2;
            }
        }
        T(this.f14513h, this.f14514i, Q(this.f14517l, null));
    }

    void y() {
        g();
        int i5 = this.f14513h;
        if (i5 == 2) {
            this.f14514i = 0;
        }
        T(i5, this.f14514i, Q(this.f14523r, null));
    }
}
