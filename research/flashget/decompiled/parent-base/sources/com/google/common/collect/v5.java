package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: RegularImmutableSortedSet.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
final class v5<E> extends w3<E> {

    /* renamed from: j, reason: collision with root package name */
    static final v5<Comparable> f56610j = new v5<>(f3.H(), x4.f56632f);

    /* renamed from: i, reason: collision with root package name */
    @d9.d
    final transient f3<E> f56611i;

    v5(f3<E> f3Var, Comparator<? super E> comparator) {
        super(comparator);
        this.f56611i = f3Var;
    }

    private int X0(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f56611i, obj, this.f56614g);
    }

    @Override // com.google.common.collect.w3
    w3<E> M0(E e4, boolean z4, E e5, boolean z5) {
        return Q0(e4, z4).u0(e5, z5);
    }

    @Override // com.google.common.collect.w3
    w3<E> Q0(E e4, boolean z4) {
        return U0(W0(e4, z4), this.f56611i.size());
    }

    v5<E> U0(int i4, int i5) {
        return (i4 == 0 && i5 == this.f56611i.size()) ? this : i4 < i5 ? new v5<>(this.f56611i.subList(i4, i5), this.f56614g) : w3.r0(this.f56614g);
    }

    int V0(E e4, boolean z4) {
        f3<E> f3Var = this.f56611i;
        e4.getClass();
        int binarySearch = Collections.binarySearch(f3Var, e4, this.f56614g);
        return binarySearch >= 0 ? z4 ? binarySearch + 1 : binarySearch : ~binarySearch;
    }

    int W0(E e4, boolean z4) {
        f3<E> f3Var = this.f56611i;
        e4.getClass();
        int binarySearch = Collections.binarySearch(f3Var, e4, this.f56614g);
        return binarySearch >= 0 ? z4 ? binarySearch : binarySearch + 1 : ~binarySearch;
    }

    Comparator<Object> Y0() {
        return this.f56614g;
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3
    public f3<E> b() {
        return this.f56611i;
    }

    @Override // com.google.common.collect.b3
    int c(Object[] objArr, int i4) {
        return this.f56611i.c(objArr, i4);
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @zc.a
    public E ceiling(E e4) {
        int W0 = W0(e4, true);
        if (W0 == this.f56611i.size()) {
            return null;
        }
        return this.f56611i.get(W0);
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return X0(obj) >= 0;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof u4) {
            collection = ((u4) collection).d();
        }
        if (!h6.b(this.f56614g, collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        e7<E> it = this.f56611i.iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int compare = this.f56614g.compare(next2, next);
                if (compare < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (compare == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (compare > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (this.f56611i.size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!h6.b(this.f56614g, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            e7<E> it2 = this.f56611i.iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || this.f56614g.compare(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.b3
    @zc.a
    Object[] f() {
        return this.f56611i.f();
    }

    @Override // com.google.common.collect.w3, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f56611i.get(0);
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @zc.a
    public E floor(E e4) {
        int V0 = V0(e4, true) - 1;
        if (V0 == -1) {
            return null;
        }
        return this.f56611i.get(V0);
    }

    @Override // com.google.common.collect.b3
    int h() {
        return this.f56611i.h();
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @zc.a
    public E higher(E e4) {
        int W0 = W0(e4, false);
        if (W0 == this.f56611i.size()) {
            return null;
        }
        return this.f56611i.get(W0);
    }

    @Override // com.google.common.collect.b3
    int i() {
        return this.f56611i.i();
    }

    @Override // com.google.common.collect.w3
    int indexOf(@zc.a Object obj) {
        if (obj == null) {
            return -1;
        }
        try {
            int binarySearch = Collections.binarySearch(this.f56611i, obj, this.f56614g);
            if (binarySearch >= 0) {
                return binarySearch;
            }
            return -1;
        } catch (ClassCastException unused) {
            return -1;
        }
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f56611i.iterator();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return this.f56611i.j();
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3
    /* renamed from: l */
    public e7<E> iterator() {
        return this.f56611i.iterator();
    }

    @Override // com.google.common.collect.w3, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f56611i.get(r0.size() - 1);
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @zc.a
    public E lower(E e4) {
        int V0 = V0(e4, false) - 1;
        if (V0 == -1) {
            return null;
        }
        return this.f56611i.get(V0);
    }

    @Override // com.google.common.collect.w3
    w3<E> n0() {
        Comparator reverseOrder = Collections.reverseOrder(this.f56614g);
        return isEmpty() ? w3.r0(reverseOrder) : new v5(this.f56611i.Z(), reverseOrder);
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @d9.c
    /* renamed from: p0, reason: merged with bridge method [inline-methods] */
    public e7<E> descendingIterator() {
        return this.f56611i.Z().iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f56611i.size();
    }

    @Override // com.google.common.collect.w3
    w3<E> u0(E e4, boolean z4) {
        return U0(0, V0(e4, z4));
    }
}
