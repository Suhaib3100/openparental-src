package com.google.common.collect;

import com.google.common.collect.s6;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ForwardingTable.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public abstract class p2<R, C, V> extends h2 implements s6<R, C, V> {
    protected p2() {
    }

    @Override // com.google.common.collect.s6
    public boolean A2(@zc.a Object obj) {
        return u3().A2(obj);
    }

    @Override // com.google.common.collect.s6
    public Set<s6.a<R, C, V>> B1() {
        return u3().B1();
    }

    @Override // com.google.common.collect.s6
    @zc.a
    @f9.a
    public V D1(@f5 R r4, @f5 C c5, @f5 V v4) {
        return u3().D1(r4, c5, v4);
    }

    @Override // com.google.common.collect.s6
    public boolean I2(@zc.a Object obj, @zc.a Object obj2) {
        return u3().I2(obj, obj2);
    }

    @Override // com.google.common.collect.s6
    @zc.a
    public V L(@zc.a Object obj, @zc.a Object obj2) {
        return u3().L(obj, obj2);
    }

    @Override // com.google.common.collect.s6
    public boolean S(@zc.a Object obj) {
        return u3().S(obj);
    }

    @Override // com.google.common.collect.s6
    public void clear() {
        u3().clear();
    }

    @Override // com.google.common.collect.s6
    public boolean containsValue(@zc.a Object obj) {
        return u3().containsValue(obj);
    }

    @Override // com.google.common.collect.s6
    public void e1(s6<? extends R, ? extends C, ? extends V> s6Var) {
        u3().e1(s6Var);
    }

    @Override // com.google.common.collect.s6
    public boolean equals(@zc.a Object obj) {
        return obj == this || u3().equals(obj);
    }

    @Override // com.google.common.collect.s6
    public int hashCode() {
        return u3().hashCode();
    }

    @Override // com.google.common.collect.s6
    public Set<R> i() {
        return u3().i();
    }

    @Override // com.google.common.collect.s6
    public Map<C, V> i3(@f5 R r4) {
        return u3().i3(r4);
    }

    @Override // com.google.common.collect.s6
    public boolean isEmpty() {
        return u3().isEmpty();
    }

    @Override // com.google.common.collect.s6
    public Map<C, Map<R, V>> j1() {
        return u3().j1();
    }

    @Override // com.google.common.collect.s6
    public Map<R, Map<C, V>> m() {
        return u3().m();
    }

    @Override // com.google.common.collect.s6
    public Map<R, V> n1(@f5 C c5) {
        return u3().n1(c5);
    }

    @Override // com.google.common.collect.s6
    public Set<C> q2() {
        return u3().q2();
    }

    @Override // com.google.common.collect.s6
    @zc.a
    @f9.a
    public V remove(@zc.a Object obj, @zc.a Object obj2) {
        return u3().remove(obj, obj2);
    }

    @Override // com.google.common.collect.s6
    public int size() {
        return u3().size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.h2
    /* renamed from: v3, reason: merged with bridge method [inline-methods] */
    public abstract s6<R, C, V> u3();

    @Override // com.google.common.collect.s6
    public Collection<V> values() {
        return u3().values();
    }
}
