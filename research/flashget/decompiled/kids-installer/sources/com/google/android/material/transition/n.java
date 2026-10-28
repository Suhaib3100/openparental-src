package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.d0;
import n1.a;

/* compiled from: MaterialFade.java */
/* loaded from: classes4.dex */
public final class n extends q<d> {

    /* renamed from: u0, reason: collision with root package name */
    private static final float f14804u0 = 0.8f;

    /* renamed from: v0, reason: collision with root package name */
    private static final float f14805v0 = 0.3f;

    /* renamed from: w0, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14806w0 = a.c.va;

    /* renamed from: x0, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14807x0 = a.c.ua;

    /* renamed from: y0, reason: collision with root package name */
    @androidx.annotation.f
    private static final int f14808y0 = a.c.za;

    public n() {
        super(m1(), o1());
    }

    private static d m1() {
        d dVar = new d();
        dVar.e(f14805v0);
        return dVar;
    }

    private static v o1() {
        r rVar = new r(true);
        rVar.o(false);
        rVar.l(f14804u0);
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
    @o0
    TimeInterpolator d1(boolean z5) {
        return com.google.android.material.animation.a.f12778a;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int e1(boolean z5) {
        return z5 ? f14806w0 : f14807x0;
    }

    @Override // com.google.android.material.transition.q
    @androidx.annotation.f
    int f1(boolean z5) {
        return f14808y0;
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
