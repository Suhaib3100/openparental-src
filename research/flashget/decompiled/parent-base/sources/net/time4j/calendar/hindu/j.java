package net.time4j.calendar.hindu;

import androidx.compose.ui.graphics.colorspace.b0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.TXLiteAVCode;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.StringTokenizer;
import net.time4j.calendar.astro.k;
import net.time4j.d0;
import net.time4j.engine.q0;
import net.time4j.l0;

/* compiled from: HinduVariant.java */
/* loaded from: classes7.dex */
public final class j implements q0, Serializable {

    /* renamed from: h, reason: collision with root package name */
    private static final double f82530h = 18184.4d;

    /* renamed from: j, reason: collision with root package name */
    private static final int f82532j = -1;

    /* renamed from: k, reason: collision with root package name */
    private static final int f82533k = -2;

    /* renamed from: b, reason: collision with root package name */
    private final transient int f82536b;

    /* renamed from: c, reason: collision with root package name */
    private final transient f f82537c;

    /* renamed from: d, reason: collision with root package name */
    private final transient boolean f82538d;

    /* renamed from: e, reason: collision with root package name */
    private final transient double f82539e;

    /* renamed from: f, reason: collision with root package name */
    private final transient net.time4j.calendar.astro.d f82540f;

    /* renamed from: g, reason: collision with root package name */
    static final net.time4j.calendar.astro.d f82529g = new b(23.15d, 75.76833333333333d, 0);

    /* renamed from: i, reason: collision with root package name */
    private static final i[] f82531i = i.values();

    /* renamed from: l, reason: collision with root package name */
    static final j f82534l = new j(net.time4j.calendar.hindu.b.SOLAR);

    /* renamed from: m, reason: collision with root package name */
    static final j f82535m = new j(net.time4j.calendar.hindu.b.LUNAR);

    /* compiled from: HinduVariant.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82541a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f82542b;

        static {
            int[] iArr = new int[f.values().length];
            f82542b = iArr;
            try {
                iArr[f.SAKA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82542b[f.KOLLAM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[i.values().length];
            f82541a = iArr2;
            try {
                iArr2[i.AMANTA_ASHADHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82541a[i.AMANTA_KARTIKA.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f82541a[i.MADRAS.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f82541a[i.MALAYALI.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f82541a[i.TAMIL.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f82541a[i.ORISSA.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f82541a[i.AMANTA.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f82541a[i.PURNIMANTA.ordinal()] = 8;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: HinduVariant.java */
    private static class b implements net.time4j.calendar.astro.d {

        /* renamed from: b, reason: collision with root package name */
        private final double f82543b;

        /* renamed from: c, reason: collision with root package name */
        private final double f82544c;

        /* renamed from: d, reason: collision with root package name */
        private final int f82545d;

