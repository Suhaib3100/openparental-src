package com.lxj.xpopup.impl;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import com.lxj.xpopup.animator.c;
import com.lxj.xpopup.animator.h;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.BasePopupView;

/* loaded from: classes6.dex */
public class FullScreenPopupView extends BasePopupView {
    public ArgbEvaluator I;
    protected View J;
    protected FrameLayout K;
    private Paint L;
    protected Rect M;
    int N;
    private h O;

    /* loaded from: classes5.dex */
    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            FullScreenPopupView.this.N = ((Integer) animation.getAnimatedValue()).intValue();
            FullScreenPopupView.this.postInvalidate();
        }
    }

    public FullScreenPopupView(@o0 Context context) {
        super(context);
        this.I = new ArgbEvaluator();
        this.L = new Paint();
        this.N = 0;
        this.K = (FrameLayout) findViewById(b.h.U1);
    }

    private void t0(boolean isShow) {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || !bVar.f21167s.booleanValue()) {
            return;
        }
        ArgbEvaluator argbEvaluator = this.I;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(isShow ? 0 : Y());
        objArr[1] = Integer.valueOf(isShow ? Y() : 0);
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
        ofObject.addUpdateListener(new a());
        ofObject.setDuration(K()).start();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void C() {
        super.C();
        t0(false);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void E() {
        super.E();
        t0(true);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int N() {
        return b.k.f20628n;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected c S() {
        if (this.O == null) {
            this.O = new h(T(), K(), b3.c.TranslateFromBottom);
        }
        return this.O;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        if (this.K.getChildCount() == 0) {
            s0();
        }
        T().setTranslationX(this.f21074o.f21173y);
        T().setTranslationY(this.f21074o.f21174z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || !bVar.f21167s.booleanValue()) {
            return;
        }
        this.L.setColor(this.N);
        Rect rect = new Rect(0, 0, getMeasuredWidth(), Z());
        this.M = rect;
        canvas.drawRect(rect, this.L);
    }

    @Override // com.lxj.xpopup.core.BasePopupView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f21074o != null && this.O != null) {
            T().setTranslationX(this.O.f19818f);
            T().setTranslationY(this.O.f19819g);
            this.O.f19787b = true;
        }
        super.onDetachedFromWindow();
    }

    protected void s0() {
        View inflate = LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.K, false);
        this.J = inflate;
        this.K.addView(inflate);
    }
}
