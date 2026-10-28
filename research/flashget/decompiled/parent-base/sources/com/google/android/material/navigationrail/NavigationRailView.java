package com.google.android.material.navigationrail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.c1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.widget.t0;
import com.google.android.material.internal.n;
import com.google.android.material.navigation.NavigationBarView;
import s8.a;

/* loaded from: classes6.dex */
public class NavigationRailView extends NavigationBarView {

    /* renamed from: p, reason: collision with root package name */
    static final int f53620p = 49;

    /* renamed from: q, reason: collision with root package name */
    static final int f53621q = 7;

    /* renamed from: r, reason: collision with root package name */
    private static final int f53622r = 49;

    /* renamed from: n, reason: collision with root package name */
    private final int f53623n;

    /* renamed from: o, reason: collision with root package name */
    @q0
    private View f53624o;

    public NavigationRailView(@o0 Context context) {
        this(context, null);
    }

    private b R() {
        return (b) s();
    }

    private boolean S() {
        View view = this.f53624o;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private int T(int i4) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i4) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i4;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i4), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
    }

    public void M(@j0 int i4) {
        N(LayoutInflater.from(getContext()).inflate(i4, (ViewGroup) this, false));
    }

    public void N(@o0 View view) {
        U();
        this.f53624o = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.f53623n;
        addView(view, 0, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.android.material.navigation.NavigationBarView
    @c1({c1.a.LIBRARY_GROUP})
    @o0
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public b e(@o0 Context context) {
        return new b(context);
    }

    @q0
    public View P() {
        return this.f53624o;
    }

    public int Q() {
        return ((b) s()).Q();
    }

    public void U() {
        View view = this.f53624o;
        if (view != null) {
            removeView(view);
            this.f53624o = null;
        }
    }

    public void V(int i4) {
        ((b) s()).W(i4);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        b bVar = (b) s();
        int i10 = 0;
        if (S()) {
            int bottom = this.f53624o.getBottom() + this.f53623n;
            int top2 = bVar.getTop();
            if (top2 < bottom) {
                i10 = bottom - top2;
            }
        } else if (bVar.R()) {
            i10 = this.f53623n;
        }
        if (i10 > 0) {
            bVar.layout(bVar.getLeft(), bVar.getTop() + i10, bVar.getRight(), bVar.getBottom() + i10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        int T = T(i4);
        super.onMeasure(T, i5);
        if (S()) {
            measureChild((b) s(), T, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.f53624o.getMeasuredHeight()) - this.f53623n, Integer.MIN_VALUE));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int p() {
        return 7;
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Oa);
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet, int i4) {
        this(context, attributeSet, i4, a.n.ac);
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet, int i4, int i5) {
        super(context, attributeSet, i4, i5);
        this.f53623n = getResources().getDimensionPixelSize(a.f.t5);
        t0 k4 = n.k(getContext(), attributeSet, a.o.Mn, i4, i5, new int[0]);
        int u4 = k4.u(a.o.Nn, 0);
        if (u4 != 0) {
            M(u4);
        }
        V(k4.o(a.o.On, 49));
        k4.I();
    }
}
