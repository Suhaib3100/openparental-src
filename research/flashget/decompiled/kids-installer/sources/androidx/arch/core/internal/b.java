package androidx.arch.core.internal;

import androidx.annotation.c1;
import androidx.annotation.o0;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
@c1({c1.a.LIBRARY_GROUP_PREFIX})
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: o, reason: collision with root package name */
    c<K, V> f1425o;

    /* renamed from: p, reason: collision with root package name */
    private c<K, V> f1426p;

    /* renamed from: q, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f1427q = new WeakHashMap<>();

    /* renamed from: r, reason: collision with root package name */
    private int f1428r = 0;

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes3.dex */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f1432r;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f1431q;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: androidx.arch.core.internal.b$b, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    private static class C0013b<K, V> extends e<K, V> {
        C0013b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f1431q;
        }

        @Override // androidx.arch.core.internal.b.e
        c<K, V> d(c<K, V> cVar) {
            return cVar.f1432r;
        }
    }

    /* compiled from: SafeIterableMap.java */
    static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: o, reason: collision with root package name */
        @o0
        final K f1429o;

        /* renamed from: p, reason: collision with root package name */
        @o0
        final V f1430p;

        /* renamed from: q, reason: collision with root package name */
        c<K, V> f1431q;

        /* renamed from: r, reason: collision with root package name */
        c<K, V> f1432r;

        c(@o0 K k5, @o0 V v5) {
            this.f1429o = k5;
            this.f1430p = v5;
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
            return this.f1429o.equals(cVar.f1429o) && this.f1430p.equals(cVar.f1430p);
        }

        @Override // java.util.Map.Entry
        @o0
        public K getKey() {
            return this.f1429o;
        }

        @Override // java.util.Map.Entry
        @o0
        public V getValue() {
            return this.f1430p;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f1429o.hashCode() ^ this.f1430p.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v5) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f1429o + "=" + this.f1430p;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes2.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: o, reason: collision with root package name */
        private c<K, V> f1433o;

        /* renamed from: p, reason: collision with root package name */
        private boolean f1434p = true;

        d() {
        }

        @Override // androidx.arch.core.internal.b.f
        public void a(@o0 c<K, V> cVar) {
            c<K, V> cVar2 = this.f1433o;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f1432r;
                this.f1433o = cVar3;
                this.f1434p = cVar3 == null;
            }
        }

        @Override // java.util.Iterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f1434p) {
                this.f1434p = false;
                this.f1433o = b.this.f1425o;
            } else {
                c<K, V> cVar = this.f1433o;
                this.f1433o = cVar != null ? cVar.f1431q : null;
            }
            return this.f1433o;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f1434p) {
                return b.this.f1425o != null;
            }
            c<K, V> cVar = this.f1433o;
            return (cVar == null || cVar.f1431q == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes2.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: o, reason: collision with root package name */
        c<K, V> f1436o;

        /* renamed from: p, reason: collision with root package name */
        c<K, V> f1437p;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f1436o = cVar2;
            this.f1437p = cVar;
        }

        private c<K, V> f() {
            c<K, V> cVar = this.f1437p;
            c<K, V> cVar2 = this.f1436o;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return d(cVar);
        }

        @Override // androidx.arch.core.internal.b.f
        public void a(@o0 c<K, V> cVar) {
            if (this.f1436o == cVar && cVar == this.f1437p) {
                this.f1437p = null;
                this.f1436o = null;
            }
            c<K, V> cVar2 = this.f1436o;
            if (cVar2 == cVar) {
                this.f1436o = c(cVar2);
            }
            if (this.f1437p == cVar) {
                this.f1437p = f();
            }
        }

        abstract c<K, V> c(c<K, V> cVar);

        abstract c<K, V> d(c<K, V> cVar);

        @Override // java.util.Iterator
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f1437p;
            this.f1437p = f();
            return cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f1437p != null;
        }
    }

    /* compiled from: SafeIterableMap.java */
    interface f<K, V> {
        void a(@o0 c<K, V> cVar);
    }

    public Map.Entry<K, V> b() {
        return this.f1425o;
    }

    public Iterator<Map.Entry<K, V>> descendingIterator() {
        C0013b c0013b = new C0013b(this.f1426p, this.f1425o);
        this.f1427q.put(c0013b, Boolean.FALSE);
        return c0013b;
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

    protected c<K, V> f(K k5) {
        c<K, V> cVar = this.f1425o;
        while (cVar != null && !cVar.f1429o.equals(k5)) {
            cVar = cVar.f1431q;
        }
        return cVar;
    }

    public b<K, V>.d g() {
        b<K, V>.d dVar = new d();
        this.f1427q.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public Map.Entry<K, V> h() {
        return this.f1426p;
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i5 = 0;
        while (it.hasNext()) {
            i5 += it.next().hashCode();
        }
        return i5;
    }

    protected c<K, V> i(@o0 K k5, @o0 V v5) {
        c<K, V> cVar = new c<>(k5, v5);
        this.f1428r++;
        c<K, V> cVar2 = this.f1426p;
        if (cVar2 == null) {
            this.f1425o = cVar;
            this.f1426p = cVar;
            return cVar;
        }
        cVar2.f1431q = cVar;
        cVar.f1432r = cVar2;
        this.f1426p = cVar;
        return cVar;
    }

    @Override // java.lang.Iterable
    @o0
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f1425o, this.f1426p);
        this.f1427q.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V o(@o0 K k5, @o0 V v5) {
        c<K, V> f6 = f(k5);
        if (f6 != null) {
            return f6.f1430p;
        }
        i(k5, v5);
        return null;
    }

    public V p(@o0 K k5) {
        c<K, V> f6 = f(k5);
        if (f6 == null) {
            return null;
        }
        this.f1428r--;
        if (!this.f1427q.isEmpty()) {
            Iterator<f<K, V>> it = this.f1427q.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(f6);
            }
        }
        c<K, V> cVar = f6.f1432r;
        if (cVar != null) {
            cVar.f1431q = f6.f1431q;
        } else {
            this.f1425o = f6.f1431q;
        }
        c<K, V> cVar2 = f6.f1431q;
        if (cVar2 != null) {
            cVar2.f1432r = cVar;
        } else {
            this.f1426p = cVar;
        }
        f6.f1431q = null;
        f6.f1432r = null;
        return f6.f1430p;
    }

    public int size() {
        return this.f1428r;
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
