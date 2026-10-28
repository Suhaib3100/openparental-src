package androidx.arch.core.internal;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b, reason: collision with root package name */
    c<K, V> f2084b;

    /* renamed from: c, reason: collision with root package name */
    private c<K, V> f2085c;

    /* renamed from: d, reason: collision with root package name */
    private final WeakHashMap<f<K, V>, Boolean> f2086d = new WeakHashMap<>();

    /* renamed from: e, reason: collision with root package name */
    private int f2087e = 0;

    /* compiled from: SafeIterableMap.java */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f2091e;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2090d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: androidx.arch.core.internal.b$b, reason: collision with other inner class name */
    private static class C0021b<K, V> extends e<K, V> {
        C0021b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f2090d;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2091e;
        }
    }

    /* compiled from: SafeIterableMap.java */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @o0
        final K f2088b;

        /* renamed from: c, reason: collision with root package name */
        @o0
        final V f2089c;

        /* renamed from: d, reason: collision with root package name */
        c<K, V> f2090d;

        /* renamed from: e, reason: collision with root package name */
        c<K, V> f2091e;

        c(@o0 K k4, @o0 V v4) {
            this.f2088b = k4;
            this.f2089c = v4;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2088b.equals(cVar.f2088b) && this.f2089c.equals(cVar.f2089c);
        }

        @Override // java.util.Map.Entry
        @o0
        public K getKey() {
            return this.f2088b;
        }

        @Override // java.util.Map.Entry
        @o0
        public V getValue() {
            return this.f2089c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f2088b.hashCode() ^ this.f2089c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v4) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2088b + "=" + this.f2089c;
        }
    }

    /* compiled from: SafeIterableMap.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public class d extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        private c<K, V> f2092b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f2093c = true;

        d() {
        }

        @Override // androidx.arch.core.internal.b.f
        void a(@o0 c<K, V> cVar) {
            c<K, V> cVar2 = this.f2092b;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2091e;
                this.f2092b = cVar3;
                this.f2093c = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f2093c) {
                this.f2093c = false;
                this.f2092b = b.this.f2084b;
            } else {
                c<K, V> cVar = this.f2092b;
                this.f2092b = cVar != null ? cVar.f2090d : null;
            }
            return this.f2092b;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f2093c) {
                return b.this.f2084b != null;
            }
            c<K, V> cVar = this.f2092b;
            return (cVar == null || cVar.f2090d == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    private static abstract class e<K, V> extends f<K, V> implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        c<K, V> f2095b;

        /* renamed from: c, reason: collision with root package name */
        c<K, V> f2096c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2095b = cVar2;
            this.f2096c = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f2096c;
            c<K, V> cVar2 = this.f2095b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // androidx.arch.core.internal.b.f
        public void a(@o0 c<K, V> cVar) {
            if (this.f2095b == cVar && cVar == this.f2096c) {
                this.f2096c = null;
                this.f2095b = null;
            }
            c<K, V> cVar2 = this.f2095b;
            if (cVar2 == cVar) {
                this.f2095b = b(cVar2);
            }
            if (this.f2096c == cVar) {
                this.f2096c = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f2096c;
            this.f2096c = e();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f2096c != null;
        }
    }

    /* compiled from: SafeIterableMap.java */
    @c1({c1.a.LIBRARY_GROUP_PREFIX})
    public static abstract class f<K, V> {
        abstract void a(@o0 c<K, V> cVar);
    }

    @q0
    public Map.Entry<K, V> b() {
        return this.f2084b;
    }

    @q0
    protected c<K, V> c(K k4) {
        c<K, V> cVar = this.f2084b;
        while (cVar != null && !cVar.f2088b.equals(k4)) {
            cVar = cVar.f2090d;
        }
        return cVar;
    }

    @o0
    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0021b c0021b = new C0021b(this.f2085c, this.f2084b);
        this.f2086d.put(c0021b, Boolean.FALSE);
        return c0021b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    @o0
    public b<K, V>.d f() {
        b<K, V>.d dVar = new d();
        this.f2086d.put(dVar, Boolean.FALSE);
        return dVar;
    }

    @q0
    public Map.Entry<K, V> h() {
        return this.f2085c;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i4 = 0;
        while (it.hasNext()) {
            i4 += it.next().hashCode();
        }
        return i4;
    }

    c<K, V> i(@o0 K k4, @o0 V v4) {
        c<K, V> cVar = new c<>(k4, v4);
        this.f2087e++;
        c<K, V> cVar2 = this.f2085c;
        if (cVar2 == null) {
            this.f2084b = cVar;
            this.f2085c = cVar;
            return cVar;
        }
        cVar2.f2090d = cVar;
        cVar.f2091e = cVar2;
        this.f2085c = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    @o0
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f2084b, this.f2085c);
        this.f2086d.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V j(@o0 K k4, @o0 V v4) {
        c<K, V> c5 = c(k4);
        if (c5 != null) {
            return c5.f2089c;
        }
        i(k4, v4);
        return null;
    }

    public V l(@o0 K k4) {
        c<K, V> c5 = c(k4);
        if (c5 == null) {
            return null;
        }
        this.f2087e--;
        if (!this.f2086d.isEmpty()) {
            Iterator<f<K, V>> it = this.f2086d.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(c5);
            }
        }
        c<K, V> cVar = c5.f2091e;
        if (cVar != null) {
            cVar.f2090d = c5.f2090d;
        } else {
            this.f2084b = c5.f2090d;
        }
        c<K, V> cVar2 = c5.f2090d;
        if (cVar2 != null) {
            cVar2.f2091e = cVar;
        } else {
            this.f2085c = cVar;
        }
        c5.f2090d = null;
        c5.f2091e = null;
        return c5.f2089c;
    }

    public int size() {
        return this.f2087e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
