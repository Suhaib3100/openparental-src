package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import n1.a;

/* compiled from: MaterialFadeThrough.java */
@x0(21)
/* loaded from: classes3.dex */
public final class p extends r<e> {

    /* renamed from: r, reason: collision with root package name */
    private static final float f14933r = 0.92f;

    /* renamed from: s, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14934s = a.c.qa;

    /* renamed from: t, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14935t = a.c.Aa;

    public p() {
        super(new e(), p());
    }

    private static e o() {
        return new e();
    }

    private static w p() {
        s sVar = new s(true);
        sVar.o(false);
        sVar.l(f14933r);
        return sVar;
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void a(@o0 w wVar) {
        super.a(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int f(boolean z5) {
        return f14934s;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int i(boolean z5) {
        return f14935t;
    }

    @Override // com.google.android.material.transition.platform.r
    @q0
    public /* bridge */ /* synthetic */ w k() {
        return super.k();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ boolean m(@o0 w wVar) {
        return super.m(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void n(@q0 w wVar) {
        super.n(wVar);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onAppear(viewGroup, view, transitionValues, transitionValues2);
    }

    @Override // com.google.android.material.transition.platform.r, android.transition.Visibility
    public /* bridge */ /* synthetic */ Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return super.onDisappear(viewGroup, view, transitionValues, transitionValues2);
    }
}
