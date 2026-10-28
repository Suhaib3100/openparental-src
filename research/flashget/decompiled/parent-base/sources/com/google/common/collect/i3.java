package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ImmutableMapEntrySet.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class i3<K, V> extends q3<Map.Entry<K, V>> {

    /* compiled from: ImmutableMapEntrySet.java */
    @d9.c
    private static class a<K, V> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55819c = 0;

        /* renamed from: b, reason: collision with root package name */
        final h3<K, V> f55820b;

        a(h3<K, V> h3Var) {
            this.f55820b = h3Var;
        }

        Object a() {
            return this.f55820b.entrySet();
        }
    }

    /* compiled from: ImmutableMapEntrySet.java */
    static final class b<K, V> extends i3<K, V> {

        /* renamed from: g, reason: collision with root package name */
        private final transient h3<K, V> f55821g;

        /* renamed from: h, reason: collision with root package name */
        private final transient f3<Map.Entry<K, V>> f55822h;

        b(h3<K, V> h3Var, Map.Entry<K, V>[] entryArr) {
            this(h3Var, f3.p(entryArr));
        }

        @Override // com.google.common.collect.q3
        f3<Map.Entry<K, V>> G() {
            return this.f55822h;
        }

        @Override // com.google.common.collect.i3
        h3<K, V> T() {
            return this.f55821g;
        }

        @Override // com.google.common.collect.b3
        @d9.c("not used in GWT")
        int c(Object[] objArr, int i4) {
            return this.f55822h.c(objArr, i4);
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator iterator() {
            return this.f55822h.iterator();
        }

        @Override // com.google.common.collect.q3, com.google.common.collect.b3
        /* renamed from: l */
        public e7<Map.Entry<K, V>> iterator() {
            return this.f55822h.iterator();
        }

        b(h3<K, V> h3Var, f3<Map.Entry<K, V>> f3Var) {
            this.f55821g = h3Var;
            this.f55822h = f3Var;
        }
    }

    i3() {
    }

    @Override // com.google.common.collect.q3
    @d9.c
    boolean H() {
        return T().o();
    }

    abstract h3<K, V> T();

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        V v4 = T().get(entry.getKey());
        return v4 != null && v4.equals(entry.getValue());
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public int hashCode() {
        return T().hashCode();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return T().p();
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3
    @d9.c
    Object m() {
        return new a(T());
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return T().size();
    }
}
