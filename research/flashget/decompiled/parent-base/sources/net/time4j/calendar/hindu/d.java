package net.time4j.calendar.hindu;

import androidx.collection.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.time4j.calendar.IndianCalendar;
import net.time4j.calendar.b0;
import net.time4j.calendar.o0;
import net.time4j.calendar.service.k;
import net.time4j.engine.ChronoException;
import net.time4j.engine.a0;
import net.time4j.engine.d0;
import net.time4j.engine.e0;
import net.time4j.engine.g0;
import net.time4j.engine.k;
import net.time4j.engine.l;
import net.time4j.engine.m;
import net.time4j.engine.p;
import net.time4j.engine.p0;
import net.time4j.engine.q;
import net.time4j.engine.q0;
import net.time4j.engine.r;
import net.time4j.engine.u;
import net.time4j.engine.v;
import net.time4j.engine.x;
import net.time4j.engine.z;
import net.time4j.g1;
import net.time4j.m0;
import net.time4j.w0;

/* compiled from: HinduCalendar.java */
@net.time4j.format.c("hindu")
/* loaded from: classes7.dex */
public final class d extends m<d> implements net.time4j.format.h {

    /* renamed from: g, reason: collision with root package name */
    private static final int f82502g = 1200;

    /* renamed from: h, reason: collision with root package name */
    private static final int f82503h = 5999;

    /* renamed from: i, reason: collision with root package name */
    private static final int f82504i = 0;

    /* renamed from: j, reason: collision with root package name */
    private static final int f82505j = 1;

    /* renamed from: k, reason: collision with root package name */
    @d0(format = "G")
    public static final q<net.time4j.calendar.hindu.f> f82506k = new net.time4j.calendar.service.i(ProtectedSandApp.s("邠\u0001"), d.class, net.time4j.calendar.hindu.f.class, 'G');

    /* renamed from: l, reason: collision with root package name */
    @d0(format = "y")
    public static final o0<Integer, d> f82507l = new net.time4j.calendar.service.j(ProtectedSandApp.s("邡\u0001"), d.class, 0, 6000, 'y');

    /* renamed from: m, reason: collision with root package name */
    @d0(format = "M")
    public static final net.time4j.calendar.hindu.a<net.time4j.calendar.hindu.g> f82508m = f.f82523c;

    /* renamed from: n, reason: collision with root package name */
    @d0(format = "d")
    public static final net.time4j.calendar.hindu.a<net.time4j.calendar.hindu.e> f82509n = b.f82519c;

    /* renamed from: o, reason: collision with root package name */
    @d0(format = "D")
    public static final o0<Integer, d> f82510o = new net.time4j.calendar.service.j(ProtectedSandApp.s("邢\u0001"), d.class, 1, 365, 'D');

    /* renamed from: p, reason: collision with root package name */
    @d0(format = "E")
    public static final o0<g1, d> f82511p = new k(d.class, IndianCalendar.y0());

    /* renamed from: q, reason: collision with root package name */
    private static final Map<String, net.time4j.calendar.hindu.c> f82512q;

    /* renamed from: r, reason: collision with root package name */
    private static final net.time4j.engine.k<d> f82513r;
    private static final long serialVersionUID = 4078031838043675524L;

    /* renamed from: b, reason: collision with root package name */
    private final transient j f82514b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82515c;

    /* renamed from: d, reason: collision with root package name */
    private final transient net.time4j.calendar.hindu.g f82516d;

    /* renamed from: e, reason: collision with root package name */
    private final transient net.time4j.calendar.hindu.e f82517e;

    /* renamed from: f, reason: collision with root package name */
    private final transient long f82518f;

    /* compiled from: HinduCalendar.java */
    static class a implements net.time4j.calendar.service.e<d, l<d>> {
        a() {
        }

        public l<d> a(d dVar) {
            return dVar.Q();
        }

        @Override // net.time4j.calendar.service.e
        public l<d> apply(d dVar) {
            return dVar.Q();
        }
    }

    /* compiled from: HinduCalendar.java */
    private static class b extends net.time4j.format.d<net.time4j.calendar.hindu.e> implements net.time4j.calendar.hindu.a<net.time4j.calendar.hindu.e>, a0<d, net.time4j.calendar.hindu.e> {

        /* renamed from: c, reason: collision with root package name */
        static final b f82519c = new b();
        private static final long serialVersionUID = 992340906349614332L;

        /* compiled from: HinduCalendar.java */
        class a implements v<d> {
            a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // net.time4j.engine.v
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d apply(d dVar) {
                b bVar = b.this;
                return (d) dVar.M(bVar, dVar.i(bVar));
            }
        }

        /* compiled from: HinduCalendar.java */
        /* renamed from: net.time4j.calendar.hindu.d$b$b, reason: collision with other inner class name */
        class C1285b implements v<d> {
            C1285b() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // net.time4j.engine.v
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d apply(d dVar) {
                b bVar = b.this;
                return (d) dVar.M(bVar, dVar.g(bVar));
            }
        }

        private b() {
            super(ProtectedSandApp.s("邇\u0001"));
        }

        @Override // net.time4j.engine.q
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.e getDefaultMaximum() {
            return net.time4j.calendar.hindu.e.e(32);
        }

