package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.h3;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;

/* compiled from: ImmutableBiMap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public abstract class z2<K, V> extends h3<K, V> implements w<K, V> {

    /* compiled from: ImmutableBiMap.java */
    public static final class a<K, V> extends h3.b<K, V> {
        a(int i4) {
            super(i4);
        }

        @Override // com.google.common.collect.h3.b
        public h3 a() {
            return d();
        }

        @Override // com.google.common.collect.h3.b
        @f9.a
        h3.b e(h3.b bVar) {
            super.e(bVar);
            return this;
        }

        @Override // com.google.common.collect.h3.b
        @d9.a
        @f9.a
        public h3.b h(Comparator comparator) {
            super.h(comparator);
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.h3.b
        @f9.a
        public h3.b i(Object obj, Object obj2) {
            super.i(obj, obj2);
            return this;
        }

        @Override // com.google.common.collect.h3.b
        @f9.a
        public h3.b j(Map.Entry entry) {
            super.j(entry);
            return this;
        }

        @Override // com.google.common.collect.h3.b
        @d9.a
        @f9.a
        public h3.b k(Iterable iterable) {
            super.k(iterable);
            return this;
        }

        @Override // com.google.common.collect.h3.b
        @f9.a
        public h3.b l(Map map) {
            super.l(map);
            return this;
        }

        public z2<K, V> n() {
            return d();
        }

        @Override // com.google.common.collect.h3.b
        @f9.e
        @Deprecated
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public z2<K, V> c() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("\uf587"));
        }

        @Override // com.google.common.collect.h3.b
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public z2<K, V> d() {
            int i4 = this.f55797c;
            if (i4 == 0) {
                return z2.P();
            }
            if (this.f55795a != null) {
                if (this.f55798d) {
                    this.f55796b = Arrays.copyOf(this.f55796b, i4 * 2);
                }
                h3.b.m(this.f55796b, this.f55797c, this.f55795a);
            }
            this.f55798d = true;
            return new p5(this.f55796b, this.f55797c);
        }

        @f9.a
        a<K, V> q(h3.b<K, V> bVar) {
            super.e(bVar);
            return this;
        }

        @d9.a
        @f9.a
        public a<K, V> r(Comparator<? super V> comparator) {
            super.h(comparator);
            return this;
        }

        @f9.a
        public a<K, V> s(K k4, V v4) {
            super.i(k4, v4);
            return this;
        }

        @f9.a
        public a<K, V> t(Map.Entry<? extends K, ? extends V> entry) {
            super.j(entry);
            return this;
        }

        @d9.a
        @f9.a
        public a<K, V> u(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.k(iterable);
            return this;
        }

        @f9.a
        public a<K, V> v(Map<? extends K, ? extends V> map) {
            super.l(map);
            return this;
        }

        public a() {
            super(4);
        }
    }

    /* compiled from: ImmutableBiMap.java */
    private static class b<K, V> extends h3.e<K, V> {

        /* renamed from: f, reason: collision with root package name */
        private static final long f56673f = 0;

        b(z2<K, V> z2Var) {
            super(z2Var);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.h3.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public a<K, V> b(int i4) {
            return new a<>(i4);
        }
    }

    z2() {
    }

    public static <K, V> a<K, V> I() {
        return new a<>(4);
    }

    @d9.a
    public static <K, V> a<K, V> J(int i4) {
        b0.b(i4, ProtectedSandApp.s("\uf522"));
        return new a<>(i4);
    }

    @d9.a
    public static <K, V> z2<K, V> L(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new a(iterable instanceof Collection ? ((Collection) iterable).size() : 4).u(iterable).d();
    }

    public static <K, V> z2<K, V> M(Map<? extends K, ? extends V> map) {
        if (map instanceof z2) {
            z2<K, V> z2Var = (z2) map;
            if (!z2Var.p()) {
                return z2Var;
            }
        }
        return L(map.entrySet());
    }

    public static <K, V> z2<K, V> P() {
        return p5.f56171l;
    }

    public static <K, V> z2<K, V> Q(K k4, V v4) {
        b0.a(k4, v4);
        return new p5(new Object[]{k4, v4}, 1);
    }

    public static <K, V> z2<K, V> R(K k4, V v4, K k5, V v5) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        return new p5(new Object[]{k4, v4, k5, v5}, 2);
    }

    public static <K, V> z2<K, V> S(K k4, V v4, K k5, V v5, K k6, V v6) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        return new p5(new Object[]{k4, v4, k5, v5, k6, v6}, 3);
    }

    public static <K, V> z2<K, V> T(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        return new p5(new Object[]{k4, v4, k5, v5, k6, v6, k7, v7}, 4);
    }

    public static <K, V> z2<K, V> U(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        return new p5(new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10}, 5);
    }

    public static <K, V> z2<K, V> V(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        return new p5(new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11}, 6);
    }

    public static <K, V> z2<K, V> W(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        b0.a(k12, v12);
        return new p5(new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11, k12, v12}, 7);
    }

    public static <K, V> z2<K, V> X(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        b0.a(k12, v12);
        b0.a(k13, v13);
        return new p5(new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11, k12, v12, k13, v13}, 8);
    }

    public static <K, V> z2<K, V> Y(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14) {
        b0.a(k4, v4);
        b0.a(k5, v5);
        b0.a(k6, v6);
        b0.a(k7, v7);
        b0.a(k10, v10);
        b0.a(k11, v11);
        b0.a(k12, v12);
        b0.a(k13, v13);
        b0.a(k14, v14);
        return new p5(new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14}, 9);
    }

    public static <K, V> z2<K, V> Z(K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7, K k10, V v10, K k11, V v11, K k12, V v12, K k13, V v13, K k14, V v14, K k15, V v15) {
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
        return new p5(new Object[]{k4, v4, k5, v5, k6, v6, k7, v7, k10, v10, k11, v11, k12, v12, k13, v13, k14, v14, k15, v15}, 10);
    }

    @SafeVarargs
    public static <K, V> z2<K, V> a0(Map.Entry<? extends K, ? extends V>... entryArr) {
        return L(Arrays.asList(entryArr));
    }

    @Override // com.google.common.collect.h3
    Object H() {
        return new b((h3) this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.h3
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final q3<V> l() {
        throw new AssertionError(ProtectedSandApp.s("\uf523"));
    }

    @Override // com.google.common.collect.w
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public abstract z2<V, K> M2();

    @Override // com.google.common.collect.w
    @zc.a
    @f9.a
    @Deprecated
    @f9.e("Always throws UnsupportedOperationException")
    public final V a2(K k4, V v4) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.h3, java.util.Map
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public q3<V> values() {
        return M2().keySet();
    }
}
