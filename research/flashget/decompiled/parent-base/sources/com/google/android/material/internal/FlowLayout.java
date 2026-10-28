package com.google.android.material.internal;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.x1;
import s8.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    private int f53378b;

    /* renamed from: c, reason: collision with root package name */
    private int f53379c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f53380d;

    /* renamed from: e, reason: collision with root package name */
    private int f53381e;

    public FlowLayout(@o0 Context context) {
        this(context, null);
    }

    private static int c(int i4, int i5, int i6) {
        return i5 != Integer.MIN_VALUE ? i5 != 1073741824 ? i6 : i4 : Math.min(i6, i4);
    }

    private void g(@o0 Context context, @q0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.o.f91729qf, 0, 0);
        this.f53378b = obtainStyledAttributes.getDimensionPixelSize(a.o.f91755sf, 0);
        this.f53379c = obtainStyledAttributes.getDimensionPixelSize(a.o.f91742rf, 0);
        obtainStyledAttributes.recycle();
    }

    protected int a() {
        return this.f53379c;
    }

    protected int b() {
        return this.f53378b;
    }

    protected int d() {
        return this.f53381e;
    }

    public int e(@o0 View view) {
        Object tag = view.getTag(a.h.f90983a4);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean f() {
        return this.f53380d;
    }

    protected void h(int i4) {
        this.f53379c = i4;
    }

    protected void i(int i4) {
        this.f53378b = i4;
    }

    public void j(boolean z4) {
        this.f53380d = z4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int i10;
        int i11;
        if (getChildCount() == 0) {
            this.f53381e = 0;
            return;
        }
        this.f53381e = 1;
        boolean z5 = x1.c0(this) == 1;
        int paddingRight = z5 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z5 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i12 = (i6 - i4) - paddingLeft;
        int i13 = paddingRight;
        int i14 = paddingTop;
        for (int i15 = 0; i15 < getChildCount(); i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(a.h.f90983a4, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i11 = marginLayoutParams.getMarginStart();
                    i10 = marginLayoutParams.getMarginEnd();
                } else {
                    i10 = 0;
                    i11 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i13 + i11;
                if (!this.f53380d && measuredWidth > i12) {
                    i14 = this.f53378b + paddingTop;
                    this.f53381e++;
                    i13 = paddingRight;
                }
                childAt.setTag(a.h.f90983a4, Integer.valueOf(this.f53381e - 1));
                int i16 = i13 + i11;
                int measuredWidth2 = childAt.getMeasuredWidth() + i16;
                int measuredHeight = childAt.getMeasuredHeight() + i14;
                if (z5) {
                    childAt.layout(i12 - measuredWidth2, i14, (i12 - i13) - i11, measuredHeight);
                } else {
                    childAt.layout(i16, i14, measuredWidth2, measuredHeight);
                }
                i13 += childAt.getMeasuredWidth() + i11 + i10 + this.f53379c;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        int i7;
        int i10;
        int size = View.MeasureSpec.getSize(i4);
        int mode = View.MeasureSpec.getMode(i4);
        int size2 = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i5);
        int i11 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i11 - getPaddingRight();
        int i12 = paddingTop;
        int i13 = 0;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i4, i5);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i6 = marginLayoutParams.leftMargin;
                    i7 = marginLayoutParams.rightMargin;
                } else {
                    i6 = 0;
                    i7 = 0;
                }
                int i15 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i6 <= paddingRight || f()) {
                    i10 = i15;
                } else {
                    i10 = getPaddingLeft();
                    i12 = this.f53378b + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i10 + i6;
                int measuredHeight = childAt.getMeasuredHeight() + i12;
                if (measuredWidth > i13) {
                    i13 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i6 + i7 + this.f53379c + i10;
                if (i14 == getChildCount() - 1) {
                    i13 += i7;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(c(size, mode, getPaddingRight() + i13), c(size2, mode2, getPaddingBottom() + paddingTop));
    }

    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        super(context, attributeSet, i4);
        this.f53380d = false;
        g(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f53380d = false;
        g(context, attributeSet);
    }
}
