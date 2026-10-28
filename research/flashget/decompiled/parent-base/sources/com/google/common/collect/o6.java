package com.google.common.collect;

import com.google.common.collect.h3;
import com.google.common.collect.s6;
import com.google.common.collect.y3;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/* compiled from: SparseImmutableTable.java */
@w0
@f9.j(containerOf = {"R", "C", "V"})
@d9.b
/* loaded from: classes6.dex */
final class o6<R, C, V> extends x5<R, C, V> {

    /* renamed from: h, reason: collision with root package name */
    static final y3<Object, Object, Object> f56075h = new o6(f3.H(), q3.I(), t5.f56492m);

    /* renamed from: d, reason: collision with root package name */
    private final h3<R, h3<C, V>> f56076d;

    /* renamed from: e, reason: collision with root package name */
    private final h3<C, h3<R, V>> f56077e;

    /* renamed from: f, reason: collision with root package name */
    private final int[] f56078f;

    /* renamed from: g, reason: collision with root package name */
    private final int[] f56079g;

    /* JADX WARN: Multi-variable type inference failed */
    o6(f3<s6.a<R, C, V>> f3Var, q3<R> q3Var, q3<C> q3Var2) {
        h3 Q = p4.Q(q3Var);
        LinkedHashMap c02 = p4.c0();
        e7<R> it = q3Var.iterator();
        while (it.hasNext()) {
            c02.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap c03 = p4.c0();
        e7<C> it2 = q3Var2.iterator();
        while (it2.hasNext()) {
            c03.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[f3Var.size()];
        int[] iArr2 = new int[f3Var.size()];
        for (int i4 = 0; i4 < f3Var.size(); i4++) {
            s6.a<R, C, V> aVar = f3Var.get(i4);
            R a5 = aVar.a();
            C b5 = aVar.b();
            V value = aVar.getValue();
            Integer num = (Integer) Q.get(a5);
            Objects.requireNonNull(num);
            iArr[i4] = num.intValue();
            Map map = (Map) c02.get(a5);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i4] = map2.size();
            A(a5, b5, map2.put(b5, value), value);
            Map map3 = (Map) c03.get(b5);
            Objects.requireNonNull(map3);
            map3.put(a5, value);
        }
        this.f56078f = iArr;
        this.f56079g = iArr2;
        h3.b bVar = new h3.b(c02.size());
        for (Map.Entry entry : c02.entrySet()) {
            bVar.i(entry.getKey(), h3.i((Map) entry.getValue()));
        }
        this.f56076d = bVar.d();
        h3.b bVar2 = new h3.b(c03.size());
        for (Map.Entry entry2 : c03.entrySet()) {
            bVar2.i(entry2.getKey(), h3.i((Map) entry2.getValue()));
        }
        this.f56077e = bVar2.d();
    }

    @Override // com.google.common.collect.x5
    s6.a<R, C, V> F(int i4) {
        Map.Entry<R, h3<C, V>> entry = this.f56076d.entrySet().b().get(this.f56078f[i4]);
        h3<C, V> value = entry.getValue();
        Map.Entry<C, V> entry2 = value.entrySet().b().get(this.f56079g[i4]);
        return y3.g(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.x5
    V G(int i4) {
        h3<C, V> h3Var = this.f56076d.values().b().get(this.f56078f[i4]);
        return h3Var.values().b().get(this.f56079g[i4]);
    }

    @Override // com.google.common.collect.y3, com.google.common.collect.s6
    public Map j1() {
        return h3.i(this.f56077e);
    }

    @Override // com.google.common.collect.y3
    /* renamed from: l */
    public h3<C, Map<R, V>> j1() {
        return h3.i(this.f56077e);
    }

    @Override // com.google.common.collect.y3, com.google.common.collect.s6
    public Map m() {
        return h3.i(this.f56076d);
    }

    @Override // com.google.common.collect.y3
    y3.b q() {
        h3 Q = p4.Q(q2());
        int[] iArr = new int[B1().size()];
        e7<s6.a<R, C, V>> it = B1().iterator();
        int i4 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) Q.get(it.next().b());
            Objects.requireNonNull(num);
            iArr[i4] = num.intValue();
            i4++;
        }
        return y3.b.a(this, this.f56078f, iArr);
    }

    @Override // com.google.common.collect.s6
    public int size() {
        return this.f56078f.length;
    }

    @Override // com.google.common.collect.y3
    /* renamed from: w */
    public h3<R, Map<C, V>> m() {
        return h3.i(this.f56076d);
    }
}
