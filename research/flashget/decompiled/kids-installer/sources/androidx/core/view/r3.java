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
/* loaded from: classes.dex */
public final class r3 {

    /* renamed from: e, reason: collision with root package name */
    static final int f5651e = 2113929216;

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<View> f5652a;

    /* renamed from: b, reason: collision with root package name */
    Runnable f5653b = null;

    /* renamed from: c, reason: collision with root package name */
    Runnable f5654c = null;

    /* renamed from: d, reason: collision with root package name */
    int f5655d = -1;

    /* compiled from: ViewPropertyAnimatorCompat.java */
    class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ s3 f5656a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f5657b;

        a(s3 s3Var, View view) {
            this.f5656a = s3Var;
            this.f5657b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f5656a.a(this.f5657b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f5656a.b(this.f5657b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f5656a.c(this.f5657b);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.x0(16)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withEndAction(runnable);
        }

        @androidx.annotation.u
        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator) {
            return viewPropertyAnimator.withLayer();
        }

        @androidx.annotation.u
        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, Runnable runnable) {
            return viewPropertyAnimator.withStartAction(runnable);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.x0(18)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static Interpolator a(ViewPropertyAnimator viewPropertyAnimator) {
            return (Interpolator) viewPropertyAnimator.getInterpolator();
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.x0(19)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
            return viewPropertyAnimator.setUpdateListener(animatorUpdateListener);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    @androidx.annotation.x0(21)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static ViewPropertyAnimator a(ViewPropertyAnimator viewPropertyAnimator, float f6) {
            return viewPropertyAnimator.translationZ(f6);
        }

        @androidx.annotation.u
        static ViewPropertyAnimator b(ViewPropertyAnimator viewPropertyAnimator, float f6) {
            return viewPropertyAnimator.translationZBy(f6);
        }

        @androidx.annotation.u
        static ViewPropertyAnimator c(ViewPropertyAnimator viewPropertyAnimator, float f6) {
            return viewPropertyAnimator.z(f6);
        }

        @androidx.annotation.u
        static ViewPropertyAnimator d(ViewPropertyAnimator viewPropertyAnimator, float f6) {
            return viewPropertyAnimator.zBy(f6);
        }
    }

    /* compiled from: ViewPropertyAnimatorCompat.java */
    /* loaded from: classes3.dex */
    static class f implements s3 {

        /* renamed from: a, reason: collision with root package name */
        r3 f5659a;

        /* renamed from: b, reason: collision with root package name */
        boolean f5660b;

        f(r3 r3Var) {
            this.f5659a = r3Var;
        }

        @Override // androidx.core.view.s3
        public void a(@androidx.annotation.o0 View view) {
            Object tag = view.getTag(r3.f5651e);
            s3 s3Var = tag instanceof s3 ? (s3) tag : null;
            if (s3Var != null) {
                s3Var.a(view);
            }
        }

        @Override // androidx.core.view.s3
        @SuppressLint({"WrongConstant"})
        public void b(@androidx.annotation.o0 View view) {
            int i5 = this.f5659a.f5655d;
            if (i5 > -1) {
                view.setLayerType(i5, null);
                this.f5659a.f5655d = -1;
            }
            r3 r3Var = this.f5659a;
            Runnable runnable = r3Var.f5654c;
            if (runnable != null) {
                r3Var.f5654c = null;
                runnable.run();
            }
            Object tag = view.getTag(r3.f5651e);
            s3 s3Var = tag instanceof s3 ? (s3) tag : null;
            if (s3Var != null) {
                s3Var.b(view);
            }
            this.f5660b = true;
        }

        @Override // androidx.core.view.s3
        public void c(@androidx.annotation.o0 View view) {
            this.f5660b = false;
            if (this.f5659a.f5655d > -1) {
                view.setLayerType(2, null);
            }
            r3 r3Var = this.f5659a;
            Runnable runnable = r3Var.f5653b;
            if (runnable != null) {
                r3Var.f5653b = null;
                runnable.run();
            }
            Object tag = view.getTag(r3.f5651e);
            s3 s3Var = tag instanceof s3 ? (s3) tag : null;
            if (s3Var != null) {
                s3Var.c(view);
            }
        }
    }

    r3(View view) {
        this.f5652a = new WeakReference<>(view);
    }

    private void v(View view, s3 s3Var) {
        if (s3Var != null) {
            view.animate().setListener(new a(s3Var, view));
        } else {
            view.animate().setListener(null);
        }
    }

    @androidx.annotation.o0
    public r3 A(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().translationXBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 B(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().translationY(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 C(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().translationYBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 D(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            e.a(view.animate(), f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 E(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            e.b(view.animate(), f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 F(@androidx.annotation.o0 Runnable runnable) {
        View view = this.f5652a.get();
        if (view != null) {
            b.a(view.animate(), runnable);
        }
        return this;
    }

    @androidx.annotation.o0
    @SuppressLint({"WrongConstant"})
    public r3 G() {
        View view = this.f5652a.get();
        if (view != null) {
            b.b(view.animate());
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 H(@androidx.annotation.o0 Runnable runnable) {
        View view = this.f5652a.get();
        if (view != null) {
            b.c(view.animate(), runnable);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 I(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().x(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 J(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().xBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 K(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().y(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 L(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().yBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 M(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            e.c(view.animate(), f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 N(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            e.d(view.animate(), f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 b(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().alpha(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 c(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().alphaBy(f6);
        }
        return this;
    }

    public void d() {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long e() {
        View view = this.f5652a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    @androidx.annotation.q0
    public Interpolator f() {
        View view = this.f5652a.get();
        if (view != null) {
            return c.a(view.animate());
        }
        return null;
    }

    public long g() {
        View view = this.f5652a.get();
        if (view != null) {
            return view.animate().getStartDelay();
        }
        return 0L;
    }

    @androidx.annotation.o0
    public r3 i(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().rotation(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 j(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().rotationBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 k(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().rotationX(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 l(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().rotationXBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 m(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().rotationY(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 n(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().rotationYBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 o(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().scaleX(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 p(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().scaleXBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 q(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().scaleY(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 r(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().scaleYBy(f6);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 s(long j5) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().setDuration(j5);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 t(@androidx.annotation.q0 Interpolator interpolator) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 u(@androidx.annotation.q0 s3 s3Var) {
        View view = this.f5652a.get();
        if (view != null) {
            v(view, s3Var);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 w(long j5) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().setStartDelay(j5);
        }
        return this;
    }

    @androidx.annotation.o0
    public r3 x(@androidx.annotation.q0 final u3 u3Var) {
        final View view = this.f5652a.get();
        if (view != null) {
            d.a(view.animate(), u3Var != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.q3
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    u3.this.a(view);
                }
            } : null);
        }
        return this;
    }

    public void y() {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    @androidx.annotation.o0
    public r3 z(float f6) {
        View view = this.f5652a.get();
        if (view != null) {
            view.animate().translationX(f6);
        }
        return this;
    }
}
