package com.google.android.material.appbar;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.d0;
import androidx.core.view.v4;
import androidx.core.view.y1;
import com.google.android.material.badge.BadgeDrawable;
import java.util.List;

/* loaded from: classes3.dex */
abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: d, reason: collision with root package name */
    final Rect f12885d;

    /* renamed from: e, reason: collision with root package name */
    final Rect f12886e;

    /* renamed from: f, reason: collision with root package name */
    private int f12887f;

    /* renamed from: g, reason: collision with root package name */
    private int f12888g;

    public HeaderScrollingViewBehavior() {
        this.f12885d = new Rect();
        this.f12886e = new Rect();
        this.f12887f = 0;
    }

    private static int V(int i5) {
        return i5 == 0 ? BadgeDrawable.F : i5;
    }

    @Override // com.google.android.material.appbar.ViewOffsetBehavior
    protected void K(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i5) {
        View P = P(coordinatorLayout.C(view));
        if (P == null) {
            coordinatorLayout.W(view, i5);
            this.f12887f = 0;
            return;
        }
        CoordinatorLayout.f fVar = (CoordinatorLayout.f) view.getLayoutParams();
        Rect rect = this.f12885d;
        rect.set(coordinatorLayout.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) fVar).leftMargin, P.getBottom() + ((ViewGroup.MarginLayoutParams) fVar).topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - ((ViewGroup.MarginLayoutParams) fVar).rightMargin, ((P.getBottom() + coordinatorLayout.getHeight()) - coordinatorLayout.getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) fVar).bottomMargin);
        v4 K = coordinatorLayout.K();
        if (K != null && y1.U(coordinatorLayout) && !y1.U(view)) {
            rect.left = K.p() + rect.left;
            rect.right -= K.q();
        }
        Rect rect2 = this.f12886e;
        int i6 = fVar.f3929c;
        if (i6 == 0) {
            i6 = BadgeDrawable.F;
        }
        d0.b(i6, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i5);
        int Q = Q(P);
        view.layout(rect2.left, rect2.top - Q, rect2.right, rect2.bottom - Q);
        this.f12887f = rect2.top - P.getBottom();
    }

    @q0
    abstract View P(List<View> list);

    final int Q(View view) {
        if (this.f12888g == 0) {
            return 0;
        }
        float R = R(view);
        int i5 = this.f12888g;
        return o.a.e((int) (R * i5), 0, i5);
    }

    float R(View view) {
        return 1.0f;
    }

    public final int S() {
        return this.f12888g;
    }

    int T(@o0 View view) {
        return view.getMeasuredHeight();
    }

    final int U() {
        return this.f12887f;
    }

    public final void W(int i5) {
        this.f12888g = i5;
    }

    protected boolean X() {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public boolean n(@o0 CoordinatorLayout coordinatorLayout, @o0 View view, int i5, int i6, int i7, int i8) {
        View P;
        v4 K;
        int i9 = view.getLayoutParams().height;
        if ((i9 != -1 && i9 != -2) || (P = P(coordinatorLayout.C(view))) == null) {
            return false;
        }
        int size = View.MeasureSpec.getSize(i7);
        if (size <= 0) {
            size = coordinatorLayout.getHeight();
        } else if (y1.U(P) && (K = coordinatorLayout.K()) != null) {
            size = K.o() + K.r() + size;
        }
        int T = size + T(P);
        int measuredHeight = P.getMeasuredHeight();
        if (X()) {
            view.setTranslationY(-measuredHeight);
        } else {
            T -= measuredHeight;
        }
        coordinatorLayout.X(view, i5, i6, View.MeasureSpec.makeMeasureSpec(T, i9 == -1 ? androidx.constraintlayout.solver.widgets.analyzer.b.f2366g : Integer.MIN_VALUE), i8);
        return true;
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12885d = new Rect();
        this.f12886e = new Rect();
        this.f12887f = 0;
    }
}
