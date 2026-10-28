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
import androidx.core.view.i0;
import androidx.core.view.y1;
import n1.a;

@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class FlowLayout extends ViewGroup {

    /* renamed from: o, reason: collision with root package name */
    private int f13587o;

    /* renamed from: p, reason: collision with root package name */
    private int f13588p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f13589q;

    /* renamed from: r, reason: collision with root package name */
    private int f13590r;

    public FlowLayout(@o0 Context context) {
        this(context, null);
    }

    private static int c(int i5, int i6, int i7) {
        return i6 != Integer.MIN_VALUE ? i6 != 1073741824 ? i7 : i5 : Math.min(i7, i5);
    }

    private void g(@o0 Context context, @q0 AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a.o.re, 0, 0);
        this.f13587o = obtainStyledAttributes.getDimensionPixelSize(a.o.te, 0);
        this.f13588p = obtainStyledAttributes.getDimensionPixelSize(a.o.se, 0);
        obtainStyledAttributes.recycle();
    }

    protected int a() {
        return this.f13588p;
    }

    protected int b() {
        return this.f13587o;
    }

    protected int d() {
        return this.f13590r;
    }

    public int e(@o0 View view) {
        Object tag = view.getTag(a.h.f29683a4);
        if (tag instanceof Integer) {
            return ((Integer) tag).intValue();
        }
        return -1;
    }

    public boolean f() {
        return this.f13589q;
    }

    protected void h(int i5) {
        this.f13588p = i5;
    }

    protected void i(int i5) {
        this.f13587o = i5;
    }

    public void j(boolean z5) {
        this.f13589q = z5;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        if (getChildCount() == 0) {
            this.f13590r = 0;
            return;
        }
        this.f13590r = 1;
        boolean z6 = y1.Z(this) == 1;
        int paddingRight = z6 ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = z6 ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int i11 = (i7 - i5) - paddingLeft;
        int i12 = paddingRight;
        int i13 = paddingTop;
        for (int i14 = 0; i14 < getChildCount(); i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() == 8) {
                childAt.setTag(a.h.f29683a4, -1);
            } else {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i10 = i0.c(marginLayoutParams);
                    i9 = i0.b(marginLayoutParams);
                } else {
                    i9 = 0;
                    i10 = 0;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i12 + i10;
                if (!this.f13589q && measuredWidth > i11) {
                    i13 = this.f13587o + paddingTop;
                    this.f13590r++;
                    i12 = paddingRight;
                }
                childAt.setTag(a.h.f29683a4, Integer.valueOf(this.f13590r - 1));
                int i15 = i12 + i10;
                int measuredWidth2 = childAt.getMeasuredWidth() + i15;
                int measuredHeight = childAt.getMeasuredHeight() + i13;
                if (z6) {
                    childAt.layout(i11 - measuredWidth2, i13, (i11 - i12) - i10, measuredHeight);
                } else {
                    childAt.layout(i15, i13, measuredWidth2, measuredHeight);
                }
                i12 += childAt.getMeasuredWidth() + i10 + i9 + this.f13588p;
                paddingTop = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int size = View.MeasureSpec.getSize(i5);
        int mode = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i6);
        int mode2 = View.MeasureSpec.getMode(i6);
        int i10 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i10 - getPaddingRight();
        int i11 = paddingTop;
        int i12 = 0;
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i5, i6);
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i7 = marginLayoutParams.leftMargin + 0;
                    i8 = marginLayoutParams.rightMargin + 0;
                } else {
                    i7 = 0;
                    i8 = 0;
                }
                int i14 = paddingLeft;
                if (childAt.getMeasuredWidth() + paddingLeft + i7 <= paddingRight || f()) {
                    i9 = i14;
                } else {
                    i9 = getPaddingLeft();
                    i11 = this.f13587o + paddingTop;
                }
                int measuredWidth = childAt.getMeasuredWidth() + i9 + i7;
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                if (measuredWidth > i12) {
                    i12 = measuredWidth;
                }
                int measuredWidth2 = childAt.getMeasuredWidth() + i7 + i8 + this.f13588p + i9;
                if (i13 == getChildCount() - 1) {
                    i12 += i8;
                }
                paddingLeft = measuredWidth2;
                paddingTop = measuredHeight;
            }
        }
        setMeasuredDimension(c(size, mode, getPaddingRight() + i12), c(size2, mode2, getPaddingBottom() + paddingTop));
    }

    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        this.f13589q = false;
        g(context, attributeSet);
    }

    @TargetApi(21)
    public FlowLayout(@o0 Context context, @q0 AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.f13589q = false;
        g(context, attributeSet);
    }
}
