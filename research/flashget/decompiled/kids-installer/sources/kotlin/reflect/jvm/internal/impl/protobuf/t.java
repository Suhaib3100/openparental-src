package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.fragment.app.e0;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes5.dex */
class t<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: o, reason: collision with root package name */
    private final int f25782o;

    /* renamed from: p, reason: collision with root package name */
    private List<t<K, V>.c> f25783p;

    /* renamed from: q, reason: collision with root package name */
    private Map<K, V> f25784q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f25785r;

    /* renamed from: s, reason: collision with root package name */
    private volatile t<K, V>.e f25786s;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: SmallSortedMap.java */
    static class a<FieldDescriptorType> extends t<FieldDescriptorType, Object> {
        a(int i5) {
            super(i5, null);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.t, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((g.b) obj, obj2);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.t
        public void q() {
            if (!p()) {
                for (int i5 = 0; i5 < l(); i5++) {
                    Map.Entry<FieldDescriptorType, Object> k5 = k(i5);
                    if (((g.b) k5.getKey()).a()) {
                        k5.setValue(Collections.unmodifiableList((List) k5.getValue()));
                    }
                }
                for (Map.Entry<FieldDescriptorType, Object> entry : m()) {
                    if (((g.b) entry.getKey()).a()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            super.q();
        }
    }

    /* compiled from: SmallSortedMap.java */
    private static class b {

        /* renamed from: a, reason: collision with root package name */
        private static final Iterator<Object> f25787a = new a();

        /* renamed from: b, reason: collision with root package name */
        private static final Iterable<Object> f25788b = new C0364b();

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
        static class C0364b implements Iterable<Object> {
            C0364b() {
            }

            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return b.f25787a;
            }
        }

        static <T> Iterable<T> b() {
            return (Iterable<T>) f25788b;
        }
    }

    /* compiled from: SmallSortedMap.java */
    private class c implements Comparable<t<K, V>.c>, Map.Entry<K, V> {

        /* renamed from: o, reason: collision with root package name */
        private final K f25789o;

        /* renamed from: p, reason: collision with root package name */
        private V f25790p;

        c(t tVar, Map.Entry<K, V> entry) {
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
            return h(this.f25789o, entry.getKey()) && h(this.f25790p, entry.getValue());
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(t<K, V>.c cVar) {
            return getKey().compareTo(cVar.getKey());
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f25790p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K k5 = this.f25789o;
            int hashCode = k5 == null ? 0 : k5.hashCode();
            V v5 = this.f25790p;
            return hashCode ^ (v5 != null ? v5.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public K getKey() {
            return this.f25789o;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            t.this.h();
            V v6 = this.f25790p;
            this.f25790p = v5;
            return v6;
        }

        public String toString() {
            String valueOf = String.valueOf(this.f25789o);
            String valueOf2 = String.valueOf(this.f25790p);
            return e0.a(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, ProtectedSandApp.s("佛"), valueOf2);
        }

        c(K k5, V v5) {
            this.f25789o = k5;
            this.f25790p = v5;
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

    /* synthetic */ t(int i5, a aVar) {
        this(i5);
    }

    private int g(K k5) {
        int size = this.f25783p.size() - 1;
        if (size >= 0) {
            int compareTo = k5.compareTo(this.f25783p.get(size).getKey());
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
            int compareTo2 = k5.compareTo(this.f25783p.get(i6).getKey());
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
    public void h() {
        if (this.f25785r) {
            throw new UnsupportedOperationException();
        }
    }

    private void j() {
        h();
        if (!this.f25783p.isEmpty() || (this.f25783p instanceof ArrayList)) {
            return;
        }
        this.f25783p = new ArrayList(this.f25782o);
    }

    private SortedMap<K, V> n() {
        h();
        if (this.f25784q.isEmpty() && !(this.f25784q instanceof TreeMap)) {
            this.f25784q = new TreeMap();
        }
        return (SortedMap) this.f25784q;
    }

    static <FieldDescriptorType extends g.b<FieldDescriptorType>> t<FieldDescriptorType, Object> r(int i5) {
        return new a(i5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V t(int i5) {
        h();
        V value = this.f25783p.remove(i5).getValue();
        if (!this.f25784q.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            this.f25783p.add(new c(this, it.next()));
            it.remove();
        }
        return value;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        h();
        if (!this.f25783p.isEmpty()) {
            this.f25783p.clear();
        }
        if (this.f25784q.isEmpty()) {
            return;
        }
        this.f25784q.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return g(comparable) >= 0 || this.f25784q.containsKey(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f25786s == null) {
            this.f25786s = new e(this, null);
        }
        return this.f25786s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int g5 = g(comparable);
        return g5 >= 0 ? this.f25783p.get(g5).getValue() : this.f25784q.get(comparable);
    }

    public Map.Entry<K, V> k(int i5) {
        return this.f25783p.get(i5);
    }

    public int l() {
        return this.f25783p.size();
    }

    public Iterable<Map.Entry<K, V>> m() {
        return this.f25784q.isEmpty() ? b.b() : this.f25784q.entrySet();
    }

    public boolean p() {
        return this.f25785r;
    }

    public void q() {
        if (this.f25785r) {
            return;
        }
        this.f25784q = this.f25784q.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f25784q);
        this.f25785r = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        h();
        Comparable comparable = (Comparable) obj;
        int g5 = g(comparable);
        if (g5 >= 0) {
            return (V) t(g5);
        }
        if (this.f25784q.isEmpty()) {
            return null;
        }
        return this.f25784q.remove(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public V put(K k5, V v5) {
        h();
        int g5 = g(k5);
        if (g5 >= 0) {
            return this.f25783p.get(g5).setValue(v5);
        }
        j();
        int i5 = -(g5 + 1);
        if (i5 >= this.f25782o) {
            return n().put(k5, v5);
        }
        int size = this.f25783p.size();
        int i6 = this.f25782o;
        if (size == i6) {
            t<K, V>.c remove = this.f25783p.remove(i6 - 1);
            n().put(remove.getKey(), remove.getValue());
        }
        this.f25783p.add(i5, new c(k5, v5));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f25784q.size() + this.f25783p.size();
    }

    /* compiled from: SmallSortedMap.java */
    private class d implements Iterator<Map.Entry<K, V>> {

        /* renamed from: o, reason: collision with root package name */
        private int f25792o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f25793p;

        /* renamed from: q, reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f25794q;

        private d() {
            this.f25792o = -1;
        }

        private Iterator<Map.Entry<K, V>> a() {
            if (this.f25794q == null) {
                this.f25794q = t.this.f25784q.entrySet().iterator();
            }
            return this.f25794q;
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            this.f25793p = true;
            int i5 = this.f25792o + 1;
            this.f25792o = i5;
            return i5 < t.this.f25783p.size() ? (Map.Entry) t.this.f25783p.get(this.f25792o) : a().next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f25792o + 1 < t.this.f25783p.size() || a().hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f25793p) {
                throw new IllegalStateException(ProtectedSandApp.s("作"));
            }
            this.f25793p = false;
            t.this.h();
            if (this.f25792o >= t.this.f25783p.size()) {
                a().remove();
                return;
            }
            t tVar = t.this;
            int i5 = this.f25792o;
            this.f25792o = i5 - 1;
            tVar.t(i5);
        }

        /* synthetic */ d(t tVar, a aVar) {
            this();
        }
    }

    private t(int i5) {
        this.f25782o = i5;
        this.f25783p = Collections.emptyList();
        this.f25784q = Collections.emptyMap();
    }
}