        @Override // net.time4j.engine.q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.e getDefaultMinimum() {
            return net.time4j.calendar.hindu.e.e(1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.e getMaximum(d dVar) {
            return dVar.f82514b.f().j(dVar.Y0(1).X0().f82518f - 1).f82517e;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.e getMinimum(d dVar) {
            return dVar.X0().f82517e;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.e getValue(d dVar) {
            return dVar.f82517e;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean j(d dVar, net.time4j.calendar.hindu.e eVar) {
            boolean z4 = false;
            if (eVar == null || (eVar.a() && dVar.f82514b.o())) {
                return false;
            }
            if (dVar.f82514b.n() && dVar.D0() && dVar.Z0().f82516d.equals(dVar.f82516d)) {
                z4 = true;
            }
            return dVar.f82514b.f().m(dVar.t0(z4, eVar), dVar.f82516d, eVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00df  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x00e4  */
        @Override // net.time4j.format.v
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.calendar.hindu.e parse(java.lang.CharSequence r21, java.text.ParsePosition r22, net.time4j.engine.d r23) {
            /*
                Method dump skipped, instructions count: 386
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.hindu.d.b.parse(java.lang.CharSequence, java.text.ParsePosition, net.time4j.engine.d):net.time4j.calendar.hindu.e");
        }

        @Override // net.time4j.engine.a0
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public d withValue(d dVar, net.time4j.calendar.hindu.e eVar, boolean z4) {
            if (eVar != null && (!eVar.a() || !dVar.f82514b.o())) {
                int t02 = dVar.t0(dVar.f82514b.n() && dVar.D0() && dVar.Z0().f82516d.equals(dVar.f82516d), eVar);
                net.time4j.calendar.hindu.c f4 = dVar.f82514b.f();
                if (f4.m(t02, dVar.f82516d, eVar)) {
                    return f4.i(t02, dVar.f82516d, eVar);
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("邎\u0001") + eVar);
        }

        @Override // net.time4j.calendar.hindu.a
        public v<d> b() {
            return new a();
        }

        @Override // net.time4j.calendar.hindu.a
        public v<d> c() {
            return new C1285b();
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'd';
        }

        @Override // net.time4j.engine.q
        public Class<net.time4j.calendar.hindu.e> getType() {
            return net.time4j.calendar.hindu.e.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.format.v
        public void print(p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            char c5;
            CharSequence charSequence;
            boolean z4;
            j C0 = d.C0(pVar, dVar);
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
            int intValue = ((Integer) dVar.b(pe.a.G2, 0)).intValue();
            net.time4j.calendar.hindu.e eVar = (net.time4j.calendar.hindu.e) pVar.r(d.f82509n);
            if (eVar.a()) {
                Map<String, String> o4 = net.time4j.format.b.d(ProtectedSandApp.s("邈\u0001"), locale).o();
                z4 = ((Boolean) dVar.b(h.f82528c, Boolean.valueOf(ProtectedSandApp.s("邊\u0001").equals(o4.get(ProtectedSandApp.s("邉\u0001")))))).booleanValue();
                c5 = ((Character) dVar.b(h.f82527b, Character.valueOf(o4.get(ProtectedSandApp.s("邋\u0001")).charAt(0)))).charValue();
                charSequence = (String) net.time4j.format.b.d(ProtectedSandApp.s("邌\u0001"), locale).o().get(ProtectedSandApp.s("邍\u0001"));
            } else {
                c5 = '*';
                charSequence = "";
                z4 = false;
            }
            if (eVar.a() && !z4) {
                if (intValue >= 2) {
                    appendable.append(charSequence);
                    appendable.append(' ');
                } else {
                    appendable.append(c5);
                }
            }
            net.time4j.format.j jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
            char charValue = ((Character) dVar.b(net.time4j.format.a.f82791m, Character.valueOf(jVar.getDigits().charAt(0)))).charValue();
            String a5 = pe.b.a(jVar, charValue, eVar.c());
            if (C0.o() && jVar.isDecimal()) {
                for (int length = intValue - a5.length(); length > 0; length--) {
                    appendable.append(charValue);
                }
            }
            appendable.append(a5);
            if (z4) {
                if (intValue < 2) {
                    appendable.append(c5);
                } else {
                    appendable.append(' ');
                    appendable.append(charSequence);
                }
            }
        }

        protected Object readResolve() throws ObjectStreamException {
            return f82519c;
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(d dVar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(d dVar) {
            return null;
        }
    }

    /* compiled from: HinduCalendar.java */
    private static class c implements a0<d, net.time4j.calendar.hindu.f> {
        private c() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(d dVar) {
            return d.f82507l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(d dVar) {
            return d.f82507l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.f getMaximum(d dVar) {
            if (!dVar.f82514b.m()) {
                net.time4j.calendar.hindu.f[] values = net.time4j.calendar.hindu.f.values();
                for (int length = values.length - 1; length >= 1; length--) {
                    net.time4j.calendar.hindu.f fVar = values[length];
                    if (fVar.yearOfEra(net.time4j.calendar.hindu.f.KALI_YUGA, dVar.f82515c) >= 0) {
                        return fVar;
                    }
                }
            }
            return net.time4j.calendar.hindu.f.KALI_YUGA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.f getMinimum(d dVar) {
            return net.time4j.calendar.hindu.f.KALI_YUGA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.f getValue(d dVar) {
            return dVar.z0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(d dVar, net.time4j.calendar.hindu.f fVar) {
            if (dVar.f82514b.m()) {
                if (fVar != net.time4j.calendar.hindu.f.KALI_YUGA) {
                    return false;
                }
            } else if (fVar == null) {
                return false;
            }
            return true;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public d withValue(d dVar, net.time4j.calendar.hindu.f fVar, boolean z4) {
            if (j(dVar, fVar)) {
                j u4 = dVar.f82514b.u(fVar);
                return u4 == dVar.f82514b ? dVar : new d(u4, dVar.f82515c, dVar.f82516d, dVar.f82517e, dVar.f82518f);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("邏\u0001") + fVar);
        }

        c(a aVar) {
        }
    }

    /* compiled from: HinduCalendar.java */
    /* renamed from: net.time4j.calendar.hindu.d$d, reason: collision with other inner class name */
    private static class C1286d implements e0<d> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82522b;

        C1286d(int i4) {
            this.f82522b = i4;
        }

        private int g(d dVar) {
            int i4 = this.f82522b;
            if (i4 == 0) {
                return dVar.z0().yearOfEra(net.time4j.calendar.hindu.f.KALI_YUGA, dVar.f82514b.p() ? d.f82503h : 6000);
            }
            if (i4 == 1) {
                d Z0 = dVar.Z0();
                return (int) (dVar.f82514b.f().j(Z0.f82518f + 400).Z0().f82518f - Z0.f82518f);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("邐\u0001") + this.f82522b);
        }

        private int i(d dVar) {
            int i4 = this.f82522b;
            if (i4 == 0) {
                int i5 = dVar.f82514b.m() ? 0 : 1200;
                return dVar.f82514b.p() ? i5 : i5 + 1;
            }
            if (i4 == 1) {
                return 1;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("邐\u0001") + this.f82522b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(d dVar) {
            if (this.f82522b == 0) {
                return d.f82508m;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(d dVar) {
            if (this.f82522b == 0) {
                return d.f82508m;
            }
            return null;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(d dVar) {
            int i4 = this.f82522b;
            if (i4 == 0) {
                return dVar.o();
            }
            if (i4 == 1) {
                return dVar.y0();
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("邐\u0001") + this.f82522b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(d dVar) {
            return Integer.valueOf(g(dVar));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(d dVar) {
            return Integer.valueOf(i(dVar));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getValue(d dVar) {
            return Integer.valueOf(d(dVar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean e(d dVar, int i4) {
            return i(dVar) <= i4 && g(dVar) >= i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean j(d dVar, Integer num) {
            return num != null && e(dVar, num.intValue());
        }

        @Override // net.time4j.engine.e0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public d a(d dVar, int i4, boolean z4) {
            if (!e(dVar, i4)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("邑\u0001"), i4));
            }
            int i5 = this.f82522b;
            if (i5 != 0) {
                if (i5 == 1) {
                    return dVar.W(net.time4j.engine.i.i(i4 - d(dVar)));
                }
                throw new UnsupportedOperationException(ProtectedSandApp.s("邐\u0001") + this.f82522b);
            }
            int yearOfEra = net.time4j.calendar.hindu.f.KALI_YUGA.yearOfEra(dVar.z0(), i4);
            if (!dVar.f82514b.p()) {
                yearOfEra--;
            }
            if (yearOfEra == dVar.f82515c) {
                return dVar;
            }
            int i6 = dVar.f82514b.n() ? dVar.f82517e.c() >= 16 ? 29 : 2 : 15;
            net.time4j.calendar.hindu.c f4 = dVar.f82514b.f();
            net.time4j.calendar.hindu.g gVar = dVar.f82516d;
            boolean k4 = f4.k(yearOfEra, gVar);
            if (k4) {
                gVar = net.time4j.calendar.hindu.g.i(dVar.f82516d.h().roll(yearOfEra > dVar.f82515c ? -1 : 1));
                if (yearOfEra < dVar.f82515c) {
                    net.time4j.calendar.hindu.g gVar2 = f4.j(f4.i(yearOfEra, gVar, net.time4j.calendar.hindu.e.e(i6)).b() - 30).f82516d;
                    if (gVar2.equals(gVar.m())) {
                        gVar = gVar2;
                    }
                }
            }
            d i7 = f4.i(yearOfEra, gVar, net.time4j.calendar.hindu.e.e(i6));
            if (!k4 && gVar.a()) {
                i7 = f4.e(i7.f82518f);
                if (i7.f82516d.h().getValue() > gVar.h().getValue()) {
                    i7 = f4.j(i7.f82518f - 30);
                }
            }
            return i7.W0(dVar.f82517e);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public d withValue(d dVar, Integer num, boolean z4) {
            if (num != null) {
                return a(dVar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("邒\u0001"));
        }
    }

    /* compiled from: HinduCalendar.java */
    private static class e implements u<d> {
        private e() {
        }

        @Override // net.time4j.engine.u
        public g0 a() {
            net.time4j.calendar.astro.d dVar = j.f82529g;
            return g0.a(net.time4j.calendar.astro.j.D(dVar.b(), dVar.c()).L());
        }

        /* JADX WARN: Type inference failed for: r10v1, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            String str = (String) dVar.b(net.time4j.format.a.f82798t, "");
            if (str.isEmpty()) {
                return null;
            }
            j e4 = j.e(str);
            net.time4j.calendar.astro.d i4 = e4.i();
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            return (d) net.time4j.d0.y0(eVar.c()).c1(d.f82513r, str, dVar.c(cVar) ? (net.time4j.tz.k) dVar.a(cVar) : net.time4j.tz.p.a(BigDecimal.valueOf(e4.i().c())), (g0) dVar.b(net.time4j.format.a.f82799u, g0.a(net.time4j.calendar.astro.j.F(i4.b(), i4.c(), i4.a(), net.time4j.calendar.astro.k.CC).L()))).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public d e(r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            String str = (String) dVar.b(net.time4j.format.a.f82798t, "");
            if (str.isEmpty()) {
                rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("邓\u0001"));
                return null;
            }
            try {
                j e4 = j.e(str);
                net.time4j.calendar.hindu.c f4 = e4.f();
                net.time4j.calendar.hindu.f g4 = e4.g();
                q<?> qVar = d.f82506k;
                if (rVar.w(qVar)) {
                    g4 = (net.time4j.calendar.hindu.f) rVar.r(qVar);
                }
                int l4 = rVar.l(d.f82507l);
                if (l4 == Integer.MIN_VALUE) {
                    rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("邔\u0001"));
                    return null;
                }
                int yearOfEra = net.time4j.calendar.hindu.f.KALI_YUGA.yearOfEra(g4, l4);
                if (!e4.p()) {
                    yearOfEra--;
                }
                net.time4j.calendar.hindu.a<net.time4j.calendar.hindu.g> aVar = d.f82508m;
                boolean w4 = rVar.w(aVar);
                String s4 = ProtectedSandApp.s("邕\u0001");
                if (w4) {
                    net.time4j.calendar.hindu.a<net.time4j.calendar.hindu.e> aVar2 = d.f82509n;
                    if (rVar.w(aVar2)) {
                        net.time4j.calendar.hindu.g gVar = (net.time4j.calendar.hindu.g) rVar.r(aVar);
                        net.time4j.calendar.hindu.e eVar = (net.time4j.calendar.hindu.e) rVar.r(aVar2);
                        if (f4.m(yearOfEra, gVar, eVar)) {
                            return f4.i(yearOfEra, gVar, eVar);
                        }
                        rVar.M(p0.ERROR_MESSAGE, s4);
                        return null;
                    }
                }
                int l5 = rVar.l(d.f82510o);
                if (l5 != Integer.MIN_VALUE) {
                    if (l5 >= 1) {
                        long j4 = (f4.j(f4.i(yearOfEra, net.time4j.calendar.hindu.g.i(b0.AGRAHAYANA), net.time4j.calendar.hindu.e.e(1)).f82518f).Z0().f82518f + l5) - 1;
                        d j5 = f4.j(j4);
                        if (f4.g() <= j4 && f4.d() >= j4 && (z4 || j5.f82515c == yearOfEra)) {
                            return j5;
                        }
                    }
                    rVar.M(p0.ERROR_MESSAGE, s4);
                }
                return null;
            } catch (IllegalArgumentException unused) {
                rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("邖\u0001"));
                return null;
            }
        }

        @Override // net.time4j.engine.u
        public x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p k(d dVar, net.time4j.engine.d dVar2) {
            return dVar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return 100;
        }

        @Override // net.time4j.engine.u
        public String n(z zVar, Locale locale) {
            return IndianCalendar.u0().n(zVar, locale);
        }

        e(a aVar) {
        }
    }

    /* compiled from: HinduCalendar.java */
    private static class f extends net.time4j.format.d<net.time4j.calendar.hindu.g> implements net.time4j.calendar.hindu.a<net.time4j.calendar.hindu.g>, a0<d, net.time4j.calendar.hindu.g> {

        /* renamed from: c, reason: collision with root package name */
        static final f f82523c = new f();
        private static final long serialVersionUID = 7462717336727909653L;

        /* compiled from: HinduCalendar.java */
        class a implements v<d> {
            a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // net.time4j.engine.v
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d apply(d dVar) {
                f fVar = f.this;
                return (d) dVar.M(fVar, dVar.i(fVar));
            }
        }

        /* compiled from: HinduCalendar.java */
        class b implements v<d> {
            b() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // net.time4j.engine.v
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public d apply(d dVar) {
                f fVar = f.this;
                return (d) dVar.M(fVar, dVar.g(fVar));
            }
        }

        private f() {
            super(ProtectedSandApp.s("邗\u0001"));
        }

        @Override // net.time4j.engine.q
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.g getDefaultMaximum() {
            return net.time4j.calendar.hindu.g.j(12);
        }

        @Override // net.time4j.engine.q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.g getDefaultMinimum() {
            return net.time4j.calendar.hindu.g.j(1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.g getMaximum(d dVar) {
            return dVar.f82514b.o() ? net.time4j.calendar.hindu.g.k(12) : dVar.f82514b.f().j(dVar.Z0().f82518f - 20).f82516d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.g getMinimum(d dVar) {
            return dVar.Z0().f82516d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.g getValue(d dVar) {
            return dVar.f82516d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public boolean j(d dVar, net.time4j.calendar.hindu.g gVar) {
            if (gVar == null || (gVar.a() && dVar.f82514b.o())) {
                return false;
            }
            if (gVar.a()) {
                int i4 = 0;
                for (d Z0 = dVar.Z0(); !Z0.f82516d.equals(gVar); Z0 = Z0.I0()) {
                    if (!Z0.f82516d.a() && (i4 = i4 + 1) >= 12) {
                        return false;
                    }
                }
            }
            if (!dVar.f82514b.l() || dVar.f82514b.m()) {
                return true;
            }
            return !dVar.f82514b.f().k(dVar.f82515c, gVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:16:0x0103  */
        @Override // net.time4j.format.v
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.calendar.hindu.g parse(java.lang.CharSequence r24, java.text.ParsePosition r25, net.time4j.engine.d r26) {
            /*
                Method dump skipped, instructions count: 531
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.hindu.d.f.parse(java.lang.CharSequence, java.text.ParsePosition, net.time4j.engine.d):net.time4j.calendar.hindu.g");
        }

        @Override // net.time4j.engine.a0
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public d withValue(d dVar, net.time4j.calendar.hindu.g gVar, boolean z4) {
            String s4 = ProtectedSandApp.s("邟\u0001");
            if (gVar == null || (gVar.a() && dVar.f82514b.o())) {
                throw new IllegalArgumentException(s4 + gVar);
            }
            d Z0 = dVar.Z0();
            int i4 = 0;
            while (!Z0.f82516d.equals(gVar)) {
                if (!Z0.f82516d.a() && (i4 = i4 + 1) >= 12) {
                    throw new IllegalArgumentException(s4 + gVar);
                }
                Z0 = Z0.I0();
            }
            return Z0.W0(dVar.f82517e);
        }

        @Override // net.time4j.calendar.hindu.a
        public v<d> b() {
            return new a();
        }

        @Override // net.time4j.calendar.hindu.a
        public v<d> c() {
            return new b();
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'M';
        }

        @Override // net.time4j.engine.q
        public Class<net.time4j.calendar.hindu.g> getType() {
            return net.time4j.calendar.hindu.g.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.format.v
        public void print(p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            char c5;
            CharSequence charSequence;
            boolean z4;
            j C0 = d.C0(pVar, dVar);
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
            int intValue = ((Integer) dVar.b(pe.a.G2, 0)).intValue();
            net.time4j.calendar.hindu.g gVar = (net.time4j.calendar.hindu.g) pVar.r(d.f82508m);
            if (gVar.a()) {
                Map<String, String> o4 = net.time4j.format.b.d(ProtectedSandApp.s("邚\u0001"), locale).o();
                z4 = ((Boolean) dVar.b(h.f82528c, Boolean.valueOf(ProtectedSandApp.s("邙\u0001").equals(o4.get(ProtectedSandApp.s("邛\u0001")))))).booleanValue();
                c5 = ((Character) dVar.b(h.f82527b, Character.valueOf(o4.get(ProtectedSandApp.s("邜\u0001")).charAt(0)))).charValue();
                charSequence = (String) net.time4j.format.b.d(ProtectedSandApp.s("邘\u0001"), locale).o().get(ProtectedSandApp.s("邝\u0001"));
            } else {
                c5 = '*';
                charSequence = "";
                z4 = false;
            }
            if (intValue != 0) {
                if (gVar.a() && !z4) {
                    appendable.append(c5);
                }
                int f4 = C0.o() ? gVar.f() : gVar.h().getValue();
                net.time4j.format.j jVar = (net.time4j.format.j) dVar.b(net.time4j.format.a.f82790l, net.time4j.format.j.ARABIC);
                char charValue = ((Character) dVar.b(net.time4j.format.a.f82791m, Character.valueOf(jVar.getDigits().charAt(0)))).charValue();
                String a5 = pe.b.a(jVar, charValue, f4);
                if (C0.o() && jVar.isDecimal()) {
                    for (int length = intValue - a5.length(); length > 0; length--) {
                        appendable.append(charValue);
                    }
                }
                appendable.append(a5);
                if (z4) {
                    appendable.append(c5);
                    return;
                }
                return;
            }
            if (C0.o() && ((Boolean) dVar.b(net.time4j.calendar.hindu.g.f82526d, Boolean.valueOf(C0.q()))).booleanValue()) {
                appendable.append(gVar.g(locale));
                return;
            }
            net.time4j.engine.c<net.time4j.format.x> cVar = net.time4j.format.a.f82785g;
            net.time4j.format.x xVar = net.time4j.format.x.WIDE;
            net.time4j.format.x xVar2 = (net.time4j.format.x) dVar.b(cVar, xVar);
            net.time4j.format.m mVar = (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT);
            if (gVar.a() && !z4) {
                if (xVar2 == xVar) {
                    appendable.append(charSequence);
                    appendable.append(' ');
                } else {
                    appendable.append(c5);
                }
                gVar = net.time4j.calendar.hindu.g.i(gVar.h());
            }
            appendable.append(gVar.e(locale, xVar2, mVar));
            if (z4) {
                if (xVar2 != xVar) {
                    appendable.append(c5);
                } else {
                    appendable.append(' ');
                    appendable.append(charSequence);
                }
            }
        }

        protected Object readResolve() throws ObjectStreamException {
            return f82523c;
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(d dVar) {
            return d.f82509n;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(d dVar) {
            return d.f82509n;
        }
    }

    /* compiled from: HinduCalendar.java */
    private static class g extends ConcurrentHashMap<String, net.time4j.calendar.hindu.c> {
        private g() {
        }

        void b(j jVar) {
            put(jVar.getVariant(), jVar.f());
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.hindu.c get(Object obj) {
            net.time4j.calendar.hindu.c cVar = (net.time4j.calendar.hindu.c) super.get(obj);
            if (cVar != null) {
                return cVar;
            }
            String obj2 = obj.toString();
            net.time4j.calendar.hindu.c f4 = j.e(obj2).f();
            net.time4j.calendar.hindu.c putIfAbsent = putIfAbsent(obj2, f4);
            return putIfAbsent != null ? putIfAbsent : f4;
        }

        g(a aVar) {
        }
    }

    static {
        g gVar = new g();
        for (i iVar : i.values()) {
            gVar.b(iVar.variant());
        }
        gVar.b(j.f82534l);
        gVar.b(j.f82535m);
        f82512q = gVar;
        k.b i4 = k.b.i(d.class, new e(), gVar);
        q<Integer> qVar = net.time4j.calendar.d.f82409a;
        o0<Integer, d> o0Var = f82510o;
        f82513r = i4.f(qVar, new net.time4j.calendar.service.g(gVar, o0Var)).f(f82506k, new c()).f(f82507l, new C1286d(0)).f(f82508m, f.f82523c).f(f82509n, b.f82519c).f(o0Var, new C1286d(1)).f(f82511p, new net.time4j.calendar.service.l(IndianCalendar.y0(), new a())).c();
    }

    d(j jVar, int i4, net.time4j.calendar.hindu.g gVar, net.time4j.calendar.hindu.e eVar, long j4) {
        if (jVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("邥\u0001"));
        }
        if (gVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("邤\u0001"));
        }
        if (eVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("那\u0001"));
        }
        this.f82514b = jVar;
        this.f82515c = i4;
        this.f82516d = gVar;
        this.f82517e = eVar;
        this.f82518f = j4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static j C0(p pVar, net.time4j.engine.d dVar) {
        if (pVar instanceof q0) {
            return j.e(((q0) pVar).getVariant());
        }
        net.time4j.engine.c<String> cVar = net.time4j.format.a.f82798t;
        if (dVar.c(cVar)) {
            return j.e((String) dVar.a(cVar));
        }
        throw new IllegalArgumentException(androidx.constraintlayout.core.motion.key.c.a(ProtectedSandApp.s("邧\u0001"), pVar == null ? ProtectedSandApp.s("邦\u0001") : pVar.toString()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean D0() {
        return this.f82516d.h().equals(b0.CHAITRA);
    }

    public static boolean E0(j jVar, net.time4j.calendar.hindu.f fVar, int i4, net.time4j.calendar.hindu.g gVar, net.time4j.calendar.hindu.e eVar) {
        net.time4j.calendar.hindu.c f4 = jVar.u(fVar).f();
        int yearOfEra = net.time4j.calendar.hindu.f.KALI_YUGA.yearOfEra(fVar, i4);
        if (!jVar.p()) {
            yearOfEra--;
        }
        if (yearOfEra < 0) {
            return false;
        }
        if (jVar.m() || yearOfEra >= 1200) {
            return f4.m(yearOfEra, gVar, eVar);
        }
        return false;
    }

    public static d K0(j jVar) {
        return L0(jVar, f82513r.a());
    }

    public static d L0(j jVar, g0 g0Var) {
        return (d) w0.g().d(f82513r, jVar, g0Var).m();
    }

    public static d N0(j jVar, net.time4j.calendar.hindu.f fVar, int i4, net.time4j.calendar.hindu.g gVar, net.time4j.calendar.hindu.e eVar) {
        net.time4j.calendar.hindu.c f4 = jVar.u(fVar).f();
        int yearOfEra = net.time4j.calendar.hindu.f.KALI_YUGA.yearOfEra(fVar, i4);
        if (!jVar.p()) {
            yearOfEra--;
        }
        if (yearOfEra < 0) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("邭\u0001"), yearOfEra));
        }
        if (!jVar.m() && yearOfEra < 1200) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("邨\u0001"), yearOfEra));
        }
        if (f4.m(yearOfEra, gVar, eVar)) {
            return f4.i(yearOfEra, gVar, eVar);
        }
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("邩\u0001"));
        sb.append(jVar);
        sb.append(ProtectedSandApp.s("邪\u0001"));
        sb.append(fVar);
        String s4 = ProtectedSandApp.s("邫\u0001");
        sb.append(s4);
        sb.append(i4);
        sb.append(s4);
        sb.append(gVar);
        sb.append(s4);
        sb.append(eVar);
        sb.append(ProtectedSandApp.s("邬\u0001"));
        throw new IllegalArgumentException(sb.toString());
    }

    public static d O0(int i4, net.time4j.calendar.hindu.g gVar, int i5) {
        if (i5 > 30) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("邮\u0001"), i5));
        }
        return N0(j.f82535m, net.time4j.calendar.hindu.f.KALI_YUGA, i4, gVar, net.time4j.calendar.hindu.e.e(i5));
    }

    public static d P0(int i4, int i5, int i6) {
        if (i6 > 31) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("邮\u0001"), i6));
        }
        return N0(j.f82534l, net.time4j.calendar.hindu.f.KALI_YUGA, i4, net.time4j.calendar.hindu.g.k(i5), net.time4j.calendar.hindu.e.e(i6));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int Q0(java.lang.CharSequence r2, int r3, int r4, boolean r5, java.lang.String r6, char r7, java.util.Locale r8) {
        /*
            int r0 = r6.length()
            int r0 = r0 + r3
            if (r0 >= r4) goto L2d
            java.lang.CharSequence r1 = r2.subSequence(r3, r0)
            java.lang.String r1 = r1.toString()
            if (r5 == 0) goto L19
            java.lang.String r6 = r6.toUpperCase(r8)
            java.lang.String r1 = r1.toUpperCase(r8)
        L19:
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L2d
            r6 = 1
            if (r0 >= r4) goto L2f
            char r4 = r2.charAt(r0)
            r8 = 32
            if (r4 != r8) goto L2f
            int r0 = r0 + 1
            goto L2f
        L2d:
            r6 = 0
            r0 = r3
        L2f:
            if (r6 != 0) goto L36
            int r2 = R0(r2, r3, r5, r7)
            return r2
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.hindu.d.Q0(java.lang.CharSequence, int, int, boolean, java.lang.String, char, java.util.Locale):int");
    }

    private static int R0(CharSequence charSequence, int i4, boolean z4, char c5) {
        char charAt = charSequence.charAt(i4);
        if (z4) {
            charAt = Character.toUpperCase(charAt);
            c5 = Character.toUpperCase(c5);
        }
        if (charAt == c5) {
            return i4 + 1;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int S0(java.lang.CharSequence r3, int r4, int r5, boolean r6, java.lang.String r7, char r8, java.util.Locale r9) {
        /*
            int r0 = r7.length()
            int r0 = r0 + r4
            if (r0 >= r5) goto L14
            char r1 = r3.charAt(r4)
            r2 = 32
            if (r1 != r2) goto L14
            int r1 = r4 + 1
            int r0 = r0 + 1
            goto L15
        L14:
            r1 = r4
        L15:
            if (r0 >= r5) goto L31
            java.lang.CharSequence r5 = r3.subSequence(r1, r0)
            java.lang.String r5 = r5.toString()
            if (r6 == 0) goto L29
            java.lang.String r7 = r7.toUpperCase(r9)
            java.lang.String r5 = r5.toUpperCase(r9)
        L29:
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L31
            r5 = 1
            goto L33
        L31:
            r5 = 0
            r0 = r1
        L33:
            if (r5 != 0) goto L3a
            int r3 = R0(r3, r4, r6, r8)
            return r3
        L3a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.hindu.d.S0(java.lang.CharSequence, int, int, boolean, java.lang.String, char, java.util.Locale):int");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d W0(net.time4j.calendar.hindu.e eVar) {
        net.time4j.calendar.hindu.c f4 = this.f82514b.f();
        boolean n4 = this.f82514b.n();
        boolean z4 = n4 && D0() && Z0().f82516d.equals(this.f82516d);
        int i4 = 5;
        net.time4j.calendar.hindu.e eVar2 = eVar;
        while (true) {
            int t02 = t0(z4, eVar2);
            if (!f4.l(t02, this.f82516d, eVar2)) {
                return f4.i(t02, this.f82516d, eVar2);
            }
            if (eVar2.c() == (n4 ? 16 : 1) && !eVar2.a()) {
                return X0();
            }
            if (i4 == 0) {
                if (f4.k(t02, this.f82516d)) {
                    StringBuilder a5 = s.a(ProtectedSandApp.s("邯\u0001"), t02, ProtectedSandApp.s("邰\u0001"));
                    a5.append(this.f82516d);
                    throw new IllegalArgumentException(a5.toString());
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("邱\u0001") + this + ProtectedSandApp.s("邲\u0001") + eVar + ProtectedSandApp.s("邳\u0001"));
            }
            if (eVar2.a()) {
                eVar2 = net.time4j.calendar.hindu.e.e(eVar2.c());
            } else {
                int c5 = eVar2.c() - 1;
                if (n4 && c5 == 0) {
                    c5 = 30;
                }
                eVar2 = net.time4j.calendar.hindu.e.e(c5);
                if (this.f82514b.l()) {
                    eVar2 = eVar2.f();
                }
            }
            i4--;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public d Y0(int i4) {
        int c5 = this.f82517e.c();
        if (this.f82514b.n()) {
            c5 = c5 >= 16 ? c5 - 15 : c5 + 15;
        }
        return this.f82514b.f().j(((Math.round(i4 * (this.f82514b.o() ? 30.4d : 29.5d)) + this.f82518f) + 15) - c5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d a1(int i4) {
        return (d) K(f82507l, o() + i4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("邴\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int t0(boolean z4, net.time4j.calendar.hindu.e eVar) {
        if (z4) {
            if (this.f82517e.c() >= 16 && eVar.c() < 16) {
                return this.f82515c + 1;
            }
            if (this.f82517e.c() < 16 && eVar.c() >= 16) {
                return this.f82515c - 1;
            }
        }
        return this.f82515c;
    }

    public static net.time4j.engine.k<d> u0() {
        return f82513r;
    }

    private Object writeReplace() {
        return new SPX(this, 20);
    }

    int A0() {
        return this.f82515c;
    }

    public net.time4j.calendar.hindu.g B0() {
        return this.f82516d;
    }

    public int F0() {
        return (int) (Y0(1).X0().f82518f - X0().f82518f);
    }

    public int G0() {
        return ((Integer) g(f82510o)).intValue();
    }

    public d H0() {
        return this.f82514b.f().e(this.f82518f + 1);
    }

    public d I0() {
        d W0 = Y0(1).W0(this.f82517e);
        if (W0.f82518f <= this.f82514b.f().d()) {
            return W0;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("邵\u0001"));
    }

    public d J0() {
        return a1(1);
    }

    @Override // net.time4j.engine.m
    protected l<d> Q() {
        return this.f82514b.f();
    }

    @Override // net.time4j.engine.m
    /* renamed from: R */
    protected net.time4j.engine.k<d> y() {
        return f82513r;
    }

    public d T0() {
        return this.f82514b.f().e(this.f82518f - 1);
    }

    public d U0() {
        d W0 = Y0(-1).W0(this.f82517e);
        if (W0.f82518f >= this.f82514b.f().g()) {
            return W0;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("邵\u0001"));
    }

    public d V0() {
        return a1(-1);
    }

    d X0() {
        net.time4j.calendar.hindu.e e4 = net.time4j.calendar.hindu.e.e(1);
        net.time4j.calendar.hindu.c f4 = this.f82514b.f();
        int i4 = this.f82515c;
        if (this.f82514b.l()) {
            int i5 = 3;
            if (this.f82514b.n()) {
                net.time4j.calendar.hindu.e e5 = net.time4j.calendar.hindu.e.e(16);
                if (D0() && this.f82517e.c() < 16) {
                    if (this.f82516d.equals(Z0().f82516d)) {
                        i4--;
                    }
                }
                e4 = e5;
            }
            while (f4.l(i4, this.f82516d, e4)) {
                if (i5 == 0) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("邶\u0001") + this);
                }
                e4 = e4.a() ? net.time4j.calendar.hindu.e.e(e4.c() + 1) : e4.f();
                i5--;
            }
        }
        return f4.i(i4, this.f82516d, e4);
    }

    d Z0() {
        if (this.f82514b.n()) {
            return this.f82514b.f().j(this.f82514b.r().i(this.f82515c, net.time4j.calendar.hindu.g.j(1), net.time4j.calendar.hindu.e.e(15)).Z0().f82518f);
        }
        net.time4j.calendar.hindu.g k4 = this.f82514b.o() ? net.time4j.calendar.hindu.g.k(1) : net.time4j.calendar.hindu.g.j(this.f82514b.h());
        net.time4j.calendar.hindu.c f4 = this.f82514b.f();
        d i4 = f4.i(this.f82515c, k4, net.time4j.calendar.hindu.e.e(15));
        if (this.f82514b.l()) {
            d j4 = f4.j(i4.f82518f - 30);
            if (j4.f82516d.a() && j4.f82515c == this.f82515c) {
                i4 = j4;
            }
        }
        return i4.X0();
    }

    @Override // net.time4j.engine.m, net.time4j.engine.h
    public long b() {
        return this.f82518f;
    }

    @Override // net.time4j.engine.m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f82514b.equals(dVar.f82514b) && this.f82515c == dVar.f82515c && this.f82516d.equals(dVar.f82516d) && this.f82517e.equals(dVar.f82517e) && this.f82518f == dVar.f82518f;
    }

    @Override // net.time4j.engine.q0
    public String getVariant() {
        return this.f82514b.getVariant();
    }

    @Override // net.time4j.engine.m
    public int hashCode() {
        return (this.f82517e.hashCode() * 37) + (this.f82516d.hashCode() * 31) + (this.f82515c * 17) + (this.f82514b.hashCode() * 7);
    }

    public int o() {
        int yearOfEra = z0().yearOfEra(net.time4j.calendar.hindu.f.KALI_YUGA, this.f82515c);
        return !this.f82514b.p() ? yearOfEra + 1 : yearOfEra;
    }

    public net.time4j.u<d> r0(m0 m0Var) {
        return net.time4j.u.f(this, m0Var);
    }

    public net.time4j.u<d> s0(int i4, int i5) {
        return net.time4j.u.f(this, m0.b1(i4, i5));
    }

    @Override // net.time4j.engine.m
    public String toString() {
        return ProtectedSandApp.s("邪\u0001") + this.f82514b + ProtectedSandApp.s("邷\u0001") + z0() + ProtectedSandApp.s("邸\u0001") + o() + ProtectedSandApp.s("邹\u0001") + this.f82516d + ProtectedSandApp.s("邺\u0001") + this.f82517e + ']';
    }

    protected d v0() {
        return this;
    }

    public net.time4j.calendar.hindu.e w0() {
        return this.f82517e;
    }

    public g1 x0() {
        return g1.valueOf(net.time4j.base.c.d(this.f82518f + 5, 7) + 1);
    }

    @Override // net.time4j.engine.m, net.time4j.engine.r
    protected x y() {
        return f82513r;
    }

    public int y0() {
        return (int) ((this.f82518f - Z0().f82518f) + 1);
    }

    @Override // net.time4j.engine.r
    protected r z() {
        return this;
    }

    public net.time4j.calendar.hindu.f z0() {
        net.time4j.calendar.hindu.f g4 = this.f82514b.g();
        net.time4j.calendar.hindu.f fVar = net.time4j.calendar.hindu.f.KALI_YUGA;
        return g4.yearOfEra(fVar, this.f82515c) < 0 ? fVar : g4;
    }
}
