package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: ReverseNaturalOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class y5 extends e5<Comparable<?>> implements Serializable {

    /* renamed from: d, reason: collision with root package name */
    static final y5 f56654d = new y5();

    /* renamed from: e, reason: collision with root package name */
    private static final long f56655e = 0;

    private y5() {
    }

    private Object H0() {
        return f56654d;
    }

    @Override // com.google.common.collect.e5
    /* renamed from: A0, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E K(E e4, E e5, E e6, E... eArr) {
        return (E) x4.f56632f.S(e4, e5, e6, eArr);
    }

    @Override // com.google.common.collect.e5
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E I(Iterable<E> iterable) {
        return (E) x4.f56632f.N(iterable);
    }

    @Override // com.google.common.collect.e5
    /* renamed from: C0, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E M(Iterator<E> it) {
        return (E) x4.f56632f.Y(it);
    }

    @Override // com.google.common.collect.e5
    /* renamed from: D0, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E O(E e4, E e5) {
        return (E) x4.f56632f.J(e4, e5);
    }

    @Override // com.google.common.collect.e5
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E S(E e4, E e5, E e6, E... eArr) {
        return (E) x4.f56632f.K(e4, e5, e6, eArr);
    }

    @Override // com.google.common.collect.e5
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E N(Iterable<E> iterable) {
        return (E) x4.f56632f.I(iterable);
    }

    @Override // com.google.common.collect.e5
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E Y(Iterator<E> it) {
        return (E) x4.f56632f.M(it);
    }

    public String toString() {
        return ProtectedSandApp.s("\uf584");
    }

    @Override // com.google.common.collect.e5
    public <S extends Comparable<?>> e5<S> v0() {
        return x4.f56632f;
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    /* renamed from: y0, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        comparable.getClass();
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }

    @Override // com.google.common.collect.e5
    /* renamed from: z0, reason: merged with bridge method [inline-methods] */
    public <E extends Comparable<?>> E J(E e4, E e5) {
        return (E) x4.f56632f.O(e4, e5);
    }
}
