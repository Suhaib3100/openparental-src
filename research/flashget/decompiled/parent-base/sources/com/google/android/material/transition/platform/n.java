package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.transition.TransitionValues;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;

/* compiled from: MaterialElevationScale.java */
@x0(21)
/* loaded from: classes6.dex */
public final class n extends r<s> {

    /* renamed from: f, reason: collision with root package name */
    private static final float f54765f = 0.85f;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f54766e;

    public n(boolean z4) {
        super(p(z4), new d());
        this.f54766e = z4;
    }

    private static s p(boolean z4) {
        s sVar = new s(z4);
        sVar.m(f54765f);
        sVar.l(f54765f);
        return sVar;
    }

    private static w q() {
        return new d();
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

    public boolean r() {
        return this.f54766e;
    }
}
