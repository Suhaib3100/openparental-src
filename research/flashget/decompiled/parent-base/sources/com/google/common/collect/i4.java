package com.google.common.collect;

import java.util.Set;

/* compiled from: LinkedHashMultiset.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public final class i4<E> extends f<E> {
    i4(int i4) {
        super(i4);
    }

    public static <E> i4<E> q() {
        return new i4<>(3);
    }

    public static <E> i4<E> r(int i4) {
        return new i4<>(i4);
    }

    public static <E> i4<E> s(Iterable<? extends E> iterable) {
        i4<E> i4Var = new i4<>(v4.l(iterable));
        c4.a(i4Var, iterable);
        return i4Var;
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.u4
    public /* bridge */ /* synthetic */ boolean contains(@zc.a Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6, com.google.common.collect.l6
    public /* bridge */ /* synthetic */ Set d() {
        return super.d();
    }

    @Override // com.google.common.collect.i, com.google.common.collect.u4, com.google.common.collect.k6
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.i, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.f
    c5<E> l(int i4) {
        return new d5(i4);
    }
}
