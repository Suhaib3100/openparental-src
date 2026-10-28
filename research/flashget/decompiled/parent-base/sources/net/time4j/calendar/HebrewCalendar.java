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
import java.util.List;
import java.util.Locale;
import net.time4j.calendar.d;
import net.time4j.calendar.r0;
import net.time4j.calendar.u;
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("hebrew")
/* loaded from: classes7.dex */
public final class HebrewCalendar extends net.time4j.engine.n<k, HebrewCalendar> implements net.time4j.format.h {

    /* renamed from: e, reason: collision with root package name */
    private static final long f81978e = ((Long) net.time4j.l0.r1(-3760, 9, 7).r(net.time4j.engine.b0.RATA_DIE)).longValue();

    /* renamed from: f, reason: collision with root package name */
    private static final int f81979f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f81980g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f81981h = 3;

    /* renamed from: i, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<t> f81982i;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, HebrewCalendar> f81983j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<u, HebrewCalendar> f81984k;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, HebrewCalendar> f81985l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, HebrewCalendar> f81986m;

    /* renamed from: n, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, HebrewCalendar> f81987n;

    /* renamed from: o, reason: collision with root package name */
    private static final r0<HebrewCalendar> f81988o;

    /* renamed from: p, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<HebrewCalendar> f81989p;

    /* renamed from: q, reason: collision with root package name */
    private static final o<HebrewCalendar> f81990q;

    /* renamed from: r, reason: collision with root package name */
    private static final net.time4j.engine.j0<k, HebrewCalendar> f81991r;

    /* renamed from: s, reason: collision with root package name */
    public static final o0<g1, HebrewCalendar> f81992s;
    private static final long serialVersionUID = -4183006723190472312L;

    /* renamed from: t, reason: collision with root package name */
    public static final o0<Integer, HebrewCalendar> f81993t;

    /* renamed from: u, reason: collision with root package name */
    public static final o0<Integer, HebrewCalendar> f81994u;

    /* renamed from: v, reason: collision with root package name */
    public static final o0<Integer, HebrewCalendar> f81995v;

    /* renamed from: w, reason: collision with root package name */
    public static final o0<Integer, HebrewCalendar> f81996w;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f81997b;

    /* renamed from: c, reason: collision with root package name */
    private final transient u f81998c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f81999d;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82000c = 12;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82001b;

        public SPX() {
        }

