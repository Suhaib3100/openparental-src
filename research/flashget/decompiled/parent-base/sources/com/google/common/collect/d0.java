package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: CompactHashMap.java */
@w0
@d9.c
/* loaded from: classes6.dex */
class d0<K, V> extends AbstractMap<K, V> implements Serializable {

    /* renamed from: k, reason: collision with root package name */
    private static final Object f55508k = new Object();

    /* renamed from: l, reason: collision with root package name */
    @d9.d
    static final double f55509l = 0.001d;

    /* renamed from: m, reason: collision with root package name */
    private static final int f55510m = 9;

    /* renamed from: b, reason: collision with root package name */
    @zc.a
    private transient Object f55511b;

    /* renamed from: c, reason: collision with root package name */
    @d9.d
    @zc.a
    transient int[] f55512c;

    /* renamed from: d, reason: collision with root package name */
    @d9.d
    @zc.a
    transient Object[] f55513d;

    /* renamed from: e, reason: collision with root package name */
    @d9.d
    @zc.a
    transient Object[] f55514e;

    /* renamed from: f, reason: collision with root package name */
    private transient int f55515f;

    /* renamed from: g, reason: collision with root package name */
    private transient int f55516g;

    /* renamed from: h, reason: collision with root package name */
    @zc.a
    private transient Set<K> f55517h;

    /* renamed from: i, reason: collision with root package name */
    @zc.a
    private transient Set<Map.Entry<K, V>> f55518i;

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    private transient Collection<V> f55519j;

    /* compiled from: CompactHashMap.java */
    class a extends d0<K, V>.e<K> {
        a() {
            super(d0.this, null);
        }

        @Override // com.google.common.collect.d0.e
        @f5
        K b(int i4) {
            return (K) d0.c(d0.this, i4);
        }
    }

    /* compiled from: CompactHashMap.java */
    class b extends d0<K, V>.e<Map.Entry<K, V>> {
        b() {
            super(d0.this, null);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.d0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> b(int i4) {
            return new g(i4);
        }
    }

    /* compiled from: CompactHashMap.java */
    class c extends d0<K, V>.e<V> {
        c() {
            super(d0.this, null);
        }

        @Override // com.google.common.collect.d0.e
        @f5
        V b(int i4) {
            return (V) d0.l(d0.this, i4);
        }
    }

