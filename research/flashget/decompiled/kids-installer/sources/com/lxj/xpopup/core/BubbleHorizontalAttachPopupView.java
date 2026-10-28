package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.o0;
import b3.d;
import com.lxj.xpopup.c;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.BubbleLayout;

/* loaded from: classes6.dex */
public class BubbleHorizontalAttachPopupView extends BubbleAttachPopupView {
    float S;
    float T;

    /* loaded from: classes5.dex */
    class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f21109o;

        a(final boolean val$isRTL) {
            this.f21109o = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            float f6;
            float t5;
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView = BubbleHorizontalAttachPopupView.this;
            if (bubbleHorizontalAttachPopupView.f21074o == null) {
                return;
            }
            if (this.f21109o) {
                if (bubbleHorizontalAttachPopupView.M) {
                    t5 = (h.t(bubbleHorizontalAttachPopupView.getContext()) - BubbleHorizontalAttachPopupView.this.f21074o.f21157i.x) + r2.J;
                } else {
                    t5 = ((h.t(bubbleHorizontalAttachPopupView.getContext()) - BubbleHorizontalAttachPopupView.this.f21074o.f21157i.x) - r2.T().getMeasuredWidth()) - BubbleHorizontalAttachPopupView.this.J;
                }
                bubbleHorizontalAttachPopupView.S = -t5;
            } else {
                if (bubbleHorizontalAttachPopupView.G0()) {
                    f6 = (BubbleHorizontalAttachPopupView.this.f21074o.f21157i.x - r1.T().getMeasuredWidth()) - BubbleHorizontalAttachPopupView.this.J;
                } else {
                    f6 = BubbleHorizontalAttachPopupView.this.f21074o.f21157i.x + r1.J;
                }
                bubbleHorizontalAttachPopupView.S = f6;
            }
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView2 = BubbleHorizontalAttachPopupView.this;
            float measuredHeight = bubbleHorizontalAttachPopupView2.f21074o.f21157i.y - (bubbleHorizontalAttachPopupView2.T().getMeasuredHeight() * 0.5f);
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView3 = BubbleHorizontalAttachPopupView.this;
            bubbleHorizontalAttachPopupView2.T = measuredHeight + bubbleHorizontalAttachPopupView3.I;
            bubbleHorizontalAttachPopupView3.F0();
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f21111o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Rect f21112p;

        b(final boolean val$rect, final Rect val$isRTL) {
            this.f21111o = val$rect;
            this.f21112p = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f21111o) {
                BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView = BubbleHorizontalAttachPopupView.this;
                bubbleHorizontalAttachPopupView.S = -(bubbleHorizontalAttachPopupView.M ? (h.t(bubbleHorizontalAttachPopupView.getContext()) - this.f21112p.left) + BubbleHorizontalAttachPopupView.this.J : ((h.t(bubbleHorizontalAttachPopupView.getContext()) - this.f21112p.right) - BubbleHorizontalAttachPopupView.this.T().getMeasuredWidth()) - BubbleHorizontalAttachPopupView.this.J);
            } else {
                BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView2 = BubbleHorizontalAttachPopupView.this;
                bubbleHorizontalAttachPopupView2.S = bubbleHorizontalAttachPopupView2.G0() ? (this.f21112p.left - BubbleHorizontalAttachPopupView.this.T().getMeasuredWidth()) - BubbleHorizontalAttachPopupView.this.J : this.f21112p.right + BubbleHorizontalAttachPopupView.this.J;
            }
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView3 = BubbleHorizontalAttachPopupView.this;
            Rect rect = this.f21112p;
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView4 = BubbleHorizontalAttachPopupView.this;
            bubbleHorizontalAttachPopupView3.T = (((rect.height() - BubbleHorizontalAttachPopupView.this.T().getMeasuredHeight()) - (BubbleHorizontalAttachPopupView.this.K.r() * 2)) / 2.0f) + rect.top + bubbleHorizontalAttachPopupView4.I;
            bubbleHorizontalAttachPopupView4.F0();
        }
    }

    public BubbleHorizontalAttachPopupView(@o0 Context context) {
        super(context);
        this.S = 0.0f;
        this.T = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F0() {
        if (G0()) {
            this.K.L(BubbleLayout.b.RIGHT);
        } else {
            this.K.L(BubbleLayout.b.LEFT);
        }
        if (this.I == 0) {
            this.K.O(true);
        } else {
            this.K.N(Math.max(0, (int) (((r0.getMeasuredHeight() / 2.0f) - this.I) - (this.K.A / 2))));
        }
        this.K.invalidate();
        T().setTranslationX(this.S);
        T().setTranslationY(this.T);
        u0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean G0() {
        return (this.M || this.f21074o.f21166r == d.Left) && this.f21074o.f21166r != d.Right;
    }

    @Override // com.lxj.xpopup.core.BubbleAttachPopupView, com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        this.K.L(BubbleLayout.b.LEFT);
        super.d0();
        com.lxj.xpopup.core.b bVar = this.f21074o;
        this.I = bVar.f21174z;
        int i5 = bVar.f21173y;
        if (i5 == 0) {
            i5 = h.p(getContext(), 2.0f);
        }
        this.J = i5;
    }

    @Override // com.lxj.xpopup.core.BubbleAttachPopupView
    public void t0() {
        int t5;
        int i5;
        float t6;
        int i6;
        boolean H = h.H(getContext());
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
            T().post(new b(H, a6));
            return;
        }
        PointF pointF = c.f21063h;
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
        T().post(new a(H));
    }
}
