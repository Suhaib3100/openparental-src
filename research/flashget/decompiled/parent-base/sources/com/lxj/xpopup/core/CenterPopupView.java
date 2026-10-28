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

    /* renamed from: v, reason: collision with root package name */
    protected FrameLayout f69582v;

    /* renamed from: w, reason: collision with root package name */
    protected int f69583w;

    /* renamed from: x, reason: collision with root package name */
    protected int f69584x;

    /* renamed from: y, reason: collision with root package name */
    protected View f69585y;

    public CenterPopupView(@o0 Context context) {
        super(context);
        this.f69582v = (FrameLayout) findViewById(b.h.H0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int I() {
        return 0;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int J() {
        return b.k.f68814k;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int M() {
        b bVar = this.f69527b;
        if (bVar == null) {
            return 0;
        }
        int i4 = bVar.f69632j;
        return i4 == 0 ? (int) (h.t(getContext()) * 0.85f) : i4;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected c O() {
        return new d(P(), G(), fb.c.ScaleAlphaFromCenter);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        if (this.f69582v.getChildCount() == 0) {
            o0();
        }
        P().setTranslationX(this.f69527b.f69647y);
        P().setTranslationY(this.f69527b.f69648z);
        h.g((ViewGroup) P(), M(), L(), S(), Q(), null);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void h() {
        this.f69582v.setBackground(h.m(getResources().getColor(b.e.f68297b), this.f69527b.f69636n));
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void i() {
        this.f69582v.setBackground(h.m(getResources().getColor(b.e.f68302c), this.f69527b.f69636n));
    }

    protected void o0() {
        View inflate = LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69582v, false);
        this.f69585y = inflate;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) inflate.getLayoutParams();
        layoutParams.gravity = 17;
        this.f69582v.addView(this.f69585y, layoutParams);
    }

    protected void p0() {
        if (this.f69583w == 0) {
            if (this.f69527b.G) {
                h();
            } else {
                i();
            }
        }
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void z() {
        super.z();
        h.g((ViewGroup) P(), M(), L(), S(), Q(), null);
    }
}
