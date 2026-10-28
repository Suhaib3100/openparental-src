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
/* loaded from: classes6.dex */
public final class e implements w {

    /* renamed from: b, reason: collision with root package name */
    static final float f54665b = 0.35f;

    /* renamed from: a, reason: collision with root package name */
    private float f54666a = f54665b;

    /* compiled from: FadeThroughProvider.java */
    static class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54667b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54668c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f54669d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ float f54670e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f54671f;

        a(View view, float f4, float f5, float f6, float f7) {
            this.f54667b = view;
            this.f54668c = f4;
            this.f54669d = f5;
            this.f54670e = f6;
            this.f54671f = f7;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f54667b.setAlpha(v.o(this.f54668c, this.f54669d, this.f54670e, this.f54671f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
        }
    }

    /* compiled from: FadeThroughProvider.java */
    static class b extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54672b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54673c;

        b(View view, float f4) {
            this.f54672b = view;
            this.f54673c = f4;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54672b.setAlpha(this.f54673c);
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
        return c(view, alpha, 0.0f, 0.0f, this.f54666a, alpha);
    }

    @Override // com.google.android.material.transition.platform.w
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        float alpha = view.getAlpha() == 0.0f ? 1.0f : view.getAlpha();
        return c(view, 0.0f, alpha, this.f54666a, 1.0f, alpha);
    }

    public float d() {
        return this.f54666a;
    }

    public void e(@x(from = 0.0d, to = 1.0d) float f4) {
        this.f54666a = f4;
    }
}
