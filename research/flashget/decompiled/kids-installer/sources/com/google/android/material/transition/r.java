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
/* loaded from: classes3.dex */
public final class r implements v {

    /* renamed from: a, reason: collision with root package name */
    private float f14980a;

    /* renamed from: b, reason: collision with root package name */
    private float f14981b;

    /* renamed from: c, reason: collision with root package name */
    private float f14982c;

    /* renamed from: d, reason: collision with root package name */
    private float f14983d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f14984e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f14985f;

    /* compiled from: ScaleProvider.java */
    /* loaded from: classes2.dex */
    static class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f14986a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f14987b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f14988c;

        a(View view, float f6, float f7) {
            this.f14986a = view;
            this.f14987b = f6;
            this.f14988c = f7;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f14986a.setScaleX(this.f14987b);
            this.f14986a.setScaleY(this.f14988c);
        }
    }

    public r() {
        this(true);
    }

    private static Animator c(View view, float f6, float f7) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f6, scaleX * f7), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f6 * scaleY, f7 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator a(@o0 ViewGroup viewGroup, @o0 View view) {
        return this.f14984e ? c(view, this.f14982c, this.f14983d) : c(view, this.f14981b, this.f14980a);
    }

    @Override // com.google.android.material.transition.v
    @q0
    public Animator b(@o0 ViewGroup viewGroup, @o0 View view) {
        if (this.f14985f) {
            return this.f14984e ? c(view, this.f14980a, this.f14981b) : c(view, this.f14983d, this.f14982c);
        }
        return null;
    }

    public float d() {
        return this.f14983d;
    }

    public float e() {
        return this.f14982c;
    }

    public float f() {
        return this.f14981b;
    }

    public float g() {
        return this.f14980a;
    }

    public boolean h() {
        return this.f14984e;
    }

    public boolean i() {
        return this.f14985f;
    }

    public void j(boolean z5) {
        this.f14984e = z5;
    }

    public void k(float f6) {
        this.f14983d = f6;
    }

    public void l(float f6) {
        this.f14982c = f6;
    }

    public void m(float f6) {
        this.f14981b = f6;
    }

    public void n(float f6) {
        this.f14980a = f6;
    }

    public void o(boolean z5) {
        this.f14985f = z5;
    }

    public r(boolean z5) {
        this.f14980a = 1.0f;
        this.f14981b = 1.1f;
        this.f14982c = 0.8f;
        this.f14983d = 1.0f;
        this.f14985f = true;
        this.f14984e = z5;
    }
}
