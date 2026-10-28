package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.app.i;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

/* compiled from: BottomSheetDialogFragment.java */
/* loaded from: classes4.dex */
public class b extends i {

    /* renamed from: o, reason: collision with root package name */
    private boolean f13115o;

    /* compiled from: BottomSheetDialogFragment.java */
    /* renamed from: com.google.android.material.bottomsheet.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private class C0167b extends BottomSheetBehavior.g {
        private C0167b() {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void a(@o0 View view, float f6) {
        }

        @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.g
        public void b(@o0 View view, int i5) {
            if (i5 == 5) {
                b.this.b();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f13115o) {
            super.dismissAllowingStateLoss();
        } else {
            super.dismiss();
        }
    }

    private void d(@o0 BottomSheetBehavior<?> bottomSheetBehavior, boolean z5) {
        this.f13115o = z5;
        if (bottomSheetBehavior.o0() == 5) {
            b();
            return;
        }
        if (getDialog() instanceof com.google.android.material.bottomsheet.a) {
            ((com.google.android.material.bottomsheet.a) getDialog()).p();
        }
        bottomSheetBehavior.U(new C0167b());
        bottomSheetBehavior.K0(5);
    }

    private boolean e(boolean z5) {
        Dialog dialog = getDialog();
        if (!(dialog instanceof com.google.android.material.bottomsheet.a)) {
            return false;
        }
        com.google.android.material.bottomsheet.a aVar = (com.google.android.material.bottomsheet.a) dialog;
        BottomSheetBehavior<FrameLayout> m5 = aVar.m();
        if (!m5.t0() || !aVar.n()) {
            return false;
        }
        d(m5, z5);
        return true;
    }

    @Override // androidx.fragment.app.c
    public void dismiss() {
        if (e(false)) {
            return;
        }
        super.dismiss();
    }

    @Override // androidx.fragment.app.c
    public void dismissAllowingStateLoss() {
        if (e(true)) {
            return;
        }
        super.dismissAllowingStateLoss();
    }

    @Override // androidx.appcompat.app.i, androidx.fragment.app.c
    @o0
    public Dialog onCreateDialog(@q0 Bundle bundle) {
        return new com.google.android.material.bottomsheet.a(getContext(), getTheme());
    }
}
