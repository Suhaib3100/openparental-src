package com.scwang.smart.refresh.layout.util;

import android.content.res.Resources;
import android.graphics.PointF;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Interpolator;
import android.webkit.WebView;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.annotation.o0;
import androidx.appcompat.graphics.drawable.d;
import androidx.core.view.b1;
import androidx.core.view.j1;
import androidx.core.view.x0;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.flashget.parentalcontrol.ProtectedSandApp;
import rc.b;

/* compiled from: SmartUtil.java */
/* loaded from: classes6.dex */
public class b implements Interpolator {

    /* renamed from: b, reason: collision with root package name */
    public static int f70701b = 0;

    /* renamed from: c, reason: collision with root package name */
    public static int f70702c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static float f70703d = Resources.getSystem().getDisplayMetrics().density;

    /* renamed from: e, reason: collision with root package name */
    private static final float f70704e = 8.0f;

    /* renamed from: f, reason: collision with root package name */
    private static final float f70705f;

    /* renamed from: g, reason: collision with root package name */
    private static final float f70706g;

    /* renamed from: a, reason: collision with root package name */
    private int f70707a;

    static {
        float k4 = 1.0f / k(1.0f);
        f70705f = k4;
        f70706g = 1.0f - (k4 * k(1.0f));
    }

    public b(int i4) {
        this.f70707a = i4;
    }

    public static boolean a(@o0 View view, PointF pointF, boolean z4) {
        if (view.canScrollVertically(1) && view.getVisibility() == 0) {
            return false;
        }
        if ((view instanceof ViewGroup) && pointF != null && !f(view)) {
            ViewGroup viewGroup = (ViewGroup) view;
            PointF pointF2 = new PointF();
            for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount - 1);
                if (g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                    Object tag = childAt.getTag(b.C1383b.f89834f);
                    if (ProtectedSandApp.s("\u2fe1\u0001").equals(tag) || ProtectedSandApp.s("\u2fe2\u0001").equals(tag)) {
                        return false;
                    }
                    pointF.offset(pointF2.x, pointF2.y);
                    boolean a5 = a(childAt, pointF, z4);
                    pointF.offset(-pointF2.x, -pointF2.y);
                    return a5;
                }
            }
        }
        return z4 || view.canScrollVertically(-1);
    }

    public static boolean b(@o0 View view, PointF pointF) {
        if (view.canScrollVertically(-1) && view.getVisibility() == 0) {
            return false;
        }
        if (!(view instanceof ViewGroup) || pointF == null) {
            return true;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        PointF pointF2 = new PointF();
        for (int childCount = viewGroup.getChildCount(); childCount > 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount - 1);
            if (g(viewGroup, childAt, pointF.x, pointF.y, pointF2)) {
                Object tag = childAt.getTag(b.C1383b.f89834f);
                if (ProtectedSandApp.s("\u2fe1\u0001").equals(tag) || ProtectedSandApp.s("\u2fe3\u0001").equals(tag)) {
                    return false;
                }
                pointF.offset(pointF2.x, pointF2.y);
                boolean b5 = b(childAt, pointF);
                pointF.offset(-pointF2.x, -pointF2.y);
                return b5;
            }
        }
        return true;
    }

    public static int c(float f4) {
        return (int) ((f4 * f70703d) + 0.5f);
    }

    public static void d(View view, int i4) {
        if (view instanceof ScrollView) {
            ((ScrollView) view).fling(i4);
            return;
        }
        if (view instanceof AbsListView) {
            ((AbsListView) view).fling(i4);
            return;
        }
        if (view instanceof WebView) {
            ((WebView) view).flingScroll(0, i4);
        } else if (view instanceof NestedScrollView) {
            ((NestedScrollView) view).n(i4);
        } else if (view instanceof RecyclerView) {
            ((RecyclerView) view).fling(0, i4);
        }
    }

    public static boolean e(View view) {
        if (view instanceof qc.a) {
            return false;
        }
        return f(view) || (view instanceof ViewPager) || (view instanceof b1);
    }

    public static boolean f(View view) {
        if (view instanceof qc.a) {
            return false;
        }
        return (view instanceof AbsListView) || (view instanceof ScrollView) || (view instanceof j1) || (view instanceof WebView) || (view instanceof x0);
    }

    public static boolean g(@o0 View view, @o0 View view2, float f4, float f5, PointF pointF) {
        if (view2.getVisibility() != 0) {
            return false;
        }
        float[] fArr = {f4, f5};
        fArr[0] = (view.getScrollX() - view2.getLeft()) + f4;
        float scrollY = fArr[1] + (view.getScrollY() - view2.getTop());
        fArr[1] = scrollY;
        float f6 = fArr[0];
        boolean z4 = f6 >= 0.0f && scrollY >= 0.0f && f6 < ((float) view2.getWidth()) && fArr[1] < ((float) view2.getHeight());
        if (z4 && pointF != null) {
            pointF.set(fArr[0] - f4, fArr[1] - f5);
        }
        return z4;
    }

    public static int h(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(0, 0, layoutParams.width);
        int i4 = layoutParams.height;
        view.measure(childMeasureSpec, i4 > 0 ? View.MeasureSpec.makeMeasureSpec(i4, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
        return view.getMeasuredHeight();
    }

    public static float i(int i4) {
        return i4 / f70703d;
    }

    public static void j(@o0 AbsListView absListView, int i4) {
        absListView.scrollListBy(i4);
    }

    private static float k(float f4) {
        float f5 = f4 * 8.0f;
        return f5 < 1.0f ? f5 - (1.0f - ((float) Math.exp(-f5))) : d.a(1.0f, (float) Math.exp(1.0f - f5), 0.63212055f, 0.36787945f);
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f4) {
        if (this.f70707a == f70702c) {
            float f5 = 1.0f - f4;
            return 1.0f - (f5 * f5);
        }
        float k4 = f70705f * k(f4);
        return k4 > 0.0f ? k4 + f70706g : k4;
    }
}
