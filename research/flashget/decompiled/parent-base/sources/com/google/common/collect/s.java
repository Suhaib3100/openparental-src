package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayListMultimap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public final class s<K, V> extends t<K, V> {

    /* renamed from: l, reason: collision with root package name */
    private static final int f56371l = 3;

    /* renamed from: m, reason: collision with root package name */
    @d9.c
    private static final long f56372m = 0;

    /* renamed from: k, reason: collision with root package name */
    @d9.d
    transient int f56373k;

    private s(int i4, int i5) {
        super(d0.z(i4));
        b0.b(i5, ProtectedSandApp.s("\uf54c"));
        this.f56373k = i5;
    }

    public static <K, V> s<K, V> I() {
        return new s<>();
    }

    public static <K, V> s<K, V> J(int i4, int i5) {
        return new s<>(i4, i5);
    }

    public static <K, V> s<K, V> K(r4<? extends K, ? extends V> r4Var) {
        return new s<>(r4Var);
    }

    @d9.c
    private void L(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f56373k = 3;
        int readInt = objectInputStream.readInt();
        C(d0.u());
        b6.e(this, objectInputStream, readInt);
    }

    @d9.c
    private void N(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        b6.j(this, objectOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.d, com.google.common.collect.e
    /* renamed from: G */
    public List<V> u() {
        return new ArrayList(this.f56373k);
    }

    @Deprecated
    public void M() {
        Iterator<Collection<V>> it = t().values().iterator();
        while (it.hasNext()) {
            ((ArrayList) it.next()).trimToSize();
        }
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean T2(@zc.a Object obj, @zc.a Object obj2) {
        return super.T2(obj, obj2);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ List b(@zc.a Object obj) {
        return super.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ List c(@f5 Object obj, Iterable iterable) {
        return super.c((s<K, V>) obj, iterable);
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

    @Override // com.google.common.collect.d, com.google.common.collect.h, com.google.common.collect.r4
    public boolean equals(@zc.a Object obj) {
        return t4.g(this, obj);
    }

    @Override // com.google.common.collect.d, com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Map f() {
        return super.f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.d, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    /* renamed from: get */
    public /* bridge */ /* synthetic */ List v(@f5 Object obj) {
        return super.v((s<K, V>) obj);
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: h */
    public /* bridge */ /* synthetic */ Collection t() {
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
    @Override // com.google.common.collect.d, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
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

    @Override // com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private s() {
        this(12, 3);
    }

    private s(r4<? extends K, ? extends V> r4Var) {
        this(r4Var.keySet().size(), r4Var instanceof s ? ((s) r4Var).f56373k : 3);
        super.n0(r4Var);
    }
}
