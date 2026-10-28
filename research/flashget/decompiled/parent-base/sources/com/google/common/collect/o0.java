package com.google.common.collect;

import com.google.common.collect.v0;
import com.google.common.collect.w3;
import java.lang.Comparable;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: ContiguousSet.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public abstract class o0<C extends Comparable> extends w3<C> {

    /* renamed from: i, reason: collision with root package name */
    final v0<C> f55986i;

    o0(v0<C> v0Var) {
        super(x4.f56632f);
        this.f55986i = v0Var;
    }

    @f9.e("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> w3.a<E> T() {
        throw new UnsupportedOperationException();
    }

    @d9.a
    public static o0<Integer> U0(int i4, int i5) {
        return Y0(j5.f(Integer.valueOf(i4), Integer.valueOf(i5)), v0.c.f56569c);
    }

    @d9.a
    public static o0<Long> V0(long j4, long j5) {
        return Y0(j5.f(Long.valueOf(j4), Long.valueOf(j5)), v0.d.f56571c);
    }

    @d9.a
    public static o0<Integer> W0(int i4, int i5) {
        return Y0(j5.g(Integer.valueOf(i4), Integer.valueOf(i5)), v0.c.f56569c);
    }

    @d9.a
    public static o0<Long> X0(long j4, long j5) {
        return Y0(j5.g(Long.valueOf(j4), Long.valueOf(j5)), v0.d.f56571c);
    }

    public static <C extends Comparable> o0<C> Y0(j5<C> j5Var, v0<C> v0Var) {
        j5Var.getClass();
        v0Var.getClass();
        try {
            j5<C> s4 = !j5Var.q() ? j5Var.s(j5.c(v0Var.f())) : j5Var;
            if (!j5Var.r()) {
                s4 = s4.s(j5.d(v0Var.e()));
            }
            if (!s4.u()) {
                C l4 = j5Var.f55872b.l(v0Var);
                Objects.requireNonNull(l4);
                C j4 = j5Var.f55873c.j(v0Var);
                Objects.requireNonNull(j4);
                if (l4.compareTo(j4) <= 0) {
                    return new n5(s4, v0Var);
                }
            }
            return new x0(v0Var);
        } catch (NoSuchElementException e4) {
            throw new IllegalArgumentException(e4);
        }
    }

    @Override // com.google.common.collect.w3
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public o0<C> headSet(C c5) {
        c5.getClass();
        return u0(c5, false);
    }

    @Override // com.google.common.collect.w3
    @d9.c
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public o0<C> headSet(C c5, boolean z4) {
        c5.getClass();
        return u0(c5, z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.w3
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public abstract o0<C> u0(C c5, boolean z4);

    public abstract o0<C> d1(o0<C> o0Var);

    public abstract j5<C> e1();

    public abstract j5<C> f1(x xVar, x xVar2);

    @Override // com.google.common.collect.w3, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public o0<C> subSet(C c5, C c6) {
        c5.getClass();
        c6.getClass();
        com.google.common.base.l0.d(comparator().compare(c5, c6) <= 0);
        return M0(c5, true, c6, false);
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @d9.c
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public o0<C> subSet(C c5, boolean z4, C c6, boolean z5) {
        c5.getClass();
        c6.getClass();
        com.google.common.base.l0.d(comparator().compare(c5, c6) <= 0);
        return M0(c5, z4, c6, z5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.w3
    /* renamed from: j1, reason: merged with bridge method [inline-methods] */
    public abstract o0<C> M0(C c5, boolean z4, C c6, boolean z5);

    @Override // com.google.common.collect.w3, java.util.NavigableSet, java.util.SortedSet
    /* renamed from: k1, reason: merged with bridge method [inline-methods] */
    public o0<C> tailSet(C c5) {
        c5.getClass();
        return Q0(c5, true);
    }

    @Override // com.google.common.collect.w3, java.util.NavigableSet
    @d9.c
    /* renamed from: l1, reason: merged with bridge method [inline-methods] */
    public o0<C> tailSet(C c5, boolean z4) {
        c5.getClass();
        return Q0(c5, z4);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.w3
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public abstract o0<C> Q0(C c5, boolean z4);

    @Override // com.google.common.collect.w3
    @d9.c
    w3<C> n0() {
        return new t0(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return e1().toString();
    }
}
