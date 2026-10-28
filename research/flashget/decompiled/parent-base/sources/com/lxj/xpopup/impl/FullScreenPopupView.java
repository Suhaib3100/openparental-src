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
    int A;
    private h B;

    /* renamed from: v, reason: collision with root package name */
    public ArgbEvaluator f69664v;

    /* renamed from: w, reason: collision with root package name */
    protected View f69665w;

    /* renamed from: x, reason: collision with root package name */
    protected FrameLayout f69666x;

    /* renamed from: y, reason: collision with root package name */
    private Paint f69667y;

    /* renamed from: z, reason: collision with root package name */
    protected Rect f69668z;

    class a implements ValueAnimator.AnimatorUpdateListener {
        a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator animation) {
            FullScreenPopupView.this.A = ((Integer) animation.getAnimatedValue()).intValue();
            FullScreenPopupView.this.postInvalidate();
        }
    }

    public FullScreenPopupView(@o0 Context context) {
        super(context);
        this.f69664v = new ArgbEvaluator();
        this.f69667y = new Paint();
        this.A = 0;
        this.f69666x = (FrameLayout) findViewById(b.h.U1);
    }

    private void p0(boolean isShow) {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || !bVar.f69641s.booleanValue()) {
            return;
        }
        ValueAnimator ofObject = ValueAnimator.ofObject(this.f69664v, Integer.valueOf(isShow ? 0 : U()), Integer.valueOf(isShow ? U() : 0));
        ofObject.addUpdateListener(new a());
        ofObject.setDuration(G()).start();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void A() {
        super.A();
        p0(true);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int J() {
        return b.k.f68823n;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected c O() {
        if (this.B == null) {
            this.B = new h(P(), G(), fb.c.TranslateFromBottom);
        }
        return this.B;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        if (this.f69666x.getChildCount() == 0) {
            o0();
        }
        P().setTranslationX(this.f69527b.f69647y);
        P().setTranslationY(this.f69527b.f69648z);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null || !bVar.f69641s.booleanValue()) {
            return;
        }
        this.f69667y.setColor(this.A);
        Rect rect = new Rect(0, 0, getMeasuredWidth(), V());
        this.f69668z = rect;
        canvas.drawRect(rect, this.f69667y);
    }

    protected void o0() {
        View inflate = LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69666x, false);
        this.f69665w = inflate;
        this.f69666x.addView(inflate);
    }

    @Override // com.lxj.xpopup.core.BasePopupView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f69527b != null && this.B != null) {
            P().setTranslationX(this.B.f67896f);
            P().setTranslationY(this.B.f67897g);
            this.B.f67865b = true;
        }
        super.onDetachedFromWindow();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void y() {
        super.y();
        p0(false);
    }
}
