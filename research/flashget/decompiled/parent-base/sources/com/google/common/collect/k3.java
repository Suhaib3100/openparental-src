package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;

/* compiled from: ImmutableMapValues.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class k3<K, V> extends b3<V> {

    /* renamed from: c, reason: collision with root package name */
    private final h3<K, V> f55883c;

    /* compiled from: ImmutableMapValues.java */
    class a extends e7<V> {

        /* renamed from: b, reason: collision with root package name */
        final e7<Map.Entry<K, V>> f55884b;

        a() {
            this.f55884b = k3.this.f55883c.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f55884b.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            return this.f55884b.next().getValue();
        }
    }

    /* compiled from: ImmutableMapValues.java */
    class b extends f3<V> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ f3 f55886d;

        b(k3 k3Var, f3 f3Var) {
            this.f55886d = f3Var;
        }

        @Override // java.util.List
        public V get(int i4) {
            return (V) ((Map.Entry) this.f55886d.get(i4)).getValue();
        }

        @Override // com.google.common.collect.b3
        boolean j() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f55886d.size();
        }
    }

    /* compiled from: ImmutableMapValues.java */
    @d9.c
    private static class c<V> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55887c = 0;

        /* renamed from: b, reason: collision with root package name */
        final h3<?, V> f55888b;

        c(h3<?, V> h3Var) {
            this.f55888b = h3Var;
        }

        Object a() {
            return this.f55888b.values();
        }
    }

    k3(h3<K, V> h3Var) {
        this.f55883c = h3Var;
    }

    @Override // com.google.common.collect.b3
    public f3<V> b() {
        return new b(this, this.f55883c.entrySet().b());
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return obj != null && d4.q(new a(), obj);
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new a();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return true;
    }

    @Override // com.google.common.collect.b3
    /* renamed from: l */
    public e7<V> iterator() {
        return new a();
    }

    @Override // com.google.common.collect.b3
    @d9.c
    Object m() {
        return new c(this.f55883c);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return this.f55883c.size();
    }
}
