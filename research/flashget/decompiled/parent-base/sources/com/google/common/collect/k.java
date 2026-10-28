package com.google.common.collect;

import java.lang.Comparable;
import java.util.Iterator;

/* compiled from: AbstractRangeSet.java */
@w0
@d9.c
/* loaded from: classes6.dex */
abstract class k<C extends Comparable> implements m5<C> {
    k() {
    }

    @Override // com.google.common.collect.m5
    public void a(j5<C> j5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.m5
    public boolean b(C c5) {
        return k(c5) != null;
    }

    @Override // com.google.common.collect.m5
    public void clear() {
        a(j5.a());
    }

    @Override // com.google.common.collect.m5
    public void d(j5<C> j5Var) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.m5
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof m5) {
            return p().equals(((m5) obj).p());
        }
        return false;
    }

    @Override // com.google.common.collect.m5
    public boolean f(j5<C> j5Var) {
        return !n(j5Var).isEmpty();
    }

    @Override // com.google.common.collect.m5
    public void g(Iterable<j5<C>> iterable) {
        Iterator<j5<C>> it = iterable.iterator();
        while (it.hasNext()) {
            d(it.next());
        }
    }

    @Override // com.google.common.collect.m5
    public void h(m5<C> m5Var) {
        g(m5Var.p());
    }

    @Override // com.google.common.collect.m5
    public final int hashCode() {
        return p().hashCode();
    }

    @Override // com.google.common.collect.m5
    public void i(Iterable<j5<C>> iterable) {
        Iterator<j5<C>> it = iterable.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
    }

    @Override // com.google.common.collect.m5
    public boolean isEmpty() {
        return p().isEmpty();
    }

    @Override // com.google.common.collect.m5
    public boolean j(m5<C> m5Var) {
        return m(m5Var.p());
    }

    @Override // com.google.common.collect.m5
    @zc.a
    public abstract j5<C> k(C c5);

    @Override // com.google.common.collect.m5
    public abstract boolean l(j5<C> j5Var);

    @Override // com.google.common.collect.m5
    public boolean m(Iterable<j5<C>> iterable) {
        Iterator<j5<C>> it = iterable.iterator();
        while (it.hasNext()) {
            if (!l(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.common.collect.m5
    public void q(m5<C> m5Var) {
        i(m5Var.p());
    }

    @Override // com.google.common.collect.m5
    public final String toString() {
        return p().toString();
    }
}
