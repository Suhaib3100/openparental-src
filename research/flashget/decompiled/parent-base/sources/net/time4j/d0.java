package net.time4j;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import net.time4j.engine.ChronoException;
import net.time4j.engine.j0;

/* compiled from: Moment.java */
@net.time4j.format.c("iso8601")
/* loaded from: classes7.dex */
public final class d0 extends net.time4j.engine.m0<TimeUnit, d0> implements net.time4j.scale.g, net.time4j.engine.i0<net.time4j.scale.g> {

    /* renamed from: d, reason: collision with root package name */
    private static final long f82666d = 252892809;

    /* renamed from: e, reason: collision with root package name */
    private static final long f82667e = 63072000;

    /* renamed from: f, reason: collision with root package name */
    private static final long f82668f = 315964800;

    /* renamed from: g, reason: collision with root package name */
    private static final long f82669g = 441763200;

    /* renamed from: h, reason: collision with root package name */
    private static final int f82670h = 1000000;

    /* renamed from: i, reason: collision with root package name */
    private static final int f82671i = 1000000000;

    /* renamed from: j, reason: collision with root package name */
    private static final int f82672j = 1073741824;

    /* renamed from: k, reason: collision with root package name */
    private static final long f82673k;

    /* renamed from: l, reason: collision with root package name */
    private static final long f82674l;

    /* renamed from: m, reason: collision with root package name */
    private static final d0 f82675m;

    /* renamed from: n, reason: collision with root package name */
    private static final d0 f82676n;

    /* renamed from: o, reason: collision with root package name */
    private static final d0 f82677o;

    /* renamed from: p, reason: collision with root package name */
    private static final Set<net.time4j.engine.q<?>> f82678p;

    /* renamed from: q, reason: collision with root package name */
    private static final Map<net.time4j.engine.q<?>, Integer> f82679q;

    /* renamed from: r, reason: collision with root package name */
    private static final Map<TimeUnit, Double> f82680r;

    /* renamed from: s, reason: collision with root package name */
    private static final net.time4j.engine.j0<TimeUnit, d0> f82681s;
    private static final long serialVersionUID = -3192884724477742274L;

    /* renamed from: t, reason: collision with root package name */
    public static final d0 f82682t;

    /* renamed from: u, reason: collision with root package name */
    public static final net.time4j.engine.q<Long> f82683u;

    /* renamed from: v, reason: collision with root package name */
    public static final net.time4j.engine.q<Integer> f82684v;

    /* renamed from: w, reason: collision with root package name */
    public static final net.time4j.engine.q<TimeUnit> f82685w;

    /* renamed from: x, reason: collision with root package name */
    private static final net.time4j.engine.v<d0> f82686x;

    /* renamed from: b, reason: collision with root package name */
    private final transient long f82687b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82688c;

    /* compiled from: Moment.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82689a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f82690b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f82691c;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f82691c = iArr;
            try {
                iArr[TimeUnit.DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82691c[TimeUnit.HOURS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82691c[TimeUnit.MINUTES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82691c[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82691c[TimeUnit.MILLISECONDS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82691c[TimeUnit.MICROSECONDS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82691c[TimeUnit.NANOSECONDS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[u0.values().length];
            f82690b = iArr2;
            try {
                iArr2[u0.SECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f82690b[u0.NANOSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr3 = new int[net.time4j.scale.f.values().length];
            f82689a = iArr3;
            try {
                iArr3[net.time4j.scale.f.POSIX.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f82689a[net.time4j.scale.f.UTC.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f82689a[net.time4j.scale.f.TAI.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f82689a[net.time4j.scale.f.GPS.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f82689a[net.time4j.scale.f.TT.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f82689a[net.time4j.scale.f.UT.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: Moment.java */
    private static class b implements net.time4j.engine.k0<d0> {
        private b() {
        }

        private static boolean g(d0 d0Var) {
            return d0Var.f82687b > d0.f82667e && net.time4j.scale.d.u0().z0();
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(d0 d0Var, d0 d0Var2) {
            return d0Var.compareTo(d0Var2);
        }

        @Override // net.time4j.engine.k0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public d0 p0(d0 d0Var) {
            try {
                return g(d0Var) ? d0Var.Q0(1L, u0.NANOSECONDS) : d0Var.U(1L, TimeUnit.NANOSECONDS);
            } catch (ArithmeticException unused) {
                return null;
            }
        }

        @Override // net.time4j.engine.k0
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public d0 A(d0 d0Var) {
            try {
                return g(d0Var) ? d0Var.Y0(1L, u0.NANOSECONDS) : d0Var.W(1L, TimeUnit.NANOSECONDS);
            } catch (ArithmeticException unused) {
                return null;
            }
        }

        @Override // net.time4j.engine.k0
        public boolean isCalendrical() {
            return false;
        }

        b(a aVar) {
        }
    }

    /* compiled from: Moment.java */
    private enum c implements net.time4j.engine.q<Integer>, net.time4j.engine.a0<d0, Integer> {
        FRACTION;

        @Override // net.time4j.engine.a0
        public net.time4j.engine.q<?> getChildAtCeiling(d0 d0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        public net.time4j.engine.q<?> getChildAtFloor(d0 d0Var) {
            return null;
        }

        @Override // net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            return name();
        }

        @Override // net.time4j.engine.q
        public char getSymbol() {
            return (char) 0;
        }

