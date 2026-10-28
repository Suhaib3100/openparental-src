package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.core.view.y1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: r, reason: collision with root package name */
    private static final int f925r = 16;

    /* renamed from: o, reason: collision with root package name */
    private boolean f926o;

    /* renamed from: p, reason: collision with root package name */
    private int f927p;

    /* renamed from: q, reason: collision with root package name */
    private int f928q;

    public ButtonBarLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f927p = -1;
        this.f928q = 0;
        int[] iArr = a.n.D3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        y1.z1(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f926o = obtainStyledAttributes.getBoolean(a.n.E3, true);
        obtainStyledAttributes.recycle();
    }

    private int a(int i5) {
        int childCount = getChildCount();
        while (i5 < childCount) {
            if (getChildAt(i5).getVisibility() == 0) {
                return i5;
            }
            i5++;
        }
        return -1;
    }

    private boolean b() {
        return getOrientation() == 1;
    }

    private void d(boolean z5) {
        setOrientation(z5 ? 1 : 0);
        setGravity(z5 ? androidx.core.view.d0.f5465c : 80);
        View findViewById = findViewById(a.h.f21886k1);
        if (findViewById != null) {
            findViewById.setVisibility(z5 ? 8 : 4);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public void c(boolean z5) {
        if (this.f926o != z5) {
            this.f926o = z5;
            if (!z5 && getOrientation() == 1) {
                d(false);
            }
            requestLayout();
        }
    }

    @Override // android.view.View
    public int getMinimumHeight() {
        return Math.max(this.f928q, super.getMinimumHeight());
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        int i7;
        boolean z5;
        int size = View.MeasureSpec.getSize(i5);
        int i8 = 0;
        if (this.f926o) {
            if (size > this.f927p && b()) {
                d(false);
            }
            this.f927p = size;
        }
        if (b() || View.MeasureSpec.getMode(i5) != 1073741824) {
            i7 = i5;
            z5 = false;
        } else {
            i7 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z5 = true;
        }
        super.onMeasure(i7, i6);
        if (this.f926o && !b()) {
            if ((getMeasuredWidthAndState() & y1.f5758t) == 16777216) {
                d(true);
                z5 = true;
            }
        }
        if (z5) {
            super.onMeasure(i5, i6);
        }
        int a6 = a(0);
        if (a6 >= 0) {
            View childAt = getChildAt(a6);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (b()) {
                int a7 = a(a6 + 1);
                i8 = a7 >= 0 ? getChildAt(a7).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i8 = getPaddingBottom() + measuredHeight;
            }
        }
        if (y1.e0(this) != i8) {
            setMinimumHeight(i8);
        }
    }
}
