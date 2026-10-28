package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import s8.a;

/* compiled from: MaterialFade.java */
@x0(21)
/* loaded from: classes6.dex */
public final class o extends r<d> {

    /* renamed from: e, reason: collision with root package name */
    private static final float f54767e = 0.8f;

    /* renamed from: f, reason: collision with root package name */
    private static final float f54768f = 0.3f;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54769g = a.c.f90594ua;

    /* renamed from: h, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54770h = a.c.f90582ta;

    /* renamed from: i, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54771i = a.c.f90642ya;

    public o() {
        super(p(), q());
    }

    private static d p() {
        d dVar = new d();
        dVar.e(f54768f);
        return dVar;
    }

    private static w q() {
        s sVar = new s(true);
        sVar.o(false);
        sVar.l(f54767e);
        return sVar;
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void b(@o0 w wVar) {
        super.b(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.material.transition.platform.r
    @o0
    TimeInterpolator f(boolean z4) {
        return com.google.android.material.animation.a.f52466a;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int g(boolean z4) {
        return z4 ? f54769g : f54770h;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int i(boolean z4) {
        return f54771i;
    }

    @Override // com.google.android.material.transition.platform.r
    @q0
    public /* bridge */ /* synthetic */ w l() {
        return super.l();
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ boolean n(@o0 w wVar) {
        return super.n(wVar);
    }

    @Override // com.google.android.material.transition.platform.r
    public /* bridge */ /* synthetic */ void o(@q0 w wVar) {
        super.o(wVar);
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
