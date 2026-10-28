package net.time4j.calendar.frenchrev;

import androidx.collection.n1;
import androidx.core.graphics.y;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import net.time4j.calendar.o0;
import net.time4j.engine.ChronoException;
import net.time4j.engine.a0;
import net.time4j.engine.b0;
import net.time4j.engine.d0;
import net.time4j.engine.e0;
import net.time4j.engine.g0;
import net.time4j.engine.j0;
import net.time4j.engine.n;
import net.time4j.engine.p;
import net.time4j.engine.p0;
import net.time4j.engine.q;
import net.time4j.engine.r;
import net.time4j.engine.w;
import net.time4j.engine.z;
import net.time4j.format.u;
import net.time4j.format.v;
import net.time4j.format.x;
import net.time4j.g1;
import net.time4j.i1;
import net.time4j.l0;
import net.time4j.m0;
import net.time4j.w0;

/* compiled from: FrenchRepublicanCalendar.java */
@net.time4j.format.c("frenchrev")
/* loaded from: classes7.dex */
public final class c extends n<k, c> {

    /* renamed from: d, reason: collision with root package name */
    static final int f82456d = 1202;

    /* renamed from: e, reason: collision with root package name */
    private static final int f82457e = 0;

    /* renamed from: f, reason: collision with root package name */
    private static final int f82458f = 1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f82459g = 2;

    /* renamed from: h, reason: collision with root package name */
    private static final int f82460h = 3;

    /* renamed from: i, reason: collision with root package name */
    @d0(dynamic = true, format = "G")
    public static final q<net.time4j.calendar.frenchrev.d> f82461i;

    /* renamed from: j, reason: collision with root package name */
    @d0(alt = "y", dynamic = true, format = "Y")
    public static final o0<Integer, c> f82462j;

    /* renamed from: k, reason: collision with root package name */
    private static final i f82463k;

    /* renamed from: l, reason: collision with root package name */
    private static final C1283c f82464l;

    /* renamed from: m, reason: collision with root package name */
    @d0(alt = "s", dynamic = true, format = "S")
    public static final q<net.time4j.calendar.frenchrev.f> f82465m;

    /* renamed from: n, reason: collision with root package name */
    @d0(alt = "m", dynamic = true, format = "M")
    public static final o0<net.time4j.calendar.frenchrev.e, c> f82466n;

    /* renamed from: o, reason: collision with root package name */
    public static final o0<Integer, c> f82467o;

    /* renamed from: p, reason: collision with root package name */
    @d0(alt = "c", dynamic = true, format = "C")
    public static final q<net.time4j.calendar.frenchrev.a> f82468p;

    /* renamed from: q, reason: collision with root package name */
    @d0(alt = "d", dynamic = true, format = "D")
    public static final o0<Integer, c> f82469q;

    /* renamed from: r, reason: collision with root package name */
    public static final o0<Integer, c> f82470r;

    /* renamed from: s, reason: collision with root package name */
    @d0(dynamic = true, format = "E")
    public static final o0<g1, c> f82471s;
    private static final long serialVersionUID = -6054794927532842783L;

    /* renamed from: t, reason: collision with root package name */
    private static final net.time4j.engine.l<c> f82472t;

    /* renamed from: u, reason: collision with root package name */
    private static final j0<k, c> f82473u;

    /* renamed from: v, reason: collision with root package name */
    private static final net.time4j.calendar.frenchrev.b f82474v;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82475b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82476c;

    /* compiled from: FrenchRepublicanCalendar.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82477a;

        static {
            int[] iArr = new int[k.values().length];
            f82477a = iArr;
            try {
                iArr[k.YEARS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82477a[k.MONTHS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82477a[k.DECADES.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82477a[k.WEEKS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82477a[k.DAYS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    public static final class b implements p {

        /* renamed from: b, reason: collision with root package name */
        private final c f82478b;

        /* renamed from: c, reason: collision with root package name */
        private final net.time4j.calendar.frenchrev.b f82479c;

        /* synthetic */ b(c cVar, net.time4j.calendar.frenchrev.b bVar, a aVar) {
            this(cVar, bVar);
        }

        @Override // net.time4j.engine.p
        public boolean e() {
            return false;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            if (this.f82479c != bVar.f82479c) {
                return false;
            }
            return this.f82478b.equals(bVar.f82478b);
        }

        @Override // net.time4j.engine.p
        public <V> V g(q<V> qVar) {
            if (c.f82473u.K(qVar)) {
                return (V) this.f82478b.g(qVar);
            }
            throw new ChronoException(ProtectedSandApp.s("踣\u0001"));
        }

        public int hashCode() {
            return (this.f82479c.hashCode() * 31) + (this.f82478b.hashCode() * 7);
        }

        @Override // net.time4j.engine.p
        public <V> V i(q<V> qVar) {
            if (c.f82473u.K(qVar)) {
                return (V) this.f82478b.i(qVar);
            }
            throw new ChronoException(ProtectedSandApp.s("踣\u0001"));
        }

