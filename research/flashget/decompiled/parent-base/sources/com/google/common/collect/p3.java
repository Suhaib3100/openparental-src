package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import com.google.common.collect.f3;
import com.google.common.collect.i6;
import com.google.common.collect.j5;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: ImmutableRangeSet.java */
@w0
@d9.c
@d9.a
/* loaded from: classes6.dex */
public final class p3<C extends Comparable> extends k<C> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    private static final p3<Comparable<?>> f56082d = new p3<>(f3.H());

    /* renamed from: e, reason: collision with root package name */
    private static final p3<Comparable<?>> f56083e = new p3<>(f3.I(j5.a()));

    /* renamed from: b, reason: collision with root package name */
    private final transient f3<j5<C>> f56084b;

    /* renamed from: c, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient p3<C> f56085c;

    /* compiled from: ImmutableRangeSet.java */
    class a extends f3<j5<C>> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f56086d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ int f56087e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ j5 f56088f;

        a(int i4, int i5, j5 j5Var) {
            this.f56086d = i4;
            this.f56087e = i5;
            this.f56088f = j5Var;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public j5<C> get(int i4) {
            com.google.common.base.l0.C(i4, this.f56086d);
            return (i4 == 0 || i4 == this.f56086d + (-1)) ? ((j5) p3.this.f56084b.get(i4 + this.f56087e)).s(this.f56088f) : (j5) p3.this.f56084b.get(i4 + this.f56087e);
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f56086d;
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    private final class b extends w3<C> {

        /* renamed from: i, reason: collision with root package name */
        private final v0<C> f56090i;

        /* renamed from: j, reason: collision with root package name */
        @zc.a
        private transient Integer f56091j;

        /* compiled from: ImmutableRangeSet.java */
        class a extends com.google.common.collect.c<C> {

            /* renamed from: d, reason: collision with root package name */
            final Iterator<j5<C>> f56093d;

            /* renamed from: e, reason: collision with root package name */
            Iterator<C> f56094e = d4.l.f55558f;

            a() {
                this.f56093d = p3.this.f56084b.iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.f56094e.hasNext()) {
                    if (!this.f56093d.hasNext()) {
                        return (C) b();
                    }
                    this.f56094e = o0.Y0(this.f56093d.next(), b.this.f56090i).iterator();
                }
                return this.f56094e.next();
            }
        }

        /* compiled from: ImmutableRangeSet.java */
        /* renamed from: com.google.common.collect.p3$b$b, reason: collision with other inner class name */
        class C0852b extends com.google.common.collect.c<C> {

            /* renamed from: d, reason: collision with root package name */
            final Iterator<j5<C>> f56096d;

            /* renamed from: e, reason: collision with root package name */
            Iterator<C> f56097e = d4.l.f55558f;

            C0852b() {
                this.f56096d = p3.this.f56084b.Z().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public C a() {
                while (!this.f56097e.hasNext()) {
                    if (!this.f56096d.hasNext()) {
                        return (C) b();
                    }
                    this.f56097e = o0.Y0(this.f56096d.next(), b.this.f56090i).descendingIterator();
                }
                return this.f56097e.next();
            }
        }

        b(v0<C> v0Var) {
            super(x4.f56632f);
            this.f56090i = v0Var;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.w3
        /* renamed from: V0, reason: merged with bridge method [inline-methods] */
        public w3<C> u0(C c5, boolean z4) {
            return W0(j5.H(c5, x.forBoolean(z4)));
        }

        w3<C> W0(j5<C> j5Var) {
            return p3.this.n(j5Var).v(this.f56090i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.w3
        /* renamed from: X0, reason: merged with bridge method [inline-methods] */
        public w3<C> M0(C c5, boolean z4, C c6, boolean z5) {
            return (z4 || z5 || j5.h(c5, c6) != 0) ? W0(j5.B(c5, x.forBoolean(z4), c6, x.forBoolean(z5))) : v5.f56610j;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.w3
        /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
        public w3<C> Q0(C c5, boolean z4) {
            return W0(j5.l(c5, x.forBoolean(z4)));
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return p3.this.b((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.w3, java.util.NavigableSet
        @d9.c("NavigableSet")
        public Iterator descendingIterator() {
            return new C0852b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.w3
        int indexOf(@zc.a Object obj) {
            if (!contains(obj)) {
                return -1;
            }
            Objects.requireNonNull(obj);
            Comparable comparable = (Comparable) obj;
            e7 it = p3.this.f56084b.iterator();
            long j4 = 0;
            while (it.hasNext()) {
                if (((j5) it.next()).i(comparable)) {
                    return com.google.common.primitives.l.x(j4 + o0.Y0(r3, this.f56090i).indexOf(comparable));
                }
                j4 += o0.Y0(r3, this.f56090i).size();
            }
            throw new AssertionError(ProtectedSandApp.s("\uf50c"));
        }

        @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return new a();
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return p3.this.f56084b.j();
        }

        @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3
        /* renamed from: l */
        public e7<C> iterator() {
            return new a();
        }

        @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3
        Object m() {
            return new c(p3.this.f56084b, this.f56090i);
        }

        @Override // com.google.common.collect.w3
        w3<C> n0() {
            return new t0(this);
        }

        @Override // com.google.common.collect.w3
        @d9.c("NavigableSet")
        /* renamed from: p0 */
        public e7<C> descendingIterator() {
            return new C0852b();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer num = this.f56091j;
            if (num == null) {
                e7 it = p3.this.f56084b.iterator();
                long j4 = 0;
                while (it.hasNext()) {
                    j4 += o0.Y0((j5) it.next(), this.f56090i).size();
                    if (j4 >= 2147483647L) {
                        break;
                    }
                }
                num = Integer.valueOf(com.google.common.primitives.l.x(j4));
                this.f56091j = num;
            }
            return num.intValue();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return p3.this.f56084b.toString();
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    private static class c<C extends Comparable> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final f3<j5<C>> f56099b;

        /* renamed from: c, reason: collision with root package name */
        private final v0<C> f56100c;

        c(f3<j5<C>> f3Var, v0<C> v0Var) {
            this.f56099b = f3Var;
            this.f56100c = v0Var;
        }

        Object a() {
            return new p3(this.f56099b).v(this.f56100c);
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    public static class d<C extends Comparable<?>> {

        /* renamed from: a, reason: collision with root package name */
        private final List<j5<C>> f56101a = new ArrayList();

        @f9.a
        public d<C> a(j5<C> j5Var) {
            com.google.common.base.l0.u(!j5Var.u(), ProtectedSandApp.s("\uf50d"), j5Var);
            this.f56101a.add(j5Var);
            return this;
        }

        @f9.a
        public d<C> b(m5<C> m5Var) {
            return c(m5Var.p());
        }

        @f9.a
        public d<C> c(Iterable<j5<C>> iterable) {
            Iterator<j5<C>> it = iterable.iterator();
            while (it.hasNext()) {
                a(it.next());
            }
            return this;
        }

        public p3<C> d() {
            f3.a aVar = new f3.a(this.f56101a.size());
            Collections.sort(this.f56101a, j5.C());
            g5 T = d4.T(this.f56101a.iterator());
            while (T.hasNext()) {
                j5 j5Var = (j5) T.next();
                while (T.hasNext()) {
                    j5<C> j5Var2 = (j5) T.peek();
                    if (j5Var.t(j5Var2)) {
                        com.google.common.base.l0.y(j5Var.s(j5Var2).u(), ProtectedSandApp.s("\uf50e"), j5Var, j5Var2);
                        j5Var = j5Var.F((j5) T.next());
                    }
                }
                aVar.j(j5Var);
            }
            f3 e4 = aVar.e();
            return e4.isEmpty() ? p3.E() : (e4.size() == 1 && ((j5) c4.z(e4)).equals(j5.a())) ? p3.s() : new p3<>(e4);
        }

        @f9.a
        d<C> e(d<C> dVar) {
            c(dVar.f56101a);
            return this;
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    private final class e extends f3<j5<C>> {

        /* renamed from: d, reason: collision with root package name */
        private final boolean f56102d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f56103e;

        /* renamed from: f, reason: collision with root package name */
        private final int f56104f;

        /* JADX WARN: Multi-variable type inference failed */
        e() {
            boolean q4 = ((j5) p3.this.f56084b.get(0)).q();
            this.f56102d = q4;
            boolean r4 = ((j5) c4.w(p3.this.f56084b)).r();
            this.f56103e = r4;
            int size = p3.this.f56084b.size();
            size = q4 ? size : size - 1;
            this.f56104f = r4 ? size + 1 : size;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        /* renamed from: f0, reason: merged with bridge method [inline-methods] */
        public j5<C> get(int i4) {
            com.google.common.base.l0.C(i4, this.f56104f);
            return j5.k(this.f56102d ? i4 == 0 ? q0.c() : ((j5) p3.this.f56084b.get(i4 - 1)).f55873c : ((j5) p3.this.f56084b.get(i4)).f55873c, (this.f56103e && i4 == this.f56104f + (-1)) ? q0.a() : ((j5) p3.this.f56084b.get(i4 + (!this.f56102d ? 1 : 0))).f55872b);
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f56104f;
        }
    }

    /* compiled from: ImmutableRangeSet.java */
    private static final class f<C extends Comparable> implements Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final f3<j5<C>> f56106b;

        f(f3<j5<C>> f3Var) {
            this.f56106b = f3Var;
        }

        Object a() {
            return this.f56106b.isEmpty() ? p3.E() : this.f56106b.equals(f3.I(j5.a())) ? p3.s() : new p3(this.f56106b);
        }
    }

    p3(f3<j5<C>> f3Var) {
        this.f56084b = f3Var;
    }

    private f3<j5<C>> B(j5<C> j5Var) {
        if (this.f56084b.isEmpty() || j5Var.u()) {
            return f3.H();
        }
        if (j5Var.n(c())) {
            return this.f56084b;
        }
        int a5 = j5Var.q() ? i6.a(this.f56084b, j5.d.f55878b, j5Var.f55872b, i6.c.FIRST_AFTER, i6.b.NEXT_HIGHER) : 0;
        int a6 = (j5Var.r() ? i6.a(this.f56084b, j5.b.f55875b, j5Var.f55873c, i6.c.FIRST_PRESENT, i6.b.NEXT_HIGHER) : this.f56084b.size()) - a5;
        return a6 == 0 ? f3.H() : new a(a6, a5, j5Var);
    }

    public static <C extends Comparable> p3<C> E() {
        return f56082d;
    }

    public static <C extends Comparable> p3<C> F(j5<C> j5Var) {
        j5Var.getClass();
        return j5Var.u() ? f56082d : j5Var.equals(j5.a()) ? f56083e : new p3<>(f3.I(j5Var));
    }

    public static <C extends Comparable<?>> p3<C> I(Iterable<j5<C>> iterable) {
        return y(c7.u(iterable));
    }

    static <C extends Comparable> p3<C> s() {
        return f56083e;
    }

    public static <C extends Comparable<?>> d<C> w() {
        return new d<>();
    }

    public static <C extends Comparable> p3<C> y(m5<C> m5Var) {
        m5Var.getClass();
        if (m5Var.isEmpty()) {
            return f56082d;
        }
        if (m5Var.l(j5.a())) {
            return f56083e;
        }
        if (m5Var instanceof p3) {
            p3<C> p3Var = (p3) m5Var;
            if (!((p3) p3Var).f56084b.j()) {
                return p3Var;
            }
        }
        return new p3<>(f3.x(m5Var.p()));
    }

    public static <C extends Comparable<?>> p3<C> z(Iterable<j5<C>> iterable) {
        return new d().c(iterable).d();
    }

    public p3<C> A(m5<C> m5Var) {
        c7 t4 = c7.t(this);
        t4.q(m5Var);
        return y(t4);
    }

    public p3<C> C(m5<C> m5Var) {
        c7 t4 = c7.t(this);
        t4.q(m5Var.e());
        return y(t4);
    }

    boolean D() {
        return this.f56084b.j();
    }

    @Override // com.google.common.collect.m5
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public p3<C> n(j5<C> j5Var) {
        if (!this.f56084b.isEmpty()) {
            j5<C> c5 = c();
            if (j5Var.n(c5)) {
                return this;
            }
            if (j5Var.t(c5)) {
                return new p3<>(B(j5Var));
            }
        }
        return f56082d;
    }

    public p3<C> H(m5<C> m5Var) {
        return I(o1.j(p(), m5Var.p()));
    }

    Object J() {
        return new f(this.f56084b);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void a(j5<C> j5Var) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return super.b(comparable);
    }

    @Override // com.google.common.collect.m5
    public j5<C> c() {
        if (this.f56084b.isEmpty()) {
            throw new NoSuchElementException();
        }
        return j5.k(this.f56084b.get(0).f55872b, this.f56084b.get(r1.size() - 1).f55873c);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void d(j5<C> j5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean equals(@zc.a Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public boolean f(j5<C> j5Var) {
        int b5 = i6.b(this.f56084b, j5.w(), j5Var.f55872b, e5.c0(), i6.c.ANY_PRESENT, i6.b.NEXT_HIGHER);
        if (b5 < this.f56084b.size() && this.f56084b.get(b5).t(j5Var) && !this.f56084b.get(b5).s(j5Var).u()) {
            return true;
        }
        if (b5 > 0) {
            int i4 = b5 - 1;
            if (this.f56084b.get(i4).t(j5Var) && !this.f56084b.get(i4).s(j5Var).u()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void g(Iterable<j5<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void h(m5<C> m5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void i(Iterable<j5<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public boolean isEmpty() {
        return this.f56084b.isEmpty();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean j(m5 m5Var) {
        return super.j(m5Var);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    @zc.a
    public j5<C> k(C c5) {
        int b5 = i6.b(this.f56084b, j5.w(), q0.d(c5), e5.c0(), i6.c.ANY_PRESENT, i6.b.NEXT_LOWER);
        if (b5 == -1) {
            return null;
        }
        j5<C> j5Var = this.f56084b.get(b5);
        if (j5Var.i(c5)) {
            return j5Var;
        }
        return null;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public boolean l(j5<C> j5Var) {
        int b5 = i6.b(this.f56084b, j5.w(), j5Var.f55872b, e5.c0(), i6.c.ANY_PRESENT, i6.b.NEXT_LOWER);
        return b5 != -1 && this.f56084b.get(b5).n(j5Var);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean m(Iterable iterable) {
        return super.m(iterable);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public void q(m5<C> m5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.m5
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public q3<j5<C>> o() {
        return this.f56084b.isEmpty() ? q3.I() : new v5(this.f56084b.Z(), j5.C().v0());
    }

    @Override // com.google.common.collect.m5
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public q3<j5<C>> p() {
        return this.f56084b.isEmpty() ? q3.I() : new v5(this.f56084b, j5.C());
    }

    public w3<C> v(v0<C> v0Var) {
        v0Var.getClass();
        if (this.f56084b.isEmpty()) {
            return w3.w0();
        }
        j5<C> e4 = c().e(v0Var);
        if (!e4.q()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf510"));
        }
        if (!e4.r()) {
            try {
                v0Var.e();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf50f"));
            }
        }
        return new b(v0Var);
    }

    @Override // com.google.common.collect.m5
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public p3<C> e() {
        p3<C> p3Var = this.f56085c;
        if (p3Var != null) {
            return p3Var;
        }
        if (this.f56084b.isEmpty()) {
            p3<Comparable<?>> p3Var2 = f56083e;
            this.f56085c = p3Var2;
            return p3Var2;
        }
        if (this.f56084b.size() == 1 && this.f56084b.get(0).equals(j5.a())) {
            p3<Comparable<?>> p3Var3 = f56082d;
            this.f56085c = p3Var3;
            return p3Var3;
        }
        p3<C> p3Var4 = new p3<>(new e(), this);
        this.f56085c = p3Var4;
        return p3Var4;
    }

    private p3(f3<j5<C>> f3Var, p3<C> p3Var) {
        this.f56084b = f3Var;
        this.f56085c = p3Var;
    }
}
