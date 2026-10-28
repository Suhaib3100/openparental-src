package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;

/* compiled from: FadeProvider.java */
/* loaded from: classes3.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    private float f14713a = 1.0f;

    /* compiled from: FadeProvider.java */
    /* loaded from: classes2.dex */
    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14714a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14715b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14716c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f14717d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f14718e;

        a(View view, float f6, float f7, float f8, float f9) {
            this.f14714a = view;
            this.f14715b = f6;
            this.f14716c = f7;
            this.f14717d = f8;
            this.f14718e = f9;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14714a.setAlpha(u.o(this.f14715b, this.f14716c, this.f14717d, this.f14718e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: FadeProvider.java */
    /* loaded from: classes2.dex */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14719a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14720b;

        b(View view, float f6) {
            this.f14719a = view;
            this.f14720b = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14719a.setAlpha(this.f14720b);
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
        return c(view, 0.0f, alpha, 0.0f, this.f14713a, alpha);
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    public float d() {
        return this.f14713a;
    }

    public void e(float f6) {
        this.f14713a = f6;
    }
}
