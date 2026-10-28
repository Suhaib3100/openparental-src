package com.google.android.material.transition.platform;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.transition.TransitionValues;
import android.transition.Visibility;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.google.android.material.transition.platform.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: MaterialVisibility.java */
@x0(21)
/* loaded from: classes2.dex */
abstract class r<P extends w> extends Visibility {

    /* renamed from: o, reason: collision with root package name */
    private final P f14943o;

    /* renamed from: p, reason: collision with root package name */
    @q0
    private w f14944p;

    /* renamed from: q, reason: collision with root package name */
    private final List<w> f14945q = new ArrayList();

    protected r(P p5, @q0 w wVar) {
        this.f14943o = p5;
        this.f14944p = wVar;
    }

    private static void b(List<Animator> list, @q0 w wVar, ViewGroup viewGroup, View view, boolean z5) {
        if (wVar == null) {
            return;
        }
        Animator a6 = z5 ? wVar.a(viewGroup, view) : wVar.b(viewGroup, view);
        if (a6 != null) {
            list.add(a6);
        }
    }

    private Animator d(@o0 ViewGroup viewGroup, @o0 View view, boolean z5) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        b(arrayList, this.f14943o, viewGroup, view, z5);
        b(arrayList, this.f14944p, viewGroup, view, z5);
        Iterator<w> it = this.f14945q.iterator();
        while (it.hasNext()) {
            b(arrayList, it.next(), viewGroup, view, z5);
        }
        l(viewGroup.getContext(), z5);
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void l(@o0 Context context, boolean z5) {
        v.t(this, context, f(z5));
        v.u(this, context, i(z5), e(z5));
    }

    public void a(@o0 w wVar) {
        this.f14945q.add(wVar);
    }

    public void c() {
        this.f14945q.clear();
    }

    @o0
    TimeInterpolator e(boolean z5) {
        return com.google.android.material.animation.a.f12779b;
    }

    @androidx.annotation.f
    int f(boolean z5) {
        return 0;
    }

    @androidx.annotation.f
    int i(boolean z5) {
        return 0;
    }

    @o0
    public P j() {
        return this.f14943o;
    }

    @q0
    public w k() {
        return this.f14944p;
    }

    public boolean m(@o0 w wVar) {
        return this.f14945q.remove(wVar);
    }

    public void n(@q0 w wVar) {
        this.f14944p = wVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return d(viewGroup, view, false);
    }
}
