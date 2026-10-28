package androidx.content.preferences.protobuf;

import androidx.content.preferences.protobuf.p1;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite.java */
/* loaded from: classes3.dex */
public final class c2<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: c, reason: collision with root package name */
    private static final c2 f28661c;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28662b;

    static {
        c2 c2Var = new c2();
        f28661c = c2Var;
        c2Var.f28662b = false;
    }

    private c2() {
        this.f28662b = true;
    }

    static <K, V> int b(Map<K, V> map) {
        int i4 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i4 += c(entry.getValue()) ^ c(entry.getKey());
        }
        return i4;
    }

    private static int c(Object obj) {
        if (obj instanceof byte[]) {
            return p1.m((byte[]) obj);
        }
        if (obj instanceof p1.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void d(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            p1.d(obj);
            map.get(obj).getClass();
        }
    }

    private static Object e(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> Map<K, V> f(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), e(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> c2<K, V> i() {
        return f28661c;
    }

    private void k() {
        if (!this.f28662b) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean l(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean m(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !l(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        k();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && m(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return b(this);
    }

    public boolean n() {
        return this.f28662b;
    }

    public void o() {
        this.f28662b = false;
    }

    public void p(c2<K, V> c2Var) {
        k();
        if (c2Var.isEmpty()) {
            return;
        }
        putAll(c2Var);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k4, V v4) {
        k();
        p1.d(k4);
        v4.getClass();
        return (V) super.put(k4, v4);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        k();
        d(map);
        super.putAll(map);
    }

    public c2<K, V> q() {
        return isEmpty() ? new c2<>() : new c2<>(this);
    }

    public V r(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        k();
        return (V) super.remove(obj);
    }

    private c2(Map<K, V> map) {
        super(map);
        this.f28662b = true;
    }
}
