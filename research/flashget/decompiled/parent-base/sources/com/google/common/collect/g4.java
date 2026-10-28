package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d6;
import com.google.common.collect.p4;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;

/* compiled from: LinkedHashMultimap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public final class g4<K, V> extends h4<K, V> {

    /* renamed from: m, reason: collision with root package name */
    private static final int f55749m = 16;

    /* renamed from: n, reason: collision with root package name */
    private static final int f55750n = 2;

    /* renamed from: o, reason: collision with root package name */
    @d9.d
    static final double f55751o = 1.0d;

    /* renamed from: p, reason: collision with root package name */
    @d9.c
    private static final long f55752p = 1;

    /* renamed from: k, reason: collision with root package name */
    @d9.d
    transient int f55753k;

    /* renamed from: l, reason: collision with root package name */
    private transient b<K, V> f55754l;

    /* compiled from: LinkedHashMultimap.java */
    class a implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b, reason: collision with root package name */
        b<K, V> f55755b;

        /* renamed from: c, reason: collision with root package name */
        @zc.a
        b<K, V> f55756c;

        a() {
            b<K, V> bVar = g4.this.f55754l.f55763j;
            Objects.requireNonNull(bVar);
            this.f55755b = bVar;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b<K, V> bVar = this.f55755b;
            this.f55756c = bVar;
            b<K, V> bVar2 = bVar.f55763j;
            Objects.requireNonNull(bVar2);
            this.f55755b = bVar2;
            return bVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55755b != g4.this.f55754l;
        }

        @Override // java.util.Iterator
        public void remove() {
            com.google.common.base.l0.h0(this.f55756c != null, ProtectedSandApp.s("\uf4cb"));
            g4 g4Var = g4.this;
            b<K, V> bVar = this.f55756c;
            g4Var.remove(bVar.f55435b, bVar.f55436c);
            this.f55756c = null;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    @d9.d
    static final class b<K, V> extends c3<K, V> implements d<K, V> {

        /* renamed from: e, reason: collision with root package name */
        final int f55758e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        b<K, V> f55759f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        d<K, V> f55760g;

        /* renamed from: h, reason: collision with root package name */
        @zc.a
        d<K, V> f55761h;

        /* renamed from: i, reason: collision with root package name */
        @zc.a
        b<K, V> f55762i;

        /* renamed from: j, reason: collision with root package name */
        @zc.a
        b<K, V> f55763j;

        b(@f5 K k4, @f5 V v4, int i4, @zc.a b<K, V> bVar) {
            super(k4, v4);
            this.f55758e = i4;
            this.f55759f = bVar;
        }

        static <K, V> b<K, V> g() {
            return new b<>(null, null, 0, null);
        }

        public b<K, V> a() {
            b<K, V> bVar = this.f55762i;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        @Override // com.google.common.collect.g4.d
        public d<K, V> b() {
            d<K, V> dVar = this.f55760g;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        @Override // com.google.common.collect.g4.d
        public d<K, V> c() {
            d<K, V> dVar = this.f55761h;
            Objects.requireNonNull(dVar);
            return dVar;
        }

        public b<K, V> d() {
            b<K, V> bVar = this.f55763j;
            Objects.requireNonNull(bVar);
            return bVar;
        }

        boolean e(@zc.a Object obj, int i4) {
            return this.f55758e == i4 && com.google.common.base.f0.a(this.f55436c, obj);
        }

        @Override // com.google.common.collect.g4.d
        public void f(d<K, V> dVar) {
            this.f55761h = dVar;
        }

        @Override // com.google.common.collect.g4.d
        public void h(d<K, V> dVar) {
            this.f55760g = dVar;
        }

        public void i(b<K, V> bVar) {
            this.f55762i = bVar;
        }

        public void j(b<K, V> bVar) {
            this.f55763j = bVar;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    @d9.d
    final class c extends d6.k<V> implements d<K, V> {

        /* renamed from: b, reason: collision with root package name */
        @f5
        private final K f55764b;

        /* renamed from: c, reason: collision with root package name */
        @d9.d
        b<K, V>[] f55765c;

        /* renamed from: d, reason: collision with root package name */
        private int f55766d = 0;

        /* renamed from: e, reason: collision with root package name */
        private int f55767e = 0;

        /* renamed from: f, reason: collision with root package name */
        private d<K, V> f55768f = this;

        /* renamed from: g, reason: collision with root package name */
        private d<K, V> f55769g = this;

        /* compiled from: LinkedHashMultimap.java */
        class a implements Iterator<V> {

            /* renamed from: b, reason: collision with root package name */
            d<K, V> f55771b;

            /* renamed from: c, reason: collision with root package name */
            @zc.a
            b<K, V> f55772c;

            /* renamed from: d, reason: collision with root package name */
            int f55773d;

            a() {
                this.f55771b = c.this.f55768f;
                this.f55773d = c.this.f55767e;
            }

            private void a() {
                if (c.this.f55767e != this.f55773d) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f55771b != c.this;
            }

            @Override // java.util.Iterator
            @f5
            public V next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                b<K, V> bVar = (b) this.f55771b;
                V v4 = bVar.f55436c;
                this.f55772c = bVar;
                this.f55771b = bVar.c();
                return v4;
            }

            @Override // java.util.Iterator
            public void remove() {
                a();
                com.google.common.base.l0.h0(this.f55772c != null, ProtectedSandApp.s("\uf4cc"));
                c.this.remove(this.f55772c.f55436c);
                this.f55773d = c.this.f55767e;
                this.f55772c = null;
            }
        }

        c(@f5 K k4, int i4) {
            this.f55764b = k4;
            this.f55765c = new b[x2.a(i4, 1.0d)];
        }

        private int l() {
            return this.f55765c.length - 1;
        }

        private void m() {
            if (x2.b(this.f55766d, this.f55765c.length, 1.0d)) {
                int length = this.f55765c.length * 2;
                b<K, V>[] bVarArr = new b[length];
                this.f55765c = bVarArr;
                int i4 = length - 1;
                for (d<K, V> dVar = this.f55768f; dVar != this; dVar = dVar.c()) {
                    b<K, V> bVar = (b) dVar;
                    int i5 = bVar.f55758e & i4;
                    bVar.f55759f = bVarArr[i5];
                    bVarArr[i5] = bVar;
                }
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(@f5 V v4) {
            int d5 = x2.d(v4);
            int l4 = l() & d5;
            b<K, V> bVar = this.f55765c[l4];
            for (b<K, V> bVar2 = bVar; bVar2 != null; bVar2 = bVar2.f55759f) {
                if (bVar2.e(v4, d5)) {
                    return false;
                }
            }
            b<K, V> bVar3 = new b<>(this.f55764b, v4, d5, bVar);
            g4.U(this.f55769g, bVar3);
            g4.U(bVar3, this);
            b<K, V> bVar4 = g4.this.f55754l.f55762i;
            Objects.requireNonNull(bVar4);
            bVar4.f55763j = bVar3;
            bVar3.f55762i = bVar4;
            b<K, V> bVar5 = g4.this.f55754l;
            bVar3.f55763j = bVar5;
            bVar5.f55762i = bVar3;
            this.f55765c[l4] = bVar3;
            this.f55766d++;
            this.f55767e++;
            m();
            return true;
        }

        @Override // com.google.common.collect.g4.d
        public d<K, V> b() {
            return this.f55769g;
        }

        @Override // com.google.common.collect.g4.d
        public d<K, V> c() {
            return this.f55768f;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Arrays.fill(this.f55765c, (Object) null);
            this.f55766d = 0;
            for (d<K, V> dVar = this.f55768f; dVar != this; dVar = dVar.c()) {
                g4.Q((b) dVar);
            }
            g4.U(this, this);
            this.f55767e++;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@zc.a Object obj) {
            int d5 = x2.d(obj);
            for (b<K, V> bVar = this.f55765c[l() & d5]; bVar != null; bVar = bVar.f55759f) {
                if (bVar.e(obj, d5)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.g4.d
        public void f(d<K, V> dVar) {
            this.f55768f = dVar;
        }

        @Override // com.google.common.collect.g4.d
        public void h(d<K, V> dVar) {
            this.f55769g = dVar;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return new a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @f9.a
        public boolean remove(@zc.a Object obj) {
            int d5 = x2.d(obj);
            int l4 = l() & d5;
            b<K, V> bVar = null;
            for (b<K, V> bVar2 = this.f55765c[l4]; bVar2 != null; bVar2 = bVar2.f55759f) {
                if (bVar2.e(obj, d5)) {
                    if (bVar == null) {
                        this.f55765c[l4] = bVar2.f55759f;
                    } else {
                        bVar.f55759f = bVar2.f55759f;
                    }
                    g4.R(bVar2);
                    g4.Q(bVar2);
                    this.f55766d--;
                    this.f55767e++;
                    return true;
                }
                bVar = bVar2;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f55766d;
        }
    }

    /* compiled from: LinkedHashMultimap.java */
    private interface d<K, V> {
        d<K, V> b();

        d<K, V> c();

        void f(d<K, V> dVar);

        void h(d<K, V> dVar);
    }

    private g4(int i4, int i5) {
        super(g0.i0(i4));
        this.f55753k = 2;
        b0.b(i5, ProtectedSandApp.s("\uf4cd"));
        this.f55753k = i5;
        b<K, V> g4 = b.g();
        this.f55754l = g4;
        g4.f55763j = g4;
        g4.f55762i = g4;
    }

    static void K(b bVar, b bVar2) {
        bVar.f55763j = bVar2;
        bVar2.f55762i = bVar;
    }

    public static <K, V> g4<K, V> N() {
        return new g4<>(16, 2);
    }

    public static <K, V> g4<K, V> O(int i4, int i5) {
        return new g4<>(p4.o(i4), p4.o(i5));
    }

    public static <K, V> g4<K, V> P(r4<? extends K, ? extends V> r4Var) {
        g4<K, V> O = O(r4Var.keySet().size(), 2);
        super.n0(r4Var);
        return O;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void Q(b<K, V> bVar) {
        b<K, V> bVar2 = bVar.f55762i;
        Objects.requireNonNull(bVar2);
        b<K, V> bVar3 = bVar.f55763j;
        Objects.requireNonNull(bVar3);
        bVar2.f55763j = bVar3;
        bVar3.f55762i = bVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void R(d<K, V> dVar) {
        U(dVar.b(), dVar.c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.c
    private void S(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        b<K, V> g4 = b.g();
        this.f55754l = g4;
        g4.f55763j = g4;
        g4.f55762i = g4;
        this.f55753k = 2;
        int readInt = objectInputStream.readInt();
        g0 i02 = g0.i0(12);
        for (int i4 = 0; i4 < readInt; i4++) {
            Object readObject = objectInputStream.readObject();
            i02.put(readObject, v(readObject));
        }
        int readInt2 = objectInputStream.readInt();
        for (int i5 = 0; i5 < readInt2; i5++) {
            Object readObject2 = objectInputStream.readObject();
            Object readObject3 = objectInputStream.readObject();
            Collection collection = (Collection) i02.get(readObject2);
            Objects.requireNonNull(collection);
            collection.add(readObject3);
        }
        C(i02);
    }

    private static <K, V> void T(b<K, V> bVar, b<K, V> bVar2) {
        bVar.f55763j = bVar2;
        bVar2.f55762i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <K, V> void U(d<K, V> dVar, d<K, V> dVar2) {
        dVar.f(dVar2);
        dVar2.h(dVar);
    }

    @d9.c
    private void V(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(super.keySet().size());
        Iterator<K> it = super.keySet().iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
        objectOutputStream.writeInt(super.size());
        for (Map.Entry<K, V> entry : super.t()) {
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m
    /* renamed from: G */
    public Set<V> u() {
        return h0.e0(this.f55753k);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean T2(@zc.a Object obj, @zc.a Object obj2) {
        return super.T2(obj, obj2);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Set b(@zc.a Object obj) {
        return super.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public Collection c(@f5 Object obj, Iterable iterable) {
        return super.c((g4<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4
    public void clear() {
        super.clear();
        b<K, V> bVar = this.f55754l;
        bVar.f55763j = bVar;
        bVar.f55762i = bVar;
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean containsKey(@zc.a Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean containsValue(@zc.a Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.r4
    public boolean equals(@zc.a Object obj) {
        return t4.g(this, obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Map f() {
        return super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public /* bridge */ /* synthetic */ Set v(@f5 Object obj) {
        return super.v((g4<K, V>) obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: h */
    public Collection t() {
        return super.t();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    Iterator<Map.Entry<K, V>> j() {
        return new a();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    Iterator<V> k() {
        return new p4.f(new a());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean k1(@f5 Object obj, Iterable iterable) {
        return super.k1(obj, iterable);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public Set<K> keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ u4 keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean n0(r4 r4Var) {
        return super.n0(r4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean put(@f5 Object obj, @f5 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    Collection u() {
        return h0.e0(this.f55753k);
    }

    @Override // com.google.common.collect.e
    Collection<V> v(@f5 K k4) {
        return new c(k4, this.f55753k);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public Set<V> c(@f5 K k4, Iterable<? extends V> iterable) {
        return super.c((g4<K, V>) k4, (Iterable) iterable);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: h */
    public Set<Map.Entry<K, V>> t() {
        return super.t();
    }
}
