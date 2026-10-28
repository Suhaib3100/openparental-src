package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Iterator;
import java.util.NavigableSet;

/* compiled from: DescendingImmutableSortedSet.java */
@w0
@d9.c
/* loaded from: classes6.dex */
final class t0<E> extends w3<E> {

    /* renamed from: i, reason: collision with root package name */
    private final w3<E> f56422i;

    t0(w3<E> w3Var) {
        super(e5.u(w3Var.comparator()).v0());
        this.f56422i = w3Var;
    }

    @Override // com.google.common.collect.w3
    w3<E> M0(E e4, boolean z4, E e5, boolean z5) {
        return this.f56422i.subSet(e5, z5, e4, z4).descendingSet();
    }

    @Override // com.google.common.collect.w3
    w3<E> Q0(E e4, boolean z4) {
        return this.f56422i.headSet(e4, z4).descendingSet();
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @zc.a
    public E ceiling(E e4) {
        return this.f56422i.floor(e4);
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return this.f56422i.contains(obj);
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @d9.c("NavigableSet")
    public Iterator descendingIterator() {
        return this.f56422i.iterator();
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @d9.c("NavigableSet")
    public NavigableSet descendingSet() {
        return this.f56422i;
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @zc.a
    public E floor(E e4) {
        return this.f56422i.ceiling(e4);
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @zc.a
    public E higher(E e4) {
        return this.f56422i.lower(e4);
    }

    @Override // com.google.common.collect.w3
    int indexOf(@zc.a Object obj) {
        int indexOf = this.f56422i.indexOf(obj);
        return indexOf == -1 ? indexOf : (this.f56422i.size() - 1) - indexOf;
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f56422i.descendingIterator();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return this.f56422i.j();
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3
    /* renamed from: l */
    public e7<E> iterator() {
        return this.f56422i.descendingIterator();
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @zc.a
    public E lower(E e4) {
        return this.f56422i.higher(e4);
    }

    @Override // com.google.common.collect.w3
    @d9.c("NavigableSet")
    w3<E> n0() {
        throw new AssertionError(ProtectedSandApp.s("\uf54d"));
    }

    @Override // com.google.common.collect.w3
    @d9.c("NavigableSet")
    /* renamed from: p0 */
    public e7<E> descendingIterator() {
        return this.f56422i.iterator();
    }

    @Override // com.google.common.collect.w3
    @d9.c("NavigableSet")
    /* renamed from: q0 */
    public w3<E> descendingSet() {
        return this.f56422i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f56422i.size();
    }

    @Override // com.google.common.collect.w3
    w3<E> u0(E e4, boolean z4) {
        return this.f56422i.tailSet(e4, z4).descendingSet();
    }
}
