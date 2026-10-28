package com.lxj.xpopup.animator;

import android.animation.IntEvaluator;
import android.animation.ValueAnimator;
import android.view.View;

/* compiled from: ScrollScaleAnimator.java */
/* loaded from: classes5.dex */
public class e extends com.lxj.xpopup.animator.c {

    /* renamed from: f, reason: collision with root package name */
    private IntEvaluator f19797f;

    /* renamed from: g, reason: collision with root package name */
    private int f19798g;

    /* renamed from: h, reason: collision with root package name */
    private int f19799h;

    /* renamed from: i, reason: collision with root package name */
    private float f19800i;

    /* renamed from: j, reason: collision with root package name */
    private float f19801j;

    /* compiled from: ScrollScaleAnimator.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.l();
            e eVar = e.this;
            eVar.f19788c.scrollTo(eVar.f19798g, e.this.f19799h);
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
                e.this.f19788c.setAlpha(animatedFraction);
                e eVar = e.this;
                eVar.f19788c.scrollTo(eVar.f19797f.evaluate(animatedFraction, Integer.valueOf(e.this.f19798g), (Integer) 0).intValue(), e.this.f19797f.evaluate(animatedFraction, Integer.valueOf(e.this.f19799h), (Integer) 0).intValue());
                e.this.m(animatedFraction);
            }
        }

        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            ofFloat.addUpdateListener(new a());
            ofFloat.setDuration(e.this.f19789d).setInterpolator(new androidx.interpolator.view.animation.b());
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
            float f6 = 1.0f - animatedFraction;
            e.this.f19788c.setAlpha(f6);
            e eVar = e.this;
            eVar.f19788c.scrollTo(eVar.f19797f.evaluate(animatedFraction, (Integer) 0, Integer.valueOf(e.this.f19798g)).intValue(), e.this.f19797f.evaluate(animatedFraction, (Integer) 0, Integer.valueOf(e.this.f19799h)).intValue());
            e.this.m(f6);
        }
    }

    /* compiled from: ScrollScaleAnimator.java */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f19806a;

        static {
            int[] iArr = new int[b3.c.values().length];
            f19806a = iArr;
            try {
                iArr[b3.c.ScrollAlphaFromLeft.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19806a[b3.c.ScrollAlphaFromLeftTop.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19806a[b3.c.ScrollAlphaFromTop.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19806a[b3.c.ScrollAlphaFromRightTop.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19806a[b3.c.ScrollAlphaFromRight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f19806a[b3.c.ScrollAlphaFromRightBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f19806a[b3.c.ScrollAlphaFromBottom.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f19806a[b3.c.ScrollAlphaFromLeftBottom.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public e(View target, int animationDuration, b3.c popupAnimation) {
        super(target, animationDuration, popupAnimation);
        this.f19797f = new IntEvaluator();
        this.f19800i = 0.0f;
        this.f19801j = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        switch (d.f19806a[this.f19790e.ordinal()]) {
            case 1:
                this.f19788c.setPivotX(0.0f);
                this.f19788c.setPivotY(r0.getMeasuredHeight() / 2);
                this.f19798g = this.f19788c.getMeasuredWidth();
                this.f19799h = 0;
                this.f19788c.setScaleX(this.f19801j);
                break;
            case 2:
                this.f19788c.setPivotX(0.0f);
                this.f19788c.setPivotY(0.0f);
                this.f19798g = this.f19788c.getMeasuredWidth();
                this.f19799h = this.f19788c.getMeasuredHeight();
                this.f19788c.setScaleX(this.f19801j);
                this.f19788c.setScaleY(this.f19801j);
                break;
            case 3:
                this.f19788c.setPivotX(r0.getMeasuredWidth() / 2);
                this.f19788c.setPivotY(0.0f);
                this.f19799h = this.f19788c.getMeasuredHeight();
                this.f19788c.setScaleY(this.f19801j);
                break;
            case 4:
                this.f19788c.setPivotX(r0.getMeasuredWidth());
                this.f19788c.setPivotY(0.0f);
                this.f19798g = -this.f19788c.getMeasuredWidth();
                this.f19799h = this.f19788c.getMeasuredHeight();
                this.f19788c.setScaleX(this.f19801j);
                this.f19788c.setScaleY(this.f19801j);
                break;
            case 5:
                this.f19788c.setPivotX(r0.getMeasuredWidth());
                this.f19788c.setPivotY(r0.getMeasuredHeight() / 2);
                this.f19798g = -this.f19788c.getMeasuredWidth();
                this.f19788c.setScaleX(this.f19801j);
                break;
            case 6:
                this.f19788c.setPivotX(r0.getMeasuredWidth());
                this.f19788c.setPivotY(r0.getMeasuredHeight());
                this.f19798g = -this.f19788c.getMeasuredWidth();
                this.f19799h = -this.f19788c.getMeasuredHeight();
                this.f19788c.setScaleX(this.f19801j);
                this.f19788c.setScaleY(this.f19801j);
                break;
            case 7:
                this.f19788c.setPivotX(r0.getMeasuredWidth() / 2);
                this.f19788c.setPivotY(r0.getMeasuredHeight());
                this.f19799h = -this.f19788c.getMeasuredHeight();
                this.f19788c.setScaleY(this.f19801j);
                break;
            case 8:
                this.f19788c.setPivotX(0.0f);
                this.f19788c.setPivotY(r0.getMeasuredHeight());
                this.f19798g = this.f19788c.getMeasuredWidth();
                this.f19799h = -this.f19788c.getMeasuredHeight();
                this.f19788c.setScaleX(this.f19801j);
                this.f19788c.setScaleY(this.f19801j);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m(float fraction) {
        switch (d.f19806a[this.f19790e.ordinal()]) {
            case 1:
            case 5:
                this.f19788c.setScaleX(fraction);
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                this.f19788c.setScaleX(fraction);
                this.f19788c.setScaleY(fraction);
                break;
            case 3:
            case 7:
                this.f19788c.setScaleY(fraction);
                break;
        }
    }

    @Override // com.lxj.xpopup.animator.c
    public void a() {
        if (this.f19786a) {
            return;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        e(ofFloat);
        ofFloat.addUpdateListener(new c());
        ofFloat.setDuration(this.f19789d).setInterpolator(new androidx.interpolator.view.animation.b());
        ofFloat.start();
    }

    @Override // com.lxj.xpopup.animator.c
    public void b() {
        this.f19788c.post(new b());
    }

    @Override // com.lxj.xpopup.animator.c
    public void d() {
        this.f19788c.setAlpha(this.f19800i);
        this.f19788c.post(new a());
    }
}
