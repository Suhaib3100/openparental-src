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
/* loaded from: classes6.dex */
public final class d implements v {

    /* renamed from: a, reason: collision with root package name */
    private float f54552a = 1.0f;

    /* compiled from: FadeProvider.java */
    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54553b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54554c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f54555d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f54556e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f54557f;

        a(View view, float f4, float f5, float f6, float f7) {
            this.f54553b = view;
            this.f54554c = f4;
            this.f54555d = f5;
            this.f54556e = f6;
            this.f54557f = f7;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f54553b.setAlpha(u.o(this.f54554c, this.f54555d, this.f54556e, this.f54557f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: FadeProvider.java */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54558b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54559c;

        b(View view, float f4) {
            this.f54558b = view;
            this.f54559c = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54558b.setAlpha(this.f54559c);
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
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.0f, this.f54552a, alpha);
    }

    public float d() {
        return this.f54552a;
    }

    public void e(float f4) {
        this.f54552a = f4;
    }
}
