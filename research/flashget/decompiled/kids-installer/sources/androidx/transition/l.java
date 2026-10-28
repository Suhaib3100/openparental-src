package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: GhostViewUtils.java */
/* loaded from: classes.dex */
class l {
    private l() {
    }

    @androidx.annotation.q0
    static h a(@androidx.annotation.o0 View view, @androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? j.b(view, viewGroup, matrix) : k.b(view, viewGroup, matrix);
    }

    static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            j.f(view);
        } else {
            k.f(view);
        }
    }
}
