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

@net.time4j.format.c("roc")
/* loaded from: classes7.dex */
public final class MinguoCalendar extends net.time4j.engine.n<net.time4j.h, MinguoCalendar> implements net.time4j.format.h {

    /* renamed from: b, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<e0> f82193b;

    /* renamed from: c, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, MinguoCalendar> f82194c;

    /* renamed from: d, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<net.time4j.e0, MinguoCalendar> f82195d;

    /* renamed from: e, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, MinguoCalendar> f82196e;

    /* renamed from: f, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, MinguoCalendar> f82197f;

    /* renamed from: g, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, MinguoCalendar> f82198g;

    /* renamed from: h, reason: collision with root package name */
    private static final r0<MinguoCalendar> f82199h;

    /* renamed from: i, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<MinguoCalendar> f82200i;

    /* renamed from: j, reason: collision with root package name */
    private static final Map<Object, net.time4j.engine.q<?>> f82201j;

    /* renamed from: k, reason: collision with root package name */
    private static final o<MinguoCalendar> f82202k;

    /* renamed from: l, reason: collision with root package name */
    private static final net.time4j.engine.j0<net.time4j.h, MinguoCalendar> f82203l;
    private static final long serialVersionUID = -6628190121085147706L;
    private final net.time4j.l0 iso;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82204c = 6;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82205b;

        public SPX() {
        }

        private MinguoCalendar a(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            return (MinguoCalendar) ((net.time4j.l0) net.time4j.l0.class.cast(objectInput.readObject())).l0(MinguoCalendar.class);
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeObject(((MinguoCalendar) this.f82205b).J0());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82205b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException, ClassNotFoundException {
            if (objectInput.readByte() != 6) {
                throw new InvalidObjectException(ProtectedSandApp.s("譺\u0001"));
            }
            this.f82205b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(6);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82205b = obj;
        }
    }

    static class a implements net.time4j.engine.t<MinguoCalendar, net.time4j.engine.l<MinguoCalendar>> {
        a() {
        }

        public net.time4j.engine.l<MinguoCalendar> a(MinguoCalendar minguoCalendar) {
            return MinguoCalendar.f82202k;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<MinguoCalendar> apply(MinguoCalendar minguoCalendar) {
            return MinguoCalendar.f82202k;
        }
    }

    private static class b<V extends Comparable<V>> implements net.time4j.engine.a0<MinguoCalendar, V> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<V> f82206b;

        private b(net.time4j.engine.q<V> qVar) {
            this.f82206b = qVar;
        }

        static <V extends Comparable<V>> b<V> j(net.time4j.engine.q<V> qVar) {
            return new b<>(qVar);
        }

