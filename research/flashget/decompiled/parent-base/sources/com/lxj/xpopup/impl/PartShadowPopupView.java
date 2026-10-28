package com.lxj.xpopup.impl;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.animator.h;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.BasePopupView;
import com.lxj.xpopup.widget.PartShadowContainer;

/* loaded from: classes6.dex */
public abstract class PartShadowPopupView extends BasePopupView {

    /* renamed from: v, reason: collision with root package name */
    protected PartShadowContainer f69672v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f69673w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f69674x;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PartShadowPopupView.this.q0();
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PartShadowPopupView.this.q0();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PartShadowPopupView.this.r0();
            PartShadowPopupView.this.R().setAlpha(1.0f);
        }
    }

    class d implements gb.b {
        d() {
        }

        @Override // gb.b
        public void a() {
            if (PartShadowPopupView.this.f69527b.f69624b.booleanValue()) {
                PartShadowPopupView.this.t();
            }
        }
    }

    public PartShadowPopupView(@o0 Context context) {
        super(context);
        this.f69673w = false;
        PartShadowContainer partShadowContainer = (PartShadowContainer) findViewById(b.h.f68708s0);
        this.f69672v = partShadowContainer;
        partShadowContainer.f69889c = this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r0() {
        if (this.f69673w) {
            return;
        }
        this.f69673w = true;
        Y();
        A();
        x();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int J() {
        return b.k.f68829p;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c O() {
        return new h(R(), G(), this.f69674x ? fb.c.TranslateFromBottom : fb.c.TranslateFromTop);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        if (this.f69672v.getChildCount() == 0) {
            p0();
        }
        if (this.f69527b.f69626d.booleanValue()) {
            this.f69529d.f67866c = P();
        }
        R().setTranslationX(this.f69527b.f69647y);
        R().setTranslationY(this.f69527b.f69648z);
        R().setAlpha(0.0f);
        com.lxj.xpopup.util.h.g((ViewGroup) P(), M(), L(), S(), Q(), new a());
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void e0() {
        this.f69673w = false;
    }

    protected void p0() {
        this.f69672v.addView(LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69672v, false));
    }

    public void q0() {
        if (this.f69527b.f69628f == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ហ\u0001"));
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) P().getLayoutParams();
        Rect a5 = this.f69527b.a();
        int height = (a5.height() / 2) + a5.top;
        View R = R();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) R.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new FrameLayout.LayoutParams(-2, -2);
        }
        if ((height > getMeasuredHeight() / 2 || this.f69527b.f69640r == fb.d.Top) && this.f69527b.f69640r != fb.d.Bottom) {
            marginLayoutParams.height = a5.top;
            this.f69674x = true;
            layoutParams.gravity = 80;
            if (L() > 0) {
                layoutParams.height = Math.min(R.getMeasuredHeight(), L());
            }
        } else {
            int measuredHeight = getMeasuredHeight();
            int i4 = a5.bottom;
            marginLayoutParams.height = measuredHeight - i4;
            this.f69674x = false;
            marginLayoutParams.topMargin = i4;
            layoutParams.gravity = 48;
            if (L() > 0) {
                layoutParams.height = Math.min(R.getMeasuredHeight(), L());
            }
        }
        P().setLayoutParams(marginLayoutParams);
        R.setLayoutParams(layoutParams);
        P().post(new c());
        PartShadowContainer partShadowContainer = this.f69672v;
        partShadowContainer.f69888b = this.f69527b.Q;
        partShadowContainer.a(new d());
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void z() {
        super.z();
        com.lxj.xpopup.util.h.g((ViewGroup) P(), M(), L(), S(), Q(), new b());
    }
}
