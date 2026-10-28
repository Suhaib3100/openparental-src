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
/* loaded from: classes.dex */
public abstract class m implements r, o, AdapterView.OnItemClickListener {

    /* renamed from: b, reason: collision with root package name */
    private Rect f1290b;

    m() {
    }

    protected static boolean B(h hVar) {
        int size = hVar.size();
        for (int i4 = 0; i4 < size; i4++) {
            MenuItem item = hVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                return true;
            }
        }
        return false;
    }

    protected static g C(ListAdapter listAdapter) {
        return listAdapter instanceof HeaderViewListAdapter ? (g) ((HeaderViewListAdapter) listAdapter).getWrappedAdapter() : (g) listAdapter;
    }

    protected static int s(ListAdapter listAdapter, ViewGroup viewGroup, Context context, int i4) {
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int count = listAdapter.getCount();
        int i5 = 0;
        int i6 = 0;
        View view = null;
        for (int i7 = 0; i7 < count; i7++) {
            int itemViewType = listAdapter.getItemViewType(i7);
            if (itemViewType != i6) {
                view = null;
                i6 = itemViewType;
            }
            if (viewGroup == null) {
                viewGroup = new FrameLayout(context);
            }
            view = listAdapter.getView(i7, view, viewGroup);
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            int measuredWidth = view.getMeasuredWidth();
            if (measuredWidth >= i4) {
                return i4;
            }
            if (measuredWidth > i5) {
                i5 = measuredWidth;
            }
        }
        return i5;
    }

    public abstract void A(int i4);

    @Override // androidx.appcompat.view.menu.o
    public int a() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean e(h hVar, k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public p i(ViewGroup viewGroup) {
        throw new UnsupportedOperationException("MenuPopups manage their own views");
    }

    @Override // androidx.appcompat.view.menu.o
    public boolean m(h hVar, k kVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.o
    public void n(@o0 Context context, @q0 h hVar) {
    }

    public abstract void o(h hVar);

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i4, long j4) {
        ListAdapter listAdapter = (ListAdapter) adapterView.getAdapter();
        C(listAdapter).f1237b.P((MenuItem) listAdapter.getItem(i4), this, p() ? 0 : 4);
    }

    protected boolean p() {
        return true;
    }

    public Rect r() {
        return this.f1290b;
    }

    public abstract void t(View view);

    public void u(Rect rect) {
        this.f1290b = rect;
    }

    public abstract void v(boolean z4);

    public abstract void w(int i4);

    public abstract void x(int i4);

    public abstract void y(PopupWindow.OnDismissListener onDismissListener);

    public abstract void z(boolean z4);
}
