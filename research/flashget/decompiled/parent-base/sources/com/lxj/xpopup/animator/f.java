package com.lxj.xpopup.animator;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: ShadowBgAnimator.java */
/* loaded from: classes6.dex */
public class f extends c {

    /* renamed from: f, reason: collision with root package name */
    public ArgbEvaluator f67885f;

    /* renamed from: g, reason: collision with root package name */
    public int f67886g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f67887h;

    /* renamed from: i, reason: collision with root package name */
    public int f67888i;

    /* compiled from: ShadowBgAnimator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            f.this.f67866c.setBackgroundColor(((Integer) animation.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: ShadowBgAnimator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            f.this.f67866c.setBackgroundColor(((Integer) animation.getAnimatedValue()).intValue());
        }
    }

    public f() {
        this.f67885f = new ArgbEvaluator();
        this.f67886g = 0;
        this.f67887h = false;
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f67864a) {
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(this.f67885f, Integer.valueOf(this.f67888i), Integer.valueOf(this.f67886g));
        ofObject.addUpdateListener(new b());
        e(ofObject);
        ofObject.setInterpolator(new androidx.interpolator.view.animation.b());
        ofObject.setDuration(this.f67887h ? 0L : this.f67867d).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        ValueAnimator ofObject = ValueAnimator.ofObject(this.f67885f, Integer.valueOf(this.f67886g), Integer.valueOf(this.f67888i));
        ofObject.addUpdateListener(new a());
        ofObject.setInterpolator(new androidx.interpolator.view.animation.b());
        ofObject.setDuration(this.f67887h ? 0L : this.f67867d).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f67866c.setBackgroundColor(this.f67886g);
    }

    public void g(float val) {
        this.f67866c.setBackgroundColor(h(val));
    }

    public int h(float fraction) {
        return ((Integer) this.f67885f.evaluate(fraction, Integer.valueOf(this.f67886g), Integer.valueOf(this.f67888i))).intValue();
    }

    public f(View target, int animationDuration, int shadowColor) {
        super(target, animationDuration, null);
        this.f67885f = new ArgbEvaluator();
        this.f67886g = 0;
        this.f67887h = false;
        this.f67888i = shadowColor;
    }
}
