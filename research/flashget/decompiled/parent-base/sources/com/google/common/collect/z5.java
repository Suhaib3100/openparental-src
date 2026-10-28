package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Serializable;
import java.util.Iterator;

/* compiled from: ReverseOrdering.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
final class z5<T> extends e5<T> implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    private static final long f56677e = 0;

    /* renamed from: d, reason: collision with root package name */
    final e5<? super T> f56678d;

    z5(e5<? super T> e5Var) {
        e5Var.getClass();
        this.f56678d = e5Var;
    }

    @Override // com.google.common.collect.e5
    public <E extends T> E I(Iterable<E> iterable) {
        return (E) this.f56678d.N(iterable);
    }

    @Override // com.google.common.collect.e5
    public <E extends T> E J(@f5 E e4, @f5 E e5) {
        return (E) this.f56678d.O(e4, e5);
    }

    @Override // com.google.common.collect.e5
    public <E extends T> E K(@f5 E e4, @f5 E e5, @f5 E e6, E... eArr) {
        return (E) this.f56678d.S(e4, e5, e6, eArr);
    }

    @Override // com.google.common.collect.e5
    public <E extends T> E M(Iterator<E> it) {
        return (E) this.f56678d.Y(it);
    }

    @Override // com.google.common.collect.e5
    public <E extends T> E N(Iterable<E> iterable) {
        return (E) this.f56678d.I(iterable);
    }

    @Override // com.google.common.collect.e5
    public <E extends T> E O(@f5 E e4, @f5 E e5) {
        return (E) this.f56678d.J(e4, e5);
    }

    @Override // com.google.common.collect.e5
    public <E extends T> E S(@f5 E e4, @f5 E e5, @f5 E e6, E... eArr) {
        return (E) this.f56678d.K(e4, e5, e6, eArr);
    }

    @Override // com.google.common.collect.e5
    public <E extends T> E Y(Iterator<E> it) {
        return (E) this.f56678d.M(it);
    }

    @Override // com.google.common.collect.e5, java.util.Comparator
    public int compare(@f5 T t4, @f5 T t5) {
        return this.f56678d.compare(t5, t4);
    }

    @Override // java.util.Comparator
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof z5) {
            return this.f56678d.equals(((z5) obj).f56678d);
        }
        return false;
    }

    public int hashCode() {
        return -this.f56678d.hashCode();
    }

    public String toString() {
        String valueOf = String.valueOf(this.f56678d);
        return com.google.common.base.i.a(valueOf.length() + 10, valueOf, ProtectedSandApp.s("\uf589"));
    }

    @Override // com.google.common.collect.e5
    public <S extends T> e5<S> v0() {
        return this.f56678d;
    }
}
