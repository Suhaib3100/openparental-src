package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.BubbleLayout;

/* loaded from: classes6.dex */
public abstract class BubbleAttachPopupView extends BasePopupView {
    float A;
    float B;
    float C;
    int D;
    float E;

    /* renamed from: v, reason: collision with root package name */
    protected int f69565v;

    /* renamed from: w, reason: collision with root package name */
    protected int f69566w;

    /* renamed from: x, reason: collision with root package name */
    protected BubbleLayout f69567x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f69568y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f69569z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleAttachPopupView.this.p0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleAttachPopupView.this.p0();
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f69572b;

        c(final boolean val$isRTL) {
            this.f69572b = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleAttachPopupView bubbleAttachPopupView = BubbleAttachPopupView.this;
            com.lxj.xpopup.core.b bVar = bubbleAttachPopupView.f69527b;
            if (bVar == null) {
                return;
            }
            if (bVar.B) {
                bubbleAttachPopupView.A = (bVar.f69631i.x + bubbleAttachPopupView.f69566w) - (bubbleAttachPopupView.P().getMeasuredWidth() / 2.0f);
            } else if (this.f69572b) {
                bubbleAttachPopupView.A = -(((h.t(bubbleAttachPopupView.getContext()) - BubbleAttachPopupView.this.f69527b.f69631i.x) - r2.f69566w) - (r2.P().getMeasuredWidth() / 2.0f));
            } else {
                bubbleAttachPopupView.A = ((bVar.f69631i.x + bubbleAttachPopupView.f69566w) - bubbleAttachPopupView.P().getMeasuredWidth()) + BubbleAttachPopupView.this.f69567x.r();
            }
            if (BubbleAttachPopupView.this.r0()) {
                BubbleAttachPopupView bubbleAttachPopupView2 = BubbleAttachPopupView.this;
                bubbleAttachPopupView2.B = (bubbleAttachPopupView2.f69527b.f69631i.y - bubbleAttachPopupView2.P().getMeasuredHeight()) - BubbleAttachPopupView.this.f69565v;
            } else {
                BubbleAttachPopupView bubbleAttachPopupView3 = BubbleAttachPopupView.this;
                bubbleAttachPopupView3.B = bubbleAttachPopupView3.f69527b.f69631i.y + bubbleAttachPopupView3.f69565v;
            }
            BubbleAttachPopupView bubbleAttachPopupView4 = BubbleAttachPopupView.this;
            if (bubbleAttachPopupView4.f69527b.B) {
                bubbleAttachPopupView4.f69567x.O(true);
            } else if (bubbleAttachPopupView4.r0()) {
                BubbleAttachPopupView.this.f69567x.L(BubbleLayout.b.BOTTOM);
            } else {
                BubbleAttachPopupView.this.f69567x.L(BubbleLayout.b.TOP);
            }
            BubbleAttachPopupView bubbleAttachPopupView5 = BubbleAttachPopupView.this;
            bubbleAttachPopupView5.f69567x.N(Math.max(0, (int) (((bubbleAttachPopupView5.f69527b.f69631i.x - bubbleAttachPopupView5.f69566w) - bubbleAttachPopupView5.A) - (r1.f69854m / 2))));
            BubbleAttachPopupView.this.f69567x.invalidate();
            BubbleAttachPopupView.this.P().setTranslationX(BubbleAttachPopupView.this.A);
            BubbleAttachPopupView.this.P().setTranslationY(BubbleAttachPopupView.this.B);
            BubbleAttachPopupView.this.q0();
        }
    }

    class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Rect f69574b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f69575c;

        d(final Rect val$isRTL, final boolean val$rect) {
            this.f69574b = val$isRTL;
            this.f69575c = val$rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleAttachPopupView bubbleAttachPopupView = BubbleAttachPopupView.this;
            com.lxj.xpopup.core.b bVar = bubbleAttachPopupView.f69527b;
            if (bVar == null) {
                return;
            }
            if (bVar.B) {
                Rect rect = this.f69574b;
                bubbleAttachPopupView.A = (((rect.left + rect.right) / 2.0f) + bubbleAttachPopupView.f69566w) - (bubbleAttachPopupView.P().getMeasuredWidth() / 2.0f);
            } else if (this.f69575c) {
                if (bubbleAttachPopupView.f69569z) {
                    int t4 = h.t(bubbleAttachPopupView.getContext()) - this.f69574b.right;
                    BubbleAttachPopupView bubbleAttachPopupView2 = BubbleAttachPopupView.this;
                    bubbleAttachPopupView.A = -((t4 - bubbleAttachPopupView2.f69566w) - bubbleAttachPopupView2.f69567x.r());
                } else {
                    int t5 = h.t(bubbleAttachPopupView.getContext()) - this.f69574b.left;
                    BubbleAttachPopupView bubbleAttachPopupView3 = BubbleAttachPopupView.this;
                    bubbleAttachPopupView.A = -((bubbleAttachPopupView3.f69567x.r() + (t5 + bubbleAttachPopupView3.f69566w)) - BubbleAttachPopupView.this.P().getMeasuredWidth());
                }
            } else if (bubbleAttachPopupView.f69569z) {
                bubbleAttachPopupView.A = BubbleAttachPopupView.this.f69567x.r() + ((this.f69574b.right + bubbleAttachPopupView.f69566w) - bubbleAttachPopupView.P().getMeasuredWidth());
            } else {
                bubbleAttachPopupView.A = (this.f69574b.left + bubbleAttachPopupView.f69566w) - bubbleAttachPopupView.f69567x.r();
            }
            if (BubbleAttachPopupView.this.r0()) {
                BubbleAttachPopupView.this.B = (this.f69574b.top - r0.P().getMeasuredHeight()) - BubbleAttachPopupView.this.f69565v;
            } else {
                BubbleAttachPopupView.this.B = this.f69574b.bottom + r0.f69565v;
            }
            if (BubbleAttachPopupView.this.r0()) {
                BubbleAttachPopupView.this.f69567x.L(BubbleLayout.b.BOTTOM);
            } else {
                BubbleAttachPopupView.this.f69567x.L(BubbleLayout.b.TOP);
            }
            BubbleAttachPopupView bubbleAttachPopupView4 = BubbleAttachPopupView.this;
            if (bubbleAttachPopupView4.f69527b.B) {
                bubbleAttachPopupView4.f69567x.O(true);
            } else if (!this.f69575c) {
                BubbleLayout bubbleLayout = bubbleAttachPopupView4.f69567x;
                Rect rect2 = this.f69574b;
                bubbleLayout.N(Math.max(0, (int) (((rect2.right - (rect2.width() / 2)) - BubbleAttachPopupView.this.A) - (r3.f69567x.f69854m / 2))));
            } else if (bubbleAttachPopupView4.f69569z) {
                BubbleLayout bubbleLayout2 = bubbleAttachPopupView4.f69567x;
                float width = (-bubbleAttachPopupView4.A) - (this.f69574b.width() / 2);
                BubbleAttachPopupView bubbleAttachPopupView5 = BubbleAttachPopupView.this;
                bubbleLayout2.N(Math.max(0, (int) ((width - bubbleAttachPopupView5.f69566w) + (bubbleAttachPopupView5.f69567x.f69854m / 2))));
            } else {
                BubbleLayout bubbleLayout3 = bubbleAttachPopupView4.f69567x;
                int width2 = this.f69574b.width() / 2;
                BubbleAttachPopupView bubbleAttachPopupView6 = BubbleAttachPopupView.this;
                bubbleLayout3.N(Math.max(0, (bubbleAttachPopupView6.f69567x.f69854m / 2) + (width2 - bubbleAttachPopupView6.f69566w)));
            }
            BubbleAttachPopupView.this.f69567x.invalidate();
            BubbleAttachPopupView.this.P().setTranslationX(BubbleAttachPopupView.this.A);
            BubbleAttachPopupView.this.P().setTranslationY(BubbleAttachPopupView.this.B);
            BubbleAttachPopupView.this.q0();
        }
    }

    public BubbleAttachPopupView(@o0 Context context) {
        super(context);
        this.f69565v = 0;
        this.f69566w = 0;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = h.s(getContext());
        this.D = h.p(getContext(), 10.0f);
        this.E = 0.0f;
        this.f69567x = (BubbleLayout) findViewById(b.h.D0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int J() {
        return b.k.f68802g;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c O() {
        return new com.lxj.xpopup.animator.d(P(), G(), fb.c.ScaleAlphaFromCenter);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        if (this.f69567x.getChildCount() == 0) {
            o0();
        }
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar.f69628f == null && bVar.f69631i == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ន\u0001"));
        }
        this.f69567x.setElevation(h.p(getContext(), 10.0f));
        this.f69567x.T(h.p(getContext(), 0.0f));
        com.lxj.xpopup.core.b bVar2 = this.f69527b;
        this.f69565v = bVar2.f69648z;
        this.f69566w = bVar2.f69647y;
        h.g((ViewGroup) P(), M(), L(), S(), Q(), new a());
    }

    protected void o0() {
        this.f69567x.addView(LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69567x, false));
    }

    public void p0() {
        int A;
        int i4;
        float A2;
        int i5;
        if (this.f69527b == null) {
            return;
        }
        this.C = h.s(getContext()) - this.D;
        boolean H = h.H(getContext());
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar.f69631i != null) {
            PointF pointF = com.lxj.xpopup.c.f69511h;
            if (pointF != null) {
                bVar.f69631i = pointF;
            }
            bVar.f69631i.x -= E();
            float f4 = this.f69527b.f69631i.y;
            this.E = f4;
            if (f4 + P().getMeasuredHeight() > this.C) {
                this.f69568y = this.f69527b.f69631i.y > ((float) h.A(getContext())) / 2.0f;
            } else {
                this.f69568y = false;
            }
            this.f69569z = this.f69527b.f69631i.x > ((float) h.t(getContext())) / 2.0f;
            ViewGroup.LayoutParams layoutParams = P().getLayoutParams();
            if (r0()) {
                A2 = this.f69527b.f69631i.y - V();
                i5 = this.D;
            } else {
                A2 = h.A(getContext()) - this.f69527b.f69631i.y;
                i5 = this.D;
            }
            int i6 = (int) (A2 - i5);
            int t4 = (int) ((this.f69569z ? this.f69527b.f69631i.x : h.t(getContext()) - this.f69527b.f69631i.x) - this.D);
            if (P().getMeasuredHeight() > i6) {
                layoutParams.height = i6;
            }
            if (P().getMeasuredWidth() > t4) {
                layoutParams.width = t4;
            }
            P().setLayoutParams(layoutParams);
            P().post(new c(H));
            return;
        }
        Rect a5 = bVar.a();
        a5.left -= E();
        int E = a5.right - E();
        a5.right = E;
        int i7 = (a5.left + E) / 2;
        boolean z4 = ((float) (P().getMeasuredHeight() + a5.bottom)) > this.C;
        this.E = (a5.top + a5.bottom) / 2.0f;
        if (z4) {
            this.f69568y = true;
        } else {
            this.f69568y = false;
        }
        this.f69569z = i7 > h.t(getContext()) / 2;
        ViewGroup.LayoutParams layoutParams2 = P().getLayoutParams();
        if (r0()) {
            A = a5.top - V();
            i4 = this.D;
        } else {
            A = h.A(getContext()) - a5.bottom;
            i4 = this.D;
        }
        int i10 = A - i4;
        int t5 = (this.f69569z ? a5.right : h.t(getContext()) - a5.left) - this.D;
        if (P().getMeasuredHeight() > i10) {
            layoutParams2.height = i10;
        }
        if (P().getMeasuredWidth() > t5) {
            layoutParams2.width = t5;
        }
        P().setLayoutParams(layoutParams2);
        P().post(new d(a5, H));
    }

    protected void q0() {
        Y();
        A();
        x();
    }

    protected boolean r0() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        return bVar.K ? this.E > ((float) (h.s(getContext()) / 2)) : (this.f69568y || bVar.f69640r == fb.d.Top) && bVar.f69640r != fb.d.Bottom;
    }

    public BubbleAttachPopupView s0(int height) {
        this.f69567x.M(height);
        this.f69567x.invalidate();
        return this;
    }

    public BubbleAttachPopupView t0(int radius) {
        this.f69567x.z(radius);
        this.f69567x.invalidate();
        return this;
    }

    public BubbleAttachPopupView u0(int width) {
        this.f69567x.P(width);
        this.f69567x.invalidate();
        return this;
    }

    public BubbleAttachPopupView v0(int color) {
        this.f69567x.E(color);
        this.f69567x.invalidate();
        return this;
    }

    public BubbleAttachPopupView w0(int radius) {
        this.f69567x.I(radius);
        this.f69567x.invalidate();
        return this;
    }

    public BubbleAttachPopupView x0(int color) {
        this.f69567x.S(color);
        this.f69567x.invalidate();
        return this;
    }

    public BubbleAttachPopupView y0(int size) {
        this.f69567x.T(size);
        this.f69567x.invalidate();
        return this;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void z() {
        super.z();
        h.g((ViewGroup) P(), M(), L(), S(), Q(), new b());
    }
}
