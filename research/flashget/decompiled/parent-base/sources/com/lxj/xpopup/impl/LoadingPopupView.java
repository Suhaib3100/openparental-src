package com.lxj.xpopup.impl;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.transition.ChangeBounds;
import androidx.transition.TransitionSet;
import androidx.transition.x;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.transition.n;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.CenterPopupView;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class LoadingPopupView extends CenterPopupView {
    private TextView A;
    private View B;
    private View C;
    private boolean D;
    private CharSequence E;

    /* renamed from: z, reason: collision with root package name */
    private b f69670z;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!LoadingPopupView.this.D) {
                x.b(((CenterPopupView) LoadingPopupView.this).f69582v, new TransitionSet().A0(LoadingPopupView.this.G()).Q0(new n()).Q0(new ChangeBounds()));
            }
            if (LoadingPopupView.this.E == null || LoadingPopupView.this.E.length() == 0) {
                h.T(LoadingPopupView.this.A, false);
            } else {
                h.T(LoadingPopupView.this.A, true);
                if (LoadingPopupView.this.A != null) {
                    LoadingPopupView.this.A.setText(LoadingPopupView.this.E);
                }
            }
            if (LoadingPopupView.this.f69670z == b.Spinner) {
                h.T(LoadingPopupView.this.B, false);
                h.T(LoadingPopupView.this.C, true);
            } else {
                h.T(LoadingPopupView.this.B, true);
                h.T(LoadingPopupView.this.C, false);
            }
        }
    }

    public enum b {
        Spinner,
        ProgressBar
    }

    public LoadingPopupView(@o0 Context context, int bindLayoutId) {
        super(context);
        this.f69670z = b.Spinner;
        this.D = true;
        this.f69583w = bindLayoutId;
        o0();
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected int I() {
        int i4 = this.f69583w;
        return i4 != 0 ? i4 : b.k.f68811j;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        this.A = (TextView) findViewById(b.h.p6);
        this.B = findViewById(b.h.A2);
        this.C = findViewById(b.h.B2);
        R().setElevation(10.0f);
        if (this.f69583w == 0) {
            R().setBackground(h.m(Color.parseColor(ProtectedSandApp.s("ស\u0001")), this.f69527b.f69636n));
        }
        z0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void e0() {
        this.D = true;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void g0() {
        this.D = false;
    }

    public LoadingPopupView x0(b style) {
        this.f69670z = style;
        z0();
        return this;
    }

    public LoadingPopupView y0(CharSequence title) {
        this.E = title;
        z0();
        return this;
    }

    protected void z0() {
        post(new a());
    }
}
