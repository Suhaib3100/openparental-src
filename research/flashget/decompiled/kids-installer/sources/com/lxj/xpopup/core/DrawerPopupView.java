package com.lxj.xpopup.core;

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
import b3.d;
import b3.e;
import c3.j;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.KeyboardUtils;
import com.lxj.xpopup.widget.PopupDrawerLayout;

/* loaded from: classes6.dex */
public abstract class DrawerPopupView extends BasePopupView {
    protected PopupDrawerLayout I;
    protected FrameLayout J;
    float K;
    Paint L;
    Rect M;
    public ArgbEvaluator N;
    int O;
    int P;

    /* loaded from: classes5.dex */
    class a implements PopupDrawerLayout.d {
        a() {
        }

        @Override // com.lxj.xpopup.widget.PopupDrawerLayout.d
        public void a() {
        }

        @Override // com.lxj.xpopup.widget.PopupDrawerLayout.d
        public void b(int x5, float fraction, boolean isToLeft) {
            DrawerPopupView drawerPopupView = DrawerPopupView.this;
            com.lxj.xpopup.core.b bVar = drawerPopupView.f21074o;
            if (bVar == null) {
                return;
            }
            j jVar = bVar.f21164p;
            if (jVar != null) {
                jVar.d(drawerPopupView, x5, fraction, isToLeft);
            }
            DrawerPopupView drawerPopupView2 = DrawerPopupView.this;
            drawerPopupView2.K = fraction;
            if (drawerPopupView2.f21074o.f21152d.booleanValue()) {
                DrawerPopupView.this.f21076q.g(fraction);
            }
            DrawerPopupView.this.postInvalidate();
        }

        @Override // com.lxj.xpopup.widget.PopupDrawerLayout.d
        public void onClose() {
            j jVar;
            DrawerPopupView.this.q();
            DrawerPopupView drawerPopupView = DrawerPopupView.this;
            com.lxj.xpopup.core.b bVar = drawerPopupView.f21074o;
            if (bVar != null && (jVar = bVar.f21164p) != null) {
                jVar.i(drawerPopupView);
            }
            DrawerPopupView.this.A();
        }
    }

    /* loaded from: classes5.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v5) {
            DrawerPopupView drawerPopupView = DrawerPopupView.this;
            com.lxj.xpopup.core.b bVar = drawerPopupView.f21074o;
            if (bVar != null) {
                j jVar = bVar.f21164p;
                if (jVar != null) {
                    jVar.f(drawerPopupView);
                }
                if (DrawerPopupView.this.f21074o.f21150b.booleanValue()) {
                    DrawerPopupView.this.x();
                }
            }
        }
    }

    /* loaded from: classes5.dex */
    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            DrawerPopupView.this.O = ((Integer) animation.getAnimatedValue()).intValue();
            DrawerPopupView.this.postInvalidate();
        }
    }

    public DrawerPopupView(@o0 Context context) {
        super(context);
        this.K = 0.0f;
        this.L = new Paint();
        this.N = new ArgbEvaluator();
        this.O = 0;
        this.P = 0;
        this.I = (PopupDrawerLayout) findViewById(b.h.A1);
        this.J = (FrameLayout) findViewById(b.h.f20548z1);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void A() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar != null && bVar.f21163o.booleanValue()) {
            KeyboardUtils.c(this);
        }
        this.f21084y.removeCallbacks(this.E);
        this.f21084y.postDelayed(this.E, 0L);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void C() {
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void D() {
        super.D();
        View childAt = this.J.getChildAt(0);
        if (childAt == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (this.f21074o != null) {
            layoutParams.height = -1;
            if (W() > 0) {
                layoutParams.width = W();
            }
            if (Q() > 0) {
                layoutParams.width = Math.min(layoutParams.width, Q());
            }
            childAt.setLayoutParams(layoutParams);
        }
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void E() {
        this.I.g();
        t0(true);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int N() {
        return b.k.f20625m;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c S() {
        return null;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public View V() {
        return this.J.getChildAt(0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        if (this.J.getChildCount() == 0) {
            s0();
        }
        this.I.F = this.f21074o.f21150b.booleanValue();
        this.I.i(new a());
        V().setTranslationX(this.f21074o.f21173y);
        V().setTranslationY(this.f21074o.f21174z);
        PopupDrawerLayout popupDrawerLayout = this.I;
        d dVar = this.f21074o.f21166r;
        if (dVar == null) {
            dVar = d.Left;
        }
        popupDrawerLayout.h(dVar);
        PopupDrawerLayout popupDrawerLayout2 = this.I;
        popupDrawerLayout2.f21421u = this.f21074o.A;
        popupDrawerLayout2.getChildAt(0).setOnClickListener(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || !bVar.f21167s.booleanValue()) {
            return;
        }
        if (this.M == null) {
            this.M = new Rect(0, 0, getMeasuredWidth(), Z());
        }
        this.L.setColor(((Integer) this.N.evaluate(this.K, Integer.valueOf(this.P), Integer.valueOf(Y()))).intValue());
        canvas.drawRect(this.M, this.L);
    }

    protected void s0() {
        View inflate = LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.J, false);
        this.J.addView(inflate);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (this.f21074o != null) {
            layoutParams.height = -1;
            if (W() > 0) {
                layoutParams.width = W();
            }
            if (Q() > 0) {
                layoutParams.width = Math.min(layoutParams.width, Q());
            }
            inflate.setLayoutParams(layoutParams);
        }
    }

    public void t0(boolean isShow) {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null || !bVar.f21167s.booleanValue()) {
            return;
        }
        ArgbEvaluator argbEvaluator = this.N;
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(isShow ? 0 : Y());
        objArr[1] = Integer.valueOf(isShow ? Y() : 0);
        ValueAnimator ofObject = ValueAnimator.ofObject(argbEvaluator, objArr);
        ofObject.addUpdateListener(new c());
        ofObject.setDuration(K()).start();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void x() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return;
        }
        e eVar = this.f21079t;
        e eVar2 = e.Dismissing;
        if (eVar == eVar2) {
            return;
        }
        this.f21079t = eVar2;
        if (bVar.f21163o.booleanValue()) {
            KeyboardUtils.c(this);
        }
        clearFocus();
        t0(false);
        this.I.e();
    }
}
