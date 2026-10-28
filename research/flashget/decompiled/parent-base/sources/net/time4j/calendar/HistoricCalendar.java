package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.time4j.calendar.d;
import net.time4j.calendar.r0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.k;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("historic")
/* loaded from: classes7.dex */
public final class HistoricCalendar extends net.time4j.engine.m<HistoricCalendar> implements net.time4j.format.h {

    /* renamed from: c, reason: collision with root package name */
    private static final int f82058c = 0;

    /* renamed from: d, reason: collision with root package name */
    private static final int f82059d = 2;

    /* renamed from: e, reason: collision with root package name */
    private static final int f82060e = 3;

    /* renamed from: f, reason: collision with root package name */
    private static final int f82061f = 4;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82062g = 5;

    /* renamed from: h, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<net.time4j.history.j> f82063h;

    /* renamed from: i, reason: collision with root package name */
    public static final net.time4j.engine.q<Integer> f82064i;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final net.time4j.format.v<Integer> f82065j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<net.time4j.e0, HistoricCalendar> f82066k;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, HistoricCalendar> f82067l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, HistoricCalendar> f82068m;

    /* renamed from: n, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, HistoricCalendar> f82069n;

    /* renamed from: o, reason: collision with root package name */
    private static final net.time4j.engine.q<Integer> f82070o;

    /* renamed from: p, reason: collision with root package name */
    private static final r0<HistoricCalendar> f82071p;

    /* renamed from: q, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<HistoricCalendar> f82072q;

    /* renamed from: r, reason: collision with root package name */
    private static final Map<String, net.time4j.engine.l<HistoricCalendar>> f82073r;

    /* renamed from: s, reason: collision with root package name */
    private static final net.time4j.engine.k<HistoricCalendar> f82074s;
    private static final long serialVersionUID = 7723641381724201009L;

    /* renamed from: b, reason: collision with root package name */
    private final transient net.time4j.history.h f82075b;
    private final net.time4j.l0 gregorian;
    private final net.time4j.history.d history;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82076c = 11;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82077b;

        public SPX() {
        }

