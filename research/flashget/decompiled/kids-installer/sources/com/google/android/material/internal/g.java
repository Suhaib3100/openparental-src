package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.c1;
import androidx.annotation.h1;
import androidx.annotation.j0;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.appcompat.view.menu.n;
import androidx.core.view.accessibility.g0;
import androidx.core.view.v4;
import androidx.core.view.y1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.ArrayList;
import n1.a;

/* compiled from: NavigationMenuPresenter.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class g implements androidx.appcompat.view.menu.n {
    private static final String K = ProtectedSandApp.s("✃");
    private static final String L = ProtectedSandApp.s("✄");
    private static final String M = ProtectedSandApp.s("✅");
    int A;
    int B;
    int C;
    boolean D;
    private int F;
    private int G;
    int H;

    /* renamed from: o, reason: collision with root package name */
    private NavigationMenuView f13656o;

    /* renamed from: p, reason: collision with root package name */
    LinearLayout f13657p;

    /* renamed from: q, reason: collision with root package name */
    private n.a f13658q;

    /* renamed from: r, reason: collision with root package name */
    androidx.appcompat.view.menu.g f13659r;

    /* renamed from: s, reason: collision with root package name */
    private int f13660s;

    /* renamed from: t, reason: collision with root package name */
    c f13661t;

    /* renamed from: u, reason: collision with root package name */
    LayoutInflater f13662u;

    /* renamed from: v, reason: collision with root package name */
    int f13663v;

    /* renamed from: w, reason: collision with root package name */
    boolean f13664w;

    /* renamed from: x, reason: collision with root package name */
    ColorStateList f13665x;

    /* renamed from: y, reason: collision with root package name */
    ColorStateList f13666y;

    /* renamed from: z, reason: collision with root package name */
    Drawable f13667z;
    boolean E = true;
    private int I = -1;
    final View.OnClickListener J = new a();

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z5 = true;
            g.this.M(true);
            androidx.appcompat.view.menu.j d6 = ((NavigationMenuItemView) view).d();
            g gVar = g.this;
            boolean P = gVar.f13659r.P(d6, gVar, 0);
            if (d6 != null && d6.isCheckable() && P) {
                g.this.f13661t.S(d6);
            } else {
                z5 = false;
            }
            g.this.M(false);
            if (z5) {
                g.this.d(false);
            }
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class b extends l {
        public b(View view) {
            super(view);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private class c extends RecyclerView.h<l> {

        /* renamed from: h, reason: collision with root package name */
        private static final String f13669h = ProtectedSandApp.s("⛻");

        /* renamed from: i, reason: collision with root package name */
        private static final String f13670i = ProtectedSandApp.s("⛼");

        /* renamed from: j, reason: collision with root package name */
        private static final int f13671j = 0;

        /* renamed from: k, reason: collision with root package name */
        private static final int f13672k = 1;

        /* renamed from: l, reason: collision with root package name */
        private static final int f13673l = 2;

        /* renamed from: m, reason: collision with root package name */
        private static final int f13674m = 3;

        /* renamed from: d, reason: collision with root package name */
        private final ArrayList<e> f13675d = new ArrayList<>();

        /* renamed from: e, reason: collision with root package name */
        private androidx.appcompat.view.menu.j f13676e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f13677f;

        c() {
            Q();
        }

        private void J(int i5, int i6) {
            while (i5 < i6) {
                ((C0176g) this.f13675d.get(i5)).f13682b = true;
                i5++;
            }
        }

        private void Q() {
            if (this.f13677f) {
                return;
            }
            boolean z5 = true;
            this.f13677f = true;
            this.f13675d.clear();
            this.f13675d.add(new d());
            int size = g.this.f13659r.H().size();
            int i5 = -1;
            int i6 = 0;
            boolean z6 = false;
            int i7 = 0;
            while (i6 < size) {
                androidx.appcompat.view.menu.j jVar = g.this.f13659r.H().get(i6);
                if (jVar.isChecked()) {
                    S(jVar);
                }
                if (jVar.isCheckable()) {
                    jVar.w(false);
                }
                if (jVar.hasSubMenu()) {
                    SubMenu subMenu = jVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i6 != 0) {
                            this.f13675d.add(new f(g.this.H, 0));
                        }
                        this.f13675d.add(new C0176g(jVar));
                        int size2 = this.f13675d.size();
                        int size3 = subMenu.size();
                        int i8 = 0;
                        boolean z7 = false;
                        while (i8 < size3) {
                            androidx.appcompat.view.menu.j jVar2 = (androidx.appcompat.view.menu.j) subMenu.getItem(i8);
                            if (jVar2.isVisible()) {
                                if (!z7 && jVar2.getIcon() != null) {
                                    z7 = z5;
                                }
                                if (jVar2.isCheckable()) {
                                    jVar2.w(false);
                                }
                                if (jVar.isChecked()) {
                                    S(jVar);
                                }
                                this.f13675d.add(new C0176g(jVar2));
                            }
                            i8++;
                            z5 = true;
                        }
                        if (z7) {
                            J(size2, this.f13675d.size());
                        }
                    }
                } else {
                    int groupId = jVar.getGroupId();
                    if (groupId != i5) {
                        i7 = this.f13675d.size();
                        z6 = jVar.getIcon() != null;
                        if (i6 != 0) {
                            i7++;
                            ArrayList<e> arrayList = this.f13675d;
                            int i9 = g.this.H;
                            arrayList.add(new f(i9, i9));
                        }
                    } else if (!z6 && jVar.getIcon() != null) {
                        J(i7, this.f13675d.size());
                        z6 = true;
                    }
                    C0176g c0176g = new C0176g(jVar);
                    c0176g.f13682b = z6;
                    this.f13675d.add(c0176g);
                    i5 = groupId;
                }
                i6++;
                z5 = true;
            }
            this.f13677f = false;
        }

        @o0
        public Bundle K() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.j jVar = this.f13676e;
            if (jVar != null) {
                bundle.putInt(ProtectedSandApp.s("⛶"), jVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f13675d.size();
            for (int i5 = 0; i5 < size; i5++) {
                e eVar = this.f13675d.get(i5);
                if (eVar instanceof C0176g) {
                    androidx.appcompat.view.menu.j a6 = ((C0176g) eVar).a();
                    View actionView = a6 != null ? a6.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a6.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(ProtectedSandApp.s("⛷"), sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.j L() {
            return this.f13676e;
        }

        int M() {
            int i5 = g.this.f13657p.getChildCount() == 0 ? 0 : 1;
            for (int i6 = 0; i6 < g.this.f13661t.g(); i6++) {
                if (g.this.f13661t.i(i6) == 0) {
                    i5++;
                }
            }
            return i5;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public void x(@o0 l lVar, int i5) {
            int i6 = i(i5);
            if (i6 != 0) {
                if (i6 == 1) {
                    ((TextView) lVar.f9003a).setText(((C0176g) this.f13675d.get(i5)).a().getTitle());
                    return;
                } else {
                    if (i6 != 2) {
                        return;
                    }
                    f fVar = (f) this.f13675d.get(i5);
                    lVar.f9003a.setPadding(0, fVar.b(), 0, fVar.a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.f9003a;
            navigationMenuItemView.g0(g.this.f13666y);
            g gVar = g.this;
            if (gVar.f13664w) {
                navigationMenuItemView.j0(gVar.f13663v);
            }
            ColorStateList colorStateList = g.this.f13665x;
            if (colorStateList != null) {
                navigationMenuItemView.k0(colorStateList);
            }
            Drawable drawable = g.this.f13667z;
            y1.I1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            C0176g c0176g = (C0176g) this.f13675d.get(i5);
            navigationMenuItemView.i0(c0176g.f13682b);
            navigationMenuItemView.d0(g.this.A);
            navigationMenuItemView.e0(g.this.B);
            g gVar2 = g.this;
            if (gVar2.D) {
                navigationMenuItemView.f0(gVar2.C);
            }
            navigationMenuItemView.h0(g.this.F);
            navigationMenuItemView.l(c0176g.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        @q0
        /* renamed from: O, reason: merged with bridge method [inline-methods] */
        public l z(ViewGroup viewGroup, int i5) {
            if (i5 == 0) {
                g gVar = g.this;
                return new i(gVar.f13662u, viewGroup, gVar.J);
            }
            if (i5 == 1) {
                return new k(g.this.f13662u, viewGroup);
            }
            if (i5 == 2) {
                return new j(g.this.f13662u, viewGroup);
            }
            if (i5 != 3) {
                return null;
            }
            return new b(g.this.f13657p);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: P, reason: merged with bridge method [inline-methods] */
        public void E(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.f9003a).b0();
            }
        }

        public void R(@o0 Bundle bundle) {
            androidx.appcompat.view.menu.j a6;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.j a7;
            int i5 = bundle.getInt(ProtectedSandApp.s("⛸"), 0);
            if (i5 != 0) {
                this.f13677f = true;
                int size = this.f13675d.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size) {
                        break;
                    }
                    e eVar = this.f13675d.get(i6);
                    if ((eVar instanceof C0176g) && (a7 = ((C0176g) eVar).a()) != null && a7.getItemId() == i5) {
                        S(a7);
                        break;
                    }
                    i6++;
                }
                this.f13677f = false;
                Q();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(ProtectedSandApp.s("⛹"));
            if (sparseParcelableArray != null) {
                int size2 = this.f13675d.size();
                for (int i7 = 0; i7 < size2; i7++) {
                    e eVar2 = this.f13675d.get(i7);
                    if ((eVar2 instanceof C0176g) && (a6 = ((C0176g) eVar2).a()) != null && (actionView = a6.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a6.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void S(@o0 androidx.appcompat.view.menu.j jVar) {
            if (this.f13676e == jVar || !jVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.j jVar2 = this.f13676e;
            if (jVar2 != null) {
                jVar2.setChecked(false);
            }
            this.f13676e = jVar;
            jVar.setChecked(true);
        }

        public void T(boolean z5) {
            this.f13677f = z5;
        }

        public void U() {
            Q();
            m();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int g() {
            return this.f13675d.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long h(int i5) {
            return i5;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int i(int i5) {
            e eVar = this.f13675d.get(i5);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof C0176g) {
                return ((C0176g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException(ProtectedSandApp.s("⛺"));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class d implements e {
        d() {
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* loaded from: classes2.dex */
    private interface e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f13679a;

        /* renamed from: b, reason: collision with root package name */
        private final int f13680b;

        public f(int i5, int i6) {
            this.f13679a = i5;
            this.f13680b = i6;
        }

        public int a() {
            return this.f13680b;
        }

        public int b() {
            return this.f13679a;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.g$g, reason: collision with other inner class name */
    private static class C0176g implements e {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.j f13681a;

        /* renamed from: b, reason: collision with root package name */
        boolean f13682b;

        C0176g(androidx.appcompat.view.menu.j jVar) {
            this.f13681a = jVar;
        }

        public androidx.appcompat.view.menu.j a() {
            return this.f13681a;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private class h extends b0 {
        h(@o0 RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.b0, androidx.core.view.a
        public void g(View view, @o0 g0 g0Var) {
            super.g(view, g0Var);
            g0Var.Y0(g0.b.e(g.this.f13661t.M(), 0, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class i extends l {
        public i(@o0 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(a.k.K, viewGroup, false));
            this.f9003a.setOnClickListener(onClickListener);
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class j extends l {
        public j(@o0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.M, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class k extends l {
        public k(@o0 LayoutInflater layoutInflater, ViewGroup viewGroup) {
            super(layoutInflater.inflate(a.k.N, viewGroup, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static abstract class l extends RecyclerView.d0 {
        public l(View view) {
            super(view);
        }
    }

    private void N() {
        int i5 = (this.f13657p.getChildCount() == 0 && this.E) ? this.G : 0;
        NavigationMenuView navigationMenuView = this.f13656o;
        navigationMenuView.setPadding(0, i5, 0, navigationMenuView.getPaddingBottom());
    }

    public void A(boolean z5) {
        if (this.E != z5) {
            this.E = z5;
            N();
        }
    }

    public void B(@o0 androidx.appcompat.view.menu.j jVar) {
        this.f13661t.S(jVar);
    }

    public void C(int i5) {
        this.f13660s = i5;
    }

    public void D(@q0 Drawable drawable) {
        this.f13667z = drawable;
        d(false);
    }

    public void E(int i5) {
        this.A = i5;
        d(false);
    }

    public void F(int i5) {
        this.B = i5;
        d(false);
    }

    public void G(@androidx.annotation.r int i5) {
        if (this.C != i5) {
            this.C = i5;
            this.D = true;
            d(false);
        }
    }

    public void H(@q0 ColorStateList colorStateList) {
        this.f13666y = colorStateList;
        d(false);
    }

    public void I(int i5) {
        this.F = i5;
        d(false);
    }

    public void J(@h1 int i5) {
        this.f13663v = i5;
        this.f13664w = true;
        d(false);
    }

    public void K(@q0 ColorStateList colorStateList) {
        this.f13665x = colorStateList;
        d(false);
    }

    public void L(int i5) {
        this.I = i5;
        NavigationMenuView navigationMenuView = this.f13656o;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i5);
        }
    }

    public void M(boolean z5) {
        c cVar = this.f13661t;
        if (cVar != null) {
            cVar.T(z5);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(androidx.appcompat.view.menu.g gVar, boolean z5) {
        n.a aVar = this.f13658q;
        if (aVar != null) {
            aVar.b(gVar, z5);
        }
    }

    public void c(@o0 View view) {
        this.f13657p.addView(view);
        NavigationMenuView navigationMenuView = this.f13656o;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z5) {
        c cVar = this.f13661t;
        if (cVar != null) {
            cVar.U();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean f(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(androidx.appcompat.view.menu.g gVar, androidx.appcompat.view.menu.j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f13660s;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.f13658q = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(@o0 Context context, @o0 androidx.appcompat.view.menu.g gVar) {
        this.f13662u = LayoutInflater.from(context);
        this.f13659r = gVar;
        this.H = context.getResources().getDimensionPixelOffset(a.f.f29554s1);
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ProtectedSandApp.s("⛽"));
            if (sparseParcelableArray != null) {
                this.f13656o.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(ProtectedSandApp.s("⛾"));
            if (bundle2 != null) {
                this.f13661t.R(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(ProtectedSandApp.s("⛿"));
            if (sparseParcelableArray2 != null) {
                this.f13657p.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    public void k(@o0 v4 v4Var) {
        int r5 = v4Var.r();
        if (this.G != r5) {
            this.G = r5;
            N();
        }
        NavigationMenuView navigationMenuView = this.f13656o;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, v4Var.o());
        y1.p(this.f13657p, v4Var);
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(androidx.appcompat.view.menu.t tVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public androidx.appcompat.view.menu.o m(ViewGroup viewGroup) {
        if (this.f13656o == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f13662u.inflate(a.k.O, viewGroup, false);
            this.f13656o = navigationMenuView;
            navigationMenuView.W1(new h(this.f13656o));
            if (this.f13661t == null) {
                this.f13661t = new c();
            }
            int i5 = this.I;
            if (i5 != -1) {
                this.f13656o.setOverScrollMode(i5);
            }
            this.f13657p = (LinearLayout) this.f13662u.inflate(a.k.L, (ViewGroup) this.f13656o, false);
            this.f13656o.X1(this.f13661t);
        }
        return this.f13656o;
    }

    @Override // androidx.appcompat.view.menu.n
    @o0
    public Parcelable n() {
        Bundle bundle = new Bundle();
        if (this.f13656o != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f13656o.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ProtectedSandApp.s("✀"), sparseArray);
        }
        c cVar = this.f13661t;
        if (cVar != null) {
            bundle.putBundle(ProtectedSandApp.s("✁"), cVar.K());
        }
        if (this.f13657p != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f13657p.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(ProtectedSandApp.s("✂"), sparseArray2);
        }
        return bundle;
    }

    @q0
    public androidx.appcompat.view.menu.j o() {
        return this.f13661t.L();
    }

    public int p() {
        return this.f13657p.getChildCount();
    }

    public View q(int i5) {
        return this.f13657p.getChildAt(i5);
    }

    @q0
    public Drawable r() {
        return this.f13667z;
    }

    public int s() {
        return this.A;
    }

    public int t() {
        return this.B;
    }

    public int u() {
        return this.F;
    }

    @q0
    public ColorStateList v() {
        return this.f13665x;
    }

    @q0
    public ColorStateList w() {
        return this.f13666y;
    }

    public View x(@j0 int i5) {
        View inflate = this.f13662u.inflate(i5, (ViewGroup) this.f13657p, false);
        c(inflate);
        return inflate;
    }

    public boolean y() {
        return this.E;
    }

    public void z(@o0 View view) {
        this.f13657p.removeView(view);
        if (this.f13657p.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f13656o;
            navigationMenuView.setPadding(0, this.G, 0, navigationMenuView.getPaddingBottom());
        }
    }
}
