package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;
import androidx.transition.s;

/* compiled from: TranslationAnimationCreator.java */
/* loaded from: classes.dex */
class f0 {

    /* compiled from: TranslationAnimationCreator.java */
    /* loaded from: classes3.dex */
    private static class a extends AnimatorListenerAdapter implements Transition.h {

        /* renamed from: a, reason: collision with root package name */
        private final View f9878a;

        /* renamed from: b, reason: collision with root package name */
        private final View f9879b;

        /* renamed from: c, reason: collision with root package name */
        private final int f9880c;

        /* renamed from: d, reason: collision with root package name */
        private final int f9881d;

        /* renamed from: e, reason: collision with root package name */
        private int[] f9882e;

        /* renamed from: f, reason: collision with root package name */
        private float f9883f;

        /* renamed from: g, reason: collision with root package name */
        private float f9884g;

        /* renamed from: h, reason: collision with root package name */
        private final float f9885h;

        /* renamed from: i, reason: collision with root package name */
        private final float f9886i;

        a(View view, View view2, int i5, int i6, float f6, float f7) {
            this.f9879b = view;
            this.f9878a = view2;
            this.f9880c = i5 - Math.round(view.getTranslationX());
            this.f9881d = i6 - Math.round(view.getTranslationY());
            this.f9885h = f6;
            this.f9886i = f7;
            int i7 = s.e.J;
            int[] iArr = (int[]) view2.getTag(i7);
            this.f9882e = iArr;
            if (iArr != null) {
                view2.setTag(i7, null);
            }
        }

        @Override // androidx.transition.Transition.h
        public void a(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void b(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void c(@androidx.annotation.o0 Transition transition) {
            this.f9879b.setTranslationX(this.f9885h);
            this.f9879b.setTranslationY(this.f9886i);
            transition.u0(this);
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f9882e == null) {
                this.f9882e = new int[2];
            }
            this.f9882e[0] = Math.round(this.f9879b.getTranslationX() + this.f9880c);
            this.f9882e[1] = Math.round(this.f9879b.getTranslationY() + this.f9881d);
            this.f9878a.setTag(s.e.J, this.f9882e);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f9883f = this.f9879b.getTranslationX();
            this.f9884g = this.f9879b.getTranslationY();
            this.f9879b.setTranslationX(this.f9885h);
            this.f9879b.setTranslationY(this.f9886i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f9879b.setTranslationX(this.f9883f);
            this.f9879b.setTranslationY(this.f9884g);
        }
    }

    private f0() {
    }

    @androidx.annotation.q0
    static Animator a(@androidx.annotation.o0 View view, @androidx.annotation.o0 d0 d0Var, int i5, int i6, float f6, float f7, float f8, float f9, @androidx.annotation.q0 TimeInterpolator timeInterpolator, @androidx.annotation.o0 Transition transition) {
        float f10;
        float f11;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) d0Var.f9860b.getTag(s.e.J)) != null) {
            f10 = (r4[0] - i5) + translationX;
            f11 = (r4[1] - i6) + translationY;
        } else {
            f10 = f6;
            f11 = f7;
        }
        int round = Math.round(f10 - translationX) + i5;
        int round2 = Math.round(f11 - translationY) + i6;
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f8 && f11 == f9) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f8), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f9));
        a aVar = new a(view, d0Var.f9860b, round, round2, translationX, translationY);
        transition.a(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
