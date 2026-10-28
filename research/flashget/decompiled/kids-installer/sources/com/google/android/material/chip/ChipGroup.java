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
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.internal.FlowLayout;
import java.util.ArrayList;
import java.util.List;
import n1.a;

/* loaded from: classes3.dex */
public class ChipGroup extends FlowLayout {
    private static final int B = a.n.lb;
    private boolean A;

    /* renamed from: s, reason: collision with root package name */
    @r
    private int f13213s;

    /* renamed from: t, reason: collision with root package name */
    @r
    private int f13214t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13215u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13216v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private c f13217w;

    /* renamed from: x, reason: collision with root package name */
    private final b f13218x;

    /* renamed from: y, reason: collision with root package name */
    @o0
    private d f13219y;

    /* renamed from: z, reason: collision with root package name */
    @d0
    private int f13220z;

    /* loaded from: classes2.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i5, int i6) {
            super(i5, i6);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* loaded from: classes2.dex */
    private class b implements CompoundButton.OnCheckedChangeListener {
        private b() {
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(@o0 CompoundButton compoundButton, boolean z5) {
            if (ChipGroup.this.A) {
                return;
            }
            if (ChipGroup.this.v().isEmpty() && ChipGroup.this.f13216v) {
                ChipGroup.this.E(compoundButton.getId(), true);
                ChipGroup.this.D(compoundButton.getId(), false);
                return;
            }
            int id = compoundButton.getId();
            if (!z5) {
                if (ChipGroup.this.f13220z == id) {
                    ChipGroup.r(ChipGroup.this, -1);
                }
            } else {
                if (ChipGroup.this.f13220z != -1 && ChipGroup.this.f13220z != id && ChipGroup.this.f13215u) {
                    ChipGroup chipGroup = ChipGroup.this;
                    chipGroup.E(chipGroup.f13220z, false);
                }
                ChipGroup.r(ChipGroup.this, id);
            }
        }
    }

    /* loaded from: classes2.dex */
    public interface c {
        void a(ChipGroup chipGroup, @d0 int i5);
    }

    /* loaded from: classes2.dex */
    private class d implements ViewGroup.OnHierarchyChangeListener {

        /* renamed from: o, reason: collision with root package name */
        private ViewGroup.OnHierarchyChangeListener f13222o;

