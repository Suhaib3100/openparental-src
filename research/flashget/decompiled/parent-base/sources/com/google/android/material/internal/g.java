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
import androidx.appcompat.view.menu.o;
import androidx.core.view.accessibility.h0;
import androidx.core.view.j3;
import androidx.core.view.x1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import s8.a;

/* compiled from: NavigationMenuPresenter.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes6.dex */
public class g implements androidx.appcompat.view.menu.o {

    /* renamed from: x, reason: collision with root package name */
    private static final String f53438x = ProtectedSandApp.s("\uf1e2");

    /* renamed from: y, reason: collision with root package name */
    private static final String f53439y = ProtectedSandApp.s("\uf1e3");

    /* renamed from: z, reason: collision with root package name */
    private static final String f53440z = ProtectedSandApp.s("\uf1e4");

    /* renamed from: b, reason: collision with root package name */
    private NavigationMenuView f53441b;

    /* renamed from: c, reason: collision with root package name */
    LinearLayout f53442c;

    /* renamed from: d, reason: collision with root package name */
    private o.a f53443d;

    /* renamed from: e, reason: collision with root package name */
    androidx.appcompat.view.menu.h f53444e;

    /* renamed from: f, reason: collision with root package name */
    private int f53445f;

    /* renamed from: g, reason: collision with root package name */
    c f53446g;

    /* renamed from: h, reason: collision with root package name */
    LayoutInflater f53447h;

    /* renamed from: i, reason: collision with root package name */
    int f53448i;

    /* renamed from: j, reason: collision with root package name */
    boolean f53449j;

    /* renamed from: k, reason: collision with root package name */
    ColorStateList f53450k;

    /* renamed from: l, reason: collision with root package name */
    ColorStateList f53451l;

    /* renamed from: m, reason: collision with root package name */
    Drawable f53452m;

    /* renamed from: n, reason: collision with root package name */
    int f53453n;

    /* renamed from: o, reason: collision with root package name */
    int f53454o;

    /* renamed from: p, reason: collision with root package name */
    int f53455p;

    /* renamed from: q, reason: collision with root package name */
    boolean f53456q;

    /* renamed from: s, reason: collision with root package name */
    private int f53458s;

    /* renamed from: t, reason: collision with root package name */
    private int f53459t;

    /* renamed from: u, reason: collision with root package name */
    int f53460u;

    /* renamed from: r, reason: collision with root package name */
    boolean f53457r = true;

    /* renamed from: v, reason: collision with root package name */
    private int f53461v = -1;

    /* renamed from: w, reason: collision with root package name */
    final View.OnClickListener f53462w = new a();

