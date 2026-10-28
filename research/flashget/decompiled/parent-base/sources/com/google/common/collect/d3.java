package com.google.common.collect;

import com.google.common.collect.h3;
import com.google.common.collect.p4;
import java.io.Serializable;
import java.lang.Enum;
import java.util.EnumMap;
import java.util.Map;

/* compiled from: ImmutableEnumMap.java */
@w0
@d9.b(emulated = true, serializable = true)
/* loaded from: classes6.dex */
final class d3<K extends Enum<K>, V> extends h3.c<K, V> {

    /* renamed from: g, reason: collision with root package name */
    private final transient EnumMap<K, V> f55536g;

    /* compiled from: ImmutableEnumMap.java */
    private static class b<K extends Enum<K>, V> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f55537c = 0;

        /* renamed from: b, reason: collision with root package name */
        final EnumMap<K, V> f55538b;

        b(EnumMap<K, V> enumMap) {
            this.f55538b = enumMap;
        }

        Object a() {
            return new d3(this.f55538b);
        }
    }

    static <K extends Enum<K>, V> h3<K, V> J(EnumMap<K, V> enumMap) {
        int size = enumMap.size();
        if (size == 0) {
            return (h3<K, V>) r5.f56307o;
        }
        if (size != 1) {
            return new d3(enumMap);
        }
        Map.Entry entry = (Map.Entry) c4.z(enumMap.entrySet());
        return h3.u((Enum) entry.getKey(), entry.getValue());
    }

    @Override // com.google.common.collect.h3
    Object H() {
        return new b(this.f55536g);
    }

    @Override // com.google.common.collect.h3.c
    e7<Map.Entry<K, V>> I() {
        return new p4.l(this.f55536g.entrySet().iterator());
    }

    @Override // com.google.common.collect.h3, java.util.Map
    public boolean containsKey(@zc.a Object obj) {
        return this.f55536g.containsKey(obj);
    }

    @Override // com.google.common.collect.h3, java.util.Map
    public boolean equals(@zc.a Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d3) {
            obj = ((d3) obj).f55536g;
        }
        return this.f55536g.equals(obj);
    }

    @Override // com.google.common.collect.h3, java.util.Map
    @zc.a
    public V get(@zc.a Object obj) {
        return this.f55536g.get(obj);
    }

    @Override // com.google.common.collect.h3
    boolean p() {
        return false;
    }

    @Override // com.google.common.collect.h3
    e7<K> q() {
        return d4.f0(this.f55536g.keySet().iterator());
    }

    @Override // java.util.Map
    public int size() {
        return this.f55536g.size();
    }

    private d3(EnumMap<K, V> enumMap) {
        this.f55536g = enumMap;
        com.google.common.base.l0.d(!enumMap.isEmpty());
    }
}
