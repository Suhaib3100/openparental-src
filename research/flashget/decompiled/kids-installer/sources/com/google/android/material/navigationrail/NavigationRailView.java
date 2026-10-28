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
import androidx.appcompat.widget.z0;
import com.google.android.material.internal.n;
import com.google.android.material.navigation.NavigationBarView;
import n1.a;

/* loaded from: classes3.dex */
public class NavigationRailView extends NavigationBarView {
    static final int C = 49;
    static final int D = 7;
    private static final int E = 49;
    private final int A;

    @q0
    private View B;

    public NavigationRailView(@o0 Context context) {
        this(context, null);
    }

    private b R() {
        return (b) s();
    }

    private boolean S() {
        View view = this.B;
        return (view == null || view.getVisibility() == 8) ? false : true;
    }

    private int T(int i5) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i5) == 1073741824 || suggestedMinimumWidth <= 0) {
            return i5;
        }
        return View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i5), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), androidx.constraintlayout.solver.widgets.analyzer.b.f2366g);
    }

    public void M(@j0 int i5) {
        N(LayoutInflater.from(getContext()).inflate(i5, (ViewGroup) this, false));
    }

    public void N(@o0 View view) {
        U();
        this.B = view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 49;
        layoutParams.topMargin = this.A;
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
        return this.B;
    }

    public int Q() {
        return R().Q();
    }

    public void U() {
        View view = this.B;
        if (view != null) {
            removeView(view);
            this.B = null;
        }
    }

    public void V(int i5) {
        R().W(i5);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        b R = R();
        int i9 = 0;
        if (S()) {
            int bottom = this.B.getBottom() + this.A;
            int top = R.getTop();
            if (top < bottom) {
                i9 = bottom - top;
            }
        } else if (R.R()) {
            i9 = this.A;
        }
        if (i9 > 0) {
            R.layout(R.getLeft(), R.getTop() + i9, R.getRight(), R.getBottom() + i9);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        int T = T(i5);
        super.onMeasure(T, i6);
        if (S()) {
            measureChild(R(), T, View.MeasureSpec.makeMeasureSpec((getMeasuredHeight() - this.B.getMeasuredHeight()) - this.A, Integer.MIN_VALUE));
        }
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int p() {
        return 7;
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.Pa);
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet, int i5) {
        this(context, attributeSet, i5, a.n.ac);
    }

    public NavigationRailView(@o0 Context context, @q0 AttributeSet attributeSet, int i5, int i6) {
        super(context, attributeSet, i5, i6);
        this.A = getResources().getDimensionPixelSize(a.f.t5);
        z0 k5 = n.k(getContext(), attributeSet, a.o.pm, i5, i6, new int[0]);
        int u5 = k5.u(a.o.qm, 0);
        if (u5 != 0) {
            M(u5);
        }
        V(k5.o(a.o.rm, 49));
        k5.I();
    }
}
