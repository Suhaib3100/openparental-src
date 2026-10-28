package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.animator.e;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public abstract class AttachPopupView extends BasePopupView {
    protected int I;
    protected int J;
    protected FrameLayout K;
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
            AttachPopupView.this.u0();
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AttachPopupView.this.u0();
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f21069o;

        c(final boolean val$isRTL) {
            this.f21069o = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            float t5;
            AttachPopupView attachPopupView = AttachPopupView.this;
            com.lxj.xpopup.core.b bVar = attachPopupView.f21074o;
            if (bVar == null) {
                return;
            }
            if (this.f21069o) {
                if (attachPopupView.M) {
                    t5 = ((h.t(attachPopupView.getContext()) - AttachPopupView.this.f21074o.f21157i.x) - r2.T().getMeasuredWidth()) - AttachPopupView.this.J;
                } else {
                    t5 = (h.t(attachPopupView.getContext()) - AttachPopupView.this.f21074o.f21157i.x) + r2.J;
                }
                attachPopupView.N = -t5;
            } else {
                boolean z5 = attachPopupView.M;
                float f6 = bVar.f21157i.x;
                attachPopupView.N = z5 ? f6 + attachPopupView.J : (f6 - attachPopupView.T().getMeasuredWidth()) - AttachPopupView.this.J;
            }
            AttachPopupView attachPopupView2 = AttachPopupView.this;
            if (attachPopupView2.f21074o.B) {
                if (attachPopupView2.M) {
                    if (this.f21069o) {
                        attachPopupView2.N = (attachPopupView2.T().getMeasuredWidth() / 2.0f) + attachPopupView2.N;
                    } else {
                        attachPopupView2.N -= attachPopupView2.T().getMeasuredWidth() / 2.0f;
                    }
                } else if (this.f21069o) {
                    attachPopupView2.N -= attachPopupView2.T().getMeasuredWidth() / 2.0f;
                } else {
                    attachPopupView2.N = (attachPopupView2.T().getMeasuredWidth() / 2.0f) + attachPopupView2.N;
                }
            }
            if (AttachPopupView.this.w0()) {
                AttachPopupView attachPopupView3 = AttachPopupView.this;
                attachPopupView3.O = (attachPopupView3.f21074o.f21157i.y - attachPopupView3.T().getMeasuredHeight()) - AttachPopupView.this.I;
            } else {
                AttachPopupView attachPopupView4 = AttachPopupView.this;
                attachPopupView4.O = attachPopupView4.f21074o.f21157i.y + attachPopupView4.I;
            }
            AttachPopupView.this.T().setTranslationX(AttachPopupView.this.N);
            AttachPopupView.this.T().setTranslationY(AttachPopupView.this.O);
            AttachPopupView.this.v0();
        }
    }

    /* loaded from: classes5.dex */
    class d implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ boolean f21071o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ Rect f21072p;

        d(final boolean val$rect, final Rect val$isRTL) {
            this.f21071o = val$rect;
            this.f21072p = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            AttachPopupView attachPopupView = AttachPopupView.this;
            if (attachPopupView.f21074o == null) {
                return;
            }
            if (this.f21071o) {
                attachPopupView.N = -(attachPopupView.M ? ((h.t(attachPopupView.getContext()) - this.f21072p.left) - AttachPopupView.this.T().getMeasuredWidth()) - AttachPopupView.this.J : (h.t(attachPopupView.getContext()) - this.f21072p.right) + AttachPopupView.this.J);
            } else {
                attachPopupView.N = attachPopupView.M ? this.f21072p.left + attachPopupView.J : (this.f21072p.right - attachPopupView.T().getMeasuredWidth()) - AttachPopupView.this.J;
            }
            AttachPopupView attachPopupView2 = AttachPopupView.this;
            if (attachPopupView2.f21074o.B) {
                if (attachPopupView2.M) {
                    if (this.f21071o) {
                        attachPopupView2.N -= (this.f21072p.width() - AttachPopupView.this.T().getMeasuredWidth()) / 2.0f;
                    } else {
                        attachPopupView2.N = ((this.f21072p.width() - AttachPopupView.this.T().getMeasuredWidth()) / 2.0f) + attachPopupView2.N;
                    }
                } else if (this.f21071o) {
                    attachPopupView2.N = ((this.f21072p.width() - AttachPopupView.this.T().getMeasuredWidth()) / 2.0f) + attachPopupView2.N;
                } else {
                    attachPopupView2.N -= (this.f21072p.width() - AttachPopupView.this.T().getMeasuredWidth()) / 2.0f;
                }
            }
            if (AttachPopupView.this.w0()) {
                AttachPopupView.this.O = (this.f21072p.top - r0.T().getMeasuredHeight()) - AttachPopupView.this.I;
            } else {
                AttachPopupView.this.O = this.f21072p.bottom + r0.I;
            }
            AttachPopupView.this.T().setTranslationX(AttachPopupView.this.N);
            AttachPopupView.this.T().setTranslationY(AttachPopupView.this.O);
            AttachPopupView.this.v0();
        }
    }

    public AttachPopupView(@o0 Context context) {
        super(context);
        this.I = 0;
        this.J = 0;
        this.N = 0.0f;
        this.O = 0.0f;
        this.P = h.s(getContext());
        this.Q = h.p(getContext(), 10.0f);
        this.R = 0.0f;
        this.K = (FrameLayout) findViewById(b.h.f20505s0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void D() {
        super.D();
        h.g((ViewGroup) T(), Q(), P(), W(), U(), new b());
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int N() {
        return b.k.f20598d;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c S() {
        e eVar;
        if (w0()) {
            eVar = new e(T(), K(), this.M ? b3.c.ScrollAlphaFromLeftBottom : b3.c.ScrollAlphaFromRightBottom);
        } else {
            eVar = new e(T(), K(), this.M ? b3.c.ScrollAlphaFromLeftTop : b3.c.ScrollAlphaFromRightTop);
        }
        return eVar;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        if (this.K.getChildCount() == 0) {
            s0();
        }
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar.f21154f == null && bVar.f21157i == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("歭"));
        }
        this.I = bVar.f21174z;
        int i5 = bVar.f21173y;
        this.J = i5;
        this.K.setTranslationX(i5);
        this.K.setTranslationY(this.f21074o.f21174z);
        t0();
        h.g((ViewGroup) T(), Q(), P(), W(), U(), new a());
    }

    protected void s0() {
        this.K.addView(LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.K, false));
    }

    protected void t0() {
        Drawable.ConstantState constantState;
        if (this.f21080u) {
            return;
        }
        if (V().getBackground() != null && (constantState = V().getBackground().getConstantState()) != null) {
            this.K.setBackground(constantState.newDrawable(getResources()));
            V().setBackground(null);
        }
        this.K.setElevation(h.p(getContext(), 10.0f));
    }

    public void u0() {
        if (this.f21074o == null) {
            return;
        }
        int R = R();
        this.P = (h.s(getContext()) - this.Q) - R;
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
            this.M = this.f21074o.f21157i.x < ((float) h.t(getContext())) / 2.0f;
            ViewGroup.LayoutParams layoutParams = T().getLayoutParams();
            int Z = (int) (w0() ? (this.f21074o.f21157i.y - Z()) - this.Q : ((h.A(getContext()) - this.f21074o.f21157i.y) - this.Q) - R);
            int t5 = (int) ((this.M ? h.t(getContext()) - this.f21074o.f21157i.x : this.f21074o.f21157i.x) - this.Q);
            if (T().getMeasuredHeight() > Z) {
                layoutParams.height = Z;
            }
            if (T().getMeasuredWidth() > t5) {
                layoutParams.width = Math.max(t5, W());
            }
            T().setLayoutParams(layoutParams);
            T().post(new c(H));
            return;
        }
        Rect a6 = bVar.a();
        a6.left -= I();
        int I = a6.right - I();
        a6.right = I;
        int i5 = (a6.left + I) / 2;
        boolean z5 = ((float) (T().getMeasuredHeight() + a6.bottom)) > this.P;
        int i6 = a6.top;
        this.R = (a6.bottom + i6) / 2.0f;
        if (z5) {
            int Z2 = (i6 - Z()) - this.Q;
            if (T().getMeasuredHeight() > Z2) {
                this.L = ((float) Z2) > this.P - ((float) a6.bottom);
            } else {
                this.L = true;
            }
        } else {
            this.L = false;
        }
        this.M = i5 < h.t(getContext()) / 2;
        ViewGroup.LayoutParams layoutParams2 = T().getLayoutParams();
        int Z3 = w0() ? (a6.top - Z()) - this.Q : ((h.A(getContext()) - a6.bottom) - this.Q) - R;
        int t6 = (this.M ? h.t(getContext()) - a6.left : a6.right) - this.Q;
        if (T().getMeasuredHeight() > Z3) {
            layoutParams2.height = Z3;
        }
        if (T().getMeasuredWidth() > t6) {
            layoutParams2.width = Math.max(t6, W());
        }
        T().setLayoutParams(layoutParams2);
        T().post(new d(H, a6));
    }

    protected void v0() {
        c0();
        E();
        B();
    }

    protected boolean w0() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        return bVar.K ? this.R > ((float) (h.s(getContext()) / 2)) : (this.L || bVar.f21166r == b3.d.Top) && bVar.f21166r != b3.d.Bottom;
    }
}
