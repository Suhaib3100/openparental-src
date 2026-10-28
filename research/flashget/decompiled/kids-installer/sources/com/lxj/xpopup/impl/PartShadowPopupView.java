package com.lxj.xpopup.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.PartShadowContainer;

/* loaded from: classes6.dex */
public abstract class PartShadowPopupView extends BasePopupView {
    protected PartShadowContainer I;
    private boolean J;
    public boolean K;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PartShadowPopupView.this.u0();
        }
    }

    /* loaded from: classes5.dex */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PartShadowPopupView.this.u0();
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PartShadowPopupView.this.v0();
            PartShadowPopupView.this.V().setAlpha(1.0f);
        }
    }

    /* loaded from: classes5.dex */
    class d implements c3.b {
        d() {
        }

        @Override // c3.b
        public void a() {
            if (PartShadowPopupView.this.f21074o.f21150b.booleanValue()) {
                PartShadowPopupView.this.x();
            }
        }
    }

    public PartShadowPopupView(@o0 Context context) {
        super(context);
        this.J = false;
        PartShadowContainer partShadowContainer = (PartShadowContainer) findViewById(b.h.f20505s0);
        this.I = partShadowContainer;
        partShadowContainer.f21399p = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        if (this.J) {
            return;
        }
        this.J = true;
        c0();
        E();
        B();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void D() {
        super.D();
        h.g((ViewGroup) T(), Q(), P(), W(), U(), new b());
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int N() {
        return b.k.f20634p;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c S() {
        return new com.lxj.xpopup.animator.h(V(), K(), this.K ? b3.c.TranslateFromBottom : b3.c.TranslateFromTop);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        if (this.I.getChildCount() == 0) {
            t0();
        }
        if (this.f21074o.f21152d.booleanValue()) {
            this.f21076q.f19788c = T();
        }
        V().setTranslationX(this.f21074o.f21173y);
        V().setTranslationY(this.f21074o.f21174z);
        V().setAlpha(0.0f);
        h.g((ViewGroup) T(), Q(), P(), W(), U(), new a());
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void i0() {
        this.J = false;
    }

    protected void t0() {
        this.I.addView(LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.I, false));
    }

    public void u0() {
        if (this.f21074o.f21154f == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("歺"));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) T().getLayoutParams();
        Rect a6 = this.f21074o.a();
        int height = (a6.height() / 2) + a6.top;
        View V = V();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) V.getLayoutParams();
        if ((height > getMeasuredHeight() / 2 || this.f21074o.f21166r == b3.d.Top) && this.f21074o.f21166r != b3.d.Bottom) {
            marginLayoutParams.height = a6.top;
            this.K = true;
            layoutParams.gravity = 80;
            if (P() > 0) {
                layoutParams.height = Math.min(V.getMeasuredHeight(), P());
            }
        } else {
            int measuredHeight = getMeasuredHeight();
            int i5 = a6.bottom;
            marginLayoutParams.height = measuredHeight - i5;
            this.K = false;
            marginLayoutParams.topMargin = i5;
            layoutParams.gravity = 48;
            if (P() > 0) {
                layoutParams.height = Math.min(V.getMeasuredHeight(), P());
            }
        }
        T().setLayoutParams(marginLayoutParams);
        V.setLayoutParams(layoutParams);
        T().post(new c());
        PartShadowContainer partShadowContainer = this.I;
        partShadowContainer.f21398o = this.f21074o.Q;
        partShadowContainer.a(new d());
    }
}
