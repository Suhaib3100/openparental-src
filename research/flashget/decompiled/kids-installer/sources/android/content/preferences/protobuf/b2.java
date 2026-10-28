package android.content.preferences.protobuf;

import android.content.preferences.protobuf.o1;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: MapFieldLite.java */
/* loaded from: classes.dex */
public final class b2<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: p, reason: collision with root package name */
    private static final b2 f7184p;

    /* renamed from: o, reason: collision with root package name */
    private boolean f7185o;

    static {
        b2 b2Var = new b2();
        f7184p = b2Var;
        b2Var.f7185o = false;
    }

    private b2() {
        this.f7185o = true;
    }

    static <K, V> int c(Map<K, V> map) {
        int i5 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i5 += d(entry.getValue()) ^ d(entry.getKey());
        }
        return i5;
    }

    private static int d(Object obj) {
        if (obj instanceof byte[]) {
            return o1.m((byte[]) obj);
        }
        if (obj instanceof o1.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void e(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            o1.d(obj);
            map.get(obj).getClass();
        }
    }

    private static Object f(Object obj) {
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        return Arrays.copyOf(bArr, bArr.length);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <K, V> Map<K, V> j(Map<K, V> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), f(entry.getValue()));
        }
        return linkedHashMap;
    }

    public static <K, V> b2<K, V> k() {
        return f7184p;
    }

    private void l() {
        if (!this.f7185o) {
            throw new UnsupportedOperationException();
        }
    }

    private static boolean m(Object obj, Object obj2) {
        return ((obj instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) obj, (byte[]) obj2) : obj.equals(obj2);
    }

    static <K, V> boolean n(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey()) || !m(entry.getValue(), map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        l();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && n(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return c(this);
    }

    public boolean p() {
        return this.f7185o;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k5, V v5) {
        l();
        o1.d(k5);
        v5.getClass();
        return (V) super.put(k5, v5);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        l();
        e(map);
        super.putAll(map);
    }

    public void q() {
        this.f7185o = false;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        l();
        return (V) super.remove(obj);
    }

    public void s(b2<K, V> b2Var) {
        l();
        if (b2Var.isEmpty()) {
            return;
        }
        putAll(b2Var);
    }

    public b2<K, V> u() {
        return isEmpty() ? new b2<>() : new b2<>(this);
    }

    public V v(Map.Entry<K, V> entry) {
        return put(entry.getKey(), entry.getValue());
    }

    private b2(Map<K, V> map) {
        super(map);
        this.f7185o = true;
    }
}
