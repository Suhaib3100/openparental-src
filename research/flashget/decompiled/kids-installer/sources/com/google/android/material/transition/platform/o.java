package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import n1.a;

/* compiled from: MaterialFade.java */
@x0(21)
/* loaded from: classes3.dex */
public final class o extends r<d> {

    /* renamed from: r, reason: collision with root package name */
    private static final float f14928r = 0.8f;

    /* renamed from: s, reason: collision with root package name */
    private static final float f14929s = 0.3f;

    /* renamed from: t, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14930t = a.c.va;

    /* renamed from: u, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14931u = a.c.ua;

    /* renamed from: v, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14932v = a.c.za;

    public o() {
        super(o(), p());
    }

    private static d o() {
        d dVar = new d();
        dVar.e(f14929s);
        return dVar;
    }

    private static w p() {
        s sVar = new s(true);
        sVar.o(false);
        sVar.l(f14928r);
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
    @o0
    TimeInterpolator e(boolean z5) {
        return com.google.android.material.animation.a.f12778a;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int f(boolean z5) {
        return z5 ? f14930t : f14931u;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int i(boolean z5) {
        return f14932v;
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
