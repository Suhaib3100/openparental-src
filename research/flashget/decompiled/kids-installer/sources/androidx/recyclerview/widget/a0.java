package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.z;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes3.dex */
public class a0 extends e0 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f9147g = 100;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private z f9148e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private z f9149f;

    /* compiled from: PagerSnapHelper.java */
    class a extends s {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.z
        protected void p(View view, RecyclerView.a0 a0Var, RecyclerView.z.a aVar) {
            a0 a0Var2 = a0.this;
            int[] c6 = a0Var2.c(a0Var2.f9216a.H0(), view);
            int i5 = c6[0];
            int i6 = c6[1];
            int x5 = x(Math.max(Math.abs(i5), Math.abs(i6)));
            if (x5 > 0) {
                aVar.l(i5, i6, x5, this.f9562j);
            }
        }

        @Override // androidx.recyclerview.widget.s
        protected float w(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.s
        protected int y(int i5) {
            return Math.min(100, super.y(i5));
        }
    }

    private int m(@o0 View view, z zVar) {
        return ((zVar.e(view) / 2) + zVar.g(view)) - ((zVar.o() / 2) + zVar.n());
    }

    @q0
    private View n(RecyclerView.LayoutManager layoutManager, z zVar) {
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
    private z o(@o0 RecyclerView.LayoutManager layoutManager) {
        z zVar = this.f9149f;
        if (zVar == null || zVar.f9617a != layoutManager) {
            this.f9149f = new z.a(layoutManager);
        }
        return this.f9149f;
    }

    @q0
    private z p(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.o()) {
            return q(layoutManager);
        }
        if (layoutManager.n()) {
            return o(layoutManager);
        }
        return null;
    }

    @o0
    private z q(@o0 RecyclerView.LayoutManager layoutManager) {
        z zVar = this.f9148e;
        if (zVar == null || zVar.f9617a != layoutManager) {
            this.f9148e = new z.b(layoutManager);
        }
        return this.f9148e;
    }

    private boolean r(RecyclerView.LayoutManager layoutManager, int i5, int i6) {
        return layoutManager.n() ? i5 > 0 : i6 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean s(RecyclerView.LayoutManager layoutManager) {
        PointF a6;
        int g02 = layoutManager.g0();
        if (!(layoutManager instanceof RecyclerView.z.b) || (a6 = ((RecyclerView.z.b) layoutManager).a(g02 - 1)) == null) {
            return false;
        }
        return a6.x < 0.0f || a6.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.e0
    @q0
    public int[] c(@o0 RecyclerView.LayoutManager layoutManager, @o0 View view) {
        int[] iArr = new int[2];
        if (layoutManager.n()) {
            iArr[0] = m(view, o(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.o()) {
            iArr[1] = m(view, q(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.e0
    @q0
    protected RecyclerView.z e(@o0 RecyclerView.LayoutManager layoutManager) {
        if (layoutManager instanceof RecyclerView.z.b) {
            return new a(this.f9216a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e0
    @q0
    public View h(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.o()) {
            return n(layoutManager, q(layoutManager));
        }
        if (layoutManager.n()) {
            return n(layoutManager, o(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e0
    public int i(RecyclerView.LayoutManager layoutManager, int i5, int i6) {
        z p5;
        int g02 = layoutManager.g0();
        if (g02 == 0 || (p5 = p(layoutManager)) == null) {
            return -1;
        }
        int Q = layoutManager.Q();
        View view = null;
        int i7 = Integer.MAX_VALUE;
        int i8 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i9 = 0; i9 < Q; i9++) {
            View P = layoutManager.P(i9);
            if (P != null) {
                int m5 = m(P, p5);
                if (m5 <= 0 && m5 > i8) {
                    view2 = P;
                    i8 = m5;
                }
                if (m5 >= 0 && m5 < i7) {
                    view = P;
                    i7 = m5;
                }
            }
        }
        boolean r5 = r(layoutManager, i5, i6);
        if (r5 && view != null) {
            return layoutManager.s0(view);
        }
        if (!r5 && view2 != null) {
            return layoutManager.s0(view2);
        }
        if (r5) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int s02 = layoutManager.s0(view) + (s(layoutManager) == r5 ? -1 : 1);
        if (s02 < 0 || s02 >= g02) {
            return -1;
        }
        return s02;
    }
}
