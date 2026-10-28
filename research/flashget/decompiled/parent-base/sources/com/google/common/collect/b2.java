package com.google.common.collect;

import com.google.common.collect.p4;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingMap.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class b2<K, V> extends h2 implements Map<K, V> {

    /* compiled from: ForwardingMap.java */
    @d9.a
    protected abstract class a extends p4.s<K, V> {
        public a() {
        }

        @Override // com.google.common.collect.p4.s
        Map<K, V> i() {
            return b2.this;
        }
    }

    /* compiled from: ForwardingMap.java */
    @d9.a
    protected class b extends p4.b0<K, V> {
        public b(b2 b2Var) {
            super(b2Var);
        }
    }

    /* compiled from: ForwardingMap.java */
    @d9.a
    protected class c extends p4.q0<K, V> {
        public c(b2 b2Var) {
            super(b2Var);
        }
    }

    protected b2() {
    }

    protected void A3() {
        d4.h(entrySet().iterator());
    }

    @d9.a
    protected boolean E3(@zc.a Object obj) {
        return p4.q(this, obj);
    }

    protected boolean F3(@zc.a Object obj) {
        return p4.r(this, obj);
    }

    protected boolean L3(@zc.a Object obj) {
        return p4.w(this, obj);
    }

    protected int M3() {
        return d6.k(entrySet());
    }

    protected boolean N3() {
        return !entrySet().iterator().hasNext();
    }

    protected void O3(Map<? extends K, ? extends V> map) {
        p4.j0(this, map);
    }

    @d9.a
    @zc.a
    protected V P3(@zc.a Object obj) {
        Iterator<Map.Entry<K, V>> it = entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (com.google.common.base.f0.a(next.getKey(), obj)) {
                V value = next.getValue();
                it.remove();
                return value;
            }
        }
        return null;
    }

    protected String Q3() {
        return p4.w0(this);
    }

    public void clear() {
        u3().clear();
    }

    @Override // java.util.Map
    public boolean containsKey(@zc.a Object obj) {
        return u3().containsKey(obj);
    }

    public boolean containsValue(@zc.a Object obj) {
        return u3().containsValue(obj);
    }

    public Set<Map.Entry<K, V>> entrySet() {
        return u3().entrySet();
    }

    @Override // java.util.Map
    public boolean equals(@zc.a Object obj) {
        return obj == this || u3().equals(obj);
    }

    @Override // java.util.Map
    @zc.a
    public V get(@zc.a Object obj) {
        return u3().get(obj);
    }

    @Override // java.util.Map
    public int hashCode() {
        return u3().hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return u3().isEmpty();
    }

    public Set<K> keySet() {
        return u3().keySet();
    }

    @zc.a
    @f9.a
    public V put(@f5 K k4, @f5 V v4) {
        return u3().put(k4, v4);
    }

    public void putAll(Map<? extends K, ? extends V> map) {
        u3().putAll(map);
    }

    @zc.a
    @f9.a
    public V remove(@zc.a Object obj) {
        return u3().remove(obj);
    }

    @Override // java.util.Map
    public int size() {
        return u3().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h2
    /* renamed from: v3 */
    public abstract Map<K, V> u3();

    public Collection<V> values() {
        return u3().values();
    }
}
