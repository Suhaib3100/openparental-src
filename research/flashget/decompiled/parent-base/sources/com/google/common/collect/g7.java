package com.google.common.collect;

import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.Collection;
import java.util.Comparator;
import java.util.NavigableSet;

/* compiled from: UnmodifiableSortedMultiset.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class g7<E> extends v4.m<E> implements k6<E> {

    /* renamed from: g, reason: collision with root package name */
    private static final long f55775g = 0;

    /* renamed from: f, reason: collision with root package name */
    @zc.a
    private transient g7<E> f55776f;

    g7(k6<E> k6Var) {
        super(k6Var);
    }

    @Override // com.google.common.collect.k6
    public k6<E> M1(@f5 E e4, x xVar, @f5 E e5, x xVar2) {
        return v4.B(((k6) this.f56607b).M1(e4, xVar, e5, xVar2));
    }

    @Override // com.google.common.collect.k6
    public k6<E> N2(@f5 E e4, x xVar) {
        return v4.B(((k6) this.f56607b).N2(e4, xVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.v4.m, com.google.common.collect.e2
    /* renamed from: T3 */
    public u4 u3() {
        return (k6) this.f56607b;
    }

    @Override // com.google.common.collect.k6, com.google.common.collect.g6
    public Comparator<? super E> comparator() {
        return ((k6) this.f56607b).comparator();
    }

    @Override // com.google.common.collect.k6
    public k6<E> d3(@f5 E e4, x xVar) {
        return v4.B(((k6) this.f56607b).d3(e4, xVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.v4.m
    /* renamed from: d4, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> c4() {
        return d6.O(((k6) this.f56607b).d());
    }

    protected k6<E> e4() {
        return (k6) this.f56607b;
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> firstEntry() {
        return ((k6) this.f56607b).firstEntry();
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> lastEntry() {
        return ((k6) this.f56607b).lastEntry();
    }

    @Override // com.google.common.collect.k6
    public k6<E> m2() {
        g7<E> g7Var = this.f55776f;
        if (g7Var != null) {
            return g7Var;
        }
        g7<E> g7Var2 = new g7<>((u4) ((k6) this.f56607b).m2());
        g7Var2.f55776f = this;
        this.f55776f = g7Var2;
        return g7Var2;
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.v4.m, com.google.common.collect.e2, com.google.common.collect.q1, com.google.common.collect.h2
    protected Object u3() {
        return (k6) this.f56607b;
    }

    @Override // com.google.common.collect.v4.m, com.google.common.collect.e2, com.google.common.collect.q1
    /* renamed from: v3 */
    protected Collection u3() {
        return (k6) this.f56607b;
    }

    @Override // com.google.common.collect.v4.m, com.google.common.collect.e2, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public NavigableSet<E> d() {
        return (NavigableSet) super.d();
    }
}
