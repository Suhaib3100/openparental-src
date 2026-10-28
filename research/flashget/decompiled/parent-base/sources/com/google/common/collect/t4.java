package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.c0;
import com.google.common.collect.d6;
import com.google.common.collect.e;
import com.google.common.collect.g3;
import com.google.common.collect.h;
import com.google.common.collect.p4;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: Multimaps.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class t4 {

    /* compiled from: Multimaps.java */
    static final class a<K, V> extends p4.r0<K, Collection<V>> {

        /* renamed from: e, reason: collision with root package name */
        @ma.i
        private final r4<K, V> f56458e;

        /* compiled from: Multimaps.java */
        /* renamed from: com.google.common.collect.t4$a$a, reason: collision with other inner class name */
        class C0860a extends p4.s<K, Collection<V>> {

            /* compiled from: Multimaps.java */
            /* renamed from: com.google.common.collect.t4$a$a$a, reason: collision with other inner class name */
            class C0861a implements com.google.common.base.x<K, Collection<V>> {
                C0861a() {
                }

                @Override // com.google.common.base.x
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public Collection<V> apply(@f5 K k4) {
                    return a.this.f56458e.v(k4);
                }
            }

            C0860a() {
            }

            @Override // com.google.common.collect.p4.s
            Map<K, Collection<V>> i() {
                return a.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return p4.m(a.this.f56458e.keySet(), new C0861a());
            }

            @Override // com.google.common.collect.p4.s, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(@zc.a Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                a.this.i(entry.getKey());
                return true;
            }
        }

        a(r4<K, V> r4Var) {
            r4Var.getClass();
            this.f56458e = r4Var;
        }

        @Override // com.google.common.collect.p4.r0
        protected Set<Map.Entry<K, Collection<V>>> b() {
            return new C0860a();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f56458e.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return this.f56458e.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Collection<V> get(@zc.a Object obj) {
            if (this.f56458e.containsKey(obj)) {
                return this.f56458e.v(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Collection<V> remove(@zc.a Object obj) {
            if (this.f56458e.containsKey(obj)) {
                return this.f56458e.b(obj);
            }
            return null;
        }

        void i(@zc.a Object obj) {
            this.f56458e.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f56458e.isEmpty();
        }

        @Override // com.google.common.collect.p4.r0, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f56458e.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f56458e.keySet().size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Multimaps.java */
    static class b<K, V> extends com.google.common.collect.d<K, V> {

        /* renamed from: l, reason: collision with root package name */
        @d9.c
        private static final long f56461l = 0;

        /* renamed from: k, reason: collision with root package name */
        transient com.google.common.base.u0<? extends List<V>> f56462k;

        b(Map<K, Collection<V>> map, com.google.common.base.u0<? extends List<V>> u0Var) {
            super(map);
            u0Var.getClass();
            this.f56462k = u0Var;
        }

        @d9.c
        private void I(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f56462k = (com.google.common.base.u0) objectInputStream.readObject();
            C((Map) objectInputStream.readObject());
        }

        @d9.c
        private void J(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f56462k);
            objectOutputStream.writeObject(t());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.d, com.google.common.collect.e
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public List<V> u() {
            return this.f56462k.get();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return w();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Set<K> e() {
            return x();
        }
    }

    /* compiled from: Multimaps.java */
    private static class c<K, V> extends com.google.common.collect.e<K, V> {

        /* renamed from: k, reason: collision with root package name */
        @d9.c
        private static final long f56463k = 0;

        /* renamed from: j, reason: collision with root package name */
        transient com.google.common.base.u0<? extends Collection<V>> f56464j;

        c(Map<K, Collection<V>> map, com.google.common.base.u0<? extends Collection<V>> u0Var) {
            super(map);
            u0Var.getClass();
            this.f56464j = u0Var;
        }

        @d9.c
        private void G(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f56464j = (com.google.common.base.u0) objectInputStream.readObject();
            C((Map) objectInputStream.readObject());
        }

        @d9.c
        private void H(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f56464j);
            objectOutputStream.writeObject(t());
        }

        @Override // com.google.common.collect.e
        <E> Collection<E> D(Collection<E> collection) {
            return collection instanceof NavigableSet ? d6.O((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.e
        Collection<V> E(@f5 K k4, Collection<V> collection) {
            return collection instanceof List ? F(k4, (List) collection, null) : collection instanceof NavigableSet ? new e.m(k4, (NavigableSet) collection, null) : collection instanceof SortedSet ? new e.o(k4, (SortedSet) collection, null) : collection instanceof Set ? new e.n(k4, (Set) collection) : new e.k(k4, collection, null);
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return w();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Set<K> e() {
            return x();
        }

        @Override // com.google.common.collect.e
        protected Collection<V> u() {
            return this.f56464j.get();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Multimaps.java */
    static class d<K, V> extends com.google.common.collect.m<K, V> {

        /* renamed from: l, reason: collision with root package name */
        @d9.c
        private static final long f56465l = 0;

        /* renamed from: k, reason: collision with root package name */
        transient com.google.common.base.u0<? extends Set<V>> f56466k;

        d(Map<K, Collection<V>> map, com.google.common.base.u0<? extends Set<V>> u0Var) {
            super(map);
            u0Var.getClass();
            this.f56466k = u0Var;
        }

        @d9.c
        private void I(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            this.f56466k = (com.google.common.base.u0) objectInputStream.readObject();
            C((Map) objectInputStream.readObject());
        }

        @d9.c
        private void J(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f56466k);
            objectOutputStream.writeObject(t());
        }

        @Override // com.google.common.collect.m, com.google.common.collect.e
        <E> Collection<E> D(Collection<E> collection) {
            return collection instanceof NavigableSet ? d6.O((NavigableSet) collection) : collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : Collections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.m, com.google.common.collect.e
        Collection<V> E(@f5 K k4, Collection<V> collection) {
            return collection instanceof NavigableSet ? new e.m(k4, (NavigableSet) collection, null) : collection instanceof SortedSet ? new e.o(k4, (SortedSet) collection, null) : new e.n(k4, (Set) collection);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.m, com.google.common.collect.e
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public Set<V> u() {
            return this.f56466k.get();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return w();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Set<K> e() {
            return x();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: Multimaps.java */
    static class e<K, V> extends p<K, V> {

        /* renamed from: n, reason: collision with root package name */
        @d9.c
        private static final long f56467n = 0;

        /* renamed from: l, reason: collision with root package name */
        transient com.google.common.base.u0<? extends SortedSet<V>> f56468l;

        /* renamed from: m, reason: collision with root package name */
        @zc.a
        transient Comparator<? super V> f56469m;

        e(Map<K, Collection<V>> map, com.google.common.base.u0<? extends SortedSet<V>> u0Var) {
            super(map);
            u0Var.getClass();
            this.f56468l = u0Var;
            this.f56469m = u0Var.get().comparator();
        }

        @d9.c
        private void L(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            com.google.common.base.u0<? extends SortedSet<V>> u0Var = (com.google.common.base.u0) objectInputStream.readObject();
            this.f56468l = u0Var;
            this.f56469m = u0Var.get().comparator();
            C((Map) objectInputStream.readObject());
        }

        @d9.c
        private void M(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f56468l);
            objectOutputStream.writeObject(t());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public SortedSet<V> u() {
            return this.f56468l.get();
        }

        @Override // com.google.common.collect.n6
        @zc.a
        public Comparator<? super V> K0() {
            return this.f56469m;
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return w();
        }

        @Override // com.google.common.collect.e, com.google.common.collect.h
        Set<K> e() {
            return x();
        }
    }

    /* compiled from: Multimaps.java */
    static abstract class f<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        f() {
        }

        abstract r4<K, V> b();

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().T2(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return b().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return b().size();
        }
    }

    /* compiled from: Multimaps.java */
    static class g<K, V> extends com.google.common.collect.i<K> {

        /* renamed from: d, reason: collision with root package name */
        @ma.i
        final r4<K, V> f56470d;

        /* compiled from: Multimaps.java */
        class a extends v6<Map.Entry<K, Collection<V>>, u4.a<K>> {

            /* compiled from: Multimaps.java */
            /* renamed from: com.google.common.collect.t4$g$a$a, reason: collision with other inner class name */
            class C0862a extends v4.f<K> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map.Entry f56471b;

                C0862a(a aVar, Map.Entry entry) {
                    this.f56471b = entry;
                }

                @Override // com.google.common.collect.u4.a
                public int getCount() {
                    return ((Collection) this.f56471b.getValue()).size();
                }

                @Override // com.google.common.collect.u4.a
                @f5
                public K getElement() {
                    return (K) this.f56471b.getKey();
                }
            }

            a(g gVar, Iterator it) {
                super(it);
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.v6
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public u4.a<K> a(Map.Entry<K, Collection<V>> entry) {
                return new C0862a(this, entry);
            }
        }

        g(r4<K, V> r4Var) {
            this.f56470d = r4Var;
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u4
        public int W1(@zc.a Object obj, int i4) {
            b0.b(i4, ProtectedSandApp.s("\uf4b6"));
            if (i4 == 0) {
                return W2(obj);
            }
            Collection collection = (Collection) p4.p0(this.f56470d.f(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i4 >= size) {
                collection.clear();
            } else {
                Iterator it = collection.iterator();
                for (int i5 = 0; i5 < i4; i5++) {
                    it.next();
                    it.remove();
                }
            }
            return size;
        }

        @Override // com.google.common.collect.u4
        public int W2(@zc.a Object obj) {
            Collection collection = (Collection) p4.p0(this.f56470d.f(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f56470d.clear();
        }

        @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
        public boolean contains(@zc.a Object obj) {
            return this.f56470d.containsKey(obj);
        }

        @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
        public Set<K> d() {
            return this.f56470d.keySet();
        }

        @Override // com.google.common.collect.i
        int f() {
            return this.f56470d.f().size();
        }

        @Override // com.google.common.collect.i
        Iterator<K> h() {
            throw new AssertionError(ProtectedSandApp.s("\uf4b7"));
        }

        @Override // com.google.common.collect.i
        Iterator<u4.a<K>> i() {
            return new a(this.f56470d.f().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.g6
        public Iterator<K> iterator() {
            return new p4.e(this.f56470d.t().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
        public int size() {
            return this.f56470d.size();
        }
    }

    /* compiled from: Multimaps.java */
    private static class h<K, V> extends com.google.common.collect.h<K, V> implements c6<K, V>, Serializable {

        /* renamed from: h, reason: collision with root package name */
        private static final long f56472h = 7845222491160860175L;

        /* renamed from: g, reason: collision with root package name */
        final Map<K, V> f56473g;

        /* compiled from: Multimaps.java */
        class a extends d6.k<V> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Object f56474b;

            /* compiled from: Multimaps.java */
            /* renamed from: com.google.common.collect.t4$h$a$a, reason: collision with other inner class name */
            class C0863a implements Iterator<V> {

                /* renamed from: b, reason: collision with root package name */
                int f56476b;

                C0863a() {
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    if (this.f56476b == 0) {
                        a aVar = a.this;
                        if (h.this.f56473g.containsKey(aVar.f56474b)) {
                            return true;
                        }
                    }
                    return false;
                }

                @Override // java.util.Iterator
                @f5
                public V next() {
                    if (!hasNext()) {
                        throw new NoSuchElementException();
                    }
                    this.f56476b++;
                    a aVar = a.this;
                    return h.this.f56473g.get(aVar.f56474b);
                }

                @Override // java.util.Iterator
                public void remove() {
                    b0.e(this.f56476b == 1);
                    this.f56476b = -1;
                    a aVar = a.this;
                    h.this.f56473g.remove(aVar.f56474b);
                }
            }

            a(Object obj) {
                this.f56474b = obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<V> iterator() {
                return new C0863a();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return h.this.f56473g.containsKey(this.f56474b) ? 1 : 0;
            }
        }

        h(Map<K, V> map) {
            map.getClass();
            this.f56473g = map;
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean T2(@zc.a Object obj, @zc.a Object obj2) {
            return this.f56473g.entrySet().contains(new c3(obj, obj2));
        }

        @Override // com.google.common.collect.h
        Map<K, Collection<V>> a() {
            return new a(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
            return c((h<K, V>) obj, iterable);
        }

        @Override // com.google.common.collect.r4
        public void clear() {
            this.f56473g.clear();
        }

        @Override // com.google.common.collect.r4
        public boolean containsKey(@zc.a Object obj) {
            return this.f56473g.containsKey(obj);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean containsValue(@zc.a Object obj) {
            return this.f56473g.containsValue(obj);
        }

        @Override // com.google.common.collect.h
        Collection<Map.Entry<K, V>> d() {
            throw new AssertionError(ProtectedSandApp.s("\uf555"));
        }

        @Override // com.google.common.collect.h
        Set<K> e() {
            return this.f56473g.keySet();
        }

        @Override // com.google.common.collect.h
        u4<K> g() {
            return new g(this);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Collection v(@f5 Object obj) {
            return v((h<K, V>) obj);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public int hashCode() {
            return this.f56473g.hashCode();
        }

        @Override // com.google.common.collect.h
        Collection<V> i() {
            return this.f56473g.values();
        }

        @Override // com.google.common.collect.h
        Iterator<Map.Entry<K, V>> j() {
            return this.f56473g.entrySet().iterator();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean k1(@f5 K k4, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean n0(r4<? extends K, ? extends V> r4Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean put(@f5 K k4, @f5 V v4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
            return this.f56473g.entrySet().remove(new c3(obj, obj2));
        }

        @Override // com.google.common.collect.r4
        public int size() {
            return this.f56473g.size();
        }

        @Override // com.google.common.collect.r4, com.google.common.collect.k4
        public Set<V> b(@zc.a Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.f56473g.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.f56473g.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
        public Set<V> c(@f5 K k4, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public Set<V> v(@f5 K k4) {
            return new a(k4);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        /* renamed from: h */
        public Set<Map.Entry<K, V>> t() {
            return this.f56473g.entrySet();
        }
    }

    /* compiled from: Multimaps.java */
    private static final class i<K, V1, V2> extends j<K, V1, V2> implements k4<K, V2> {
        i(k4<K, V1> k4Var, p4.t<? super K, ? super V1, V2> tVar) {
            super(k4Var, tVar);
        }

        @Override // com.google.common.collect.t4.j, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
        public Collection c(@f5 Object obj, Iterable iterable) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.j, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Collection v(@f5 Object obj) {
            return v((i<K, V1, V2>) obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.t4.j
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public List<V2> m(@f5 K k4, Collection<V1> collection) {
            return l4.D((List) collection, p4.n(this.f56479h, k4));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.j, com.google.common.collect.r4, com.google.common.collect.k4
        public List<V2> b(@zc.a Object obj) {
            return m(obj, this.f56478g.b(obj));
        }

        @Override // com.google.common.collect.t4.j, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
        public List<V2> c(@f5 K k4, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.t4.j, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public List<V2> v(@f5 K k4) {
            return m(k4, this.f56478g.v(k4));
        }
    }

    /* compiled from: Multimaps.java */
    private static class j<K, V1, V2> extends com.google.common.collect.h<K, V2> {

        /* renamed from: g, reason: collision with root package name */
        final r4<K, V1> f56478g;

        /* renamed from: h, reason: collision with root package name */
        final p4.t<? super K, ? super V1, V2> f56479h;

        /* compiled from: Multimaps.java */
        class a implements p4.t<K, Collection<V1>, Collection<V2>> {
            a() {
            }

            @Override // com.google.common.collect.p4.t
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Collection<V2> a(@f5 K k4, Collection<V1> collection) {
                return j.this.m(k4, collection);
            }
        }

        j(r4<K, V1> r4Var, p4.t<? super K, ? super V1, V2> tVar) {
            r4Var.getClass();
            this.f56478g = r4Var;
            tVar.getClass();
            this.f56479h = tVar;
        }

        @Override // com.google.common.collect.h
        Map<K, Collection<V2>> a() {
            return new p4.i0(this.f56478g.f(), new a());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.r4, com.google.common.collect.k4
        public Collection<V2> b(@zc.a Object obj) {
            return m(obj, this.f56478g.b(obj));
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
        public Collection<V2> c(@f5 K k4, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.r4
        public void clear() {
            this.f56478g.clear();
        }

        @Override // com.google.common.collect.r4
        public boolean containsKey(@zc.a Object obj) {
            return this.f56478g.containsKey(obj);
        }

        @Override // com.google.common.collect.h
        Collection<Map.Entry<K, V2>> d() {
            return new h.a();
        }

        @Override // com.google.common.collect.h
        Set<K> e() {
            return this.f56478g.keySet();
        }

        @Override // com.google.common.collect.h
        u4<K> g() {
            return this.f56478g.keys();
        }

        @Override // com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public Collection<V2> v(@f5 K k4) {
            return m(k4, this.f56478g.v(k4));
        }

        @Override // com.google.common.collect.h
        Collection<V2> i() {
            return new c0.f(this.f56478g.t(), p4.h(this.f56479h));
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean isEmpty() {
            return this.f56478g.isEmpty();
        }

        @Override // com.google.common.collect.h
        Iterator<Map.Entry<K, V2>> j() {
            return d4.c0(this.f56478g.t().iterator(), p4.g(this.f56479h));
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean k1(@f5 K k4, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        Collection<V2> m(@f5 K k4, Collection<V1> collection) {
            com.google.common.base.x n4 = p4.n(this.f56479h, k4);
            return collection instanceof List ? l4.D((List) collection, n4) : new c0.f(collection, n4);
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean n0(r4<? extends K, ? extends V2> r4Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean put(@f5 K k4, @f5 V2 v22) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.h, com.google.common.collect.r4
        public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
            return v(obj).remove(obj2);
        }

        @Override // com.google.common.collect.r4
        public int size() {
            return this.f56478g.size();
        }
    }

    /* compiled from: Multimaps.java */
    private static class k<K, V> extends l<K, V> implements k4<K, V> {

        /* renamed from: i, reason: collision with root package name */
        private static final long f56481i = 0;

        k(k4<K, V> k4Var) {
            super(k4Var);
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2
        /* renamed from: A3, reason: merged with bridge method [inline-methods] */
        public k4<K, V> u3() {
            return (k4) this.f56483b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
            return c((k<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Collection v(@f5 Object obj) {
            return v((k<K, V>) obj);
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public List<V> b(@zc.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public List<V> c(@f5 K k4, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public List<V> v(@f5 K k4) {
            return Collections.unmodifiableList(u3().v((k4<K, V>) k4));
        }
    }

    /* compiled from: Multimaps.java */
    private static class l<K, V> extends d2<K, V> implements Serializable {

        /* renamed from: h, reason: collision with root package name */
        private static final long f56482h = 0;

        /* renamed from: b, reason: collision with root package name */
        final r4<K, V> f56483b;

        /* renamed from: c, reason: collision with root package name */
        @g9.b
        @zc.a
        transient Collection<Map.Entry<K, V>> f56484c;

        /* renamed from: d, reason: collision with root package name */
        @g9.b
        @zc.a
        transient u4<K> f56485d;

        /* renamed from: e, reason: collision with root package name */
        @g9.b
        @zc.a
        transient Set<K> f56486e;

        /* renamed from: f, reason: collision with root package name */
        @g9.b
        @zc.a
        transient Collection<V> f56487f;

        /* renamed from: g, reason: collision with root package name */
        @g9.b
        @zc.a
        transient Map<K, Collection<V>> f56488g;

        /* compiled from: Multimaps.java */
        class a implements com.google.common.base.x<Collection<V>, Collection<V>> {
            a(l lVar) {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Collection<V> apply(Collection<V> collection) {
                return t4.O(collection);
            }
        }

        l(r4<K, V> r4Var) {
            r4Var.getClass();
            this.f56483b = r4Var;
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public Collection<V> b(@zc.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public Collection<V> c(@f5 K k4, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public Map<K, Collection<V>> f() {
            Map<K, Collection<V>> map = this.f56488g;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> unmodifiableMap = Collections.unmodifiableMap(p4.B0(this.f56483b.f(), new a()));
            this.f56488g = unmodifiableMap;
            return unmodifiableMap;
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public Collection<V> v(@f5 K k4) {
            return t4.O(this.f56483b.v(k4));
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        /* renamed from: h */
        public Collection<Map.Entry<K, V>> t() {
            Collection<Map.Entry<K, V>> collection = this.f56484c;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> G = t4.G(this.f56483b.t());
            this.f56484c = G;
            return G;
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public boolean k1(@f5 K k4, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public Set<K> keySet() {
            Set<K> set = this.f56486e;
            if (set != null) {
                return set;
            }
            Set<K> unmodifiableSet = Collections.unmodifiableSet(this.f56483b.keySet());
            this.f56486e = unmodifiableSet;
            return unmodifiableSet;
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public u4<K> keys() {
            u4<K> u4Var = this.f56485d;
            if (u4Var != null) {
                return u4Var;
            }
            u4<K> A = v4.A(this.f56483b.keys());
            this.f56485d = A;
            return A;
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public boolean n0(r4<? extends K, ? extends V> r4Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public boolean put(@f5 K k4, @f5 V v4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public boolean remove(@zc.a Object obj, @zc.a Object obj2) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.d2, com.google.common.collect.h2
        /* renamed from: v3 */
        public r4<K, V> u3() {
            return this.f56483b;
        }

        @Override // com.google.common.collect.d2, com.google.common.collect.r4
        public Collection<V> values() {
            Collection<V> collection = this.f56487f;
            if (collection != null) {
                return collection;
            }
            Collection<V> unmodifiableCollection = Collections.unmodifiableCollection(this.f56483b.values());
            this.f56487f = unmodifiableCollection;
            return unmodifiableCollection;
        }
    }

    /* compiled from: Multimaps.java */
    private static class m<K, V> extends l<K, V> implements c6<K, V> {

        /* renamed from: i, reason: collision with root package name */
        private static final long f56489i = 0;

        m(c6<K, V> c6Var) {
            super(c6Var);
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2
        /* renamed from: A3, reason: merged with bridge method [inline-methods] */
        public c6<K, V> u3() {
            return (c6) this.f56483b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
            return c((m<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Collection v(@f5 Object obj) {
            return v((m<K, V>) obj);
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public Set<V> b(@zc.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public Set<V> c(@f5 K k4, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public Set<V> v(@f5 K k4) {
            return Collections.unmodifiableSet(u3().v((c6<K, V>) k4));
        }

        @Override // com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4
        /* renamed from: h */
        public Set<Map.Entry<K, V>> t() {
            return p4.J0(u3().t());
        }
    }

    /* compiled from: Multimaps.java */
    private static class n<K, V> extends m<K, V> implements n6<K, V> {

        /* renamed from: j, reason: collision with root package name */
        private static final long f56490j = 0;

        n(n6<K, V> n6Var) {
            super((r4) n6Var);
        }

        @Override // com.google.common.collect.t4.m, com.google.common.collect.t4.l, com.google.common.collect.d2
        /* renamed from: E3, reason: merged with bridge method [inline-methods] */
        public n6<K, V> u3() {
            return (n6) ((c6) this.f56483b);
        }

        @Override // com.google.common.collect.n6
        @zc.a
        public Comparator<? super V> K0() {
            return u3().K0();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.m, com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Collection c(@f5 Object obj, Iterable iterable) {
            return c((n<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.m, com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Collection v(@f5 Object obj) {
            return v((n<K, V>) obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.m, com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public /* bridge */ /* synthetic */ Set c(@f5 Object obj, Iterable iterable) {
            return c((n<K, V>) obj, iterable);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.t4.m, com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public /* bridge */ /* synthetic */ Set v(@f5 Object obj) {
            return v((n<K, V>) obj);
        }

        @Override // com.google.common.collect.t4.m, com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public SortedSet<V> b(@zc.a Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.t4.m, com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        public SortedSet<V> c(@f5 K k4, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.t4.m, com.google.common.collect.t4.l, com.google.common.collect.d2, com.google.common.collect.r4, com.google.common.collect.k4
        /* renamed from: get */
        public SortedSet<V> v(@f5 K k4) {
            return Collections.unmodifiableSortedSet(u3().v((n6<K, V>) k4));
        }
    }

    private t4() {
    }

    public static <K, V> c6<K, V> A(c6<K, V> c6Var) {
        return r6.v(c6Var, null);
    }

    public static <K, V> n6<K, V> B(n6<K, V> n6Var) {
        return r6.y(n6Var, null);
    }

    public static <K, V1, V2> k4<K, V2> C(k4<K, V1> k4Var, p4.t<? super K, ? super V1, V2> tVar) {
        return new i((r4) k4Var, (p4.t) tVar);
    }

    public static <K, V1, V2> r4<K, V2> D(r4<K, V1> r4Var, p4.t<? super K, ? super V1, V2> tVar) {
        return new j(r4Var, tVar);
    }

    public static <K, V1, V2> k4<K, V2> E(k4<K, V1> k4Var, com.google.common.base.x<? super V1, V2> xVar) {
        xVar.getClass();
        return new i((r4) k4Var, p4.i(xVar));
    }

    public static <K, V1, V2> r4<K, V2> F(r4<K, V1> r4Var, com.google.common.base.x<? super V1, V2> xVar) {
        xVar.getClass();
        return new j(r4Var, p4.i(xVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> Collection<Map.Entry<K, V>> G(Collection<Map.Entry<K, V>> collection) {
        return collection instanceof Set ? p4.J0((Set) collection) : new p4.m0(Collections.unmodifiableCollection(collection));
    }

    @Deprecated
    public static <K, V> k4<K, V> H(g3<K, V> g3Var) {
        g3Var.getClass();
        return g3Var;
    }

    public static <K, V> k4<K, V> I(k4<K, V> k4Var) {
        return ((k4Var instanceof k) || (k4Var instanceof g3)) ? k4Var : new k((r4) k4Var);
    }

    @Deprecated
    public static <K, V> r4<K, V> J(l3<K, V> l3Var) {
        l3Var.getClass();
        return l3Var;
    }

    public static <K, V> r4<K, V> K(r4<K, V> r4Var) {
        return ((r4Var instanceof l) || (r4Var instanceof l3)) ? r4Var : new l(r4Var);
    }

    @Deprecated
    public static <K, V> c6<K, V> L(r3<K, V> r3Var) {
        r3Var.getClass();
        return r3Var;
    }

    public static <K, V> c6<K, V> M(c6<K, V> c6Var) {
        return ((c6Var instanceof m) || (c6Var instanceof r3)) ? c6Var : new m((r4) c6Var);
    }

    public static <K, V> n6<K, V> N(n6<K, V> n6Var) {
        return n6Var instanceof n ? n6Var : new n((r4) n6Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <V> Collection<V> O(Collection<V> collection) {
        return collection instanceof SortedSet ? Collections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? Collections.unmodifiableSet((Set) collection) : collection instanceof List ? Collections.unmodifiableList((List) collection) : Collections.unmodifiableCollection(collection);
    }

    @d9.a
    public static <K, V> Map<K, List<V>> c(k4<K, V> k4Var) {
        return k4Var.f();
    }

    @d9.a
    public static <K, V> Map<K, Collection<V>> d(r4<K, V> r4Var) {
        return r4Var.f();
    }

    @d9.a
    public static <K, V> Map<K, Set<V>> e(c6<K, V> c6Var) {
        return c6Var.f();
    }

    @d9.a
    public static <K, V> Map<K, SortedSet<V>> f(n6<K, V> n6Var) {
        return n6Var.f();
    }

    static boolean g(r4<?, ?> r4Var, @zc.a Object obj) {
        if (obj == r4Var) {
            return true;
        }
        if (obj instanceof r4) {
            return r4Var.f().equals(((r4) obj).f());
        }
        return false;
    }

    public static <K, V> r4<K, V> h(r4<K, V> r4Var, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        m0Var.getClass();
        if (r4Var instanceof c6) {
            return i((c6) r4Var, m0Var);
        }
        if (r4Var instanceof l1) {
            return j((l1) r4Var, m0Var);
        }
        r4Var.getClass();
        return new f1(r4Var, m0Var);
    }

    public static <K, V> c6<K, V> i(c6<K, V> c6Var, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        m0Var.getClass();
        if (c6Var instanceof n1) {
            return k((n1) c6Var, m0Var);
        }
        c6Var.getClass();
        return new h1((r4) c6Var, (com.google.common.base.m0) m0Var);
    }

    private static <K, V> r4<K, V> j(l1<K, V> l1Var, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        return new f1(l1Var.l(), com.google.common.base.n0.d(l1Var.g2(), m0Var));
    }

    private static <K, V> c6<K, V> k(n1<K, V> n1Var, com.google.common.base.m0<? super Map.Entry<K, V>> m0Var) {
        return new h1((r4) n1Var.l(), com.google.common.base.n0.d(n1Var.g2(), m0Var));
    }

    public static <K, V> k4<K, V> l(k4<K, V> k4Var, com.google.common.base.m0<? super K> m0Var) {
        if (!(k4Var instanceof i1)) {
            return new i1((r4) k4Var, (com.google.common.base.m0) m0Var);
        }
        return new i1(r2.f55824g, com.google.common.base.n0.d(((i1) k4Var).f55825h, m0Var));
    }

    public static <K, V> r4<K, V> m(r4<K, V> r4Var, com.google.common.base.m0<? super K> m0Var) {
        if (r4Var instanceof c6) {
            return n((c6) r4Var, m0Var);
        }
        if (r4Var instanceof k4) {
            return l((k4) r4Var, m0Var);
        }
        if (!(r4Var instanceof j1)) {
            return r4Var instanceof l1 ? j((l1) r4Var, com.google.common.base.n0.h(m0Var, p4.r.KEY)) : new j1(r4Var, m0Var);
        }
        j1 j1Var = (j1) r4Var;
        return new j1(j1Var.f55824g, com.google.common.base.n0.d(j1Var.f55825h, m0Var));
    }

    public static <K, V> c6<K, V> n(c6<K, V> c6Var, com.google.common.base.m0<? super K> m0Var) {
        if (!(c6Var instanceof k1)) {
            return c6Var instanceof n1 ? k((n1) c6Var, com.google.common.base.n0.h(m0Var, p4.r.KEY)) : new k1((r4) c6Var, (com.google.common.base.m0) m0Var);
        }
        return new k1(r2.f55824g, com.google.common.base.n0.d(((k1) c6Var).f55825h, m0Var));
    }

    public static <K, V> r4<K, V> o(r4<K, V> r4Var, com.google.common.base.m0<? super V> m0Var) {
        return h(r4Var, com.google.common.base.n0.h(m0Var, p4.r.VALUE));
    }

    public static <K, V> c6<K, V> p(c6<K, V> c6Var, com.google.common.base.m0<? super V> m0Var) {
        return i(c6Var, com.google.common.base.n0.h(m0Var, p4.r.VALUE));
    }

    public static <K, V> c6<K, V> q(Map<K, V> map) {
        return new h(map);
    }

    public static <K, V> g3<K, V> r(Iterable<V> iterable, com.google.common.base.x<? super V, K> xVar) {
        return s(iterable.iterator(), xVar);
    }

    public static <K, V> g3<K, V> s(Iterator<V> it, com.google.common.base.x<? super V, K> xVar) {
        xVar.getClass();
        g3.a aVar = new g3.a();
        while (it.hasNext()) {
            V next = it.next();
            com.google.common.base.l0.F(next, it);
            aVar.p(xVar.apply(next), next);
        }
        return aVar.l();
    }

    @f9.a
    public static <K, V, M extends r4<K, V>> M t(r4<? extends V, ? extends K> r4Var, M m4) {
        m4.getClass();
        for (Map.Entry<? extends V, ? extends K> entry : r4Var.t()) {
            m4.put(entry.getValue(), entry.getKey());
        }
        return m4;
    }

    public static <K, V> k4<K, V> u(Map<K, Collection<V>> map, com.google.common.base.u0<? extends List<V>> u0Var) {
        return new b(map, u0Var);
    }

    public static <K, V> r4<K, V> v(Map<K, Collection<V>> map, com.google.common.base.u0<? extends Collection<V>> u0Var) {
        return new c(map, u0Var);
    }

    public static <K, V> c6<K, V> w(Map<K, Collection<V>> map, com.google.common.base.u0<? extends Set<V>> u0Var) {
        return new d(map, u0Var);
    }

    public static <K, V> n6<K, V> x(Map<K, Collection<V>> map, com.google.common.base.u0<? extends SortedSet<V>> u0Var) {
        return new e(map, u0Var);
    }

    public static <K, V> k4<K, V> y(k4<K, V> k4Var) {
        return r6.k(k4Var, null);
    }

    public static <K, V> r4<K, V> z(r4<K, V> r4Var) {
        return r6.m(r4Var, null);
    }
}
