package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: EmptyContiguousSet.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
final class x0<C extends Comparable> extends o0<C> {

    /* compiled from: EmptyContiguousSet.java */
    @d9.c
    private static final class b<C extends Comparable> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f56627c = 0;

        /* renamed from: b, reason: collision with root package name */
        private final v0<C> f56628b;

        private Object a() {
            return new x0(this.f56628b);
        }

        private b(v0<C> v0Var) {
            this.f56628b = v0Var;
        }
    }

    x0(v0<C> v0Var) {
        super(v0Var);
    }

    @Override // com.google.common.collect.q3
    @d9.c
    boolean H() {
        return true;
    }

    @Override // com.google.common.collect.o0, com.google.common.collect.w3
    w3 M0(Object obj, boolean z4, Object obj2, boolean z5) {
        return this;
    }

    @Override // com.google.common.collect.o0, com.google.common.collect.w3
    w3 Q0(Object obj, boolean z4) {
        return this;
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3
    public f3<C> b() {
        return f3.H();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o0
    /* renamed from: b1 */
    public o0<C> u0(C c5, boolean z4) {
        return this;
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return false;
    }

    @Override // com.google.common.collect.o0
    public o0<C> d1(o0<C> o0Var) {
        return this;
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @d9.c
    public Iterator descendingIterator() {
        return d4.l.f55558f;
    }

    @Override // com.google.common.collect.o0
    public j5<C> e1() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public boolean equals(@zc.a Object obj) {
        if (obj instanceof Set) {
            return ((Set) obj).isEmpty();
        }
        return false;
    }

    @Override // com.google.common.collect.o0
    public j5<C> f1(x xVar, x xVar2) {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.w3, java.util.SortedSet
    public Object first() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public int hashCode() {
        return 0;
    }

    @Override // com.google.common.collect.w3
    @d9.c
    int indexOf(@zc.a Object obj) {
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return d4.l.f55558f;
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o0
    /* renamed from: j1 */
    public o0<C> M0(C c5, boolean z4, C c6, boolean z5) {
        return this;
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3
    /* renamed from: l */
    public e7<C> iterator() {
        return d4.l.f55558f;
    }

    @Override // com.google.common.collect.w3, java.util.SortedSet
    public Object last() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.w3, com.google.common.collect.q3, com.google.common.collect.b3
    @d9.c
    Object m() {
        return new b(this.f55986i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.o0
    /* renamed from: m1 */
    public o0<C> Q0(C c5, boolean z4) {
        return this;
    }

    @Override // com.google.common.collect.o0, com.google.common.collect.w3
    @d9.c
    w3<C> n0() {
        x4.f56632f.getClass();
        return w3.r0(y5.f56654d);
    }

    public C n1() {
        throw new NoSuchElementException();
    }

    public C o1() {
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.w3
    @d9.c
    /* renamed from: p0 */
    public e7<C> descendingIterator() {
        return d4.l.f55558f;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 0;
    }

    @Override // com.google.common.collect.o0, java.util.AbstractCollection
    public String toString() {
        return ProtectedSandApp.s("\uf57b");
    }

    @Override // com.google.common.collect.o0, com.google.common.collect.w3
    w3 u0(Object obj, boolean z4) {
        return this;
    }
}
