package androidx.recyclerview.widget;

import android.util.Pair;
import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.n1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.m0;
import androidx.recyclerview.widget.x;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

/* compiled from: ConcatAdapterController.java */
/* loaded from: classes3.dex */
class i implements x.b {

    /* renamed from: a, reason: collision with root package name */
    private final h f33175a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f33176b;

    /* renamed from: c, reason: collision with root package name */
    private List<WeakReference<RecyclerView>> f33177c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final IdentityHashMap<RecyclerView.e0, x> f33178d = new IdentityHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private List<x> f33179e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private a f33180f = new a();

    /* renamed from: g, reason: collision with root package name */
    @o0
    private final h.a.b f33181g;

    /* renamed from: h, reason: collision with root package name */
    private final h0 f33182h;

    /* compiled from: ConcatAdapterController.java */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        x f33183a;

        /* renamed from: b, reason: collision with root package name */
        int f33184b;

        /* renamed from: c, reason: collision with root package name */
        boolean f33185c;

        a() {
        }
    }

    i(h hVar, h.a aVar) {
        this.f33175a = hVar;
        if (aVar.f33164a) {
            this.f33176b = new m0.a();
        } else {
            this.f33176b = new m0.b();
        }
        h.a.b bVar = aVar.f33165b;
        this.f33181g = bVar;
        if (bVar == h.a.b.NO_STABLE_IDS) {
            this.f33182h = new h0.b();
        } else if (bVar == h.a.b.ISOLATED_STABLE_IDS) {
            this.f33182h = new h0.a();
        } else {
            if (bVar != h.a.b.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f33182h = new h0.c();
        }
    }

    private void I(a aVar) {
        aVar.f33185c = false;
        aVar.f33183a = null;
        aVar.f33184b = -1;
        this.f33180f = aVar;
    }

    private void j() {
        RecyclerView.h.a l4 = l();
        if (l4 != this.f33175a.getStateRestorationPolicy()) {
            this.f33175a.h(l4);
        }
    }

    private RecyclerView.h.a l() {
        for (x xVar : this.f33179e) {
            RecyclerView.h.a stateRestorationPolicy = xVar.f33475c.getStateRestorationPolicy();
            RecyclerView.h.a aVar = RecyclerView.h.a.PREVENT;
            if (stateRestorationPolicy == aVar) {
                return aVar;
            }
            if (stateRestorationPolicy == RecyclerView.h.a.PREVENT_WHEN_EMPTY && xVar.b() == 0) {
                return aVar;
            }
        }
        return RecyclerView.h.a.ALLOW;
    }

    private int m(x xVar) {
        x next;
        Iterator<x> it = this.f33179e.iterator();
        int i4 = 0;
        while (it.hasNext() && (next = it.next()) != xVar) {
            i4 += next.b();
        }
        return i4;
    }

    @o0
    private a n(int i4) {
        a aVar = this.f33180f;
        if (aVar.f33185c) {
            aVar = new a();
        } else {
            aVar.f33185c = true;
        }
        Iterator<x> it = this.f33179e.iterator();
        int i5 = i4;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            x next = it.next();
            if (next.b() > i5) {
                aVar.f33183a = next;
                aVar.f33184b = i5;
                break;
            }
            i5 -= next.b();
        }
        if (aVar.f33183a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a("Cannot find wrapper for ", i4));
    }

    @q0
    private x o(RecyclerView.h<RecyclerView.e0> hVar) {
        int y4 = y(hVar);
        if (y4 == -1) {
            return null;
        }
        return this.f33179e.get(y4);
    }

    @o0
    private x w(RecyclerView.e0 e0Var) {
        x xVar = this.f33178d.get(e0Var);
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }

    private int y(RecyclerView.h<RecyclerView.e0> hVar) {
        int size = this.f33179e.size();
        for (int i4 = 0; i4 < size; i4++) {
            if (this.f33179e.get(i4).f33475c == hVar) {
                return i4;
            }
        }
        return -1;
    }

    private boolean z(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.f33177c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void A(RecyclerView recyclerView) {
        if (z(recyclerView)) {
            return;
        }
        this.f33177c.add(new WeakReference<>(recyclerView));
        Iterator<x> it = this.f33179e.iterator();
        while (it.hasNext()) {
            it.next().f33475c.onAttachedToRecyclerView(recyclerView);
        }
    }

    public void B(RecyclerView.e0 e0Var, int i4) {
        a n4 = n(i4);
        this.f33178d.put(e0Var, n4.f33183a);
        n4.f33183a.e(e0Var, n4.f33184b);
        I(n4);
    }

    public RecyclerView.e0 C(ViewGroup viewGroup, int i4) {
        return this.f33176b.a(i4).f(viewGroup, i4);
    }

    public void D(RecyclerView recyclerView) {
        int size = this.f33177c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f33177c.get(size);
            if (weakReference.get() == null) {
                this.f33177c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f33177c.remove(size);
                break;
            }
            size--;
        }
        Iterator<x> it = this.f33179e.iterator();
        while (it.hasNext()) {
            it.next().f33475c.onDetachedFromRecyclerView(recyclerView);
        }
    }

    public boolean E(RecyclerView.e0 e0Var) {
        x xVar = this.f33178d.get(e0Var);
        if (xVar != null) {
            boolean onFailedToRecycleView = xVar.f33475c.onFailedToRecycleView(e0Var);
            this.f33178d.remove(e0Var);
            return onFailedToRecycleView;
        }
        throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public void F(RecyclerView.e0 e0Var) {
        w(e0Var).f33475c.onViewAttachedToWindow(e0Var);
    }

    public void G(RecyclerView.e0 e0Var) {
        w(e0Var).f33475c.onViewDetachedFromWindow(e0Var);
    }

    public void H(RecyclerView.e0 e0Var) {
        x xVar = this.f33178d.get(e0Var);
        if (xVar != null) {
            xVar.f33475c.onViewRecycled(e0Var);
            this.f33178d.remove(e0Var);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + e0Var + ", seems like it is not bound by this adapter: " + this);
        }
    }

    boolean J(RecyclerView.h<RecyclerView.e0> hVar) {
        int y4 = y(hVar);
        if (y4 == -1) {
            return false;
        }
        x xVar = this.f33179e.get(y4);
        int m4 = m(xVar);
        this.f33179e.remove(y4);
        this.f33175a.notifyItemRangeRemoved(m4, xVar.b());
        Iterator<WeakReference<RecyclerView>> it = this.f33177c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                hVar.onDetachedFromRecyclerView(recyclerView);
            }
        }
        xVar.a();
        j();
        return true;
    }

    @Override // androidx.recyclerview.widget.x.b
    public void a(@o0 x xVar, int i4, int i5, @q0 Object obj) {
        this.f33175a.notifyItemRangeChanged(i4 + m(xVar), i5, obj);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void b(@o0 x xVar, int i4, int i5) {
        this.f33175a.notifyItemRangeInserted(i4 + m(xVar), i5);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void c(@o0 x xVar, int i4, int i5) {
        int m4 = m(xVar);
        this.f33175a.notifyItemMoved(i4 + m4, i5 + m4);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void d(x xVar) {
        j();
    }

    @Override // androidx.recyclerview.widget.x.b
    public void e(@o0 x xVar, int i4, int i5) {
        this.f33175a.notifyItemRangeChanged(i4 + m(xVar), i5);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void f(@o0 x xVar) {
        this.f33175a.notifyDataSetChanged();
        j();
    }

    @Override // androidx.recyclerview.widget.x.b
    public void g(@o0 x xVar, int i4, int i5) {
        this.f33175a.notifyItemRangeRemoved(i4 + m(xVar), i5);
    }

    boolean h(int i4, RecyclerView.h<RecyclerView.e0> hVar) {
        if (i4 < 0 || i4 > this.f33179e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f33179e.size() + ". Given:" + i4);
        }
        if (x()) {
            androidx.core.util.w.b(hVar.hasStableIds(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            hVar.hasStableIds();
        }
        if (o(hVar) != null) {
            return false;
        }
        x xVar = new x(hVar, this, this.f33176b, this.f33182h.a());
        this.f33179e.add(i4, xVar);
        Iterator<WeakReference<RecyclerView>> it = this.f33177c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                hVar.onAttachedToRecyclerView(recyclerView);
            }
        }
        if (xVar.f33477e > 0) {
            this.f33175a.notifyItemRangeInserted(m(xVar), xVar.f33477e);
        }
        j();
        return true;
    }

    boolean i(RecyclerView.h<RecyclerView.e0> hVar) {
        return h(this.f33179e.size(), hVar);
    }

    public boolean k() {
        Iterator<x> it = this.f33179e.iterator();
        while (it.hasNext()) {
            if (!it.next().f33475c.canRestoreState()) {
                return false;
            }
        }
        return true;
    }

    @q0
    public RecyclerView.h<? extends RecyclerView.e0> p(RecyclerView.e0 e0Var) {
        x xVar = this.f33178d.get(e0Var);
        if (xVar == null) {
            return null;
        }
        return xVar.f33475c;
    }

    public List<RecyclerView.h<? extends RecyclerView.e0>> q() {
        if (this.f33179e.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f33179e.size());
        Iterator<x> it = this.f33179e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f33475c);
        }
        return arrayList;
    }

    public long r(int i4) {
        a n4 = n(i4);
        long c5 = n4.f33183a.c(n4.f33184b);
        I(n4);
        return c5;
    }

    public int s(int i4) {
        a n4 = n(i4);
        int d5 = n4.f33183a.d(n4.f33184b);
        I(n4);
        return d5;
    }

    public int t(RecyclerView.h<? extends RecyclerView.e0> hVar, RecyclerView.e0 e0Var, int i4) {
        x xVar = this.f33178d.get(e0Var);
        if (xVar == null) {
            return -1;
        }
        int m4 = i4 - m(xVar);
        int itemCount = xVar.f33475c.getItemCount();
        if (m4 >= 0 && m4 < itemCount) {
            return xVar.f33475c.findRelativeAdapterPositionIn(hVar, e0Var, m4);
        }
        StringBuilder a5 = n1.a("Detected inconsistent adapter updates. The local position of the view holder maps to ", m4, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        a5.append(e0Var);
        a5.append("adapter:");
        a5.append(hVar);
        throw new IllegalStateException(a5.toString());
    }

    public int u() {
        Iterator<x> it = this.f33179e.iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().b();
        }
        return i4;
    }

    public Pair<RecyclerView.h<? extends RecyclerView.e0>, Integer> v(int i4) {
        a n4 = n(i4);
        Pair<RecyclerView.h<? extends RecyclerView.e0>, Integer> pair = new Pair<>(n4.f33183a.f33475c, Integer.valueOf(n4.f33184b));
        I(n4);
        return pair;
    }

    public boolean x() {
        return this.f33181g != h.a.b.NO_STABLE_IDS;
    }
}
