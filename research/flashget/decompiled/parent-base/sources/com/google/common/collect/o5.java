package com.google.common.collect;

/* compiled from: RegularImmutableAsList.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
class o5<E> extends y2<E> {

    /* renamed from: d, reason: collision with root package name */
    private final b3<E> f56073d;

    /* renamed from: e, reason: collision with root package name */
    private final f3<? extends E> f56074e;

    o5(b3<E> b3Var, f3<? extends E> f3Var) {
        this.f56073d = b3Var;
        this.f56074e = f3Var;
    }

    @Override // com.google.common.collect.f3, java.util.List
    /* renamed from: G */
    public f7<E> listIterator(int i4) {
        return this.f56074e.listIterator(i4);
    }

    @Override // com.google.common.collect.f3, com.google.common.collect.b3
    @d9.c
    int c(Object[] objArr, int i4) {
        return this.f56074e.c(objArr, i4);
    }

    @Override // com.google.common.collect.b3
    @zc.a
    Object[] f() {
        return this.f56074e.f();
    }

    @Override // com.google.common.collect.y2
    b3<E> f0() {
        return this.f56073d;
    }

    f3<? extends E> g0() {
        return this.f56074e;
    }

    @Override // java.util.List
    public E get(int i4) {
        return this.f56074e.get(i4);
    }

    @Override // com.google.common.collect.b3
    int h() {
        return this.f56074e.h();
    }

    @Override // com.google.common.collect.b3
    int i() {
        return this.f56074e.i();
    }

    o5(b3<E> b3Var, Object[] objArr, int i4) {
        this(b3Var, f3.q(objArr, i4));
    }

    o5(b3<E> b3Var, Object[] objArr) {
        this(b3Var, f3.q(objArr, objArr.length));
    }
}
