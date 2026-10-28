package androidx.collection;

import androidx.annotation.q0;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* loaded from: classes.dex */
abstract class h<K, V> {

    /* renamed from: a, reason: collision with root package name */
    @q0
    h<K, V>.b f1512a;

    /* renamed from: b, reason: collision with root package name */
    @q0
    h<K, V>.c f1513b;

    /* renamed from: c, reason: collision with root package name */
    @q0
    h<K, V>.e f1514c;

    /* compiled from: MapCollections.java */
    final class a<T> implements Iterator<T> {

        /* renamed from: o, reason: collision with root package name */
        final int f1515o;

        /* renamed from: p, reason: collision with root package name */
        int f1516p;

        /* renamed from: q, reason: collision with root package name */
        int f1517q;

        /* renamed from: r, reason: collision with root package name */
        boolean f1518r = false;

        a(int i5) {
            this.f1515o = i5;
            this.f1516p = h.this.d();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1517q < this.f1516p;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t5 = (T) h.this.b(this.f1517q, this.f1515o);
            this.f1517q++;
            this.f1518r = true;
            return t5;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1518r) {
                throw new IllegalStateException();
            }
            int i5 = this.f1517q - 1;
            this.f1517q = i5;
            this.f1516p--;
            this.f1518r = false;
            h.this.h(i5);
        }
    }

    /* compiled from: MapCollections.java */
    final class b implements Set<Map.Entry<K, V>> {
        b() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d6 = h.this.d();
            for (Map.Entry<K, V> entry : collection) {
                h.this.g(entry.getKey(), entry.getValue());
            }
            return d6 != h.this.d();
        }

        public boolean b(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e6 = h.this.e(entry.getKey());
            if (e6 < 0) {
                return false;
            }
            return androidx.collection.e.c(h.this.b(e6, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i5 = 0;
            for (int d6 = h.this.d() - 1; d6 >= 0; d6--) {
                Object b6 = h.this.b(d6, 0);
                Object b7 = h.this.b(d6, 1);
                i5 += (b6 == null ? 0 : b6.hashCode()) ^ (b7 == null ? 0 : b7.hashCode());
            }
            return i5;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return h.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return h.j(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return h.k(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i5 = 0;
            for (int d6 = h.this.d() - 1; d6 >= 0; d6--) {
                Object b6 = h.this.b(d6, 0);
                i5 += b6 == null ? 0 : b6.hashCode();
            }
            return i5;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int e6 = h.this.e(obj);
            if (e6 < 0) {
                return false;
            }
            h.this.h(e6);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return h.o(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return h.p(h.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return h.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.r(tArr, 0);
        }
    }

    /* compiled from: MapCollections.java */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: o, reason: collision with root package name */
        int f1522o;

        /* renamed from: q, reason: collision with root package name */
        boolean f1524q = false;

        /* renamed from: p, reason: collision with root package name */
        int f1523p = -1;

        d() {
            this.f1522o = h.this.d() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f1523p++;
            this.f1524q = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f1524q) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return androidx.collection.e.c(entry.getKey(), h.this.b(this.f1523p, 0)) && androidx.collection.e.c(entry.getValue(), h.this.b(this.f1523p, 1));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f1524q) {
                return (K) h.this.b(this.f1523p, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f1524q) {
                return (V) h.this.b(this.f1523p, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1523p < this.f1522o;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f1524q) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object b6 = h.this.b(this.f1523p, 0);
            Object b7 = h.this.b(this.f1523p, 1);
            return (b6 == null ? 0 : b6.hashCode()) ^ (b7 != null ? b7.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f1524q) {
                throw new IllegalStateException();
            }
            h.this.h(this.f1523p);
            this.f1523p--;
            this.f1522o--;
            this.f1524q = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            if (this.f1524q) {
                return (V) h.this.i(this.f1523p, v5);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v5) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            h.this.a();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return h.this.f(obj) >= 0;
        }

        @Override // java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            return h.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int f6 = h.this.f(obj);
            if (f6 < 0) {
                return false;
            }
            h.this.h(f6);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            int d6 = h.this.d();
            int i5 = 0;
            boolean z5 = false;
            while (i5 < d6) {
                if (collection.contains(h.this.b(i5, 1))) {
                    h.this.h(i5);
                    i5--;
                    d6--;
                    z5 = true;
                }
                i5++;
            }
            return z5;
        }

        @Override // java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            int d6 = h.this.d();
            int i5 = 0;
            boolean z5 = false;
            while (i5 < d6) {
                if (!collection.contains(h.this.b(i5, 1))) {
                    h.this.h(i5);
                    i5--;
                    d6--;
                    z5 = true;
                }
                i5++;
            }
            return z5;
        }

        @Override // java.util.Collection
        public int size() {
            return h.this.d();
        }

        @Override // java.util.Collection
        public Object[] toArray() {
            return h.this.q(1);
        }

        @Override // java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) h.this.r(tArr, 1);
        }
    }

    h() {
    }

    public static <K, V> boolean j(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i5, int i6);

    protected abstract Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k5, V v5);

    protected abstract void h(int i5);

    protected abstract V i(int i5, V v5);

    public Set<Map.Entry<K, V>> l() {
        if (this.f1512a == null) {
            this.f1512a = new b();
        }
        return this.f1512a;
    }

    public Set<K> m() {
        if (this.f1513b == null) {
            this.f1513b = new c();
        }
        return this.f1513b;
    }

    public Collection<V> n() {
        if (this.f1514c == null) {
            this.f1514c = new e();
        }
        return this.f1514c;
    }

    public Object[] q(int i5) {
        int d6 = d();
        Object[] objArr = new Object[d6];
        for (int i6 = 0; i6 < d6; i6++) {
            objArr[i6] = b(i6, i5);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i5) {
        int d6 = d();
        if (tArr.length < d6) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), d6));
        }
        for (int i6 = 0; i6 < d6; i6++) {
            tArr[i6] = b(i6, i5);
        }
        if (tArr.length > d6) {
            tArr[d6] = null;
        }
        return tArr;
    }
}
