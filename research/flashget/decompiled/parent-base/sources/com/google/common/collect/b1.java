package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: EnumHashBiMap.java */
@w0
@d9.b(emulated = true)
/* loaded from: classes6.dex */
public final class b1<K extends Enum<K>, V> extends a<K, V> {

    /* renamed from: i, reason: collision with root package name */
    @d9.c
    private static final long f55374i = 0;

    /* renamed from: h, reason: collision with root package name */
    private transient Class<K> f55375h;

    private b1(Class<K> cls) {
        super(new EnumMap(cls), p4.a0(cls.getEnumConstants().length));
        this.f55375h = cls;
    }

    public static <K extends Enum<K>, V> b1<K, V> g4(Class<K> cls) {
        return new b1<>(cls);
    }

    public static <K extends Enum<K>, V> b1<K, V> h4(Map<K, ? extends V> map) {
        b1<K, V> b1Var = new b1<>(a1.j4(map));
        super.putAll(map);
        return b1Var;
    }

    @d9.c
    private void l4(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        this.f55375h = (Class) objectInputStream.readObject();
        c4(new EnumMap(this.f55375h), new HashMap((this.f55375h.getEnumConstants().length * 3) / 2));
        b6.b(this, objectInputStream);
    }

    @d9.c
    private void m4(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f55375h);
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

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.w
    @zc.a
    @f9.a
    public Object a2(Object obj, @f5 Object obj2) {
        return super.a2((Enum) obj, obj2);
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

    @zc.a
    @f9.a
    public V i4(K k4, @f5 V v4) {
        return (V) super.a2(k4, v4);
    }

    public Class<K> j4() {
        return this.f55375h;
    }

    @zc.a
    @f9.a
    public V k4(K k4, @f5 V v4) {
        return (V) super.put(k4, v4);
    }

    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map
    public /* bridge */ /* synthetic */ Set keySet() {
        return super.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.a, com.google.common.collect.b2, java.util.Map, com.google.common.collect.w
    @zc.a
    @f9.a
    public Object put(Object obj, @f5 Object obj2) {
        return super.put((Enum) obj, obj2);
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
