package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import androidx.annotation.o0;
import androidx.annotation.q0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: MenuPopup.java */
/* loaded from: classes2.dex */
public abstract class l implements q, n, AdapterView.OnItemClickListener {

    /* renamed from: o, reason: collision with root package name */
    private Rect f742o;

    l() {
    }

    protected static boolean A(g gVar) {
        int size = gVar.size();
        for (int i5 = 0; i5 < size; i5++) {
            MenuItem item = gVar.getItem(i5);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static f B(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (f) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (f) listAdapter;
    }

    protected static int r(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i5) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i6 = 0;
        int i7 = 0;
        View view = null;
        for (int i8 = 0; i8 < count; i8++) {
            int itemViewType = listAdapter.getItemViewType(i8);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i8, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i5) {
                return i5;
            }
            if (measuredWidth > i6) {
                i6 = measuredWidth;
            }
        }
        return i6;
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
        return 0;
    }

    @Override // androidx.appcompat.view.menu.n
    public void i(@o0 Context context, @q0 g gVar) {
    }

    @Override // androidx.appcompat.view.menu.n
    public o m(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    public abstract void o(g gVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i5, long j5) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        B(listAdapter).f689o.P((MenuItem) listAdapter.getItem(i5), this, p() ? 0 : 4);
    }

    protected boolean p() {
        return true;
    }

    public Rect q() {
        return this.f742o;
    }

    public abstract void s(View view);

    public void t(Rect rect) {
        this.f742o = rect;
    }

    public abstract void u(boolean z5);

    public abstract void v(int i5);

    public abstract void w(int i5);

    public abstract void x(PopupWindow.OnDismissListener onDismissListener);

    public abstract void y(boolean z5);

    public abstract void z(int i5);
}
