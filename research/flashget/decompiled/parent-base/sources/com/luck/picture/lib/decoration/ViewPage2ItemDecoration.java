package com.luck.picture.lib.decoration;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.o0;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public class ViewPage2ItemDecoration extends RecyclerView.o {
    private final int spacing;
    private final int spanCount;

    public ViewPage2ItemDecoration(int i4, int i5) {
        this.spanCount = i4;
        this.spacing = i5;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void getItemOffsets(Rect rect, @o0 View view, RecyclerView recyclerView, RecyclerView.a0 a0Var) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i4 = this.spanCount;
        int i5 = childAdapterPosition % i4;
        int i6 = this.spacing;
        rect.left = i6 - ((i5 * i6) / i4);
        rect.right = ((i5 + 1) * i6) / i4;
    }
}