        b(double d5, double d6, int i4) {
            if (Double.isNaN(d5) || Double.isInfinite(d5)) {
                throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("郙\u0001"), d5));
            }
            if (Double.isNaN(d6) || Double.isInfinite(d6)) {
                throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("郘\u0001"), d6));
            }
            if (Double.compare(d5, 90.0d) > 0 || Double.compare(d5, -90.0d) < 0) {
                throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("郗\u0001"), d5));
            }
            if (Double.compare(d6, 180.0d) >= 0 || Double.compare(d6, -180.0d) < 0) {
                throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("郖\u0001"), d6));
            }
            if (i4 < 0 || i4 >= 11000) {
                throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("郕\u0001"), i4));
            }
            this.f82543b = d5;
            this.f82544c = d6;
            this.f82545d = i4;
        }

        @Override // net.time4j.calendar.astro.d
        public int a() {
            return this.f82545d;
        }

        @Override // net.time4j.calendar.astro.d
        public double b() {
            return this.f82543b;
        }

        @Override // net.time4j.calendar.astro.d
        public double c() {
            return this.f82544c;
        }
    }

    /* compiled from: HinduVariant.java */
    private interface c {
        double c(long j4);
    }

    /* compiled from: HinduVariant.java */
    static class d extends net.time4j.calendar.hindu.c {

        /* renamed from: e, reason: collision with root package name */
        private static final int f82546e = 1200;

        /* renamed from: f, reason: collision with root package name */
        private static final int f82547f = 5999;

        /* renamed from: g, reason: collision with root package name */
        private static final boolean f82548g = false;

        /* renamed from: h, reason: collision with root package name */
        static final double f82549h = 365.2587564814815d;

        /* renamed from: i, reason: collision with root package name */
        static final double f82550i = 336.1360765905204d;

        /* renamed from: j, reason: collision with root package name */
        private static final double f82551j = 27.321674162683866d;

        /* renamed from: k, reason: collision with root package name */
        private static final double f82552k = 29.53058794607172d;

        /* renamed from: m, reason: collision with root package name */
        private static final double f82554m = -7.14403429586E11d;

        /* renamed from: n, reason: collision with root package name */
        private static final double f82555n = 365.25878920258134d;

        /* renamed from: o, reason: collision with root package name */
        private static final double f82556o = 27.554597974680476d;

        /* renamed from: p, reason: collision with root package name */
        private static final double f82557p = 365.25636d;

        /* renamed from: q, reason: collision with root package name */
        private static final double f82558q = 29.530588861d;

        /* renamed from: s, reason: collision with root package name */
        static final /* synthetic */ boolean f82560s = false;

        /* renamed from: c, reason: collision with root package name */
        private volatile long f82561c;

        /* renamed from: d, reason: collision with root package name */
        private volatile long f82562d;

        /* renamed from: l, reason: collision with root package name */
        private static final double f82553l = Math.pow(2.0d, -1000.0d);

        /* renamed from: r, reason: collision with root package name */
        private static final double[] f82559r = {0.9277777777777778d, 0.9972222222222222d, 1.075d, 1.075d, 0.9972222222222222d, 0.9277777777777778d};

        /* compiled from: HinduVariant.java */
        static class a implements c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f82563a;

            a(j jVar) {
                this.f82563a = jVar;
            }

            @Override // net.time4j.calendar.hindu.j.c
            public double c(long j4) {
                return d.U(j4 + 1, this.f82563a);
            }
        }

        /* compiled from: HinduVariant.java */
        static class b implements c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f82564a;

            b(j jVar) {
                this.f82564a = jVar;
            }

            @Override // net.time4j.calendar.hindu.j.c
            public double c(long j4) {
                return d.V(j4, this.f82564a);
            }
        }

        /* compiled from: HinduVariant.java */
        static class c implements c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f82565a;

            c(j jVar) {
                this.f82565a = jVar;
            }

            @Override // net.time4j.calendar.hindu.j.c
            public double c(long j4) {
                return d.T(j4 + 0.55d, this.f82565a);
            }
        }

        /* compiled from: HinduVariant.java */
        /* renamed from: net.time4j.calendar.hindu.j$d$d, reason: collision with other inner class name */
        static class C1287d implements c {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ j f82566a;

            C1287d(j jVar) {
                this.f82566a = jVar;
            }

            @Override // net.time4j.calendar.hindu.j.c
            public double c(long j4) {
                return d.T(j4 + 1, this.f82566a);
            }
        }

        d(j jVar) {
            super(jVar);
            this.f82561c = Long.MIN_VALUE;
            this.f82562d = Long.MAX_VALUE;
        }

        private static double A(double d5) {
            double I = I(d5, f82555n);
            double abs = 0.03888888888888889d - (Math.abs(O(I)) * 9.25925925925926E-4d);
            double floor = Math.floor(I / 3.75d);
            return (1.0d - (((P(floor + 1.0d) - P(floor)) * 15.28d) * abs)) * 0.9856026545889308d;
        }

        private static double B(double d5) {
            double O = O(I(d5, f82555n));
            return (((0.03888888888888889d - (Math.abs(O) / 1080.0d)) * (57.3d * O)) / 360.0d) * (A(d5) / 360.0d) * f82549h;
        }

        private static long C(int i4, g gVar, e eVar, j jVar) {
            double d5;
            double R;
            int value = gVar.h().getValue();
            if (jVar.s()) {
                d5 = ((((value - 1) / 12.0d) + i4) * f82557p) - 1132959.0d;
                R = M(d5);
            } else {
                d5 = ((((value - 1) / 12.0d) + i4) * f82549h) - 1132959.0d;
                R = R(d5);
            }
            long floor = (long) Math.floor(d5 - ((net.time4j.calendar.hindu.c.n(((R / 360.0d) - ((value - 1) / 12.0d)) + 0.5d, 1.0d) - 0.5d) * f82549h));
            int E = E(floor + 0.25d, jVar);
            int c5 = eVar.c();
            if (E <= 3 || E >= 27) {
                net.time4j.calendar.hindu.d F = F(net.time4j.engine.b0.UTC.transform(floor - 15, net.time4j.engine.b0.RATA_DIE), jVar);
                E = (F.B0().h() != gVar.h() || (F.B0().a() && !gVar.a())) ? ((int) net.time4j.calendar.hindu.c.n(E + 15, 30.0d)) - 15 : ((int) net.time4j.calendar.hindu.c.n(E - 15, 30.0d)) + 15;
            }
            long n4 = (14 + ((floor + c5) - E)) - ((int) net.time4j.calendar.hindu.c.n((E(r0 + 0.25d, jVar) - c5) + 15, 30.0d));
            while (true) {
                int E2 = E(U(n4, jVar), jVar);
                int n5 = (int) net.time4j.calendar.hindu.c.n(c5 + 1, 30.0d);
                if (n5 == 0) {
                    n5 = 30;
                }
                if (E2 == c5 || E2 == n5) {
                    break;
                }
                n4++;
            }
            if (eVar.a()) {
                n4++;
            }
            return net.time4j.engine.b0.UTC.transform(n4, net.time4j.engine.b0.RATA_DIE);
        }

        private static long D(int i4, g gVar, e eVar, j jVar) {
            int f4 = gVar.f();
            c z4 = z(jVar);
            long floor = ((long) Math.floor((((f4 - 1) / 12.0d) + i4) * (jVar.s() ? f82557p : f82549h))) - 1132962;
            if (jVar.s()) {
                while (N(z4.c(floor)) != f4) {
                    floor++;
                }
            } else {
                while (Y(z4.c(floor)) != f4) {
                    floor++;
                }
            }
            return net.time4j.engine.b0.UTC.transform((eVar.c() - 1) + floor, net.time4j.engine.b0.RATA_DIE);
        }

        private static int E(double d5, j jVar) {
            double H;
            if (jVar.s()) {
                double e4 = b0(d5).e();
                k kVar = k.CC;
                H = net.time4j.calendar.hindu.c.n(kVar.getFeature(e4, ProtectedSandApp.s("郛\u0001")) - kVar.getFeature(e4, ProtectedSandApp.s("郚\u0001")), 360.0d);
                double n4 = net.time4j.calendar.hindu.c.n((d5 - Z((int) Math.round((d5 - Z(0)) / f82558q))) / f82558q, 1.0d) * 360.0d;
                if (Math.abs(H - n4) > 180.0d) {
                    H = n4;
                }
            } else {
                H = H(d5);
            }
            return (int) (Math.floor(H / 12.0d) + 1.0d);
        }

        private static net.time4j.calendar.hindu.d F(long j4, j jVar) {
            int Y;
            int Y2;
            double transform = net.time4j.engine.b0.RATA_DIE.transform(j4, net.time4j.engine.b0.UTC);
            double U = U(transform, jVar);
            int E = E(U, jVar);
            e e4 = e.e(E);
            if (E(U(r2 - 1, jVar), jVar) == E) {
                e4 = e4.f();
            }
            if (jVar.s()) {
                d0 s4 = b0(U).s();
                net.time4j.calendar.astro.g gVar = net.time4j.calendar.astro.g.NEW_MOON;
                double c02 = c0(gVar.before(s4));
                double c03 = c0(gVar.atOrAfter(s4));
                Y = N(c02);
                Y2 = N(c03);
            } else {
                double J = J(U);
                double J2 = J(Math.floor(J) + 35.0d);
                Y = Y(J);
                Y2 = Y(J2);
            }
            int i4 = Y == 12 ? 1 : Y + 1;
            g j5 = g.j(i4);
            if (Y2 == Y) {
                j5 = j5.m();
            }
            if (i4 <= 2) {
                transform += 180.0d;
            }
            return new net.time4j.calendar.hindu.d(jVar, y(transform, jVar), j5, e4, j4);
        }

        private static double G(double d5) {
            return X(d5, f82551j, 0.08888888888888889d, f82556o, 0.010416666666666666d);
        }

        private static double H(double d5) {
            return net.time4j.calendar.hindu.c.n(G(d5) - R(d5), 360.0d);
        }

        private static double I(double d5, double d6) {
            return net.time4j.calendar.hindu.c.n((d5 - f82554m) / d6, 1.0d) * 360.0d;
        }

        private static double J(double d5) {
            double H = d5 - ((H(d5) * f82552k) / 360.0d);
            return t(H - 1.0d, Math.min(d5, H + 1.0d));
        }

        static double K(double d5) {
            double b5 = b0(d5).b();
            double n4 = net.time4j.calendar.hindu.c.n(((((1.6666666666666667E-8d * b5) - 9.172222222222223E-6d) * b5) + 0.01305636111111111d) * b5, 360.0d);
            double n5 = net.time4j.calendar.hindu.c.n((((9.822222222222223E-6d * b5) - 0.24161358333333333d) * b5) + 174.876384d, 360.0d);
            return net.time4j.calendar.hindu.c.n((net.time4j.calendar.hindu.c.n((((((((-1) * 6.0E-6d) / 3600.0d) * b5) + 3.0864722222222223E-4d) * b5) + 1.3969712777777776d) * b5, 360.0d) + n5) - Math.toDegrees(Math.atan2(Math.sin(Math.toRadians(n5)) * Math.cos(Math.toRadians(n4)), Math.cos(Math.toRadians(n5)))), 360.0d);
        }

        private static double L(double d5) {
            return f82559r[(int) net.time4j.calendar.hindu.c.n((int) Math.floor(W(d5) / 30.0d), 6.0d)];
        }

        private static double M(double d5) {
            return net.time4j.calendar.hindu.c.n((k.CC.getFeature(b0(d5).e(), ProtectedSandApp.s("郚\u0001")) - K(d5)) + f82550i, 360.0d);
        }

        private static int N(double d5) {
            return (int) (Math.floor(M(d5) / 30.0d) + 1.0d);
        }

        private static double O(double d5) {
            double d6 = d5 / 3.75d;
            double n4 = net.time4j.calendar.hindu.c.n(d6, 1.0d);
            return ((1.0d - n4) * P(Math.floor(d6))) + (P(Math.ceil(d6)) * n4);
        }

        private static double P(double d5) {
            double sin = Math.sin(Math.toRadians(d5 * 3.75d)) * 3438.0d;
            return Math.floor(((Math.signum(Math.abs(sin) - 1716.0d) * (Math.signum(sin) * 0.215d)) + sin) + 0.5d) / 3438.0d;
        }

        private static net.time4j.calendar.hindu.d Q(long j4, j jVar) {
            int Y;
            long n4;
            c z4 = z(jVar);
            long transform = net.time4j.engine.b0.RATA_DIE.transform(j4, net.time4j.engine.b0.UTC);
            double c5 = z4.c(transform);
            int y4 = y(c5, jVar);
            if (jVar.s()) {
                Y = N(c5);
                n4 = (transform - 3) - ((int) net.time4j.calendar.hindu.c.n(Math.floor(M(c5)), 30.0d));
                while (N(z4.c(n4)) != Y) {
                    n4++;
                }
            } else {
                Y = Y(c5);
                n4 = (transform - 3) - ((int) net.time4j.calendar.hindu.c.n(Math.floor(R(c5)), 30.0d));
                while (Y(z4.c(n4)) != Y) {
                    n4++;
                }
            }
            return new net.time4j.calendar.hindu.d(jVar, y4, g.k(Y), e.e((int) ((transform - n4) + 1)), j4);
        }

        static double R(double d5) {
            return X(d5, f82549h, 0.03888888888888889d, f82555n, 0.023809523809523808d);
        }

        private static double S(double d5) {
            return A(d5) * L(d5);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static double T(double d5, j jVar) {
            double U;
            double V;
            double d6;
            double floor = Math.floor(d5);
            double d7 = d5 - floor;
            int floor2 = (int) Math.floor(4.0d * d7);
            if (floor2 == 0) {
                U = V(floor - 1.0d, jVar);
                V = U(floor, jVar);
                d6 = -0.25d;
            } else if (floor2 == 3) {
                U = V(floor, jVar);
                V = U(floor + 1.0d, jVar);
                d6 = 0.75d;
            } else {
                U = U(floor, jVar);
                V = V(floor, jVar);
                d6 = 0.25d;
            }
            double d10 = U;
            return androidx.constraintlayout.core.motion.utils.a.a(d7, d6, (V - d10) * 2.0d, d10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static double U(double d5, j jVar) {
            if (jVar.s()) {
                net.time4j.calendar.astro.d i4 = jVar.i();
                long floor = (long) Math.floor(d5);
                net.time4j.engine.b0 b0Var = net.time4j.engine.b0.RATA_DIE;
                double j4 = (k.CC.sunrise(l0.w1(floor, b0Var), i4.b(), i4.c(), jVar.f82539e + 90.0d).j() + j.f82530h) / 86400.0d;
                return (b0Var.transform((long) Math.floor(j4), net.time4j.engine.b0.UNIX) + j4) - Math.floor(j4);
            }
            return (((S(d5) * 0.25d) + x(d5, jVar.i())) * 0.002770193582919304d) + ((((j.f82529g.c() - jVar.i().c()) / 360.0d) + (d5 + 0.25d)) - B(d5));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static double V(double d5, j jVar) {
            if (jVar.s()) {
                net.time4j.calendar.astro.d i4 = jVar.i();
                long floor = (long) Math.floor(d5);
                net.time4j.engine.b0 b0Var = net.time4j.engine.b0.RATA_DIE;
                double j4 = (k.CC.sunset(l0.w1(floor, b0Var), i4.b(), i4.c(), jVar.f82539e + 90.0d).j() + j.f82530h) / 86400.0d;
                return (b0Var.transform((long) Math.floor(j4), net.time4j.engine.b0.UNIX) + j4) - Math.floor(j4);
            }
            return (((S(d5) * 0.75d) - x(d5, jVar.i())) * 0.002770193582919304d) + ((((j.f82529g.c() - jVar.i().c()) / 360.0d) + (d5 + 0.75d)) - B(d5));
        }

        private static double W(double d5) {
            return net.time4j.calendar.hindu.c.n(R(d5) - (27.0d - Math.abs((net.time4j.calendar.hindu.c.n((((d5 - (-1132959.0d)) * 3.80247937727211E-7d) - 0.25d) + 0.5d, 1.0d) - 0.5d) * 108.0d)), 360.0d);
        }

        private static double X(double d5, double d6, double d7, double d10, double d11) {
            double I = I(d5, d6);
            double O = O(I(d5, d10));
            return net.time4j.calendar.hindu.c.n(I - w((d7 - ((Math.abs(O) * d11) * d7)) * O), 360.0d);
        }

        private static int Y(double d5) {
            return (int) (Math.floor(R(d5) / 30.0d) + 1.0d);
        }

        private static double Z(int i4) {
            return c0(net.time4j.calendar.astro.g.NEW_MOON.atLunation(i4 - 24724));
        }

        private static g a0(g gVar, int i4) {
            int value = gVar.h().getValue() - i4;
            if (value <= 0) {
                value += 12;
            }
            return g.j(value);
        }

        private static net.time4j.calendar.astro.e b0(double d5) {
            return net.time4j.calendar.astro.e.k(d0.W0(Math.round(((d5 + 1721424.0d) - 2440587.0d) * 86400.0d), net.time4j.scale.f.POSIX));
        }

        private static double c0(d0 d0Var) {
            return ((d0Var.j() / 86400.0d) + 2440587.0d) - 1721424.0d;
        }

        private static double t(double d5, double d6) {
            double d7 = (d5 + d6) / 2.0d;
            return (Y(d5) == Y(d6) || d6 - d5 < f82553l) ? d7 : H(d7) < 180.0d ? t(d5, d7) : t(d7, d6);
        }

        private net.time4j.calendar.hindu.d u(int i4) {
            return i(i4, g.i(net.time4j.calendar.b0.AGRAHAYANA), e.e(1)).Z0();
        }

        private i v() {
            return this.f82501a.j();
        }

        private static double w(double d5) {
            if (d5 < 0.0d) {
                return -w(-d5);
            }
            int i4 = 0;
            while (true) {
                double d6 = i4;
                if (d5 <= P(d6)) {
                    double d7 = i4 - 1;
                    double P = P(d7);
                    return (((d5 - P) / (P(d6) - P)) + d7) * 3.75d;
                }
                i4++;
            }
        }

        private static double x(double d5, net.time4j.calendar.astro.d dVar) {
            double O = O(W(d5)) * 0.4063408958696917d;
            double b5 = dVar.b();
            return w((((O(b5) / O(b5 + 90.0d)) * O) * (-1.0d)) / O(w(O) + 90.0d));
        }

        private static int y(double d5, j jVar) {
            return (int) (jVar.s() ? Math.floor((((d5 - (-1132959.0d)) / f82557p) + 0.5d) - (M(d5) / 360.0d)) : Math.floor((((d5 - (-1132959.0d)) / f82549h) + 0.5d) - (R(d5) / 360.0d)));
        }

        private static c z(j jVar) {
            int i4 = a.f82541a[jVar.j().ordinal()];
            if (i4 == 3) {
                return new C1287d(jVar);
            }
            if (i4 == 4) {
                return new c(jVar);
            }
            if (i4 == 5) {
                return new b(jVar);
            }
            if (i4 == 6) {
                return new a(jVar);
            }
            throw new UnsupportedOperationException(ProtectedSandApp.s("郜\u0001"));
        }

        @Override // net.time4j.engine.l
        public long d() {
            if (this.f82562d == Long.MAX_VALUE) {
                net.time4j.calendar.hindu.d u4 = u(6000);
                if (this.f82501a.n()) {
                    u4 = u4.X0();
                }
                this.f82562d = u4.b() - 1;
            }
            return this.f82562d;
        }

        @Override // net.time4j.engine.l
        public long g() {
            if (this.f82561c == Long.MIN_VALUE) {
                this.f82561c = (this.f82501a.n() ? u(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY).X0() : u(1200)).b();
            }
            return this.f82561c;
        }

        @Override // net.time4j.calendar.hindu.c
        net.time4j.calendar.hindu.d i(int i4, g gVar, e eVar) {
            long D;
            j jVar = this.f82501a;
            switch (a.f82541a[jVar.j().ordinal()]) {
                case 1:
                case 2:
                    return new net.time4j.calendar.hindu.d(jVar, i4, gVar, eVar, jVar.r().i(gVar.h().getValue() < jVar.h() ? i4 + 1 : i4, gVar, eVar).b());
                case 3:
                case 4:
                case 5:
                case 6:
                    D = D(i4, gVar, eVar, jVar);
                    break;
                case 7:
                    D = C(i4, gVar, eVar, jVar);
                    break;
                case 8:
                    D = C(i4, (gVar.a() || eVar.c() <= 15) ? gVar : this.f82501a.r().k(i4, a0(gVar, 1)) ? a0(gVar, 2) : a0(gVar, 1), eVar, jVar);
                    break;
                default:
                    throw new UnsupportedOperationException(this.f82501a.j().name());
            }
            return new net.time4j.calendar.hindu.d(jVar, i4, gVar, eVar, D);
        }

        @Override // net.time4j.calendar.hindu.c
        net.time4j.calendar.hindu.d j(long j4) {
            j jVar = this.f82501a;
            switch (a.f82541a[jVar.j().ordinal()]) {
                case 1:
                case 2:
                    net.time4j.calendar.hindu.d j5 = jVar.r().j(j4);
                    int A0 = j5.A0();
                    if (j5.B0().h().getValue() < jVar.h()) {
                        A0--;
                    }
                    return new net.time4j.calendar.hindu.d(jVar, A0, j5.B0(), j5.w0(), j4);
                case 3:
                case 4:
                case 5:
                case 6:
                    return Q(j4, jVar);
                case 7:
                    return F(j4, jVar);
                case 8:
                    net.time4j.calendar.hindu.c r4 = jVar.r();
                    net.time4j.calendar.hindu.d j6 = r4.j(j4);
                    g j7 = g.j(j6.w0().c() >= 16 ? r4.j(20 + j4).B0().h().getValue() : j6.B0().h().getValue());
                    if (j6.B0().a()) {
                        j7 = j7.m();
                    }
                    return new net.time4j.calendar.hindu.d(jVar, j6.A0(), j7, j6.w0(), j4);
                default:
                    throw new UnsupportedOperationException(this.f82501a.j().name());
            }
        }

        @Override // net.time4j.calendar.hindu.c
        boolean m(int i4, g gVar, e eVar) {
            net.time4j.calendar.hindu.c r4;
            if (i4 < 1200 || i4 > f82547f || gVar == null || eVar == null) {
                return false;
            }
            if (this.f82501a.o() && (gVar.a() || eVar.a())) {
                return false;
            }
            if (this.f82501a.l() && eVar.c() > 30) {
                return false;
            }
            i j4 = this.f82501a.j();
            if (j4 == i.AMANTA_ASHADHA || j4 == i.AMANTA_KARTIKA) {
                if (gVar.h().getValue() < this.f82501a.h()) {
                    i4++;
                }
                r4 = this.f82501a.r();
            } else {
                r4 = this;
            }
            return !r4.l(i4, gVar, eVar);
        }
    }

    j(i iVar, f fVar) {
        this(iVar.ordinal(), fVar, t(fVar, iVar), Double.NaN, f82529g);
    }

    private static boolean d(double d5, double d6) {
        return Double.isNaN(d5) ? Double.isNaN(d6) : !Double.isNaN(d6) && d5 == d6;
    }

    public static j e(String str) {
        boolean startsWith = str.startsWith(ProtectedSandApp.s("郢\u0001"));
        String s4 = ProtectedSandApp.s("郣\u0001");
        if (startsWith) {
            try {
                return net.time4j.calendar.hindu.b.valueOf(str.substring(14)) == net.time4j.calendar.hindu.b.SOLAR ? f82534l : f82535m;
            } catch (IndexOutOfBoundsException e4) {
                throw new IllegalArgumentException(s4.concat(str), e4);
            }
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, ProtectedSandApp.s("郤\u0001"));
        net.time4j.calendar.astro.d dVar = f82529g;
        double b5 = dVar.b();
        double c5 = dVar.c();
        int a5 = dVar.a();
        double d5 = b5;
        double d6 = c5;
        int i4 = 0;
        boolean z4 = true;
        double d7 = Double.NaN;
        boolean z5 = true;
        f fVar = null;
        int i5 = Integer.MIN_VALUE;
        while (stringTokenizer.hasMoreTokens()) {
            i4++;
            String nextToken = stringTokenizer.nextToken();
            switch (i4) {
                case 1:
                    i5 = Integer.valueOf(nextToken).intValue();
                    break;
                case 2:
                    fVar = f.valueOf(nextToken);
                    break;
                case 3:
                    z5 = nextToken.equals(ProtectedSandApp.s("部\u0001"));
                    break;
                case 4:
                    if (!nextToken.equals(ProtectedSandApp.s("郥\u0001")) && !nextToken.equals(ProtectedSandApp.s("郦\u0001")) && !nextToken.equals(ProtectedSandApp.s("郧\u0001"))) {
                        d7 = Double.valueOf(nextToken).doubleValue();
                        break;
                    }
                    break;
                case 5:
                    double doubleValue = Double.valueOf(nextToken).doubleValue();
                    d5 = doubleValue;
                    z4 = doubleValue == f82529g.b();
                    break;
                case 6:
                    d6 = Double.valueOf(nextToken).doubleValue();
                    if (!z4 || d6 != f82529g.c()) {
                        z4 = false;
                        break;
                    } else {
                        z4 = true;
                        break;
                    }
                case 7:
                    int intValue = Integer.valueOf(nextToken).intValue();
                    z4 = z4 && intValue == 0;
                    a5 = intValue;
                    break;
                default:
                    throw new IllegalArgumentException(s4.concat(str));
            }
        }
        if (i5 < 0) {
            throw new IllegalArgumentException(s4.concat(str));
        }
        try {
            return new j(i5, fVar, z5, d7, z4 ? f82529g : new b(d5, d6, a5));
        } catch (Exception unused) {
            throw new IllegalArgumentException(s4.concat(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public i j() {
        return f82531i[this.f82536b];
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException(ProtectedSandApp.s("郩\u0001"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s() {
        return !Double.isNaN(this.f82539e);
    }

    private static boolean t(f fVar, i iVar) {
        int i4 = a.f82542b[fVar.ordinal()];
        if (i4 != 1) {
            return i4 != 2;
        }
        int i5 = a.f82541a[iVar.ordinal()];
        return (i5 == 3 || i5 == 4 || i5 == 5) ? false : true;
    }

    private Object writeReplace() {
        return new SPX(this, 21);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f82536b == jVar.f82536b && this.f82537c == jVar.f82537c && this.f82538d == jVar.f82538d && d(this.f82539e, jVar.f82539e) && this.f82540f.b() == jVar.f82540f.b() && this.f82540f.c() == jVar.f82540f.c() && this.f82540f.a() == jVar.f82540f.a();
    }

    net.time4j.calendar.hindu.c f() {
        int i4 = this.f82536b;
        return i4 != -2 ? i4 != -1 ? new d(this) : net.time4j.calendar.hindu.b.SOLAR.getCalendarSystem() : net.time4j.calendar.hindu.b.LUNAR.getCalendarSystem();
    }

    public f g() {
        return this.f82537c;
    }

    @Override // net.time4j.engine.q0
    public String getVariant() {
        if (m()) {
            return ProtectedSandApp.s("郢\u0001") + (this.f82536b == -1 ? net.time4j.calendar.hindu.b.SOLAR : net.time4j.calendar.hindu.b.LUNAR).name();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f82536b);
        sb.append('|');
        sb.append(this.f82537c.name());
        sb.append('|');
        sb.append(this.f82538d ? ProtectedSandApp.s("部\u0001") : ProtectedSandApp.s("郪\u0001"));
        sb.append('|');
        sb.append(Double.isNaN(this.f82539e) ? ProtectedSandApp.s("郥\u0001") : Double.valueOf(this.f82539e));
        if (this.f82540f != f82529g) {
            sb.append('|');
            sb.append(this.f82540f.b());
            sb.append('|');
            sb.append(this.f82540f.c());
            int a5 = this.f82540f.a();
            if (a5 != 0) {
                sb.append('|');
                sb.append(a5);
            }
        }
        return sb.toString();
    }

    int h() {
        if (m()) {
            return 1;
        }
        int i4 = a.f82541a[j().ordinal()];
        return (i4 != 1 ? i4 != 2 ? net.time4j.calendar.b0.CHAITRA : net.time4j.calendar.b0.KARTIKA : net.time4j.calendar.b0.ASHADHA).getValue();
    }

    public int hashCode() {
        return (this.f82537c.hashCode() * 17) + this.f82536b + (this.f82538d ? 1 : 0) + (Double.isNaN(this.f82539e) ? 100 : 100 * ((int) this.f82539e));
    }

    public net.time4j.calendar.astro.d i() {
        return this.f82540f;
    }

    public boolean k() {
        int i4 = this.f82536b;
        if (i4 == -2) {
            return true;
        }
        return i4 >= i.AMANTA.ordinal() && this.f82536b < i.PURNIMANTA.ordinal();
    }

    public boolean l() {
        return k() || n();
    }

    public boolean m() {
        return this.f82536b < 0;
    }

    public boolean n() {
        return this.f82536b == i.PURNIMANTA.ordinal();
    }

    public boolean o() {
        return !l();
    }

    public boolean p() {
        return this.f82538d;
    }

    boolean q() {
        return this.f82536b == i.MADRAS.ordinal() || this.f82536b == i.MALAYALI.ordinal();
    }

    net.time4j.calendar.hindu.c r() {
        return new j(i.AMANTA.ordinal(), this.f82537c, this.f82538d, this.f82539e, this.f82540f).f();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(ProtectedSandApp.s("郫\u0001"));
        int i4 = this.f82536b;
        if (i4 == -2) {
            sb.append(ProtectedSandApp.s("郭\u0001"));
        } else if (i4 != -1) {
            sb.append(j().name());
        } else {
            sb.append(ProtectedSandApp.s("郬\u0001"));
        }
        if (!m()) {
            sb.append(ProtectedSandApp.s("郮\u0001"));
            sb.append(this.f82537c.name());
            sb.append('|');
            sb.append(this.f82538d ? ProtectedSandApp.s("郯\u0001") : ProtectedSandApp.s("郰\u0001"));
            if (!Double.isNaN(this.f82539e)) {
                sb.append(ProtectedSandApp.s("郱\u0001"));
                sb.append(this.f82539e);
            }
            if (this.f82540f != f82529g) {
                sb.append(ProtectedSandApp.s("郲\u0001"));
                sb.append(this.f82540f.b());
                sb.append(ProtectedSandApp.s("郳\u0001"));
                sb.append(this.f82540f.c());
                int a5 = this.f82540f.a();
                if (a5 != 0) {
                    sb.append(ProtectedSandApp.s("郴\u0001"));
                    sb.append(a5);
                }
            }
        }
        sb.append(']');
        return sb.toString();
    }

    public j u(f fVar) {
        return (m() || this.f82537c.equals(fVar)) ? this : new j(this.f82536b, fVar, this.f82538d, this.f82539e, this.f82540f);
    }

    @Deprecated
    public j v() {
        return this;
    }

    public j w(net.time4j.calendar.astro.d dVar) {
        if (Math.abs(dVar.b()) <= 60.0d) {
            return m() ? this : (dVar.b() == this.f82540f.b() && dVar.c() == this.f82540f.c() && dVar.a() == this.f82540f.a()) ? this : new j(this.f82536b, this.f82537c, this.f82538d, this.f82539e, dVar);
        }
        throw new IllegalArgumentException(ProtectedSandApp.s("郵\u0001"));
    }

    public j x() {
        return (m() || !this.f82538d) ? this : new j(this.f82536b, this.f82537c, false, this.f82539e, this.f82540f);
    }

    public j y() {
        return (m() || this.f82538d) ? this : new j(this.f82536b, this.f82537c, true, this.f82539e, this.f82540f);
    }

    public j z(double d5) {
        if (Double.isNaN(d5) || Double.isInfinite(d5)) {
            throw new IllegalArgumentException(ProtectedSandApp.s("郶\u0001"));
        }
        return m() ? this : new j(this.f82536b, this.f82537c, this.f82538d, d5, this.f82540f);
    }

    private j(net.time4j.calendar.hindu.b bVar) {
        this(bVar == net.time4j.calendar.hindu.b.SOLAR ? -1 : -2, f.KALI_YUGA, true, Double.NaN, f82529g);
    }

    private j(int i4, f fVar, boolean z4, double d5, net.time4j.calendar.astro.d dVar) {
        if (i4 < -2 || i4 >= i.values().length) {
            throw new IllegalArgumentException(ProtectedSandApp.s("郡\u0001"));
        }
        if (fVar == null) {
            throw new NullPointerException(ProtectedSandApp.s("郠\u0001"));
        }
        if (dVar != null) {
            if (!Double.isInfinite(d5)) {
                if (!Double.isNaN(d5) && Math.abs(d5) > 10.0d) {
                    throw new IllegalArgumentException(b0.a(ProtectedSandApp.s("郝\u0001"), d5));
                }
                this.f82536b = i4;
                this.f82537c = fVar;
                this.f82538d = z4;
                this.f82539e = d5;
                this.f82540f = dVar;
                return;
            }
            throw new IllegalArgumentException(ProtectedSandApp.s("郞\u0001"));
        }
        throw new NullPointerException(ProtectedSandApp.s("郟\u0001"));
    }
}
