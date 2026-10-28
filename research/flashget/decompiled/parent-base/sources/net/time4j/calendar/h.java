package net.time4j.calendar;

import com.flashget.parentalcontrol.ProtectedSandApp;
import net.time4j.calendar.j;

/* compiled from: EastAsianCS.java */
/* loaded from: classes7.dex */
abstract class h<D extends j<?, D>> implements net.time4j.engine.l<D> {

    /* renamed from: a, reason: collision with root package name */
    private static final long f82488a = net.time4j.l0.r1(1645, 1, 28).b();

    /* renamed from: b, reason: collision with root package name */
    private static final long f82489b = net.time4j.l0.r1(3000, 1, 27).b();

    /* renamed from: c, reason: collision with root package name */
    private static final long f82490c = net.time4j.l0.r1(-2636, 2, 15).b();

    /* renamed from: d, reason: collision with root package name */
    static final double f82491d = 29.530588861d;

    /* renamed from: e, reason: collision with root package name */
    static final double f82492e = 365.242189d;

    h() {
    }

    private long B(long j4) {
        net.time4j.tz.p n4 = n(j4);
        net.time4j.l0 w12 = net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC);
        int o4 = (w12.q() <= 11 || w12.t() <= 15) ? w12.o() - 1 : w12.o();
        net.time4j.calendar.astro.b bVar = net.time4j.calendar.astro.b.WINTER_SOLSTICE;
        net.time4j.l0 k02 = bVar.inYear(o4).j1(n4).k0();
        if (k02.s(w12)) {
            k02 = bVar.inYear(o4 - 1).j1(n4).k0();
        }
        return k02.b();
    }

    private long j(int i4, int i5, l lVar) {
        long u4 = u(v(i4, i5) + ((lVar.getNumber() - 1) * 29));
        return lVar.equals(e(u4).y0()) ? u4 : u(u4 + 1);
    }

    private boolean o(long j4, long j5) {
        return j5 >= j4 && (p(j5) || o(j4, t(j5)));
    }

    private static long r(long j4, long j5) {
        return Math.round((j5 - j4) / f82491d);
    }

    private long t(long j4) {
        return net.time4j.calendar.astro.g.NEW_MOON.before(s(j4)).j1(n(j4)).H0().b();
    }

    private long w(long j4) {
        long B = B(j4);
        long B2 = B(370 + B);
        long u4 = u(B + 1);
        long u5 = u(u4 + 1);
        return (r(u4, t(B2 + 1)) == 12 && (p(u4) || p(u5))) ? u(u5 + 1) : u5;
    }

    private long x(long j4) {
        long w4 = w(j4);
        return j4 >= w4 ? w4 : w(j4 - 180);
    }

    @Override // net.time4j.engine.l
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public final D e(long j4) {
        long B = B(j4);
        long B2 = B(370 + B);
        long u4 = u(B + 1);
        long t4 = t(B2 + 1);
        long t5 = t(j4 + 1);
        boolean z4 = r(u4, t4) == 12;
        long r4 = r(u4, t5);
        if (z4 && o(u4, t5)) {
            r4--;
        }
        int d5 = net.time4j.base.c.d(r4, 12);
        int i4 = d5 != 0 ? d5 : 12;
        long floor = (long) Math.floor(((j4 - f82490c) / f82492e) + (1.5d - (i4 / 12.0d)));
        int b5 = 1 + ((int) net.time4j.base.c.b(floor - 1, 60));
        int d6 = net.time4j.base.c.d(floor, 60);
        int i5 = d6 != 0 ? d6 : 60;
        int i6 = (int) ((j4 - t5) + 1);
        l f4 = l.f(i4);
        if (z4 && p(t5) && !o(u4, t(t5))) {
            f4 = f4.g();
        }
        return i(b5, i5, f4, i6, j4);
    }

    @Override // net.time4j.engine.l
    public final long d() {
        return f82489b;
    }

    @Override // net.time4j.engine.l
    public long g() {
        return f82488a;
    }

    abstract D i(int i4, int i5, l lVar, int i6, long j4);

    final int k(int i4, int i5) {
        int[] l4 = l();
        int i6 = (((i4 - 1) * 60) + i5) - 1;
        int i7 = ((i6 - l4[0]) / 3) * 2;
        while (i7 < l4.length) {
            int i10 = l4[i7];
            if (i10 >= i6) {
                if (i10 > i6) {
                    return 0;
                }
                return l4[i7 + 1];
            }
            i7 += Math.max(((i6 - i10) / 3) * 2, 2);
        }
        return 0;
    }

    abstract int[] l();

    final int m(long j4) {
        int floor = (((int) Math.floor(n0.solarLongitude(net.time4j.calendar.astro.e.k(s(j4)).e()) / 30.0d)) + 2) % 12;
        if (floor == 0) {
            return 12;
        }
        return floor;
    }

    abstract net.time4j.tz.p n(long j4);

    final boolean p(long j4) {
        return (((int) Math.floor(n0.solarLongitude(net.time4j.calendar.astro.e.k(s(j4)).e()) / 30.0d)) + 2) % 12 == (((int) Math.floor(n0.solarLongitude(net.time4j.calendar.astro.e.k(s(u(j4 + 1))).e()) / 30.0d)) + 2) % 12;
    }

    boolean q(int i4, int i5, l lVar, int i6) {
        if (i4 < 72 || i4 > 94 || i5 < 1 || i5 > 60 || ((i4 == 72 && i5 < 22) || ((i4 == 94 && i5 > 56) || i6 < 1 || i6 > 30 || lVar == null || (lVar.e() && lVar.getNumber() != k(i4, i5))))) {
            return false;
        }
        if (i6 != 30) {
            return true;
        }
        long j4 = j(i4, i5, lVar);
        return u(1 + j4) - j4 == 30;
    }

    net.time4j.d0 s(long j4) {
        return net.time4j.l0.w1(j4, net.time4j.engine.b0.UTC).L0().e0(n(j4));
    }

    final long u(long j4) {
        return net.time4j.calendar.astro.g.NEW_MOON.atOrAfter(s(j4)).j1(n(j4)).H0().b();
    }

    final long v(int i4, int i5) {
        return x((long) Math.floor(androidx.constraintlayout.core.motion.utils.a.a(androidx.core.graphics.y.a(i4, 1, 60, i5), 0.5d, f82492e, f82490c)));
    }

    final long y(int i4, int i5, l lVar, int i6) {
        if (q(i4, i5, lVar, i6)) {
            return (j(i4, i5, lVar) + i6) - 1;
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("訝\u0001"));
    }

    @Override // net.time4j.engine.l
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final long f(D d5) {
        return y(d5.r0(), d5.G0().getNumber(), d5.y0(), d5.t());
    }
}
