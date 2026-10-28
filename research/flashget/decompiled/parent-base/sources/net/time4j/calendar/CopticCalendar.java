package net.time4j.calendar;

import androidx.collection.n1;
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
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("coptic")
/* loaded from: classes7.dex */
public final class CopticCalendar extends net.time4j.engine.n<i, CopticCalendar> implements net.time4j.format.h {

    /* renamed from: e, reason: collision with root package name */
    private static final long f81909e = ((Long) net.time4j.history.d.f83160s.d(net.time4j.history.h.g(net.time4j.history.j.AD, 284, 8, 29)).r(net.time4j.engine.b0.UTC)).longValue();

    /* renamed from: f, reason: collision with root package name */
    private static final int f81910f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f81911g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f81912h = 3;

    /* renamed from: i, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<net.time4j.calendar.e> f81913i;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, CopticCalendar> f81914j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<net.time4j.calendar.f, CopticCalendar> f81915k;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, CopticCalendar> f81916l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, CopticCalendar> f81917m;

    /* renamed from: n, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, CopticCalendar> f81918n;

    /* renamed from: o, reason: collision with root package name */
    private static final r0<CopticCalendar> f81919o;

    /* renamed from: p, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<CopticCalendar> f81920p;

    /* renamed from: q, reason: collision with root package name */
    private static final o<CopticCalendar> f81921q;

    /* renamed from: r, reason: collision with root package name */
    private static final net.time4j.engine.j0<i, CopticCalendar> f81922r;
    private static final long serialVersionUID = -8248846000788617742L;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f81923b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f81924c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f81925d;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f81926c = 3;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f81927b;

        public SPX() {
        }

