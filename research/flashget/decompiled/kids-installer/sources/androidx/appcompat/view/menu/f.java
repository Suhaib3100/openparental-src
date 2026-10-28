package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.o;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class f extends BaseAdapter {

    /* renamed from: o, reason: collision with root package name */
    g f689o;

    /* renamed from: p, reason: collision with root package name */
    private int f690p = -1;

    /* renamed from: q, reason: collision with root package name */
    private boolean f691q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f692r;

    /* renamed from: s, reason: collision with root package name */
    private final LayoutInflater f693s;

    /* renamed from: t, reason: collision with root package name */
    private final int f694t;

    public f(g gVar, LayoutInflater layoutInflater, boolean z5, int i5) {
        this.f692r = z5;
        this.f693s = layoutInflater;
        this.f689o = gVar;
        this.f694t = i5;
        a();
    }

    void a() {
        j y5 = this.f689o.y();
        if (y5 != null) {
            ArrayList<j> C = this.f689o.C();
            int size = C.size();
            for (int i5 = 0; i5 < size; i5++) {
                if (C.get(i5) == y5) {
                    this.f690p = i5;
                    return;
                }
            }
        }
        this.f690p = -1;
    }

    public g b() {
        return this.f689o;
    }

    public boolean c() {
        return this.f691q;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public j getItem(int i5) {
        ArrayList<j> C = this.f692r ? this.f689o.C() : this.f689o.H();
        int i6 = this.f690p;
        if (i6 >= 0 && i5 >= i6) {
            i5++;
        }
        return C.get(i5);
    }

    public void e(boolean z5) {
        this.f691q = z5;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f690p < 0 ? (this.f692r ? this.f689o.C() : this.f689o.H()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i5) {
        return i5;
    }

    @Override // android.widget.Adapter
    public View getView(int i5, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f693s.inflate(this.f694t, viewGroup, false);
        }
        int groupId = getItem(i5).getGroupId();
        int i6 = i5 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.m(this.f689o.I() && groupId != (i6 >= 0 ? getItem(i6).getGroupId() : groupId));
        o.a aVar = (o.a) view;
        if (this.f691q) {
            listMenuItemView.j(true);
        }
        aVar.l(getItem(i5), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
