package com.github.mikephil.charting.jobs;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.github.mikephil.charting.utils.i;
import com.github.mikephil.charting.utils.l;

/* compiled from: AnimatedViewPortJob.java */
@SuppressLint({"NewApi"})
/* loaded from: classes5.dex */
public abstract class b extends e implements ValueAnimator.AnimatorUpdateListener, Animator.AnimatorListener {

    /* renamed from: j, reason: collision with root package name */
    protected ObjectAnimator f50447j;

    /* renamed from: k, reason: collision with root package name */
    protected float f50448k;

    /* renamed from: l, reason: collision with root package name */
    protected float f50449l;

    /* renamed from: m, reason: collision with root package name */
    protected float f50450m;

    public b(l lVar, float f4, float f5, i iVar, View view, float f6, float f7, long j4) {
        super(lVar, f4, f5, iVar, view);
        this.f50449l = f6;
        this.f50450m = f7;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, ProtectedSandApp.s("쑂"), 0.0f, 1.0f);
        this.f50447j = ofFloat;
        ofFloat.setDuration(j4);
        this.f50447j.addUpdateListener(this);
        this.f50447j.addListener(this);
    }

    public float d() {
        return this.f50448k;
    }

    public float e() {
        return this.f50449l;
    }

    public float f() {
        return this.f50450m;
    }

    public abstract void g();

    protected void h() {
        this.f50447j.removeAllListeners();
        this.f50447j.removeAllUpdateListeners();
        this.f50447j.reverse();
        this.f50447j.addUpdateListener(this);
        this.f50447j.addListener(this);
    }

    public void i(float f4) {
        this.f50448k = f4;
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        try {
            g();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        try {
            g();
        } catch (IllegalArgumentException unused) {
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
    }

    public void onAnimationUpdate(ValueAnimator valueAnimator) {
    }

    @Override // java.lang.Runnable
    @SuppressLint({"NewApi"})
    public void run() {
        this.f50447j.start();
    }
}
