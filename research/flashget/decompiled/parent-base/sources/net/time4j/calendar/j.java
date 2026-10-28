package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Locale;
import net.time4j.calendar.j;
import net.time4j.calendar.m0;
import net.time4j.calendar.n;
import net.time4j.g1;

/* compiled from: EastAsianCalendar.java */
/* loaded from: classes7.dex */
public abstract class j<U, D extends j<U, D>> extends net.time4j.engine.n<U, D> {

    /* renamed from: h, reason: collision with root package name */
    static final int f82568h = 0;

    /* renamed from: i, reason: collision with root package name */
    static final int f82569i = 1;

    /* renamed from: j, reason: collision with root package name */
    static final int f82570j = 2;

    /* renamed from: k, reason: collision with root package name */
    static final int f82571k = 3;

    /* renamed from: l, reason: collision with root package name */
    static final int f82572l = 0;

    /* renamed from: m, reason: collision with root package name */
    static final int f82573m = 1;

    /* renamed from: n, reason: collision with root package name */
    static final int f82574n = 2;

    /* renamed from: o, reason: collision with root package name */
    static final int f82575o = 3;

    /* renamed from: p, reason: collision with root package name */
    static final int f82576p = 4;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82577b;

    /* renamed from: c, reason: collision with root package name */
    private final transient int f82578c;

    /* renamed from: d, reason: collision with root package name */
    private final transient l f82579d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f82580e;

    /* renamed from: f, reason: collision with root package name */
    private final transient long f82581f;

    /* renamed from: g, reason: collision with root package name */
    private final transient int f82582g;

