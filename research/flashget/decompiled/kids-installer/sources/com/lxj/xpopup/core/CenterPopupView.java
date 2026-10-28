package com.lxj.xpopup.core;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import com.lxj.xpopup.animator.c;
import com.lxj.xpopup.animator.d;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class CenterPopupView extends BasePopupView {
    protected FrameLayout I;
    protected int J;
    protected int K;
    protected View L;

    public CenterPopupView(@o0 Context context) {
        super(context);
        this.I = (FrameLayout) findViewById(b.h.H0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void D() {
        super.D();
        h.g((ViewGroup) T(), Q(), P(), W(), U(), null);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int M() {
        return 0;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int N() {
        return b.k.f20619k;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int Q() {
        b bVar = this.f21074o;
        if (bVar == null) {
            return 0;
        }
        int i5 = bVar.f21158j;
        return i5 == 0 ? (int) (h.t(getContext()) * 0.85f) : i5;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected c S() {
        return new d(T(), K(), b3.c.ScaleAlphaFromCenter);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        if (this.I.getChildCount() == 0) {
            s0();
        }
        T().setTranslationX(this.f21074o.f21173y);
        T().setTranslationY(this.f21074o.f21174z);
        h.g((ViewGroup) T(), Q(), P(), W(), U(), null);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void n() {
        this.I.setBackground(h.m(getResources().getColor(b.e.f20046b), this.f21074o.f21162n));
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void o() {
        this.I.setBackground(h.m(getResources().getColor(b.e.f20051c), this.f21074o.f21162n));
    }

    protected void s0() {
        View inflate = LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.I, false);
        this.L = inflate;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams.gravity = 17;
        this.I.addView(this.L, layoutParams);
    }

    protected void t0() {
        if (this.J == 0) {
            if (this.f21074o.G) {
                n();
            } else {
                o();
            }
        }
    }
}
