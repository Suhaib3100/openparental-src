package com.lxj.xpopup.impl;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.lxj.xpopup.c;
import com.lxj.xpopup.util.h;
import gb.f;

/* loaded from: classes6.dex */
public class InputConfirmPopupView extends ConfirmPopupView implements View.OnClickListener {
    public CharSequence O;
    gb.a P;
    f Q;

    public InputConfirmPopupView(@o0 Context context, int bindLayoutId) {
        super(context, bindLayoutId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void A0() {
        if (this.K.getMeasuredWidth() > 0) {
            this.K.setBackgroundDrawable(h.o(h.l(getContext(), this.K.getMeasuredWidth(), Color.parseColor(ProtectedSandApp.s("រ\u0001"))), h.l(getContext(), this.K.getMeasuredWidth(), c.d())));
        }
    }

    public void B0(f inputConfirmListener, gb.a cancelListener) {
        this.P = cancelListener;
        this.Q = inputConfirmListener;
    }

    @Override // com.lxj.xpopup.impl.ConfirmPopupView, com.lxj.xpopup.core.BasePopupView
    protected void d0() {
        super.d0();
        h.T(this.K, true);
        if (!TextUtils.isEmpty(this.H)) {
            this.K.setHint(this.H);
        }
        if (!TextUtils.isEmpty(this.O)) {
            this.K.setText(this.O);
            this.K.setSelection(this.O.length());
        }
        c.d();
        if (this.f69583w == 0) {
            this.K.post(new Runnable() { // from class: com.lxj.xpopup.impl.a
                @Override // java.lang.Runnable
                public final void run() {
                    InputConfirmPopupView.this.A0();
                }
            });
        }
    }

    @Override // com.lxj.xpopup.impl.ConfirmPopupView, com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void h() {
        super.h();
        this.K.setHintTextColor(Color.parseColor(ProtectedSandApp.s("រ\u0001")));
        this.K.setTextColor(Color.parseColor(ProtectedSandApp.s("ល\u0001")));
    }

    @Override // com.lxj.xpopup.impl.ConfirmPopupView, com.lxj.xpopup.core.CenterPopupView, com.lxj.xpopup.core.BasePopupView
    protected void i() {
        super.i();
        this.K.setHintTextColor(Color.parseColor(ProtectedSandApp.s("រ\u0001")));
        this.K.setTextColor(Color.parseColor(ProtectedSandApp.s("វ\u0001")));
    }

    @Override // com.lxj.xpopup.impl.ConfirmPopupView, android.view.View.OnClickListener
    public void onClick(View v4) {
        if (v4 == this.D) {
            gb.a aVar = this.P;
            if (aVar != null) {
                aVar.onCancel();
            }
            t();
            return;
        }
        if (v4 == this.E) {
            f fVar = this.Q;
            if (fVar != null) {
                fVar.a(this.K.getText().toString().trim());
            }
            if (this.f69527b.f69625c.booleanValue()) {
                t();
            }
        }
    }

    public EditText z0() {
        return this.K;
    }
}
