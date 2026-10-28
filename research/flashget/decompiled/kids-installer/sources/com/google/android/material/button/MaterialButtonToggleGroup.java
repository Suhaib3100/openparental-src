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
import androidx.core.view.accessibility.g0;
import androidx.core.view.i0;
import androidx.core.view.y1;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.v;
import com.google.android.material.shape.o;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeMap;
import n1.a;

/* loaded from: classes2.dex */
public class MaterialButtonToggleGroup extends LinearLayout {

    /* renamed from: y, reason: collision with root package name */
    private static final String f13128y = ProtectedSandApp.s("ል");

    /* renamed from: z, reason: collision with root package name */
    private static final int f13129z = a.n.Db;

    /* renamed from: o, reason: collision with root package name */
    private final List<d> f13130o;

    /* renamed from: p, reason: collision with root package name */
    private final c f13131p;

    /* renamed from: q, reason: collision with root package name */
    private final f f13132q;

    /* renamed from: r, reason: collision with root package name */
    private final LinkedHashSet<e> f13133r;

    /* renamed from: s, reason: collision with root package name */
    private final Comparator<MaterialButton> f13134s;

    /* renamed from: t, reason: collision with root package name */
    private Integer[] f13135t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f13136u;

    /* renamed from: v, reason: collision with root package name */
    private boolean f13137v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f13138w;

    /* renamed from: x, reason: collision with root package name */
    @d0
    private int f13139x;

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

    /* loaded from: classes3.dex */
    class b extends androidx.core.view.a {
        b() {
        }

        @Override // androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            g0Var.Z0(g0.c.h(0, 1, MaterialButtonToggleGroup.this.s(view), 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    /* loaded from: classes3.dex */
    private class c implements MaterialButton.b {
        private c() {
        }

        @Override // com.google.android.material.button.MaterialButton.b
        public void a(@o0 MaterialButton materialButton, boolean z5) {
            if (MaterialButtonToggleGroup.this.f13136u) {
                return;
            }
            if (MaterialButtonToggleGroup.this.f13137v) {
                MaterialButtonToggleGroup.this.f13139x = z5 ? materialButton.getId() : -1;
            }
            if (MaterialButtonToggleGroup.this.K(materialButton.getId(), z5)) {
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
        private static final com.google.android.material.shape.d f13143e = new com.google.android.material.shape.a(0.0f);

        /* renamed from: a, reason: collision with root package name */
        com.google.android.material.shape.d f13144a;

        /* renamed from: b, reason: collision with root package name */
        com.google.android.material.shape.d f13145b;

        /* renamed from: c, reason: collision with root package name */
        com.google.android.material.shape.d f13146c;

        /* renamed from: d, reason: collision with root package name */
        com.google.android.material.shape.d f13147d;

        d(com.google.android.material.shape.d dVar, com.google.android.material.shape.d dVar2, com.google.android.material.shape.d dVar3, com.google.android.material.shape.d dVar4) {
            this.f13144a = dVar;
            this.f13145b = dVar3;
            this.f13146c = dVar4;
            this.f13147d = dVar2;
        }

        public static d a(d dVar) {
            com.google.android.material.shape.d dVar2 = f13143e;
            return new d(dVar2, dVar.f13147d, dVar2, dVar.f13146c);
        }

        public static d b(d dVar, View view) {
            return v.j(view) ? c(dVar) : d(dVar);
        }

        public static d c(d dVar) {
            com.google.android.material.shape.d dVar2 = dVar.f13144a;
            com.google.android.material.shape.d dVar3 = dVar.f13147d;
            com.google.android.material.shape.d dVar4 = f13143e;
            return new d(dVar2, dVar3, dVar4, dVar4);
        }

        public static d d(d dVar) {
            com.google.android.material.shape.d dVar2 = f13143e;
            return new d(dVar2, dVar2, dVar.f13145b, dVar.f13146c);
        }

        public static d e(d dVar, View view) {
            return v.j(view) ? d(dVar) : c(dVar);
        }

        public static d f(d dVar) {
            com.google.android.material.shape.d dVar2 = dVar.f13144a;
            com.google.android.material.shape.d dVar3 = f13143e;
            return new d(dVar2, dVar3, dVar.f13145b, dVar3);
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, @d0 int i5, boolean z5);
    }

    /* loaded from: classes3.dex */
    private class f implements MaterialButton.c {
        private f() {
        }

        @Override // com.google.android.material.button.MaterialButton.c
        public void a(@o0 MaterialButton materialButton, boolean z5) {
            MaterialButtonToggleGroup.this.invalidate();
        }

        /* synthetic */ f(MaterialButtonToggleGroup materialButtonToggleGroup, a aVar) {
            this();
        }
    }

    public MaterialButtonToggleGroup(@o0 Context context) {
        this(context, null);
    }

    private void A(int i5) {
        if (getChildCount() == 0 || i5 == -1) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) q(i5).getLayoutParams();
        if (getOrientation() == 1) {
            layoutParams.topMargin = 0;
            layoutParams.bottomMargin = 0;
        } else {
            i0.g(layoutParams, 0);
            i0.h(layoutParams, 0);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
        }
    }

