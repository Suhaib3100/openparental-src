package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.lxj.xpopup.c;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.BubbleLayout;
import fb.d;

/* loaded from: classes6.dex */
public class BubbleHorizontalAttachPopupView extends BubbleAttachPopupView {
    float F;
    float G;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f69577b;

        a(final boolean val$isRTL) {
            this.f69577b = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            float f4;
            float t4;
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView = BubbleHorizontalAttachPopupView.this;
            if (bubbleHorizontalAttachPopupView.f69527b == null) {
                return;
            }
            if (this.f69577b) {
                if (bubbleHorizontalAttachPopupView.f69569z) {
                    t4 = (h.t(bubbleHorizontalAttachPopupView.getContext()) - BubbleHorizontalAttachPopupView.this.f69527b.f69631i.x) + r2.f69566w;
                } else {
                    t4 = ((h.t(bubbleHorizontalAttachPopupView.getContext()) - BubbleHorizontalAttachPopupView.this.f69527b.f69631i.x) - r2.P().getMeasuredWidth()) - BubbleHorizontalAttachPopupView.this.f69566w;
                }
                bubbleHorizontalAttachPopupView.F = -t4;
            } else {
                if (bubbleHorizontalAttachPopupView.C0()) {
                    f4 = (BubbleHorizontalAttachPopupView.this.f69527b.f69631i.x - r1.P().getMeasuredWidth()) - BubbleHorizontalAttachPopupView.this.f69566w;
                } else {
                    f4 = BubbleHorizontalAttachPopupView.this.f69527b.f69631i.x + r1.f69566w;
                }
                bubbleHorizontalAttachPopupView.F = f4;
            }
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView2 = BubbleHorizontalAttachPopupView.this;
            float measuredHeight = bubbleHorizontalAttachPopupView2.f69527b.f69631i.y - (bubbleHorizontalAttachPopupView2.P().getMeasuredHeight() * 0.5f);
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView3 = BubbleHorizontalAttachPopupView.this;
            bubbleHorizontalAttachPopupView2.G = measuredHeight + bubbleHorizontalAttachPopupView3.f69565v;
            bubbleHorizontalAttachPopupView3.B0();
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f69579b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f69580c;

        b(final boolean val$rect, final Rect val$isRTL) {
            this.f69579b = val$rect;
            this.f69580c = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f69579b) {
                BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView = BubbleHorizontalAttachPopupView.this;
                bubbleHorizontalAttachPopupView.F = -(bubbleHorizontalAttachPopupView.f69569z ? (h.t(bubbleHorizontalAttachPopupView.getContext()) - this.f69580c.left) + BubbleHorizontalAttachPopupView.this.f69566w : ((h.t(bubbleHorizontalAttachPopupView.getContext()) - this.f69580c.right) - BubbleHorizontalAttachPopupView.this.P().getMeasuredWidth()) - BubbleHorizontalAttachPopupView.this.f69566w);
            } else {
                BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView2 = BubbleHorizontalAttachPopupView.this;
                bubbleHorizontalAttachPopupView2.F = bubbleHorizontalAttachPopupView2.C0() ? (this.f69580c.left - BubbleHorizontalAttachPopupView.this.P().getMeasuredWidth()) - BubbleHorizontalAttachPopupView.this.f69566w : this.f69580c.right + BubbleHorizontalAttachPopupView.this.f69566w;
            }
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView3 = BubbleHorizontalAttachPopupView.this;
            Rect rect = this.f69580c;
            BubbleHorizontalAttachPopupView bubbleHorizontalAttachPopupView4 = BubbleHorizontalAttachPopupView.this;
            bubbleHorizontalAttachPopupView3.G = ((rect.height() - BubbleHorizontalAttachPopupView.this.P().getMeasuredHeight()) / 2.0f) + rect.top + bubbleHorizontalAttachPopupView4.f69565v;
            bubbleHorizontalAttachPopupView4.B0();
        }
    }

    public BubbleHorizontalAttachPopupView(@o0 Context context) {
        super(context);
        this.F = 0.0f;
        this.G = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void B0() {
        if (C0()) {
            this.f69567x.L(BubbleLayout.b.RIGHT);
        } else {
            this.f69567x.L(BubbleLayout.b.LEFT);
        }
        if (this.f69565v == 0) {
            this.f69567x.O(true);
        } else {
            this.f69567x.N(Math.max(0, (int) (((r0.getMeasuredHeight() / 2.0f) - this.f69565v) - (this.f69567x.f69855n / 2))));
        }
        this.f69567x.invalidate();
        P().setTranslationX(this.F);
        P().setTranslationY(this.G);
        q0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C0() {
        return (this.f69569z || this.f69527b.f69640r == d.Left) && this.f69527b.f69640r != d.Right;
    }

    @Override // com.lxj.xpopup.core.BubbleAttachPopupView, com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        this.f69567x.L(BubbleLayout.b.LEFT);
        super.Z();
        com.lxj.xpopup.core.b bVar = this.f69527b;
        this.f69565v = bVar.f69648z;
        int i4 = bVar.f69647y;
        if (i4 == 0) {
            i4 = h.p(getContext(), 2.0f);
        }
        this.f69566w = i4;
    }

    @Override // com.lxj.xpopup.core.BubbleAttachPopupView
    public void p0() {
        int t4;
        int i4;
        float t5;
        int i5;
        boolean H = h.H(getContext());
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar.f69631i == null) {
            Rect a5 = bVar.a();
            a5.left -= E();
            int E = a5.right - E();
            a5.right = E;
            this.f69569z = (a5.left + E) / 2 > h.t(getContext()) / 2;
            ViewGroup.LayoutParams layoutParams = P().getLayoutParams();
            if (H) {
                t4 = this.f69569z ? a5.left : h.t(getContext()) - a5.right;
                i4 = this.D;
            } else {
                t4 = this.f69569z ? a5.left : h.t(getContext()) - a5.right;
                i4 = this.D;
            }
            int i6 = t4 - i4;
            if (P().getMeasuredWidth() > i6) {
                layoutParams.width = Math.max(i6, S());
            }
            P().setLayoutParams(layoutParams);
            P().post(new b(H, a5));
            return;
        }
        PointF pointF = c.f69511h;
        if (pointF != null) {
            bVar.f69631i = pointF;
        }
        bVar.f69631i.x -= E();
        this.f69569z = this.f69527b.f69631i.x > ((float) h.t(getContext())) / 2.0f;
        ViewGroup.LayoutParams layoutParams2 = P().getLayoutParams();
        if (H) {
            t5 = this.f69569z ? this.f69527b.f69631i.x : h.t(getContext()) - this.f69527b.f69631i.x;
            i5 = this.D;
        } else {
            t5 = this.f69569z ? this.f69527b.f69631i.x : h.t(getContext()) - this.f69527b.f69631i.x;
            i5 = this.D;
        }
        int i7 = (int) (t5 - i5);
        if (P().getMeasuredWidth() > i7) {
            layoutParams2.width = Math.max(i7, S());
        }
        P().setLayoutParams(layoutParams2);
        P().post(new a(H));
    }
}
