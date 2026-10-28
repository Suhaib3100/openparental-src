package com.lxj.xpopup.impl;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.o0;
import c3.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.CenterPopupView;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class ConfirmPopupView extends CenterPopupView implements View.OnClickListener {
    c3.a M;
    c N;
    TextView O;
    TextView P;
    TextView Q;
    TextView R;
    CharSequence S;
    CharSequence T;
    CharSequence U;
    CharSequence V;
    CharSequence W;

    /* renamed from: a0, reason: collision with root package name */
    EditText f21187a0;

    /* renamed from: b0, reason: collision with root package name */
    View f21188b0;

    /* renamed from: c0, reason: collision with root package name */
    View f21189c0;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f21190d0;

    public ConfirmPopupView(@o0 Context context, int bindLayoutId) {
        super(context);
        this.f21190d0 = false;
        this.J = bindLayoutId;
        s0();
    }

    public ConfirmPopupView A0(c confirmListener, c3.a cancelListener) {
        this.M = cancelListener;
        this.N = confirmListener;
        return this;
    }

    public ConfirmPopupView B0(CharSequence title, CharSequence content, CharSequence hint) {
        this.S = title;
        this.T = content;
        this.U = hint;
        return this;
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected int M() {
        int i5 = this.J;
        return i5 != 0 ? i5 : b.k.f20610h;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int P() {
        com.lxj.xpopup.core.b bVar = this.f21074o;
        if (bVar == null) {
            return 0;
        }
        int i5 = bVar.f21159k;
        return i5 == 0 ? (int) (h.s(getContext()) * 0.8d) : i5;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void h0() {
        this.O = (TextView) findViewById(b.h.p6);
        this.P = (TextView) findViewById(b.h.l6);
        this.Q = (TextView) findViewById(b.h.j6);
        this.R = (TextView) findViewById(b.h.k6);
        this.P.setMovementMethod(LinkMovementMethod.getInstance());
        this.f21187a0 = (EditText) findViewById(b.h.J1);
        this.f21188b0 = findViewById(b.h.F6);
        this.f21189c0 = findViewById(b.h.G6);
        this.Q.setOnClickListener(this);
        this.R.setOnClickListener(this);
        if (TextUtils.isEmpty(this.S)) {
            h.T(this.O, false);
        } else {
            this.O.setText(this.S);
        }
        if (TextUtils.isEmpty(this.T)) {
            h.T(this.P, false);
        } else {
            this.P.setText(this.T);
        }
        if (!TextUtils.isEmpty(this.V)) {
            this.Q.setText(this.V);
        }
        if (!TextUtils.isEmpty(this.W)) {
            this.R.setText(this.W);
        }
        if (this.f21190d0) {
            h.T(this.Q, false);
            h.T(this.f21189c0, false);
        }
        t0();
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void n() {
        super.n();
        TextView textView = this.O;
        Resources resources = getResources();
        int i5 = b.e.f20070g;
        textView.setTextColor(resources.getColor(i5));
        this.P.setTextColor(getResources().getColor(i5));
        this.Q.setTextColor(getResources().getColor(i5));
        this.R.setTextColor(getResources().getColor(i5));
        View view = this.f21188b0;
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(b.e.f20056d));
        }
        View view2 = this.f21189c0;
        if (view2 != null) {
            view2.setBackgroundColor(getResources().getColor(b.e.f20056d));
        }
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void o() {
        super.o();
        TextView textView = this.O;
        Resources resources = getResources();
        int i5 = b.e.f20041a;
        textView.setTextColor(resources.getColor(i5));
        this.P.setTextColor(getResources().getColor(i5));
        this.Q.setTextColor(Color.parseColor(ProtectedSandApp.s("歳")));
        this.R.setTextColor(com.lxj.xpopup.c.d());
        View view = this.f21188b0;
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(b.e.f20061e));
        }
        View view2 = this.f21189c0;
        if (view2 != null) {
            view2.setBackgroundColor(getResources().getColor(b.e.f20061e));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v5) {
        if (v5 == this.Q) {
            c3.a aVar = this.M;
            if (aVar != null) {
                aVar.onCancel();
            }
            x();
            return;
        }
        if (v5 == this.R) {
            c cVar = this.N;
            if (cVar != null) {
                cVar.a();
            }
            if (this.f21074o.f21151c.booleanValue()) {
                x();
            }
        }
    }

    public TextView u0() {
        return (TextView) findViewById(b.h.j6);
    }

    public TextView v0() {
        return (TextView) findViewById(b.h.k6);
    }

    public TextView w0() {
        return (TextView) findViewById(b.h.l6);
    }

    public TextView x0() {
        return (TextView) findViewById(b.h.p6);
    }

    public ConfirmPopupView y0(CharSequence cancelText) {
        this.V = cancelText;
        return this;
    }

    public ConfirmPopupView z0(CharSequence confirmText) {
        this.W = confirmText;
        return this;
    }
}
