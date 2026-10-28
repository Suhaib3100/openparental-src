package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.AbstractQueue;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Queue;

/* compiled from: MinMaxPriorityQueue.java */
@w0
@d9.b
@d9.a
/* loaded from: classes6.dex */
public final class q4<E> extends AbstractQueue<E> {

    /* renamed from: h, reason: collision with root package name */
    private static final int f56208h = 1431655765;

    /* renamed from: i, reason: collision with root package name */
    private static final int f56209i = -1431655766;

    /* renamed from: j, reason: collision with root package name */
    private static final int f56210j = 11;

    /* renamed from: b, reason: collision with root package name */
    private final q4<E>.c f56211b;

    /* renamed from: c, reason: collision with root package name */
    private final q4<E>.c f56212c;

    /* renamed from: d, reason: collision with root package name */
    @d9.d
    final int f56213d;

    /* renamed from: e, reason: collision with root package name */
    private Object[] f56214e;

    /* renamed from: f, reason: collision with root package name */
    private int f56215f;

    /* renamed from: g, reason: collision with root package name */
    private int f56216g;

    /* compiled from: MinMaxPriorityQueue.java */
    @d9.a
    public static final class b<B> {

        /* renamed from: d, reason: collision with root package name */
        private static final int f56217d = -1;

        /* renamed from: a, reason: collision with root package name */
        private final Comparator<B> f56218a;

        /* renamed from: b, reason: collision with root package name */
        private int f56219b;

        /* renamed from: c, reason: collision with root package name */
        private int f56220c;

        static e5 a(b bVar) {
            return e5.u(bVar.f56218a);
        }

        private <T extends B> e5<T> g() {
            return e5.u(this.f56218a);
        }

        public <T extends B> q4<T> c() {
            return d(Collections.emptySet());
        }

        public <T extends B> q4<T> d(Iterable<? extends T> iterable) {
            q4<T> q4Var = new q4<>(this, q4.x(this.f56219b, this.f56220c, iterable));
            Iterator<? extends T> it = iterable.iterator();
            while (it.hasNext()) {
                q4Var.offer(it.next());
            }
            return q4Var;
        }

        @f9.a
        public b<B> e(int i4) {
            com.google.common.base.l0.d(i4 >= 0);
            this.f56219b = i4;
            return this;
        }

        @f9.a
        public b<B> f(int i4) {
            com.google.common.base.l0.d(i4 > 0);
            this.f56220c = i4;
            return this;
        }

        private b(Comparator<B> comparator) {
            this.f56219b = -1;
            this.f56220c = Integer.MAX_VALUE;
            comparator.getClass();
            this.f56218a = comparator;
        }
    }

    /* compiled from: MinMaxPriorityQueue.java */
    private class c {

        /* renamed from: a, reason: collision with root package name */
        final e5<E> f56221a;

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        q4<E>.c f56222b;

        c(e5<E> e5Var) {
            this.f56221a = e5Var;
        }

        private int k(int i4) {
            return m(m(i4));
        }

        private int l(int i4) {
            return (i4 * 2) + 1;
        }

        private int m(int i4) {
            return (i4 - 1) / 2;
        }

