package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Externalizable;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectStreamException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.EnumSet;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import net.time4j.engine.j0;
import net.time4j.w0;

@net.time4j.format.c("hebrew")
/* loaded from: classes7.dex */
public final class HebrewTime extends net.time4j.engine.m0<i, HebrewTime> implements net.time4j.engine.i0<HebrewTime> {

    /* renamed from: d, reason: collision with root package name */
    private static final int f82007d = 1080;

    /* renamed from: e, reason: collision with root package name */
    private static final int f82008e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f82009f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82010g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final net.time4j.engine.q<d> f82011h;

    /* renamed from: i, reason: collision with root package name */
    @net.time4j.engine.d0(format = "h")
    public static final o0<Integer, HebrewTime> f82012i;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "H")
    public static final o0<Integer, HebrewTime> f82013j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(dynamic = true, format = "P")
    public static final o0<Integer, HebrewTime> f82014k;

    /* renamed from: l, reason: collision with root package name */
    private static final HebrewTime f82015l;

    /* renamed from: m, reason: collision with root package name */
    private static final HebrewTime f82016m;

    /* renamed from: n, reason: collision with root package name */
    private static final net.time4j.engine.j0<i, HebrewTime> f82017n;
    private static final long serialVersionUID = -6206874394178665128L;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82018b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82019c;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82020c = 13;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82021b;

        public SPX() {
        }

        private HebrewTime a(ObjectInput objectInput) throws IOException {
            return HebrewTime.v0(objectInput.readByte(), objectInput.readShort());
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            HebrewTime hebrewTime = (HebrewTime) this.f82021b;
            objectOutput.writeByte(hebrewTime.j0());
            objectOutput.writeShort(hebrewTime.k0());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82021b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 13) {
                throw new InvalidObjectException(ProtectedSandApp.s("誢\u0001"));
            }
            this.f82021b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(13);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82021b = obj;
        }
    }

    static class a implements net.time4j.engine.t<net.time4j.d0, HebrewTime> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ net.time4j.calendar.astro.j f82022a;

        a(net.time4j.calendar.astro.j jVar) {
            this.f82022a = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:13:0x008f A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00dc  */
        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.calendar.HebrewTime apply(net.time4j.d0 r13) {
            /*
                r12 = this;
                java.math.BigDecimal r0 = new java.math.BigDecimal
                net.time4j.calendar.astro.j r1 = r12.f82022a
                double r1 = r1.c()
                r0.<init>(r1)
                net.time4j.tz.p r0 = net.time4j.tz.p.a(r0)
                net.time4j.n0 r0 = r13.j1(r0)
                net.time4j.l0 r1 = r0.H0()
                net.time4j.calendar.astro.j r2 = r12.f82022a
                net.time4j.engine.t r2 = r2.N()
                java.lang.Object r1 = r1.x(r2)
                net.time4j.d0 r1 = (net.time4j.d0) r1
                r2 = 0
                if (r1 == 0) goto Le2
                boolean r3 = r13.f(r1)
                r4 = 1
                if (r3 == 0) goto L6a
                net.time4j.l0 r3 = r0.H0()
                net.time4j.calendar.astro.j r6 = r12.f82022a
                net.time4j.engine.t r6 = r6.L()
                java.lang.Object r3 = r3.x(r6)
                net.time4j.d0 r3 = (net.time4j.d0) r3
                if (r3 == 0) goto L8a
                boolean r6 = r13.f(r3)
                if (r6 == 0) goto L64
                net.time4j.l0 r0 = r0.H0()
                net.time4j.h r1 = net.time4j.h.DAYS
                net.time4j.engine.m0 r0 = r0.U(r4, r1)
                net.time4j.l0 r0 = (net.time4j.l0) r0
                net.time4j.calendar.astro.j r1 = r12.f82022a
                net.time4j.engine.t r1 = r1.N()
                java.lang.Object r0 = r0.x(r1)
                r1 = r0
                net.time4j.d0 r1 = (net.time4j.d0) r1
                if (r1 == 0) goto L8a
                net.time4j.calendar.HebrewTime$d r0 = net.time4j.calendar.HebrewTime.d.NIGHT
                goto L8d
            L64:
                net.time4j.calendar.HebrewTime$d r0 = net.time4j.calendar.HebrewTime.d.DAY
                r11 = r3
                r3 = r1
                r1 = r11
                goto L8d
            L6a:
                net.time4j.l0 r0 = r0.H0()
                net.time4j.h r3 = net.time4j.h.DAYS
                net.time4j.engine.m0 r0 = r0.W(r4, r3)
                net.time4j.l0 r0 = (net.time4j.l0) r0
                net.time4j.calendar.astro.j r3 = r12.f82022a
                net.time4j.engine.t r3 = r3.L()
                java.lang.Object r0 = r0.x(r3)
                net.time4j.d0 r0 = (net.time4j.d0) r0
                if (r0 == 0) goto L8a
                net.time4j.calendar.HebrewTime$d r3 = net.time4j.calendar.HebrewTime.d.NIGHT
                r11 = r3
                r3 = r0
                r0 = r11
                goto L8d
            L8a:
                r0 = r2
                r1 = r0
                r3 = r1
            L8d:
                if (r0 == 0) goto Le2
                if (r1 == 0) goto Le2
                if (r3 == 0) goto Le2
                java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                long r5 = r1.Y(r3, r4)
                r7 = 1000000000(0x3b9aca00, double:4.94065646E-315)
                long r5 = r5 * r7
                int r3 = r3.a()
                long r9 = (long) r3
                long r5 = r5 + r9
                int r3 = r1.a()
                long r9 = (long) r3
                long r5 = r5 - r9
                long r3 = r1.Y(r13, r4)
                long r3 = r3 * r7
                int r13 = r13.a()
                long r7 = (long) r13
                long r3 = r3 + r7
                int r13 = r1.a()
                long r7 = (long) r13
                long r3 = r3 - r7
                r7 = 4668350449676451840(0x40c9500000000000, double:12960.0)
                double r3 = (double) r3
                double r3 = r3 * r7
                double r5 = (double) r5
                double r3 = r3 / r5
                r5 = 4652464705678344192(0x4090e00000000000, double:1080.0)
                double r5 = r3 / r5
                double r5 = java.lang.Math.floor(r5)
                int r13 = (int) r5
                int r1 = r13 * 1080
                double r5 = (double) r1
                double r3 = r3 - r5
                double r3 = java.lang.Math.floor(r3)
                int r1 = (int) r3
                net.time4j.calendar.HebrewTime r3 = new net.time4j.calendar.HebrewTime
                if (r13 != 0) goto Lde
                r13 = 12
            Lde:
                r3.<init>(r0, r13, r1, r2)
                return r3
            Le2:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.HebrewTime.a.apply(net.time4j.d0):net.time4j.calendar.HebrewTime");
        }
    }

    static class b implements net.time4j.engine.t<net.time4j.d0, HebrewTime> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ net.time4j.tz.k f82023a;

        b(net.time4j.tz.k kVar) {
            this.f82023a = kVar;
        }

        @Override // net.time4j.engine.t
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HebrewTime apply(net.time4j.d0 d0Var) {
            net.time4j.m0 m02 = d0Var.j1(this.f82023a).m0();
            return new HebrewTime((m02.u() + 6) % 24, ((BigDecimal) m02.r(net.time4j.m0.K)).subtract(new BigDecimal(m02.u())).multiply(new BigDecimal(HebrewTime.f82007d)).intValue(), (a) null);
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82024a;

        static {
            int[] iArr = new int[i.values().length];
            f82024a = iArr;
            try {
                iArr[i.HOURS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82024a[i.HALAKIM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum d {
        NIGHT,
        DAY
    }

    private static class e implements net.time4j.engine.o0<HebrewTime> {

        /* renamed from: a, reason: collision with root package name */
        private final i f82025a;

        /* synthetic */ e(i iVar, a aVar) {
            this(iVar);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public HebrewTime b(HebrewTime hebrewTime, long j4) {
            int i4;
            int i5;
            if (j4 == 0) {
                return hebrewTime;
            }
            int i6 = c.f82024a[this.f82025a.ordinal()];
            if (i6 == 1) {
                int d5 = net.time4j.base.c.d(net.time4j.base.c.f(hebrewTime.f82018b, j4), 24);
                i4 = hebrewTime.f82019c;
                i5 = d5;
            } else {
                if (i6 != 2) {
                    throw new UnsupportedOperationException(this.f82025a.name());
                }
                long f4 = net.time4j.base.c.f(hebrewTime.f82019c, j4);
                i4 = net.time4j.base.c.d(f4, HebrewTime.f82007d);
                i5 = net.time4j.base.c.d(net.time4j.base.c.f(hebrewTime.f82018b, net.time4j.base.c.b(f4, HebrewTime.f82007d)), 24);
            }
            return new HebrewTime(i5, i4, (a) null);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(HebrewTime hebrewTime, HebrewTime hebrewTime2) {
            long l02 = hebrewTime2.l0() - hebrewTime.l0();
            int i4 = c.f82024a[this.f82025a.ordinal()];
            if (i4 == 1) {
                return l02 / 1080;
            }
            if (i4 == 2) {
                return l02;
            }
            throw new UnsupportedOperationException(this.f82025a.name());
        }

        private e(i iVar) {
            this.f82025a = iVar;
        }
    }

    private static class f implements net.time4j.engine.a0<HebrewTime, d> {
        private f() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HebrewTime hebrewTime) {
            return HebrewTime.f82012i;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HebrewTime hebrewTime) {
            return HebrewTime.f82012i;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public d getMaximum(HebrewTime hebrewTime) {
            return d.DAY;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public d getMinimum(HebrewTime hebrewTime) {
            return d.NIGHT;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public d getValue(HebrewTime hebrewTime) {
            return hebrewTime.f82018b < 12 ? d.NIGHT : d.DAY;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HebrewTime hebrewTime, d dVar) {
            return dVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HebrewTime withValue(HebrewTime hebrewTime, d dVar, boolean z4) {
            if (dVar != null) {
                return new HebrewTime(dVar, hebrewTime.h0(), hebrewTime.k0(), null);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("誥\u0001"));
        }

        f(a aVar) {
        }
    }

    private static class g implements net.time4j.engine.a0<HebrewTime, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82026b;

        g(int i4) {
            this.f82026b = i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HebrewTime hebrewTime) {
            return getChildAtFloor(hebrewTime);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HebrewTime hebrewTime) {
            int i4 = this.f82026b;
            if (i4 == 0 || i4 == 1) {
                return HebrewTime.f82014k;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(HebrewTime hebrewTime) {
            int i4 = this.f82026b;
            if (i4 == 0) {
                return 12;
            }
            if (i4 == 1) {
                return 23;
            }
            if (i4 == 2) {
                return 1079;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誦\u0001") + this.f82026b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(HebrewTime hebrewTime) {
            int i4 = this.f82026b;
            if (i4 == 0) {
                return 1;
            }
            if (i4 == 1 || i4 == 2) {
                return 0;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誦\u0001") + this.f82026b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(HebrewTime hebrewTime) {
            int i4 = this.f82026b;
            if (i4 == 0) {
                return Integer.valueOf(hebrewTime.h0());
            }
            if (i4 == 1) {
                return Integer.valueOf(hebrewTime.f82018b);
            }
            if (i4 == 2) {
                return Integer.valueOf(hebrewTime.f82019c);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誦\u0001") + this.f82026b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HebrewTime hebrewTime, Integer num) {
            return num != null && getMinimum(hebrewTime).compareTo(num) <= 0 && getMaximum(hebrewTime).compareTo(num) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HebrewTime withValue(HebrewTime hebrewTime, Integer num, boolean z4) {
            if (num == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("誧\u0001"));
            }
            int intValue = num.intValue();
            int i4 = this.f82026b;
            if (i4 == 0) {
                return z4 ? hebrewTime.W(net.time4j.base.c.l(intValue, hebrewTime.h0()), i.HOURS) : hebrewTime.o0() ? HebrewTime.u0(intValue, hebrewTime.f82019c) : HebrewTime.w0(intValue, hebrewTime.f82019c);
            }
            if (i4 == 1) {
                return z4 ? hebrewTime.W(net.time4j.base.c.l(intValue, hebrewTime.f82018b), i.HOURS) : HebrewTime.v0(intValue, hebrewTime.f82019c);
            }
            if (i4 == 2) {
                return z4 ? hebrewTime.W(net.time4j.base.c.l(intValue, hebrewTime.f82019c), i.HALAKIM) : HebrewTime.v0(hebrewTime.f82018b, intValue);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誦\u0001") + this.f82026b);
        }
    }

    private static class h implements net.time4j.engine.u<HebrewTime> {
        private h() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82721b;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public HebrewTime o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return HebrewTime.e0(G).apply(net.time4j.d0.y0(eVar.c()));
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public HebrewTime e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            int i4;
            o0<Integer, HebrewTime> o0Var = HebrewTime.f82014k;
            a aVar = null;
            if (rVar.w(o0Var)) {
                i4 = rVar.l(o0Var);
                if (i4 < 0 || i4 >= HebrewTime.f82007d) {
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("誨\u0001") + i4);
                    return null;
                }
            } else {
                i4 = 0;
            }
            net.time4j.engine.q<?> qVar = HebrewTime.f82011h;
            if (rVar.w(qVar)) {
                o0<Integer, HebrewTime> o0Var2 = HebrewTime.f82012i;
                if (rVar.w(o0Var2)) {
                    d dVar2 = (d) rVar.r(qVar);
                    int l4 = rVar.l(o0Var2);
                    if (l4 >= 1 && l4 <= 12) {
                        return new HebrewTime(dVar2, l4, i4, aVar);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("誩\u0001") + l4);
                    return null;
                }
            }
            o0<Integer, HebrewTime> o0Var3 = HebrewTime.f82013j;
            if (!rVar.w(o0Var3)) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("誫\u0001"));
                return null;
            }
            int l5 = rVar.l(o0Var3);
            if (l5 >= 0 && l5 <= 23) {
                return new HebrewTime(l5, i4, aVar);
            }
            rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("說\u0001") + l5);
            return null;
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(HebrewTime hebrewTime, net.time4j.engine.d dVar) {
            return hebrewTime;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return 100;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("説\u0001"));
        }

        h(a aVar) {
        }
    }

    public enum i implements net.time4j.engine.w {
        HOURS(3600.0d),
        HALAKIM(3.3333333333333335d);

        private final transient double length;

        i(double d5) {
            this.length = d5;
        }

        public int between(HebrewTime hebrewTime, HebrewTime hebrewTime2) {
            return (int) hebrewTime.Y(hebrewTime2, this);
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

    private static class j implements net.time4j.engine.v<HebrewTime> {

        /* renamed from: b, reason: collision with root package name */
        private final i f82027b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f82028c;

        /* synthetic */ j(i iVar, boolean z4, a aVar) {
            this(iVar, z4);
        }

        @Override // net.time4j.engine.v
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public HebrewTime apply(HebrewTime hebrewTime) {
            return hebrewTime.W(this.f82028c ? -1L : 1L, this.f82027b);
        }

        private j(i iVar, boolean z4) {
            this.f82027b = iVar;
            this.f82028c = z4;
        }
    }

    static {
        boolean z4 = false;
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("誯\u0001"), HebrewTime.class, d.class, (char) 0);
        f82011h = iVar;
        i iVar2 = i.HOURS;
        boolean z5 = true;
        a aVar = null;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("誰\u0001"), HebrewTime.class, 1, 12, 'h', new j(iVar2, z5, aVar), new j(iVar2, z4, aVar));
        f82012i = jVar;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("誱\u0001"), HebrewTime.class, 0, 23, 'H', new j(iVar2, z5, aVar), new j(iVar2, z4, aVar));
        f82013j = jVar2;
        i iVar3 = i.HALAKIM;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("課\u0001"), HebrewTime.class, 0, 1079, 'P', new j(iVar3, z5, aVar), new j(iVar3, z4, aVar));
        f82014k = jVar3;
        HebrewTime hebrewTime = new HebrewTime(0, 0);
        f82015l = hebrewTime;
        HebrewTime hebrewTime2 = new HebrewTime(23, 1079);
        f82016m = hebrewTime2;
        j0.c g4 = j0.c.n(i.class, HebrewTime.class, new h(), hebrewTime, hebrewTime2).f(iVar, new f()).g(jVar, new g(0), iVar2).g(jVar2, new g(1), iVar2).g(jVar3, new g(2), iVar3);
        z0(g4);
        f82017n = g4.c();
    }

    /* synthetic */ HebrewTime(int i4, int i5, a aVar) {
        this(i4, i5);
    }

    public static net.time4j.engine.t<net.time4j.d0, HebrewTime> d0(net.time4j.calendar.astro.j jVar) {
        return new a(jVar);
    }

    public static net.time4j.engine.t<net.time4j.d0, HebrewTime> e0(net.time4j.tz.k kVar) {
        return new b(kVar);
    }

    public static net.time4j.engine.j0<i, HebrewTime> f0() {
        return f82017n;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int l0() {
        return (this.f82018b * f82007d) + this.f82019c;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("誵\u0001"));
    }

    public static HebrewTime s0(net.time4j.calendar.astro.j jVar) {
        return new a(jVar).apply(w0.b());
    }

    public static HebrewTime t0() {
        return (HebrewTime) w0.g().f(f82017n);
    }

    public static HebrewTime u0(int i4, int i5) {
        return new HebrewTime(d.DAY, i4, i5);
    }

    public static HebrewTime v0(int i4, int i5) {
        if (i4 < 0 || i4 > 23) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("誶\u0001"), i4));
        }
        if (i5 < 0 || i5 >= f82007d) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("誳\u0001"), i5));
        }
        return new HebrewTime(i4, i5);
    }

    public static HebrewTime w0(int i4, int i5) {
        return new HebrewTime(d.NIGHT, i4, i5);
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    private static void z0(j0.c<i, HebrewTime> cVar) {
        EnumSet allOf = EnumSet.allOf(i.class);
        for (i iVar : i.values()) {
            cVar.j(iVar, new e(iVar, null), iVar.getLength(), allOf);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<i, HebrewTime> y() {
        return f82017n;
    }

    @Override // net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof HebrewTime) && l0() == ((HebrewTime) obj).l0();
    }

    @Override // net.time4j.engine.m0, java.lang.Comparable
    /* renamed from: g0, reason: merged with bridge method [inline-methods] */
    public int compareTo(HebrewTime hebrewTime) {
        return l0() - hebrewTime.l0();
    }

    public int h0() {
        int i4 = this.f82018b;
        if (o0()) {
            i4 -= 12;
        }
        if (i4 == 0) {
            return 12;
        }
        return i4;
    }

    @Override // net.time4j.engine.m0
    public int hashCode() {
        return l0();
    }

    protected HebrewTime i0() {
        return this;
    }

    public int j0() {
        return this.f82018b;
    }

    public int k0() {
        return this.f82019c;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: m0, reason: merged with bridge method [inline-methods] */
    public boolean s(HebrewTime hebrewTime) {
        return l0() > hebrewTime.l0();
    }

    @Override // net.time4j.engine.i0
    /* renamed from: n0, reason: merged with bridge method [inline-methods] */
    public boolean f(HebrewTime hebrewTime) {
        return l0() < hebrewTime.l0();
    }

    public boolean o0() {
        return this.f82018b >= 12;
    }

    public boolean p0() {
        return this.f82018b < 12;
    }

    @Override // net.time4j.engine.i0
    /* renamed from: r0, reason: merged with bridge method [inline-methods] */
    public boolean k(HebrewTime hebrewTime) {
        return l0() == hebrewTime.l0();
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f82018b);
        sb.append('H');
        return androidx.view.e.a(sb, this.f82019c, 'P');
    }

    public net.time4j.d0 x0(HebrewCalendar hebrewCalendar, net.time4j.calendar.astro.j jVar) {
        net.time4j.d0 apply;
        HebrewTime hebrewTime;
        net.time4j.d0 d0Var;
        net.time4j.l0 l0Var = (net.time4j.l0) hebrewCalendar.l0(net.time4j.l0.class);
        if (p0()) {
            d0Var = jVar.N().apply(l0Var.g0(net.time4j.engine.i.f82737c));
            apply = jVar.L().apply(l0Var);
            hebrewTime = this;
        } else {
            HebrewTime U = U(12L, i.HOURS);
            net.time4j.d0 apply2 = jVar.L().apply(l0Var);
            apply = jVar.N().apply(l0Var);
            hebrewTime = U;
            d0Var = apply2;
        }
        if (d0Var == null || apply == null) {
            return null;
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        int Y = (int) d0Var.Y(apply, timeUnit);
        if (d0Var.a() > apply.a()) {
            Y--;
        }
        return d0Var.W((long) Math.floor((hebrewTime.l0() * Y) / 12960.0d), timeUnit);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82017n;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public net.time4j.d0 y0(HebrewCalendar hebrewCalendar, net.time4j.tz.l lVar) {
        net.time4j.m0 m0Var = (net.time4j.m0) net.time4j.m0.a1(18).M(net.time4j.m0.K, new BigDecimal(this.f82019c).setScale(15, RoundingMode.UNNECESSARY).divide(new BigDecimal(f82007d), RoundingMode.FLOOR).add(new BigDecimal((this.f82018b + 18) % 24)));
        hebrewCalendar.getClass();
        return net.time4j.u.h(hebrewCalendar, m0Var).b(lVar, net.time4j.engine.g0.f82721b);
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    /* synthetic */ HebrewTime(d dVar, int i4, int i5, a aVar) {
        this(dVar, i4, i5);
    }

    private HebrewTime(d dVar, int i4, int i5) {
        if (i4 < 1 || i4 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("誴\u0001"), i4));
        }
        if (i5 >= 0 && i5 < f82007d) {
            i4 = i4 == 12 ? 0 : i4;
            this.f82018b = dVar.equals(d.NIGHT) ? i4 : i4 + 12;
            this.f82019c = i5;
            return;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("誳\u0001"), i5));
    }

    private HebrewTime(int i4, int i5) {
        this.f82018b = i4;
        this.f82019c = i5;
    }
}