    /* compiled from: NavigationMenuPresenter.java */
    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            boolean z4 = true;
            g.this.N(true);
            androidx.appcompat.view.menu.k g4 = ((NavigationMenuItemView) view).g();
            g gVar = g.this;
            boolean P = gVar.f53444e.P(g4, gVar, 0);
            if (g4 != null && g4.isCheckable() && P) {
                g.this.f53446g.m(g4);
            } else {
                z4 = false;
            }
            g.this.N(false);
            if (z4) {
                g.this.k(false);
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

        /* renamed from: f, reason: collision with root package name */
        private static final String f53464f = ProtectedSandApp.s("\uf1df");

        /* renamed from: g, reason: collision with root package name */
        private static final String f53465g = ProtectedSandApp.s("\uf1e0");

        /* renamed from: h, reason: collision with root package name */
        private static final int f53466h = 0;

        /* renamed from: i, reason: collision with root package name */
        private static final int f53467i = 1;

        /* renamed from: j, reason: collision with root package name */
        private static final int f53468j = 2;

        /* renamed from: k, reason: collision with root package name */
        private static final int f53469k = 3;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList<e> f53470b = new ArrayList<>();

        /* renamed from: c, reason: collision with root package name */
        private androidx.appcompat.view.menu.k f53471c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f53472d;

        c() {
            k();
        }

        private void d(int i4, int i5) {
            while (i4 < i5) {
                ((C0810g) this.f53470b.get(i4)).f53477b = true;
                i4++;
            }
        }

        private void k() {
            if (this.f53472d) {
                return;
            }
            boolean z4 = true;
            this.f53472d = true;
            this.f53470b.clear();
            this.f53470b.add(new d());
            int size = g.this.f53444e.H().size();
            int i4 = -1;
            int i5 = 0;
            boolean z5 = false;
            int i6 = 0;
            while (i5 < size) {
                androidx.appcompat.view.menu.k kVar = g.this.f53444e.H().get(i5);
                if (kVar.isChecked()) {
                    m(kVar);
                }
                if (kVar.isCheckable()) {
                    kVar.w(false);
                }
                if (kVar.hasSubMenu()) {
                    SubMenu subMenu = kVar.getSubMenu();
                    if (subMenu.hasVisibleItems()) {
                        if (i5 != 0) {
                            this.f53470b.add(new f(g.this.f53460u, 0));
                        }
                        this.f53470b.add(new C0810g(kVar));
                        int size2 = this.f53470b.size();
                        int size3 = subMenu.size();
                        int i7 = 0;
                        boolean z6 = false;
                        while (i7 < size3) {
                            androidx.appcompat.view.menu.k kVar2 = (androidx.appcompat.view.menu.k) subMenu.getItem(i7);
                            if (kVar2.isVisible()) {
                                if (!z6 && kVar2.getIcon() != null) {
                                    z6 = z4;
                                }
                                if (kVar2.isCheckable()) {
                                    kVar2.w(false);
                                }
                                if (kVar.isChecked()) {
                                    m(kVar);
                                }
                                this.f53470b.add(new C0810g(kVar2));
                            }
                            i7++;
                            z4 = true;
                        }
                        if (z6) {
                            d(size2, this.f53470b.size());
                        }
                    }
                } else {
                    int groupId = kVar.getGroupId();
                    if (groupId != i4) {
                        i6 = this.f53470b.size();
                        z5 = kVar.getIcon() != null;
                        if (i5 != 0) {
                            i6++;
                            ArrayList<e> arrayList = this.f53470b;
                            int i10 = g.this.f53460u;
                            arrayList.add(new f(i10, i10));
                        }
                    } else if (!z5 && kVar.getIcon() != null) {
                        d(i6, this.f53470b.size());
                        z5 = true;
                    }
                    C0810g c0810g = new C0810g(kVar);
                    c0810g.f53477b = z5;
                    this.f53470b.add(c0810g);
                    i4 = groupId;
                }
                i5++;
                z4 = true;
            }
            this.f53472d = false;
        }

        @o0
        public Bundle e() {
            Bundle bundle = new Bundle();
            androidx.appcompat.view.menu.k kVar = this.f53471c;
            if (kVar != null) {
                bundle.putInt(ProtectedSandApp.s("\uf1df"), kVar.getItemId());
            }
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            int size = this.f53470b.size();
            for (int i4 = 0; i4 < size; i4++) {
                e eVar = this.f53470b.get(i4);
                if (eVar instanceof C0810g) {
                    androidx.appcompat.view.menu.k a5 = ((C0810g) eVar).a();
                    View actionView = a5 != null ? a5.getActionView() : null;
                    if (actionView != null) {
                        ParcelableSparseArray parcelableSparseArray = new ParcelableSparseArray();
                        actionView.saveHierarchyState(parcelableSparseArray);
                        sparseArray.put(a5.getItemId(), parcelableSparseArray);
                    }
                }
            }
            bundle.putSparseParcelableArray(ProtectedSandApp.s("\uf1e0"), sparseArray);
            return bundle;
        }

        public androidx.appcompat.view.menu.k f() {
            return this.f53471c;
        }

        int g() {
            int i4 = g.this.f53442c.getChildCount() == 0 ? 0 : 1;
            for (int i5 = 0; i5 < g.this.f53446g.getItemCount(); i5++) {
                if (g.this.f53446g.getItemViewType(i5) == 0) {
                    i4++;
                }
            }
            return i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemCount() {
            return this.f53470b.size();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long getItemId(int i4) {
            return i4;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int getItemViewType(int i4) {
            e eVar = this.f53470b.get(i4);
            if (eVar instanceof f) {
                return 2;
            }
            if (eVar instanceof d) {
                return 3;
            }
            if (eVar instanceof C0810g) {
                return ((C0810g) eVar).a().hasSubMenu() ? 1 : 0;
            }
            throw new RuntimeException(ProtectedSandApp.s("\uf1e1"));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(@o0 l lVar, int i4) {
            int itemViewType = getItemViewType(i4);
            if (itemViewType != 0) {
                if (itemViewType == 1) {
                    ((TextView) lVar.itemView).setText(((C0810g) this.f53470b.get(i4)).a().getTitle());
                    return;
                } else {
                    if (itemViewType != 2) {
                        return;
                    }
                    f fVar = (f) this.f53470b.get(i4);
                    lVar.itemView.setPadding(0, fVar.b(), 0, fVar.a());
                    return;
                }
            }
            NavigationMenuItemView navigationMenuItemView = (NavigationMenuItemView) lVar.itemView;
            navigationMenuItemView.i0(g.this.f53451l);
            g gVar = g.this;
            if (gVar.f53449j) {
                navigationMenuItemView.l0(gVar.f53448i);
            }
            ColorStateList colorStateList = g.this.f53450k;
            if (colorStateList != null) {
                navigationMenuItemView.m0(colorStateList);
            }
            Drawable drawable = g.this.f53452m;
            x1.P1(navigationMenuItemView, drawable != null ? drawable.getConstantState().newDrawable() : null);
            C0810g c0810g = (C0810g) this.f53470b.get(i4);
            navigationMenuItemView.k0(c0810g.f53477b);
            navigationMenuItemView.f0(g.this.f53453n);
            navigationMenuItemView.g0(g.this.f53454o);
            g gVar2 = g.this;
            if (gVar2.f53456q) {
                navigationMenuItemView.h0(gVar2.f53455p);
            }
            navigationMenuItemView.j0(g.this.f53458s);
            navigationMenuItemView.e(c0810g.a(), 0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        @q0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public l onCreateViewHolder(ViewGroup viewGroup, int i4) {
            if (i4 == 0) {
                g gVar = g.this;
                return new i(gVar.f53447h, viewGroup, gVar.f53462w);
            }
            if (i4 == 1) {
                return new k(g.this.f53447h, viewGroup);
            }
            if (i4 == 2) {
                return new j(g.this.f53447h, viewGroup);
            }
            if (i4 != 3) {
                return null;
            }
            return new b(g.this.f53442c);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public void onViewRecycled(l lVar) {
            if (lVar instanceof i) {
                ((NavigationMenuItemView) lVar.itemView).d0();
            }
        }

        public void l(@o0 Bundle bundle) {
            androidx.appcompat.view.menu.k a5;
            View actionView;
            ParcelableSparseArray parcelableSparseArray;
            androidx.appcompat.view.menu.k a6;
            int i4 = bundle.getInt(ProtectedSandApp.s("\uf1df"), 0);
            if (i4 != 0) {
                this.f53472d = true;
                int size = this.f53470b.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size) {
                        break;
                    }
                    e eVar = this.f53470b.get(i5);
                    if ((eVar instanceof C0810g) && (a6 = ((C0810g) eVar).a()) != null && a6.getItemId() == i4) {
                        m(a6);
                        break;
                    }
                    i5++;
                }
                this.f53472d = false;
                k();
            }
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(ProtectedSandApp.s("\uf1e0"));
            if (sparseParcelableArray != null) {
                int size2 = this.f53470b.size();
                for (int i6 = 0; i6 < size2; i6++) {
                    e eVar2 = this.f53470b.get(i6);
                    if ((eVar2 instanceof C0810g) && (a5 = ((C0810g) eVar2).a()) != null && (actionView = a5.getActionView()) != null && (parcelableSparseArray = (ParcelableSparseArray) sparseParcelableArray.get(a5.getItemId())) != null) {
                        actionView.restoreHierarchyState(parcelableSparseArray);
                    }
                }
            }
        }

        public void m(@o0 androidx.appcompat.view.menu.k kVar) {
            if (this.f53471c == kVar || !kVar.isCheckable()) {
                return;
            }
            androidx.appcompat.view.menu.k kVar2 = this.f53471c;
            if (kVar2 != null) {
                kVar2.setChecked(false);
            }
            this.f53471c = kVar;
            kVar.setChecked(true);
        }

        public void n(boolean z4) {
            this.f53472d = z4;
        }

        public void o() {
            k();
            notifyDataSetChanged();
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class d implements e {
        d() {
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private interface e {
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class f implements e {

        /* renamed from: a, reason: collision with root package name */
        private final int f53474a;

        /* renamed from: b, reason: collision with root package name */
        private final int f53475b;

        public f(int i4, int i5) {
            this.f53474a = i4;
            this.f53475b = i5;
        }

        public int a() {
            return this.f53475b;
        }

        public int b() {
            return this.f53474a;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    /* renamed from: com.google.android.material.internal.g$g, reason: collision with other inner class name */
    private static class C0810g implements e {

        /* renamed from: a, reason: collision with root package name */
        private final androidx.appcompat.view.menu.k f53476a;

        /* renamed from: b, reason: collision with root package name */
        boolean f53477b;

        C0810g(androidx.appcompat.view.menu.k kVar) {
            this.f53476a = kVar;
        }

        public androidx.appcompat.view.menu.k a() {
            return this.f53476a;
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private class h extends b0 {
        h(@o0 RecyclerView recyclerView) {
            super(recyclerView);
        }

        @Override // androidx.recyclerview.widget.b0, androidx.core.view.a
        public void i(View view, @o0 h0 h0Var) {
            super.i(view, h0Var);
            h0Var.l1(h0.f.g(g.this.f53446g.g(), 0, false));
        }
    }

    /* compiled from: NavigationMenuPresenter.java */
    private static class i extends l {
        public i(@o0 LayoutInflater layoutInflater, ViewGroup viewGroup, View.OnClickListener onClickListener) {
            super(layoutInflater.inflate(a.k.K, viewGroup, false));
            this.itemView.setOnClickListener(onClickListener);
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
    private static abstract class l extends RecyclerView.e0 {
        public l(View view) {
            super(view);
        }
    }

    private void O() {
        int i4 = (this.f53442c.getChildCount() == 0 && this.f53457r) ? this.f53459t : 0;
        NavigationMenuView navigationMenuView = this.f53441b;
        navigationMenuView.setPadding(0, i4, 0, navigationMenuView.getPaddingBottom());
    }

    public void A(@o0 View view) {
        this.f53442c.removeView(view);
        if (this.f53442c.getChildCount() == 0) {
            NavigationMenuView navigationMenuView = this.f53441b;
            navigationMenuView.setPadding(0, this.f53459t, 0, navigationMenuView.getPaddingBottom());
        }
    }

    public void B(boolean z4) {
        if (this.f53457r != z4) {
            this.f53457r = z4;
            O();
        }
    }

    public void C(@o0 androidx.appcompat.view.menu.k kVar) {
        this.f53446g.m(kVar);
    }

    public void D(int i4) {
        this.f53445f = i4;
    }

    public void E(@q0 Drawable drawable) {
        this.f53452m = drawable;
        k(false);
    }

    public void F(int i4) {
        this.f53453n = i4;
        k(false);
    }

    public void G(int i4) {
        this.f53454o = i4;
        k(false);
    }

    public void H(@androidx.annotation.r int i4) {
        if (this.f53455p != i4) {
            this.f53455p = i4;
            this.f53456q = true;
            k(false);
        }
    }

    public void I(@q0 ColorStateList colorStateList) {
        this.f53451l = colorStateList;
        k(false);
    }

    public void J(int i4) {
        this.f53458s = i4;
        k(false);
    }

    public void K(@h1 int i4) {
        this.f53448i = i4;
        this.f53449j = true;
        k(false);
    }

    public void L(@q0 ColorStateList colorStateList) {
        this.f53450k = colorStateList;
        k(false);
    }

    public void M(int i4) {
        this.f53461v = i4;
        NavigationMenuView navigationMenuView = this.f53441b;
        if (navigationMenuView != null) {
            navigationMenuView.setOverScrollMode(i4);
        }
    }

    public void N(boolean z4) {
        c cVar = this.f53446g;
        if (cVar != null) {
            cVar.n(z4);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public int a() {
        return this.f53445f;
    }

    public void c(@o0 View view) {
        this.f53442c.addView(view);
        NavigationMenuView navigationMenuView = this.f53441b;
        navigationMenuView.setPadding(0, 0, 0, navigationMenuView.getPaddingBottom());
    }

    @Override // androidx.appcompat.view.menu.o
    public void d(androidx.appcompat.view.menu.h hVar, boolean z4) {
        o.a aVar = this.f53443d;
        if (aVar != null) {
            aVar.d(hVar, z4);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean e(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void f(o.a aVar) {
        this.f53443d = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void g(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(ProtectedSandApp.s("\uf1e2"));
            if (sparseParcelableArray != null) {
                this.f53441b.restoreHierarchyState(sparseParcelableArray);
            }
            Bundle bundle2 = bundle.getBundle(ProtectedSandApp.s("\uf1e3"));
            if (bundle2 != null) {
                this.f53446g.l(bundle2);
            }
            SparseArray<Parcelable> sparseParcelableArray2 = bundle.getSparseParcelableArray(ProtectedSandApp.s("\uf1e4"));
            if (sparseParcelableArray2 != null) {
                this.f53442c.restoreHierarchyState(sparseParcelableArray2);
            }
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean h(androidx.appcompat.view.menu.t tVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public androidx.appcompat.view.menu.p i(ViewGroup viewGroup) {
        if (this.f53441b == null) {
            NavigationMenuView navigationMenuView = (NavigationMenuView) this.f53447h.inflate(a.k.O, viewGroup, false);
            this.f53441b = navigationMenuView;
            navigationMenuView.setAccessibilityDelegateCompat(new h(this.f53441b));
            if (this.f53446g == null) {
                this.f53446g = new c();
            }
            int i4 = this.f53461v;
            if (i4 != -1) {
                this.f53441b.setOverScrollMode(i4);
            }
            this.f53442c = (LinearLayout) this.f53447h.inflate(a.k.L, (ViewGroup) this.f53441b, false);
            this.f53441b.setAdapter(this.f53446g);
        }
        return this.f53441b;
    }

    @Override // androidx.appcompat.view.menu.o
    @o0
    public Parcelable j() {
        Bundle bundle = new Bundle();
        if (this.f53441b != null) {
            SparseArray<Parcelable> sparseArray = new SparseArray<>();
            this.f53441b.saveHierarchyState(sparseArray);
            bundle.putSparseParcelableArray(ProtectedSandApp.s("\uf1e2"), sparseArray);
        }
        c cVar = this.f53446g;
        if (cVar != null) {
            bundle.putBundle(ProtectedSandApp.s("\uf1e3"), cVar.e());
        }
        if (this.f53442c != null) {
            SparseArray<Parcelable> sparseArray2 = new SparseArray<>();
            this.f53442c.saveHierarchyState(sparseArray2);
            bundle.putSparseParcelableArray(ProtectedSandApp.s("\uf1e4"), sparseArray2);
        }
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.o
    public void k(boolean z4) {
        c cVar = this.f53446g;
        if (cVar != null) {
            cVar.o();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean m(androidx.appcompat.view.menu.h hVar, androidx.appcompat.view.menu.k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void n(@o0 Context context, @o0 androidx.appcompat.view.menu.h hVar) {
        this.f53447h = LayoutInflater.from(context);
        this.f53444e = hVar;
        this.f53460u = context.getResources().getDimensionPixelOffset(a.f.f90862s1);
    }

    public void o(@o0 j3 j3Var) {
        int r4 = j3Var.r();
        if (this.f53459t != r4) {
            this.f53459t = r4;
            O();
        }
        NavigationMenuView navigationMenuView = this.f53441b;
        navigationMenuView.setPadding(0, navigationMenuView.getPaddingTop(), 0, j3Var.o());
        x1.p(this.f53442c, j3Var);
    }

    @q0
    public androidx.appcompat.view.menu.k p() {
        return this.f53446g.f();
    }

    public int q() {
        return this.f53442c.getChildCount();
    }

    public View r(int i4) {
        return this.f53442c.getChildAt(i4);
    }

    @q0
    public Drawable s() {
        return this.f53452m;
    }

    public int t() {
        return this.f53453n;
    }

    public int u() {
        return this.f53454o;
    }

    public int v() {
        return this.f53458s;
    }

    @q0
    public ColorStateList w() {
        return this.f53450k;
    }

    @q0
    public ColorStateList x() {
        return this.f53451l;
    }

    public View y(@j0 int i4) {
        View inflate = this.f53447h.inflate(i4, (ViewGroup) this.f53442c, false);
        c(inflate);
        return inflate;
    }

    public boolean z() {
        return this.f53457r;
    }
}
