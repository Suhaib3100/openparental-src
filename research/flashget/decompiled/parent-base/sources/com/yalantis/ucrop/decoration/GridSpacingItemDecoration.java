package com.yalantis.ucrop.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public class GridSpacingItemDecoration extends RecyclerView.o {
    private final boolean includeEdge;
    private final int spacing;
    private final int spanCount;

    public GridSpacingItemDecoration(int i4, int i5, boolean z4) {
        this.spanCount = i4;
        this.spacing = i5;
        this.includeEdge = z4;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i4 = this.spanCount;
        int i5 = childAdapterPosition % i4;
        if (this.includeEdge) {
            int i6 = this.spacing;
            rect.left = i6 - ((i5 * i6) / i4);
            rect.right = ((i5 + 1) * i6) / i4;
        } else {
            int i7 = this.spacing;
            rect.left = (i5 * i7) / i4;
            rect.right = i7 - (((i5 + 1) * i7) / i4);
        }
        if (childAdapterPosition < i4) {
            rect.top = this.spacing;
        }
        rect.bottom = this.spacing;
    }
}
