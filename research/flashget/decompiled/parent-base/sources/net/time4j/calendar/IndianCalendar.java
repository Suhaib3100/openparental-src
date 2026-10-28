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

@net.time4j.format.c("indian")
/* loaded from: classes7.dex */
public final class IndianCalendar extends net.time4j.engine.n<i, IndianCalendar> implements net.time4j.format.h {

    /* renamed from: e, reason: collision with root package name */
    private static final int f82083e = 999999921;

    /* renamed from: f, reason: collision with root package name */
    private static final int f82084f = 0;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82085g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f82086h = 3;

    /* renamed from: i, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<a0> f82087i;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, IndianCalendar> f82088j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<b0, IndianCalendar> f82089k;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, IndianCalendar> f82090l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, IndianCalendar> f82091m;

    /* renamed from: n, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, IndianCalendar> f82092n;

    /* renamed from: o, reason: collision with root package name */
    private static final r0<IndianCalendar> f82093o;

    /* renamed from: p, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<IndianCalendar> f82094p;

    /* renamed from: q, reason: collision with root package name */
    private static final o<IndianCalendar> f82095q;

    /* renamed from: r, reason: collision with root package name */
    private static final net.time4j.engine.j0<i, IndianCalendar> f82096r;
    private static final long serialVersionUID = 7482205842000661998L;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82097b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82098c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f82099d;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82100c = 10;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82101b;

        public SPX() {
        }

