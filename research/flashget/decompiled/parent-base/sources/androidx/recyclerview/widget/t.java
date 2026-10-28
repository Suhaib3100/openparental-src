package androidx.recyclerview.widget;

import android.graphics.PointF;
import android.view.View;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: LinearSnapHelper.java */
/* loaded from: classes3.dex */
public class t extends e0 {

    /* renamed from: g, reason: collision with root package name */
    private static final float f33437g = 1.0f;

    /* renamed from: e, reason: collision with root package name */
    @q0
    private z f33438e;

    /* renamed from: f, reason: collision with root package name */
    @q0
    private z f33439f;

    private float m(RecyclerView.LayoutManager layoutManager, z zVar) {
        int childCount = layoutManager.getChildCount();
        if (childCount == 0) {
            return 1.0f;
        }
        View view = null;
        int i4 = Integer.MIN_VALUE;
        int i5 = Integer.MAX_VALUE;
        View view2 = null;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = layoutManager.getChildAt(i6);
            int position = layoutManager.getPosition(childAt);
            if (position != -1) {
                if (position < i5) {
                    view = childAt;
                    i5 = position;
                }
                if (position > i4) {
                    view2 = childAt;
                    i4 = position;
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
        return (max * 1.0f) / ((i4 - i5) + 1);
    }

    private int n(@o0 View view, z zVar) {
        return ((zVar.e(view) / 2) + zVar.g(view)) - ((zVar.o() / 2) + zVar.n());
    }

    private int o(RecyclerView.LayoutManager layoutManager, z zVar, int i4, int i5) {
        int[] d5 = d(i4, i5);
        float m4 = m(layoutManager, zVar);
        if (m4 <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(d5[0]) > Math.abs(d5[1]) ? d5[0] : d5[1]) / m4);
    }

    @q0
    private View p(RecyclerView.LayoutManager layoutManager, z zVar) {
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
    private z q(@o0 RecyclerView.LayoutManager layoutManager) {
        z zVar = this.f33439f;
        if (zVar == null || zVar.f33484a != layoutManager) {
            this.f33439f = z.a(layoutManager);
        }
        return this.f33439f;
    }

    @o0
    private z r(@o0 RecyclerView.LayoutManager layoutManager) {
        z zVar = this.f33438e;
        if (zVar == null || zVar.f33484a != layoutManager) {
            this.f33438e = z.c(layoutManager);
        }
        return this.f33438e;
    }

    @Override // androidx.recyclerview.widget.e0
    public int[] c(@o0 RecyclerView.LayoutManager layoutManager, @o0 View view) {
        int[] iArr = new int[2];
        if (layoutManager.canScrollHorizontally()) {
            iArr[0] = n(view, q(layoutManager));
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.canScrollVertically()) {
            iArr[1] = n(view, r(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // androidx.recyclerview.widget.e0
    public View h(RecyclerView.LayoutManager layoutManager) {
        if (layoutManager.canScrollVertically()) {
            return p(layoutManager, r(layoutManager));
        }
        if (layoutManager.canScrollHorizontally()) {
            return p(layoutManager, q(layoutManager));
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.recyclerview.widget.e0
    public int i(RecyclerView.LayoutManager layoutManager, int i4, int i5) {
        int itemCount;
        View h4;
        int position;
        int i6;
        PointF computeScrollVectorForPosition;
        int i7;
        int i10;
        if (!(layoutManager instanceof RecyclerView.z.b) || (itemCount = layoutManager.getItemCount()) == 0 || (h4 = h(layoutManager)) == null || (position = layoutManager.getPosition(h4)) == -1 || (computeScrollVectorForPosition = ((RecyclerView.z.b) layoutManager).computeScrollVectorForPosition(itemCount - 1)) == null) {
            return -1;
        }
        if (layoutManager.canScrollHorizontally()) {
            i7 = o(layoutManager, q(layoutManager), i4, 0);
            if (computeScrollVectorForPosition.x < 0.0f) {
                i7 = -i7;
            }
        } else {
            i7 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i10 = o(layoutManager, r(layoutManager), 0, i5);
            if (computeScrollVectorForPosition.y < 0.0f) {
                i10 = -i10;
            }
        } else {
            i10 = 0;
        }
        if (layoutManager.canScrollVertically()) {
            i7 = i10;
        }
        if (i7 == 0) {
            return -1;
        }
        int i11 = position + i7;
        int i12 = i11 >= 0 ? i11 : 0;
        return i12 >= itemCount ? i6 : i12;
    }
}
