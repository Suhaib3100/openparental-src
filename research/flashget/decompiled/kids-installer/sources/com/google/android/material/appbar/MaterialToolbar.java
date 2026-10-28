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
import androidx.core.graphics.drawable.d;
import androidx.core.view.y1;
import com.google.android.material.internal.o;
import com.google.android.material.shape.j;
import com.google.android.material.shape.k;
import n1.a;

/* loaded from: classes3.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: k0, reason: collision with root package name */
    private static final int f12889k0 = a.n.Nc;

    /* renamed from: h0, reason: collision with root package name */
    @q0
    private Integer f12890h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f12891i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f12892j0;

    public MaterialToolbar(@o0 Context context) {
        this(context, null);
    }

    private Pair<Integer, Integer> d1(@q0 TextView textView, @q0 TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i5 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i5 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i5 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    private void e1(Context context) {
        Drawable background = getBackground();
        if (background == null || (background instanceof ColorDrawable)) {
            j jVar = new j();
            jVar.p0(ColorStateList.valueOf(background != null ? ((ColorDrawable) background).getColor() : 0));
            jVar.a0(context);
            jVar.o0(y1.R(this));
            y1.I1(this, jVar);
        }
    }

    private void h1(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i5 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i6 = measuredWidth2 + i5;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i5, 0), Math.max(i6 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i5 += max;
            i6 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i6 - i5, androidx.constraintlayout.solver.widgets.analyzer.b.f2366g), view.getMeasuredHeightAndState());
        }
        view.layout(i5, view.getTop(), i6, view.getBottom());
    }

    private void i1() {
        if (this.f12891i0 || this.f12892j0) {
            TextView g5 = o.g(this);
            TextView e6 = o.e(this);
            if (g5 == null && e6 == null) {
                return;
            }
            Pair<Integer, Integer> d12 = d1(g5, e6);
            if (this.f12891i0 && g5 != null) {
                h1(g5, d12);
            }
            if (!this.f12892j0 || e6 == null) {
                return;
            }
            h1(e6, d12);
        }
    }

    @q0
    private Drawable j1(@q0 Drawable drawable) {
        Integer num;
        if (drawable != null && (num = this.f12890h0) != null) {
            d.n(drawable, num.intValue());
        }
        return drawable;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void G0(@q0 Drawable drawable) {
        super.G0(j1(drawable));
    }

    public boolean f1() {
        return this.f12892j0;
    }

    public boolean g1() {
        return this.f12891i0;
    }

    public void k1(@l int i5) {
        this.f12890h0 = Integer.valueOf(i5);
        Drawable L = L();
        if (L != null) {
            G0(L);
        }
    }

    public void l1(boolean z5) {
        if (this.f12892j0 != z5) {
            this.f12892j0 = z5;
            requestLayout();
        }
    }

    public void m1(boolean z5) {
        if (this.f12891i0 != z5) {
            this.f12891i0 = z5;
            requestLayout();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        k.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z5, int i5, int i6, int i7, int i8) {
        super.onLayout(z5, i5, i6, i7, i8);
        i1();
    }

    @Override // android.view.View
    @x0(21)
    public void setElevation(float f6) {
        super.setElevation(f6);
        k.d(this, f6);
    }

    public MaterialToolbar(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.tf);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(@androidx.annotation.o0 android.content.Context r8, @androidx.annotation.q0 android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f12889k0
            android.content.Context r8 = v1.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = n1.a.o.Fk
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = n1.a.o.Gk
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L29
            r0 = -1
            int r10 = r9.getColor(r10, r0)
            r7.k1(r10)
        L29:
            int r10 = n1.a.o.Ik
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f12891i0 = r10
            int r10 = n1.a.o.Hk
            boolean r10 = r9.getBoolean(r10, r6)
            r7.f12892j0 = r10
            r9.recycle()
            r7.e1(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
