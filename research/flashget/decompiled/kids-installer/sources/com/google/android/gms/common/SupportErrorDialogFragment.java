package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.c;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes4.dex */
public class SupportErrorDialogFragment extends c {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;

    @q0
    private Dialog zac;

    @o0
    public static SupportErrorDialogFragment newInstance(@o0 Dialog dialog) {
        return newInstance(dialog, null);
    }

    @Override // androidx.fragment.app.c, android.content.DialogInterface.OnCancelListener
    public void onCancel(@o0 DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.zab;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }

    @Override // androidx.fragment.app.c
    @o0
    public Dialog onCreateDialog(@q0 Bundle bundle) {
        Dialog dialog = this.zaa;
        if (dialog != null) {
            return dialog;
        }
        setShowsDialog(false);
        if (this.zac == null) {
            this.zac = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getContext())).create();
        }
        return this.zac;
    }

    @Override // androidx.fragment.app.c
    public void show(@o0 FragmentManager fragmentManager, @q0 String str) {
        super.show(fragmentManager, str);
    }

    @o0
    public static SupportErrorDialogFragment newInstance(@o0 Dialog dialog, @q0 DialogInterface.OnCancelListener onCancelListener) {
        SupportErrorDialogFragment supportErrorDialogFragment = new SupportErrorDialogFragment();
        Dialog dialog2 = (Dialog) Preconditions.checkNotNull(dialog, ProtectedSandApp.s("ⵐ"));
        dialog2.setOnCancelListener(null);
        dialog2.setOnDismissListener(null);
        supportErrorDialogFragment.zaa = dialog2;
        if (onCancelListener != null) {
            supportErrorDialogFragment.zab = onCancelListener;
        }
        return supportErrorDialogFragment;
    }
}
