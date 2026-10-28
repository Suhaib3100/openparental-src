package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.Transition;
import androidx.transition.q;

/* compiled from: TranslationAnimationCreator.java */
/* loaded from: classes3.dex */
class d0 {

    /* compiled from: TranslationAnimationCreator.java */
    private static class a extends AnimatorListenerAdapter implements Transition.h {

        /* renamed from: b, reason: collision with root package name */
        private final View f34376b;

        /* renamed from: c, reason: collision with root package name */
        private final View f34377c;

        /* renamed from: d, reason: collision with root package name */
        private final int f34378d;

        /* renamed from: e, reason: collision with root package name */
        private final int f34379e;

        /* renamed from: f, reason: collision with root package name */
        private int[] f34380f;

        /* renamed from: g, reason: collision with root package name */
        private float f34381g;

        /* renamed from: h, reason: collision with root package name */
        private float f34382h;

        /* renamed from: i, reason: collision with root package name */
        private final float f34383i;

        /* renamed from: j, reason: collision with root package name */
        private final float f34384j;

        a(View view, View view2, int i4, int i5, float f4, float f5) {
            this.f34377c = view;
            this.f34376b = view2;
            this.f34378d = i4 - Math.round(view.getTranslationX());
            this.f34379e = i5 - Math.round(view.getTranslationY());
            this.f34383i = f4;
            this.f34384j = f5;
            int i6 = q.g.T1;
            int[] iArr = (int[]) view2.getTag(i6);
            this.f34380f = iArr;
            if (iArr != null) {
                view2.setTag(i6, null);
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
        }

        @Override // androidx.transition.Transition.h
        public void d(@androidx.annotation.o0 Transition transition) {
            this.f34377c.setTranslationX(this.f34383i);
            this.f34377c.setTranslationY(this.f34384j);
            transition.q0(this);
        }

        @Override // androidx.transition.Transition.h
        public void e(@androidx.annotation.o0 Transition transition) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f34380f == null) {
                this.f34380f = new int[2];
            }
            this.f34380f[0] = Math.round(this.f34377c.getTranslationX() + this.f34378d);
            this.f34380f[1] = Math.round(this.f34377c.getTranslationY() + this.f34379e);
            this.f34376b.setTag(q.g.T1, this.f34380f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f34381g = this.f34377c.getTranslationX();
            this.f34382h = this.f34377c.getTranslationY();
            this.f34377c.setTranslationX(this.f34383i);
            this.f34377c.setTranslationY(this.f34384j);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f34377c.setTranslationX(this.f34381g);
            this.f34377c.setTranslationY(this.f34382h);
        }
    }

    private d0() {
    }

    @androidx.annotation.q0
    static Animator a(@androidx.annotation.o0 View view, @androidx.annotation.o0 b0 b0Var, int i4, int i5, float f4, float f5, float f6, float f7, @androidx.annotation.q0 TimeInterpolator timeInterpolator, @androidx.annotation.o0 Transition transition) {
        float f10;
        float f11;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) b0Var.f34364b.getTag(q.g.T1)) != null) {
            f10 = (r7[0] - i4) + translationX;
            f11 = (r7[1] - i5) + translationY;
        } else {
            f10 = f4;
            f11 = f5;
        }
        int round = Math.round(f10 - translationX) + i4;
        int round2 = Math.round(f11 - translationY) + i5;
        view.setTranslationX(f10);
        view.setTranslationY(f11);
        if (f10 == f6 && f11 == f7) {
            return null;
        }
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f10, f6), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f11, f7));
        a aVar = new a(view, b0Var.f34364b, round, round2, translationX, translationY);
        transition.b(aVar);
        ofPropertyValuesHolder.addListener(aVar);
        ofPropertyValuesHolder.addPauseListener(aVar);
        ofPropertyValuesHolder.setInterpolator(timeInterpolator);
        return ofPropertyValuesHolder;
    }
}
