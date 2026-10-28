package androidx.core.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* compiled from: ViewPropertyAnimatorCompat.java */
/* loaded from: classes3.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f27225a;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ j2 f27226b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ View f27227c;

        a(j2 j2Var, View view) {
            this.f27226b = j2Var;
            this.f27227c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f27226b.a(this.f27227c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f27226b.b(this.f27227c);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f27226b.c(this.f27227c);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.x0(21)
    static class b {
        private b() {
        }

        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f4) {
            return viewPropertyAnimator.translationZ(f4);
        }

        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f4) {
            return viewPropertyAnimator.translationZBy(f4);
        }

        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f4) {
            return viewPropertyAnimator.z(f4);
        }

        static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f4) {
            return viewPropertyAnimator.zBy(f4);
        }
    }

    i2(View view) {
        this.f27225a = new WeakReference<>(view);
    }

    private void v(View view, j2 j2Var) {
        if (j2Var != null) {
            view.animate().setListener(new a(j2Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @androidx.annotation.o0
    public i2 A(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().translationXBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 B(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().translationY(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 C(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().translationYBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 D(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().translationZ(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 E(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().translationZBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 F(@androidx.annotation.o0 Runnable runnable) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().withEndAction(runnable);
        }
        return this;
    }

    @androidx.annotation.o0
    @SuppressLint({"WrongConstant"})
    public i2 G() {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().withLayer();
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 H(@androidx.annotation.o0 Runnable runnable) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().withStartAction(runnable);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 I(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().x(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 J(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().xBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 K(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().y(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 L(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().yBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 M(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().z(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 N(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().zBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 b(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().alpha(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 c(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().alphaBy(f4);
        }
        return this;
    }

    public void d() {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.f27225a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @androidx.annotation.q0
    public Interpolator f() {
        View view = this.f27225a.get();
        if (view != null) {
            return (Interpolator) view.animate().getInterpolator();
        }
        return null;
    }

    public long g() {
        View view = this.f27225a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @androidx.annotation.o0
    public i2 i(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().rotation(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 j(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().rotationBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 k(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().rotationX(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 l(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().rotationXBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 m(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().rotationY(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 n(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().rotationYBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 o(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().scaleX(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 p(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().scaleXBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 q(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().scaleY(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 r(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().scaleYBy(f4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 s(long j4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().setDuration(j4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 t(@androidx.annotation.q0 Interpolator interpolator) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 u(@androidx.annotation.q0 j2 j2Var) {
        View view = this.f27225a.get();
        if (view != null) {
            v(view, j2Var);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 w(long j4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().setStartDelay(j4);
        }
        return this;
    }

    @androidx.annotation.o0
    public i2 x(@androidx.annotation.q0 final l2 l2Var) {
        final View view = this.f27225a.get();
        if (view != null) {
            view.animate().setUpdateListener(l2Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.h2
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    l2.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void y() {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @androidx.annotation.o0
    public i2 z(float f4) {
        View view = this.f27225a.get();
        if (view != null) {
            view.animate().translationX(f4);
        }
        return this;
    }
}