        private IndianCalendar a(ObjectInput objectInput) throws IOException {
            return IndianCalendar.G0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            IndianCalendar indianCalendar = (IndianCalendar) this.f82101b;
            objectOutput.writeInt(indianCalendar.o());
            objectOutput.writeByte(indianCalendar.A0().getValue());
            objectOutput.writeByte(indianCalendar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82101b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 10) {
                throw new InvalidObjectException(ProtectedSandApp.s("諶\u0001"));
            }
            this.f82101b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(10);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82101b = obj;
        }
    }

    static class a implements net.time4j.engine.t<IndianCalendar, net.time4j.engine.l<IndianCalendar>> {
        a() {
        }

        public net.time4j.engine.l<IndianCalendar> a(IndianCalendar indianCalendar) {
            return IndianCalendar.f82095q;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<IndianCalendar> apply(IndianCalendar indianCalendar) {
            return IndianCalendar.f82095q;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82102a;

        static {
            int[] iArr = new int[i.values().length];
            f82102a = iArr;
            try {
                iArr[i.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82102a[i.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82102a[i.WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82102a[i.DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static class c implements net.time4j.engine.a0<IndianCalendar, a0> {
        private c() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(IndianCalendar indianCalendar) {
            return IndianCalendar.f82088j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(IndianCalendar indianCalendar) {
            return IndianCalendar.f82088j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public a0 getMaximum(IndianCalendar indianCalendar) {
            return a0.SAKA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public a0 getMinimum(IndianCalendar indianCalendar) {
            return a0.SAKA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public a0 getValue(IndianCalendar indianCalendar) {
            return a0.SAKA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(IndianCalendar indianCalendar, a0 a0Var) {
            return a0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public IndianCalendar withValue(IndianCalendar indianCalendar, a0 a0Var, boolean z4) {
            if (a0Var != null) {
                return indianCalendar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("諷\u0001"));
        }

        c(a aVar) {
        }
    }

    private static class d implements net.time4j.engine.o0<IndianCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final i f82103a;

        d(i iVar) {
            this.f82103a = iVar;
        }

        private static int e(IndianCalendar indianCalendar) {
            return ((indianCalendar.f82097b * 12) + indianCalendar.f82098c) - 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public IndianCalendar b(IndianCalendar indianCalendar, long j4) {
            int i4 = b.f82102a[this.f82103a.ordinal()];
            if (i4 == 1) {
                j4 = net.time4j.base.c.i(j4, 12L);
            } else if (i4 != 2) {
                if (i4 == 3) {
                    j4 = net.time4j.base.c.i(j4, 7L);
                } else if (i4 != 4) {
                    throw new UnsupportedOperationException(this.f82103a.name());
                }
                return (IndianCalendar) IndianCalendar.f82095q.e(net.time4j.base.c.f(IndianCalendar.f82095q.f(indianCalendar), j4));
            }
            long f4 = net.time4j.base.c.f(e(indianCalendar), j4);
            int g4 = net.time4j.base.c.g(net.time4j.base.c.b(f4, 12));
            int d5 = net.time4j.base.c.d(f4, 12) + 1;
            return IndianCalendar.G0(g4, d5, Math.min(indianCalendar.f82099d, IndianCalendar.f82095q.b(a0.SAKA, g4, d5)));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(IndianCalendar indianCalendar, IndianCalendar indianCalendar2) {
            int i4 = b.f82102a[this.f82103a.ordinal()];
            if (i4 == 1) {
                return i.MONTHS.between(indianCalendar, indianCalendar2) / 12;
            }
            if (i4 == 2) {
                long e4 = e(indianCalendar2) - e(indianCalendar);
                return (e4 <= 0 || indianCalendar2.f82099d >= indianCalendar.f82099d) ? (e4 >= 0 || indianCalendar2.f82099d <= indianCalendar.f82099d) ? e4 : e4 + 1 : e4 - 1;
            }
            if (i4 == 3) {
                return i.DAYS.between(indianCalendar, indianCalendar2) / 7;
            }
            if (i4 == 4) {
                return IndianCalendar.f82095q.f(indianCalendar2) - IndianCalendar.f82095q.f(indianCalendar);
            }
            throw new UnsupportedOperationException(this.f82103a.name());
        }
    }

    private static class e implements net.time4j.engine.e0<IndianCalendar> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82104b;

        e(int i4) {
            this.f82104b = i4;
        }

        private int g(IndianCalendar indianCalendar) {
            int i4 = this.f82104b;
            if (i4 == 0) {
                return IndianCalendar.f82083e;
            }
            if (i4 == 2) {
                return IndianCalendar.f82095q.b(a0.SAKA, indianCalendar.f82097b, indianCalendar.f82098c);
            }
            if (i4 == 3) {
                return IndianCalendar.f82095q.h(a0.SAKA, indianCalendar.f82097b);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("諸\u0001") + this.f82104b);
        }

        private int i() {
            int i4 = this.f82104b;
            if (i4 == 0 || i4 == 2 || i4 == 3) {
                return 1;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("諸\u0001") + this.f82104b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(IndianCalendar indianCalendar) {
            if (this.f82104b == 0) {
                return IndianCalendar.f82089k;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(IndianCalendar indianCalendar) {
            if (this.f82104b == 0) {
                return IndianCalendar.f82089k;
            }
            return null;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(IndianCalendar indianCalendar) {
            int i4 = this.f82104b;
            if (i4 == 0) {
                return indianCalendar.f82097b;
            }
            if (i4 == 2) {
                return indianCalendar.f82099d;
            }
            if (i4 != 3) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("諸\u0001") + this.f82104b);
            }
            int i5 = 0;
            for (int i6 = 1; i6 < indianCalendar.f82098c; i6++) {
                i5 += IndianCalendar.f82095q.b(a0.SAKA, indianCalendar.f82097b, i6);
            }
            return i5 + indianCalendar.f82099d;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(IndianCalendar indianCalendar) {
            return Integer.valueOf(g(indianCalendar));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(IndianCalendar indianCalendar) {
            return Integer.valueOf(i());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getValue(IndianCalendar indianCalendar) {
            return Integer.valueOf(d(indianCalendar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean e(IndianCalendar indianCalendar, int i4) {
            return i() <= i4 && g(indianCalendar) >= i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean j(IndianCalendar indianCalendar, Integer num) {
            return num != null && e(indianCalendar, num.intValue());
        }

        @Override // net.time4j.engine.e0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public IndianCalendar a(IndianCalendar indianCalendar, int i4, boolean z4) {
            if (!e(indianCalendar, i4)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("諹\u0001"), i4));
            }
            int i5 = this.f82104b;
            a aVar = null;
            if (i5 == 0) {
                return new IndianCalendar(i4, indianCalendar.f82098c, Math.min(indianCalendar.f82099d, IndianCalendar.f82095q.b(a0.SAKA, i4, indianCalendar.f82098c)), aVar);
            }
            if (i5 == 2) {
                return new IndianCalendar(indianCalendar.f82097b, indianCalendar.f82098c, i4, aVar);
            }
            if (i5 == 3) {
                return indianCalendar.h0(net.time4j.engine.i.i(i4 - getValue(indianCalendar).intValue()));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("諸\u0001") + this.f82104b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public IndianCalendar withValue(IndianCalendar indianCalendar, Integer num, boolean z4) {
            if (num != null) {
                return a(indianCalendar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("諺\u0001"));
        }
    }

    private static class f implements net.time4j.engine.u<IndianCalendar> {
        private f() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IndianCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (IndianCalendar) net.time4j.d0.y0(eVar.c()).d1(IndianCalendar.f82096r, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public IndianCalendar e(net.time4j.engine.r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            int l4 = rVar.l(IndianCalendar.f82088j);
            if (l4 == Integer.MIN_VALUE) {
                rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, ProtectedSandApp.s("諻\u0001"));
                return null;
            }
            o0<b0, IndianCalendar> o0Var = IndianCalendar.f82089k;
            boolean w4 = rVar.w(o0Var);
            String s4 = ProtectedSandApp.s("諼\u0001");
            if (w4) {
                int value = ((b0) rVar.r(o0Var)).getValue();
                int l5 = rVar.l(IndianCalendar.f82090l);
                if (l5 != Integer.MIN_VALUE) {
                    if (IndianCalendar.f82095q.c(a0.SAKA, l4, value, l5)) {
                        return IndianCalendar.G0(l4, value, l5);
                    }
                    rVar.M(net.time4j.engine.p0.ERROR_MESSAGE, s4);
                }
            } else {
                int l6 = rVar.l(IndianCalendar.f82091m);
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 > 0) {
                        int i4 = 1;
                        int i5 = 0;
                        while (i4 <= 12) {
                            int b5 = IndianCalendar.f82095q.b(a0.SAKA, l4, i4) + i5;
                            if (l6 <= b5) {
                                return IndianCalendar.G0(l4, i4, l6 - i5);
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
        public net.time4j.engine.p k(IndianCalendar indianCalendar, net.time4j.engine.d dVar) {
            return indianCalendar;
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g() - 78;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("諽\u0001"), zVar, locale);
        }

        f(a aVar) {
        }
    }

    private static class g implements net.time4j.engine.a0<IndianCalendar, b0> {
        private g() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(IndianCalendar indianCalendar) {
            return IndianCalendar.f82090l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(IndianCalendar indianCalendar) {
            return IndianCalendar.f82090l;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public b0 getMaximum(IndianCalendar indianCalendar) {
            return b0.PHALGUNA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public b0 getMinimum(IndianCalendar indianCalendar) {
            return b0.CHAITRA;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public b0 getValue(IndianCalendar indianCalendar) {
            return indianCalendar.A0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(IndianCalendar indianCalendar, b0 b0Var) {
            return b0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public IndianCalendar withValue(IndianCalendar indianCalendar, b0 b0Var, boolean z4) {
            if (b0Var == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("諾\u0001"));
            }
            int value = b0Var.getValue();
            return new IndianCalendar(indianCalendar.f82097b, value, Math.min(indianCalendar.f82099d, IndianCalendar.f82095q.b(a0.SAKA, indianCalendar.f82097b, value)), null);
        }

        g(a aVar) {
        }
    }

    private static class h implements o<IndianCalendar> {
        private h() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(a0.SAKA);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            if (jVar != a0.SAKA) {
                throw new IllegalArgumentException(ProtectedSandApp.s("謁\u0001") + jVar);
            }
            if (i4 >= 1 && i4 <= IndianCalendar.f82083e && i5 >= 1) {
                if (i4 == IndianCalendar.f82083e && i5 == 10) {
                    return 10;
                }
                if (i5 == 1) {
                    return net.time4j.base.b.e(i4 + 78) ? 31 : 30;
                }
                if (i5 <= 6) {
                    return 31;
                }
                if (i5 <= 12) {
                    return 30;
                }
            }
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("諿\u0001"), i4, ProtectedSandApp.s("謀\u0001"), i5));
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            if (jVar == a0.SAKA && i4 >= 1 && i4 <= IndianCalendar.f82083e && i5 >= 1) {
                if (i5 <= (i4 == IndianCalendar.f82083e ? 10 : 12) && i6 >= 1 && i6 <= b(jVar, i4, i5)) {
                    return true;
                }
            }
            return false;
        }

        @Override // net.time4j.engine.l
        public long d() {
            int i4 = 10;
            return f(new IndianCalendar(IndianCalendar.f82083e, i4, i4, null));
        }

        @Override // net.time4j.engine.l
        public long g() {
            int i4 = 1;
            return f(new IndianCalendar(i4, i4, i4, null));
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            if (jVar != a0.SAKA) {
                throw new IllegalArgumentException(ProtectedSandApp.s("謁\u0001") + jVar);
            }
            if (i4 >= 1 && i4 < IndianCalendar.f82083e) {
                return net.time4j.base.b.e(i4 + 78) ? 366 : 365;
            }
            if (i4 == IndianCalendar.f82083e) {
                return 285;
            }
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("諿\u0001"), i4));
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(IndianCalendar indianCalendar) {
            int i4 = indianCalendar.f82097b + 78;
            boolean e4 = net.time4j.base.b.e(i4);
            long longValue = ((Long) net.time4j.l0.r1(i4, 3, e4 ? 21 : 22).r(net.time4j.engine.b0.UTC)).longValue();
            int i5 = 0;
            for (int i6 = 1; i6 < indianCalendar.f82098c; i6++) {
                switch (i6) {
                    case 1:
                        i5 += e4 ? 31 : 30;
                        break;
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        i5 += 31;
                        break;
                    default:
                        i5 += 30;
                        break;
                }
            }
            return longValue + (indianCalendar.f82099d - 1) + i5;
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public IndianCalendar e(long j4) {
            int i4;
            int i5;
            net.time4j.l0 w12 = net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC);
            int o4 = w12.o();
            int q4 = w12.q();
            int t4 = w12.t();
            boolean e4 = net.time4j.base.b.e(o4);
            int i6 = e4 ? 21 : 22;
            int o5 = w12.o();
            int i7 = o5 - 78;
            if (q4 != 12 || t4 < 22) {
                if (q4 == 12) {
                    i5 = t4 + 9;
                } else {
                    if (q4 != 11 || t4 < 22) {
                        int i10 = 8;
                        if (q4 != 11) {
                            if (q4 != 10 || t4 < 23) {
                                int i11 = 7;
                                if (q4 == 10) {
                                    i5 = t4 + 8;
                                } else {
                                    if (q4 != 9 || t4 < 23) {
                                        if (q4 == 9) {
                                            i5 = t4 + 9;
                                        } else {
                                            if (q4 != 8 || t4 < 23) {
                                                i4 = 5;
                                                if (q4 == 8) {
                                                    i5 = t4 + 9;
                                                } else if (q4 != 7 || t4 < 23) {
                                                    i10 = 4;
                                                    if (q4 != 7) {
                                                        if (q4 != 6 || t4 < 22) {
                                                            if (q4 == 6) {
                                                                i5 = t4 + 10;
                                                            } else if (q4 != 5 || t4 < 22) {
                                                                if (q4 == 5) {
                                                                    i5 = t4 + 10;
                                                                } else if (q4 != 4 || t4 < 21) {
                                                                    i11 = 1;
                                                                    if (q4 == 4) {
                                                                        i5 = t4 + (e4 ? 11 : 10);
                                                                    } else if (q4 != 3 || t4 < i6) {
                                                                        if (q4 == 3) {
                                                                            i7 = o5 - 79;
                                                                            i5 = t4 + (e4 ? 10 : 9);
                                                                        } else if (q4 != 2 || t4 < 20) {
                                                                            if (q4 == 2) {
                                                                                i7 = o5 - 79;
                                                                                i5 = t4 + 11;
                                                                            } else if (q4 != 1 || t4 < 21) {
                                                                                i7 = o5 - 79;
                                                                                i5 = t4 + 10;
                                                                            } else {
                                                                                i7 = o5 - 79;
                                                                                i5 = t4 - 20;
                                                                            }
                                                                            i4 = 11;
                                                                        } else {
                                                                            i7 = o5 - 79;
                                                                            i5 = t4 - 19;
                                                                        }
                                                                        i4 = 12;
                                                                    } else {
                                                                        i5 = (t4 - i6) + 1;
                                                                    }
                                                                } else {
                                                                    i5 = t4 - 20;
                                                                }
                                                                i4 = 2;
                                                            } else {
                                                                i5 = t4 - 21;
                                                            }
                                                            i4 = 3;
                                                        } else {
                                                            i5 = t4 - 21;
                                                        }
                                                    }
                                                } else {
                                                    i5 = t4 - 22;
                                                }
                                                return IndianCalendar.G0(i7, i4, i5);
                                            }
                                            i5 = t4 - 22;
                                        }
                                        i4 = 6;
                                        return IndianCalendar.G0(i7, i4, i5);
                                    }
                                    i5 = t4 - 22;
                                }
                                i4 = i11;
                                return IndianCalendar.G0(i7, i4, i5);
                            }
                            i5 = t4 - 22;
                            i4 = i10;
                            return IndianCalendar.G0(i7, i4, i5);
                        }
                        i5 = t4 + 9;
                        i4 = i10;
                        return IndianCalendar.G0(i7, i4, i5);
                    }
                    i5 = t4 - 21;
                }
                i4 = 9;
                return IndianCalendar.G0(i7, i4, i5);
            }
            i5 = t4 - 21;
            i4 = 10;
            return IndianCalendar.G0(i7, i4, i5);
        }

        h(a aVar) {
        }
    }

    public enum i implements net.time4j.engine.w {
        YEARS(3.1556952E7d),
        MONTHS(2629746.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        i(double d5) {
            this.length = d5;
        }

        public long between(IndianCalendar indianCalendar, IndianCalendar indianCalendar2) {
            return indianCalendar.Y(indianCalendar2, this);
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
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("謆\u0001"), IndianCalendar.class, a0.class, 'G');
        f82087i = iVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("謇\u0001"), IndianCalendar.class, 1, f82083e, 'y', null, null);
        f82088j = jVar;
        net.time4j.calendar.service.i iVar2 = new net.time4j.calendar.service.i(ProtectedSandApp.s("謈\u0001"), IndianCalendar.class, b0.class, 'M');
        f82089k = iVar2;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("謉\u0001"), IndianCalendar.class, 1, 31, 'd');
        f82090l = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("謊\u0001"), IndianCalendar.class, 1, 365, 'D');
        f82091m = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(IndianCalendar.class, y0());
        f82092n = kVar;
        r0<IndianCalendar> r0Var = new r0<>(IndianCalendar.class, jVar2, kVar);
        f82093o = r0Var;
        f82094p = r0Var;
        h hVar = new h();
        f82095q = hVar;
        j0.c f4 = j0.c.m(i.class, IndianCalendar.class, new f(), hVar).f(iVar, new c());
        e eVar = new e(0);
        i iVar3 = i.YEARS;
        j0.c g4 = f4.g(jVar, eVar, iVar3);
        g gVar = new g();
        i iVar4 = i.MONTHS;
        j0.c g5 = g4.g(iVar2, gVar, iVar4);
        e eVar2 = new e(2);
        i iVar5 = i.DAYS;
        j0.c j4 = g5.g(jVar2, eVar2, iVar5).g(jVar3, new e(3), iVar5).g(kVar, new s0(y0(), new a()), iVar5).f(r0Var, new r0.a(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(hVar, jVar3)).j(iVar3, new d(iVar3), iVar3.getLength(), Collections.singleton(iVar4)).j(iVar4, new d(iVar4), iVar4.getLength(), Collections.singleton(iVar3));
        i iVar6 = i.WEEKS;
        f82096r = j4.j(iVar6, new d(iVar6), iVar6.getLength(), Collections.singleton(iVar5)).j(iVar5, new d(iVar5), iVar5.getLength(), Collections.singleton(iVar6)).h(new d.h(IndianCalendar.class, jVar2, jVar3, y0())).c();
    }

    /* synthetic */ IndianCalendar(int i4, int i5, int i6, a aVar) {
        this(i4, i5, i6);
    }

    public static boolean C0(int i4, int i5, int i6) {
        return f82095q.c(a0.SAKA, i4, i5, i6);
    }

    public static IndianCalendar F0() {
        return (IndianCalendar) w0.g().f(f82096r);
    }

    public static IndianCalendar G0(int i4, int i5, int i6) {
        if (f82095q.c(a0.SAKA, i4, i5, i6)) {
            return new IndianCalendar(i4, i5, i6);
        }
        StringBuilder a5 = n1.a(ProtectedSandApp.s("謋\u0001"), i4, ProtectedSandApp.s("謌\u0001"), i5, ProtectedSandApp.s("謍\u0001"));
        a5.append(i6);
        throw new IllegalArgumentException(a5.toString());
    }

    public static IndianCalendar H0(int i4, b0 b0Var, int i5) {
        return G0(i4, b0Var.getValue(), i5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("謎\u0001"));
    }

    public static net.time4j.engine.j0<i, IndianCalendar> u0() {
        return f82096r;
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public static i1 y0() {
        g1 g1Var = g1.SUNDAY;
        return i1.m(g1Var, 1, g1Var, g1Var);
    }

    public b0 A0() {
        return b0.valueOf(this.f82098c);
    }

    public boolean B0() {
        return net.time4j.base.b.e(this.f82097b + 78);
    }

    public int D0() {
        return f82095q.b(a0.SAKA, this.f82097b, this.f82098c);
    }

    public int E0() {
        return B0() ? 366 : 365;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<i, IndianCalendar> y() {
        return f82096r;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndianCalendar)) {
            return false;
        }
        IndianCalendar indianCalendar = (IndianCalendar) obj;
        return this.f82099d == indianCalendar.f82099d && this.f82098c == indianCalendar.f82098c && this.f82097b == indianCalendar.f82097b;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f82097b * 37) + (this.f82098c * 31) + (this.f82099d * 17);
    }

    public int o() {
        return this.f82097b;
    }

    public net.time4j.u<IndianCalendar> s0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    public int t() {
        return this.f82099d;
    }

    public net.time4j.u<IndianCalendar> t0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(32, ProtectedSandApp.s("謏\u0001"));
        String valueOf = String.valueOf(this.f82097b);
        for (int length = valueOf.length(); length < 4; length++) {
            a5.append('0');
        }
        a5.append(valueOf);
        a5.append('-');
        if (this.f82098c < 10) {
            a5.append('0');
        }
        a5.append(this.f82098c);
        a5.append('-');
        if (this.f82099d < 10) {
            a5.append('0');
        }
        a5.append(this.f82099d);
        return a5.toString();
    }

    protected IndianCalendar v0() {
        return this;
    }

    public g1 w0() {
        return g1.valueOf(net.time4j.base.c.d(f82095q.f(this) + 5, 7) + 1);
    }

    public int x0() {
        return ((Integer) r(f82091m)).intValue();
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82096r;
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    public a0 z0() {
        return a0.SAKA;
    }

    private IndianCalendar(int i4, int i5, int i6) {
        this.f82097b = i4;
        this.f82098c = i5;
        this.f82099d = i6;
    }
}
