package com.airbnb.lottie.utils;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.os.Build;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: BaseLottieAnimator.java */
/* loaded from: classes3.dex */
public abstract class c extends ValueAnimator {

    /* renamed from: b, reason: collision with root package name */
    private final Set<ValueAnimator.AnimatorUpdateListener> f39372b = new CopyOnWriteArraySet();

    /* renamed from: c, reason: collision with root package name */
    private final Set<Animator.AnimatorListener> f39373c = new CopyOnWriteArraySet();

    @Override // android.animation.Animator
    public void addListener(Animator.AnimatorListener animatorListener) {
        this.f39373c.add(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void addUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39372b.add(animatorUpdateListener);
    }

    void b() {
        Iterator<Animator.AnimatorListener> it = this.f39373c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationCancel(this);
        }
    }

    void c(boolean z4) {
        for (Animator.AnimatorListener animatorListener : this.f39373c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationEnd(this, z4);
            } else {
                animatorListener.onAnimationEnd(this);
            }
        }
    }

    void d() {
        Iterator<Animator.AnimatorListener> it = this.f39373c.iterator();
        while (it.hasNext()) {
            it.next().onAnimationRepeat(this);
        }
    }

    void e(boolean z4) {
        for (Animator.AnimatorListener animatorListener : this.f39373c) {
            if (Build.VERSION.SDK_INT >= 26) {
                animatorListener.onAnimationStart(this, z4);
            } else {
                animatorListener.onAnimationStart(this);
            }
        }
    }

    void f() {
        Iterator<ValueAnimator.AnimatorUpdateListener> it = this.f39372b.iterator();
        while (it.hasNext()) {
            it.next().onAnimationUpdate(this);
        }
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getStartDelay() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("˱"));
    }

    @Override // android.animation.Animator
    public void removeAllListeners() {
        this.f39373c.clear();
    }

    @Override // android.animation.ValueAnimator
    public void removeAllUpdateListeners() {
        this.f39372b.clear();
    }

    @Override // android.animation.Animator
    public void removeListener(Animator.AnimatorListener animatorListener) {
        this.f39373c.remove(animatorListener);
    }

    @Override // android.animation.ValueAnimator
    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.f39372b.remove(animatorUpdateListener);
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setInterpolator(TimeInterpolator timeInterpolator) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("˳"));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public void setStartDelay(long j4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("˴"));
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public ValueAnimator setDuration(long j4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("˲"));
    }
}
