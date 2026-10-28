package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j3;
import androidx.core.view.x1;
import com.google.android.material.badge.BadgeDrawable;
import java.util.List;

/* loaded from: classes6.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: d, reason: collision with root package name */
    final Rect f52598d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f52599e;

    /* renamed from: f, reason: collision with root package name */
    private int f52600f;

    /* renamed from: g, reason: collision with root package name */
    private int f52601g;

    public HeaderScrollingViewBehavior() {
        this.f52598d = new Rect();
        this.f52599e = new Rect();
        this.f52600f = 0;
    }

    private static int V(int i4) {
        return i4 == 0 ? BadgeDrawable.f52614s : i4;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected void K(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i4) {
        View P = P(coordinatorLayout.z(view));
        if (P == null) {
            coordinatorLayout.T(view, i4);
            this.f52600f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f52598d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, P.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((P.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        j3 H = coordinatorLayout.H();
        if (H != null && x1.W(coordinatorLayout) && !view.getFitsSystemWindows()) {
            rect.left = H.p() + rect.left;
            rect.right -= H.q();
        }
        Rect rect2 = this.f52599e;
        Gravity.apply(V(fVar.f25331c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i4);
        int Q = Q(P);
        view.layout(rect2.left, rect2.top - Q, rect2.right, rect2.bottom - Q);
        this.f52600f = rect2.top - P.getBottom();
    }

    @q0
    abstract View P(List<View> list);

    final int Q(View view) {
        if (this.f52601g == 0) {
            return 0;
        }
        float R = R(view);
        int i4 = this.f52601g;
        return e1.a.e((int) (R * i4), 0, i4);
    }

    float R(View view) {
        return 1.0f;
    }

    public final int S() {
        return this.f52601g;
    }

    int T(@o0 View view) {
        return view.getMeasuredHeight();
    }

    final int U() {
        return this.f52600f;
    }

    public final void W(int i4) {
        this.f52601g = i4;
    }

    protected boolean X() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i4, int i5, int i6, int i7) {
        View P;
        j3 H;
        int i10 = view.getLayoutParams().height;
        if ((i10 != -1 && i10 != -2) || (P = P(coordinatorLayout.z(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i6);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (x1.W(P) && (H = coordinatorLayout.H()) != null) {
            size += H.o() + H.r();
        }
        int T = size + T(P);
        int measuredHeight = P.getMeasuredHeight();
        if (X()) {
            view.setTranslationY(-measuredHeight);
        } else {
            T -= measuredHeight;
        }
        coordinatorLayout.U(view, i4, i5, View.MeasureSpec.makeMeasureSpec(T, i10 == -1 ? 1073741824 : Integer.MIN_VALUE), i7);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52598d = new Rect();
        this.f52599e = new Rect();
        this.f52600f = 0;
    }
}
