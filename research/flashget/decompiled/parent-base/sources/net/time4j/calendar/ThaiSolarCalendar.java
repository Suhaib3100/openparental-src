package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.time4j.calendar.d;
import net.time4j.calendar.r0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("buddhist")
/* loaded from: classes7.dex */
public final class ThaiSolarCalendar extends net.time4j.engine.n<net.time4j.h, ThaiSolarCalendar> implements net.time4j.format.h {

    /* renamed from: b, reason: collision with root package name */
    private static final net.time4j.l0 f82238b = net.time4j.l0.r1(-542, 4, 1);

    /* renamed from: c, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<q0> f82239c;

    /* renamed from: d, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, ThaiSolarCalendar> f82240d;

    /* renamed from: e, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<net.time4j.e0, ThaiSolarCalendar> f82241e;

    /* renamed from: f, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, ThaiSolarCalendar> f82242f;

    /* renamed from: g, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, ThaiSolarCalendar> f82243g;

    /* renamed from: h, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, ThaiSolarCalendar> f82244h;

    /* renamed from: i, reason: collision with root package name */
    private static final r0<ThaiSolarCalendar> f82245i;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<ThaiSolarCalendar> f82246j;

    /* renamed from: k, reason: collision with root package name */
    private static final Map<Object, net.time4j.engine.q<?>> f82247k;

    /* renamed from: l, reason: collision with root package name */
    private static final o<ThaiSolarCalendar> f82248l;

    /* renamed from: m, reason: collision with root package name */
    private static final net.time4j.engine.j0<net.time4j.h, ThaiSolarCalendar> f82249m;
    private static final long serialVersionUID = -6628190121085147706L;
    private final net.time4j.l0 iso;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82250c = 8;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82251b;

        public SPX() {
        }

