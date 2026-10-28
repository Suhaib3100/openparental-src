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
/* loaded from: classes6.dex */
abstract class r<P extends w> extends Visibility {

    /* renamed from: b, reason: collision with root package name */
    private final P f54782b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    private w f54783c;

    /* renamed from: d, reason: collision with root package name */
    private final List<w> f54784d = new ArrayList();

    protected r(P p4, @q0 w wVar) {
        this.f54782b = p4;
        this.f54783c = wVar;
    }

    private static void c(List<Animator> list, @q0 w wVar, ViewGroup viewGroup, View view, boolean z4) {
        if (wVar == null) {
            return;
        }
        Animator b5 = z4 ? wVar.b(viewGroup, view) : wVar.a(viewGroup, view);
        if (b5 != null) {
            list.add(b5);
        }
    }

    private Animator e(@o0 ViewGroup viewGroup, @o0 View view, boolean z4) {
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        c(arrayList, this.f54782b, viewGroup, view, z4);
        c(arrayList, this.f54783c, viewGroup, view, z4);
        Iterator<w> it = this.f54784d.iterator();
        while (it.hasNext()) {
            c(arrayList, it.next(), viewGroup, view, z4);
        }
        m(viewGroup.getContext(), z4);
        com.google.android.material.animation.b.a(animatorSet, arrayList);
        return animatorSet;
    }

    private void m(@o0 Context context, boolean z4) {
        v.t(this, context, g(z4));
        v.u(this, context, i(z4), f(z4));
    }

    public void b(@o0 w wVar) {
        this.f54784d.add(wVar);
    }

    public void d() {
        this.f54784d.clear();
    }

    @o0
    TimeInterpolator f(boolean z4) {
        return com.google.android.material.animation.a.f52467b;
    }

    @androidx.annotation.f
    int g(boolean z4) {
        return 0;
    }

    @androidx.annotation.f
    int i(boolean z4) {
        return 0;
    }

    @o0
    public P k() {
        return this.f54782b;
    }

    @q0
    public w l() {
        return this.f54783c;
    }

    public boolean n(@o0 w wVar) {
        return this.f54784d.remove(wVar);
    }

    public void o(@q0 w wVar) {
        this.f54783c = wVar;
    }

    @Override // android.transition.Visibility
    public Animator onAppear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return e(viewGroup, view, true);
    }

    @Override // android.transition.Visibility
    public Animator onDisappear(ViewGroup viewGroup, View view, TransitionValues transitionValues, TransitionValues transitionValues2) {
        return e(viewGroup, view, false);
    }
}
