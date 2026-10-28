package com.lxj.xpopup.impl;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.o0;
import c3.f;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.lxj.xpopup.c;
import com.lxj.xpopup.util.h;

/* loaded from: classes6.dex */
public class InputConfirmPopupView extends ConfirmPopupView implements View.OnClickListener {

    /* renamed from: e0, reason: collision with root package name */
    public CharSequence f21192e0;

    /* renamed from: f0, reason: collision with root package name */
    c3.a f21193f0;

    /* renamed from: g0, reason: collision with root package name */
    f f21194g0;

    public InputConfirmPopupView(@o0 Context context, int bindLayoutId) {
        super(context, bindLayoutId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E0() {
        if (this.f21187a0.getMeasuredWidth() > 0) {
            this.f21187a0.setBackgroundDrawable(h.o(h.l(getContext(), this.f21187a0.getMeasuredWidth(), Color.parseColor(ProtectedSandApp.s("歴"))), h.l(getContext(), this.f21187a0.getMeasuredWidth(), c.d())));
        }
    }

    public EditText D0() {
        return this.f21187a0;
    }

    public void F0(f inputConfirmListener, c3.a cancelListener) {
        this.f21193f0 = cancelListener;
        this.f21194g0 = inputConfirmListener;
    }

    @Override // com.lxj.xpopup.impl.ConfirmPopupView, com.lxj.xpopup.core.BasePopupView
    protected void h0() {
        super.h0();
        h.T(this.f21187a0, true);
        if (!TextUtils.isEmpty(this.U)) {
            this.f21187a0.setHint(this.U);
        }
        if (!TextUtils.isEmpty(this.f21192e0)) {
            this.f21187a0.setText(this.f21192e0);
            this.f21187a0.setSelection(this.f21192e0.length());
        }
        c.d();
        if (this.J == 0) {
            this.f21187a0.post(new Runnable() { // from class: com.lxj.xpopup.impl.a
                @Override // java.lang.Runnable
                public final void run() {
                    InputConfirmPopupView.this.E0();
                }
            });
        }
    }

    @Override // com.lxj.xpopup.impl.ConfirmPopupView, com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void n() {
        super.n();
        this.f21187a0.setHintTextColor(Color.parseColor(ProtectedSandApp.s("歵")));
        this.f21187a0.setTextColor(Color.parseColor(ProtectedSandApp.s("歶")));
    }

    @Override // com.lxj.xpopup.impl.ConfirmPopupView, com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void o() {
        super.o();
        this.f21187a0.setHintTextColor(Color.parseColor(ProtectedSandApp.s("歷")));
        this.f21187a0.setTextColor(Color.parseColor(ProtectedSandApp.s("歸")));
    }

    @Override // com.lxj.xpopup.impl.ConfirmPopupView, android.view.View.OnClickListener
    public void onClick(View v5) {
        if (v5 == this.Q) {
            c3.a aVar = this.f21193f0;
            if (aVar != null) {
                aVar.onCancel();
            }
            x();
            return;
        }
        if (v5 == this.R) {
            f fVar = this.f21194g0;
            if (fVar != null) {
                fVar.a(this.f21187a0.getText().toString().trim());
            }
            if (this.f21074o.f21151c.booleanValue()) {
                x();
            }
        }
    }
}
