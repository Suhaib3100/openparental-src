package androidx.recyclerview.widget;

import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.core.util.p;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes.dex */
class l0 {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f9408c = false;

    /* renamed from: a, reason: collision with root package name */
    @m1
    final androidx.collection.i<RecyclerView.d0, a> f9409a = new androidx.collection.i<>();

    /* renamed from: b, reason: collision with root package name */
    @m1
    final androidx.collection.f<RecyclerView.d0> f9410b = new androidx.collection.f<>();

    /* compiled from: ViewInfoStore.java */
    static class a {

        /* renamed from: d, reason: collision with root package name */
        static final int f9411d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final int f9412e = 2;

        /* renamed from: f, reason: collision with root package name */
        static final int f9413f = 4;

        /* renamed from: g, reason: collision with root package name */
        static final int f9414g = 8;

        /* renamed from: h, reason: collision with root package name */
        static final int f9415h = 3;

        /* renamed from: i, reason: collision with root package name */
        static final int f9416i = 12;

        /* renamed from: j, reason: collision with root package name */
        static final int f9417j = 14;

        /* renamed from: k, reason: collision with root package name */
        static p.a<a> f9418k = new p.b(20);

        /* renamed from: a, reason: collision with root package name */
        int f9419a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        RecyclerView.m.d f9420b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        RecyclerView.m.d f9421c;

        private a() {
        }

        static void a() {
            while (f9418k.b() != null) {
            }
        }

        static a b() {
            a b6 = f9418k.b();
            return b6 == null ? new a() : b6;
        }

        static void c(a aVar) {
            aVar.f9419a = 0;
            aVar.f9420b = null;
            aVar.f9421c = null;
            f9418k.a(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    interface b {
        void a(RecyclerView.d0 d0Var);

        void b(RecyclerView.d0 d0Var, @q0 RecyclerView.m.d dVar, RecyclerView.m.d dVar2);

        void c(RecyclerView.d0 d0Var, @o0 RecyclerView.m.d dVar, @q0 RecyclerView.m.d dVar2);

        void d(RecyclerView.d0 d0Var, @o0 RecyclerView.m.d dVar, @o0 RecyclerView.m.d dVar2);
    }

    l0() {
    }

    private RecyclerView.m.d l(RecyclerView.d0 d0Var, int i5) {
        a q5;
        RecyclerView.m.d dVar;
        int h5 = this.f9409a.h(d0Var);
        if (h5 >= 0 && (q5 = this.f9409a.q(h5)) != null) {
            int i6 = q5.f9419a;
            if ((i6 & i5) != 0) {
                int i7 = (~i5) & i6;
                q5.f9419a = i7;
                if (i5 == 4) {
                    dVar = q5.f9420b;
                } else {
                    if (i5 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    dVar = q5.f9421c;
                }
                if ((i7 & 12) == 0) {
                    this.f9409a.n(h5);
                    a.c(q5);
                }
                return dVar;
            }
        }
        return null;
    }

    void a(RecyclerView.d0 d0Var, RecyclerView.m.d dVar) {
        a aVar = this.f9409a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f9409a.put(d0Var, aVar);
        }
        aVar.f9419a |= 2;
        aVar.f9420b = dVar;
    }

    void b(RecyclerView.d0 d0Var) {
        a aVar = this.f9409a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f9409a.put(d0Var, aVar);
        }
        aVar.f9419a |= 1;
    }

    void c(long j5, RecyclerView.d0 d0Var) {
        this.f9410b.p(j5, d0Var);
    }

    void d(RecyclerView.d0 d0Var, RecyclerView.m.d dVar) {
        a aVar = this.f9409a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f9409a.put(d0Var, aVar);
        }
        aVar.f9421c = dVar;
        aVar.f9419a |= 8;
    }

    void e(RecyclerView.d0 d0Var, RecyclerView.m.d dVar) {
        a aVar = this.f9409a.get(d0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f9409a.put(d0Var, aVar);
        }
        aVar.f9420b = dVar;
        aVar.f9419a |= 4;
    }

    void f() {
        this.f9409a.clear();
        this.f9410b.b();
    }

    RecyclerView.d0 g(long j5) {
        return this.f9410b.j(j5);
    }

    boolean h(RecyclerView.d0 d0Var) {
        a aVar = this.f9409a.get(d0Var);
        return (aVar == null || (aVar.f9419a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.d0 d0Var) {
        a aVar = this.f9409a.get(d0Var);
        return (aVar == null || (aVar.f9419a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.d0 d0Var) {
        p(d0Var);
    }

    @q0
    RecyclerView.m.d m(RecyclerView.d0 d0Var) {
        return l(d0Var, 8);
    }

    @q0
    RecyclerView.m.d n(RecyclerView.d0 d0Var) {
        return l(d0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.f9409a.size() - 1; size >= 0; size--) {
            RecyclerView.d0 l5 = this.f9409a.l(size);
            a n5 = this.f9409a.n(size);
            int i5 = n5.f9419a;
            if ((i5 & 3) == 3) {
                bVar.a(l5);
            } else if ((i5 & 1) != 0) {
                RecyclerView.m.d dVar = n5.f9420b;
                if (dVar == null) {
                    bVar.a(l5);
                } else {
                    bVar.c(l5, dVar, n5.f9421c);
                }
            } else if ((i5 & 14) == 14) {
                bVar.b(l5, n5.f9420b, n5.f9421c);
            } else if ((i5 & 12) == 12) {
                bVar.d(l5, n5.f9420b, n5.f9421c);
            } else if ((i5 & 4) != 0) {
                bVar.c(l5, n5.f9420b, null);
            } else if ((i5 & 8) != 0) {
                bVar.b(l5, n5.f9420b, n5.f9421c);
            }
            a.c(n5);
        }
    }

    void p(RecyclerView.d0 d0Var) {
        a aVar = this.f9409a.get(d0Var);
        if (aVar == null) {
            return;
        }
        aVar.f9419a &= -2;
    }

    void q(RecyclerView.d0 d0Var) {
        int A = this.f9410b.A() - 1;
        while (true) {
            if (A < 0) {
                break;
            }
            if (d0Var == this.f9410b.B(A)) {
                this.f9410b.w(A);
                break;
            }
            A--;
        }
        a remove = this.f9409a.remove(d0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
