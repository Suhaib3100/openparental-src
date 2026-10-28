package com.google.common.collect;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.collect.c0;
import com.google.common.collect.r6;
import com.google.common.collect.s6;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* compiled from: Tables.java */
@w0
@d9.b
/* loaded from: classes6.dex */
public final class t6 {

    /* renamed from: a, reason: collision with root package name */
    private static final com.google.common.base.x<? extends Map<?, ?>, ? extends Map<?, ?>> f56498a = new a();

    /* compiled from: Tables.java */
    class a implements com.google.common.base.x<Map<Object, Object>, Map<Object, Object>> {
        a() {
        }

        @Override // com.google.common.base.x
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }
    }

    /* compiled from: Tables.java */
    static abstract class b<R, C, V> implements s6.a<R, C, V> {
        b() {
        }

        @Override // com.google.common.collect.s6.a
        public boolean equals(@zc.a Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof s6.a)) {
                return false;
            }
            s6.a aVar = (s6.a) obj;
            return com.google.common.base.f0.a(a(), aVar.a()) && com.google.common.base.f0.a(b(), aVar.b()) && com.google.common.base.f0.a(getValue(), aVar.getValue());
        }

        @Override // com.google.common.collect.s6.a
        public int hashCode() {
            return Arrays.hashCode(new Object[]{a(), b(), getValue()});
        }

        public String toString() {
            String valueOf = String.valueOf(a());
            String valueOf2 = String.valueOf(b());
            String valueOf3 = String.valueOf(getValue());
            return android.support.v4.media.c.a(com.google.common.base.g.a(valueOf3.length() + valueOf2.length() + valueOf.length() + 4, ProtectedSandApp.s("\uf556"), valueOf, ProtectedSandApp.s("\uf557"), valueOf2), ProtectedSandApp.s("\uf558"), valueOf3);
        }
    }

    /* compiled from: Tables.java */
    static final class c<R, C, V> extends b<R, C, V> implements Serializable {

        /* renamed from: e, reason: collision with root package name */
        private static final long f56499e = 0;

        /* renamed from: b, reason: collision with root package name */
        @f5
        private final R f56500b;

        /* renamed from: c, reason: collision with root package name */
        @f5
        private final C f56501c;

        /* renamed from: d, reason: collision with root package name */
        @f5
        private final V f56502d;

        c(@f5 R r4, @f5 C c5, @f5 V v4) {
            this.f56500b = r4;
            this.f56501c = c5;
            this.f56502d = v4;
        }

        @Override // com.google.common.collect.s6.a
        @f5
        public R a() {
            return this.f56500b;
        }

        @Override // com.google.common.collect.s6.a
        @f5
        public C b() {
            return this.f56501c;
        }

        @Override // com.google.common.collect.s6.a
        @f5
        public V getValue() {
            return this.f56502d;
        }
    }

    /* compiled from: Tables.java */
    private static class d<R, C, V1, V2> extends q<R, C, V2> {

        /* renamed from: d, reason: collision with root package name */
        final s6<R, C, V1> f56503d;

        /* renamed from: e, reason: collision with root package name */
        final com.google.common.base.x<? super V1, V2> f56504e;

        /* compiled from: Tables.java */
        class a implements com.google.common.base.x<s6.a<R, C, V1>, s6.a<R, C, V2>> {
            a() {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public s6.a<R, C, V2> apply(s6.a<R, C, V1> aVar) {
                return t6.c(aVar.a(), aVar.b(), d.this.f56504e.apply(aVar.getValue()));
            }
        }

        /* compiled from: Tables.java */
        class b implements com.google.common.base.x<Map<C, V1>, Map<C, V2>> {
            b() {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<C, V2> apply(Map<C, V1> map) {
                return p4.B0(map, d.this.f56504e);
            }
        }

        /* compiled from: Tables.java */
        class c implements com.google.common.base.x<Map<R, V1>, Map<R, V2>> {
            c() {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Map<R, V2> apply(Map<R, V1> map) {
                return p4.B0(map, d.this.f56504e);
            }
        }

        d(s6<R, C, V1> s6Var, com.google.common.base.x<? super V1, V2> xVar) {
            s6Var.getClass();
            this.f56503d = s6Var;
            xVar.getClass();
            this.f56504e = xVar;
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        @zc.a
        public V2 D1(@f5 R r4, @f5 C c5, @f5 V2 v22) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public boolean I2(@zc.a Object obj, @zc.a Object obj2) {
            return this.f56503d.I2(obj, obj2);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        @zc.a
        public V2 L(@zc.a Object obj, @zc.a Object obj2) {
            if (I2(obj, obj2)) {
                return this.f56504e.apply(this.f56503d.L(obj, obj2));
            }
            return null;
        }

        @Override // com.google.common.collect.q
        Iterator<s6.a<R, C, V2>> a() {
            return d4.c0(this.f56503d.B1().iterator(), e());
        }

        @Override // com.google.common.collect.q
        Collection<V2> c() {
            return new c0.f(this.f56503d.values(), this.f56504e);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public void clear() {
            this.f56503d.clear();
        }

        com.google.common.base.x<s6.a<R, C, V1>, s6.a<R, C, V2>> e() {
            return new a();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public void e1(s6<? extends R, ? extends C, ? extends V2> s6Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public Set<R> i() {
            return this.f56503d.i();
        }

        @Override // com.google.common.collect.s6
        public Map<C, V2> i3(@f5 R r4) {
            return p4.B0(this.f56503d.i3(r4), this.f56504e);
        }

        @Override // com.google.common.collect.s6
        public Map<C, Map<R, V2>> j1() {
            return p4.B0(this.f56503d.j1(), new c());
        }

        @Override // com.google.common.collect.s6
        public Map<R, Map<C, V2>> m() {
            return p4.B0(this.f56503d.m(), new b());
        }

        @Override // com.google.common.collect.s6
        public Map<R, V2> n1(@f5 C c5) {
            return p4.B0(this.f56503d.n1(c5), this.f56504e);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public Set<C> q2() {
            return this.f56503d.q2();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        @zc.a
        public V2 remove(@zc.a Object obj, @zc.a Object obj2) {
            if (I2(obj, obj2)) {
                return this.f56504e.apply(this.f56503d.remove(obj, obj2));
            }
            return null;
        }

        @Override // com.google.common.collect.s6
        public int size() {
            return this.f56503d.size();
        }
    }

    /* compiled from: Tables.java */
    private static class e<C, R, V> extends q<C, R, V> {

        /* renamed from: e, reason: collision with root package name */
        private static final com.google.common.base.x<s6.a<?, ?, ?>, s6.a<?, ?, ?>> f56508e = new a();

        /* renamed from: d, reason: collision with root package name */
        final s6<R, C, V> f56509d;

        /* compiled from: Tables.java */
        class a implements com.google.common.base.x<s6.a<?, ?, ?>, s6.a<?, ?, ?>> {
            a() {
            }

            @Override // com.google.common.base.x
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public s6.a<?, ?, ?> apply(s6.a<?, ?, ?> aVar) {
                return t6.c(aVar.b(), aVar.a(), aVar.getValue());
            }
        }

        e(s6<R, C, V> s6Var) {
            s6Var.getClass();
            this.f56509d = s6Var;
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public boolean A2(@zc.a Object obj) {
            return this.f56509d.S(obj);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        @zc.a
        public V D1(@f5 C c5, @f5 R r4, @f5 V v4) {
            return this.f56509d.D1(r4, c5, v4);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public boolean I2(@zc.a Object obj, @zc.a Object obj2) {
            return this.f56509d.I2(obj2, obj);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        @zc.a
        public V L(@zc.a Object obj, @zc.a Object obj2) {
            return this.f56509d.L(obj2, obj);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public boolean S(@zc.a Object obj) {
            return this.f56509d.A2(obj);
        }

        @Override // com.google.common.collect.q
        Iterator<s6.a<C, R, V>> a() {
            return d4.c0(this.f56509d.B1().iterator(), f56508e);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public void clear() {
            this.f56509d.clear();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public boolean containsValue(@zc.a Object obj) {
            return this.f56509d.containsValue(obj);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public void e1(s6<? extends C, ? extends R, ? extends V> s6Var) {
            this.f56509d.e1(t6.g(s6Var));
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public Set<C> i() {
            return this.f56509d.q2();
        }

        @Override // com.google.common.collect.s6
        public Map<R, V> i3(@f5 C c5) {
            return this.f56509d.n1(c5);
        }

        @Override // com.google.common.collect.s6
        public Map<R, Map<C, V>> j1() {
            return this.f56509d.m();
        }

        @Override // com.google.common.collect.s6
        public Map<C, Map<R, V>> m() {
            return this.f56509d.j1();
        }

        @Override // com.google.common.collect.s6
        public Map<C, V> n1(@f5 R r4) {
            return this.f56509d.i3(r4);
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public Set<R> q2() {
            return this.f56509d.i();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        @zc.a
        public V remove(@zc.a Object obj, @zc.a Object obj2) {
            return this.f56509d.remove(obj2, obj);
        }

        @Override // com.google.common.collect.s6
        public int size() {
            return this.f56509d.size();
        }

        @Override // com.google.common.collect.q, com.google.common.collect.s6
        public Collection<V> values() {
            return this.f56509d.values();
        }
    }

    /* compiled from: Tables.java */
    static final class f<R, C, V> extends g<R, C, V> implements a6<R, C, V> {

        /* renamed from: d, reason: collision with root package name */
        private static final long f56510d = 0;

        public f(a6<R, ? extends C, ? extends V> a6Var) {
            super(a6Var);
        }

        protected a6<R, C, V> A3() {
            return (a6) this.f56512b;
        }

        @Override // com.google.common.collect.t6.g, com.google.common.collect.p2, com.google.common.collect.s6
        public SortedSet<R> i() {
            return Collections.unmodifiableSortedSet(((a6) this.f56512b).i());
        }

        @Override // com.google.common.collect.t6.g, com.google.common.collect.p2, com.google.common.collect.h2
        protected Object u3() {
            return (a6) this.f56512b;
        }

        @Override // com.google.common.collect.t6.g, com.google.common.collect.p2
        /* renamed from: v3 */
        protected s6 u3() {
            return (a6) this.f56512b;
        }

        @Override // com.google.common.collect.t6.g, com.google.common.collect.p2, com.google.common.collect.s6
        public SortedMap<R, Map<C, V>> m() {
            return Collections.unmodifiableSortedMap(p4.D0(((a6) this.f56512b).m(), t6.a()));
        }
    }

    /* compiled from: Tables.java */
    private static class g<R, C, V> extends p2<R, C, V> implements Serializable {

        /* renamed from: c, reason: collision with root package name */
        private static final long f56511c = 0;

        /* renamed from: b, reason: collision with root package name */
        final s6<? extends R, ? extends C, ? extends V> f56512b;

        g(s6<? extends R, ? extends C, ? extends V> s6Var) {
            s6Var.getClass();
            this.f56512b = s6Var;
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public Set<s6.a<R, C, V>> B1() {
            return Collections.unmodifiableSet(super.B1());
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        @zc.a
        public V D1(@f5 R r4, @f5 C c5, @f5 V v4) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public void e1(s6<? extends R, ? extends C, ? extends V> s6Var) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public Set<R> i() {
            return Collections.unmodifiableSet(super.i());
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public Map<C, V> i3(@f5 R r4) {
            return Collections.unmodifiableMap(super.i3(r4));
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public Map<C, Map<R, V>> j1() {
            return Collections.unmodifiableMap(p4.B0(super.j1(), t6.a()));
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public Map<R, Map<C, V>> m() {
            return Collections.unmodifiableMap(p4.B0(super.m(), t6.a()));
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public Map<R, V> n1(@f5 C c5) {
            return Collections.unmodifiableMap(super.n1(c5));
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public Set<C> q2() {
            return Collections.unmodifiableSet(super.q2());
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        @zc.a
        public V remove(@zc.a Object obj, @zc.a Object obj2) {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.p2, com.google.common.collect.h2
        /* renamed from: v3 */
        public s6<R, C, V> u3() {
            return this.f56512b;
        }

        @Override // com.google.common.collect.p2, com.google.common.collect.s6
        public Collection<V> values() {
            return Collections.unmodifiableCollection(super.values());
        }
    }

    private t6() {
    }

    static com.google.common.base.x a() {
        return f56498a;
    }

    static boolean b(s6<?, ?, ?> s6Var, @zc.a Object obj) {
        if (obj == s6Var) {
            return true;
        }
        if (obj instanceof s6) {
            return s6Var.B1().equals(((s6) obj).B1());
        }
        return false;
    }

    public static <R, C, V> s6.a<R, C, V> c(@f5 R r4, @f5 C c5, @f5 V v4) {
        return new c(r4, c5, v4);
    }

    @d9.a
    public static <R, C, V> s6<R, C, V> d(Map<R, Map<C, V>> map, com.google.common.base.u0<? extends Map<C, V>> u0Var) {
        com.google.common.base.l0.d(map.isEmpty());
        u0Var.getClass();
        return new q6(map, u0Var);
    }

    public static <R, C, V> s6<R, C, V> e(s6<R, C, V> s6Var) {
        return new r6.x((Object) s6Var, (Object) null);
    }

    @d9.a
    public static <R, C, V1, V2> s6<R, C, V2> f(s6<R, C, V1> s6Var, com.google.common.base.x<? super V1, V2> xVar) {
        return new d(s6Var, xVar);
    }

    public static <R, C, V> s6<C, R, V> g(s6<R, C, V> s6Var) {
        return s6Var instanceof e ? ((e) s6Var).f56509d : new e(s6Var);
    }

    @d9.a
    public static <R, C, V> a6<R, C, V> h(a6<R, ? extends C, ? extends V> a6Var) {
        return new f((s6) a6Var);
    }

    public static <R, C, V> s6<R, C, V> i(s6<? extends R, ? extends C, ? extends V> s6Var) {
        return new g(s6Var);
    }

    private static <K, V> com.google.common.base.x<Map<K, V>, Map<K, V>> j() {
        return (com.google.common.base.x<Map<K, V>, Map<K, V>>) f56498a;
    }
}
