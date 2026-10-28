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
import java.util.List;
import java.util.Locale;
import net.time4j.calendar.d;
import net.time4j.calendar.p0;
import net.time4j.calendar.r0;
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("ethiopic")
/* loaded from: classes7.dex */
public final class EthiopianCalendar extends net.time4j.engine.n<k, EthiopianCalendar> implements net.time4j.format.h {

    /* renamed from: e, reason: collision with root package name */
    private static final int f81931e = 5500;

    /* renamed from: f, reason: collision with root package name */
    private static final long f81932f = ((Long) net.time4j.history.d.f83160s.d(net.time4j.history.h.g(net.time4j.history.j.AD, 8, 8, 29)).r(net.time4j.engine.b0.UTC)).longValue();

    /* renamed from: g, reason: collision with root package name */
    private static final int f81933g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f81934h = 2;

    /* renamed from: i, reason: collision with root package name */
    private static final int f81935i = 3;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<p> f81936j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, EthiopianCalendar> f81937k;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<q, EthiopianCalendar> f81938l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, EthiopianCalendar> f81939m;

    /* renamed from: n, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, EthiopianCalendar> f81940n;

    /* renamed from: o, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, EthiopianCalendar> f81941o;

    /* renamed from: p, reason: collision with root package name */
    private static final r0<EthiopianCalendar> f81942p;

    /* renamed from: q, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<EthiopianCalendar> f81943q;

    /* renamed from: r, reason: collision with root package name */
    public static final net.time4j.engine.q<r> f81944r;

    /* renamed from: s, reason: collision with root package name */
    public static final net.time4j.format.v<p0> f81945s;
    private static final long serialVersionUID = -1632000525062084751L;

    /* renamed from: t, reason: collision with root package name */
    private static final o<EthiopianCalendar> f81946t;

    /* renamed from: u, reason: collision with root package name */
    private static final net.time4j.engine.j0<k, EthiopianCalendar> f81947u;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f81948b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f81949c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f81950d;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f81951c = 4;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f81952b;

        public SPX() {
        }

        private EthiopianCalendar a(ObjectInput objectInput) throws IOException {
            return EthiopianCalendar.H0(p.values()[objectInput.readByte()], objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            EthiopianCalendar ethiopianCalendar = (EthiopianCalendar) this.f81952b;
            objectOutput.writeByte(ethiopianCalendar.z0().ordinal());
            objectOutput.writeInt(ethiopianCalendar.o());
            objectOutput.writeByte(ethiopianCalendar.A0().getValue());
            objectOutput.writeByte(ethiopianCalendar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f81952b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 4) {
                throw new InvalidObjectException(ProtectedSandApp.s("詐\u0001"));
            }
            this.f81952b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(4);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f81952b = obj;
        }
    }

    static class a implements net.time4j.engine.t<EthiopianCalendar, net.time4j.engine.l<EthiopianCalendar>> {
        a() {
        }

