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
import net.time4j.engine.ChronoException;
import net.time4j.engine.j0;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.w0;

@net.time4j.format.c("persian")
/* loaded from: classes7.dex */
public final class PersianCalendar extends net.time4j.engine.n<j, PersianCalendar> implements net.time4j.format.h {

    /* renamed from: e, reason: collision with root package name */
    private static final int f82208e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f82209f = 2;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82210g = 3;

    /* renamed from: h, reason: collision with root package name */
    @net.time4j.engine.d0(format = "G")
    public static final net.time4j.engine.q<i0> f82211h;

    /* renamed from: i, reason: collision with root package name */
    @net.time4j.engine.d0(format = "y")
    public static final o0<Integer, PersianCalendar> f82212i;

    /* renamed from: j, reason: collision with root package name */
    @net.time4j.engine.d0(alt = "L", format = "M")
    public static final o0<j0, PersianCalendar> f82213j;

    /* renamed from: k, reason: collision with root package name */
    @net.time4j.engine.d0(format = "d")
    public static final o0<Integer, PersianCalendar> f82214k;

    /* renamed from: l, reason: collision with root package name */
    @net.time4j.engine.d0(format = "D")
    public static final o0<Integer, PersianCalendar> f82215l;

    /* renamed from: m, reason: collision with root package name */
    @net.time4j.engine.d0(format = "E")
    public static final o0<g1, PersianCalendar> f82216m;

    /* renamed from: n, reason: collision with root package name */
    private static final r0<PersianCalendar> f82217n;

    /* renamed from: o, reason: collision with root package name */
    @net.time4j.engine.d0(format = "F")
    public static final g0<PersianCalendar> f82218o;

    /* renamed from: p, reason: collision with root package name */
    private static final h0 f82219p;

    /* renamed from: q, reason: collision with root package name */
    private static final o<PersianCalendar> f82220q;

    /* renamed from: r, reason: collision with root package name */
    private static final net.time4j.engine.j0<j, PersianCalendar> f82221r;

    /* renamed from: s, reason: collision with root package name */
    public static final o0<g1, PersianCalendar> f82222s;
    private static final long serialVersionUID = -411339992208638290L;

    /* renamed from: t, reason: collision with root package name */
    public static final o0<Integer, PersianCalendar> f82223t;

    /* renamed from: u, reason: collision with root package name */
    public static final o0<Integer, PersianCalendar> f82224u;

    /* renamed from: v, reason: collision with root package name */
    public static final o0<Integer, PersianCalendar> f82225v;

    /* renamed from: w, reason: collision with root package name */
    public static final o0<Integer, PersianCalendar> f82226w;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82227b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82228c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f82229d;

    private static class SPX implements Externalizable {

        /* renamed from: c, reason: collision with root package name */
        private static final int f82230c = 2;
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        private transient Object f82231b;

        public SPX() {
        }

        private PersianCalendar a(ObjectInput objectInput) throws IOException {
            return PersianCalendar.J0(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
        }

        private void b(ObjectOutput objectOutput) throws IOException {
            PersianCalendar persianCalendar = (PersianCalendar) this.f82231b;
            objectOutput.writeInt(persianCalendar.o());
            objectOutput.writeByte(persianCalendar.D0().getValue());
            objectOutput.writeByte(persianCalendar.t());
        }

        private Object readResolve() throws ObjectStreamException {
            return this.f82231b;
        }

        @Override // java.io.Externalizable
        public void readExternal(ObjectInput objectInput) throws IOException {
            if (objectInput.readByte() != 2) {
                throw new InvalidObjectException(ProtectedSandApp.s("讇\u0001"));
            }
            this.f82231b = a(objectInput);
        }

        @Override // java.io.Externalizable
        public void writeExternal(ObjectOutput objectOutput) throws IOException {
            objectOutput.writeByte(2);
            b(objectOutput);
        }

        SPX(Object obj) {
            this.f82231b = obj;
        }
    }

    static class a implements net.time4j.engine.t<PersianCalendar, net.time4j.engine.l<PersianCalendar>> {
        a() {
        }

        public net.time4j.engine.l<PersianCalendar> a(PersianCalendar persianCalendar) {
            return PersianCalendar.f82220q;
        }

        @Override // net.time4j.engine.t
        public net.time4j.engine.l<PersianCalendar> apply(PersianCalendar persianCalendar) {
            return PersianCalendar.f82220q;
        }
    }

