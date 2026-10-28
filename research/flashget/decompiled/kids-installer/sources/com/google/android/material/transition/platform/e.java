package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.annotation.x0;

/* compiled from: FadeThroughProvider.java */
@x0(21)
/* loaded from: classes3.dex */
public final class e implements w {

    /* renamed from: b, reason: collision with root package name */
    static final float f14833b = 0.35f;

    /* renamed from: a, reason: collision with root package name */
    private float f14834a = f14833b;

    /* compiled from: FadeThroughProvider.java */
    /* loaded from: classes2.dex */
    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14835a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14836b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14837c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f14838d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f14839e;

        a(View view, float f6, float f7, float f8, float f9) {
            this.f14835a = view;
            this.f14836b = f6;
            this.f14837c = f7;
            this.f14838d = f8;
            this.f14839e = f9;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f14835a.setAlpha(v.o(this.f14836b, this.f14837c, this.f14838d, this.f14839e, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: FadeThroughProvider.java */
    /* loaded from: classes2.dex */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14840a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14841b;

        b(View view, float f6) {
            this.f14840a = view;
            this.f14841b = f6;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14840a.setAlpha(this.f14841b);
        }
    }

    private static Animator c(View view, float f6, float f7, @x(from = 0.0d, to = 1.0d) float f8, @x(from = 0.0d, to = 1.0d) float f9, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f6, f7, f8, f9));
        ofFloat.addListener(new b(view, f10));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f14834a, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.f14834a, alpha);
    }

    public float d() {
        return this.f14834a;
    }

    public void e(@x(from = 0.0d, to = 1.0d) float f6) {
        this.f14834a = f6;
    }
}