    private void B(int i5) {
        this.f13139x = i5;
        n(i5, true);
    }

    private void C(@d0 int i5, boolean z5) {
        View findViewById = findViewById(i5);
        if (findViewById instanceof MaterialButton) {
            this.f13136u = true;
            ((MaterialButton) findViewById).setChecked(z5);
            this.f13136u = false;
        }
    }

    private void D(@o0 MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            materialButton.setId(y1.D());
        }
    }

    private void H(@o0 MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.L(true);
        materialButton.c(this.f13131p);
        materialButton.Z(this.f13132q);
        materialButton.c0(true);
    }

    private static void J(o.b bVar, @q0 d dVar) {
        if (dVar == null) {
            bVar.o(0.0f);
        } else {
            bVar.L(dVar.f13144a).y(dVar.f13147d).Q(dVar.f13145b).D(dVar.f13146c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K(int i5, boolean z5) {
        List<Integer> p5 = p();
        if (this.f13138w && p5.isEmpty()) {
            C(i5, true);
            this.f13139x = i5;
            return false;
        }
        if (z5 && this.f13137v) {
            p5.remove(Integer.valueOf(i5));
            Iterator<Integer> it = p5.iterator();
            while (it.hasNext()) {
                int intValue = it.next().intValue();
                C(intValue, false);
                n(intValue, false);
            }
        }
        return true;
    }

    private void L() {
        TreeMap treeMap = new TreeMap(this.f13134s);
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            treeMap.put(q(i5), Integer.valueOf(i5));
        }
        this.f13135t = (Integer[]) treeMap.values().toArray(new Integer[0]);
    }

    private void h() {
        int r5 = r();
        if (r5 == -1) {
            return;
        }
        for (int i5 = r5 + 1; i5 < getChildCount(); i5++) {
            MaterialButton q5 = q(i5);
            int min = Math.min(q5.A(), q(i5 - 1).A());
            LinearLayout.LayoutParams i6 = i(q5);
            if (getOrientation() == 0) {
                i0.g(i6, 0);
                i0.h(i6, -min);
                i6.topMargin = 0;
            } else {
                i6.bottomMargin = 0;
                i6.topMargin = -min;
                i0.h(i6, 0);
            }
            q5.setLayoutParams(i6);
        }
        A(r5);
    }

    @o0
    private LinearLayout.LayoutParams i(@o0 View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        return layoutParams instanceof LinearLayout.LayoutParams ? (LinearLayout.LayoutParams) layoutParams : new LinearLayout.LayoutParams(layoutParams.width, layoutParams.height);
    }

    private void k(int i5, boolean z5) {
        MaterialButton materialButton = (MaterialButton) findViewById(i5);
        if (materialButton != null) {
            materialButton.setChecked(z5);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n(@d0 int i5, boolean z5) {
        Iterator<e> it = this.f13133r.iterator();
        while (it.hasNext()) {
            it.next().a(this, i5, z5);
        }
    }

    private MaterialButton q(int i5) {
        return (MaterialButton) getChildAt(i5);
    }

    private int r() {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            if (w(i5)) {
                return i5;
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int s(@q0 View view) {
        if (!(view instanceof MaterialButton)) {
            return -1;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if (getChildAt(i6) == view) {
                return i5;
            }
            if ((getChildAt(i6) instanceof MaterialButton) && w(i6)) {
                i5++;
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
    private d u(int i5, int i6, int i7) {
        d dVar = this.f13130o.get(i5);
        if (i6 == i7) {
            return dVar;
        }
        boolean z5 = getOrientation() == 0;
        if (i5 == i6) {
            return z5 ? d.e(dVar, this) : d.f(dVar);
        }
        if (i5 == i7) {
            return z5 ? d.b(dVar, this) : d.a(dVar);
        }
        return null;
    }

    private int v() {
        int i5 = 0;
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            if ((getChildAt(i6) instanceof MaterialButton) && w(i6)) {
                i5++;
            }
        }
        return i5;
    }

    private boolean w(int i5) {
        return getChildAt(i5).getVisibility() != 8;
    }

    public void E(boolean z5) {
        this.f13138w = z5;
    }

    public void F(@h int i5) {
        G(getResources().getBoolean(i5));
    }

    public void G(boolean z5) {
        if (this.f13137v != z5) {
            this.f13137v = z5;
            l();
        }
    }

    public void I(@d0 int i5) {
        k(i5, false);
    }

    @m1
    void M() {
        int childCount = getChildCount();
        int r5 = r();
        int t5 = t();
        for (int i5 = 0; i5 < childCount; i5++) {
            MaterialButton q5 = q(i5);
            if (q5.getVisibility() != 8) {
                o.b v5 = q5.l().v();
                J(v5, u(i5, r5, t5));
                q5.g(v5.m());
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i5, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof MaterialButton) {
            super.addView(view, i5, layoutParams);
            MaterialButton materialButton = (MaterialButton) view;
            D(materialButton);
            H(materialButton);
            if (materialButton.isChecked()) {
                K(materialButton.getId(), true);
                B(materialButton.getId());
            }
            o l5 = materialButton.l();
            this.f13130o.add(new d(l5.r(), l5.j(), l5.t(), l5.l()));
            y1.B1(materialButton, new b());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@o0 Canvas canvas) {
        L();
        super.dispatchDraw(canvas);
    }

    public void g(@o0 e eVar) {
        this.f13133r.add(eVar);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    @o0
    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i5, int i6) {
        Integer[] numArr = this.f13135t;
        return (numArr == null || i6 >= numArr.length) ? i6 : numArr[i6].intValue();
    }

    public void j(@d0 int i5) {
        if (i5 == this.f13139x) {
            return;
        }
        k(i5, true);
    }

    public void l() {
        this.f13136u = true;
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            MaterialButton q5 = q(i5);
            q5.setChecked(false);
            n(q5.getId(), false);
        }
        this.f13136u = false;
        B(-1);
    }

    public void m() {
        this.f13133r.clear();
    }

    @d0
    public int o() {
        if (this.f13137v) {
            return this.f13139x;
        }
        return -1;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i5 = this.f13139x;
        if (i5 != -1) {
            k(i5, true);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g0.X1(accessibilityNodeInfo).Y0(g0.b.f(1, v(), false, y() ? 1 : 2));
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i5, int i6) {
        M();
        h();
        super.onMeasure(i5, i6);
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.J(this.f13131p);
            materialButton.Z(null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.f13130o.remove(indexOfChild);
        }
        M();
        h();
    }

    @o0
    public List<Integer> p() {
        ArrayList arrayList = new ArrayList();
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            MaterialButton q5 = q(i5);
            if (q5.isChecked()) {
                arrayList.add(Integer.valueOf(q5.getId()));
            }
        }
        return arrayList;
    }

    public boolean x() {
        return this.f13138w;
    }

    public boolean y() {
        return this.f13137v;
    }

    public void z(@o0 e eVar) {
        this.f13133r.remove(eVar);
    }

    public MaterialButtonToggleGroup(@o0 Context context, @q0 AttributeSet attributeSet) {
        this(context, attributeSet, a.c.x9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialButtonToggleGroup(@androidx.annotation.o0 android.content.Context r7, @androidx.annotation.q0 android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.button.MaterialButtonToggleGroup.f13129z
            android.content.Context r7 = v1.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.f13130o = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r6, r0)
            r6.f13131p = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r6, r0)
            r6.f13132q = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.f13133r = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.f13134s = r7
            r7 = 0
            r6.f13136u = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = n1.a.o.yj
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.n.j(r0, r1, r2, r3, r4, r5)
            int r9 = n1.a.o.Bj
            boolean r9 = r8.getBoolean(r9, r7)
            r6.G(r9)
            int r9 = n1.a.o.zj
            r0 = -1
            int r9 = r8.getResourceId(r9, r0)
            r6.f13139x = r9
            int r9 = n1.a.o.Aj
            boolean r7 = r8.getBoolean(r9, r7)
            r6.f13138w = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            androidx.core.view.y1.R1(r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
