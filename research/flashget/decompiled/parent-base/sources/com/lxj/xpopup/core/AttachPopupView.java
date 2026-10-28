package com.lxj.xpopup.core;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.animator.e;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public abstract class AttachPopupView extends BasePopupView {
    float A;
    float B;
    float C;
    int D;
    float E;

    /* renamed from: v, reason: collision with root package name */
    protected int f69515v;

    /* renamed from: w, reason: collision with root package name */
    protected int f69516w;

    /* renamed from: x, reason: collision with root package name */
    protected FrameLayout f69517x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f69518y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f69519z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AttachPopupView.this.q0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AttachPopupView.this.q0();
        }
    }

    class c implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f69522b;

        c(final boolean val$isRTL) {
            this.f69522b = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            float t4;
            AttachPopupView attachPopupView = AttachPopupView.this;
            com.lxj.xpopup.core.b bVar = attachPopupView.f69527b;
            if (bVar == null) {
                return;
            }
            if (this.f69522b) {
                if (attachPopupView.f69519z) {
                    t4 = ((h.t(attachPopupView.getContext()) - AttachPopupView.this.f69527b.f69631i.x) - r2.P().getMeasuredWidth()) - AttachPopupView.this.f69516w;
                } else {
                    t4 = (h.t(attachPopupView.getContext()) - AttachPopupView.this.f69527b.f69631i.x) + r2.f69516w;
                }
                attachPopupView.A = -t4;
            } else {
                boolean z4 = attachPopupView.f69519z;
                float f4 = bVar.f69631i.x;
                attachPopupView.A = z4 ? f4 + attachPopupView.f69516w : (f4 - attachPopupView.P().getMeasuredWidth()) - AttachPopupView.this.f69516w;
            }
            AttachPopupView attachPopupView2 = AttachPopupView.this;
            if (attachPopupView2.f69527b.B) {
                if (attachPopupView2.f69519z) {
                    if (this.f69522b) {
                        attachPopupView2.A = (attachPopupView2.P().getMeasuredWidth() / 2.0f) + attachPopupView2.A;
                    } else {
                        attachPopupView2.A -= attachPopupView2.P().getMeasuredWidth() / 2.0f;
                    }
                } else if (this.f69522b) {
                    attachPopupView2.A -= attachPopupView2.P().getMeasuredWidth() / 2.0f;
                } else {
                    attachPopupView2.A = (attachPopupView2.P().getMeasuredWidth() / 2.0f) + attachPopupView2.A;
                }
            }
            if (AttachPopupView.this.s0()) {
                AttachPopupView attachPopupView3 = AttachPopupView.this;
                attachPopupView3.B = (attachPopupView3.f69527b.f69631i.y - attachPopupView3.P().getMeasuredHeight()) - AttachPopupView.this.f69515v;
            } else {
                AttachPopupView attachPopupView4 = AttachPopupView.this;
                attachPopupView4.B = attachPopupView4.f69527b.f69631i.y + attachPopupView4.f69515v;
            }
            AttachPopupView.this.P().setTranslationX(AttachPopupView.this.A);
            AttachPopupView.this.P().setTranslationY(AttachPopupView.this.B);
            AttachPopupView.this.r0();
        }
    }

    class d implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f69524b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Rect f69525c;

        d(final boolean val$rect, final Rect val$isRTL) {
            this.f69524b = val$rect;
            this.f69525c = val$isRTL;
        }

        @Override // java.lang.Runnable
        public void run() {
            AttachPopupView attachPopupView = AttachPopupView.this;
            if (attachPopupView.f69527b == null) {
                return;
            }
            if (this.f69524b) {
                attachPopupView.A = -(attachPopupView.f69519z ? ((h.t(attachPopupView.getContext()) - this.f69525c.left) - AttachPopupView.this.P().getMeasuredWidth()) - AttachPopupView.this.f69516w : (h.t(attachPopupView.getContext()) - this.f69525c.right) + AttachPopupView.this.f69516w);
            } else {
                attachPopupView.A = attachPopupView.f69519z ? this.f69525c.left + attachPopupView.f69516w : (this.f69525c.right - attachPopupView.P().getMeasuredWidth()) - AttachPopupView.this.f69516w;
            }
            AttachPopupView attachPopupView2 = AttachPopupView.this;
            if (attachPopupView2.f69527b.B) {
                if (attachPopupView2.f69519z) {
                    if (this.f69524b) {
                        attachPopupView2.A -= (this.f69525c.width() - AttachPopupView.this.P().getMeasuredWidth()) / 2.0f;
                    } else {
                        attachPopupView2.A = ((this.f69525c.width() - AttachPopupView.this.P().getMeasuredWidth()) / 2.0f) + attachPopupView2.A;
                    }
                } else if (this.f69524b) {
                    attachPopupView2.A = ((this.f69525c.width() - AttachPopupView.this.P().getMeasuredWidth()) / 2.0f) + attachPopupView2.A;
                } else {
                    attachPopupView2.A -= (this.f69525c.width() - AttachPopupView.this.P().getMeasuredWidth()) / 2.0f;
                }
            }
            if (AttachPopupView.this.s0()) {
                AttachPopupView.this.B = (this.f69525c.top - r0.P().getMeasuredHeight()) - AttachPopupView.this.f69515v;
            } else {
                AttachPopupView.this.B = this.f69525c.bottom + r0.f69515v;
            }
            AttachPopupView.this.P().setTranslationX(AttachPopupView.this.A);
            AttachPopupView.this.P().setTranslationY(AttachPopupView.this.B);
            AttachPopupView.this.r0();
        }
    }

    public AttachPopupView(@o0 Context context) {
        super(context);
        this.f69515v = 0;
        this.f69516w = 0;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = h.s(getContext());
        this.D = h.p(getContext(), 10.0f);
        this.E = 0.0f;
        this.f69517x = (FrameLayout) findViewById(b.h.f68708s0);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int J() {
        return b.k.f68793d;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c O() {
        e eVar;
        if (s0()) {
            eVar = new e(P(), G(), this.f69519z ? fb.c.ScrollAlphaFromLeftBottom : fb.c.ScrollAlphaFromRightBottom);
        } else {
            eVar = new e(P(), G(), this.f69519z ? fb.c.ScrollAlphaFromLeftTop : fb.c.ScrollAlphaFromRightTop);
        }
        return eVar;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        if (this.f69517x.getChildCount() == 0) {
            o0();
        }
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar.f69628f == null && bVar.f69631i == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ទ\u0001"));
        }
        this.f69515v = bVar.f69648z;
        int i4 = bVar.f69647y;
        this.f69516w = i4;
        this.f69517x.setTranslationX(i4);
        this.f69517x.setTranslationY(this.f69527b.f69648z);
        p0();
        h.g((ViewGroup) P(), M(), L(), S(), Q(), new a());
    }

    protected void o0() {
        this.f69517x.addView(LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69517x, false));
    }

    protected void p0() {
        Drawable.ConstantState constantState;
        if (this.f69533h) {
            return;
        }
        if (R().getBackground() != null && (constantState = R().getBackground().getConstantState()) != null) {
            this.f69517x.setBackground(constantState.newDrawable(getResources()));
            R().setBackground(null);
        }
        this.f69517x.setElevation(h.p(getContext(), 10.0f));
    }

    public void q0() {
        if (this.f69527b == null) {
            return;
        }
        int N = N();
        this.C = (h.s(getContext()) - this.D) - N;
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
                this.f69518y = this.f69527b.f69631i.y > ((float) h.A(getContext())) / 2.0f;
            } else {
                this.f69518y = false;
            }
            this.f69519z = this.f69527b.f69631i.x < ((float) h.t(getContext())) / 2.0f;
            ViewGroup.LayoutParams layoutParams = P().getLayoutParams();
            int V = (int) (s0() ? (this.f69527b.f69631i.y - V()) - this.D : ((h.A(getContext()) - this.f69527b.f69631i.y) - this.D) - N);
            int t4 = (int) ((this.f69519z ? h.t(getContext()) - this.f69527b.f69631i.x : this.f69527b.f69631i.x) - this.D);
            if (P().getMeasuredHeight() > V) {
                layoutParams.height = V;
            }
            if (P().getMeasuredWidth() > t4) {
                layoutParams.width = Math.max(t4, S());
            }
            P().setLayoutParams(layoutParams);
            P().post(new c(H));
            return;
        }
        Rect a5 = bVar.a();
        a5.left -= E();
        int E = a5.right - E();
        a5.right = E;
        int i4 = (a5.left + E) / 2;
        boolean z4 = ((float) (P().getMeasuredHeight() + a5.bottom)) > this.C;
        int i5 = a5.top;
        this.E = (a5.bottom + i5) / 2.0f;
        if (z4) {
            int V2 = (i5 - V()) - this.D;
            if (P().getMeasuredHeight() > V2) {
                this.f69518y = ((float) V2) > this.C - ((float) a5.bottom);
            } else {
                this.f69518y = true;
            }
        } else {
            this.f69518y = false;
        }
        this.f69519z = i4 < h.t(getContext()) / 2;
        ViewGroup.LayoutParams layoutParams2 = P().getLayoutParams();
        int V3 = s0() ? (a5.top - V()) - this.D : ((h.A(getContext()) - a5.bottom) - this.D) - N;
        int t5 = (this.f69519z ? h.t(getContext()) - a5.left : a5.right) - this.D;
        if (P().getMeasuredHeight() > V3) {
            layoutParams2.height = V3;
        }
        if (P().getMeasuredWidth() > t5) {
            layoutParams2.width = Math.max(t5, S());
        }
        P().setLayoutParams(layoutParams2);
        P().post(new d(H, a5));
    }

    protected void r0() {
        Y();
        A();
        x();
    }

    protected boolean s0() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        return bVar.K ? this.E > ((float) (h.s(getContext()) / 2)) : (this.f69518y || bVar.f69640r == fb.d.Top) && bVar.f69640r != fb.d.Bottom;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void z() {
        super.z();
        h.g((ViewGroup) P(), M(), L(), S(), Q(), new b());
    }
}
