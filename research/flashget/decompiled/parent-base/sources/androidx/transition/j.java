package androidx.transition;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: GhostViewUtils.java */
/* loaded from: classes3.dex */
class j {
    private j() {
    }

    @androidx.annotation.q0
    static f a(@androidx.annotation.o0 View view, @androidx.annotation.o0 ViewGroup viewGroup, @androidx.annotation.q0 Matrix matrix) {
        return Build.VERSION.SDK_INT == 28 ? h.b(view, viewGroup, matrix) : i.b(view, viewGroup, matrix);
    }

    static void b(View view) {
        if (Build.VERSION.SDK_INT == 28) {
            h.f(view);
        } else {
            i.f(view);
        }
    }
}
