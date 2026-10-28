package com.lxj.xpopup.core;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.lxj.xpopup.animator.c;
import com.lxj.xpopup.animator.h;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.KeyboardUtils;
import com.lxj.xpopup.widget.SmartDragLayout;
import fb.e;
import gb.j;

/* loaded from: classes6.dex */
public class BottomPopupView extends BasePopupView {

    /* renamed from: v, reason: collision with root package name */
    protected SmartDragLayout f69561v;

    /* renamed from: w, reason: collision with root package name */
    private h f69562w;

    class a implements SmartDragLayout.c {
        a() {
        }

        @Override // com.lxj.xpopup.widget.SmartDragLayout.c
        public void a() {
            j jVar;
            BottomPopupView.this.k();
            BottomPopupView bottomPopupView = BottomPopupView.this;
            com.lxj.xpopup.core.b bVar = bottomPopupView.f69527b;
            if (bVar != null && (jVar = bVar.f69638p) != null) {
                jVar.i(bottomPopupView);
            }
            BottomPopupView.this.w();
        }

        @Override // com.lxj.xpopup.widget.SmartDragLayout.c
        public void b(int value, float percent, boolean isScrollUp) {
            BottomPopupView bottomPopupView = BottomPopupView.this;
            com.lxj.xpopup.core.b bVar = bottomPopupView.f69527b;
            if (bVar == null) {
                return;
            }
            j jVar = bVar.f69638p;
            if (jVar != null) {
                jVar.d(bottomPopupView, value, percent, isScrollUp);
            }
            if (!BottomPopupView.this.f69527b.f69626d.booleanValue() || BottomPopupView.this.f69527b.f69627e.booleanValue()) {
                return;
            }
            BottomPopupView bottomPopupView2 = BottomPopupView.this;
            bottomPopupView2.setBackgroundColor(bottomPopupView2.f69529d.h(percent));
        }

        @Override // com.lxj.xpopup.widget.SmartDragLayout.c
        public void c() {
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v4) {
            BottomPopupView bottomPopupView = BottomPopupView.this;
            com.lxj.xpopup.core.b bVar = bottomPopupView.f69527b;
            if (bVar != null) {
                j jVar = bVar.f69638p;
                if (jVar != null) {
                    jVar.e(bottomPopupView);
                }
                BottomPopupView bottomPopupView2 = BottomPopupView.this;
                if (bottomPopupView2.f69527b.f69624b != null) {
                    bottomPopupView2.t();
                }
            }
        }
    }

    public BottomPopupView(@o0 Context context) {
        super(context);
        this.f69561v = (SmartDragLayout) findViewById(b.h.B0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void A() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return;
        }
        if (!bVar.A) {
            super.A();
            return;
        }
        if (bVar.f69627e.booleanValue() && (aVar = this.f69530e) != null) {
            aVar.b();
        }
        this.f69561v.g();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int I() {
        return 0;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int J() {
        return b.k.f68799f;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected c O() {
        if (this.f69527b == null) {
            return null;
        }
        if (this.f69562w == null) {
            this.f69562w = new h(P(), G(), fb.c.TranslateFromBottom);
        }
        if (this.f69527b.A) {
            return null;
        }
        return this.f69562w;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        if (this.f69561v.getChildCount() == 0) {
            o0();
        }
        this.f69561v.h(G());
        this.f69561v.d(this.f69527b.A);
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar.A) {
            bVar.f69629g = null;
            R().setTranslationX(this.f69527b.f69647y);
            R().setTranslationY(this.f69527b.f69648z);
        } else {
            P().setTranslationX(this.f69527b.f69647y);
            P().setTranslationY(this.f69527b.f69648z);
        }
        this.f69561v.c(this.f69527b.f69624b.booleanValue());
        this.f69561v.f(this.f69527b.I);
        com.lxj.xpopup.util.h.g((ViewGroup) P(), M(), L(), S(), Q(), null);
        this.f69561v.i(new a());
        this.f69561v.setOnClickListener(new b());
    }

    protected void o0() {
        this.f69561v.addView(LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69561v, false));
    }

    @Override // com.lxj.xpopup.core.BasePopupView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar != null && !bVar.A && this.f69562w != null) {
            P().setTranslationX(this.f69562w.f67896f);
            P().setTranslationY(this.f69562w.f67897g);
            this.f69562w.f67865b = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void t() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return;
        }
        if (!bVar.A) {
            super.t();
            return;
        }
        e eVar = this.f69532g;
        e eVar2 = e.Dismissing;
        if (eVar == eVar2) {
            return;
        }
        this.f69532g = eVar2;
        if (bVar.f69637o.booleanValue()) {
            KeyboardUtils.c(this);
        }
        clearFocus();
        this.f69561v.b();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void w() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return;
        }
        if (!bVar.A) {
            super.w();
            return;
        }
        if (bVar.f69637o.booleanValue()) {
            KeyboardUtils.c(this);
        }
        this.f69537l.removeCallbacks(this.f69543r);
        this.f69537l.postDelayed(this.f69543r, 0L);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void y() {
        com.lxj.xpopup.animator.a aVar;
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return;
        }
        if (!bVar.A) {
            super.y();
            return;
        }
        if (bVar.f69627e.booleanValue() && (aVar = this.f69530e) != null) {
            aVar.a();
        }
        this.f69561v.b();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void z() {
        super.z();
        com.lxj.xpopup.util.h.g((ViewGroup) P(), M(), L(), S(), Q(), null);
    }
}
