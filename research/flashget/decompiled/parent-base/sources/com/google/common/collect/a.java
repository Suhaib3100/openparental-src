package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.p4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: AbstractBiMap.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class a<K, V> extends b2<K, V> implements w<K, V>, Serializable {

    /* renamed from: g, reason: collision with root package name */
    @d9.c
    private static final long f55324g = 0;

    /* renamed from: b, reason: collision with root package name */
    private transient Map<K, V> f55325b;

    /* renamed from: c, reason: collision with root package name */
    @ma.h
    transient a<V, K> f55326c;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private transient Set<K> f55327d;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    private transient Set<V> f55328e;

    /* renamed from: f, reason: collision with root package name */
    @zc.a
    private transient Set<Map.Entry<K, V>> f55329f;

    /* compiled from: AbstractBiMap.java */
    /* renamed from: com.google.common.collect.a$a, reason: collision with other inner class name */
    class C0838a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        @zc.a
        Map.Entry<K, V> f55330b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Iterator f55331c;

        C0838a(Iterator it) {
            this.f55331c = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f55331c.next();
            this.f55330b = entry;
            return new b(entry);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55331c.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            Map.Entry<K, V> entry = this.f55330b;
            if (entry == null) {
                throw new IllegalStateException(ProtectedSandApp.s("\uf440"));
            }
            V value = entry.getValue();
            this.f55331c.remove();
            a.this.b4(value);
            this.f55330b = null;
        }
    }

    /* compiled from: AbstractBiMap.java */
    class b extends c2<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final Map.Entry<K, V> f55333b;

        b(Map.Entry<K, V> entry) {
            this.f55333b = entry;
        }

        @Override // com.google.common.collect.c2, java.util.Map.Entry
        public V setValue(V v4) {
            a.this.W3(v4);
            boolean contains = a.this.entrySet().contains(this);
            String s4 = ProtectedSandApp.s("\uf442");
            com.google.common.base.l0.h0(contains, s4);
            if (com.google.common.base.f0.a(v4, getValue())) {
                return v4;
            }
            com.google.common.base.l0.u(!a.this.containsValue(v4), ProtectedSandApp.s("\uf443"), v4);
            V value = this.f55333b.setValue(v4);
            com.google.common.base.l0.h0(com.google.common.base.f0.a(v4, a.this.get(getKey())), s4);
            a.this.e4(getKey(), true, value, v4);
            return value;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.c2, com.google.common.collect.h2
        /* renamed from: v3 */
        public Map.Entry<K, V> u3() {
            return this.f55333b;
        }
    }

    /* compiled from: AbstractBiMap.java */
    private class c extends j2<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        final Set<Map.Entry<K, V>> f55335b;

        private c() {
            this.f55335b = a.this.f55325b.entrySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<Map.Entry<K, V>> u3() {
            return this.f55335b;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public void clear() {
            a.this.clear();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return p4.p(u3(), obj);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return L3(collection);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return a.this.X3();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            if (!this.f55335b.contains(obj) || !(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((a) a.this.f55326c).f55325b.remove(entry.getValue());
            this.f55335b.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return O3(collection);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return P3(collection);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return Q3();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) R3(tArr);
        }

        /* synthetic */ c(a aVar, C0838a c0838a) {
            this();
        }
    }

    /* compiled from: AbstractBiMap.java */
    static class d<K, V> extends a<K, V> {

        /* renamed from: h, reason: collision with root package name */
        @d9.c
        private static final long f55337h = 0;

        d(Map<K, V> map, a<V, K> aVar) {
            super(map, aVar, null);
        }

        @d9.c
        private void f4(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
            objectInputStream.defaultReadObject();
            d4((a) objectInputStream.readObject());
        }

        @d9.c
        private void h4(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(M2());
        }

        @Override // com.google.common.collect.a
        @f5
        K V3(@f5 K k4) {
            return this.f55326c.W3(k4);
        }

        @Override // com.google.common.collect.a
        @f5
        V W3(@f5 V v4) {
            return this.f55326c.V3(v4);
        }

        @d9.c
        Object g4() {
            return M2().M2();
        }

        @Override // com.google.common.collect.a, com.google.common.collect.b2, com.google.common.collect.h2
        protected /* bridge */ /* synthetic */ Object u3() {
            return super.u3();
        }

        @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* compiled from: AbstractBiMap.java */
    private class e extends j2<K> {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<K> u3() {
            return a.this.f55325b.keySet();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public void clear() {
            a.this.clear();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new p4.e(a.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            if (!contains(obj)) {
                return false;
            }
            a.this.a4(obj);
            return true;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return O3(collection);
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return P3(collection);
        }

        /* synthetic */ e(a aVar, C0838a c0838a) {
            this();
        }
    }

    /* compiled from: AbstractBiMap.java */
    private class f extends j2<V> {

        /* renamed from: b, reason: collision with root package name */
        final Set<V> f55339b;

        private f() {
            this.f55339b = a.this.f55326c.keySet();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.j2, com.google.common.collect.q1
        /* renamed from: T3 */
        public Set<V> u3() {
            return this.f55339b;
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new p4.f(a.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return Q3();
        }

        @Override // com.google.common.collect.h2
        public String toString() {
            return S3();
        }

        @Override // com.google.common.collect.q1, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) R3(tArr);
        }

        /* synthetic */ f(a aVar, C0838a c0838a) {
            this();
        }
    }

    /* synthetic */ a(Map map, a aVar, C0838a c0838a) {
        this(map, aVar);
    }

    @zc.a
    private V Z3(@f5 K k4, @f5 V v4, boolean z4) {
        V3(k4);
        W3(v4);
        boolean containsKey = containsKey(k4);
        if (containsKey && com.google.common.base.f0.a(v4, get(k4))) {
            return v4;
        }
        if (z4) {
            M2().remove(v4);
        } else {
            com.google.common.base.l0.u(!containsValue(v4), ProtectedSandApp.s("\uf444"), v4);
        }
        V put = this.f55325b.put(k4, v4);
        e4(k4, containsKey, put, v4);
        return put;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @f5
    @f9.a
    public V a4(@zc.a Object obj) {
        V remove = this.f55325b.remove(obj);
        b4(remove);
        return remove;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b4(@f5 V v4) {
        this.f55326c.f55325b.remove(v4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e4(@f5 K k4, boolean z4, @zc.a V v4, @f5 V v5) {
        if (z4) {
            b4(v4);
        }
        this.f55326c.f55325b.put(v5, k4);
    }

    @Override // com.google.common.collect.w
    public w<V, K> M2() {
        return this.f55326c;
    }

    @f5
    @f9.a
    K V3(@f5 K k4) {
        return k4;
    }

    @f5
    @f9.a
    V W3(@f5 V v4) {
        return v4;
    }

    Iterator<Map.Entry<K, V>> X3() {
        return new C0838a(this.f55325b.entrySet().iterator());
    }

    a<V, K> Y3(Map<V, K> map) {
        return new d(map, this, null);
    }

    @Override // com.google.common.collect.w
    @zc.a
    @f9.a
    public V a2(@f5 K k4, @f5 V v4) {
        return Z3(k4, v4, true);
    }

    void c4(Map<K, V> map, Map<V, K> map2) {
        com.google.common.base.l0.g0(this.f55325b == null);
        com.google.common.base.l0.g0(this.f55326c == null);
        com.google.common.base.l0.d(map.isEmpty());
        com.google.common.base.l0.d(map2.isEmpty());
        com.google.common.base.l0.d(map != map2);
        this.f55325b = map;
        this.f55326c = Y3(map2);
    }

    @Override // com.google.common.collect.b2, java.util.Map
    public void clear() {
        this.f55325b.clear();
        this.f55326c.f55325b.clear();
    }

    @Override // com.google.common.collect.b2, java.util.Map
    public boolean containsValue(@zc.a Object obj) {
        return this.f55326c.containsKey(obj);
    }

    void d4(a<V, K> aVar) {
        this.f55326c = aVar;
    }

    @Override // com.google.common.collect.b2, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f55329f;
        if (set != null) {
            return set;
        }
        c cVar = new c(this, null);
        this.f55329f = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.b2, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f55327d;
        if (set != null) {
            return set;
        }
        e eVar = new e(this, null);
        this.f55327d = eVar;
        return eVar;
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    @zc.a
    @f9.a
    public V put(@f5 K k4, @f5 V v4) {
        return Z3(k4, v4, false);
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.b2, java.util.Map
    @zc.a
    @f9.a
    public V remove(@zc.a Object obj) {
        if (containsKey(obj)) {
            return a4(obj);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.b2, com.google.common.collect.h2
    /* renamed from: v3 */
    public Map<K, V> u3() {
        return this.f55325b;
    }

    a(Map<K, V> map, Map<V, K> map2) {
        c4(map, map2);
    }

    @Override // com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    public Set<V> values() {
        Set<V> set = this.f55328e;
        if (set != null) {
            return set;
        }
        f fVar = new f(this, null);
        this.f55328e = fVar;
        return fVar;
    }

    private a(Map<K, V> map, a<V, K> aVar) {
        this.f55325b = map;
        this.f55326c = aVar;
    }
}
