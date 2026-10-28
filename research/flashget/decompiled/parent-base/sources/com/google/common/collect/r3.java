package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.b6;
import com.google.common.collect.h3;
import com.google.common.collect.l3;
import com.google.common.collect.q3;
import com.google.common.collect.w3;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ImmutableSetMultimap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public class r3<K, V> extends l3<K, V> implements c6<K, V> {

    /* renamed from: m, reason: collision with root package name */
    @d9.c
    private static final long f56296m = 0;

    /* renamed from: j, reason: collision with root package name */
    private final transient q3<V> f56297j;

    /* renamed from: k, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient r3<V, K> f56298k;

    /* renamed from: l, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient q3<Map.Entry<K, V>> f56299l;

    /* compiled from: ImmutableSetMultimap.java */
    public static final class a<K, V> extends l3.c<K, V> {
        @Override // com.google.common.collect.l3.c
        @f9.a
        l3.c b(l3.c cVar) {
            super.b(cVar);
            return this;
        }

        @Override // com.google.common.collect.l3.c
        Collection<V> c() {
            return e0.j();
        }

        @Override // com.google.common.collect.l3.c
        @f9.a
        public l3.c d(Comparator comparator) {
            super.d(comparator);
            return this;
        }

        @Override // com.google.common.collect.l3.c
        @f9.a
        public l3.c e(Comparator comparator) {
            super.e(comparator);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.l3.c
        @f9.a
        public l3.c f(Object obj, Object obj2) {
            super.f(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.l3.c
        @f9.a
        public l3.c g(Map.Entry entry) {
            super.g(entry);
            return this;
        }

        @Override // com.google.common.collect.l3.c
        @d9.a
        @f9.a
        public l3.c i(Iterable iterable) {
            super.i(iterable);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.l3.c
        @f9.a
        public l3.c j(Object obj, Iterable iterable) {
            super.j(obj, iterable);
            return this;
        }

        @Override // com.google.common.collect.l3.c
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public r3<K, V> a() {
            Collection entrySet = this.f55902a.entrySet();
            Comparator<? super K> comparator = this.f55903b;
            if (comparator != null) {
                entrySet = e5.u(comparator).t0().B(entrySet);
            }
            return r3.Q(entrySet, this.f55904c);
        }

        @f9.a
        a<K, V> m(l3.c<K, V> cVar) {
            super.b(cVar);
            return this;
        }

        @f9.a
        public a<K, V> n(Comparator<? super K> comparator) {
            super.d(comparator);
            return this;
        }

        @f9.a
        public a<K, V> o(Comparator<? super V> comparator) {
            super.e(comparator);
            return this;
        }

        @f9.a
        public a<K, V> p(K k4, V v4) {
            super.f(k4, v4);
            return this;
        }

        @f9.a
        public a<K, V> q(Map.Entry<? extends K, ? extends V> entry) {
            super.g(entry);
            return this;
        }

        @Override // com.google.common.collect.l3.c
        @f9.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public a<K, V> h(r4<? extends K, ? extends V> r4Var) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : r4Var.f().entrySet()) {
                super.j(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @d9.a
        @f9.a
        public a<K, V> s(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.i(iterable);
            return this;
        }

        @f9.a
        public a<K, V> t(K k4, Iterable<? extends V> iterable) {
            super.j(k4, iterable);
            return this;
        }

        @Override // com.google.common.collect.l3.c
        @f9.a
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public a<K, V> k(K k4, V... vArr) {
            super.j(k4, Arrays.asList(vArr));
            return this;
        }
    }

    /* compiled from: ImmutableSetMultimap.java */
    private static final class b<K, V> extends q3<Map.Entry<K, V>> {

        /* renamed from: g, reason: collision with root package name */
        @ma.i
        private final transient r3<K, V> f56300g;

        b(r3<K, V> r3Var) {
            this.f56300g = r3Var;
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f56300g.T2(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f56300g.j();
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return false;
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3
        /* renamed from: l */
        public e7<Map.Entry<K, V>> iterator() {
            return this.f56300g.j();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f56300g.size();
        }
    }

    /* compiled from: ImmutableSetMultimap.java */
    @d9.c
    private static final class c {

        /* renamed from: a, reason: collision with root package name */
        static final b6.b<r3> f56301a = b6.a(r3.class, ProtectedSandApp.s("\uf536"));

        private c() {
        }
    }

    r3(h3<K, q3<V>> h3Var, int i4, @zc.a Comparator<? super V> comparator) {
        super(h3Var, i4);
        this.f56297j = O(comparator);
    }

    public static <K, V> a<K, V> K() {
        return new a<>();
    }

    public static <K, V> r3<K, V> L(r4<? extends K, ? extends V> r4Var) {
        return M(r4Var, null);
    }

    private static <K, V> r3<K, V> M(r4<? extends K, ? extends V> r4Var, @zc.a Comparator<? super V> comparator) {
        r4Var.getClass();
        if (r4Var.isEmpty() && comparator == null) {
            return z0.f56671n;
        }
        if (r4Var instanceof r3) {
            r3<K, V> r3Var = (r3) r4Var;
            if (!r3Var.x()) {
                return r3Var;
            }
        }
        return Q(r4Var.f().entrySet(), comparator);
    }

    @d9.a
    public static <K, V> r3<K, V> N(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().s(iterable).a();
    }

    private static <V> q3<V> O(@zc.a Comparator<? super V> comparator) {
        return comparator == null ? q3.I() : w3.r0(comparator);
    }

    static <K, V> r3<K, V> Q(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @zc.a Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return z0.f56671n;
        }
        h3.b bVar = new h3.b(collection.size());
        int i4 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            q3 d02 = d0(comparator, entry.getValue());
            if (!d02.isEmpty()) {
                bVar.i(key, d02);
                i4 = d02.size() + i4;
            }
        }
        return new r3<>(bVar.d(), i4, comparator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r3<V, K> T() {
        a aVar = new a();
        e7 it = h().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.p(entry.getValue(), entry.getKey());
        }
        r3<V, K> a5 = aVar.a();
        a5.f56298k = this;
        return a5;
    }

    public static <K, V> r3<K, V> U() {
        return z0.f56671n;
    }

    public static <K, V> r3<K, V> V(K k4, V v4) {
        a aVar = new a();
        aVar.p(k4, v4);
        return aVar.a();
    }

    public static <K, V> r3<K, V> W(K k4, V v4, K k5, V v5) {
        a aVar = new a();
        aVar.p(k4, v4);
        aVar.p(k5, v5);
        return aVar.a();
    }

    public static <K, V> r3<K, V> X(K k4, V v4, K k5, V v5, K k6, V v6) {
        a aVar = new a();
        aVar.p(k4, v4);
        aVar.p(k5, v5);
        aVar.p(k6, v6);
        return aVar.a();
    }

    public static <K, V> r3<K, V> Y(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        a aVar = new a();
        aVar.p(k4, v4);
        aVar.p(k5, v5);
        aVar.p(k6, v6);
        aVar.p(k7, v7);
        return aVar.a();
    }

    public static <K, V> r3<K, V> Z(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10) {
        a aVar = new a();
        aVar.p(k4, v4);
        aVar.p(k5, v5);
        aVar.p(k6, v6);
        aVar.p(k7, v7);
        aVar.p(k10, v10);
        return aVar.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.c
    private void a0(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(com.google.android.gms.internal.location.a.a(29, ProtectedSandApp.s("\uf539"), readInt));
        }
        h3.b c5 = h3.c();
        int i4 = 0;
        for (int i5 = 0; i5 < readInt; i5++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(com.google.android.gms.internal.location.a.a(31, ProtectedSandApp.s("\uf538"), readInt2));
            }
            q3.a e02 = e0(comparator);
            for (int i6 = 0; i6 < readInt2; i6++) {
                e02.a(objectInputStream.readObject());
            }
            q3 e4 = e02.e();
            if (e4.size() != readInt2) {
                String valueOf = String.valueOf(readObject);
                throw new InvalidObjectException(com.google.common.base.i.a(valueOf.length() + 40, ProtectedSandApp.s("\uf537"), valueOf));
            }
            c5.i(readObject, e4);
            i4 += readInt2;
        }
        try {
            l3.e.f55907a.b(this, c5.d());
            l3.e.f55908b.a(this, i4);
            c.f56301a.b(this, O(comparator));
        } catch (IllegalArgumentException e5) {
            throw ((InvalidObjectException) new InvalidObjectException(e5.getMessage()).initCause(e5));
        }
    }

    private static <V> q3<V> d0(@zc.a Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? q3.A(collection) : w3.i0(comparator, collection);
    }

    private static <V> q3.a<V> e0(@zc.a Comparator<? super V> comparator) {
        return comparator == null ? new q3.a<>(4) : new w3.a(comparator);
    }

    @d9.c
    private void f0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(K0());
        b6.j(this, objectOutputStream);
    }

    @Override // com.google.common.collect.l3
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: G */
    public b3 b(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l3
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    /* renamed from: H */
    public b3 c(Object obj, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @zc.a
    Comparator<? super V> K0() {
        q3<V> q3Var = this.f56297j;
        if (q3Var instanceof w3) {
            return ((w3) q3Var).comparator();
        }
        return null;
    }

    @Override // com.google.common.collect.l3
    /* renamed from: P, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q3<Map.Entry<K, V>> t() {
        q3<Map.Entry<K, V>> q3Var = this.f56299l;
        if (q3Var != null) {
            return q3Var;
        }
        b bVar = new b(this);
        this.f56299l = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.l3
    /* renamed from: R, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public q3<V> v(K k4) {
        return (q3) com.google.common.base.d0.a((q3) this.f55893g.get(k4), this.f56297j);
    }

    @Override // com.google.common.collect.l3
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public r3<V, K> w() {
        r3<V, K> r3Var = this.f56298k;
        if (r3Var != null) {
            return r3Var;
        }
        r3<V, K> T = T();
        this.f56298k = T;
        return T;
    }

    @Override // com.google.common.collect.l3, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public Collection b(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final q3<V> b0(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l3, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public Collection c(Object obj, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final q3<V> c0(K k4, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l3, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public Set b(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l3, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public Set c(Object obj, Iterable iterable) {
        throw new UnsupportedOperationException();
    }
}
