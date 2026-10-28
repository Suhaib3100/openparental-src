package com.google.common.collect;

import com.google.common.collect.p4;
import com.google.common.collect.q6;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

/* compiled from: TreeBasedTable.java */
@w0
@d9.b(serializable = true)
/* loaded from: classes6.dex */
public class y6<R, C, V> extends p6<R, C, V> {

    /* renamed from: l, reason: collision with root package name */
    private static final long f56656l = 0;

    /* renamed from: k, reason: collision with root package name */
    private final Comparator<? super C> f56657k;

    /* compiled from: TreeBasedTable.java */
    class a extends com.google.common.collect.c<C> {

        /* renamed from: d, reason: collision with root package name */
        @zc.a
        C f56658d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Iterator f56659e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ Comparator f56660f;

        a(y6 y6Var, Iterator it, Comparator comparator) {
            this.f56659e = it;
            this.f56660f = comparator;
        }

        @Override // com.google.common.collect.c
        @zc.a
        protected C a() {
            while (this.f56659e.hasNext()) {
                C c5 = (C) this.f56659e.next();
                C c6 = this.f56658d;
                if (c6 == null || this.f56660f.compare(c5, c6) != 0) {
                    this.f56658d = c5;
                    return c5;
                }
            }
            this.f56658d = null;
            return b();
        }
    }

    /* compiled from: TreeBasedTable.java */
    private static class b<C, V> implements com.google.common.base.u0<TreeMap<C, V>>, Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f56661c = 0;

        /* renamed from: b, reason: collision with root package name */
        final Comparator<? super C> f56662b;

        b(Comparator<? super C> comparator) {
            this.f56662b = comparator;
        }

        @Override // com.google.common.base.u0
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public TreeMap<C, V> get() {
            return new TreeMap<>(this.f56662b);
        }
    }

    /* compiled from: TreeBasedTable.java */
    private class c extends q6<R, C, V>.g implements SortedMap<C, V> {

        /* renamed from: e, reason: collision with root package name */
        @zc.a
        final C f56663e;

        /* renamed from: f, reason: collision with root package name */
        @zc.a
        final C f56664f;

        /* renamed from: g, reason: collision with root package name */
        @zc.a
        transient SortedMap<C, V> f56665g;

        c(y6 y6Var, R r4) {
            this(r4, null, null);
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return y6.this.t();
        }

        @Override // com.google.common.collect.q6.g, java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return k(obj) && super.containsKey(obj);
        }

        @Override // com.google.common.collect.q6.g
        void d() {
            l();
            SortedMap<C, V> sortedMap = this.f56665g;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            y6.this.f56238d.remove(this.f56265b);
            this.f56665g = null;
            this.f56266c = null;
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            e();
            Map<C, V> map = this.f56266c;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        int h(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c5) {
            c5.getClass();
            com.google.common.base.l0.d(k(c5));
            return new c(this.f56265b, this.f56663e, c5);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.q6.g
        @zc.a
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public SortedMap<C, V> c() {
            l();
            SortedMap<C, V> sortedMap = this.f56665g;
            if (sortedMap == null) {
                return null;
            }
            C c5 = this.f56663e;
            if (c5 != null) {
                sortedMap = sortedMap.tailMap(c5);
            }
            C c6 = this.f56664f;
            return c6 != null ? sortedMap.headMap(c6) : sortedMap;
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public SortedSet<C> keySet() {
            return new p4.g0((Map) this);
        }

        boolean k(@zc.a Object obj) {
            C c5;
            C c6;
            return obj != null && ((c5 = this.f56663e) == null || h(c5, obj) <= 0) && ((c6 = this.f56664f) == null || h(c6, obj) > 0);
        }

        void l() {
            SortedMap<C, V> sortedMap = this.f56665g;
            if (sortedMap == null || (sortedMap.isEmpty() && y6.this.f56238d.containsKey(this.f56265b))) {
                this.f56665g = (SortedMap) y6.this.f56238d.get(this.f56265b);
            }
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            e();
            Map<C, V> map = this.f56266c;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.q6.g, java.util.AbstractMap, java.util.Map
        @zc.a
        public V put(C c5, V v4) {
            c5.getClass();
            com.google.common.base.l0.d(k(c5));
            return (V) super.put(c5, v4);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c5, C c6) {
            boolean z4;
            c5.getClass();
            if (k(c5)) {
                c6.getClass();
                if (k(c6)) {
                    z4 = true;
                    com.google.common.base.l0.d(z4);
                    return new c(this.f56265b, c5, c6);
                }
            }
            z4 = false;
            com.google.common.base.l0.d(z4);
            return new c(this.f56265b, c5, c6);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c5) {
            c5.getClass();
            com.google.common.base.l0.d(k(c5));
            return new c(this.f56265b, c5, this.f56664f);
        }

        c(R r4, @zc.a C c5, @zc.a C c6) {
            super(r4);
            this.f56663e = c5;
            this.f56664f = c6;
            com.google.common.base.l0.d(c5 == null || c6 == null || h(c5, c6) <= 0);
        }
    }

    y6(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        super((Map) new TreeMap(comparator), (com.google.common.base.u0) new b(comparator2));
        this.f56657k = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> y6<R, C, V> u() {
        x4 x4Var = x4.f56632f;
        return new y6<>(x4Var, x4Var);
    }

    public static <R, C, V> y6<R, C, V> v(y6<R, C, ? extends V> y6Var) {
        y6<R, C, V> y6Var2 = new y6<>(y6Var.z(), y6Var.t());
        super.e1(y6Var);
        return y6Var2;
    }

    public static <R, C, V> y6<R, C, V> w(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        comparator.getClass();
        comparator2.getClass();
        return new y6<>(comparator, comparator2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Iterator x(Map map) {
        return map.keySet().iterator();
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
    public boolean isEmpty() {
        return this.f56238d.isEmpty();
    }

    @Override // com.google.common.collect.q6
    Iterator<C> j() {
        Comparator<? super C> t4 = t();
        return new a(this, d4.O(c4.U(this.f56238d.values(), new x6()), t4), t4);
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ Map j1() {
        return super.j1();
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

    @Deprecated
    public Comparator<? super C> t() {
        return this.f56657k;
    }

    @Override // com.google.common.collect.q
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    @Override // com.google.common.collect.q6, com.google.common.collect.s6
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public SortedMap<C, V> i3(R r4) {
        return new c(r4, null, null);
    }

    @Deprecated
    public Comparator<? super R> z() {
        Comparator<? super R> comparator = i().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // com.google.common.collect.p6, com.google.common.collect.q6, com.google.common.collect.q, com.google.common.collect.s6
    public SortedSet<R> i() {
        return super.i();
    }

    @Override // com.google.common.collect.p6, com.google.common.collect.q6, com.google.common.collect.s6
    public SortedMap<R, Map<C, V>> m() {
        return super.m();
    }
}
