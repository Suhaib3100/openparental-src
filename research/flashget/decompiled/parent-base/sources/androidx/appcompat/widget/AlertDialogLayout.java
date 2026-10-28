package androidx.appcompat.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.c1;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.core.view.x1;
import d.a;

@androidx.annotation.c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@androidx.annotation.q0 Context context) {
        super(context);
    }

    private void R(View view, int i4, int i5, int i6, int i7) {
        view.layout(i4, i5, i6 + i4, i7 + i5);
    }

    private static int b0(View view) {
        int h02 = x1.h0(view);
        if (h02 > 0) {
            return h02;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return b0(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean c0(int i4, int i5) {
        int i6;
        int i7;
        int i10;
        int i11;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == a.g.f73279v0) {
                    view = childAt;
                } else if (id2 == a.g.f73268q) {
                    view2 = childAt;
                } else {
                    if ((id2 != a.g.f73276u && id2 != a.g.f73280w) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i5);
        int size = View.MeasureSpec.getSize(i5);
        int mode2 = View.MeasureSpec.getMode(i4);
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (view != null) {
            view.measure(i4, 0);
            paddingBottom += view.getMeasuredHeight();
            i6 = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            i6 = 0;
        }
        if (view2 != null) {
            view2.measure(i4, 0);
            i7 = b0(view2);
            i10 = view2.getMeasuredHeight() - i7;
            paddingBottom += i7;
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        } else {
            i7 = 0;
            i10 = 0;
        }
        if (view3 != null) {
            view3.measure(i4, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingBottom), mode));
            i11 = view3.getMeasuredHeight();
            paddingBottom += i11;
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        } else {
            i11 = 0;
        }
        int i13 = size - paddingBottom;
        if (view2 != null) {
            int i14 = paddingBottom - i7;
            int min = Math.min(i13, i10);
            if (min > 0) {
                i13 -= min;
                i7 += min;
            }
            view2.measure(i4, View.MeasureSpec.makeMeasureSpec(i7, 1073741824));
            paddingBottom = i14 + view2.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i4, View.MeasureSpec.makeMeasureSpec(i11 + i13, mode));
            paddingBottom = (paddingBottom - i11) + view3.getMeasuredHeight();
            i6 = View.combineMeasuredStates(i6, view3.getMeasuredState());
        }
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt2 = getChildAt(i16);
            if (childAt2.getVisibility() != 8) {
                i15 = Math.max(i15, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + getPaddingLeft() + i15, i4, i6), View.resolveSizeAndState(paddingBottom, i5, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        p(childCount, i5);
        return true;
    }

    private void p(int i4, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i6 = 0; i6 < i4; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.LayoutParams layoutParams = (LinearLayoutCompat.LayoutParams) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) layoutParams).width == -1) {
                    int i7 = ((LinearLayout.LayoutParams) layoutParams).height;
                    ((LinearLayout.LayoutParams) layoutParams).height = childAt.getMeasuredHeight();
                    measureChildWithMargins(childAt, makeMeasureSpec, 0, i5, 0);
                    ((LinearLayout.LayoutParams) layoutParams).height = i7;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r18, int r19, int r20, int r21, int r22) {
        /*
            r17 = this;
            r6 = r17
            int r7 = r17.getPaddingLeft()
            int r0 = r21 - r19
            int r1 = r17.getPaddingRight()
            int r8 = r0 - r1
            int r0 = r0 - r7
            int r1 = r17.getPaddingRight()
            int r9 = r0 - r1
            int r0 = r17.getMeasuredHeight()
            int r10 = r17.getChildCount()
            int r1 = r17.y()
            r2 = r1 & 112(0x70, float:1.57E-43)
            r3 = 8388615(0x800007, float:1.1754953E-38)
            r11 = r1 & r3
            r1 = 16
            r12 = 2
            if (r2 == r1) goto L41
            r1 = 80
            if (r2 == r1) goto L36
            int r0 = r17.getPaddingTop()
            goto L4b
        L36:
            int r1 = r17.getPaddingTop()
            int r1 = r1 + r22
            int r1 = r1 - r20
            int r0 = r1 - r0
            goto L4b
        L41:
            int r1 = r17.getPaddingTop()
            int r2 = r22 - r20
            int r2 = r2 - r0
            int r2 = r2 / r12
            int r0 = r2 + r1
        L4b:
            android.graphics.drawable.Drawable r1 = r17.v()
            r2 = 0
            if (r1 != 0) goto L54
            r13 = r2
            goto L59
        L54:
            int r1 = r1.getIntrinsicHeight()
            r13 = r1
        L59:
            r14 = r2
        L5a:
            if (r14 >= r10) goto Lc0
            android.view.View r1 = r6.getChildAt(r14)
            if (r1 == 0) goto Lbc
            int r2 = r1.getVisibility()
            r3 = 8
            if (r2 == r3) goto Lbc
            int r4 = r1.getMeasuredWidth()
            int r15 = r1.getMeasuredHeight()
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            r5 = r2
            androidx.appcompat.widget.LinearLayoutCompat$LayoutParams r5 = (androidx.appcompat.widget.LinearLayoutCompat.LayoutParams) r5
            int r2 = r5.gravity
            if (r2 >= 0) goto L7e
            r2 = r11
        L7e:
            int r3 = androidx.core.view.x1.c0(r17)
            int r2 = android.view.Gravity.getAbsoluteGravity(r2, r3)
            r2 = r2 & 7
            r3 = 1
            if (r2 == r3) goto L98
            r3 = 5
            if (r2 == r3) goto L92
            int r2 = r5.leftMargin
            int r2 = r2 + r7
            goto La2
        L92:
            int r2 = r8 - r4
            int r3 = r5.rightMargin
        L96:
            int r2 = r2 - r3
            goto La2
        L98:
            int r2 = androidx.appcompat.widget.a.a(r9, r4, r12, r7)
            int r3 = r5.leftMargin
            int r2 = r2 + r3
            int r3 = r5.rightMargin
            goto L96
        La2:
            boolean r3 = r6.G(r14)
            if (r3 == 0) goto La9
            int r0 = r0 + r13
        La9:
            int r3 = r5.topMargin
            int r16 = r0 + r3
            r0 = r17
            r3 = r16
            r12 = r5
            r5 = r15
            r0.R(r1, r2, r3, r4, r5)
            int r0 = r12.bottomMargin
            int r15 = r15 + r0
            int r15 = r15 + r16
            r0 = r15
        Lbc:
            int r14 = r14 + 1
            r12 = 2
            goto L5a
        Lc0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AlertDialogLayout.onLayout(boolean, int, int, int, int):void");
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i4, int i5) {
        if (c0(i4, i5)) {
            return;
        }
        super.onMeasure(i4, i5);
    }

    public AlertDialogLayout(@androidx.annotation.q0 Context context, @androidx.annotation.q0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
