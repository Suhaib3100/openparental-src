package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.annotation.c1;
import androidx.appcompat.view.menu.p;
import java.util.ArrayList;

/* compiled from: MenuAdapter.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class g extends BaseAdapter {

    /* renamed from: b, reason: collision with root package name */
    h f1237b;

    /* renamed from: c, reason: collision with root package name */
    private int f1238c = -1;

    /* renamed from: d, reason: collision with root package name */
    private boolean f1239d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f1240e;

    /* renamed from: f, reason: collision with root package name */
    private final LayoutInflater f1241f;

    /* renamed from: g, reason: collision with root package name */
    private final int f1242g;

    public g(h hVar, LayoutInflater layoutInflater, boolean z4, int i4) {
        this.f1240e = z4;
        this.f1241f = layoutInflater;
        this.f1237b = hVar;
        this.f1242g = i4;
        a();
    }

    void a() {
        k y4 = this.f1237b.y();
        if (y4 != null) {
            ArrayList<k> C = this.f1237b.C();
            int size = C.size();
            for (int i4 = 0; i4 < size; i4++) {
                if (C.get(i4) == y4) {
                    this.f1238c = i4;
                    return;
                }
            }
        }
        this.f1238c = -1;
    }

    public h b() {
        return this.f1237b;
    }

    public boolean c() {
        return this.f1239d;
    }

    @Override // android.widget.Adapter
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public k getItem(int i4) {
        ArrayList<k> C = this.f1240e ? this.f1237b.C() : this.f1237b.H();
        int i5 = this.f1238c;
        if (i5 >= 0 && i4 >= i5) {
            i4++;
        }
        return C.get(i4);
    }

    public void e(boolean z4) {
        this.f1239d = z4;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1238c < 0 ? (this.f1240e ? this.f1237b.C() : this.f1237b.H()).size() : r0.size() - 1;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i4) {
        return i4;
    }

    @Override // android.widget.Adapter
    public View getView(int i4, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.f1241f.inflate(this.f1242g, viewGroup, false);
        }
        int groupId = getItem(i4).getGroupId();
        int i5 = i4 - 1;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        listMenuItemView.m(this.f1237b.I() && groupId != (i5 >= 0 ? getItem(i5).getGroupId() : groupId));
        p.a aVar = (p.a) view;
        if (this.f1239d) {
            listMenuItemView.l(true);
        }
        aVar.e(getItem(i4), 0);
        return view;
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}
