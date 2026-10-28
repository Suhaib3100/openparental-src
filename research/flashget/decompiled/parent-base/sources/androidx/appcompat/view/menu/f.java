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
import androidx.appcompat.view.menu.o;
import androidx.appcompat.view.menu.p;
import d.a;
import java.util.ArrayList;

/* compiled from: ListMenuPresenter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f implements o, AdapterView.OnItemClickListener {

    /* renamed from: l, reason: collision with root package name */
    private static final String f1223l = "ListMenuPresenter";

    /* renamed from: m, reason: collision with root package name */
    public static final String f1224m = "android:menu:list";

    /* renamed from: b, reason: collision with root package name */
    Context f1225b;

    /* renamed from: c, reason: collision with root package name */
    LayoutInflater f1226c;

    /* renamed from: d, reason: collision with root package name */
    h f1227d;

    /* renamed from: e, reason: collision with root package name */
    ExpandedMenuView f1228e;

    /* renamed from: f, reason: collision with root package name */
    int f1229f;

    /* renamed from: g, reason: collision with root package name */
    int f1230g;

    /* renamed from: h, reason: collision with root package name */
    int f1231h;

    /* renamed from: i, reason: collision with root package name */
    private o.a f1232i;

    /* renamed from: j, reason: collision with root package name */
    a f1233j;

    /* renamed from: k, reason: collision with root package name */
    private int f1234k;

    /* compiled from: ListMenuPresenter.java */
    private class a extends BaseAdapter {

        /* renamed from: b, reason: collision with root package name */
        private int f1235b = -1;

        public a() {
            a();
        }

        void a() {
            k y4 = f.this.f1227d.y();
            if (y4 != null) {
                ArrayList<k> C = f.this.f1227d.C();
                int size = C.size();
                for (int i4 = 0; i4 < size; i4++) {
                    if (C.get(i4) == y4) {
                        this.f1235b = i4;
                        return;
                    }
                }
            }
            this.f1235b = -1;
        }

        @Override // android.widget.Adapter
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public k getItem(int i4) {
            ArrayList<k> C = f.this.f1227d.C();
            int i5 = i4 + f.this.f1229f;
            int i6 = this.f1235b;
            if (i6 >= 0 && i5 >= i6) {
                i5++;
            }
            return C.get(i5);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int size = f.this.f1227d.C().size() - f.this.f1229f;
            return this.f1235b < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i4) {
            return i4;
        }

        @Override // android.widget.Adapter
        public View getView(int i4, View view, ViewGroup viewGroup) {
            if (view == null) {
                f fVar = f.this;
                view = fVar.f1226c.inflate(fVar.f1231h, viewGroup, false);
            }
            ((p.a) view).e(getItem(i4), 0);
            return view;
        }

        @Override // android.widget.BaseAdapter
        public void notifyDataSetChanged() {
            a();
            super.notifyDataSetChanged();
        }
    }

    public f(Context context, int i4) {
        this(i4, 0);
        this.f1225b = context;
        this.f1226c = LayoutInflater.from(context);
    }

    @Override // androidx.appcompat.view.menu.o
    public int a() {
        return this.f1234k;
    }

    public ListAdapter b() {
        if (this.f1233j == null) {
            this.f1233j = new a();
        }
        return this.f1233j;
    }

    int c() {
        return this.f1229f;
    }

    @Override // androidx.appcompat.view.menu.o
    public void d(h hVar, boolean z4) {
        o.a aVar = this.f1232i;
        if (aVar != null) {
            aVar.d(hVar, z4);
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean e(h hVar, k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void f(o.a aVar) {
        this.f1232i = aVar;
    }

    @Override // androidx.appcompat.view.menu.o
    public void g(Parcelable parcelable) {
        o((Bundle) parcelable);
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean h(t tVar) {
        if (!tVar.hasVisibleItems()) {
            return false;
        }
        new i(tVar).c(null);
        o.a aVar = this.f1232i;
        if (aVar == null) {
            return true;
        }
        aVar.e(tVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.o
    public p i(ViewGroup viewGroup) {
        if (this.f1228e == null) {
            this.f1228e = (ExpandedMenuView) this.f1226c.inflate(a.j.f73312n, viewGroup, false);
            if (this.f1233j == null) {
                this.f1233j = new a();
            }
            this.f1228e.setAdapter((ListAdapter) this.f1233j);
            this.f1228e.setOnItemClickListener(this);
        }
        return this.f1228e;
    }

    @Override // androidx.appcompat.view.menu.o
    public Parcelable j() {
        if (this.f1228e == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        p(bundle);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.o
    public void k(boolean z4) {
        a aVar = this.f1233j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean l() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean m(h hVar, k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void n(Context context, h hVar) {
        if (this.f1230g != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, this.f1230g);
            this.f1225b = contextThemeWrapper;
            this.f1226c = LayoutInflater.from(contextThemeWrapper);
        } else if (this.f1225b != null) {
            this.f1225b = context;
            if (this.f1226c == null) {
                this.f1226c = LayoutInflater.from(context);
            }
        }
        this.f1227d = hVar;
        a aVar = this.f1233j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    public void o(Bundle bundle) {
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.f1228e.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        this.f1227d.P(this.f1233j.getItem(i4), this, 0);
    }

    public void p(Bundle bundle) {
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.f1228e;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
    }

    public void q(int i4) {
        this.f1234k = i4;
    }

    public void r(int i4) {
        this.f1229f = i4;
        if (this.f1228e != null) {
            k(false);
        }
    }

    public f(int i4, int i5) {
        this.f1231h = i4;
        this.f1230g = i5;
    }
}
