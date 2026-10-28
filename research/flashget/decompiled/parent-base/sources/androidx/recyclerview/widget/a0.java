package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: PagerSnapHelper.java */
/* loaded from: classes3.dex */
public class a0 extends e0 {

    /* renamed from: g, reason: collision with root package name */
    private static final int f33048g = 100;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private z f33049e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private z f33050f;

    /* compiled from: PagerSnapHelper.java */
    class a extends s {
        a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.s
        protected float calculateSpeedPerPixel(@o0 DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.s
        protected int calculateTimeForScrolling(int i4) {
            return Math.min(100, super.calculateTimeForScrolling(i4));
        }

        @Override // androidx.recyclerview.widget.s, androidx.recyclerview.widget.RecyclerView.z
        protected void onTargetFound(@o0 View view, @o0 RecyclerView.a0 a0Var, @o0 RecyclerView.z.a aVar) {
            a0 a0Var2 = a0.this;
            int[] c5 = a0Var2.c(a0Var2.f33114a.getLayoutManager(), view);
            int i4 = c5[0];
            int i5 = c5[1];
            int calculateTimeForDeceleration = calculateTimeForDeceleration(Math.max(Math.abs(i4), Math.abs(i5)));
            if (calculateTimeForDeceleration > 0) {
                aVar.l(i4, i5, calculateTimeForDeceleration, this.mDecelerateInterpolator);
            }
        }
    }

    private int m(@o0 View view, z zVar) {
        return ((zVar.e(view) / 2) + zVar.g(view)) - ((zVar.o() / 2) + zVar.n());
    }

    @q0
    private View n(RecyclerView.LayoutManager layoutManager, z zVar) {
        int childCount = layoutManager.getChildCount();
        View view = null;
        if (childCount == 0) {
            return null;
        }
        int o4 = (zVar.o() / 2) + zVar.n();
        int i4 = Integer.MAX_VALUE;
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = layoutManager.getChildAt(i5);
            int abs = Math.abs(((zVar.e(childAt) / 2) + zVar.g(childAt)) - o4);
            if (abs < i4) {
                view = childAt;
                i4 = abs;
            }
        }
        return view;
    }

    @o0
    private z o(@o0 RecyclerView.LayoutManager layoutManager) {
        z zVar = this.f33050f;
        if (zVar == null || zVar.f33484a != layoutManager) {
            this.f33050f = z.a(layoutManager);
        }
        return this.f33050f;
    }

    @q0
    private z p(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return q(layoutManager);
        }
        if (layoutManager.canScrollHorizontally()) {
            return o(layoutManager);
        }
        return null;
    }

    @o0
    private z q(@o0 RecyclerView.LayoutManager layoutManager) {
        z zVar = this.f33049e;
        if (zVar == null || zVar.f33484a != layoutManager) {
            this.f33049e = z.c(layoutManager);
        }
        return this.f33049e;
    }

    private boolean r(RecyclerView.LayoutManager layoutManager, int i4, int i5) {
        return layoutManager.canScrollHorizontally() ? i4 > 0 : i5 > 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean s(RecyclerView.LayoutManager layoutManager) {
        PointF computeScrollVectorForPosition;
        int itemCount = layoutManager.getItemCount();
        if (!(layoutManager instanceof RecyclerView.z.b) || (computeScrollVectorForPosition = ((RecyclerView.z.b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return false;
        }
        return computeScrollVectorForPosition.x < 0.0f || computeScrollVectorForPosition.y < 0.0f;
    }

    @Override // androidx.recyclerview.widget.e0
    @q0
    public int[] c(@o0 RecyclerView.LayoutManager layoutManager, @o0 View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = m(view, o(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
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
            return new a(this.f33114a.getContext());
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e0
    @q0
    @SuppressLint({"UnknownNullness"})
    public View h(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return n(layoutManager, q(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return n(layoutManager, o(layoutManager));
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.e0
    @SuppressLint({"UnknownNullness"})
    public int i(RecyclerView.LayoutManager layoutManager, int i4, int i5) {
        z p4;
        int itemCount = layoutManager.getItemCount();
        if (itemCount == 0 || (p4 = p(layoutManager)) == null) {
            return -1;
        }
        int childCount = layoutManager.getChildCount();
        View view = null;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        View view2 = null;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = layoutManager.getChildAt(i10);
            if (childAt != null) {
                int m4 = m(childAt, p4);
                if (m4 <= 0 && m4 > i7) {
                    view2 = childAt;
                    i7 = m4;
                }
                if (m4 >= 0 && m4 < i6) {
                    view = childAt;
                    i6 = m4;
                }
            }
        }
        boolean r4 = r(layoutManager, i4, i5);
        if (r4 && view != null) {
            return layoutManager.getPosition(view);
        }
        if (!r4 && view2 != null) {
            return layoutManager.getPosition(view2);
        }
        if (r4) {
            view = view2;
        }
        if (view == null) {
            return -1;
        }
        int position = layoutManager.getPosition(view) + (s(layoutManager) == r4 ? -1 : 1);
        if (position < 0 || position >= itemCount) {
            return -1;
        }
        return position;
    }
}
