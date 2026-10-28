package com.google.common.collect;

import com.google.common.collect.h3;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: RegularImmutableMap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
final class r5<K, V> extends h3<K, V> {

    /* renamed from: j, reason: collision with root package name */
    private static final byte f56302j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f56303k = 128;

    /* renamed from: l, reason: collision with root package name */
    private static final int f56304l = 32768;

    /* renamed from: m, reason: collision with root package name */
    private static final int f56305m = 255;

    /* renamed from: n, reason: collision with root package name */
    private static final int f56306n = 65535;

    /* renamed from: o, reason: collision with root package name */
    static final h3<Object, Object> f56307o = new r5(null, new Object[0], 0);

    /* renamed from: p, reason: collision with root package name */
    private static final long f56308p = 0;

    /* renamed from: g, reason: collision with root package name */
    @zc.a
    private final transient Object f56309g;

    /* renamed from: h, reason: collision with root package name */
    @d9.d
    final transient Object[] f56310h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f56311i;

    /* compiled from: RegularImmutableMap.java */
    static class a<K, V> extends q3<Map.Entry<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        private final transient h3<K, V> f56312g;

        /* renamed from: h, reason: collision with root package name */
        private final transient Object[] f56313h;

        /* renamed from: i, reason: collision with root package name */
        private final transient int f56314i;

        /* renamed from: j, reason: collision with root package name */
        private final transient int f56315j;

        /* compiled from: RegularImmutableMap.java */
        /* renamed from: com.google.common.collect.r5$a$a, reason: collision with other inner class name */
        class C0858a extends f3<Map.Entry<K, V>> {
            C0858a() {
            }

            @Override // java.util.List
            /* renamed from: f0, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> get(int i4) {
                com.google.common.base.l0.C(i4, a.this.f56315j);
                int i5 = i4 * 2;
                Object obj = a.this.f56313h[a.this.f56314i + i5];
                Objects.requireNonNull(obj);
                Object obj2 = a.this.f56313h[i5 + (a.this.f56314i ^ 1)];
                Objects.requireNonNull(obj2);
                return new AbstractMap.SimpleImmutableEntry(obj, obj2);
            }

            @Override // com.google.common.collect.b3
            public boolean j() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return a.this.f56315j;
            }
        }

        a(h3<K, V> h3Var, Object[] objArr, int i4, int i5) {
            this.f56312g = h3Var;
            this.f56313h = objArr;
            this.f56314i = i4;
            this.f56315j = i5;
        }

        @Override // com.google.common.collect.q3
        f3<Map.Entry<K, V>> G() {
            return new C0858a();
        }

        @Override // com.google.common.collect.b3
        int c(Object[] objArr, int i4) {
            return b().c(objArr, i4);
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            return value != null && value.equals(this.f56312g.get(key));
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        /* renamed from: l */
        public e7<Map.Entry<K, V>> iterator() {
            return b().iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f56315j;
        }
    }

    /* compiled from: RegularImmutableMap.java */
    static final class b<K> extends q3<K> {

        /* renamed from: g, reason: collision with root package name */
        private final transient h3<K, ?> f56317g;

        /* renamed from: h, reason: collision with root package name */
        private final transient f3<K> f56318h;

