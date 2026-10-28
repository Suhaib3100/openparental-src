package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.o0;
import com.google.android.material.navigation.c;

/* compiled from: NavigationRailMenuView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class b extends c {
    private final FrameLayout.LayoutParams L;

    public b(@o0 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.L = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
    }

    private int S(int i5, int i6, int i7) {
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i5), i6 / Math.max(1, i7)), 0);
    }

    private int T(View view, int i5, int i6) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i5, i6);
        return view.getMeasuredHeight();
    }

    private int U(int i5, int i6, int i7, View view) {
        S(i5, i6, i7);
        int S = view == null ? S(i5, i6, i7) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt != view) {
                i8 += T(childAt, i5, S);
            }
        }
        return i8;
    }

    private int V(int i5, int i6, int i7) {
        int i8;
        View childAt = getChildAt(w());
        if (childAt != null) {
            i8 = T(childAt, i5, S(i5, i6, i7));
            i6 -= i8;
            i7--;
        } else {
            i8 = 0;
        }
        return i8 + U(i5, i6, i7, childAt);
    }

    int Q() {
        return this.L.gravity;
    }

    boolean R() {
        return (this.L.gravity & 112) == 48;
    }

    void W(int i5) {
        FrameLayout.LayoutParams layoutParams = this.L;
        if (layoutParams.gravity != i5) {
            layoutParams.gravity = i5;
            setLayoutParams(layoutParams);
        }
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
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i10;
                childAt.layout(0, i10, i9, measuredHeight);
                i10 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i5, int i6) {
        int size = View.MeasureSpec.getSize(i6);
        int size2 = s().H().size();
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i5), i5, 0), View.resolveSizeAndState((size2 <= 1 || !x(r(), size2)) ? U(i5, size, size2, null) : V(i5, size, size2), i6, 0));
    }
}
