package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.s6;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: RegularImmutableTable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
abstract class x5<R, C, V> extends y3<R, C, V> {

    /* compiled from: RegularImmutableTable.java */
    private final class b extends z3<s6.a<R, C, V>> {
        private b() {
        }

        s6.a<R, C, V> T(int i4) {
            return x5.this.F(i4);
        }

        @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
        public boolean contains(@zc.a Object obj) {
            if (!(obj instanceof s6.a)) {
                return false;
            }
            s6.a aVar = (s6.a) obj;
            Object L = x5.this.L(aVar.a(), aVar.b());
            return L != null && L.equals(aVar.getValue());
        }

        @Override // com.google.common.collect.z3
        Object get(int i4) {
            return x5.this.F(i4);
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return x5.this.size();
        }
    }

    /* compiled from: RegularImmutableTable.java */
    private final class c extends f3<V> {
        private c() {
        }

        @Override // java.util.List
        public V get(int i4) {
            return (V) x5.this.G(i4);
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return x5.this.size();
        }
    }

    x5() {
    }

    static <R, C, V> x5<R, C, V> B(Iterable<s6.a<R, C, V>> iterable) {
        return D(iterable, null, null);
    }

    static <R, C, V> x5<R, C, V> C(List<s6.a<R, C, V>> list, @zc.a final Comparator<? super R> comparator, @zc.a final Comparator<? super C> comparator2) {
        list.getClass();
        if (comparator != null || comparator2 != null) {
            Collections.sort(list, new Comparator() { // from class: com.google.common.collect.w5
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    int H;
                    H = x5.H(comparator, comparator2, (s6.a) obj, (s6.a) obj2);
                    return H;
                }
            });
        }
        return D(list, comparator, comparator2);
    }

    private static <R, C, V> x5<R, C, V> D(Iterable<s6.a<R, C, V>> iterable, @zc.a Comparator<? super R> comparator, @zc.a Comparator<? super C> comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        f3 w4 = f3.w(iterable);
        for (s6.a<R, C, V> aVar : iterable) {
            linkedHashSet.add(aVar.a());
            linkedHashSet2.add(aVar.b());
        }
        return E(w4, comparator == null ? q3.A(linkedHashSet) : q3.A(f3.b0(comparator, linkedHashSet)), comparator2 == null ? q3.A(linkedHashSet2) : q3.A(f3.b0(comparator2, linkedHashSet2)));
    }

    static <R, C, V> x5<R, C, V> E(f3<s6.a<R, C, V>> f3Var, q3<R> q3Var, q3<C> q3Var2) {
        return ((long) f3Var.size()) > (((long) q3Var.size()) * ((long) q3Var2.size())) / 2 ? new r0(f3Var, q3Var, q3Var2) : new o6(f3Var, q3Var, q3Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int H(Comparator comparator, Comparator comparator2, s6.a aVar, s6.a aVar2) {
        int compare = comparator == null ? 0 : comparator.compare(aVar.a(), aVar2.a());
        if (compare != 0) {
            return compare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(aVar.b(), aVar2.b());
    }

    final void A(R r4, C c5, @zc.a V v4, V v5) {
        com.google.common.base.l0.A(v4 == null, ProtectedSandApp.s("\uf50b"), r4, c5, v5, v4);
    }

    abstract s6.a<R, C, V> F(int i4);

    abstract V G(int i4);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.y3, com.google.common.collect.q
    /* renamed from: p */
    public final q3<s6.a<R, C, V>> b() {
        return isEmpty() ? q3.I() : new b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.y3, com.google.common.collect.q
    /* renamed from: r */
    public final b3<V> c() {
        return isEmpty() ? f3.H() : new c();
    }
}
