package net.time4j.calendar;

import com.android.internal.telephony.SmsConstants;
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
import net.time4j.calendar.r0;
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("julian")
/* loaded from: classes7.dex */
public final class JulianCalendar extends net.time4j.engine.n<j, JulianCalendar> implements net.time4j.format.h {

    /* renamed from: e, reason: collision with root package name */
    private static final int f82152e = 999999999;

    /* renamed from: f, reason: collision with root package name */
    private static final int f82153f = 720200;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82154g = 0;

    /* renamed from: h, reason: collision with root package name */
    private static final int f82155h = 2;

    /* renamed from: i, reason: collision with root package name */
    private static final int f82156i = 3;

    /* renamed from: j, reason: collision with root package name */
    public static final net.time4j.engine.q<net.time4j.history.h> f82157j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<net.time4j.history.j> f82158k;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final net.time4j.engine.q<Integer> f82159l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final net.time4j.format.v<Integer> f82160m;

    /* renamed from: n, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final net.time4j.engine.q<Integer> f82161n;

    /* renamed from: o, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final net.time4j.engine.q<Integer> f82162o;

    /* renamed from: p, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final net.time4j.engine.q<g1> f82163p;

    /* renamed from: q, reason: collision with root package name */
    private static final r0<JulianCalendar> f82164q;

    /* renamed from: r, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<JulianCalendar> f82165r;

    /* renamed from: s, reason: collision with root package name */
    private static final o<JulianCalendar> f82166s;
    private static final long serialVersionUID = 3038883058279104976L;

    /* renamed from: t, reason: collision with root package name */
    private static final net.time4j.engine.j0<j, JulianCalendar> f82167t;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82168b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82169c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f82170d;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82171c = 7;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82172b;

        public SPX() {
        }

