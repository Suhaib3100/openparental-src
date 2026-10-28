package com.google.android.material.navigationrail;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.o0;
import com.google.android.material.navigation.c;

/* compiled from: NavigationRailMenuView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class b extends c {

    /* renamed from: y, reason: collision with root package name */
    private final FrameLayout.LayoutParams f53625y;

    public b(@o0 Context context) {
        super(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        this.f53625y = layoutParams;
        layoutParams.gravity = 49;
        setLayoutParams(layoutParams);
    }

    private int S(int i4, int i5, int i6) {
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), i5 / Math.max(1, i6)), 0);
    }

    private int T(View view, int i4, int i5) {
        if (view.getVisibility() == 8) {
            return 0;
        }
        view.measure(i4, i5);
        return view.getMeasuredHeight();
    }

    private int U(int i4, int i5, int i6, View view) {
        S(i4, i5, i6);
        int S = view == null ? S(i4, i5, i6) : View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        int childCount = getChildCount();
        int i7 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != view) {
                i7 += T(childAt, i4, S);
            }
        }
        return i7;
    }

    private int V(int i4, int i5, int i6) {
        int i7;
        View childAt = getChildAt(w());
        if (childAt != null) {
            i7 = T(childAt, i4, S(i4, i5, i6));
            i5 -= i7;
            i6--;
        } else {
            i7 = 0;
        }
        return i7 + U(i4, i5, i6, childAt);
    }

    int Q() {
        return this.f53625y.gravity;
    }

    boolean R() {
        return (this.f53625y.gravity & 112) == 48;
    }

    void W(int i4) {
        FrameLayout.LayoutParams layoutParams = this.f53625y;
        if (layoutParams.gravity != i4) {
            layoutParams.gravity = i4;
            setLayoutParams(layoutParams);
        }
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
        int i11 = 0;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i11;
                childAt.layout(0, i11, i10, measuredHeight);
                i11 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i4, int i5) {
        int size = View.MeasureSpec.getSize(i5);
        int size2 = s().H().size();
        setMeasuredDimension(View.resolveSizeAndState(View.MeasureSpec.getSize(i4), i4, 0), View.resolveSizeAndState((size2 <= 1 || !x(r(), size2)) ? U(i4, size, size2, null) : V(i4, size, size2), i5, 0));
    }
}
