package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;

/* compiled from: LinearSnapHelper.java */
/* loaded from: classes3.dex */
public class t extends e0 {

    /* renamed from: g, reason: collision with root package name */
    private static final float f9569g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private z f9570e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private z f9571f;

    private float m(RecyclerView.LayoutManager layoutManager, z zVar) {
        int Q = layoutManager.Q();
        if (Q == 0) {
            return 1.0f;
        }
        View view = null;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i7 = 0; i7 < Q; i7++) {
            View P = layoutManager.P(i7);
            int s02 = layoutManager.s0(P);
            if (s02 != -1) {
                if (s02 < i6) {
                    view = P;
                    i6 = s02;
                }
                if (s02 > i5) {
                    view2 = P;
                    i5 = s02;
                }
            }
        }
        if (view == null || view2 == null) {
            return 1.0f;
        }
        int max = Math.max(zVar.d(view), zVar.d(view2)) - Math.min(zVar.g(view), zVar.g(view2));
        if (max == 0) {
            return 1.0f;
        }
        return (max * 1.0f) / ((i5 - i6) + 1);
    }

    private int n(@o0 View view, z zVar) {
        return ((zVar.e(view) / 2) + zVar.g(view)) - ((zVar.o() / 2) + zVar.n());
    }

    private int o(RecyclerView.LayoutManager layoutManager, z zVar, int i5, int i6) {
        int[] d6 = d(i5, i6);
        float m5 = m(layoutManager, zVar);
        if (m5 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(d6[0]) > Math.abs(d6[1]) ? d6[0] : d6[1]) / m5);
    }

    @q0
    private View p(RecyclerView.LayoutManager layoutManager, z zVar) {
        int Q = layoutManager.Q();
        View view = null;
        if (Q == 0) {
            return null;
        }
        int o5 = (zVar.o() / 2) + zVar.n();
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 < Q; i6++) {
            View P = layoutManager.P(i6);
            int abs = Math.abs(((zVar.e(P) / 2) + zVar.g(P)) - o5);
            if (abs < i5) {
                view = P;
                i5 = abs;
            }
        }
        return view;
    }

    @o0
    private z q(@o0 RecyclerView.LayoutManager layoutManager) {
        z zVar = this.f9571f;
        if (zVar == null || zVar.f9617a != layoutManager) {
            this.f9571f = new z.a(layoutManager);
        }
        return this.f9571f;
    }

    @o0
    private z r(@o0 RecyclerView.LayoutManager layoutManager) {
        z zVar = this.f9570e;
        if (zVar == null || zVar.f9617a != layoutManager) {
            this.f9570e = new z.b(layoutManager);
        }
        return this.f9570e;
    }

    @Override // androidx.recyclerview.widget.e0
    public int[] c(@o0 RecyclerView.LayoutManager layoutManager, @o0 View view) {
        int[] iArr = new int[2];
        if (layoutManager.n()) {
            iArr[0] = n(view, q(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.o()) {
            iArr[1] = n(view, r(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.e0
    public View h(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.o()) {
            return p(layoutManager, r(layoutManager));
        }
        if (layoutManager.n()) {
            return p(layoutManager, q(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.e0
    public int i(RecyclerView.LayoutManager layoutManager, int i5, int i6) {
        int g02;
        View h5;
        int s02;
        int i7;
        PointF a6;
        int i8;
        int i9;
        if (!(layoutManager instanceof RecyclerView.z.b) || (g02 = layoutManager.g0()) == 0 || (h5 = h(layoutManager)) == null || (s02 = layoutManager.s0(h5)) == -1 || (a6 = ((RecyclerView.z.b) layoutManager).a(g02 - 1)) == null) {
            return -1;
        }
        if (layoutManager.n()) {
            i8 = o(layoutManager, q(layoutManager), i5, 0);
            if (a6.x < 0.0f) {
                i8 = -i8;
            }
        } else {
            i8 = 0;
        }
        if (layoutManager.o()) {
            i9 = o(layoutManager, r(layoutManager), 0, i6);
            if (a6.y < 0.0f) {
                i9 = -i9;
            }
        } else {
            i9 = 0;
        }
        if (layoutManager.o()) {
            i8 = i9;
        }
        if (i8 == 0) {
            return -1;
        }
        int i10 = s02 + i8;
        int i11 = i10 >= 0 ? i10 : 0;
        return i11 >= g02 ? i7 : i11;
    }
}
