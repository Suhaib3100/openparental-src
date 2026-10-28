package com.google.common.collect;

import com.google.common.collect.m6;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: AbstractSortedMultiset.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
abstract class o<E> extends i<E> implements k6<E> {

    /* renamed from: d, reason: collision with root package name */
    @r2
    final Comparator<? super E> f55983d;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    private transient k6<E> f55984e;

    /* compiled from: AbstractSortedMultiset.java */
    class a extends u0<E> {
        a() {
        }

        @Override // com.google.common.collect.u0
        Iterator<u4.a<E>> d4() {
            return o.this.m();
        }

        @Override // com.google.common.collect.u0
        k6<E> e4() {
            return o.this;
        }

        @Override // com.google.common.collect.u0, com.google.common.collect.q1, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return o.this.descendingIterator();
        }
    }

    o(Comparator<? super E> comparator) {
        comparator.getClass();
        this.f55983d = comparator;
    }

    public k6<E> M1(@f5 E e4, x xVar, @f5 E e5, x xVar2) {
        xVar.getClass();
        xVar2.getClass();
        return d3(e4, xVar).N2(e5, xVar2);
    }

    public Comparator<? super E> comparator() {
        return this.f55983d;
    }

    Iterator<E> descendingIterator() {
        return v4.n(m2());
    }

    @zc.a
    public u4.a<E> firstEntry() {
        Iterator<u4.a<E>> i4 = i();
        if (i4.hasNext()) {
            return i4.next();
        }
        return null;
    }

    k6<E> j() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.i
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public NavigableSet<E> b() {
        return new m6.b(this);
    }

    @zc.a
    public u4.a<E> lastEntry() {
        Iterator<u4.a<E>> m4 = m();
        if (m4.hasNext()) {
            return m4.next();
        }
        return null;
    }

    abstract Iterator<u4.a<E>> m();

    public k6<E> m2() {
        k6<E> k6Var = this.f55984e;
        if (k6Var != null) {
            return k6Var;
        }
        k6<E> j4 = j();
        this.f55984e = j4;
        return j4;
    }

    @zc.a
    public u4.a<E> pollFirstEntry() {
        Iterator<u4.a<E>> i4 = i();
        if (!i4.hasNext()) {
            return null;
        }
        u4.a<E> next = i4.next();
        v4.k kVar = new v4.k(next.getElement(), next.getCount());
        i4.remove();
        return kVar;
    }

    @zc.a
    public u4.a<E> pollLastEntry() {
        Iterator<u4.a<E>> m4 = m();
        if (!m4.hasNext()) {
            return null;
        }
        u4.a<E> next = m4.next();
        v4.k kVar = new v4.k(next.getElement(), next.getCount());
        m4.remove();
        return kVar;
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public NavigableSet<E> d() {
        return (NavigableSet) super.d();
    }

    o() {
        this(x4.f56632f);
    }
}
