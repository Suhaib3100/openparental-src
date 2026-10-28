package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: ScaleProvider.java */
/* loaded from: classes6.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    private float f54816a;

    /* renamed from: b, reason: collision with root package name */
    private float f54817b;

    /* renamed from: c, reason: collision with root package name */
    private float f54818c;

    /* renamed from: d, reason: collision with root package name */
    private float f54819d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f54820e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f54821f;

    /* compiled from: ScaleProvider.java */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ View f54822b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f54823c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f54824d;

        a(View view, float f4, float f5) {
            this.f54822b = view;
            this.f54823c = f4;
            this.f54824d = f5;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f54822b.setScaleX(this.f54823c);
            this.f54822b.setScaleY(this.f54824d);
        }
    }

    public r() {
        this(true);
    }

    private static Animator c(View view, float f4, float f5) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f4, scaleX * f5), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f4 * scaleY, f5 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        if (this.f54821f) {
            return this.f54820e ? c(view, this.f54816a, this.f54817b) : c(view, this.f54819d, this.f54818c);
        }
        return null;
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        return this.f54820e ? c(view, this.f54818c, this.f54819d) : c(view, this.f54817b, this.f54816a);
    }

    public float d() {
        return this.f54819d;
    }

    public float e() {
        return this.f54818c;
    }

    public float f() {
        return this.f54817b;
    }

    public float g() {
        return this.f54816a;
    }

    public boolean h() {
        return this.f54820e;
    }

    public boolean i() {
        return this.f54821f;
    }

    public void j(boolean z4) {
        this.f54820e = z4;
    }

    public void k(float f4) {
        this.f54819d = f4;
    }

    public void l(float f4) {
        this.f54818c = f4;
    }

    public void m(float f4) {
        this.f54817b = f4;
    }

    public void n(float f4) {
        this.f54816a = f4;
    }

    public void o(boolean z4) {
        this.f54821f = z4;
    }

    public r(boolean z4) {
        this.f54816a = 1.0f;
        this.f54817b = 1.1f;
        this.f54818c = 0.8f;
        this.f54819d = 1.0f;
        this.f54821f = true;
        this.f54820e = z4;
    }
}
