package com.applandeo.materialcalendarview.extensions;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes3.dex */
public class CalendarViewPager extends ViewPager {

    /* renamed from: r3, reason: collision with root package name */
    private boolean f41889r3;

    public CalendarViewPager(Context context) {
        super(context);
        this.f41889r3 = true;
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f41889r3 && super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    protected void onMeasure(int i4, int i5) {
        int i6 = 0;
        for (int i7 = 0; i7 < getChildCount(); i7++) {
            View childAt = getChildAt(i7);
            childAt.measure(i4, View.MeasureSpec.makeMeasureSpec(0, 0));
            int measuredHeight = childAt.getMeasuredHeight();
            if (measuredHeight > i6) {
                i6 = measuredHeight;
            }
        }
        if (i6 != 0) {
            i5 = View.MeasureSpec.makeMeasureSpec(i6, 1073741824);
        }
        super.onMeasure(i4, i5);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return this.f41889r3 && super.onTouchEvent(motionEvent);
    }

    public void p0(boolean z4) {
        this.f41889r3 = z4;
    }

    public CalendarViewPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41889r3 = true;
    }
}
