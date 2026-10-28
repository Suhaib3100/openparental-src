package androidx.appcompat.view.menu;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ListAdapter;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.view.menu.o;
import d.a;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes2.dex */
public class e implements n, AdapterView.OnItemClickListener {

    /* renamed from: y, reason: collision with root package name */
    private static final String f675y = "ListMenuPresenter";

    /* renamed from: z, reason: collision with root package name */
    public static final String f676z = "android:menu:list";

    /* renamed from: o, reason: collision with root package name */
    Context f677o;

    /* renamed from: p, reason: collision with root package name */
    LayoutInflater f678p;

    /* renamed from: q, reason: collision with root package name */
    g f679q;

    /* renamed from: r, reason: collision with root package name */
    ExpandedMenuView f680r;

    /* renamed from: s, reason: collision with root package name */
    int f681s;

    /* renamed from: t, reason: collision with root package name */
    int f682t;

    /* renamed from: u, reason: collision with root package name */
    int f683u;

    /* renamed from: v, reason: collision with root package name */
    private n.a f684v;

    /* renamed from: w, reason: collision with root package name */
    a f685w;

    /* renamed from: x, reason: collision with root package name */
    private int f686x;

    /* compiled from: ListMenuPresenter.java */
    /* loaded from: classes.dex */
    private class a extends BaseAdapter {

        /* renamed from: o, reason: collision with root package name */
        private int f687o = -1;

        public a() {
            a();
        }

        void a() {
            j y5 = e.this.f679q.y();
            if (y5 != null) {
                ArrayList<j> C = e.this.f679q.C();
                int size = C.size();
                for (int i5 = 0; i5 < size; i5++) {
                    if (C.get(i5) == y5) {
                        this.f687o = i5;
                        return;
                    }
                }
            }
            this.f687o = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public j getItem(int i5) {
            ArrayList<j> C = e.this.f679q.C();
            int i6 = i5 + e.this.f681s;
            int i7 = this.f687o;
            if (i7 >= 0 && i6 >= i7) {
                i6++;
            }
            return C.get(i6);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = e.this.f679q.C().size() - e.this.f681s;
            return this.f687o < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i5) {
            return i5;
        }

        @Override // android.widget.Adapter
        public View getView(int i5, View view, ViewGroup viewGroup) {
            if (view == null) {
                e eVar = e.this;
                view = eVar.f678p.inflate(eVar.f683u, viewGroup, false);
            }
            ((o.a) view).l(getItem(i5), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public e(Context context, int i5) {
        this(i5, 0);
        this.f677o = context;
        this.f678p = LayoutInflater.from(context);
    }

    public ListAdapter a() {
        if (this.f685w == null) {
            this.f685w = new a();
        }
        return this.f685w;
    }

    @Override // androidx.appcompat.view.menu.n
    public void b(g gVar, boolean z5) {
        n.a aVar = this.f684v;
        if (aVar != null) {
            aVar.b(gVar, z5);
        }
    }

    int c() {
        return this.f681s;
    }

    @Override // androidx.appcompat.view.menu.n
    public void d(boolean z5) {
        a aVar = this.f685w;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean f(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean g(g gVar, j jVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n
    public int getId() {
        return this.f686x;
    }

    @Override // androidx.appcompat.view.menu.n
    public void h(n.a aVar) {
        this.f684v = aVar;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(Context context, g gVar) {
        if (this.f682t != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f682t);
            this.f677o = contextThemeWrapper;
            this.f678p = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f677o != null) {
            this.f677o = context;
            if (this.f678p == null) {
                this.f678p = LayoutInflater.from(context);
            }
        }
        this.f679q = gVar;
        a aVar = this.f685w;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public void j(Parcelable parcelable) {
        k((Bundle) parcelable);
    }

    public void k(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f680r.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.n
    public boolean l(t tVar) {
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        new h(tVar).e(null);
        n.a aVar = this.f684v;
        if (aVar == null) {
            return true;
        }
        aVar.c(tVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.n
    public o m(ViewGroup viewGroup) {
        if (this.f680r == null) {
            this.f680r = (ExpandedMenuView) this.f678p.inflate(a.k.f21957n, viewGroup, false);
            if (this.f685w == null) {
                this.f685w = new a();
            }
            this.f680r.setAdapter((ListAdapter) this.f685w);
            this.f680r.setOnItemClickListener(this);
        }
        return this.f680r;
    }

    @Override // androidx.appcompat.view.menu.n
    public Parcelable n() {
        if (this.f680r == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        o(bundle);
        return bundle;
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f680r;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
        this.f679q.P(this.f685w.getItem(i5), this, 0);
    }

    public void p(int i5) {
        this.f686x = i5;
    }

    public void q(int i5) {
        this.f681s = i5;
        if (this.f680r != null) {
            d(false);
        }
    }

    public e(int i5, int i6) {
        this.f683u = i5;
        this.f682t = i6;
    }
}
