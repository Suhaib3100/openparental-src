package com.lxj.xpopup.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PopupAnimator.java */
/* loaded from: classes6.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f67864a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f67865b;

    /* renamed from: c, reason: collision with root package name */
    public View f67866c;

    /* renamed from: d, reason: collision with root package name */
    public int f67867d;

    /* renamed from: e, reason: collision with root package name */
    public fb.c f67868e;

    /* compiled from: PopupAnimator.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            c.this.f67864a = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            super.onAnimationStart(animation);
            c.this.f67864a = true;
        }
    }

    /* compiled from: PopupAnimator.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            c.this.f67864a = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            super.onAnimationStart(animation);
            c.this.f67864a = true;
        }
    }

    public c() {
        this.f67864a = false;
        this.f67865b = false;
        this.f67867d = 0;
    }

    public abstract void a();

    public abstract void b();

    public int c() {
        return this.f67867d;
    }

    public abstract void d();

    protected ValueAnimator e(ValueAnimator animator) {
        animator.removeAllListeners();
        animator.addListener(new a());
        return animator;
    }

    protected ViewPropertyAnimator f(ViewPropertyAnimator animator) {
        animator.setListener(new b());
        return animator;
    }

    public c(View target, int animationDuration) {
        this(target, animationDuration, null);
    }

    public c(View target, int animationDuration, fb.c popupAnimation) {
        this.f67864a = false;
        this.f67865b = false;
        this.f67866c = target;
        this.f67867d = animationDuration;
        this.f67868e = popupAnimation;
    }
}
