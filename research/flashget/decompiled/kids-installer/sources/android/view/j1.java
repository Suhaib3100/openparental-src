package android.view;

import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import j0.a;

/* compiled from: ViewTreeLifecycleOwner.java */
/* loaded from: classes.dex */
public class j1 {
    private j1() {
    }

    @q0
    public static a0 a(@o0 View view) {
        a0 a0Var = (a0) view.getTag(a.C0249a.f22915a);
        if (a0Var != null) {
            return a0Var;
        }
        Object parent = view.getParent();
        while (a0Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            a0Var = (a0) view2.getTag(a.C0249a.f22915a);
            parent = view2.getParent();
        }
        return a0Var;
    }

    public static void b(@o0 View view, @q0 a0 a0Var) {
        view.setTag(a.C0249a.f22915a, a0Var);
    }
}
