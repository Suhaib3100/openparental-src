package com.jcodecraeer.xrecyclerview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.VelocityTracker;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.OverScroller;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.b1;
import androidx.core.view.x1;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes6.dex */
public class StickyScrollLinearLayout extends LinearLayout implements b1 {

    /* renamed from: j, reason: collision with root package name */
    private static final String f64860j = ProtectedSandApp.s("ᑶ\u0001");

    /* renamed from: b, reason: collision with root package name */
    private View f64861b;

    /* renamed from: c, reason: collision with root package name */
    private View f64862c;

    /* renamed from: d, reason: collision with root package name */
    private View f64863d;

    /* renamed from: e, reason: collision with root package name */
    private OverScroller f64864e;

    /* renamed from: f, reason: collision with root package name */
    private VelocityTracker f64865f;

    /* renamed from: g, reason: collision with root package name */
    private int f64866g;

    /* renamed from: h, reason: collision with root package name */
    private RecyclerView.LayoutManager f64867h;

    /* renamed from: i, reason: collision with root package name */
    private int f64868i;

    public interface a {
        View a();

        View b();

        View c();
    }

    public StickyScrollLinearLayout(Context context) {
        super(context);
        this.f64867h = null;
        this.f64868i = 1;
        e(context);
    }

    private void d() {
        View view = this.f64861b;
        if (view == null) {
            return;
        }
        this.f64866g = view.getMeasuredHeight();
    }

    private void e(Context context) {
        setOrientation(1);
        this.f64864e = new OverScroller(context);
    }

    @Deprecated
    private void f() {
        if (this.f64865f == null) {
            this.f64865f = VelocityTracker.obtain();
        }
    }

    private void i() {
        this.f64863d.getLayoutParams().height = getMeasuredHeight() - this.f64862c.getMeasuredHeight();
        setMeasuredDimension(getMeasuredWidth(), this.f64863d.getMeasuredHeight() + this.f64862c.getMeasuredHeight() + this.f64861b.getMeasuredHeight());
    }

    public void a() {
        VelocityTracker velocityTracker = this.f64865f;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f64865f = null;
        }
    }

    public void b(int i4) {
        this.f64864e.fling(0, getScrollY(), 0, i4, 0, 0, 0, this.f64866g);
        invalidate();
    }

    public View c() {
        return this.f64863d;
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f64864e.computeScrollOffset()) {
            scrollTo(0, this.f64864e.getCurrY());
            invalidate();
        }
    }

    public void g(@o0 a aVar) {
        if (aVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("ᑴ\u0001"));
        }
        View c5 = aVar.c();
        this.f64861b = c5;
        if (c5 != null) {
            d();
        }
        this.f64862c = aVar.b();
        View a5 = aVar.a();
        this.f64863d = a5;
        if (a5 == null) {
            return;
        }
        i();
        requestLayout();
    }

    @Override // android.view.ViewGroup, androidx.core.view.b1
    public int getNestedScrollAxes() {
        return 0;
    }

    public void h(int i4) {
        this.f64868i = i4;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        super.onMeasure(i4, i5);
        if (this.f64862c == null || this.f64861b == null || this.f64863d == null) {
            return;
        }
        i();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedFling(View view, float f4, float f5, boolean z4) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onNestedPreFling(View view, float f4, float f5) {
        if (getScrollY() >= this.f64866g) {
            return false;
        }
        b((int) f5);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedPreScroll(View view, int i4, int i5, int[] iArr) {
        int findFirstCompletelyVisibleItemPosition;
        if (!(view instanceof XRecyclerView)) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("ᑵ\u0001"));
        }
        RecyclerView.LayoutManager layoutManager = ((RecyclerView) view).getLayoutManager();
        this.f64867h = layoutManager;
        if (layoutManager instanceof GridLayoutManager) {
            findFirstCompletelyVisibleItemPosition = ((GridLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            int[] iArr2 = new int[((StaggeredGridLayoutManager) layoutManager).h0()];
            ((StaggeredGridLayoutManager) this.f64867h).O(iArr2);
            findFirstCompletelyVisibleItemPosition = iArr2[0];
        } else {
            findFirstCompletelyVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstCompletelyVisibleItemPosition();
        }
        if (findFirstCompletelyVisibleItemPosition < 0) {
            return;
        }
        int scrollY = getScrollY();
        boolean z4 = i5 > 0 && scrollY < this.f64866g;
        if (!z4) {
            z4 = i5 < 0 && scrollY >= 0 && (!x1.j(view, -1) || findFirstCompletelyVisibleItemPosition == this.f64868i);
        }
        if (z4) {
            scrollBy(0, i5);
            iArr[1] = i5;
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScroll(View view, int i4, int i5, int i6, int i7) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onNestedScrollAccepted(View view, View view2, int i4) {
    }

    @Override // android.view.View
    protected void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        d();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public boolean onStartNestedScroll(View view, View view2, int i4) {
        view.toString();
        view2.toString();
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.b1
    public void onStopNestedScroll(View view) {
        view.toString();
    }

    @Override // android.view.View
    public void scrollTo(int i4, int i5) {
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = this.f64866g;
        if (i5 > i6) {
            i5 = i6;
        }
        if (i5 != getScrollY()) {
            super.scrollTo(i4, i5);
        }
    }

    public StickyScrollLinearLayout(Context context, @q0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f64867h = null;
        this.f64868i = 1;
        e(context);
    }
}
