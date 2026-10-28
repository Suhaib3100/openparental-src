package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: HashMultimap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public final class u2<K, V> extends v2<K, V> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f56541l = 2;

    /* renamed from: m, reason: collision with root package name */
    @d9.c
    private static final long f56542m = 0;

    /* renamed from: k, reason: collision with root package name */
    @d9.d
    transient int f56543k;

    private u2(int i4, int i5) {
        super(d0.z(i4));
        this.f56543k = 2;
        com.google.common.base.l0.d(i5 >= 0);
        this.f56543k = i5;
    }

    public static <K, V> u2<K, V> I() {
        return new u2<>();
    }

    public static <K, V> u2<K, V> J(int i4, int i5) {
        return new u2<>(i4, i5);
    }

    public static <K, V> u2<K, V> K(r4<? extends K, ? extends V> r4Var) {
        return new u2<>(r4Var);
    }

    @d9.c
    private void L(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f56543k = 2;
        int readInt = objectInputStream.readInt();
        C(d0.z(12));
        b6.e(this, objectInputStream, readInt);
    }

    @d9.c
    private void M(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        b6.j(this, objectOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m
    /* renamed from: G */
    public Set<V> u() {
        return e0.q(this.f56543k);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean T2(@zc.a Object obj, @zc.a Object obj2) {
        return super.T2(obj, obj2);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Set b(@zc.a Object obj) {
        return super.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ Set c(@f5 Object obj, Iterable iterable) {
        return super.c((u2<K, V>) obj, iterable);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean containsKey(@zc.a Object obj) {
        return super.containsKey(obj);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean containsValue(@zc.a Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.r4
    public boolean equals(@zc.a Object obj) {
        return t4.g(this, obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Map f() {
        return super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public /* bridge */ /* synthetic */ Set v(@f5 Object obj) {
        return super.v((u2<K, V>) obj);
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: h */
    public /* bridge */ /* synthetic */ Set t() {
        return super.t();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean k1(@f5 Object obj, Iterable iterable) {
        return super.k1(obj, iterable);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ u4 keys() {
        return super.keys();
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean n0(r4 r4Var) {
        return super.n0(r4Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean put(@f5 Object obj, @f5 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    @f9.a
    public /* bridge */ /* synthetic */ boolean remove(@zc.a Object obj, @zc.a Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.h
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.m, com.google.common.collect.e
    Collection u() {
        return e0.q(this.f56543k);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private u2() {
        this(12, 2);
    }

    private u2(r4<? extends K, ? extends V> r4Var) {
        super(d0.z(r4Var.keySet().size()));
        this.f56543k = 2;
        super.n0(r4Var);
    }
}
