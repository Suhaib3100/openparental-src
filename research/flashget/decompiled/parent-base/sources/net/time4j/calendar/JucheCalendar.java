package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
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

@net.time4j.format.c("juche")
/* loaded from: classes7.dex */
public final class JucheCalendar extends net.time4j.engine.n<net.time4j.h, JucheCalendar> implements net.time4j.format.h {

    /* renamed from: b, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<c0> f82137b;

    /* renamed from: c, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, JucheCalendar> f82138c;

    /* renamed from: d, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<net.time4j.e0, JucheCalendar> f82139d;

    /* renamed from: e, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, JucheCalendar> f82140e;

    /* renamed from: f, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, JucheCalendar> f82141f;

    /* renamed from: g, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, JucheCalendar> f82142g;

    /* renamed from: h, reason: collision with root package name */
    private static final r0<JucheCalendar> f82143h;

    /* renamed from: i, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<JucheCalendar> f82144i;

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Object, net.time4j.engine.q<?>> f82145j;

    /* renamed from: k, reason: collision with root package name */
    private static final o<JucheCalendar> f82146k;

    /* renamed from: l, reason: collision with root package name */
    private static final net.time4j.engine.j0<net.time4j.h, JucheCalendar> f82147l;
    private static final long serialVersionUID = 757676060690932159L;
    private final net.time4j.l0 iso;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82148c = 17;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82149b;

        public SPX() {
        }

