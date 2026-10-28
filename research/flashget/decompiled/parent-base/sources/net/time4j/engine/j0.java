package net.time4j.engine;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.m0;
import net.time4j.engine.x;

/* compiled from: TimeAxis.java */
/* loaded from: classes7.dex */
public final class j0<U, T extends m0<U, T>> extends x<T> implements k0<T> {

    /* renamed from: i, reason: collision with root package name */
    private final Class<U> f82738i;

    /* renamed from: j, reason: collision with root package name */
    private final Map<U, o0<T>> f82739j;

    /* renamed from: k, reason: collision with root package name */
    private final Map<U, Double> f82740k;

    /* renamed from: l, reason: collision with root package name */
    private final Map<U, Set<U>> f82741l;

    /* renamed from: m, reason: collision with root package name */
    private final Map<q<?>, U> f82742m;

    /* renamed from: n, reason: collision with root package name */
    private final T f82743n;

    /* renamed from: o, reason: collision with root package name */
    private final T f82744o;

    /* renamed from: p, reason: collision with root package name */
    private final l<T> f82745p;

    /* renamed from: q, reason: collision with root package name */
    private final q<T> f82746q;

    /* renamed from: r, reason: collision with root package name */
    private final k0<T> f82747r;

    /* compiled from: TimeAxis.java */
    class a implements Comparator<U> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Map f82748b;

        a(Map map) {
            this.f82748b = map;
        }

