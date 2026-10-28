package com.google.common.collect;

import com.google.common.collect.u4;
import com.google.common.collect.v4;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* compiled from: SortedMultisets.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class m6 {

    /* compiled from: SortedMultisets.java */
    static class a<E> extends v4.h<E> implements SortedSet<E> {

        /* renamed from: b, reason: collision with root package name */
        @ma.i
        private final k6<E> f55963b;

        a(k6<E> k6Var) {
            this.f55963b = k6Var;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return this.f55963b.comparator();
        }

        @Override // java.util.SortedSet
        @f5
        public E first() {
            return (E) m6.d(this.f55963b.firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@f5 E e4) {
            return this.f55963b.N2(e4, x.OPEN).d();
        }

        @Override // com.google.common.collect.v4.h
        u4 i() {
            return this.f55963b;
        }

        @Override // com.google.common.collect.v4.h, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new v4.e(this.f55963b.entrySet().iterator());
        }

        final k6<E> j() {
            return this.f55963b;
        }

        @Override // java.util.SortedSet
        @f5
        public E last() {
            return (E) m6.d(this.f55963b.lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@f5 E e4, @f5 E e5) {
            return this.f55963b.M1(e4, x.CLOSED, e5, x.OPEN).d();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@f5 E e4) {
            return this.f55963b.d3(e4, x.CLOSED).d();
        }
    }

    /* compiled from: SortedMultisets.java */
    @d9.c
    static class b<E> extends a<E> implements NavigableSet<E> {
        b(k6<E> k6Var) {
            super(k6Var);
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E ceiling(@f5 E e4) {
            return (E) m6.c(j().d3(e4, x.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new b(j().m2());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E floor(@f5 E e4) {
            return (E) m6.c(j().N2(e4, x.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@f5 E e4, boolean z4) {
            return new b(j().N2(e4, x.forBoolean(z4)));
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E higher(@f5 E e4) {
            return (E) m6.c(j().d3(e4, x.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E lower(@f5 E e4) {
            return (E) m6.c(j().N2(e4, x.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E pollFirst() {
            return (E) m6.c(j().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        @zc.a
        public E pollLast() {
            return (E) m6.c(j().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@f5 E e4, boolean z4, @f5 E e5, boolean z5) {
            return new b(j().M1(e4, x.forBoolean(z4), e5, x.forBoolean(z5)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@f5 E e4, boolean z4) {
            return new b(j().d3(e4, x.forBoolean(z4)));
        }
    }

    private m6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    public static <E> E c(@zc.a u4.a<E> aVar) {
        if (aVar == null) {
            return null;
        }
        return aVar.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <E> E d(@zc.a u4.a<E> aVar) {
        if (aVar != null) {
            return aVar.getElement();
        }
        throw new NoSuchElementException();
    }
}
