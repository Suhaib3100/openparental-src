package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.f3;
import com.google.common.collect.h3;
import com.google.common.collect.l3;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/* compiled from: ImmutableListMultimap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public class g3<K, V> extends l3<K, V> implements k4<K, V> {

    /* renamed from: k, reason: collision with root package name */
    @d9.c
    private static final long f55747k = 0;

    /* renamed from: j, reason: collision with root package name */
    @g9.b
    @zc.a
    @ma.h
    private transient g3<V, K> f55748j;

    /* compiled from: ImmutableListMultimap.java */
    public static final class a<K, V> extends l3.c<K, V> {
        @Override // com.google.common.collect.l3.c
        public l3 a() {
            return (g3) super.a();
        }

        @Override // com.google.common.collect.l3.c
        @f9.a
        l3.c b(l3.c cVar) {
            super.b(cVar);
            return this;
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
        @f9.a
        public l3.c h(r4 r4Var) {
            super.h(r4Var);
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.l3.c
        @f9.a
        public l3.c k(Object obj, Object[] objArr) {
            super.k(obj, objArr);
            return this;
        }

        public g3<K, V> l() {
            return (g3) super.a();
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

        @f9.a
        public a<K, V> r(r4<? extends K, ? extends V> r4Var) {
            super.h(r4Var);
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

        @f9.a
        public a<K, V> u(K k4, V... vArr) {
            super.k(k4, vArr);
            return this;
        }
    }

    g3(h3<K, f3<V>> h3Var, int i4) {
        super(h3Var, i4);
    }

    public static <K, V> a<K, V> K() {
        return new a<>();
    }

    public static <K, V> g3<K, V> L(r4<? extends K, ? extends V> r4Var) {
        if (r4Var.isEmpty()) {
            return y0.f56641l;
        }
        if (r4Var instanceof g3) {
            g3<K, V> g3Var = (g3) r4Var;
            if (!g3Var.x()) {
                return g3Var;
            }
        }
        return N(r4Var.f().entrySet(), null);
    }

    @d9.a
    public static <K, V> g3<K, V> M(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a().s(iterable).l();
    }

    static <K, V> g3<K, V> N(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return y0.f56641l;
        }
        h3.b bVar = new h3.b(collection.size());
        int i4 = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            Collection<? extends V> value = entry.getValue();
            f3 x4 = comparator == null ? f3.x(value) : f3.b0(comparator, value);
            if (!x4.isEmpty()) {
                bVar.i(key, x4);
                i4 = x4.size() + i4;
            }
        }
        return new g3<>(bVar.d(), i4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private g3<V, K> Q() {
        a aVar = new a();
        e7 it = t().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            aVar.p(entry.getValue(), entry.getKey());
        }
        g3<V, K> l4 = aVar.l();
        l4.f55748j = this;
        return l4;
    }

    public static <K, V> g3<K, V> R() {
        return y0.f56641l;
    }

    public static <K, V> g3<K, V> S(K k4, V v4) {
        a aVar = new a();
        aVar.p(k4, v4);
        return aVar.l();
    }

    public static <K, V> g3<K, V> T(K k4, V v4, K k5, V v5) {
        a aVar = new a();
        aVar.p(k4, v4);
        aVar.p(k5, v5);
        return aVar.l();
    }

    public static <K, V> g3<K, V> U(K k4, V v4, K k5, V v5, K k6, V v6) {
        a aVar = new a();
        aVar.p(k4, v4);
        aVar.p(k5, v5);
        aVar.p(k6, v6);
        return aVar.l();
    }

    public static <K, V> g3<K, V> V(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        a aVar = new a();
        aVar.p(k4, v4);
        aVar.p(k5, v5);
        aVar.p(k6, v6);
        aVar.p(k7, v7);
        return aVar.l();
    }

    public static <K, V> g3<K, V> W(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10) {
        a aVar = new a();
        aVar.p(k4, v4);
        aVar.p(k5, v5);
        aVar.p(k6, v6);
        aVar.p(k7, v7);
        aVar.p(k10, v10);
        return aVar.l();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @d9.c
    private void X(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            throw new InvalidObjectException(com.google.android.gms.internal.location.a.a(29, ProtectedSandApp.s("\uf4ca"), readInt));
        }
        h3.b c5 = h3.c();
        int i4 = 0;
        for (int i5 = 0; i5 < readInt; i5++) {
            Object readObject = objectInputStream.readObject();
            int readInt2 = objectInputStream.readInt();
            if (readInt2 <= 0) {
                throw new InvalidObjectException(com.google.android.gms.internal.location.a.a(31, ProtectedSandApp.s("\uf4c9"), readInt2));
            }
            f3.a r4 = f3.r();
            for (int i6 = 0; i6 < readInt2; i6++) {
                r4.j(objectInputStream.readObject());
            }
            c5.i(readObject, r4.e());
            i4 += readInt2;
        }
        try {
            l3.e.f55907a.b(this, c5.d());
            l3.e.f55908b.a(this, i4);
        } catch (IllegalArgumentException e4) {
            throw ((InvalidObjectException) new InvalidObjectException(e4.getMessage()).initCause(e4));
        }
    }

    @d9.c
    private void a0(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
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

    @Override // com.google.common.collect.l3
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public f3<V> v(K k4) {
        f3<V> f3Var = (f3) this.f55893g.get(k4);
        return f3Var == null ? f3.H() : f3Var;
    }

    @Override // com.google.common.collect.l3
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public g3<V, K> w() {
        g3<V, K> g3Var = this.f55748j;
        if (g3Var != null) {
            return g3Var;
        }
        g3<V, K> Q = Q();
        this.f55748j = Q;
        return Q;
    }

    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final f3<V> Y(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final f3<V> Z(K k4, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l3, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public Collection b(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l3, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public Collection c(Object obj, Iterable iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l3, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public List b(@zc.a Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.l3, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public List c(Object obj, Iterable iterable) {
        throw new UnsupportedOperationException();
    }
}
