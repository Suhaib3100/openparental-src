package com.google.common.collect;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

/* compiled from: CompactLinkedHashSet.java */
@w0
@d9.c
/* loaded from: classes6.dex */
class h0<E> extends e0<E> {

    /* renamed from: m, reason: collision with root package name */
    private static final int f55784m = -2;

    /* renamed from: i, reason: collision with root package name */
    @zc.a
    private transient int[] f55785i;

    /* renamed from: j, reason: collision with root package name */
    @zc.a
    private transient int[] f55786j;

    /* renamed from: k, reason: collision with root package name */
    private transient int f55787k;

    /* renamed from: l, reason: collision with root package name */
    private transient int f55788l;

    h0() {
    }

    public static <E> h0<E> a0() {
        return new h0<>();
    }

    public static <E> h0<E> b0(Collection<? extends E> collection) {
        h0<E> h0Var = new h0<>(collection.size());
        h0Var.addAll(collection);
        return h0Var;
    }

    @SafeVarargs
    public static <E> h0<E> d0(E... eArr) {
        h0<E> h0Var = new h0<>(eArr.length);
        Collections.addAll(h0Var, eArr);
        return h0Var;
    }

    public static <E> h0<E> e0(int i4) {
        return new h0<>(i4);
    }

    private int f0(int i4) {
        return g0()[i4] - 1;
    }

    private int[] g0() {
        int[] iArr = this.f55785i;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private int[] h0() {
        int[] iArr = this.f55786j;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private void i0(int i4, int i5) {
        g0()[i4] = i5 + 1;
    }

    private void j0(int i4, int i5) {
        if (i4 == -2) {
            this.f55787k = i5;
        } else {
            k0(i4, i5);
        }
        if (i5 == -2) {
            this.f55788l = i4;
        } else {
            i0(i5, i4);
        }
    }

    private void k0(int i4, int i5) {
        h0()[i4] = i5 + 1;
    }

    @Override // com.google.common.collect.e0
    void F(int i4) {
        super.F(i4);
        this.f55787k = -2;
        this.f55788l = -2;
    }

    @Override // com.google.common.collect.e0
    void G(int i4, @f5 E e4, int i5, int i6) {
        super.G(i4, e4, i5, i6);
        j0(this.f55788l, i4);
        j0(i4, -2);
    }

    @Override // com.google.common.collect.e0
    void I(int i4, int i5) {
        int size = size() - 1;
        super.I(i4, i5);
        j0(f0(i4), x(i4));
        if (i4 < size) {
            j0(f0(size), i4);
            j0(i4, x(size));
        }
        g0()[size] = 0;
        h0()[size] = 0;
    }

    @Override // com.google.common.collect.e0
    void R(int i4) {
        super.R(i4);
        this.f55785i = Arrays.copyOf(g0(), i4);
        this.f55786j = Arrays.copyOf(h0(), i4);
    }

    @Override // com.google.common.collect.e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (K()) {
            return;
        }
        this.f55787k = -2;
        this.f55788l = -2;
        int[] iArr = this.f55785i;
        if (iArr != null && this.f55786j != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f55786j, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.e0
    int f(int i4, int i5) {
        return i4 >= size() ? i5 : i4;
    }

    @Override // com.google.common.collect.e0
    int h() {
        int h4 = super.h();
        this.f55785i = new int[h4];
        this.f55786j = new int[h4];
        return h4;
    }

    @Override // com.google.common.collect.e0
    @f9.a
    Set<E> i() {
        Set<E> i4 = super.i();
        this.f55785i = null;
        this.f55786j = null;
        return i4;
    }

    @Override // com.google.common.collect.e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return b5.l(this);
    }

    @Override // com.google.common.collect.e0
    int w() {
        return this.f55787k;
    }

    @Override // com.google.common.collect.e0
    int x(int i4) {
        return h0()[i4] - 1;
    }

    h0(int i4) {
        super(i4);
    }

    @Override // com.google.common.collect.e0, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) b5.m(this, tArr);
    }
}
