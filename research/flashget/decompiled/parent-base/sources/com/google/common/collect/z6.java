package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

/* compiled from: TreeMultimap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
public class z6<K, V> extends n<K, V> {

    /* renamed from: n, reason: collision with root package name */
    @d9.c
    private static final long f56679n = 0;

    /* renamed from: l, reason: collision with root package name */
    private transient Comparator<? super K> f56680l;

    /* renamed from: m, reason: collision with root package name */
    private transient Comparator<? super V> f56681m;

    z6(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        super((Map) new TreeMap(comparator));
        this.f56680l = comparator;
        this.f56681m = comparator2;
    }

    public static <K extends Comparable, V extends Comparable> z6<K, V> P() {
        x4 x4Var = x4.f56632f;
        return new z6<>(x4Var, x4Var);
    }

    public static <K extends Comparable, V extends Comparable> z6<K, V> Q(r4<? extends K, ? extends V> r4Var) {
        x4 x4Var = x4.f56632f;
        return new z6<>(x4Var, x4Var, r4Var);
    }

    public static <K, V> z6<K, V> R(Comparator<? super K> comparator, Comparator<? super V> comparator2) {
        comparator.getClass();
        comparator2.getClass();
        return new z6<>(comparator, comparator2);
    }

    @d9.c
    private void V(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator<? super K> comparator = (Comparator) objectInputStream.readObject();
        comparator.getClass();
        this.f56680l = comparator;
        Comparator<? super V> comparator2 = (Comparator) objectInputStream.readObject();
        comparator2.getClass();
        this.f56681m = comparator2;
        C(new TreeMap(this.f56680l));
        b6.d(this, objectInputStream);
    }

    @d9.c
    private void W(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(T());
        objectOutputStream.writeObject(K0());
        b6.j(this, objectOutputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e
    /* renamed from: I */
    public SortedSet<V> u() {
        return new TreeSet(this.f56681m);
    }

    @Override // com.google.common.collect.n6
    public Comparator<? super V> K0() {
        return this.f56681m;
    }

    @Override // com.google.common.collect.n, com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: O, reason: merged with bridge method [inline-methods] */
    public NavigableMap<K, Collection<V>> f() {
        return (NavigableMap) super.f();
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    @d9.c
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public NavigableSet<V> v(@f5 K k4) {
        return (NavigableSet) super.v((z6<K, V>) k4);
    }

    @Deprecated
    public Comparator<? super K> T() {
        return this.f56680l;
    }

    @Override // com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ boolean T2(@zc.a Object obj, @zc.a Object obj2) {
        return super.T2(obj, obj2);
    }

    @Override // com.google.common.collect.n, com.google.common.collect.h, com.google.common.collect.r4
    /* renamed from: U, reason: merged with bridge method [inline-methods] */
    public NavigableSet<K> keySet() {
        return (NavigableSet) super.keySet();
    }

    @Override // com.google.common.collect.e, com.google.common.collect.h
    Map<K, Collection<V>> a() {
        return w();
    }

    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ SortedSet b(@zc.a Object obj) {
        return super.b(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.p, com.google.common.collect.m, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4, com.google.common.collect.k4
    @f9.a
    public /* bridge */ /* synthetic */ SortedSet c(@f5 Object obj, Iterable iterable) {
        return super.c((z6<K, V>) obj, iterable);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.e
    Collection<V> v(@f5 K k4) {
        if (k4 == 0) {
            T().compare(k4, k4);
        }
        return u();
    }

    @Override // com.google.common.collect.p, com.google.common.collect.e, com.google.common.collect.h, com.google.common.collect.r4
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    private z6(Comparator<? super K> comparator, Comparator<? super V> comparator2, r4<? extends K, ? extends V> r4Var) {
        this(comparator, comparator2);
        n0(r4Var);
    }
}
