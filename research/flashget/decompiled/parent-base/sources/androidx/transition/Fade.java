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
import androidx.core.view.x1;

/* loaded from: classes3.dex */
public class Fade extends Visibility {
    private static final String R2 = "android:fade:transitionAlpha";
    private static final String S2 = "Fade";
    public static final int T2 = 1;
    public static final int U2 = 2;

    class a extends w {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f34285b;

        a(View view) {
            this.f34285b = view;
        }

        @Override // androidx.transition.w, androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            o0.h(this.f34285b, 1.0f);
            o0.a(this.f34285b);
            transition.q0(this);
        }
    }

    private static class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        private final View f34287b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f34288c = false;

        b(View view) {
            this.f34287b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            o0.h(this.f34287b, 1.0f);
            if (this.f34288c) {
                this.f34287b.setLayerType(0, null);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (x1.O0(this.f34287b) && this.f34287b.getLayerType() == 0) {
                this.f34288c = true;
                this.f34287b.setLayerType(2, null);
            }
        }
    }

    public Fade(int i4) {
        T0(i4);
    }

    private Animator U0(View view, float f4, float f5) {
        if (f4 == f5) {
            return null;
        }
        o0.h(view, f4);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, o0.f34452c, f5);
        ofFloat.addListener(new b(view));
        b(new a(view));
        return ofFloat;
    }

    private static float V0(b0 b0Var, float f4) {
        Float f5;
        return (b0Var == null || (f5 = (Float) b0Var.f34363a.get("android:fade:transitionAlpha")) == null) ? f4 : f5.floatValue();
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.q0
    public Animator P0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        float V0 = V0(b0Var, 0.0f);
        return U0(view, V0 != 1.0f ? V0 : 0.0f, 1.0f);
    }

    @Override // androidx.transition.Visibility
    @androidx.annotation.q0
    public Animator R0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        o0.e(view);
        return U0(view, V0(b0Var, 1.0f), 0.0f);
    }

    @Override // androidx.transition.Visibility, androidx.transition.Transition
    public void p(@androidx.annotation.o0 b0 b0Var) {
        super.p(b0Var);
        b0Var.f34363a.put("android:fade:transitionAlpha", Float.valueOf(o0.c(b0Var.f34364b)));
    }

    public Fade() {
    }

    @SuppressLint({"RestrictedApi"})
    public Fade(@androidx.annotation.o0 Context context, @androidx.annotation.o0 AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u.f35210f);
        T0(androidx.core.content.res.n.k(obtainStyledAttributes, (XmlResourceParser) attributeSet, "fadingMode", 0, L0()));
        obtainStyledAttributes.recycle();
    }
}
