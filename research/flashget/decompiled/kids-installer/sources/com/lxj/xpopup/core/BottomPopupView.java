package com.lxj.xpopup.core;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import b3.e;
import c3.j;
import com.lxj.xpopup.animator.c;
import com.lxj.xpopup.animator.h;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.KeyboardUtils;
import com.lxj.xpopup.widget.SmartDragLayout;

/* loaded from: classes6.dex */
public class BottomPopupView extends BasePopupView {
    protected SmartDragLayout I;
    private h J;

    /* loaded from: classes5.dex */
    class a implements SmartDragLayout.c {
        a() {
        }

        @Override // com.lxj.xpopup.widget.SmartDragLayout.c
        public void a() {
        }

        @Override // com.lxj.xpopup.widget.SmartDragLayout.c
        public void b(int value, float percent, boolean isScrollUp) {
            BottomPopupView bottomPopupView = BottomPopupView.this;
            com.lxj.xpopup.core.b bVar = bottomPopupView.f21074o;
            if (bVar == null) {
                return;
            }
            j jVar = bVar.f21164p;
            if (jVar != null) {
                jVar.d(bottomPopupView, value, percent, isScrollUp);
            }
            if (!BottomPopupView.this.f21074o.f21152d.booleanValue() || BottomPopupView.this.f21074o.f21153e.booleanValue()) {
                return;
            }
            BottomPopupView bottomPopupView2 = BottomPopupView.this;
            bottomPopupView2.setBackgroundColor(bottomPopupView2.f21076q.h(percent));
        }

        @Override // com.lxj.xpopup.widget.SmartDragLayout.c
        public void onClose() {
            j jVar;
            BottomPopupView.this.q();
            BottomPopupView bottomPopupView = BottomPopupView.this;
            com.lxj.xpopup.core.b bVar = bottomPopupView.f21074o;
            if (bVar != null && (jVar = bVar.f21164p) != null) {
                jVar.i(bottomPopupView);
            }
            BottomPopupView.this.A();
        }
    }

    /* loaded from: classes5.dex */
    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v5) {
            BottomPopupView bottomPopupView = BottomPopupView.this;
            com.lxj.xpopup.core.b bVar = bottomPopupView.f21074o;
            if (bVar != null) {
                j jVar = bVar.f21164p;
                if (jVar != null) {
                    jVar.f(bottomPopupView);
                }
                BottomPopupView bottomPopupView2 = BottomPopupView.this;
                if (bottomPopupView2.f21074o.f21150b != null) {
                    bottomPopupView2.x();
                }
            }
        }
    }

    public BottomPopupView(@o0 Context context) {
        super(context);
        this.I = (SmartDragLayout) findViewById(b.h.B0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void A() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return;
        }
        if (!bVar.A) {
            super.A();
            return;
        }
        if (bVar.f21163o.booleanValue()) {
            KeyboardUtils.c(this);
        }
        this.f21084y.removeCallbacks(this.E);
        this.f21084y.postDelayed(this.E, 0L);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void C() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return;
        }
        if (!bVar.A) {
            super.C();
            return;
        }
        if (bVar.f21153e.booleanValue() && (aVar = this.f21077r) != null) {
            aVar.a();
        }
        this.I.b();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void D() {
        super.D();
        com.lxj.xpopup.util.h.g((ViewGroup) T(), Q(), P(), W(), U(), null);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void E() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return;
        }
        if (!bVar.A) {
            super.E();
            return;
        }
        if (bVar.f21153e.booleanValue() && (aVar = this.f21077r) != null) {
            aVar.b();
        }
        this.I.g();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int M() {
        return 0;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int N() {
        return b.k.f20604f;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected c S() {
        if (this.f21074o == null) {
            return null;
        }
        if (this.J == null) {
            this.J = new h(T(), K(), b3.c.TranslateFromBottom);
        }
        if (this.f21074o.A) {
            return null;
        }
        return this.J;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        if (this.I.getChildCount() == 0) {
            s0();
        }
        this.I.h(K());
        this.I.d(this.f21074o.A);
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar.A) {
            bVar.f21155g = null;
            V().setTranslationX(this.f21074o.f21173y);
            V().setTranslationY(this.f21074o.f21174z);
        } else {
            T().setTranslationX(this.f21074o.f21173y);
            T().setTranslationY(this.f21074o.f21174z);
        }
        this.I.c(this.f21074o.f21150b.booleanValue());
        this.I.f(this.f21074o.I);
        com.lxj.xpopup.util.h.g((ViewGroup) T(), Q(), P(), W(), U(), null);
        this.I.i(new a());
        this.I.setOnClickListener(new b());
    }

    @Override // com.lxj.xpopup.core.BasePopupView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar != null && !bVar.A && this.J != null) {
            T().setTranslationX(this.J.f19818f);
            T().setTranslationY(this.J.f19819g);
            this.J.f19787b = true;
        }
        super.onDetachedFromWindow();
    }

    protected void s0() {
        this.I.addView(LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.I, false));
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void x() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return;
        }
        if (!bVar.A) {
            super.x();
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
        this.I.b();
    }
}
