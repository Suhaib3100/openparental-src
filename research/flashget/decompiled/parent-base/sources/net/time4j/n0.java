package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.text.ParseException;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.engine.ChronoException;
import net.time4j.engine.j0;
import net.time4j.m0;

/* compiled from: PlainTimestamp.java */
@net.time4j.format.c("iso8601")
/* loaded from: classes7.dex */
public final class n0 extends net.time4j.engine.m0<z, n0> implements net.time4j.base.a, net.time4j.base.g, net.time4j.engine.i0<n0>, net.time4j.engine.f0<z>, net.time4j.format.h {

    /* renamed from: d, reason: collision with root package name */
    private static final int f83404d = 1000000000;

    /* renamed from: e, reason: collision with root package name */
    private static final n0 f83405e;

    /* renamed from: f, reason: collision with root package name */
    private static final n0 f83406f;

    /* renamed from: g, reason: collision with root package name */
    private static final Map<Object, net.time4j.engine.q<?>> f83407g;

    /* renamed from: h, reason: collision with root package name */
    private static final net.time4j.engine.j0<z, n0> f83408h;

    /* renamed from: i, reason: collision with root package name */
    private static final net.time4j.engine.l0<z, p<z>> f83409i;
    private static final long serialVersionUID = 7458380065762437714L;

    /* renamed from: b, reason: collision with root package name */
    private final transient l0 f83410b;

    /* renamed from: c, reason: collision with root package name */
    private final transient m0 f83411c;

    /* compiled from: PlainTimestamp.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83412a;

        static {
            int[] iArr = new int[j.values().length];
            f83412a = iArr;
            try {
                iArr[j.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83412a[j.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83412a[j.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f83412a[j.MILLIS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83412a[j.MICROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f83412a[j.NANOS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: PlainTimestamp.java */
    private static class c extends d<BigDecimal> {
        c(net.time4j.engine.q<BigDecimal> qVar) {
            super(qVar, null);
        }

        @Override // net.time4j.n0.d
        /* renamed from: n, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public boolean j(n0 n0Var, BigDecimal bigDecimal) {
            if (bigDecimal == null) {
                return false;
            }
            return ((BigDecimal) ((d) this).f83415b.getDefaultMinimum()).compareTo(bigDecimal) <= 0 && bigDecimal.compareTo((BigDecimal) ((d) this).f83415b.getDefaultMaximum()) <= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.n0.d, net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public n0 withValue(n0 n0Var, BigDecimal bigDecimal, boolean z4) {
            if (isValid(n0Var, bigDecimal)) {
                return n0.B0(n0Var.f83410b, (m0) n0Var.f83411c.M(((d) this).f83415b, bigDecimal));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("韲\u0001") + bigDecimal);
        }
    }

    /* compiled from: PlainTimestamp.java */
    private static class d<V> implements net.time4j.engine.a0<n0, V> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<V> f83415b;

        /* synthetic */ d(net.time4j.engine.q qVar, a aVar) {
            this(qVar);
        }

        static <V> d<V> k(net.time4j.engine.q<V> qVar) {
            return new d<>(qVar);
        }

