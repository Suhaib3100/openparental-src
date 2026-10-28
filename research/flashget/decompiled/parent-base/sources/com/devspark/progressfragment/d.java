package com.devspark.progressfragment;

import android.R;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.devspark.progressfragment.b;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: SherlockProgressFragment.java */
/* loaded from: classes3.dex */
public class d extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    private View f48379b;

    /* renamed from: c, reason: collision with root package name */
    private View f48380c;

    /* renamed from: d, reason: collision with root package name */
    private View f48381d;

    /* renamed from: e, reason: collision with root package name */
    private View f48382e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f48383f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f48384g;

    private void n() {
        if (this.f48380c == null || this.f48379b == null) {
            View view = getView();
            if (view == null) {
                throw new IllegalStateException(ProtectedSandApp.s("ᔭ"));
            }
            View findViewById = view.findViewById(b.g.f48004p0);
            this.f48379b = findViewById;
            if (findViewById == null) {
                throw new RuntimeException(ProtectedSandApp.s("ᔬ"));
            }
            View findViewById2 = view.findViewById(b.g.D);
            this.f48380c = findViewById2;
            if (findViewById2 == null) {
                throw new RuntimeException(ProtectedSandApp.s("ᔫ"));
            }
            View findViewById3 = view.findViewById(R.id.empty);
            this.f48382e = findViewById3;
            if (findViewById3 != null) {
                findViewById3.setVisibility(8);
            }
            this.f48383f = true;
            if (this.f48381d == null) {
                s(false, false);
            }
        }
    }

    private void s(boolean z4, boolean z5) {
        n();
        if (this.f48383f == z4) {
            return;
        }
        this.f48383f = z4;
        if (z4) {
            if (z5) {
                this.f48379b.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out));
                this.f48380c.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in));
            } else {
                this.f48379b.clearAnimation();
                this.f48380c.clearAnimation();
            }
            this.f48379b.setVisibility(8);
            this.f48380c.setVisibility(0);
            return;
        }
        if (z5) {
            this.f48379b.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.fade_in));
            this.f48380c.startAnimation(AnimationUtils.loadAnimation(getActivity(), R.anim.fade_out));
        } else {
            this.f48379b.clearAnimation();
            this.f48380c.clearAnimation();
        }
        this.f48379b.setVisibility(0);
        this.f48380c.setVisibility(8);
    }

    public View o() {
        return this.f48381d;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(b.i.E, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        this.f48383f = false;
        this.f48384g = false;
        this.f48382e = null;
        this.f48381d = null;
        this.f48380c = null;
        this.f48379b = null;
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        n();
    }

    public boolean p() {
        return this.f48384g;
    }

    public void q(boolean z4) {
        n();
        if (this.f48381d == null) {
            throw new IllegalStateException(ProtectedSandApp.s("ᔮ"));
        }
        if (z4) {
            this.f48382e.setVisibility(0);
            this.f48381d.setVisibility(8);
        } else {
            this.f48382e.setVisibility(8);
            this.f48381d.setVisibility(0);
        }
        this.f48384g = z4;
    }

    public void r(boolean z4) {
        s(z4, true);
    }

    public void t(boolean z4) {
        s(z4, false);
    }

    public void u(int i4) {
        v(LayoutInflater.from(getActivity()).inflate(i4, (ViewGroup) null));
    }

    public void v(View view) {
        n();
        if (view == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ᔰ"));
        }
        View view2 = this.f48380c;
        if (!(view2 instanceof ViewGroup)) {
            throw new IllegalStateException(ProtectedSandApp.s("ᔯ"));
        }
        ViewGroup viewGroup = (ViewGroup) view2;
        View view3 = this.f48381d;
        if (view3 == null) {
            viewGroup.addView(view);
        } else {
            int indexOfChild = viewGroup.indexOfChild(view3);
            viewGroup.removeView(this.f48381d);
            viewGroup.addView(view, indexOfChild);
        }
        this.f48381d = view;
    }

    public void w(int i4) {
        x(getString(i4));
    }

    public void x(CharSequence charSequence) {
        n();
        View view = this.f48382e;
        if (view == null || !(view instanceof TextView)) {
            throw new IllegalStateException(ProtectedSandApp.s("ᔯ"));
        }
        ((TextView) view).setText(charSequence);
    }
}
