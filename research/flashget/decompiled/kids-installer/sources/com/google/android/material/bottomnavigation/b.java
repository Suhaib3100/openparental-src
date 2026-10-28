package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.appcompat.view.menu.g;
import androidx.core.view.y1;
import n1.a;

/* compiled from: BottomNavigationMenuView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b extends com.google.android.material.navigation.c {
    private final int L;
    private final int M;
    private final int N;
    private final int O;
    private final int P;
    private boolean Q;
    private int[] R;

    public b(@o0 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.L = resources.getDimensionPixelSize(a.f.V0);
        this.M = resources.getDimensionPixelSize(a.f.W0);
        this.N = resources.getDimensionPixelSize(a.f.P0);
        this.O = resources.getDimensionPixelSize(a.f.Q0);
        this.P = resources.getDimensionPixelSize(a.f.T0);
        this.R = new int[5];
    }

    public boolean Q() {
        return this.Q;
    }

    public void R(boolean z5) {
        this.Q = z5;
    }

    @Override // com.google.android.material.navigation.c
    @o0
    protected com.google.android.material.navigation.a f(@o0 Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        int childCount = getChildCount();
        int i9 = i7 - i5;
        int i10 = i8 - i6;
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                if (y1.Z(this) == 1) {
                    int i13 = i9 - i11;
                    childAt.layout(i13 - childAt.getMeasuredWidth(), 0, i13, i10);
                } else {
                    childAt.layout(i11, 0, childAt.getMeasuredWidth() + i11, i10);
                }
                i11 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        g s5 = s();
        int size = View.MeasureSpec.getSize(i5);
        int size2 = s5.H().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.P, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
        if (x(r(), size2) && Q()) {
            View childAt = getChildAt(w());
            int i7 = this.O;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.N, Integer.MIN_VALUE), makeMeasureSpec);
                i7 = Math.max(i7, childAt.getMeasuredWidth());
            }
            int i8 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min = Math.min(size - (this.M * i8), Math.min(i7, this.N));
            int i9 = size - min;
            int min2 = Math.min(i9 / (i8 == 0 ? 1 : i8), this.L);
            int i10 = i9 - (i8 * min2);
            int i11 = 0;
            while (i11 < childCount) {
                if (getChildAt(i11).getVisibility() != 8) {
                    this.R[i11] = i11 == w() ? min : min2;
                    if (i10 > 0) {
                        int[] iArr = this.R;
                        iArr[i11] = iArr[i11] + 1;
                        i10--;
                    }
                } else {
                    this.R[i11] = 0;
                }
                i11++;
            }
        } else {
            int min3 = Math.min(size / (size2 != 0 ? size2 : 1), this.N);
            int i12 = size - (size2 * min3);
            for (int i13 = 0; i13 < childCount; i13++) {
                if (getChildAt(i13).getVisibility() != 8) {
                    int[] iArr2 = this.R;
                    iArr2[i13] = min3;
                    if (i12 > 0) {
                        iArr2[i13] = min3 + 1;
                        i12--;
                    }
                } else {
                    this.R[i13] = 0;
                }
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.R[i15], androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i14 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i14, View.MeasureSpec.makeMeasureSpec(i14, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), 0), View.resolveSizeAndState(this.P, makeMeasureSpec, 0));
    }
}
