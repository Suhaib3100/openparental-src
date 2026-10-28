package com.google.common.collect;

import com.google.common.collect.s6;
import com.google.common.collect.u4;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: Synchronized.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class r6 {

    /* compiled from: Synchronized.java */
    private static class b<K, V> extends k<K, Collection<V>> {

        /* renamed from: k, reason: collision with root package name */
        private static final long f56322k = 0;

        /* renamed from: i, reason: collision with root package name */
        @zc.a
        transient Set<Map.Entry<K, Collection<V>>> f56323i;

        /* renamed from: j, reason: collision with root package name */
        @zc.a
        transient Collection<Collection<V>> f56324j;

        b(Map<K, Collection<V>> map, @zc.a Object obj) {
            super((Object) map, obj);
        }

        @Override // com.google.common.collect.r6.k, java.util.Map
        public boolean containsValue(@zc.a Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.r6.k, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f56360c) {
                try {
                    if (this.f56323i == null) {
                        this.f56323i = new c((Object) r().entrySet(), this.f56360c);
                    }
                    set = this.f56323i;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.r6.k, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f56360c) {
                try {
                    if (this.f56324j == null) {
                        this.f56324j = new d((Object) r().values(), this.f56360c);
                    }
                    collection = this.f56324j;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.r6.k, java.util.Map
        @zc.a
        public Collection<V> get(@zc.a Object obj) {
            Collection<V> A;
            synchronized (this.f56360c) {
                Collection collection = (Collection) super.get(obj);
                A = collection == null ? null : r6.A(collection, this.f56360c);
            }
            return A;
        }
    }

    /* compiled from: Synchronized.java */
    private static class d<V> extends f<Collection<V>> {

        /* renamed from: f, reason: collision with root package name */
        private static final long f56329f = 0;

        /* compiled from: Synchronized.java */
        class a extends v6<Collection<V>, Collection<V>> {
            a(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.v6
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<V> a(Collection<V> collection) {
                return r6.A(collection, d.this.f56360c);
            }
        }

        d(Collection<Collection<V>> collection, @zc.a Object obj) {
            super((Object) collection, obj);
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new a(super.iterator());
        }
    }

    /* compiled from: Synchronized.java */
    @d9.d
    static class e<K, V> extends k<K, V> implements com.google.common.collect.w<K, V>, Serializable {

        /* renamed from: k, reason: collision with root package name */
        private static final long f56331k = 0;

        /* renamed from: i, reason: collision with root package name */
        @zc.a
        private transient Set<V> f56332i;

        /* renamed from: j, reason: collision with root package name */
        @zc.a
        @ma.h
        private transient com.google.common.collect.w<V, K> f56333j;

        private e(com.google.common.collect.w<K, V> wVar, @zc.a Object obj, @zc.a com.google.common.collect.w<V, K> wVar2) {
            super((Object) wVar, obj);
            this.f56333j = wVar2;
        }

        @Override // com.google.common.collect.w
        public com.google.common.collect.w<V, K> M2() {
            com.google.common.collect.w<V, K> wVar;
            synchronized (this.f56360c) {
                try {
                    if (this.f56333j == null) {
                        this.f56333j = new e(j().M2(), this.f56360c, this);
                    }
                    wVar = this.f56333j;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return wVar;
        }

        @Override // com.google.common.collect.w
        @zc.a
        public V a2(K k4, V v4) {
            V a22;
            synchronized (this.f56360c) {
                a22 = j().a2(k4, v4);
            }
            return a22;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.k
        /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public com.google.common.collect.w<K, V> r() {
            return (com.google.common.collect.w) ((Map) this.f56359b);
        }

        @Override // com.google.common.collect.r6.k, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.f56360c) {
                try {
                    if (this.f56332i == null) {
                        this.f56332i = new s((Object) j().values(), this.f56360c);
                    }
                    set = this.f56332i;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    /* compiled from: Synchronized.java */
    @d9.d
    static class f<E> extends p implements Collection<E> {

        /* renamed from: e, reason: collision with root package name */
        private static final long f56334e = 0;

        private f(Collection<E> collection, @zc.a Object obj) {
            super(collection, obj);
        }

        @Override // java.util.Collection
        public boolean add(E e4) {
            boolean add;
            synchronized (this.f56360c) {
                add = r().add(e4);
            }
            return add;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.f56360c) {
                addAll = r().addAll(collection);
            }
            return addAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f56360c) {
                r().clear();
            }
        }

        public boolean contains(@zc.a Object obj) {
            boolean contains;
            synchronized (this.f56360c) {
                contains = r().contains(obj);
            }
            return contains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean containsAll;
            synchronized (this.f56360c) {
                containsAll = r().containsAll(collection);
            }
            return containsAll;
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f56360c) {
                isEmpty = r().isEmpty();
            }
            return isEmpty;
        }

        public Iterator<E> iterator() {
            return r().iterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.p
        /* renamed from: q */
        public Collection<E> q() {
            return (Collection) this.f56359b;
        }

        public boolean remove(@zc.a Object obj) {
            boolean remove;
            synchronized (this.f56360c) {
                remove = r().remove(obj);
            }
            return remove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean removeAll;
            synchronized (this.f56360c) {
                removeAll = r().removeAll(collection);
            }
            return removeAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean retainAll;
            synchronized (this.f56360c) {
                retainAll = r().retainAll(collection);
            }
            return retainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f56360c) {
                size = r().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f56360c) {
                array = r().toArray();
            }
            return array;
        }

        f(Collection collection, Object obj, a aVar) {
            super(collection, obj);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f56360c) {
                tArr2 = (T[]) r().toArray(tArr);
            }
            return tArr2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Synchronized.java */
    static final class g<E> extends q<E> implements Deque<E> {

        /* renamed from: g, reason: collision with root package name */
        private static final long f56335g = 0;

        g(Deque<E> deque, @zc.a Object obj) {
            super((Object) deque, obj);
        }

        @Override // java.util.Deque
        public void addFirst(E e4) {
            synchronized (this.f56360c) {
                ((Deque) super.q()).addFirst(e4);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e4) {
            synchronized (this.f56360c) {
                ((Deque) super.q()).addLast(e4);
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> descendingIterator;
            synchronized (this.f56360c) {
                descendingIterator = ((Deque) super.q()).descendingIterator();
            }
            return descendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).getFirst();
            }
            return e4;
        }

        @Override // java.util.Deque
        public E getLast() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).getLast();
            }
            return e4;
        }

        @Override // com.google.common.collect.r6.q, com.google.common.collect.r6.f, com.google.common.collect.r6.p
        /* renamed from: j */
        Object q() {
            return (Deque) super.q();
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e4) {
            boolean offerFirst;
            synchronized (this.f56360c) {
                offerFirst = ((Deque) super.q()).offerFirst(e4);
            }
            return offerFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e4) {
            boolean offerLast;
            synchronized (this.f56360c) {
                offerLast = ((Deque) super.q()).offerLast(e4);
            }
            return offerLast;
        }

        @Override // java.util.Deque
        @zc.a
        public E peekFirst() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).peekFirst();
            }
            return e4;
        }

        @Override // java.util.Deque
        @zc.a
        public E peekLast() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).peekLast();
            }
            return e4;
        }

        @Override // java.util.Deque
        @zc.a
        public E pollFirst() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).pollFirst();
            }
            return e4;
        }

        @Override // java.util.Deque
        @zc.a
        public E pollLast() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).pollLast();
            }
            return e4;
        }

        @Override // java.util.Deque
        public E pop() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).pop();
            }
            return e4;
        }

        @Override // java.util.Deque
        public void push(E e4) {
            synchronized (this.f56360c) {
                ((Deque) super.q()).push(e4);
            }
        }

        @Override // com.google.common.collect.r6.q, com.google.common.collect.r6.f
        /* renamed from: q */
        Collection r() {
            return (Deque) super.q();
        }

        @Override // com.google.common.collect.r6.q
        /* renamed from: r */
        Queue q() {
            return (Deque) super.q();
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).removeFirst();
            }
            return e4;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(@zc.a Object obj) {
            boolean removeFirstOccurrence;
            synchronized (this.f56360c) {
                removeFirstOccurrence = ((Deque) super.q()).removeFirstOccurrence(obj);
            }
            return removeFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E e4;
            synchronized (this.f56360c) {
                e4 = (E) ((Deque) super.q()).removeLast();
            }
            return e4;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(@zc.a Object obj) {
            boolean removeLastOccurrence;
            synchronized (this.f56360c) {
                removeLastOccurrence = ((Deque) super.q()).removeLastOccurrence(obj);
            }
            return removeLastOccurrence;
        }

        Deque<E> v() {
            return (Deque) super.q();
        }
    }

    /* compiled from: Synchronized.java */
    @d9.c
    private static class h<K, V> extends p implements Map.Entry<K, V> {

        /* renamed from: e, reason: collision with root package name */
        private static final long f56336e = 0;

        h(Map.Entry<K, V> entry, @zc.a Object obj) {
            super(entry, obj);
        }

        @Override // java.util.Map.Entry
        public boolean equals(@zc.a Object obj) {
            boolean equals;
            synchronized (this.f56360c) {
                equals = q().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K key;
            synchronized (this.f56360c) {
                key = q().getKey();
            }
            return key;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V value;
            synchronized (this.f56360c) {
                value = q().getValue();
            }
            return value;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int hashCode;
            synchronized (this.f56360c) {
                hashCode = q().hashCode();
            }
            return hashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.p
        public Map.Entry<K, V> q() {
            return (Map.Entry) this.f56359b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            V value;
            synchronized (this.f56360c) {
                value = q().setValue(v4);
            }
            return value;
        }
    }

    /* compiled from: Synchronized.java */
    private static class i<E> extends f<E> implements List<E> {

        /* renamed from: f, reason: collision with root package name */
        private static final long f56337f = 0;

        i(List<E> list, @zc.a Object obj) {
            super((Object) list, obj);
        }

        @Override // java.util.List
        public void add(int i4, E e4) {
            synchronized (this.f56360c) {
                q().add(i4, e4);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i4, Collection<? extends E> collection) {
            boolean addAll;
            synchronized (this.f56360c) {
                addAll = q().addAll(i4, collection);
            }
            return addAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(@zc.a Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f56360c) {
                equals = q().equals(obj);
            }
            return equals;
        }

        @Override // java.util.List
        public E get(int i4) {
            E e4;
            synchronized (this.f56360c) {
                e4 = q().get(i4);
            }
            return e4;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int hashCode;
            synchronized (this.f56360c) {
                hashCode = q().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.List
        public int indexOf(@zc.a Object obj) {
            int indexOf;
            synchronized (this.f56360c) {
                indexOf = q().indexOf(obj);
            }
            return indexOf;
        }

        @Override // java.util.List
        public int lastIndexOf(@zc.a Object obj) {
            int lastIndexOf;
            synchronized (this.f56360c) {
                lastIndexOf = q().lastIndexOf(obj);
            }
            return lastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return q().listIterator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.f
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public List<E> r() {
            return (List) ((Collection) this.f56359b);
        }

        @Override // java.util.List
        public E remove(int i4) {
            E remove;
            synchronized (this.f56360c) {
                remove = q().remove(i4);
            }
            return remove;
        }

        @Override // java.util.List
        public E set(int i4, E e4) {
            E e5;
            synchronized (this.f56360c) {
                e5 = q().set(i4, e4);
            }
            return e5;
        }

        @Override // java.util.List
        public List<E> subList(int i4, int i5) {
            List<E> j4;
            synchronized (this.f56360c) {
                j4 = r6.j(q().subList(i4, i5), this.f56360c);
            }
            return j4;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i4) {
            return q().listIterator(i4);
        }
    }

    /* compiled from: Synchronized.java */
    private static class j<K, V> extends l<K, V> implements k4<K, V> {

        /* renamed from: k, reason: collision with root package name */
        private static final long f56338k = 0;

        j(k4<K, V> k4Var, @zc.a Object obj) {
            super((Object) k4Var, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Collection c(Object obj, Iterable iterable) {
            return c((j<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Collection v(Object obj) {
            return v((j<K, V>) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.l
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public k4<K, V> q() {
            return (k4) ((r4) this.f56359b);
        }

        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public List<V> b(@zc.a Object obj) {
            List<V> b5;
            synchronized (this.f56360c) {
                b5 = q().b(obj);
            }
            return b5;
        }

        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public List<V> c(K k4, Iterable<? extends V> iterable) {
            List<V> c5;
            synchronized (this.f56360c) {
                c5 = q().c((k4<K, V>) k4, (Iterable) iterable);
            }
            return c5;
        }

        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public List<V> v(K k4) {
            List<V> j4;
            synchronized (this.f56360c) {
                j4 = r6.j(q().v((k4<K, V>) k4), this.f56360c);
            }
            return j4;
        }
    }

    /* compiled from: Synchronized.java */
    private static class k<K, V> extends p implements Map<K, V> {

        /* renamed from: h, reason: collision with root package name */
        private static final long f56339h = 0;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        transient Set<K> f56340e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        transient Collection<V> f56341f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        transient Set<Map.Entry<K, V>> f56342g;

        k(Map<K, V> map, @zc.a Object obj) {
            super(map, obj);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f56360c) {
                r().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            boolean containsKey;
            synchronized (this.f56360c) {
                containsKey = r().containsKey(obj);
            }
            return containsKey;
        }

        public boolean containsValue(@zc.a Object obj) {
            boolean containsValue;
            synchronized (this.f56360c) {
                containsValue = r().containsValue(obj);
            }
            return containsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f56360c) {
                try {
                    if (this.f56342g == null) {
                        this.f56342g = new s((Object) r().entrySet(), this.f56360c);
                    }
                    set = this.f56342g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(@zc.a Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f56360c) {
                equals = r().equals(obj);
            }
            return equals;
        }

        @zc.a
        public V get(@zc.a Object obj) {
            V v4;
            synchronized (this.f56360c) {
                v4 = r().get(obj);
            }
            return v4;
        }

        @Override // java.util.Map
        public int hashCode() {
            int hashCode;
            synchronized (this.f56360c) {
                hashCode = r().hashCode();
            }
            return hashCode;
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f56360c) {
                isEmpty = r().isEmpty();
            }
            return isEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f56360c) {
                try {
                    if (this.f56340e == null) {
                        this.f56340e = new s((Object) r().keySet(), this.f56360c);
                    }
                    set = this.f56340e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Map
        @zc.a
        public V put(K k4, V v4) {
            V put;
            synchronized (this.f56360c) {
                put = r().put(k4, v4);
            }
            return put;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f56360c) {
                r().putAll(map);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.p
        /* renamed from: q */
        public Map<K, V> q() {
            return (Map) this.f56359b;
        }

        @Override // java.util.Map
        @zc.a
        public V remove(@zc.a Object obj) {
            V remove;
            synchronized (this.f56360c) {
                remove = r().remove(obj);
            }
            return remove;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f56360c) {
                size = r().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f56360c) {
                try {
                    if (this.f56341f == null) {
                        this.f56341f = new f((Object) r().values(), this.f56360c);
                    }
                    collection = this.f56341f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    /* compiled from: Synchronized.java */
    private static class l<K, V> extends p implements r4<K, V> {

        /* renamed from: j, reason: collision with root package name */
        private static final long f56343j = 0;

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        transient Set<K> f56344e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        transient Collection<V> f56345f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        transient Collection<Map.Entry<K, V>> f56346g;

        /* renamed from: h, reason: collision with root package name */
        @zc.a
        transient Map<K, Collection<V>> f56347h;

        /* renamed from: i, reason: collision with root package name */
        @zc.a
        transient u4<K> f56348i;

        l(r4<K, V> r4Var, @zc.a Object obj) {
            super(r4Var, obj);
        }

        @Override // com.google.common.collect.r4
        public boolean T2(@zc.a Object obj, @zc.a Object obj2) {
            boolean T2;
            synchronized (this.f56360c) {
                T2 = q().T2(obj, obj2);
            }
            return T2;
        }

        public Collection<V> b(@zc.a Object obj) {
            Collection<V> b5;
            synchronized (this.f56360c) {
                b5 = q().b(obj);
            }
            return b5;
        }

        public Collection<V> c(K k4, Iterable<? extends V> iterable) {
            Collection<V> c5;
            synchronized (this.f56360c) {
                c5 = q().c(k4, iterable);
            }
            return c5;
        }

        @Override // com.google.common.collect.r4
        public void clear() {
            synchronized (this.f56360c) {
                q().clear();
            }
        }

        @Override // com.google.common.collect.r4
        public boolean containsKey(@zc.a Object obj) {
            boolean containsKey;
            synchronized (this.f56360c) {
                containsKey = q().containsKey(obj);
            }
            return containsKey;
        }

        @Override // com.google.common.collect.r4
        public boolean containsValue(@zc.a Object obj) {
            boolean containsValue;
            synchronized (this.f56360c) {
                containsValue = q().containsValue(obj);
            }
            return containsValue;
        }

        @Override // com.google.common.collect.r4
        public boolean equals(@zc.a Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f56360c) {
                equals = q().equals(obj);
            }
            return equals;
        }

        @Override // com.google.common.collect.r4
        public Map<K, Collection<V>> f() {
            Map<K, Collection<V>> map;
            synchronized (this.f56360c) {
                try {
                    if (this.f56347h == null) {
                        this.f56347h = new b((Object) q().f(), this.f56360c);
                    }
                    map = this.f56347h;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return map;
        }

        /* renamed from: get */
        public Collection<V> v(K k4) {
            Collection<V> A;
            synchronized (this.f56360c) {
                A = r6.A(q().v(k4), this.f56360c);
            }
            return A;
        }

        @Override // com.google.common.collect.r4
        /* renamed from: h */
        public Collection<Map.Entry<K, V>> t() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.f56360c) {
                try {
                    if (this.f56346g == null) {
                        this.f56346g = r6.A(q().t(), this.f56360c);
                    }
                    collection = this.f56346g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.r4
        public int hashCode() {
            int hashCode;
            synchronized (this.f56360c) {
                hashCode = q().hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.r4
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f56360c) {
                isEmpty = q().isEmpty();
            }
            return isEmpty;
        }

        @Override // com.google.common.collect.r4
        public boolean k1(K k4, Iterable<? extends V> iterable) {
            boolean k12;
            synchronized (this.f56360c) {
                k12 = q().k1(k4, iterable);
            }
            return k12;
        }

        @Override // com.google.common.collect.r4
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f56360c) {
                try {
                    if (this.f56344e == null) {
                        this.f56344e = r6.B(q().keySet(), this.f56360c);
                    }
                    set = this.f56344e;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.r4
        public u4<K> keys() {
            u4<K> u4Var;
            synchronized (this.f56360c) {
                try {
                    if (this.f56348i == null) {
                        this.f56348i = r6.n(q().keys(), this.f56360c);
                    }
                    u4Var = this.f56348i;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return u4Var;
        }

        @Override // com.google.common.collect.r4
        public boolean n0(r4<? extends K, ? extends V> r4Var) {
            boolean n02;
            synchronized (this.f56360c) {
                n02 = q().n0(r4Var);
            }
            return n02;
        }

        @Override // com.google.common.collect.r4
        public boolean put(K k4, V v4) {
            boolean put;
            synchronized (this.f56360c) {
                put = q().put(k4, v4);
            }
            return put;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.p
        public r4<K, V> q() {
            return (r4) this.f56359b;
        }

        @Override // com.google.common.collect.r4
        public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
            boolean remove;
            synchronized (this.f56360c) {
                remove = q().remove(obj, obj2);
            }
            return remove;
        }

        @Override // com.google.common.collect.r4
        public int size() {
            int size;
            synchronized (this.f56360c) {
                size = q().size();
            }
            return size;
        }

        @Override // com.google.common.collect.r4
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f56360c) {
                try {
                    if (this.f56345f == null) {
                        this.f56345f = new f((Object) q().values(), this.f56360c);
                    }
                    collection = this.f56345f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return collection;
        }
    }

    /* compiled from: Synchronized.java */
    private static class m<E> extends f<E> implements u4<E> {

        /* renamed from: h, reason: collision with root package name */
        private static final long f56349h = 0;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        transient Set<E> f56350f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        transient Set<u4.a<E>> f56351g;

        m(u4<E> u4Var, @zc.a Object obj) {
            super((Object) u4Var, obj);
        }

        @Override // com.google.common.collect.u4
        public int W1(@zc.a Object obj, int i4) {
            int W1;
            synchronized (this.f56360c) {
                W1 = q().W1(obj, i4);
            }
            return W1;
        }

        @Override // com.google.common.collect.u4
        public int W2(@zc.a Object obj) {
            int W2;
            synchronized (this.f56360c) {
                W2 = q().W2(obj);
            }
            return W2;
        }

        @Override // com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
        public Set<E> d() {
            Set<E> set;
            synchronized (this.f56360c) {
                try {
                    if (this.f56350f == null) {
                        this.f56350f = r6.B(q().d(), this.f56360c);
                    }
                    set = this.f56350f;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.u4
        public int d2(E e4, int i4) {
            int d22;
            synchronized (this.f56360c) {
                d22 = q().d2(e4, i4);
            }
            return d22;
        }

        @Override // com.google.common.collect.u4, com.google.common.collect.k6
        public Set<u4.a<E>> entrySet() {
            Set<u4.a<E>> set;
            synchronized (this.f56360c) {
                try {
                    if (this.f56351g == null) {
                        this.f56351g = r6.B(q().entrySet(), this.f56360c);
                    }
                    set = this.f56351g;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.u4
        public boolean equals(@zc.a Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f56360c) {
                equals = q().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Collection, com.google.common.collect.u4
        public int hashCode() {
            int hashCode;
            synchronized (this.f56360c) {
                hashCode = q().hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.u4
        public int o0(E e4, int i4) {
            int o02;
            synchronized (this.f56360c) {
                o02 = q().o0(e4, i4);
            }
            return o02;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.f
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public u4<E> r() {
            return (u4) ((Collection) this.f56359b);
        }

        @Override // com.google.common.collect.u4
        public boolean x2(E e4, int i4, int i5) {
            boolean x22;
            synchronized (this.f56360c) {
                x22 = q().x2(e4, i4, i5);
            }
            return x22;
        }
    }

    /* compiled from: Synchronized.java */
    static class p implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        @d9.c
        private static final long f56358d = 0;

        /* renamed from: b, reason: collision with root package name */
        final Object f56359b;

        /* renamed from: c, reason: collision with root package name */
        final Object f56360c;

        p(Object obj, @zc.a Object obj2) {
            obj.getClass();
            this.f56359b = obj;
            this.f56360c = obj2 == null ? this : obj2;
        }

        @d9.c
        private void p(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.f56360c) {
                objectOutputStream.defaultWriteObject();
            }
        }

        /* renamed from: j */
        Object q() {
            return this.f56359b;
        }

        public String toString() {
            String obj;
            synchronized (this.f56360c) {
                obj = this.f56359b.toString();
            }
            return obj;
        }
    }

    /* compiled from: Synchronized.java */
    private static class q<E> extends f<E> implements Queue<E> {

        /* renamed from: f, reason: collision with root package name */
        private static final long f56361f = 0;

        q(Queue<E> queue, @zc.a Object obj) {
            super((Object) queue, obj);
        }

        @Override // java.util.Queue
        public E element() {
            E element;
            synchronized (this.f56360c) {
                element = q().element();
            }
            return element;
        }

        @Override // java.util.Queue
        public boolean offer(E e4) {
            boolean offer;
            synchronized (this.f56360c) {
                offer = q().offer(e4);
            }
            return offer;
        }

        @Override // java.util.Queue
        @zc.a
        public E peek() {
            E peek;
            synchronized (this.f56360c) {
                peek = q().peek();
            }
            return peek;
        }

        @Override // java.util.Queue
        @zc.a
        public E poll() {
            E poll;
            synchronized (this.f56360c) {
                poll = q().poll();
            }
            return poll;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.f
        /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Queue<E> r() {
            return (Queue) ((Collection) this.f56359b);
        }

        @Override // java.util.Queue
        public E remove() {
            E remove;
            synchronized (this.f56360c) {
                remove = q().remove();
            }
            return remove;
        }
    }

    /* compiled from: Synchronized.java */
    private static class r<E> extends i<E> implements RandomAccess {

        /* renamed from: g, reason: collision with root package name */
        private static final long f56362g = 0;

        r(List<E> list, @zc.a Object obj) {
            super((Object) list, obj);
        }
    }

    /* compiled from: Synchronized.java */
    static class s<E> extends f<E> implements Set<E> {

        /* renamed from: f, reason: collision with root package name */
        private static final long f56363f = 0;

        s(Set<E> set, @zc.a Object obj) {
            super((Object) set, obj);
        }

        public boolean equals(@zc.a Object obj) {
            boolean equals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f56360c) {
                equals = r().equals(obj);
            }
            return equals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int hashCode;
            synchronized (this.f56360c) {
                hashCode = r().hashCode();
            }
            return hashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.f
        public Set<E> r() {
            return (Set) ((Collection) this.f56359b);
        }
    }

    /* compiled from: Synchronized.java */
    private static class t<K, V> extends l<K, V> implements c6<K, V> {

        /* renamed from: l, reason: collision with root package name */
        private static final long f56364l = 0;

        /* renamed from: k, reason: collision with root package name */
        @zc.a
        transient Set<Map.Entry<K, V>> f56365k;

        t(c6<K, V> c6Var, @zc.a Object obj) {
            super((Object) c6Var, obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Collection c(Object obj, Iterable iterable) {
            return c((t<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Collection v(Object obj) {
            return v((t<K, V>) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.l
        public c6<K, V> q() {
            return (c6) ((r4) this.f56359b);
        }

        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public Set<V> b(@zc.a Object obj) {
            Set<V> b5;
            synchronized (this.f56360c) {
                b5 = r().b(obj);
            }
            return b5;
        }

        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public Set<V> c(K k4, Iterable<? extends V> iterable) {
            Set<V> c5;
            synchronized (this.f56360c) {
                c5 = r().c((c6<K, V>) k4, (Iterable) iterable);
            }
            return c5;
        }

        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public Set<V> v(K k4) {
            s sVar;
            synchronized (this.f56360c) {
                sVar = new s((Object) r().v((c6<K, V>) k4), this.f56360c);
            }
            return sVar;
        }

        @Override // com.google.common.collect.r6.l, com.google.common.collect.r4
        /* renamed from: h */
        public Set<Map.Entry<K, V>> t() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f56360c) {
                try {
                    if (this.f56365k == null) {
                        this.f56365k = new s((Object) r().t(), this.f56360c);
                    }
                    set = this.f56365k;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return set;
        }
    }

    /* compiled from: Synchronized.java */
    static class u<K, V> extends k<K, V> implements SortedMap<K, V> {

        /* renamed from: i, reason: collision with root package name */
        private static final long f56366i = 0;

        u(SortedMap<K, V> sortedMap, @zc.a Object obj) {
            super((Object) sortedMap, obj);
        }

        @Override // java.util.SortedMap
        @zc.a
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f56360c) {
                comparator = q().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K firstKey;
            synchronized (this.f56360c) {
                firstKey = q().firstKey();
            }
            return firstKey;
        }

        public SortedMap<K, V> headMap(K k4) {
            u uVar;
            synchronized (this.f56360c) {
                uVar = new u((Object) q().headMap(k4), this.f56360c);
            }
            return uVar;
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K lastKey;
            synchronized (this.f56360c) {
                lastKey = q().lastKey();
            }
            return lastKey;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.k
        /* renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedMap<K, V> r() {
            return (SortedMap) ((Map) this.f56359b);
        }

        public SortedMap<K, V> subMap(K k4, K k5) {
            u uVar;
            synchronized (this.f56360c) {
                uVar = new u((Object) q().subMap(k4, k5), this.f56360c);
            }
            return uVar;
        }

        public SortedMap<K, V> tailMap(K k4) {
            u uVar;
            synchronized (this.f56360c) {
                uVar = new u((Object) q().tailMap(k4), this.f56360c);
            }
            return uVar;
        }
    }

    /* compiled from: Synchronized.java */
    static class v<E> extends s<E> implements SortedSet<E> {

        /* renamed from: g, reason: collision with root package name */
        private static final long f56367g = 0;

        v(SortedSet<E> sortedSet, @zc.a Object obj) {
            super((Object) sortedSet, obj);
        }

        @Override // java.util.SortedSet
        @zc.a
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f56360c) {
                comparator = r().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E first;
            synchronized (this.f56360c) {
                first = r().first();
            }
            return first;
        }

        public SortedSet<E> headSet(E e4) {
            v vVar;
            synchronized (this.f56360c) {
                vVar = new v((Object) r().headSet(e4), this.f56360c);
            }
            return vVar;
        }

        @Override // java.util.SortedSet
        public E last() {
            E last;
            synchronized (this.f56360c) {
                last = r().last();
            }
            return last;
        }

        public SortedSet<E> subSet(E e4, E e5) {
            v vVar;
            synchronized (this.f56360c) {
                vVar = new v((Object) r().subSet(e4, e5), this.f56360c);
            }
            return vVar;
        }

        public SortedSet<E> tailSet(E e4) {
            v vVar;
            synchronized (this.f56360c) {
                vVar = new v((Object) r().tailSet(e4), this.f56360c);
            }
            return vVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.s
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public SortedSet<E> r() {
            return (SortedSet) super.r();
        }
    }

    /* compiled from: Synchronized.java */
    private static class w<K, V> extends t<K, V> implements n6<K, V> {

        /* renamed from: m, reason: collision with root package name */
        private static final long f56368m = 0;

        w(n6<K, V> n6Var, @zc.a Object obj) {
            super((Object) n6Var, obj);
        }

        @Override // com.google.common.collect.n6
        @zc.a
        public Comparator<? super V> K0() {
            Comparator<? super V> K0;
            synchronized (this.f56360c) {
                K0 = r().K0();
            }
            return K0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r6.t, com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Collection c(Object obj, Iterable iterable) {
            return c((w<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r6.t, com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Collection v(Object obj) {
            return v((w<K, V>) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.t
        /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public n6<K, V> r() {
            return (n6) super.r();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r6.t, com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Set c(Object obj, Iterable iterable) {
            return c((w<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r6.t, com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Set v(Object obj) {
            return v((w<K, V>) obj);
        }

        @Override // com.google.common.collect.r6.t, com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public SortedSet<V> b(@zc.a Object obj) {
            SortedSet<V> b5;
            synchronized (this.f56360c) {
                b5 = r().b(obj);
            }
            return b5;
        }

        @Override // com.google.common.collect.r6.t, com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        public SortedSet<V> c(K k4, Iterable<? extends V> iterable) {
            SortedSet<V> c5;
            synchronized (this.f56360c) {
                c5 = r().c((n6<K, V>) k4, (Iterable) iterable);
            }
            return c5;
        }

        @Override // com.google.common.collect.r6.t, com.google.common.collect.r6.l, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public SortedSet<V> v(K k4) {
            v vVar;
            synchronized (this.f56360c) {
                vVar = new v((Object) r().v((n6<K, V>) k4), this.f56360c);
            }
            return vVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Synchronized.java */
    static final class x<R, C, V> extends p implements s6<R, C, V> {

        /* compiled from: Synchronized.java */
        class a implements com.google.common.base.x<Map<C, V>, Map<C, V>> {
            a() {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V> apply(Map<C, V> map) {
                return new k((Object) map, x.this.f56360c);
            }
        }

        /* compiled from: Synchronized.java */
        class b implements com.google.common.base.x<Map<R, V>, Map<R, V>> {
            b() {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V> apply(Map<R, V> map) {
                return new k((Object) map, x.this.f56360c);
            }
        }

        x(s6<R, C, V> s6Var, @zc.a Object obj) {
            super(s6Var, obj);
        }

        @Override // com.google.common.collect.s6
        public boolean A2(@zc.a Object obj) {
            boolean A2;
            synchronized (this.f56360c) {
                A2 = ((s6) this.f56359b).A2(obj);
            }
            return A2;
        }

        @Override // com.google.common.collect.s6
        public Set<s6.a<R, C, V>> B1() {
            s sVar;
            synchronized (this.f56360c) {
                sVar = new s((Object) ((s6) this.f56359b).B1(), this.f56360c);
            }
            return sVar;
        }

        @Override // com.google.common.collect.s6
        @zc.a
        public V D1(R r4, C c5, V v4) {
            V v5;
            synchronized (this.f56360c) {
                v5 = (V) ((s6) this.f56359b).D1(r4, c5, v4);
            }
            return v5;
        }

        @Override // com.google.common.collect.s6
        public boolean I2(@zc.a Object obj, @zc.a Object obj2) {
            boolean I2;
            synchronized (this.f56360c) {
                I2 = ((s6) this.f56359b).I2(obj, obj2);
            }
            return I2;
        }

        @Override // com.google.common.collect.s6
        @zc.a
        public V L(@zc.a Object obj, @zc.a Object obj2) {
            V v4;
            synchronized (this.f56360c) {
                v4 = (V) ((s6) this.f56359b).L(obj, obj2);
            }
            return v4;
        }

        @Override // com.google.common.collect.s6
        public boolean S(@zc.a Object obj) {
            boolean S;
            synchronized (this.f56360c) {
                S = ((s6) this.f56359b).S(obj);
            }
            return S;
        }

        @Override // com.google.common.collect.s6
        public void clear() {
            synchronized (this.f56360c) {
                ((s6) this.f56359b).clear();
            }
        }

        @Override // com.google.common.collect.s6
        public boolean containsValue(@zc.a Object obj) {
            boolean containsValue;
            synchronized (this.f56360c) {
                containsValue = ((s6) this.f56359b).containsValue(obj);
            }
            return containsValue;
        }

        @Override // com.google.common.collect.s6
        public void e1(s6<? extends R, ? extends C, ? extends V> s6Var) {
            synchronized (this.f56360c) {
                ((s6) this.f56359b).e1(s6Var);
            }
        }

        @Override // com.google.common.collect.s6
        public boolean equals(@zc.a Object obj) {
            boolean equals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f56360c) {
                equals = ((s6) this.f56359b).equals(obj);
            }
            return equals;
        }

        @Override // com.google.common.collect.s6
        public int hashCode() {
            int hashCode;
            synchronized (this.f56360c) {
                hashCode = ((s6) this.f56359b).hashCode();
            }
            return hashCode;
        }

        @Override // com.google.common.collect.s6
        public Set<R> i() {
            s sVar;
            synchronized (this.f56360c) {
                sVar = new s((Object) ((s6) this.f56359b).i(), this.f56360c);
            }
            return sVar;
        }

        @Override // com.google.common.collect.s6
        public Map<C, V> i3(R r4) {
            k kVar;
            synchronized (this.f56360c) {
                kVar = new k((Object) ((s6) this.f56359b).i3(r4), this.f56360c);
            }
            return kVar;
        }

        @Override // com.google.common.collect.s6
        public boolean isEmpty() {
            boolean isEmpty;
            synchronized (this.f56360c) {
                isEmpty = ((s6) this.f56359b).isEmpty();
            }
            return isEmpty;
        }

        @Override // com.google.common.collect.r6.p
        /* renamed from: j */
        Object q() {
            return (s6) this.f56359b;
        }

        @Override // com.google.common.collect.s6
        public Map<C, Map<R, V>> j1() {
            k kVar;
            synchronized (this.f56360c) {
                kVar = new k((Object) p4.B0(((s6) this.f56359b).j1(), new b()), this.f56360c);
            }
            return kVar;
        }

        @Override // com.google.common.collect.s6
        public Map<R, Map<C, V>> m() {
            k kVar;
            synchronized (this.f56360c) {
                kVar = new k((Object) p4.B0(((s6) this.f56359b).m(), new a()), this.f56360c);
            }
            return kVar;
        }

        @Override // com.google.common.collect.s6
        public Map<R, V> n1(C c5) {
            k kVar;
            synchronized (this.f56360c) {
                kVar = new k((Object) ((s6) this.f56359b).n1(c5), this.f56360c);
            }
            return kVar;
        }

        s6<R, C, V> q() {
            return (s6) this.f56359b;
        }

        @Override // com.google.common.collect.s6
        public Set<C> q2() {
            s sVar;
            synchronized (this.f56360c) {
                sVar = new s((Object) ((s6) this.f56359b).q2(), this.f56360c);
            }
            return sVar;
        }

        @Override // com.google.common.collect.s6
        @zc.a
        public V remove(@zc.a Object obj, @zc.a Object obj2) {
            V v4;
            synchronized (this.f56360c) {
                v4 = (V) ((s6) this.f56359b).remove(obj, obj2);
            }
            return v4;
        }

        @Override // com.google.common.collect.s6
        public int size() {
            int size;
            synchronized (this.f56360c) {
                size = ((s6) this.f56359b).size();
            }
            return size;
        }

        @Override // com.google.common.collect.s6
        public Collection<V> values() {
            f fVar;
            synchronized (this.f56360c) {
                fVar = new f((Object) ((s6) this.f56359b).values(), this.f56360c);
            }
            return fVar;
        }
    }

    private r6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Collection<E> A(Collection<E> collection, @zc.a Object obj) {
        return collection instanceof SortedSet ? new v(collection, obj) : collection instanceof Set ? new s(collection, obj) : collection instanceof List ? j((List) collection, obj) : new f((Object) collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> Set<E> B(Set<E> set, @zc.a Object obj) {
        return set instanceof SortedSet ? new v(set, obj) : new s((Object) set, obj);
    }

    static SortedSet a(SortedSet sortedSet, Object obj) {
        return new v((Object) sortedSet, obj);
    }

    static Collection e(Collection collection, Object obj) {
        return new f((Object) collection, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> com.google.common.collect.w<K, V> g(com.google.common.collect.w<K, V> wVar, @zc.a Object obj) {
        return ((wVar instanceof e) || (wVar instanceof z2)) ? wVar : new e(wVar, obj, null);
    }

    private static <E> Collection<E> h(Collection<E> collection, @zc.a Object obj) {
        return new f((Object) collection, obj);
    }

    static <E> Deque<E> i(Deque<E> deque, @zc.a Object obj) {
        return new g((Object) deque, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> List<E> j(List<E> list, @zc.a Object obj) {
        return list instanceof RandomAccess ? new r((Object) list, obj) : new i((Object) list, obj);
    }

    static <K, V> k4<K, V> k(k4<K, V> k4Var, @zc.a Object obj) {
        return ((k4Var instanceof j) || (k4Var instanceof com.google.common.collect.v)) ? k4Var : new j((Object) k4Var, obj);
    }

    @d9.d
    static <K, V> Map<K, V> l(Map<K, V> map, @zc.a Object obj) {
        return new k((Object) map, obj);
    }

    static <K, V> r4<K, V> m(r4<K, V> r4Var, @zc.a Object obj) {
        return ((r4Var instanceof l) || (r4Var instanceof com.google.common.collect.v)) ? r4Var : new l((Object) r4Var, obj);
    }

    static <E> u4<E> n(u4<E> u4Var, @zc.a Object obj) {
        return ((u4Var instanceof m) || (u4Var instanceof m3)) ? u4Var : new m((Object) u4Var, obj);
    }

    @d9.c
    static <K, V> NavigableMap<K, V> o(NavigableMap<K, V> navigableMap) {
        return new n((Object) navigableMap, (Object) null);
    }

    @d9.c
    static <K, V> NavigableMap<K, V> p(NavigableMap<K, V> navigableMap, @zc.a Object obj) {
        return new n((Object) navigableMap, obj);
    }

    @d9.c
    static <E> NavigableSet<E> q(NavigableSet<E> navigableSet) {
        return new o((Object) navigableSet, (Object) null);
    }

    @d9.c
    static <E> NavigableSet<E> r(NavigableSet<E> navigableSet, @zc.a Object obj) {
        return new o((Object) navigableSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    @d9.c
    public static <K, V> Map.Entry<K, V> s(@zc.a Map.Entry<K, V> entry, @zc.a Object obj) {
        if (entry == null) {
            return null;
        }
        return new h((Object) entry, obj);
    }

    static <E> Queue<E> t(Queue<E> queue, @zc.a Object obj) {
        return queue instanceof q ? queue : new q((Object) queue, obj);
    }

    @d9.d
    static <E> Set<E> u(Set<E> set, @zc.a Object obj) {
        return new s((Object) set, obj);
    }

    static <K, V> c6<K, V> v(c6<K, V> c6Var, @zc.a Object obj) {
        return ((c6Var instanceof t) || (c6Var instanceof com.google.common.collect.v)) ? c6Var : new t((Object) c6Var, obj);
    }

    static <K, V> SortedMap<K, V> w(SortedMap<K, V> sortedMap, @zc.a Object obj) {
        return new u((Object) sortedMap, obj);
    }

    private static <E> SortedSet<E> x(SortedSet<E> sortedSet, @zc.a Object obj) {
        return new v((Object) sortedSet, obj);
    }

    static <K, V> n6<K, V> y(n6<K, V> n6Var, @zc.a Object obj) {
        return n6Var instanceof w ? n6Var : new w((Object) n6Var, obj);
    }

    static <R, C, V> s6<R, C, V> z(s6<R, C, V> s6Var, @zc.a Object obj) {
        return new x((Object) s6Var, obj);
    }

    /* compiled from: Synchronized.java */
    private static class c<K, V> extends s<Map.Entry<K, Collection<V>>> {

        /* renamed from: g, reason: collision with root package name */
        private static final long f56325g = 0;

        /* compiled from: Synchronized.java */
        class a extends v6<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>> {

            /* compiled from: Synchronized.java */
            /* renamed from: com.google.common.collect.r6$c$a$a, reason: collision with other inner class name */
            class C0859a extends c2<K, Collection<V>> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map.Entry f56327b;

                C0859a(Map.Entry entry) {
                    this.f56327b = entry;
                }

                @Override // com.google.common.collect.c2, java.util.Map.Entry
                /* renamed from: L3, reason: merged with bridge method [inline-methods] */
                public Collection<V> getValue() {
                    return r6.A((Collection) this.f56327b.getValue(), c.this.f56360c);
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.c2, com.google.common.collect.h2
                /* renamed from: v3 */
                public Map.Entry<K, Collection<V>> u3() {
                    return this.f56327b;
                }
            }

            a(Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.v6
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, Collection<V>> a(Map.Entry<K, Collection<V>> entry) {
                return new C0859a(entry);
            }
        }

        c(Set<Map.Entry<K, Collection<V>>> set, @zc.a Object obj) {
            super((Object) set, obj);
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            boolean p4;
            synchronized (this.f56360c) {
                p4 = p4.p(r(), obj);
            }
            return p4;
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean b5;
            synchronized (this.f56360c) {
                b5 = c0.b(r(), collection);
            }
            return b5;
        }

        @Override // com.google.common.collect.r6.s, java.util.Collection, java.util.Set
        public boolean equals(@zc.a Object obj) {
            boolean g4;
            if (obj == this) {
                return true;
            }
            synchronized (this.f56360c) {
                g4 = d6.g(r(), obj);
            }
            return g4;
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new a(super.iterator());
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            boolean k02;
            synchronized (this.f56360c) {
                k02 = p4.k0(r(), obj);
            }
            return k02;
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean V;
            synchronized (this.f56360c) {
                V = d4.V(r().iterator(), collection);
            }
            return V;
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean X;
            synchronized (this.f56360c) {
                X = d4.X(r().iterator(), collection);
            }
            return X;
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] l4;
            synchronized (this.f56360c) {
                l4 = b5.l(r());
            }
            return l4;
        }

        @Override // com.google.common.collect.r6.f, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f56360c) {
                tArr2 = (T[]) b5.m(r(), tArr);
            }
            return tArr2;
        }
    }

    /* compiled from: Synchronized.java */
    @d9.d
    @d9.c
    static class n<K, V> extends u<K, V> implements NavigableMap<K, V> {

        /* renamed from: m, reason: collision with root package name */
        private static final long f56352m = 0;

        /* renamed from: j, reason: collision with root package name */
        @zc.a
        transient NavigableSet<K> f56353j;

        /* renamed from: k, reason: collision with root package name */
        @zc.a
        transient NavigableMap<K, V> f56354k;

        /* renamed from: l, reason: collision with root package name */
        @zc.a
        transient NavigableSet<K> f56355l;

        n(NavigableMap<K, V> navigableMap, @zc.a Object obj) {
            super((Object) navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> ceilingEntry(K k4) {
            Map.Entry<K, V> s4;
            synchronized (this.f56360c) {
                s4 = r6.s(q().ceilingEntry(k4), this.f56360c);
            }
            return s4;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K ceilingKey(K k4) {
            K ceilingKey;
            synchronized (this.f56360c) {
                ceilingKey = q().ceilingKey(k4);
            }
            return ceilingKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.f56360c) {
                try {
                    NavigableSet<K> navigableSet = this.f56353j;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    o oVar = new o((Object) q().descendingKeySet(), this.f56360c);
                    this.f56353j = oVar;
                    return oVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.f56360c) {
                try {
                    NavigableMap<K, V> navigableMap = this.f56354k;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    n nVar = new n((Object) q().descendingMap(), this.f56360c);
                    this.f56354k = nVar;
                    return nVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> s4;
            synchronized (this.f56360c) {
                s4 = r6.s(q().firstEntry(), this.f56360c);
            }
            return s4;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> floorEntry(K k4) {
            Map.Entry<K, V> s4;
            synchronized (this.f56360c) {
                s4 = r6.s(q().floorEntry(k4), this.f56360c);
            }
            return s4;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K floorKey(K k4) {
            K floorKey;
            synchronized (this.f56360c) {
                floorKey = q().floorKey(k4);
            }
            return floorKey;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k4, boolean z4) {
            n nVar;
            synchronized (this.f56360c) {
                nVar = new n((Object) q().headMap(k4, z4), this.f56360c);
            }
            return nVar;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> higherEntry(K k4) {
            Map.Entry<K, V> s4;
            synchronized (this.f56360c) {
                s4 = r6.s(q().higherEntry(k4), this.f56360c);
            }
            return s4;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K higherKey(K k4) {
            K higherKey;
            synchronized (this.f56360c) {
                higherKey = q().higherKey(k4);
            }
            return higherKey;
        }

        @Override // com.google.common.collect.r6.k, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> s4;
            synchronized (this.f56360c) {
                s4 = r6.s(q().lastEntry(), this.f56360c);
            }
            return s4;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> lowerEntry(K k4) {
            Map.Entry<K, V> s4;
            synchronized (this.f56360c) {
                s4 = r6.s(q().lowerEntry(k4), this.f56360c);
            }
            return s4;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public K lowerKey(K k4) {
            K lowerKey;
            synchronized (this.f56360c) {
                lowerKey = q().lowerKey(k4);
            }
            return lowerKey;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.f56360c) {
                try {
                    NavigableSet<K> navigableSet = this.f56355l;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    o oVar = new o((Object) q().navigableKeySet(), this.f56360c);
                    this.f56355l = oVar;
                    return oVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> s4;
            synchronized (this.f56360c) {
                s4 = r6.s(q().pollFirstEntry(), this.f56360c);
            }
            return s4;
        }

        @Override // java.util.NavigableMap
        @zc.a
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> s4;
            synchronized (this.f56360c) {
                s4 = r6.s(q().pollLastEntry(), this.f56360c);
            }
            return s4;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k4, boolean z4, K k5, boolean z5) {
            n nVar;
            synchronized (this.f56360c) {
                nVar = new n((Object) q().subMap(k4, z4, k5, z5), this.f56360c);
            }
            return nVar;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k4, boolean z4) {
            n nVar;
            synchronized (this.f56360c) {
                nVar = new n((Object) q().tailMap(k4, z4), this.f56360c);
            }
            return nVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.u
        /* renamed from: v, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap<K, V> q() {
            return (NavigableMap) super.q();
        }

        @Override // com.google.common.collect.r6.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k4) {
            return headMap(k4, false);
        }

        @Override // com.google.common.collect.r6.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k4, K k5) {
            return subMap(k4, true, k5, false);
        }

        @Override // com.google.common.collect.r6.u, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k4) {
            return tailMap(k4, true);
        }
    }

    /* compiled from: Synchronized.java */
    @d9.d
    @d9.c
    static class o<E> extends v<E> implements NavigableSet<E> {

        /* renamed from: i, reason: collision with root package name */
        private static final long f56356i = 0;

        /* renamed from: h, reason: collision with root package name */
        @zc.a
        transient NavigableSet<E> f56357h;

        o(NavigableSet<E> navigableSet, @zc.a Object obj) {
            super((Object) navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E ceiling(E e4) {
            E ceiling;
            synchronized (this.f56360c) {
                ceiling = q().ceiling(e4);
            }
            return ceiling;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return q().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.f56360c) {
                try {
                    NavigableSet<E> navigableSet = this.f56357h;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    o oVar = new o((Object) q().descendingSet(), this.f56360c);
                    this.f56357h = oVar;
                    return oVar;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E floor(E e4) {
            E floor;
            synchronized (this.f56360c) {
                floor = q().floor(e4);
            }
            return floor;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e4, boolean z4) {
            o oVar;
            synchronized (this.f56360c) {
                oVar = new o((Object) q().headSet(e4, z4), this.f56360c);
            }
            return oVar;
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E higher(E e4) {
            E higher;
            synchronized (this.f56360c) {
                higher = q().higher(e4);
            }
            return higher;
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E lower(E e4) {
            E lower;
            synchronized (this.f56360c) {
                lower = q().lower(e4);
            }
            return lower;
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E pollFirst() {
            E pollFirst;
            synchronized (this.f56360c) {
                pollFirst = q().pollFirst();
            }
            return pollFirst;
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E pollLast() {
            E pollLast;
            synchronized (this.f56360c) {
                pollLast = q().pollLast();
            }
            return pollLast;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e4, boolean z4, E e5, boolean z5) {
            o oVar;
            synchronized (this.f56360c) {
                oVar = new o((Object) q().subSet(e4, z4, e5, z5), this.f56360c);
            }
            return oVar;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e4, boolean z4) {
            o oVar;
            synchronized (this.f56360c) {
                oVar = new o((Object) q().tailSet(e4, z4), this.f56360c);
            }
            return oVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.r6.v
        /* renamed from: w, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet<E> r() {
            return (NavigableSet) super.r();
        }

        @Override // com.google.common.collect.r6.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e4) {
            return headSet(e4, false);
        }

        @Override // com.google.common.collect.r6.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e4, E e5) {
            return subSet(e4, true, e5, false);
        }

        @Override // com.google.common.collect.r6.v, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e4) {
            return tailSet(e4, true);
        }
    }
}
