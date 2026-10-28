package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.app.s;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes6.dex */
public class b extends s {

    /* renamed from: b, reason: collision with root package name */
    private boolean f52839b;

    /* compiled from: BottomSheetDialogFragment.java */
    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    private class C0801b extends BottomSheetBehavior.g {
        private C0801b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@o0 View view, float f4) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@o0 View view, int i4) {
            if (i4 == 5) {
                b.this.o();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        if (this.f52839b) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void p(@o0 BottomSheetBehavior<?> bottomSheetBehavior, boolean z4) {
        this.f52839b = z4;
        if (bottomSheetBehavior.o0() == 5) {
            o();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).w();
        }
        bottomSheetBehavior.U(new C0801b());
        bottomSheetBehavior.K0(5);
    }

    private boolean q(boolean z4) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
        BottomSheetBehavior<FrameLayout> t4 = aVar.t();
        if (!t4.t0() || !aVar.u()) {
            return false;
        }
        p(t4, z4);
        return true;
    }

    @Override // androidx.fragment.app.e
    public void dismiss() {
        if (q(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.e
    public void dismissAllowingStateLoss() {
        if (q(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.s, androidx.fragment.app.e
    @o0
    public Dialog onCreateDialog(@q0 Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }
}
