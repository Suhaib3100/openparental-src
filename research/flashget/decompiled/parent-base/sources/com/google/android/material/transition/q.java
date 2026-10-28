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
import androidx.transition.b0;
import com.google.android.material.transition.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MaterialVisibility.java */
/* loaded from: classes6.dex */
abstract class q<P extends v> extends Visibility {
    private final P R2;

    @q0
    private v S2;
    private final List<v> T2 = new ArrayList();

    protected q(P p4, @q0 v vVar) {
        this.R2 = p4;
        this.S2 = vVar;
    }

    private static void V0(List<Animator> list, @q0 v vVar, ViewGroup viewGroup, View view, boolean z4) {
        if (vVar == null) {
            return;
        }
        Animator b5 = z4 ? vVar.b(viewGroup, view) : vVar.a(viewGroup, view);
        if (b5 != null) {
            list.add(b5);
        }
    }

    private Animator X0(@o0 ViewGroup viewGroup, @o0 View view, boolean z4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        V0(arrayList, this.R2, viewGroup, view, z4);
        V0(arrayList, this.S2, viewGroup, view, z4);
        Iterator<v> it = this.T2.iterator();
        while (it.hasNext()) {
            V0(arrayList, it.next(), viewGroup, view, z4);
        }
        d1(viewGroup.getContext(), z4);
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void d1(@o0 Context context, boolean z4) {
        u.t(this, context, Z0(z4));
        u.u(this, context, a1(z4), Y0(z4));
    }

    @Override // androidx.transition.Visibility
    public Animator P0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        return X0(viewGroup, view, true);
    }

    @Override // androidx.transition.Visibility
    public Animator R0(ViewGroup viewGroup, View view, b0 b0Var, b0 b0Var2) {
        return X0(viewGroup, view, false);
    }

    public void U0(@o0 v vVar) {
        this.T2.add(vVar);
    }

    public void W0() {
        this.T2.clear();
    }

    @o0
    TimeInterpolator Y0(boolean z4) {
        return com.google.android.material.animation.a.f52467b;
    }

    @androidx.annotation.f
    int Z0(boolean z4) {
        return 0;
    }

    @androidx.annotation.f
    int a1(boolean z4) {
        return 0;
    }

    @o0
    public P b1() {
        return this.R2;
    }

    @q0
    public v c1() {
        return this.S2;
    }

    public boolean e1(@o0 v vVar) {
        return this.T2.remove(vVar);
    }

    public void f1(@q0 v vVar) {
        this.S2 = vVar;
    }
}
