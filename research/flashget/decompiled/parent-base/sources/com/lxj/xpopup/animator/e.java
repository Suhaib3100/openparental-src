package com.lxj.xpopup.animator;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: ScrollScaleAnimator.java */
/* loaded from: classes6.dex */
public class e extends com.lxj.xpopup.animator.c {

    /* renamed from: f, reason: collision with root package name */
    private IntEvaluator f67875f;

    /* renamed from: g, reason: collision with root package name */
    private int f67876g;

    /* renamed from: h, reason: collision with root package name */
    private int f67877h;

    /* renamed from: i, reason: collision with root package name */
    private float f67878i;

    /* renamed from: j, reason: collision with root package name */
    private float f67879j;

    /* compiled from: ScrollScaleAnimator.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.l();
            e eVar = e.this;
            eVar.f67866c.scrollTo(eVar.f67876g, e.this.f67877h);
        }
    }

    /* compiled from: ScrollScaleAnimator.java */
    class b implements Runnable {

        /* compiled from: ScrollScaleAnimator.java */
        class a implements ValueAnimator.AnimatorUpdateListener {
            a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator animation) {
                float animatedFraction = animation.getAnimatedFraction();
                e.this.f67866c.setAlpha(animatedFraction);
                e eVar = e.this;
                eVar.f67866c.scrollTo(eVar.f67875f.evaluate(animatedFraction, Integer.valueOf(e.this.f67876g), (Integer) 0).intValue(), e.this.f67875f.evaluate(animatedFraction, Integer.valueOf(e.this.f67877h), (Integer) 0).intValue());
                e.this.m(animatedFraction);
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a());
            ofFloat.setDuration(e.this.f67867d).setInterpolator(new androidx.interpolator.view.animation.b());
            ofFloat.start();
        }
    }

    /* compiled from: ScrollScaleAnimator.java */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            float animatedFraction = animation.getAnimatedFraction();
            float f4 = 1.0f - animatedFraction;
            e.this.f67866c.setAlpha(f4);
            e eVar = e.this;
            eVar.f67866c.scrollTo(eVar.f67875f.evaluate(animatedFraction, (Integer) 0, Integer.valueOf(e.this.f67876g)).intValue(), e.this.f67875f.evaluate(animatedFraction, (Integer) 0, Integer.valueOf(e.this.f67877h)).intValue());
            e.this.m(f4);
        }
    }

    /* compiled from: ScrollScaleAnimator.java */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f67884a;

        static {
            int[] iArr = new int[fb.c.values().length];
            f67884a = iArr;
            try {
                iArr[fb.c.ScrollAlphaFromLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f67884a[fb.c.ScrollAlphaFromLeftTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f67884a[fb.c.ScrollAlphaFromTop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f67884a[fb.c.ScrollAlphaFromRightTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f67884a[fb.c.ScrollAlphaFromRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f67884a[fb.c.ScrollAlphaFromRightBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f67884a[fb.c.ScrollAlphaFromBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f67884a[fb.c.ScrollAlphaFromLeftBottom.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public e(View target, int animationDuration, fb.c popupAnimation) {
        super(target, animationDuration, popupAnimation);
        this.f67875f = new IntEvaluator();
        this.f67878i = 0.0f;
        this.f67879j = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        switch (d.f67884a[this.f67868e.ordinal()]) {
            case 1:
                this.f67866c.setPivotX(0.0f);
                this.f67866c.setPivotY(r0.getMeasuredHeight() / 2);
                this.f67876g = this.f67866c.getMeasuredWidth();
                this.f67877h = 0;
                this.f67866c.setScaleX(this.f67879j);
                break;
            case 2:
                this.f67866c.setPivotX(0.0f);
                this.f67866c.setPivotY(0.0f);
                this.f67876g = this.f67866c.getMeasuredWidth();
                this.f67877h = this.f67866c.getMeasuredHeight();
                this.f67866c.setScaleX(this.f67879j);
                this.f67866c.setScaleY(this.f67879j);
                break;
            case 3:
                this.f67866c.setPivotX(r0.getMeasuredWidth() / 2);
                this.f67866c.setPivotY(0.0f);
                this.f67877h = this.f67866c.getMeasuredHeight();
                this.f67866c.setScaleY(this.f67879j);
                break;
            case 4:
                this.f67866c.setPivotX(r0.getMeasuredWidth());
                this.f67866c.setPivotY(0.0f);
                this.f67876g = -this.f67866c.getMeasuredWidth();
                this.f67877h = this.f67866c.getMeasuredHeight();
                this.f67866c.setScaleX(this.f67879j);
                this.f67866c.setScaleY(this.f67879j);
                break;
            case 5:
                this.f67866c.setPivotX(r0.getMeasuredWidth());
                this.f67866c.setPivotY(r0.getMeasuredHeight() / 2);
                this.f67876g = -this.f67866c.getMeasuredWidth();
                this.f67866c.setScaleX(this.f67879j);
                break;
            case 6:
                this.f67866c.setPivotX(r0.getMeasuredWidth());
                this.f67866c.setPivotY(r0.getMeasuredHeight());
                this.f67876g = -this.f67866c.getMeasuredWidth();
                this.f67877h = -this.f67866c.getMeasuredHeight();
                this.f67866c.setScaleX(this.f67879j);
                this.f67866c.setScaleY(this.f67879j);
                break;
            case 7:
                this.f67866c.setPivotX(r0.getMeasuredWidth() / 2);
                this.f67866c.setPivotY(r0.getMeasuredHeight());
                this.f67877h = -this.f67866c.getMeasuredHeight();
                this.f67866c.setScaleY(this.f67879j);
                break;
            case 8:
                this.f67866c.setPivotX(0.0f);
                this.f67866c.setPivotY(r0.getMeasuredHeight());
                this.f67876g = this.f67866c.getMeasuredWidth();
                this.f67877h = -this.f67866c.getMeasuredHeight();
                this.f67866c.setScaleX(this.f67879j);
                this.f67866c.setScaleY(this.f67879j);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float fraction) {
        switch (d.f67884a[this.f67868e.ordinal()]) {
            case 1:
            case 5:
                this.f67866c.setScaleX(fraction);
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                this.f67866c.setScaleX(fraction);
                this.f67866c.setScaleY(fraction);
                break;
            case 3:
            case 7:
                this.f67866c.setScaleY(fraction);
                break;
        }
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f67864a) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        e(ofFloat);
        ofFloat.addUpdateListener(new c());
        ofFloat.setDuration(this.f67867d).setInterpolator(new androidx.interpolator.view.animation.b());
        ofFloat.start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        this.f67866c.post(new b());
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f67866c.setAlpha(this.f67878i);
        this.f67866c.post(new a());
    }
}
