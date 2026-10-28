package android.view;

import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import kotlin.f;

/* compiled from: ViewTreeViewModelStoreOwner.java */
/* loaded from: classes.dex */
public class l1 {
    private l1() {
    }

    @q0
    public static i1 a(@o0 View view) {
        i1 i1Var = (i1) view.getTag(f.a.f29104a);
        if (i1Var != null) {
            return i1Var;
        }
        Object parent = view.getParent();
        while (i1Var == null && (parent instanceof View)) {
            View view2 = (View) parent;
            i1Var = (i1) view2.getTag(f.a.f29104a);
            parent = view2.getParent();
        }
        return i1Var;
    }

    public static void b(@o0 View view, @q0 i1 i1Var) {
        view.setTag(f.a.f29104a, i1Var);
    }
}
