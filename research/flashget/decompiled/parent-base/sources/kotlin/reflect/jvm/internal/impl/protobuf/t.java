package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.fragment.app.k0;
import com.flashget.parentalcontrol.ProtectedSandApp;
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
import kotlin.reflect.jvm.internal.impl.protobuf.g;

/* compiled from: SmallSortedMap.java */
/* loaded from: classes7.dex */
class t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b, reason: collision with root package name */
    private final int f77764b;

    /* renamed from: c, reason: collision with root package name */
    private List<t<K, V>.c> f77765c;

    /* renamed from: d, reason: collision with root package name */
    private Map<K, V> f77766d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f77767e;

    /* renamed from: f, reason: collision with root package name */
    private volatile t<K, V>.e f77768f;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    static class a<FieldDescriptorType> extends t<FieldDescriptorType, Object> {
        a(int i4) {
            super(i4, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.t
        public void o() {
            if (!n()) {
                for (int i4 = 0; i4 < k(); i4++) {
                    Map.Entry<FieldDescriptorType, Object> j4 = j(i4);
                    if (((g.b) j4.getKey()).F()) {
                        j4.setValue(Collections.unmodifiableList((List) j4.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : l()) {
                    if (((g.b) entry.getKey()).F()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.o();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.t, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((g.b) obj, obj2);
        }
    }

    /* compiled from: SmallSortedMap.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f77769a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f77770b = new C1169b();

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
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.t$b$b, reason: collision with other inner class name */
        static class C1169b implements Iterable<Object> {
            C1169b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f77769a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f77770b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class c implements Comparable<t<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        private final K f77771b;

        /* renamed from: c, reason: collision with root package name */
        private V f77772c;

        c(t tVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        private boolean b(Object obj, Object obj2) {
            return obj == null ? obj2 == null : obj.equals(obj2);
        }

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f77771b;
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
            return b(this.f77771b, entry.getKey()) && b(this.f77772c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f77772c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k4 = this.f77771b;
            int hashCode = k4 == null ? 0 : k4.hashCode();
            V v4 = this.f77772c;
            return hashCode ^ (v4 != null ? v4.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            t.this.h();
            V v5 = this.f77772c;
            this.f77772c = v4;
            return v5;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f77771b);
            String valueOf2 = String.valueOf(this.f77772c);
            return k0.a(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, ProtectedSandApp.s("盞\u0001"), valueOf2);
        }

        c(K k4, V v4) {
            this.f77771b = k4;
            this.f77772c = v4;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class e extends AbstractSet<Map.Entry<K, V>> {
        private e() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            if (contains(entry)) {
                return false;
            }
            t.this.put(entry.getKey(), entry.getValue());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            t.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = t.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new d(t.this, null);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            t.this.remove(entry.getKey());
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return t.this.size();
        }

        /* synthetic */ e(t tVar, a aVar) {
            this();
        }
    }

    /* synthetic */ t(int i4, a aVar) {
        this(i4);
    }

    private int f(K k4) {
        int i4;
        int size = this.f77765c.size();
        int i5 = size - 1;
        if (i5 >= 0) {
            int compareTo = k4.compareTo(this.f77765c.get(i5).getKey());
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
            int compareTo2 = k4.compareTo(this.f77765c.get(i7).getKey());
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
    public void h() {
        if (this.f77767e) {
            throw new UnsupportedOperationException();
        }
    }

    private void i() {
        h();
        if (!this.f77765c.isEmpty() || (this.f77765c instanceof ArrayList)) {
            return;
        }
        this.f77765c = new ArrayList(this.f77764b);
    }

    private SortedMap<K, V> m() {
        h();
        if (this.f77766d.isEmpty() && !(this.f77766d instanceof TreeMap)) {
            this.f77766d = new TreeMap();
        }
        return (SortedMap) this.f77766d;
    }

    static <FieldDescriptorType extends g.b<FieldDescriptorType>> t<FieldDescriptorType, Object> p(int i4) {
        return new a(i4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V r(int i4) {
        h();
        V value = this.f77765c.remove(i4).getValue();
        if (!this.f77766d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = m().entrySet().iterator();
            this.f77765c.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f77765c.isEmpty()) {
            this.f77765c.clear();
        }
        if (this.f77766d.isEmpty()) {
            return;
        }
        this.f77766d.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return f(comparable) >= 0 || this.f77766d.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f77768f == null) {
            this.f77768f = new e(this, null);
        }
        return this.f77768f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int f4 = f(comparable);
        return f4 >= 0 ? this.f77765c.get(f4).getValue() : this.f77766d.get(comparable);
    }

    public Map.Entry<K, V> j(int i4) {
        return this.f77765c.get(i4);
    }

    public int k() {
        return this.f77765c.size();
    }

    public Iterable<Map.Entry<K, V>> l() {
        return this.f77766d.isEmpty() ? b.b() : this.f77766d.entrySet();
    }

    public boolean n() {
        return this.f77767e;
    }

    public void o() {
        if (this.f77767e) {
            return;
        }
        this.f77766d = this.f77766d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f77766d);
        this.f77767e = true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: q, reason: merged with bridge method [inline-methods] */
    public V put(K k4, V v4) {
        h();
        int f4 = f(k4);
        if (f4 >= 0) {
            return this.f77765c.get(f4).setValue(v4);
        }
        i();
        int i4 = -(f4 + 1);
        if (i4 >= this.f77764b) {
            return m().put(k4, v4);
        }
        int size = this.f77765c.size();
        int i5 = this.f77764b;
        if (size == i5) {
            t<K, V>.c remove = this.f77765c.remove(i5 - 1);
            m().put(remove.getKey(), remove.getValue());
        }
        this.f77765c.add(i4, new c(k4, v4));
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int f4 = f(comparable);
        if (f4 >= 0) {
            return (V) r(f4);
        }
        if (this.f77766d.isEmpty()) {
            return null;
        }
        return this.f77766d.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f77766d.size() + this.f77765c.size();
    }

    /* compiled from: SmallSortedMap.java */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private int f77774b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f77775c;

        /* renamed from: d, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f77776d;

        private d() {
            this.f77774b = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f77776d == null) {
                this.f77776d = t.this.f77766d.entrySet().iterator();
            }
            return this.f77776d;
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f77775c = true;
            int i4 = this.f77774b + 1;
            this.f77774b = i4;
            return i4 < t.this.f77765c.size() ? (Map.Entry) t.this.f77765c.get(this.f77774b) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f77774b + 1 < t.this.f77765c.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f77775c) {
                throw new IllegalStateException(ProtectedSandApp.s("盟\u0001"));
            }
            this.f77775c = false;
            t.this.h();
            if (this.f77774b >= t.this.f77765c.size()) {
                a().remove();
                return;
            }
            t tVar = t.this;
            int i4 = this.f77774b;
            this.f77774b = i4 - 1;
            tVar.r(i4);
        }

        /* synthetic */ d(t tVar, a aVar) {
            this();
        }
    }

    private t(int i4) {
        this.f77764b = i4;
        this.f77765c = Collections.emptyList();
        this.f77766d = Collections.emptyMap();
    }
}
