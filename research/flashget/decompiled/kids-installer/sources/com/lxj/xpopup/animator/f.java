package com.lxj.xpopup.animator;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: ShadowBgAnimator.java */
/* loaded from: classes5.dex */
public class f extends c {

    /* renamed from: f, reason: collision with root package name */
    public ArgbEvaluator f19807f;

    /* renamed from: g, reason: collision with root package name */
    public int f19808g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f19809h;

    /* renamed from: i, reason: collision with root package name */
    public int f19810i;

    /* compiled from: ShadowBgAnimator.java */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            f.this.f19788c.setBackgroundColor(((Integer) animation.getAnimatedValue()).intValue());
        }
    }

    /* compiled from: ShadowBgAnimator.java */
    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            f.this.f19788c.setBackgroundColor(((Integer) animation.getAnimatedValue()).intValue());
        }
    }

    public f() {
        this.f19807f = new ArgbEvaluator();
        this.f19808g = 0;
        this.f19809h = false;
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f19786a) {
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(this.f19807f, Integer.valueOf(this.f19810i), Integer.valueOf(this.f19808g));
        ofObject.addUpdateListener(new b());
        e(ofObject);
        ofObject.setInterpolator(new androidx.interpolator.view.animation.b());
        ofObject.setDuration(this.f19809h ? 0L : this.f19789d).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        ValueAnimator ofObject = ValueAnimator.ofObject(this.f19807f, Integer.valueOf(this.f19808g), Integer.valueOf(this.f19810i));
        ofObject.addUpdateListener(new a());
        ofObject.setInterpolator(new androidx.interpolator.view.animation.b());
        ofObject.setDuration(this.f19809h ? 0L : this.f19789d).start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f19788c.setBackgroundColor(this.f19808g);
    }

    public void g(float val) {
        this.f19788c.setBackgroundColor(Integer.valueOf(h(val)).intValue());
    }

    public int h(float fraction) {
        return ((Integer) this.f19807f.evaluate(fraction, Integer.valueOf(this.f19808g), Integer.valueOf(this.f19810i))).intValue();
    }

    public f(View target, int animationDuration, int shadowColor) {
        super(target, animationDuration, null);
        this.f19807f = new ArgbEvaluator();
        this.f19808g = 0;
        this.f19809h = false;
        this.f19810i = shadowColor;
    }
}
