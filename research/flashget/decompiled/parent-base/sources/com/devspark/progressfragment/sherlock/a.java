package com.devspark.progressfragment.sherlock;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import androidx.fragment.app.Fragment;
import com.devspark.progressfragment.b;
import com.devspark.progressfragment.states.b;
import com.devspark.progressfragment.states.c;
import com.devspark.progressfragment.states.d;
import com.devspark.progressfragment.states.e;
import com.devspark.progressfragment.states.f;
import com.devspark.progressfragment.states.g;

/* compiled from: ExSherlockProgressFragment.java */
/* loaded from: classes3.dex */
public class a extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    private View f48385b;

    /* renamed from: c, reason: collision with root package name */
    protected g f48386c;

    /* renamed from: d, reason: collision with root package name */
    protected g f48387d;

    /* renamed from: e, reason: collision with root package name */
    protected g f48388e;

    /* renamed from: f, reason: collision with root package name */
    protected g f48389f;

    /* renamed from: g, reason: collision with root package name */
    protected Animation f48390g;

    /* renamed from: h, reason: collision with root package name */
    protected Animation f48391h;

    /* renamed from: i, reason: collision with root package name */
    private g f48392i = new e();

    private void n(g gVar) {
        gVar.d(this.f48390g);
        gVar.b(this.f48391h);
        gVar.e(this.f48385b);
    }

    private void o() {
        c cVar = new c();
        this.f48386c = cVar;
        this.f48387d = new f();
        this.f48388e = new d();
        this.f48389f = new b();
        n(cVar);
        n(this.f48387d);
        n(this.f48388e);
        n(this.f48389f);
    }

    private void x(ViewGroup viewGroup, int i4, View view) {
        if (view == null) {
            return;
        }
        view.setId(i4);
        View findViewById = viewGroup.findViewById(i4);
        int indexOfChild = viewGroup.indexOfChild(findViewById);
        viewGroup.removeView(findViewById);
        viewGroup.addView(view, indexOfChild);
        view.setVisibility(8);
    }

    public void A(boolean z4) {
        g gVar = this.f48392i;
        g gVar2 = this.f48388e;
        if (gVar == gVar2) {
            return;
        }
        gVar2.c(z4);
        this.f48392i.a(z4);
        this.f48392i = this.f48388e;
    }

    public void B(boolean z4) {
        g gVar = this.f48392i;
        g gVar2 = this.f48387d;
        if (gVar == gVar2) {
            return;
        }
        gVar2.c(z4);
        this.f48392i.a(z4);
        this.f48392i = this.f48387d;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(b.i.C, viewGroup, false);
        View v4 = v(layoutInflater);
        View u4 = u(layoutInflater);
        View t4 = t(layoutInflater);
        View w4 = w(layoutInflater);
        x(viewGroup2, b.g.K, v4);
        x(viewGroup2, b.g.M, u4);
        x(viewGroup2, b.g.L, t4);
        x(viewGroup2, b.g.N, w4);
        this.f48385b = viewGroup2;
        this.f48390g = r();
        this.f48391h = s();
        o();
        return viewGroup2;
    }

    public boolean p() {
        return this.f48392i == this.f48389f;
    }

    public boolean q() {
        return this.f48392i == this.f48388e;
    }

    public Animation r() {
        return AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);
    }

    public Animation s() {
        return AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out);
    }

    public View t(LayoutInflater layoutInflater) {
        return null;
    }

    public View u(LayoutInflater layoutInflater) {
        return null;
    }

    public View v(LayoutInflater layoutInflater) {
        return null;
    }

    public View w(LayoutInflater layoutInflater) {
        return null;
    }

    public void y(boolean z4) {
        g gVar = this.f48392i;
        g gVar2 = this.f48389f;
        if (gVar == gVar2) {
            return;
        }
        gVar2.c(z4);
        this.f48392i.a(z4);
        this.f48392i = this.f48389f;
    }

    public void z(boolean z4) {
        g gVar = this.f48392i;
        g gVar2 = this.f48386c;
        if (gVar == gVar2) {
            return;
        }
        gVar2.c(z4);
        this.f48392i.a(z4);
        this.f48392i = this.f48386c;
    }
}