        private HistoricCalendar a(ObjectInput objectInput) throws IOException {
            return (HistoricCalendar) net.time4j.l0.w1(objectInput.readLong(), net.time4j.engine.b0.UTC).j0(HistoricCalendar.class, objectInput.readUTF());
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            HistoricCalendar historicCalendar = (HistoricCalendar) this.f82077b;
            objectOutput.writeUTF(historicCalendar.t0().getVariant());
            objectOutput.writeLong(((net.time4j.l0) historicCalendar.r(net.time4j.l0.f83326q)).b());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82077b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 11) {
                throw new InvalidObjectException(ProtectedSandApp.s("諜\u0001"));
            }
            this.f82077b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(11);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82077b = obj;
        }
    }

    static class a extends net.time4j.calendar.service.i<net.time4j.e0, HistoricCalendar> {
        a(String str, Class cls, Class cls2, char c5, net.time4j.engine.v vVar, net.time4j.engine.v vVar2) {
            super(str, cls, cls2, c5, vVar, vVar2);
        }

        @Override // net.time4j.calendar.service.i
        protected String C(net.time4j.engine.d dVar) {
            return ProtectedSandApp.s("諝\u0001");
        }
    }

    static class b implements net.time4j.engine.t<HistoricCalendar, net.time4j.engine.l<HistoricCalendar>> {
        b() {
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.l<HistoricCalendar> apply(HistoricCalendar historicCalendar) {
            return historicCalendar.y().z(historicCalendar.getVariant());
        }
    }

    private static class c extends net.time4j.format.d<net.time4j.history.j> implements net.time4j.format.v<net.time4j.history.j> {
        private static final long serialVersionUID = -4614710504356171166L;

        c() {
            super(ProtectedSandApp.s("諞\u0001"));
        }

        private Object readResolve() throws ObjectStreamException {
            return HistoricCalendar.f82063h;
        }

        @Override // net.time4j.format.v
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            net.time4j.history.d u02 = HistoricCalendar.u0(dVar);
            if (u02 == null) {
                return null;
            }
            return (net.time4j.history.j) net.time4j.history.j.class.cast(((net.time4j.format.v) net.time4j.format.v.class.cast(u02.i())).parse(charSequence, parsePosition, dVar));
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'G';
        }

        @Override // net.time4j.engine.q
        public Class<net.time4j.history.j> getType() {
            return net.time4j.history.j.class;
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
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            if (pVar instanceof HistoricCalendar) {
                HistoricCalendar historicCalendar = (HistoricCalendar) HistoricCalendar.class.cast(pVar);
                ((net.time4j.format.v) net.time4j.format.v.class.cast(historicCalendar.history.i())).print(historicCalendar, appendable, dVar);
            } else {
                throw new ChronoException(ProtectedSandApp.s("諟\u0001") + pVar);
            }
        }

        @Override // net.time4j.engine.q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j getDefaultMaximum() {
            return net.time4j.history.j.AD;
        }

        @Override // net.time4j.engine.q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j getDefaultMinimum() {
            return net.time4j.history.j.BC;
        }
    }

    private static class d implements net.time4j.engine.a0<HistoricCalendar, net.time4j.history.j> {
        private d() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HistoricCalendar historicCalendar) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("諠\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HistoricCalendar historicCalendar) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("諠\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j getMaximum(HistoricCalendar historicCalendar) {
            net.time4j.history.j s02 = historicCalendar.s0();
            return s02 == net.time4j.history.j.BC ? net.time4j.history.j.AD : s02;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j getMinimum(HistoricCalendar historicCalendar) {
            net.time4j.history.j s02 = historicCalendar.s0();
            return s02 == net.time4j.history.j.AD ? net.time4j.history.j.BC : s02;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.history.j getValue(HistoricCalendar historicCalendar) {
            return historicCalendar.s0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HistoricCalendar historicCalendar, net.time4j.history.j jVar) {
            return jVar != null && historicCalendar.f82075b.c() == jVar;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar withValue(HistoricCalendar historicCalendar, net.time4j.history.j jVar, boolean z4) {
            if (jVar == null || historicCalendar.f82075b.c() != jVar) {
                throw new IllegalArgumentException(jVar.name());
            }
            return historicCalendar;
        }

        d(a aVar) {
        }
    }

    private static class e implements net.time4j.engine.a0<HistoricCalendar, net.time4j.l0> {
        private e() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HistoricCalendar historicCalendar) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("諡\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HistoricCalendar historicCalendar) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("諡\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.l0 getMaximum(HistoricCalendar historicCalendar) {
            return historicCalendar.history.d((net.time4j.history.h) historicCalendar.gregorian.g(historicCalendar.history.f()));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.l0 getMinimum(HistoricCalendar historicCalendar) {
            return historicCalendar.history.d((net.time4j.history.h) historicCalendar.gregorian.i(historicCalendar.history.f()));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.l0 getValue(HistoricCalendar historicCalendar) {
            return historicCalendar.gregorian;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HistoricCalendar historicCalendar, net.time4j.l0 l0Var) {
            if (l0Var == null) {
                return false;
            }
            try {
                historicCalendar.history.e(l0Var);
                return true;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar withValue(HistoricCalendar historicCalendar, net.time4j.l0 l0Var, boolean z4) {
            return new HistoricCalendar(historicCalendar.history, l0Var, (a) null);
        }

        e(a aVar) {
        }
    }

    private static class f implements net.time4j.engine.e0<HistoricCalendar> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82078b;

        f(int i4) {
            this.f82078b = i4;
        }

        private net.time4j.engine.q<Integer> f(HistoricCalendar historicCalendar) {
            int i4 = this.f82078b;
            if (i4 == 0) {
                return historicCalendar.history.L();
            }
            if (i4 == 2) {
                return historicCalendar.history.g();
            }
            if (i4 == 3) {
                return historicCalendar.history.h();
            }
            if (i4 == 4) {
                return historicCalendar.history.b();
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("諢\u0001") + this.f82078b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HistoricCalendar historicCalendar) {
            int i4 = this.f82078b;
            if (i4 == 2 || i4 == 3) {
                return null;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("諣\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HistoricCalendar historicCalendar) {
            int i4 = this.f82078b;
            if (i4 == 2 || i4 == 3) {
                return null;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("諣\u0001"));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int d(HistoricCalendar historicCalendar) {
            int i4 = this.f82078b;
            if (i4 == 0) {
                return historicCalendar.f82075b.e();
            }
            if (i4 == 2) {
                return historicCalendar.f82075b.b();
            }
            if (i4 != 5) {
                return historicCalendar.l(f(historicCalendar));
            }
            int b5 = historicCalendar.f82075b.b();
            net.time4j.history.j c5 = historicCalendar.f82075b.c();
            int e4 = historicCalendar.f82075b.e();
            int d5 = historicCalendar.f82075b.d();
            int i5 = 0;
            for (int i6 = 1; i6 < b5; i6++) {
                if (!historicCalendar.history.A(net.time4j.history.h.g(c5, e4, d5, i6))) {
                    i5++;
                }
            }
            return b5 - i5;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(HistoricCalendar historicCalendar) {
            if (this.f82078b != 5) {
                return (Integer) historicCalendar.g(f(historicCalendar));
            }
            int intValue = ((Integer) historicCalendar.g(historicCalendar.history.g())).intValue();
            net.time4j.history.j c5 = historicCalendar.f82075b.c();
            int e4 = historicCalendar.f82075b.e();
            int d5 = historicCalendar.f82075b.d();
            int i4 = 0;
            for (int i5 = 1; i5 <= intValue; i5++) {
                if (!historicCalendar.history.A(net.time4j.history.h.g(c5, e4, d5, i5))) {
                    i4++;
                }
            }
            return Integer.valueOf(intValue - i4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(HistoricCalendar historicCalendar) {
            if (this.f82078b == 5) {
                int b5 = historicCalendar.f82075b.b();
                net.time4j.history.j c5 = historicCalendar.f82075b.c();
                int e4 = historicCalendar.f82075b.e();
                int d5 = historicCalendar.f82075b.d();
                for (int i4 = 1; i4 <= b5; i4++) {
                    if (historicCalendar.history.A(net.time4j.history.h.g(c5, e4, d5, i4))) {
                        return Integer.valueOf(i4);
                    }
                }
            }
            return (Integer) historicCalendar.i(f(historicCalendar));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getValue(HistoricCalendar historicCalendar) {
            return Integer.valueOf(d(historicCalendar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean e(HistoricCalendar historicCalendar, int i4) {
            if (this.f82078b == 5) {
                return false;
            }
            return historicCalendar.C(f(historicCalendar), i4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean j(HistoricCalendar historicCalendar, Integer num) {
            if (num == null || this.f82078b == 5) {
                return false;
            }
            return historicCalendar.G(f(historicCalendar), num);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.e0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar a(HistoricCalendar historicCalendar, int i4, boolean z4) {
            return (HistoricCalendar) historicCalendar.K(f(historicCalendar), i4);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar withValue(HistoricCalendar historicCalendar, Integer num, boolean z4) {
            return (HistoricCalendar) historicCalendar.M(f(historicCalendar), num);
        }
    }

    private static class g implements net.time4j.engine.u<HistoricCalendar> {
        private g() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r5v1, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            net.time4j.tz.k G;
            String str = (String) dVar.b(net.time4j.format.a.f82798t, "");
            if (str.isEmpty()) {
                return null;
            }
            net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
            if (dVar.c(cVar)) {
                G = (net.time4j.tz.k) dVar.a(cVar);
            } else {
                if (!((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isLax()) {
                    return null;
                }
                G = net.time4j.tz.l.e0().G();
            }
            return (HistoricCalendar) net.time4j.d0.y0(eVar.c()).c1(HistoricCalendar.f82074s, str, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            net.time4j.history.d u02 = HistoricCalendar.u0(dVar);
            a aVar = null;
            if (u02 == null) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("諤\u0001"));
                return null;
            }
            net.time4j.engine.q<?> qVar = HistoricCalendar.f82063h;
            if (rVar.w(qVar)) {
                net.time4j.history.j jVar = (net.time4j.history.j) rVar.r(qVar);
                rVar.M(qVar, null);
                rVar.M(u02.i(), jVar);
            }
            net.time4j.format.v<Integer> vVar = HistoricCalendar.f82065j;
            if (rVar.w(vVar)) {
                int l4 = rVar.l(vVar);
                rVar.M(vVar, null);
                rVar.K(u02.L(), l4);
            }
            o0<Integer, HistoricCalendar> o0Var = HistoricCalendar.f82068m;
            if (rVar.w(o0Var)) {
                int l5 = rVar.l(o0Var);
                rVar.M(o0Var, null);
                rVar.K(u02.h(), l5);
            } else {
                o0<net.time4j.e0, HistoricCalendar> o0Var2 = HistoricCalendar.f82066k;
                if (rVar.w(o0Var2)) {
                    net.time4j.e0 e0Var = (net.time4j.e0) rVar.r(o0Var2);
                    rVar.M(o0Var2, null);
                    rVar.K(u02.B(), e0Var.getValue());
                }
                o0<Integer, HistoricCalendar> o0Var3 = HistoricCalendar.f82067l;
                if (rVar.w(o0Var3)) {
                    int l6 = rVar.l(o0Var3);
                    rVar.M(o0Var3, null);
                    rVar.K(u02.g(), l6);
                }
            }
            net.time4j.engine.r<?> f4 = new net.time4j.i18n.b().f(rVar, u02, dVar);
            net.time4j.f fVar = net.time4j.l0.f83326q;
            if (f4.w(fVar)) {
                return new HistoricCalendar(u02, (net.time4j.l0) f4.r(fVar), aVar);
            }
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(HistoricCalendar historicCalendar, net.time4j.engine.d dVar) {
            return historicCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g();
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("諥\u0001"), zVar, locale);
        }

        g(a aVar) {
        }
    }

    private static class h implements net.time4j.engine.v<HistoricCalendar> {

        /* renamed from: b, reason: collision with root package name */
        private final boolean f82079b;

        h(boolean z4) {
            this.f82079b = z4;
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar apply(HistoricCalendar historicCalendar) {
            net.time4j.history.j c5 = historicCalendar.f82075b.c();
            int e4 = historicCalendar.f82075b.e();
            int d5 = historicCalendar.f82075b.d() + (this.f82079b ? -1 : 1);
            int b5 = historicCalendar.f82075b.b();
            if (d5 > 12) {
                if (c5 == net.time4j.history.j.BC) {
                    e4--;
                    if (e4 == 0) {
                        c5 = net.time4j.history.j.AD;
                        e4 = 1;
                        d5 = 1;
                    }
                } else {
                    e4++;
                }
                d5 = 1;
            } else if (d5 < 1) {
                net.time4j.history.j jVar = net.time4j.history.j.BC;
                if (c5 == jVar) {
                    e4++;
                } else {
                    e4--;
                    if (e4 == 0 && c5 == net.time4j.history.j.AD) {
                        c5 = jVar;
                        e4 = 1;
                    }
                }
                d5 = 12;
            }
            net.time4j.history.h g4 = net.time4j.history.h.g(c5, e4, d5, b5);
            int i4 = b5;
            while (i4 > 1 && !historicCalendar.history.A(g4)) {
                i4--;
                g4 = net.time4j.history.h.g(c5, e4, d5, i4);
            }
            if (i4 == 1) {
                while (b5 <= 31 && !historicCalendar.history.A(g4)) {
                    b5++;
                    g4 = net.time4j.history.h.g(c5, e4, d5, b5);
                }
            }
            return new HistoricCalendar(historicCalendar.history, g4, (a) null);
        }
    }

    private static class i implements net.time4j.engine.a0<HistoricCalendar, net.time4j.e0> {
        private i() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HistoricCalendar historicCalendar) {
            return HistoricCalendar.f82067l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HistoricCalendar historicCalendar) {
            return HistoricCalendar.f82067l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.e0 getMaximum(HistoricCalendar historicCalendar) {
            return net.time4j.e0.valueOf(((Integer) historicCalendar.g(historicCalendar.history.B())).intValue());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.e0 getMinimum(HistoricCalendar historicCalendar) {
            return net.time4j.e0.valueOf(((Integer) historicCalendar.i(historicCalendar.history.B())).intValue());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.e0 getValue(HistoricCalendar historicCalendar) {
            return historicCalendar.v0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HistoricCalendar historicCalendar, net.time4j.e0 e0Var) {
            if (e0Var == null) {
                return false;
            }
            return historicCalendar.C(historicCalendar.history.B(), e0Var.getValue());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar withValue(HistoricCalendar historicCalendar, net.time4j.e0 e0Var, boolean z4) {
            return (HistoricCalendar) historicCalendar.K(historicCalendar.history.B(), e0Var.getValue());
        }

        i(a aVar) {
        }
    }

    private static class k implements net.time4j.engine.l<HistoricCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final net.time4j.history.d f82082a;

        k(net.time4j.history.d dVar) {
            this.f82082a = dVar;
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            ArrayList arrayList = new ArrayList();
            for (net.time4j.history.j jVar : net.time4j.history.j.values()) {
                arrayList.add(jVar);
            }
            return Collections.unmodifiableList(arrayList);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return this.f82082a.d((net.time4j.history.h) net.time4j.l0.r1(2000, 1, 1).g(this.f82082a.f())).b();
        }

        @Override // net.time4j.engine.l
        public long g() {
            return this.f82082a.d((net.time4j.history.h) net.time4j.l0.r1(2000, 1, 1).i(this.f82082a.f())).b();
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(HistoricCalendar historicCalendar) {
            return historicCalendar.gregorian.b();
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HistoricCalendar e(long j4) {
            return new HistoricCalendar(this.f82082a, net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC), (a) null);
        }
    }

    private static class l extends ConcurrentHashMap<String, net.time4j.engine.l<HistoricCalendar>> {
        private l() {
        }

        @Override // java.util.concurrent.ConcurrentHashMap, java.util.AbstractMap, java.util.Map
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.l<HistoricCalendar> get(Object obj) {
            net.time4j.engine.l<HistoricCalendar> lVar = (net.time4j.engine.l) super.get(obj);
            if (lVar != null) {
                return lVar;
            }
            String obj2 = obj.toString();
            try {
                k kVar = new k(net.time4j.history.d.j(obj2));
                net.time4j.engine.l<HistoricCalendar> putIfAbsent = putIfAbsent(obj2, kVar);
                return putIfAbsent != null ? putIfAbsent : kVar;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        l(a aVar) {
        }
    }

    private static class m extends j implements pe.a {
        private static final long serialVersionUID = 6400379438892131807L;

        /* synthetic */ m(a aVar) {
            this();
        }

        private Object readResolve() throws ObjectStreamException {
            return HistoricCalendar.f82065j;
        }

        @Override // net.time4j.format.v
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public Integer parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            net.time4j.history.d u02 = HistoricCalendar.u0(dVar);
            if (u02 == null) {
                return null;
            }
            return u02.L().parse(charSequence, parsePosition, dVar);
        }

        @Override // pe.a
        public void T(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar, net.time4j.format.j jVar, char c5, int i4, int i5) throws IOException, ChronoException {
            if (pVar instanceof HistoricCalendar) {
                ((pe.a) pe.a.class.cast(((HistoricCalendar) HistoricCalendar.class.cast(pVar)).history.L())).T(pVar, appendable, dVar, jVar, c5, i4, i5);
            } else {
                throw new ChronoException(ProtectedSandApp.s("諫\u0001") + pVar);
            }
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'y';
        }

        @Override // net.time4j.format.v
        public void print(net.time4j.engine.p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            if (pVar instanceof HistoricCalendar) {
                HistoricCalendar historicCalendar = (HistoricCalendar) HistoricCalendar.class.cast(pVar);
                historicCalendar.history.L().print(historicCalendar, appendable, dVar);
            } else {
                throw new ChronoException(ProtectedSandApp.s("諫\u0001") + pVar);
            }
        }

        @Override // pe.a
        public Integer x(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar, net.time4j.engine.r<?> rVar) {
            net.time4j.history.d u02 = HistoricCalendar.u0(dVar);
            if (u02 == null) {
                return null;
            }
            return ((pe.a) pe.a.class.cast(u02.L())).x(charSequence, parsePosition, dVar, rVar);
        }

        private m() {
            super(ProtectedSandApp.s("諪\u0001"), 1, 999999999, null);
        }
    }

    static {
        c cVar = new c();
        f82063h = cVar;
        a aVar = null;
        j jVar = new j(ProtectedSandApp.s("諬\u0001"), net.time4j.history.d.D().b().getDefaultMinimum().intValue(), net.time4j.history.d.D().b().getDefaultMaximum().intValue(), aVar);
        f82064i = jVar;
        m mVar = new m(aVar);
        f82065j = mVar;
        a aVar2 = new a(ProtectedSandApp.s("諭\u0001"), HistoricCalendar.class, net.time4j.e0.class, 'M', new h(true), new h(false));
        f82066k = aVar2;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("諮\u0001"), HistoricCalendar.class, 1, 31, 'd');
        f82067l = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("諯\u0001"), HistoricCalendar.class, 1, 365, 'D');
        f82068m = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(HistoricCalendar.class, r0());
        f82069n = kVar;
        j jVar4 = new j(ProtectedSandApp.s("諰\u0001"), 1, 31, aVar);
        f82070o = jVar4;
        r0<HistoricCalendar> r0Var = new r0<>(HistoricCalendar.class, jVar4, kVar);
        f82071p = r0Var;
        f82072q = r0Var;
        l lVar = new l();
        net.time4j.history.d D = net.time4j.history.d.D();
        lVar.put(D.getVariant(), new k(D));
        f82073r = lVar;
        f82074s = k.b.i(HistoricCalendar.class, new g(), lVar).f(net.time4j.l0.f83326q, new e()).f(cVar, new d()).f(jVar, new f(4)).f(mVar, new f(0)).f(aVar2, new i()).f(net.time4j.calendar.d.f82409a, new l0(lVar, jVar3)).f(jVar4, new f(5)).f(jVar2, new f(2)).f(jVar3, new f(3)).f(kVar, new s0(r0(), new b())).f(r0Var, new r0.a(r0Var)).g(new d.h(HistoricCalendar.class, jVar2, jVar3, r0())).c();
    }

    /* synthetic */ HistoricCalendar(net.time4j.history.d dVar, net.time4j.l0 l0Var, a aVar) {
        this(dVar, l0Var);
    }

    private static HistoricCalendar A0(net.time4j.history.d dVar, net.time4j.history.h hVar) {
        if (dVar.A(hVar)) {
            return new HistoricCalendar(dVar, hVar);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("諱\u0001") + hVar + ProtectedSandApp.s("諲\u0001") + dVar);
    }

    public static HistoricCalendar B0(net.time4j.history.d dVar, net.time4j.history.j jVar, int i4, int i5, int i6) {
        return C0(dVar, jVar, i4, net.time4j.history.p.DUAL_DATING, i5, i6);
    }

    public static HistoricCalendar C0(net.time4j.history.d dVar, net.time4j.history.j jVar, int i4, net.time4j.history.p pVar, int i5, int i6) {
        return A0(dVar, net.time4j.history.h.h(jVar, i4, i5, i6, pVar, dVar.v()));
    }

    public static net.time4j.engine.k<HistoricCalendar> l0() {
        return f82074s;
    }

    public static i1 r0() {
        return i1.l(g1.SUNDAY, 1);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("諳\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static net.time4j.history.d u0(net.time4j.engine.d dVar) {
        net.time4j.engine.c<net.time4j.history.d> cVar = net.time4j.history.internal.a.f83203a;
        if (dVar.c(cVar)) {
            return (net.time4j.history.d) dVar.a(cVar);
        }
        if (((String) dVar.b(net.time4j.format.a.f82780b, ProtectedSandApp.s("諴\u0001"))).equals(ProtectedSandApp.s("諵\u0001"))) {
            net.time4j.engine.c<String> cVar2 = net.time4j.format.a.f82798t;
            if (dVar.c(cVar2)) {
                return net.time4j.history.d.j((String) dVar.a(cVar2));
            }
        }
        if (((net.time4j.format.g) dVar.b(net.time4j.format.a.f82784f, net.time4j.format.g.SMART)).isStrict()) {
            return null;
        }
        return net.time4j.history.d.C((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT));
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public static HistoricCalendar z0(net.time4j.history.d dVar) {
        return (HistoricCalendar) w0.g().d(f82074s, dVar, net.time4j.engine.g0.f82720a).m();
    }

    public HistoricCalendar D0() {
        return A0(this.history, this.history.m(this.f82075b.c(), o()));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m
    /* renamed from: R */
    public net.time4j.engine.k<HistoricCalendar> y() {
        return f82074s;
    }

    @Override // net.time4j.engine.m
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HistoricCalendar)) {
            return false;
        }
        HistoricCalendar historicCalendar = (HistoricCalendar) obj;
        return this.gregorian.equals(historicCalendar.gregorian) && this.history.equals(historicCalendar.history) && this.f82075b.equals(historicCalendar.f82075b);
    }

    @Override // net.time4j.engine.q0
    public String getVariant() {
        return this.history.getVariant();
    }

    @Override // net.time4j.engine.m
    public int hashCode() {
        return (this.history.hashCode() * 31) + (this.gregorian.hashCode() * 17);
    }

    public net.time4j.u<HistoricCalendar> j0(net.time4j.m0 m0Var) {
        return net.time4j.u.f(this, m0Var);
    }

    public net.time4j.u<HistoricCalendar> k0(int i4, int i5) {
        return net.time4j.u.f(this, net.time4j.m0.b1(i4, i5));
    }

    public int m0() {
        return l(this.history.b());
    }

    protected HistoricCalendar n0() {
        return this;
    }

    public int o() {
        return this.f82075b.f(this.history.v());
    }

    public g1 o0() {
        return g1.valueOf(net.time4j.base.c.d(this.gregorian.b() + 5, 7) + 1);
    }

    public int p0() {
        return ((Integer) r(f82068m)).intValue();
    }

    public net.time4j.history.j s0() {
        return this.f82075b.c();
    }

    public int t() {
        return this.f82075b.b();
    }

    public net.time4j.history.d t0() {
        return this.history;
    }

    @Override // net.time4j.engine.m
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.f82075b);
        sb.append('[');
        sb.append(this.history);
        sb.append(']');
        return sb.toString();
    }

    public net.time4j.e0 v0() {
        return net.time4j.e0.valueOf(this.f82075b.d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int w0() {
        try {
            o0<Integer, HistoricCalendar> o0Var = f82067l;
            return ((int) net.time4j.engine.i.b(((HistoricCalendar) K(o0Var, ((Integer) i(o0Var)).intValue())).gregorian, ((HistoricCalendar) K(o0Var, ((Integer) g(o0Var)).intValue())).gregorian).d()) + 1;
        } catch (RuntimeException unused) {
            return -1;
        }
    }

    public int x0() {
        return this.history.u(this.f82075b.c(), o());
    }

    @Override // net.time4j.engine.m, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82074s;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HistoricCalendar y0() {
        return (HistoricCalendar) N(f82067l.f());
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    /* synthetic */ HistoricCalendar(net.time4j.history.d dVar, net.time4j.history.h hVar, a aVar) {
        this(dVar, hVar);
    }

    private static class j extends net.time4j.format.d<Integer> {
        private static final long serialVersionUID = 3808762239145701486L;

        /* renamed from: c, reason: collision with root package name */
        private final transient Integer f82080c;

        /* renamed from: d, reason: collision with root package name */
        private final transient Integer f82081d;

        private j(String str, int i4, int i5) {
            super(str);
            this.f82080c = Integer.valueOf(i4);
            this.f82081d = Integer.valueOf(i5);
        }

        private Object readResolve() throws ObjectStreamException {
            String name = name();
            if (name.equals(ProtectedSandApp.s("諦\u0001"))) {
                return HistoricCalendar.f82070o;
            }
            if (name.equals(ProtectedSandApp.s("諧\u0001"))) {
                return HistoricCalendar.f82064i;
            }
            throw new InvalidObjectException(ProtectedSandApp.s("諨\u0001").concat(name));
        }

        @Override // net.time4j.engine.q
        public Class<Integer> getType() {
            return Integer.class;
        }

        @Override // net.time4j.engine.q
        public boolean isDateElement() {
            return true;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // net.time4j.engine.e
        protected boolean k(net.time4j.engine.e<?> eVar) {
            j jVar = (j) eVar;
            return this.f82080c.equals(jVar.f82080c) && this.f82081d.equals(jVar.f82081d);
        }

        @Override // net.time4j.engine.q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMaximum() {
            return this.f82081d;
        }

        @Override // net.time4j.engine.q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMinimum() {
            return this.f82080c;
        }

        /* synthetic */ j(String str, int i4, int i5, a aVar) {
            this(str, i4, i5);
        }
    }

    private HistoricCalendar(net.time4j.history.d dVar, net.time4j.history.h hVar) {
        this.gregorian = dVar.d(hVar);
        this.f82075b = hVar;
        this.history = dVar;
    }

    private HistoricCalendar(net.time4j.history.d dVar, net.time4j.l0 l0Var) {
        this.f82075b = dVar.e(l0Var);
        this.gregorian = l0Var;
        this.history = dVar;
    }
}