        private int n(int i4) {
            return (i4 * 2) + 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean q(int i4) {
            if (l(i4) < q4.this.f56215f && d(i4, l(i4)) > 0) {
                return false;
            }
            int i5 = (i4 * 2) + 2;
            if (i5 < q4.this.f56215f && d(i4, i5) > 0) {
                return false;
            }
            if (i4 <= 0 || d(i4, m(i4)) <= 0) {
                return i4 <= 2 || d(k(i4), i4) <= 0;
            }
            return false;
        }

        void b(int i4, E e4) {
            c cVar;
            int f4 = f(i4, e4);
            if (f4 == i4) {
                f4 = i4;
                cVar = this;
            } else {
                cVar = this.f56222b;
            }
            cVar.c(f4, e4);
        }

        @f9.a
        int c(int i4, E e4) {
            while (i4 > 2) {
                int k4 = k(i4);
                Object p4 = q4.this.p(k4);
                if (this.f56221a.compare(p4, e4) <= 0) {
                    break;
                }
                q4.this.f56214e[i4] = p4;
                i4 = k4;
            }
            q4.this.f56214e[i4] = e4;
            return i4;
        }

        int d(int i4, int i5) {
            return this.f56221a.compare(q4.this.p(i4), q4.this.p(i5));
        }

        int e(int i4, E e4) {
            int i5 = i(i4);
            if (i5 <= 0 || this.f56221a.compare(q4.this.p(i5), e4) >= 0) {
                return f(i4, e4);
            }
            q4.this.f56214e[i4] = q4.this.p(i5);
            q4.this.f56214e[i5] = e4;
            return i5;
        }

        int f(int i4, E e4) {
            int m4;
            if (i4 == 0) {
                q4.this.f56214e[0] = e4;
                return 0;
            }
            int m5 = m(i4);
            Object p4 = q4.this.p(m5);
            if (m5 != 0 && (m4 = (m(m5) * 2) + 2) != m5 && l(m4) >= q4.this.f56215f) {
                Object p5 = q4.this.p(m4);
                if (this.f56221a.compare(p5, p4) < 0) {
                    m5 = m4;
                    p4 = p5;
                }
            }
            if (this.f56221a.compare(p4, e4) >= 0) {
                q4.this.f56214e[i4] = e4;
                return i4;
            }
            q4.this.f56214e[i4] = p4;
            q4.this.f56214e[m5] = e4;
            return m5;
        }

        int g(int i4) {
            while (true) {
                int j4 = j(i4);
                if (j4 <= 0) {
                    return i4;
                }
                q4.this.f56214e[i4] = q4.this.p(j4);
                i4 = j4;
            }
        }

        int h(int i4, int i5) {
            if (i4 >= q4.this.f56215f) {
                return -1;
            }
            com.google.common.base.l0.g0(i4 > 0);
            int min = Math.min(i4, q4.this.f56215f - i5) + i5;
            for (int i6 = i4 + 1; i6 < min; i6++) {
                if (d(i6, i4) < 0) {
                    i4 = i6;
                }
            }
            return i4;
        }

        int i(int i4) {
            return h(l(i4), 2);
        }

        int j(int i4) {
            int l4 = l(i4);
            if (l4 < 0) {
                return -1;
            }
            return h(l(l4), 4);
        }

        int o(E e4) {
            int m4;
            int m5 = m(q4.this.f56215f);
            if (m5 != 0 && (m4 = (m(m5) * 2) + 2) != m5 && l(m4) >= q4.this.f56215f) {
                Object p4 = q4.this.p(m4);
                if (this.f56221a.compare(p4, e4) < 0) {
                    q4.this.f56214e[m4] = e4;
                    q4.this.f56214e[q4.this.f56215f] = p4;
                    return m4;
                }
            }
            return q4.this.f56215f;
        }

        @zc.a
        d<E> p(int i4, int i5, E e4) {
            int e5 = e(i5, e4);
            if (e5 == i5) {
                return null;
            }
            Object p4 = e5 < i4 ? q4.this.p(i4) : q4.this.p(m(i4));
            if (this.f56222b.c(e5, e4) < i4) {
                return new d<>(e4, p4);
            }
            return null;
        }
    }

    /* compiled from: MinMaxPriorityQueue.java */
    static class d<E> {

        /* renamed from: a, reason: collision with root package name */
        final E f56224a;

        /* renamed from: b, reason: collision with root package name */
        final E f56225b;

        d(E e4, E e5) {
            this.f56224a = e4;
            this.f56225b = e5;
        }
    }

    /* compiled from: MinMaxPriorityQueue.java */
    private class e implements Iterator<E> {

        /* renamed from: b, reason: collision with root package name */
        private int f56226b;

        /* renamed from: c, reason: collision with root package name */
        private int f56227c;

        /* renamed from: d, reason: collision with root package name */
        private int f56228d;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        private Queue<E> f56229e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        private List<E> f56230f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        private E f56231g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f56232h;

        private e() {
            this.f56226b = -1;
            this.f56227c = -1;
            this.f56228d = q4.this.f56216g;
        }

        private void a() {
            if (q4.this.f56216g != this.f56228d) {
                throw new ConcurrentModificationException();
            }
        }

