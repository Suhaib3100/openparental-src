package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.o0;
import b3.d;
import com.lxj.xpopup.animator.c;
import com.lxj.xpopup.animator.e;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class HorizontalAttachPopupView extends AttachPopupView {
    float S;
    float T;

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f21117o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ int f21118p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f21119q;

        a(final boolean val$h, final int val$w, final int val$isRTL) {
            this.f21117o = val$h;
            this.f21118p = val$w;
            this.f21119q = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            float f6;
            float t5;
            if (this.f21117o) {
                HorizontalAttachPopupView horizontalAttachPopupView = HorizontalAttachPopupView.this;
                if (horizontalAttachPopupView.M) {
                    t5 = (h.t(horizontalAttachPopupView.getContext()) - HorizontalAttachPopupView.this.f21074o.f21157i.x) + r2.J;
                } else {
                    t5 = ((h.t(horizontalAttachPopupView.getContext()) - HorizontalAttachPopupView.this.f21074o.f21157i.x) - r2.T().getMeasuredWidth()) - HorizontalAttachPopupView.this.J;
                }
                horizontalAttachPopupView.S = -t5;
            } else {
                HorizontalAttachPopupView horizontalAttachPopupView2 = HorizontalAttachPopupView.this;
                if (horizontalAttachPopupView2.y0()) {
                    f6 = (HorizontalAttachPopupView.this.f21074o.f21157i.x - this.f21118p) - r1.J;
                } else {
                    f6 = HorizontalAttachPopupView.this.f21074o.f21157i.x + r1.J;
                }
                horizontalAttachPopupView2.S = f6;
            }
            HorizontalAttachPopupView horizontalAttachPopupView3 = HorizontalAttachPopupView.this;
            horizontalAttachPopupView3.T = (horizontalAttachPopupView3.f21074o.f21157i.y - (this.f21119q * 0.5f)) + horizontalAttachPopupView3.I;
            horizontalAttachPopupView3.T().setTranslationX(HorizontalAttachPopupView.this.S);
            HorizontalAttachPopupView.this.T().setTranslationY(HorizontalAttachPopupView.this.T);
            HorizontalAttachPopupView.this.v0();
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f21121o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Rect f21122p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ int f21123q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ int f21124r;

        b(final boolean val$h, final Rect val$w, final int val$rect, final int val$isRTL) {
            this.f21121o = val$h;
            this.f21122p = val$w;
            this.f21123q = val$rect;
            this.f21124r = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21121o) {
                HorizontalAttachPopupView horizontalAttachPopupView = HorizontalAttachPopupView.this;
                horizontalAttachPopupView.S = -(horizontalAttachPopupView.M ? (h.t(horizontalAttachPopupView.getContext()) - this.f21122p.left) + HorizontalAttachPopupView.this.J : ((h.t(horizontalAttachPopupView.getContext()) - this.f21122p.right) - HorizontalAttachPopupView.this.T().getMeasuredWidth()) - HorizontalAttachPopupView.this.J);
            } else {
                HorizontalAttachPopupView horizontalAttachPopupView2 = HorizontalAttachPopupView.this;
                horizontalAttachPopupView2.S = horizontalAttachPopupView2.y0() ? (this.f21122p.left - this.f21123q) - HorizontalAttachPopupView.this.J : this.f21122p.right + HorizontalAttachPopupView.this.J;
            }
            HorizontalAttachPopupView horizontalAttachPopupView3 = HorizontalAttachPopupView.this;
            Rect rect = this.f21122p;
            HorizontalAttachPopupView horizontalAttachPopupView4 = HorizontalAttachPopupView.this;
            horizontalAttachPopupView3.T = ((rect.height() - this.f21124r) / 2.0f) + rect.top + horizontalAttachPopupView4.I;
            horizontalAttachPopupView4.T().setTranslationX(HorizontalAttachPopupView.this.S);
            HorizontalAttachPopupView.this.T().setTranslationY(HorizontalAttachPopupView.this.T);
            HorizontalAttachPopupView.this.v0();
        }
    }

    public HorizontalAttachPopupView(@o0 Context context) {
        super(context);
        this.S = 0.0f;
        this.T = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean y0() {
        return (this.M || this.f21074o.f21166r == d.Left) && this.f21074o.f21166r != d.Right;
    }

    @Override // com.lxj.xpopup.core.AttachPopupView, com.lxj.xpopup.core.BasePopupView
    protected c S() {
        return y0() ? new e(T(), K(), b3.c.ScrollAlphaFromRight) : new e(T(), K(), b3.c.ScrollAlphaFromLeft);
    }

    @Override // com.lxj.xpopup.core.AttachPopupView, com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        super.d0();
        com.lxj.xpopup.core.b bVar = this.f21074o;
        this.I = bVar.f21174z;
        int i5 = bVar.f21173y;
        if (i5 == 0) {
            i5 = h.p(getContext(), 2.0f);
        }
        this.J = i5;
    }

    @Override // com.lxj.xpopup.core.AttachPopupView
    public void u0() {
        int t5;
        int i5;
        float t6;
        int i6;
        if (this.f21074o == null) {
            return;
        }
        boolean H = h.H(getContext());
        int measuredWidth = T().getMeasuredWidth();
        int measuredHeight = T().getMeasuredHeight();
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar.f21157i == null) {
            Rect a6 = bVar.a();
            a6.left -= I();
            int I = a6.right - I();
            a6.right = I;
            this.M = (a6.left + I) / 2 > h.t(getContext()) / 2;
            ViewGroup.LayoutParams layoutParams = T().getLayoutParams();
            if (H) {
                t5 = this.M ? a6.left : h.t(getContext()) - a6.right;
                i5 = this.Q;
            } else {
                t5 = this.M ? a6.left : h.t(getContext()) - a6.right;
                i5 = this.Q;
            }
            int i7 = t5 - i5;
            if (T().getMeasuredWidth() > i7) {
                layoutParams.width = Math.max(i7, W());
            }
            T().setLayoutParams(layoutParams);
            T().post(new b(H, a6, measuredWidth, measuredHeight));
            return;
        }
        PointF pointF = com.lxj.xpopup.c.f21063h;
        if (pointF != null) {
            bVar.f21157i = pointF;
        }
        bVar.f21157i.x -= I();
        this.M = this.f21074o.f21157i.x > ((float) h.t(getContext())) / 2.0f;
        ViewGroup.LayoutParams layoutParams2 = T().getLayoutParams();
        if (H) {
            t6 = this.M ? this.f21074o.f21157i.x : h.t(getContext()) - this.f21074o.f21157i.x;
            i6 = this.Q;
        } else {
            t6 = this.M ? this.f21074o.f21157i.x : h.t(getContext()) - this.f21074o.f21157i.x;
            i6 = this.Q;
        }
        int i8 = (int) (t6 - i6);
        if (T().getMeasuredWidth() > i8) {
            layoutParams2.width = Math.max(i8, W());
        }
        T().setLayoutParams(layoutParams2);
        T().post(new a(H, measuredWidth, measuredHeight));
    }
}
