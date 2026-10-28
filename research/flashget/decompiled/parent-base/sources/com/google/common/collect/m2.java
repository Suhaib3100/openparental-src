package com.google.common.collect;

import com.google.common.collect.m6;
import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: ForwardingSortedMultiset.java */
@w0
@d9.b(emulated = true)
@d9.a
/* loaded from: classes6.dex */
public abstract class m2<E> extends e2<E> implements k6<E> {

    /* compiled from: ForwardingSortedMultiset.java */
    protected abstract class a extends u0<E> {
        public a() {
        }

        @Override // com.google.common.collect.u0
        k6<E> e4() {
            return m2.this;
        }
    }

    /* compiled from: ForwardingSortedMultiset.java */
    protected class b extends m6.b<E> {
        public b(m2 m2Var) {
            super(m2Var);
        }
    }

    protected m2() {
    }

    @Override // com.google.common.collect.k6
    public k6<E> M1(@f5 E e4, x xVar, @f5 E e5, x xVar2) {
        return u3().M1(e4, xVar, e5, xVar2);
    }

    @Override // com.google.common.collect.k6
    public k6<E> N2(@f5 E e4, x xVar) {
        return u3().N2(e4, xVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.e2, com.google.common.collect.q1
    /* renamed from: c4, reason: merged with bridge method [inline-methods] */
    public abstract k6<E> u3();

    @Override // com.google.common.collect.k6, com.google.common.collect.g6
    public Comparator<? super E> comparator() {
        return u3().comparator();
    }

    @Override // com.google.common.collect.k6
    public k6<E> d3(@f5 E e4, x xVar) {
        return u3().d3(e4, xVar);
    }

    @zc.a
    protected u4.a<E> d4() {
        Iterator<u4.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        u4.a<E> next = it.next();
        return new v4.k(next.getElement(), next.getCount());
    }

    @zc.a
    protected u4.a<E> e4() {
        Iterator<u4.a<E>> it = m2().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        u4.a<E> next = it.next();
        return new v4.k(next.getElement(), next.getCount());
    }

    @zc.a
    protected u4.a<E> f4() {
        Iterator<u4.a<E>> it = entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        u4.a<E> next = it.next();
        v4.k kVar = new v4.k(next.getElement(), next.getCount());
        it.remove();
        return kVar;
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> firstEntry() {
        return u3().firstEntry();
    }

    @zc.a
    protected u4.a<E> g4() {
        Iterator<u4.a<E>> it = m2().entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        u4.a<E> next = it.next();
        v4.k kVar = new v4.k(next.getElement(), next.getCount());
        it.remove();
        return kVar;
    }

    protected k6<E> h4(@f5 E e4, x xVar, @f5 E e5, x xVar2) {
        return d3(e4, xVar).N2(e5, xVar2);
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> lastEntry() {
        return u3().lastEntry();
    }

    @Override // com.google.common.collect.k6
    public k6<E> m2() {
        return u3().m2();
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> pollFirstEntry() {
        return u3().pollFirstEntry();
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> pollLastEntry() {
        return u3().pollLastEntry();
    }

    @Override // com.google.common.collect.e2, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public NavigableSet<E> d() {
        return u3().d();
    }
}
