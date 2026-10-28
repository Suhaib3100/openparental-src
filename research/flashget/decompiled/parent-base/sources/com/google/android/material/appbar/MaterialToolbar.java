package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.l;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.x1;
import com.google.android.material.internal.o;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import s8.a;

/* loaded from: classes6.dex */
public class MaterialToolbar extends Toolbar {
    private static final int Q2 = a.n.Nc;

    @q0
    private Integer N2;
    private boolean O2;
    private boolean P2;

    public MaterialToolbar(@o0 Context context) {
        this(context, null);
    }

    private Pair<Integer, Integer> j1(@q0 TextView textView, @q0 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i4 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i4 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i4 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void k1(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            j jVar = new j();
            jVar.p0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            jVar.a0(context);
            jVar.o0(x1.T(this));
            setBackground(jVar);
        }
    }

    private void n1(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i4 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i5 = measuredWidth2 + i4;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i4, 0), Math.max(i5 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i4 += max;
            i5 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i5 - i4, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i4, view.getTop(), i5, view.getBottom());
    }

    private void o1() {
        if (this.O2 || this.P2) {
            TextView g4 = o.g(this);
            TextView e4 = o.e(this);
            if (g4 == null && e4 == null) {
                return;
            }
            Pair<Integer, Integer> j12 = j1(g4, e4);
            if (this.O2 && g4 != null) {
                n1(g4, j12);
            }
            if (!this.P2 || e4 == null) {
                return;
            }
            n1(e4, j12);
        }
    }

    @q0
    private Drawable p1(@q0 Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.N2) != null) {
            drawable.setTint(num.intValue());
        }
        return drawable;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void L0(@q0 Drawable drawable) {
        super.L0(p1(drawable));
    }

    public boolean l1() {
        return this.P2;
    }

    public boolean m1() {
        return this.O2;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        o1();
    }

    public void q1(@l int i4) {
        this.N2 = Integer.valueOf(i4);
        Drawable N = N();
        if (N != null) {
            L0(N);
        }
    }

    public void r1(boolean z4) {
        if (this.P2 != z4) {
            this.P2 = z4;
            requestLayout();
        }
    }

    public void s1(boolean z4) {
        if (this.O2 != z4) {
            this.O2 = z4;
            requestLayout();
        }
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f4) {
        super.setElevation(f4);
        k.d(this, f4);
    }

    public MaterialToolbar(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f90574sf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(@androidx.annotation.o0 android.content.Context r8, @androidx.annotation.q0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.Q2
            android.content.Context r8 = a9.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = s8.a.o.Yl
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = s8.a.o.Zl
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L29
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.q1(r10)
        L29:
            int r10 = s8.a.o.bm
            boolean r10 = r9.getBoolean(r10, r6)
            r7.O2 = r10
            int r10 = s8.a.o.am
            boolean r10 = r9.getBoolean(r10, r6)
            r7.P2 = r10
            r9.recycle()
            r7.k1(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
