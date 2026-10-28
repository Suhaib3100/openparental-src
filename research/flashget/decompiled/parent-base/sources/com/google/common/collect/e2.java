package com.google.common.collect;

import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* compiled from: ForwardingMultiset.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class e2<E> extends q1<E> implements u4<E> {

    /* compiled from: ForwardingMultiset.java */
    @d9.a
    protected class a extends v4.h<E> {
        public a() {
        }

        @Override // com.google.common.collect.v4.h
        u4<E> i() {
            return e2.this;
        }

        @Override // com.google.common.collect.v4.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new v4.e(i().entrySet().iterator());
        }
    }

    protected e2() {
    }

    @Override // com.google.common.collect.q1
    @d9.a
    protected boolean A3(Collection<? extends E> collection) {
        return v4.c(this, collection);
    }

    @Override // com.google.common.collect.q1
    protected void E3() {
        d4.h(entrySet().iterator());
    }

    @Override // com.google.common.collect.q1
    protected boolean F3(@zc.a Object obj) {
        return W2(obj) > 0;
    }

    @Override // com.google.common.collect.q1
    protected boolean N3(@zc.a Object obj) {
        return W1(obj, 1) > 0;
    }

    @Override // com.google.common.collect.q1
    protected boolean O3(Collection<?> collection) {
        return v4.p(this, collection);
    }

    @Override // com.google.common.collect.q1
    protected boolean P3(Collection<?> collection) {
        return v4.s(this, collection);
    }

    @Override // com.google.common.collect.q1
    protected String S3() {
        return entrySet().toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.q1
    /* renamed from: T3 */
    public abstract u4<E> u3();

    protected boolean U3(@f5 E e4) {
        d2(e4, 1);
        return true;
    }

    @d9.a
    protected int V3(@zc.a Object obj) {
        for (u4.a<E> aVar : entrySet()) {
            if (com.google.common.base.f0.a(aVar.getElement(), obj)) {
                return aVar.getCount();
            }
        }
        return 0;
    }

    @Override // com.google.common.collect.u4
    @f9.a
    public int W1(@zc.a Object obj, int i4) {
        return u3().W1(obj, i4);
    }

    @Override // com.google.common.collect.u4
    public int W2(@zc.a Object obj) {
        return u3().W2(obj);
    }

    protected boolean W3(@zc.a Object obj) {
        return v4.i(this, obj);
    }

    protected int X3() {
        return entrySet().hashCode();
    }

    protected Iterator<E> Y3() {
        return v4.n(this);
    }

    protected int Z3(@f5 E e4, int i4) {
        return v4.v(this, e4, i4);
    }

    protected boolean a4(@f5 E e4, int i4, int i5) {
        return v4.w(this, e4, i4, i5);
    }

    protected int b4() {
        return v4.o(this);
    }

    @Override // com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public Set<E> d() {
        return u3().d();
    }

    @Override // com.google.common.collect.u4
    @f9.a
    public int d2(@f5 E e4, int i4) {
        return u3().d2(e4, i4);
    }

    @Override // com.google.common.collect.u4, com.google.common.collect.k6
    public Set<u4.a<E>> entrySet() {
        return u3().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.u4
    public boolean equals(@zc.a Object obj) {
        return obj == this || u3().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.u4
    public int hashCode() {
        return u3().hashCode();
    }

    @Override // com.google.common.collect.u4
    @f9.a
    public int o0(@f5 E e4, int i4) {
        return u3().o0(e4, i4);
    }

    @Override // com.google.common.collect.u4
    @f9.a
    public boolean x2(@f5 E e4, int i4, int i5) {
        return u3().x2(e4, i4, i5);
    }
}
