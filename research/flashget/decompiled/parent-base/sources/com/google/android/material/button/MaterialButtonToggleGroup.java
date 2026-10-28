package com.google.android.material.button;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.d0;
import androidx.annotation.h;
import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.v;
import com.google.android.material.shape.o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import s8.a;

/* loaded from: classes6.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: l, reason: collision with root package name */
    private static final String f52864l = ProtectedSandApp.s("\uf163");

    /* renamed from: m, reason: collision with root package name */
    private static final int f52865m = a.n.Db;

    /* renamed from: b, reason: collision with root package name */
    private final List<d> f52866b;

    /* renamed from: c, reason: collision with root package name */
    private final c f52867c;

    /* renamed from: d, reason: collision with root package name */
    private final f f52868d;

    /* renamed from: e, reason: collision with root package name */
    private final LinkedHashSet<e> f52869e;

    /* renamed from: f, reason: collision with root package name */
    private final Comparator<MaterialButton> f52870f;

    /* renamed from: g, reason: collision with root package name */
    private Integer[] f52871g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f52872h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f52873i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f52874j;

    /* renamed from: k, reason: collision with root package name */
    @d0
    private int f52875k;

    class a implements Comparator<MaterialButton> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(MaterialButton materialButton, MaterialButton materialButton2) {
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            h0Var.m1(h0.g.j(0, 1, MaterialButtonToggleGroup.this.s(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    private class c implements MaterialButton.b {
        private c() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(@o0 MaterialButton materialButton, boolean z4) {
            if (MaterialButtonToggleGroup.this.f52872h) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f52873i) {
                MaterialButtonToggleGroup.this.f52875k = z4 ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.K(materialButton.getId(), z4)) {
                MaterialButtonToggleGroup.this.n(materialButton.getId(), materialButton.isChecked());
            }
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ c(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    private static class d {

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.android.material.shape.d f52879e = new com.google.android.material.shape.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        com.google.android.material.shape.d f52880a;

        /* renamed from: b, reason: collision with root package name */
        com.google.android.material.shape.d f52881b;

        /* renamed from: c, reason: collision with root package name */
        com.google.android.material.shape.d f52882c;

        /* renamed from: d, reason: collision with root package name */
        com.google.android.material.shape.d f52883d;

        d(com.google.android.material.shape.d dVar, com.google.android.material.shape.d dVar2, com.google.android.material.shape.d dVar3, com.google.android.material.shape.d dVar4) {
            this.f52880a = dVar;
            this.f52881b = dVar3;
            this.f52882c = dVar4;
            this.f52883d = dVar2;
        }

        public static d a(d dVar) {
            com.google.android.material.shape.d dVar2 = f52879e;
            return new d(dVar2, dVar.f52883d, dVar2, dVar.f52882c);
        }

        public static d b(d dVar, View view) {
            return v.j(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            com.google.android.material.shape.d dVar2 = dVar.f52880a;
            com.google.android.material.shape.d dVar3 = dVar.f52883d;
            com.google.android.material.shape.d dVar4 = f52879e;
            return new d(dVar2, dVar3, dVar4, dVar4);
        }

        public static d d(d dVar) {
            com.google.android.material.shape.d dVar2 = f52879e;
            return new d(dVar2, dVar2, dVar.f52881b, dVar.f52882c);
        }

        public static d e(d dVar, View view) {
            return v.j(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            com.google.android.material.shape.d dVar2 = dVar.f52880a;
            com.google.android.material.shape.d dVar3 = f52879e;
            return new d(dVar2, dVar3, dVar.f52881b, dVar3);
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @d0 int i4, boolean z4);
    }

    private class f implements MaterialButton.c {
        private f() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(@o0 MaterialButton materialButton, boolean z4) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@o0 Context context) {
        this(context, null);
    }

    private void A(int i4) {
        if (getChildCount() == 0 || i4 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(i4)).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.setMarginEnd(0);
            layoutParams.setMarginStart(0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void B(int i4) {
        this.f52875k = i4;
        n(i4, true);
    }

    private void C(@d0 int i4, boolean z4) {
        View findViewById = findViewById(i4);
        if (findViewById instanceof MaterialButton) {
            this.f52872h = true;
            ((MaterialButton) findViewById).setChecked(z4);
            this.f52872h = false;
        }
    }

    private void D(@o0 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(x1.D());
        }
    }

    private void H(@o0 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.E(true);
        materialButton.f(this.f52867c);
        materialButton.S(this.f52868d);
        materialButton.V(true);
    }

    private static void J(o.b bVar, @q0 d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(dVar.f52880a).y(dVar.f52883d).Q(dVar.f52881b).D(dVar.f52882c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K(int i4, boolean z4) {
        List<Integer> p4 = p();
        if (this.f52874j && p4.isEmpty()) {
            C(i4, true);
            this.f52875k = i4;
            return false;
        }
        if (z4 && this.f52873i) {
            p4.remove(Integer.valueOf(i4));
            Iterator<Integer> it = p4.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                C(intValue, false);
                n(intValue, false);
            }
        }
        return true;
    }

    private void L() {
        TreeMap treeMap = new TreeMap(this.f52870f);
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            treeMap.put((MaterialButton) getChildAt(i4), Integer.valueOf(i4));
        }
        this.f52871g = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void h() {
        int r4 = r();
        if (r4 == -1) {
            return;
        }
        for (int i4 = r4 + 1; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            int min = Math.min(materialButton.t(), ((MaterialButton) getChildAt(i4 - 1)).t());
            LinearLayout.LayoutParams i5 = i(materialButton);
            if (getOrientation() == 0) {
                i5.setMarginEnd(0);
                i5.setMarginStart(-min);
                i5.topMargin = 0;
            } else {
                i5.bottomMargin = 0;
                i5.topMargin = -min;
                i5.setMarginStart(0);
            }
            materialButton.setLayoutParams(i5);
        }
        A(r4);
    }

    @o0
    private LinearLayout.LayoutParams i(@o0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void k(int i4, boolean z4) {
        MaterialButton materialButton = (MaterialButton) findViewById(i4);
        if (materialButton != null) {
            materialButton.setChecked(z4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@d0 int i4, boolean z4) {
        Iterator<e> it = this.f52869e.iterator();
        while (it.hasNext()) {
            it.next().a(this, i4, z4);
        }
    }

    private MaterialButton q(int i4) {
        return (MaterialButton) getChildAt(i4);
    }

    private int r() {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            if (w(i4)) {
                return i4;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s(@q0 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if (getChildAt(i5) == view) {
                return i4;
            }
            if ((getChildAt(i5) instanceof MaterialButton) && w(i5)) {
                i4++;
            }
        }
        return -1;
    }

    private int t() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (w(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    @q0
    private d u(int i4, int i5, int i6) {
        d dVar = this.f52866b.get(i4);
        if (i5 == i6) {
            return dVar;
        }
        boolean z4 = getOrientation() == 0;
        if (i4 == i5) {
            return z4 ? d.e(dVar, this) : d.f(dVar);
        }
        if (i4 == i6) {
            return z4 ? d.b(dVar, this) : d.a(dVar);
        }
        return null;
    }

    private int v() {
        int i4 = 0;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            if ((getChildAt(i5) instanceof MaterialButton) && w(i5)) {
                i4++;
            }
        }
        return i4;
    }

    private boolean w(int i4) {
        return getChildAt(i4).getVisibility() != 8;
    }

    public void E(boolean z4) {
        this.f52874j = z4;
    }

    public void F(@h int i4) {
        G(getResources().getBoolean(i4));
    }

    public void G(boolean z4) {
        if (this.f52873i != z4) {
            this.f52873i = z4;
            l();
        }
    }

    public void I(@d0 int i4) {
        k(i4, false);
    }

    @m1
    void M() {
        int childCount = getChildCount();
        int r4 = r();
        int t4 = t();
        for (int i4 = 0; i4 < childCount; i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            if (materialButton.getVisibility() != 8) {
                o.b v4 = materialButton.e().v();
                J(v4, u(i4, r4, t4));
                materialButton.d(v4.m());
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i4, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i4, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            D(materialButton);
            H(materialButton);
            if (materialButton.isChecked()) {
                K(materialButton.getId(), true);
                B(materialButton.getId());
            }
            o e4 = materialButton.e();
            this.f52866b.add(new d(e4.r(), e4.j(), e4.t(), e4.l()));
            x1.H1(materialButton, new b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@o0 Canvas canvas) {
        L();
        super.dispatchDraw(canvas);
    }

    public void g(@o0 e eVar) {
        this.f52869e.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @o0
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i4, int i5) {
        Integer[] numArr = this.f52871g;
        return (numArr == null || i5 >= numArr.length) ? i5 : numArr[i5].intValue();
    }

    public void j(@d0 int i4) {
        if (i4 == this.f52875k) {
            return;
        }
        k(i4, true);
    }

    public void l() {
        this.f52872h = true;
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            materialButton.setChecked(false);
            n(materialButton.getId(), false);
        }
        this.f52872h = false;
        B(-1);
    }

    public void m() {
        this.f52869e.clear();
    }

    @d0
    public int o() {
        if (this.f52873i) {
            return this.f52875k;
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i4 = this.f52875k;
        if (i4 != -1) {
            k(i4, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h0.r2(accessibilityNodeInfo).l1(h0.f.h(1, v(), false, y() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i4, int i5) {
        M();
        h();
        super.onMeasure(i4, i5);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.C(this.f52867c);
            materialButton.S(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f52866b.remove(indexOfChild);
        }
        M();
        h();
    }

    @o0
    public List<Integer> p() {
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            MaterialButton materialButton = (MaterialButton) getChildAt(i4);
            if (materialButton.isChecked()) {
                arrayList.add(Integer.valueOf(materialButton.getId()));
            }
        }
        return arrayList;
    }

    public boolean x() {
        return this.f52874j;
    }

    public boolean y() {
        return this.f52873i;
    }

    public void z(@o0 e eVar) {
        this.f52869e.remove(eVar);
    }

    public MaterialButtonToggleGroup(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.f90617w9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(@androidx.annotation.o0 android.content.Context r7, @androidx.annotation.q0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f52865m
            android.content.Context r7 = a9.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f52866b = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f52867c = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f52868d = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f52869e = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f52870f = r7
            r7 = 0
            r6.f52872h = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = s8.a.o.Rk
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = s8.a.o.Uk
            boolean r9 = r8.getBoolean(r9, r7)
            r6.G(r9)
            int r9 = s8.a.o.Sk
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f52875k = r9
            int r9 = s8.a.o.Tk
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f52874j = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.x1.Z1(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
