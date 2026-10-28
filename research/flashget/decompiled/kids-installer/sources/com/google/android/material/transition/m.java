package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.d0;

/* compiled from: MaterialElevationScale.java */
/* loaded from: classes4.dex */
public final class m extends q<r> {

    /* renamed from: v0, reason: collision with root package name */
    private static final float f14802v0 = 0.85f;

    /* renamed from: u0, reason: collision with root package name */
    private final boolean f14803u0;

    public m(boolean z5) {
        super(m1(z5), new d());
        this.f14803u0 = z5;
    }

    private static r m1(boolean z5) {
        r rVar = new r(z5);
        rVar.m(f14802v0);
        rVar.l(f14802v0);
        return rVar;
    }

    private static v o1() {
        return new d();
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator U0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return super.U0(viewGroup, view, d0Var, d0Var2);
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator W0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return super.W0(viewGroup, view, d0Var, d0Var2);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void Z0(@o0 v vVar) {
        super.Z0(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void b1() {
        super.b1();
    }

    @Override // com.google.android.material.transition.q
    @q0
    public /* bridge */ /* synthetic */ v i1() {
        return super.i1();
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ boolean k1(@o0 v vVar) {
        return super.k1(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void l1(@q0 v vVar) {
        super.l1(vVar);
    }

    public boolean p1() {
        return this.f14803u0;
    }
}