        private JucheCalendar a(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            return new JucheCalendar((net.time4j.l0) net.time4j.l0.class.cast(objectInput.readObject()));
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeObject(((JucheCalendar) this.f82149b).J0());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82149b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            if (objectInput.readByte() != 17) {
                throw new InvalidObjectException(ProtectedSandApp.s("譁\u0001"));
            }
            this.f82149b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(17);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82149b = obj;
        }
    }

    static class a implements net.time4j.engine.t<JucheCalendar, net.time4j.engine.l<JucheCalendar>> {
        a() {
        }

        public net.time4j.engine.l<JucheCalendar> a(JucheCalendar jucheCalendar) {
            return JucheCalendar.f82146k;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<JucheCalendar> apply(JucheCalendar jucheCalendar) {
            return JucheCalendar.f82146k;
        }
    }

    private static class b<V extends Comparable<V>> implements net.time4j.engine.a0<JucheCalendar, V> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<V> f82150b;

        private b(net.time4j.engine.q<V> qVar) {
            this.f82150b = qVar;
        }

        static <V extends Comparable<V>> b<V> j(net.time4j.engine.q<V> qVar) {
            return new b<>(qVar);
        }

        private static int k(Object obj) {
            return ((Integer) Integer.class.cast(obj)).intValue();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(JucheCalendar jucheCalendar) {
            return (net.time4j.engine.q) JucheCalendar.f82145j.get(this.f82150b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(JucheCalendar jucheCalendar) {
            return (net.time4j.engine.q) JucheCalendar.f82145j.get(this.f82150b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public V getMaximum(JucheCalendar jucheCalendar) {
            Object g4;
            net.time4j.engine.q<V> qVar = this.f82150b;
            if (qVar == JucheCalendar.f82137b) {
                g4 = c0.JUCHE;
            } else if (qVar.equals(JucheCalendar.f82138c)) {
                g4 = 999998088;
            } else if (this.f82150b.equals(JucheCalendar.f82139d)) {
                g4 = net.time4j.e0.DECEMBER;
            } else if (this.f82150b.equals(JucheCalendar.f82140e)) {
                g4 = jucheCalendar.iso.g(net.time4j.l0.f83332w);
            } else {
                if (!this.f82150b.equals(JucheCalendar.f82141f)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82150b, new StringBuilder(ProtectedSandApp.s("譂\u0001"))));
                }
                g4 = jucheCalendar.iso.g(net.time4j.l0.f83334y);
            }
            return this.f82150b.getType().cast(g4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public V getMinimum(JucheCalendar jucheCalendar) {
            Object obj;
            net.time4j.engine.q<V> qVar = this.f82150b;
            if (qVar == JucheCalendar.f82137b) {
                obj = c0.JUCHE;
            } else if (Integer.class.isAssignableFrom(qVar.getType())) {
                obj = 1;
            } else {
                if (!this.f82150b.equals(JucheCalendar.f82139d)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82150b, new StringBuilder(ProtectedSandApp.s("譂\u0001"))));
                }
                obj = net.time4j.e0.JANUARY;
            }
            return this.f82150b.getType().cast(obj);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public V getValue(JucheCalendar jucheCalendar) {
            Object valueOf;
            net.time4j.engine.q<V> qVar = this.f82150b;
            if (qVar == JucheCalendar.f82137b) {
                valueOf = c0.JUCHE;
            } else if (qVar.equals(JucheCalendar.f82138c)) {
                valueOf = Integer.valueOf(jucheCalendar.o());
            } else if (this.f82150b.equals(JucheCalendar.f82139d)) {
                valueOf = jucheCalendar.A0();
            } else if (this.f82150b.equals(JucheCalendar.f82140e)) {
                valueOf = Integer.valueOf(jucheCalendar.t());
            } else {
                if (!this.f82150b.equals(JucheCalendar.f82141f)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82150b, new StringBuilder(ProtectedSandApp.s("譂\u0001"))));
                }
                valueOf = Integer.valueOf(jucheCalendar.x0());
            }
            return this.f82150b.getType().cast(valueOf);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(JucheCalendar jucheCalendar, V v4) {
            if (v4 == null) {
                return false;
            }
            if (this.f82150b == JucheCalendar.f82137b) {
                return true;
            }
            return getMinimum(jucheCalendar).compareTo(v4) <= 0 && v4.compareTo(getMaximum(jucheCalendar)) <= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public JucheCalendar withValue(JucheCalendar jucheCalendar, V v4, boolean z4) {
            if (!j(jucheCalendar, v4)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("譃\u0001") + v4);
            }
            net.time4j.engine.q<V> qVar = this.f82150b;
            if (qVar == JucheCalendar.f82137b) {
                return jucheCalendar;
            }
            if (qVar.equals(JucheCalendar.f82138c)) {
                JucheCalendar H0 = JucheCalendar.H0(k(v4), jucheCalendar.A0(), 1);
                return (JucheCalendar) H0.K(JucheCalendar.f82140e, Math.min(jucheCalendar.t(), H0.D0()));
            }
            if (this.f82150b.equals(JucheCalendar.f82139d)) {
                return new JucheCalendar((net.time4j.l0) jucheCalendar.iso.M(net.time4j.l0.f83330u, net.time4j.e0.class.cast(v4)));
            }
            if (this.f82150b.equals(JucheCalendar.f82140e)) {
                return new JucheCalendar((net.time4j.l0) jucheCalendar.iso.K(net.time4j.l0.f83332w, k(v4)));
            }
            if (this.f82150b.equals(JucheCalendar.f82141f)) {
                return new JucheCalendar((net.time4j.l0) jucheCalendar.iso.K(net.time4j.l0.f83334y, k(v4)));
            }
            throw new ChronoException(net.time4j.g0.a(this.f82150b, new StringBuilder(ProtectedSandApp.s("譂\u0001"))));
        }
    }

    private static class c implements net.time4j.engine.o0<JucheCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final net.time4j.h f82151a;

        c(net.time4j.h hVar) {
            this.f82151a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public JucheCalendar b(JucheCalendar jucheCalendar, long j4) {
            return new JucheCalendar((net.time4j.l0) jucheCalendar.iso.W(j4, this.f82151a));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(JucheCalendar jucheCalendar, JucheCalendar jucheCalendar2) {
            return this.f82151a.between(jucheCalendar.iso, jucheCalendar2.iso);
        }
    }

    private static class d implements net.time4j.engine.u<JucheCalendar> {
        private d() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public JucheCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (JucheCalendar) net.time4j.d0.y0(eVar.c()).d1(JucheCalendar.f82147l, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public JucheCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            net.time4j.f fVar = net.time4j.l0.f83326q;
            if (rVar.w(fVar)) {
                return new JucheCalendar((net.time4j.l0) rVar.r(fVar));
            }
            int l4 = rVar.l(JucheCalendar.f82138c);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("譄\u0001"));
                return null;
            }
            int e4 = net.time4j.base.c.e(l4, 1911);
            o0<net.time4j.e0, JucheCalendar> o0Var = JucheCalendar.f82139d;
            boolean w4 = rVar.w(o0Var);
            String s4 = ProtectedSandApp.s("譅\u0001");
            if (w4) {
                int value = ((net.time4j.e0) rVar.r(o0Var)).getValue();
                int l5 = rVar.l(JucheCalendar.f82140e);
                if (l5 != Integer.MIN_VALUE) {
                    if (JucheCalendar.f82146k.c(c0.JUCHE, l4, value, l5)) {
                        return JucheCalendar.G0(l4, value, l5);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            } else {
                int l6 = rVar.l(JucheCalendar.f82141f);
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 > 0) {
                        int i4 = 1;
                        int i5 = 0;
                        while (i4 <= 12) {
                            int d5 = net.time4j.base.b.d(e4, i4) + i5;
                            if (l6 <= d5) {
                                return JucheCalendar.G0(l4, i4, l6 - i5);
                            }
                            i4++;
                            i5 = d5;
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
        public net.time4j.engine.p k(JucheCalendar jucheCalendar, net.time4j.engine.d dVar) {
            return jucheCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g() - 1911;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("譆\u0001"), zVar, locale);
        }

        d(a aVar) {
        }
    }

    private static class e implements o<JucheCalendar> {
        private e() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(c0.JUCHE);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            try {
                return net.time4j.l0.r1(JucheCalendar.n0(i4), i5, 1).l1();
            } catch (RuntimeException e4) {
                throw new IllegalArgumentException(e4.getMessage(), e4);
            }
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            try {
                if (!(jVar instanceof c0)) {
                    return false;
                }
                int n02 = JucheCalendar.n0(i4);
                if (i4 < 1 || n02 > 999999999 || i5 < 1 || i5 > 12 || i6 < 1) {
                    return false;
                }
                return i6 <= net.time4j.base.b.d(n02, i5);
            } catch (ArithmeticException unused) {
                return false;
            }
        }

        @Override // net.time4j.engine.l
        public long d() {
            return net.time4j.l0.T0().y().d();
        }

        @Override // net.time4j.engine.l
        public long g() {
            return -21915L;
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            try {
                return net.time4j.l0.v1(JucheCalendar.n0(i4), net.time4j.e0.JANUARY, 1).m1();
            } catch (RuntimeException e4) {
                throw new IllegalArgumentException(e4.getMessage(), e4);
            }
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(JucheCalendar jucheCalendar) {
            return ((Long) jucheCalendar.iso.r(net.time4j.engine.b0.UTC)).longValue();
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public JucheCalendar e(long j4) {
            return new JucheCalendar(net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC));
        }

        e(a aVar) {
        }
    }

    static {
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("譇\u0001"), JucheCalendar.class, c0.class, 'G');
        f82137b = iVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("譈\u0001"), JucheCalendar.class, 1, 999998088, 'y', null, null);
        f82138c = jVar;
        net.time4j.calendar.service.i iVar2 = new net.time4j.calendar.service.i(ProtectedSandApp.s("證\u0001"), JucheCalendar.class, net.time4j.e0.class, 'M');
        f82139d = iVar2;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("譊\u0001"), JucheCalendar.class, 1, 31, 'd');
        f82140e = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("譋\u0001"), JucheCalendar.class, 1, 365, 'D');
        f82141f = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(JucheCalendar.class, y0());
        f82142g = kVar;
        r0<JucheCalendar> r0Var = new r0<>(JucheCalendar.class, jVar2, kVar);
        f82143h = r0Var;
        f82144i = r0Var;
        HashMap hashMap = new HashMap();
        hashMap.put(iVar, jVar);
        hashMap.put(jVar, iVar2);
        hashMap.put(iVar2, jVar2);
        f82145j = Collections.unmodifiableMap(hashMap);
        e eVar = new e();
        f82146k = eVar;
        j0.c f4 = j0.c.m(net.time4j.h.class, JucheCalendar.class, new d(), eVar).f(iVar, b.j(iVar)).g(jVar, b.j(jVar), net.time4j.h.YEARS).g(iVar2, b.j(iVar2), net.time4j.h.MONTHS).f(net.time4j.calendar.d.f82409a, new l0(eVar, jVar3));
        b j4 = b.j(jVar2);
        net.time4j.h hVar = net.time4j.h.DAYS;
        j0.c h4 = f4.g(jVar2, j4, hVar).g(jVar3, b.j(jVar3), hVar).g(kVar, new s0(y0(), new a()), hVar).f(r0Var, new r0.a(r0Var)).h(new d.h(JucheCalendar.class, jVar2, jVar3, y0()));
        I0(h4);
        f82147l = h4.c();
    }

    JucheCalendar(net.time4j.l0 l0Var) {
        if (l0Var.o() < 1912) {
            throw new IllegalArgumentException(ProtectedSandApp.s("譌\u0001"));
        }
        this.iso = l0Var;
    }

    public static boolean C0(int i4, int i5, int i6) {
        return f82146k.c(c0.JUCHE, i4, i5, i6);
    }

    public static JucheCalendar F0() {
        return (JucheCalendar) w0.g().f(f82147l);
    }

    public static JucheCalendar G0(int i4, int i5, int i6) {
        return new JucheCalendar(net.time4j.l0.r1(net.time4j.base.c.e(i4, 1911), i5, i6));
    }

    public static JucheCalendar H0(int i4, net.time4j.e0 e0Var, int i5) {
        return G0(i4, e0Var.getValue(), i5);
    }

    private static void I0(j0.c<net.time4j.h, JucheCalendar> cVar) {
        EnumSet range = EnumSet.range(net.time4j.h.MILLENNIA, net.time4j.h.MONTHS);
        EnumSet range2 = EnumSet.range(net.time4j.h.WEEKS, net.time4j.h.DAYS);
        for (net.time4j.h hVar : net.time4j.h.values()) {
            cVar.j(hVar, new c(hVar), hVar.getLength(), hVar.compareTo(net.time4j.h.WEEKS) < 0 ? range : range2);
        }
    }

    private static int K0(int i4) {
        return net.time4j.base.c.e(i4, 1911);
    }

    static int n0(int i4) {
        return net.time4j.base.c.e(i4, 1911);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("譍\u0001"));
    }

    public static net.time4j.engine.j0<net.time4j.h, JucheCalendar> u0() {
        return f82147l;
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public static i1 y0() {
        return i1.k(new Locale(ProtectedSandApp.s("譎\u0001"), ProtectedSandApp.s("譏\u0001")));
    }

    public net.time4j.e0 A0() {
        return net.time4j.e0.valueOf(this.iso.q());
    }

    public boolean B0() {
        return this.iso.i1();
    }

    public int D0() {
        return this.iso.l1();
    }

    public int E0() {
        return this.iso.m1();
    }

    net.time4j.l0 J0() {
        return this.iso;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<net.time4j.h, JucheCalendar> y() {
        return f82147l;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof JucheCalendar) {
            return this.iso.equals(((JucheCalendar) obj).iso);
        }
        return false;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return this.iso.hashCode();
    }

    public int o() {
        return this.iso.o() - 1911;
    }

    public net.time4j.u<JucheCalendar> s0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    public int t() {
        return this.iso.t();
    }

    public net.time4j.u<JucheCalendar> t0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(c0.JUCHE);
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

    protected JucheCalendar v0() {
        return this;
    }

    public g1 w0() {
        return (g1) this.iso.r(net.time4j.l0.f83333x);
    }

    public int x0() {
        return this.iso.l(net.time4j.l0.f83334y);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82147l;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    public c0 z0() {
        return c0.JUCHE;
    }
}
