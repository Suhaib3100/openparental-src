package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.lxj.xpopup.animator.c;
import com.lxj.xpopup.animator.e;
import com.lxj.xpopup.util.h;
import fb.d;

/* loaded from: classes6.dex */
public class HorizontalAttachPopupView extends AttachPopupView {
    float F;
    float G;

    class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f69594b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f69595c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f69596d;

        a(final boolean val$h, final int val$w, final int val$isRTL) {
            this.f69594b = val$h;
            this.f69595c = val$w;
            this.f69596d = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            float f4;
            float t4;
            if (this.f69594b) {
                HorizontalAttachPopupView horizontalAttachPopupView = HorizontalAttachPopupView.this;
                if (horizontalAttachPopupView.f69519z) {
                    t4 = (h.t(horizontalAttachPopupView.getContext()) - HorizontalAttachPopupView.this.f69527b.f69631i.x) + r2.f69516w;
                } else {
                    t4 = ((h.t(horizontalAttachPopupView.getContext()) - HorizontalAttachPopupView.this.f69527b.f69631i.x) - r2.P().getMeasuredWidth()) - HorizontalAttachPopupView.this.f69516w;
                }
                horizontalAttachPopupView.F = -t4;
            } else {
                HorizontalAttachPopupView horizontalAttachPopupView2 = HorizontalAttachPopupView.this;
                if (horizontalAttachPopupView2.u0()) {
                    f4 = (HorizontalAttachPopupView.this.f69527b.f69631i.x - this.f69595c) - r1.f69516w;
                } else {
                    f4 = HorizontalAttachPopupView.this.f69527b.f69631i.x + r1.f69516w;
                }
                horizontalAttachPopupView2.F = f4;
            }
            HorizontalAttachPopupView horizontalAttachPopupView3 = HorizontalAttachPopupView.this;
            horizontalAttachPopupView3.G = (horizontalAttachPopupView3.f69527b.f69631i.y - (this.f69596d * 0.5f)) + horizontalAttachPopupView3.f69515v;
            horizontalAttachPopupView3.P().setTranslationX(HorizontalAttachPopupView.this.F);
            HorizontalAttachPopupView.this.P().setTranslationY(HorizontalAttachPopupView.this.G);
            HorizontalAttachPopupView.this.r0();
        }
    }

    class b implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f69598b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f69599c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f69600d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f69601e;

        b(final boolean val$h, final Rect val$w, final int val$rect, final int val$isRTL) {
            this.f69598b = val$h;
            this.f69599c = val$w;
            this.f69600d = val$rect;
            this.f69601e = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f69598b) {
                HorizontalAttachPopupView horizontalAttachPopupView = HorizontalAttachPopupView.this;
                horizontalAttachPopupView.F = -(horizontalAttachPopupView.f69519z ? (h.t(horizontalAttachPopupView.getContext()) - this.f69599c.left) + HorizontalAttachPopupView.this.f69516w : ((h.t(horizontalAttachPopupView.getContext()) - this.f69599c.right) - HorizontalAttachPopupView.this.P().getMeasuredWidth()) - HorizontalAttachPopupView.this.f69516w);
            } else {
                HorizontalAttachPopupView horizontalAttachPopupView2 = HorizontalAttachPopupView.this;
                horizontalAttachPopupView2.F = horizontalAttachPopupView2.u0() ? (this.f69599c.left - this.f69600d) - HorizontalAttachPopupView.this.f69516w : this.f69599c.right + HorizontalAttachPopupView.this.f69516w;
            }
            HorizontalAttachPopupView horizontalAttachPopupView3 = HorizontalAttachPopupView.this;
            Rect rect = this.f69599c;
            HorizontalAttachPopupView horizontalAttachPopupView4 = HorizontalAttachPopupView.this;
            horizontalAttachPopupView3.G = ((rect.height() - this.f69601e) / 2.0f) + rect.top + horizontalAttachPopupView4.f69515v;
            horizontalAttachPopupView4.P().setTranslationX(HorizontalAttachPopupView.this.F);
            HorizontalAttachPopupView.this.P().setTranslationY(HorizontalAttachPopupView.this.G);
            HorizontalAttachPopupView.this.r0();
        }
    }

    public HorizontalAttachPopupView(@o0 Context context) {
        super(context);
        this.F = 0.0f;
        this.G = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean u0() {
        return (this.f69519z || this.f69527b.f69640r == d.Left) && this.f69527b.f69640r != d.Right;
    }

    @Override // com.lxj.xpopup.core.AttachPopupView, com.lxj.xpopup.core.BasePopupView
    protected c O() {
        return u0() ? new e(P(), G(), fb.c.ScrollAlphaFromRight) : new e(P(), G(), fb.c.ScrollAlphaFromLeft);
    }

    @Override // com.lxj.xpopup.core.AttachPopupView, com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        super.Z();
        com.lxj.xpopup.core.b bVar = this.f69527b;
        this.f69515v = bVar.f69648z;
        int i4 = bVar.f69647y;
        if (i4 == 0) {
            i4 = h.p(getContext(), 2.0f);
        }
        this.f69516w = i4;
    }

    @Override // com.lxj.xpopup.core.AttachPopupView
    public void q0() {
        int t4;
        int i4;
        float t5;
        int i5;
        if (this.f69527b == null) {
            return;
        }
        boolean H = h.H(getContext());
        int measuredWidth = P().getMeasuredWidth();
        int measuredHeight = P().getMeasuredHeight();
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar.f69631i == null) {
            Rect a5 = bVar.a();
            a5.left -= E();
            int E = a5.right - E();
            a5.right = E;
            this.f69519z = (a5.left + E) / 2 > h.t(getContext()) / 2;
            ViewGroup.LayoutParams layoutParams = P().getLayoutParams();
            if (H) {
                t4 = this.f69519z ? a5.left : h.t(getContext()) - a5.right;
                i4 = this.D;
            } else {
                t4 = this.f69519z ? a5.left : h.t(getContext()) - a5.right;
                i4 = this.D;
            }
            int i6 = t4 - i4;
            if (P().getMeasuredWidth() > i6) {
                layoutParams.width = Math.max(i6, S());
            }
            P().setLayoutParams(layoutParams);
            P().post(new b(H, a5, measuredWidth, measuredHeight));
            return;
        }
        PointF pointF = com.lxj.xpopup.c.f69511h;
        if (pointF != null) {
            bVar.f69631i = pointF;
        }
        bVar.f69631i.x -= E();
        this.f69519z = this.f69527b.f69631i.x > ((float) h.t(getContext())) / 2.0f;
        ViewGroup.LayoutParams layoutParams2 = P().getLayoutParams();
        if (H) {
            t5 = this.f69519z ? this.f69527b.f69631i.x : h.t(getContext()) - this.f69527b.f69631i.x;
            i5 = this.D;
        } else {
            t5 = this.f69519z ? this.f69527b.f69631i.x : h.t(getContext()) - this.f69527b.f69631i.x;
            i5 = this.D;
        }
        int i7 = (int) (t5 - i5);
        if (P().getMeasuredWidth() > i7) {
            layoutParams2.width = Math.max(i7, S());
        }
        P().setLayoutParams(layoutParams2);
        P().post(new a(H, measuredWidth, measuredHeight));
    }
}
