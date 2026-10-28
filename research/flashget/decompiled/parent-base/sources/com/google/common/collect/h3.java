package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b3;
import com.google.common.collect.p4;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;

/* compiled from: ImmutableMap.java */
@w0
@d9.b(emulated = true, serializable = true)
@f9.f("Use ImmutableMap.of or another implementation")
/* loaded from: classes6.dex */
public abstract class h3<K, V> implements Map<K, V>, Serializable {

    /* renamed from: f, reason: collision with root package name */
    static final Map.Entry<?, ?>[] f55789f = new Map.Entry[0];

    /* renamed from: b, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient q3<Map.Entry<K, V>> f55790b;

    /* renamed from: c, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient q3<K> f55791c;

    /* renamed from: d, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient b3<V> f55792d;

    /* renamed from: e, reason: collision with root package name */
    @g9.b
    @zc.a
    private transient r3<K, V> f55793e;

    /* compiled from: ImmutableMap.java */
    class a extends e7<K> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ e7 f55794b;

        a(h3 h3Var, e7 e7Var) {
            this.f55794b = e7Var;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55794b.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f55794b.next()).getKey();
        }
    }

    /* compiled from: ImmutableMap.java */
    @f9.f
    public static class b<K, V> {

        /* renamed from: a, reason: collision with root package name */
        @zc.a
        Comparator<? super V> f55795a;

        /* renamed from: b, reason: collision with root package name */
        Object[] f55796b;

        /* renamed from: c, reason: collision with root package name */
        int f55797c;

        /* renamed from: d, reason: collision with root package name */
        boolean f55798d;

        /* renamed from: e, reason: collision with root package name */
        a f55799e;

        /* compiled from: ImmutableMap.java */
        static final class a {

            /* renamed from: a, reason: collision with root package name */
            private final Object f55800a;

            /* renamed from: b, reason: collision with root package name */
            private final Object f55801b;

            /* renamed from: c, reason: collision with root package name */
            private final Object f55802c;

            a(Object obj, Object obj2, Object obj3) {
                this.f55800a = obj;
                this.f55801b = obj2;
                this.f55802c = obj3;
            }

            IllegalArgumentException a() {
                String valueOf = String.valueOf(this.f55800a);
                String valueOf2 = String.valueOf(this.f55801b);
                String valueOf3 = String.valueOf(this.f55800a);
                String valueOf4 = String.valueOf(this.f55802c);
                int length = valueOf4.length() + valueOf3.length() + valueOf2.length() + valueOf.length() + 39;
                String s4 = ProtectedSandApp.s("\uf4ce");
                String s5 = ProtectedSandApp.s("\uf4cf");
                return new IllegalArgumentException(androidx.fragment.app.c.a(com.google.common.base.g.a(length, s4, valueOf, s5, valueOf2), ProtectedSandApp.s("\uf4d0"), valueOf3, s5, valueOf4));
            }
        }

        public b() {
            this(4);
        }

        private h3<K, V> b(boolean z4) {
            Object[] objArr;
            a aVar;
            a aVar2;
            if (z4 && (aVar2 = this.f55799e) != null) {
                throw aVar2.a();
            }
            int i4 = this.f55797c;
            if (this.f55795a == null) {
                objArr = this.f55796b;
            } else {
                if (this.f55798d) {
                    this.f55796b = Arrays.copyOf(this.f55796b, i4 * 2);
                }
                objArr = this.f55796b;
                if (!z4) {
                    objArr = g(objArr, this.f55797c);
                    if (objArr.length < this.f55796b.length) {
                        i4 = objArr.length >>> 1;
                    }
                }
                m(objArr, i4, this.f55795a);
            }
            this.f55798d = true;
            r5 J = r5.J(i4, objArr, this);
            if (!z4 || (aVar = this.f55799e) == null) {
                return J;
            }
            throw aVar.a();
        }

        private void f(int i4) {
            int i5 = i4 * 2;
            Object[] objArr = this.f55796b;
            if (i5 > objArr.length) {
                this.f55796b = Arrays.copyOf(objArr, b3.b.f(objArr.length, i5));
                this.f55798d = false;
            }
        }

        private Object[] g(Object[] objArr, int i4) {
            HashSet hashSet = new HashSet();
            BitSet bitSet = new BitSet();
            for (int i5 = i4 - 1; i5 >= 0; i5--) {
                Object obj = objArr[i5 * 2];
                Objects.requireNonNull(obj);
                if (!hashSet.add(obj)) {
                    bitSet.set(i5);
                }
            }
            if (bitSet.isEmpty()) {
                return objArr;
            }
            Object[] objArr2 = new Object[(i4 - bitSet.cardinality()) * 2];
            int i6 = 0;
            int i7 = 0;
            while (i6 < i4 * 2) {
                if (bitSet.get(i6 >>> 1)) {
                    i6 += 2;
                } else {
                    int i10 = i7 + 1;
                    int i11 = i6 + 1;
                    Object obj2 = objArr[i6];
                    Objects.requireNonNull(obj2);
                    objArr2[i7] = obj2;
                    i7 += 2;
                    i6 += 2;
                    Object obj3 = objArr[i11];
                    Objects.requireNonNull(obj3);
                    objArr2[i10] = obj3;
                }
            }
            return objArr2;
        }

        static <V> void m(Object[] objArr, int i4, Comparator<? super V> comparator) {
            Map.Entry[] entryArr = new Map.Entry[i4];
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * 2;
                Object obj = objArr[i6];
                Objects.requireNonNull(obj);
                Object obj2 = objArr[i6 + 1];
                Objects.requireNonNull(obj2);
                entryArr[i5] = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }
            Arrays.sort(entryArr, 0, i4, e5.u(comparator).u0(p4.r.VALUE));
            for (int i7 = 0; i7 < i4; i7++) {
                int i10 = i7 * 2;
                objArr[i10] = entryArr[i7].getKey();
                objArr[i10 + 1] = entryArr[i7].getValue();
            }
        }

        public h3<K, V> a() {
            return d();
        }

        public h3<K, V> c() {
            return b(false);
        }

        public h3<K, V> d() {
            return b(true);
        }

        @f9.a
        b<K, V> e(b<K, V> bVar) {
            bVar.getClass();
            f(this.f55797c + bVar.f55797c);
            System.arraycopy(bVar.f55796b, 0, this.f55796b, this.f55797c * 2, bVar.f55797c * 2);
            this.f55797c += bVar.f55797c;
            return this;
        }

        @d9.a
        @f9.a
        public b<K, V> h(Comparator<? super V> comparator) {
            com.google.common.base.l0.h0(this.f55795a == null, ProtectedSandApp.s("\uf4d1"));
            this.f55795a = (Comparator) com.google.common.base.l0.F(comparator, ProtectedSandApp.s("\uf4d2"));
            return this;
        }

        @f9.a
        public b<K, V> i(K k4, V v4) {
            f(this.f55797c + 1);
            b0.a(k4, v4);
            Object[] objArr = this.f55796b;
            int i4 = this.f55797c;
            objArr[i4 * 2] = k4;
            objArr[(i4 * 2) + 1] = v4;
            this.f55797c = i4 + 1;
            return this;
        }

        @f9.a
        public b<K, V> j(Map.Entry<? extends K, ? extends V> entry) {
            return i(entry.getKey(), entry.getValue());
        }

        @d9.a
        @f9.a
        public b<K, V> k(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                f(((Collection) iterable).size() + this.f55797c);
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                j(it.next());
            }
            return this;
        }

        @f9.a
        public b<K, V> l(Map<? extends K, ? extends V> map) {
            return k(map.entrySet());
        }

        b(int i4) {
            this.f55796b = new Object[i4 * 2];
            this.f55797c = 0;
            this.f55798d = false;
        }
    }

    /* compiled from: ImmutableMap.java */
    static abstract class c<K, V> extends h3<K, V> {

        /* compiled from: ImmutableMap.java */
        class a extends i3<K, V> {
            a() {
            }

            @Override // com.google.common.collect.i3
            h3<K, V> T() {
                return c.this;
            }

            @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
            /* renamed from: l */
            public e7<Map.Entry<K, V>> iterator() {
                return c.this.I();
            }
        }

        c() {
        }

        abstract e7<Map.Entry<K, V>> I();

        @Override // com.google.common.collect.h3, java.util.Map
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.h3
        q3<Map.Entry<K, V>> j() {
            return new a();
        }

        @Override // com.google.common.collect.h3
        q3<K> k() {
            return new j3(this);
        }

        @Override // com.google.common.collect.h3, java.util.Map
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.h3
        b3<V> l() {
            return new k3(this);
        }

        @Override // com.google.common.collect.h3, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* compiled from: ImmutableMap.java */
    static class e<K, V> implements Serializable {

        /* renamed from: d, reason: collision with root package name */
        private static final boolean f55807d = true;

        /* renamed from: e, reason: collision with root package name */
        private static final long f55808e = 0;

        /* renamed from: b, reason: collision with root package name */
        private final Object f55809b;

        /* renamed from: c, reason: collision with root package name */
        private final Object f55810c;

        e(h3<K, V> h3Var) {
            Object[] objArr = new Object[h3Var.size()];
            Object[] objArr2 = new Object[h3Var.size()];
            e7<Map.Entry<K, V>> it = h3Var.entrySet().iterator();
            int i4 = 0;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                objArr[i4] = next.getKey();
                objArr2[i4] = next.getValue();
                i4++;
            }
            this.f55809b = objArr;
            this.f55810c = objArr2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        final Object a() {
            Object[] objArr = (Object[]) this.f55809b;
            Object[] objArr2 = (Object[]) this.f55810c;
            b<K, V> b5 = b(objArr.length);
            for (int i4 = 0; i4 < objArr.length; i4++) {
                b5.i(objArr[i4], objArr2[i4]);
            }
            return b5.d();
        }

        b<K, V> b(int i4) {
            return new b<>(i4);
        }

        final Object c() {
            Object obj = this.f55809b;
            if (!(obj instanceof q3)) {
                return a();
            }
            q3 q3Var = (q3) obj;
            b3 b3Var = (b3) this.f55810c;
            b<K, V> b5 = b(q3Var.size());
            e7 it = q3Var.iterator();
            e7 it2 = b3Var.iterator();
            while (it.hasNext()) {
                b5.i(it.next(), it2.next());
            }
            return b5.d();
        }
    }

    h3() {
    }

    public static <K, V> h3<K, V> A(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        b0.a(k12, v12);
        return r5.I(7, new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11, k12, v12});
    }

    public static <K, V> h3<K, V> B(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        b0.a(k12, v12);
        b0.a(k13, v13);
        return r5.I(8, new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11, k12, v12, k13, v13});
    }

    public static <K, V> h3<K, V> C(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        b0.a(k12, v12);
        b0.a(k13, v13);
        b0.a(k14, v14);
        return r5.I(9, new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14});
    }

    public static <K, V> h3<K, V> D(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        b0.a(k12, v12);
        b0.a(k13, v13);
        b0.a(k14, v14);
        b0.a(k15, v15);
        return r5.I(10, new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15});
    }

    @SafeVarargs
    public static <K, V> h3<K, V> E(Map.Entry<? extends K, ? extends V>... entryArr) {
        return h(Arrays.asList(entryArr));
    }

    public static <K, V> b<K, V> c() {
        return new b<>(4);
    }

    @d9.a
    public static <K, V> b<K, V> d(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf484"));
        return new b<>(i4);
    }

    static void e(boolean z4, String str, Object obj, Object obj2) {
        if (!z4) {
            throw f(str, obj, obj2);
        }
    }

    static IllegalArgumentException f(String str, Object obj, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(android.support.v4.media.c.a(com.google.common.base.g.a(valueOf2.length() + valueOf.length() + com.google.android.gms.common.internal.b.a(str, 34), ProtectedSandApp.s("\uf485"), str, ProtectedSandApp.s("\uf486"), valueOf), ProtectedSandApp.s("\uf487"), valueOf2));
    }

    @d9.a
    public static <K, V> h3<K, V> h(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        b bVar = new b(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        bVar.k(iterable);
        return bVar.d();
    }

    public static <K, V> h3<K, V> i(Map<? extends K, ? extends V> map) {
        if ((map instanceof h3) && !(map instanceof SortedMap)) {
            h3<K, V> h3Var = (h3) map;
            if (!h3Var.p()) {
                return h3Var;
            }
        }
        return h(map.entrySet());
    }

    static <K, V> Map.Entry<K, V> m(K k4, V v4) {
        b0.a(k4, v4);
        return new AbstractMap.SimpleImmutableEntry(k4, v4);
    }

    public static <K, V> h3<K, V> t() {
        return (h3<K, V>) r5.f56307o;
    }

    public static <K, V> h3<K, V> u(K k4, V v4) {
        b0.a(k4, v4);
        return r5.I(1, new Object[]{k4, v4});
    }

    public static <K, V> h3<K, V> v(K k4, V v4, K k5, V v5) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        return r5.I(2, new Object[]{k4, v4, k5, v5});
    }

    public static <K, V> h3<K, V> w(K k4, V v4, K k5, V v5, K k6, V v6) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        return r5.I(3, new Object[]{k4, v4, k5, v5, k6, v6});
    }

    public static <K, V> h3<K, V> x(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        return r5.I(4, new Object[]{k4, v4, k5, v5, k6, v6, k7, v7});
    }

    public static <K, V> h3<K, V> y(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        return r5.I(5, new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10});
    }

    public static <K, V> h3<K, V> z(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        return r5.I(6, new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11});
    }

    @Override // java.util.Map
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b3<V> values() {
        b3<V> b3Var = this.f55792d;
        if (b3Var != null) {
            return b3Var;
        }
        b3<V> l4 = l();
        this.f55792d = l4;
        return l4;
    }

    Object H() {
        return new e(this);
    }

    public r3<K, V> b() {
        if (isEmpty()) {
            return z0.f56671n;
        }
        r3<K, V> r3Var = this.f55793e;
        if (r3Var != null) {
            return r3Var;
        }
        r3<K, V> r3Var2 = new r3<>(new d(this, null), size(), null);
        this.f55793e = r3Var2;
        return r3Var2;
    }

    @Override // java.util.Map
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@zc.a Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@zc.a Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public boolean equals(@zc.a Object obj) {
        return p4.w(this, obj);
    }

    @Override // java.util.Map
    @zc.a
    public abstract V get(@zc.a Object obj);

    @Override // java.util.Map
    @zc.a
    public final V getOrDefault(@zc.a Object obj, @zc.a V v4) {
        V v5 = get(obj);
        return v5 != null ? v5 : v4;
    }

    @Override // java.util.Map
    public int hashCode() {
        return d6.k(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract q3<Map.Entry<K, V>> j();

    abstract q3<K> k();

    abstract b3<V> l();

    @Override // java.util.Map
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public q3<Map.Entry<K, V>> entrySet() {
        q3<Map.Entry<K, V>> q3Var = this.f55790b;
        if (q3Var != null) {
            return q3Var;
        }
        q3<Map.Entry<K, V>> j4 = j();
        this.f55790b = j4;
        return j4;
    }

    boolean o() {
        return false;
    }

    abstract boolean p();

    @Override // java.util.Map
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final V put(K k4, V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    e7<K> q() {
        return new a(this, entrySet().iterator());
    }

    @Override // java.util.Map
    /* renamed from: r, reason: merged with bridge method [inline-methods] */
    public q3<K> keySet() {
        q3<K> q3Var = this.f55791c;
        if (q3Var != null) {
            return q3Var;
        }
        q3<K> k4 = k();
        this.f55791c = k4;
        return k4;
    }

    @Override // java.util.Map
    @zc.a
    @f9.a
    @Deprecated
    public final V remove(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return p4.w0(this);
    }

    /* compiled from: ImmutableMap.java */
    private final class d extends c<K, q3<V>> {

        /* compiled from: ImmutableMap.java */
        class a extends e7<Map.Entry<K, q3<V>>> {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ Iterator f55805b;

            /* compiled from: ImmutableMap.java */
            /* renamed from: com.google.common.collect.h3$d$a$a, reason: collision with other inner class name */
            class C0849a extends g<K, q3<V>> {

                /* renamed from: b, reason: collision with root package name */
                final /* synthetic */ Map.Entry f55806b;

                C0849a(a aVar, Map.Entry entry) {
                    this.f55806b = entry;
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public q3<V> getValue() {
                    return q3.K(this.f55806b.getValue());
                }

                @Override // com.google.common.collect.g, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f55806b.getKey();
                }
            }

            a(d dVar, Iterator it) {
                this.f55805b = it;
            }

            @Override // java.util.Iterator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, q3<V>> next() {
                return new C0849a(this, (Map.Entry) this.f55805b.next());
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f55805b.hasNext();
            }
        }

        private d() {
        }

        @Override // com.google.common.collect.h3.c
        e7<Map.Entry<K, q3<V>>> I() {
            return new a(this, h3.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.h3, java.util.Map
        @zc.a
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public q3<V> get(@zc.a Object obj) {
            Object obj2 = h3.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return q3.K(obj2);
        }

        @Override // com.google.common.collect.h3, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return h3.this.containsKey(obj);
        }

        @Override // com.google.common.collect.h3, java.util.Map
        public int hashCode() {
            return h3.this.hashCode();
        }

        @Override // com.google.common.collect.h3.c, com.google.common.collect.h3
        q3<K> k() {
            return h3.this.keySet();
        }

        @Override // com.google.common.collect.h3
        boolean o() {
            return h3.this.o();
        }

        @Override // com.google.common.collect.h3
        boolean p() {
            return h3.this.p();
        }

        @Override // java.util.Map
        public int size() {
            return h3.this.size();
        }

        /* synthetic */ d(h3 h3Var, a aVar) {
            this();
        }
    }
}
