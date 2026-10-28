package androidx.collection;

import java.lang.reflect.Array;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends a3<K, V> implements Map<K, V> {

    @androidx.annotation.q0
    a<K, V>.C0024a mEntrySet;

    @androidx.annotation.q0
    a<K, V>.c mKeySet;

    @androidx.annotation.q0
    a<K, V>.e mValues;

    /* compiled from: ArrayMap.java */
    /* renamed from: androidx.collection.a$a, reason: collision with other inner class name */
    final class C0024a extends AbstractSet<Map.Entry<K, V>> {
        C0024a() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @androidx.annotation.o0
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return a.this.getSize();
        }
    }

    /* compiled from: ArrayMap.java */
    final class b extends b0<K> {
        b() {
            super(a.this.getSize());
        }

        @Override // androidx.collection.b0
        protected K b(int i4) {
            return a.this.keyAt(i4);
        }

        @Override // androidx.collection.b0
        protected void c(int i4) {
            a.this.removeAt(i4);
        }
    }

    /* compiled from: ArrayMap.java */
    final class d implements Iterator<Map.Entry<K, V>>, Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        int f2159b;

        /* renamed from: c, reason: collision with root package name */
        int f2160c = -1;

        /* renamed from: d, reason: collision with root package name */
        boolean f2161d;

        d() {
            this.f2159b = a.this.getSize() - 1;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f2160c++;
            this.f2161d = true;
            return this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f2161d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return m.a.c(entry.getKey(), a.this.keyAt(this.f2160c)) && kotlin.jvm.internal.l0.g(entry.getValue(), a.this.valueAt(this.f2160c));
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            if (this.f2161d) {
                return a.this.keyAt(this.f2160c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            if (this.f2161d) {
                return a.this.valueAt(this.f2160c);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2160c < this.f2159b;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            if (!this.f2161d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            K keyAt = a.this.keyAt(this.f2160c);
            V valueAt = a.this.valueAt(this.f2160c);
            return (keyAt == null ? 0 : keyAt.hashCode()) ^ (valueAt != null ? valueAt.hashCode() : 0);
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f2161d) {
                throw new IllegalStateException();
            }
            a.this.removeAt(this.f2160c);
            this.f2160c--;
            this.f2159b--;
            this.f2161d = false;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            if (this.f2161d) {
                return a.this.setValueAt(this.f2160c, v4);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: ArrayMap.java */
    final class f extends b0<V> {
        f() {
            super(a.this.getSize());
        }

        @Override // androidx.collection.b0
        protected V b(int i4) {
            return a.this.valueAt(i4);
        }

        @Override // androidx.collection.b0
        protected void c(int i4) {
            a.this.removeAt(i4);
        }
    }

    public a() {
    }

    static <T> boolean equalsSetHelper(Set<T> set, Object obj) {
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

    public boolean containsAll(@androidx.annotation.o0 Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.a3, java.util.Map
    public boolean containsKey(@androidx.annotation.q0 Object obj) {
        return super.containsKey(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.a3, java.util.Map
    public boolean containsValue(@androidx.annotation.q0 Object obj) {
        return super.containsValue(obj);
    }

    @Override // java.util.Map
    @androidx.annotation.o0
    public Set<Map.Entry<K, V>> entrySet() {
        a<K, V>.C0024a c0024a = this.mEntrySet;
        if (c0024a != null) {
            return c0024a;
        }
        a<K, V>.C0024a c0024a2 = new C0024a();
        this.mEntrySet = c0024a2;
        return c0024a2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.a3, java.util.Map
    public V get(@androidx.annotation.q0 Object obj) {
        return (V) super.get(obj);
    }

    @Override // java.util.Map
    @androidx.annotation.o0
    public Set<K> keySet() {
        a<K, V>.c cVar = this.mKeySet;
        if (cVar != null) {
            return cVar;
        }
        a<K, V>.c cVar2 = new c();
        this.mKeySet = cVar2;
        return cVar2;
    }

    @Override // java.util.Map
    public void putAll(@androidx.annotation.o0 Map<? extends K, ? extends V> map) {
        ensureCapacity(map.size() + getSize());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.collection.a3, java.util.Map
    public V remove(@androidx.annotation.q0 Object obj) {
        return (V) super.remove(obj);
    }

    public boolean removeAll(@androidx.annotation.o0 Collection<?> collection) {
        int size = getSize();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
        return size != getSize();
    }

    public boolean retainAll(@androidx.annotation.o0 Collection<?> collection) {
        int size = getSize();
        for (int size2 = getSize() - 1; size2 >= 0; size2--) {
            if (!collection.contains(keyAt(size2))) {
                removeAt(size2);
            }
        }
        return size != getSize();
    }

    @Override // java.util.Map
    @androidx.annotation.o0
    public Collection<V> values() {
        a<K, V>.e eVar = this.mValues;
        if (eVar != null) {
            return eVar;
        }
        a<K, V>.e eVar2 = new e();
        this.mValues = eVar2;
        return eVar2;
    }

    public a(int i4) {
        super(i4);
    }

    public a(@androidx.annotation.q0 a3 a3Var) {
        super(a3Var);
    }

    /* compiled from: ArrayMap.java */
    final class c implements Set<K> {
        c() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(@androidx.annotation.o0 Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return a.this.containsKey(obj);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(@androidx.annotation.o0 Collection<?> collection) {
            return a.this.containsAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return a.equalsSetHelper(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int i4 = 0;
            for (int size = a.this.getSize() - 1; size >= 0; size--) {
                K keyAt = a.this.keyAt(size);
                i4 += keyAt == null ? 0 : keyAt.hashCode();
            }
            return i4;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return a.this.isEmpty();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        @androidx.annotation.o0
        public Iterator<K> iterator() {
            return new b();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int indexOfKey = a.this.indexOfKey(obj);
            if (indexOfKey < 0) {
                return false;
            }
            a.this.removeAt(indexOfKey);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(@androidx.annotation.o0 Collection<?> collection) {
            return a.this.removeAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(@androidx.annotation.o0 Collection<?> collection) {
            return a.this.retainAll(collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return a.this.getSize();
        }

        @Override // java.util.Set, java.util.Collection
        @androidx.annotation.o0
        public <T> T[] toArray(@androidx.annotation.o0 T[] tArr) {
            int size = a.this.getSize();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i4 = 0; i4 < size; i4++) {
                tArr[i4] = a.this.keyAt(i4);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Set, java.util.Collection
        @androidx.annotation.o0
        public Object[] toArray() {
            int size = a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i4 = 0; i4 < size; i4++) {
                objArr[i4] = a.this.keyAt(i4);
            }
            return objArr;
        }
    }

    /* compiled from: ArrayMap.java */
    final class e implements Collection<V> {
        e() {
        }

        @Override // java.util.Collection
        public boolean add(V v4) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public boolean addAll(@androidx.annotation.o0 Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection
        public void clear() {
            a.this.clear();
        }

        @Override // java.util.Collection
        public boolean contains(Object obj) {
            return a.this.__restricted$indexOfValue(obj) >= 0;
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
            return a.this.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable
        @androidx.annotation.o0
        public Iterator<V> iterator() {
            return new f();
        }

        @Override // java.util.Collection
        public boolean remove(Object obj) {
            int __restricted$indexOfValue = a.this.__restricted$indexOfValue(obj);
            if (__restricted$indexOfValue < 0) {
                return false;
            }
            a.this.removeAt(__restricted$indexOfValue);
            return true;
        }

        @Override // java.util.Collection
        public boolean removeAll(@androidx.annotation.o0 Collection<?> collection) {
            int size = a.this.getSize();
            int i4 = 0;
            boolean z4 = false;
            while (i4 < size) {
                if (collection.contains(a.this.valueAt(i4))) {
                    a.this.removeAt(i4);
                    i4--;
                    size--;
                    z4 = true;
                }
                i4++;
            }
            return z4;
        }

        @Override // java.util.Collection
        public boolean retainAll(@androidx.annotation.o0 Collection<?> collection) {
            int size = a.this.getSize();
            int i4 = 0;
            boolean z4 = false;
            while (i4 < size) {
                if (!collection.contains(a.this.valueAt(i4))) {
                    a.this.removeAt(i4);
                    i4--;
                    size--;
                    z4 = true;
                }
                i4++;
            }
            return z4;
        }

        @Override // java.util.Collection
        public int size() {
            return a.this.getSize();
        }

        @Override // java.util.Collection
        @androidx.annotation.o0
        public <T> T[] toArray(@androidx.annotation.o0 T[] tArr) {
            int size = a.this.getSize();
            if (tArr.length < size) {
                tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
            }
            for (int i4 = 0; i4 < size; i4++) {
                tArr[i4] = a.this.valueAt(i4);
            }
            if (tArr.length > size) {
                tArr[size] = null;
            }
            return tArr;
        }

        @Override // java.util.Collection
        @androidx.annotation.o0
        public Object[] toArray() {
            int size = a.this.getSize();
            Object[] objArr = new Object[size];
            for (int i4 = 0; i4 < size; i4++) {
                objArr[i4] = a.this.valueAt(i4);
            }
            return objArr;
        }
    }
}