        @Override // net.time4j.engine.q
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
            return ((Integer) pVar.r(this)).compareTo((Integer) pVar2.r(this));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.q
        public Integer getDefaultMaximum() {
            return 999999999;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.q
        public Integer getDefaultMinimum() {
            return 0;
        }

        @Override // net.time4j.engine.a0
        public Integer getMaximum(d0 d0Var) {
            return getDefaultMaximum();
        }

        @Override // net.time4j.engine.a0
        public Integer getMinimum(d0 d0Var) {
            return getDefaultMinimum();
        }

        @Override // net.time4j.engine.a0
        public Integer getValue(d0 d0Var) {
            return Integer.valueOf(d0Var.a());
        }

        @Override // net.time4j.engine.a0
        public boolean j(d0 d0Var, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 0 && intValue < 1000000000;
        }

        @Override // net.time4j.engine.a0
        public d0 withValue(d0 d0Var, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("銧\u0001"));
            }
            if (!net.time4j.scale.d.u0().z0()) {
                return d0.V0(d0Var.j(), num.intValue(), net.time4j.scale.f.POSIX);
            }
            net.time4j.scale.f fVar = net.time4j.scale.f.UTC;
            return d0.V0(d0Var.c(fVar), num.intValue(), fVar);
        }
    }

    /* compiled from: Moment.java */
    private enum d implements net.time4j.engine.q<Long>, net.time4j.engine.a0<d0, Long> {
        POSIX_TIME;

        @Override // net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            return name();
        }

        @Override // net.time4j.engine.q
        public char getSymbol() {
            return (char) 0;
        }

        @Override // net.time4j.engine.q
        public Class<Long> getType() {
            return Long.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
            return ((Long) pVar.r(this)).compareTo((Long) pVar2.r(this));
        }

        @Override // net.time4j.engine.a0
        public net.time4j.engine.q<?> getChildAtCeiling(d0 d0Var) {
            return c.FRACTION;
        }

        @Override // net.time4j.engine.a0
        public net.time4j.engine.q<?> getChildAtFloor(d0 d0Var) {
            return c.FRACTION;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.q
        public Long getDefaultMaximum() {
            return Long.valueOf(d0.f82674l);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.q
        public Long getDefaultMinimum() {
            return Long.valueOf(d0.f82673k);
        }

        @Override // net.time4j.engine.a0
        public Long getMaximum(d0 d0Var) {
            return Long.valueOf(d0.f82674l);
        }

        @Override // net.time4j.engine.a0
        public Long getMinimum(d0 d0Var) {
            return Long.valueOf(d0.f82673k);
        }

        @Override // net.time4j.engine.a0
        public Long getValue(d0 d0Var) {
            return Long.valueOf(d0Var.j());
        }

        @Override // net.time4j.engine.a0
        public boolean j(d0 d0Var, Long l4) {
            if (l4 == null) {
                return false;
            }
            long longValue = l4.longValue();
            return longValue >= d0.f82673k && longValue <= d0.f82674l;
        }

        @Override // net.time4j.engine.a0
        public d0 withValue(d0 d0Var, Long l4, boolean z4) {
            if (l4 != null) {
                return d0.V0(l4.longValue(), d0Var.a(), net.time4j.scale.f.POSIX);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("銩\u0001"));
        }
    }

    /* compiled from: Moment.java */
    private static class e implements net.time4j.engine.u<d0> {
        private e() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d0 o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            return d0.y0(eVar.c());
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d0 e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            net.time4j.tz.k kVar;
            d0 d0Var;
            net.time4j.scale.f fVar = (net.time4j.scale.f) dVar.b(net.time4j.format.a.f82801w, net.time4j.scale.f.UTC);
            if (rVar instanceof net.time4j.base.f) {
                return d0.y0((net.time4j.base.f) net.time4j.base.f.class.cast(rVar)).l1(fVar);
            }
            d dVar2 = d.POSIX_TIME;
            if (rVar.w(dVar2)) {
                long longValue = ((Long) rVar.r(dVar2)).longValue();
                c cVar = c.FRACTION;
                return d0.V0(longValue, rVar.w(cVar) ? ((Integer) rVar.r(cVar)).intValue() : 0, net.time4j.scale.f.POSIX).l1(fVar);
            }
            if (rVar.w(net.time4j.engine.c0.LEAP_SECOND)) {
                rVar.K(m0.C, 60);
                r3 = 1;
            }
            net.time4j.engine.q<?> q02 = n0.h0().q0();
            n0 e4 = rVar.w(q02) ? (n0) rVar.r(q02) : n0.h0().e(rVar, dVar, z4, z5);
            a aVar = null;
            if (e4 == null) {
                return null;
            }
            if (rVar.e()) {
                kVar = rVar.v();
            } else {
                net.time4j.engine.c<net.time4j.tz.k> cVar2 = net.time4j.format.a.f82782d;
                kVar = dVar.c(cVar2) ? (net.time4j.tz.k) dVar.a(cVar2) : null;
            }
            if (kVar != null) {
                net.time4j.engine.c0 c0Var = net.time4j.engine.c0.DAYLIGHT_SAVING;
                if (rVar.w(c0Var)) {
                    d0Var = e4.n0(net.time4j.tz.l.c0(kVar).h0(((net.time4j.tz.o) dVar.b(net.time4j.format.a.f82783e, net.time4j.tz.l.f83557e)).a(((Boolean) rVar.r(c0Var)).booleanValue() ? net.time4j.tz.g.EARLIER_OFFSET : net.time4j.tz.g.LATER_OFFSET)));
                } else {
                    net.time4j.engine.c<net.time4j.tz.o> cVar3 = net.time4j.format.a.f82783e;
                    d0Var = dVar.c(cVar3) ? e4.n0(net.time4j.tz.l.c0(kVar).h0((net.time4j.tz.o) dVar.a(cVar3))) : e4.r0(kVar);
                }
            } else {
                d0Var = null;
            }
            if (d0Var == null) {
                return null;
            }
            if (r3 != 0) {
                net.time4j.tz.p I = kVar instanceof net.time4j.tz.p ? (net.time4j.tz.p) kVar : net.time4j.tz.l.c0(kVar).I(d0Var);
                if (I.h() != 0 || I.g() % 60 != 0) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("銫\u0001") + I);
                }
                d0 Y0 = d0Var.A0().o() >= 1972 ? d0Var.Y0(1L, u0.SECONDS) : new d0(d0Var.a(), d0Var.j() + 1, aVar);
                if (!z4) {
                    if (net.time4j.scale.d.u0().z0()) {
                        if (!Y0.O0()) {
                            throw new IllegalArgumentException(ProtectedSandApp.s("銪\u0001") + Y0);
                        }
                    }
                }
                d0Var = Y0;
            }
            return d0Var.l1(fVar);
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return n0.h0();
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(d0 d0Var, net.time4j.engine.d dVar) {
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (!dVar.c(cVar)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("銬\u0001"));
            }
            return d0Var.m1((net.time4j.scale.f) dVar.b(net.time4j.format.a.f82801w, net.time4j.scale.f.UTC)).J0((net.time4j.tz.k) dVar.a(cVar));
        }

        @Override // net.time4j.engine.u
        public int g() {
            return l0.T0().g();
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            net.time4j.format.e ofStyle = net.time4j.format.e.ofStyle(zVar.getStyleValue());
            return net.time4j.format.b.v(ofStyle, ofStyle, locale);
        }

        e(a aVar) {
        }
    }

    /* compiled from: Moment.java */
    private static class f implements net.time4j.engine.v<d0> {
        private f() {
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(d0 d0Var) {
            net.time4j.scale.b v02;
            net.time4j.scale.d u02 = net.time4j.scale.d.u0();
            if (!u02.z0() || (v02 = u02.v0(d0Var.c(net.time4j.scale.f.UTC))) == null) {
                return null;
            }
            n0 R0 = l0.Y0(v02.c()).R0(23, 59, 59);
            R0.getClass();
            return R0.e0(net.time4j.tz.p.f83649l).Y0(v02.a(), u0.SECONDS);
        }

        f(a aVar) {
        }
    }

    /* compiled from: Moment.java */
    private static class h implements net.time4j.engine.a0<d0, TimeUnit> {
        private h() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(d0 d0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(d0 d0Var) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public TimeUnit getMaximum(d0 d0Var) {
            return TimeUnit.NANOSECONDS;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public TimeUnit getMinimum(d0 d0Var) {
            return TimeUnit.DAYS;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public TimeUnit getValue(d0 d0Var) {
            int a5 = d0Var.a();
            if (a5 != 0) {
                return a5 % 1000000 == 0 ? TimeUnit.MILLISECONDS : a5 % 1000 == 0 ? TimeUnit.MICROSECONDS : TimeUnit.NANOSECONDS;
            }
            long j4 = d0Var.f82687b;
            return net.time4j.base.c.d(j4, MMKV.ExpireInDay) == 0 ? TimeUnit.DAYS : net.time4j.base.c.d(j4, MMKV.ExpireInHour) == 0 ? TimeUnit.HOURS : net.time4j.base.c.d(j4, 60) == 0 ? TimeUnit.MINUTES : TimeUnit.SECONDS;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(d0 d0Var, TimeUnit timeUnit) {
            return timeUnit != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public d0 withValue(d0 d0Var, TimeUnit timeUnit, boolean z4) {
            d0 V0;
            if (timeUnit == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("銲\u0001"));
            }
            switch (a.f82691c[timeUnit.ordinal()]) {
                case 1:
                    return d0.V0(net.time4j.base.c.b(d0Var.f82687b, MMKV.ExpireInDay) * 86400, 0, net.time4j.scale.f.POSIX);
                case 2:
                    return d0.V0(net.time4j.base.c.b(d0Var.f82687b, MMKV.ExpireInHour) * 3600, 0, net.time4j.scale.f.POSIX);
                case 3:
                    return d0.V0(net.time4j.base.c.b(d0Var.f82687b, 60) * 60, 0, net.time4j.scale.f.POSIX);
                case 4:
                    V0 = d0.V0(d0Var.f82687b, 0, net.time4j.scale.f.POSIX);
                    break;
                case 5:
                    V0 = d0.V0(d0Var.f82687b, (d0Var.a() / 1000000) * 1000000, net.time4j.scale.f.POSIX);
                    break;
                case 6:
                    V0 = d0.V0(d0Var.f82687b, (d0Var.a() / 1000) * 1000, net.time4j.scale.f.POSIX);
                    break;
                case 7:
                    return d0Var;
                default:
                    throw new UnsupportedOperationException(timeUnit.name());
            }
            return (d0Var.n() && net.time4j.scale.d.u0().z0()) ? V0.Y0(1L, u0.SECONDS) : V0;
        }

        h(a aVar) {
        }
    }

    /* compiled from: Moment.java */
    private static class i implements net.time4j.engine.o0<d0> {

        /* renamed from: a, reason: collision with root package name */
        private final TimeUnit f82696a;

        i(TimeUnit timeUnit) {
            this.f82696a = timeUnit;
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d0 b(d0 d0Var, long j4) {
            if (this.f82696a.compareTo(TimeUnit.SECONDS) >= 0) {
                return d0.V0(net.time4j.base.c.f(d0Var.j(), net.time4j.base.c.i(j4, this.f82696a.toSeconds(1L))), d0Var.a(), net.time4j.scale.f.POSIX);
            }
            long f4 = net.time4j.base.c.f(d0Var.a(), net.time4j.base.c.i(j4, this.f82696a.toNanos(1L)));
            return d0.V0(net.time4j.base.c.f(d0Var.j(), net.time4j.base.c.b(f4, 1000000000)), net.time4j.base.c.d(f4, 1000000000), net.time4j.scale.f.POSIX);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(d0 d0Var, d0 d0Var2) {
            long f4;
            if (this.f82696a.compareTo(TimeUnit.SECONDS) >= 0) {
                f4 = d0Var2.j() - d0Var.j();
                if (f4 < 0) {
                    if (d0Var2.a() > d0Var.a()) {
                        f4++;
                    }
                } else if (f4 > 0 && d0Var2.a() < d0Var.a()) {
                    f4--;
                }
            } else {
                f4 = net.time4j.base.c.f(net.time4j.base.c.i(net.time4j.base.c.m(d0Var2.j(), d0Var.j()), 1000000000L), d0Var2.a() - d0Var.a());
            }
            switch (a.f82691c[this.f82696a.ordinal()]) {
                case 1:
                    return f4 / 86400;
                case 2:
                    return f4 / 3600;
                case 3:
                    return f4 / 60;
                case 4:
                case 7:
                    return f4;
                case 5:
                    return f4 / 1000000;
                case 6:
                    return f4 / 1000;
                default:
                    throw new UnsupportedOperationException(this.f82696a.name());
            }
        }
    }

    static {
        long j4 = net.time4j.base.b.j(-999999999, 1, 1);
        long j5 = net.time4j.base.b.j(999999999, 12, 31);
        net.time4j.engine.b0 b0Var = net.time4j.engine.b0.UNIX;
        net.time4j.engine.b0 b0Var2 = net.time4j.engine.b0.MODIFIED_JULIAN_DATE;
        long transform = b0Var.transform(j4, b0Var2) * 86400;
        f82673k = transform;
        long transform2 = (b0Var.transform(j5, b0Var2) * 86400) + 86399;
        f82674l = transform2;
        net.time4j.scale.f fVar = net.time4j.scale.f.POSIX;
        d0 d0Var = new d0(transform, 0, fVar);
        f82675m = d0Var;
        d0 d0Var2 = new d0(transform2, 999999999, fVar);
        f82676n = d0Var2;
        f82677o = new d0(63158400L, 0, fVar);
        HashSet hashSet = new HashSet();
        hashSet.add(m0.f83375z);
        hashSet.add(m0.f83374y);
        hashSet.add(m0.f83373x);
        hashSet.add(m0.f83372w);
        hashSet.add(m0.f83371v);
        hashSet.add(m0.f83370u);
        hashSet.add(m0.A);
        hashSet.add(m0.B);
        f82678p = Collections.unmodifiableSet(hashSet);
        HashMap hashMap = new HashMap();
        hashMap.put(m0.C, 1);
        hashMap.put(m0.D, 1);
        hashMap.put(m0.E, 1000);
        hashMap.put(m0.H, 1000);
        hashMap.put(m0.F, 1000000);
        hashMap.put(m0.I, 1000000);
        hashMap.put(m0.G, 1000000000);
        hashMap.put(m0.J, 1000000000);
        f82679q = Collections.unmodifiableMap(hashMap);
        EnumMap enumMap = new EnumMap(TimeUnit.class);
        enumMap.put((EnumMap) TimeUnit.DAYS, (TimeUnit) Double.valueOf(86400.0d));
        enumMap.put((EnumMap) TimeUnit.HOURS, (TimeUnit) Double.valueOf(3600.0d));
        enumMap.put((EnumMap) TimeUnit.MINUTES, (TimeUnit) Double.valueOf(60.0d));
        enumMap.put((EnumMap) TimeUnit.SECONDS, (TimeUnit) Double.valueOf(1.0d));
        enumMap.put((EnumMap) TimeUnit.MILLISECONDS, (TimeUnit) Double.valueOf(0.001d));
        enumMap.put((EnumMap) TimeUnit.MICROSECONDS, (TimeUnit) Double.valueOf(1.0E-6d));
        enumMap.put((EnumMap) TimeUnit.NANOSECONDS, (TimeUnit) Double.valueOf(1.0E-9d));
        f82680r = Collections.unmodifiableMap(enumMap);
        j0.c n4 = j0.c.n(TimeUnit.class, d0.class, new e(), d0Var, d0Var2);
        for (TimeUnit timeUnit : TimeUnit.values()) {
            i iVar = new i(timeUnit);
            Map<TimeUnit, Double> map = f82680r;
            n4.j(timeUnit, iVar, map.get(timeUnit).doubleValue(), map.keySet());
        }
        d dVar = d.POSIX_TIME;
        n4.g(dVar, dVar, TimeUnit.SECONDS);
        c cVar = c.FRACTION;
        n4.g(cVar, cVar, TimeUnit.NANOSECONDS);
        net.time4j.engine.q<TimeUnit> qVar = o0.f83421f;
        n4.f(qVar, new h());
        f82681s = n4.o(new b()).c();
        f82682t = new d0(0L, 0, net.time4j.scale.f.POSIX);
        f82683u = dVar;
        f82684v = cVar;
        f82685w = qVar;
        f82686x = new f();
    }

    /* synthetic */ d0(int i4, long j4, a aVar) {
        this(i4, j4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public l0 A0() {
        return l0.w1(net.time4j.base.c.b(this.f82687b, MMKV.ExpireInDay), net.time4j.engine.b0.UNIX);
    }

    private long B0() {
        if (!net.time4j.scale.d.u0().z0()) {
            return this.f82687b - f82667e;
        }
        long I = net.time4j.scale.d.u0().I(this.f82687b);
        return O0() ? I + 1 : I;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int C0(d0 d0Var) {
        int E0 = E0(d0Var) / 60;
        if (E0 / 60 != 23 || E0 % 60 != 59) {
            return 59;
        }
        return 59 + net.time4j.scale.d.u0().x0(d0Var.A0());
    }

    private double D0() {
        double a5 = ((a() / 1.0E9d) + (B0() + 42.184d)) - net.time4j.scale.f.deltaT(A0());
        return Double.compare(1.0E9d - ((a5 - ((double) ((long) Math.floor(a5)))) * 1.0E9d), 1.0d) < 0 ? r0 + 1 : a5;
    }

    private static int E0(d0 d0Var) {
        return net.time4j.base.c.d(d0Var.f82687b, MMKV.ExpireInDay);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public m0 F0() {
        int E0 = E0(this);
        int i4 = E0 / 60;
        return m0.d1(i4 / 60, i4 % 60, E0 % 60, a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public n0 G0(net.time4j.tz.l lVar) {
        return n0.j0(this, lVar.I(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean N0() {
        net.time4j.scale.d u02 = net.time4j.scale.d.u0();
        if (!u02.K0()) {
            return false;
        }
        long j4 = this.f82687b;
        return u02.J0(u02.I(j4)) > j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean O0() {
        return (this.f82688c >>> 30) != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static d0 S0(d0 d0Var) {
        l0 A0 = d0Var.A0();
        m0 F0 = d0Var.F0();
        return (net.time4j.scale.d.u0().x0(A0) == 1 && F0.u() == 23 && F0.m() == 59 && F0.h() == 59) ? d0Var.Y0(1L, u0.SECONDS) : d0Var;
    }

    public static net.time4j.engine.v<d0> T0() {
        return f82686x;
    }

    public static d0 U0() {
        return w0.f83710g.c();
    }

    public static d0 V0(long j4, int i4, net.time4j.scale.f fVar) {
        return (j4 == 0 && i4 == 0 && fVar == net.time4j.scale.f.POSIX) ? f82682t : new d0(j4, i4, fVar);
    }

    public static d0 W0(long j4, net.time4j.scale.f fVar) {
        return V0(j4, 0, fVar);
    }

    public static d0 X0(String str, net.time4j.format.t<d0> tVar) {
        try {
            return tVar.f(str);
        } catch (ParseException e4) {
            throw new ChronoException(e4.getMessage(), (Throwable) e4);
        }
    }

    static d0 b1(DataInput dataInput, boolean z4, boolean z5) throws IOException {
        long readLong = dataInput.readLong();
        int readInt = z5 ? dataInput.readInt() : 0;
        if (readLong == 0) {
            if (z4) {
                throw new InvalidObjectException(ProtectedSandApp.s("銹\u0001"));
            }
            if (readInt == 0) {
                return f82682t;
            }
        }
        if (readLong == f82673k && readInt == 0) {
            if (z4) {
                throw new InvalidObjectException(ProtectedSandApp.s("銺\u0001"));
            }
            return f82675m;
        }
        if (readLong == f82674l && readInt == 999999999) {
            if (z4) {
                throw new InvalidObjectException(ProtectedSandApp.s("銻\u0001"));
            }
            return f82676n;
        }
        t0(readInt);
        if (z4) {
            net.time4j.scale.d u02 = net.time4j.scale.d.u0();
            if (u02.z0() && !u02.E0(u02.I(readLong) + 1)) {
                long l4 = net.time4j.base.b.l(readLong);
                int h4 = net.time4j.base.b.h(l4);
                int i4 = (int) (255 & l4);
                StringBuilder sb = new StringBuilder(ProtectedSandApp.s("銼\u0001"));
                sb.append((int) (l4 >> 32));
                sb.append(ProtectedSandApp.s("銽\u0001"));
                String s4 = ProtectedSandApp.s("銾\u0001");
                sb.append(h4 < 10 ? s4 : "");
                sb.append(h4);
                sb.append(i4 < 10 ? s4 : "");
                sb.append(i4);
                sb.append(ProtectedSandApp.s("銿\u0001"));
                throw new InvalidObjectException(sb.toString());
            }
            readInt |= 1073741824;
        }
        return new d0(readInt, readLong);
    }

    private static int f1(double d5, long j4) {
        try {
            return (int) ((d5 * 1.0E9d) - net.time4j.base.c.i(j4, 1000000000L));
        } catch (ArithmeticException unused) {
            return (int) ((d5 - j4) * 1.0E9d);
        }
    }

    private String h1(boolean z4) {
        l0 A0 = A0();
        int E0 = E0(this);
        int i4 = E0 / 60;
        int i5 = i4 / 60;
        int i6 = i4 % 60;
        int w02 = net.time4j.scale.d.u0().w0(B0()) + (E0 % 60);
        int a5 = a();
        StringBuilder sb = new StringBuilder(50);
        sb.append(A0);
        sb.append('T');
        x0(i5, 2, sb);
        if (z4 || (i6 | w02 | a5) != 0) {
            sb.append(':');
            x0(i6, 2, sb);
            if (z4 || (w02 | a5) != 0) {
                sb.append(':');
                x0(w02, 2, sb);
                if (a5 > 0) {
                    sb.append(',');
                    x0(a5, 9, sb);
                }
            }
        }
        sb.append('Z');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d0 l1(net.time4j.scale.f fVar) {
        if (fVar == net.time4j.scale.f.UTC) {
            return this;
        }
        if (n()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("鋀\u0001") + fVar);
        }
        int i4 = a.f82689a[fVar.ordinal()];
        if (i4 == 1) {
            return this;
        }
        if (i4 == 3) {
            return new d0(net.time4j.base.c.m(this.f82687b, -378691200L), a(), fVar);
        }
        if (i4 == 4) {
            return new d0(net.time4j.base.c.m(this.f82687b, f82668f), a(), fVar);
        }
        if (i4 == 5 || i4 == 6) {
            return new d0(net.time4j.base.c.m(this.f82687b, f82667e), a(), fVar);
        }
        throw new UnsupportedOperationException(fVar.name());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d0 m1(net.time4j.scale.f fVar) {
        switch (a.f82689a[fVar.ordinal()]) {
            case 1:
                return n() ? new d0(a(), this.f82687b) : this;
            case 2:
                return this;
            case 3:
                return new d0(p(fVar), net.time4j.base.c.f(c(fVar), -378691200L));
            case 4:
                return new d0(a(), net.time4j.base.c.f(c(net.time4j.scale.f.GPS), f82668f));
            case 5:
            case 6:
                return new d0(p(fVar), net.time4j.base.c.f(c(fVar), f82667e));
            default:
                throw new UnsupportedOperationException(fVar.name());
        }
    }

    public static <S> net.time4j.engine.x<S> p0(net.time4j.engine.y<S, d0> yVar) {
        return new net.time4j.engine.g(yVar, f82681s);
    }

    public static net.time4j.engine.j0<TimeUnit, d0> r0() {
        return f82681s;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("鋁\u0001"));
    }

    static void s0(d0 d0Var) {
        if (d0Var.f82687b < f82667e) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("鋂\u0001"));
        }
    }

    private static void t0(int i4) {
        if (i4 >= 1000000000 || i4 < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鋃\u0001"), i4));
        }
    }

    static void u0(long j4, n0 n0Var) {
        net.time4j.scale.d u02 = net.time4j.scale.d.u0();
        if (!u02.K0() || u02.J0(u02.I(j4)) <= j4) {
            return;
        }
        throw new ChronoException(ProtectedSandApp.s("鋄\u0001") + n0Var);
    }

    private static void v0(long j4) {
        if (j4 > f82674l || j4 < f82673k) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("鋅\u0001"), j4));
        }
    }

    private Object writeReplace() {
        return new SPX(this, 4);
    }

    private static void x0(int i4, int i5, StringBuilder sb) {
        int i6 = 1;
        for (int i7 = 0; i7 < i5 - 1; i7++) {
            i6 *= 10;
        }
        while (i4 < i6 && i6 >= 10) {
            sb.append('0');
            i6 /= 10;
        }
        sb.append(String.valueOf(i4));
    }

    public static d0 y0(net.time4j.base.f fVar) {
        if (fVar instanceof d0) {
            return (d0) d0.class.cast(fVar);
        }
        if (!(fVar instanceof net.time4j.scale.g) || !net.time4j.scale.d.u0().z0()) {
            return V0(fVar.j(), fVar.a(), net.time4j.scale.f.POSIX);
        }
        net.time4j.scale.g gVar = (net.time4j.scale.g) net.time4j.scale.g.class.cast(fVar);
        net.time4j.scale.f fVar2 = net.time4j.scale.f.UTC;
        return V0(gVar.c(fVar2), gVar.p(fVar2), fVar2);
    }

    public l1 H0() {
        return l1.k(this, net.time4j.tz.l.e0());
    }

    public l1 I0(String str) {
        return l1.k(this, net.time4j.tz.l.Z(str));
    }

    public l1 J0(net.time4j.tz.k kVar) {
        return l1.k(this, net.time4j.tz.l.c0(kVar));
    }

    @Override // net.time4j.engine.i0
    /* renamed from: K0, reason: merged with bridge method [inline-methods] */
    public boolean s(net.time4j.scale.g gVar) {
        return compareTo(y0(gVar)) > 0;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: L0, reason: merged with bridge method [inline-methods] */
    public boolean f(net.time4j.scale.g gVar) {
        return compareTo(y0(gVar)) < 0;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: P0, reason: merged with bridge method [inline-methods] */
    public boolean k(net.time4j.scale.g gVar) {
        return compareTo(y0(gVar)) == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<TimeUnit, d0> y() {
        return f82681s;
    }

    public d0 Q0(long j4, u0 u0Var) {
        return Y0(net.time4j.base.c.k(j4), u0Var);
    }

    public d0 R0(b0<u0> b0Var) {
        return Q0(b0Var.n(), u0.SECONDS).Q0(b0Var.l(), u0.NANOSECONDS);
    }

    public d0 Y0(long j4, u0 u0Var) {
        d0 d0Var;
        s0(this);
        if (j4 == 0) {
            return this;
        }
        try {
            int i4 = a.f82690b[u0Var.ordinal()];
            if (i4 == 1) {
                d0Var = net.time4j.scale.d.u0().z0() ? new d0(net.time4j.base.c.f(B0(), j4), a(), net.time4j.scale.f.UTC) : V0(net.time4j.base.c.f(this.f82687b, j4), a(), net.time4j.scale.f.POSIX);
            } else {
                if (i4 != 2) {
                    throw new UnsupportedOperationException();
                }
                long f4 = net.time4j.base.c.f(a(), j4);
                int d5 = net.time4j.base.c.d(f4, 1000000000);
                long b5 = net.time4j.base.c.b(f4, 1000000000);
                d0Var = net.time4j.scale.d.u0().z0() ? new d0(net.time4j.base.c.f(B0(), b5), d5, net.time4j.scale.f.UTC) : V0(net.time4j.base.c.f(this.f82687b, b5), d5, net.time4j.scale.f.POSIX);
            }
            if (j4 < 0) {
                s0(d0Var);
            }
            return d0Var;
        } catch (IllegalArgumentException e4) {
            ArithmeticException arithmeticException = new ArithmeticException(ProtectedSandApp.s("鋆\u0001"));
            arithmeticException.initCause(e4);
            throw arithmeticException;
        }
    }

    public d0 Z0(b0<u0> b0Var) {
        return Y0(b0Var.n(), u0.SECONDS).Y0(b0Var.l(), u0.NANOSECONDS);
    }

    @Override // net.time4j.base.f
    public int a() {
        return this.f82688c & (-1073741825);
    }

    public String a1(net.time4j.format.t<d0> tVar) {
        return tVar.h(this);
    }

    @Override // net.time4j.scale.g
    public long c(net.time4j.scale.f fVar) {
        long B0;
        int f12;
        switch (a.f82689a[fVar.ordinal()]) {
            case 1:
                return this.f82687b;
            case 2:
                return B0();
            case 3:
                if (B0() < 0) {
                    double a5 = (a() / 1.0E9d) + net.time4j.scale.f.deltaT(A0()) + (this.f82687b - f82667e);
                    long floor = (long) Math.floor(a5);
                    if (Double.compare(1.0E9d - ((a5 - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                        f12 = 0;
                    } else {
                        f12 = f1(a5, floor);
                    }
                    B0 = floor - (-441763168);
                    if (f12 - 184000000 < 0) {
                        B0 = floor - (-441763167);
                    }
                } else {
                    B0 = 441763210 + B0();
                }
                if (B0 >= 0) {
                    return B0;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("銳\u0001") + this);
            case 4:
                long B02 = B0();
                if (net.time4j.scale.d.u0().J0(B02) >= f82668f) {
                    if (!net.time4j.scale.d.u0().z0()) {
                        B02 += 9;
                    }
                    return B02 - f82666d;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("銴\u0001") + this);
            case 5:
                if (this.f82687b >= f82667e) {
                    long B03 = B0();
                    return a() + 184000000 >= 1000000000 ? B03 + 43 : 42 + B03;
                }
                double a6 = (a() / 1.0E9d) + net.time4j.scale.f.deltaT(A0()) + (this.f82687b - f82667e);
                long floor2 = (long) Math.floor(a6);
                return Double.compare(1.0E9d - ((a6 - ((double) floor2)) * 1.0E9d), 1.0d) < 0 ? floor2 + 1 : floor2;
            case 6:
                long j4 = this.f82687b;
                return j4 < f82667e ? j4 - f82667e : (long) Math.floor(D0());
            default:
                throw new UnsupportedOperationException(ProtectedSandApp.s("銷\u0001") + fVar);
        }
    }

    public <C extends net.time4j.engine.m<C>> u<C> c1(net.time4j.engine.k<C> kVar, String str, net.time4j.tz.k kVar2, net.time4j.engine.g0 g0Var) {
        n0 j12 = j1(kVar2);
        return u.f(j12.U(g0Var.c(j12.k0(), kVar2), j.SECONDS).k0().j0(kVar.C(), str), j12.m0());
    }

    public <C extends net.time4j.engine.n<?, C>> u<C> d1(net.time4j.engine.x<C> xVar, net.time4j.tz.k kVar, net.time4j.engine.g0 g0Var) {
        n0 j12 = j1(kVar);
        return u.h(j12.U(g0Var.c(j12.k0(), kVar), j.SECONDS).k0().l0(xVar.C()), j12.m0());
    }

    public n0 e1() {
        return G0(net.time4j.tz.l.e0());
    }

    @Override // net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        if (this.f82687b != d0Var.f82687b) {
            return false;
        }
        return net.time4j.scale.d.u0().z0() ? this.f82688c == d0Var.f82688c : a() == d0Var.a();
    }

    public String g1(net.time4j.scale.f fVar) {
        StringBuilder sb = new StringBuilder(50);
        sb.append(fVar.name());
        sb.append('-');
        switch (a.f82689a[fVar.ordinal()]) {
            case 1:
                sb.append(n0.j0(this, net.time4j.tz.p.f83649l));
                sb.append('Z');
                break;
            case 2:
                sb.append(h1(false));
                break;
            case 3:
            case 4:
            case 5:
            case 6:
                sb.append(n0.j0(m1(fVar), net.time4j.tz.p.f83649l));
                sb.append('Z');
                break;
            default:
                throw new UnsupportedOperationException(fVar.name());
        }
        return sb.toString();
    }

    @Override // net.time4j.engine.m0
    public int hashCode() {
        long j4 = this.f82687b;
        return (a() * 37) + (((int) (j4 ^ (j4 >>> 32))) * 19);
    }

    public n0 i1(String str) {
        return G0(net.time4j.tz.l.Z(str));
    }

    @Override // net.time4j.base.f
    public long j() {
        return this.f82687b;
    }

    public n0 j1(net.time4j.tz.k kVar) {
        return G0(net.time4j.tz.l.c0(kVar));
    }

    public BigDecimal k1(net.time4j.scale.f fVar) {
        return new BigDecimal(c(fVar)).setScale(9, RoundingMode.UNNECESSARY).add(new BigDecimal(p(fVar)).movePointLeft(9));
    }

    @Override // net.time4j.scale.g
    public boolean n() {
        return O0() && net.time4j.scale.d.u0().z0();
    }

    public long n1(d0 d0Var, u0 u0Var) {
        return u0Var.between(this, d0Var);
    }

    void o1(DataOutput dataOutput) throws IOException {
        int i4 = O0() ? 65 : 64;
        int a5 = a();
        if (a5 > 0) {
            i4 |= 2;
        }
        dataOutput.writeByte(i4);
        dataOutput.writeLong(this.f82687b);
        if (a5 > 0) {
            dataOutput.writeInt(a5);
        }
    }

    @Override // net.time4j.scale.g
    public int p(net.time4j.scale.f fVar) {
        long B0;
        int a5;
        int i4 = 0;
        switch (a.f82689a[fVar.ordinal()]) {
            case 1:
            case 2:
                return a();
            case 3:
                if (B0() < 0) {
                    double a6 = (a() / 1.0E9d) + net.time4j.scale.f.deltaT(A0()) + (this.f82687b - f82667e);
                    long floor = (long) Math.floor(a6);
                    if (Double.compare(1.0E9d - ((a6 - floor) * 1.0E9d), 1.0d) < 0) {
                        floor++;
                    } else {
                        i4 = f1(a6, floor);
                    }
                    B0 = floor - (-441763168);
                    a5 = i4 - 184000000;
                    if (a5 < 0) {
                        B0 = floor - (-441763167);
                        a5 = i4 - (-816000000);
                    }
                } else {
                    B0 = B0() + f82669g;
                    a5 = a();
                }
                if (B0 >= 0) {
                    return a5;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("銳\u0001") + this);
            case 4:
                if (net.time4j.scale.d.u0().J0(B0()) >= f82668f) {
                    return a();
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("銴\u0001") + this);
            case 5:
                if (this.f82687b >= f82667e) {
                    int a7 = a();
                    int i5 = a7 + 184000000;
                    return i5 >= 1000000000 ? a7 - 816000000 : i5;
                }
                double a8 = (a() / 1.0E9d) + net.time4j.scale.f.deltaT(A0()) + (this.f82687b - f82667e);
                long floor2 = (long) Math.floor(a8);
                if (Double.compare(1.0E9d - ((a8 - floor2) * 1.0E9d), 1.0d) < 0) {
                    return 0;
                }
                return f1(a8, floor2);
            case 6:
                if (this.f82687b < f82667e) {
                    return a();
                }
                double D0 = D0();
                return f1(D0, (long) Math.floor(D0));
            default:
                throw new UnsupportedOperationException(ProtectedSandApp.s("銷\u0001") + fVar);
        }
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        return h1(true);
    }

    @Override // net.time4j.engine.m0, java.lang.Comparable
    /* renamed from: w0, reason: merged with bridge method [inline-methods] */
    public int compareTo(d0 d0Var) {
        int a5;
        long B0 = B0();
        long B02 = d0Var.B0();
        if (B0 < B02) {
            return -1;
        }
        if (B0 <= B02 && (a5 = a() - d0Var.a()) <= 0) {
            return a5 < 0 ? -1 : 0;
        }
        return 1;
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82681s;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    protected d0 z0() {
        return this;
    }

    private d0(long j4, int i4, net.time4j.scale.f fVar) {
        long j5;
        long I;
        long j6 = j4;
        int i5 = i4;
        if (fVar == net.time4j.scale.f.POSIX) {
            this.f82687b = j6;
            this.f82688c = i5;
        } else {
            net.time4j.scale.d u02 = net.time4j.scale.d.u0();
            if (!u02.z0()) {
                throw new IllegalStateException(ProtectedSandApp.s("銸\u0001"));
            }
            if (fVar != net.time4j.scale.f.UTC) {
                if (fVar == net.time4j.scale.f.TAI) {
                    if (j6 < 0) {
                        throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("銳\u0001"), j6));
                    }
                    if (j6 < f82669g) {
                        long f4 = net.time4j.base.c.f(j6, -441763168L);
                        int e4 = net.time4j.base.c.e(i5, 184000000);
                        if (e4 >= 1000000000) {
                            f4 = net.time4j.base.c.f(f4, 1L);
                            e4 = net.time4j.base.c.l(e4, 1000000000);
                        }
                        double d5 = (e4 / 1.0E9d) + f4;
                        double deltaT = d5 - net.time4j.scale.f.deltaT(l0.w1(net.time4j.base.c.b((long) (d5 - 42.184d), MMKV.ExpireInDay), net.time4j.engine.b0.UTC));
                        j5 = (long) Math.floor(deltaT);
                        i5 = f1(deltaT, j5);
                    } else {
                        j5 = net.time4j.base.c.m(j6, 441763210L);
                    }
                } else if (fVar == net.time4j.scale.f.GPS) {
                    long f5 = net.time4j.base.c.f(j6, f82666d);
                    if (f5 < f82666d) {
                        throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("銴\u0001"), j6));
                    }
                    j5 = f5;
                } else if (fVar == net.time4j.scale.f.TT) {
                    if (j6 < 42 || (j6 == 42 && i5 < 184000000)) {
                        double d6 = (i5 / 1.0E9d) + j6;
                        double deltaT2 = d6 - net.time4j.scale.f.deltaT(l0.w1(net.time4j.base.c.b((long) (d6 - 42.184d), MMKV.ExpireInDay), net.time4j.engine.b0.UTC));
                        j5 = (long) Math.floor(deltaT2);
                        i5 = f1(deltaT2, j5);
                    } else {
                        j6 = net.time4j.base.c.m(j6, 42L);
                        i5 = net.time4j.base.c.l(i5, 184000000);
                        if (i5 < 0) {
                            j6 = net.time4j.base.c.m(j6, 1L);
                            i5 = net.time4j.base.c.e(i5, 1000000000);
                        }
                    }
                } else {
                    if (fVar != net.time4j.scale.f.UT) {
                        throw new UnsupportedOperationException(ProtectedSandApp.s("銷\u0001") + fVar.name());
                    }
                    if (j6 >= 0) {
                        double deltaT3 = (net.time4j.scale.f.deltaT(l0.w1(net.time4j.base.c.b(j6, MMKV.ExpireInDay), net.time4j.engine.b0.UTC)) + ((i5 / 1.0E9d) + j6)) - 42.184d;
                        j5 = (long) Math.floor(deltaT3);
                        i5 = f1(deltaT3, j5);
                    }
                }
                long J0 = u02.J0(j5);
                I = j5 - u02.I(J0);
                this.f82687b = J0;
                if (I != 0 || J0 == f82674l) {
                    this.f82688c = i5;
                } else {
                    if (I != 1) {
                        throw new IllegalStateException(androidx.compose.ui.input.pointer.s.a(ProtectedSandApp.s("銵\u0001"), j6, ProtectedSandApp.s("銶\u0001")));
                    }
                    this.f82688c = 1073741824 | i5;
                }
            }
            j5 = j6;
            long J02 = u02.J0(j5);
            I = j5 - u02.I(J02);
            this.f82687b = J02;
            if (I != 0) {
            }
            this.f82688c = i5;
        }
        v0(this.f82687b);
        t0(i5);
    }

    /* compiled from: Moment.java */
    static final class g implements net.time4j.engine.v<d0> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.v<n0> f82692b;

        /* renamed from: c, reason: collision with root package name */
        private final net.time4j.engine.q<?> f82693c;

        /* renamed from: d, reason: collision with root package name */
        private final int f82694d;

        /* renamed from: e, reason: collision with root package name */
        private final net.time4j.tz.l f82695e;

        g(net.time4j.engine.v<n0> vVar, net.time4j.engine.q<?> qVar, int i4) {
            this.f82692b = vVar;
            this.f82693c = qVar;
            this.f82694d = i4;
            this.f82695e = null;
        }

        private long b(d0 d0Var) {
            return ((Number) Number.class.cast(d0Var.F0().r(this.f82693c))).longValue();
        }

        private long c() {
            Object a5 = ((b1) b1.class.cast(this.f82692b)).a();
            if (a5 != null) {
                return ((Number) Number.class.cast(a5)).longValue();
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("銭\u0001"));
        }

        private static boolean d(net.time4j.tz.l lVar, d0 d0Var) {
            net.time4j.tz.p I = lVar.I(d0Var);
            return (I.h() == 0 && I.g() % 60 == 0) ? false : true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(d0 d0Var) {
            int i4;
            net.time4j.tz.l lVar = this.f82695e;
            if (lVar == null) {
                lVar = net.time4j.tz.l.e0();
            }
            if (d0Var.n() && d(lVar, d0Var)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("銮\u0001") + lVar.I(d0Var));
            }
            long j4 = 1;
            if (d0Var.s(d0.f82677o)) {
                if (this.f82693c == m0.C && this.f82694d == -1 && c() == 60) {
                    if (d0Var.n()) {
                        return d0Var;
                    }
                    if (d(lVar, d0Var)) {
                        throw new IllegalArgumentException(ProtectedSandApp.s("銰\u0001") + lVar.I(d0Var));
                    }
                    if (d0.C0(d0Var) == 60) {
                        return d0Var.Y0(net.time4j.base.c.m(60L, b(d0Var)), u0.SECONDS);
                    }
                    throw new IllegalArgumentException(ProtectedSandApp.s("銯\u0001") + d0Var);
                }
                if (d0.f82679q.containsKey(this.f82693c) && ((i4 = this.f82694d) == 2 || i4 == 3 || i4 == 6)) {
                    int intValue = ((Integer) d0.f82679q.get(this.f82693c)).intValue();
                    int i5 = this.f82694d;
                    if (i5 == 2) {
                        j4 = -1;
                    } else if (i5 == 6) {
                        j4 = net.time4j.base.c.m(c(), b(d0Var));
                    }
                    if (intValue == 1) {
                        return d0Var.Y0(j4, u0.SECONDS);
                    }
                    if (intValue == 1000) {
                        return d0Var.Y0(net.time4j.base.c.i(1000000L, j4), u0.NANOSECONDS);
                    }
                    if (intValue == 1000000) {
                        return d0Var.Y0(net.time4j.base.c.i(1000L, j4), u0.NANOSECONDS);
                    }
                    if (intValue == 1000000000) {
                        return d0Var.Y0(j4, u0.NANOSECONDS);
                    }
                    throw new AssertionError();
                }
            }
            n0 n0Var = (n0) d0Var.G0(lVar).N(this.f82692b);
            d0 n02 = n0Var.n0(lVar);
            if (this.f82694d == 4) {
                return n02;
            }
            if (n02.N0()) {
                if (this.f82695e.O() != net.time4j.tz.l.f83558f) {
                    return n02;
                }
                throw new ChronoException(ProtectedSandApp.s("銱\u0001") + n0Var);
            }
            if (this.f82693c.isDateElement() || d0.f82678p.contains(this.f82693c)) {
                return (d0Var.n() || this.f82694d == 5) ? d0.S0(n02) : n02;
            }
            net.time4j.engine.q<?> qVar = this.f82693c;
            if (qVar == m0.C) {
                int i6 = this.f82694d;
                return (i6 == 1 || i6 == 5) ? d0.S0(n02) : n02;
            }
            if (qVar != m0.E && qVar != m0.F && qVar != m0.G) {
                return n02;
            }
            int i7 = this.f82694d;
            return ((i7 == -1 || i7 == 0 || i7 == 1 || i7 == 5) && d0Var.n()) ? n02.Y0(1L, u0.SECONDS) : n02;
        }

        g(net.time4j.engine.v<n0> vVar, net.time4j.engine.q<?> qVar, int i4, net.time4j.tz.l lVar) {
            this.f82692b = vVar;
            this.f82693c = qVar;
            this.f82694d = i4;
            this.f82695e = lVar;
        }
    }

    private d0(int i4, long j4) {
        v0(j4);
        this.f82687b = j4;
        this.f82688c = i4;
    }
}
