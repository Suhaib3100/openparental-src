package com.google.common.collect;

import com.google.common.collect.u4;
import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;

/* compiled from: RegularImmutableSortedMultiset.java */
@w0
@d9.c
/* loaded from: classes6.dex */
final class u5<E> extends u3<E> {

    /* renamed from: j, reason: collision with root package name */
    private static final long[] f56553j = {0};

    /* renamed from: k, reason: collision with root package name */
    static final u3<Comparable> f56554k = new u5(x4.f56632f);

    /* renamed from: f, reason: collision with root package name */
    @d9.d
    final transient v5<E> f56555f;

    /* renamed from: g, reason: collision with root package name */
    private final transient long[] f56556g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f56557h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f56558i;

    u5(Comparator<? super E> comparator) {
        this.f56555f = w3.r0(comparator);
        this.f56556g = f56553j;
        this.f56557h = 0;
        this.f56558i = 0;
    }

    private int y0(int i4) {
        long[] jArr = this.f56556g;
        int i5 = this.f56557h;
        return (int) (jArr[(i5 + i4) + 1] - jArr[i5 + i4]);
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.m3
    /* renamed from: A */
    public q3 d() {
        return this.f56555f;
    }

    @Override // com.google.common.collect.m3
    u4.a<E> F(int i4) {
        return v4.k(this.f56555f.b().get(i4), y0(i4));
    }

    @Override // com.google.common.collect.u4
    public int W2(@zc.a Object obj) {
        int indexOf = this.f56555f.indexOf(obj);
        if (indexOf >= 0) {
            return y0(indexOf);
        }
        return 0;
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.m3, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public NavigableSet d() {
        return this.f56555f;
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return F(0);
    }

    @Override // com.google.common.collect.u3
    /* renamed from: i0 */
    public w3<E> d() {
        return this.f56555f;
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return this.f56557h > 0 || this.f56558i < this.f56556g.length - 1;
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.k6
    /* renamed from: k0 */
    public u3<E> N2(E e4, x xVar) {
        v5<E> v5Var = this.f56555f;
        xVar.getClass();
        return z0(0, v5Var.V0(e4, xVar == x.CLOSED));
    }

    @Override // com.google.common.collect.k6
    @zc.a
    public u4.a<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return F(this.f56558i - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public int size() {
        long[] jArr = this.f56556g;
        int i4 = this.f56557h;
        return com.google.common.primitives.l.x(jArr[this.f56558i + i4] - jArr[i4]);
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.k6
    /* renamed from: x0 */
    public u3<E> d3(E e4, x xVar) {
        v5<E> v5Var = this.f56555f;
        xVar.getClass();
        return z0(v5Var.W0(e4, xVar == x.CLOSED), this.f56558i);
    }

    u3<E> z0(int i4, int i5) {
        com.google.common.base.l0.f0(i4, i5, this.f56558i);
        return i4 == i5 ? u3.j0(comparator()) : (i4 == 0 && i5 == this.f56558i) ? this : new u5(this.f56555f.U0(i4, i5), this.f56556g, this.f56557h + i4, i5 - i4);
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.m3, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public Set d() {
        return this.f56555f;
    }

    @Override // com.google.common.collect.u3, com.google.common.collect.m3, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public SortedSet d() {
        return this.f56555f;
    }

    u5(v5<E> v5Var, long[] jArr, int i4, int i5) {
        this.f56555f = v5Var;
        this.f56556g = jArr;
        this.f56557h = i4;
        this.f56558i = i5;
    }
}
