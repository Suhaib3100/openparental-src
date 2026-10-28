package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
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
    private final h f9272a;

    /* renamed from: b, reason: collision with root package name */
    private final m0 f9273b;

    /* renamed from: c, reason: collision with root package name */
    private List<WeakReference<RecyclerView>> f9274c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    private final IdentityHashMap<RecyclerView.d0, x> f9275d = new IdentityHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private List<x> f9276e = new ArrayList();

    /* renamed from: f, reason: collision with root package name */
    private a f9277f = new a();

    /* renamed from: g, reason: collision with root package name */
    @o0
    private final h.a.b f9278g;

    /* renamed from: h, reason: collision with root package name */
    private final h0 f9279h;

    /* compiled from: ConcatAdapterController.java */
    /* loaded from: classes.dex */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        x f9280a;

        /* renamed from: b, reason: collision with root package name */
        int f9281b;

        /* renamed from: c, reason: collision with root package name */
        boolean f9282c;

        a() {
        }
    }

    i(h hVar, h.a aVar) {
        this.f9272a = hVar;
        if (aVar.f9261a) {
            this.f9273b = new m0.a();
        } else {
            this.f9273b = new m0.b();
        }
        h.a.b bVar = aVar.f9262b;
        this.f9278g = bVar;
        if (bVar == h.a.b.NO_STABLE_IDS) {
            this.f9279h = new h0.b();
        } else if (bVar == h.a.b.ISOLATED_STABLE_IDS) {
            this.f9279h = new h0.a();
        } else {
            if (bVar != h.a.b.SHARED_STABLE_IDS) {
                throw new IllegalArgumentException("unknown stable id mode");
            }
            this.f9279h = new h0.c();
        }
    }

    private void H(a aVar) {
        aVar.f9282c = false;
        aVar.f9280a = null;
        aVar.f9281b = -1;
        this.f9277f = aVar;
    }

    private void j() {
        RecyclerView.h.a l5 = l();
        if (l5 != this.f9272a.j()) {
            this.f9272a.M(l5);
        }
    }

    private RecyclerView.h.a l() {
        for (x xVar : this.f9276e) {
            RecyclerView.h.a j5 = xVar.f9608c.j();
            RecyclerView.h.a aVar = RecyclerView.h.a.PREVENT;
            if (j5 == aVar) {
                return aVar;
            }
            if (j5 == RecyclerView.h.a.PREVENT_WHEN_EMPTY && xVar.b() == 0) {
                return aVar;
            }
        }
        return RecyclerView.h.a.ALLOW;
    }

    private int m(x xVar) {
        x next;
        Iterator<x> it = this.f9276e.iterator();
        int i5 = 0;
        while (it.hasNext() && (next = it.next()) != xVar) {
            i5 += next.b();
        }
        return i5;
    }

    @o0
    private a n(int i5) {
        a aVar = this.f9277f;
        if (aVar.f9282c) {
            aVar = new a();
        } else {
            aVar.f9282c = true;
        }
        Iterator<x> it = this.f9276e.iterator();
        int i6 = i5;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            x next = it.next();
            if (next.b() > i6) {
                aVar.f9280a = next;
                aVar.f9281b = i6;
                break;
            }
            i6 -= next.b();
        }
        if (aVar.f9280a != null) {
            return aVar;
        }
        throw new IllegalArgumentException(androidx.appcompat.view.menu.s.a("Cannot find wrapper for ", i5));
    }

    @q0
    private x o(RecyclerView.h<RecyclerView.d0> hVar) {
        int x5 = x(hVar);
        if (x5 == -1) {
            return null;
        }
        return this.f9276e.get(x5);
    }

    @o0
    private x v(RecyclerView.d0 d0Var) {
        x xVar = this.f9275d.get(d0Var);
        if (xVar != null) {
            return xVar;
        }
        throw new IllegalStateException("Cannot find wrapper for " + d0Var + ", seems like it is not bound by this adapter: " + this);
    }

    private int x(RecyclerView.h<RecyclerView.d0> hVar) {
        int size = this.f9276e.size();
        for (int i5 = 0; i5 < size; i5++) {
            if (this.f9276e.get(i5).f9608c == hVar) {
                return i5;
            }
        }
        return -1;
    }

    private boolean y(RecyclerView recyclerView) {
        Iterator<WeakReference<RecyclerView>> it = this.f9274c.iterator();
        while (it.hasNext()) {
            if (it.next().get() == recyclerView) {
                return true;
            }
        }
        return false;
    }

    public void A(RecyclerView.d0 d0Var, int i5) {
        a n5 = n(i5);
        this.f9275d.put(d0Var, n5.f9280a);
        n5.f9280a.e(d0Var, n5.f9281b);
        H(n5);
    }

    public RecyclerView.d0 B(ViewGroup viewGroup, int i5) {
        return this.f9273b.a(i5).f(viewGroup, i5);
    }

    public void C(RecyclerView recyclerView) {
        int size = this.f9274c.size() - 1;
        while (true) {
            if (size < 0) {
                break;
            }
            WeakReference<RecyclerView> weakReference = this.f9274c.get(size);
            if (weakReference.get() == null) {
                this.f9274c.remove(size);
            } else if (weakReference.get() == recyclerView) {
                this.f9274c.remove(size);
                break;
            }
            size--;
        }
        Iterator<x> it = this.f9276e.iterator();
        while (it.hasNext()) {
            it.next().f9608c.A(recyclerView);
        }
    }

    public boolean D(RecyclerView.d0 d0Var) {
        x xVar = this.f9275d.get(d0Var);
        if (xVar != null) {
            boolean B = xVar.f9608c.B(d0Var);
            this.f9275d.remove(d0Var);
            return B;
        }
        throw new IllegalStateException("Cannot find wrapper for " + d0Var + ", seems like it is not bound by this adapter: " + this);
    }

    public void E(RecyclerView.d0 d0Var) {
        v(d0Var).f9608c.C(d0Var);
    }

    public void F(RecyclerView.d0 d0Var) {
        v(d0Var).f9608c.D(d0Var);
    }

    public void G(RecyclerView.d0 d0Var) {
        x xVar = this.f9275d.get(d0Var);
        if (xVar != null) {
            xVar.f9608c.E(d0Var);
            this.f9275d.remove(d0Var);
        } else {
            throw new IllegalStateException("Cannot find wrapper for " + d0Var + ", seems like it is not bound by this adapter: " + this);
        }
    }

    boolean I(RecyclerView.h<RecyclerView.d0> hVar) {
        int x5 = x(hVar);
        if (x5 == -1) {
            return false;
        }
        x xVar = this.f9276e.get(x5);
        int m5 = m(xVar);
        this.f9276e.remove(x5);
        this.f9272a.u(m5, xVar.b());
        Iterator<WeakReference<RecyclerView>> it = this.f9274c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                hVar.A(recyclerView);
            }
        }
        xVar.a();
        j();
        return true;
    }

    @Override // androidx.recyclerview.widget.x.b
    public void a(x xVar) {
        j();
    }

    @Override // androidx.recyclerview.widget.x.b
    public void b(@o0 x xVar, int i5, int i6, @q0 Object obj) {
        this.f9272a.s(i5 + m(xVar), i6, obj);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void c(@o0 x xVar, int i5, int i6) {
        this.f9272a.r(i5 + m(xVar), i6);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void d(@o0 x xVar, int i5, int i6) {
        this.f9272a.t(i5 + m(xVar), i6);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void e(@o0 x xVar, int i5, int i6) {
        int m5 = m(xVar);
        this.f9272a.q(i5 + m5, i6 + m5);
    }

    @Override // androidx.recyclerview.widget.x.b
    public void f(@o0 x xVar) {
        this.f9272a.m();
        j();
    }

    @Override // androidx.recyclerview.widget.x.b
    public void g(@o0 x xVar, int i5, int i6) {
        this.f9272a.u(i5 + m(xVar), i6);
    }

    boolean h(int i5, RecyclerView.h<RecyclerView.d0> hVar) {
        if (i5 < 0 || i5 > this.f9276e.size()) {
            throw new IndexOutOfBoundsException("Index must be between 0 and " + this.f9276e.size() + ". Given:" + i5);
        }
        if (w()) {
            androidx.core.util.q.b(hVar.l(), "All sub adapters must have stable ids when stable id mode is ISOLATED_STABLE_IDS or SHARED_STABLE_IDS");
        } else {
            hVar.l();
        }
        if (o(hVar) != null) {
            return false;
        }
        x xVar = new x(hVar, this, this.f9273b, this.f9279h.a());
        this.f9276e.add(i5, xVar);
        Iterator<WeakReference<RecyclerView>> it = this.f9274c.iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = it.next().get();
            if (recyclerView != null) {
                hVar.w(recyclerView);
            }
        }
        if (xVar.f9610e > 0) {
            this.f9272a.t(m(xVar), xVar.f9610e);
        }
        j();
        return true;
    }

    boolean i(RecyclerView.h<RecyclerView.d0> hVar) {
        return h(this.f9276e.size(), hVar);
    }

    public boolean k() {
        Iterator<x> it = this.f9276e.iterator();
        while (it.hasNext()) {
            if (!it.next().f9608c.d()) {
                return false;
            }
        }
        return true;
    }

    @q0
    public RecyclerView.h<? extends RecyclerView.d0> p(RecyclerView.d0 d0Var) {
        x xVar = this.f9275d.get(d0Var);
        if (xVar == null) {
            return null;
        }
        return xVar.f9608c;
    }

    public List<RecyclerView.h<? extends RecyclerView.d0>> q() {
        if (this.f9276e.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(this.f9276e.size());
        Iterator<x> it = this.f9276e.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f9608c);
        }
        return arrayList;
    }

    public long r(int i5) {
        a n5 = n(i5);
        long c6 = n5.f9280a.c(n5.f9281b);
        H(n5);
        return c6;
    }

    public int s(int i5) {
        a n5 = n(i5);
        int d6 = n5.f9280a.d(n5.f9281b);
        H(n5);
        return d6;
    }

    public int t(RecyclerView.h<? extends RecyclerView.d0> hVar, RecyclerView.d0 d0Var, int i5) {
        x xVar = this.f9275d.get(d0Var);
        if (xVar == null) {
            return -1;
        }
        int m5 = i5 - m(xVar);
        int g5 = xVar.f9608c.g();
        if (m5 >= 0 && m5 < g5) {
            return xVar.f9608c.f(hVar, d0Var, m5);
        }
        throw new IllegalStateException("Detected inconsistent adapter updates. The local position of the view holder maps to " + m5 + " which is out of bounds for the adapter with size " + g5 + ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:" + d0Var + "adapter:" + hVar);
    }

    public int u() {
        Iterator<x> it = this.f9276e.iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().b();
        }
        return i5;
    }

    public boolean w() {
        return this.f9278g != h.a.b.NO_STABLE_IDS;
    }

    public void z(RecyclerView recyclerView) {
        if (y(recyclerView)) {
            return;
        }
        this.f9274c.add(new WeakReference<>(recyclerView));
        Iterator<x> it = this.f9276e.iterator();
        while (it.hasNext()) {
            it.next().f9608c.w(recyclerView);
        }
    }
}