        private JulianCalendar a(ObjectInput objectInput) throws IOException {
            int readInt = objectInput.readInt();
            int readInt2 = objectInput.readInt();
            int readInt3 = objectInput.readInt();
            net.time4j.history.j jVar = readInt >= 1 ? net.time4j.history.j.AD : net.time4j.history.j.BC;
            if (readInt < 1) {
                readInt = net.time4j.base.c.l(1, readInt);
            }
            return JulianCalendar.J0(jVar, readInt, readInt2, readInt3);
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            JulianCalendar julianCalendar = (JulianCalendar) this.f82172b;
            objectOutput.writeInt(julianCalendar.C0());
            objectOutput.writeInt(julianCalendar.B0().getValue());
            objectOutput.writeInt(julianCalendar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82172b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 7) {
                throw new InvalidObjectException(ProtectedSandApp.s("譐\u0001"));
            }
            this.f82172b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(7);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82172b = obj;
        }
    }

    static class a implements net.time4j.engine.t<JulianCalendar, net.time4j.engine.l<JulianCalendar>> {
        a() {
        }

        public net.time4j.engine.l<JulianCalendar> a(JulianCalendar julianCalendar) {
            return JulianCalendar.f82166s;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<JulianCalendar> apply(JulianCalendar julianCalendar) {
            return JulianCalendar.f82166s;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82173a;

        static {
            int[] iArr = new int[j.values().length];
            f82173a = iArr;
            try {
                iArr[j.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82173a[j.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82173a[j.WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82173a[j.DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class c implements net.time4j.engine.a0<JulianCalendar, net.time4j.history.h> {
        private c() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(JulianCalendar julianCalendar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(JulianCalendar julianCalendar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.h getMaximum(JulianCalendar julianCalendar) {
            return net.time4j.history.h.g(net.time4j.history.j.AD, 999999999, 12, 31);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.h getMinimum(JulianCalendar julianCalendar) {
            return net.time4j.history.h.g(net.time4j.history.j.BC, 999999999, 1, 1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.h getValue(JulianCalendar julianCalendar) {
            return net.time4j.history.h.g(julianCalendar.A0(), julianCalendar.o(), julianCalendar.f82169c, julianCalendar.f82170d);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(JulianCalendar julianCalendar, net.time4j.history.h hVar) {
            if (hVar == null) {
                return false;
            }
            return JulianCalendar.f82166s.c(hVar.c(), hVar.e(), hVar.d(), hVar.b());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public JulianCalendar withValue(JulianCalendar julianCalendar, net.time4j.history.h hVar, boolean z4) {
            if (hVar != null) {
                return JulianCalendar.J0(hVar.c(), hVar.e(), hVar.d(), hVar.b());
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("譑\u0001"));
        }

        c(a aVar) {
        }
    }

    private static class d implements net.time4j.engine.a0<JulianCalendar, net.time4j.history.j> {
        private d() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(JulianCalendar julianCalendar) {
            return JulianCalendar.f82159l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(JulianCalendar julianCalendar) {
            return JulianCalendar.f82159l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j getMaximum(JulianCalendar julianCalendar) {
            return net.time4j.history.j.AD;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j getMinimum(JulianCalendar julianCalendar) {
            return net.time4j.history.j.BC;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j getValue(JulianCalendar julianCalendar) {
            return julianCalendar.A0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(JulianCalendar julianCalendar, net.time4j.history.j jVar) {
            return julianCalendar.A0().equals(jVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public JulianCalendar withValue(JulianCalendar julianCalendar, net.time4j.history.j jVar, boolean z4) {
            if (j(julianCalendar, jVar)) {
                return julianCalendar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("譒\u0001"));
        }

        d(a aVar) {
        }
    }

    private static class e implements net.time4j.engine.a0<JulianCalendar, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82174b;

        e(int i4) {
            this.f82174b = i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(JulianCalendar julianCalendar) {
            if (this.f82174b == 0) {
                return JulianCalendar.f82160m;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(JulianCalendar julianCalendar) {
            if (this.f82174b == 0) {
                return JulianCalendar.f82160m;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(JulianCalendar julianCalendar) {
            int i4 = this.f82174b;
            if (i4 == 0) {
                return 999999999;
            }
            if (i4 == 2) {
                return Integer.valueOf(JulianCalendar.G0(julianCalendar.f82168b, julianCalendar.f82169c));
            }
            if (i4 == 3) {
                return Integer.valueOf(julianCalendar.f82168b % 4 == 0 ? 366 : 365);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("譓\u0001") + this.f82174b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(JulianCalendar julianCalendar) {
            int i4 = this.f82174b;
            if (i4 == 0 || i4 == 2 || i4 == 3) {
                return 1;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("譓\u0001") + this.f82174b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(JulianCalendar julianCalendar) {
            int i4 = this.f82174b;
            if (i4 == 0) {
                return Integer.valueOf(julianCalendar.o());
            }
            if (i4 == 2) {
                return Integer.valueOf(julianCalendar.f82170d);
            }
            if (i4 != 3) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("譓\u0001") + this.f82174b);
            }
            int i5 = 0;
            for (int i6 = 1; i6 < julianCalendar.f82169c; i6++) {
                i5 += JulianCalendar.G0(julianCalendar.f82168b, i6);
            }
            return Integer.valueOf(i5 + julianCalendar.f82170d);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(JulianCalendar julianCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return getMinimum(julianCalendar).compareTo(num) <= 0 && getMaximum(julianCalendar).compareTo(num) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public JulianCalendar withValue(JulianCalendar julianCalendar, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("譕\u0001"));
            }
            int i4 = this.f82174b;
            if (i4 == 0) {
                int intValue = num.intValue();
                return JulianCalendar.J0(julianCalendar.A0(), intValue, julianCalendar.f82169c, Math.min(julianCalendar.f82170d, JulianCalendar.G0(julianCalendar.A0() == net.time4j.history.j.AD ? intValue : net.time4j.base.c.l(1, intValue), julianCalendar.f82169c)));
            }
            if (i4 == 2) {
                return JulianCalendar.J0(julianCalendar.A0(), julianCalendar.o(), julianCalendar.f82169c, num.intValue());
            }
            if (i4 != 3) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("譓\u0001") + this.f82174b);
            }
            int intValue2 = num.intValue();
            if (intValue2 >= 1 && intValue2 <= julianCalendar.H0()) {
                return julianCalendar.h0(net.time4j.engine.i.i(num.intValue() - getValue(julianCalendar).intValue()));
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("譔\u0001") + num);
        }
    }

    private static class f implements net.time4j.engine.o0<JulianCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final j f82175a;

        f(j jVar) {
            this.f82175a = jVar;
        }

        private static long e(JulianCalendar julianCalendar) {
            return ((julianCalendar.f82168b * 12) + julianCalendar.f82169c) - 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public JulianCalendar b(JulianCalendar julianCalendar, long j4) {
            int i4 = b.f82173a[this.f82175a.ordinal()];
            if (i4 == 1) {
                j4 = net.time4j.base.c.i(j4, 12L);
            } else if (i4 != 2) {
                if (i4 == 3) {
                    j4 = net.time4j.base.c.i(j4, 7L);
                } else if (i4 != 4) {
                    throw new UnsupportedOperationException(this.f82175a.name());
                }
                return (JulianCalendar) JulianCalendar.f82166s.e(net.time4j.base.c.f(JulianCalendar.f82166s.f(julianCalendar), j4));
            }
            long f4 = net.time4j.base.c.f(e(julianCalendar), j4);
            int g4 = net.time4j.base.c.g(net.time4j.base.c.b(f4, 12));
            int d5 = net.time4j.base.c.d(f4, 12) + 1;
            int min = Math.min(julianCalendar.f82170d, JulianCalendar.G0(g4, d5));
            net.time4j.history.j jVar = g4 >= 1 ? net.time4j.history.j.AD : net.time4j.history.j.BC;
            if (g4 < 1) {
                g4 = net.time4j.base.c.l(1, g4);
            }
            return JulianCalendar.J0(jVar, g4, d5, min);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(JulianCalendar julianCalendar, JulianCalendar julianCalendar2) {
            int i4 = b.f82173a[this.f82175a.ordinal()];
            if (i4 == 1) {
                return julianCalendar.Y(julianCalendar2, j.MONTHS) / 12;
            }
            if (i4 == 2) {
                long e4 = e(julianCalendar2) - e(julianCalendar);
                return (e4 <= 0 || julianCalendar2.f82170d >= julianCalendar.f82170d) ? (e4 >= 0 || julianCalendar2.f82170d <= julianCalendar.f82170d) ? e4 : e4 + 1 : e4 - 1;
            }
            if (i4 == 3) {
                return julianCalendar.Y(julianCalendar2, j.DAYS) / 7;
            }
            if (i4 == 4) {
                return JulianCalendar.f82166s.f(julianCalendar2) - JulianCalendar.f82166s.f(julianCalendar);
            }
            throw new UnsupportedOperationException(this.f82175a.name());
        }
    }

    private static class g implements net.time4j.engine.u<JulianCalendar> {
        private g() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JulianCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (JulianCalendar) net.time4j.d0.y0(eVar.c()).d1(JulianCalendar.f82167t, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public JulianCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            int l4;
            net.time4j.engine.q<?> qVar = JulianCalendar.f82158k;
            if (!rVar.w(qVar)) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("譖\u0001"));
                return null;
            }
            net.time4j.history.j jVar = (net.time4j.history.j) rVar.r(qVar);
            int l5 = rVar.l(JulianCalendar.f82159l);
            if (l5 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("譗\u0001"));
                return null;
            }
            int l6 = rVar.l(JulianCalendar.f82160m);
            String s4 = ProtectedSandApp.s("識\u0001");
            if (l6 != Integer.MIN_VALUE && (l4 = rVar.l(JulianCalendar.f82161n)) != Integer.MIN_VALUE) {
                if (JulianCalendar.f82166s.c(jVar, l5, l6, l4)) {
                    return JulianCalendar.J0(jVar, l5, l6, l4);
                }
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
            }
            int l7 = rVar.l(JulianCalendar.f82162o);
            if (l7 != Integer.MIN_VALUE) {
                if (l7 > 0) {
                    int i4 = 1;
                    int l10 = jVar == net.time4j.history.j.AD ? l5 : net.time4j.base.c.l(1, l5);
                    int i5 = 0;
                    while (i4 <= 12) {
                        int G0 = JulianCalendar.G0(l10, i4) + i5;
                        if (l7 <= G0) {
                            return JulianCalendar.J0(jVar, l5, i4, l7 - i5);
                        }
                        i4++;
                        i5 = G0;
                    }
                }
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
            }
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(JulianCalendar julianCalendar, net.time4j.engine.d dVar) {
            return julianCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g();
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("譙\u0001"), zVar, locale);
        }

        g(a aVar) {
        }
    }

    private static class h implements net.time4j.engine.a0<JulianCalendar, Integer> {
        private h() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(JulianCalendar julianCalendar) {
            return JulianCalendar.f82161n;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(JulianCalendar julianCalendar) {
            return JulianCalendar.f82161n;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(JulianCalendar julianCalendar) {
            return 12;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(JulianCalendar julianCalendar) {
            return 1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(JulianCalendar julianCalendar) {
            return Integer.valueOf(julianCalendar.f82169c);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(JulianCalendar julianCalendar, Integer num) {
            int intValue;
            return num != null && (intValue = num.intValue()) >= 1 && intValue <= 12;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public JulianCalendar withValue(JulianCalendar julianCalendar, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("譚\u0001"));
            }
            int intValue = num.intValue();
            return new JulianCalendar(julianCalendar.f82168b, intValue, Math.min(julianCalendar.f82170d, JulianCalendar.G0(julianCalendar.f82168b, intValue)), null);
        }

        h(a aVar) {
        }
    }

    private static class i implements o<JulianCalendar> {
        private i() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.unmodifiableList(Arrays.asList(net.time4j.history.j.BC, net.time4j.history.j.AD));
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            int l4;
            if (jVar == net.time4j.history.j.AD) {
                l4 = i4;
            } else {
                if (jVar != net.time4j.history.j.BC) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("譝\u0001") + jVar);
                }
                l4 = net.time4j.base.c.l(1, i4);
            }
            if (i4 < 1 || i4 > 999999999 || i5 < 1 || i5 > 12) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("譛\u0001"), i4, ProtectedSandApp.s("譜\u0001"), i5));
            }
            return JulianCalendar.G0(l4, i5);
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            int l4;
            if (jVar == net.time4j.history.j.AD) {
                l4 = i4;
            } else {
                if (jVar != net.time4j.history.j.BC) {
                    return false;
                }
                l4 = net.time4j.base.c.l(1, i4);
            }
            return i4 >= 1 && i4 <= 999999999 && i5 >= 1 && i5 <= 12 && i6 >= 1 && i6 <= JulianCalendar.G0(l4, i5);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return f(new JulianCalendar(999999999, 12, 31, null));
        }

        @Override // net.time4j.engine.l
        public long g() {
            int i4 = 1;
            return f(new JulianCalendar(-999999998, i4, i4, null));
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            int l4;
            if (jVar == net.time4j.history.j.AD) {
                l4 = i4;
            } else {
                if (jVar != net.time4j.history.j.BC) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("譝\u0001") + jVar);
                }
                l4 = net.time4j.base.c.l(1, i4);
            }
            if (i4 < 1 || i4 > 999999999) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("譛\u0001"), i4));
            }
            return l4 % 4 == 0 ? 366 : 365;
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(JulianCalendar julianCalendar) {
            long j4 = julianCalendar.f82168b;
            int i4 = julianCalendar.f82169c;
            if (i4 < 3) {
                j4--;
                i4 += 12;
            }
            return ((((net.time4j.base.c.b(j4, 4) + (365 * j4)) + (((i4 + 1) * SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER) / 5)) - 123) + julianCalendar.f82170d) - 720200;
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public JulianCalendar e(long j4) {
            long j5;
            int i4;
            int i5;
            try {
                long f4 = net.time4j.base.c.f(j4, 720200L);
                long b5 = net.time4j.base.c.b(f4, 1461);
                int d5 = net.time4j.base.c.d(f4, 1461);
                if (d5 == 1460) {
                    j5 = (b5 + 1) * 4;
                    i5 = 2;
                    i4 = 29;
                } else {
                    int i6 = d5 / 365;
                    int i7 = d5 % 365;
                    j5 = (b5 * 4) + i6;
                    int i10 = ((i7 + 31) * 5) / SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER;
                    int i11 = i10 + 2;
                    int i12 = (i7 - (((i10 + 3) * SmsConstants.MAX_USER_DATA_SEPTETS_WITH_HEADER) / 5)) + 123;
                    if (i11 > 12) {
                        j5++;
                        int i13 = i10 - 10;
                        i4 = i12;
                        i5 = i13;
                    } else {
                        i4 = i12;
                        i5 = i11;
                    }
                }
                net.time4j.history.j jVar = j5 >= 1 ? net.time4j.history.j.AD : net.time4j.history.j.BC;
                if (j5 < 1) {
                    j5 = net.time4j.base.c.m(1L, j5);
                }
                return JulianCalendar.J0(jVar, net.time4j.base.c.g(j5), i5, i4);
            } catch (ArithmeticException e4) {
                throw new IllegalArgumentException(e4);
            }
        }

        i(a aVar) {
        }
    }

    public enum j implements net.time4j.engine.w {
        YEARS(3.15576E7d),
        MONTHS(2629800.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        j(double d5) {
            this.length = d5;
        }

        public int between(JulianCalendar julianCalendar, JulianCalendar julianCalendar2) {
            return net.time4j.base.c.g(julianCalendar.Y(julianCalendar2, this));
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
        net.time4j.history.d dVar = net.time4j.history.d.f83160s;
        net.time4j.engine.q<net.time4j.history.h> f4 = dVar.f();
        f82157j = f4;
        net.time4j.engine.q<net.time4j.history.j> i4 = dVar.i();
        f82158k = i4;
        net.time4j.format.v<Integer> L = dVar.L();
        f82159l = L;
        net.time4j.format.v<Integer> B = dVar.B();
        f82160m = B;
        net.time4j.engine.q<Integer> g4 = dVar.g();
        f82161n = g4;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("譢\u0001"), JulianCalendar.class, 1, 365, 'D');
        f82162o = jVar;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(JulianCalendar.class, z0());
        f82163p = kVar;
        r0<JulianCalendar> r0Var = new r0<>(JulianCalendar.class, g4, kVar);
        f82164q = r0Var;
        f82165r = r0Var;
        i iVar = new i();
        f82166s = iVar;
        j0.c f5 = j0.c.m(j.class, JulianCalendar.class, new g(), iVar).f(f4, new c()).f(i4, new d());
        e eVar = new e(0);
        j jVar2 = j.YEARS;
        j0.c g5 = f5.g(L, eVar, jVar2);
        h hVar = new h();
        j jVar3 = j.MONTHS;
        j0.c g6 = g5.g(B, hVar, jVar3);
        e eVar2 = new e(2);
        j jVar4 = j.DAYS;
        j0.c j4 = g6.g(g4, eVar2, jVar4).g(jVar, new e(3), jVar4).g(kVar, new s0(z0(), new a()), jVar4).f(r0Var, new r0.a(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(iVar, jVar)).j(jVar2, new f(jVar2), jVar2.getLength(), Collections.singleton(jVar3)).j(jVar3, new f(jVar3), jVar3.getLength(), Collections.singleton(jVar2));
        j jVar5 = j.WEEKS;
        f82167t = j4.j(jVar5, new f(jVar5), jVar5.getLength(), Collections.singleton(jVar4)).j(jVar4, new f(jVar4), jVar4.getLength(), Collections.singleton(jVar5)).h(new d.h(JulianCalendar.class, g4, jVar, z0())).c();
    }

    /* synthetic */ JulianCalendar(int i4, int i5, int i6, a aVar) {
        this(i4, i5, i6);
    }

    public static boolean E0(net.time4j.history.j jVar, int i4, int i5, int i6) {
        return f82166s.c(jVar, i4, i5, i6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int G0(int i4, int i5) {
        return i5 != 2 ? (i5 == 4 || i5 == 6 || i5 == 9 || i5 == 11) ? 30 : 31 : i4 % 4 == 0 ? 29 : 28;
    }

    public static JulianCalendar I0() {
        return (JulianCalendar) w0.g().f(f82167t);
    }

    public static JulianCalendar J0(net.time4j.history.j jVar, int i4, int i5, int i6) {
        if (jVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("譤\u0001"));
        }
        if (f82166s.c(jVar, i4, i5, i6)) {
            return jVar == net.time4j.history.j.AD ? new JulianCalendar(i4, i5, i6) : new JulianCalendar(net.time4j.base.c.l(1, i4), i5, i6);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("譣\u0001") + L0(jVar, i4, i5, i6));
    }

    public static JulianCalendar K0(net.time4j.history.j jVar, int i4, net.time4j.e0 e0Var, int i5) {
        return J0(jVar, i4, e0Var.getValue(), i5);
    }

    private static String L0(net.time4j.engine.j jVar, int i4, int i5, int i6) {
        StringBuilder a5 = androidx.fragment.app.a.a(32, ProtectedSandApp.s("譥\u0001"));
        a5.append(jVar.name());
        a5.append('-');
        String valueOf = String.valueOf(i4);
        for (int length = valueOf.length(); length < 4; length++) {
            a5.append('0');
        }
        a5.append(valueOf);
        a5.append('-');
        if (i5 < 10) {
            a5.append('0');
        }
        a5.append(i5);
        a5.append('-');
        if (i6 < 10) {
            a5.append('0');
        }
        a5.append(i6);
        return a5.toString();
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("警\u0001"));
    }

    public static net.time4j.engine.j0<j, JulianCalendar> v0() {
        return f82167t;
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public static i1 z0() {
        return i1.l(g1.SUNDAY, 1);
    }

    public net.time4j.history.j A0() {
        return this.f82168b >= 1 ? net.time4j.history.j.AD : net.time4j.history.j.BC;
    }

    public net.time4j.e0 B0() {
        return net.time4j.e0.valueOf(this.f82169c);
    }

    int C0() {
        return this.f82168b;
    }

    public boolean D0() {
        return this.f82168b % 4 == 0;
    }

    public int F0() {
        return G0(this.f82168b, this.f82169c);
    }

    public int H0() {
        return D0() ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<j, JulianCalendar> y() {
        return f82167t;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof JulianCalendar)) {
            return false;
        }
        JulianCalendar julianCalendar = (JulianCalendar) obj;
        return this.f82170d == julianCalendar.f82170d && this.f82169c == julianCalendar.f82169c && this.f82168b == julianCalendar.f82168b;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f82168b * 37) + (this.f82169c * 31) + (this.f82170d * 17);
    }

    public int o() {
        int i4 = this.f82168b;
        return i4 >= 1 ? i4 : net.time4j.base.c.l(1, i4);
    }

    public int t() {
        return this.f82170d;
    }

    public net.time4j.u<JulianCalendar> t0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        return L0(A0(), o(), this.f82169c, this.f82170d);
    }

    public net.time4j.u<JulianCalendar> u0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    protected JulianCalendar w0() {
        return this;
    }

    public g1 x0() {
        return g1.valueOf(net.time4j.base.c.d(f82166s.f(this) + 5, 7) + 1);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82167t;
    }

    public int y0() {
        return ((Integer) r(f82162o)).intValue();
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    private JulianCalendar(int i4, int i5, int i6) {
        this.f82168b = i4;
        this.f82169c = i5;
        this.f82170d = i6;
    }
}
