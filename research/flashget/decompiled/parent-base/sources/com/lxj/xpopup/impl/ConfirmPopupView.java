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
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.b;
import com.lxj.xpopup.core.CenterPopupView;
import com.lxj.xpopup.util.h;
import gb.c;

/* loaded from: classes6.dex */
public class ConfirmPopupView extends CenterPopupView implements View.OnClickListener {
    c A;
    TextView B;
    TextView C;
    TextView D;
    TextView E;
    CharSequence F;
    CharSequence G;
    CharSequence H;
    CharSequence I;
    CharSequence J;
    EditText K;
    View L;
    View M;
    public boolean N;

    /* renamed from: z, reason: collision with root package name */
    gb.a f69663z;

    public ConfirmPopupView(@o0 Context context, int bindLayoutId) {
        super(context);
        this.N = false;
        this.f69583w = bindLayoutId;
        o0();
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected int I() {
        int i4 = this.f69583w;
        return i4 != 0 ? i4 : b.k.f68805h;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected int L() {
        com.lxj.xpopup.core.b bVar = this.f69527b;
        if (bVar == null) {
            return 0;
        }
        int i4 = bVar.f69633k;
        return i4 == 0 ? (int) (h.s(getContext()) * 0.8d) : i4;
    }

    @Override // com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        this.B = (TextView) findViewById(b.h.p6);
        this.C = (TextView) findViewById(b.h.l6);
        this.D = (TextView) findViewById(b.h.j6);
        this.E = (TextView) findViewById(b.h.k6);
        this.C.setMovementMethod(LinkMovementMethod.getInstance());
        this.K = (EditText) findViewById(b.h.J1);
        this.L = findViewById(b.h.F6);
        this.M = findViewById(b.h.G6);
        this.D.setOnClickListener(this);
        this.E.setOnClickListener(this);
        if (TextUtils.isEmpty(this.F)) {
            h.T(this.B, false);
        } else {
            this.B.setText(this.F);
        }
        if (TextUtils.isEmpty(this.G)) {
            h.T(this.C, false);
        } else {
            this.C.setText(this.G);
        }
        if (!TextUtils.isEmpty(this.I)) {
            this.D.setText(this.I);
        }
        if (!TextUtils.isEmpty(this.J)) {
            this.E.setText(this.J);
        }
        if (this.N) {
            h.T(this.D, false);
            h.T(this.M, false);
        }
        p0();
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void h() {
        super.h();
        TextView textView = this.B;
        Resources resources = getResources();
        int i4 = b.e.f68321g;
        textView.setTextColor(resources.getColor(i4));
        this.C.setTextColor(getResources().getColor(i4));
        this.D.setTextColor(getResources().getColor(i4));
        this.E.setTextColor(getResources().getColor(i4));
        View view = this.L;
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(b.e.f68307d));
        }
        View view2 = this.M;
        if (view2 != null) {
            view2.setBackgroundColor(getResources().getColor(b.e.f68307d));
        }
    }

    @Override // com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void i() {
        super.i();
        TextView textView = this.B;
        Resources resources = getResources();
        int i4 = b.e.f68292a;
        textView.setTextColor(resources.getColor(i4));
        this.C.setTextColor(getResources().getColor(i4));
        this.D.setTextColor(Color.parseColor(ProtectedSandApp.s("យ\u0001")));
        this.E.setTextColor(com.lxj.xpopup.c.d());
        View view = this.L;
        if (view != null) {
            view.setBackgroundColor(getResources().getColor(b.e.f68312e));
        }
        View view2 = this.M;
        if (view2 != null) {
            view2.setBackgroundColor(getResources().getColor(b.e.f68312e));
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v4) {
        if (v4 == this.D) {
            gb.a aVar = this.f69663z;
            if (aVar != null) {
                aVar.onCancel();
            }
            t();
            return;
        }
        if (v4 == this.E) {
            c cVar = this.A;
            if (cVar != null) {
                cVar.onConfirm();
            }
            if (this.f69527b.f69625c.booleanValue()) {
                t();
            }
        }
    }

    public TextView q0() {
        return (TextView) findViewById(b.h.j6);
    }

    public TextView r0() {
        return (TextView) findViewById(b.h.k6);
    }

    public TextView s0() {
        return (TextView) findViewById(b.h.l6);
    }

    public TextView t0() {
        return (TextView) findViewById(b.h.p6);
    }

    public ConfirmPopupView u0(CharSequence cancelText) {
        this.I = cancelText;
        return this;
    }

    public ConfirmPopupView v0(CharSequence confirmText) {
        this.J = confirmText;
        return this;
    }

    public ConfirmPopupView w0(c confirmListener, gb.a cancelListener) {
        this.f69663z = cancelListener;
        this.A = confirmListener;
        return this;
    }

    public ConfirmPopupView x0(CharSequence title, CharSequence content, CharSequence hint) {
        this.F = title;
        this.G = content;
        this.H = hint;
        return this;
    }
}