    static /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82232a;

        static {
            int[] iArr = new int[j.values().length];
            f82232a = iArr;
            try {
                iArr[j.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82232a[j.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82232a[j.WEEKS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82232a[j.DAYS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static final class c implements net.time4j.engine.p {

        /* renamed from: b, reason: collision with root package name */
        private final PersianCalendar f82233b;

        /* renamed from: c, reason: collision with root package name */
        private final h0 f82234c;

        /* renamed from: d, reason: collision with root package name */
        private final net.time4j.tz.p f82235d;

        /* synthetic */ c(PersianCalendar persianCalendar, h0 h0Var, net.time4j.tz.p pVar, a aVar) {
            this(persianCalendar, h0Var, pVar);
        }

        @Override // net.time4j.engine.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public net.time4j.tz.p v() {
            if (e()) {
                return this.f82235d;
            }
            throw new ChronoException(ProtectedSandApp.s("讈\u0001"));
        }

        @Override // net.time4j.engine.p
        public boolean e() {
            return this.f82234c == h0.ASTRONOMICAL;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            h0 h0Var = this.f82234c;
            if (h0Var != cVar.f82234c) {
                return false;
            }
            if (h0Var != h0.ASTRONOMICAL || this.f82235d.equals(cVar.f82235d)) {
                return this.f82233b.equals(cVar.f82233b);
            }
            return false;
        }

        @Override // net.time4j.engine.p
        public <V> V g(net.time4j.engine.q<V> qVar) {
            o0<Integer, PersianCalendar> o0Var = PersianCalendar.f82214k;
            if (qVar == o0Var) {
                int i4 = this.f82233b.f82228c;
                return qVar.getType().cast(Integer.valueOf(i4 <= 6 ? 31 : (i4 > 11 && !this.f82234c.isLeapYear(this.f82233b.f82227b, this.f82235d)) ? 29 : 30));
            }
            if (qVar == PersianCalendar.f82215l) {
                return qVar.getType().cast(Integer.valueOf(this.f82234c.isLeapYear(this.f82233b.f82227b, this.f82235d) ? 366 : 365));
            }
            if (qVar != PersianCalendar.f82218o) {
                if (PersianCalendar.f82221r.K(qVar)) {
                    return (V) this.f82233b.g(qVar);
                }
                throw new ChronoException(ProtectedSandApp.s("讉\u0001"));
            }
            int i5 = this.f82233b.f82229d;
            while (true) {
                int i6 = i5 + 7;
                if (i6 > ((Integer) g(o0Var)).intValue()) {
                    return qVar.getType().cast(Integer.valueOf(net.time4j.base.c.a(i5 - 1, 7) + 1));
                }
                i5 = i6;
            }
        }

        public int hashCode() {
            return (this.f82234c.hashCode() * 31) + (this.f82233b.hashCode() * 7);
        }

        @Override // net.time4j.engine.p
        public <V> V i(net.time4j.engine.q<V> qVar) {
            if (PersianCalendar.f82221r.K(qVar)) {
                return (V) this.f82233b.i(qVar);
            }
            throw new ChronoException(ProtectedSandApp.s("讉\u0001"));
        }

        @Override // net.time4j.engine.p
        public int l(net.time4j.engine.q<Integer> qVar) {
            if (qVar == PersianCalendar.f82214k) {
                return this.f82233b.f82229d;
            }
            if (qVar == PersianCalendar.f82212i) {
                return this.f82233b.f82227b;
            }
            int i4 = 1;
            if (qVar == PersianCalendar.f82215l) {
                int i5 = 0;
                while (i4 < this.f82233b.f82228c) {
                    i5 = i4 <= 6 ? i5 + 31 : i5 + 30;
                    i4++;
                }
                return i5 + this.f82233b.f82229d;
            }
            if (qVar == PersianCalendar.f82218o) {
                return net.time4j.base.c.a(this.f82233b.f82229d - 1, 7) + 1;
            }
            if (qVar == net.time4j.calendar.d.f82409a) {
                return this.f82233b.o() + 621;
            }
            if (PersianCalendar.f82221r.K(qVar)) {
                return this.f82233b.l(qVar);
            }
            return Integer.MIN_VALUE;
        }

        @Override // net.time4j.engine.p
        public <V> V r(net.time4j.engine.q<V> qVar) {
            int i4 = 1;
            if (qVar == PersianCalendar.f82216m) {
                return qVar.getType().cast(g1.valueOf(net.time4j.base.c.d(this.f82234c.transform(this.f82233b, this.f82235d) + 5, 7) + 1));
            }
            if (qVar == PersianCalendar.f82215l) {
                int i5 = 0;
                while (i4 < this.f82233b.f82228c) {
                    i5 = i4 <= 6 ? i5 + 31 : i5 + 30;
                    i4++;
                }
                return qVar.getType().cast(Integer.valueOf(i5 + this.f82233b.f82229d));
            }
            if (qVar == PersianCalendar.f82218o) {
                return qVar.getType().cast(Integer.valueOf(net.time4j.base.c.a(this.f82233b.f82229d - 1, 7) + 1));
            }
            if (qVar == net.time4j.calendar.d.f82409a) {
                return qVar.getType().cast(Integer.valueOf(this.f82233b.o() + 621));
            }
            if (qVar instanceof net.time4j.engine.b0) {
                return qVar.getType().cast(Long.valueOf(((net.time4j.engine.b0) net.time4j.engine.b0.class.cast(qVar)).transform(this.f82234c.transform(this.f82233b, this.f82235d), net.time4j.engine.b0.UTC)));
            }
            if (PersianCalendar.f82221r.K(qVar)) {
                return (V) this.f82233b.r(qVar);
            }
            throw new ChronoException(ProtectedSandApp.s("讉\u0001"));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f82233b);
            sb.append('[');
            sb.append(this.f82234c);
            if (this.f82234c == h0.ASTRONOMICAL) {
                sb.append(this.f82235d.toString());
            }
            sb.append(']');
            return sb.toString();
        }

        @Override // net.time4j.engine.p
        public boolean w(net.time4j.engine.q<?> qVar) {
            return PersianCalendar.f82221r.K(qVar);
        }

        private c(PersianCalendar persianCalendar, h0 h0Var, net.time4j.tz.p pVar) {
            this.f82233b = persianCalendar;
            this.f82234c = h0Var;
            this.f82235d = pVar;
        }
    }

    private static class d implements net.time4j.engine.a0<PersianCalendar, i0> {
        private d() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(PersianCalendar persianCalendar) {
            return PersianCalendar.f82212i;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(PersianCalendar persianCalendar) {
            return PersianCalendar.f82212i;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public i0 getMaximum(PersianCalendar persianCalendar) {
            return i0.ANNO_PERSICO;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public i0 getMinimum(PersianCalendar persianCalendar) {
            return i0.ANNO_PERSICO;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public i0 getValue(PersianCalendar persianCalendar) {
            return i0.ANNO_PERSICO;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(PersianCalendar persianCalendar, i0 i0Var) {
            return i0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public PersianCalendar withValue(PersianCalendar persianCalendar, i0 i0Var, boolean z4) {
            if (i0Var != null) {
                return persianCalendar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("變\u0001"));
        }

        d(a aVar) {
        }
    }

    private static class e implements net.time4j.engine.a0<PersianCalendar, Integer> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82236b;

        e(int i4) {
            this.f82236b = i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(PersianCalendar persianCalendar) {
            if (this.f82236b == 0) {
                return PersianCalendar.f82213j;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(PersianCalendar persianCalendar) {
            if (this.f82236b == 0) {
                return PersianCalendar.f82213j;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(PersianCalendar persianCalendar) {
            int i4 = this.f82236b;
            if (i4 == 0) {
                return 3000;
            }
            if (i4 == 2) {
                return Integer.valueOf(PersianCalendar.f82220q.b(i0.ANNO_PERSICO, persianCalendar.f82227b, persianCalendar.f82228c));
            }
            if (i4 == 3) {
                return Integer.valueOf(PersianCalendar.f82220q.h(i0.ANNO_PERSICO, persianCalendar.f82227b));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("讋\u0001") + this.f82236b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(PersianCalendar persianCalendar) {
            int i4 = this.f82236b;
            if (i4 == 0 || i4 == 2 || i4 == 3) {
                return 1;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("讋\u0001") + this.f82236b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getValue(PersianCalendar persianCalendar) {
            int i4 = this.f82236b;
            if (i4 == 0) {
                return Integer.valueOf(persianCalendar.f82227b);
            }
            if (i4 == 2) {
                return Integer.valueOf(persianCalendar.f82229d);
            }
            if (i4 != 3) {
                throw new UnsupportedOperationException(ProtectedSandApp.s("讋\u0001") + this.f82236b);
            }
            int i5 = 0;
            for (int i6 = 1; i6 < persianCalendar.f82228c; i6++) {
                i5 += PersianCalendar.f82220q.b(i0.ANNO_PERSICO, persianCalendar.f82227b, i6);
            }
            return Integer.valueOf(i5 + persianCalendar.f82229d);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(PersianCalendar persianCalendar, Integer num) {
            if (num == null) {
                return false;
            }
            return getMinimum(persianCalendar).compareTo(num) <= 0 && getMaximum(persianCalendar).compareTo(num) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public PersianCalendar withValue(PersianCalendar persianCalendar, Integer num, boolean z4) {
            if (!j(persianCalendar, num)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("讌\u0001") + num);
            }
            int i4 = this.f82236b;
            if (i4 == 0) {
                int intValue = num.intValue();
                return PersianCalendar.J0(intValue, persianCalendar.f82228c, Math.min(persianCalendar.f82229d, PersianCalendar.f82220q.b(i0.ANNO_PERSICO, intValue, persianCalendar.f82228c)));
            }
            if (i4 == 2) {
                return new PersianCalendar(persianCalendar.f82227b, persianCalendar.f82228c, num.intValue());
            }
            if (i4 == 3) {
                return persianCalendar.h0(net.time4j.engine.i.i(num.intValue() - getValue(persianCalendar).intValue()));
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("讋\u0001") + this.f82236b);
        }
    }

    private static class f implements net.time4j.engine.u<PersianCalendar> {
        private f() {
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.g0 a() {
            return net.time4j.engine.g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PersianCalendar o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (PersianCalendar) net.time4j.d0.y0(eVar.c()).d1(PersianCalendar.f82221r, G, (net.time4j.engine.g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x004f  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public net.time4j.calendar.PersianCalendar e(net.time4j.engine.r<?> r8, net.time4j.engine.d r9, boolean r10, boolean r11) {
            /*
                r7 = this;
                net.time4j.calendar.o0<java.lang.Integer, net.time4j.calendar.PersianCalendar> r10 = net.time4j.calendar.PersianCalendar.f82212i
                int r10 = r8.l(r10)
                r11 = 0
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                if (r10 != r0) goto L17
                net.time4j.engine.p0 r9 = net.time4j.engine.p0.ERROR_MESSAGE
                java.lang.String r10 = "讍\u0001"
                java.lang.String r10 = com.flashget.parentalcontrol.ProtectedSandApp.s(r10)
                r8.M(r9, r10)
                return r11
            L17:
                net.time4j.engine.c r1 = net.time4j.calendar.h0.attribute()
                net.time4j.calendar.h0 r2 = net.time4j.calendar.PersianCalendar.n0()
                java.lang.Object r1 = r9.b(r1, r2)
                net.time4j.calendar.h0 r1 = (net.time4j.calendar.h0) r1
                net.time4j.tz.p r2 = net.time4j.calendar.h0.STD_OFFSET
                net.time4j.calendar.h0 r3 = net.time4j.calendar.h0.ASTRONOMICAL
                if (r1 != r3) goto L40
                net.time4j.engine.c<net.time4j.tz.k> r3 = net.time4j.format.a.f82782d
                boolean r4 = r9.c(r3)
                if (r4 == 0) goto L40
                java.lang.Object r9 = r9.a(r3)
                net.time4j.tz.k r9 = (net.time4j.tz.k) r9
                boolean r3 = r9 instanceof net.time4j.tz.p
                if (r3 == 0) goto L40
                net.time4j.tz.p r9 = (net.time4j.tz.p) r9
                goto L41
            L40:
                r9 = r2
            L41:
                net.time4j.calendar.o0<net.time4j.calendar.j0, net.time4j.calendar.PersianCalendar> r3 = net.time4j.calendar.PersianCalendar.f82213j
                boolean r4 = r8.w(r3)
                java.lang.String r5 = "讎\u0001"
                java.lang.String r5 = com.flashget.parentalcontrol.ProtectedSandApp.s(r5)
                if (r4 == 0) goto L85
                java.lang.Object r3 = r8.r(r3)
                net.time4j.calendar.j0 r3 = (net.time4j.calendar.j0) r3
                int r3 = r3.getValue()
                net.time4j.calendar.o0<java.lang.Integer, net.time4j.calendar.PersianCalendar> r4 = net.time4j.calendar.PersianCalendar.f82214k
                int r4 = r8.l(r4)
                if (r4 == r0) goto Ld9
                boolean r0 = r1.isValid(r10, r3, r4, r9)
                if (r0 == 0) goto L7f
                net.time4j.calendar.PersianCalendar r8 = new net.time4j.calendar.PersianCalendar
                r8.<init>(r10, r3, r4)
                net.time4j.calendar.h0 r10 = net.time4j.calendar.PersianCalendar.n0()
                if (r1 == r10) goto L7e
                long r8 = r1.transform(r8, r9)
                net.time4j.calendar.h0 r10 = net.time4j.calendar.PersianCalendar.n0()
                net.time4j.calendar.PersianCalendar r8 = r10.transform(r8, r2)
            L7e:
                return r8
            L7f:
                net.time4j.engine.p0 r9 = net.time4j.engine.p0.ERROR_MESSAGE
                r8.M(r9, r5)
                goto Ld9
            L85:
                net.time4j.calendar.o0<java.lang.Integer, net.time4j.calendar.PersianCalendar> r2 = net.time4j.calendar.PersianCalendar.f82215l
                int r2 = r8.l(r2)
                if (r2 == r0) goto Ld9
                if (r2 <= 0) goto Ld4
                r0 = 1
                r3 = 0
            L91:
                r4 = 12
                if (r0 > r4) goto Ld4
                r4 = 6
                if (r0 > r4) goto L9b
                r4 = 31
                goto Lac
            L9b:
                r4 = 11
                r6 = 30
                if (r0 > r4) goto La3
            La1:
                r4 = r6
                goto Lac
            La3:
                boolean r4 = r1.isLeapYear(r10, r9)
                if (r4 == 0) goto Laa
                goto La1
            Laa:
                r4 = 29
            Lac:
                int r4 = r4 + r3
                if (r2 <= r4) goto Lb3
                int r0 = r0 + 1
                r3 = r4
                goto L91
            Lb3:
                int r2 = r2 - r3
                boolean r3 = r1.isValid(r10, r0, r2, r9)
                if (r3 == 0) goto Ld4
                net.time4j.calendar.PersianCalendar r8 = new net.time4j.calendar.PersianCalendar
                r8.<init>(r10, r0, r2)
                net.time4j.calendar.h0 r10 = net.time4j.calendar.PersianCalendar.n0()
                if (r1 == r10) goto Ld3
                long r8 = r1.transform(r8, r9)
                net.time4j.calendar.h0 r10 = net.time4j.calendar.PersianCalendar.n0()
                net.time4j.tz.p r11 = net.time4j.calendar.h0.STD_OFFSET
                net.time4j.calendar.PersianCalendar r8 = r10.transform(r8, r11)
            Ld3:
                return r8
            Ld4:
                net.time4j.engine.p0 r9 = net.time4j.engine.p0.ERROR_MESSAGE
                r8.M(r9, r5)
            Ld9:
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: net.time4j.calendar.PersianCalendar.f.e(net.time4j.engine.r, net.time4j.engine.d, boolean, boolean):net.time4j.calendar.PersianCalendar");
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.p k(PersianCalendar persianCalendar, net.time4j.engine.d dVar) {
            h0 h0Var = (h0) dVar.b(h0.attribute(), PersianCalendar.f82219p);
            if (h0Var == PersianCalendar.f82219p) {
                return persianCalendar;
            }
            if (h0Var == h0.ASTRONOMICAL) {
                net.time4j.engine.c<net.time4j.tz.k> cVar = net.time4j.format.a.f82782d;
                if (dVar.c(cVar)) {
                    net.time4j.tz.p pVar = h0.STD_OFFSET;
                    net.time4j.tz.k kVar = (net.time4j.tz.k) dVar.a(cVar);
                    if (kVar instanceof net.time4j.tz.p) {
                        pVar = (net.time4j.tz.p) kVar;
                    }
                    return persianCalendar.y0(pVar);
                }
            }
            return persianCalendar.x0(h0Var);
        }

        @Override // net.time4j.engine.u
        public int g() {
            return net.time4j.l0.T0().g() - 621;
        }

        @Override // net.time4j.engine.u
        public String n(net.time4j.engine.z zVar, Locale locale) {
            return net.time4j.calendar.service.c.a(ProtectedSandApp.s("讏\u0001"), zVar, locale);
        }

        f(a aVar) {
        }
    }

    private static class g implements net.time4j.engine.a0<PersianCalendar, j0> {
        private g() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(PersianCalendar persianCalendar) {
            return PersianCalendar.f82214k;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(PersianCalendar persianCalendar) {
            return PersianCalendar.f82214k;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public j0 getMaximum(PersianCalendar persianCalendar) {
            return j0.ESFAND;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public j0 getMinimum(PersianCalendar persianCalendar) {
            return j0.FARVARDIN;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public j0 getValue(PersianCalendar persianCalendar) {
            return persianCalendar.D0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(PersianCalendar persianCalendar, j0 j0Var) {
            return j0Var != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public PersianCalendar withValue(PersianCalendar persianCalendar, j0 j0Var, boolean z4) {
            if (j0Var == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("讐\u0001"));
            }
            int value = j0Var.getValue();
            return new PersianCalendar(persianCalendar.f82227b, value, Math.min(persianCalendar.f82229d, PersianCalendar.f82220q.b(i0.ANNO_PERSICO, persianCalendar.f82227b, value)));
        }

        g(a aVar) {
        }
    }

    private static class h implements net.time4j.engine.o0<PersianCalendar> {

        /* renamed from: a, reason: collision with root package name */
        private final j f82237a;

        h(j jVar) {
            this.f82237a = jVar;
        }

        private static int e(PersianCalendar persianCalendar) {
            return ((persianCalendar.f82227b * 12) + persianCalendar.f82228c) - 1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public PersianCalendar b(PersianCalendar persianCalendar, long j4) {
            int i4 = b.f82232a[this.f82237a.ordinal()];
            if (i4 == 1) {
                j4 = net.time4j.base.c.i(j4, 12L);
            } else if (i4 != 2) {
                if (i4 == 3) {
                    j4 = net.time4j.base.c.i(j4, 7L);
                } else if (i4 != 4) {
                    throw new UnsupportedOperationException(this.f82237a.name());
                }
                return (PersianCalendar) PersianCalendar.f82220q.e(net.time4j.base.c.f(PersianCalendar.f82220q.f(persianCalendar), j4));
            }
            long f4 = net.time4j.base.c.f(e(persianCalendar), j4);
            int g4 = net.time4j.base.c.g(net.time4j.base.c.b(f4, 12));
            int d5 = net.time4j.base.c.d(f4, 12) + 1;
            return PersianCalendar.J0(g4, d5, Math.min(persianCalendar.f82229d, PersianCalendar.f82220q.b(i0.ANNO_PERSICO, g4, d5)));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(PersianCalendar persianCalendar, PersianCalendar persianCalendar2) {
            int between;
            int i4 = b.f82232a[this.f82237a.ordinal()];
            if (i4 == 1) {
                between = j.MONTHS.between(persianCalendar, persianCalendar2) / 12;
            } else {
                if (i4 == 2) {
                    long e4 = e(persianCalendar2) - e(persianCalendar);
                    return (e4 <= 0 || persianCalendar2.f82229d >= persianCalendar.f82229d) ? (e4 >= 0 || persianCalendar2.f82229d <= persianCalendar.f82229d) ? e4 : e4 + 1 : e4 - 1;
                }
                if (i4 != 3) {
                    if (i4 == 4) {
                        return PersianCalendar.f82220q.f(persianCalendar2) - PersianCalendar.f82220q.f(persianCalendar);
                    }
                    throw new UnsupportedOperationException(this.f82237a.name());
                }
                between = j.DAYS.between(persianCalendar, persianCalendar2) / 7;
            }
            return between;
        }
    }

    private static class i implements o<PersianCalendar> {
        private i() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(i0.ANNO_PERSICO);
        }

        @Override // net.time4j.calendar.o
        public int b(net.time4j.engine.j jVar, int i4, int i5) {
            i0 i0Var = i0.ANNO_PERSICO;
            if (jVar != i0Var) {
                throw new IllegalArgumentException(ProtectedSandApp.s("讓\u0001") + jVar);
            }
            if (jVar != i0Var || i4 < 1 || i4 > 3000 || i5 < 1 || i5 > 12) {
                throw new IllegalArgumentException(androidx.compose.foundation.text.q.a(ProtectedSandApp.s("讑\u0001"), i4, ProtectedSandApp.s("讒\u0001"), i5));
            }
            if (i5 <= 6) {
                return 31;
            }
            return (i5 > 11 && h(jVar, i4) == 365) ? 29 : 30;
        }

        @Override // net.time4j.calendar.o
        public boolean c(net.time4j.engine.j jVar, int i4, int i5, int i6) {
            return jVar == i0.ANNO_PERSICO && i4 >= 1 && i4 <= 3000 && i5 >= 1 && i5 <= 12 && i6 >= 1 && i6 <= b(jVar, i4, i5);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return f(new PersianCalendar(3001, 1, 1)) - 1;
        }

        @Override // net.time4j.engine.l
        public long g() {
            return f(new PersianCalendar(1, 1, 1));
        }

        @Override // net.time4j.calendar.o
        public int h(net.time4j.engine.j jVar, int i4) {
            if (jVar == i0.ANNO_PERSICO) {
                return PersianCalendar.f82219p.isLeapYear(i4) ? 366 : 365;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("讓\u0001") + jVar);
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(PersianCalendar persianCalendar) {
            return PersianCalendar.f82219p.transform(persianCalendar, h0.STD_OFFSET);
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public PersianCalendar e(long j4) {
            return PersianCalendar.f82219p.transform(j4, h0.STD_OFFSET);
        }

        i(a aVar) {
        }
    }

    public enum j implements net.time4j.engine.w {
        YEARS(3.155694336E7d),
        MONTHS(2629745.28d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        j(double d5) {
            this.length = d5;
        }

        public int between(PersianCalendar persianCalendar, PersianCalendar persianCalendar2) {
            return (int) persianCalendar.Y(persianCalendar2, this);
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
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("讘\u0001"), PersianCalendar.class, i0.class, 'G');
        f82211h = iVar;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("讙\u0001"), PersianCalendar.class, 1, 3000, 'y', null, null);
        f82212i = jVar;
        net.time4j.calendar.service.i iVar2 = new net.time4j.calendar.service.i(ProtectedSandApp.s("讚\u0001"), PersianCalendar.class, j0.class, 'M');
        f82213j = iVar2;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("讛\u0001"), PersianCalendar.class, 1, 31, 'd');
        f82214k = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("讜\u0001"), PersianCalendar.class, 1, 365, 'D');
        f82215l = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(PersianCalendar.class, B0());
        f82216m = kVar;
        r0<PersianCalendar> r0Var = new r0<>(PersianCalendar.class, jVar2, kVar);
        f82217n = r0Var;
        f82218o = r0Var;
        f82219p = h0.BORKOWSKI;
        i iVar3 = new i();
        f82220q = iVar3;
        j0.c f4 = j0.c.m(j.class, PersianCalendar.class, new f(), iVar3).f(iVar, new d());
        e eVar = new e(0);
        j jVar4 = j.YEARS;
        j0.c g4 = f4.g(jVar, eVar, jVar4);
        g gVar = new g();
        j jVar5 = j.MONTHS;
        j0.c g5 = g4.g(iVar2, gVar, jVar5);
        e eVar2 = new e(2);
        j jVar6 = j.DAYS;
        j0.c j4 = g5.g(jVar2, eVar2, jVar6).g(jVar3, new e(3), jVar6).g(kVar, new s0(B0(), new a()), jVar6).f(r0Var, new r0.a(r0Var)).f(net.time4j.calendar.d.f82409a, new l0(iVar3, jVar3)).j(jVar4, new h(jVar4), jVar4.getLength(), Collections.singleton(jVar5)).j(jVar5, new h(jVar5), jVar5.getLength(), Collections.singleton(jVar4));
        j jVar7 = j.WEEKS;
        net.time4j.engine.j0<j, PersianCalendar> c5 = j4.j(jVar7, new h(jVar7), jVar7.getLength(), Collections.singleton(jVar6)).j(jVar6, new h(jVar6), jVar6.getLength(), Collections.singleton(jVar7)).h(new d.h(PersianCalendar.class, jVar2, jVar3, B0())).c();
        f82221r = c5;
        f82222s = net.time4j.calendar.d.i(c5, B0());
        f82223t = net.time4j.calendar.d.k(c5, B0());
        f82224u = net.time4j.calendar.d.j(c5, B0());
        f82225v = net.time4j.calendar.d.d(c5, B0());
        f82226w = net.time4j.calendar.d.c(c5, B0());
    }

    PersianCalendar(int i4, int i5, int i6) {
        this.f82227b = i4;
        this.f82228c = i5;
        this.f82229d = i6;
    }

    public static i1 B0() {
        g1 g1Var = g1.SATURDAY;
        g1 g1Var2 = g1.FRIDAY;
        return i1.m(g1Var, 1, g1Var2, g1Var2);
    }

    public static boolean F0(int i4, int i5, int i6) {
        return f82220q.c(i0.ANNO_PERSICO, i4, i5, i6);
    }

    public static PersianCalendar I0() {
        return (PersianCalendar) w0.g().f(f82221r);
    }

    public static PersianCalendar J0(int i4, int i5, int i6) {
        if (f82220q.c(i0.ANNO_PERSICO, i4, i5, i6)) {
            return new PersianCalendar(i4, i5, i6);
        }
        StringBuilder a5 = n1.a(ProtectedSandApp.s("讝\u0001"), i4, ProtectedSandApp.s("讞\u0001"), i5, ProtectedSandApp.s("讟\u0001"));
        a5.append(i6);
        throw new IllegalArgumentException(a5.toString());
    }

    public static PersianCalendar K0(int i4, j0 j0Var, int i5) {
        return J0(i4, j0Var.getValue(), i5);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("讠\u0001"));
    }

    public static net.time4j.engine.j0<j, PersianCalendar> v0() {
        return f82221r;
    }

    private Object writeReplace() {
        return new SPX(this);
    }

    public int A0() {
        return ((Integer) r(f82215l)).intValue();
    }

    public i0 C0() {
        return i0.ANNO_PERSICO;
    }

    public j0 D0() {
        return j0.valueOf(this.f82228c);
    }

    public boolean E0() {
        return H0() > 365;
    }

    public int G0() {
        return f82220q.b(i0.ANNO_PERSICO, this.f82227b, this.f82228c);
    }

    public int H0() {
        return f82220q.h(i0.ANNO_PERSICO, this.f82227b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public net.time4j.engine.j0<j, PersianCalendar> y() {
        return f82221r;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PersianCalendar)) {
            return false;
        }
        PersianCalendar persianCalendar = (PersianCalendar) obj;
        return this.f82229d == persianCalendar.f82229d && this.f82228c == persianCalendar.f82228c && this.f82227b == persianCalendar.f82227b;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f82227b * 37) + (this.f82228c * 31) + (this.f82229d * 17);
    }

    public int o() {
        return this.f82227b;
    }

    public int t() {
        return this.f82229d;
    }

    public net.time4j.u<PersianCalendar> t0(net.time4j.m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(32, ProtectedSandApp.s("计\u0001"));
        String valueOf = String.valueOf(this.f82227b);
        for (int length = valueOf.length(); length < 4; length++) {
            a5.append('0');
        }
        a5.append(valueOf);
        a5.append('-');
        if (this.f82228c < 10) {
            a5.append('0');
        }
        a5.append(this.f82228c);
        a5.append('-');
        if (this.f82229d < 10) {
            a5.append('0');
        }
        a5.append(this.f82229d);
        return a5.toString();
    }

    public net.time4j.u<PersianCalendar> u0(int i4, int i5) {
        return net.time4j.u.h(this, net.time4j.m0.b1(i4, i5));
    }

    protected PersianCalendar w0() {
        return this;
    }

    public c x0(h0 h0Var) {
        net.time4j.tz.p pVar = h0.STD_OFFSET;
        h0 h0Var2 = f82219p;
        a aVar = null;
        return h0Var == h0Var2 ? new c(this, h0Var2, pVar, aVar) : new c(h0Var.transform(h0Var2.transform(this, pVar), pVar), h0Var, pVar, aVar);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82221r;
    }

    public c y0(net.time4j.tz.p pVar) {
        if (pVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("订\u0001"));
        }
        h0 h0Var = h0.ASTRONOMICAL;
        return new c(h0Var.transform(f82219p.transform(this, h0.STD_OFFSET), pVar), h0Var, pVar, null);
    }

    @Override // net.time4j.engine.r
    protected net.time4j.engine.r z() {
        return this;
    }

    public g1 z0() {
        return g1.valueOf(net.time4j.base.c.d(f82220q.f(this) + 5, 7) + 1);
    }
}