        @Override // net.time4j.engine.p
        public int l(q<Integer> qVar) {
            if (c.f82473u.K(qVar)) {
                return this.f82478b.l(qVar);
            }
            return Integer.MIN_VALUE;
        }

        @Override // net.time4j.engine.p
        public <V> V r(q<V> qVar) {
            if (qVar == c.f82471s) {
                return qVar.getType().cast(g1.valueOf(net.time4j.base.c.d(this.f82479c.transform(this.f82478b) + 5, 7) + 1));
            }
            if (qVar instanceof b0) {
                return qVar.getType().cast(Long.valueOf(((b0) b0.class.cast(qVar)).transform(this.f82479c.transform(this.f82478b), b0.UTC)));
            }
            if (c.f82473u.K(qVar)) {
                return (V) this.f82478b.r(qVar);
            }
            throw new ChronoException(ProtectedSandApp.s("踣\u0001"));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f82478b);
            sb.append('[');
            sb.append(this.f82479c);
            sb.append(']');
            return sb.toString();
        }

        @Override // net.time4j.engine.p
        public net.time4j.tz.k v() {
            throw new ChronoException(ProtectedSandApp.s("踤\u0001"));
        }

        @Override // net.time4j.engine.p
        public boolean w(q<?> qVar) {
            return c.f82473u.K(qVar);
        }

        private b(c cVar, net.time4j.calendar.frenchrev.b bVar) {
            this.f82478b = cVar;
            this.f82479c = bVar;
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    /* renamed from: net.time4j.calendar.frenchrev.c$c, reason: collision with other inner class name */
    private static class C1283c extends net.time4j.engine.e<net.time4j.calendar.frenchrev.a> implements v<net.time4j.calendar.frenchrev.a>, a0<c, net.time4j.calendar.frenchrev.a> {
        private static final long serialVersionUID = -8211850819064695450L;

        C1283c() {
            super(ProtectedSandApp.s("踥\u0001"));
        }

        private u y(Locale locale, net.time4j.engine.d dVar) {
            x xVar = (x) dVar.b(net.time4j.format.a.f82785g, x.WIDE);
            net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f82786h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            return net.time4j.format.b.d(ProtectedSandApp.s("踩\u0001"), locale).p(name(), getType(), xVar == x.NARROW ? ProtectedSandApp.s("踦\u0001") : ((net.time4j.format.m) dVar.b(cVar, mVar)) == mVar ? ProtectedSandApp.s("踧\u0001") : ProtectedSandApp.s("踨\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(c cVar) {
            return null;
        }

        @Override // net.time4j.engine.q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.a getDefaultMaximum() {
            return net.time4j.calendar.frenchrev.a.DECADI;
        }

        @Override // net.time4j.engine.q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.a getDefaultMinimum() {
            return net.time4j.calendar.frenchrev.a.PRIMIDI;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.a getMaximum(c cVar) {
            if (!cVar.H0()) {
                return net.time4j.calendar.frenchrev.a.DECADI;
            }
            throw new ChronoException(ProtectedSandApp.s("踪\u0001") + cVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.a getMinimum(c cVar) {
            if (!cVar.H0()) {
                return net.time4j.calendar.frenchrev.a.PRIMIDI;
            }
            throw new ChronoException(ProtectedSandApp.s("踫\u0001") + cVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.a getValue(c cVar) {
            return cVar.y0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean j(c cVar, net.time4j.calendar.frenchrev.a aVar) {
            return (aVar == null || cVar.H0()) ? false : true;
        }

        @Override // net.time4j.format.v
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.a parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            return (net.time4j.calendar.frenchrev.a) y((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), dVar).d(charSequence, parsePosition, getType(), dVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public c withValue(c cVar, net.time4j.calendar.frenchrev.a aVar, boolean z4) {
            if (aVar == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("踭\u0001"));
            }
            if (cVar.H0()) {
                throw new IllegalArgumentException(ProtectedSandApp.s("踬\u0001"));
            }
            int value = aVar.getValue() - (((cVar.f82476c - 1) % 10) + 1);
            return value == 0 ? cVar : new c(cVar.f82475b, cVar.f82476c + value);
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            String str = net.time4j.format.b.d(ProtectedSandApp.s("踩\u0001"), locale).o().get(ProtectedSandApp.s("踮\u0001"));
            return str == null ? name() : str;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'C';
        }

        @Override // net.time4j.engine.q
        public Class<net.time4j.calendar.frenchrev.a> getType() {
            return net.time4j.calendar.frenchrev.a.class;
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
        public void print(p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            appendable.append(y((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), dVar).g((net.time4j.calendar.frenchrev.a) pVar.r(this)));
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(c cVar) {
            return null;
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class d implements a0<c, net.time4j.calendar.frenchrev.d> {
        private d() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(c cVar) {
            return c.f82462j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(c cVar) {
            return c.f82462j;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.d getMaximum(c cVar) {
            return net.time4j.calendar.frenchrev.d.REPUBLICAN;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.d getMinimum(c cVar) {
            return net.time4j.calendar.frenchrev.d.REPUBLICAN;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.d getValue(c cVar) {
            return net.time4j.calendar.frenchrev.d.REPUBLICAN;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(c cVar, net.time4j.calendar.frenchrev.d dVar) {
            return dVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c withValue(c cVar, net.time4j.calendar.frenchrev.d dVar, boolean z4) {
            if (dVar != null) {
                return cVar;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("踯\u0001"));
        }

        d(a aVar) {
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class e implements net.time4j.engine.o0<c> {

        /* renamed from: a, reason: collision with root package name */
        private final k f82480a;

        e(k kVar) {
            this.f82480a = kVar;
        }

        private static int e(c cVar) {
            return ((f(cVar) * 3) + (cVar.H0() ? 3 : cVar.B0())) - 1;
        }

        private static int f(c cVar) {
            return ((cVar.f82475b * 12) + (cVar.H0() ? 12 : cVar.E0().getValue())) - 1;
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c b(c cVar, long j4) {
            int i4 = a.f82477a[this.f82480a.ordinal()];
            if (i4 == 1) {
                int g4 = net.time4j.base.c.g(net.time4j.base.c.f(cVar.f82475b, j4));
                if (g4 < 1 || g4 > 1202) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("踰\u0001"), g4));
                }
                return new c(g4, Math.min(cVar.f82476c, c.K0(g4) ? 366 : 365));
            }
            if (i4 == 2) {
                long f4 = net.time4j.base.c.f(f(cVar), j4);
                return c.O0(net.time4j.base.c.g(net.time4j.base.c.b(f4, 12)), net.time4j.base.c.d(f4, 12) + 1, cVar.H0() ? 30 : cVar.t());
            }
            if (i4 == 3) {
                long f5 = net.time4j.base.c.f(e(cVar), j4);
                int g5 = net.time4j.base.c.g(net.time4j.base.c.b(f5, 36));
                int d5 = net.time4j.base.c.d(f5, 36);
                return c.O0(g5, net.time4j.base.c.a(d5, 3) + 1, (net.time4j.base.c.c(d5, 3) * 10) + (((cVar.H0() ? 30 : cVar.t()) - 1) % 10) + 1);
            }
            if (i4 == 4) {
                j4 = net.time4j.base.c.i(j4, 7L);
            } else if (i4 != 5) {
                throw new UnsupportedOperationException(this.f82480a.name());
            }
            return (c) c.f82472t.e(net.time4j.base.c.f(c.f82472t.f(cVar), j4));
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(c cVar, c cVar2) {
            int i4 = a.f82477a[this.f82480a.ordinal()];
            if (i4 == 1) {
                int i5 = cVar2.f82475b - cVar.f82475b;
                if (i5 > 0 && cVar2.f82476c < cVar.f82476c) {
                    i5--;
                } else if (i5 < 0 && cVar2.f82476c > cVar.f82476c) {
                    i5++;
                }
                return i5;
            }
            if (i4 == 2) {
                long f4 = f(cVar2) - f(cVar);
                int t4 = cVar.H0() ? cVar.f82476c - 330 : cVar.t();
                int t5 = cVar2.H0() ? cVar2.f82476c - 330 : cVar2.t();
                return (f4 <= 0 || t5 >= t4) ? (f4 >= 0 || t5 <= t4) ? f4 : f4 + 1 : f4 - 1;
            }
            if (i4 == 3) {
                long e4 = e(cVar2) - e(cVar);
                int value = cVar.H0() ? cVar.f82476c - 350 : cVar.y0().getValue();
                int value2 = cVar2.H0() ? cVar2.f82476c - 350 : cVar2.y0().getValue();
                return (e4 <= 0 || value2 >= value) ? (e4 >= 0 || value2 <= value) ? e4 : e4 + 1 : e4 - 1;
            }
            if (i4 == 4) {
                return k.DAYS.between(cVar, cVar2) / 7;
            }
            if (i4 == 5) {
                return c.f82472t.f(cVar2) - c.f82472t.f(cVar);
            }
            throw new UnsupportedOperationException(this.f82480a.name());
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class f implements e0<c> {

        /* renamed from: b, reason: collision with root package name */
        private final int f82481b;

        f(int i4) {
            this.f82481b = i4;
        }

        private int g(c cVar) {
            int i4 = this.f82481b;
            if (i4 == 0) {
                return 1202;
            }
            if (i4 == 1 || i4 == 2) {
                if (!cVar.H0()) {
                    return this.f82481b == 2 ? 30 : 3;
                }
                throw new ChronoException(ProtectedSandApp.s("踲\u0001") + cVar);
            }
            if (i4 == 3) {
                return c.f82474v.isLeapYear(cVar.f82475b) ? 366 : 365;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("踱\u0001") + this.f82481b);
        }

        private int i(c cVar) {
            int i4 = this.f82481b;
            if (i4 != 0) {
                if (i4 == 1 || i4 == 2) {
                    if (!cVar.H0()) {
                        return 1;
                    }
                    throw new ChronoException(ProtectedSandApp.s("踳\u0001") + cVar);
                }
                if (i4 != 3) {
                    throw new UnsupportedOperationException(ProtectedSandApp.s("踱\u0001") + this.f82481b);
                }
            }
            return 1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(c cVar) {
            int i4 = this.f82481b;
            if (i4 == 0) {
                return c.f82465m;
            }
            if (i4 == 1) {
                return c.f82468p;
            }
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(c cVar) {
            int i4 = this.f82481b;
            if (i4 == 0) {
                return c.f82466n;
            }
            if (i4 == 1) {
                return c.f82468p;
            }
            return null;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(c cVar) {
            int i4 = this.f82481b;
            if (i4 == 0) {
                return cVar.f82475b;
            }
            if (i4 == 1) {
                return cVar.B0();
            }
            if (i4 == 2) {
                return cVar.t();
            }
            if (i4 == 3) {
                return cVar.f82476c;
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("踱\u0001") + this.f82481b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(c cVar) {
            return Integer.valueOf(g(cVar));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(c cVar) {
            return Integer.valueOf(i(cVar));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public Integer getValue(c cVar) {
            return Integer.valueOf(d(cVar));
        }

        @Override // net.time4j.engine.e0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public boolean e(c cVar, int i4) {
            int i5 = this.f82481b;
            if ((i5 == 2 || i5 == 1) && cVar.H0()) {
                return false;
            }
            return i(cVar) <= i4 && g(cVar) >= i4;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public boolean j(c cVar, Integer num) {
            return num != null && e(cVar, num.intValue());
        }

        @Override // net.time4j.engine.e0
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public c a(c cVar, int i4, boolean z4) {
            if (this.f82481b == 2 && cVar.H0()) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("踴\u0001"), i4));
            }
            if (this.f82481b == 1 && cVar.H0()) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("踵\u0001"), i4));
            }
            if (!e(cVar, i4)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("踶\u0001"), i4));
            }
            int i5 = this.f82481b;
            if (i5 == 0) {
                return new c(i4, Math.min(cVar.f82476c, c.f82474v.isLeapYear(i4) ? 366 : 365));
            }
            if (i5 == 1) {
                return c.P0(cVar.f82475b, cVar.E0(), ((cVar.t() - 1) % 10) + ((i4 - 1) * 10) + 1);
            }
            if (i5 == 2) {
                return c.P0(cVar.f82475b, cVar.E0(), i4);
            }
            if (i5 == 3) {
                return new c(cVar.f82475b, i4);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("踱\u0001") + this.f82481b);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public c withValue(c cVar, Integer num, boolean z4) {
            if (num != null) {
                return a(cVar, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("踷\u0001"));
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class g implements net.time4j.engine.u<c> {
        private g() {
        }

        @Override // net.time4j.engine.u
        public g0 a() {
            return g0.f82720a;
        }

        /* JADX WARN: Type inference failed for: r4v2, types: [net.time4j.base.f] */
        @Override // net.time4j.engine.u
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public c o(net.time4j.base.e<?> eVar, net.time4j.engine.d dVar) {
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
            return (c) net.time4j.d0.y0(eVar.c()).d1(c.f82473u, G, (g0) dVar.b(net.time4j.format.a.f82799u, a())).m();
        }

        @Override // net.time4j.engine.u
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public c e(r<?> rVar, net.time4j.engine.d dVar, boolean z4, boolean z5) {
            int l4;
            net.time4j.calendar.frenchrev.b bVar = (net.time4j.calendar.frenchrev.b) dVar.b(net.time4j.calendar.frenchrev.b.attribute(), c.f82474v);
            int l5 = rVar.l(c.f82462j);
            c cVar = null;
            if (l5 == Integer.MIN_VALUE) {
                rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("踸\u0001"));
                return null;
            }
            if (l5 < 1 || l5 > 1202) {
                rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("踻\u0001") + l5);
                return null;
            }
            o0<net.time4j.calendar.frenchrev.e, c> o0Var = c.f82466n;
            boolean w4 = rVar.w(o0Var);
            String s4 = ProtectedSandApp.s("踹\u0001");
            if (w4) {
                int value = ((net.time4j.calendar.frenchrev.e) rVar.r(o0Var)).getValue();
                int l6 = rVar.l(c.f82469q);
                if (l6 == Integer.MIN_VALUE) {
                    q<?> qVar = c.f82468p;
                    if (rVar.w(qVar) && (l4 = rVar.l(c.f82467o)) != Integer.MIN_VALUE) {
                        l6 = ((net.time4j.calendar.frenchrev.a) rVar.r(qVar)).getValue() + ((l4 - 1) * 10);
                    }
                }
                if (l6 != Integer.MIN_VALUE) {
                    if (l6 < 1 || l6 > 30) {
                        rVar.M(p0.ERROR_MESSAGE, s4);
                    } else {
                        cVar = c.O0(l5, value, l6);
                    }
                }
            } else {
                q<?> qVar2 = c.f82465m;
                if (rVar.w(qVar2)) {
                    int value2 = ((net.time4j.calendar.frenchrev.f) rVar.r(qVar2)).getValue() + 360;
                    if (value2 != 6 || bVar.isLeapYear(l5)) {
                        cVar = new c(l5, value2);
                    } else {
                        rVar.M(p0.ERROR_MESSAGE, ProtectedSandApp.s("踺\u0001"));
                    }
                } else {
                    int l7 = rVar.l(c.f82470r);
                    if (l7 != Integer.MIN_VALUE) {
                        if (l7 >= 1) {
                            if (l7 <= (bVar.isLeapYear(l5) ? 366 : 365)) {
                                cVar = new c(l5, l7);
                            }
                        }
                        rVar.M(p0.ERROR_MESSAGE, s4);
                    }
                }
            }
            return (cVar == null || bVar == c.f82474v) ? cVar : c.f82474v.transform(bVar.transform(cVar));
        }

        @Override // net.time4j.engine.u
        public net.time4j.engine.x<?> d() {
            return null;
        }

        @Override // net.time4j.engine.u
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public p k(c cVar, net.time4j.engine.d dVar) {
            net.time4j.calendar.frenchrev.b bVar = (net.time4j.calendar.frenchrev.b) dVar.b(net.time4j.calendar.frenchrev.b.attribute(), c.f82474v);
            return bVar == c.f82474v ? cVar : cVar.x0(bVar);
        }

        @Override // net.time4j.engine.u
        public int g() {
            return l0.T0().g() - 1792;
        }

        @Override // net.time4j.engine.u
        public String n(z zVar, Locale locale) {
            throw new UnsupportedOperationException(ProtectedSandApp.s("踼\u0001"));
        }

        g(a aVar) {
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class h implements a0<c, net.time4j.calendar.frenchrev.e> {
        private h() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(c cVar) {
            return c.f82469q;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(c cVar) {
            return c.f82469q;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.e getMaximum(c cVar) {
            return net.time4j.calendar.frenchrev.e.FRUCTIDOR;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.e getMinimum(c cVar) {
            return net.time4j.calendar.frenchrev.e.VENDEMIAIRE;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.e getValue(c cVar) {
            return cVar.E0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(c cVar, net.time4j.calendar.frenchrev.e eVar) {
            return eVar != null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c withValue(c cVar, net.time4j.calendar.frenchrev.e eVar, boolean z4) {
            if (eVar != null) {
                return cVar.H0() ? c.P0(cVar.f82475b, eVar, 30) : c.P0(cVar.f82475b, eVar, cVar.t());
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("踽\u0001"));
        }

        h(a aVar) {
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class i extends net.time4j.engine.e<net.time4j.calendar.frenchrev.f> implements v<net.time4j.calendar.frenchrev.f>, a0<c, net.time4j.calendar.frenchrev.f> {
        private static final long serialVersionUID = -6615947737325572130L;

        i() {
            super(ProtectedSandApp.s("踾\u0001"));
        }

        private u y(Locale locale, net.time4j.format.m mVar) {
            return net.time4j.format.b.d(ProtectedSandApp.s("蹁\u0001"), locale).p(name(), getType(), mVar == net.time4j.format.m.FORMAT ? ProtectedSandApp.s("踿\u0001") : ProtectedSandApp.s("蹀\u0001"));
        }

        @Override // net.time4j.engine.a0
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(c cVar) {
            return null;
        }

        @Override // net.time4j.engine.q
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.f getDefaultMaximum() {
            return net.time4j.calendar.frenchrev.f.COMPLEMENTARY_DAY_5;
        }

        @Override // net.time4j.engine.q
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.f getDefaultMinimum() {
            return net.time4j.calendar.frenchrev.f.COMPLEMENTARY_DAY_1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.f getMaximum(c cVar) {
            return cVar.J0() ? net.time4j.calendar.frenchrev.f.LEAP_DAY : net.time4j.calendar.frenchrev.f.COMPLEMENTARY_DAY_5;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.f getMinimum(c cVar) {
            return net.time4j.calendar.frenchrev.f.COMPLEMENTARY_DAY_1;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.f getValue(c cVar) {
            return cVar.F0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: I, reason: merged with bridge method [inline-methods] */
        public boolean j(c cVar, net.time4j.calendar.frenchrev.f fVar) {
            if (fVar != null) {
                return cVar.J0() || fVar != net.time4j.calendar.frenchrev.f.LEAP_DAY;
            }
            return false;
        }

        @Override // net.time4j.format.v
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public net.time4j.calendar.frenchrev.f parse(CharSequence charSequence, ParsePosition parsePosition, net.time4j.engine.d dVar) {
            int index = parsePosition.getIndex();
            Locale locale = (Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT);
            net.time4j.engine.c<net.time4j.format.m> cVar = net.time4j.format.a.f82786h;
            net.time4j.format.m mVar = net.time4j.format.m.FORMAT;
            net.time4j.format.m mVar2 = (net.time4j.format.m) dVar.b(cVar, mVar);
            net.time4j.calendar.frenchrev.f fVar = (net.time4j.calendar.frenchrev.f) y(locale, mVar2).d(charSequence, parsePosition, getType(), dVar);
            if (fVar != null || !((Boolean) dVar.b(net.time4j.format.a.f82789k, Boolean.TRUE)).booleanValue()) {
                return fVar;
            }
            parsePosition.setErrorIndex(-1);
            parsePosition.setIndex(index);
            if (mVar2 == mVar) {
                mVar = net.time4j.format.m.STANDALONE;
            }
            return (net.time4j.calendar.frenchrev.f) y(locale, mVar).d(charSequence, parsePosition, getType(), dVar);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public c withValue(c cVar, net.time4j.calendar.frenchrev.f fVar, boolean z4) {
            if (fVar != null) {
                return c.Q0(cVar.f82475b, fVar);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("蹂\u0001"));
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public String getDisplayName(Locale locale) {
            String str = net.time4j.format.b.d(ProtectedSandApp.s("蹁\u0001"), locale).o().get(ProtectedSandApp.s("蹃\u0001"));
            return str == null ? name() : str;
        }

        @Override // net.time4j.engine.e, net.time4j.engine.q
        public char getSymbol() {
            return 'S';
        }

        @Override // net.time4j.engine.q
        public Class<net.time4j.calendar.frenchrev.f> getType() {
            return net.time4j.calendar.frenchrev.f.class;
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
        public void print(p pVar, Appendable appendable, net.time4j.engine.d dVar) throws IOException, ChronoException {
            appendable.append(y((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT), (net.time4j.format.m) dVar.b(net.time4j.format.a.f82786h, net.time4j.format.m.FORMAT)).g((net.time4j.calendar.frenchrev.f) pVar.r(this)));
        }

        @Override // net.time4j.engine.e
        protected boolean u() {
            return true;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: z, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(c cVar) {
            return null;
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class j implements net.time4j.engine.l<c> {
        private j() {
        }

        @Override // net.time4j.engine.l
        public List<net.time4j.engine.j> a() {
            return Collections.singletonList(net.time4j.calendar.frenchrev.d.REPUBLICAN);
        }

        @Override // net.time4j.engine.l
        public long d() {
            return f(new c(1202, 366));
        }

        @Override // net.time4j.engine.l
        public long g() {
            return f(new c(1, 1));
        }

        @Override // net.time4j.engine.l
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public long f(c cVar) {
            return c.f82474v.transform(cVar);
        }

        @Override // net.time4j.engine.l
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c e(long j4) {
            return c.f82474v.transform(j4);
        }

        j(a aVar) {
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    public enum k implements w {
        YEARS(3.1556941113599997E7d),
        MONTHS(2592000.0d),
        DECADES(864000.0d),
        WEEKS(604800.0d),
        DAYS(86400.0d);

        private final transient double length;

        k(double d5) {
            this.length = d5;
        }

        public long between(c cVar, c cVar2) {
            return cVar.Y(cVar2, this);
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

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class l implements a0<c, g1> {
        private l() {
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtCeiling(c cVar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public q<?> getChildAtFloor(c cVar) {
            return null;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g1 getMaximum(c cVar) {
            return (cVar.f82475b == 1202 && cVar.f82476c == 366) ? g1.SUNDAY : g1.SATURDAY;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g1 getMinimum(c cVar) {
            return (cVar.f82475b == 1 && cVar.f82476c == 1) ? g1.SATURDAY : g1.SUNDAY;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public g1 getValue(c cVar) {
            return cVar.z0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(c cVar, g1 g1Var) {
            if (g1Var == null) {
                return false;
            }
            int value = g1Var.getValue(c.C0());
            return getMinimum(cVar).getValue(c.C0()) <= value && value <= getMaximum(cVar).getValue(c.C0());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public c withValue(c cVar, g1 g1Var, boolean z4) {
            if (g1Var == null) {
                throw new IllegalArgumentException(ProtectedSandApp.s("蹉\u0001"));
            }
            i1 C0 = c.C0();
            return cVar.h0(net.time4j.engine.i.i(g1Var.getValue(C0) - cVar.z0().getValue(C0)));
        }

        l(a aVar) {
        }
    }

    /* compiled from: FrenchRepublicanCalendar.java */
    private static class m extends net.time4j.calendar.service.a<c> {
        private static final long serialVersionUID = 7337125729623271040L;

        /* synthetic */ m(a aVar) {
            this();
        }

        @Override // net.time4j.calendar.service.a
        protected net.time4j.format.j C(net.time4j.engine.d dVar) {
            return (((String) dVar.b(net.time4j.format.a.f82802x, "")).contains(ProtectedSandApp.s("蹋\u0001")) && ((Locale) dVar.b(net.time4j.format.a.f82781c, Locale.ROOT)).getLanguage().equals(ProtectedSandApp.s("蹌\u0001"))) ? net.time4j.format.j.ROMAN : (net.time4j.format.j) dVar.b(net.time4j.format.a.f82790l, net.time4j.format.j.ROMAN);
        }

        private m() {
            super(c.class, 1, 1202, 'Y');
        }
    }

    static {
        net.time4j.calendar.service.i iVar = new net.time4j.calendar.service.i(ProtectedSandApp.s("蹍\u0001"), c.class, net.time4j.calendar.frenchrev.d.class, 'G');
        f82461i = iVar;
        m mVar = new m(null);
        f82462j = mVar;
        i iVar2 = new i();
        f82463k = iVar2;
        C1283c c1283c = new C1283c();
        f82464l = c1283c;
        f82465m = iVar2;
        net.time4j.calendar.service.i iVar3 = new net.time4j.calendar.service.i(ProtectedSandApp.s("蹎\u0001"), c.class, net.time4j.calendar.frenchrev.e.class, 'M');
        f82466n = iVar3;
        net.time4j.calendar.service.j jVar = new net.time4j.calendar.service.j(ProtectedSandApp.s("蹏\u0001"), c.class, 1, 3, (char) 0, null, null);
        f82467o = jVar;
        f82468p = c1283c;
        net.time4j.calendar.service.j jVar2 = new net.time4j.calendar.service.j(ProtectedSandApp.s("蹐\u0001"), c.class, 1, 30, 'D');
        f82469q = jVar2;
        net.time4j.calendar.service.j jVar3 = new net.time4j.calendar.service.j(ProtectedSandApp.s("蹑\u0001"), c.class, 1, 365, (char) 0);
        f82470r = jVar3;
        net.time4j.calendar.service.k kVar = new net.time4j.calendar.service.k(c.class, C0());
        f82471s = kVar;
        f82474v = net.time4j.calendar.frenchrev.b.EQUINOX;
        j jVar4 = new j();
        f82472t = jVar4;
        j0.c f4 = j0.c.m(k.class, c.class, new g(), jVar4).f(iVar, new d());
        f fVar = new f(0);
        k kVar2 = k.YEARS;
        j0.c f5 = f4.g(mVar, fVar, kVar2).f(iVar2, iVar2);
        h hVar = new h();
        k kVar3 = k.MONTHS;
        j0.c g4 = f5.g(iVar3, hVar, kVar3);
        f fVar2 = new f(1);
        k kVar4 = k.DECADES;
        j0.c g5 = g4.g(jVar, fVar2, kVar4);
        f fVar3 = new f(2);
        k kVar5 = k.DAYS;
        j0.c i4 = g5.g(jVar2, fVar3, kVar5).g(jVar3, new f(3), kVar5).g(kVar, new l(), kVar5).f(c1283c, c1283c).i(kVar2, new e(kVar2), kVar2.getLength()).i(kVar3, new e(kVar3), kVar3.getLength()).i(kVar4, new e(kVar4), kVar4.getLength());
        k kVar6 = k.WEEKS;
        f82473u = i4.j(kVar6, new e(kVar6), kVar6.getLength(), Collections.singleton(kVar5)).j(kVar5, new e(kVar5), kVar5.getLength(), Collections.singleton(kVar6)).c();
    }

    c(int i4, int i5) {
        this.f82475b = i4;
        this.f82476c = i5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static i1 C0() {
        g1 g1Var = g1.SUNDAY;
        return i1.m(g1Var, 1, g1Var, g1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static <V> boolean I0(c cVar, q<V> qVar) {
        try {
            return cVar.G(qVar, cVar.r(qVar));
        } catch (ChronoException unused) {
            return false;
        }
    }

    public static boolean K0(int i4) {
        return f82474v.isLeapYear(i4);
    }

    public static boolean L0(int i4, int i5, int i6) {
        return i4 >= 1 && i4 <= 1202 && i5 >= 1 && i5 <= 12 && i6 >= 1 && i6 <= 30;
    }

    public static c N0() {
        return (c) w0.g().f(f82473u);
    }

    public static c O0(int i4, int i5, int i6) {
        if (i4 >= 1 && i4 <= 1202 && i5 >= 1 && i5 <= 12 && i6 >= 1 && i6 <= 30) {
            return new c(i4, y.a(i5, 1, 30, i6));
        }
        StringBuilder a5 = n1.a(ProtectedSandApp.s("蹒\u0001"), i4, ProtectedSandApp.s("蹓\u0001"), i5, ProtectedSandApp.s("蹔\u0001"));
        a5.append(i6);
        throw new IllegalArgumentException(a5.toString());
    }

    public static c P0(int i4, net.time4j.calendar.frenchrev.e eVar, int i5) {
        return O0(i4, eVar.getValue(), i5);
    }

    public static c Q0(int i4, net.time4j.calendar.frenchrev.f fVar) {
        if (i4 < 1 || i4 > 1202) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("蹖\u0001"), i4));
        }
        if (fVar != net.time4j.calendar.frenchrev.f.LEAP_DAY || f82474v.isLeapYear(i4)) {
            return new c(i4, fVar.getValue() + 360);
        }
        throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("蹕\u0001"), i4));
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("蹗\u0001"));
    }

    public static j0<k, c> v0() {
        return f82473u;
    }

    private Object writeReplace() {
        return new SPX(this, 18);
    }

    public int A0() {
        return this.f82476c;
    }

    public int B0() {
        int i4 = this.f82476c;
        if (i4 <= 360) {
            return (((i4 - 1) % 30) / 10) + 1;
        }
        throw new ChronoException(ProtectedSandApp.s("蹘\u0001") + toString());
    }

    public net.time4j.calendar.frenchrev.d D0() {
        return net.time4j.calendar.frenchrev.d.REPUBLICAN;
    }

    public net.time4j.calendar.frenchrev.e E0() {
        int i4 = this.f82476c;
        if (i4 <= 360) {
            return net.time4j.calendar.frenchrev.e.valueOf(((i4 - 1) / 30) + 1);
        }
        throw new ChronoException(ProtectedSandApp.s("蹙\u0001") + toString());
    }

    public net.time4j.calendar.frenchrev.f F0() {
        int i4 = this.f82476c;
        if (i4 > 360) {
            return net.time4j.calendar.frenchrev.f.valueOf(i4 - 360);
        }
        throw new ChronoException(ProtectedSandApp.s("蹚\u0001") + toString());
    }

    @Override // net.time4j.engine.r
    public <V> boolean G(q<V> qVar, V v4) {
        return qVar == f82466n ? v4 != null : qVar == f82465m ? f82463k.j(this, (net.time4j.calendar.frenchrev.f) net.time4j.calendar.frenchrev.f.class.cast(v4)) : super.G(qVar, v4);
    }

    public boolean G0() {
        return this.f82476c <= 360;
    }

    public boolean H0() {
        return this.f82476c > 360;
    }

    public boolean J0() {
        return f82474v.isLeapYear(this.f82475b);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // net.time4j.engine.m0
    /* renamed from: Q */
    public j0<k, c> y() {
        return f82473u;
    }

    public c R0() {
        int i4 = this.f82475b;
        while (!f82474v.isLeapYear(i4)) {
            i4++;
        }
        return new c(i4, 366);
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f82475b == cVar.f82475b && this.f82476c == cVar.f82476c;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        return (this.f82475b * 37) + (this.f82476c * 17);
    }

    public int o() {
        return this.f82475b;
    }

    public int t() {
        int i4 = this.f82476c;
        if (i4 <= 360) {
            return ((i4 - 1) % 30) + 1;
        }
        throw new ChronoException(ProtectedSandApp.s("蹛\u0001") + toString());
    }

    public net.time4j.u<c> t0(m0 m0Var) {
        return net.time4j.u.h(this, m0Var);
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(32, ProtectedSandApp.s("蹜\u0001"));
        a5.append(net.time4j.format.j.ROMAN.toNumeral(this.f82475b));
        a5.append('-');
        if (this.f82476c > 360) {
            a5.append(ProtectedSandApp.s("蹝\u0001"));
            a5.append(String.valueOf(this.f82476c - 360));
        } else {
            int value = E0().getValue();
            if (value < 10) {
                a5.append('0');
            }
            a5.append(value);
            a5.append('-');
            int t4 = t();
            if (t4 < 10) {
                a5.append('0');
            }
            a5.append(t4);
        }
        return a5.toString();
    }

    public net.time4j.u<c> u0(int i4, int i5) {
        return net.time4j.u.h(this, m0.b1(i4, i5));
    }

    @Override // net.time4j.engine.r, net.time4j.engine.p
    public boolean w(q<?> qVar) {
        if (qVar == f82466n || qVar == f82467o || qVar == f82468p || qVar == f82469q) {
            return G0();
        }
        if (qVar == f82465m) {
            return H0();
        }
        if (A().contains(qVar)) {
            return true;
        }
        return I0(this, qVar);
    }

    protected c w0() {
        return this;
    }

    public b x0(net.time4j.calendar.frenchrev.b bVar) {
        net.time4j.calendar.frenchrev.b bVar2 = f82474v;
        a aVar = null;
        return bVar == bVar2 ? new b(this, bVar2, aVar) : new b(bVar.transform(bVar2.transform(this)), bVar, aVar);
    }

    @Override // net.time4j.engine.m0, net.time4j.engine.r
    protected net.time4j.engine.x y() {
        return f82473u;
    }

    public net.time4j.calendar.frenchrev.a y0() {
        if (!H0()) {
            return net.time4j.calendar.frenchrev.a.valueOf(((this.f82476c - 1) % 10) + 1);
        }
        throw new ChronoException(ProtectedSandApp.s("蹞\u0001") + toString());
    }

    @Override // net.time4j.engine.r
    protected r z() {
        return this;
    }

    public g1 z0() {
        return g1.valueOf(net.time4j.base.c.d(f82472t.f(this) + 5, 7) + 1);
    }
}
