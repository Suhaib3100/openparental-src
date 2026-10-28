package com.google.android.material.navigation;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.r;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import androidx.core.content.d;
import androidx.core.util.v;
import androidx.core.view.accessibility.h0;
import androidx.core.view.x1;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import androidx.transition.x;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.l;
import d.a;
import java.util.HashSet;

/* compiled from: NavigationBarMenuView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public abstract class c extends ViewGroup implements p {

    /* renamed from: u, reason: collision with root package name */
    private static final long f53596u = 115;

    /* renamed from: v, reason: collision with root package name */
    private static final int f53597v = 5;

    /* renamed from: w, reason: collision with root package name */
    private static final int[] f53598w = {R.attr.state_checked};

    /* renamed from: x, reason: collision with root package name */
    private static final int[] f53599x = {-16842910};

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final TransitionSet f53600b;

    /* renamed from: c, reason: collision with root package name */
    @o0
    private final View.OnClickListener f53601c;

    /* renamed from: d, reason: collision with root package name */
    private final v.a<com.google.android.material.navigation.a> f53602d;

    /* renamed from: e, reason: collision with root package name */
    @o0
    private final SparseArray<View.OnTouchListener> f53603e;

    /* renamed from: f, reason: collision with root package name */
    private int f53604f;

    /* renamed from: g, reason: collision with root package name */
    @q0
    private com.google.android.material.navigation.a[] f53605g;

    /* renamed from: h, reason: collision with root package name */
    private int f53606h;

    /* renamed from: i, reason: collision with root package name */
    private int f53607i;

    /* renamed from: j, reason: collision with root package name */
    @q0
    private ColorStateList f53608j;

    /* renamed from: k, reason: collision with root package name */
    @r
    private int f53609k;

    /* renamed from: l, reason: collision with root package name */
    private ColorStateList f53610l;

    /* renamed from: m, reason: collision with root package name */
    @q0
    private final ColorStateList f53611m;

    /* renamed from: n, reason: collision with root package name */
    @h1
    private int f53612n;

    /* renamed from: o, reason: collision with root package name */
    @h1
    private int f53613o;

    /* renamed from: p, reason: collision with root package name */
    private Drawable f53614p;

    /* renamed from: q, reason: collision with root package name */
    private int f53615q;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private SparseArray<BadgeDrawable> f53616r;

    /* renamed from: s, reason: collision with root package name */
    private NavigationBarPresenter f53617s;

    /* renamed from: t, reason: collision with root package name */
    private h f53618t;

    /* compiled from: NavigationBarMenuView.java */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            k g4 = ((com.google.android.material.navigation.a) view).g();
            if (c.this.f53618t.P(g4, c.this.f53617s, 0)) {
                return;
            }
            g4.setChecked(true);
        }
    }

    public c(@o0 Context context) {
        super(context);
        this.f53602d = new v.c(5);
        this.f53603e = new SparseArray<>(5);
        this.f53606h = 0;
        this.f53607i = 0;
        this.f53616r = new SparseArray<>(5);
        this.f53611m = f(R.attr.textColorSecondary);
        AutoTransition autoTransition = new AutoTransition();
        this.f53600b = autoTransition;
        autoTransition.d1(0);
        autoTransition.A0(f53596u);
        autoTransition.C0(new androidx.interpolator.view.animation.b());
        autoTransition.Q0(new l());
        this.f53601c = new a();
        x1.Z1(this, 1);
    }

    private void A() {
        HashSet hashSet = new HashSet();
        for (int i4 = 0; i4 < this.f53618t.size(); i4++) {
            hashSet.add(Integer.valueOf(this.f53618t.getItem(i4).getItemId()));
        }
        for (int i5 = 0; i5 < this.f53616r.size(); i5++) {
            int keyAt = this.f53616r.keyAt(i5);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.f53616r.delete(keyAt);
            }
        }
    }

    private void C(@o0 com.google.android.material.navigation.a aVar) {
        BadgeDrawable badgeDrawable;
        int id2 = aVar.getId();
        if (y(id2) && (badgeDrawable = this.f53616r.get(id2)) != null) {
            aVar.t(badgeDrawable);
        }
    }

    private void P(int i4) {
        if (y(i4)) {
            return;
        }
        throw new IllegalArgumentException(i4 + ProtectedSandApp.s("\uf158"));
    }

    private com.google.android.material.navigation.a t() {
        com.google.android.material.navigation.a acquire = this.f53602d.acquire();
        return acquire == null ? g(getContext()) : acquire;
    }

    private boolean y(int i4) {
        return i4 != -1;
    }

    void B(SparseArray<BadgeDrawable> sparseArray) {
        this.f53616r = sparseArray;
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.t(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void D(@q0 ColorStateList colorStateList) {
        this.f53608j = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.v(colorStateList);
            }
        }
    }

    public void E(@q0 Drawable drawable) {
        this.f53614p = drawable;
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.x(drawable);
            }
        }
    }

    public void F(int i4) {
        this.f53615q = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.w(i4);
            }
        }
    }

    public void G(@r int i4) {
        this.f53609k = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.u(i4);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void H(int i4, @q0 View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f53603e.remove(i4);
        } else {
            this.f53603e.put(i4, onTouchListener);
        }
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar.g().getItemId() == i4) {
                    aVar.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void I(@h1 int i4) {
        this.f53613o = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.B(i4);
                ColorStateList colorStateList = this.f53610l;
                if (colorStateList != null) {
                    aVar.D(colorStateList);
                }
            }
        }
    }

    public void J(@h1 int i4) {
        this.f53612n = i4;
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.C(i4);
                ColorStateList colorStateList = this.f53610l;
                if (colorStateList != null) {
                    aVar.D(colorStateList);
                }
            }
        }
    }

    public void K(@q0 ColorStateList colorStateList) {
        this.f53610l = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.D(colorStateList);
            }
        }
    }

    public void L(int i4) {
        this.f53604f = i4;
    }

    public void M(@o0 NavigationBarPresenter navigationBarPresenter) {
        this.f53617s = navigationBarPresenter;
    }

    void N(int i4) {
        int size = this.f53618t.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = this.f53618t.getItem(i5);
            if (i4 == item.getItemId()) {
                this.f53606h = i4;
                this.f53607i = i5;
                item.setChecked(true);
                return;
            }
        }
    }

    public void O() {
        h hVar = this.f53618t;
        if (hVar == null || this.f53605g == null) {
            return;
        }
        int size = hVar.size();
        if (size != this.f53605g.length) {
            e();
            return;
        }
        int i4 = this.f53606h;
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = this.f53618t.getItem(i5);
            if (item.isChecked()) {
                this.f53606h = item.getItemId();
                this.f53607i = i5;
            }
        }
        if (i4 != this.f53606h) {
            x.b(this, this.f53600b);
        }
        boolean x4 = x(this.f53604f, this.f53618t.H().size());
        for (int i6 = 0; i6 < size; i6++) {
            this.f53617s.o(true);
            this.f53605g[i6].z(this.f53604f);
            this.f53605g[i6].A(x4);
            this.f53605g[i6].e((k) this.f53618t.getItem(i6), 0);
            this.f53617s.o(false);
        }
    }

    @Override // androidx.appcompat.view.menu.p
    public void a(@o0 h hVar) {
        this.f53618t = hVar;
    }

    @Override // androidx.appcompat.view.menu.p
    public int d() {
        return 0;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void e() {
        removeAllViews();
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f53602d.release(aVar);
                    aVar.s();
                }
            }
        }
        if (this.f53618t.size() == 0) {
            this.f53606h = 0;
            this.f53607i = 0;
            this.f53605g = null;
            return;
        }
        A();
        this.f53605g = new com.google.android.material.navigation.a[this.f53618t.size()];
        boolean x4 = x(this.f53604f, this.f53618t.H().size());
        for (int i4 = 0; i4 < this.f53618t.size(); i4++) {
            this.f53617s.o(true);
            this.f53618t.getItem(i4).setCheckable(true);
            this.f53617s.o(false);
            com.google.android.material.navigation.a t4 = t();
            this.f53605g[i4] = t4;
            t4.v(this.f53608j);
            t4.u(this.f53609k);
            t4.D(this.f53611m);
            t4.C(this.f53612n);
            t4.B(this.f53613o);
            t4.D(this.f53610l);
            Drawable drawable = this.f53614p;
            if (drawable != null) {
                t4.x(drawable);
            } else {
                t4.w(this.f53615q);
            }
            t4.A(x4);
            t4.z(this.f53604f);
            k kVar = (k) this.f53618t.getItem(i4);
            t4.e(kVar, 0);
            t4.y(i4);
            int itemId = kVar.getItemId();
            t4.setOnTouchListener(this.f53603e.get(itemId));
            t4.setOnClickListener(this.f53601c);
            int i5 = this.f53606h;
            if (i5 != 0 && itemId == i5) {
                this.f53607i = i4;
            }
            C(t4);
            addView(t4);
        }
        int min = Math.min(this.f53618t.size() - 1, this.f53607i);
        this.f53607i = min;
        this.f53618t.getItem(min).setChecked(true);
    }

    @q0
    public ColorStateList f(int i4) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i4, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = d.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.b.J0, typedValue, true)) {
            return null;
        }
        int i5 = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = f53599x;
        return new ColorStateList(new int[][]{iArr, f53598w, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i5, defaultColor});
    }

    @o0
    protected abstract com.google.android.material.navigation.a g(@o0 Context context);

    @q0
    public com.google.android.material.navigation.a h(int i4) {
        P(i4);
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        if (aVarArr == null) {
            return null;
        }
        for (com.google.android.material.navigation.a aVar : aVarArr) {
            if (aVar.getId() == i4) {
                return aVar;
            }
        }
        return null;
    }

    @q0
    public BadgeDrawable i(int i4) {
        return this.f53616r.get(i4);
    }

    SparseArray<BadgeDrawable> j() {
        return this.f53616r;
    }

    @q0
    public ColorStateList k() {
        return this.f53608j;
    }

    @q0
    public Drawable l() {
        com.google.android.material.navigation.a[] aVarArr = this.f53605g;
        return (aVarArr == null || aVarArr.length <= 0) ? this.f53614p : aVarArr[0].getBackground();
    }

    @Deprecated
    public int m() {
        return this.f53615q;
    }

    @r
    public int n() {
        return this.f53609k;
    }

    @h1
    public int o() {
        return this.f53613o;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        h0.r2(accessibilityNodeInfo).l1(h0.f.h(1, this.f53618t.H().size(), false, 1));
    }

    @h1
    public int p() {
        return this.f53612n;
    }

    @q0
    public ColorStateList q() {
        return this.f53610l;
    }

    public int r() {
        return this.f53604f;
    }

    @q0
    protected h s() {
        return this.f53618t;
    }

    BadgeDrawable u(int i4) {
        P(i4);
        BadgeDrawable badgeDrawable = this.f53616r.get(i4);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.d(getContext());
            this.f53616r.put(i4, badgeDrawable);
        }
        com.google.android.material.navigation.a h4 = h(i4);
        if (h4 != null) {
            h4.t(badgeDrawable);
        }
        return badgeDrawable;
    }

    public int v() {
        return this.f53606h;
    }

    protected int w() {
        return this.f53607i;
    }

    protected boolean x(int i4, int i5) {
        if (i4 == -1) {
            if (i5 <= 3) {
                return false;
            }
        } else if (i4 != 0) {
            return false;
        }
        return true;
    }

    void z(int i4) {
        P(i4);
        BadgeDrawable badgeDrawable = this.f53616r.get(i4);
        com.google.android.material.navigation.a h4 = h(i4);
        if (h4 != null) {
            h4.s();
        }
        if (badgeDrawable != null) {
            this.f53616r.remove(i4);
        }
    }
}
