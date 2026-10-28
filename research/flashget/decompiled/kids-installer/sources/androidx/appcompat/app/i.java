package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes4.dex */
public class i extends androidx.fragment.app.c {
    @Override // androidx.fragment.app.c
    @o0
    public Dialog onCreateDialog(@q0 Bundle bundle) {
        return new h(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.c
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@o0 Dialog dialog, int i5) {
        if (!(dialog instanceof h)) {
            super.setupDialog(dialog, i5);
            return;
        }
        h hVar = (h) dialog;
        if (i5 != 1 && i5 != 2) {
            if (i5 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        hVar.e(1);
    }
}
