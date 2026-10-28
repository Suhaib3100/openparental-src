package com.google.common.collect;

import com.google.common.collect.d6;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* compiled from: ForwardingNavigableSet.java */
@w0
@d9.c
/* loaded from: classes6.dex */
public abstract class g2<E> extends n2<E> implements NavigableSet<E> {

    /* compiled from: ForwardingNavigableSet.java */
    @d9.a
    protected class a extends d6.g<E> {
        public a(g2 g2Var) {
            super(g2Var);
        }
    }

    protected g2() {
    }

    @Override // com.google.common.collect.n2
    protected SortedSet<E> X3(@f5 E e4, @f5 E e5) {
        return subSet(e4, true, e5, false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.n2, com.google.common.collect.j2, com.google.common.collect.q1
    /* renamed from: Y3 */
    public abstract NavigableSet<E> u3();

    @zc.a
    protected E Z3(@f5 E e4) {
        return (E) d4.J(tailSet(e4, true).iterator(), null);
    }

    @f5
    protected E a4() {
        return iterator().next();
    }

    @zc.a
    protected E b4(@f5 E e4) {
        return (E) d4.J(headSet(e4, true).descendingIterator(), null);
    }

    protected SortedSet<E> c4(@f5 E e4) {
        return headSet(e4, false);
    }

    @zc.a
    public E ceiling(@f5 E e4) {
        return u3().ceiling(e4);
    }

    @zc.a
    protected E d4(@f5 E e4) {
        return (E) d4.J(tailSet(e4, false).iterator(), null);
    }

    public Iterator<E> descendingIterator() {
        return u3().descendingIterator();
    }

    public NavigableSet<E> descendingSet() {
        return u3().descendingSet();
    }

    @f5
    protected E e4() {
        return descendingIterator().next();
    }

    @zc.a
    protected E f4(@f5 E e4) {
        return (E) d4.J(headSet(e4, false).descendingIterator(), null);
    }

    @zc.a
    public E floor(@f5 E e4) {
        return u3().floor(e4);
    }

    @zc.a
    protected E g4() {
        return (E) d4.U(iterator());
    }

    @zc.a
    protected E h4() {
        return (E) d4.U(descendingIterator());
    }

    public NavigableSet<E> headSet(@f5 E e4, boolean z4) {
        return u3().headSet(e4, z4);
    }

    @zc.a
    public E higher(@f5 E e4) {
        return u3().higher(e4);
    }

    @d9.a
    protected NavigableSet<E> i4(@f5 E e4, boolean z4, @f5 E e5, boolean z5) {
        return tailSet(e4, z4).headSet(e5, z5);
    }

    protected SortedSet<E> j4(@f5 E e4) {
        return tailSet(e4, true);
    }

    @zc.a
    public E lower(@f5 E e4) {
        return u3().lower(e4);
    }

    @zc.a
    public E pollFirst() {
        return u3().pollFirst();
    }

    @zc.a
    public E pollLast() {
        return u3().pollLast();
    }

    public NavigableSet<E> subSet(@f5 E e4, boolean z4, @f5 E e5, boolean z5) {
        return u3().subSet(e4, z4, e5, z5);
    }

    public NavigableSet<E> tailSet(@f5 E e4, boolean z4) {
        return u3().tailSet(e4, z4);
    }
}
