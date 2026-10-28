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

    /* renamed from: v, reason: collision with root package name */
    PositionPopupContainer f69618v;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PositionPopupView.this.p0();
        }
    }

    class b implements PositionPopupContainer.b {
        b() {
        }

        @Override // com.lxj.xpopup.widget.PositionPopupContainer.b
        public void onDismiss() {
            PositionPopupView.this.t();
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PositionPopupView.this.p0();
        }
    }

    public PositionPopupView(@o0 Context context) {
        super(context);
        this.f69618v = (PositionPopupContainer) findViewById(b.h.h4);
        this.f69618v.addView(LayoutInflater.from(getContext()).inflate(I(), (ViewGroup) this.f69618v, false));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return;
        }
        if (bVar.B) {
            this.f69618v.setTranslationX((!h.H(getContext()) ? h.t(getContext()) - this.f69618v.getMeasuredWidth() : -(h.t(getContext()) - this.f69618v.getMeasuredWidth())) / 2.0f);
        } else {
            this.f69618v.setTranslationX(bVar.f69647y);
        }
        this.f69618v.setTranslationY(this.f69527b.f69648z);
        r0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected final int J() {
        return b.k.f68832q;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected com.lxj.xpopup.animator.c O() {
        return new d(P(), G(), fb.c.ScaleAlphaFromCenter);
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void Z() {
        setClipChildren(false);
        setClipToPadding(false);
        PositionPopupContainer positionPopupContainer = this.f69618v;
        positionPopupContainer.f69932f = this.f69527b.A;
        positionPopupContainer.f69933g = q0();
        h.g((ViewGroup) P(), M(), L(), S(), Q(), new a());
        this.f69618v.d(new b());
    }

    protected fb.a q0() {
        return fb.a.DragToUp;
    }

    protected void r0() {
        Y();
        A();
        x();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void z() {
        super.z();
        h.g((ViewGroup) P(), M(), L(), S(), Q(), new c());
    }
}
