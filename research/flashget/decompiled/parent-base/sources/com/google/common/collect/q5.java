package com.google.common.collect;

import java.util.Objects;

/* compiled from: RegularImmutableList.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
class q5<E> extends f3<E> {

    /* renamed from: f, reason: collision with root package name */
    static final f3<Object> f56234f = new q5(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    @d9.d
    final transient Object[] f56235d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f56236e;

    q5(Object[] objArr, int i4) {
        this.f56235d = objArr;
        this.f56236e = i4;
    }

    @Override // com.google.common.collect.f3, com.google.common.collect.b3
    int c(Object[] objArr, int i4) {
        System.arraycopy(this.f56235d, 0, objArr, i4, this.f56236e);
        return i4 + this.f56236e;
    }

    @Override // com.google.common.collect.b3
    Object[] f() {
        return this.f56235d;
    }

    @Override // java.util.List
    public E get(int i4) {
        com.google.common.base.l0.C(i4, this.f56236e);
        E e4 = (E) this.f56235d[i4];
        Objects.requireNonNull(e4);
        return e4;
    }

    @Override // com.google.common.collect.b3
    int h() {
        return this.f56236e;
    }

    @Override // com.google.common.collect.b3
    int i() {
        return 0;
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f56236e;
    }
}
