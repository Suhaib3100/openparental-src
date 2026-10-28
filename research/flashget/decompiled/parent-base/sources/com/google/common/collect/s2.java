package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.q6;
import java.io.Serializable;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: HashBasedTable.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
public class s2<R, C, V> extends q6<R, C, V> {

    /* renamed from: j, reason: collision with root package name */
    private static final long f56375j = 0;

    /* compiled from: HashBasedTable.java */
    private static class a<C, V> implements com.google.common.base.u0<Map<C, V>>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f56376c = 0;

        /* renamed from: b, reason: collision with root package name */
        final int f56377b;

        a(int i4) {
            this.f56377b = i4;
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<C, V> get() {
            return p4.e0(this.f56377b);
        }
    }

    s2(Map<R, Map<C, V>> map, a<C, V> aVar) {
        super(map, aVar);
    }

    public static <R, C, V> s2<R, C, V> p() {
        return new s2<>((Map) new LinkedHashMap(), (com.google.common.base.u0) new a(0));
    }

    public static <R, C, V> s2<R, C, V> q(int i4, int i5) {
        b0.b(i5, ProtectedSandApp.s("\uf53c"));
        return new s2<>((Map) p4.e0(i4), (com.google.common.base.u0) new a(i5));
    }

    public static <R, C, V> s2<R, C, V> r(s6<? extends R, ? extends C, ? extends V> s6Var) {
        s2<R, C, V> p4 = p();
        p4.e1(s6Var);
        return p4;
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ boolean A2(@zc.a Object obj) {
        return super.A2(obj);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ Set B1() {
        return super.B1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    @f9.a
    public /* bridge */ /* synthetic */ Object D1(Object obj, Object obj2, Object obj3) {
        return super.D1(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ boolean I2(@zc.a Object obj, @zc.a Object obj2) {
        return super.I2(obj, obj2);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    public /* bridge */ /* synthetic */ Object L(@zc.a Object obj, @zc.a Object obj2) {
        return super.L(obj, obj2);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ boolean S(@zc.a Object obj) {
        return super.S(obj);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ boolean containsValue(@zc.a Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ void e1(s6 s6Var) {
        super.e1(s6Var);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public boolean equals(@zc.a Object obj) {
        return t6.b(this, obj);
    }

    @Override // com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ Set i() {
        return super.i();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.s6
    public Map i3(Object obj) {
        return new q6.g(obj);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public boolean isEmpty() {
        return this.f56238d.isEmpty();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ Map j1() {
        return super.j1();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ Map m() {
        return super.m();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.s6
    public Map n1(Object obj) {
        return new q6.c(obj);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ Set q2() {
        return super.q2();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    @zc.a
    @f9.a
    public /* bridge */ /* synthetic */ Object remove(@zc.a Object obj, @zc.a Object obj2) {
        return super.remove(obj, obj2);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }
}
