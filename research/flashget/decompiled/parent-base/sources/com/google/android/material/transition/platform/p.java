package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import s8.a;

/* compiled from: MaterialFadeThrough.java */
@x0(21)
/* loaded from: classes6.dex */
public final class p extends r<e> {

    /* renamed from: e, reason: collision with root package name */
    private static final float f54772e = 0.92f;

    /* renamed from: f, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54773f = a.c.f90529pa;

    /* renamed from: g, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f54774g = a.c.f90654za;

    public p() {
        super(new e(), q());
    }

    private static e p() {
        return new e();
    }

    private static w q() {
        s sVar = new s(true);
        sVar.o(false);
        sVar.l(f54772e);
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
    @androidx.annotation.f
    int g(boolean z4) {
        return f54773f;
    }

    @Override // com.google.android.material.transition.platform.r
    @androidx.annotation.f
    int i(boolean z4) {
        return f54774g;
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
