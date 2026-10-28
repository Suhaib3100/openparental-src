package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b6;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ConcurrentHashMultiset.java */
@w0
@d9.c
/* loaded from: classes6.dex */
public final class m0<E> extends i<E> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f55940e = 1;

    /* renamed from: d, reason: collision with root package name */
    private final transient ConcurrentMap<E, AtomicInteger> f55941d;

    /* compiled from: ConcurrentHashMultiset.java */
    class a extends j2<E> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Set f55942b;

        a(m0 m0Var, Set set) {
            this.f55942b = set;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<E> u3() {
            return this.f55942b;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return obj != null && c0.j(this.f55942b, obj);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return L3(collection);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            return obj != null && c0.k(this.f55942b, obj);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return O3(collection);
        }
    }

    /* compiled from: ConcurrentHashMultiset.java */
    class b extends com.google.common.collect.c<u4.a<E>> {

        /* renamed from: d, reason: collision with root package name */
        private final Iterator<Map.Entry<E, AtomicInteger>> f55943d;

        b() {
            this.f55943d = m0.this.f55941d.entrySet().iterator();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c
        @zc.a
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public u4.a<E> a() {
            while (this.f55943d.hasNext()) {
                Map.Entry<E, AtomicInteger> next = this.f55943d.next();
                int i4 = next.getValue().get();
                if (i4 != 0) {
                    return new v4.k(next.getKey(), i4);
                }
            }
            return b();
        }
    }

    /* compiled from: ConcurrentHashMultiset.java */
    class c extends x1<u4.a<E>> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        private u4.a<E> f55945b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f55946c;

        c(Iterator it) {
            this.f55946c = it;
        }

        @Override // com.google.common.collect.x1, java.util.Iterator
        /* renamed from: A3, reason: merged with bridge method [inline-methods] */
        public u4.a<E> next() {
            u4.a<E> aVar = (u4.a) super.next();
            this.f55945b = aVar;
            return aVar;
        }

        @Override // com.google.common.collect.x1, java.util.Iterator
        public void remove() {
            com.google.common.base.l0.h0(this.f55945b != null, ProtectedSandApp.s("\uf4ee"));
            m0.this.o0(this.f55945b.getElement(), 0);
            this.f55945b = null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.x1, com.google.common.collect.h2
        /* renamed from: v3 */
        public Iterator<u4.a<E>> u3() {
            return this.f55946c;
        }
    }

    /* compiled from: ConcurrentHashMultiset.java */
    private class d extends i<E>.b {
        private d() {
            super();
        }

        private List<u4.a<E>> l() {
            ArrayList v4 = l4.v(size());
            d4.a(v4, iterator());
            return v4;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.i.b, com.google.common.collect.v4.i
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public m0<E> i() {
            return m0.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return l().toArray();
        }

        /* synthetic */ d(m0 m0Var, a aVar) {
            this();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) l().toArray(tArr);
        }
    }

    /* compiled from: ConcurrentHashMultiset.java */
    private static class e {

        /* renamed from: a, reason: collision with root package name */
        static final b6.b<m0> f55949a = b6.a(m0.class, ProtectedSandApp.s("\uf4ef"));

        private e() {
        }
    }

    @d9.d
    m0(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        com.google.common.base.l0.u(concurrentMap.isEmpty(), ProtectedSandApp.s("\uf4f0"), concurrentMap);
        this.f55941d = concurrentMap;
    }

    public static <E> m0<E> l() {
        return new m0<>(new ConcurrentHashMap());
    }

    public static <E> m0<E> m(Iterable<? extends E> iterable) {
        m0<E> l4 = l();
        c4.a(l4, iterable);
        return l4;
    }

    @d9.a
    public static <E> m0<E> p(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new m0<>(concurrentMap);
    }

    private void q(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        e.f55949a.b(this, (ConcurrentMap) objectInputStream.readObject());
    }

    private List<E> s() {
        ArrayList v4 = l4.v(size());
        for (u4.a<E> aVar : super.entrySet()) {
            E element = aVar.getElement();
            for (int count = aVar.getCount(); count > 0; count--) {
                v4.add(element);
            }
        }
        return v4;
    }

    private void v(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f55941d);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public int W1(@zc.a Object obj, int i4) {
        int i5;
        int max;
        if (i4 == 0) {
            return W2(obj);
        }
        b0.d(i4, ProtectedSandApp.s("\uf4f1"));
        AtomicInteger atomicInteger = (AtomicInteger) p4.p0(this.f55941d, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i5 = atomicInteger.get();
            if (i5 == 0) {
                return 0;
            }
            max = Math.max(0, i5 - i4);
        } while (!atomicInteger.compareAndSet(i5, max));
        if (max == 0) {
            this.f55941d.remove(obj, atomicInteger);
        }
        return i5;
    }

    @Override // com.google.common.collect.u4
    public int W2(@zc.a Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) p4.p0(this.f55941d, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.i
    Set<E> b() {
        return new a(this, this.f55941d.keySet());
    }

    @Override // com.google.common.collect.i
    @Deprecated
    public Set<u4.a<E>> c() {
        return new d(this, null);
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f55941d.clear();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public /* bridge */ /* synthetic */ boolean contains(@zc.a Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public int d2(E e4, int i4) {
        AtomicInteger atomicInteger;
        int i5;
        AtomicInteger atomicInteger2;
        e4.getClass();
        if (i4 == 0) {
            return W2(e4);
        }
        b0.d(i4, ProtectedSandApp.s("\uf4f1"));
        do {
            atomicInteger = (AtomicInteger) p4.p0(this.f55941d, e4);
            if (atomicInteger == null && (atomicInteger = this.f55941d.putIfAbsent(e4, new AtomicInteger(i4))) == null) {
                return 0;
            }
            do {
                i5 = atomicInteger.get();
                if (i5 == 0) {
                    atomicInteger2 = new AtomicInteger(i4);
                    if (this.f55941d.putIfAbsent(e4, atomicInteger2) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        StringBuilder sb = new StringBuilder(65);
                        sb.append(ProtectedSandApp.s("\uf4f2"));
                        sb.append(i4);
                        sb.append(ProtectedSandApp.s("\uf4f3"));
                        sb.append(i5);
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            } while (!atomicInteger.compareAndSet(i5, com.google.common.math.f.c(i5, i4)));
            return i5;
        } while (!this.f55941d.replace(e4, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i
    int f() {
        return this.f55941d.size();
    }

    @Override // com.google.common.collect.i
    Iterator<E> h() {
        throw new AssertionError(ProtectedSandApp.s("\uf4f4"));
    }

    @Override // com.google.common.collect.i
    Iterator<u4.a<E>> i() {
        return new c(new b());
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f55941d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.g6
    public Iterator<E> iterator() {
        return v4.n(this);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public int o0(E e4, int i4) {
        AtomicInteger atomicInteger;
        int i5;
        AtomicInteger atomicInteger2;
        e4.getClass();
        b0.b(i4, ProtectedSandApp.s("\uf4f5"));
        do {
            atomicInteger = (AtomicInteger) p4.p0(this.f55941d, e4);
            if (atomicInteger == null && (i4 == 0 || (atomicInteger = this.f55941d.putIfAbsent(e4, new AtomicInteger(i4))) == null)) {
                return 0;
            }
            do {
                i5 = atomicInteger.get();
                if (i5 == 0) {
                    if (i4 != 0) {
                        atomicInteger2 = new AtomicInteger(i4);
                        if (this.f55941d.putIfAbsent(e4, atomicInteger2) == null) {
                            break;
                        }
                    } else {
                        return 0;
                    }
                }
            } while (!atomicInteger.compareAndSet(i5, i4));
            if (i4 == 0) {
                this.f55941d.remove(e4, atomicInteger);
            }
            return i5;
        } while (!this.f55941d.replace(e4, atomicInteger, atomicInteger2));
        return 0;
    }

    @f9.a
    public boolean r(@zc.a Object obj, int i4) {
        int i5;
        int i6;
        if (i4 == 0) {
            return true;
        }
        b0.d(i4, ProtectedSandApp.s("\uf4f1"));
        AtomicInteger atomicInteger = (AtomicInteger) p4.p0(this.f55941d, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i5 = atomicInteger.get();
            if (i5 < i4) {
                return false;
            }
            i6 = i5 - i4;
        } while (!atomicInteger.compareAndSet(i5, i6));
        if (i6 == 0) {
            this.f55941d.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public int size() {
        long j4 = 0;
        while (this.f55941d.values().iterator().hasNext()) {
            j4 += r0.next().get();
        }
        return com.google.common.primitives.l.x(j4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return s().toArray();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4
    @f9.a
    public boolean x2(E e4, int i4, int i5) {
        e4.getClass();
        b0.b(i4, ProtectedSandApp.s("\uf4f6"));
        b0.b(i5, ProtectedSandApp.s("\uf4f7"));
        AtomicInteger atomicInteger = (AtomicInteger) p4.p0(this.f55941d, e4);
        if (atomicInteger == null) {
            if (i4 != 0) {
                return false;
            }
            return i5 == 0 || this.f55941d.putIfAbsent(e4, new AtomicInteger(i5)) == null;
        }
        int i6 = atomicInteger.get();
        if (i6 == i4) {
            if (i6 == 0) {
                if (i5 == 0) {
                    this.f55941d.remove(e4, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i5);
                return this.f55941d.putIfAbsent(e4, atomicInteger2) == null || this.f55941d.replace(e4, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i6, i5)) {
                if (i5 == 0) {
                    this.f55941d.remove(e4, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) s().toArray(tArr);
    }
}
