package androidx.recyclerview.widget;

import androidx.annotation.m1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.collection.a3;
import androidx.collection.e1;
import androidx.core.util.v;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: ViewInfoStore.java */
/* loaded from: classes3.dex */
class l0 {

    /* renamed from: c, reason: collision with root package name */
    private static final boolean f33299c = false;

    /* renamed from: a, reason: collision with root package name */
    @m1
    final a3<RecyclerView.e0, a> f33300a = new a3<>();

    /* renamed from: b, reason: collision with root package name */
    @m1
    final e1<RecyclerView.e0> f33301b = new e1<>();

    /* compiled from: ViewInfoStore.java */
    static class a {

        /* renamed from: d, reason: collision with root package name */
        static final int f33302d = 1;

        /* renamed from: e, reason: collision with root package name */
        static final int f33303e = 2;

        /* renamed from: f, reason: collision with root package name */
        static final int f33304f = 4;

        /* renamed from: g, reason: collision with root package name */
        static final int f33305g = 8;

        /* renamed from: h, reason: collision with root package name */
        static final int f33306h = 3;

        /* renamed from: i, reason: collision with root package name */
        static final int f33307i = 12;

        /* renamed from: j, reason: collision with root package name */
        static final int f33308j = 14;

        /* renamed from: k, reason: collision with root package name */
        static v.a<a> f33309k = new v.b(20);

        /* renamed from: a, reason: collision with root package name */
        int f33310a;

        /* renamed from: b, reason: collision with root package name */
        @q0
        RecyclerView.m.d f33311b;

        /* renamed from: c, reason: collision with root package name */
        @q0
        RecyclerView.m.d f33312c;

        private a() {
        }

        static void a() {
            while (f33309k.acquire() != null) {
            }
        }

        static a b() {
            a acquire = f33309k.acquire();
            return acquire == null ? new a() : acquire;
        }

        static void c(a aVar) {
            aVar.f33310a = 0;
            aVar.f33311b = null;
            aVar.f33312c = null;
            f33309k.release(aVar);
        }
    }

    /* compiled from: ViewInfoStore.java */
    interface b {
        void a(RecyclerView.e0 e0Var, @q0 RecyclerView.m.d dVar, RecyclerView.m.d dVar2);

        void b(RecyclerView.e0 e0Var);

        void c(RecyclerView.e0 e0Var, @o0 RecyclerView.m.d dVar, @q0 RecyclerView.m.d dVar2);

        void d(RecyclerView.e0 e0Var, @o0 RecyclerView.m.d dVar, @o0 RecyclerView.m.d dVar2);
    }

    l0() {
    }

    private RecyclerView.m.d l(RecyclerView.e0 e0Var, int i4) {
        a valueAt;
        RecyclerView.m.d dVar;
        int indexOfKey = this.f33300a.indexOfKey(e0Var);
        if (indexOfKey >= 0 && (valueAt = this.f33300a.valueAt(indexOfKey)) != null) {
            int i5 = valueAt.f33310a;
            if ((i5 & i4) != 0) {
                int i6 = (~i4) & i5;
                valueAt.f33310a = i6;
                if (i4 == 4) {
                    dVar = valueAt.f33311b;
                } else {
                    if (i4 != 8) {
                        throw new IllegalArgumentException("Must provide flag PRE or POST");
                    }
                    dVar = valueAt.f33312c;
                }
                if ((i6 & 12) == 0) {
                    this.f33300a.removeAt(indexOfKey);
                    a.c(valueAt);
                }
                return dVar;
            }
        }
        return null;
    }

    void a(RecyclerView.e0 e0Var, RecyclerView.m.d dVar) {
        a aVar = this.f33300a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f33300a.put(e0Var, aVar);
        }
        aVar.f33310a |= 2;
        aVar.f33311b = dVar;
    }

    void b(RecyclerView.e0 e0Var) {
        a aVar = this.f33300a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f33300a.put(e0Var, aVar);
        }
        aVar.f33310a |= 1;
    }

    void c(long j4, RecyclerView.e0 e0Var) {
        this.f33301b.p(j4, e0Var);
    }

    void d(RecyclerView.e0 e0Var, RecyclerView.m.d dVar) {
        a aVar = this.f33300a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f33300a.put(e0Var, aVar);
        }
        aVar.f33312c = dVar;
        aVar.f33310a |= 8;
    }

    void e(RecyclerView.e0 e0Var, RecyclerView.m.d dVar) {
        a aVar = this.f33300a.get(e0Var);
        if (aVar == null) {
            aVar = a.b();
            this.f33300a.put(e0Var, aVar);
        }
        aVar.f33311b = dVar;
        aVar.f33310a |= 4;
    }

    void f() {
        this.f33300a.clear();
        this.f33301b.c();
    }

    RecyclerView.e0 g(long j4) {
        return this.f33301b.i(j4);
    }

    boolean h(RecyclerView.e0 e0Var) {
        a aVar = this.f33300a.get(e0Var);
        return (aVar == null || (aVar.f33310a & 1) == 0) ? false : true;
    }

    boolean i(RecyclerView.e0 e0Var) {
        a aVar = this.f33300a.get(e0Var);
        return (aVar == null || (aVar.f33310a & 4) == 0) ? false : true;
    }

    void j() {
        a.a();
    }

    public void k(RecyclerView.e0 e0Var) {
        p(e0Var);
    }

    @q0
    RecyclerView.m.d m(RecyclerView.e0 e0Var) {
        return l(e0Var, 8);
    }

    @q0
    RecyclerView.m.d n(RecyclerView.e0 e0Var) {
        return l(e0Var, 4);
    }

    void o(b bVar) {
        for (int size = this.f33300a.getSize() - 1; size >= 0; size--) {
            RecyclerView.e0 keyAt = this.f33300a.keyAt(size);
            a removeAt = this.f33300a.removeAt(size);
            int i4 = removeAt.f33310a;
            if ((i4 & 3) == 3) {
                bVar.b(keyAt);
            } else if ((i4 & 1) != 0) {
                RecyclerView.m.d dVar = removeAt.f33311b;
                if (dVar == null) {
                    bVar.b(keyAt);
                } else {
                    bVar.c(keyAt, dVar, removeAt.f33312c);
                }
            } else if ((i4 & 14) == 14) {
                bVar.a(keyAt, removeAt.f33311b, removeAt.f33312c);
            } else if ((i4 & 12) == 12) {
                bVar.d(keyAt, removeAt.f33311b, removeAt.f33312c);
            } else if ((i4 & 4) != 0) {
                bVar.c(keyAt, removeAt.f33311b, null);
            } else if ((i4 & 8) != 0) {
                bVar.a(keyAt, removeAt.f33311b, removeAt.f33312c);
            }
            a.c(removeAt);
        }
    }

    void p(RecyclerView.e0 e0Var) {
        a aVar = this.f33300a.get(e0Var);
        if (aVar == null) {
            return;
        }
        aVar.f33310a &= -2;
    }

    void q(RecyclerView.e0 e0Var) {
        int z4 = this.f33301b.z() - 1;
        while (true) {
            if (z4 < 0) {
                break;
            }
            if (e0Var == this.f33301b.A(z4)) {
                this.f33301b.u(z4);
                break;
            }
            z4--;
        }
        a remove = this.f33300a.remove(e0Var);
        if (remove != null) {
            a.c(remove);
        }
    }
}