    /* compiled from: CompactHashMap.java */
    class d extends AbstractSet<Map.Entry<K, V>> {
        d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            Map<K, V> A = d0.this.A();
            if (A != null) {
                return A.entrySet().contains(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int I = d0.this.I(entry.getKey());
            return I != -1 && com.google.common.base.f0.a(d0.l(d0.this, I), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return d0.this.C();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            Map<K, V> A = d0.this.A();
            if (A != null) {
                return A.entrySet().remove(obj);
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            if (d0.this.P()) {
                return false;
            }
            int F = d0.this.F();
            int f4 = f0.f(entry.getKey(), entry.getValue(), F, d0.n(d0.this), d0.this.S(), d0.this.T(), d0.this.V());
            if (f4 == -1) {
                return false;
            }
            d0.this.O(f4, F);
            d0.f(d0.this);
            d0.this.H();
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d0.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    class f extends AbstractSet<K> {
        f() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            return d0.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return d0.this.N();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(@zc.a Object obj) {
            Map<K, V> A = d0.this.A();
            return A != null ? A.keySet().remove(obj) : d0.this.R(obj) != d0.f55508k;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return d0.this.size();
        }
    }

    /* compiled from: CompactHashMap.java */
    final class g extends com.google.common.collect.g<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        private final K f55529b;

        /* renamed from: c, reason: collision with root package name */
        private int f55530c;

        g(int i4) {
            this.f55529b = (K) d0.c(d0.this, i4);
            this.f55530c = i4;
        }

        private void a() {
            int i4 = this.f55530c;
            if (i4 == -1 || i4 >= d0.this.size() || !com.google.common.base.f0.a(this.f55529b, d0.c(d0.this, this.f55530c))) {
                this.f55530c = d0.this.I(this.f55529b);
            }
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public K getKey() {
            return this.f55529b;
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V getValue() {
            Map<K, V> A = d0.this.A();
            if (A != null) {
                return A.get(this.f55529b);
            }
            a();
            int i4 = this.f55530c;
            if (i4 == -1) {
                return null;
            }
            return (V) d0.l(d0.this, i4);
        }

        @Override // com.google.common.collect.g, java.util.Map.Entry
        @f5
        public V setValue(@f5 V v4) {
            Map<K, V> A = d0.this.A();
            if (A != null) {
                return A.put(this.f55529b, v4);
            }
            a();
            int i4 = this.f55530c;
            if (i4 == -1) {
                d0.this.put(this.f55529b, v4);
                return null;
            }
            V v5 = (V) d0.l(d0.this, i4);
            d0.this.c0(this.f55530c, v4);
            return v5;
        }
    }

    /* compiled from: CompactHashMap.java */
    class h extends AbstractCollection<V> {
        h() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            d0.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return d0.this.f0();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return d0.this.size();
        }
    }

    d0() {
        J(3);
    }

    private int B(int i4) {
        return S()[i4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int F() {
        return (1 << (this.f55515f & 31)) - 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int I(@zc.a Object obj) {
        if (P()) {
            return -1;
        }
        int d5 = x2.d(obj);
        int F = F();
        Object obj2 = this.f55511b;
        Objects.requireNonNull(obj2);
        int h4 = f0.h(obj2, d5 & F);
        if (h4 == 0) {
            return -1;
        }
        int i4 = ~F;
        int i5 = d5 & i4;
        do {
            int i6 = h4 - 1;
            int i7 = S()[i6];
            if ((i7 & i4) == i5 && com.google.common.base.f0.a(obj, T()[i6])) {
                return i6;
            }
            h4 = i7 & F;
        } while (h4 != 0);
        return -1;
    }

    private K M(int i4) {
        return (K) T()[i4];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void Q(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(com.google.android.gms.internal.location.a.a(25, ProtectedSandApp.s("\uf480"), readInt));
        }
        J(readInt);
        for (int i4 = 0; i4 < readInt; i4++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object R(@zc.a Object obj) {
        if (P()) {
            return f55508k;
        }
        int F = F();
        Object obj2 = this.f55511b;
        Objects.requireNonNull(obj2);
        int f4 = f0.f(obj, null, F, obj2, S(), T(), null);
        if (f4 == -1) {
            return f55508k;
        }
        Object obj3 = V()[f4];
        O(f4, F);
        this.f55516g--;
        H();
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int[] S() {
        int[] iArr = this.f55512c;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] T() {
        Object[] objArr = this.f55513d;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private Object U() {
        Object obj = this.f55511b;
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object[] V() {
        Object[] objArr = this.f55514e;
        Objects.requireNonNull(objArr);
        return objArr;
    }

    private void X(int i4) {
        int min;
        int length = S().length;
        if (i4 <= length || (min = Math.min(kotlinx.coroutines.internal.a0.f80730j, (Math.max(1, length >>> 1) + length) | 1)) == length) {
            return;
        }
        W(min);
    }

    @f9.a
    private int Y(int i4, int i5, int i6, int i7) {
        Object a5 = f0.a(i5);
        int i10 = i5 - 1;
        if (i7 != 0) {
            f0.i(a5, i6 & i10, i7 + 1);
        }
        Object obj = this.f55511b;
        Objects.requireNonNull(obj);
        int[] S = S();
        for (int i11 = 0; i11 <= i4; i11++) {
            int h4 = f0.h(obj, i11);
            while (h4 != 0) {
                int i12 = h4 - 1;
                int i13 = S[i12];
                int i14 = ((~i4) & i13) | i11;
                int i15 = i14 & i10;
                int h5 = f0.h(a5, i15);
                f0.i(a5, i15, h4);
                S[i12] = f0.d(i14, h5, i10);
                h4 = i13 & i4;
            }
        }
        this.f55511b = a5;
        a0(i10);
        return i10;
    }

    private void Z(int i4, int i5) {
        S()[i4] = i5;
    }

    private void a0(int i4) {
        this.f55515f = f0.d(this.f55515f, 32 - Integer.numberOfLeadingZeros(i4), 31);
    }

    private void b0(int i4, K k4) {
        T()[i4] = k4;
    }

    static Object c(d0 d0Var, int i4) {
        return d0Var.T()[i4];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0(int i4, V v4) {
        V()[i4] = v4;
    }

    private V e0(int i4) {
        return (V) V()[i4];
    }

    static /* synthetic */ int f(d0 d0Var) {
        int i4 = d0Var.f55516g;
        d0Var.f55516g = i4 - 1;
        return i4;
    }

    private void g0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> C = C();
        while (C.hasNext()) {
            Map.Entry<K, V> next = C.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    static Object l(d0 d0Var, int i4) {
        return d0Var.V()[i4];
    }

    static Object n(d0 d0Var) {
        Object obj = d0Var.f55511b;
        Objects.requireNonNull(obj);
        return obj;
    }

    public static <K, V> d0<K, V> u() {
        return new d0<>();
    }

    public static <K, V> d0<K, V> z(int i4) {
        return new d0<>(i4);
    }

    @d9.d
    @zc.a
    Map<K, V> A() {
        Object obj = this.f55511b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    Iterator<Map.Entry<K, V>> C() {
        Map<K, V> A = A();
        return A != null ? A.entrySet().iterator() : new b();
    }

    int D() {
        return isEmpty() ? -1 : 0;
    }

    int E(int i4) {
        int i5 = i4 + 1;
        if (i5 < this.f55516g) {
            return i5;
        }
        return -1;
    }

    void H() {
        this.f55515f += 32;
    }

    void J(int i4) {
        com.google.common.base.l0.e(i4 >= 0, ProtectedSandApp.s("\uf481"));
        this.f55515f = com.google.common.primitives.l.g(i4, 1, kotlinx.coroutines.internal.a0.f80730j);
    }

    void L(int i4, @f5 K k4, @f5 V v4, int i5, int i6) {
        Z(i4, f0.d(i5, 0, i6));
        b0(i4, k4);
        c0(i4, v4);
    }

    Iterator<K> N() {
        Map<K, V> A = A();
        return A != null ? A.keySet().iterator() : new a();
    }

    void O(int i4, int i5) {
        Object obj = this.f55511b;
        Objects.requireNonNull(obj);
        int[] S = S();
        Object[] T = T();
        Object[] V = V();
        int size = size();
        int i6 = size - 1;
        if (i4 >= i6) {
            T[i4] = null;
            V[i4] = null;
            S[i4] = 0;
            return;
        }
        Object obj2 = T[i6];
        T[i4] = obj2;
        V[i4] = V[i6];
        T[i6] = null;
        V[i6] = null;
        S[i4] = S[i6];
        S[i6] = 0;
        int d5 = x2.d(obj2) & i5;
        int h4 = f0.h(obj, d5);
        if (h4 == size) {
            f0.i(obj, d5, i4 + 1);
            return;
        }
        while (true) {
            int i7 = h4 - 1;
            int i10 = S[i7];
            int i11 = i10 & i5;
            if (i11 == size) {
                S[i7] = f0.d(i10, i4 + 1, i5);
                return;
            }
            h4 = i11;
        }
    }

    @d9.d
    boolean P() {
        return this.f55511b == null;
    }

    void W(int i4) {
        this.f55512c = Arrays.copyOf(S(), i4);
        this.f55513d = Arrays.copyOf(T(), i4);
        this.f55514e = Arrays.copyOf(V(), i4);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (P()) {
            return;
        }
        H();
        Map<K, V> A = A();
        if (A != null) {
            this.f55515f = com.google.common.primitives.l.g(size(), 3, kotlinx.coroutines.internal.a0.f80730j);
            A.clear();
            this.f55511b = null;
            this.f55516g = 0;
            return;
        }
        Arrays.fill(T(), 0, this.f55516g, (Object) null);
        Arrays.fill(V(), 0, this.f55516g, (Object) null);
        Object obj = this.f55511b;
        Objects.requireNonNull(obj);
        f0.g(obj);
        Arrays.fill(S(), 0, this.f55516g, 0);
        this.f55516g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(@zc.a Object obj) {
        Map<K, V> A = A();
        return A != null ? A.containsKey(obj) : I(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsValue(@zc.a Object obj) {
        Map<K, V> A = A();
        if (A != null) {
            return A.containsValue(obj);
        }
        for (int i4 = 0; i4 < this.f55516g; i4++) {
            if (com.google.common.base.f0.a(obj, V()[i4])) {
                return true;
            }
        }
        return false;
    }

    public void d0() {
        if (P()) {
            return;
        }
        Map<K, V> A = A();
        if (A != null) {
            Map<K, V> w4 = w(size());
            w4.putAll(A);
            this.f55511b = w4;
            return;
        }
        int i4 = this.f55516g;
        if (i4 < S().length) {
            W(i4);
        }
        int j4 = f0.j(i4);
        int F = F();
        if (j4 < F) {
            Y(F, j4, 0, 0);
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f55518i;
        if (set != null) {
            return set;
        }
        Set<Map.Entry<K, V>> v4 = v();
        this.f55518i = v4;
        return v4;
    }

    Iterator<V> f0() {
        Map<K, V> A = A();
        return A != null ? A.values().iterator() : new c();
    }

    @Override // java.util.AbstractMap, java.util.Map
    @zc.a
    public V get(@zc.a Object obj) {
        Map<K, V> A = A();
        if (A != null) {
            return A.get(obj);
        }
        int I = I(obj);
        if (I == -1) {
            return null;
        }
        p(I);
        return (V) V()[I];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f55517h;
        if (set != null) {
            return set;
        }
        Set<K> x4 = x();
        this.f55517h = x4;
        return x4;
    }

    void p(int i4) {
    }

    @Override // java.util.AbstractMap, java.util.Map
    @zc.a
    @f9.a
    public V put(@f5 K k4, @f5 V v4) {
        int Y;
        int i4;
        if (P()) {
            r();
        }
        Map<K, V> A = A();
        if (A != null) {
            return A.put(k4, v4);
        }
        int[] S = S();
        Object[] T = T();
        Object[] V = V();
        int i5 = this.f55516g;
        int i6 = i5 + 1;
        int d5 = x2.d(k4);
        int F = F();
        int i7 = d5 & F;
        Object obj = this.f55511b;
        Objects.requireNonNull(obj);
        int h4 = f0.h(obj, i7);
        if (h4 != 0) {
            int i10 = ~F;
            int i11 = d5 & i10;
            int i12 = 0;
            while (true) {
                int i13 = h4 - 1;
                int i14 = S[i13];
                if ((i14 & i10) == i11 && com.google.common.base.f0.a(k4, T[i13])) {
                    V v5 = (V) V[i13];
                    V[i13] = v4;
                    p(i13);
                    return v5;
                }
                int i15 = i14 & F;
                i12++;
                if (i15 != 0) {
                    h4 = i15;
                } else {
                    if (i12 >= 9) {
                        return t().put(k4, v4);
                    }
                    if (i6 > F) {
                        Y = Y(F, f0.e(F), d5, i5);
                    } else {
                        S[i13] = f0.d(i14, i6, F);
                    }
                }
            }
            i4 = F;
        } else if (i6 > F) {
            Y = Y(F, f0.e(F), d5, i5);
            i4 = Y;
        } else {
            Object obj2 = this.f55511b;
            Objects.requireNonNull(obj2);
            f0.i(obj2, i7, i6);
            i4 = F;
        }
        X(i6);
        L(i5, k4, v4, d5, i4);
        this.f55516g = i6;
        H();
        return null;
    }

    int q(int i4, int i5) {
        return i4 - 1;
    }

    @f9.a
    int r() {
        com.google.common.base.l0.h0(P(), ProtectedSandApp.s("\uf482"));
        int i4 = this.f55515f;
        int j4 = f0.j(i4);
        this.f55511b = f0.a(j4);
        a0(j4 - 1);
        this.f55512c = new int[i4];
        this.f55513d = new Object[i4];
        this.f55514e = new Object[i4];
        return i4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    @zc.a
    @f9.a
    public V remove(@zc.a Object obj) {
        Map<K, V> A = A();
        if (A != null) {
            return A.remove(obj);
        }
        V v4 = (V) R(obj);
        if (v4 == f55508k) {
            return null;
        }
        return v4;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        Map<K, V> A = A();
        return A != null ? A.size() : this.f55516g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.d
    @f9.a
    Map<K, V> t() {
        Map<K, V> w4 = w(F() + 1);
        int D = D();
        while (D >= 0) {
            w4.put(T()[D], V()[D]);
            D = E(D);
        }
        this.f55511b = w4;
        this.f55512c = null;
        this.f55513d = null;
        this.f55514e = null;
        H();
        return w4;
    }

    Set<Map.Entry<K, V>> v() {
        return new d();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Collection<V> values() {
        Collection<V> collection = this.f55519j;
        if (collection != null) {
            return collection;
        }
        Collection<V> y4 = y();
        this.f55519j = y4;
        return y4;
    }

    Map<K, V> w(int i4) {
        return new LinkedHashMap(i4, 1.0f);
    }

    Set<K> x() {
        return new f();
    }

    Collection<V> y() {
        return new h();
    }

    d0(int i4) {
        J(i4);
    }

    /* compiled from: CompactHashMap.java */
    private abstract class e<T> implements Iterator<T> {

        /* renamed from: b, reason: collision with root package name */
        int f55524b;

        /* renamed from: c, reason: collision with root package name */
        int f55525c;

        /* renamed from: d, reason: collision with root package name */
        int f55526d;

        private e() {
            this.f55524b = d0.this.f55515f;
            this.f55525c = d0.this.D();
            this.f55526d = -1;
        }

        private void a() {
            if (d0.this.f55515f != this.f55524b) {
                throw new ConcurrentModificationException();
            }
        }

        @f5
        abstract T b(int i4);

        void c() {
            this.f55524b += 32;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55525c >= 0;
        }

        @Override // java.util.Iterator
        @f5
        public T next() {
            a();
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            int i4 = this.f55525c;
            this.f55526d = i4;
            T b5 = b(i4);
            this.f55525c = d0.this.E(this.f55525c);
            return b5;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            b0.e(this.f55526d >= 0);
            c();
            d0 d0Var = d0.this;
            d0Var.remove(d0.c(d0Var, this.f55526d));
            this.f55525c = d0.this.q(this.f55525c, this.f55526d);
            this.f55526d = -1;
        }

        /* synthetic */ e(d0 d0Var, a aVar) {
            this();
        }
    }
}
