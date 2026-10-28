package net.time4j.calendar.astro;

import androidx.compose.ui.graphics.colorspace.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import net.time4j.d0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.t;
import net.time4j.l0;
import net.time4j.m0;
import net.time4j.n0;

/* compiled from: SolarTime.java */
/* loaded from: classes7.dex */
public final class j implements net.time4j.calendar.astro.d, Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final double f82316b = 16.0d;

    /* renamed from: c, reason: collision with root package name */
    static final double f82317c = 34.0d;

    /* renamed from: d, reason: collision with root package name */
    static final double f82318d = 90.83333333333333d;

    /* renamed from: e, reason: collision with root package name */
    static final String f82319e = ProtectedSandApp.s("谎\u0001");

    /* renamed from: f, reason: collision with root package name */
    static final String f82320f = ProtectedSandApp.s("谏\u0001");

    /* renamed from: g, reason: collision with root package name */
    static final double f82321g = 0.016666666666666666d;

    /* renamed from: h, reason: collision with root package name */
    private static final p f82322h;

    /* renamed from: i, reason: collision with root package name */
    private static final ConcurrentMap<String, p> f82323i;

    /* renamed from: j, reason: collision with root package name */
    private static final j f82324j;

    /* renamed from: k, reason: collision with root package name */
    private static final j f82325k;

    /* renamed from: l, reason: collision with root package name */
    static final /* synthetic */ boolean f82326l = false;
    private static final long serialVersionUID = -4816619838743247977L;
    private final int altitude;
    private final String calculator;
    private final double latitude;
    private final double longitude;
    private final net.time4j.tz.k observerZoneID;

    /* compiled from: SolarTime.java */
    class a implements t<net.time4j.engine.h, d0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f82327a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f82328b;

        a(double d5, double d6) {
            this.f82327a = d5;
            this.f82328b = d6;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(net.time4j.engine.h hVar) {
            return j.this.R(hVar, false, this.f82327a, this.f82328b);
        }
    }

    /* compiled from: SolarTime.java */
    class b implements t<net.time4j.engine.h, d0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f82330a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ double f82331b;

        b(double d5, double d6) {
            this.f82330a = d5;
            this.f82331b = d6;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(net.time4j.engine.h hVar) {
            return j.this.R(hVar, true, this.f82330a, this.f82331b);
        }
    }

    /* compiled from: SolarTime.java */
    static class c implements t<d0, n0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ net.time4j.tz.p f82333a;

        c(net.time4j.tz.p pVar) {
            this.f82333a = pVar;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 apply(d0 d0Var) {
            return j.H(d0Var, this.f82333a).W((long) Math.floor(j.t(d0Var)), net.time4j.j.SECONDS).W((int) ((r1 - r3) * 1.0E9d), net.time4j.j.NANOS);
        }
    }

    /* compiled from: SolarTime.java */
    static class d implements t<d0, n0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ net.time4j.tz.p f82334a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f82335b;

        d(net.time4j.tz.p pVar, String str) {
            this.f82334a = pVar;
            this.f82335b = str;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public n0 apply(d0 d0Var) {
            return j.H(d0Var, this.f82334a).W((long) Math.floor(j.u(d0Var, this.f82335b)), net.time4j.j.SECONDS).W((int) ((r1 - r3) * 1.0E9d), net.time4j.j.NANOS);
        }
    }

    /* compiled from: SolarTime.java */
    static class e implements t<d0, n0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ net.time4j.tz.p f82336a;

        e(net.time4j.tz.p pVar) {
            this.f82336a = pVar;
        }

        public n0 a(d0 d0Var) {
            return j.H(d0Var, this.f82336a);
        }

        @Override // net.time4j.engine.t
        public n0 apply(d0 d0Var) {
            return j.H(d0Var, this.f82336a);
        }
    }

    /* compiled from: SolarTime.java */
    class f implements t<net.time4j.engine.h, d0> {
        f() {
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(net.time4j.engine.h hVar) {
            return j.this.x().sunrise(j.this.V(hVar), j.this.latitude, j.this.longitude, j.this.a0());
        }
    }

    /* compiled from: SolarTime.java */
    class g implements t<net.time4j.engine.h, d0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f82338a;

        g(double d5) {
            this.f82338a = d5;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(net.time4j.engine.h hVar) {
            return j.this.x().sunrise(j.this.V(hVar), j.this.latitude, j.this.longitude, this.f82338a);
        }
    }

    /* compiled from: SolarTime.java */
    class h implements t<net.time4j.engine.h, d0> {
        h() {
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(net.time4j.engine.h hVar) {
            return j.this.x().sunset(j.this.V(hVar), j.this.latitude, j.this.longitude, j.this.a0());
        }
    }

    /* compiled from: SolarTime.java */
    class i implements t<net.time4j.engine.h, d0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ double f82341a;

        i(double d5) {
            this.f82341a = d5;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(net.time4j.engine.h hVar) {
            return j.this.x().sunset(j.this.V(hVar), j.this.latitude, j.this.longitude, this.f82341a);
        }
    }

    /* compiled from: SolarTime.java */
    /* renamed from: net.time4j.calendar.astro.j$j, reason: collision with other inner class name */
    class C1278j implements t<net.time4j.engine.h, q> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ net.time4j.tz.k f82343a;

        C1278j(net.time4j.tz.k kVar) {
            this.f82343a = kVar;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public q apply(net.time4j.engine.h hVar) {
            l0 U = j.U(j.this.V(hVar));
            p x4 = j.this.x();
            double a02 = j.this.a0();
            d0 sunrise = x4.sunrise(hVar, j.this.latitude, j.this.longitude, a02);
            d0 sunset = x4.sunset(hVar, j.this.latitude, j.this.longitude, a02);
            return new q(U, sunrise, sunset, this.f82343a, sunrise == null && sunset == null && Double.compare(j.this.y(U), 90.0d - a02) < 0, null);
        }
    }

    /* compiled from: SolarTime.java */
    class k implements net.time4j.engine.o<net.time4j.engine.h> {
        k() {
        }

        @Override // net.time4j.engine.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(net.time4j.engine.h hVar) {
            if (Double.compare(Math.abs(j.this.latitude), 66.0d) < 0) {
                return false;
            }
            l0 U = j.U(j.this.V(hVar));
            p x4 = j.this.x();
            double a02 = j.this.a0();
            return x4.sunrise(hVar, j.this.latitude, j.this.longitude, a02) == null && x4.sunset(hVar, j.this.latitude, j.this.longitude, a02) == null && Double.compare(j.this.y(U), 90.0d - a02) < 0;
        }
    }

    /* compiled from: SolarTime.java */
    class l implements net.time4j.engine.o<net.time4j.engine.h> {
        l() {
        }

        @Override // net.time4j.engine.o
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean test(net.time4j.engine.h hVar) {
            if (Double.compare(Math.abs(j.this.latitude), 66.0d) < 0) {
                return false;
            }
            l0 U = j.U(j.this.V(hVar));
            p x4 = j.this.x();
            double a02 = j.this.a0();
            return x4.sunrise(hVar, j.this.latitude, j.this.longitude, a02) == null && x4.sunset(hVar, j.this.latitude, j.this.longitude, a02) == null && Double.compare(j.this.y(U), 90.0d - a02) > 0;
        }
    }

    /* compiled from: SolarTime.java */
    class m implements t<net.time4j.engine.h, d0> {
        m() {
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(net.time4j.engine.h hVar) {
            return j.Y(j.this.V(hVar), j.this.longitude, j.this.calculator);
        }
    }

    /* compiled from: SolarTime.java */
    class n implements t<net.time4j.engine.h, d0> {
        n() {
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d0 apply(net.time4j.engine.h hVar) {
            return j.W(j.this.V(hVar), j.this.longitude, j.this.calculator);
        }
    }

    /* compiled from: SolarTime.java */
    public static class o {

        /* renamed from: a, reason: collision with root package name */
        private double f82349a;

        /* renamed from: b, reason: collision with root package name */
        private double f82350b;

        /* renamed from: c, reason: collision with root package name */
        private int f82351c;

        /* renamed from: d, reason: collision with root package name */
        private String f82352d;

        /* renamed from: e, reason: collision with root package name */
        private net.time4j.tz.k f82353e;

        /* synthetic */ o(f fVar) {
            this();
        }

        private static void c(int i4, int i5, double d5, int i6) {
            if (i4 < 0 || i4 > i6 || (i4 == i6 && i6 != 179 && (i5 > 0 || Double.compare(d5, com.google.firebase.remoteconfig.p.f60679p) > 0))) {
                throw new IllegalArgumentException(ProtectedSandApp.s("诽\u0001") + i4 + ProtectedSandApp.s("课\u0001") + ((d5 / 3600.0d) + (i5 / 60.0d) + i4) + ProtectedSandApp.s("诿\u0001"));
            }
            if (i5 < 0 || i5 >= 60) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("诼\u0001"), i5));
            }
            if (Double.isNaN(d5) || Double.isInfinite(d5)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("读\u0001"));
            }
            if (Double.compare(d5, com.google.firebase.remoteconfig.p.f60679p) < 0 || Double.compare(d5, 60.0d) >= 0) {
                throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("诺\u0001"), d5));
            }
        }

        public o a(int i4) {
            double d5 = i4;
            if (Double.isInfinite(d5) || Double.isNaN(d5)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("谁\u0001"), i4));
            }
            if (i4 < 0 || i4 >= 11000) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("谀\u0001"), i4));
            }
            this.f82351c = i4;
            return this;
        }

        public j b() {
            if (Double.isNaN(this.f82349a)) {
                throw new IllegalStateException(ProtectedSandApp.s("调\u0001"));
            }
            if (Double.isNaN(this.f82350b)) {
                throw new IllegalStateException(ProtectedSandApp.s("谂\u0001"));
            }
            return new j(this.f82349a, this.f82350b, this.f82351c, this.f82352d, this.f82353e, null);
        }

        public o d(int i4, int i5, double d5) {
            c(i4, i5, d5, 179);
            if (!Double.isNaN(this.f82350b)) {
                throw new IllegalStateException(ProtectedSandApp.s("谄\u0001"));
            }
            this.f82350b = (d5 / 3600.0d) + (i5 / 60.0d) + i4;
            return this;
        }

        public o e(net.time4j.tz.k kVar) {
            if (kVar == null) {
                throw new NullPointerException(ProtectedSandApp.s("谅\u0001"));
            }
            this.f82353e = kVar;
            return this;
        }

        public o f(int i4, int i5, double d5) {
            c(i4, i5, d5, 90);
            if (!Double.isNaN(this.f82349a)) {
                throw new IllegalStateException(ProtectedSandApp.s("谆\u0001"));
            }
            this.f82349a = (d5 / 3600.0d) + (i5 / 60.0d) + i4;
            return this;
        }

        public o g(int i4, int i5, double d5) {
            c(i4, i5, d5, 90);
            if (!Double.isNaN(this.f82349a)) {
                throw new IllegalStateException(ProtectedSandApp.s("谆\u0001"));
            }
            this.f82349a = ((d5 / 3600.0d) + (i5 / 60.0d) + i4) * (-1.0d);
            return this;
        }

        public o h(String str) {
            if (str.isEmpty()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("谈\u0001"));
            }
            if (!j.f82323i.containsKey(str)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("谇\u0001").concat(str));
            }
            this.f82352d = str;
            return this;
        }

        public o i(p pVar) {
            j.f82323i.putIfAbsent(pVar.name(), pVar);
            this.f82352d = pVar.name();
            return this;
        }

        public o j(int i4, int i5, double d5) {
            c(i4, i5, d5, 180);
            if (!Double.isNaN(this.f82350b)) {
                throw new IllegalStateException(ProtectedSandApp.s("谄\u0001"));
            }
            this.f82350b = ((d5 / 3600.0d) + (i5 / 60.0d) + i4) * (-1.0d);
            return this;
        }

        private o() {
            this.f82349a = Double.NaN;
            this.f82350b = Double.NaN;
            this.f82351c = 0;
            this.f82352d = j.f82322h.name();
            this.f82353e = null;
        }
    }

    /* compiled from: SolarTime.java */
    public interface p {
        double equationOfTime(double d5);

        double getFeature(double d5, String str);

        double getGeodeticAngle(double d5, int i4);

        double getZenithAngle(double d5, int i4);

        String name();

        d0 sunrise(net.time4j.engine.h hVar, double d5, double d6, double d7);

        d0 sunset(net.time4j.engine.h hVar, double d5, double d6, double d7);
    }

    /* compiled from: SolarTime.java */
    public static class q {

        /* renamed from: a, reason: collision with root package name */
        private final d0 f82354a;

        /* renamed from: b, reason: collision with root package name */
        private final d0 f82355b;

        /* renamed from: c, reason: collision with root package name */
        private final n0 f82356c;

        /* renamed from: d, reason: collision with root package name */
        private final n0 f82357d;

        /* synthetic */ q(l0 l0Var, d0 d0Var, d0 d0Var2, net.time4j.tz.k kVar, boolean z4, f fVar) {
            this(l0Var, d0Var, d0Var2, kVar, z4);
        }

        private static <T> T a(T t4) {
            if (t4 != null) {
                return t4;
            }
            throw new IllegalStateException(ProtectedSandApp.s("谉\u0001"));
        }

        public n0 b() {
            return (n0) a(this.f82357d);
        }

        public d0 c() {
            return (d0) a(this.f82355b);
        }

        public boolean d() {
            return this.f82354a == null;
        }

        public boolean e(d0 d0Var) {
            return (d() || this.f82354a.s(d0Var) || !d0Var.f(this.f82355b)) ? false : true;
        }

        public boolean f(n0 n0Var) {
            return (d() || this.f82356c.s(n0Var) || !n0Var.f(this.f82357d)) ? false : true;
        }

        public int g() {
            if (d()) {
                return 0;
            }
            return (int) this.f82354a.Y(this.f82355b, TimeUnit.SECONDS);
        }

        public n0 h() {
            return (n0) a(this.f82356c);
        }

        public d0 i() {
            return (d0) a(this.f82354a);
        }

        public String toString() {
            if (d()) {
                return ProtectedSandApp.s("谊\u0001");
            }
            StringBuilder a5 = androidx.fragment.app.a.a(128, ProtectedSandApp.s("谋\u0001"));
            a5.append(this.f82354a);
            a5.append('/');
            a5.append(this.f82355b);
            a5.append(ProtectedSandApp.s("谌\u0001"));
            a5.append(this.f82356c);
            a5.append('/');
            a5.append(this.f82357d);
            a5.append(ProtectedSandApp.s("谍\u0001"));
            a5.append(g());
            a5.append(']');
            return a5.toString();
        }

        /* JADX WARN: Multi-variable type inference failed */
        private q(l0 l0Var, d0 d0Var, d0 d0Var2, net.time4j.tz.k kVar, boolean z4) {
            net.time4j.tz.l c02 = net.time4j.tz.l.c0(kVar);
            boolean z5 = c02.F() != null;
            if (z4) {
                this.f82354a = null;
                this.f82355b = null;
                this.f82356c = null;
                this.f82357d = null;
                return;
            }
            if (d0Var != null) {
                this.f82354a = d0Var;
                this.f82356c = d0Var.j1(kVar);
                if (d0Var2 != null) {
                    this.f82355b = d0Var2;
                    this.f82357d = d0Var2.j1(kVar);
                    return;
                } else if (z5) {
                    l0 l0Var2 = (l0) l0Var.W(1L, net.time4j.h.DAYS);
                    this.f82355b = l0Var2.J0(kVar);
                    this.f82357d = l0Var2.O0(kVar);
                    return;
                } else {
                    d0 n02 = ((l0) l0Var.W(1L, net.time4j.h.DAYS)).L0().n0(c02);
                    this.f82355b = n02;
                    this.f82357d = n02.j1(kVar);
                    return;
                }
            }
            if (d0Var2 != null) {
                if (z5) {
                    this.f82354a = l0Var.J0(kVar);
                    this.f82356c = l0Var.O0(kVar);
                    this.f82355b = d0Var2;
                    this.f82357d = d0Var2.j1(kVar);
                    return;
                }
                d0 n03 = l0Var.L0().n0(c02);
                this.f82354a = n03;
                this.f82356c = n03.j1(kVar);
                this.f82355b = d0Var2;
                this.f82357d = d0Var2.j1(kVar);
                return;
            }
            if (z5) {
                this.f82354a = l0Var.J0(kVar);
                this.f82356c = l0Var.O0(kVar);
                l0 l0Var3 = (l0) l0Var.W(1L, net.time4j.h.DAYS);
                this.f82355b = l0Var3.J0(kVar);
                this.f82357d = l0Var3.O0(kVar);
                return;
            }
            d0 n04 = l0Var.L0().n0(c02);
            this.f82354a = n04;
            this.f82356c = n04.j1(kVar);
            d0 n05 = ((l0) l0Var.W(1L, net.time4j.h.DAYS)).L0().n0(c02);
            this.f82355b = n05;
            this.f82357d = n05.j1(kVar);
        }
    }

    static {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        r2 = null;
        for (p pVar : net.time4j.base.d.c().g(p.class)) {
            concurrentHashMap.put(pVar.name(), pVar);
        }
        for (net.time4j.calendar.astro.k kVar : net.time4j.calendar.astro.k.values()) {
            concurrentHashMap.put(kVar.name(), kVar);
        }
        f82323i = concurrentHashMap;
        if (pVar == null) {
            pVar = net.time4j.calendar.astro.k.NOAA;
        }
        f82322h = pVar;
        o a5 = C().d(35, 14, 5.0d).f(31, 46, 44.0d).a(721);
        net.time4j.calendar.astro.k kVar2 = net.time4j.calendar.astro.k.TIME4J;
        f82324j = a5.i(kVar2).b();
        f82325k = C().d(39, 49, 34.06d).f(21, 25, 21.22d).a(298).i(kVar2).b();
    }

    /* synthetic */ j(double d5, double d6, int i4, String str, net.time4j.tz.k kVar, f fVar) {
        this(d5, d6, i4, str, kVar);
    }

    public static j B() {
        return f82324j;
    }

    public static o C() {
        return new o(null);
    }

    public static j D(double d5, double d6) {
        return F(d5, d6, 0, f82322h);
    }

    public static j E(double d5, double d6, int i4, String str) {
        q(d5, d6, i4, str);
        return new j(d5, d6, i4, str, null);
    }

    public static j F(double d5, double d6, int i4, p pVar) {
        String name = pVar.name();
        f82323i.putIfAbsent(name, pVar);
        q(d5, d6, i4, name);
        return new j(d5, d6, i4, name, null);
    }

    public static j G() {
        return f82325k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static n0 H(d0 d0Var, net.time4j.tz.p pVar) {
        net.time4j.scale.f fVar = net.time4j.scale.f.UT;
        return d0.V0(d0Var.c(fVar) + 63072000, d0Var.p(fVar), net.time4j.scale.f.POSIX).j1(pVar);
    }

    public static t<d0, n0> I(net.time4j.tz.p pVar) {
        return new e(pVar);
    }

    private static TimeUnit K(String str) {
        return str.equals(net.time4j.calendar.astro.k.SIMPLE.name()) ? TimeUnit.MINUTES : TimeUnit.SECONDS;
    }

    private d0 Q(long j4, long j5, double d5) {
        d0 W0 = d0.W0(net.time4j.base.c.f(j4, j5) / 2, net.time4j.scale.f.POSIX);
        double e4 = net.time4j.calendar.astro.l.c(W0, this).e();
        return Math.abs(e4 - d5) < f82321g ? W0 : ((double) Double.compare(d5, e4)) > com.google.firebase.remoteconfig.p.f60679p ? Q(W0.j(), j5, d5) : Q(j4, W0.j(), d5);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d0 R(net.time4j.engine.h hVar, boolean z4, double d5, double d6) {
        l0 U = U(V(hVar));
        d0 d0Var = (d0) U.x(z4 ? new h() : new f());
        d0 d0Var2 = (d0) U.x(new m());
        double e4 = net.time4j.calendar.astro.l.c(d0Var2, this).e();
        if (e4 <= f82321g) {
            return d0Var;
        }
        double degrees = d6 == com.google.firebase.remoteconfig.p.f60679p ? 90.0d : Math.toDegrees(Math.atan(d5 / d6));
        if (degrees > e4 + f82321g) {
            return null;
        }
        return Q(d0Var.j(), d0Var2.j(), degrees);
    }

    static l0 U(net.time4j.engine.h hVar) {
        return hVar instanceof l0 ? (l0) hVar : l0.w1(hVar.b(), net.time4j.engine.b0.UTC);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public net.time4j.engine.h V(net.time4j.engine.h hVar) {
        if (this.observerZoneID == null || Math.abs(this.longitude) < 150.0d) {
            return hVar;
        }
        l0 U = U(hVar);
        m0 a12 = m0.a1(12);
        U.getClass();
        n0 B0 = n0.B0(U, a12);
        if (B0.w0(this.observerZoneID)) {
            return B0.r0(this.observerZoneID).j1(net.time4j.tz.p.a(new BigDecimal(this.longitude))).k0();
        }
        throw new ChronoException(ProtectedSandApp.s("谐\u0001") + hVar + ProtectedSandApp.s("谑\u0001") + this.observerZoneID.canonical() + ProtectedSandApp.s("谒\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static d0 W(net.time4j.engine.h hVar, double d5, String str) {
        return (d0) v(hVar, 0, d5, str).M(d0.f82685w, K(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static d0 Y(net.time4j.engine.h hVar, double d5, String str) {
        return (d0) v(hVar, 12, d5, str).M(d0.f82685w, K(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public double a0() {
        return x().getZenithAngle(this.latitude, this.altitude);
    }

    public static t<d0, n0> o(net.time4j.tz.p pVar) {
        return new c(pVar);
    }

    public static t<d0, n0> p(net.time4j.tz.p pVar, String str) {
        return new d(pVar, str);
    }

    private static void q(double d5, double d6, int i4, String str) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("谚\u0001"), d5));
        }
        if (Double.isNaN(d6) || Double.isInfinite(d6)) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("谙\u0001"), d6));
        }
        if (Double.compare(d5, 90.0d) > 0 || Double.compare(d5, -90.0d) < 0) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("谘\u0001"), d5));
        }
        if (Double.compare(d6, 180.0d) >= 0 || Double.compare(d6, -180.0d) < 0) {
            throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("谗\u0001"), d6));
        }
        double d7 = i4;
        if (Double.isNaN(d7) || Double.isInfinite(d7)) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("谖\u0001"), i4));
        }
        if (i4 < 0 || i4 >= 11000) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("谕\u0001"), i4));
        }
        if (str.isEmpty()) {
            throw new IllegalArgumentException(ProtectedSandApp.s("谔\u0001"));
        }
        if (!f82323i.containsKey(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("谓\u0001").concat(str));
        }
    }

    private void r(double d5, double d6) {
        if (Double.isInfinite(d5) || Double.isNaN(d5) || d5 <= com.google.firebase.remoteconfig.p.f60679p) {
            throw new IllegalArgumentException(ProtectedSandApp.s("谝\u0001"));
        }
        if (Double.isInfinite(d6) || Double.isNaN(d6) || d6 < com.google.firebase.remoteconfig.p.f60679p) {
            throw new IllegalArgumentException(ProtectedSandApp.s("谜\u0001"));
        }
        if (Math.abs(this.latitude) > 66.0d) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("谛\u0001"));
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        q(this.latitude, this.longitude, this.altitude, this.calculator);
    }

    private static boolean s(net.time4j.tz.k kVar, net.time4j.tz.k kVar2) {
        if (kVar == null) {
            return kVar2 == null;
        }
        if (kVar2 == null) {
            return false;
        }
        return kVar.canonical().equals(kVar2.canonical());
    }

    public static double t(d0 d0Var) {
        return f82322h.equationOfTime(net.time4j.calendar.astro.e.f(d0Var, net.time4j.scale.f.TT));
    }

    public static double u(d0 d0Var, String str) {
        if (str == null) {
            throw new NullPointerException(ProtectedSandApp.s("谞\u0001"));
        }
        ConcurrentMap<String, p> concurrentMap = f82323i;
        if (!concurrentMap.containsKey(str)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("谓\u0001").concat(str));
        }
        return concurrentMap.get(str).equationOfTime(net.time4j.calendar.astro.e.f(d0Var, net.time4j.scale.f.TT));
    }

    static d0 v(net.time4j.engine.h hVar, int i4, double d5, String str) {
        p pVar = f82323i.get(str);
        double b5 = ((hVar.b() * 86400) + (i4 * MMKV.ExpireInHour)) - (d5 * 240.0d);
        long floor = (long) Math.floor(b5);
        int i5 = (int) ((b5 - floor) * 1.0E9d);
        net.time4j.scale.f fVar = net.time4j.scale.f.UT;
        if (!net.time4j.scale.d.u0().z0()) {
            floor += 63072000;
            fVar = net.time4j.scale.f.POSIX;
        }
        d0 V0 = d0.V0(floor, i5, fVar);
        net.time4j.scale.f fVar2 = net.time4j.scale.f.TT;
        double equationOfTime = pVar.equationOfTime(net.time4j.calendar.astro.e.f(V0, fVar2));
        long floor2 = (long) Math.floor(equationOfTime);
        int i6 = (int) ((equationOfTime - floor2) * 1.0E9d);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        d0 U = V0.U(floor2, timeUnit);
        long j4 = i6;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        return V0.U((long) Math.floor(pVar.equationOfTime(net.time4j.calendar.astro.e.f(U.U(j4, timeUnit2), fVar2))), timeUnit).U((int) ((r2 - r4) * 1.0E9d), timeUnit2);
    }

    private double w() {
        return x().getGeodeticAngle(this.latitude, this.altitude);
    }

    public net.time4j.engine.o<net.time4j.engine.h> A() {
        return new l();
    }

    public net.time4j.engine.o<net.time4j.engine.h> J() {
        return new k();
    }

    public t<net.time4j.engine.h, d0> L() {
        return new f();
    }

    public t<net.time4j.engine.h, d0> M(net.time4j.calendar.astro.m mVar) {
        return new g(w() + 90.0d + mVar.getAngle());
    }

    public t<net.time4j.engine.h, d0> N() {
        return new h();
    }

    public t<net.time4j.engine.h, d0> O(net.time4j.calendar.astro.m mVar) {
        return new i(w() + 90.0d + mVar.getAngle());
    }

    public t<net.time4j.engine.h, q> P(net.time4j.tz.k kVar) {
        return new C1278j(kVar);
    }

    public t<net.time4j.engine.h, d0> S(double d5, double d6) {
        r(d5, d6);
        return new b(d5, d6);
    }

    public t<net.time4j.engine.h, d0> T(double d5, double d6) {
        r(d5, d6);
        return new a(d5, d6);
    }

    public t<net.time4j.engine.h, d0> X() {
        return new n();
    }

    public t<net.time4j.engine.h, d0> Z() {
        return new m();
    }

    @Override // net.time4j.calendar.astro.d
    public int a() {
        return this.altitude;
    }

    @Override // net.time4j.calendar.astro.d
    public double b() {
        return this.latitude;
    }

    @Override // net.time4j.calendar.astro.d
    public double c() {
        return this.longitude;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.calculator.equals(jVar.calculator) && Double.compare(this.latitude, jVar.latitude) == 0 && Double.compare(this.longitude, jVar.longitude) == 0 && this.altitude == jVar.altitude && s(this.observerZoneID, jVar.observerZoneID);
    }

    public int hashCode() {
        return (this.altitude * 37) + (net.time4j.calendar.astro.a.c(this.longitude) * 31) + (net.time4j.calendar.astro.a.c(this.latitude) * 7) + this.calculator.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("谟\u0001"));
        sb.append(this.latitude);
        sb.append(ProtectedSandApp.s("谠\u0001"));
        sb.append(this.longitude);
        if (this.altitude != 0) {
            sb.append(ProtectedSandApp.s("谡\u0001"));
            sb.append(this.altitude);
        }
        if (!this.calculator.equals(f82322h.name())) {
            sb.append(ProtectedSandApp.s("谢\u0001"));
            sb.append(this.calculator);
        }
        if (this.observerZoneID != null) {
            sb.append(ProtectedSandApp.s("谣\u0001"));
            sb.append(this.observerZoneID.canonical());
        }
        sb.append(']');
        return sb.toString();
    }

    public p x() {
        return f82323i.get(this.calculator);
    }

    double y(l0 l0Var) {
        double radians = Math.toRadians(x().getFeature(net.time4j.calendar.astro.e.f((d0) l0Var.x(new m()), net.time4j.scale.f.TT), ProtectedSandApp.s("谎\u0001")));
        double radians2 = Math.toRadians(this.latitude);
        double degrees = Math.toDegrees(Math.asin((Math.cos(radians) * Math.cos(radians2)) + (Math.sin(radians) * Math.sin(radians2))));
        if (!Double.isNaN(degrees)) {
            return degrees;
        }
        throw new UnsupportedOperationException(ProtectedSandApp.s("谤\u0001") + x().name());
    }

    public net.time4j.tz.k z() {
        return this.observerZoneID;
    }

    private j(double d5, double d6, int i4, String str, net.time4j.tz.k kVar) {
        this.latitude = d5;
        this.longitude = d6;
        this.altitude = i4;
        this.calculator = str;
        this.observerZoneID = kVar;
    }
}
