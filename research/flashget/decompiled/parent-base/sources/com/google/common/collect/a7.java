package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: TreeMultiset.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class a7<E> extends o<E> implements Serializable {

    /* renamed from: i, reason: collision with root package name */
    @d9.c
    private static final long f55349i = 1;

    /* renamed from: f, reason: collision with root package name */
    private final transient g<f<E>> f55350f;

    /* renamed from: g, reason: collision with root package name */
    private final transient q2<E> f55351g;

    /* renamed from: h, reason: collision with root package name */
    private final transient f<E> f55352h;

    /* compiled from: TreeMultiset.java */
    class a extends v4.f<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f55353b;

        a(f fVar) {
            this.f55353b = fVar;
        }

        @Override // com.google.common.collect.u4.a
        public int getCount() {
            int w4 = this.f55353b.w();
            return w4 == 0 ? a7.this.W2(getElement()) : w4;
        }

        @Override // com.google.common.collect.u4.a
        @f5
        public E getElement() {
            return (E) this.f55353b.x();
        }
    }

    /* compiled from: TreeMultiset.java */
    class b implements Iterator<u4.a<E>> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        f<E> f55355b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        u4.a<E> f55356c;

        b() {
            this.f55355b = a7.this.L();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u4.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            a7 a7Var = a7.this;
            f<E> fVar = this.f55355b;
            Objects.requireNonNull(fVar);
            u4.a<E> r4 = a7.r(a7Var, fVar);
            this.f55356c = r4;
            if (f.l(this.f55355b) == a7.this.f55352h) {
                this.f55355b = null;
            } else {
                this.f55355b = f.l(this.f55355b);
            }
            return r4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f55355b == null) {
                return false;
            }
            if (!a7.this.f55351g.p(this.f55355b.x())) {
                return true;
            }
            this.f55355b = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.l0.h0(this.f55356c != null, ProtectedSandApp.s("\uf448"));
            a7.this.o0(this.f55356c.getElement(), 0);
            this.f55356c = null;
        }
    }

    /* compiled from: TreeMultiset.java */
    class c implements Iterator<u4.a<E>> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        f<E> f55358b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        u4.a<E> f55359c = null;

        c() {
            this.f55358b = a7.this.O();
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public u4.a<E> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            Objects.requireNonNull(this.f55358b);
            u4.a<E> r4 = a7.r(a7.this, this.f55358b);
            this.f55359c = r4;
            if (f.c(this.f55358b) == a7.this.f55352h) {
                this.f55358b = null;
            } else {
                this.f55358b = f.c(this.f55358b);
            }
            return r4;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f55358b == null) {
                return false;
            }
            if (!a7.this.f55351g.q(this.f55358b.x())) {
                return true;
            }
            this.f55358b = null;
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.l0.h0(this.f55359c != null, ProtectedSandApp.s("\uf449"));
            a7.this.o0(this.f55359c.getElement(), 0);
            this.f55359c = null;
        }
    }

    /* compiled from: TreeMultiset.java */
    static /* synthetic */ class d {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f55361a;

        static {
            int[] iArr = new int[x.values().length];
            f55361a = iArr;
            try {
                iArr[x.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55361a[x.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TreeMultiset.java */
    private static abstract class e {
        public static final e SIZE = new a(ProtectedSandApp.s("\uf44a"), 0);
        public static final e DISTINCT = new b(ProtectedSandApp.s("\uf44b"), 1);
        private static final /* synthetic */ e[] $VALUES = $values();

        /* compiled from: TreeMultiset.java */
        enum a extends e {
            a(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.collect.a7.e
            int nodeAggregate(f<?> fVar) {
                return ((f) fVar).f55363b;
            }

            @Override // com.google.common.collect.a7.e
            long treeAggregate(@zc.a f<?> fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return ((f) fVar).f55365d;
            }
        }

        /* compiled from: TreeMultiset.java */
        enum b extends e {
            b(String str, int i4) {
                super(str, i4, null);
            }

            @Override // com.google.common.collect.a7.e
            int nodeAggregate(f<?> fVar) {
                return 1;
            }

            @Override // com.google.common.collect.a7.e
            long treeAggregate(@zc.a f<?> fVar) {
                if (fVar == null) {
                    return 0L;
                }
                return ((f) fVar).f55364c;
            }
        }

        private static /* synthetic */ e[] $values() {
            return new e[]{SIZE, DISTINCT};
        }

        private e(String str, int i4) {
        }

        public static e valueOf(String str) {
            return (e) Enum.valueOf(e.class, str);
        }

        public static e[] values() {
            return (e[]) $VALUES.clone();
        }

        abstract int nodeAggregate(f<?> fVar);

        abstract long treeAggregate(@zc.a f<?> fVar);

        /* synthetic */ e(String str, int i4, a aVar) {
            this(str, i4);
        }
    }

    /* compiled from: TreeMultiset.java */
    private static final class g<T> {

        /* renamed from: a, reason: collision with root package name */
        @zc.a
        private T f55371a;

        private g() {
        }

        public void a(@zc.a T t4, @zc.a T t5) {
            if (this.f55371a != t4) {
                throw new ConcurrentModificationException();
            }
            this.f55371a = t5;
        }

        void b() {
            this.f55371a = null;
        }

        @zc.a
        public T c() {
            return this.f55371a;
        }

        g(a aVar) {
        }
    }

    a7(g<f<E>> gVar, q2<E> q2Var, f<E> fVar) {
        super(q2Var.b());
        this.f55350f = gVar;
        this.f55351g = q2Var;
        this.f55352h = fVar;
    }

    private long A(e eVar, @zc.a f<E> fVar) {
        long treeAggregate;
        long A;
        if (fVar == null) {
            return 0L;
        }
        int compare = this.f55983d.compare(this.f55351g.i(), fVar.x());
        if (compare > 0) {
            return A(eVar, ((f) fVar).f55368g);
        }
        if (compare == 0) {
            int i4 = d.f55361a[this.f55351g.h().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return eVar.treeAggregate(((f) fVar).f55368g);
                }
                throw new AssertionError();
            }
            treeAggregate = eVar.nodeAggregate(fVar);
            A = eVar.treeAggregate(((f) fVar).f55368g);
        } else {
            treeAggregate = eVar.treeAggregate(((f) fVar).f55368g) + eVar.nodeAggregate(fVar);
            A = A(eVar, ((f) fVar).f55367f);
        }
        return treeAggregate + A;
    }

    private long D(e eVar, @zc.a f<E> fVar) {
        long treeAggregate;
        long D;
        if (fVar == null) {
            return 0L;
        }
        int compare = this.f55983d.compare(this.f55351g.g(), fVar.x());
        if (compare < 0) {
            return D(eVar, ((f) fVar).f55367f);
        }
        if (compare == 0) {
            int i4 = d.f55361a[this.f55351g.f().ordinal()];
            if (i4 != 1) {
                if (i4 == 2) {
                    return eVar.treeAggregate(((f) fVar).f55367f);
                }
                throw new AssertionError();
            }
            treeAggregate = eVar.nodeAggregate(fVar);
            D = eVar.treeAggregate(((f) fVar).f55367f);
        } else {
            treeAggregate = eVar.treeAggregate(((f) fVar).f55367f) + eVar.nodeAggregate(fVar);
            D = D(eVar, ((f) fVar).f55368g);
        }
        return treeAggregate + D;
    }

    private long F(e eVar) {
        f<E> c5 = this.f55350f.c();
        long treeAggregate = eVar.treeAggregate(c5);
        if (this.f55351g.j()) {
            treeAggregate -= D(eVar, c5);
        }
        return this.f55351g.k() ? treeAggregate - A(eVar, c5) : treeAggregate;
    }

    public static <E extends Comparable> a7<E> G() {
        return new a7<>(x4.f56632f);
    }

    public static <E extends Comparable> a7<E> H(Iterable<? extends E> iterable) {
        a7<E> G = G();
        c4.a(G, iterable);
        return G;
    }

    public static <E> a7<E> I(@zc.a Comparator<? super E> comparator) {
        return comparator == null ? new a7<>(x4.f56632f) : new a7<>(comparator);
    }

    static int K(@zc.a f<?> fVar) {
        if (fVar == null) {
            return 0;
        }
        return ((f) fVar).f55364c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    public f<E> L() {
        f<E> l4;
        f<E> c5 = this.f55350f.c();
        if (c5 == null) {
            return null;
        }
        if (this.f55351g.j()) {
            E g4 = this.f55351g.g();
            l4 = c5.s(this.f55983d, g4);
            if (l4 == null) {
                return null;
            }
            if (this.f55351g.f() == x.OPEN && this.f55983d.compare(g4, l4.x()) == 0) {
                l4 = f.l(l4);
            }
        } else {
            l4 = f.l(this.f55352h);
        }
        if (l4 == this.f55352h || !this.f55351g.c(l4.x())) {
            return null;
        }
        return l4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    public f<E> O() {
        f<E> c5;
        f<E> c6 = this.f55350f.c();
        if (c6 == null) {
            return null;
        }
        if (this.f55351g.k()) {
            E i4 = this.f55351g.i();
            c5 = c6.v(this.f55983d, i4);
            if (c5 == null) {
                return null;
            }
            if (this.f55351g.h() == x.OPEN && this.f55983d.compare(i4, c5.x()) == 0) {
                c5 = f.c(c5);
            }
        } else {
            c5 = f.c(this.f55352h);
        }
        if (c5 == this.f55352h || !this.f55351g.c(c5.x())) {
            return null;
        }
        return c5;
    }

    @d9.c
    private void P(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        b6.a(o.class, ProtectedSandApp.s("\uf44c")).b(this, comparator);
        b6.a(a7.class, ProtectedSandApp.s("\uf44d")).b(this, q2.a(comparator));
        b6.a(a7.class, ProtectedSandApp.s("\uf44e")).b(this, new g());
        f fVar = new f();
        b6.a(a7.class, ProtectedSandApp.s("\uf44f")).b(this, fVar);
        Q(fVar, fVar);
        b6.f(this, objectInputStream);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void Q(f<T> fVar, f<T> fVar2) {
        ((f) fVar).f55370i = fVar2;
        ((f) fVar2).f55369h = fVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void R(f<T> fVar, f<T> fVar2, f<T> fVar3) {
        Q(fVar, fVar2);
        Q(fVar2, fVar3);
    }

    private u4.a<E> S(f<E> fVar) {
        return new a(fVar);
    }

    @d9.c
    private void T(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.d().comparator());
        b6.k(this, objectOutputStream);
    }

    static u4.a r(a7 a7Var, f fVar) {
        a7Var.getClass();
        return new a(fVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.o, com.google.common.collect.k6
    public /* bridge */ /* synthetic */ k6 M1(@f5 Object obj, x xVar, @f5 Object obj2, x xVar2) {
        return super.M1(obj, xVar, obj2, xVar2);
    }

    @Override // com.google.common.collect.k6
    public k6<E> N2(@f5 E e4, x xVar) {
        return new a7(this.f55350f, this.f55351g.l(q2.r(this.f55983d, e4, xVar)), this.f55352h);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public int W1(@zc.a Object obj, int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf450"));
        if (i4 == 0) {
            return W2(obj);
        }
        f<E> c5 = this.f55350f.c();
        int[] iArr = new int[1];
        try {
            if (this.f55351g.c(obj) && c5 != null) {
                this.f55350f.a(c5, c5.E(this.f55983d, obj, i4, iArr));
                return iArr[0];
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.u4
    public int W2(@zc.a Object obj) {
        try {
            f<E> c5 = this.f55350f.c();
            if (this.f55351g.c(obj) && c5 != null) {
                return c5.t(this.f55983d, obj);
            }
        } catch (ClassCastException | NullPointerException unused) {
        }
        return 0;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        if (this.f55351g.j() || this.f55351g.k()) {
            d4.h(new b());
            return;
        }
        f<E> l4 = f.l(this.f55352h);
        while (true) {
            f<E> fVar = this.f55352h;
            if (l4 == fVar) {
                Q(fVar, fVar);
                this.f55350f.b();
                return;
            }
            f<E> l5 = f.l(l4);
            ((f) l4).f55363b = 0;
            ((f) l4).f55367f = null;
            ((f) l4).f55368g = null;
            ((f) l4).f55369h = null;
            ((f) l4).f55370i = null;
            l4 = l5;
        }
    }

    @Override // com.google.common.collect.o, com.google.common.collect.k6, com.google.common.collect.g6
    public Comparator comparator() {
        return this.f55983d;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public /* bridge */ /* synthetic */ boolean contains(@zc.a Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public /* bridge */ /* synthetic */ NavigableSet d() {
        return super.d();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public int d2(@f5 E e4, int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf450"));
        if (i4 == 0) {
            return W2(e4);
        }
        com.google.common.base.l0.d(this.f55351g.c(e4));
        f<E> c5 = this.f55350f.c();
        if (c5 != null) {
            int[] iArr = new int[1];
            this.f55350f.a(c5, c5.o(this.f55983d, e4, i4, iArr));
            return iArr[0];
        }
        this.f55983d.compare(e4, e4);
        f<E> fVar = new f<>(e4, i4);
        f<E> fVar2 = this.f55352h;
        R(fVar2, fVar, fVar2);
        this.f55350f.a(c5, fVar);
        return 0;
    }

    @Override // com.google.common.collect.k6
    public k6<E> d3(@f5 E e4, x xVar) {
        return new a7(this.f55350f, this.f55351g.l(q2.d(this.f55983d, e4, xVar)), this.f55352h);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i
    int f() {
        return com.google.common.primitives.l.x(F(e.DISTINCT));
    }

    @Override // com.google.common.collect.o, com.google.common.collect.k6
    @zc.a
    public /* bridge */ /* synthetic */ u4.a firstEntry() {
        return super.firstEntry();
    }

    @Override // com.google.common.collect.i
    Iterator<E> h() {
        return new v4.e(new b());
    }

    @Override // com.google.common.collect.i
    Iterator<u4.a<E>> i() {
        return new b();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.g6
    public Iterator<E> iterator() {
        return v4.n(this);
    }

    @Override // com.google.common.collect.o, com.google.common.collect.k6
    @zc.a
    public /* bridge */ /* synthetic */ u4.a lastEntry() {
        return super.lastEntry();
    }

    @Override // com.google.common.collect.o
    Iterator<u4.a<E>> m() {
        return new c();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.k6
    public /* bridge */ /* synthetic */ k6 m2() {
        return super.m2();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public int o0(@f5 E e4, int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf451"));
        if (!this.f55351g.c(e4)) {
            com.google.common.base.l0.d(i4 == 0);
            return 0;
        }
        f<E> c5 = this.f55350f.c();
        if (c5 == null) {
            if (i4 > 0) {
                d2(e4, i4);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.f55350f.a(c5, c5.K(this.f55983d, e4, i4, iArr));
        return iArr[0];
    }

    @Override // com.google.common.collect.o, com.google.common.collect.k6
    @zc.a
    public /* bridge */ /* synthetic */ u4.a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    @Override // com.google.common.collect.o, com.google.common.collect.k6
    @zc.a
    public /* bridge */ /* synthetic */ u4.a pollLastEntry() {
        return super.pollLastEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public int size() {
        return com.google.common.primitives.l.x(F(e.SIZE));
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public boolean x2(@f5 E e4, int i4, int i5) {
        b0.b(i5, ProtectedSandApp.s("\uf452"));
        b0.b(i4, ProtectedSandApp.s("\uf453"));
        com.google.common.base.l0.d(this.f55351g.c(e4));
        f<E> c5 = this.f55350f.c();
        if (c5 != null) {
            int[] iArr = new int[1];
            this.f55350f.a(c5, c5.J(this.f55983d, e4, i4, i5, iArr));
            return iArr[0] == i4;
        }
        if (i4 != 0) {
            return false;
        }
        if (i5 > 0) {
            d2(e4, i5);
        }
        return true;
    }

    a7(Comparator<? super E> comparator) {
        super(comparator);
        this.f55351g = q2.a(comparator);
        f<E> fVar = new f<>();
        this.f55352h = fVar;
        Q(fVar, fVar);
        this.f55350f = new g<>();
    }

    /* compiled from: TreeMultiset.java */
    private static final class f<E> {

        /* renamed from: a, reason: collision with root package name */
        @zc.a
        private final E f55362a;

        /* renamed from: b, reason: collision with root package name */
        private int f55363b;

        /* renamed from: c, reason: collision with root package name */
        private int f55364c;

        /* renamed from: d, reason: collision with root package name */
        private long f55365d;

        /* renamed from: e, reason: collision with root package name */
        private int f55366e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        private f<E> f55367f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        private f<E> f55368g;

        /* renamed from: h, reason: collision with root package name */
        @zc.a
        private f<E> f55369h;

        /* renamed from: i, reason: collision with root package name */
        @zc.a
        private f<E> f55370i;

        f(@f5 E e4, int i4) {
            com.google.common.base.l0.d(i4 > 0);
            this.f55362a = e4;
            this.f55363b = i4;
            this.f55365d = i4;
            this.f55364c = 1;
            this.f55366e = 1;
            this.f55367f = null;
            this.f55368g = null;
        }

        private f<E> A() {
            int r4 = r();
            if (r4 == -2) {
                Objects.requireNonNull(this.f55368g);
                if (this.f55368g.r() > 0) {
                    this.f55368g = this.f55368g.I();
                }
                return H();
            }
            if (r4 != 2) {
                C();
                return this;
            }
            Objects.requireNonNull(this.f55367f);
            if (this.f55367f.r() < 0) {
                this.f55367f = this.f55367f.H();
            }
            return I();
        }

        private void B() {
            D();
            C();
        }

        private void C() {
            this.f55366e = Math.max(y(this.f55367f), y(this.f55368g)) + 1;
        }

        private void D() {
            this.f55364c = a7.K(this.f55367f) + 1 + a7.K(this.f55368g);
            this.f55365d = this.f55363b + M(this.f55367f) + M(this.f55368g);
        }

        @zc.a
        private f<E> F(f<E> fVar) {
            f<E> fVar2 = this.f55368g;
            if (fVar2 == null) {
                return this.f55367f;
            }
            this.f55368g = fVar2.F(fVar);
            this.f55364c--;
            this.f55365d -= fVar.f55363b;
            return A();
        }

        @zc.a
        private f<E> G(f<E> fVar) {
            f<E> fVar2 = this.f55367f;
            if (fVar2 == null) {
                return this.f55368g;
            }
            this.f55367f = fVar2.G(fVar);
            this.f55364c--;
            this.f55365d -= fVar.f55363b;
            return A();
        }

        private f<E> H() {
            com.google.common.base.l0.g0(this.f55368g != null);
            f<E> fVar = this.f55368g;
            this.f55368g = fVar.f55367f;
            fVar.f55367f = this;
            fVar.f55365d = this.f55365d;
            fVar.f55364c = this.f55364c;
            B();
            fVar.C();
            return fVar;
        }

        private f<E> I() {
            com.google.common.base.l0.g0(this.f55367f != null);
            f<E> fVar = this.f55367f;
            this.f55367f = fVar.f55368g;
            fVar.f55368g = this;
            fVar.f55365d = this.f55365d;
            fVar.f55364c = this.f55364c;
            B();
            fVar.C();
            return fVar;
        }

        private f<E> L() {
            f<E> fVar = this.f55370i;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        private static long M(@zc.a f<?> fVar) {
            if (fVar == null) {
                return 0L;
            }
            return ((f) fVar).f55365d;
        }

        static f c(f fVar) {
            f<E> fVar2 = fVar.f55369h;
            Objects.requireNonNull(fVar2);
            return fVar2;
        }

        static f l(f fVar) {
            f<E> fVar2 = fVar.f55370i;
            Objects.requireNonNull(fVar2);
            return fVar2;
        }

        private f<E> p(@f5 E e4, int i4) {
            this.f55367f = new f<>(e4, i4);
            f<E> fVar = this.f55369h;
            Objects.requireNonNull(fVar);
            a7.R(fVar, this.f55367f, this);
            this.f55366e = Math.max(2, this.f55366e);
            this.f55364c++;
            this.f55365d += i4;
            return this;
        }

        private f<E> q(@f5 E e4, int i4) {
            f<E> fVar = new f<>(e4, i4);
            this.f55368g = fVar;
            f<E> fVar2 = this.f55370i;
            Objects.requireNonNull(fVar2);
            a7.R(this, fVar, fVar2);
            this.f55366e = Math.max(2, this.f55366e);
            this.f55364c++;
            this.f55365d += i4;
            return this;
        }

        private int r() {
            return y(this.f55367f) - y(this.f55368g);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @zc.a
        public f<E> s(Comparator<? super E> comparator, @f5 E e4) {
            int compare = comparator.compare(e4, this.f55362a);
            if (compare < 0) {
                f<E> fVar = this.f55367f;
                return fVar == null ? this : (f) com.google.common.base.d0.a(fVar.s(comparator, e4), this);
            }
            if (compare == 0) {
                return this;
            }
            f<E> fVar2 = this.f55368g;
            if (fVar2 == null) {
                return null;
            }
            return fVar2.s(comparator, e4);
        }

        @zc.a
        private f<E> u() {
            int i4 = this.f55363b;
            this.f55363b = 0;
            f<E> fVar = this.f55369h;
            Objects.requireNonNull(fVar);
            f<E> fVar2 = this.f55370i;
            Objects.requireNonNull(fVar2);
            a7.Q(fVar, fVar2);
            f<E> fVar3 = this.f55367f;
            if (fVar3 == null) {
                return this.f55368g;
            }
            f<E> fVar4 = this.f55368g;
            if (fVar4 == null) {
                return fVar3;
            }
            if (fVar3.f55366e >= fVar4.f55366e) {
                f<E> fVar5 = this.f55369h;
                Objects.requireNonNull(fVar5);
                fVar5.f55367f = this.f55367f.F(fVar5);
                fVar5.f55368g = this.f55368g;
                fVar5.f55364c = this.f55364c - 1;
                fVar5.f55365d = this.f55365d - i4;
                return fVar5.A();
            }
            f<E> fVar6 = this.f55370i;
            Objects.requireNonNull(fVar6);
            fVar6.f55368g = this.f55368g.G(fVar6);
            fVar6.f55367f = this.f55367f;
            fVar6.f55364c = this.f55364c - 1;
            fVar6.f55365d = this.f55365d - i4;
            return fVar6.A();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        @zc.a
        public f<E> v(Comparator<? super E> comparator, @f5 E e4) {
            int compare = comparator.compare(e4, this.f55362a);
            if (compare > 0) {
                f<E> fVar = this.f55368g;
                return fVar == null ? this : (f) com.google.common.base.d0.a(fVar.v(comparator, e4), this);
            }
            if (compare == 0) {
                return this;
            }
            f<E> fVar2 = this.f55367f;
            if (fVar2 == null) {
                return null;
            }
            return fVar2.v(comparator, e4);
        }

        private static int y(@zc.a f<?> fVar) {
            if (fVar == null) {
                return 0;
            }
            return ((f) fVar).f55366e;
        }

        private f<E> z() {
            f<E> fVar = this.f55369h;
            Objects.requireNonNull(fVar);
            return fVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @zc.a
        f<E> E(Comparator<? super E> comparator, @f5 E e4, int i4, int[] iArr) {
            int compare = comparator.compare(e4, this.f55362a);
            if (compare < 0) {
                f<E> fVar = this.f55367f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f55367f = fVar.E(comparator, e4, i4, iArr);
                int i5 = iArr[0];
                if (i5 > 0) {
                    if (i4 >= i5) {
                        this.f55364c--;
                        this.f55365d -= i5;
                    } else {
                        this.f55365d -= i4;
                    }
                }
                return i5 == 0 ? this : A();
            }
            if (compare <= 0) {
                int i6 = this.f55363b;
                iArr[0] = i6;
                if (i4 >= i6) {
                    return u();
                }
                this.f55363b = i6 - i4;
                this.f55365d -= i4;
                return this;
            }
            f<E> fVar2 = this.f55368g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return this;
            }
            this.f55368g = fVar2.E(comparator, e4, i4, iArr);
            int i7 = iArr[0];
            if (i7 > 0) {
                if (i4 >= i7) {
                    this.f55364c--;
                    this.f55365d -= i7;
                } else {
                    this.f55365d -= i4;
                }
            }
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @zc.a
        f<E> J(Comparator<? super E> comparator, @f5 E e4, int i4, int i5, int[] iArr) {
            int compare = comparator.compare(e4, this.f55362a);
            if (compare < 0) {
                f<E> fVar = this.f55367f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return (i4 != 0 || i5 <= 0) ? this : p(e4, i5);
                }
                this.f55367f = fVar.J(comparator, e4, i4, i5, iArr);
                int i6 = iArr[0];
                if (i6 == i4) {
                    if (i5 == 0 && i6 != 0) {
                        this.f55364c--;
                    } else if (i5 > 0 && i6 == 0) {
                        this.f55364c++;
                    }
                    this.f55365d += i5 - i6;
                }
                return A();
            }
            if (compare <= 0) {
                int i7 = this.f55363b;
                iArr[0] = i7;
                if (i4 == i7) {
                    if (i5 == 0) {
                        return u();
                    }
                    this.f55365d += i5 - i7;
                    this.f55363b = i5;
                }
                return this;
            }
            f<E> fVar2 = this.f55368g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return (i4 != 0 || i5 <= 0) ? this : q(e4, i5);
            }
            this.f55368g = fVar2.J(comparator, e4, i4, i5, iArr);
            int i10 = iArr[0];
            if (i10 == i4) {
                if (i5 == 0 && i10 != 0) {
                    this.f55364c--;
                } else if (i5 > 0 && i10 == 0) {
                    this.f55364c++;
                }
                this.f55365d += i5 - i10;
            }
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @zc.a
        f<E> K(Comparator<? super E> comparator, @f5 E e4, int i4, int[] iArr) {
            int compare = comparator.compare(e4, this.f55362a);
            if (compare < 0) {
                f<E> fVar = this.f55367f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return i4 > 0 ? p(e4, i4) : this;
                }
                this.f55367f = fVar.K(comparator, e4, i4, iArr);
                if (i4 == 0 && iArr[0] != 0) {
                    this.f55364c--;
                } else if (i4 > 0 && iArr[0] == 0) {
                    this.f55364c++;
                }
                this.f55365d += i4 - iArr[0];
                return A();
            }
            if (compare <= 0) {
                iArr[0] = this.f55363b;
                if (i4 == 0) {
                    return u();
                }
                this.f55365d += i4 - r3;
                this.f55363b = i4;
                return this;
            }
            f<E> fVar2 = this.f55368g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return i4 > 0 ? q(e4, i4) : this;
            }
            this.f55368g = fVar2.K(comparator, e4, i4, iArr);
            if (i4 == 0 && iArr[0] != 0) {
                this.f55364c--;
            } else if (i4 > 0 && iArr[0] == 0) {
                this.f55364c++;
            }
            this.f55365d += i4 - iArr[0];
            return A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        f<E> o(Comparator<? super E> comparator, @f5 E e4, int i4, int[] iArr) {
            int compare = comparator.compare(e4, this.f55362a);
            if (compare < 0) {
                f<E> fVar = this.f55367f;
                if (fVar == null) {
                    iArr[0] = 0;
                    return p(e4, i4);
                }
                int i5 = fVar.f55366e;
                f<E> o4 = fVar.o(comparator, e4, i4, iArr);
                this.f55367f = o4;
                if (iArr[0] == 0) {
                    this.f55364c++;
                }
                this.f55365d += i4;
                return o4.f55366e == i5 ? this : A();
            }
            if (compare <= 0) {
                int i6 = this.f55363b;
                iArr[0] = i6;
                long j4 = i4;
                com.google.common.base.l0.d(((long) i6) + j4 <= 2147483647L);
                this.f55363b += i4;
                this.f55365d += j4;
                return this;
            }
            f<E> fVar2 = this.f55368g;
            if (fVar2 == null) {
                iArr[0] = 0;
                return q(e4, i4);
            }
            int i7 = fVar2.f55366e;
            f<E> o5 = fVar2.o(comparator, e4, i4, iArr);
            this.f55368g = o5;
            if (iArr[0] == 0) {
                this.f55364c++;
            }
            this.f55365d += i4;
            return o5.f55366e == i7 ? this : A();
        }

        /* JADX WARN: Multi-variable type inference failed */
        int t(Comparator<? super E> comparator, @f5 E e4) {
            int compare = comparator.compare(e4, this.f55362a);
            if (compare < 0) {
                f<E> fVar = this.f55367f;
                if (fVar == null) {
                    return 0;
                }
                return fVar.t(comparator, e4);
            }
            if (compare <= 0) {
                return this.f55363b;
            }
            f<E> fVar2 = this.f55368g;
            if (fVar2 == null) {
                return 0;
            }
            return fVar2.t(comparator, e4);
        }

        public String toString() {
            return new v4.k(this.f55362a, this.f55363b).toString();
        }

        int w() {
            return this.f55363b;
        }

        @f5
        E x() {
            return this.f55362a;
        }

        f() {
            this.f55362a = null;
            this.f55363b = 1;
        }
    }
}
