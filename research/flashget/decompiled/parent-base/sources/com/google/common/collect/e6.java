package com.google.common.collect;

import com.google.common.collect.d4;

/* compiled from: SingletonImmutableSet.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
final class e6<E> extends q3<E> {

    /* renamed from: g, reason: collision with root package name */
    final transient E f55691g;

    e6(E e4) {
        e4.getClass();
        this.f55691g = e4;
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3
    public f3<E> b() {
        return f3.I(this.f55691g);
    }

    @Override // com.google.common.collect.b3
    int c(Object[] objArr, int i4) {
        objArr[i4] = this.f55691g;
        return i4 + 1;
    }

    @Override // com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection
    public boolean contains(@zc.a Object obj) {
        return this.f55691g.equals(obj);
    }

    @Override // com.google.common.collect.q3, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f55691g.hashCode();
    }

    @Override // com.google.common.collect.b3
    boolean j() {
        return false;
    }

    @Override // com.google.common.collect.q3, com.google.common.collect.b3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: l */
    public e7<E> iterator() {
        return new d4.k(this.f55691g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        String obj = this.f55691g.toString();
        StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(obj, 2));
        sb.append('[');
        sb.append(obj);
        sb.append(']');
        return sb.toString();
    }
}