        private static int k(Object obj) {
            return ((Integer) Integer.class.cast(obj)).intValue();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(MinguoCalendar minguoCalendar) {
            return (net.time4j.engine.q) MinguoCalendar.f82201j.get(this.f82206b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(MinguoCalendar minguoCalendar) {
            return (net.time4j.engine.q) MinguoCalendar.f82201j.get(this.f82206b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public V getMaximum(MinguoCalendar minguoCalendar) {
            Object g4;
            net.time4j.engine.q<V> qVar = this.f82206b;
            if (qVar == MinguoCalendar.f82193b) {
                g4 = e0.ROC;
            } else if (qVar.equals(MinguoCalendar.f82194c)) {
                g4 = minguoCalendar.z0() == e0.ROC ? 999998088 : 1000001911;
            } else if (this.f82206b.equals(MinguoCalendar.f82195d)) {
                g4 = net.time4j.e0.DECEMBER;
            } else if (this.f82206b.equals(MinguoCalendar.f82196e)) {
                g4 = minguoCalendar.iso.g(net.time4j.l0.f83332w);
            } else {
                if (!this.f82206b.equals(MinguoCalendar.f82197f)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82206b, new StringBuilder(ProtectedSandApp.s("譻\u0001"))));
                }
                g4 = minguoCalendar.iso.g(net.time4j.l0.f83334y);
            }
            return this.f82206b.getType().cast(g4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public V getMinimum(MinguoCalendar minguoCalendar) {
            Object obj;
            net.time4j.engine.q<V> qVar = this.f82206b;
            if (qVar == MinguoCalendar.f82193b) {
                obj = e0.BEFORE_ROC;
            } else if (Integer.class.isAssignableFrom(qVar.getType())) {
                obj = 1;
            } else {
                if (!this.f82206b.equals(MinguoCalendar.f82195d)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82206b, new StringBuilder(ProtectedSandApp.s("譻\u0001"))));
                }
                obj = net.time4j.e0.JANUARY;
            }
            return this.f82206b.getType().cast(obj);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public V getValue(MinguoCalendar minguoCalendar) {
            Object valueOf;
            net.time4j.engine.q<V> qVar = this.f82206b;
            if (qVar == MinguoCalendar.f82193b) {
                valueOf = minguoCalendar.z0();
            } else if (qVar.equals(MinguoCalendar.f82194c)) {
                valueOf = Integer.valueOf(minguoCalendar.o());
            } else if (this.f82206b.equals(MinguoCalendar.f82195d)) {
                valueOf = minguoCalendar.A0();
            } else if (this.f82206b.equals(MinguoCalendar.f82196e)) {
                valueOf = Integer.valueOf(minguoCalendar.t());
            } else {
                if (!this.f82206b.equals(MinguoCalendar.f82197f)) {
                    throw new ChronoException(net.time4j.g0.a(this.f82206b, new StringBuilder(ProtectedSandApp.s("譻\u0001"))));
                }
                valueOf = Integer.valueOf(minguoCalendar.x0());
            }
            return this.f82206b.getType().cast(valueOf);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(MinguoCalendar minguoCalendar, V v4) {
            if (v4 == null) {
                return false;
            }
            if (this.f82206b == MinguoCalendar.f82193b) {
                return v4.equals(minguoCalendar.z0());
            }
            return getMinimum(minguoCalendar).compareTo(v4) <= 0 && v4.compareTo(getMaximum(minguoCalendar)) <= 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public MinguoCalendar withValue(MinguoCalendar minguoCalendar, V v4, boolean z4) {
            if (!j(minguoCalendar, v4)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("譼\u0001") + v4);
            }
            net.time4j.engine.q<V> qVar = this.f82206b;
            if (qVar == MinguoCalendar.f82193b) {
                return minguoCalendar;
            }
            if (qVar.equals(MinguoCalendar.f82194c)) {
                MinguoCalendar H0 = MinguoCalendar.H0(minguoCalendar.z0(), k(v4), minguoCalendar.A0(), 1);
                return (MinguoCalendar) H0.K(MinguoCalendar.f82196e, Math.min(minguoCalendar.t(), H0.D0()));
            }
            a aVar = null;
            if (this.f82206b.equals(MinguoCalendar.f82195d)) {
                return new MinguoCalendar((net.time4j.l0) minguoCalendar.iso.M(net.time4j.l0.f83330u, net.time4j.e0.class.cast(v4)), aVar);
            }
            if (this.f82206b.equals(MinguoCalendar.f82196e)) {
                return new MinguoCalendar((net.time4j.l0) minguoCalendar.iso.K(net.time4j.l0.f83332w, k(v4)), aVar);
            }
            if (this.f82206b.equals(MinguoCalendar.f82197f)) {
                return new MinguoCalendar((net.time4j.l0) minguoCalendar.iso.K(net.time4j.l0.f83334y, k(v4)), aVar);
            }
            throw new ChronoException(net.time4j.g0.a(this.f82206b, new StringBuilder(ProtectedSandApp.s("譻\u0001"))));
        }
    }

    private static class c implements net.time4j.engine.u<MinguoCalendar> {
        private c() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public MinguoCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (MinguoCalendar) net.time4j.d0.y0(eVar.c()).d1(MinguoCalendar.f82203l, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public MinguoCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            e0 e0Var;
            net.time4j.f fVar = net.time4j.l0.f83326q;
            a aVar = null;
            if (rVar.w(fVar)) {
                return new MinguoCalendar((net.time4j.l0) rVar.r(fVar), aVar);
            }
            net.time4j.engine.q<?> qVar = MinguoCalendar.f82193b;
            if (rVar.w(qVar)) {
                e0Var = (e0) rVar.r(qVar);
            } else {
                if (!z4) {
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("譿\u0001"));
                    return null;
                }
                e0Var = e0.ROC;
            }
            int l4 = rVar.l(MinguoCalendar.f82194c);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("譽\u0001"));
                return null;
            }
            int K0 = MinguoCalendar.K0(e0Var, l4);
            o0<net.time4j.e0, MinguoCalendar> o0Var = MinguoCalendar.f82195d;
            boolean w4 = rVar.w(o0Var);
            String s4 = ProtectedSandApp.s("譾\u0001");
            if (w4) {
                int value = ((net.time4j.e0) rVar.r(o0Var)).getValue();
                int l5 = rVar.l(MinguoCalendar.f82196e);
                if (l5 != Integer.MIN_VALUE) {
                    if (MinguoCalendar.f82202k.c(e0Var, l4, value, l5)) {
                        return MinguoCalendar.G0(e0Var, l4, value, l5);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            } else {
                int l6 = rVar.l(MinguoCalendar.f82197f);
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 > 0) {
                        int i4 = 1;
                        int i5 = 0;
                        while (i4 <= 12) {
                            int d5 = net.time4j.base.b.d(K0, i4) + i5;
                            if (l6 <= d5) {
                                return MinguoCalendar.G0(e0Var, l4, i4, l6 - i5);
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
        public net.time4j.engine.p k(MinguoCalendar minguoCalendar, net.time4j.engine.d dVar) {
            return minguoCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g() - 1911;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("讀\u0001"), zVar, locale);
        }

        c(a aVar) {
        }
    }

    private static class d implements net.time4j.engine.o0<MinguoCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final net.time4j.h f82207a;

        d(net.time4j.h hVar) {
            this.f82207a = hVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public MinguoCalendar b(MinguoCalendar minguoCalendar, long j4) {
            return new MinguoCalendar((net.time4j.l0) minguoCalendar.iso.W(j4, this.f82207a), null);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(MinguoCalendar minguoCalendar, MinguoCalendar minguoCalendar2) {
            return this.f82207a.between(minguoCalendar.iso, minguoCalendar2.iso);
        }
    }

    private static class e implements o<MinguoCalendar> {
        private e() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Arrays.asList(e0.BEFORE_ROC, e0.ROC);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            try {
                return net.time4j.l0.r1(MinguoCalendar.K0((e0) e0.class.cast(jVar), i4), i5, 1).l1();
            } catch (RuntimeException e4) {
                throw new IllegalArgumentException(e4.getMessage(), e4);
            }
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            try {
                if (!(jVar instanceof e0)) {
                    return false;
                }
                int K0 = MinguoCalendar.K0((e0) e0.class.cast(jVar), i4);
                if (i4 < 1 || K0 > 999999999 || i5 < 1 || i5 > 12 || i6 < 1) {
                    return false;
                }
                return i6 <= net.time4j.base.b.d(K0, i5);
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
            return net.time4j.l0.T0().y().g();
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            try {
                return net.time4j.l0.v1(MinguoCalendar.K0((e0) e0.class.cast(jVar), i4), net.time4j.e0.JANUARY, 1).m1();
            } catch (RuntimeException e4) {
                throw new IllegalArgumentException(e4.getMessage(), e4);
            }
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(MinguoCalendar minguoCalendar) {
            return ((Long) minguoCalendar.iso.r(net.time4j.engine.b0.UTC)).longValue();
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public MinguoCalendar e(long j4) {
            return new MinguoCalendar(net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC), null);
        }

        e(a aVar) {
        }
    }

    static {
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("讁\u0001"), MinguoCalendar.class, e0.class, 'G');
        f82193b = iVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("讂\u0001"), MinguoCalendar.class, 1, 999998088, 'y', null, null);
        f82194c = jVar;
        net.time4j.calendar.service.i iVar2 = new net.time4j.calendar.service.i(ProtectedSandApp.s("讃\u0001"), MinguoCalendar.class, net.time4j.e0.class, 'M');
        f82195d = iVar2;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("讄\u0001"), MinguoCalendar.class, 1, 31, 'd');
        f82196e = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("讅\u0001"), MinguoCalendar.class, 1, 365, 'D');
        f82197f = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(MinguoCalendar.class, y0());
        f82198g = kVar;
        r0<MinguoCalendar> r0Var = new r0<>(MinguoCalendar.class, jVar2, kVar);
        f82199h = r0Var;
        f82200i = r0Var;
        HashMap hashMap = new HashMap();
        hashMap.put(iVar, jVar);
        hashMap.put(jVar, iVar2);
        hashMap.put(iVar2, jVar2);
        f82201j = Collections.unmodifiableMap(hashMap);
        e eVar = new e();
        f82202k = eVar;
        j0.c f4 = j0.c.m(net.time4j.h.class, MinguoCalendar.class, new c(), eVar).f(iVar, b.j(iVar)).g(jVar, b.j(jVar), net.time4j.h.YEARS).g(iVar2, b.j(iVar2), net.time4j.h.MONTHS).f(net.time4j.calendar.d.f82409a, new l0(eVar, jVar3));
        b j4 = b.j(jVar2);
        net.time4j.h hVar = net.time4j.h.DAYS;
        j0.c h4 = f4.g(jVar2, j4, hVar).g(jVar3, b.j(jVar3), hVar).g(kVar, new s0(y0(), new a()), hVar).f(r0Var, new r0.a(r0Var)).h(new d.h(MinguoCalendar.class, jVar2, jVar3, y0()));
        I0(h4);
        f82203l = h4.c();
    }

    /* synthetic */ MinguoCalendar(net.time4j.l0 l0Var, a aVar) {
        this(l0Var);
    }

    public static boolean C0(e0 e0Var, int i4, int i5, int i6) {
        return f82202k.c(e0Var, i4, i5, i6);
    }

    public static MinguoCalendar F0() {
        return (MinguoCalendar) w0.g().f(f82203l);
    }

    public static MinguoCalendar G0(e0 e0Var, int i4, int i5, int i6) {
        return new MinguoCalendar(net.time4j.l0.r1(K0(e0Var, i4), i5, i6));
    }

    public static MinguoCalendar H0(e0 e0Var, int i4, net.time4j.e0 e0Var2, int i5) {
        return G0(e0Var, i4, e0Var2.getValue(), i5);
    }

    private static void I0(j0.c<net.time4j.h, MinguoCalendar> cVar) {
        EnumSet range = EnumSet.range(net.time4j.h.MILLENNIA, net.time4j.h.MONTHS);
        EnumSet range2 = EnumSet.range(net.time4j.h.WEEKS, net.time4j.h.DAYS);
        for (net.time4j.h hVar : net.time4j.h.values()) {
            cVar.j(hVar, new d(hVar), hVar.getLength(), hVar.compareTo(net.time4j.h.WEEKS) < 0 ? range : range2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int K0(e0 e0Var, int i4) {
        return e0Var == e0.ROC ? net.time4j.base.c.e(i4, 1911) : net.time4j.base.c.l(1912, i4);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("讆\u0001"));
    }

    public static net.time4j.engine.j0<net.time4j.h, MinguoCalendar> u0() {
        return f82203l;
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
    public net.time4j.engine.j0<net.time4j.h, MinguoCalendar> y() {
        return f82203l;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof MinguoCalendar) {
            return this.iso.equals(((MinguoCalendar) obj).iso);
        }
        return false;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return this.iso.hashCode();
    }

    public int o() {
        return z0() == e0.ROC ? this.iso.o() - 1911 : 1912 - this.iso.o();
    }

    public net.time4j.u<MinguoCalendar> s0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    public int t() {
        return this.iso.t();
    }

    public net.time4j.u<MinguoCalendar> t0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(z0());
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

    protected MinguoCalendar v0() {
        return this;
    }

    public g1 w0() {
        return (g1) this.iso.r(net.time4j.l0.f83333x);
    }

    public int x0() {
        return ((Integer) this.iso.r(net.time4j.l0.f83334y)).intValue();
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82203l;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    public e0 z0() {
        return this.iso.o() < 1912 ? e0.BEFORE_ROC : e0.ROC;
    }

    private MinguoCalendar(net.time4j.l0 l0Var) {
        this.iso = l0Var;
    }
}
