package android.content.preferences.protobuf;

import android.content.preferences.protobuf.c1;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
class m3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: o, reason: collision with root package name */
    private final int f7349o;

    /* renamed from: p, reason: collision with root package name */
    private List<m3<K, V>.e> f7350p;

    /* renamed from: q, reason: collision with root package name */
    private Map<K, V> f7351q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f7352r;

    /* renamed from: s, reason: collision with root package name */
    private volatile m3<K, V>.g f7353s;

    /* renamed from: t, reason: collision with root package name */
    private Map<K, V> f7354t;

    /* renamed from: u, reason: collision with root package name */
    private volatile m3<K, V>.c f7355u;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    static class a<FieldDescriptorType> extends m3<FieldDescriptorType, Object> {
        a(int i5) {
            super(i5, null);
        }

        @Override // android.content.preferences.protobuf.m3, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((c1.c) obj, obj2);
        }

        @Override // android.content.preferences.protobuf.m3
        public void u() {
            if (!t()) {
                for (int i5 = 0; i5 < n(); i5++) {
                    Map.Entry<FieldDescriptorType, Object> m5 = m(i5);
                    if (((c1.c) m5.getKey()).a()) {
                        m5.setValue(Collections.unmodifiableList((List) m5.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : q()) {
                    if (((c1.c) entry.getKey()).a()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.u();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes3.dex */
    private class c extends m3<K, V>.g {
        private c() {
            super(m3.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.m3.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(m3.this, null);
        }

        /* synthetic */ c(m3 m3Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f7360a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f7361b = new b();

        /* compiled from: SmallSortedMap.java */
        static class a implements Iterator<Object> {
            a() {
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* compiled from: SmallSortedMap.java */
        static class b implements Iterable<Object> {
            b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return d.f7360a;
            }
        }

        private d() {
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f7361b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class e implements Map.Entry<K, V>, Comparable<m3<K, V>.e> {

        /* renamed from: o, reason: collision with root package name */
        private final K f7362o;

        /* renamed from: p, reason: collision with root package name */
        private V f7363p;

        e(m3 m3Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean h(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return h(this.f7362o, entry.getKey()) && h(this.f7363p, entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(m3<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f7363p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k5 = this.f7362o;
            int hashCode = k5 == null ? 0 : k5.hashCode();
            V v5 = this.f7363p;
            return hashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f7362o;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            m3.this.j();
            V v6 = this.f7363p;
            this.f7363p = v5;
            return v6;
        }

        public String toString() {
            return this.f7362o + "=" + this.f7363p;
        }

        e(K k5, V v5) {
            this.f7362o = k5;
            this.f7363p = v5;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class g extends AbstractSet<Map.Entry<K, V>> {
        private g() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            m3.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            m3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = m3.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(m3.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            m3.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return m3.this.size();
        }

        /* synthetic */ g(m3 m3Var, a aVar) {
            this();
        }
    }

    /* synthetic */ m3(int i5, a aVar) {
        this(i5);
    }

    private int h(K k5) {
        int size = this.f7350p.size() - 1;
        if (size >= 0) {
            int compareTo = k5.compareTo(this.f7350p.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) / 2;
            int compareTo2 = k5.compareTo(this.f7350p.get(i6).getKey());
            if (compareTo2 < 0) {
                size = i6 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i6;
                }
                i5 = i6 + 1;
            }
        }
        return -(i5 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        if (this.f7352r) {
            throw new UnsupportedOperationException();
        }
    }

    private void l() {
        j();
        if (!this.f7350p.isEmpty() || (this.f7350p instanceof ArrayList)) {
            return;
        }
        this.f7350p = new ArrayList(this.f7349o);
    }

    private SortedMap<K, V> s() {
        j();
        if (this.f7351q.isEmpty() && !(this.f7351q instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7351q = treeMap;
            this.f7354t = treeMap.descendingMap();
        }
        return (SortedMap) this.f7351q;
    }

    static <FieldDescriptorType extends c1.c<FieldDescriptorType>> m3<FieldDescriptorType, Object> v(int i5) {
        return new a(i5);
    }

    static <K extends Comparable<K>, V> m3<K, V> w(int i5) {
        return new m3<>(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V y(int i5) {
        j();
        V value = this.f7350p.remove(i5).getValue();
        if (!this.f7351q.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = s().entrySet().iterator();
            this.f7350p.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        j();
        if (!this.f7350p.isEmpty()) {
            this.f7350p.clear();
        }
        if (this.f7351q.isEmpty()) {
            return;
        }
        this.f7351q.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f7351q.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f7353s == null) {
            this.f7353s = new g(this, null);
        }
        return this.f7353s;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m3)) {
            return super.equals(obj);
        }
        m3 m3Var = (m3) obj;
        int size = size();
        if (size != m3Var.size()) {
            return false;
        }
        int n5 = n();
        if (n5 != m3Var.n()) {
            return entrySet().equals(m3Var.entrySet());
        }
        for (int i5 = 0; i5 < n5; i5++) {
            if (!m(i5).equals(m3Var.m(i5))) {
                return false;
            }
        }
        if (n5 != size) {
            return this.f7351q.equals(m3Var.f7351q);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h5 = h(comparable);
        return h5 >= 0 ? this.f7350p.get(h5).getValue() : this.f7351q.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int n5 = n();
        int i5 = 0;
        for (int i6 = 0; i6 < n5; i6++) {
            i5 += this.f7350p.get(i6).hashCode();
        }
        return p() > 0 ? i5 + this.f7351q.hashCode() : i5;
    }

    Set<Map.Entry<K, V>> k() {
        if (this.f7355u == null) {
            this.f7355u = new c(this, null);
        }
        return this.f7355u;
    }

    public Map.Entry<K, V> m(int i5) {
        return this.f7350p.get(i5);
    }

    public int n() {
        return this.f7350p.size();
    }

    public int p() {
        return this.f7351q.size();
    }

    public Iterable<Map.Entry<K, V>> q() {
        return this.f7351q.isEmpty() ? d.b() : this.f7351q.entrySet();
    }

    Iterable<Map.Entry<K, V>> r() {
        return this.f7354t.isEmpty() ? d.b() : this.f7354t.entrySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        j();
        Comparable comparable = (Comparable) obj;
        int h5 = h(comparable);
        if (h5 >= 0) {
            return (V) y(h5);
        }
        if (this.f7351q.isEmpty()) {
            return null;
        }
        return this.f7351q.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f7351q.size() + this.f7350p.size();
    }

    public boolean t() {
        return this.f7352r;
    }

    public void u() {
        if (this.f7352r) {
            return;
        }
        this.f7351q = this.f7351q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7351q);
        this.f7354t = this.f7354t.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7354t);
        this.f7352r = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public V put(K k5, V v5) {
        j();
        int h5 = h(k5);
        if (h5 >= 0) {
            return this.f7350p.get(h5).setValue(v5);
        }
        l();
        int i5 = -(h5 + 1);
        if (i5 >= this.f7349o) {
            return s().put(k5, v5);
        }
        int size = this.f7350p.size();
        int i6 = this.f7349o;
        if (size == i6) {
            m3<K, V>.e remove = this.f7350p.remove(i6 - 1);
            s().put(remove.getKey(), remove.getValue());
        }
        this.f7350p.add(i5, new e(k5, v5));
        return null;
    }

    /* compiled from: SmallSortedMap.java */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: o, reason: collision with root package name */
        private int f7356o;

        /* renamed from: p, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f7357p;

        private b() {
            this.f7356o = m3.this.f7350p.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f7357p == null) {
                this.f7357p = m3.this.f7354t.entrySet().iterator();
            }
            return this.f7357p;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = m3.this.f7350p;
            int i5 = this.f7356o - 1;
            this.f7356o = i5;
            return (Map.Entry) list.get(i5);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i5 = this.f7356o;
            return (i5 > 0 && i5 <= m3.this.f7350p.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(m3 m3Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: o, reason: collision with root package name */
        private int f7365o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f7366p;

        /* renamed from: q, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f7367q;

        private f() {
            this.f7365o = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f7367q == null) {
                this.f7367q = m3.this.f7351q.entrySet().iterator();
            }
            return this.f7367q;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f7366p = true;
            int i5 = this.f7365o + 1;
            this.f7365o = i5;
            return i5 < m3.this.f7350p.size() ? (Map.Entry) m3.this.f7350p.get(this.f7365o) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f7365o + 1 >= m3.this.f7350p.size()) {
                return !m3.this.f7351q.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f7366p) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f7366p = false;
            m3.this.j();
            if (this.f7365o >= m3.this.f7350p.size()) {
                a().remove();
                return;
            }
            m3 m3Var = m3.this;
            int i5 = this.f7365o;
            this.f7365o = i5 - 1;
            m3Var.y(i5);
        }

        /* synthetic */ f(m3 m3Var, a aVar) {
            this();
        }
    }

    private m3(int i5) {
        this.f7349o = i5;
        this.f7350p = Collections.emptyList();
        this.f7351q = Collections.emptyMap();
        this.f7354t = Collections.emptyMap();
    }
}