        private ThaiSolarCalendar a(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            return (ThaiSolarCalendar) ((net.time4j.l0) net.time4j.l0.class.cast(objectInput.readObject())).l0(ThaiSolarCalendar.class);
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeObject(((ThaiSolarCalendar) this.f82251b).K0());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82251b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            if (objectInput.readByte() != 8) {
                throw new InvalidObjectException(ProtectedSandApp.s("讣\u0001"));
            }
            this.f82251b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(8);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82251b = obj;
        }
    }

    static class a implements net.time4j.engine.t<ThaiSolarCalendar, net.time4j.engine.l<ThaiSolarCalendar>> {
        a() {
        }

        public net.time4j.engine.l<ThaiSolarCalendar> a(ThaiSolarCalendar thaiSolarCalendar) {
            return ThaiSolarCalendar.f82248l;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<ThaiSolarCalendar> apply(ThaiSolarCalendar thaiSolarCalendar) {
            return ThaiSolarCalendar.f82248l;
        }
    }

    private static class b<V extends Comparable<V>> implements net.time4j.engine.a0<ThaiSolarCalendar, V> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<V> f82252b;

        private b(net.time4j.engine.q<V> qVar) {
            this.f82252b = qVar;
        }

        static <V extends Comparable<V>> b<V> j(net.time4j.engine.q<V> qVar) {
            return new b<>(qVar);
        }

        private static int k(Object obj) {
            return ((Integer) Integer.class.cast(obj)).intValue();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(ThaiSolarCalendar thaiSolarCalendar) {
            return (net.time4j.engine.q) ThaiSolarCalendar.f82247k.get(this.f82252b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(ThaiSolarCalendar thaiSolarCalendar) {
            return (net.time4j.engine.q) ThaiSolarCalendar.f82247k.get(this.f82252b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public V getMaximum(ThaiSolarCalendar thaiSolarCalendar) {
            Object valueOf;
            net.time4j.engine.q<V> qVar = this.f82252b;
            if (qVar == ThaiSolarCalendar.f82239c) {
                valueOf = q0.BUDDHIST;
            } else if (qVar.equals(ThaiSolarCalendar.f82240d)) {
                valueOf = 1000000542;
            } else if (this.f82252b.equals(ThaiSolarCalendar.f82241e)) {
                valueOf = thaiSolarCalendar.o() >= 2483 ? net.time4j.e0.DECEMBER : net.time4j.e0.MARCH;
            } else if (this.f82252b.equals(ThaiSolarCalendar.f82242f)) {
                valueOf = Integer.valueOf(thaiSolarCalendar.D0());
            } else {
                if (!this.f82252b.equals(ThaiSolarCalendar.f82243g)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82252b, new StringBuilder(ProtectedSandApp.s("认\u0001"))));
                }
                valueOf = Integer.valueOf(thaiSolarCalendar.E0());
            }
            return this.f82252b.getType().cast(valueOf);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public V getMinimum(ThaiSolarCalendar thaiSolarCalendar) {
            Object obj;
            net.time4j.engine.q<V> qVar = this.f82252b;
            if (qVar == ThaiSolarCalendar.f82239c) {
                obj = q0.BUDDHIST;
            } else if (Integer.class.isAssignableFrom(qVar.getType())) {
                obj = 1;
            } else {
                if (!this.f82252b.equals(ThaiSolarCalendar.f82241e)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82252b, new StringBuilder(ProtectedSandApp.s("认\u0001"))));
                }
                obj = thaiSolarCalendar.iso.o() >= 1941 ? net.time4j.e0.JANUARY : net.time4j.e0.APRIL;
            }
            return this.f82252b.getType().cast(obj);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public V getValue(ThaiSolarCalendar thaiSolarCalendar) {
            Object valueOf;
            net.time4j.engine.q<V> qVar = this.f82252b;
            if (qVar == ThaiSolarCalendar.f82239c) {
                thaiSolarCalendar.getClass();
                valueOf = q0.BUDDHIST;
            } else if (qVar.equals(ThaiSolarCalendar.f82240d)) {
                valueOf = Integer.valueOf(thaiSolarCalendar.o());
            } else if (this.f82252b.equals(ThaiSolarCalendar.f82241e)) {
                valueOf = thaiSolarCalendar.A0();
            } else if (this.f82252b.equals(ThaiSolarCalendar.f82242f)) {
                valueOf = Integer.valueOf(thaiSolarCalendar.t());
            } else {
                if (!this.f82252b.equals(ThaiSolarCalendar.f82243g)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82252b, new StringBuilder(ProtectedSandApp.s("认\u0001"))));
                }
                valueOf = Integer.valueOf(thaiSolarCalendar.x0());
            }
            return this.f82252b.getType().cast(valueOf);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(ThaiSolarCalendar thaiSolarCalendar, V v4) {
            if (v4 == null) {
                return false;
            }
            if (this.f82252b.getType().isEnum()) {
                return (this.f82252b.equals(ThaiSolarCalendar.f82241e) && thaiSolarCalendar.o() == 2483 && ((net.time4j.e0) net.time4j.e0.class.cast(v4)).getValue() < 4) ? false : true;
            }
            return getMinimum(thaiSolarCalendar).compareTo(v4) <= 0 && v4.compareTo(getMaximum(thaiSolarCalendar)) <= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public ThaiSolarCalendar withValue(ThaiSolarCalendar thaiSolarCalendar, V v4, boolean z4) {
            if (!j(thaiSolarCalendar, v4)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("讥\u0001") + v4);
            }
            net.time4j.engine.q<V> qVar = this.f82252b;
            if (qVar == ThaiSolarCalendar.f82239c) {
                return thaiSolarCalendar;
            }
            if (qVar.equals(ThaiSolarCalendar.f82240d)) {
                ThaiSolarCalendar I0 = ThaiSolarCalendar.I0(k(v4), thaiSolarCalendar.A0(), 1);
                return (ThaiSolarCalendar) I0.K(ThaiSolarCalendar.f82242f, Math.min(thaiSolarCalendar.t(), I0.D0()));
            }
            if (this.f82252b.equals(ThaiSolarCalendar.f82241e)) {
                ThaiSolarCalendar I02 = ThaiSolarCalendar.I0(thaiSolarCalendar.o(), (net.time4j.e0) net.time4j.e0.class.cast(v4), 1);
                return (ThaiSolarCalendar) I02.K(ThaiSolarCalendar.f82242f, Math.min(thaiSolarCalendar.t(), I02.D0()));
            }
            a aVar = null;
            if (this.f82252b.equals(ThaiSolarCalendar.f82242f)) {
                return new ThaiSolarCalendar((net.time4j.l0) thaiSolarCalendar.iso.K(net.time4j.l0.f83332w, k(v4)), aVar);
            }
            if (!this.f82252b.equals(ThaiSolarCalendar.f82243g)) {
                throw new ChronoException(net.time4j.g0.a(this.f82252b, new StringBuilder(ProtectedSandApp.s("认\u0001"))));
            }
            return new ThaiSolarCalendar((net.time4j.l0) ThaiSolarCalendar.G0(q0.BUDDHIST, thaiSolarCalendar.o(), thaiSolarCalendar.iso.o() >= 1941 ? 1 : 4, 1).iso.W(k(v4) - 1, net.time4j.h.DAYS), aVar);
        }
    }

    private static class c implements net.time4j.engine.u<ThaiSolarCalendar> {
        private c() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ThaiSolarCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.k G;
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                G = (net.time4j.tz.k) dVar.a(cVar);
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                G = net.time4j.tz.l.e0().G();
            }
            return (ThaiSolarCalendar) net.time4j.d0.y0(eVar.c()).d1(ThaiSolarCalendar.f82249m, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ThaiSolarCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            q0 q0Var;
            int i4;
            int i5;
            net.time4j.f fVar = net.time4j.l0.f83326q;
            a aVar = null;
            if (rVar.w(fVar)) {
                return new ThaiSolarCalendar((net.time4j.l0) rVar.r(fVar), aVar);
            }
            net.time4j.engine.q<?> qVar = ThaiSolarCalendar.f82239c;
            if (rVar.w(qVar)) {
                q0Var = (q0) rVar.r(qVar);
            } else {
                if (!z4) {
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("讨\u0001"));
                    return null;
                }
                q0Var = q0.BUDDHIST;
            }
            int l4 = rVar.l(ThaiSolarCalendar.f82240d);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("讦\u0001"));
                return null;
            }
            o0<net.time4j.e0, ThaiSolarCalendar> o0Var = ThaiSolarCalendar.f82241e;
            boolean w4 = rVar.w(o0Var);
            String s4 = ProtectedSandApp.s("讧\u0001");
            if (w4) {
                int value = ((net.time4j.e0) rVar.r(o0Var)).getValue();
                int l5 = rVar.l(ThaiSolarCalendar.f82242f);
                if (l5 != Integer.MIN_VALUE) {
                    if (ThaiSolarCalendar.f82248l.c(q0Var, l4, value, l5)) {
                        return ThaiSolarCalendar.G0(q0Var, l4, value, l5);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            } else {
                int l6 = rVar.l(ThaiSolarCalendar.f82243g);
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 > 0) {
                        int i6 = 0;
                        int i7 = (q0Var == q0.RATTANAKOSIN || l4 < 2484) ? 3 : 0;
                        int isoYear = q0Var.toIsoYear(l4, 4);
                        int i10 = i7 + 1;
                        while (i10 <= i7 + 12) {
                            if (i10 <= 12) {
                                i4 = isoYear;
                                i5 = i10;
                            } else {
                                if (q0Var == q0.BUDDHIST && isoYear == 1940) {
                                    break;
                                }
                                i4 = isoYear + 1;
                                i5 = i10 - 12;
                            }
                            int d5 = net.time4j.base.b.d(i4, i5) + i6;
                            if (l6 <= d5) {
                                return ThaiSolarCalendar.G0(q0Var, l4, i5, l6 - i6);
                            }
                            i10++;
                            i6 = d5;
                        }
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            }
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(ThaiSolarCalendar thaiSolarCalendar, net.time4j.engine.d dVar) {
            return thaiSolarCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g() + 543;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("让\u0001"), zVar, locale);
        }

        c(a aVar) {
        }
    }

    private static class d implements net.time4j.engine.o0<ThaiSolarCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final net.time4j.h f82253a;

        d(net.time4j.h hVar) {
            this.f82253a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ThaiSolarCalendar b(ThaiSolarCalendar thaiSolarCalendar, long j4) {
            return new ThaiSolarCalendar((net.time4j.l0) thaiSolarCalendar.iso.W(j4, this.f82253a), null);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(ThaiSolarCalendar thaiSolarCalendar, ThaiSolarCalendar thaiSolarCalendar2) {
            return this.f82253a.between(thaiSolarCalendar.iso, thaiSolarCalendar2.iso);
        }
    }

    private static class e implements o<ThaiSolarCalendar> {
        private e() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Arrays.asList(q0.RATTANAKOSIN, q0.BUDDHIST);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            try {
                return net.time4j.base.b.d(((q0) q0.class.cast(jVar)).toIsoYear(i4, i5), i5);
            } catch (RuntimeException e4) {
                throw new IllegalArgumentException(e4.getMessage(), e4);
            }
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            int isoYear;
            try {
                if (!(jVar instanceof q0) || i4 < 1 || (isoYear = ((q0) q0.class.cast(jVar)).toIsoYear(i4, i5)) > 999999999 || i5 < 1 || i5 > 12 || i6 < 1) {
                    return false;
                }
                return i6 <= net.time4j.base.b.d(isoYear, i5);
            } catch (RuntimeException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.l
        public long d() {
            return net.time4j.l0.T0().y().d();
        }

        @Override // net.time4j.engine.l
        public long g() {
            return ThaiSolarCalendar.f82238b.b();
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            if (i4 < 1) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("讫\u0001"), i4));
            }
            if (!jVar.equals(q0.BUDDHIST)) {
                if (jVar.equals(q0.RATTANAKOSIN)) {
                    return net.time4j.base.b.e(i4 + 1782) ? 366 : 365;
                }
                throw new IllegalArgumentException(ProtectedSandApp.s("讪\u0001") + jVar);
            }
            int i5 = i4 - 543;
            if (i5 == 1940) {
                return 275;
            }
            if (i5 < 1940) {
                i5 = i4 - 542;
            }
            return net.time4j.base.b.e(i5) ? 366 : 365;
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(ThaiSolarCalendar thaiSolarCalendar) {
            return ((Long) thaiSolarCalendar.iso.r(net.time4j.engine.b0.UTC)).longValue();
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public ThaiSolarCalendar e(long j4) {
            return new ThaiSolarCalendar(net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC), null);
        }

        e(a aVar) {
        }
    }

    static {
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("讬\u0001"), ThaiSolarCalendar.class, q0.class, 'G');
        f82239c = iVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("训\u0001"), ThaiSolarCalendar.class, 1, 1000000542, 'y', null, null);
        f82240d = jVar;
        net.time4j.calendar.service.i iVar2 = new net.time4j.calendar.service.i(ProtectedSandApp.s("议\u0001"), ThaiSolarCalendar.class, net.time4j.e0.class, 'M');
        f82241e = iVar2;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("讯\u0001"), ThaiSolarCalendar.class, 1, 31, 'd');
        f82242f = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("记\u0001"), ThaiSolarCalendar.class, 1, 365, 'D');
        f82243g = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(ThaiSolarCalendar.class, y0());
        f82244h = kVar;
        r0<ThaiSolarCalendar> r0Var = new r0<>(ThaiSolarCalendar.class, jVar2, kVar);
        f82245i = r0Var;
        f82246j = r0Var;
        HashMap hashMap = new HashMap();
        hashMap.put(iVar, jVar);
        hashMap.put(jVar, iVar2);
        hashMap.put(iVar2, jVar2);
        f82247k = Collections.unmodifiableMap(hashMap);
        e eVar = new e();
        f82248l = eVar;
        j0.c f4 = j0.c.m(net.time4j.h.class, ThaiSolarCalendar.class, new c(), eVar).f(iVar, b.j(iVar)).g(jVar, b.j(jVar), net.time4j.h.YEARS).g(iVar2, b.j(iVar2), net.time4j.h.MONTHS).f(net.time4j.calendar.d.f82409a, new l0(eVar, jVar3));
        b j4 = b.j(jVar2);
        net.time4j.h hVar = net.time4j.h.DAYS;
        j0.c h4 = f4.g(jVar2, j4, hVar).g(jVar3, b.j(jVar3), hVar).g(kVar, new s0(y0(), new a()), hVar).f(r0Var, new r0.a(r0Var)).h(new d.h(ThaiSolarCalendar.class, jVar2, jVar3, y0()));
        J0(h4);
        f82249m = h4.c();
    }

    /* synthetic */ ThaiSolarCalendar(net.time4j.l0 l0Var, a aVar) {
        this(l0Var);
    }

    public static boolean C0(q0 q0Var, int i4, int i5, int i6) {
        return f82248l.c(q0Var, i4, i5, i6);
    }

    public static ThaiSolarCalendar F0() {
        return (ThaiSolarCalendar) w0.g().f(f82249m);
    }

    public static ThaiSolarCalendar G0(q0 q0Var, int i4, int i5, int i6) {
        return new ThaiSolarCalendar(net.time4j.l0.r1(q0Var.toIsoYear(i4, i5), i5, i6));
    }

    public static ThaiSolarCalendar H0(int i4, int i5, int i6) {
        return G0(q0.BUDDHIST, i4, i5, i6);
    }

    public static ThaiSolarCalendar I0(int i4, net.time4j.e0 e0Var, int i5) {
        return G0(q0.BUDDHIST, i4, e0Var.getValue(), i5);
    }

    private static void J0(j0.c<net.time4j.h, ThaiSolarCalendar> cVar) {
        EnumSet range = EnumSet.range(net.time4j.h.MILLENNIA, net.time4j.h.MONTHS);
        EnumSet range2 = EnumSet.range(net.time4j.h.WEEKS, net.time4j.h.DAYS);
        for (net.time4j.h hVar : net.time4j.h.values()) {
            cVar.j(hVar, new d(hVar), hVar.getLength(), hVar.compareTo(net.time4j.h.WEEKS) < 0 ? range : range2);
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("讲\u0001"));
    }

    public static net.time4j.engine.j0<net.time4j.h, ThaiSolarCalendar> u0() {
        return f82249m;
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public static i1 y0() {
        return i1.l(g1.SUNDAY, 1);
    }

    public net.time4j.e0 A0() {
        return net.time4j.e0.valueOf(this.iso.q());
    }

    public boolean B0() {
        return E0() == 366;
    }

    public int D0() {
        return this.iso.l1();
    }

    public int E0() {
        int o4 = this.iso.o();
        if (o4 >= 1941) {
            return this.iso.m1();
        }
        if (this.iso.q() < 4) {
            return this.iso.i1() ? 366 : 365;
        }
        if (o4 == 1940) {
            return 275;
        }
        return net.time4j.base.b.e(o4 + 1) ? 366 : 365;
    }

    net.time4j.l0 K0() {
        return this.iso;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<net.time4j.h, ThaiSolarCalendar> y() {
        return f82249m;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ThaiSolarCalendar) {
            return this.iso.equals(((ThaiSolarCalendar) obj).iso);
        }
        return false;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return this.iso.hashCode();
    }

    public int o() {
        int o4 = this.iso.o();
        return (o4 >= 1941 || this.iso.q() >= 4) ? o4 + 543 : o4 + 542;
    }

    public net.time4j.u<ThaiSolarCalendar> s0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    public int t() {
        return this.iso.t();
    }

    public net.time4j.u<ThaiSolarCalendar> t0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(q0.BUDDHIST);
        sb.append('-');
        sb.append(o());
        sb.append('-');
        int value = A0().getValue();
        if (value < 10) {
            sb.append('0');
        }
        sb.append(value);
        sb.append('-');
        int t4 = this.iso.t();
        if (t4 < 10) {
            sb.append('0');
        }
        sb.append(t4);
        return sb.toString();
    }

    protected ThaiSolarCalendar v0() {
        return this;
    }

    public g1 w0() {
        return this.iso.d1();
    }

    public int x0() {
        int intValue = ((Integer) this.iso.r(net.time4j.l0.f83334y)).intValue();
        if (this.iso.o() >= 1941) {
            return intValue;
        }
        if (this.iso.q() >= 4) {
            return intValue - (this.iso.i1() ? 91 : 90);
        }
        return intValue + 275;
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82249m;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    public q0 z0() {
        return q0.BUDDHIST;
    }

    private ThaiSolarCalendar(net.time4j.l0 l0Var) {
        if (!l0Var.f(f82238b)) {
            this.iso = l0Var;
        } else {
            throw new IllegalArgumentException(ProtectedSandApp.s("讱\u0001") + l0Var);
        }
    }
}
