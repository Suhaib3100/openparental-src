package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.core.view.x1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: e, reason: collision with root package name */
    private static final int f1521e = 16;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1522b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f1523c;

    /* renamed from: d, reason: collision with root package name */
    private int f1524d;

    public ButtonBarLayout(@androidx.annotation.o0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1524d = -1;
        int[] iArr = a.m.f73573q3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr);
        x1.F1(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        this.f1522b = obtainStyledAttributes.getBoolean(a.m.f73578r3, true);
        obtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            d(this.f1522b);
        }
    }

    private int a(int i4) {
        int childCount = getChildCount();
        while (i4 < childCount) {
            if (getChildAt(i4).getVisibility() == 0) {
                return i4;
            }
            i4++;
        }
        return -1;
    }

    private boolean b() {
        return this.f1523c;
    }

    private void d(boolean z4) {
        if (this.f1523c != z4) {
            if (!z4 || this.f1522b) {
                this.f1523c = z4;
                setOrientation(z4 ? 1 : 0);
                setGravity(z4 ? androidx.core.view.f0.f27130c : 80);
                View findViewById = findViewById(a.g.f73253i0);
                if (findViewById != null) {
                    findViewById.setVisibility(z4 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public void c(boolean z4) {
        if (this.f1522b != z4) {
            this.f1522b = z4;
            if (!z4 && this.f1523c) {
                d(false);
            }
            requestLayout();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6;
        boolean z4;
        int size = View.MeasureSpec.getSize(i4);
        int i7 = 0;
        if (this.f1522b) {
            if (size > this.f1524d && this.f1523c) {
                d(false);
            }
            this.f1524d = size;
        }
        if (this.f1523c || View.MeasureSpec.getMode(i4) != 1073741824) {
            i6 = i4;
            z4 = false;
        } else {
            i6 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z4 = true;
        }
        super.onMeasure(i6, i5);
        if (this.f1522b && !this.f1523c && (getMeasuredWidthAndState() & x1.f27484y) == 16777216) {
            d(true);
            z4 = true;
        }
        if (z4) {
            super.onMeasure(i4, i5);
        }
        int a5 = a(0);
        if (a5 >= 0) {
            View childAt = getChildAt(a5);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + getPaddingTop() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (this.f1523c) {
                int a6 = a(a5 + 1);
                i7 = a6 >= 0 ? getChildAt(a6).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f)) + measuredHeight : measuredHeight;
            } else {
                i7 = getPaddingBottom() + measuredHeight;
            }
        }
        if (x1.h0(this) != i7) {
            setMinimumHeight(i7);
            if (i5 == 0) {
                super.onMeasure(i4, i5);
            }
        }
    }
}
