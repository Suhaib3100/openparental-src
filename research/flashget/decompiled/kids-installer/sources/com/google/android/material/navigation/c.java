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
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.o;
import androidx.core.util.p;
import androidx.core.view.accessibility.g0;
import androidx.core.view.y1;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionSet;
import androidx.transition.z;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.internal.l;
import d.a;
import java.util.HashSet;

/* compiled from: NavigationBarMenuView.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public abstract class c extends ViewGroup implements o {
    private static final long H = 115;
    private static final int I = 5;
    private static final int[] J = {R.attr.state_checked};
    private static final int[] K = {-16842910};

    @h1
    private int A;

    @h1
    private int B;
    private Drawable C;
    private int D;

    @o0
    private SparseArray<BadgeDrawable> E;
    private NavigationBarPresenter F;
    private g G;

    /* renamed from: o, reason: collision with root package name */
    @o0
    private final TransitionSet f13792o;

    /* renamed from: p, reason: collision with root package name */
    @o0
    private final View.OnClickListener f13793p;

    /* renamed from: q, reason: collision with root package name */
    private final p.a<com.google.android.material.navigation.a> f13794q;

    /* renamed from: r, reason: collision with root package name */
    @o0
    private final SparseArray<View.OnTouchListener> f13795r;

    /* renamed from: s, reason: collision with root package name */
    private int f13796s;

    /* renamed from: t, reason: collision with root package name */
    @q0
    private com.google.android.material.navigation.a[] f13797t;

    /* renamed from: u, reason: collision with root package name */
    private int f13798u;

    /* renamed from: v, reason: collision with root package name */
    private int f13799v;

    /* renamed from: w, reason: collision with root package name */
    @q0
    private ColorStateList f13800w;

    /* renamed from: x, reason: collision with root package name */
    @r
    private int f13801x;

    /* renamed from: y, reason: collision with root package name */
    private ColorStateList f13802y;

    /* renamed from: z, reason: collision with root package name */
    @q0
    private final ColorStateList f13803z;

    /* compiled from: NavigationBarMenuView.java */
    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            j d6 = ((com.google.android.material.navigation.a) view).d();
            if (c.this.G.P(d6, c.this.F, 0)) {
                return;
            }
            d6.setChecked(true);
        }
    }

    public c(@o0 Context context) {
        super(context);
        this.f13794q = new p.c(5);
        this.f13795r = new SparseArray<>(5);
        this.f13798u = 0;
        this.f13799v = 0;
        this.E = new SparseArray<>(5);
        this.f13803z = d(R.attr.textColorSecondary);
        AutoTransition autoTransition = new AutoTransition();
        this.f13792o = autoTransition;
        autoTransition.j1(0);
        autoTransition.E0(H);
        autoTransition.G0(new androidx.interpolator.view.animation.b());
        autoTransition.V0(new l());
        this.f13793p = new a();
        y1.R1(this, 1);
    }

    private void A() {
        HashSet hashSet = new HashSet();
        for (int i5 = 0; i5 < this.G.size(); i5++) {
            hashSet.add(Integer.valueOf(this.G.getItem(i5).getItemId()));
        }
        for (int i6 = 0; i6 < this.E.size(); i6++) {
            int keyAt = this.E.keyAt(i6);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.E.delete(keyAt);
            }
        }
    }

    private void C(@o0 com.google.android.material.navigation.a aVar) {
        BadgeDrawable badgeDrawable;
        int id = aVar.getId();
        if (y(id) && (badgeDrawable = this.E.get(id)) != null) {
            aVar.t(badgeDrawable);
        }
    }

    private void P(int i5) {
        if (y(i5)) {
            return;
        }
        throw new IllegalArgumentException(i5 + ProtectedSandApp.s("⚐"));
    }

    private com.google.android.material.navigation.a t() {
        com.google.android.material.navigation.a b6 = this.f13794q.b();
        return b6 == null ? f(getContext()) : b6;
    }

    private boolean y(int i5) {
        return i5 != -1;
    }

    void B(SparseArray<BadgeDrawable> sparseArray) {
        this.E = sparseArray;
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.t(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void D(@q0 ColorStateList colorStateList) {
        this.f13800w = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.v(colorStateList);
            }
        }
    }

    public void E(@q0 Drawable drawable) {
        this.C = drawable;
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.x(drawable);
            }
        }
    }

    public void F(int i5) {
        this.D = i5;
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.w(i5);
            }
        }
    }

    public void G(@r int i5) {
        this.f13801x = i5;
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.u(i5);
            }
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void H(int i5, @q0 View.OnTouchListener onTouchListener) {
        if (onTouchListener == null) {
            this.f13795r.remove(i5);
        } else {
            this.f13795r.put(i5, onTouchListener);
        }
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar.d().getItemId() == i5) {
                    aVar.setOnTouchListener(onTouchListener);
                }
            }
        }
    }

    public void I(@h1 int i5) {
        this.B = i5;
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.B(i5);
                ColorStateList colorStateList = this.f13802y;
                if (colorStateList != null) {
                    aVar.D(colorStateList);
                }
            }
        }
    }

    public void J(@h1 int i5) {
        this.A = i5;
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.C(i5);
                ColorStateList colorStateList = this.f13802y;
                if (colorStateList != null) {
                    aVar.D(colorStateList);
                }
            }
        }
    }

    public void K(@q0 ColorStateList colorStateList) {
        this.f13802y = colorStateList;
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                aVar.D(colorStateList);
            }
        }
    }

    public void L(int i5) {
        this.f13796s = i5;
    }

    public void M(@o0 NavigationBarPresenter navigationBarPresenter) {
        this.F = navigationBarPresenter;
    }

    void N(int i5) {
        int size = this.G.size();
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = this.G.getItem(i6);
            if (i5 == item.getItemId()) {
                this.f13798u = i5;
                this.f13799v = i6;
                item.setChecked(true);
                return;
            }
        }
    }

    public void O() {
        g gVar = this.G;
        if (gVar == null || this.f13797t == null) {
            return;
        }
        int size = gVar.size();
        if (size != this.f13797t.length) {
            c();
            return;
        }
        int i5 = this.f13798u;
        for (int i6 = 0; i6 < size; i6++) {
            MenuItem item = this.G.getItem(i6);
            if (item.isChecked()) {
                this.f13798u = item.getItemId();
                this.f13799v = i6;
            }
        }
        if (i5 != this.f13798u) {
            z.b(this, this.f13792o);
        }
        boolean x5 = x(this.f13796s, this.G.H().size());
        for (int i7 = 0; i7 < size; i7++) {
            this.F.k(true);
            this.f13797t[i7].z(this.f13796s);
            this.f13797t[i7].A(x5);
            this.f13797t[i7].l((j) this.G.getItem(i7), 0);
            this.F.k(false);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void c() {
        removeAllViews();
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr != null) {
            for (com.google.android.material.navigation.a aVar : aVarArr) {
                if (aVar != null) {
                    this.f13794q.a(aVar);
                    aVar.s();
                }
            }
        }
        if (this.G.size() == 0) {
            this.f13798u = 0;
            this.f13799v = 0;
            this.f13797t = null;
            return;
        }
        A();
        this.f13797t = new com.google.android.material.navigation.a[this.G.size()];
        boolean x5 = x(this.f13796s, this.G.H().size());
        for (int i5 = 0; i5 < this.G.size(); i5++) {
            this.F.k(true);
            this.G.getItem(i5).setCheckable(true);
            this.F.k(false);
            com.google.android.material.navigation.a t5 = t();
            this.f13797t[i5] = t5;
            t5.v(this.f13800w);
            t5.u(this.f13801x);
            t5.D(this.f13803z);
            t5.C(this.A);
            t5.B(this.B);
            t5.D(this.f13802y);
            Drawable drawable = this.C;
            if (drawable != null) {
                t5.x(drawable);
            } else {
                t5.w(this.D);
            }
            t5.A(x5);
            t5.z(this.f13796s);
            j jVar = (j) this.G.getItem(i5);
            t5.l(jVar, 0);
            t5.y(i5);
            int itemId = jVar.getItemId();
            t5.setOnTouchListener(this.f13795r.get(itemId));
            t5.setOnClickListener(this.f13793p);
            int i6 = this.f13798u;
            if (i6 != 0 && itemId == i6) {
                this.f13799v = i5;
            }
            C(t5);
            addView(t5);
        }
        int min = Math.min(this.G.size() - 1, this.f13799v);
        this.f13799v = min;
        this.G.getItem(min).setChecked(true);
    }

    @q0
    public ColorStateList d(int i5) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i5, typedValue, true)) {
            return null;
        }
        ColorStateList c6 = androidx.appcompat.content.res.a.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.c.H0, typedValue, true)) {
            return null;
        }
        int i6 = typedValue.data;
        int defaultColor = c6.getDefaultColor();
        int[] iArr = K;
        return new ColorStateList(new int[][]{iArr, J, ViewGroup.EMPTY_STATE_SET}, new int[]{c6.getColorForState(iArr, defaultColor), i6, defaultColor});
    }

    @Override // androidx.appcompat.view.menu.o
    public void e(@o0 g gVar) {
        this.G = gVar;
    }

    @o0
    protected abstract com.google.android.material.navigation.a f(@o0 Context context);

    @q0
    public com.google.android.material.navigation.a g(int i5) {
        P(i5);
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        if (aVarArr == null) {
            return null;
        }
        for (com.google.android.material.navigation.a aVar : aVarArr) {
            if (aVar.getId() == i5) {
                return aVar;
            }
        }
        return null;
    }

    @Override // androidx.appcompat.view.menu.o
    public int h() {
        return 0;
    }

    @q0
    public BadgeDrawable i(int i5) {
        return this.E.get(i5);
    }

    SparseArray<BadgeDrawable> j() {
        return this.E;
    }

    @q0
    public ColorStateList k() {
        return this.f13800w;
    }

    @q0
    public Drawable l() {
        com.google.android.material.navigation.a[] aVarArr = this.f13797t;
        return (aVarArr == null || aVarArr.length <= 0) ? this.C : aVarArr[0].getBackground();
    }

    @Deprecated
    public int m() {
        return this.D;
    }

    @r
    public int n() {
        return this.f13801x;
    }

    @h1
    public int o() {
        return this.B;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@o0 AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        g0.X1(accessibilityNodeInfo).Y0(g0.b.f(1, this.G.H().size(), false, 1));
    }

    @h1
    public int p() {
        return this.A;
    }

    @q0
    public ColorStateList q() {
        return this.f13802y;
    }

    public int r() {
        return this.f13796s;
    }

    @q0
    protected g s() {
        return this.G;
    }

    BadgeDrawable u(int i5) {
        P(i5);
        BadgeDrawable badgeDrawable = this.E.get(i5);
        if (badgeDrawable == null) {
            badgeDrawable = BadgeDrawable.d(getContext());
            this.E.put(i5, badgeDrawable);
        }
        com.google.android.material.navigation.a g5 = g(i5);
        if (g5 != null) {
            g5.t(badgeDrawable);
        }
        return badgeDrawable;
    }

    public int v() {
        return this.f13798u;
    }

    protected int w() {
        return this.f13799v;
    }

    protected boolean x(int i5, int i6) {
        if (i5 == -1) {
            if (i6 > 3) {
                return true;
            }
        } else if (i5 == 0) {
            return true;
        }
        return false;
    }

    void z(int i5) {
        P(i5);
        BadgeDrawable badgeDrawable = this.E.get(i5);
        com.google.android.material.navigation.a g5 = g(i5);
        if (g5 != null) {
            g5.s();
        }
        if (badgeDrawable != null) {
            this.E.remove(i5);
        }
    }
}