        public net.time4j.engine.l<EthiopianCalendar> a(EthiopianCalendar ethiopianCalendar) {
            return EthiopianCalendar.f81946t;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<EthiopianCalendar> apply(EthiopianCalendar ethiopianCalendar) {
            return EthiopianCalendar.f81946t;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81953a;

        static {
            int[] iArr = new int[k.values().length];
            f81953a = iArr;
            try {
                iArr[k.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81953a[k.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81953a[k.WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81953a[k.DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class c implements net.time4j.engine.a0<EthiopianCalendar, p> {
        private c() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(EthiopianCalendar ethiopianCalendar) {
            return EthiopianCalendar.f81937k;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(EthiopianCalendar ethiopianCalendar) {
            return EthiopianCalendar.f81937k;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p getMaximum(EthiopianCalendar ethiopianCalendar) {
            return p.AMETE_MIHRET;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p getMinimum(EthiopianCalendar ethiopianCalendar) {
            return p.AMETE_ALEM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public p getValue(EthiopianCalendar ethiopianCalendar) {
            return ethiopianCalendar.z0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(EthiopianCalendar ethiopianCalendar, p pVar) {
            return pVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar withValue(EthiopianCalendar ethiopianCalendar, p pVar, boolean z4) {
            if (pVar != null) {
                return ethiopianCalendar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("詑\u0001"));
        }

        c(a aVar) {
        }
    }

    private static class d implements net.time4j.engine.o0<EthiopianCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final k f81954a;

        d(k kVar) {
            this.f81954a = kVar;
        }

        private static int e(EthiopianCalendar ethiopianCalendar) {
            return ((ethiopianCalendar.f81948b * 13) + ethiopianCalendar.f81949c) - 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar b(EthiopianCalendar ethiopianCalendar, long j4) {
            int i4 = b.f81953a[this.f81954a.ordinal()];
            if (i4 == 1) {
                j4 = net.time4j.base.c.i(j4, 13L);
            } else if (i4 != 2) {
                if (i4 == 3) {
                    j4 = net.time4j.base.c.i(j4, 7L);
                } else if (i4 != 4) {
                    throw new UnsupportedOperationException(this.f81954a.name());
                }
                return (EthiopianCalendar) EthiopianCalendar.f81946t.e(net.time4j.base.c.f(EthiopianCalendar.f81946t.f(ethiopianCalendar), j4));
            }
            p pVar = p.AMETE_MIHRET;
            long f4 = net.time4j.base.c.f(e(ethiopianCalendar), j4);
            int g4 = net.time4j.base.c.g(net.time4j.base.c.b(f4, 13));
            int d5 = net.time4j.base.c.d(f4, 13) + 1;
            if (g4 < 1) {
                pVar = p.AMETE_ALEM;
                g4 += EthiopianCalendar.f81931e;
            }
            return EthiopianCalendar.H0(pVar, g4, d5, Math.min(ethiopianCalendar.f81950d, EthiopianCalendar.f81946t.b(pVar, g4, d5)));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(EthiopianCalendar ethiopianCalendar, EthiopianCalendar ethiopianCalendar2) {
            int between;
            int i4 = b.f81953a[this.f81954a.ordinal()];
            if (i4 == 1) {
                between = k.MONTHS.between(ethiopianCalendar, ethiopianCalendar2) / 13;
            } else {
                if (i4 == 2) {
                    long e4 = e(ethiopianCalendar2) - e(ethiopianCalendar);
                    return (e4 <= 0 || ethiopianCalendar2.f81950d >= ethiopianCalendar.f81950d) ? (e4 >= 0 || ethiopianCalendar2.f81950d <= ethiopianCalendar.f81950d) ? e4 : e4 + 1 : e4 - 1;
                }
                if (i4 != 3) {
                    if (i4 == 4) {
                        return EthiopianCalendar.f81946t.f(ethiopianCalendar2) - EthiopianCalendar.f81946t.f(ethiopianCalendar);
                    }
                    throw new UnsupportedOperationException(this.f81954a.name());
                }
                between = k.DAYS.between(ethiopianCalendar, ethiopianCalendar2) / 7;
            }
            return between;
        }
    }

    private static class e implements net.time4j.engine.a0<EthiopianCalendar, r> {
        private e() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(EthiopianCalendar ethiopianCalendar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(EthiopianCalendar ethiopianCalendar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public r getMaximum(EthiopianCalendar ethiopianCalendar) {
            return ethiopianCalendar.f81948b >= 9997 ? r.LUKE : r.JOHN;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public r getMinimum(EthiopianCalendar ethiopianCalendar) {
            return r.MATTHEW;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public r getValue(EthiopianCalendar ethiopianCalendar) {
            return r.values()[(ethiopianCalendar.o() + 3) % 4];
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(EthiopianCalendar ethiopianCalendar, r rVar) {
            return rVar != null && rVar.compareTo(getMaximum(ethiopianCalendar)) <= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar withValue(EthiopianCalendar ethiopianCalendar, r rVar, boolean z4) {
            if (rVar != null) {
                return (EthiopianCalendar) ethiopianCalendar.W(rVar.ordinal() - getValue(ethiopianCalendar).ordinal(), k.YEARS);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("詒\u0001"));
        }

        e(a aVar) {
        }
    }

    private static class f implements net.time4j.engine.a0<EthiopianCalendar, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final int f81955b;

        f(int i4) {
            this.f81955b = i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(EthiopianCalendar ethiopianCalendar) {
            if (this.f81955b == 0) {
                return EthiopianCalendar.f81938l;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(EthiopianCalendar ethiopianCalendar) {
            if (this.f81955b == 0) {
                return EthiopianCalendar.f81938l;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(EthiopianCalendar ethiopianCalendar) {
            int i4 = this.f81955b;
            if (i4 == 0) {
                return Integer.valueOf(ethiopianCalendar.z0() == p.AMETE_ALEM ? 15499 : org.threeten.bp.chrono.m.f87989n);
            }
            if (i4 == 2) {
                return Integer.valueOf(EthiopianCalendar.f81946t.b(ethiopianCalendar.z0(), ethiopianCalendar.o(), ethiopianCalendar.f81949c));
            }
            if (i4 == 3) {
                return Integer.valueOf(EthiopianCalendar.f81946t.h(ethiopianCalendar.z0(), ethiopianCalendar.o()));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("詓\u0001") + this.f81955b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(EthiopianCalendar ethiopianCalendar) {
            int i4 = this.f81955b;
            if (i4 == 0 || i4 == 2 || i4 == 3) {
                return 1;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("詓\u0001") + this.f81955b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(EthiopianCalendar ethiopianCalendar) {
            int i4 = this.f81955b;
            if (i4 == 0) {
                return Integer.valueOf(ethiopianCalendar.o());
            }
            if (i4 == 2) {
                return Integer.valueOf(ethiopianCalendar.f81950d);
            }
            if (i4 != 3) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("詓\u0001") + this.f81955b);
            }
            int i5 = 0;
            for (int i6 = 1; i6 < ethiopianCalendar.f81949c; i6++) {
                i5 += EthiopianCalendar.f81946t.b(ethiopianCalendar.z0(), ethiopianCalendar.o(), i6);
            }
            return Integer.valueOf(i5 + ethiopianCalendar.f81950d);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(EthiopianCalendar ethiopianCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return getMinimum(ethiopianCalendar).compareTo(num) <= 0 && getMaximum(ethiopianCalendar).compareTo(num) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar withValue(EthiopianCalendar ethiopianCalendar, Integer num, boolean z4) {
            if (!j(ethiopianCalendar, num)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("詔\u0001") + num);
            }
            int i4 = this.f81955b;
            if (i4 == 0) {
                p z02 = ethiopianCalendar.z0();
                int intValue = num.intValue();
                return EthiopianCalendar.H0(z02, intValue, ethiopianCalendar.f81949c, Math.min(ethiopianCalendar.f81950d, EthiopianCalendar.f81946t.b(z02, intValue, ethiopianCalendar.f81949c)));
            }
            if (i4 == 2) {
                return new EthiopianCalendar(ethiopianCalendar.f81948b, ethiopianCalendar.f81949c, num.intValue(), null);
            }
            if (i4 == 3) {
                return ethiopianCalendar.h0(net.time4j.engine.i.i(num.intValue() - getValue(ethiopianCalendar).intValue()));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("詓\u0001") + this.f81955b);
        }
    }

    private static class g implements net.time4j.engine.u<EthiopianCalendar> {
        private g() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82722c;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (EthiopianCalendar) net.time4j.d0.y0(eVar.c()).d1(EthiopianCalendar.f81947u, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            int l4 = rVar.l(EthiopianCalendar.f81937k);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("評\u0001"));
                return null;
            }
            net.time4j.engine.q<?> qVar = EthiopianCalendar.f81936j;
            if (!rVar.w(qVar)) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("詖\u0001"));
            }
            p pVar = (p) rVar.r(qVar);
            o0<q, EthiopianCalendar> o0Var = EthiopianCalendar.f81938l;
            boolean w4 = rVar.w(o0Var);
            String s4 = ProtectedSandApp.s("詗\u0001");
            if (w4) {
                int value = ((q) rVar.r(o0Var)).getValue();
                int l5 = rVar.l(EthiopianCalendar.f81939m);
                if (l5 != Integer.MIN_VALUE) {
                    if (EthiopianCalendar.f81946t.c(pVar, l4, value, l5)) {
                        return EthiopianCalendar.H0(pVar, l4, value, l5);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            } else {
                int l6 = rVar.l(EthiopianCalendar.f81940n);
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 > 0) {
                        int i4 = 1;
                        int i5 = 0;
                        while (i4 <= 13) {
                            int b5 = EthiopianCalendar.f81946t.b(pVar, l4, i4) + i5;
                            if (l6 <= b5) {
                                return EthiopianCalendar.H0(pVar, l4, i4, l6 - i5);
                            }
                            i4++;
                            i5 = b5;
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
        public net.time4j.engine.p k(EthiopianCalendar ethiopianCalendar, net.time4j.engine.d dVar) {
            return ethiopianCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g() - 8;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("詘\u0001"), zVar, locale);
        }

        g(a aVar) {
        }
    }

    private static class h implements net.time4j.engine.a0<EthiopianCalendar, q> {
        private h() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(EthiopianCalendar ethiopianCalendar) {
            return EthiopianCalendar.f81939m;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(EthiopianCalendar ethiopianCalendar) {
            return EthiopianCalendar.f81939m;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public q getMaximum(EthiopianCalendar ethiopianCalendar) {
            return q.PAGUMEN;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public q getMinimum(EthiopianCalendar ethiopianCalendar) {
            return q.MESKEREM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public q getValue(EthiopianCalendar ethiopianCalendar) {
            return ethiopianCalendar.A0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(EthiopianCalendar ethiopianCalendar, q qVar) {
            return qVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar withValue(EthiopianCalendar ethiopianCalendar, q qVar, boolean z4) {
            if (qVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("詙\u0001"));
            }
            int value = qVar.getValue();
            return new EthiopianCalendar(ethiopianCalendar.f81948b, value, Math.min(ethiopianCalendar.f81950d, EthiopianCalendar.f81946t.b(ethiopianCalendar.z0(), ethiopianCalendar.o(), value)), null);
        }

        h(a aVar) {
        }
    }

    private static class i implements net.time4j.engine.a0<EthiopianCalendar, p0> {
        private i() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(EthiopianCalendar ethiopianCalendar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(EthiopianCalendar ethiopianCalendar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p0 getMaximum(EthiopianCalendar ethiopianCalendar) {
            return p0.f(((Integer) ethiopianCalendar.g(EthiopianCalendar.f81939m)).intValue());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public p0 getMinimum(EthiopianCalendar ethiopianCalendar) {
            return p0.f(1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public p0 getValue(EthiopianCalendar ethiopianCalendar) {
            return p0.f(ethiopianCalendar.t());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(EthiopianCalendar ethiopianCalendar, p0 p0Var) {
            return p0Var != null && p0Var.compareTo(getMaximum(ethiopianCalendar)) <= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar withValue(EthiopianCalendar ethiopianCalendar, p0 p0Var, boolean z4) {
            if (p0Var != null) {
                return (EthiopianCalendar) ethiopianCalendar.K(EthiopianCalendar.f81939m, p0Var.d());
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("詚\u0001"));
        }

        i(a aVar) {
        }
    }

    private static class j implements o<EthiopianCalendar> {
        private j() {
        }

        private static void i(net.time4j.engine.j jVar) {
            if (jVar instanceof p) {
                return;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("詛\u0001") + jVar);
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Arrays.asList(p.AMETE_ALEM, p.AMETE_MIHRET);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            i(jVar);
            if (i4 >= 1) {
                if (i4 <= (p.AMETE_ALEM.equals(jVar) ? 15499 : org.threeten.bp.chrono.m.f87989n) && i5 >= 1 && i5 <= 13) {
                    if (i5 <= 12) {
                        return 30;
                    }
                    return i4 % 4 == 3 ? 6 : 5;
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("詜\u0001") + jVar + ProtectedSandApp.s("詝\u0001") + i4 + ProtectedSandApp.s("詞\u0001") + i5);
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            if ((jVar instanceof p) && i4 >= 1) {
                if (i4 <= (p.AMETE_ALEM.equals(jVar) ? 15499 : org.threeten.bp.chrono.m.f87989n) && i5 >= 1 && i5 <= 13 && i6 >= 1 && i6 <= b(jVar, i4, i5)) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.engine.l
        public long d() {
            return f(new EthiopianCalendar(org.threeten.bp.chrono.m.f87989n, 13, 6, null));
        }

        @Override // net.time4j.engine.l
        public long g() {
            int i4 = 1;
            return f(new EthiopianCalendar(-5499, i4, i4, null));
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            i(jVar);
            if (i4 >= 1) {
                if (i4 <= (p.AMETE_ALEM.equals(jVar) ? 15499 : org.threeten.bp.chrono.m.f87989n)) {
                    return i4 % 4 == 3 ? 366 : 365;
                }
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("詜\u0001") + jVar + ProtectedSandApp.s("詝\u0001") + i4);
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public long f(EthiopianCalendar ethiopianCalendar) {
            return (EthiopianCalendar.f81932f - 1) + ((ethiopianCalendar.f81948b - 1) * 365) + net.time4j.base.c.a(ethiopianCalendar.f81948b, 4) + ((ethiopianCalendar.f81949c - 1) * 30) + ethiopianCalendar.f81950d;
        }

        @Override // net.time4j.engine.l
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public EthiopianCalendar e(long j4) {
            try {
                int g4 = net.time4j.base.c.g(net.time4j.base.c.b(net.time4j.base.c.f(net.time4j.base.c.i(4L, net.time4j.base.c.m(j4, EthiopianCalendar.f81932f)), 1463L), 1461));
                a aVar = null;
                int i4 = 1;
                int g5 = net.time4j.base.c.g(net.time4j.base.c.b(j4 - net.time4j.base.c.g(f(new EthiopianCalendar(g4, i4, i4, aVar))), 30)) + 1;
                int g6 = net.time4j.base.c.g(net.time4j.base.c.m(j4, net.time4j.base.c.g(f(new EthiopianCalendar(g4, g5, i4, aVar))))) + 1;
                p pVar = p.AMETE_MIHRET;
                if (g4 < 1) {
                    g4 += EthiopianCalendar.f81931e;
                    pVar = p.AMETE_ALEM;
                }
                return EthiopianCalendar.H0(pVar, g4, g5, g6);
            } catch (ArithmeticException e4) {
                throw new IllegalArgumentException(e4);
            }
        }

        j(a aVar) {
        }
    }

    public enum k implements net.time4j.engine.w {
        YEARS(3.15576E7d),
        MONTHS(2592000.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        k(double d5) {
            this.length = d5;
        }

        public int between(EthiopianCalendar ethiopianCalendar, EthiopianCalendar ethiopianCalendar2) {
            return (int) ethiopianCalendar.Y(ethiopianCalendar2, this);
        }

        @Override // net.time4j.engine.w
        public double getLength() {
            return this.length;
        }

        @Override // net.time4j.engine.w
        public boolean isCalendrical() {
            return true;
        }
    }

    static {
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("詣\u0001"), EthiopianCalendar.class, p.class, 'G');
        f81936j = iVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("詤\u0001"), EthiopianCalendar.class, 1, org.threeten.bp.chrono.m.f87989n, 'y', null, null);
        f81937k = jVar;
        net.time4j.calendar.service.i iVar2 = new net.time4j.calendar.service.i(ProtectedSandApp.s("詥\u0001"), EthiopianCalendar.class, q.class, 'M');
        f81938l = iVar2;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("試\u0001"), EthiopianCalendar.class, 1, 30, 'd');
        f81939m = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("詧\u0001"), EthiopianCalendar.class, 1, 365, 'D');
        f81940n = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(EthiopianCalendar.class, y0());
        f81941o = kVar;
        r0<EthiopianCalendar> r0Var = new r0<>(EthiopianCalendar.class, jVar2, kVar);
        f81942p = r0Var;
        f81943q = r0Var;
        net.time4j.calendar.service.i iVar3 = new net.time4j.calendar.service.i(ProtectedSandApp.s("詩\u0001"), EthiopianCalendar.class, r.class, (char) 0, ProtectedSandApp.s("詨\u0001"));
        f81944r = iVar3;
        p0.a aVar = p0.a.TABOT;
        f81945s = aVar;
        j jVar4 = new j();
        f81946t = jVar4;
        j0.c f4 = j0.c.m(k.class, EthiopianCalendar.class, new g(), jVar4).f(iVar, new c());
        f fVar = new f(0);
        k kVar2 = k.YEARS;
        j0.c g4 = f4.g(jVar, fVar, kVar2);
        h hVar = new h();
        k kVar3 = k.MONTHS;
        j0.c g5 = g4.g(iVar2, hVar, kVar3);
        f fVar2 = new f(2);
        k kVar4 = k.DAYS;
        j0.c j4 = g5.g(jVar2, fVar2, kVar4).g(jVar3, new f(3), kVar4).g(kVar, new s0(y0(), new a()), kVar4).f(r0Var, new r0.a(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(jVar4, jVar3)).f(iVar3, new e()).f(aVar, new i()).j(kVar2, new d(kVar2), kVar2.getLength(), Collections.singleton(kVar3)).j(kVar3, new d(kVar3), kVar3.getLength(), Collections.singleton(kVar2));
        k kVar5 = k.WEEKS;
        f81947u = j4.j(kVar5, new d(kVar5), kVar5.getLength(), Collections.singleton(kVar4)).j(kVar4, new d(kVar4), kVar4.getLength(), Collections.singleton(kVar5)).h(new net.time4j.calendar.service.b()).h(new d.h(EthiopianCalendar.class, jVar2, jVar3, y0())).c();
    }

    /* synthetic */ EthiopianCalendar(int i4, int i5, int i6, a aVar) {
        this(i4, i5, i6);
    }

    public static boolean C0(p pVar, int i4, int i5, int i6) {
        return f81946t.c(pVar, i4, i5, i6);
    }

    private static int F0(net.time4j.engine.j jVar, int i4) {
        return p.AMETE_ALEM.equals(jVar) ? i4 - 5500 : i4;
    }

    public static EthiopianCalendar G0() {
        return (EthiopianCalendar) w0.g().f(f81947u);
    }

    public static EthiopianCalendar H0(p pVar, int i4, int i5, int i6) {
        if (f81946t.c(pVar, i4, i5, i6)) {
            return new EthiopianCalendar(F0(pVar, i4), i5, i6);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("詪\u0001") + pVar + ProtectedSandApp.s("詫\u0001") + i4 + ProtectedSandApp.s("詬\u0001") + i5 + ProtectedSandApp.s("詭\u0001") + i6);
    }

    public static EthiopianCalendar I0(p pVar, int i4, q qVar, int i5) {
        return H0(pVar, i4, qVar.getValue(), i5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("詮\u0001"));
    }

    public static net.time4j.engine.j0<k, EthiopianCalendar> u0() {
        return f81947u;
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public static i1 y0() {
        return i1.l(g1.SUNDAY, 1);
    }

    public q A0() {
        return q.valueOf(this.f81949c);
    }

    public boolean B0() {
        return o() % 4 == 3;
    }

    public int D0() {
        return f81946t.b(z0(), o(), this.f81949c);
    }

    public int E0() {
        return B0() ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<k, EthiopianCalendar> y() {
        return f81947u;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EthiopianCalendar)) {
            return false;
        }
        EthiopianCalendar ethiopianCalendar = (EthiopianCalendar) obj;
        return this.f81950d == ethiopianCalendar.f81950d && this.f81949c == ethiopianCalendar.f81949c && this.f81948b == ethiopianCalendar.f81948b;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f81948b * 37) + (this.f81949c * 31) + (this.f81950d * 17);
    }

    public int o() {
        int i4 = this.f81948b;
        return i4 < 1 ? i4 + f81931e : i4;
    }

    public int t() {
        return this.f81950d;
    }

    public net.time4j.u<EthiopianCalendar> t0(EthiopianTime ethiopianTime) {
        return net.time4j.u.h(this, ethiopianTime.x0());
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(z0());
        sb.append('-');
        String valueOf = String.valueOf(o());
        for (int length = valueOf.length(); length < 4; length++) {
            sb.append('0');
        }
        sb.append(valueOf);
        sb.append('-');
        if (this.f81949c < 10) {
            sb.append('0');
        }
        sb.append(this.f81949c);
        sb.append('-');
        if (this.f81950d < 10) {
            sb.append('0');
        }
        sb.append(this.f81950d);
        return sb.toString();
    }

    protected EthiopianCalendar v0() {
        return this;
    }

    public g1 w0() {
        return g1.valueOf(net.time4j.base.c.d(f81946t.f(this) + 5, 7) + 1);
    }

    public int x0() {
        return ((Integer) r(f81940n)).intValue();
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f81947u;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    public p z0() {
        return this.f81948b < 1 ? p.AMETE_ALEM : p.AMETE_MIHRET;
    }

    private EthiopianCalendar(int i4, int i5, int i6) {
        this.f81948b = i4;
        this.f81949c = i5;
        this.f81950d = i6;
    }
}
