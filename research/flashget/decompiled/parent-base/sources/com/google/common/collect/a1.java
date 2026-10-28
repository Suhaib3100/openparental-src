package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

/* compiled from: EnumBiMap.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class a1<K extends Enum<K>, V extends Enum<V>> extends a<K, V> {

    /* renamed from: j, reason: collision with root package name */
    @d9.c
    private static final long f55341j = 0;

    /* renamed from: h, reason: collision with root package name */
    private transient Class<K> f55342h;

    /* renamed from: i, reason: collision with root package name */
    private transient Class<V> f55343i;

    private a1(Class<K> cls, Class<V> cls2) {
        super(new EnumMap(cls), new EnumMap(cls2));
        this.f55342h = cls;
        this.f55343i = cls2;
    }

    public static <K extends Enum<K>, V extends Enum<V>> a1<K, V> h4(Class<K> cls, Class<V> cls2) {
        return new a1<>(cls, cls2);
    }

    public static <K extends Enum<K>, V extends Enum<V>> a1<K, V> i4(Map<K, V> map) {
        a1<K, V> a1Var = new a1<>(j4(map), k4(map));
        super.putAll(map);
        return a1Var;
    }

    static <K extends Enum<K>> Class<K> j4(Map<K, ?> map) {
        if (map instanceof a1) {
            return ((a1) map).f55342h;
        }
        if (map instanceof b1) {
            return ((b1) map).j4();
        }
        com.google.common.base.l0.d(!map.isEmpty());
        return map.keySet().iterator().next().getDeclaringClass();
    }

    private static <V extends Enum<V>> Class<V> k4(Map<?, V> map) {
        if (map instanceof a1) {
            return ((a1) map).f55343i;
        }
        com.google.common.base.l0.d(!map.isEmpty());
        return map.values().iterator().next().getDeclaringClass();
    }

    @d9.c
    private void m4(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f55342h = (Class) objectInputStream.readObject();
        this.f55343i = (Class) objectInputStream.readObject();
        c4(new EnumMap(this.f55342h), new EnumMap(this.f55343i));
        b6.b(this, objectInputStream);
    }

    @d9.c
    private void o4(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f55342h);
        objectOutputStream.writeObject(this.f55343i);
        b6.i(this, objectOutputStream);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w
    public w M2() {
        return this.f55326c;
    }

    @Override // com.google.common.collect.a
    Object V3(Object obj) {
        Enum r12 = (Enum) obj;
        r12.getClass();
        return r12;
    }

    @Override // com.google.common.collect.a
    Object W3(Object obj) {
        Enum r12 = (Enum) obj;
        r12.getClass();
        return r12;
    }

    @Override // com.google.common.collect.a, com.google.common.collect.w
    @zc.a
    @f9.a
    public /* bridge */ /* synthetic */ Object a2(@f5 Object obj, @f5 Object obj2) {
        return super.a2(obj, obj2);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map
    public boolean containsValue(@zc.a Object obj) {
        return this.f55326c.containsKey(obj);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    K f4(K k4) {
        k4.getClass();
        return k4;
    }

    V g4(V v4) {
        v4.getClass();
        return v4;
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    public Class<K> l4() {
        return this.f55342h;
    }

    public Class<V> n4() {
        return this.f55343i;
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    @zc.a
    @f9.a
    public /* bridge */ /* synthetic */ Object put(@f5 Object obj, @f5 Object obj2) {
        return super.put(obj, obj2);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    public /* bridge */ /* synthetic */ void putAll(Map map) {
        super.putAll(map);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map
    @zc.a
    @f9.a
    public /* bridge */ /* synthetic */ Object remove(@zc.a Object obj) {
        return super.remove(obj);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    public /* bridge */ /* synthetic */ Set values() {
        return super.values();
    }
}
