package d4;

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

/* compiled from: ExProgressFragment.java */
/* loaded from: classes3.dex */
public class a extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    private View f73629b;

    /* renamed from: c, reason: collision with root package name */
    private g f73630c;

    /* renamed from: d, reason: collision with root package name */
    private g f73631d;

    /* renamed from: e, reason: collision with root package name */
    private g f73632e;

    /* renamed from: f, reason: collision with root package name */
    private g f73633f;

    /* renamed from: g, reason: collision with root package name */
    private Animation f73634g;

    /* renamed from: h, reason: collision with root package name */
    private Animation f73635h;

    /* renamed from: i, reason: collision with root package name */
    private g f73636i = new e();

    private void n(g gVar) {
        gVar.d(this.f73634g);
        gVar.b(this.f73635h);
        gVar.e(this.f73629b);
    }

    private void o() {
        c cVar = new c();
        this.f73630c = cVar;
        this.f73631d = new f();
        this.f73632e = new d();
        this.f73633f = new b();
        n(cVar);
        n(this.f73631d);
        n(this.f73632e);
        n(this.f73633f);
    }

    private void v(ViewGroup viewGroup, int i4, View view) {
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

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(b.i.C, viewGroup, false);
        View t4 = t(layoutInflater);
        View s4 = s(layoutInflater);
        View r4 = r(layoutInflater);
        View u4 = u(layoutInflater);
        v(viewGroup2, b.g.K, t4);
        v(viewGroup2, b.g.M, s4);
        v(viewGroup2, b.g.L, r4);
        v(viewGroup2, b.g.N, u4);
        this.f73629b = viewGroup2;
        this.f73634g = p();
        this.f73635h = q();
        o();
        return viewGroup2;
    }

    public Animation p() {
        return AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in);
    }

    public Animation q() {
        return AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out);
    }

    public View r(LayoutInflater layoutInflater) {
        return null;
    }

    public View s(LayoutInflater layoutInflater) {
        return null;
    }

    public View t(LayoutInflater layoutInflater) {
        return null;
    }

    public View u(LayoutInflater layoutInflater) {
        return null;
    }

    public void w(boolean z4) {
        g gVar = this.f73636i;
        g gVar2 = this.f73633f;
        if (gVar == gVar2) {
            return;
        }
        gVar2.c(z4);
        this.f73636i.a(z4);
        this.f73636i = this.f73633f;
    }

    public void x(boolean z4) {
        g gVar = this.f73636i;
        g gVar2 = this.f73630c;
        if (gVar == gVar2) {
            return;
        }
        gVar2.c(z4);
        this.f73636i.a(z4);
        this.f73636i = this.f73630c;
    }

    public void y(boolean z4) {
        g gVar = this.f73636i;
        g gVar2 = this.f73632e;
        if (gVar == gVar2) {
            return;
        }
        gVar2.c(z4);
        this.f73636i.a(z4);
        this.f73636i = this.f73632e;
    }

    public void z(boolean z4) {
        g gVar = this.f73636i;
        g gVar2 = this.f73631d;
        if (gVar == gVar2) {
            return;
        }
        gVar2.c(z4);
        this.f73636i.a(z4);
        this.f73636i = this.f73631d;
    }
}