    /* compiled from: EastAsianCalendar.java */
    private static class b<D extends j<?, D>> implements net.time4j.engine.a0<D, g> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<?> f82583b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f82584c;

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(D d5) {
            return this.f82583b;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(D d5) {
            return this.f82583b;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public g getMaximum(D d5) {
            return g.r(d5.r0() == 94 ? 56 : 60);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public g getMinimum(D d5) {
            return this.f82584c ? d5.r0() == 75 ? g.r(10) : g.r(1) : d5.r0() == 72 ? g.r(22) : g.r(1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public g getValue(D d5) {
            return d5.G0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(D d5, g gVar) {
            return gVar != null && getMinimum(d5).compareTo(gVar) <= 0 && getMaximum(d5).compareTo(gVar) >= 0;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public D withValue(D d5, g gVar, boolean z4) {
            if (!j(d5, gVar)) {
                throw new IllegalArgumentException(ProtectedSandApp.s("郻\u0001") + gVar);
            }
            h<D> p02 = d5.p0();
            int t4 = d5.t();
            l y02 = d5.y0();
            int number = gVar.getNumber();
            int r02 = d5.r0();
            l f4 = (!y02.e() || y02.getNumber() == p02.k(r02, number)) ? y02 : l.f(y02.getNumber());
            if (t4 <= 29) {
                return p02.i(r02, number, f4, t4, p02.y(r02, number, f4, t4));
            }
            long y4 = p02.y(r02, number, f4, 1);
            int min = Math.min(t4, p02.e(y4).J0());
            return p02.i(r02, number, f4, min, (y4 + min) - 1);
        }

        private b(net.time4j.engine.q<?> qVar, boolean z4) {
            this.f82583b = qVar;
            this.f82584c = z4;
        }
    }

    /* compiled from: EastAsianCalendar.java */
    private static class c<D extends j<?, D>> implements net.time4j.engine.o0<D> {

        /* renamed from: a, reason: collision with root package name */
        private final int f82585a;

        c(int i4) {
            this.f82585a = i4;
        }

        private static <D extends j<?, D>> long e(D d5, D d6, int i4) {
            int compareTo;
            D d7;
            D d10;
            int k4;
            h<D> p02 = d5.p0();
            if (i4 == 0) {
                return e(d5, d6, 1) / 60;
            }
            if (i4 == 1) {
                int number = ((d6.G0().getNumber() + (d6.r0() * 60)) - (d5.r0() * 60)) - d5.G0().getNumber();
                if (number > 0) {
                    int compareTo2 = d5.y0().compareTo(d6.y0());
                    if (compareTo2 > 0 || (compareTo2 == 0 && d5.t() > d6.t())) {
                        number--;
                    }
                } else if (number < 0 && ((compareTo = d5.y0().compareTo(d6.y0())) < 0 || (compareTo == 0 && d5.t() < d6.t()))) {
                    number++;
                }
                return number;
            }
            if (i4 != 2) {
                if (i4 == 3) {
                    return (d6.b() - d5.b()) / 7;
                }
                if (i4 == 4) {
                    return d6.b() - d5.b();
                }
                throw new UnsupportedOperationException();
            }
            boolean s4 = d5.s(d6);
            if (s4) {
                d10 = d5;
                d7 = d6;
            } else {
                d7 = d5;
                d10 = d6;
            }
            int r02 = d7.r0();
            int number2 = d7.G0().getNumber();
            l y02 = d7.y0();
            int number3 = y02.getNumber();
            boolean e4 = y02.e();
            int k5 = p02.k(r02, number2);
            int i5 = 0;
            while (true) {
                if (r02 == d10.r0() && number2 == d10.G0().getNumber() && y02.equals(d10.y0())) {
                    break;
                }
                if (e4) {
                    number3++;
                    e4 = false;
                } else if (k5 == number3) {
                    e4 = true;
                } else {
                    number3++;
                }
                if (!e4) {
                    if (number3 == 13) {
                        number2++;
                        if (number2 == 61) {
                            r02++;
                            number2 = 1;
                        }
                        k4 = p02.k(r02, number2);
                        number3 = 1;
                    } else if (number3 == 0) {
                        number2--;
                        if (number2 == 0) {
                            r02--;
                            number2 = 60;
                        }
                        k4 = p02.k(r02, number2);
                        number3 = 12;
                    }
                    k5 = k4;
                }
                y02 = l.f(number3);
                if (e4) {
                    y02 = y02.g();
                }
                i5++;
            }
            if (i5 > 0 && d7.t() > d10.t()) {
                i5--;
            }
            if (s4) {
                i5 = -i5;
            }
            return i5;
        }

        private static void f(long j4) {
            if (j4 > 1200 || j4 < -1200) {
                throw new ArithmeticException(ProtectedSandApp.s("郼\u0001"));
            }
        }

        private static <D extends j<?, D>> D g(int i4, int i5, l lVar, int i6, h<D> hVar) {
            if (i6 <= 29) {
                return hVar.i(i4, i5, lVar, i6, hVar.y(i4, i5, lVar, i6));
            }
            long y4 = hVar.y(i4, i5, lVar, 1);
            int min = Math.min(i6, hVar.e(y4).J0());
            return hVar.i(i4, i5, lVar, min, (y4 + min) - 1);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public D b(D d5, long j4) {
            long j5 = j4;
            h<D> p02 = d5.p0();
            int t4 = d5.t();
            int r02 = d5.r0();
            int number = d5.G0().getNumber();
            l y02 = d5.y0();
            int i4 = this.f82585a;
            if (i4 == 0) {
                j5 = net.time4j.base.c.i(j5, 60L);
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 == 3) {
                        j5 = net.time4j.base.c.i(j5, 7L);
                    } else if (i4 != 4) {
                        throw new UnsupportedOperationException();
                    }
                    return p02.e(net.time4j.base.c.f(d5.b(), j5));
                }
                f(j4);
                int i5 = j5 > 0 ? 1 : -1;
                int number2 = y02.getNumber();
                boolean e4 = y02.e();
                int k4 = p02.k(r02, number);
                for (long j6 = 0; j5 != j6; j6 = 0) {
                    if (e4) {
                        e4 = false;
                        if (i5 == 1) {
                            number2++;
                        }
                    } else {
                        if (i5 != 1 || k4 != number2) {
                            if (i5 == -1 && k4 == number2 - 1) {
                                number2--;
                            } else {
                                number2 += i5;
                            }
                        }
                        e4 = true;
                    }
                    if (!e4) {
                        if (number2 == 13) {
                            number++;
                            if (number == 61) {
                                r02++;
                                number = 1;
                            }
                            number2 = 1;
                            k4 = p02.k(r02, number);
                        } else if (number2 == 0) {
                            number--;
                            if (number == 0) {
                                r02--;
                                number = 60;
                            }
                            k4 = p02.k(r02, number);
                            number2 = 12;
                        }
                    }
                    j5 -= i5;
                }
                l f4 = l.f(number2);
                if (e4) {
                    f4 = f4.g();
                }
                return (D) g(r02, number, f4, t4, p02);
            }
            long f5 = net.time4j.base.c.f(((r02 * 60) + number) - 1, j5);
            int g4 = net.time4j.base.c.g(net.time4j.base.c.b(f5, 60));
            int d6 = net.time4j.base.c.d(f5, 60) + 1;
            if (y02.e() && p02.k(g4, d6) != y02.getNumber()) {
                y02 = l.f(y02.getNumber());
            }
            return (D) g(g4, d6, y02, t4, p02);
        }

        @Override // net.time4j.engine.o0
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public long a(D d5, D d6) {
            return e(d5, d6, this.f82585a);
        }
    }

    /* compiled from: EastAsianCalendar.java */
    private static class d<D extends j<?, D>> implements net.time4j.engine.e0<D> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<?> f82586b;

        /* renamed from: c, reason: collision with root package name */
        private final int f82587c;

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(D d5) {
            return this.f82586b;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(D d5) {
            return this.f82586b;
        }

        @Override // net.time4j.engine.e0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public int d(D d5) {
            int i4 = this.f82587c;
            if (i4 == 0) {
                return d5.t();
            }
            if (i4 == 1) {
                return d5.v0();
            }
            if (i4 == 2) {
                int number = d5.y0().getNumber();
                int x02 = d5.x0();
                return ((x02 <= 0 || x02 >= number) && !d5.y0().e()) ? number : number + 1;
            }
            if (i4 == 3) {
                return d5.r0();
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("都\u0001") + this.f82587c);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public Integer getMaximum(D d5) {
            int J0;
            int i4 = this.f82587c;
            if (i4 == 0) {
                J0 = d5.J0();
            } else if (i4 == 1) {
                J0 = d5.K0();
            } else if (i4 == 2) {
                J0 = d5.I0() ? 13 : 12;
            } else {
                if (i4 != 3) {
                    throw new UnsupportedOperationException(ProtectedSandApp.s("都\u0001") + this.f82587c);
                }
                h<D> p02 = d5.p0();
                J0 = ((j) p02.e(p02.d())).r0();
            }
            return Integer.valueOf(J0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public Integer getMinimum(D d5) {
            if (this.f82587c != 3) {
                return 1;
            }
            h<D> p02 = d5.p0();
            return Integer.valueOf(((j) p02.e(p02.g())).r0());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public Integer getValue(D d5) {
            return Integer.valueOf(d(d5));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // net.time4j.engine.e0
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean e(D d5, int i4) {
            if (i4 < 1) {
                return false;
            }
            int i5 = this.f82587c;
            if (i5 == 0) {
                if (i4 > 30) {
                    return false;
                }
                return i4 != 30 || d5.J0() == 30;
            }
            if (i5 == 1) {
                return i4 <= d5.K0();
            }
            if (i5 == 2) {
                return i4 <= 12 || (i4 == 13 && d5.x0() > 0);
            }
            if (i5 == 3) {
                h<D> p02 = d5.p0();
                return i4 >= ((j) p02.e(p02.g())).r0() && i4 <= ((j) p02.e(p02.d())).r0();
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("都\u0001") + this.f82587c);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public boolean j(D d5, Integer num) {
            return num != null && e(d5, num.intValue());
        }

        @Override // net.time4j.engine.e0
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public D a(D d5, int i4, boolean z4) {
            int i5 = this.f82587c;
            if (i5 == 0) {
                if (z4) {
                    return d5.p0().e((d5.b() + i4) - d5.t());
                }
                if (i4 < 1 || i4 > 30 || (i4 == 30 && d5.J0() < 30)) {
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鄁\u0001"), i4));
                }
                return d5.p0().i(d5.r0(), d5.G0().getNumber(), d5.y0(), i4, (d5.b() + i4) - d5.t());
            }
            if (i5 == 1) {
                if (z4 || (i4 >= 1 && i4 <= d5.K0())) {
                    return d5.p0().e((d5.b() + i4) - d5.v0());
                }
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("鄀\u0001"), i4));
            }
            boolean z5 = false;
            if (i5 != 2) {
                if (i5 == 3) {
                    if (e(d5, i4)) {
                        return (D) new c(0).b(d5, i4 - d5.r0());
                    }
                    throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("郾\u0001"), i4));
                }
                throw new UnsupportedOperationException(ProtectedSandApp.s("都\u0001") + this.f82587c);
            }
            if (!e(d5, i4)) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("郿\u0001"), i4));
            }
            int x02 = d5.x0();
            if (x02 > 0 && x02 < i4) {
                boolean z6 = i4 == x02 + 1;
                i4--;
                z5 = z6;
            }
            l f4 = l.f(i4);
            if (z5) {
                f4 = f4.g();
            }
            return (D) e.j(d5, f4);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public D withValue(D d5, Integer num, boolean z4) {
            if (num != null) {
                return a(d5, num.intValue(), z4);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鄂\u0001"));
        }

        private d(int i4, net.time4j.engine.q<?> qVar) {
            this.f82587c = i4;
            this.f82586b = qVar;
        }
    }

    /* compiled from: EastAsianCalendar.java */
    private static class e<D extends j<?, D>> implements net.time4j.engine.a0<D, l> {

        /* renamed from: b, reason: collision with root package name */
        private final net.time4j.engine.q<?> f82588b;

        static <D extends j<?, D>> D j(D d5, l lVar) {
            h<D> p02 = d5.p0();
            int t4 = d5.t();
            int number = d5.G0().getNumber();
            if (t4 <= 29) {
                return p02.i(d5.r0(), number, lVar, t4, p02.y(d5.r0(), number, lVar, t4));
            }
            long y4 = p02.y(d5.r0(), number, lVar, 1);
            int min = Math.min(t4, p02.e(y4).J0());
            return p02.i(d5.r0(), number, lVar, min, (y4 + min) - 1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtCeiling(D d5) {
            return this.f82588b;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public net.time4j.engine.q<?> getChildAtFloor(D d5) {
            return this.f82588b;
        }

        @Override // net.time4j.engine.a0
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public l getMaximum(D d5) {
            return l.f(12);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public l getMinimum(D d5) {
            return l.f(1);
        }

        @Override // net.time4j.engine.a0
        /* renamed from: h, reason: merged with bridge method [inline-methods] */
        public l getValue(D d5) {
            return d5.y0();
        }

        @Override // net.time4j.engine.a0
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public boolean j(D d5, l lVar) {
            return lVar != null && (!lVar.e() || lVar.getNumber() == d5.x0());
        }

        @Override // net.time4j.engine.a0
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public D withValue(D d5, l lVar, boolean z4) {
            if (j(d5, lVar)) {
                return (D) j(d5, lVar);
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("鄃\u0001") + lVar);
        }

        private e(net.time4j.engine.q<?> qVar) {
            this.f82588b = qVar;
        }
    }

    j(int i4, int i5, l lVar, int i6, long j4) {
        this.f82577b = i4;
        this.f82578c = i5;
        this.f82579d = lVar;
        this.f82580e = i6;
        this.f82581f = j4;
        this.f82582g = p0().k(i4, i5);
    }

    static <D extends j<?, D>> net.time4j.engine.a0<D, l> A0(net.time4j.engine.q<?> qVar) {
        return new e(qVar);
    }

    static <D extends j<?, D>> net.time4j.engine.o0<D> E0(int i4) {
        return new c(i4);
    }

    static <D extends j<?, D>> net.time4j.engine.a0<D, g> F0(net.time4j.engine.q<?> qVar) {
        return new b(qVar, true);
    }

    static <D extends j<?, D>> net.time4j.engine.a0<D, g> H0(net.time4j.engine.q<?> qVar) {
        return new b(qVar, false);
    }

    private long L0(int i4) {
        return p0().v(this.f82577b, this.f82578c + i4);
    }

    static <D extends j<?, D>> net.time4j.engine.a0<D, Integer> s0(net.time4j.engine.q<?> qVar) {
        return new d(3, qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <D extends j<?, D>> net.time4j.engine.a0<D, Integer> t0() {
        return new d(0, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static <D extends j<?, D>> net.time4j.engine.a0<D, Integer> w0() {
        return new d(1, null);
    }

    static <D extends j<?, D>> net.time4j.engine.a0<D, Integer> z0(net.time4j.engine.q<?> qVar) {
        return new d(2, qVar);
    }

    public m0 B0() {
        int d5 = net.time4j.base.c.d(net.time4j.engine.b0.RATA_DIE.transform(this.f82581f, net.time4j.engine.b0.UTC) - 45, 60);
        return m0.j(d5 != 0 ? d5 : 60);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m0 C0() {
        int c5 = net.time4j.base.c.c(D0().getIndex() + 1, 12);
        m0.a aVar = m0.a.values()[c5];
        int f4 = new n.a(((Integer) r(net.time4j.calendar.d.f82409a)).intValue()).f();
        if (c5 <= 2) {
            long b5 = n0.MINOR_11_DAXUE_255.onOrAfter((j) g0(net.time4j.engine.i.i(this.f82581f - L0(0)))).b();
            long j4 = this.f82581f;
            if (j4 >= b5 && j4 < L0(1)) {
                f4++;
            }
        }
        return m0.k(m0.b.values()[net.time4j.base.c.c(((f4 - 1) * 12) + c5 + 2, 10)], aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n0 D0() {
        return m.t().getValue((j) z());
    }

    public g G0() {
        return g.r(this.f82578c);
    }

    public boolean I0() {
        return this.f82582g > 0;
    }

    public int J0() {
        return (int) (((this.f82580e + p0().u(this.f82581f + 1)) - this.f82581f) - 1);
    }

    public int K0() {
        int i4 = this.f82577b;
        int i5 = 1;
        int i6 = this.f82578c + 1;
        if (i6 > 60) {
            i4++;
        } else {
            i5 = i6;
        }
        return (int) (p0().v(i4, i5) - p0().v(this.f82577b, this.f82578c));
    }

    public D N0() {
        D d5 = (D) z();
        h<D> p02 = d5.p0();
        int r02 = d5.r0();
        int number = d5.G0().getNumber();
        while (true) {
            int k4 = p02.k(r02, number);
            if (k4 > 0) {
                l g4 = l.f(k4).g();
                if (d5.y0().compareTo(g4) < 0) {
                    return p02.e(p02.y(r02, number, g4, 1));
                }
            }
            number++;
            if (number > 60) {
                r02++;
                number = 1;
            }
            d5 = p02.e(p02.y(r02, number, l.f(1), 1));
        }
    }

    @Override // net.time4j.engine.n, net.time4j.engine.h
    public long b() {
        return this.f82581f;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        return this.f82577b == jVar.f82577b && this.f82578c == jVar.f82578c && this.f82580e == jVar.f82580e && this.f82579d.equals(jVar.f82579d) && this.f82581f == jVar.f82581f;
    }

    @Override // net.time4j.engine.n, net.time4j.engine.m0
    public int hashCode() {
        long j4 = this.f82581f;
        return (int) (j4 ^ (j4 >>> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public net.time4j.u<D> m0(net.time4j.m0 m0Var) {
        return net.time4j.u.h((net.time4j.engine.n) z(), m0Var);
    }

    public net.time4j.u<D> n0(int i4, int i5) {
        return m0(net.time4j.m0.b1(i4, i5));
    }

    public l o0() {
        int k4 = p0().k(r0(), G0().getNumber());
        if (k4 == 0) {
            return null;
        }
        return l.f(k4).g();
    }

    abstract h<D> p0();

    int r0() {
        return this.f82577b;
    }

    public int t() {
        return this.f82580e;
    }

    @Override // net.time4j.engine.m0
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String value = ((net.time4j.format.c) getClass().getAnnotation(net.time4j.format.c.class)).value();
        if (value.equals(ProtectedSandApp.s("訮\u0001"))) {
            value = ProtectedSandApp.s("訯\u0001");
        }
        sb.append(value);
        sb.append('[');
        sb.append(G0().g(Locale.ROOT));
        sb.append('(');
        sb.append(l(net.time4j.calendar.d.f82409a));
        sb.append(ProtectedSandApp.s("訰\u0001"));
        sb.append(this.f82579d.toString());
        sb.append('-');
        if (this.f82580e < 10) {
            sb.append('0');
        }
        return androidx.view.e.a(sb, this.f82580e, ']');
    }

    public g1 u0() {
        return g1.valueOf(net.time4j.base.c.d(this.f82581f + 5, 7) + 1);
    }

    public int v0() {
        return (int) ((this.f82581f - p0().v(this.f82577b, this.f82578c)) + 1);
    }

    int x0() {
        return this.f82582g;
    }

    public l y0() {
        return this.f82579d;
    }
}
