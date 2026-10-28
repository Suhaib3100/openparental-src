package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;

/* compiled from: FadeThroughProvider.java */
/* loaded from: classes3.dex */
public final class e implements v {

    /* renamed from: b, reason: collision with root package name */
    static final float f14721b = 0.35f;

    /* renamed from: a, reason: collision with root package name */
    private float f14722a = f14721b;

    /* compiled from: FadeThroughProvider.java */
    /* loaded from: classes2.dex */
    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14723a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14724b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14725c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f14726d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f14727e;

        a(View view, float f6, float f7, float f8, float f9) {
            this.f14723a = view;
            this.f14724b = f6;
            this.f14725c = f7;
            this.f14726d = f8;
            this.f14727e = f9;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14723a.setAlpha(u.o(this.f14724b, this.f14725c, this.f14726d, this.f14727e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: FadeThroughProvider.java */
    /* loaded from: classes2.dex */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14728a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14729b;

        b(View view, float f6) {
            this.f14728a = view;
            this.f14729b = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14728a.setAlpha(this.f14729b);
        }
    }

    private static Animator c(View view, float f6, float f7, @x(from = 0.0d, to = 1.0d) float f8, @x(from = 0.0d, to = 1.0d) float f9, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f6, f7, f8, f9));
        ofFloat.addListener(new b(view, f10));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f14722a, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.f14722a, alpha);
    }

    public float d() {
        return this.f14722a;
    }

    public void e(@x(from = 0.0d, to = 1.0d) float f6) {
        this.f14722a = f6;
    }
}
