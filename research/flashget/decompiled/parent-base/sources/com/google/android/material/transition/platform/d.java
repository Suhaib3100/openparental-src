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

/* compiled from: FadeProvider.java */
@x0(21)
/* loaded from: classes6.dex */
public final class d implements w {

    /* renamed from: a, reason: collision with root package name */
    private float f54657a = 1.0f;

    /* compiled from: FadeProvider.java */
    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54658b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54659c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f54660d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f54661e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f54662f;

        a(View view, float f4, float f5, float f6, float f7) {
            this.f54658b = view;
            this.f54659c = f4;
            this.f54660d = f5;
            this.f54661e = f6;
            this.f54662f = f7;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f54658b.setAlpha(v.o(this.f54659c, this.f54660d, this.f54661e, this.f54662f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: FadeProvider.java */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54663b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54664c;

        b(View view, float f4) {
            this.f54663b = view;
            this.f54664c = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54663b.setAlpha(this.f54664c);
        }
    }

    private static Animator c(View view, float f4, float f5, @x(from = 0.0d, to = 1.0d) float f6, @x(from = 0.0d, to = 1.0d) float f7, float f10) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new a(view, f4, f5, f6, f7));
        ofFloat.addListener(new b(view, f10));
        return ofFloat;
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, alpha, 0.0f, 0.0f, 1.0f, alpha);
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, 0.0f, this.f54657a, alpha);
    }

    public float d() {
        return this.f54657a;
    }

    public void e(float f4) {
        this.f54657a = f4;
    }
}
