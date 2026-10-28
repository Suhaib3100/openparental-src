package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.c1;
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
/* loaded from: classes3.dex */
class p3<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private final int f28866b;

    /* renamed from: c, reason: collision with root package name */
    private List<p3<K, V>.e> f28867c;

    /* renamed from: d, reason: collision with root package name */
    private Map<K, V> f28868d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f28869e;

    /* renamed from: f, reason: collision with root package name */
    private volatile p3<K, V>.g f28870f;

    /* renamed from: g, reason: collision with root package name */
    private Map<K, V> f28871g;

    /* renamed from: h, reason: collision with root package name */
    private volatile p3<K, V>.c f28872h;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    static class a<FieldDescriptorType> extends p3<FieldDescriptorType, Object> {
        a(int i4) {
            super(i4, null);
        }

        @Override // androidx.content.preferences.protobuf.p3, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((c1.c) obj, obj2);
        }

        @Override // androidx.content.preferences.protobuf.p3
        public void t() {
            if (!r()) {
                for (int i4 = 0; i4 < m(); i4++) {
                    Map.Entry<FieldDescriptorType, Object> l4 = l(i4);
                    if (((c1.c) l4.getKey()).F()) {
                        l4.setValue(Collections.unmodifiableList((List) l4.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : o()) {
                    if (((c1.c) entry.getKey()).F()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.t();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class c extends p3<K, V>.g {
        private c() {
            super(p3.this, null);
        }

        @Override // androidx.datastore.preferences.protobuf.p3.g, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new b(p3.this, null);
        }

        /* synthetic */ c(p3 p3Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private static class d {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f28877a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f28878b = new b();

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
                return d.f28877a;
            }
        }

        private d() {
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f28878b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class e implements Map.Entry<K, V>, Comparable<p3<K, V>.e> {

        /* renamed from: b, reason: collision with root package name */
        private final K f28879b;

        /* renamed from: c, reason: collision with root package name */
        private V f28880c;

        e(p3 p3Var, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(p3<K, V>.e eVar) {
            return getKey().compareTo(eVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f28879b;
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
            return b(this.f28879b, entry.getKey()) && b(this.f28880c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f28880c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k4 = this.f28879b;
            int hashCode = k4 == null ? 0 : k4.hashCode();
            V v4 = this.f28880c;
            return hashCode ^ (v4 != null ? v4.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            p3.this.i();
            V v5 = this.f28880c;
            this.f28880c = v4;
            return v5;
        }

        public String toString() {
            return this.f28879b + "=" + this.f28880c;
        }

        e(K k4, V v4) {
            this.f28879b = k4;
            this.f28880c = v4;
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
            p3.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            p3.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = p3.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new f(p3.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            p3.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return p3.this.size();
        }

        /* synthetic */ g(p3 p3Var, a aVar) {
            this();
        }
    }

    /* synthetic */ p3(int i4, a aVar) {
        this(i4);
    }

    private int h(K k4) {
        int i4;
        int size = this.f28867c.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = k4.compareTo(this.f28867c.get(i5).getKey());
            if (compareTo > 0) {
                i4 = size + 1;
                return -i4;
            }
            if (compareTo == 0) {
                return i5;
            }
        }
        int i6 = 0;
        while (i6 <= i5) {
            int i7 = (i6 + i5) / 2;
            int compareTo2 = k4.compareTo(this.f28867c.get(i7).getKey());
            if (compareTo2 < 0) {
                i5 = i7 - 1;
            } else {
                if (compareTo2 <= 0) {
                    return i7;
                }
                i6 = i7 + 1;
            }
        }
        i4 = i6 + 1;
        return -i4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (this.f28869e) {
            throw new UnsupportedOperationException();
        }
    }

    private void k() {
        i();
        if (!this.f28867c.isEmpty() || (this.f28867c instanceof ArrayList)) {
            return;
        }
        this.f28867c = new ArrayList(this.f28866b);
    }

    private SortedMap<K, V> q() {
        i();
        if (this.f28868d.isEmpty() && !(this.f28868d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f28868d = treeMap;
            this.f28871g = treeMap.descendingMap();
        }
        return (SortedMap) this.f28868d;
    }

    static <FieldDescriptorType extends c1.c<FieldDescriptorType>> p3<FieldDescriptorType, Object> u(int i4) {
        return new a(i4, null);
    }

    static <K extends Comparable<K>, V> p3<K, V> v(int i4) {
        return new p3<>(i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V x(int i4) {
        i();
        V value = this.f28867c.remove(i4).getValue();
        if (!this.f28868d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.f28867c.add(new e(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        if (!this.f28867c.isEmpty()) {
            this.f28867c.clear();
        }
        if (this.f28868d.isEmpty()) {
            return;
        }
        this.f28868d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.f28868d.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f28870f == null) {
            this.f28870f = new g(this, null);
        }
        return this.f28870f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return super.equals(obj);
        }
        p3 p3Var = (p3) obj;
        int size = size();
        if (size != p3Var.size()) {
            return false;
        }
        int m4 = m();
        if (m4 != p3Var.m()) {
            return entrySet().equals(p3Var.entrySet());
        }
        for (int i4 = 0; i4 < m4; i4++) {
            if (!l(i4).equals(p3Var.l(i4))) {
                return false;
            }
        }
        if (m4 != size) {
            return this.f28868d.equals(p3Var.f28868d);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h4 = h(comparable);
        return h4 >= 0 ? this.f28867c.get(h4).getValue() : this.f28868d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int m4 = m();
        int i4 = 0;
        for (int i5 = 0; i5 < m4; i5++) {
            i4 += this.f28867c.get(i5).hashCode();
        }
        return n() > 0 ? i4 + this.f28868d.hashCode() : i4;
    }

    Set<Map.Entry<K, V>> j() {
        if (this.f28872h == null) {
            this.f28872h = new c(this, null);
        }
        return this.f28872h;
    }

    public Map.Entry<K, V> l(int i4) {
        return this.f28867c.get(i4);
    }

    public int m() {
        return this.f28867c.size();
    }

    public int n() {
        return this.f28868d.size();
    }

    public Iterable<Map.Entry<K, V>> o() {
        return this.f28868d.isEmpty() ? d.b() : this.f28868d.entrySet();
    }

    Iterable<Map.Entry<K, V>> p() {
        return this.f28871g.isEmpty() ? d.b() : this.f28871g.entrySet();
    }

    public boolean r() {
        return this.f28869e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        Comparable comparable = (Comparable) obj;
        int h4 = h(comparable);
        if (h4 >= 0) {
            return (V) x(h4);
        }
        if (this.f28868d.isEmpty()) {
            return null;
        }
        return this.f28868d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f28868d.size() + this.f28867c.size();
    }

    public void t() {
        if (this.f28869e) {
            return;
        }
        this.f28868d = this.f28868d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f28868d);
        this.f28871g = this.f28871g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f28871g);
        this.f28869e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public V put(K k4, V v4) {
        i();
        int h4 = h(k4);
        if (h4 >= 0) {
            return this.f28867c.get(h4).setValue(v4);
        }
        k();
        int i4 = -(h4 + 1);
        if (i4 >= this.f28866b) {
            return q().put(k4, v4);
        }
        int size = this.f28867c.size();
        int i5 = this.f28866b;
        if (size == i5) {
            p3<K, V>.e remove = this.f28867c.remove(i5 - 1);
            q().put(remove.getKey(), remove.getValue());
        }
        this.f28867c.add(i4, new e(k4, v4));
        return null;
    }

    /* compiled from: SmallSortedMap.java */
    private class b implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private int f28873b;

        /* renamed from: c, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f28874c;

        private b() {
            this.f28873b = p3.this.f28867c.size();
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f28874c == null) {
                this.f28874c = p3.this.f28871g.entrySet().iterator();
            }
            return this.f28874c;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (a().hasNext()) {
                return a().next();
            }
            List list = p3.this.f28867c;
            int i4 = this.f28873b - 1;
            this.f28873b = i4;
            return (Map.Entry) list.get(i4);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            int i4 = this.f28873b;
            return (i4 > 0 && i4 <= p3.this.f28867c.size()) || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException();
        }

        /* synthetic */ b(p3 p3Var, a aVar) {
            this();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class f implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private int f28882b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f28883c;

        /* renamed from: d, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f28884d;

        private f() {
            this.f28882b = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f28884d == null) {
                this.f28884d = p3.this.f28868d.entrySet().iterator();
            }
            return this.f28884d;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f28883c = true;
            int i4 = this.f28882b + 1;
            this.f28882b = i4;
            return i4 < p3.this.f28867c.size() ? (Map.Entry) p3.this.f28867c.get(this.f28882b) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f28882b + 1 >= p3.this.f28867c.size()) {
                return !p3.this.f28868d.isEmpty() && a().hasNext();
            }
            return true;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f28883c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f28883c = false;
            p3.this.i();
            if (this.f28882b >= p3.this.f28867c.size()) {
                a().remove();
                return;
            }
            p3 p3Var = p3.this;
            int i4 = this.f28882b;
            this.f28882b = i4 - 1;
            p3Var.x(i4);
        }

        /* synthetic */ f(p3 p3Var, a aVar) {
            this();
        }
    }

    private p3(int i4) {
        this.f28866b = i4;
        this.f28867c = Collections.emptyList();
        this.f28868d = Collections.emptyMap();
        this.f28871g = Collections.emptyMap();
    }
}
