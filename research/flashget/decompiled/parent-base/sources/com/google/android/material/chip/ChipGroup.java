package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import androidx.annotation.d0;
import androidx.annotation.h;
import androidx.annotation.o0;
import androidx.annotation.q;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import s8.a;

/* loaded from: classes6.dex */
public class ChipGroup extends FlowLayout {

    /* renamed from: o, reason: collision with root package name */
    private static final int f52969o = a.n.f91372lb;

    /* renamed from: f, reason: collision with root package name */
    @r
    private int f52970f;

    /* renamed from: g, reason: collision with root package name */
    @r
    private int f52971g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f52972h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f52973i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private c f52974j;

    /* renamed from: k, reason: collision with root package name */
    private final b f52975k;

    /* renamed from: l, reason: collision with root package name */
    @o0
    private d f52976l;

    /* renamed from: m, reason: collision with root package name */
    @d0
    private int f52977m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f52978n;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i4, int i5) {
            super(i4, i5);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(@o0 CompoundButton compoundButton, boolean z4) {
            if (ChipGroup.this.f52978n) {
                return;
            }
            if (ChipGroup.this.v().isEmpty() && ChipGroup.this.f52973i) {
                ChipGroup.this.E(compoundButton.getId(), true);
                ChipGroup.this.D(compoundButton.getId(), false);
                return;
            }
            int id2 = compoundButton.getId();
            if (!z4) {
                if (ChipGroup.this.f52977m == id2) {
                    ChipGroup.r(ChipGroup.this, -1);
                }
            } else {
                if (ChipGroup.this.f52977m != -1 && ChipGroup.this.f52977m != id2 && ChipGroup.this.f52972h) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.E(chipGroup.f52977m, false);
                }
                ChipGroup.r(ChipGroup.this, id2);
            }
        }
    }

    public interface c {
        void a(ChipGroup chipGroup, @d0 int i4);
    }

    private class d implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: b, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f52980b;

        private d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(x1.D());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).s(chip.getId());
                }
                chip.v1(ChipGroup.this.f52975k);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f52980b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).v1(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f52980b;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private void C(int i4) {
        D(i4, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i4, boolean z4) {
        this.f52977m = i4;
        c cVar = this.f52974j;
        if (cVar != null && this.f52972h && z4) {
            cVar.a(this, i4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(@d0 int i4, boolean z4) {
        View findViewById = findViewById(i4);
        if (findViewById instanceof Chip) {
            this.f52978n = true;
            ((Chip) findViewById).setChecked(z4);
            this.f52978n = false;
        }
    }

    static void r(ChipGroup chipGroup, int i4) {
        chipGroup.D(i4, true);
    }

    private int w() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                i4++;
            }
        }
        return i4;
    }

    public boolean A() {
        return this.f52973i;
    }

    public boolean B() {
        return this.f52972h;
    }

    public void F(@r int i4) {
        G(i4);
        J(i4);
    }

    public void G(@r int i4) {
        if (this.f52970f != i4) {
            this.f52970f = i4;
            h(i4);
            requestLayout();
        }
    }

    public void H(@q int i4) {
        G(getResources().getDimensionPixelOffset(i4));
    }

    public void I(@q int i4) {
        F(getResources().getDimensionPixelOffset(i4));
    }

    public void J(@r int i4) {
        if (this.f52971g != i4) {
            this.f52971g = i4;
            i(i4);
            requestLayout();
        }
    }

    public void K(@q int i4) {
        J(getResources().getDimensionPixelOffset(i4));
    }

    @Deprecated
    public void L(Drawable drawable) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf180"));
    }

    @Deprecated
    public void M(@q0 Drawable drawable) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf180"));
    }

    @Deprecated
    public void N(int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf181"));
    }

    public void O(c cVar) {
        this.f52974j = cVar;
    }

    public void P(boolean z4) {
        this.f52973i = z4;
    }

    @Deprecated
    public void Q(int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf182"));
    }

    @Deprecated
    public void R(int i4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("\uf182"));
    }

    public void S(@h int i4) {
        j(getResources().getBoolean(i4));
    }

    public void T(@h int i4) {
        U(getResources().getBoolean(i4));
    }

    public void U(boolean z4) {
        if (this.f52972h != z4) {
            this.f52972h = z4;
            t();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i5 = this.f52977m;
                if (i5 != -1 && this.f52972h) {
                    E(i5, false);
                }
                D(chip.getId(), true);
            }
        }
        super.addView(view, i4, layoutParams);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean f() {
        return super.f();
    }

    @Override // android.view.ViewGroup
    @o0
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @o0
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void j(boolean z4) {
        super.j(z4);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f52977m;
        if (i4 != -1) {
            E(i4, true);
            D(this.f52977m, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h0.r2(accessibilityNodeInfo).l1(h0.f.h(d(), f() ? w() : -1, false, B() ? 1 : 2));
    }

    public void s(@d0 int i4) {
        int i5 = this.f52977m;
        if (i4 == i5) {
            return;
        }
        if (i5 != -1 && this.f52972h) {
            E(i5, false);
        }
        if (i4 != -1) {
            E(i4, true);
        }
        D(i4, true);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f52976l.f52980b = onHierarchyChangeListener;
    }

    public void t() {
        this.f52978n = true;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.f52978n = false;
        D(-1, true);
    }

    @d0
    public int u() {
        if (this.f52972h) {
            return this.f52977m;
        }
        return -1;
    }

    @o0
    public List<Integer> v() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            View childAt = getChildAt(i4);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f52972h) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @r
    public int x() {
        return this.f52970f;
    }

    @r
    public int y() {
        return this.f52971g;
    }

    int z(@q0 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) instanceof Chip) {
                if (((Chip) getChildAt(i5)) == view) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.J1);
    }

    @Override // android.view.ViewGroup
    @o0
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = com.google.android.material.chip.ChipGroup.f52969o
            android.content.Context r8 = a9.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f52975k = r8
            com.google.android.material.chip.ChipGroup$d r8 = new com.google.android.material.chip.ChipGroup$d
            r8.<init>()
            r7.f52976l = r8
            r8 = -1
            r7.f52977m = r8
            r6 = 0
            r7.f52978n = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = s8.a.o.b6
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = s8.a.o.d6
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = s8.a.o.e6
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.G(r0)
            int r0 = s8.a.o.f6
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.J(r10)
            int r10 = s8.a.o.h6
            boolean r10 = r9.getBoolean(r10, r6)
            r7.j(r10)
            int r10 = s8.a.o.i6
            boolean r10 = r9.getBoolean(r10, r6)
            r7.U(r10)
            int r10 = s8.a.o.g6
            boolean r10 = r9.getBoolean(r10, r6)
            r7.P(r10)
            int r10 = s8.a.o.c6
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L69
            r7.f52977m = r10
        L69:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$d r8 = r7.f52976l
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            androidx.core.view.x1.Z1(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