        private d() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(y1.D());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).s(chip.getId());
                }
                chip.y1(ChipGroup.this.f13218x);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13222o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).y1(null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.f13222o;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private void C(int i5) {
        D(i5, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(int i5, boolean z5) {
        this.f13220z = i5;
        c cVar = this.f13217w;
        if (cVar != null && this.f13215u && z5) {
            cVar.a(this, i5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E(@d0 int i5, boolean z5) {
        View findViewById = findViewById(i5);
        if (findViewById instanceof Chip) {
            this.A = true;
            ((Chip) findViewById).setChecked(z5);
            this.A = false;
        }
    }

    static void r(ChipGroup chipGroup, int i5) {
        chipGroup.D(i5, true);
    }

    private int w() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) instanceof Chip) {
                i5++;
            }
        }
        return i5;
    }

    public boolean A() {
        return this.f13216v;
    }

    public boolean B() {
        return this.f13215u;
    }

    public void F(@r int i5) {
        G(i5);
        J(i5);
    }

    public void G(@r int i5) {
        if (this.f13213s != i5) {
            this.f13213s = i5;
            h(i5);
            requestLayout();
        }
    }

    public void H(@q int i5) {
        G(getResources().getDimensionPixelOffset(i5));
    }

    public void I(@q int i5) {
        F(getResources().getDimensionPixelOffset(i5));
    }

    public void J(@r int i5) {
        if (this.f13214t != i5) {
            this.f13214t = i5;
            i(i5);
            requestLayout();
        }
    }

    public void K(@q int i5) {
        J(getResources().getDimensionPixelOffset(i5));
    }

    @Deprecated
    public void L(Drawable drawable) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("⛌"));
    }

    @Deprecated
    public void M(@q0 Drawable drawable) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("⛍"));
    }

    @Deprecated
    public void N(int i5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("⛎"));
    }

    public void O(c cVar) {
        this.f13217w = cVar;
    }

    public void P(boolean z5) {
        this.f13216v = z5;
    }

    @Deprecated
    public void Q(int i5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("⛏"));
    }

    @Deprecated
    public void R(int i5) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("⛐"));
    }

    public void S(@h int i5) {
        j(getResources().getBoolean(i5));
    }

    public void T(@h int i5) {
        U(getResources().getBoolean(i5));
    }

    public void U(boolean z5) {
        if (this.f13215u != z5) {
            this.f13215u = z5;
            t();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i6 = this.f13220z;
                if (i6 != -1 && this.f13215u) {
                    E(i6, false);
                }
                D(chip.getId(), true);
            }
        }
        super.addView(view, i5, layoutParams);
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
    public void j(boolean z5) {
        super.j(z5);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.f13220z;
        if (i5 != -1) {
            E(i5, true);
            D(this.f13220z, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g0.X1(accessibilityNodeInfo).Y0(g0.b.f(d(), f() ? w() : -1, false, B() ? 1 : 2));
    }

    public void s(@d0 int i5) {
        int i6 = this.f13220z;
        if (i5 == i6) {
            return;
        }
        if (i6 != -1 && this.f13215u) {
            E(i6, false);
        }
        if (i5 != -1) {
            E(i5, true);
        }
        D(i5, true);
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f13219y.f13222o = onHierarchyChangeListener;
    }

    public void t() {
        this.A = true;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if (childAt instanceof Chip) {
                ((Chip) childAt).setChecked(false);
            }
        }
        this.A = false;
        D(-1, true);
    }

    @d0
    public int u() {
        if (this.f13215u) {
            return this.f13220z;
        }
        return -1;
    }

    @o0
    public List<Integer> v() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            View childAt = getChildAt(i5);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.f13215u) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    @r
    public int x() {
        return this.f13213s;
    }

    @r
    public int y() {
        return this.f13214t;
    }

    int z(@q0 View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) instanceof Chip) {
                if (((Chip) getChildAt(i6)) == view) {
                    return i5;
                }
                i5++;
            }
        }
        return -1;
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.c.K1);
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
            int r4 = com.google.android.material.chip.ChipGroup.B
            android.content.Context r8 = v1.a.c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>()
            r7.f13218x = r8
            com.google.android.material.chip.ChipGroup$d r8 = new com.google.android.material.chip.ChipGroup$d
            r8.<init>()
            r7.f13219y = r8
            r8 = -1
            r7.f13220z = r8
            r6 = 0
            r7.A = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = n1.a.o.a6
            int[] r5 = new int[r6]
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r10 = n1.a.o.c6
            int r10 = r9.getDimensionPixelOffset(r10, r6)
            int r0 = n1.a.o.d6
            int r0 = r9.getDimensionPixelOffset(r0, r10)
            r7.G(r0)
            int r0 = n1.a.o.e6
            int r10 = r9.getDimensionPixelOffset(r0, r10)
            r7.J(r10)
            int r10 = n1.a.o.g6
            boolean r10 = r9.getBoolean(r10, r6)
            r7.j(r10)
            int r10 = n1.a.o.h6
            boolean r10 = r9.getBoolean(r10, r6)
            r7.U(r10)
            int r10 = n1.a.o.f6
            boolean r10 = r9.getBoolean(r10, r6)
            r7.P(r10)
            int r10 = n1.a.o.b6
            int r10 = r9.getResourceId(r10, r8)
            if (r10 == r8) goto L69
            r7.f13220z = r10
        L69:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$d r8 = r7.f13219y
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            androidx.core.view.y1.R1(r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
