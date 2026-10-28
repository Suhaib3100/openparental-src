package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.transition.Visibility;
import androidx.transition.d0;
import com.google.android.material.transition.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MaterialVisibility.java */
/* loaded from: classes3.dex */
abstract class q<P extends v> extends Visibility {

    /* renamed from: r0, reason: collision with root package name */
    private final P f14977r0;

    /* renamed from: s0, reason: collision with root package name */
    @q0
    private v f14978s0;

    /* renamed from: t0, reason: collision with root package name */
    private final List<v> f14979t0 = new ArrayList();

    protected q(P p5, @q0 v vVar) {
        this.f14977r0 = p5;
        this.f14978s0 = vVar;
    }

    private static void a1(List<Animator> list, @q0 v vVar, ViewGroup viewGroup, View view, boolean z5) {
        if (vVar == null) {
            return;
        }
        Animator a6 = z5 ? vVar.a(viewGroup, view) : vVar.b(viewGroup, view);
        if (a6 != null) {
            list.add(a6);
        }
    }

    private Animator c1(@o0 ViewGroup viewGroup, @o0 View view, boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        a1(arrayList, this.f14977r0, viewGroup, view, z5);
        a1(arrayList, this.f14978s0, viewGroup, view, z5);
        Iterator<v> it = this.f14979t0.iterator();
        while (it.hasNext()) {
            a1(arrayList, it.next(), viewGroup, view, z5);
        }
        j1(viewGroup.getContext(), z5);
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void j1(@o0 Context context, boolean z5) {
        u.t(this, context, e1(z5));
        u.u(this, context, f1(z5), d1(z5));
    }

    @Override // androidx.transition.Visibility
    public Animator U0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return c1(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator W0(ViewGroup viewGroup, View view, d0 d0Var, d0 d0Var2) {
        return c1(viewGroup, view, false);
    }

    public void Z0(@o0 v vVar) {
        this.f14979t0.add(vVar);
    }

    public void b1() {
        this.f14979t0.clear();
    }

    @o0
    TimeInterpolator d1(boolean z5) {
        return com.google.android.material.animation.a.f12779b;
    }

    @androidx.annotation.f
    int e1(boolean z5) {
        return 0;
    }

    @androidx.annotation.f
    int f1(boolean z5) {
        return 0;
    }

    @o0
    public P h1() {
        return this.f14977r0;
    }

    @q0
    public v i1() {
        return this.f14978s0;
    }

    public boolean k1(@o0 v vVar) {
        return this.f14979t0.remove(vVar);
    }

    public void l1(@q0 v vVar) {
        this.f14978s0 = vVar;
    }
}
