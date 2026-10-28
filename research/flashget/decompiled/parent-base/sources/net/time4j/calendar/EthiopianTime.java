package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.mmkv.MMKV;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import net.time4j.c1;
import net.time4j.engine.j0;
import net.time4j.m1;

@net.time4j.format.c("ethiopic")
/* loaded from: classes7.dex */
public final class EthiopianTime extends net.time4j.engine.m0<i, EthiopianTime> implements net.time4j.engine.i0<EthiopianTime>, net.time4j.format.h {

    /* renamed from: e, reason: collision with root package name */
    private static final int f81956e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f81957f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f81958g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f81959h = 3;

    /* renamed from: i, reason: collision with root package name */
    public static final net.time4j.engine.q<net.time4j.m0> f81960i;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "a")
    public static final net.time4j.engine.q<net.time4j.c0> f81961j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(format = "h")
    public static final net.time4j.engine.q<Integer> f81962k;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(format = "H")
    public static final net.time4j.engine.q<Integer> f81963l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(format = "m")
    public static final net.time4j.engine.q<Integer> f81964m;

    /* renamed from: n, reason: collision with root package name */
    @net.time4j.engine.d0(format = "s")
    public static final net.time4j.engine.q<Integer> f81965n;

    /* renamed from: o, reason: collision with root package name */
    private static final EthiopianTime f81966o;

    /* renamed from: p, reason: collision with root package name */
    private static final EthiopianTime f81967p;

    /* renamed from: q, reason: collision with root package name */
    private static final net.time4j.engine.j0<i, EthiopianTime> f81968q;
    private static final long serialVersionUID = 3576122091324773241L;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f81969b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f81970c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f81971d;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f81972c = 5;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f81973b;

        public SPX() {
        }

        private EthiopianTime a(ObjectInput objectInput) throws IOException {
            int readInt = objectInput.readInt();
            int i4 = readInt % 60;
            int i5 = readInt / 60;
            return EthiopianTime.g0(net.time4j.m0.c1(i5 / 60, i5 % 60, i4));
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            EthiopianTime ethiopianTime = (EthiopianTime) this.f81973b;
            objectOutput.writeInt(ethiopianTime.h() + (ethiopianTime.m() * 60) + (((Integer) ethiopianTime.r(EthiopianTime.f81963l)).intValue() * MMKV.ExpireInHour));
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f81973b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 5) {
                throw new InvalidObjectException(ProtectedSandApp.s("詯\u0001"));
            }
            this.f81973b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(5);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f81973b = obj;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81974a;

        static {
            int[] iArr = new int[i.values().length];
            f81974a = iArr;
            try {
                iArr[i.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81974a[i.MINUTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81974a[i.SECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static class b implements net.time4j.engine.o0<EthiopianTime> {

        /* renamed from: a, reason: collision with root package name */
        private final i f81975a;

        /* synthetic */ b(i iVar, a aVar) {
            this(iVar);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public EthiopianTime b(EthiopianTime ethiopianTime, long j4) {
            long f4;
            if (j4 == 0) {
                return ethiopianTime;
            }
            int i4 = ethiopianTime.f81970c;
            int i5 = ethiopianTime.f81971d;
            int i6 = a.f81974a[this.f81975a.ordinal()];
            if (i6 == 1) {
                f4 = net.time4j.base.c.f(ethiopianTime.f81969b, j4);
            } else if (i6 == 2) {
                long f5 = net.time4j.base.c.f(ethiopianTime.f81970c, j4);
                f4 = net.time4j.base.c.f(ethiopianTime.f81969b, net.time4j.base.c.b(f5, 60));
                i4 = net.time4j.base.c.d(f5, 60);
            } else {
                if (i6 != 3) {
                    throw new UnsupportedOperationException(this.f81975a.name());
                }
                long f6 = net.time4j.base.c.f(ethiopianTime.f81971d, j4);
                long f7 = net.time4j.base.c.f(ethiopianTime.f81970c, net.time4j.base.c.b(f6, 60));
                f4 = net.time4j.base.c.f(ethiopianTime.f81969b, net.time4j.base.c.b(f7, 60));
                i4 = net.time4j.base.c.d(f7, 60);
                i5 = net.time4j.base.c.d(f6, 60);
            }
            return new EthiopianTime(net.time4j.base.c.d(f4, 24), i4, i5, null);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(EthiopianTime ethiopianTime, EthiopianTime ethiopianTime2) {
            long j4;
            long i02 = ethiopianTime2.i0() - ethiopianTime.i0();
            int i4 = a.f81974a[this.f81975a.ordinal()];
            if (i4 == 1) {
                j4 = 3600;
            } else if (i4 == 2) {
                j4 = 60;
            } else {
                if (i4 != 3) {
                    throw new UnsupportedOperationException(this.f81975a.name());
                }
                j4 = 1;
            }
            return i02 / j4;
        }

        private b(i iVar) {
            this.f81975a = iVar;
        }
    }

    private static class c extends net.time4j.format.d<Integer> {

        /* renamed from: c, reason: collision with root package name */
        static final c f81976c = new c();
        private static final long serialVersionUID = -2095959121446847268L;

        private c() {
            super(ProtectedSandApp.s("詰\u0001"));
        }

        private Object readResolve() {
            return f81976c;
        }

        @Override // net.time4j.engine.e
        protected <T extends net.time4j.engine.r<T>> net.time4j.engine.a0<T, Integer> g(net.time4j.engine.x<T> xVar) {
            if (net.time4j.m0.y0().equals(xVar)) {
                return new d();
            }
            return null;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'h';
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
        public boolean isTimeElement() {
            return true;
        }

        @Override // net.time4j.engine.e
        protected net.time4j.engine.q<?> n() {
            return net.time4j.m0.f83371v;
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.q
        /* renamed from: y, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMaximum() {
            return 12;
        }

        @Override // net.time4j.engine.q
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public Integer getDefaultMinimum() {
            return 1;
        }
    }

    private static class d<T extends net.time4j.engine.r<T>> implements net.time4j.engine.a0<T, Integer> {
        private d() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(T t4) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(T t4) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(T t4) {
            return 12;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(T t4) {
            return 1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(T t4) {
            return Integer.valueOf(EthiopianTime.g0((net.time4j.m0) t4.r(net.time4j.m0.f83369t)).u());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(T t4, Integer num) {
            return EthiopianTime.g0((net.time4j.m0) t4.r(net.time4j.m0.f83369t)).G(EthiopianTime.f81962k, num);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public T withValue(T t4, Integer num, boolean z4) {
            c1 c1Var = net.time4j.m0.f83369t;
            return (T) t4.M(c1Var, ((EthiopianTime) EthiopianTime.g0((net.time4j.m0) t4.r(c1Var)).M(EthiopianTime.f81962k, num)).x0());
        }

        d(a aVar) {
        }
    }

    private static class e implements net.time4j.engine.a0<EthiopianTime, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final int f81977b;

        e(int i4) {
            this.f81977b = i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(EthiopianTime ethiopianTime) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(EthiopianTime ethiopianTime) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(EthiopianTime ethiopianTime) {
            int i4 = this.f81977b;
            if (i4 == 0) {
                return 12;
            }
            if (i4 == 1) {
                return 23;
            }
            if (i4 == 2 || i4 == 3) {
                return 59;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("話\u0001") + this.f81977b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(EthiopianTime ethiopianTime) {
            int i4 = this.f81977b;
            if (i4 == 0) {
                return 1;
            }
            if (i4 == 1 || i4 == 2 || i4 == 3) {
                return 0;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("話\u0001") + this.f81977b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(EthiopianTime ethiopianTime) {
            int i4 = this.f81977b;
            if (i4 == 0) {
                return Integer.valueOf(ethiopianTime.u());
            }
            if (i4 == 1) {
                return Integer.valueOf(ethiopianTime.f81969b);
            }
            if (i4 == 2) {
                return Integer.valueOf(ethiopianTime.f81970c);
            }
            if (i4 == 3) {
                return Integer.valueOf(ethiopianTime.f81971d);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("話\u0001") + this.f81977b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(EthiopianTime ethiopianTime, Integer num) {
            return num != null && getMinimum(ethiopianTime).compareTo(num) <= 0 && getMaximum(ethiopianTime).compareTo(num) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EthiopianTime withValue(EthiopianTime ethiopianTime, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("該\u0001"));
            }
            int intValue = num.intValue();
            int i4 = this.f81977b;
            if (i4 == 0) {
                return ethiopianTime.l0() ? EthiopianTime.s0(intValue, ethiopianTime.f81970c, ethiopianTime.f81971d) : EthiopianTime.u0(intValue, ethiopianTime.f81970c, ethiopianTime.f81971d);
            }
            a aVar = null;
            if (i4 == 1) {
                return new EthiopianTime(intValue, ethiopianTime.f81970c, ethiopianTime.f81971d, aVar);
            }
            if (i4 == 2) {
                return new EthiopianTime(ethiopianTime.f81969b, intValue, ethiopianTime.f81971d, aVar);
            }
            if (i4 == 3) {
                return new EthiopianTime(ethiopianTime.f81969b, ethiopianTime.f81970c, intValue, aVar);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("話\u0001") + this.f81977b);
        }
    }

    private static class f implements net.time4j.engine.u<EthiopianTime> {
        private f() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82722c;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public EthiopianTime o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
            return EthiopianTime.g0((net.time4j.m0) net.time4j.m0.y0().o(eVar, dVar));
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public EthiopianTime e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            net.time4j.m0 e4 = net.time4j.m0.y0().e(rVar, dVar, z4, false);
            if (e4 != null) {
                return EthiopianTime.g0(e4);
            }
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(EthiopianTime ethiopianTime, net.time4j.engine.d dVar) {
            return ethiopianTime;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return 100;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return zVar.getStyleValue() == 3 ? ProtectedSandApp.s("詳\u0001") : ProtectedSandApp.s("詴\u0001");
        }

        f(a aVar) {
        }
    }

    private static class g implements net.time4j.engine.a0<EthiopianTime, net.time4j.c0> {
        private g() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(EthiopianTime ethiopianTime) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(EthiopianTime ethiopianTime) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.c0 getMaximum(EthiopianTime ethiopianTime) {
            return net.time4j.c0.PM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.c0 getMinimum(EthiopianTime ethiopianTime) {
            return net.time4j.c0.AM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.c0 getValue(EthiopianTime ethiopianTime) {
            return ethiopianTime.f81969b < 12 ? net.time4j.c0.AM : net.time4j.c0.PM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(EthiopianTime ethiopianTime, net.time4j.c0 c0Var) {
            return c0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EthiopianTime withValue(EthiopianTime ethiopianTime, net.time4j.c0 c0Var, boolean z4) {
            int i4 = ethiopianTime.f81969b;
            if (c0Var == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("詵\u0001"));
            }
            if (c0Var == net.time4j.c0.AM) {
                if (i4 >= 12) {
                    i4 -= 12;
                }
            } else if (c0Var == net.time4j.c0.PM && i4 < 12) {
                i4 += 12;
            }
            return new EthiopianTime(i4, ethiopianTime.f81970c, ethiopianTime.f81971d, null);
        }

        g(a aVar) {
        }
    }

    private static class h implements net.time4j.engine.a0<EthiopianTime, net.time4j.m0> {
        private h() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(EthiopianTime ethiopianTime) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(EthiopianTime ethiopianTime) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.m0 getMaximum(EthiopianTime ethiopianTime) {
            return net.time4j.m0.c1(23, 59, 59);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.m0 getMinimum(EthiopianTime ethiopianTime) {
            return net.time4j.m0.Y0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.m0 getValue(EthiopianTime ethiopianTime) {
            return ethiopianTime.x0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(EthiopianTime ethiopianTime, net.time4j.m0 m0Var) {
            return m0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public EthiopianTime withValue(EthiopianTime ethiopianTime, net.time4j.m0 m0Var, boolean z4) {
            if (m0Var != null) {
                return EthiopianTime.g0(m0Var);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("詶\u0001"));
        }

        h(a aVar) {
        }
    }

    public enum i implements net.time4j.engine.w {
        HOURS(3600.0d),
        MINUTES(60.0d),
        SECONDS(1.0d);

        private final transient double length;

        i(double d5) {
            this.length = d5;
        }

        public int between(EthiopianTime ethiopianTime, EthiopianTime ethiopianTime2) {
            return (int) ethiopianTime.Y(ethiopianTime2, this);
        }

        @Override // net.time4j.engine.w
        public double getLength() {
            return this.length;
        }

        @Override // net.time4j.engine.w
        public boolean isCalendrical() {
            return false;
        }
    }

    static {
        c1 c1Var = net.time4j.m0.f83369t;
        f81960i = c1Var;
        m1<net.time4j.c0> m1Var = net.time4j.m0.f83370u;
        f81961j = m1Var;
        c cVar = c.f81976c;
        f81962k = cVar;
        net.time4j.q0<Integer, net.time4j.m0> q0Var = net.time4j.m0.f83374y;
        f81963l = q0Var;
        net.time4j.q0<Integer, net.time4j.m0> q0Var2 = net.time4j.m0.A;
        f81964m = q0Var2;
        net.time4j.q0<Integer, net.time4j.m0> q0Var3 = net.time4j.m0.C;
        f81965n = q0Var3;
        EthiopianTime ethiopianTime = new EthiopianTime(6, 0, 0);
        f81966o = ethiopianTime;
        EthiopianTime ethiopianTime2 = new EthiopianTime(5, 59, 59);
        f81967p = ethiopianTime2;
        j0.c f4 = j0.c.n(i.class, EthiopianTime.class, new f(), ethiopianTime, ethiopianTime2).f(m1Var, new g()).f(c1Var, new h());
        e eVar = new e(0);
        i iVar = i.HOURS;
        j0.c g4 = f4.g(cVar, eVar, iVar).g(q0Var, new e(1), iVar).g(q0Var2, new e(2), i.MINUTES).g(q0Var3, new e(3), i.SECONDS);
        w0(g4);
        v0(g4);
        f81968q = g4.c();
    }

    /* synthetic */ EthiopianTime(int i4, int i5, int i6, a aVar) {
        this(i4, i5, i6);
    }

    public static net.time4j.engine.j0<i, EthiopianTime> e0() {
        return f81968q;
    }

    public static EthiopianTime g0(net.time4j.m0 m0Var) {
        int u4 = m0Var.u();
        if (u4 == 24) {
            u4 = 0;
        }
        return new EthiopianTime(u4, m0Var.m(), m0Var.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int i0() {
        int i4 = (this.f81970c * 60) + this.f81971d;
        int i5 = this.f81969b;
        if (i5 < 6) {
            i5 += 24;
        }
        return (i5 * MMKV.ExpireInHour) + i4;
    }

    public static EthiopianTime o0() {
        return g0(net.time4j.m0.Z0());
    }

    private static EthiopianTime p0(boolean z4, int i4, int i5, int i6) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("詽\u0001"), i4));
        }
        if (i4 == 12) {
            i4 = 0;
        }
        int i7 = i4 + 6;
        if (z4 && (i7 = i4 + 18) >= 24) {
            i7 = i4 - 6;
        }
        return new EthiopianTime(i7, i5, i6);
    }

    public static EthiopianTime r0(int i4, int i5) {
        return p0(false, i4, i5, 0);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("詾\u0001"));
    }

    public static EthiopianTime s0(int i4, int i5, int i6) {
        return p0(false, i4, i5, i6);
    }

    public static EthiopianTime t0(int i4, int i5) {
        return p0(true, i4, i5, 0);
    }

    public static EthiopianTime u0(int i4, int i5, int i6) {
        return p0(true, i4, i5, i6);
    }

    private static void v0(j0.c<i, EthiopianTime> cVar) {
        cVar.h(new net.time4j.calendar.service.b());
        for (net.time4j.engine.s sVar : net.time4j.m0.y0().E()) {
            Set<net.time4j.engine.q<?>> b5 = sVar.b(Locale.ROOT, net.time4j.format.a.f());
            if (b5.size() == 2) {
                Iterator<net.time4j.engine.q<?>> it = b5.iterator();
                while (it.hasNext()) {
                    if (it.next().name().endsWith(ProtectedSandApp.s("詿\u0001"))) {
                        cVar.h(sVar);
                        return;
                    }
                }
            }
        }
    }

    private static void w0(j0.c<i, EthiopianTime> cVar) {
        EnumSet allOf = EnumSet.allOf(i.class);
        for (i iVar : i.values()) {
            cVar.j(iVar, new b(iVar, null), iVar.getLength(), allOf);
        }
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<i, EthiopianTime> y() {
        return f81968q;
    }

    @Override // net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof EthiopianTime) && i0() == ((EthiopianTime) obj).i0();
    }

    @Override // net.time4j.engine.m0, java.lang.Comparable
    /* renamed from: f0, reason: merged with bridge method [inline-methods] */
    public int compareTo(EthiopianTime ethiopianTime) {
        return i0() - ethiopianTime.i0();
    }

    public int h() {
        return this.f81971d;
    }

    protected EthiopianTime h0() {
        return this;
    }

    @Override // net.time4j.engine.m0
    public int hashCode() {
        return i0();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: j0, reason: merged with bridge method [inline-methods] */
    public boolean s(EthiopianTime ethiopianTime) {
        return i0() > ethiopianTime.i0();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: k0, reason: merged with bridge method [inline-methods] */
    public boolean f(EthiopianTime ethiopianTime) {
        return i0() < ethiopianTime.i0();
    }

    public boolean l0() {
        int i4 = this.f81969b;
        return i4 >= 6 && i4 < 18;
    }

    public int m() {
        return this.f81970c;
    }

    public boolean m0() {
        return !l0();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public boolean k(EthiopianTime ethiopianTime) {
        return i0() == ethiopianTime.i0();
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("誀\u0001"));
        sb.append(l0() ? ProtectedSandApp.s("誁\u0001") : ProtectedSandApp.s("誂\u0001"));
        sb.append(u());
        sb.append(':');
        if (this.f81970c < 10) {
            sb.append('0');
        }
        sb.append(this.f81970c);
        sb.append(':');
        if (this.f81971d < 10) {
            sb.append('0');
        }
        sb.append(this.f81971d);
        return sb.toString();
    }

    public int u() {
        int i4 = this.f81969b;
        int i5 = i4 - 6;
        if (i5 < 0) {
            i5 = i4 + 6;
        } else if (i5 >= 12) {
            i5 = i4 - 18;
        }
        if (i5 == 0) {
            return 12;
        }
        return i5;
    }

    public net.time4j.m0 x0() {
        return net.time4j.m0.c1(this.f81969b, this.f81970c, this.f81971d);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f81968q;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    private EthiopianTime(int i4, int i5, int i6) {
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("詼\u0001"), i4));
        }
        if (i5 < 0 || i5 > 59) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("詻\u0001"), i5));
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("詺\u0001"), i6));
        }
        this.f81969b = i4;
        this.f81970c = i5;
        this.f81971d = i6;
    }
}
