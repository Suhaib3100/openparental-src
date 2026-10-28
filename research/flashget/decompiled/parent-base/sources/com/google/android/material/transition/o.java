package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.b0;
import s8.a;

/* compiled from: MaterialFadeThrough.java */
/* loaded from: classes6.dex */
public final class o extends q<e> {
    private static final float U2 = 0.92f;

    @androidx.annotation.f
    private static final int V2 = a.c.f90529pa;

    @androidx.annotation.f
    private static final int W2 = a.c.f90654za;

    public o() {
        super(new e(), h1());
    }

    private static e g1() {
        return new e();
    }

    private static v h1() {
        r rVar = new r(true);
        rVar.o(false);
        rVar.l(U2);
        return rVar;
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
    @androidx.annotation.f
    int Z0(boolean z4) {
        return V2;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int a1(boolean z4) {
        return W2;
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
}
