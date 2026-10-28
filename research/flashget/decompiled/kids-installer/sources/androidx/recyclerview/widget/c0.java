package androidx.recyclerview.widget;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ScrollbarHelper.java */
/* loaded from: classes.dex */
class c0 {
    private c0() {
    }

    static int a(RecyclerView.a0 a0Var, z zVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z5) {
        if (layoutManager.Q() == 0 || a0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return Math.abs(layoutManager.s0(view) - layoutManager.s0(view2)) + 1;
        }
        return Math.min(zVar.o(), zVar.d(view2) - zVar.g(view));
    }

    static int b(RecyclerView.a0 a0Var, z zVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z5, boolean z6) {
        if (layoutManager.Q() == 0 || a0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        int max = z6 ? Math.max(0, (a0Var.d() - Math.max(layoutManager.s0(view), layoutManager.s0(view2))) - 1) : Math.max(0, Math.min(layoutManager.s0(view), layoutManager.s0(view2)));
        if (z5) {
            return Math.round((max * (Math.abs(zVar.d(view2) - zVar.g(view)) / (Math.abs(layoutManager.s0(view) - layoutManager.s0(view2)) + 1))) + (zVar.n() - zVar.g(view)));
        }
        return max;
    }

    static int c(RecyclerView.a0 a0Var, z zVar, View view, View view2, RecyclerView.LayoutManager layoutManager, boolean z5) {
        if (layoutManager.Q() == 0 || a0Var.d() == 0 || view == null || view2 == null) {
            return 0;
        }
        if (!z5) {
            return a0Var.d();
        }
        return (int) (((zVar.d(view2) - zVar.g(view)) / (Math.abs(layoutManager.s0(view) - layoutManager.s0(view2)) + 1)) * a0Var.d());
    }
}
