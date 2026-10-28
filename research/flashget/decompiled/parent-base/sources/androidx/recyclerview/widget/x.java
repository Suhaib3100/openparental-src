package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.m0;

/* compiled from: NestedAdapterWrapper.java */
/* loaded from: classes3.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final m0.c f33473a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final h0.d f33474b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.h<RecyclerView.e0> f33475c;

    /* renamed from: d, reason: collision with root package name */
    final b f33476d;

    /* renamed from: e, reason: collision with root package name */
    int f33477e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.j f33478f = new a();

    /* compiled from: NestedAdapterWrapper.java */
    class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            x xVar = x.this;
            xVar.f33477e = xVar.f33475c.getItemCount();
            x xVar2 = x.this;
            xVar2.f33476d.f(xVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i4, int i5) {
            x xVar = x.this;
            xVar.f33476d.a(xVar, i4, i5, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i4, int i5, @q0 Object obj) {
            x xVar = x.this;
            xVar.f33476d.a(xVar, i4, i5, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i4, int i5) {
            x xVar = x.this;
            xVar.f33477e += i5;
            xVar.f33476d.b(xVar, i4, i5);
            x xVar2 = x.this;
            if (xVar2.f33477e <= 0 || xVar2.f33475c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            x xVar3 = x.this;
            xVar3.f33476d.d(xVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i4, int i5, int i6) {
            androidx.core.util.w.b(i6 == 1, "moving more than 1 item is not supported in RecyclerView");
            x xVar = x.this;
            xVar.f33476d.c(xVar, i4, i5);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i4, int i5) {
            x xVar = x.this;
            xVar.f33477e -= i5;
            xVar.f33476d.g(xVar, i4, i5);
            x xVar2 = x.this;
            if (xVar2.f33477e >= 1 || xVar2.f33475c.getStateRestorationPolicy() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            x xVar3 = x.this;
            xVar3.f33476d.d(xVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            x xVar = x.this;
            xVar.f33476d.d(xVar);
        }
    }

    /* compiled from: NestedAdapterWrapper.java */
    interface b {
        void a(@o0 x xVar, int i4, int i5, @q0 Object obj);

        void b(@o0 x xVar, int i4, int i5);

        void c(@o0 x xVar, int i4, int i5);

        void d(x xVar);

        void e(@o0 x xVar, int i4, int i5);

        void f(@o0 x xVar);

        void g(@o0 x xVar, int i4, int i5);
    }

    x(RecyclerView.h<RecyclerView.e0> hVar, b bVar, m0 m0Var, h0.d dVar) {
        this.f33475c = hVar;
        this.f33476d = bVar;
        this.f33473a = m0Var.b(this);
        this.f33474b = dVar;
        this.f33477e = hVar.getItemCount();
        hVar.registerAdapterDataObserver(this.f33478f);
    }

    void a() {
        this.f33475c.unregisterAdapterDataObserver(this.f33478f);
        this.f33473a.dispose();
    }

    int b() {
        return this.f33477e;
    }

    public long c(int i4) {
        return this.f33474b.a(this.f33475c.getItemId(i4));
    }

    int d(int i4) {
        return this.f33473a.b(this.f33475c.getItemViewType(i4));
    }

    void e(RecyclerView.e0 e0Var, int i4) {
        this.f33475c.bindViewHolder(e0Var, i4);
    }

    RecyclerView.e0 f(ViewGroup viewGroup, int i4) {
        return this.f33475c.onCreateViewHolder(viewGroup, this.f33473a.a(i4));
    }
}
