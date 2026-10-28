package com.lxj.xpopup.animator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* compiled from: PopupAnimator.java */
/* loaded from: classes5.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    protected boolean f19786a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f19787b;

    /* renamed from: c, reason: collision with root package name */
    public View f19788c;

    /* renamed from: d, reason: collision with root package name */
    public int f19789d;

    /* renamed from: e, reason: collision with root package name */
    public b3.c f19790e;

    /* compiled from: PopupAnimator.java */
    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            c.this.f19786a = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            super.onAnimationStart(animation);
            c.this.f19786a = true;
        }
    }

    /* compiled from: PopupAnimator.java */
    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animation) {
            super.onAnimationEnd(animation);
            c.this.f19786a = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animation) {
            super.onAnimationStart(animation);
            c.this.f19786a = true;
        }
    }

    public c() {
        this.f19786a = false;
        this.f19787b = false;
        this.f19789d = 0;
    }

    public abstract void a();

    public abstract void b();

    public int c() {
        return this.f19789d;
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

    public c(View target, int animationDuration, b3.c popupAnimation) {
        this.f19786a = false;
        this.f19787b = false;
        this.f19788c = target;
        this.f19789d = animationDuration;
        this.f19790e = popupAnimation;
    }
}
