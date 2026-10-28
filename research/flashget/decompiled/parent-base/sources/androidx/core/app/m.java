package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.View;

/* compiled from: DialogCompat.java */
/* loaded from: classes3.dex */
public class m {

    /* compiled from: DialogCompat.java */
    @androidx.annotation.x0(28)
    static class a {
        private a() {
        }

        static <T> T a(Dialog dialog, int i4) {
            return (T) dialog.requireViewById(i4);
        }
    }

    private m() {
    }

    @androidx.annotation.o0
    public static View a(@androidx.annotation.o0 Dialog dialog, int i4) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i4);
        }
        View findViewById = dialog.findViewById(i4);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