        private long l(V v4) {
            return ((Number) Number.class.cast(v4)).longValue();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(n0 n0Var) {
            return (net.time4j.engine.q) n0.f83407g.get(this.f83415b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(n0 n0Var) {
            return (net.time4j.engine.q) n0.f83407g.get(this.f83415b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public V getMaximum(n0 n0Var) {
            if (this.f83415b.isDateElement()) {
                return (V) n0Var.f83410b.g(this.f83415b);
            }
            if (this.f83415b.isTimeElement()) {
                return this.f83415b.getDefaultMaximum();
            }
            throw new ChronoException(g0.a(this.f83415b, new StringBuilder(ProtectedSandApp.s("韯\u0001"))));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public V getMinimum(n0 n0Var) {
            if (this.f83415b.isDateElement()) {
                return (V) n0Var.f83410b.i(this.f83415b);
            }
            if (this.f83415b.isTimeElement()) {
                return this.f83415b.getDefaultMinimum();
            }
            throw new ChronoException(g0.a(this.f83415b, new StringBuilder(ProtectedSandApp.s("韯\u0001"))));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public V getValue(n0 n0Var) {
            if (this.f83415b.isDateElement()) {
                return (V) n0Var.f83410b.r(this.f83415b);
            }
            if (this.f83415b.isTimeElement()) {
                return (V) n0Var.f83411c.r(this.f83415b);
            }
            throw new ChronoException(g0.a(this.f83415b, new StringBuilder(ProtectedSandApp.s("韯\u0001"))));
        }

        @Override // net.time4j.engine.a0
        public boolean j(n0 n0Var, V v4) {
            if (v4 == null) {
                return false;
            }
            if (this.f83415b.isDateElement()) {
                return n0Var.f83410b.G(this.f83415b, v4);
            }
            if (!this.f83415b.isTimeElement()) {
                throw new ChronoException(g0.a(this.f83415b, new StringBuilder(ProtectedSandApp.s("韯\u0001"))));
            }
            if (Number.class.isAssignableFrom(this.f83415b.getType())) {
                long l4 = l(this.f83415b.getDefaultMinimum());
                long l5 = l(this.f83415b.getDefaultMaximum());
                long l6 = l(v4);
                return l4 <= l6 && l5 >= l6;
            }
            if (this.f83415b.equals(m0.f83368s) && m0.f83367r.equals(v4)) {
                return false;
            }
            return n0Var.f83411c.G(this.f83415b, v4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: m */
        public n0 withValue(n0 n0Var, V v4, boolean z4) {
            if (v4 == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("韱\u0001"));
            }
            if (v4.equals(getValue(n0Var))) {
                return n0Var;
            }
            if (z4) {
                return n0Var.W(net.time4j.base.c.m(l(v4), l(getValue(n0Var))), (z) n0.f83408h.t0(this.f83415b));
            }
            if (this.f83415b.isDateElement()) {
                return n0.B0((l0) n0Var.f83410b.M(this.f83415b, v4), n0Var.f83411c);
            }
            if (!this.f83415b.isTimeElement()) {
                throw new ChronoException(g0.a(this.f83415b, new StringBuilder(ProtectedSandApp.s("韯\u0001"))));
            }
            boolean isAssignableFrom = Number.class.isAssignableFrom(this.f83415b.getType());
            String s4 = ProtectedSandApp.s("韰\u0001");
            if (isAssignableFrom) {
                long l4 = l(this.f83415b.getDefaultMinimum());
                long l5 = l(this.f83415b.getDefaultMaximum());
                long l6 = l(v4);
                if (l4 > l6 || l5 < l6) {
                    throw new IllegalArgumentException(androidx.databinding.a.a(s4, v4));
                }
            } else if (this.f83415b.equals(m0.f83368s) && v4.equals(m0.f83367r)) {
                throw new IllegalArgumentException(androidx.databinding.a.a(s4, v4));
            }
            return n0.B0(n0Var.f83410b, (m0) n0Var.f83411c.M(this.f83415b, v4));
        }

        private d(net.time4j.engine.q<V> qVar) {
            this.f83415b = qVar;
        }
    }

    /* compiled from: PlainTimestamp.java */
    private static class e implements net.time4j.engine.u<n0> {
        private e() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public n0 o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.l lVar;
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                lVar = net.time4j.tz.l.c0((net.time4j.tz.k) dVar.a(cVar));
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                lVar = net.time4j.tz.l.e0();
            }
            ?? c5 = eVar.c();
            return n0.j0(c5, lVar.I(c5));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n0 e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            m0 e4;
            net.time4j.tz.k kVar;
            if (rVar instanceof net.time4j.base.f) {
                net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
                if (dVar.c(cVar)) {
                    kVar = (net.time4j.tz.k) dVar.a(cVar);
                } else {
                    if (!z4) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("音\u0001"));
                    }
                    kVar = net.time4j.tz.p.f83649l;
                }
                return d0.y0((net.time4j.base.f) net.time4j.base.f.class.cast(rVar)).j1(kVar);
            }
            boolean z6 = z5 && rVar.l(m0.C) == 60;
            if (z6) {
                rVar.K(m0.C, 59);
            }
            net.time4j.engine.q<?> qVar = l0.f83325p;
            l0 e5 = rVar.w(qVar) ? (l0) rVar.r(qVar) : l0.T0().e(rVar, dVar, z4, false);
            if (e5 == null) {
                return null;
            }
            net.time4j.engine.q<?> qVar2 = m0.f83368s;
            if (rVar.w(qVar2)) {
                e4 = (m0) rVar.r(qVar2);
            } else {
                e4 = m0.y0().e(rVar, dVar, z4, false);
                if (e4 == null && z4) {
                    e4 = m0.f83366q;
                }
            }
            if (e4 == null) {
                return null;
            }
            net.time4j.engine.q<?> qVar3 = a0.f81813h;
            if (rVar.w(qVar3)) {
                e5 = (l0) e5.W(((Long) rVar.r(qVar3)).longValue(), h.DAYS);
            }
            if (z6) {
                net.time4j.engine.c0 c0Var = net.time4j.engine.c0.LEAP_SECOND;
                Boolean bool = Boolean.TRUE;
                if (rVar.G(c0Var, bool)) {
                    rVar.M(c0Var, bool);
                }
            }
            return n0.B0(e5, e4);
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(n0 n0Var, net.time4j.engine.d dVar) {
            return n0Var;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return l0.T0().g();
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            net.time4j.format.e ofStyle = net.time4j.format.e.ofStyle(zVar.getStyleValue());
            return net.time4j.format.b.x(ofStyle, ofStyle, locale);
        }

        e(a aVar) {
        }
    }

    static {
        n0 n0Var = new n0(l0.f83315f, m0.f83366q);
        f83405e = n0Var;
        l0 l0Var = l0.f83316g;
        net.time4j.engine.q<m0> qVar = m0.f83368s;
        n0 n0Var2 = new n0(l0Var, qVar.getDefaultMaximum());
        f83406f = n0Var2;
        HashMap hashMap = new HashMap();
        net.time4j.engine.q<l0> qVar2 = l0.f83325p;
        hashMap.put(qVar2, qVar);
        net.time4j.c<Integer, l0> cVar = l0.f83327r;
        q0<Integer, l0> q0Var = l0.f83331v;
        hashMap.put(cVar, q0Var);
        net.time4j.c<Integer, l0> cVar2 = l0.f83328s;
        hashMap.put(cVar2, i1.f83248r.p());
        f0<s0> f0Var = l0.f83329t;
        q0<Integer, l0> q0Var2 = l0.f83335z;
        hashMap.put(f0Var, q0Var2);
        f0<e0> f0Var2 = l0.f83330u;
        q0<Integer, l0> q0Var3 = l0.f83332w;
        hashMap.put(f0Var2, q0Var3);
        hashMap.put(q0Var, q0Var3);
        hashMap.put(q0Var3, qVar);
        f0<g1> f0Var3 = l0.f83333x;
        hashMap.put(f0Var3, qVar);
        q0<Integer, l0> q0Var4 = l0.f83334y;
        hashMap.put(q0Var4, qVar);
        hashMap.put(q0Var2, qVar);
        j0 j0Var = l0.A;
        hashMap.put(j0Var, qVar);
        m1<c0> m1Var = m0.f83370u;
        q0<Integer, m0> q0Var5 = m0.f83373x;
        hashMap.put(m1Var, q0Var5);
        net.time4j.c<Integer, m0> cVar3 = m0.f83371v;
        q0<Integer, m0> q0Var6 = m0.A;
        hashMap.put(cVar3, q0Var6);
        net.time4j.c<Integer, m0> cVar4 = m0.f83372w;
        hashMap.put(cVar4, q0Var6);
        hashMap.put(q0Var5, q0Var6);
        q0<Integer, m0> q0Var7 = m0.f83374y;
        hashMap.put(q0Var7, q0Var6);
        q0<Integer, m0> q0Var8 = m0.f83375z;
        hashMap.put(q0Var8, q0Var6);
        q0<Integer, m0> q0Var9 = m0.C;
        hashMap.put(q0Var6, q0Var9);
        q0<Integer, m0> q0Var10 = m0.B;
        hashMap.put(q0Var10, q0Var9);
        q0<Integer, m0> q0Var11 = m0.G;
        hashMap.put(q0Var9, q0Var11);
        q0<Integer, m0> q0Var12 = m0.D;
        hashMap.put(q0Var12, q0Var11);
        f83407g = Collections.unmodifiableMap(hashMap);
        j0.c n4 = j0.c.n(z.class, n0.class, new e(), n0Var, n0Var2);
        d k4 = d.k(qVar2);
        h hVar = h.DAYS;
        j0.c g4 = n4.g(qVar2, k4, hVar);
        d k5 = d.k(cVar);
        h hVar2 = h.YEARS;
        j0.c g5 = g4.g(cVar, k5, hVar2).g(cVar2, d.k(cVar2), f1.f82779b).g(f0Var, d.k(f0Var), h.QUARTERS);
        d k6 = d.k(f0Var2);
        h hVar3 = h.MONTHS;
        j0.c f4 = g5.g(f0Var2, k6, hVar3).g(q0Var, d.k(q0Var), hVar3).g(q0Var3, d.k(q0Var3), hVar).g(f0Var3, d.k(f0Var3), hVar).g(q0Var4, d.k(q0Var4), hVar).g(q0Var2, d.k(q0Var2), hVar).g(j0Var, d.k(j0Var), h.WEEKS).f(qVar, d.k(qVar)).f(m1Var, d.k(m1Var));
        d k7 = d.k(cVar3);
        j jVar = j.HOURS;
        j0.c g6 = f4.g(cVar3, k7, jVar).g(cVar4, d.k(cVar4), jVar).g(q0Var5, d.k(q0Var5), jVar).g(q0Var7, d.k(q0Var7), jVar).g(q0Var8, d.k(q0Var8), jVar);
        d k10 = d.k(q0Var6);
        j jVar2 = j.MINUTES;
        j0.c g7 = g6.g(q0Var6, k10, jVar2).g(q0Var10, d.k(q0Var10), jVar2);
        d k11 = d.k(q0Var9);
        j jVar3 = j.SECONDS;
        j0.c g10 = g7.g(q0Var9, k11, jVar3).g(q0Var12, d.k(q0Var12), jVar3);
        q0<Integer, m0> q0Var13 = m0.E;
        d k12 = d.k(q0Var13);
        j jVar4 = j.MILLIS;
        j0.c g11 = g10.g(q0Var13, k12, jVar4);
        q0<Integer, m0> q0Var14 = m0.F;
        d k13 = d.k(q0Var14);
        j jVar5 = j.MICROS;
        j0.c g12 = g11.g(q0Var14, k13, jVar5);
        d k14 = d.k(q0Var11);
        j jVar6 = j.NANOS;
        j0.c g13 = g12.g(q0Var11, k14, jVar6);
        q0<Integer, m0> q0Var15 = m0.H;
        j0.c g14 = g13.g(q0Var15, d.k(q0Var15), jVar4);
        q0<Long, m0> q0Var16 = m0.I;
        j0.c g15 = g14.g(q0Var16, d.k(q0Var16), jVar5);
        q0<Long, m0> q0Var17 = m0.J;
        j0.c g16 = g15.g(q0Var17, d.k(q0Var17), jVar6);
        m1<BigDecimal> m1Var2 = m0.K;
        a aVar = null;
        j0.c f5 = g16.f(m1Var2, new c(m1Var2, aVar));
        m1<BigDecimal> m1Var3 = m0.L;
        j0.c f6 = f5.f(m1Var3, new c(m1Var3, aVar));
        m1<BigDecimal> m1Var4 = m0.M;
        j0.c f7 = f6.f(m1Var4, new c(m1Var4, aVar));
        net.time4j.engine.q<j> qVar3 = m0.N;
        j0.c f10 = f7.f(qVar3, d.k(qVar3));
        E0(f10);
        F0(f10);
        G0(f10);
        f83408h = f10.c();
        f83409i = p.O(hVar2, hVar3, hVar, jVar, jVar2, jVar3, jVar6);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n0(l0 l0Var, m0 m0Var) {
        if (m0Var.u() == 24) {
            this.f83410b = (l0) l0Var.W(1L, h.DAYS);
            this.f83411c = m0.f83366q;
        } else {
            if (l0Var == null) {
                throw new NullPointerException(ProtectedSandApp.s("韴\u0001"));
            }
            this.f83410b = l0Var;
            this.f83411c = m0Var;
        }
    }

    public static n0 A0(int i4, int i5, int i6, int i7, int i10, int i11) {
        return new n0(l0.r1(i4, i5, i6), m0.c1(i7, i10, i11));
    }

    public static n0 B0(l0 l0Var, m0 m0Var) {
        return new n0(l0Var, m0Var);
    }

    public static n0 C0(String str, net.time4j.format.t<n0> tVar) {
        try {
            return tVar.f(str);
        } catch (ParseException e4) {
            throw new ChronoException(e4.getMessage(), (Throwable) e4);
        }
    }

    private static void E0(j0.c<z, n0> cVar) {
        Set<? extends z> range = EnumSet.range(h.MILLENNIA, h.MONTHS);
        Set<? extends z> range2 = EnumSet.range(h.WEEKS, h.DAYS);
        for (h hVar : h.values()) {
            cVar.j(hVar, new b(hVar), hVar.getLength(), hVar.compareTo(h.WEEKS) < 0 ? range : range2);
        }
    }

    private static void F0(j0.c<z, n0> cVar) {
        for (j jVar : j.values()) {
            cVar.j(jVar, new b(jVar), jVar.getLength(), EnumSet.allOf(j.class));
        }
    }

    private static void G0(j0.c<z, n0> cVar) {
        Iterator<net.time4j.engine.s> it = l0.T0().E().iterator();
        while (it.hasNext()) {
            cVar.h(it.next());
        }
        Iterator<net.time4j.engine.s> it2 = m0.y0().E().iterator();
        while (it2.hasNext()) {
            cVar.h(it2.next());
        }
    }

    public static <S> net.time4j.engine.x<S> g0(net.time4j.engine.y<S, n0> yVar) {
        return new net.time4j.engine.g(yVar, f83408h);
    }

    public static net.time4j.engine.j0<z, n0> h0() {
        return f83408h;
    }

    static n0 j0(net.time4j.base.f fVar, net.time4j.tz.p pVar) {
        long j4 = fVar.j() + pVar.i();
        int h4 = pVar.h() + fVar.a();
        if (h4 < 0) {
            h4 += 1000000000;
            j4--;
        } else if (h4 >= 1000000000) {
            h4 -= 1000000000;
            j4++;
        }
        l0 w12 = l0.w1(net.time4j.base.c.b(j4, MMKV.ExpireInDay), net.time4j.engine.b0.UNIX);
        int d5 = net.time4j.base.c.d(j4, MMKV.ExpireInDay);
        int i4 = d5 % 60;
        int i5 = d5 / 60;
        return new n0(w12, m0.d1(i5 / 60, i5 % 60, i4, h4));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("韵\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this, 8);
    }

    public static n0 y0() {
        return k1.g().e();
    }

    public static n0 z0(int i4, int i5, int i6, int i7, int i10) {
        return A0(i4, i5, i6, i7, i10, 0);
    }

    public String D0(net.time4j.format.t<n0> tVar) {
        return tVar.h(this);
    }

    public l0 H0() {
        return this.f83410b;
    }

    public m0 I0() {
        return this.f83411c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0 J0(q<?> qVar) {
        return (n0) N(qVar.h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0 K0(l0 l0Var) {
        return (n0) M(l0.f83325p, l0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0 L0(m0 m0Var) {
        return (n0) M(m0.f83368s, m0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<z, n0> y() {
        return f83408h;
    }

    @Override // net.time4j.base.g
    public int a() {
        return this.f83411c.a();
    }

    public d0 e0(net.time4j.tz.p pVar) {
        long i4 = net.time4j.base.c.i(this.f83410b.f1() + 730, 86400L) + (this.f83411c.u() * MMKV.ExpireInHour) + (this.f83411c.m() * 60) + this.f83411c.h();
        long i5 = i4 - pVar.i();
        int a5 = this.f83411c.a() - pVar.h();
        if (a5 < 0) {
            a5 += 1000000000;
            i5--;
        } else if (a5 >= 1000000000) {
            a5 -= 1000000000;
            i5++;
        }
        return d0.V0(i5, a5, net.time4j.scale.f.POSIX);
    }

    @Override // net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0)) {
            return false;
        }
        n0 n0Var = (n0) obj;
        return this.f83410b.equals(n0Var.f83410b) && this.f83411c.equals(n0Var.f83411c);
    }

    public d0 f0() {
        return e0(net.time4j.tz.p.f83649l);
    }

    @Override // net.time4j.base.g
    public int h() {
        return this.f83411c.h();
    }

    @Override // net.time4j.engine.m0
    public int hashCode() {
        return (this.f83411c.hashCode() * 37) + (this.f83410b.hashCode() * 13);
    }

    @Override // net.time4j.engine.m0, java.lang.Comparable
    /* renamed from: i0, reason: merged with bridge method [inline-methods] */
    public int compareTo(n0 n0Var) {
        if (this.f83410b.s(n0Var.f83410b)) {
            return 1;
        }
        if (this.f83410b.f(n0Var.f83410b)) {
            return -1;
        }
        return this.f83411c.compareTo(n0Var.f83411c);
    }

    public l0 k0() {
        return this.f83410b;
    }

    protected n0 l0() {
        return this;
    }

    @Override // net.time4j.base.g
    public int m() {
        return this.f83411c.m();
    }

    public m0 m0() {
        return this.f83411c;
    }

    public d0 n0(net.time4j.tz.l lVar) {
        if (lVar.U()) {
            return e0(lVar.H(this.f83410b, this.f83411c));
        }
        net.time4j.tz.o O = lVar.O();
        long c5 = O.c(this.f83410b, this.f83411c, lVar);
        d0 V0 = d0.V0(c5, this.f83411c.a(), net.time4j.scale.f.POSIX);
        if (O == net.time4j.tz.l.f83558f) {
            d0.u0(c5, this);
        }
        return V0;
    }

    @Override // net.time4j.base.a
    public int o() {
        return this.f83410b.o();
    }

    public l1 o0() {
        return s0(net.time4j.tz.l.e0());
    }

    public d0 p0() {
        return n0(net.time4j.tz.l.e0());
    }

    @Override // net.time4j.base.a
    public int q() {
        return this.f83410b.q();
    }

    public d0 r0(net.time4j.tz.k kVar) {
        return n0(net.time4j.tz.l.c0(kVar));
    }

    public l1 s0(net.time4j.tz.l lVar) {
        return l1.k(n0(lVar), lVar);
    }

    @Override // net.time4j.base.a
    public int t() {
        return this.f83410b.t();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: t0, reason: merged with bridge method [inline-methods] */
    public boolean s(n0 n0Var) {
        return compareTo(n0Var) > 0;
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        return this.f83410b.toString() + this.f83411c.toString();
    }

    @Override // net.time4j.base.g
    public int u() {
        return this.f83411c.u();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: u0, reason: merged with bridge method [inline-methods] */
    public boolean f(n0 n0Var) {
        return compareTo(n0Var) < 0;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: v0, reason: merged with bridge method [inline-methods] */
    public boolean k(n0 n0Var) {
        return compareTo(n0Var) == 0;
    }

    public boolean w0(net.time4j.tz.k kVar) {
        if (kVar == null) {
            return false;
        }
        return !net.time4j.tz.l.c0(kVar).V(this.f83410b, this.f83411c);
    }

    @Override // net.time4j.engine.f0
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public p<z> d(net.time4j.engine.n0<? extends z> n0Var) {
        return (p) Z(X(n0Var), f83409i);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f83408h;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    /* compiled from: PlainTimestamp.java */
    private static class b implements net.time4j.engine.o0<n0> {

        /* renamed from: a, reason: collision with root package name */
        private final h f83413a;

        /* renamed from: b, reason: collision with root package name */
        private final j f83414b;

        b(h hVar) {
            this.f83413a = hVar;
            this.f83414b = null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public n0 b(n0 n0Var, long j4) {
            l0 l0Var;
            m0 m0Var;
            if (this.f83413a != null) {
                l0Var = (l0) n0Var.f83410b.W(j4, this.f83413a);
                m0Var = n0Var.f83411c;
            } else {
                m0 m0Var2 = n0Var.f83411c;
                j jVar = this.f83414b;
                m0Var2.getClass();
                m e4 = m0.c.e(m0Var2, j4, jVar);
                l0 l0Var2 = (l0) n0Var.f83410b.W(e4.a(), h.DAYS);
                m0 b5 = e4.b();
                l0Var = l0Var2;
                m0Var = b5;
            }
            return n0.B0(l0Var, m0Var);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(n0 n0Var, n0 n0Var2) {
            long f4;
            h hVar = this.f83413a;
            if (hVar != null) {
                long between = hVar.between(n0Var.f83410b, n0Var2.f83410b);
                if (between == 0) {
                    return between;
                }
                if (this.f83413a != h.DAYS && ((l0) n0Var.f83410b.W(between, this.f83413a)).a0(n0Var2.f83410b) != 0) {
                    return between;
                }
                m0 m0Var = n0Var.f83411c;
                m0 m0Var2 = n0Var2.f83411c;
                return (between <= 0 || !m0Var.s(m0Var2)) ? (between >= 0 || !m0Var.f(m0Var2)) ? between : between + 1 : between - 1;
            }
            if (n0Var.f83410b.s(n0Var2.f83410b)) {
                return -a(n0Var2, n0Var);
            }
            long Y = n0Var.f83410b.Y(n0Var2.f83410b, h.DAYS);
            if (Y == 0) {
                return this.f83414b.between(n0Var.f83411c, n0Var2.f83411c);
            }
            if (this.f83414b.compareTo(j.SECONDS) <= 0) {
                long i4 = net.time4j.base.c.i(Y, 86400L);
                m0 m0Var3 = n0Var2.f83411c;
                q0<Integer, m0> q0Var = m0.D;
                long f5 = net.time4j.base.c.f(i4, net.time4j.base.c.m(((Integer) m0Var3.r(q0Var)).longValue(), ((Integer) n0Var.f83411c.r(q0Var)).longValue()));
                if (n0Var.f83411c.a() > n0Var2.f83411c.a()) {
                    f5--;
                }
                f4 = f5;
            } else {
                long i5 = net.time4j.base.c.i(Y, 86400000000000L);
                m0 m0Var4 = n0Var2.f83411c;
                q0<Long, m0> q0Var2 = m0.J;
                f4 = net.time4j.base.c.f(i5, net.time4j.base.c.m(((Long) m0Var4.r(q0Var2)).longValue(), ((Long) n0Var.f83411c.r(q0Var2)).longValue()));
            }
            switch (a.f83412a[this.f83414b.ordinal()]) {
                case 1:
                    return f4 / 3600;
                case 2:
                    return f4 / 60;
                case 3:
                case 6:
                    return f4;
                case 4:
                    return f4 / 1000000;
                case 5:
                    return f4 / 1000;
                default:
                    throw new UnsupportedOperationException(this.f83414b.name());
            }
        }

        b(j jVar) {
            this.f83413a = null;
            this.f83414b = jVar;
        }
    }
}
