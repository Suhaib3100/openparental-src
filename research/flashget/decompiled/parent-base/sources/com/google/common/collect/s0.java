package com.google.common.collect;

import com.google.common.collect.u4;

/* compiled from: DescendingImmutableSortedMultiset.java */
@w0
@d9.c
/* loaded from: classes6.dex */
final class s0<E> extends u3<E> {

    /* renamed from: f, reason: collision with root package name */
    private final transient u3<E> f56374f;

    s0(u3<E> u3Var) {
        this.f56374f = u3Var;
    }

    @Override // com.google.common.collect.m3
    u4.a<E> F(int i4) {
        return this.f56374f.entrySet().b().Z().get(i4);
    }

    @Override // com.google.common.collect.u4
    public int W2(@zc.a Object obj) {
        return this.f56374f.W2(obj);
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> firstEntry() {
        return this.f56374f.lastEntry();
    }

    @Override // com.google.common.collect.u3
    /* renamed from: h0 */
    public u3<E> m2() {
        return this.f56374f;
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.m3, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public w3<E> d() {
        return this.f56374f.d().descendingSet();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return this.f56374f.j();
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.k6
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public u3<E> N2(E e4, x xVar) {
        return this.f56374f.d3(e4, xVar).m2();
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> lastEntry() {
        return this.f56374f.firstEntry();
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.k6
    public k6 m2() {
        return this.f56374f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public int size() {
        return this.f56374f.size();
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.k6
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public u3<E> d3(E e4, x xVar) {
        return this.f56374f.N2(e4, xVar).m2();
    }
}
