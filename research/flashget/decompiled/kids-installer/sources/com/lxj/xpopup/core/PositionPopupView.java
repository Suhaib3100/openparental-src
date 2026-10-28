package com.lxj.xpopup.core;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.o0;
import com.lxj.xpopup.animator.d;
import com.lxj.xpopup.b;
import com.lxj.xpopup.util.h;
import com.lxj.xpopup.widget.PositionPopupContainer;

/* loaded from: classes6.dex */
public class PositionPopupView extends BasePopupView {
    PositionPopupContainer I;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PositionPopupView.this.t0();
        }
    }

    /* loaded from: classes5.dex */
    class b implements PositionPopupContainer.b {
        b() {
        }

        @Override // com.lxj.xpopup.widget.PositionPopupContainer.b
        public void onDismiss() {
            PositionPopupView.this.x();
        }
    }

    /* loaded from: classes5.dex */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PositionPopupView.this.t0();
        }
    }

    public PositionPopupView(@o0 Context context) {
        super(context);
        this.I = (PositionPopupContainer) findViewById(b.h.f20443h4);
        this.I.addView(LayoutInflater.from(getContext()).inflate(M(), (ViewGroup) this.I, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t0() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return;
        }
        if (bVar.B) {
            this.I.setTranslationX((!h.H(getContext()) ? h.t(getContext()) - this.I.getMeasuredWidth() : -(h.t(getContext()) - this.I.getMeasuredWidth())) / 2.0f);
        } else {
            this.I.setTranslationX(bVar.f21173y);
        }
        this.I.setTranslationY(this.f21074o.f21174z);
        v0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void D() {
        super.D();
        h.g((ViewGroup) T(), Q(), P(), W(), U(), new c());
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int N() {
        return b.k.f20637q;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c S() {
        return new d(T(), K(), b3.c.ScaleAlphaFromCenter);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        setClipChildren(false);
        setClipToPadding(false);
        PositionPopupContainer positionPopupContainer = this.I;
        positionPopupContainer.f21435s = this.f21074o.A;
        positionPopupContainer.f21436t = u0();
        h.g((ViewGroup) T(), Q(), P(), W(), U(), new a());
        this.I.d(new b());
    }

    protected b3.a u0() {
        return b3.a.DragToUp;
    }

    protected void v0() {
        c0();
        E();
        B();
    }
}
