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
/* loaded from: classes6.dex */
public final class e implements v {

    /* renamed from: b, reason: collision with root package name */
    static final float f54560b = 0.35f;

    /* renamed from: a, reason: collision with root package name */
    private float f54561a = f54560b;

    /* compiled from: FadeThroughProvider.java */
    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54562b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54563c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f54564d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f54565e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f54566f;

        a(View view, float f4, float f5, float f6, float f7) {
            this.f54562b = view;
            this.f54563c = f4;
            this.f54564d = f5;
            this.f54565e = f6;
            this.f54566f = f7;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f54562b.setAlpha(u.o(this.f54563c, this.f54564d, this.f54565e, this.f54566f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: FadeThroughProvider.java */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54567b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54568c;

        b(View view, float f4) {
            this.f54567b = view;
            this.f54568c = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54567b.setAlpha(this.f54568c);
        }
    }

    private static Animator c(View view, float f4, float f5, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f4, f5, f6, f7));
        ofFloat.addListener(new b(view, f10));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, this.f54561a, alpha);
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f54561a, 1.0f, alpha);
    }

    public float d() {
        return this.f54561a;
    }

    public void e(@x(from = 0.0d, to = 1.0d) float f4) {
        this.f54561a = f4;
    }
}
