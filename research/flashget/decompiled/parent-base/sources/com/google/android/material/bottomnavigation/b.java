package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.view.menu.h;
import androidx.core.view.x1;
import s8.a;

/* compiled from: BottomNavigationMenuView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class b extends com.google.android.material.navigation.c {
    private final int A;
    private final int B;
    private final int C;
    private boolean D;
    private int[] E;

    /* renamed from: y, reason: collision with root package name */
    private final int f52749y;

    /* renamed from: z, reason: collision with root package name */
    private final int f52750z;

    public b(@o0 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f52749y = resources.getDimensionPixelSize(a.f.V0);
        this.f52750z = resources.getDimensionPixelSize(a.f.W0);
        this.A = resources.getDimensionPixelSize(a.f.P0);
        this.B = resources.getDimensionPixelSize(a.f.Q0);
        this.C = resources.getDimensionPixelSize(a.f.T0);
        this.E = new int[5];
    }

    public boolean Q() {
        return this.D;
    }

    public void R(boolean z4) {
        this.D = z4;
    }

    @Override // com.google.android.material.navigation.c
    @o0
    protected com.google.android.material.navigation.a g(@o0 Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        int childCount = getChildCount();
        int i10 = i6 - i4;
        int i11 = i7 - i5;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                if (x1.c0(this) == 1) {
                    int i14 = i10 - i12;
                    childAt.layout(i14 - childAt.getMeasuredWidth(), 0, i14, i11);
                } else {
                    childAt.layout(i12, 0, childAt.getMeasuredWidth() + i12, i11);
                }
                i12 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        h s4 = s();
        int size = View.MeasureSpec.getSize(i4);
        int size2 = s4.H().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.C, 1073741824);
        if (x(r(), size2) && Q()) {
            View childAt = getChildAt(w());
            int i6 = this.B;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.A, Integer.MIN_VALUE), makeMeasureSpec);
                i6 = Math.max(i6, childAt.getMeasuredWidth());
            }
            int i7 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.f52750z * i7), Math.min(i6, this.A));
            int i10 = size - min;
            int min2 = Math.min(i10 / (i7 == 0 ? 1 : i7), this.f52749y);
            int i11 = i10 - (i7 * min2);
            int i12 = 0;
            while (i12 < childCount) {
                if (getChildAt(i12).getVisibility() != 8) {
                    this.E[i12] = i12 == w() ? min : min2;
                    if (i11 > 0) {
                        int[] iArr = this.E;
                        iArr[i12] = iArr[i12] + 1;
                        i11--;
                    }
                } else {
                    this.E[i12] = 0;
                }
                i12++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), this.A);
            int i13 = size - (size2 * min3);
            for (int i14 = 0; i14 < childCount; i14++) {
                if (getChildAt(i14).getVisibility() != 8) {
                    int[] iArr2 = this.E;
                    iArr2[i14] = min3;
                    if (i13 > 0) {
                        iArr2[i14] = min3 + 1;
                        i13--;
                    }
                } else {
                    this.E[i14] = 0;
                }
            }
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.E[i16], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i15 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i15, View.MeasureSpec.makeMeasureSpec(i15, 1073741824), 0), View.resolveSizeAndState(this.C, makeMeasureSpec, 0));
    }
}
