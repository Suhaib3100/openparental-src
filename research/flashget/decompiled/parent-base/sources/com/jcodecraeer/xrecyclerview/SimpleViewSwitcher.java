package com.jcodecraeer.xrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public class SimpleViewSwitcher extends ViewGroup {
    public SimpleViewSwitcher(Context context) {
        super(context);
    }

    public void a(View view) {
        if (getChildCount() != 0) {
            removeViewAt(0);
        }
        addView(view, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                childAt.layout(0, 0, i6 - i4, i7 - i5);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            measureChild(childAt, i4, i5);
            childAt.getMeasuredWidth();
            int measuredWidth = childAt.getMeasuredWidth();
            i6++;
            i10 = childAt.getMeasuredHeight();
            i7 = measuredWidth;
        }
        setMeasuredDimension(i7, i10);
    }

    public SimpleViewSwitcher(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SimpleViewSwitcher(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
    }
}