        @Override // java.util.Comparator
        public int compare(U u4, U u5) {
            return Double.compare(j0.v0(this.f82748b, u4), j0.v0(this.f82748b, u5));
        }
    }

    /* compiled from: TimeAxis.java */
    class b implements Comparator<U> {
        b() {
        }

        @Override // java.util.Comparator
        public int compare(U u4, U u5) {
            return Double.compare(j0.this.u0(u5), j0.this.u0(u4));
        }
    }

    /* compiled from: TimeAxis.java */
    public static final class c<U, T extends m0<U, T>> extends x.a<T> {

        /* renamed from: f, reason: collision with root package name */
        private final Class<U> f82751f;

        /* renamed from: g, reason: collision with root package name */
        private final Map<U, o0<T>> f82752g;

        /* renamed from: h, reason: collision with root package name */
        private final Map<U, Double> f82753h;

        /* renamed from: i, reason: collision with root package name */
        private final Map<U, Set<U>> f82754i;

        /* renamed from: j, reason: collision with root package name */
        private final Map<q<?>, U> f82755j;

        /* renamed from: k, reason: collision with root package name */
        private final T f82756k;

        /* renamed from: l, reason: collision with root package name */
        private final T f82757l;

        /* renamed from: m, reason: collision with root package name */
        private final l<T> f82758m;

        /* renamed from: n, reason: collision with root package name */
        private k0<T> f82759n;

        private c(Class<U> cls, Class<T> cls2, u<T> uVar, T t4, T t5, l<T> lVar, k0<T> k0Var) {
            super(cls2, uVar);
            this.f82759n = null;
            if (cls == null) {
                throw new NullPointerException(ProtectedSandApp.s("錓\u0001"));
            }
            if (t4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("錒\u0001"));
            }
            if (t5 == null) {
                throw new NullPointerException(ProtectedSandApp.s("錑\u0001"));
            }
            if (n.class.isAssignableFrom(cls2) && lVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("錐\u0001"));
            }
            this.f82751f = cls;
            this.f82752g = new HashMap();
            this.f82753h = new HashMap();
            this.f82754i = new HashMap();
            this.f82755j = new HashMap();
            this.f82756k = t4;
            this.f82757l = t5;
            this.f82758m = lVar;
            this.f82759n = k0Var;
        }

        private void l(U u4) {
            String s4;
            if (this.f82774b) {
                return;
            }
            Iterator<U> it = this.f82752g.keySet().iterator();
            do {
                boolean hasNext = it.hasNext();
                s4 = ProtectedSandApp.s("錔\u0001");
                if (!hasNext) {
                    if (u4 instanceof Enum) {
                        String name = ((Enum) Enum.class.cast(u4)).name();
                        for (U u5 : this.f82752g.keySet()) {
                            if ((u5 instanceof Enum) && ((Enum) Enum.class.cast(u5)).name().equals(name)) {
                                throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(s4, name));
                            }
                        }
                        return;
                    }
                    return;
                }
            } while (!it.next().equals(u4));
            throw new IllegalArgumentException(s4 + u4.toString());
        }

        public static <U, D extends n<U, D>> c<U, D> m(Class<U> cls, Class<D> cls2, u<D> uVar, l<D> lVar) {
            c<U, D> cVar = new c<>(cls, cls2, uVar, lVar.e(lVar.g()), lVar.e(lVar.d()), lVar, null);
            for (b0 b0Var : b0.values()) {
                super.a(b0Var, b0Var.derive(lVar));
            }
            return cVar;
        }

        public static <U, T extends m0<U, T>> c<U, T> n(Class<U> cls, Class<T> cls2, u<T> uVar, T t4, T t5) {
            return new c<>(cls, cls2, uVar, t4, t5, null, null);
        }

        @Override // net.time4j.engine.x.a
        public x.a a(q qVar, a0 a0Var) {
            super.a(qVar, a0Var);
            return this;
        }

        @Override // net.time4j.engine.x.a
        public x.a b(s sVar) {
            super.b(sVar);
            return this;
        }

        public <V> c<U, T> f(q<V> qVar, a0<T, V> a0Var) {
            super.a(qVar, a0Var);
            return this;
        }

        public <V> c<U, T> g(q<V> qVar, a0<T, V> a0Var, U u4) {
            if (u4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("錕\u0001"));
            }
            super.a(qVar, a0Var);
            this.f82755j.put(qVar, u4);
            return this;
        }

        public c<U, T> h(s sVar) {
            super.b(sVar);
            return this;
        }

        public c<U, T> i(U u4, o0<T> o0Var, double d5) {
            return j(u4, o0Var, d5, Collections.emptySet());
        }

        public c<U, T> j(U u4, o0<T> o0Var, double d5, Set<? extends U> set) {
            if (u4 == null) {
                throw new NullPointerException(ProtectedSandApp.s("錚\u0001"));
            }
            if (o0Var == null) {
                throw new NullPointerException(ProtectedSandApp.s("錙\u0001"));
            }
            l(u4);
            Iterator<? extends U> it = set.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    throw new NullPointerException(ProtectedSandApp.s("錖\u0001"));
                }
            }
            if (Double.isNaN(d5)) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.b0.a(ProtectedSandApp.s("錘\u0001"), d5));
            }
            if (Double.isInfinite(d5)) {
                throw new IllegalArgumentException(androidx.compose.ui.graphics.colorspace.b0.a(ProtectedSandApp.s("錗\u0001"), d5));
            }
            this.f82752g.put(u4, o0Var);
            this.f82753h.put(u4, Double.valueOf(d5));
            HashSet hashSet = new HashSet(set);
            hashSet.remove(u4);
            this.f82754i.put(u4, hashSet);
            return this;
        }

        @Override // net.time4j.engine.x.a
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public j0<U, T> c() {
            if (this.f82752g.isEmpty()) {
                throw new IllegalStateException(ProtectedSandApp.s("錛\u0001"));
            }
            j0<U, T> j0Var = new j0<>(this.f82773a, this.f82751f, this.f82775c, this.f82776d, this.f82752g, this.f82753h, this.f82754i, this.f82777e, this.f82755j, this.f82756k, this.f82757l, this.f82758m, this.f82759n, null);
            x.S(j0Var);
            return j0Var;
        }

        public c<U, T> o(k0<T> k0Var) {
            if (k0Var == null) {
                throw new NullPointerException(ProtectedSandApp.s("錜\u0001"));
            }
            this.f82759n = k0Var;
            return this;
        }
    }

    /* compiled from: TimeAxis.java */
    private static class d<U, T extends m0<U, T>> implements k0<T> {

        /* renamed from: b, reason: collision with root package name */
        private final U f82760b;

        /* renamed from: c, reason: collision with root package name */
        private final T f82761c;

        /* renamed from: d, reason: collision with root package name */
        private final T f82762d;

        d(U u4, T t4, T t5) {
            this.f82760b = u4;
            this.f82761c = t4;
            this.f82762d = t5;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(T t4, T t5) {
            return t4.compareTo(t5);
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public T p0(T t4) {
            if (t4.compareTo(this.f82761c) <= 0) {
                return null;
            }
            return (T) t4.U(1L, this.f82760b);
        }

        @Override // net.time4j.engine.k0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public T A(T t4) {
            if (t4.compareTo(this.f82762d) >= 0) {
                return null;
            }
            return (T) t4.W(1L, this.f82760b);
        }

        @Override // net.time4j.engine.k0
        public boolean isCalendrical() {
            return this.f82762d instanceof h;
        }
    }

    /* compiled from: TimeAxis.java */
    private static class e<T extends m0<?, T>> extends net.time4j.engine.e<T> implements a0<T, T> {
        private static final long serialVersionUID = 4777240530511579802L;
        private final T max;
        private final T min;
        private final Class<T> type;

        /* synthetic */ e(Class cls, m0 m0Var, m0 m0Var2, a aVar) {
            this(cls, m0Var, m0Var2);
        }

        @Override // net.time4j.engine.q
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public T getDefaultMaximum() {
            return this.max;
        }

        @Override // net.time4j.engine.q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public T getDefaultMinimum() {
            return this.min;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public T getMaximum(T t4) {
            return getDefaultMaximum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public T getMinimum(T t4) {
            return getDefaultMinimum();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public T getValue(T t4) {
            return t4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean j(T t4, T t5) {
            return t5 != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public T withValue(T t4, T t5, boolean z4) {
            if (t5 != null) {
                return t5;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("錞\u0001"));
        }

        @Override // net.time4j.engine.e
        protected <X extends r<X>> a0<X, T> g(x<X> xVar) {
            if (xVar.C().equals(this.type)) {
                return this;
            }
            return null;
        }

        @Override // net.time4j.engine.q
        public Class<T> getType() {
            return this.type;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected String o(x<?> xVar) {
            return null;
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(T t4) {
            throw new UnsupportedOperationException();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(T t4) {
            throw new UnsupportedOperationException();
        }

        private e(Class<T> cls, T t4, T t5) {
            super(cls.getName().concat(ProtectedSandApp.s("錝\u0001")));
            this.type = cls;
            this.min = t4;
            this.max = t5;
        }
    }

    /* synthetic */ j0(Class cls, Class cls2, u uVar, Map map, Map map2, Map map3, Map map4, List list, Map map5, m0 m0Var, m0 m0Var2, l lVar, k0 k0Var, a aVar) {
        this(cls, cls2, uVar, map, map2, map3, map4, list, map5, m0Var, m0Var2, lVar, k0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <U> double v0(Map<U, Double> map, U u4) {
        Double d5 = map.get(u4);
        if (d5 != null) {
            return d5.doubleValue();
        }
        if (u4 instanceof w) {
            return ((w) w.class.cast(u4)).getLength();
        }
        return Double.NaN;
    }

    public Class<U> A0() {
        return this.f82738i;
    }

    public boolean B0(q<?> qVar) {
        boolean z4 = false;
        if (qVar == null) {
            return false;
        }
        boolean containsKey = this.f82742m.containsKey(qVar);
        if (containsKey || !(qVar instanceof net.time4j.engine.e)) {
            return containsKey;
        }
        q<?> n4 = ((net.time4j.engine.e) qVar).n();
        if (n4 != null && this.f82742m.containsKey(n4)) {
            z4 = true;
        }
        return z4;
    }

    public boolean C0(U u4, U u5) {
        Set<U> set = this.f82741l.get(u4);
        return set != null && set.contains(u5);
    }

    public boolean D0(U u4) {
        return this.f82739j.containsKey(u4);
    }

    public boolean E0(U u4) {
        if (this.f82739j.containsKey(u4)) {
            return true;
        }
        return (u4 instanceof f) && ((f) f.class.cast(u4)).b(this) != null;
    }

    @Override // net.time4j.engine.k0
    /* renamed from: F0, reason: merged with bridge method [inline-methods] */
    public T p0(T t4) {
        return this.f82747r.p0(t4);
    }

    @Override // net.time4j.engine.k0
    /* renamed from: G0, reason: merged with bridge method [inline-methods] */
    public T A(T t4) {
        return this.f82747r.A(t4);
    }

    public Comparator<? super U> H0() {
        return new b();
    }

    @Override // net.time4j.engine.x
    public boolean J() {
        return this.f82745p != null;
    }

    public int c0(T t4, T t5) {
        return t4.compareTo(t5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return ((m0) obj).compareTo((m0) obj2);
    }

    @Override // net.time4j.engine.k0
    public boolean isCalendrical() {
        return this.f82745p != null;
    }

    @Override // net.time4j.engine.x, net.time4j.engine.u
    /* renamed from: o0, reason: merged with bridge method [inline-methods] */
    public T e(r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
        return rVar.w(this.f82746q) ? (T) rVar.r(this.f82746q) : (T) super.e(rVar, dVar, z4, z5);
    }

    public q<T> q0() {
        return this.f82746q;
    }

    public U t0(q<?> qVar) {
        if (qVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("錠\u0001"));
        }
        U u4 = this.f82742m.get(qVar);
        if (u4 == null && (qVar instanceof net.time4j.engine.e)) {
            u4 = this.f82742m.get(((net.time4j.engine.e) qVar).n());
        }
        if (u4 != null) {
            return u4;
        }
        throw new ChronoException(net.time4j.g0.a(qVar, new StringBuilder(ProtectedSandApp.s("錟\u0001"))));
    }

    public double u0(U u4) {
        return v0(this.f82740k, u4);
    }

    public T w0() {
        return this.f82744o;
    }

    public T x0() {
        return this.f82743n;
    }

    @Override // net.time4j.engine.x
    public l<T> y() {
        l<T> lVar = this.f82745p;
        return lVar == null ? super.y() : lVar;
    }

    public Set<U> y0() {
        return this.f82739j.keySet();
    }

    @Override // net.time4j.engine.x
    public l<T> z(String str) {
        return str.isEmpty() ? y() : super.z(str);
    }

    o0<T> z0(U u4) {
        o0<T> b5;
        if (u4 == null) {
            throw new NullPointerException(ProtectedSandApp.s("錡\u0001"));
        }
        if (this.f82739j.containsKey(u4)) {
            return this.f82739j.get(u4);
        }
        if (!(u4 instanceof f) || (b5 = ((f) f.class.cast(u4)).b(this)) == null) {
            throw new RuleNotFoundException(this, u4);
        }
        return b5;
    }

    private j0(Class<T> cls, Class<U> cls2, u<T> uVar, Map<q<?>, a0<T, ?>> map, Map<U, o0<T>> map2, Map<U, Double> map3, Map<U, Set<U>> map4, List<s> list, Map<q<?>, U> map5, T t4, T t5, l<T> lVar, k0<T> k0Var) {
        super(cls, uVar, map, list);
        this.f82738i = cls2;
        this.f82739j = Collections.unmodifiableMap(map2);
        this.f82740k = Collections.unmodifiableMap(map3);
        this.f82741l = Collections.unmodifiableMap(map4);
        this.f82742m = Collections.unmodifiableMap(map5);
        this.f82743n = t4;
        this.f82744o = t5;
        this.f82745p = lVar;
        this.f82746q = new e(cls, t4, t5, null);
        if (k0Var != null) {
            this.f82747r = k0Var;
            return;
        }
        ArrayList arrayList = new ArrayList(map2.keySet());
        Collections.sort(arrayList, new a(map3));
        this.f82747r = new d(arrayList.get(0), t4, t5);
    }
}
