package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.b0;

/* compiled from: MaterialElevationScale.java */
/* loaded from: classes6.dex */
public final class m extends q<r> {
    private static final float V2 = 0.85f;
    private final boolean U2;

    public m(boolean z4) {
        super(g1(z4), new d());
        this.U2 = z4;
    }

    private static r g1(boolean z4) {
        r rVar = new r(z4);
        rVar.m(V2);
        rVar.l(V2);
        return rVar;
    }

    private static v h1() {
        return new d();
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator P0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        return super.P0(viewGroup, view, b0Var, b0Var2);
    }

    @Override // com.google.android.material.transition.q, androidx.transition.Visibility
    public /* bridge */ /* synthetic */ Animator R0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        return super.R0(viewGroup, view, b0Var, b0Var2);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void U0(@o0 v vVar) {
        super.U0(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void W0() {
        super.W0();
    }

    @Override // com.google.android.material.transition.q
    @q0
    public /* bridge */ /* synthetic */ v c1() {
        return super.c1();
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ boolean e1(@o0 v vVar) {
        return super.e1(vVar);
    }

    @Override // com.google.android.material.transition.q
    public /* bridge */ /* synthetic */ void f1(@q0 v vVar) {
        super.f1(vVar);
    }

    public boolean i1() {
        return this.U2;
    }
}