        b(h3<K, ?> h3Var, f3<K> f3Var) {
            this.f56317g = h3Var;
            this.f56318h = f3Var;
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3
        public f3<K> b() {
            return this.f56318h;
        }

        @Override // com.google.common.collect.b3
        int c(Object[] objArr, int i4) {
            return this.f56318h.c(objArr, i4);
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            return this.f56317g.get(obj) != null;
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f56318h.iterator();
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3
        /* renamed from: l */
        public e7<K> iterator() {
            return this.f56318h.iterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f56317g.size();
        }
    }

    /* compiled from: RegularImmutableMap.java */
    static final class c extends f3<Object> {

        /* renamed from: d, reason: collision with root package name */
        private final transient Object[] f56319d;

        /* renamed from: e, reason: collision with root package name */
        private final transient int f56320e;

        /* renamed from: f, reason: collision with root package name */
        private final transient int f56321f;

        c(Object[] objArr, int i4, int i5) {
            this.f56319d = objArr;
            this.f56320e = i4;
            this.f56321f = i5;
        }

        @Override // java.util.List
        public Object get(int i4) {
            com.google.common.base.l0.C(i4, this.f56321f);
            Object obj = this.f56319d[(i4 * 2) + this.f56320e];
            Objects.requireNonNull(obj);
            return obj;
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f56321f;
        }
    }

    private r5(@zc.a Object obj, Object[] objArr, int i4) {
        this.f56309g = obj;
        this.f56310h = objArr;
        this.f56311i = i4;
    }

    static <K, V> r5<K, V> I(int i4, Object[] objArr) {
        return J(i4, objArr, null);
    }

    static <K, V> r5<K, V> J(int i4, Object[] objArr, h3.b<K, V> bVar) {
        if (i4 == 0) {
            return (r5) f56307o;
        }
        if (i4 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[1];
            Objects.requireNonNull(obj2);
            b0.a(obj, obj2);
            return new r5<>(null, objArr, 1);
        }
        com.google.common.base.l0.d0(i4, objArr.length >> 1);
        Object L = L(objArr, i4, q3.v(i4), 0);
        if (L instanceof Object[]) {
            Object[] objArr2 = (Object[]) L;
            h3.b.a aVar = (h3.b.a) objArr2[2];
            if (bVar == null) {
                throw aVar.a();
            }
            bVar.f55799e = aVar;
            Object obj3 = objArr2[0];
            int intValue = ((Integer) objArr2[1]).intValue();
            objArr = Arrays.copyOf(objArr, intValue * 2);
            L = obj3;
            i4 = intValue;
        }
        return new r5<>(L, objArr, i4);
    }

    @zc.a
    private static Object L(Object[] objArr, int i4, int i5, int i6) {
        h3.b.a aVar = null;
        if (i4 == 1) {
            Object obj = objArr[i6];
            Objects.requireNonNull(obj);
            Object obj2 = objArr[i6 ^ 1];
            Objects.requireNonNull(obj2);
            b0.a(obj, obj2);
            return null;
        }
        int i7 = i5 - 1;
        int i10 = -1;
        if (i5 <= 128) {
            byte[] bArr = new byte[i5];
            Arrays.fill(bArr, (byte) -1);
            int i11 = 0;
            for (int i12 = 0; i12 < i4; i12++) {
                int i13 = (i12 * 2) + i6;
                int i14 = (i11 * 2) + i6;
                Object obj3 = objArr[i13];
                Objects.requireNonNull(obj3);
                Object obj4 = objArr[i13 ^ 1];
                Objects.requireNonNull(obj4);
                b0.a(obj3, obj4);
                int c5 = x2.c(obj3.hashCode());
                while (true) {
                    int i15 = c5 & i7;
                    int i16 = bArr[i15] & 255;
                    if (i16 == 255) {
                        bArr[i15] = (byte) i14;
                        if (i11 < i12) {
                            objArr[i14] = obj3;
                            objArr[i14 ^ 1] = obj4;
                        }
                        i11++;
                    } else {
                        if (obj3.equals(objArr[i16])) {
                            int i17 = i16 ^ 1;
                            Object obj5 = objArr[i17];
                            Objects.requireNonNull(obj5);
                            aVar = new h3.b.a(obj3, obj4, obj5);
                            objArr[i17] = obj4;
                            break;
                        }
                        c5 = i15 + 1;
                    }
                }
            }
            return i11 == i4 ? bArr : new Object[]{bArr, Integer.valueOf(i11), aVar};
        }
        if (i5 <= 32768) {
            short[] sArr = new short[i5];
            Arrays.fill(sArr, (short) -1);
            int i18 = 0;
            for (int i19 = 0; i19 < i4; i19++) {
                int i20 = (i19 * 2) + i6;
                int i21 = (i18 * 2) + i6;
                Object obj6 = objArr[i20];
                Objects.requireNonNull(obj6);
                Object obj7 = objArr[i20 ^ 1];
                Objects.requireNonNull(obj7);
                b0.a(obj6, obj7);
                int c6 = x2.c(obj6.hashCode());
                while (true) {
                    int i22 = c6 & i7;
                    int i23 = sArr[i22] & kotlin.g2.f75095e;
                    if (i23 == 65535) {
                        sArr[i22] = (short) i21;
                        if (i18 < i19) {
                            objArr[i21] = obj6;
                            objArr[i21 ^ 1] = obj7;
                        }
                        i18++;
                    } else {
                        if (obj6.equals(objArr[i23])) {
                            int i24 = i23 ^ 1;
                            Object obj8 = objArr[i24];
                            Objects.requireNonNull(obj8);
                            aVar = new h3.b.a(obj6, obj7, obj8);
                            objArr[i24] = obj7;
                            break;
                        }
                        c6 = i22 + 1;
                    }
                }
            }
            return i18 == i4 ? sArr : new Object[]{sArr, Integer.valueOf(i18), aVar};
        }
        int[] iArr = new int[i5];
        Arrays.fill(iArr, -1);
        int i25 = 0;
        int i26 = 0;
        while (i25 < i4) {
            int i27 = (i25 * 2) + i6;
            int i28 = (i26 * 2) + i6;
            Object obj9 = objArr[i27];
            Objects.requireNonNull(obj9);
            Object obj10 = objArr[i27 ^ 1];
            Objects.requireNonNull(obj10);
            b0.a(obj9, obj10);
            int c7 = x2.c(obj9.hashCode());
            while (true) {
                int i29 = c7 & i7;
                int i30 = iArr[i29];
                if (i30 == i10) {
                    iArr[i29] = i28;
                    if (i26 < i25) {
                        objArr[i28] = obj9;
                        objArr[i28 ^ 1] = obj10;
                    }
                    i26++;
                } else {
                    if (obj9.equals(objArr[i30])) {
                        int i31 = i30 ^ 1;
                        Object obj11 = objArr[i31];
                        Objects.requireNonNull(obj11);
                        aVar = new h3.b.a(obj9, obj10, obj11);
                        objArr[i31] = obj10;
                        break;
                    }
                    c7 = i29 + 1;
                    i10 = -1;
                }
            }
            i25++;
            i10 = -1;
        }
        return i26 == i4 ? iArr : new Object[]{iArr, Integer.valueOf(i26), aVar};
    }

    @zc.a
    static Object M(Object[] objArr, int i4, int i5, int i6) {
        Object L = L(objArr, i4, i5, i6);
        if (L instanceof Object[]) {
            throw ((h3.b.a) ((Object[]) L)[2]).a();
        }
        return L;
    }

    @zc.a
    static Object N(@zc.a Object obj, Object[] objArr, int i4, int i5, @zc.a Object obj2) {
        if (obj2 == null) {
            return null;
        }
        if (i4 == 1) {
            Object obj3 = objArr[i5];
            Objects.requireNonNull(obj3);
            if (!obj3.equals(obj2)) {
                return null;
            }
            Object obj4 = objArr[i5 ^ 1];
            Objects.requireNonNull(obj4);
            return obj4;
        }
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            int length = bArr.length - 1;
            int c5 = x2.c(obj2.hashCode());
            while (true) {
                int i6 = c5 & length;
                int i7 = bArr[i6] & 255;
                if (i7 == 255) {
                    return null;
                }
                if (obj2.equals(objArr[i7])) {
                    return objArr[i7 ^ 1];
                }
                c5 = i6 + 1;
            }
        } else if (obj instanceof short[]) {
            short[] sArr = (short[]) obj;
            int length2 = sArr.length - 1;
            int c6 = x2.c(obj2.hashCode());
            while (true) {
                int i10 = c6 & length2;
                int i11 = sArr[i10] & kotlin.g2.f75095e;
                if (i11 == 65535) {
                    return null;
                }
                if (obj2.equals(objArr[i11])) {
                    return objArr[i11 ^ 1];
                }
                c6 = i10 + 1;
            }
        } else {
            int[] iArr = (int[]) obj;
            int length3 = iArr.length - 1;
            int c7 = x2.c(obj2.hashCode());
            while (true) {
                int i12 = c7 & length3;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    return null;
                }
                if (obj2.equals(objArr[i13])) {
                    return objArr[i13 ^ 1];
                }
                c7 = i12 + 1;
            }
        }
    }

    @Override // com.google.common.collect.h3, java.util.Map
    @zc.a
    public V get(@zc.a Object obj) {
        V v4 = (V) N(this.f56309g, this.f56310h, this.f56311i, 0, obj);
        if (v4 == null) {
            return null;
        }
        return v4;
    }

    @Override // com.google.common.collect.h3
    q3<Map.Entry<K, V>> j() {
        return new a(this, this.f56310h, 0, this.f56311i);
    }

    @Override // com.google.common.collect.h3
    q3<K> k() {
        return new b(this, new c(this.f56310h, 0, this.f56311i));
    }

    @Override // com.google.common.collect.h3
    b3<V> l() {
        return new c(this.f56310h, 1, this.f56311i);
    }

    @Override // com.google.common.collect.h3
    boolean p() {
        return false;
    }

    @Override // java.util.Map
    public int size() {
        return this.f56311i;
    }
}
