package dagger.internal;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: LazyClassKeyMap.java */
/* loaded from: classes7.dex */
public final class n<V> implements Map<Class<?>, V> {

    /* renamed from: b, reason: collision with root package name */
    private final Map<String, V> f73686b;

    /* compiled from: LazyClassKeyMap.java */
    public static class a<V> implements t<Map<Class<?>, V>> {

        /* renamed from: a, reason: collision with root package name */
        p<String, V> f73687a;

        private a(p<String, V> pVar) {
            this.f73687a = pVar;
        }

        public static <V> a<V> b(p<String, V> pVar) {
            return new a<>(pVar);
        }

        @Override // cd.c
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Class<?>, V> get() {
            return n.b(this.f73687a.get());
        }
    }

    private n(Map<String, V> map) {
        this.f73686b = map;
    }

    public static <V> Map<Class<?>, V> b(Map<String, V> map) {
        return new n(map);
    }

    @Override // java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public V put(Class<?> cls, V v4) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("彴\u0001"));
    }

    @Override // java.util.Map
    public void clear() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("彴\u0001"));
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        if (obj instanceof Class) {
            return this.f73686b.containsKey(((Class) obj).getName());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("彵\u0001"));
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f73686b.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<Class<?>, V>> entrySet() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("彶\u0001"));
    }

    @Override // java.util.Map
    public V get(Object obj) {
        if (obj instanceof Class) {
            return this.f73686b.get(((Class) obj).getName());
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("彵\u0001"));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f73686b.isEmpty();
    }

    @Override // java.util.Map
    public Set<Class<?>> keySet() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("彷\u0001"));
    }

    @Override // java.util.Map
    public void putAll(Map<? extends Class<?>, ? extends V> map) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("彴\u0001"));
    }

    @Override // java.util.Map
    public V remove(Object obj) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("彴\u0001"));
    }

    @Override // java.util.Map
    public int size() {
        return this.f73686b.size();
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return this.f73686b.values();
    }
}
