package com.lxj.xpopup.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.viewpager.widget.ViewPager;

/* loaded from: classes6.dex */
public class HackyViewPager extends ViewPager {
    public HackyViewPager(@o0 Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        try {
            return super.onInterceptTouchEvent(ev);
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public HackyViewPager(@o0 Context context, @q0 AttributeSet attrs) {
        super(context, attrs);
    }
}
