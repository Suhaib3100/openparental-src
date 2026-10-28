package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.BubbleLayout;

/* loaded from: classes6.dex */
public abstract class BubbleAttachPopupView extends BasePopupView {
    protected int I;
    protected int J;
    protected BubbleLayout K;
    public boolean L;
    public boolean M;
    float N;
    float O;
    float P;
    int Q;
    float R;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleAttachPopupView.this.t0();
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleAttachPopupView.this.t0();
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f21104o;

        c(final boolean val$isRTL) {
            this.f21104o = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleAttachPopupView bubbleAttachPopupView = BubbleAttachPopupView.this;
            com.lxj.xpopup.core.b bVar = bubbleAttachPopupView.f21074o;
            if (bVar == null) {
                return;
            }
            if (bVar.B) {
                bubbleAttachPopupView.N = (bVar.f21157i.x + bubbleAttachPopupView.J) - (bubbleAttachPopupView.T().getMeasuredWidth() / 2.0f);
            } else if (this.f21104o) {
                bubbleAttachPopupView.N = -(((h.t(bubbleAttachPopupView.getContext()) - BubbleAttachPopupView.this.f21074o.f21157i.x) - r2.J) - (r2.T().getMeasuredWidth() / 2.0f));
            } else {
                bubbleAttachPopupView.N = ((bVar.f21157i.x + bubbleAttachPopupView.J) - bubbleAttachPopupView.T().getMeasuredWidth()) + BubbleAttachPopupView.this.K.r();
            }
            if (BubbleAttachPopupView.this.v0()) {
                BubbleAttachPopupView bubbleAttachPopupView2 = BubbleAttachPopupView.this;
                bubbleAttachPopupView2.O = (bubbleAttachPopupView2.f21074o.f21157i.y - bubbleAttachPopupView2.T().getMeasuredHeight()) - BubbleAttachPopupView.this.I;
            } else {
                BubbleAttachPopupView bubbleAttachPopupView3 = BubbleAttachPopupView.this;
                bubbleAttachPopupView3.O = bubbleAttachPopupView3.f21074o.f21157i.y + bubbleAttachPopupView3.I;
            }
            BubbleAttachPopupView bubbleAttachPopupView4 = BubbleAttachPopupView.this;
            if (bubbleAttachPopupView4.f21074o.B) {
                bubbleAttachPopupView4.K.O(true);
            } else if (bubbleAttachPopupView4.v0()) {
                BubbleAttachPopupView.this.K.L(BubbleLayout.b.BOTTOM);
            } else {
                BubbleAttachPopupView.this.K.L(BubbleLayout.b.TOP);
            }
            BubbleAttachPopupView bubbleAttachPopupView5 = BubbleAttachPopupView.this;
            bubbleAttachPopupView5.K.N(Math.max(0, (int) (((bubbleAttachPopupView5.f21074o.f21157i.x - bubbleAttachPopupView5.J) - bubbleAttachPopupView5.N) - (r1.f21380z / 2))));
            BubbleAttachPopupView.this.K.invalidate();
            BubbleAttachPopupView.this.T().setTranslationX(BubbleAttachPopupView.this.N);
            BubbleAttachPopupView.this.T().setTranslationY(BubbleAttachPopupView.this.O);
            BubbleAttachPopupView.this.u0();
        }
    }

    /* loaded from: classes5.dex */
    class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ Rect f21106o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ boolean f21107p;

        d(final Rect val$isRTL, final boolean val$rect) {
            this.f21106o = val$isRTL;
            this.f21107p = val$rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            BubbleAttachPopupView bubbleAttachPopupView = BubbleAttachPopupView.this;
            com.lxj.xpopup.core.b bVar = bubbleAttachPopupView.f21074o;
            if (bVar == null) {
                return;
            }
            if (bVar.B) {
                Rect rect = this.f21106o;
                bubbleAttachPopupView.N = (((rect.left + rect.right) / 2.0f) + bubbleAttachPopupView.J) - (bubbleAttachPopupView.T().getMeasuredWidth() / 2.0f);
            } else if (this.f21107p) {
                if (bubbleAttachPopupView.M) {
                    int t5 = h.t(bubbleAttachPopupView.getContext()) - this.f21106o.right;
                    BubbleAttachPopupView bubbleAttachPopupView2 = BubbleAttachPopupView.this;
                    bubbleAttachPopupView.N = -((t5 - bubbleAttachPopupView2.J) - bubbleAttachPopupView2.K.r());
                } else {
                    int t6 = h.t(bubbleAttachPopupView.getContext()) - this.f21106o.left;
                    BubbleAttachPopupView bubbleAttachPopupView3 = BubbleAttachPopupView.this;
                    bubbleAttachPopupView.N = -((bubbleAttachPopupView3.K.r() + (t6 + bubbleAttachPopupView3.J)) - BubbleAttachPopupView.this.T().getMeasuredWidth());
                }
            } else if (bubbleAttachPopupView.M) {
                bubbleAttachPopupView.N = BubbleAttachPopupView.this.K.r() + ((this.f21106o.right + bubbleAttachPopupView.J) - bubbleAttachPopupView.T().getMeasuredWidth());
            } else {
                bubbleAttachPopupView.N = (this.f21106o.left + bubbleAttachPopupView.J) - bubbleAttachPopupView.K.r();
            }
            if (BubbleAttachPopupView.this.v0()) {
                BubbleAttachPopupView.this.O = (this.f21106o.top - r0.T().getMeasuredHeight()) - BubbleAttachPopupView.this.I;
            } else {
                BubbleAttachPopupView.this.O = this.f21106o.bottom + r0.I;
            }
            if (BubbleAttachPopupView.this.v0()) {
                BubbleAttachPopupView.this.K.L(BubbleLayout.b.BOTTOM);
            } else {
                BubbleAttachPopupView.this.K.L(BubbleLayout.b.TOP);
            }
            BubbleAttachPopupView bubbleAttachPopupView4 = BubbleAttachPopupView.this;
            if (bubbleAttachPopupView4.f21074o.B) {
                bubbleAttachPopupView4.K.O(true);
            } else if (!this.f21107p) {
                BubbleLayout bubbleLayout = bubbleAttachPopupView4.K;
                Rect rect2 = this.f21106o;
                bubbleLayout.N(Math.max(0, (int) (((rect2.right - (rect2.width() / 2)) - BubbleAttachPopupView.this.N) - (r3.K.f21380z / 2))));
            } else if (bubbleAttachPopupView4.M) {
                BubbleLayout bubbleLayout2 = bubbleAttachPopupView4.K;
                float width = (-bubbleAttachPopupView4.N) - (this.f21106o.width() / 2);
                BubbleAttachPopupView bubbleAttachPopupView5 = BubbleAttachPopupView.this;
                bubbleLayout2.N(Math.max(0, (int) ((width - bubbleAttachPopupView5.J) + (bubbleAttachPopupView5.K.f21380z / 2))));
            } else {
                BubbleLayout bubbleLayout3 = bubbleAttachPopupView4.K;
                int width2 = this.f21106o.width() / 2;
                BubbleAttachPopupView bubbleAttachPopupView6 = BubbleAttachPopupView.this;
                bubbleLayout3.N(Math.max(0, (bubbleAttachPopupView6.K.f21380z / 2) + (width2 - bubbleAttachPopupView6.J)));
            }
            BubbleAttachPopupView.this.K.invalidate();
            BubbleAttachPopupView.this.T().setTranslationX(BubbleAttachPopupView.this.N);
            BubbleAttachPopupView.this.T().setTranslationY(BubbleAttachPopupView.this.O);
            BubbleAttachPopupView.this.u0();
        }
    }

    public BubbleAttachPopupView(@o0 Context context) {
        super(context);
        this.I = 0;
        this.J = 0;
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = h.s(getContext());
        this.Q = h.p(getContext(), 10.0f);
        this.R = 0.0f;
        this.K = (BubbleLayout) findViewById(b.h.D0);
    }

    public BubbleAttachPopupView A0(int radius) {
        this.K.I(radius);
        this.K.invalidate();
        return this;
    }

    public BubbleAttachPopupView B0(int color) {
        this.K.S(color);
        this.K.invalidate();
        return this;
    }

    public BubbleAttachPopupView C0(int size) {
        this.K.T(size);
        this.K.invalidate();
        return this;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void D() {
        super.D();
        h.g((ViewGroup) T(), Q(), P(), W(), U(), new b());
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int N() {
        return b.k.f20607g;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c S() {
        return new com.lxj.xpopup.animator.d(T(), K(), b3.c.ScaleAlphaFromCenter);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        if (this.K.getChildCount() == 0) {
            s0();
        }
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar.f21154f == null && bVar.f21157i == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("歮"));
        }
        this.K.setElevation(h.p(getContext(), 10.0f));
        this.K.T(h.p(getContext(), 0.0f));
        com.lxj.xpopup.core.b bVar2 = this.f21074o;
        this.I = bVar2.f21174z;
        this.J = bVar2.f21173y;
        h.g((ViewGroup) T(), Q(), P(), W(), U(), new a());
    }

    protected void s0() {
        this.K.addView(LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.K, false));
    }

    public void t0() {
        int A;
        int i5;
        float A2;
        int i6;
        if (this.f21074o == null) {
            return;
        }
        this.P = h.s(getContext()) - this.Q;
        boolean H = h.H(getContext());
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar.f21157i != null) {
            PointF pointF = com.lxj.xpopup.c.f21063h;
            if (pointF != null) {
                bVar.f21157i = pointF;
            }
            bVar.f21157i.x -= I();
            float f6 = this.f21074o.f21157i.y;
            this.R = f6;
            if (f6 + ((float) T().getMeasuredHeight()) > this.P) {
                this.L = this.f21074o.f21157i.y > ((float) h.A(getContext())) / 2.0f;
            } else {
                this.L = false;
            }
            this.M = this.f21074o.f21157i.x > ((float) h.t(getContext())) / 2.0f;
            ViewGroup.LayoutParams layoutParams = T().getLayoutParams();
            if (v0()) {
                A2 = this.f21074o.f21157i.y - Z();
                i6 = this.Q;
            } else {
                A2 = h.A(getContext()) - this.f21074o.f21157i.y;
                i6 = this.Q;
            }
            int i7 = (int) (A2 - i6);
            int t5 = (int) ((this.M ? this.f21074o.f21157i.x : h.t(getContext()) - this.f21074o.f21157i.x) - this.Q);
            if (T().getMeasuredHeight() > i7) {
                layoutParams.height = i7;
            }
            if (T().getMeasuredWidth() > t5) {
                layoutParams.width = t5;
            }
            T().setLayoutParams(layoutParams);
            T().post(new c(H));
            return;
        }
        Rect a6 = bVar.a();
        a6.left -= I();
        int I = a6.right - I();
        a6.right = I;
        int i8 = (a6.left + I) / 2;
        boolean z5 = ((float) (T().getMeasuredHeight() + a6.bottom)) > this.P;
        this.R = (a6.top + a6.bottom) / 2.0f;
        if (z5) {
            this.L = true;
        } else {
            this.L = false;
        }
        this.M = i8 > h.t(getContext()) / 2;
        ViewGroup.LayoutParams layoutParams2 = T().getLayoutParams();
        if (v0()) {
            A = a6.top - Z();
            i5 = this.Q;
        } else {
            A = h.A(getContext()) - a6.bottom;
            i5 = this.Q;
        }
        int i9 = A - i5;
        int t6 = (this.M ? a6.right : h.t(getContext()) - a6.left) - this.Q;
        if (T().getMeasuredHeight() > i9) {
            layoutParams2.height = i9;
        }
        if (T().getMeasuredWidth() > t6) {
            layoutParams2.width = t6;
        }
        T().setLayoutParams(layoutParams2);
        T().post(new d(a6, H));
    }

    protected void u0() {
        c0();
        E();
        B();
    }

    protected boolean v0() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        return bVar.K ? this.R > ((float) (h.s(getContext()) / 2)) : (this.L || bVar.f21166r == b3.d.Top) && bVar.f21166r != b3.d.Bottom;
    }

    public BubbleAttachPopupView w0(int height) {
        this.K.M(height);
        this.K.invalidate();
        return this;
    }

    public BubbleAttachPopupView x0(int radius) {
        this.K.z(radius);
        this.K.invalidate();
        return this;
    }

    public BubbleAttachPopupView y0(int width) {
        this.K.P(width);
        this.K.invalidate();
        return this;
    }

    public BubbleAttachPopupView z0(int color) {
        this.K.E(color);
        this.K.invalidate();
        return this;
    }
}