        private HebrewCalendar a(ObjectInput objectInput) throws IOException {
            return HebrewCalendar.W0(objectInput.readInt(), u.valueOf(objectInput.readByte()), objectInput.readByte());
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            HebrewCalendar hebrewCalendar = (HebrewCalendar) this.f82001b;
            objectOutput.writeInt(hebrewCalendar.o());
            objectOutput.writeByte(hebrewCalendar.F0().getValue());
            objectOutput.writeByte(hebrewCalendar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82001b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 12) {
                throw new InvalidObjectException(ProtectedSandApp.s("誃\u0001"));
            }
            this.f82001b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(12);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82001b = obj;
        }
    }

    static class a extends net.time4j.calendar.service.i<u, HebrewCalendar> {
        a(String str, Class cls, Class cls2, char c5) {
            super(str, cls, cls2, c5);
        }

        @Override // net.time4j.calendar.service.i
        protected boolean F(net.time4j.engine.p pVar) {
            return HebrewCalendar.L0(pVar.l(HebrewCalendar.f81983j));
        }

        @Override // net.time4j.calendar.service.i, net.time4j.format.l
        /* renamed from: S, reason: merged with bridge method [inline-methods] */
        public int w(u uVar, net.time4j.engine.p pVar, net.time4j.engine.d dVar) {
            int i4 = c.f82002a[((u.a) dVar.b(u.order(), u.a.CIVIL)).ordinal()];
            return i4 != 1 ? i4 != 2 ? b0(uVar) : uVar.getBiblicalValue(F(pVar)) : uVar.getCivilValue(F(pVar));
        }

        @Override // net.time4j.calendar.service.i, net.time4j.format.l
        public boolean i0(net.time4j.engine.r<?> rVar, int i4) {
            if (i4 < 1 || i4 > 13) {
                return false;
            }
            rVar.K(i.INSTANCE, i4);
            return true;
        }
    }

    static class b implements net.time4j.engine.t<HebrewCalendar, net.time4j.engine.l<HebrewCalendar>> {
        b() {
        }

        public net.time4j.engine.l<HebrewCalendar> a(HebrewCalendar hebrewCalendar) {
            return HebrewCalendar.f81990q;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<HebrewCalendar> apply(HebrewCalendar hebrewCalendar) {
            return HebrewCalendar.f81990q;
        }
    }

    static /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82002a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f82003b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f82004c;

        static {
            int[] iArr = new int[k.values().length];
            f82004c = iArr;
            try {
                iArr[k.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82004c[k.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82004c[k.WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82004c[k.DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[u.values().length];
            f82003b = iArr2;
            try {
                iArr2[u.IYAR.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82003b[u.TAMUZ.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82003b[u.ELUL.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82003b[u.TEVET.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f82003b[u.ADAR_II.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f82003b[u.HESHVAN.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f82003b[u.KISLEV.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr3 = new int[u.a.values().length];
            f82002a = iArr3;
            try {
                iArr3[u.a.CIVIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f82002a[u.a.BIBLICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    private static class d implements net.time4j.engine.a0<HebrewCalendar, t> {
        private d() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HebrewCalendar hebrewCalendar) {
            return HebrewCalendar.f81983j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HebrewCalendar hebrewCalendar) {
            return HebrewCalendar.f81983j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public t getMaximum(HebrewCalendar hebrewCalendar) {
            return t.ANNO_MUNDI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public t getMinimum(HebrewCalendar hebrewCalendar) {
            return t.ANNO_MUNDI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public t getValue(HebrewCalendar hebrewCalendar) {
            return t.ANNO_MUNDI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HebrewCalendar hebrewCalendar, t tVar) {
            return tVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HebrewCalendar withValue(HebrewCalendar hebrewCalendar, t tVar, boolean z4) {
            if (tVar != null) {
                return hebrewCalendar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("誅\u0001"));
        }

        d(a aVar) {
        }
    }

    private static class e implements net.time4j.engine.o0<HebrewCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final k f82005a;

        e(k kVar) {
            this.f82005a = kVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public HebrewCalendar b(HebrewCalendar hebrewCalendar, long j4) {
            int i4;
            int i5 = c.f82004c[this.f82005a.ordinal()];
            if (i5 == 1) {
                int g4 = net.time4j.base.c.g(net.time4j.base.c.f(hebrewCalendar.f81997b, j4));
                if (g4 < 1 || g4 > 9999) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("誆\u0001"), g4));
                }
                u uVar = hebrewCalendar.f81998c;
                if (uVar == u.ADAR_I && !HebrewCalendar.L0(g4)) {
                    uVar = u.SHEVAT;
                }
                return new HebrewCalendar(g4, uVar, Math.min(hebrewCalendar.f81999d, HebrewCalendar.R0(g4, uVar)), null);
            }
            if (i5 != 2) {
                if (i5 == 3) {
                    j4 = net.time4j.base.c.i(j4, 7L);
                } else if (i5 != 4) {
                    throw new UnsupportedOperationException(this.f82005a.name());
                }
                return (HebrewCalendar) HebrewCalendar.f81990q.e(net.time4j.base.c.f(HebrewCalendar.f81990q.f(hebrewCalendar), j4));
            }
            int i6 = hebrewCalendar.f81997b;
            int value = hebrewCalendar.f81998c.getValue();
            for (long abs = Math.abs(j4); abs > 0; abs--) {
                if (j4 > 0) {
                    i4 = value + 1;
                    if (i4 != 6 || HebrewCalendar.L0(i6)) {
                        if (i4 == 14) {
                            i6++;
                            value = 1;
                        }
                        value = i4;
                    } else {
                        value += 2;
                    }
                } else {
                    i4 = value - 1;
                    if (i4 != 6 || HebrewCalendar.L0(i6)) {
                        if (i4 == 0) {
                            i6--;
                            value = 13;
                        }
                        value = i4;
                    } else {
                        value -= 2;
                    }
                }
            }
            u valueOf = u.valueOf(value);
            return HebrewCalendar.W0(i6, valueOf, Math.min(hebrewCalendar.f81999d, HebrewCalendar.R0(i6, valueOf)));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(HebrewCalendar hebrewCalendar, HebrewCalendar hebrewCalendar2) {
            HebrewCalendar hebrewCalendar3;
            HebrewCalendar hebrewCalendar4;
            int i4 = c.f82004c[this.f82005a.ordinal()];
            if (i4 == 1) {
                int i5 = hebrewCalendar2.f81997b - hebrewCalendar.f81997b;
                if (i5 > 0) {
                    if (hebrewCalendar2.f81998c.getValue() < hebrewCalendar.f81998c.getValue() || (hebrewCalendar2.f81998c.getValue() == hebrewCalendar.f81998c.getValue() && hebrewCalendar2.f81999d < hebrewCalendar.f81999d)) {
                        i5--;
                    }
                } else if (i5 < 0 && (hebrewCalendar2.f81998c.getValue() > hebrewCalendar.f81998c.getValue() || (hebrewCalendar2.f81998c.getValue() == hebrewCalendar.f81998c.getValue() && hebrewCalendar2.f81999d > hebrewCalendar.f81999d))) {
                    i5++;
                }
                return i5;
            }
            if (i4 != 2) {
                if (i4 == 3) {
                    return k.DAYS.between(hebrewCalendar, hebrewCalendar2) / 7;
                }
                if (i4 == 4) {
                    return HebrewCalendar.f81990q.f(hebrewCalendar2) - HebrewCalendar.f81990q.f(hebrewCalendar);
                }
                throw new UnsupportedOperationException(this.f82005a.name());
            }
            boolean s4 = hebrewCalendar.s(hebrewCalendar2);
            if (s4) {
                hebrewCalendar4 = hebrewCalendar;
                hebrewCalendar3 = hebrewCalendar2;
            } else {
                hebrewCalendar3 = hebrewCalendar;
                hebrewCalendar4 = hebrewCalendar2;
            }
            int i6 = hebrewCalendar3.f81997b;
            int value = hebrewCalendar3.f81998c.getValue();
            int i7 = 0;
            while (true) {
                if (i6 < hebrewCalendar4.f81997b || (i6 == hebrewCalendar4.f81997b && value < hebrewCalendar4.f81998c.getValue())) {
                    int i10 = value + 1;
                    i7++;
                    if (i10 == 6 && !HebrewCalendar.L0(i6)) {
                        value += 2;
                    } else if (i10 == 14) {
                        i6++;
                        value = 1;
                    } else {
                        value = i10;
                    }
                }
            }
            if (i7 > 0 && hebrewCalendar3.f81999d > hebrewCalendar4.f81999d) {
                i7--;
            }
            if (s4) {
                i7 = -i7;
            }
            return i7;
        }
    }

    private static class f implements net.time4j.engine.e0<HebrewCalendar> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82006b;

        f(int i4) {
            this.f82006b = i4;
        }

        private int g(HebrewCalendar hebrewCalendar) {
            int i4 = this.f82006b;
            if (i4 == 0) {
                return org.threeten.bp.chrono.m.f87989n;
            }
            if (i4 == 2) {
                return HebrewCalendar.R0(hebrewCalendar.f81997b, hebrewCalendar.f81998c);
            }
            if (i4 == 3) {
                return HebrewCalendar.T0(hebrewCalendar.f81997b);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誇\u0001") + this.f82006b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HebrewCalendar hebrewCalendar) {
            if (this.f82006b == 0) {
                return HebrewCalendar.f81984k;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HebrewCalendar hebrewCalendar) {
            if (this.f82006b == 0) {
                return HebrewCalendar.f81984k;
            }
            return null;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(HebrewCalendar hebrewCalendar) {
            int i4 = this.f82006b;
            if (i4 == 0) {
                return hebrewCalendar.f81997b;
            }
            if (i4 == 2) {
                return hebrewCalendar.f81999d;
            }
            if (i4 != 3) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("誇\u0001") + this.f82006b);
            }
            boolean L0 = HebrewCalendar.L0(hebrewCalendar.f81997b);
            int i5 = 0;
            for (int i6 = 1; i6 < hebrewCalendar.f81998c.getValue(); i6++) {
                if (L0 || i6 != 6) {
                    i5 += HebrewCalendar.f81990q.b(t.ANNO_MUNDI, hebrewCalendar.f81997b, i6);
                }
            }
            return i5 + hebrewCalendar.f81999d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(HebrewCalendar hebrewCalendar) {
            return Integer.valueOf(g(hebrewCalendar));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(HebrewCalendar hebrewCalendar) {
            int i4 = this.f82006b;
            if (i4 == 0 || i4 == 2 || i4 == 3) {
                return 1;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誇\u0001") + this.f82006b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getValue(HebrewCalendar hebrewCalendar) {
            return Integer.valueOf(d(hebrewCalendar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean e(HebrewCalendar hebrewCalendar, int i4) {
            return i4 <= g(hebrewCalendar) && 1 <= i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean j(HebrewCalendar hebrewCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return getMinimum(hebrewCalendar).compareTo(num) <= 0 && getMaximum(hebrewCalendar).compareTo(num) >= 0;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public HebrewCalendar a(HebrewCalendar hebrewCalendar, int i4, boolean z4) {
            if (!e(hebrewCalendar, i4)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("誈\u0001"), i4));
            }
            int i5 = this.f82006b;
            if (i5 == 0) {
                return HebrewCalendar.W0(i4, hebrewCalendar.F0(), Math.min(hebrewCalendar.f81999d, HebrewCalendar.f81990q.b(t.ANNO_MUNDI, i4, hebrewCalendar.f81998c.getValue())));
            }
            if (i5 == 2) {
                return new HebrewCalendar(hebrewCalendar.f81997b, hebrewCalendar.f81998c, i4, null);
            }
            if (i5 == 3) {
                return hebrewCalendar.h0(net.time4j.engine.i.i(i4 - d(hebrewCalendar)));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("誇\u0001") + this.f82006b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public HebrewCalendar withValue(HebrewCalendar hebrewCalendar, Integer num, boolean z4) {
            if (num != null) {
                return a(hebrewCalendar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("誉\u0001"));
        }
    }

    private static class g implements net.time4j.engine.u<HebrewCalendar> {
        private g() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82721b;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public HebrewCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (HebrewCalendar) net.time4j.d0.y0(eVar.c()).d1(HebrewCalendar.f81991r, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public HebrewCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            u uVar;
            int l4 = rVar.l(HebrewCalendar.f81983j);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("誊\u0001"));
                return null;
            }
            i iVar = i.INSTANCE;
            int i4 = 1;
            if (rVar.w(iVar)) {
                int l5 = rVar.l(iVar);
                int i5 = c.f82002a[((u.a) dVar.b(u.order(), u.a.CIVIL)).ordinal()];
                uVar = i5 != 1 ? i5 != 2 ? u.valueOf(l5) : u.valueOfBiblical(l5, HebrewCalendar.L0(l4)) : u.valueOfCivil(l5, HebrewCalendar.L0(l4));
            } else {
                o0<u, HebrewCalendar> o0Var = HebrewCalendar.f81984k;
                uVar = rVar.w(o0Var) ? (u) rVar.r(o0Var) : null;
            }
            String s4 = ProtectedSandApp.s("誋\u0001");
            if (uVar != null) {
                int l6 = rVar.l(HebrewCalendar.f81985l);
                if (l6 != Integer.MIN_VALUE) {
                    if (HebrewCalendar.f81990q.c(t.ANNO_MUNDI, l4, uVar.getValue(), l6)) {
                        return HebrewCalendar.W0(l4, uVar, l6);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            } else {
                int l7 = rVar.l(HebrewCalendar.f81986m);
                if (l7 != Integer.MIN_VALUE) {
                    if (l7 > 0) {
                        boolean L0 = HebrewCalendar.L0(l4);
                        int i6 = 0;
                        while (i4 <= 13) {
                            if (i4 != 6 || L0) {
                                int R0 = HebrewCalendar.R0(l4, u.valueOf(i4)) + i6;
                                if (l7 <= R0) {
                                    return HebrewCalendar.W0(l4, u.valueOf(i4), l7 - i6);
                                }
                                i4++;
                                i6 = R0;
                            }
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
        public net.time4j.engine.p k(HebrewCalendar hebrewCalendar, net.time4j.engine.d dVar) {
            return hebrewCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return HebrewCalendar.U0().o() + 20;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("誌\u0001"), zVar, locale);
        }

        g(a aVar) {
        }
    }

    private static class h implements net.time4j.engine.a0<HebrewCalendar, u> {
        private h() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(HebrewCalendar hebrewCalendar) {
            return HebrewCalendar.f81985l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(HebrewCalendar hebrewCalendar) {
            return HebrewCalendar.f81985l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public u getMaximum(HebrewCalendar hebrewCalendar) {
            return u.ELUL;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public u getMinimum(HebrewCalendar hebrewCalendar) {
            return u.TISHRI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public u getValue(HebrewCalendar hebrewCalendar) {
            return hebrewCalendar.f81998c;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(HebrewCalendar hebrewCalendar, u uVar) {
            return uVar != null && (uVar != u.ADAR_I || hebrewCalendar.K0());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HebrewCalendar withValue(HebrewCalendar hebrewCalendar, u uVar, boolean z4) {
            if (uVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("誎\u0001"));
            }
            if (uVar != u.ADAR_I || hebrewCalendar.K0()) {
                return new HebrewCalendar(hebrewCalendar.f81997b, uVar, Math.min(hebrewCalendar.f81999d, HebrewCalendar.R0(hebrewCalendar.f81997b, uVar)), null);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("認\u0001") + hebrewCalendar);
        }

        h(a aVar) {
        }
    }

    private enum i implements net.time4j.engine.q<Integer> {
        INSTANCE;

        @Override // net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            return name();
        }

        @Override // net.time4j.engine.q
        public char getSymbol() {
            return (char) 0;
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
        public boolean isLenient() {
            return false;
        }

        @Override // net.time4j.engine.q
        public boolean isTimeElement() {
            return false;
        }

        @Override // java.util.Comparator
        public int compare(net.time4j.engine.p pVar, net.time4j.engine.p pVar2) {
            return ((Integer) pVar.r(this)).compareTo((Integer) pVar2.r(this));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.q
        public Integer getDefaultMaximum() {
            return 13;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // net.time4j.engine.q
        public Integer getDefaultMinimum() {
            return 1;
        }
    }

    private static class j implements o<HebrewCalendar> {
        private j() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(t.ANNO_MUNDI);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            if (jVar != t.ANNO_MUNDI) {
                throw new IllegalArgumentException(ProtectedSandApp.s("誒\u0001") + jVar);
            }
            if (i4 >= 1 && i4 <= 9999 && i5 >= 1 && i5 <= 13) {
                return HebrewCalendar.R0(i4, u.valueOf(i5));
            }
            StringBuilder a5 = androidx.collection.s.a(ProtectedSandApp.s("誐\u0001"), i4, ProtectedSandApp.s("誑\u0001"));
            a5.append(u.valueOf(i5));
            throw new IllegalArgumentException(a5.toString());
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            return jVar == t.ANNO_MUNDI && i4 >= 1 && i4 <= 9999 && i5 >= 1 && i5 <= 13 && i6 >= 1 && i6 <= b(jVar, i4, i5);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return f(new HebrewCalendar(org.threeten.bp.chrono.m.f87989n, u.ELUL, 29, null));
        }

        @Override // net.time4j.engine.l
        public long g() {
            int i4 = 1;
            return f(new HebrewCalendar(i4, u.TISHRI, i4, null));
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            if (jVar != t.ANNO_MUNDI) {
                throw new IllegalArgumentException(ProtectedSandApp.s("誒\u0001") + jVar);
            }
            if (i4 < 1 || i4 > 9999) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("誐\u0001"), i4));
            }
            return HebrewCalendar.T0(i4);
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(HebrewCalendar hebrewCalendar) {
            long transform = (net.time4j.engine.b0.UTC.transform(HebrewCalendar.J0(hebrewCalendar.f81997b), net.time4j.engine.b0.RATA_DIE) + hebrewCalendar.f81999d) - 1;
            boolean L0 = HebrewCalendar.L0(hebrewCalendar.f81997b);
            int value = hebrewCalendar.f81998c.getValue();
            for (int i4 = 1; i4 < value; i4++) {
                if (L0 || i4 != 6) {
                    transform += HebrewCalendar.R0(hebrewCalendar.f81997b, u.valueOf(i4));
                }
            }
            return transform;
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public HebrewCalendar e(long j4) {
            long transform = net.time4j.engine.b0.RATA_DIE.transform(j4, net.time4j.engine.b0.UTC);
            int b5 = (int) net.time4j.base.c.b((transform - HebrewCalendar.f81978e) * 98496, 35975351);
            int i4 = b5 - 1;
            while (HebrewCalendar.J0(b5) <= transform) {
                i4 = b5;
                b5++;
            }
            long J0 = transform - (HebrewCalendar.J0(i4) - 1);
            boolean L0 = HebrewCalendar.L0(i4);
            int i5 = 1;
            for (int i6 = 1; i6 < 13; i6++) {
                if (i6 != 6 || L0) {
                    long R0 = J0 - HebrewCalendar.R0(i4, u.valueOf(i6));
                    if (R0 <= 0) {
                        break;
                    }
                    i5 = i6 + 1;
                    J0 = R0;
                } else {
                    i5 = i6 + 1;
                }
            }
            return HebrewCalendar.W0(i4, u.valueOf(i5), (int) J0);
        }

        j(a aVar) {
        }
    }

    public enum k implements net.time4j.engine.w {
        YEARS(3.155732352E7d),
        MONTHS(2592000.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        k(double d5) {
            this.length = d5;
        }

        public int between(HebrewCalendar hebrewCalendar, HebrewCalendar hebrewCalendar2) {
            return (int) hebrewCalendar.Y(hebrewCalendar2, this);
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
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("誗\u0001"), HebrewCalendar.class, t.class, 'G');
        f81982i = iVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("誘\u0001"), HebrewCalendar.class, 1, org.threeten.bp.chrono.m.f87989n, 'y', null, null);
        f81983j = jVar;
        a aVar = new a(ProtectedSandApp.s("誙\u0001"), HebrewCalendar.class, u.class, 'M');
        f81984k = aVar;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("誚\u0001"), HebrewCalendar.class, 1, 30, 'd');
        f81985l = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("誛\u0001"), HebrewCalendar.class, 1, 355, 'D');
        f81986m = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(HebrewCalendar.class, D0());
        f81987n = kVar;
        r0<HebrewCalendar> r0Var = new r0<>(HebrewCalendar.class, jVar2, kVar);
        f81988o = r0Var;
        f81989p = r0Var;
        j jVar4 = new j();
        f81990q = jVar4;
        j0.c f4 = j0.c.m(k.class, HebrewCalendar.class, new g(), jVar4).f(iVar, new d());
        f fVar = new f(0);
        k kVar2 = k.YEARS;
        j0.c g4 = f4.g(jVar, fVar, kVar2);
        h hVar = new h();
        k kVar3 = k.MONTHS;
        j0.c g5 = g4.g(aVar, hVar, kVar3);
        f fVar2 = new f(2);
        k kVar4 = k.DAYS;
        j0.c j4 = g5.g(jVar2, fVar2, kVar4).g(jVar3, new f(3), kVar4).g(kVar, new s0(D0(), new b()), kVar4).f(r0Var, new r0.a(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(jVar4, jVar3)).j(kVar2, new e(kVar2), kVar2.getLength(), Collections.singleton(kVar3)).j(kVar3, new e(kVar3), kVar3.getLength(), Collections.singleton(kVar2));
        k kVar5 = k.WEEKS;
        net.time4j.engine.j0<k, HebrewCalendar> c5 = j4.j(kVar5, new e(kVar5), kVar5.getLength(), Collections.singleton(kVar4)).j(kVar4, new e(kVar4), kVar4.getLength(), Collections.singleton(kVar5)).h(new d.h(HebrewCalendar.class, jVar2, jVar3, D0())).c();
        f81991r = c5;
        f81992s = net.time4j.calendar.d.i(c5, D0());
        f81993t = net.time4j.calendar.d.k(c5, D0());
        f81994u = net.time4j.calendar.d.j(c5, D0());
        f81995v = net.time4j.calendar.d.d(c5, D0());
        f81996w = net.time4j.calendar.d.c(c5, D0());
    }

    /* synthetic */ HebrewCalendar(int i4, u uVar, int i5, a aVar) {
        this(i4, uVar, i5);
    }

    public static i1 D0() {
        return i1.m(g1.SUNDAY, 1, g1.FRIDAY, g1.SATURDAY);
    }

    private static int G0(int i4) {
        int floor = (int) Math.floor((I0(i4, u.TISHRI) - f81978e) + 0.5d);
        int i5 = floor + 1;
        return (i5 * 3) % 7 < 3 ? i5 : floor;
    }

    private static int H0(int i4) {
        int G0 = G0(i4);
        if (G0(i4 + 1) - G0 == 356) {
            return 2;
        }
        return G0 - G0(i4 - 1) == 382 ? 1 : 0;
    }

    private static double I0(int i4, u uVar) {
        int value = uVar.getValue();
        int i5 = value + 6;
        if (i5 > 13) {
            i5 = value - 7;
        }
        if (i5 < 7) {
            i4++;
        }
        return ((net.time4j.base.c.a((i4 * 235) - 234, 19) + (i5 - 7)) * 29.53059413580247d) + (f81978e - 0.033796296296296297d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long J0(int i4) {
        return f81978e + G0(i4) + H0(i4);
    }

    public static boolean L0(int i4) {
        if (i4 >= 0) {
            return ((i4 * 7) + 1) % 19 < 7;
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("誜\u0001"), i4));
    }

    public static boolean P0(int i4, u uVar, int i5) {
        return f81990q.c(t.ANNO_MUNDI, i4, uVar.getValue(), i5);
    }

    static int R0(int i4, u uVar) {
        switch (c.f82003b[uVar.ordinal()]) {
            case 6:
                int T0 = T0(i4);
                if (T0 == 355 || T0 == 385) {
                    break;
                }
                break;
            case 7:
                int T02 = T0(i4);
                if (T02 != 353 && T02 != 383) {
                    break;
                }
                break;
        }
        return 30;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int T0(int i4) {
        return (int) (J0(i4 + 1) - J0(i4));
    }

    public static HebrewCalendar U0() {
        return (HebrewCalendar) w0.g().f(f81991r);
    }

    public static HebrewCalendar V0(net.time4j.engine.g0 g0Var) {
        return (HebrewCalendar) w0.b().d1(f81991r, net.time4j.tz.l.e0().G(), g0Var).m();
    }

    public static HebrewCalendar W0(int i4, u uVar, int i5) {
        if (f81990q.c(t.ANNO_MUNDI, i4, uVar.getValue(), i5)) {
            return new HebrewCalendar(i4, uVar, i5);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("誝\u0001") + i4 + ProtectedSandApp.s("語\u0001") + uVar + ProtectedSandApp.s("誟\u0001") + i5);
    }

    public static HebrewCalendar X0(int i4, int i5, int i6) {
        return W0(i4, u.valueOfBiblical(i5, L0(i4)), i6);
    }

    public static HebrewCalendar Y0(int i4, int i5, int i6) {
        return W0(i4, u.valueOfCivil(i5, L0(i4)), i6);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("誠\u0001"));
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public static net.time4j.engine.j0<k, HebrewCalendar> x0() {
        return f81991r;
    }

    protected HebrewCalendar A0() {
        return this;
    }

    public g1 B0() {
        return g1.valueOf(net.time4j.base.c.d(f81990q.f(this) + 5, 7) + 1);
    }

    public int C0() {
        return l(f81986m);
    }

    public t E0() {
        return t.ANNO_MUNDI;
    }

    public u F0() {
        return this.f81998c;
    }

    public boolean K0() {
        return L0(this.f81997b);
    }

    public boolean N0() {
        int i4 = this.f81999d;
        return (i4 == 1 && this.f81998c != u.TISHRI) || i4 == 30;
    }

    public boolean O0() {
        return this.f81997b % 7 == 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<k, HebrewCalendar> y() {
        return f81991r;
    }

    public int Q0() {
        return R0(this.f81997b, this.f81998c);
    }

    public int S0() {
        return T0(this.f81997b);
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HebrewCalendar)) {
            return false;
        }
        HebrewCalendar hebrewCalendar = (HebrewCalendar) obj;
        return this.f81999d == hebrewCalendar.f81999d && this.f81998c == hebrewCalendar.f81998c && this.f81997b == hebrewCalendar.f81997b;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f81997b * 37) + (this.f81998c.getValue() * 31) + (this.f81999d * 17);
    }

    public int o() {
        return this.f81997b;
    }

    public int t() {
        return this.f81999d;
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(32, ProtectedSandApp.s("誡\u0001"));
        String valueOf = String.valueOf(this.f81997b);
        for (int length = valueOf.length(); length < 4; length++) {
            a5.append('0');
        }
        a5.append(valueOf);
        a5.append('-');
        a5.append(this.f81998c.name());
        a5.append('-');
        if (this.f81999d < 10) {
            a5.append('0');
        }
        a5.append(this.f81999d);
        return a5.toString();
    }

    public net.time4j.u<HebrewCalendar> v0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    public net.time4j.u<HebrewCalendar> w0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f81991r;
    }

    public HebrewCalendar y0() {
        return (HebrewCalendar) x(s.BIRTHDAY.inHebrewYear(this.f81997b + 13));
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    public HebrewCalendar z0() {
        return (HebrewCalendar) x(s.BIRTHDAY.inHebrewYear(this.f81997b + 12));
    }

    private HebrewCalendar(int i4, u uVar, int i5) {
        this.f81997b = i4;
        this.f81998c = uVar;
        this.f81999d = i5;
    }
}
