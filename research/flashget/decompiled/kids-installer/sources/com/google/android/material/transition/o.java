package com.google.android.material.transition;

import android.animation.Animator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.d0;
import n1.a;

/* compiled from: MaterialFadeThrough.java */
/* loaded from: classes4.dex */
public final class o extends q<e> {

    /* renamed from: u0, reason: collision with root package name */
    private static final float f14809u0 = 0.92f;

    /* renamed from: v0, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14810v0 = a.c.qa;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14811w0 = a.c.Aa;

    public o() {
        super(new e(), o1());
    }

    private static e m1() {
        return new e();
    }

    private static v o1() {
        r rVar = new r(true);
        rVar.o(false);
        rVar.l(f14809u0);
        return rVar;
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
    @androidx.annotation.f
    int e1(boolean z5) {
        return f14810v0;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int f1(boolean z5) {
        return f14811w0;
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
}
