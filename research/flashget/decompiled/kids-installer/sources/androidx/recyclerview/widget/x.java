package androidx.recyclerview.widget;

import android.view.ViewGroup;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h0;
import androidx.recyclerview.widget.m0;

/* compiled from: NestedAdapterWrapper.java */
/* loaded from: classes.dex */
class x {

    /* renamed from: a, reason: collision with root package name */
    @o0
    private final m0.c f9606a;

    /* renamed from: b, reason: collision with root package name */
    @o0
    private final h0.d f9607b;

    /* renamed from: c, reason: collision with root package name */
    public final RecyclerView.h<RecyclerView.d0> f9608c;

    /* renamed from: d, reason: collision with root package name */
    final b f9609d;

    /* renamed from: e, reason: collision with root package name */
    int f9610e;

    /* renamed from: f, reason: collision with root package name */
    private RecyclerView.j f9611f = new a();

    /* compiled from: NestedAdapterWrapper.java */
    /* loaded from: classes3.dex */
    class a extends RecyclerView.j {
        a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            x xVar = x.this;
            xVar.f9610e = xVar.f9608c.g();
            x xVar2 = x.this;
            xVar2.f9609d.f(xVar2);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void b(int i5, int i6) {
            x xVar = x.this;
            xVar.f9609d.b(xVar, i5, i6, null);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void c(int i5, int i6, @q0 Object obj) {
            x xVar = x.this;
            xVar.f9609d.b(xVar, i5, i6, obj);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void d(int i5, int i6) {
            x xVar = x.this;
            xVar.f9610e += i6;
            xVar.f9609d.d(xVar, i5, i6);
            x xVar2 = x.this;
            if (xVar2.f9610e <= 0 || xVar2.f9608c.j() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            x xVar3 = x.this;
            xVar3.f9609d.a(xVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void e(int i5, int i6, int i7) {
            androidx.core.util.q.b(i7 == 1, "moving more than 1 item is not supported in RecyclerView");
            x xVar = x.this;
            xVar.f9609d.e(xVar, i5, i6);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void f(int i5, int i6) {
            x xVar = x.this;
            xVar.f9610e -= i6;
            xVar.f9609d.g(xVar, i5, i6);
            x xVar2 = x.this;
            if (xVar2.f9610e >= 1 || xVar2.f9608c.j() != RecyclerView.h.a.PREVENT_WHEN_EMPTY) {
                return;
            }
            x xVar3 = x.this;
            xVar3.f9609d.a(xVar3);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public void g() {
            x xVar = x.this;
            xVar.f9609d.a(xVar);
        }
    }

    /* compiled from: NestedAdapterWrapper.java */
    interface b {
        void a(x xVar);

        void b(@o0 x xVar, int i5, int i6, @q0 Object obj);

        void c(@o0 x xVar, int i5, int i6);

        void d(@o0 x xVar, int i5, int i6);

        void e(@o0 x xVar, int i5, int i6);

        void f(@o0 x xVar);

        void g(@o0 x xVar, int i5, int i6);
    }

    x(RecyclerView.h<RecyclerView.d0> hVar, b bVar, m0 m0Var, h0.d dVar) {
        this.f9608c = hVar;
        this.f9609d = bVar;
        this.f9606a = m0Var.b(this);
        this.f9607b = dVar;
        this.f9610e = hVar.g();
        hVar.F(this.f9611f);
    }

    void a() {
        this.f9608c.I(this.f9611f);
        this.f9606a.g();
    }

    int b() {
        return this.f9610e;
    }

    public long c(int i5) {
        return this.f9607b.a(this.f9608c.h(i5));
    }

    int d(int i5) {
        return this.f9606a.i(this.f9608c.i(i5));
    }

    void e(RecyclerView.d0 d0Var, int i5) {
        this.f9608c.c(d0Var, i5);
    }

    RecyclerView.d0 f(ViewGroup viewGroup, int i5) {
        return this.f9608c.z(viewGroup, this.f9606a.h(i5));
    }
}
