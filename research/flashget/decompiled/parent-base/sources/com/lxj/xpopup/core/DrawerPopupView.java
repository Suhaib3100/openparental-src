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
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.KeyboardUtils;
import com.lxj.xpopup.widget.PopupDrawerLayout;
import fb.d;
import fb.e;
import gb.j;

/* loaded from: classes6.dex */
public abstract class DrawerPopupView extends BasePopupView {
    public ArgbEvaluator A;
    int B;
    int C;

    /* renamed from: v, reason: collision with root package name */
    protected PopupDrawerLayout f69586v;

    /* renamed from: w, reason: collision with root package name */
    protected FrameLayout f69587w;

    /* renamed from: x, reason: collision with root package name */
    float f69588x;

    /* renamed from: y, reason: collision with root package name */
    Paint f69589y;

    /* renamed from: z, reason: collision with root package name */
    Rect f69590z;

    class a implements PopupDrawerLayout.d {
        a() {
        }

        @Override // com.lxj.xpopup.widget.PopupDrawerLayout.d
        public void a() {
            j jVar;
            DrawerPopupView.this.k();
            DrawerPopupView drawerPopupView = DrawerPopupView.this;
            com.lxj.xpopup.core.b bVar = drawerPopupView.f69527b;
            if (bVar != null && (jVar = bVar.f69638p) != null) {
                jVar.i(drawerPopupView);
            }
            DrawerPopupView.this.w();
        }

        @Override // com.lxj.xpopup.widget.PopupDrawerLayout.d
        public void b(int x4, float fraction, boolean isToLeft) {
            DrawerPopupView drawerPopupView = DrawerPopupView.this;
            com.lxj.xpopup.core.b bVar = drawerPopupView.f69527b;
            if (bVar == null) {
                return;
            }
            j jVar = bVar.f69638p;
            if (jVar != null) {
                jVar.d(drawerPopupView, x4, fraction, isToLeft);
            }
            DrawerPopupView drawerPopupView2 = DrawerPopupView.this;
            drawerPopupView2.f69588x = fraction;
            if (drawerPopupView2.f69527b.f69626d.booleanValue()) {
                DrawerPopupView.this.f69529d.g(fraction);
            }
            DrawerPopupView.this.postInvalidate();
        }

        @Override // com.lxj.xpopup.widget.PopupDrawerLayout.d
        public void c() {
        }
    }

    class b implements View.OnClickListener {
        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View v4) {
            DrawerPopupView drawerPopupView = DrawerPopupView.this;
            com.lxj.xpopup.core.b bVar = drawerPopupView.f69527b;
            if (bVar != null) {
                j jVar = bVar.f69638p;
                if (jVar != null) {
                    jVar.e(drawerPopupView);
                }
                if (DrawerPopupView.this.f69527b.f69624b.booleanValue()) {
                    DrawerPopupView.this.t();
                }
            }
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            DrawerPopupView.this.B = ((Integer) animation.getAnimatedValue()).intValue();
            DrawerPopupView.this.postInvalidate();
        }
    }

    public DrawerPopupView(@o0 Context context) {
        super(context);
        this.f69588x = 0.0f;
        this.f69589y = new Paint();
        this.A = new ArgbEvaluator();
        this.B = 0;
        this.C = 0;
        this.f69586v = (PopupDrawerLayout) findViewById(b.h.A1);
        this.f69587w = (FrameLayout) findViewById(b.h.f68744z1);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void A() {
        this.f69586v.g();
        p0(true);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int J() {
        return b.k.f68820m;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c O() {
        return null;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public View R() {
        return this.f69587w.getChildAt(0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        if (this.f69587w.getChildCount() == 0) {
            o0();
        }
        this.f69586v.f69922s = this.f69527b.f69624b.booleanValue();
        this.f69586v.i(new a());
        R().setTranslationX(this.f69527b.f69647y);
        R().setTranslationY(this.f69527b.f69648z);
        PopupDrawerLayout popupDrawerLayout = this.f69586v;
        d dVar = this.f69527b.f69640r;
        if (dVar == null) {
            dVar = d.Left;
        }
        popupDrawerLayout.h(dVar);
        PopupDrawerLayout popupDrawerLayout2 = this.f69586v;
        popupDrawerLayout2.f69911h = this.f69527b.A;
        popupDrawerLayout2.getChildAt(0).setOnClickListener(new b());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || !bVar.f69641s.booleanValue()) {
            return;
        }
        if (this.f69590z == null) {
            this.f69590z = new Rect(0, 0, getMeasuredWidth(), V());
        }
        this.f69589y.setColor(((Integer) this.A.evaluate(this.f69588x, Integer.valueOf(this.C), Integer.valueOf(U()))).intValue());
        canvas.drawRect(this.f69590z, this.f69589y);
    }

    protected void o0() {
        View inflate = LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69587w, false);
        this.f69587w.addView(inflate);
        ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
        if (this.f69527b != null) {
            layoutParams.height = -1;
            if (S() > 0) {
                layoutParams.width = S();
            }
            if (M() > 0) {
                layoutParams.width = Math.min(layoutParams.width, M());
            }
            inflate.setLayoutParams(layoutParams);
        }
    }

    public void p0(boolean isShow) {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || !bVar.f69641s.booleanValue()) {
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(this.A, Integer.valueOf(isShow ? 0 : U()), Integer.valueOf(isShow ? U() : 0));
        ofObject.addUpdateListener(new c());
        ofObject.setDuration(G()).start();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void t() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
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
        p0(false);
        this.f69586v.e();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void w() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar != null && bVar.f69637o.booleanValue()) {
            KeyboardUtils.c(this);
        }
        this.f69537l.removeCallbacks(this.f69543r);
        this.f69537l.postDelayed(this.f69543r, 0L);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    public void y() {
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void z() {
        super.z();
        View childAt = this.f69587w.getChildAt(0);
        if (childAt == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        if (this.f69527b != null) {
            layoutParams.height = -1;
            if (S() > 0) {
                layoutParams.width = S();
            }
            if (M() > 0) {
                layoutParams.width = Math.min(layoutParams.width, M());
            }
            childAt.setLayoutParams(layoutParams);
        }
    }
}