        private CopticCalendar a(ObjectInput objectInput) throws IOException {
            return CopticCalendar.H0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            CopticCalendar copticCalendar = (CopticCalendar) this.f81927b;
            objectOutput.writeInt(copticCalendar.o());
            objectOutput.writeByte(copticCalendar.B0().getValue());
            objectOutput.writeByte(copticCalendar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f81927b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 3) {
                throw new InvalidObjectException(ProtectedSandApp.s("訷\u0001"));
            }
            this.f81927b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(3);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f81927b = obj;
        }
    }

    static class a implements net.time4j.engine.t<CopticCalendar, net.time4j.engine.l<CopticCalendar>> {
        a() {
        }

        public net.time4j.engine.l<CopticCalendar> a(CopticCalendar copticCalendar) {
            return CopticCalendar.f81921q;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<CopticCalendar> apply(CopticCalendar copticCalendar) {
            return CopticCalendar.f81921q;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f81928a;

        static {
            int[] iArr = new int[i.values().length];
            f81928a = iArr;
            try {
                iArr[i.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f81928a[i.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f81928a[i.WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f81928a[i.DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class c implements net.time4j.engine.o0<CopticCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final i f81929a;

        c(i iVar) {
            this.f81929a = iVar;
        }

        private static int e(CopticCalendar copticCalendar) {
            return ((copticCalendar.f81923b * 13) + copticCalendar.f81924c) - 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CopticCalendar b(CopticCalendar copticCalendar, long j4) {
            int i4 = b.f81928a[this.f81929a.ordinal()];
            if (i4 == 1) {
                j4 = net.time4j.base.c.i(j4, 13L);
            } else if (i4 != 2) {
                if (i4 == 3) {
                    j4 = net.time4j.base.c.i(j4, 7L);
                } else if (i4 != 4) {
                    throw new UnsupportedOperationException(this.f81929a.name());
                }
                return (CopticCalendar) CopticCalendar.f81921q.e(net.time4j.base.c.f(CopticCalendar.f81921q.f(copticCalendar), j4));
            }
            long f4 = net.time4j.base.c.f(e(copticCalendar), j4);
            int g4 = net.time4j.base.c.g(net.time4j.base.c.b(f4, 13));
            int d5 = net.time4j.base.c.d(f4, 13) + 1;
            return CopticCalendar.H0(g4, d5, Math.min(copticCalendar.f81925d, CopticCalendar.f81921q.b(net.time4j.calendar.e.ANNO_MARTYRUM, g4, d5)));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(CopticCalendar copticCalendar, CopticCalendar copticCalendar2) {
            int between;
            int i4 = b.f81928a[this.f81929a.ordinal()];
            if (i4 == 1) {
                between = i.MONTHS.between(copticCalendar, copticCalendar2) / 13;
            } else {
                if (i4 == 2) {
                    long e4 = e(copticCalendar2) - e(copticCalendar);
                    return (e4 <= 0 || copticCalendar2.f81925d >= copticCalendar.f81925d) ? (e4 >= 0 || copticCalendar2.f81925d <= copticCalendar.f81925d) ? e4 : e4 + 1 : e4 - 1;
                }
                if (i4 != 3) {
                    if (i4 == 4) {
                        return CopticCalendar.f81921q.f(copticCalendar2) - CopticCalendar.f81921q.f(copticCalendar);
                    }
                    throw new UnsupportedOperationException(this.f81929a.name());
                }
                between = i.DAYS.between(copticCalendar, copticCalendar2) / 7;
            }
            return between;
        }
    }

    private static class d implements net.time4j.engine.a0<CopticCalendar, net.time4j.calendar.e> {
        private d() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(CopticCalendar copticCalendar) {
            return CopticCalendar.f81914j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(CopticCalendar copticCalendar) {
            return CopticCalendar.f81914j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.e getMaximum(CopticCalendar copticCalendar) {
            return net.time4j.calendar.e.ANNO_MARTYRUM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.e getMinimum(CopticCalendar copticCalendar) {
            return net.time4j.calendar.e.ANNO_MARTYRUM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.e getValue(CopticCalendar copticCalendar) {
            return net.time4j.calendar.e.ANNO_MARTYRUM;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(CopticCalendar copticCalendar, net.time4j.calendar.e eVar) {
            return eVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public CopticCalendar withValue(CopticCalendar copticCalendar, net.time4j.calendar.e eVar, boolean z4) {
            if (eVar != null) {
                return copticCalendar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("訸\u0001"));
        }

        d(a aVar) {
        }
    }

    private static class e implements net.time4j.engine.a0<CopticCalendar, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final int f81930b;

        e(int i4) {
            this.f81930b = i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(CopticCalendar copticCalendar) {
            if (this.f81930b == 0) {
                return CopticCalendar.f81915k;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(CopticCalendar copticCalendar) {
            if (this.f81930b == 0) {
                return CopticCalendar.f81915k;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(CopticCalendar copticCalendar) {
            int i4 = this.f81930b;
            if (i4 == 0) {
                return Integer.valueOf(org.threeten.bp.chrono.m.f87989n);
            }
            if (i4 == 2) {
                return Integer.valueOf(CopticCalendar.f81921q.b(net.time4j.calendar.e.ANNO_MARTYRUM, copticCalendar.f81923b, copticCalendar.f81924c));
            }
            if (i4 == 3) {
                return Integer.valueOf(CopticCalendar.f81921q.h(net.time4j.calendar.e.ANNO_MARTYRUM, copticCalendar.f81923b));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("訹\u0001") + this.f81930b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(CopticCalendar copticCalendar) {
            int i4 = this.f81930b;
            if (i4 == 0 || i4 == 2 || i4 == 3) {
                return 1;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("訹\u0001") + this.f81930b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(CopticCalendar copticCalendar) {
            int i4 = this.f81930b;
            if (i4 == 0) {
                return Integer.valueOf(copticCalendar.f81923b);
            }
            if (i4 == 2) {
                return Integer.valueOf(copticCalendar.f81925d);
            }
            if (i4 != 3) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("訹\u0001") + this.f81930b);
            }
            int i5 = 0;
            for (int i6 = 1; i6 < copticCalendar.f81924c; i6++) {
                i5 += CopticCalendar.f81921q.b(net.time4j.calendar.e.ANNO_MARTYRUM, copticCalendar.f81923b, i6);
            }
            return Integer.valueOf(i5 + copticCalendar.f81925d);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(CopticCalendar copticCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return getMinimum(copticCalendar).compareTo(num) <= 0 && getMaximum(copticCalendar).compareTo(num) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public CopticCalendar withValue(CopticCalendar copticCalendar, Integer num, boolean z4) {
            if (!j(copticCalendar, num)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("診\u0001") + num);
            }
            int i4 = this.f81930b;
            if (i4 == 0) {
                int intValue = num.intValue();
                return CopticCalendar.H0(intValue, copticCalendar.f81924c, Math.min(copticCalendar.f81925d, CopticCalendar.f81921q.b(net.time4j.calendar.e.ANNO_MARTYRUM, intValue, copticCalendar.f81924c)));
            }
            if (i4 == 2) {
                return new CopticCalendar(copticCalendar.f81923b, copticCalendar.f81924c, num.intValue(), null);
            }
            if (i4 == 3) {
                return copticCalendar.h0(net.time4j.engine.i.i(num.intValue() - getValue(copticCalendar).intValue()));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("訹\u0001") + this.f81930b);
        }
    }

    private static class f implements net.time4j.engine.u<CopticCalendar> {
        private f() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82721b;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public CopticCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (CopticCalendar) net.time4j.d0.y0(eVar.c()).d1(CopticCalendar.f81922r, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public CopticCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            int l4 = rVar.l(CopticCalendar.f81914j);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("註\u0001"));
                return null;
            }
            o0<net.time4j.calendar.f, CopticCalendar> o0Var = CopticCalendar.f81915k;
            boolean w4 = rVar.w(o0Var);
            String s4 = ProtectedSandApp.s("証\u0001");
            if (w4) {
                int value = ((net.time4j.calendar.f) rVar.r(o0Var)).getValue();
                int l5 = rVar.l(CopticCalendar.f81916l);
                if (l5 != Integer.MIN_VALUE) {
                    if (CopticCalendar.f81921q.c(net.time4j.calendar.e.ANNO_MARTYRUM, l4, value, l5)) {
                        return CopticCalendar.H0(l4, value, l5);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            } else {
                int l6 = rVar.l(CopticCalendar.f81917m);
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 > 0) {
                        int i4 = 1;
                        int i5 = 0;
                        while (i4 <= 13) {
                            int b5 = CopticCalendar.f81921q.b(net.time4j.calendar.e.ANNO_MARTYRUM, l4, i4) + i5;
                            if (l6 <= b5) {
                                return CopticCalendar.H0(l4, i4, l6 - i5);
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
        public net.time4j.engine.p k(CopticCalendar copticCalendar, net.time4j.engine.d dVar) {
            return copticCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g() - 284;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("訽\u0001"), zVar, locale);
        }

        f(a aVar) {
        }
    }

    private static class g implements net.time4j.engine.a0<CopticCalendar, net.time4j.calendar.f> {
        private g() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(CopticCalendar copticCalendar) {
            return CopticCalendar.f81916l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(CopticCalendar copticCalendar) {
            return CopticCalendar.f81916l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.f getMaximum(CopticCalendar copticCalendar) {
            return net.time4j.calendar.f.NASIE;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.f getMinimum(CopticCalendar copticCalendar) {
            return net.time4j.calendar.f.TOUT;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.f getValue(CopticCalendar copticCalendar) {
            return copticCalendar.B0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(CopticCalendar copticCalendar, net.time4j.calendar.f fVar) {
            return fVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public CopticCalendar withValue(CopticCalendar copticCalendar, net.time4j.calendar.f fVar, boolean z4) {
            if (fVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("訾\u0001"));
            }
            int value = fVar.getValue();
            return new CopticCalendar(copticCalendar.f81923b, value, Math.min(copticCalendar.f81925d, CopticCalendar.f81921q.b(net.time4j.calendar.e.ANNO_MARTYRUM, copticCalendar.f81923b, value)), null);
        }

        g(a aVar) {
        }
    }

    private static class h implements o<CopticCalendar> {
        private h() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(net.time4j.calendar.e.ANNO_MARTYRUM);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            if (jVar != net.time4j.calendar.e.ANNO_MARTYRUM) {
                throw new IllegalArgumentException(ProtectedSandApp.s("詁\u0001") + jVar);
            }
            if (i4 < 1 || i4 > 9999 || i5 < 1 || i5 > 13) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("訿\u0001"), i4, ProtectedSandApp.s("詀\u0001"), i5));
            }
            if (i5 <= 12) {
                return 30;
            }
            return i4 % 4 == 3 ? 6 : 5;
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            return jVar == net.time4j.calendar.e.ANNO_MARTYRUM && i4 >= 1 && i4 <= 9999 && i5 >= 1 && i5 <= 13 && i6 >= 1 && i6 <= b(jVar, i4, i5);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return f(new CopticCalendar(org.threeten.bp.chrono.m.f87989n, 13, 6, null));
        }

        @Override // net.time4j.engine.l
        public long g() {
            int i4 = 1;
            return f(new CopticCalendar(i4, i4, i4, null));
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            if (jVar != net.time4j.calendar.e.ANNO_MARTYRUM) {
                throw new IllegalArgumentException(ProtectedSandApp.s("詁\u0001") + jVar);
            }
            if (i4 < 1 || i4 > 9999) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("訿\u0001"), i4));
            }
            return i4 % 4 == 3 ? 366 : 365;
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(CopticCalendar copticCalendar) {
            return (CopticCalendar.f81909e - 1) + ((copticCalendar.f81923b - 1) * 365) + net.time4j.base.c.a(copticCalendar.f81923b, 4) + ((copticCalendar.f81924c - 1) * 30) + copticCalendar.f81925d;
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public CopticCalendar e(long j4) {
            try {
                a aVar = null;
                int i4 = 1;
                return CopticCalendar.H0(net.time4j.base.c.g(net.time4j.base.c.b(net.time4j.base.c.f(net.time4j.base.c.i(4L, net.time4j.base.c.m(j4, CopticCalendar.f81909e)), 1463L), 1461)), net.time4j.base.c.g(net.time4j.base.c.b(j4 - net.time4j.base.c.g(f(new CopticCalendar(r0, i4, i4, aVar))), 30)) + 1, net.time4j.base.c.g(net.time4j.base.c.m(j4, net.time4j.base.c.g(f(new CopticCalendar(r0, r1, i4, aVar))))) + 1);
            } catch (ArithmeticException e4) {
                throw new IllegalArgumentException(e4);
            }
        }

        h(a aVar) {
        }
    }

    public enum i implements net.time4j.engine.w {
        YEARS(3.15576E7d),
        MONTHS(2592000.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        i(double d5) {
            this.length = d5;
        }

        public int between(CopticCalendar copticCalendar, CopticCalendar copticCalendar2) {
            return (int) copticCalendar.Y(copticCalendar2, this);
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
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("詆\u0001"), CopticCalendar.class, net.time4j.calendar.e.class, 'G');
        f81913i = iVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("詇\u0001"), CopticCalendar.class, 1, org.threeten.bp.chrono.m.f87989n, 'y', null, null);
        f81914j = jVar;
        net.time4j.calendar.service.i iVar2 = new net.time4j.calendar.service.i(ProtectedSandApp.s("詈\u0001"), CopticCalendar.class, net.time4j.calendar.f.class, 'M');
        f81915k = iVar2;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("詉\u0001"), CopticCalendar.class, 1, 30, 'd');
        f81916l = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("詊\u0001"), CopticCalendar.class, 1, 365, 'D');
        f81917m = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(CopticCalendar.class, z0());
        f81918n = kVar;
        r0<CopticCalendar> r0Var = new r0<>(CopticCalendar.class, jVar2, kVar);
        f81919o = r0Var;
        f81920p = r0Var;
        h hVar = new h();
        f81921q = hVar;
        j0.c f4 = j0.c.m(i.class, CopticCalendar.class, new f(), hVar).f(iVar, new d());
        e eVar = new e(0);
        i iVar3 = i.YEARS;
        j0.c g4 = f4.g(jVar, eVar, iVar3);
        g gVar = new g();
        i iVar4 = i.MONTHS;
        j0.c g5 = g4.g(iVar2, gVar, iVar4);
        e eVar2 = new e(2);
        i iVar5 = i.DAYS;
        j0.c j4 = g5.g(jVar2, eVar2, iVar5).g(jVar3, new e(3), iVar5).g(kVar, new s0(z0(), new a()), iVar5).f(r0Var, new r0.a(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(hVar, jVar3)).j(iVar3, new c(iVar3), iVar3.getLength(), Collections.singleton(iVar4)).j(iVar4, new c(iVar4), iVar4.getLength(), Collections.singleton(iVar3));
        i iVar6 = i.WEEKS;
        f81922r = j4.j(iVar6, new c(iVar6), iVar6.getLength(), Collections.singleton(iVar5)).j(iVar5, new c(iVar5), iVar5.getLength(), Collections.singleton(iVar6)).h(new d.h(CopticCalendar.class, jVar2, jVar3, z0())).c();
    }

    /* synthetic */ CopticCalendar(int i4, int i5, int i6, a aVar) {
        this(i4, i5, i6);
    }

    public static boolean D0(int i4, int i5, int i6) {
        return f81921q.c(net.time4j.calendar.e.ANNO_MARTYRUM, i4, i5, i6);
    }

    public static CopticCalendar G0() {
        return (CopticCalendar) w0.g().f(f81922r);
    }

    public static CopticCalendar H0(int i4, int i5, int i6) {
        if (f81921q.c(net.time4j.calendar.e.ANNO_MARTYRUM, i4, i5, i6)) {
            return new CopticCalendar(i4, i5, i6);
        }
        StringBuilder a5 = n1.a(ProtectedSandApp.s("詋\u0001"), i4, ProtectedSandApp.s("詌\u0001"), i5, ProtectedSandApp.s("詍\u0001"));
        a5.append(i6);
        throw new IllegalArgumentException(a5.toString());
    }

    public static CopticCalendar I0(int i4, net.time4j.calendar.f fVar, int i5) {
        return H0(i4, fVar.getValue(), i5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("詎\u0001"));
    }

    public static net.time4j.engine.j0<i, CopticCalendar> v0() {
        return f81922r;
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public static i1 z0() {
        g1 g1Var = g1.SATURDAY;
        return i1.m(g1Var, 1, g1.FRIDAY, g1Var);
    }

    public net.time4j.calendar.e A0() {
        return net.time4j.calendar.e.ANNO_MARTYRUM;
    }

    public net.time4j.calendar.f B0() {
        return net.time4j.calendar.f.valueOf(this.f81924c);
    }

    public boolean C0() {
        return this.f81923b % 4 == 3;
    }

    public int E0() {
        return f81921q.b(net.time4j.calendar.e.ANNO_MARTYRUM, this.f81923b, this.f81924c);
    }

    public int F0() {
        return C0() ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<i, CopticCalendar> y() {
        return f81922r;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CopticCalendar)) {
            return false;
        }
        CopticCalendar copticCalendar = (CopticCalendar) obj;
        return this.f81925d == copticCalendar.f81925d && this.f81924c == copticCalendar.f81924c && this.f81923b == copticCalendar.f81923b;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f81923b * 37) + (this.f81924c * 31) + (this.f81925d * 17);
    }

    public int o() {
        return this.f81923b;
    }

    public int t() {
        return this.f81925d;
    }

    public net.time4j.u<CopticCalendar> t0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(32, ProtectedSandApp.s("詏\u0001"));
        String valueOf = String.valueOf(this.f81923b);
        for (int length = valueOf.length(); length < 4; length++) {
            a5.append('0');
        }
        a5.append(valueOf);
        a5.append('-');
        if (this.f81924c < 10) {
            a5.append('0');
        }
        a5.append(this.f81924c);
        a5.append('-');
        if (this.f81925d < 10) {
            a5.append('0');
        }
        a5.append(this.f81925d);
        return a5.toString();
    }

    public net.time4j.u<CopticCalendar> u0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    protected CopticCalendar w0() {
        return this;
    }

    public g1 x0() {
        return g1.valueOf(net.time4j.base.c.d(f81921q.f(this) + 5, 7) + 1);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f81922r;
    }

    public int y0() {
        return ((Integer) r(f81917m)).intValue();
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    private CopticCalendar(int i4, int i5, int i6) {
        this.f81923b = i4;
        this.f81924c = i5;
        this.f81925d = i6;
    }
}
