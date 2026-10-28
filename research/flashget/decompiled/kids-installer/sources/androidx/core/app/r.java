package androidx.core.app;

import android.app.Dialog;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;

/* compiled from: DialogCompat.java */
/* loaded from: classes.dex */
public class r {

    /* compiled from: DialogCompat.java */
    @androidx.annotation.x0(28)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static <T> T a(Dialog dialog, int i5) {
            KeyEvent.Callback requireViewById;
            requireViewById = dialog.requireViewById(i5);
            return (T) requireViewById;
        }
    }

    private r() {
    }

    @androidx.annotation.o0
    public static View a(@androidx.annotation.o0 Dialog dialog, int i5) {
        if (Build.VERSION.SDK_INT >= 28) {
            return (View) a.a(dialog, i5);
        }
        View findViewById = dialog.findViewById(i5);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this Dialog");
    }
}
