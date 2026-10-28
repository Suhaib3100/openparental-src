package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: HashBiMap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public final class t2<K, V> extends AbstractMap<K, V> implements w<K, V>, Serializable {

    /* renamed from: r, reason: collision with root package name */
    private static final int f56423r = -1;

    /* renamed from: s, reason: collision with root package name */
    private static final int f56424s = -2;

    /* renamed from: b, reason: collision with root package name */
    transient K[] f56425b;

    /* renamed from: c, reason: collision with root package name */
    transient V[] f56426c;

    /* renamed from: d, reason: collision with root package name */
    transient int f56427d;

    /* renamed from: e, reason: collision with root package name */
    transient int f56428e;

    /* renamed from: f, reason: collision with root package name */
    private transient int[] f56429f;

    /* renamed from: g, reason: collision with root package name */
    private transient int[] f56430g;

    /* renamed from: h, reason: collision with root package name */
    private transient int[] f56431h;

    /* renamed from: i, reason: collision with root package name */
    private transient int[] f56432i;

    /* renamed from: j, reason: collision with root package name */
    private transient int f56433j;

    /* renamed from: k, reason: collision with root package name */
    private transient int f56434k;

    /* renamed from: l, reason: collision with root package name */
    private transient int[] f56435l;

    /* renamed from: m, reason: collision with root package name */
    private transient int[] f56436m;

    /* renamed from: n, reason: collision with root package name */
    private transient Set<K> f56437n;

    /* renamed from: o, reason: collision with root package name */
    private transient Set<V> f56438o;

    /* renamed from: p, reason: collision with root package name */
    private transient Set<Map.Entry<K, V>> f56439p;

    /* renamed from: q, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient w<V, K> f56440q;

    /* compiled from: HashBiMap.java */
    final class a extends com.google.common.collect.g<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        final K f56441b;

        /* renamed from: c, reason: collision with root package name */
        int f56442c;

        a(int i4) {
            this.f56441b = t2.this.f56425b[i4];
            this.f56442c = i4;
        }

        void a() {
            int i4 = this.f56442c;
            if (i4 != -1) {
                t2 t2Var = t2.this;
                if (i4 <= t2Var.f56427d && com.google.common.base.f0.a(t2Var.f56425b[i4], this.f56441b)) {
                    return;
                }
            }
            this.f56442c = t2.this.r(this.f56441b);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public K getKey() {
            return this.f56441b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V getValue() {
            a();
            int i4 = this.f56442c;
            if (i4 == -1) {
                return null;
            }
            return t2.this.f56426c[i4];
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V setValue(@f5 V v4) {
            a();
            int i4 = this.f56442c;
            if (i4 == -1) {
                t2.this.B(this.f56441b, v4, false);
                return null;
            }
            V v5 = t2.this.f56426c[i4];
            if (com.google.common.base.f0.a(v5, v4)) {
                return v4;
            }
            t2.this.M(this.f56442c, v4, false);
            return v5;
        }
    }

    /* compiled from: HashBiMap.java */
    static final class b<K, V> extends com.google.common.collect.g<V, K> {

        /* renamed from: b, reason: collision with root package name */
        final t2<K, V> f56444b;

        /* renamed from: c, reason: collision with root package name */
        @f5
        final V f56445c;

        /* renamed from: d, reason: collision with root package name */
        int f56446d;

        b(t2<K, V> t2Var, int i4) {
            this.f56444b = t2Var;
            this.f56445c = t2Var.f56426c[i4];
            this.f56446d = i4;
        }

        private void a() {
            int i4 = this.f56446d;
            if (i4 != -1) {
                t2<K, V> t2Var = this.f56444b;
                if (i4 <= t2Var.f56427d && com.google.common.base.f0.a(this.f56445c, t2Var.f56426c[i4])) {
                    return;
                }
            }
            this.f56446d = this.f56444b.u(this.f56445c);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V getKey() {
            return this.f56445c;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public K getValue() {
            a();
            int i4 = this.f56446d;
            if (i4 == -1) {
                return null;
            }
            return this.f56444b.f56425b[i4];
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public K setValue(@f5 K k4) {
            a();
            int i4 = this.f56446d;
            if (i4 == -1) {
                this.f56444b.C(this.f56445c, k4, false);
                return null;
            }
            K k5 = this.f56444b.f56425b[i4];
            if (com.google.common.base.f0.a(k5, k4)) {
                return k4;
            }
            this.f56444b.L(this.f56446d, k4, false);
            return k5;
        }
    }

    /* compiled from: HashBiMap.java */
    final class c extends h<K, V, Map.Entry<K, V>> {
        c() {
            super(t2.this);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.t2.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i4) {
            return new a(i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int r4 = t2.this.r(key);
            return r4 != -1 && com.google.common.base.f0.a(value, t2.this.f56426c[r4]);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @f9.a
        public boolean remove(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d5 = x2.d(key);
            int t4 = t2.this.t(key, d5);
            if (t4 == -1 || !com.google.common.base.f0.a(value, t2.this.f56426c[t4])) {
                return false;
            }
            t2.this.H(t4, d5);
            return true;
        }
    }

    /* compiled from: HashBiMap.java */
    static class d<K, V> extends AbstractMap<V, K> implements w<V, K>, Serializable {

        /* renamed from: b, reason: collision with root package name */
        private final t2<K, V> f56448b;

        /* renamed from: c, reason: collision with root package name */
        private transient Set<Map.Entry<V, K>> f56449c;

        d(t2<K, V> t2Var) {
            this.f56448b = t2Var;
        }

        @d9.c("serialization")
        private void b(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            ((t2) this.f56448b).f56440q = this;
        }

        @Override // com.google.common.collect.w
        public w<K, V> M2() {
            return this.f56448b;
        }

        @Override // com.google.common.collect.w
        @zc.a
        @f9.a
        public K a2(@f5 V v4, @f5 K k4) {
            return this.f56448b.C(v4, k4, true);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f56448b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return this.f56448b.containsValue(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsValue(@zc.a Object obj) {
            return this.f56448b.containsKey(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<V, K>> entrySet() {
            Set<Map.Entry<V, K>> set = this.f56449c;
            if (set != null) {
                return set;
            }
            e eVar = new e(this.f56448b);
            this.f56449c = eVar;
            return eVar;
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        public K get(@zc.a Object obj) {
            return this.f56448b.w(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<V> keySet() {
            return this.f56448b.values();
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.w
        @zc.a
        @f9.a
        public K put(@f5 V v4, @f5 K k4) {
            return this.f56448b.C(v4, k4, false);
        }

        @Override // java.util.AbstractMap, java.util.Map
        @zc.a
        @f9.a
        public K remove(@zc.a Object obj) {
            return this.f56448b.J(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f56448b.f56427d;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.w
        public Set<K> values() {
            return this.f56448b.keySet();
        }
    }

    /* compiled from: HashBiMap.java */
    static class e<K, V> extends h<K, V, Map.Entry<V, K>> {
        e(t2<K, V> t2Var) {
            super(t2Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.t2.h
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public Map.Entry<V, K> b(int i4) {
            return new b(this.f56452b, i4);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int u4 = this.f56452b.u(key);
            return u4 != -1 && com.google.common.base.f0.a(this.f56452b.f56425b[u4], value);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            int d5 = x2.d(key);
            int v4 = this.f56452b.v(key, d5);
            if (v4 == -1 || !com.google.common.base.f0.a(this.f56452b.f56425b[v4], value)) {
                return false;
            }
            this.f56452b.I(v4, d5);
            return true;
        }
    }

    /* compiled from: HashBiMap.java */
    final class f extends h<K, V, K> {
        f() {
            super(t2.this);
        }

        @Override // com.google.common.collect.t2.h
        @f5
        K b(int i4) {
            return t2.this.f56425b[i4];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return t2.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            int d5 = x2.d(obj);
            int t4 = t2.this.t(obj, d5);
            if (t4 == -1) {
                return false;
            }
            t2.this.H(t4, d5);
            return true;
        }
    }

    /* compiled from: HashBiMap.java */
    final class g extends h<K, V, V> {
        g() {
            super(t2.this);
        }

        @Override // com.google.common.collect.t2.h
        @f5
        V b(int i4) {
            return t2.this.f56426c[i4];
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return t2.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            int d5 = x2.d(obj);
            int v4 = t2.this.v(obj, d5);
            if (v4 == -1) {
                return false;
            }
            t2.this.I(v4, d5);
            return true;
        }
    }

    /* compiled from: HashBiMap.java */
    static abstract class h<K, V, T> extends AbstractSet<T> {

        /* renamed from: b, reason: collision with root package name */
        final t2<K, V> f56452b;

        /* compiled from: HashBiMap.java */
        class a implements Iterator<T> {

            /* renamed from: b, reason: collision with root package name */
            private int f56453b;

            /* renamed from: c, reason: collision with root package name */
            private int f56454c = -1;

            /* renamed from: d, reason: collision with root package name */
            private int f56455d;

            /* renamed from: e, reason: collision with root package name */
            private int f56456e;

            a() {
                this.f56453b = ((t2) h.this.f56452b).f56433j;
                t2<K, V> t2Var = h.this.f56452b;
                this.f56455d = t2Var.f56428e;
                this.f56456e = t2Var.f56427d;
            }

            private void a() {
                if (h.this.f56452b.f56428e != this.f56455d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f56453b != -2 && this.f56456e > 0;
            }

            @Override // java.util.Iterator
            @f5
            public T next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                T t4 = (T) h.this.b(this.f56453b);
                this.f56454c = this.f56453b;
                this.f56453b = ((t2) h.this.f56452b).f56436m[this.f56453b];
                this.f56456e--;
                return t4;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                b0.e(this.f56454c != -1);
                h.this.f56452b.E(this.f56454c);
                int i4 = this.f56453b;
                t2<K, V> t2Var = h.this.f56452b;
                if (i4 == t2Var.f56427d) {
                    this.f56453b = this.f56454c;
                }
                this.f56454c = -1;
                this.f56455d = t2Var.f56428e;
            }
        }

        h(t2<K, V> t2Var) {
            this.f56452b = t2Var;
        }

        @f5
        abstract T b(int i4);

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            this.f56452b.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<T> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f56452b.f56427d;
        }
    }

    private t2(int i4) {
        x(i4);
    }

    private void A(int i4, int i5) {
        int i6;
        int i7;
        if (i4 == i5) {
            return;
        }
        int i10 = this.f56435l[i4];
        int i11 = this.f56436m[i4];
        N(i10, i5);
        N(i5, i11);
        K[] kArr = this.f56425b;
        K k4 = kArr[i4];
        V[] vArr = this.f56426c;
        V v4 = vArr[i4];
        kArr[i5] = k4;
        vArr[i5] = v4;
        int h4 = h(x2.d(k4));
        int[] iArr = this.f56429f;
        int i12 = iArr[h4];
        if (i12 == i4) {
            iArr[h4] = i5;
        } else {
            int i13 = this.f56431h[i12];
            while (true) {
                i6 = i12;
                i12 = i13;
                if (i12 == i4) {
                    break;
                } else {
                    i13 = this.f56431h[i12];
                }
            }
            this.f56431h[i6] = i5;
        }
        int[] iArr2 = this.f56431h;
        iArr2[i5] = iArr2[i4];
        iArr2[i4] = -1;
        int h5 = h(x2.d(v4));
        int[] iArr3 = this.f56430g;
        int i14 = iArr3[h5];
        if (i14 == i4) {
            iArr3[h5] = i5;
        } else {
            int i15 = this.f56432i[i14];
            while (true) {
                i7 = i14;
                i14 = i15;
                if (i14 == i4) {
                    break;
                } else {
                    i15 = this.f56432i[i14];
                }
            }
            this.f56432i[i7] = i5;
        }
        int[] iArr4 = this.f56432i;
        iArr4[i5] = iArr4[i4];
        iArr4[i4] = -1;
    }

    @d9.c
    private void D(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        x(16);
        b6.c(this, objectInputStream, readInt);
    }

    private void F(int i4, int i5, int i6) {
        com.google.common.base.l0.d(i4 != -1);
        m(i4, i5);
        n(i4, i6);
        N(this.f56435l[i4], this.f56436m[i4]);
        A(this.f56427d - 1, i4);
        K[] kArr = this.f56425b;
        int i7 = this.f56427d;
        kArr[i7 - 1] = null;
        this.f56426c[i7 - 1] = null;
        this.f56427d = i7 - 1;
        this.f56428e++;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L(int i4, @f5 K k4, boolean z4) {
        int i5;
        com.google.common.base.l0.d(i4 != -1);
        int d5 = x2.d(k4);
        int t4 = t(k4, d5);
        int i6 = this.f56434k;
        if (t4 == -1) {
            i5 = -2;
        } else {
            if (!z4) {
                String valueOf = String.valueOf(k4);
                throw new IllegalArgumentException(com.google.common.base.i.a(valueOf.length() + 28, ProtectedSandApp.s("\uf54e"), valueOf));
            }
            i6 = this.f56435l[t4];
            i5 = this.f56436m[t4];
            H(t4, d5);
            if (i4 == this.f56427d) {
                i4 = t4;
            }
        }
        if (i6 == i4) {
            i6 = this.f56435l[i4];
        } else if (i6 == this.f56427d) {
            i6 = t4;
        }
        if (i5 == i4) {
            t4 = this.f56436m[i4];
        } else if (i5 != this.f56427d) {
            t4 = i5;
        }
        N(this.f56435l[i4], this.f56436m[i4]);
        m(i4, x2.d(this.f56425b[i4]));
        this.f56425b[i4] = k4;
        y(i4, x2.d(k4));
        N(i6, i4);
        N(i4, t4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void M(int i4, @f5 V v4, boolean z4) {
        com.google.common.base.l0.d(i4 != -1);
        int d5 = x2.d(v4);
        int v5 = v(v4, d5);
        if (v5 != -1) {
            if (!z4) {
                String valueOf = String.valueOf(v4);
                throw new IllegalArgumentException(com.google.common.base.i.a(valueOf.length() + 30, ProtectedSandApp.s("\uf54f"), valueOf));
            }
            I(v5, d5);
            if (i4 == this.f56427d) {
                i4 = v5;
            }
        }
        n(i4, x2.d(this.f56426c[i4]));
        this.f56426c[i4] = v4;
        z(i4, d5);
    }

    private void N(int i4, int i5) {
        if (i4 == -2) {
            this.f56433j = i5;
        } else {
            this.f56436m[i4] = i5;
        }
        if (i5 == -2) {
            this.f56434k = i4;
        } else {
            this.f56435l[i5] = i4;
        }
    }

    @d9.c
    private void O(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        b6.i(this, objectOutputStream);
    }

    private int h(int i4) {
        return i4 & (this.f56429f.length - 1);
    }

    public static <K, V> t2<K, V> i() {
        return new t2<>(16);
    }

    public static <K, V> t2<K, V> j(int i4) {
        return new t2<>(i4);
    }

    public static <K, V> t2<K, V> k(Map<? extends K, ? extends V> map) {
        t2<K, V> t2Var = new t2<>(map.size());
        t2Var.putAll(map);
        return t2Var;
    }

    private static int[] l(int i4) {
        int[] iArr = new int[i4];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private void m(int i4, int i5) {
        com.google.common.base.l0.d(i4 != -1);
        int h4 = h(i5);
        int[] iArr = this.f56429f;
        int i6 = iArr[h4];
        if (i6 == i4) {
            int[] iArr2 = this.f56431h;
            iArr[h4] = iArr2[i4];
            iArr2[i4] = -1;
            return;
        }
        int i7 = this.f56431h[i6];
        while (true) {
            int i10 = i6;
            i6 = i7;
            if (i6 == -1) {
                String valueOf = String.valueOf(this.f56425b[i4]);
                throw new AssertionError(com.google.common.base.i.a(valueOf.length() + 32, ProtectedSandApp.s("\uf550"), valueOf));
            }
            if (i6 == i4) {
                int[] iArr3 = this.f56431h;
                iArr3[i10] = iArr3[i4];
                iArr3[i4] = -1;
                return;
            }
            i7 = this.f56431h[i6];
        }
    }

    private void n(int i4, int i5) {
        com.google.common.base.l0.d(i4 != -1);
        int h4 = h(i5);
        int[] iArr = this.f56430g;
        int i6 = iArr[h4];
        if (i6 == i4) {
            int[] iArr2 = this.f56432i;
            iArr[h4] = iArr2[i4];
            iArr2[i4] = -1;
            return;
        }
        int i7 = this.f56432i[i6];
        while (true) {
            int i10 = i6;
            i6 = i7;
            if (i6 == -1) {
                String valueOf = String.valueOf(this.f56426c[i4]);
                throw new AssertionError(com.google.common.base.i.a(valueOf.length() + 34, ProtectedSandApp.s("\uf551"), valueOf));
            }
            if (i6 == i4) {
                int[] iArr3 = this.f56432i;
                iArr3[i10] = iArr3[i4];
                iArr3[i4] = -1;
                return;
            }
            i7 = this.f56432i[i6];
        }
    }

    private void o(int i4) {
        int[] iArr = this.f56431h;
        if (iArr.length < i4) {
            int f4 = b3.b.f(iArr.length, i4);
            this.f56425b = (K[]) Arrays.copyOf(this.f56425b, f4);
            this.f56426c = (V[]) Arrays.copyOf(this.f56426c, f4);
            this.f56431h = p(this.f56431h, f4);
            this.f56432i = p(this.f56432i, f4);
            this.f56435l = p(this.f56435l, f4);
            this.f56436m = p(this.f56436m, f4);
        }
        if (this.f56429f.length < i4) {
            int a5 = x2.a(i4, 1.0d);
            this.f56429f = l(a5);
            this.f56430g = l(a5);
            for (int i5 = 0; i5 < this.f56427d; i5++) {
                int h4 = h(x2.d(this.f56425b[i5]));
                int[] iArr2 = this.f56431h;
                int[] iArr3 = this.f56429f;
                iArr2[i5] = iArr3[h4];
                iArr3[h4] = i5;
                int h5 = h(x2.d(this.f56426c[i5]));
                int[] iArr4 = this.f56432i;
                int[] iArr5 = this.f56430g;
                iArr4[i5] = iArr5[h5];
                iArr5[h5] = i5;
            }
        }
    }

    private static int[] p(int[] iArr, int i4) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i4);
        Arrays.fill(copyOf, length, i4, -1);
        return copyOf;
    }

    private void y(int i4, int i5) {
        com.google.common.base.l0.d(i4 != -1);
        int h4 = h(i5);
        int[] iArr = this.f56431h;
        int[] iArr2 = this.f56429f;
        iArr[i4] = iArr2[h4];
        iArr2[h4] = i4;
    }

    private void z(int i4, int i5) {
        com.google.common.base.l0.d(i4 != -1);
        int h4 = h(i5);
        int[] iArr = this.f56432i;
        int[] iArr2 = this.f56430g;
        iArr[i4] = iArr2[h4];
        iArr2[h4] = i4;
    }

    @zc.a
    V B(@f5 K k4, @f5 V v4, boolean z4) {
        int d5 = x2.d(k4);
        int t4 = t(k4, d5);
        if (t4 != -1) {
            V v5 = this.f56426c[t4];
            if (com.google.common.base.f0.a(v5, v4)) {
                return v4;
            }
            M(t4, v4, z4);
            return v5;
        }
        int d6 = x2.d(v4);
        int v6 = v(v4, d6);
        if (!z4) {
            com.google.common.base.l0.u(v6 == -1, ProtectedSandApp.s("\uf552"), v4);
        } else if (v6 != -1) {
            I(v6, d6);
        }
        o(this.f56427d + 1);
        K[] kArr = this.f56425b;
        int i4 = this.f56427d;
        kArr[i4] = k4;
        this.f56426c[i4] = v4;
        y(i4, d5);
        z(this.f56427d, d6);
        N(this.f56434k, this.f56427d);
        N(this.f56427d, -2);
        this.f56427d++;
        this.f56428e++;
        return null;
    }

    @zc.a
    @f9.a
    K C(@f5 V v4, @f5 K k4, boolean z4) {
        int d5 = x2.d(v4);
        int v5 = v(v4, d5);
        if (v5 != -1) {
            K k5 = this.f56425b[v5];
            if (com.google.common.base.f0.a(k5, k4)) {
                return k4;
            }
            L(v5, k4, z4);
            return k5;
        }
        int i4 = this.f56434k;
        int d6 = x2.d(k4);
        int t4 = t(k4, d6);
        if (!z4) {
            com.google.common.base.l0.u(t4 == -1, ProtectedSandApp.s("\uf553"), k4);
        } else if (t4 != -1) {
            i4 = this.f56435l[t4];
            H(t4, d6);
        }
        o(this.f56427d + 1);
        K[] kArr = this.f56425b;
        int i5 = this.f56427d;
        kArr[i5] = k4;
        this.f56426c[i5] = v4;
        y(i5, d6);
        z(this.f56427d, d5);
        int i6 = i4 == -2 ? this.f56433j : this.f56436m[i4];
        N(i4, this.f56427d);
        N(this.f56427d, i6);
        this.f56427d++;
        this.f56428e++;
        return null;
    }

    void E(int i4) {
        H(i4, x2.d(this.f56425b[i4]));
    }

    void H(int i4, int i5) {
        F(i4, i5, x2.d(this.f56426c[i4]));
    }

    void I(int i4, int i5) {
        F(i4, x2.d(this.f56425b[i4]), i5);
    }

    @zc.a
    K J(@zc.a Object obj) {
        int d5 = x2.d(obj);
        int v4 = v(obj, d5);
        if (v4 == -1) {
            return null;
        }
        K k4 = this.f56425b[v4];
        I(v4, d5);
        return k4;
    }

    @Override // com.google.common.collect.w
    public w<V, K> M2() {
        w<V, K> wVar = this.f56440q;
        if (wVar != null) {
            return wVar;
        }
        d dVar = new d(this);
        this.f56440q = dVar;
        return dVar;
    }

    @Override // com.google.common.collect.w
    @zc.a
    @f9.a
    public V a2(@f5 K k4, @f5 V v4) {
        return B(k4, v4, true);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.f56425b, 0, this.f56427d, (Object) null);
        Arrays.fill(this.f56426c, 0, this.f56427d, (Object) null);
        Arrays.fill(this.f56429f, -1);
        Arrays.fill(this.f56430g, -1);
        Arrays.fill(this.f56431h, 0, this.f56427d, -1);
        Arrays.fill(this.f56432i, 0, this.f56427d, -1);
        Arrays.fill(this.f56435l, 0, this.f56427d, -1);
        Arrays.fill(this.f56436m, 0, this.f56427d, -1);
        this.f56427d = 0;
        this.f56433j = -2;
        this.f56434k = -2;
        this.f56428e++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@zc.a Object obj) {
        return r(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@zc.a Object obj) {
        return u(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f56439p;
        if (set != null) {
            return set;
        }
        c cVar = new c();
        this.f56439p = cVar;
        return cVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @zc.a
    public V get(@zc.a Object obj) {
        int r4 = r(obj);
        if (r4 == -1) {
            return null;
        }
        return this.f56426c[r4];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f56437n;
        if (set != null) {
            return set;
        }
        f fVar = new f();
        this.f56437n = fVar;
        return fVar;
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.w
    @zc.a
    @f9.a
    public V put(@f5 K k4, @f5 V v4) {
        return B(k4, v4, false);
    }

    int q(@zc.a Object obj, int i4, int[] iArr, int[] iArr2, Object[] objArr) {
        int i5 = iArr[h(i4)];
        while (i5 != -1) {
            if (com.google.common.base.f0.a(objArr[i5], obj)) {
                return i5;
            }
            i5 = iArr2[i5];
        }
        return -1;
    }

    int r(@zc.a Object obj) {
        return t(obj, x2.d(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    @zc.a
    @f9.a
    public V remove(@zc.a Object obj) {
        int d5 = x2.d(obj);
        int t4 = t(obj, d5);
        if (t4 == -1) {
            return null;
        }
        V v4 = this.f56426c[t4];
        H(t4, d5);
        return v4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f56427d;
    }

    int t(@zc.a Object obj, int i4) {
        return q(obj, i4, this.f56429f, this.f56431h, this.f56425b);
    }

    int u(@zc.a Object obj) {
        return v(obj, x2.d(obj));
    }

    int v(@zc.a Object obj, int i4) {
        return q(obj, i4, this.f56430g, this.f56432i, this.f56426c);
    }

    @zc.a
    K w(@zc.a Object obj) {
        int u4 = u(obj);
        if (u4 == -1) {
            return null;
        }
        return this.f56425b[u4];
    }

    void x(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf554"));
        int a5 = x2.a(i4, 1.0d);
        this.f56427d = 0;
        this.f56425b = (K[]) new Object[i4];
        this.f56426c = (V[]) new Object[i4];
        this.f56429f = l(a5);
        this.f56430g = l(a5);
        this.f56431h = l(i4);
        this.f56432i = l(i4);
        this.f56433j = -2;
        this.f56434k = -2;
        this.f56435l = l(i4);
        this.f56436m = l(i4);
    }

    @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.w
    public Set<V> values() {
        Set<V> set = this.f56438o;
        if (set != null) {
            return set;
        }
        g gVar = new g();
        this.f56438o = gVar;
        return gVar;
    }
}
