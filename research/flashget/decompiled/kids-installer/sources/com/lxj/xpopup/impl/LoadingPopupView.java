package com.lxj.xpopup.impl;

import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.o0;
import androidx.transition.ChangeBounds;
import androidx.transition.Fade;
import androidx.transition.TransitionSet;
import androidx.transition.z;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.CenterPopupView;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class LoadingPopupView extends CenterPopupView {
    private b M;
    private TextView N;
    private View O;
    private View P;
    private boolean Q;
    private CharSequence R;

    /* loaded from: classes5.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (!LoadingPopupView.this.Q) {
                z.b(((CenterPopupView) LoadingPopupView.this).I, new TransitionSet().E0(LoadingPopupView.this.K()).V0(new Fade()).V0(new ChangeBounds()));
            }
            if (LoadingPopupView.this.R == null || LoadingPopupView.this.R.length() == 0) {
                h.T(LoadingPopupView.this.N, false);
            } else {
                h.T(LoadingPopupView.this.N, true);
                if (LoadingPopupView.this.N != null) {
                    LoadingPopupView.this.N.setText(LoadingPopupView.this.R);
                }
            }
            if (LoadingPopupView.this.M == b.Spinner) {
                h.T(LoadingPopupView.this.O, false);
                h.T(LoadingPopupView.this.P, true);
            } else {
                h.T(LoadingPopupView.this.O, true);
                h.T(LoadingPopupView.this.P, false);
            }
        }
    }

    /* loaded from: classes5.dex */
    public enum b {
        Spinner,
        ProgressBar
    }

    public LoadingPopupView(@o0 Context context, int bindLayoutId) {
        super(context);
        this.M = b.Spinner;
        this.Q = true;
        this.J = bindLayoutId;
        s0();
    }

    public LoadingPopupView B0(b style) {
        this.M = style;
        D0();
        return this;
    }

    public LoadingPopupView C0(CharSequence title) {
        this.R = title;
        D0();
        return this;
    }

    protected void D0() {
        post(new a());
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected int M() {
        int i5 = this.J;
        return i5 != 0 ? i5 : b.k.f20616j;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void h0() {
        this.N = (TextView) findViewById(b.h.p6);
        this.O = findViewById(b.h.A2);
        this.P = findViewById(b.h.B2);
        V().setElevation(10.0f);
        if (this.J == 0) {
            V().setBackground(h.m(Color.parseColor(ProtectedSandApp.s("歹")), this.f21074o.f21162n));
        }
        D0();
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void k0() {
        this.Q = false;
    }
}
