package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.d4;
import com.google.common.collect.q0;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* compiled from: TreeRangeSet.java */
@w0
@d9.c
@d9.a
/* loaded from: classes6.dex */
public class c7<C extends Comparable<?>> extends k<C> implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    @d9.d
    final NavigableMap<q0<C>, j5<C>> f55473b;

    /* renamed from: c, reason: collision with root package name */
    @zc.a
    private transient Set<j5<C>> f55474c;

    /* renamed from: d, reason: collision with root package name */
    @zc.a
    private transient Set<j5<C>> f55475d;

    /* renamed from: e, reason: collision with root package name */
    @zc.a
    private transient m5<C> f55476e;

    /* compiled from: TreeRangeSet.java */
    final class b extends q1<j5<C>> implements Set<j5<C>> {

        /* renamed from: b, reason: collision with root package name */
        final Collection<j5<C>> f55477b;

        b(c7 c7Var, Collection<j5<C>> collection) {
            this.f55477b = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(@zc.a Object obj) {
            return d6.g(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return d6.k(this);
        }

        @Override // com.google.common.collect.q1, com.google.common.collect.h2
        protected Object u3() {
            return this.f55477b;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.q1
        /* renamed from: v3 */
        public Collection<j5<C>> u3() {
            return this.f55477b;
        }
    }

    /* compiled from: TreeRangeSet.java */
    private final class c extends c7<C> {
        c() {
            super(new d(c7.this.f55473b));
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        public void a(j5<C> j5Var) {
            c7.this.d(j5Var);
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        public boolean b(C c5) {
            return !c7.this.b(c5);
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        public void d(j5<C> j5Var) {
            c7.this.a(j5Var);
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.m5
        public m5<C> e() {
            return c7.this;
        }
    }

    /* compiled from: TreeRangeSet.java */
    private static final class d<C extends Comparable<?>> extends j<q0<C>, j5<C>> {

        /* renamed from: b, reason: collision with root package name */
        private final NavigableMap<q0<C>, j5<C>> f55479b;

        /* renamed from: c, reason: collision with root package name */
        private final NavigableMap<q0<C>, j5<C>> f55480c;

        /* renamed from: d, reason: collision with root package name */
        private final j5<q0<C>> f55481d;

        /* compiled from: TreeRangeSet.java */
        class a extends com.google.common.collect.c<Map.Entry<q0<C>, j5<C>>> {

            /* renamed from: d, reason: collision with root package name */
            q0<C> f55482d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ q0 f55483e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g5 f55484f;

            a(q0 q0Var, g5 g5Var) {
                this.f55483e = q0Var;
                this.f55484f = g5Var;
                this.f55482d = q0Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<q0<C>, j5<C>> a() {
                j5 k4;
                if (d.this.f55481d.f55873c.k(this.f55482d) || this.f55482d == q0.b.f56186d) {
                    return (Map.Entry) b();
                }
                if (this.f55484f.hasNext()) {
                    j5 j5Var = (j5) this.f55484f.next();
                    k4 = j5.k(this.f55482d, j5Var.f55872b);
                    this.f55482d = j5Var.f55873c;
                } else {
                    k4 = j5.k(this.f55482d, q0.b.f56186d);
                    this.f55482d = q0.b.f56186d;
                }
                return new c3(k4.f55872b, k4);
            }
        }

        /* compiled from: TreeRangeSet.java */
        class b extends com.google.common.collect.c<Map.Entry<q0<C>, j5<C>>> {

            /* renamed from: d, reason: collision with root package name */
            q0<C> f55486d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ q0 f55487e;

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ g5 f55488f;

            b(q0 q0Var, g5 g5Var) {
                this.f55487e = q0Var;
                this.f55488f = g5Var;
                this.f55486d = q0Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<q0<C>, j5<C>> a() {
                if (this.f55486d == q0.d.f56189d) {
                    return (Map.Entry) b();
                }
                if (this.f55488f.hasNext()) {
                    j5 j5Var = (j5) this.f55488f.next();
                    j5 k4 = j5.k(j5Var.f55873c, this.f55486d);
                    this.f55486d = j5Var.f55872b;
                    if (d.this.f55481d.f55872b.k(k4.f55872b)) {
                        return new c3(k4.f55872b, k4);
                    }
                } else if (d.this.f55481d.f55872b.k(q0.d.f56189d)) {
                    j5 k5 = j5.k(q0.d.f56189d, this.f55486d);
                    this.f55486d = q0.d.f56189d;
                    return new c3(q0.d.f56189d, k5);
                }
                return (Map.Entry) b();
            }
        }

        d(NavigableMap<q0<C>, j5<C>> navigableMap) {
            this(navigableMap, j5.a());
        }

        private NavigableMap<q0<C>, j5<C>> i(j5<q0<C>> j5Var) {
            if (!this.f55481d.t(j5Var)) {
                return s3.r0();
            }
            return new d(this.f55479b, j5Var.s(this.f55481d));
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<q0<C>, j5<C>>> b() {
            Collection<j5<C>> values;
            q0 q0Var;
            if (this.f55481d.q()) {
                values = this.f55480c.tailMap(this.f55481d.f55872b.i(), this.f55481d.f55872b.m() == x.CLOSED).values();
            } else {
                values = this.f55480c.values();
            }
            g5 T = d4.T(values.iterator());
            if (this.f55481d.i(q0.d.f56189d) && (!T.hasNext() || ((j5) T.peek()).f55872b != q0.d.f56189d)) {
                q0Var = q0.d.f56189d;
            } else {
                if (!T.hasNext()) {
                    return d4.l.f55558f;
                }
                q0Var = ((j5) T.next()).f55873c;
            }
            return new a(q0Var, T);
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<q0<C>, j5<C>>> c() {
            q0<C> higherKey;
            g5 T = d4.T(this.f55480c.headMap(this.f55481d.r() ? this.f55481d.f55873c.i() : q0.b.f56186d, this.f55481d.r() && this.f55481d.f55873c.n() == x.CLOSED).descendingMap().values().iterator());
            if (T.hasNext()) {
                higherKey = ((j5) T.peek()).f55873c == q0.b.f56186d ? ((j5) T.next()).f55872b : this.f55479b.higherKey(((j5) T.peek()).f55873c);
            } else {
                if (!this.f55481d.i(q0.d.f56189d) || this.f55479b.containsKey(q0.d.f56189d)) {
                    return d4.l.f55558f;
                }
                higherKey = this.f55479b.higherKey(q0.d.f56189d);
            }
            return new b((q0) com.google.common.base.d0.a(higherKey, q0.b.f56186d), T);
        }

        @Override // java.util.SortedMap
        public Comparator<? super q0<C>> comparator() {
            return x4.f56632f;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public j5<C> get(@zc.a Object obj) {
            if (obj instanceof q0) {
                try {
                    q0<C> q0Var = (q0) obj;
                    Map.Entry<q0<C>, j5<C>> firstEntry = tailMap(q0Var, true).firstEntry();
                    if (firstEntry != null && firstEntry.getKey().equals(q0Var)) {
                        return firstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> headMap(q0<C> q0Var, boolean z4) {
            return i(j5.H(q0Var, x.forBoolean(z4)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> subMap(q0<C> q0Var, boolean z4, q0<C> q0Var2, boolean z5) {
            return i(j5.B(q0Var, x.forBoolean(z4), q0Var2, x.forBoolean(z5)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> tailMap(q0<C> q0Var, boolean z4) {
            return i(j5.l(q0Var, x.forBoolean(z4)));
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return d4.Z(b());
        }

        private d(NavigableMap<q0<C>, j5<C>> navigableMap, j5<q0<C>> j5Var) {
            this.f55479b = navigableMap;
            this.f55480c = new e(navigableMap);
            this.f55481d = j5Var;
        }
    }

    /* compiled from: TreeRangeSet.java */
    private final class f extends c7<C> {

        /* renamed from: f, reason: collision with root package name */
        private final j5<C> f55496f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        f(com.google.common.collect.j5<C> r5) {
            /*
                r3 = this;
                com.google.common.collect.c7.this = r4
                com.google.common.collect.c7$g r0 = new com.google.common.collect.c7$g
                com.google.common.collect.j5 r1 = com.google.common.collect.j5.a()
                java.util.NavigableMap<com.google.common.collect.q0<C extends java.lang.Comparable<?>>, com.google.common.collect.j5<C extends java.lang.Comparable<?>>> r4 = r4.f55473b
                r2 = 0
                r0.<init>(r1, r5, r4)
                r3.<init>(r0)
                r3.f55496f = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.c7.f.<init>(com.google.common.collect.c7, com.google.common.collect.j5):void");
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        public void a(j5<C> j5Var) {
            if (j5Var.t(this.f55496f)) {
                c7.this.a(j5Var.s(this.f55496f));
            }
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        public boolean b(C c5) {
            return this.f55496f.i(c5) && c7.this.b(c5);
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        public void clear() {
            c7.this.a(this.f55496f);
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        public void d(j5<C> j5Var) {
            com.google.common.base.l0.y(this.f55496f.n(j5Var), ProtectedSandApp.s("\uf47f"), j5Var, this.f55496f);
            c7.this.d(j5Var);
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        @zc.a
        public j5<C> k(C c5) {
            j5<C> k4;
            if (this.f55496f.i(c5) && (k4 = c7.this.k(c5)) != null) {
                return k4.s(this.f55496f);
            }
            return null;
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.k, com.google.common.collect.m5
        public boolean l(j5<C> j5Var) {
            j5 v4;
            return (this.f55496f.u() || !this.f55496f.n(j5Var) || (v4 = c7.this.v(j5Var)) == null || v4.s(this.f55496f).u()) ? false : true;
        }

        @Override // com.google.common.collect.c7, com.google.common.collect.m5
        public m5<C> n(j5<C> j5Var) {
            return j5Var.n(this.f55496f) ? this : j5Var.t(this.f55496f) ? new f(this, this.f55496f.s(j5Var)) : p3.E();
        }
    }

    /* compiled from: TreeRangeSet.java */
    private static final class g<C extends Comparable<?>> extends j<q0<C>, j5<C>> {

        /* renamed from: b, reason: collision with root package name */
        private final j5<q0<C>> f55498b;

        /* renamed from: c, reason: collision with root package name */
        private final j5<C> f55499c;

        /* renamed from: d, reason: collision with root package name */
        private final NavigableMap<q0<C>, j5<C>> f55500d;

        /* renamed from: e, reason: collision with root package name */
        private final NavigableMap<q0<C>, j5<C>> f55501e;

        /* compiled from: TreeRangeSet.java */
        class a extends com.google.common.collect.c<Map.Entry<q0<C>, j5<C>>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f55502d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ q0 f55503e;

            a(Iterator it, q0 q0Var) {
                this.f55502d = it;
                this.f55503e = q0Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<q0<C>, j5<C>> a() {
                if (!this.f55502d.hasNext()) {
                    return (Map.Entry) b();
                }
                j5 j5Var = (j5) this.f55502d.next();
                if (this.f55503e.k(j5Var.f55872b)) {
                    return (Map.Entry) b();
                }
                j5 s4 = j5Var.s(g.this.f55499c);
                return new c3(s4.f55872b, s4);
            }
        }

        /* compiled from: TreeRangeSet.java */
        class b extends com.google.common.collect.c<Map.Entry<q0<C>, j5<C>>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f55505d;

            b(Iterator it) {
                this.f55505d = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<q0<C>, j5<C>> a() {
                if (!this.f55505d.hasNext()) {
                    return (Map.Entry) b();
                }
                j5 j5Var = (j5) this.f55505d.next();
                if (g.this.f55499c.f55872b.compareTo(j5Var.f55873c) >= 0) {
                    return (Map.Entry) b();
                }
                j5 s4 = j5Var.s(g.this.f55499c);
                return g.this.f55498b.i(s4.f55872b) ? new c3(s4.f55872b, s4) : (Map.Entry) b();
            }
        }

        private NavigableMap<q0<C>, j5<C>> j(j5<q0<C>> j5Var) {
            return !j5Var.t(this.f55498b) ? s3.r0() : new g(this.f55498b.s(j5Var), this.f55499c, this.f55500d);
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<q0<C>, j5<C>>> b() {
            Iterator<j5<C>> it;
            if (this.f55499c.u()) {
                return d4.l.f55558f;
            }
            if (this.f55498b.f55873c.k(this.f55499c.f55872b)) {
                return d4.l.f55558f;
            }
            if (this.f55498b.f55872b.k(this.f55499c.f55872b)) {
                it = this.f55501e.tailMap(this.f55499c.f55872b, false).values().iterator();
            } else {
                it = this.f55500d.tailMap(this.f55498b.f55872b.i(), this.f55498b.f55872b.m() == x.CLOSED).values().iterator();
            }
            return new a(it, (q0) x4.f56632f.O(this.f55498b.f55873c, new q0.e(this.f55499c.f55873c)));
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<q0<C>, j5<C>>> c() {
            if (this.f55499c.u()) {
                return d4.l.f55558f;
            }
            q0 q0Var = (q0) x4.f56632f.O(this.f55498b.f55873c, new q0.e(this.f55499c.f55873c));
            return new b(this.f55500d.headMap((q0) q0Var.i(), q0Var.n() == x.CLOSED).descendingMap().values().iterator());
        }

        @Override // java.util.SortedMap
        public Comparator<? super q0<C>> comparator() {
            return x4.f56632f;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public j5<C> get(@zc.a Object obj) {
            if (obj instanceof q0) {
                try {
                    q0<C> q0Var = (q0) obj;
                    if (this.f55498b.i(q0Var) && q0Var.compareTo(this.f55499c.f55872b) >= 0 && q0Var.compareTo(this.f55499c.f55873c) < 0) {
                        if (q0Var.equals(this.f55499c.f55872b)) {
                            j5 j5Var = (j5) p4.P0(this.f55500d.floorEntry(q0Var));
                            if (j5Var != null && j5Var.f55873c.compareTo(this.f55499c.f55872b) > 0) {
                                return j5Var.s(this.f55499c);
                            }
                        } else {
                            j5<C> j5Var2 = this.f55500d.get(q0Var);
                            if (j5Var2 != null) {
                                return j5Var2.s(this.f55499c);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> headMap(q0<C> q0Var, boolean z4) {
            return j(j5.H(q0Var, x.forBoolean(z4)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> subMap(q0<C> q0Var, boolean z4, q0<C> q0Var2, boolean z5) {
            return j(j5.B(q0Var, x.forBoolean(z4), q0Var2, x.forBoolean(z5)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> tailMap(q0<C> q0Var, boolean z4) {
            return j(j5.l(q0Var, x.forBoolean(z4)));
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return d4.Z(b());
        }

        private g(j5<q0<C>> j5Var, j5<C> j5Var2, NavigableMap<q0<C>, j5<C>> navigableMap) {
            j5Var.getClass();
            this.f55498b = j5Var;
            j5Var2.getClass();
            this.f55499c = j5Var2;
            navigableMap.getClass();
            this.f55500d = navigableMap;
            this.f55501e = new e(navigableMap);
        }
    }

    public static <C extends Comparable<?>> c7<C> s() {
        return new c7<>(new TreeMap());
    }

    public static <C extends Comparable<?>> c7<C> t(m5<C> m5Var) {
        c7<C> s4 = s();
        s4.h(m5Var);
        return s4;
    }

    public static <C extends Comparable<?>> c7<C> u(Iterable<j5<C>> iterable) {
        c7<C> s4 = s();
        s4.g(iterable);
        return s4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @zc.a
    public j5<C> v(j5<C> j5Var) {
        j5Var.getClass();
        Map.Entry<q0<C>, j5<C>> floorEntry = this.f55473b.floorEntry(j5Var.f55872b);
        if (floorEntry == null || !floorEntry.getValue().n(j5Var)) {
            return null;
        }
        return floorEntry.getValue();
    }

    private void w(j5<C> j5Var) {
        if (j5Var.u()) {
            this.f55473b.remove(j5Var.f55872b);
        } else {
            this.f55473b.put(j5Var.f55872b, j5Var);
        }
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public void a(j5<C> j5Var) {
        j5Var.getClass();
        if (j5Var.u()) {
            return;
        }
        Map.Entry<q0<C>, j5<C>> lowerEntry = this.f55473b.lowerEntry(j5Var.f55872b);
        if (lowerEntry != null) {
            j5<C> value = lowerEntry.getValue();
            if (value.f55873c.compareTo(j5Var.f55872b) >= 0) {
                if (j5Var.r() && value.f55873c.compareTo(j5Var.f55873c) >= 0) {
                    w(j5.k(j5Var.f55873c, value.f55873c));
                }
                w(j5.k(value.f55872b, j5Var.f55872b));
            }
        }
        Map.Entry<q0<C>, j5<C>> floorEntry = this.f55473b.floorEntry(j5Var.f55873c);
        if (floorEntry != null) {
            j5<C> value2 = floorEntry.getValue();
            if (j5Var.r() && value2.f55873c.compareTo(j5Var.f55873c) >= 0) {
                w(j5.k(j5Var.f55873c, value2.f55873c));
            }
        }
        this.f55473b.subMap(j5Var.f55872b, j5Var.f55873c).clear();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable) {
        return super.b(comparable);
    }

    @Override // com.google.common.collect.m5
    public j5<C> c() {
        Map.Entry<q0<C>, j5<C>> firstEntry = this.f55473b.firstEntry();
        Map.Entry<q0<C>, j5<C>> lastEntry = this.f55473b.lastEntry();
        if (firstEntry == null || lastEntry == null) {
            throw new NoSuchElementException();
        }
        return j5.k(firstEntry.getValue().f55872b, lastEntry.getValue().f55873c);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public void d(j5<C> j5Var) {
        j5Var.getClass();
        if (j5Var.u()) {
            return;
        }
        q0<C> q0Var = j5Var.f55872b;
        q0<C> q0Var2 = j5Var.f55873c;
        Map.Entry<q0<C>, j5<C>> lowerEntry = this.f55473b.lowerEntry(q0Var);
        if (lowerEntry != null) {
            j5<C> value = lowerEntry.getValue();
            if (value.f55873c.compareTo(q0Var) >= 0) {
                if (value.f55873c.compareTo(q0Var2) >= 0) {
                    q0Var2 = value.f55873c;
                }
                q0Var = value.f55872b;
            }
        }
        Map.Entry<q0<C>, j5<C>> floorEntry = this.f55473b.floorEntry(q0Var2);
        if (floorEntry != null) {
            j5<C> value2 = floorEntry.getValue();
            if (value2.f55873c.compareTo(q0Var2) >= 0) {
                q0Var2 = value2.f55873c;
            }
        }
        this.f55473b.subMap(q0Var, q0Var2).clear();
        w(j5.k(q0Var, q0Var2));
    }

    @Override // com.google.common.collect.m5
    public m5<C> e() {
        m5<C> m5Var = this.f55476e;
        if (m5Var != null) {
            return m5Var;
        }
        c cVar = new c();
        this.f55476e = cVar;
        return cVar;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean equals(@zc.a Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public boolean f(j5<C> j5Var) {
        j5Var.getClass();
        Map.Entry<q0<C>, j5<C>> ceilingEntry = this.f55473b.ceilingEntry(j5Var.f55872b);
        if (ceilingEntry != null && ceilingEntry.getValue().t(j5Var) && !ceilingEntry.getValue().s(j5Var).u()) {
            return true;
        }
        Map.Entry<q0<C>, j5<C>> lowerEntry = this.f55473b.lowerEntry(j5Var.f55872b);
        return (lowerEntry == null || !lowerEntry.getValue().t(j5Var) || lowerEntry.getValue().s(j5Var).u()) ? false : true;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ void g(Iterable iterable) {
        super.g(iterable);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ void h(m5 m5Var) {
        super.h(m5Var);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ void i(Iterable iterable) {
        super.i(iterable);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean j(m5 m5Var) {
        return super.j(m5Var);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    @zc.a
    public j5<C> k(C c5) {
        c5.getClass();
        Map.Entry<q0<C>, j5<C>> floorEntry = this.f55473b.floorEntry(new q0.e(c5));
        if (floorEntry == null || !floorEntry.getValue().i(c5)) {
            return null;
        }
        return floorEntry.getValue();
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public boolean l(j5<C> j5Var) {
        j5Var.getClass();
        Map.Entry<q0<C>, j5<C>> floorEntry = this.f55473b.floorEntry(j5Var.f55872b);
        return floorEntry != null && floorEntry.getValue().n(j5Var);
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ boolean m(Iterable iterable) {
        return super.m(iterable);
    }

    @Override // com.google.common.collect.m5
    public m5<C> n(j5<C> j5Var) {
        return j5Var.equals(j5.a()) ? this : new f(this, j5Var);
    }

    @Override // com.google.common.collect.m5
    public Set<j5<C>> o() {
        Set<j5<C>> set = this.f55475d;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.f55473b.descendingMap().values());
        this.f55475d = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.m5
    public Set<j5<C>> p() {
        Set<j5<C>> set = this.f55474c;
        if (set != null) {
            return set;
        }
        b bVar = new b(this, this.f55473b.values());
        this.f55474c = bVar;
        return bVar;
    }

    @Override // com.google.common.collect.k, com.google.common.collect.m5
    public /* bridge */ /* synthetic */ void q(m5 m5Var) {
        super.q(m5Var);
    }

    private c7(NavigableMap<q0<C>, j5<C>> navigableMap) {
        this.f55473b = navigableMap;
    }

    /* compiled from: TreeRangeSet.java */
    @d9.d
    static final class e<C extends Comparable<?>> extends j<q0<C>, j5<C>> {

        /* renamed from: b, reason: collision with root package name */
        private final NavigableMap<q0<C>, j5<C>> f55490b;

        /* renamed from: c, reason: collision with root package name */
        private final j5<q0<C>> f55491c;

        /* compiled from: TreeRangeSet.java */
        class a extends com.google.common.collect.c<Map.Entry<q0<C>, j5<C>>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ Iterator f55492d;

            a(Iterator it) {
                this.f55492d = it;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<q0<C>, j5<C>> a() {
                if (!this.f55492d.hasNext()) {
                    return (Map.Entry) b();
                }
                j5 j5Var = (j5) this.f55492d.next();
                return e.this.f55491c.f55873c.k(j5Var.f55873c) ? (Map.Entry) b() : new c3(j5Var.f55873c, j5Var);
            }
        }

        /* compiled from: TreeRangeSet.java */
        class b extends com.google.common.collect.c<Map.Entry<q0<C>, j5<C>>> {

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ g5 f55494d;

            b(g5 g5Var) {
                this.f55494d = g5Var;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.c
            @zc.a
            /* renamed from: d, reason: merged with bridge method [inline-methods] */
            public Map.Entry<q0<C>, j5<C>> a() {
                if (!this.f55494d.hasNext()) {
                    return (Map.Entry) b();
                }
                j5 j5Var = (j5) this.f55494d.next();
                return e.this.f55491c.f55872b.k(j5Var.f55873c) ? new c3(j5Var.f55873c, j5Var) : (Map.Entry) b();
            }
        }

        e(NavigableMap<q0<C>, j5<C>> navigableMap) {
            this.f55490b = navigableMap;
            this.f55491c = j5.a();
        }

        private NavigableMap<q0<C>, j5<C>> i(j5<q0<C>> j5Var) {
            return j5Var.t(this.f55491c) ? new e(this.f55490b, j5Var.s(this.f55491c)) : s3.r0();
        }

        @Override // com.google.common.collect.p4.a0
        Iterator<Map.Entry<q0<C>, j5<C>>> b() {
            Iterator<j5<C>> it;
            if (this.f55491c.q()) {
                Map.Entry<q0<C>, j5<C>> lowerEntry = this.f55490b.lowerEntry(this.f55491c.f55872b.i());
                it = lowerEntry == null ? this.f55490b.values().iterator() : this.f55491c.f55872b.k(lowerEntry.getValue().f55873c) ? this.f55490b.tailMap(lowerEntry.getKey(), true).values().iterator() : this.f55490b.tailMap(this.f55491c.f55872b.i(), true).values().iterator();
            } else {
                it = this.f55490b.values().iterator();
            }
            return new a(it);
        }

        @Override // com.google.common.collect.j
        Iterator<Map.Entry<q0<C>, j5<C>>> c() {
            g5 T = d4.T((this.f55491c.r() ? this.f55490b.headMap(this.f55491c.f55873c.i(), false).descendingMap().values() : this.f55490b.descendingMap().values()).iterator());
            if (T.hasNext() && this.f55491c.f55873c.k(((j5) T.peek()).f55873c)) {
                T.next();
            }
            return new b(T);
        }

        @Override // java.util.SortedMap
        public Comparator<? super q0<C>> comparator() {
            return x4.f56632f;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@zc.a Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.j, java.util.AbstractMap, java.util.Map
        @zc.a
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public j5<C> get(@zc.a Object obj) {
            Map.Entry<q0<C>, j5<C>> lowerEntry;
            if (obj instanceof q0) {
                try {
                    q0<C> q0Var = (q0) obj;
                    if (this.f55491c.i(q0Var) && (lowerEntry = this.f55490b.lowerEntry(q0Var)) != null && lowerEntry.getValue().f55873c.equals(q0Var)) {
                        return lowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> headMap(q0<C> q0Var, boolean z4) {
            return i(j5.H(q0Var, x.forBoolean(z4)));
        }

        @Override // java.util.NavigableMap
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> subMap(q0<C> q0Var, boolean z4, q0<C> q0Var2, boolean z5) {
            return i(j5.B(q0Var, x.forBoolean(z4), q0Var2, x.forBoolean(z5)));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f55491c.equals(j5.a()) ? this.f55490b.isEmpty() : !b().hasNext();
        }

        @Override // java.util.NavigableMap
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public NavigableMap<q0<C>, j5<C>> tailMap(q0<C> q0Var, boolean z4) {
            return i(j5.l(q0Var, x.forBoolean(z4)));
        }

        @Override // com.google.common.collect.p4.a0, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f55491c.equals(j5.a()) ? this.f55490b.size() : d4.Z(b());
        }

        private e(NavigableMap<q0<C>, j5<C>> navigableMap, j5<q0<C>> j5Var) {
            this.f55490b = navigableMap;
            this.f55491c = j5Var;
        }
    }
}
