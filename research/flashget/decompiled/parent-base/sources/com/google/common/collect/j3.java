package com.google.common.collect;

import java.io.Serializable;
import java.util.Iterator;

/* compiled from: ImmutableMapKeySet.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class j3<K, V> extends z3<K> {

    /* renamed from: g, reason: collision with root package name */
    private final h3<K, V> f55829g;

    /* compiled from: ImmutableMapKeySet.java */
    @d9.c
    private static class a<K> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55830c = 0;

        /* renamed from: b, reason: collision with root package name */
        final h3<K, ?> f55831b;

        a(h3<K, ?> h3Var) {
            this.f55831b = h3Var;
        }

        Object a() {
            return this.f55831b.keySet();
        }
    }

    j3(h3<K, V> h3Var) {
        this.f55829g = h3Var;
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return this.f55829g.containsKey(obj);
    }

    @Override // com.google.common.collect.z3
    K get(int i4) {
        return this.f55829g.entrySet().b().get(i4).getKey();
    }

    @Override // com.google.common.collect.z3, com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f55829g.q();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return true;
    }

    @Override // com.google.common.collect.z3, com.google.common.collect.q3, com.google.common.collect.b3
    /* renamed from: l */
    public e7<K> iterator() {
        return this.f55829g.q();
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3
    @d9.c
    Object m() {
        return new a(this.f55829g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f55829g.size();
    }
}