        private boolean b(Iterable<E> iterable, E e4) {
            Iterator<E> it = iterable.iterator();
            while (it.hasNext()) {
                if (it.next() == e4) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private void c(int i4) {
            if (this.f56227c < i4) {
                if (this.f56230f != null) {
                    while (i4 < q4.this.size() && b(this.f56230f, q4.this.p(i4))) {
                        i4++;
                    }
                }
                this.f56227c = i4;
            }
        }

        private boolean d(Object obj) {
            for (int i4 = 0; i4 < q4.this.f56215f; i4++) {
                if (q4.this.f56214e[i4] == obj) {
                    q4.this.I(i4);
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            c(this.f56226b + 1);
            if (this.f56227c < q4.this.size()) {
                return true;
            }
            Queue<E> queue = this.f56229e;
            return (queue == null || queue.isEmpty()) ? false : true;
        }

        @Override // java.util.Iterator
        public E next() {
            a();
            c(this.f56226b + 1);
            if (this.f56227c < q4.this.size()) {
                int i4 = this.f56227c;
                this.f56226b = i4;
                this.f56232h = true;
                return (E) q4.this.p(i4);
            }
            if (this.f56229e != null) {
                this.f56226b = q4.this.size();
                E poll = this.f56229e.poll();
                this.f56231g = poll;
                if (poll != null) {
                    this.f56232h = true;
                    return poll;
                }
            }
            throw new NoSuchElementException(ProtectedSandApp.s("\uf534"));
        }

        @Override // java.util.Iterator
        public void remove() {
            b0.e(this.f56232h);
            a();
            this.f56232h = false;
            this.f56228d++;
            if (this.f56226b >= q4.this.size()) {
                E e4 = this.f56231g;
                Objects.requireNonNull(e4);
                com.google.common.base.l0.g0(d(e4));
                this.f56231g = null;
                return;
            }
            d<E> I = q4.this.I(this.f56226b);
            if (I != null) {
                if (this.f56229e == null || this.f56230f == null) {
                    this.f56229e = new ArrayDeque();
                    this.f56230f = new ArrayList(3);
                }
                if (!b(this.f56230f, I.f56224a)) {
                    this.f56229e.add(I.f56224a);
                }
                if (!b(this.f56229e, I.f56225b)) {
                    this.f56230f.add(I.f56225b);
                }
            }
            this.f56226b--;
            this.f56227c--;
        }
    }

    @d9.d
    static boolean A(int i4) {
        int i5 = ~(~(i4 + 1));
        com.google.common.base.l0.h0(i5 > 0, ProtectedSandApp.s("\uf535"));
        return (f56208h & i5) > (i5 & f56209i);
    }

    public static b<Comparable> F(int i4) {
        return new b(x4.f56632f).f(i4);
    }

    public static <B> b<B> G(Comparator<B> comparator) {
        return new b<>(comparator);
    }

    private E H(int i4) {
        E p4 = p(i4);
        I(i4);
        return p4;
    }

    private int h() {
        int length = this.f56214e.length;
        return i(length < 64 ? (length + 1) * 2 : com.google.common.math.f.d(length / 2, 3), this.f56213d);
    }

    private static int i(int i4, int i5) {
        return Math.min(i4 - 1, i5) + 1;
    }

    public static <E extends Comparable<E>> q4<E> l() {
        return new b(x4.f56632f).c();
    }

    public static <E extends Comparable<E>> q4<E> m(Iterable<? extends E> iterable) {
        return new b(x4.f56632f).d(iterable);
    }

    public static b<Comparable> q(int i4) {
        return new b(x4.f56632f).e(i4);
    }

    @zc.a
    private d<E> r(int i4, E e4) {
        q4<E>.c w4 = w(i4);
        int g4 = w4.g(i4);
        int c5 = w4.c(g4, e4);
        if (c5 == g4) {
            return w4.p(i4, g4, e4);
        }
        if (c5 < i4) {
            return new d<>(e4, p(i4));
        }
        return null;
    }

    private int s() {
        int i4 = this.f56215f;
        if (i4 != 1) {
            return (i4 == 2 || this.f56212c.d(1, 2) <= 0) ? 1 : 2;
        }
        return 0;
    }

    private void v() {
        if (this.f56215f > this.f56214e.length) {
            Object[] objArr = new Object[h()];
            Object[] objArr2 = this.f56214e;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.f56214e = objArr;
        }
    }

    private q4<E>.c w(int i4) {
        return A(i4) ? this.f56211b : this.f56212c;
    }

    @d9.d
    static int x(int i4, int i5, Iterable<?> iterable) {
        if (i4 == -1) {
            i4 = 11;
        }
        if (iterable instanceof Collection) {
            i4 = Math.max(i4, ((Collection) iterable).size());
        }
        return i(i4, i5);
    }

    @d9.d
    boolean D() {
        for (int i4 = 1; i4 < this.f56215f; i4++) {
            if (!w(i4).q(i4)) {
                return false;
            }
        }
        return true;
    }

    @d9.d
    @zc.a
    @f9.a
    d<E> I(int i4) {
        com.google.common.base.l0.d0(i4, this.f56215f);
        this.f56216g++;
        int i5 = this.f56215f - 1;
        this.f56215f = i5;
        if (i5 == i4) {
            this.f56214e[i5] = null;
            return null;
        }
        E p4 = p(i5);
        int o4 = w(this.f56215f).o(p4);
        if (o4 == i4) {
            this.f56214e[this.f56215f] = null;
            return null;
        }
        E p5 = p(this.f56215f);
        this.f56214e[this.f56215f] = null;
        d<E> r4 = r(i4, p5);
        return o4 < i4 ? r4 == null ? new d<>(p4, p5) : new d<>(p4, r4.f56225b) : r4;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection, java.util.Queue
    @f9.a
    public boolean add(E e4) {
        offer(e4);
        return true;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    @f9.a
    public boolean addAll(Collection<? extends E> collection) {
        Iterator<? extends E> it = collection.iterator();
        boolean z4 = false;
        while (it.hasNext()) {
            offer(it.next());
            z4 = true;
        }
        return z4;
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        for (int i4 = 0; i4 < this.f56215f; i4++) {
            this.f56214e[i4] = null;
        }
        this.f56215f = 0;
    }

    public Comparator<? super E> comparator() {
        return this.f56211b.f56221a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator<E> iterator() {
        return new e();
    }

    @d9.d
    int j() {
        return this.f56214e.length;
    }

    @Override // java.util.Queue
    @f9.a
    public boolean offer(E e4) {
        e4.getClass();
        this.f56216g++;
        int i4 = this.f56215f;
        this.f56215f = i4 + 1;
        v();
        w(i4).b(i4, e4);
        return this.f56215f <= this.f56213d || pollLast() != e4;
    }

    E p(int i4) {
        E e4 = (E) this.f56214e[i4];
        Objects.requireNonNull(e4);
        return e4;
    }

    @Override // java.util.Queue
    @zc.a
    public E peek() {
        if (isEmpty()) {
            return null;
        }
        return p(0);
    }

    @zc.a
    public E peekFirst() {
        return peek();
    }

    @zc.a
    public E peekLast() {
        if (isEmpty()) {
            return null;
        }
        return p(s());
    }

    @Override // java.util.Queue
    @zc.a
    @f9.a
    public E poll() {
        if (isEmpty()) {
            return null;
        }
        return H(0);
    }

    @zc.a
    @f9.a
    public E pollFirst() {
        return poll();
    }

    @zc.a
    @f9.a
    public E pollLast() {
        if (isEmpty()) {
            return null;
        }
        return H(s());
    }

    @f9.a
    public E removeFirst() {
        return remove();
    }

    @f9.a
    public E removeLast() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return H(s());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f56215f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        int i4 = this.f56215f;
        Object[] objArr = new Object[i4];
        System.arraycopy(this.f56214e, 0, objArr, 0, i4);
        return objArr;
    }

    private q4(b<? super E> bVar, int i4) {
        e5 a5 = b.a(bVar);
        q4<E>.c cVar = new c(a5);
        this.f56211b = cVar;
        q4<E>.c cVar2 = new c(a5.v0());
        this.f56212c = cVar2;
        cVar.f56222b = cVar2;
        cVar2.f56222b = cVar;
        this.f56213d = ((b) bVar).f56220c;
        this.f56214e = new Object[i4];
    }
}
