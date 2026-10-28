package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes6.dex */
public class BaselineLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    private int f53371b;

    public BaselineLayout(Context context) {
        super(context, null, 0);
        this.f53371b = -1;
    }

    @Override // android.view.View
    public int getBaseline() {
        return this.f53371b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingRight = ((i6 - i4) - getPaddingRight()) - paddingLeft;
        int paddingTop = getPaddingTop();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int a5 = androidx.appcompat.widget.a.a(paddingRight, measuredWidth, 2, paddingLeft);
                int baseline = (this.f53371b == -1 || childAt.getBaseline() == -1) ? paddingTop : (this.f53371b + paddingTop) - childAt.getBaseline();
                childAt.layout(a5, baseline, measuredWidth + a5, measuredHeight + baseline);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i5);
                int baseline = childAt.getBaseline();
                if (baseline != -1) {
                    i11 = Math.max(i11, baseline);
                    i12 = Math.max(i12, childAt.getMeasuredHeight() - baseline);
                }
                i7 = Math.max(i7, childAt.getMeasuredWidth());
                i6 = Math.max(i6, childAt.getMeasuredHeight());
                i10 = View.combineMeasuredStates(i10, childAt.getMeasuredState());
            }
        }
        if (i11 != -1) {
            i6 = Math.max(i6, Math.max(i12, getPaddingBottom()) + i11);
            this.f53371b = i11;
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i7, getSuggestedMinimumWidth()), i4, i10), View.resolveSizeAndState(Math.max(i6, getSuggestedMinimumHeight()), i5, i10 << 16));
    }

    public BaselineLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f53371b = -1;
    }

    public BaselineLayout(Context context, AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53371b = -1;
    }
}
