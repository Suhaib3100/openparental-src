package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.annotation.c1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* compiled from: AppCompatDialogFragment.java */
/* loaded from: classes.dex */
public class s extends androidx.fragment.app.e {
    public s() {
    }

    @Override // androidx.fragment.app.e
    @o0
    public Dialog onCreateDialog(@q0 Bundle bundle) {
        return new r(getContext(), getTheme());
    }

    @Override // androidx.fragment.app.e
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public void setupDialog(@o0 Dialog dialog, int i4) {
        if (!(dialog instanceof r)) {
            super.setupDialog(dialog, i4);
            return;
        }
        r rVar = (r) dialog;
        if (i4 != 1 && i4 != 2) {
            if (i4 != 3) {
                return;
            } else {
                dialog.getWindow().addFlags(24);
            }
        }
        rVar.n(1);
    }

    public s(@j0 int i4) {
        super(i4);
    }
}
