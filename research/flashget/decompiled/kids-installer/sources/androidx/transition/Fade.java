package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.y1;

/* loaded from: classes3.dex */
public class Fade extends Visibility {

    /* renamed from: t0, reason: collision with root package name */
    public static final int f9763t0 = 1;

    /* renamed from: u0, reason: collision with root package name */
    public static final int f9764u0 = 2;

    /* renamed from: s0, reason: collision with root package name */
    private static final String f9762s0 = "Fade";

    /* renamed from: r0, reason: collision with root package name */
    private static final String f9761r0 = "android:fade:transitionAlpha";

    class a extends y {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f9765a;

        a(View view) {
            this.f9765a = view;
        }

        @Override // androidx.transition.y, androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            q0.h(this.f9765a, 1.0f);
            q0.a(this.f9765a);
            transition.u0(this);
        }
    }

    /* loaded from: classes.dex */
    private static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        private final View f9767a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f9768b = false;

        b(View view) {
            this.f9767a = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            q0.h(this.f9767a, 1.0f);
            if (this.f9768b) {
                this.f9767a.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (y1.L0(this.f9767a) && this.f9767a.getLayerType() == 0) {
                this.f9768b = true;
                this.f9767a.setLayerType(2, null);
            }
        }
    }

    public Fade(int i5) {
        Y0(i5);
    }

    private Animator Z0(View view, float f6, float f7) {
        if (f6 == f7) {
            return null;
        }
        q0.h(view, f6);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, q0.f9951c, f7);
        ofFloat.addListener(new b(view));
        a(new a(view));
        return ofFloat;
    }

    private static float a1(d0 d0Var, float f6) {
        Float f7;
        return (d0Var == null || (f7 = (Float) d0Var.f9859a.get("android:fade:transitionAlpha")) == null) ? f6 : f7.floatValue();
    }

    @Override // androidx.transition.Visibility
    public Animator U0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        float a12 = a1(d0Var, 0.0f);
        return Z0(view, a12 != 1.0f ? a12 : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    public Animator W0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        q0.e(view);
        return Z0(view, a1(d0Var, 1.0f), 0.0f);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void o(@androidx.annotation.o0 d0 d0Var) {
        super.o(d0Var);
        d0Var.f9859a.put("android:fade:transitionAlpha", Float.valueOf(q0.c(d0Var.f9860b)));
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, w.f10085f);
        Y0(androidx.core.content.res.p.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, Q0()));
        obtainStyledAttributes.recycle();
    }
}
