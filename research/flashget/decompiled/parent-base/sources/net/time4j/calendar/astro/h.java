package net.time4j.calendar.astro;

import androidx.appcompat.app.b0;
import androidx.constraintlayout.core.motion.utils.w;
import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import net.time4j.calendar.astro.n;
import net.time4j.d0;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: MoonPosition.java */
/* loaded from: classes7.dex */
public class h implements c, Serializable {
    private static final long serialVersionUID = 5736859564589473324L;

    /* renamed from: w, reason: collision with root package name */
    private static final int f82313w = 1000000;
    private final double azimuth;
    private final double declination;
    private final double distance;
    private final double elevation;
    private final double rightAscension;

    /* renamed from: b, reason: collision with root package name */
    private static final int[] f82292b = {0, 2, 2, 0, 0, 0, 2, 2, 2, 2, 0, 1, 0, 2, 0, 0, 4, 0, 4, 2, 2, 1, 1, 2, 2, 4, 2, 0, 2, 2, 1, 2, 0, 0, 2, 2, 2, 4, 0, 3, 2, 4, 0, 2, 2, 2, 4, 0, 4, 1, 2, 0, 1, 3, 4, 2, 0, 1, 2, 2};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f82293c = {0, 0, 0, 0, 1, 0, 0, -1, 0, -1, 1, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, -1, 0, 0, 0, 1, 0, -1, 0, -2, 1, 2, -2, 0, 0, -1, 0, 0, 1, -1, 2, 2, 1, -1, 0, 0, -1, 0, 1, 0, 1, 0, 0, -1, 2, 1, 0, 0};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f82294d = {1, -1, 0, 2, 0, 0, -2, -1, 1, 0, -1, 0, 1, 0, 1, 1, -1, 3, -2, -1, 0, -1, 0, 1, 2, 0, -3, -2, -1, -2, 1, 0, 2, 0, -1, 1, 0, -1, 2, -1, 1, -2, -1, -1, -2, 0, 1, 4, 0, -2, 0, 2, 1, -2, -3, 2, 1, -1, 3, -1};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f82295e = {0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, -2, 2, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, -2, 2, 0, 2, 0, 0, 0, 0, 0, 0, -2, 0, 0, 0, 0, -2, -2, 0, 0, 0, 0, 0, 0, 0, -2};

    /* renamed from: f, reason: collision with root package name */
    private static final int[] f82296f = {6288774, 1274027, 658314, 213618, -185116, -114332, 58793, 57066, 53322, 45758, -40923, -34720, -30383, 15327, -12528, 10980, 10675, 10034, 8548, -7888, -6766, -5163, 4987, 4036, 3994, 3861, 3665, -2689, -2602, 2390, -2348, 2236, -2120, -2069, 2048, -1773, -1595, 1215, -1110, -892, -810, 759, -713, -700, 691, 596, 549, 537, 520, -487, -399, -381, 351, -340, 330, 327, -323, 299, 294, 0};

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f82297g = {-20905355, -3699111, -2955968, -569925, 48888, -3149, 246158, -152138, -170733, -204586, -129620, 108743, 104755, 10321, 0, 79661, -34782, -23210, -21636, 24208, 30824, -8379, -16675, -12831, -10445, -11650, 14403, -7003, 0, 10056, 6322, -9884, 5751, 0, -4950, 4130, 0, -3958, 0, 3258, 2616, -1897, -2117, 2354, 0, 0, -1423, -1117, -1571, -1739, 0, -4421, 0, 0, 0, 0, 1165, 0, 0, 8752};

    /* renamed from: h, reason: collision with root package name */
    private static final int[] f82298h = {0, 0, 0, 2, 2, 2, 2, 0, 2, 0, 2, 2, 2, 2, 2, 2, 2, 0, 4, 0, 0, 0, 1, 0, 0, 0, 1, 0, 4, 4, 0, 4, 2, 2, 2, 2, 0, 2, 2, 2, 2, 4, 2, 2, 0, 2, 1, 1, 0, 2, 1, 2, 0, 4, 4, 1, 4, 1, 4, 2};

    /* renamed from: i, reason: collision with root package name */
    private static final int[] f82299i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 1, -1, -1, -1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 1, 1, 0, -1, -2, 0, 1, 1, 1, 1, 1, 0, -1, 1, 0, -1, 0, 0, 0, -1, -2};

    /* renamed from: j, reason: collision with root package name */
    private static final int[] f82300j = {0, 1, 1, 0, -1, -1, 0, 2, 1, 2, 0, -2, 1, 0, -1, 0, -1, -1, -1, 0, 0, -1, 0, 1, 1, 0, 0, 3, 0, -1, 1, -2, 0, 2, 1, -2, 3, 2, -3, -1, 0, 0, 1, 0, 1, 1, 0, 0, -2, -1, 1, -2, 2, -2, -1, 1, 1, -1, 0, 0};

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f82301k = {1, 1, -1, -1, 1, -1, 1, 1, -1, -1, -1, -1, 1, -1, 1, 1, -1, -1, -1, 1, 3, 1, 1, 1, -1, -1, -1, 1, -1, 1, -3, 1, -3, -1, -1, 1, -1, 1, -1, 1, 1, 1, 1, -1, 3, -1, -1, 1, -1, -1, 1, -1, 1, -1, -1, -1, -1, -1, -1, 1};

    /* renamed from: l, reason: collision with root package name */
    private static final int[] f82302l = {5128122, 280602, 277693, 173237, 55413, 46271, 32573, 17198, 9266, 8822, 8216, 4324, 4200, -3359, 2463, 2211, 2065, -1870, 1828, -1794, -1749, -1565, -1491, -1475, -1410, -1344, -1335, 1107, 1021, 833, 777, 671, w.e.f22499w, 596, 491, -451, 439, 422, 421, -366, -351, 331, 315, 302, -283, -229, 223, 223, -220, -220, -185, 181, -177, SyslogAppender.LOG_LOCAL6, 166, -164, UserData.IS91_MSG_TYPE_CLI, -119, 115, 107};

    /* renamed from: m, reason: collision with root package name */
    private static final int[] f82303m = {2, 4, 6, 8, 2, 0, 10, 4, 6, 12, 1, 8, 14, 0, 3, 10, 16, 12, 5, 2, 18, 14, 7, 2, 20, 1, 16, 4, 9, 4, 2, 4, 6, 22, 18, 6, 11, 8, 4, 6, 3, 5, 13, 20, 3, 4, 1, 22, 0, 6, 2, 0, 0, 2, 0, 2, 24, 4, 2, 1};

    /* renamed from: n, reason: collision with root package name */
    private static final int[] f82304n = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, -2, 2, 0, 0, 0, 0, 0, 2, 0, 0, 4, -2, -2, 0, 2, 4, 2, -2, 0, -4, 0, 0};

    /* renamed from: o, reason: collision with root package name */
    private static final int[] f82305o = {0, 0, 0, 0, -1, 1, 0, -1, -1, 0, 0, -1, 0, 0, 0, -1, 0, -1, 0, 0, 0, -1, 0, 1, 0, 1, -1, 1, 0, 0, -2, -2, -2, 0, -1, 1, 0, 1, 0, 0, 1, 1, 0, -1, 2, -2, 2, -1, 0, 0, 1, 2, -1, 0, -2, 2, 0, 0, 2, -1};

    /* renamed from: p, reason: collision with root package name */
    private static final double[] f82306p = {-1.6769d, 0.4589d, -0.1856d, 0.0883d, -0.0773d, 0.0502d, -0.046d, 0.0422d, -0.0256d, 0.0253d, 0.0237d, 0.0162d, -0.0145d, 0.0129d, -0.0112d, -0.0104d, 0.0086d, 0.0069d, 0.0066d, -0.0053d, -0.0052d, -0.0046d, -0.0041d, 0.004d, 0.0032d, -0.0032d, 0.0031d, -0.0029d, 0.0027d, 0.0027d, -0.0027d, 0.0024d, -0.0021d, -0.0021d, -0.0021d, 0.0019d, -0.0018d, -0.0014d, -0.0014d, -0.0014d, 0.0014d, -0.0014d, 0.0013d, 0.0013d, 0.0011d, -0.0011d, -0.001d, -9.0E-4d, -8.0E-4d, 8.0E-4d, 8.0E-4d, 7.0E-4d, 7.0E-4d, 7.0E-4d, -6.0E-4d, -6.0E-4d, 6.0E-4d, 5.0E-4d, 5.0E-4d, -4.0E-4d};

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f82307q = {p.f60679p, p.f60679p, p.f60679p, p.f60679p, 1.9E-4d, -1.3E-4d, p.f60679p, -1.1E-4d};

    /* renamed from: r, reason: collision with root package name */
    private static final int[] f82308r = {2, 4, 0, 2, 0, 1, 6, 4, 2, 1, 8, 6, 2, 2, 3, 4, 8, 4, 10, 3, 0, 2, 2, 6, 6, 10, 5, 4, 0, 12, 2, 1};

    /* renamed from: s, reason: collision with root package name */
    private static final int[] f82309s = {0, 0, 0, 0, 2, 0, 0, 0, 2, 0, 0, 0, -2, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, -2, 2, 0, 2, 0};

    /* renamed from: t, reason: collision with root package name */
    private static final int[] f82310t = {0, 0, 1, -1, 0, 0, 0, -1, 0, 1, 0, -1, 0, -2, 0, 0, -1, -2, 0, 1, 2, 1, 2, 0, -2, -1, 0, 0, 1, 0, -1, -1};

    /* renamed from: u, reason: collision with root package name */
    private static final double[] f82311u = {0.4392d, 0.0684d, 0.0456d, 0.0426d, 0.0212d, -0.0189d, 0.0144d, 0.0113d, 0.0047d, 0.0036d, 0.0035d, 0.0034d, -0.0034d, 0.0022d, -0.0017d, 0.0013d, 0.0011d, 0.001d, 9.0E-4d, 7.0E-4d, 6.0E-4d, 5.0E-4d, 5.0E-4d, 4.0E-4d, 4.0E-4d, 4.0E-4d, -4.0E-4d, -4.0E-4d, 3.0E-4d, 3.0E-4d, 3.0E-4d, -3.0E-4d};

    /* renamed from: v, reason: collision with root package name */
    private static final double[] f82312v = {p.f60679p, p.f60679p, -1.1E-4d, -1.1E-4d};

    private h(double d5, double d6, double d7, double d10, double d11) {
        this.rightAscension = d5;
        this.declination = d6;
        this.azimuth = d7;
        this.elevation = d10;
        this.distance = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d0 c(d0 d0Var, boolean z4) {
        d0 d0Var2 = (d0) d0Var.M(d0.f82685w, TimeUnit.MINUTES);
        int floor = (int) Math.floor((((d0Var2.j1(net.time4j.tz.p.f83649l).H0().e1() / r0.m1()) + r0.o()) - 1999.97d) * 13.2555d);
        d0 f4 = f(floor, z4);
        while (!f4.s(d0Var2)) {
            floor++;
            f4 = f(floor, z4);
        }
        return f4;
    }

    public static h d(d0 d0Var, d dVar) {
        double[] e4 = e(e.k(d0Var).b());
        double radians = Math.toRadians(e4[2]);
        double radians2 = Math.toRadians(e4[3]);
        double d5 = e4[4];
        double radians3 = Math.toRadians(dVar.b());
        double radians4 = Math.toRadians(dVar.c());
        double cos = Math.cos(radians3);
        double sin = Math.sin(radians3);
        int a5 = dVar.a();
        double c5 = e.n(d0Var).c();
        double cos2 = Math.cos(Math.toRadians(e4[1])) * e4[0];
        double radians5 = ((Math.toRadians(cos2) + a.b(c5)) + radians4) - radians;
        double degrees = Math.toDegrees(Math.asin((Math.cos(radians5) * Math.cos(radians2) * cos) + (Math.sin(radians2) * sin)));
        if (degrees >= (-0.5d) - k.TIME4J.getGeodeticAngle(dVar.b(), a5)) {
            double degrees2 = Math.toDegrees(Math.asin(6378.14d / d5));
            degrees = (degrees - degrees2) + ((a.d(a5) * a.a(degrees)) / 60.0d);
        }
        double d6 = degrees;
        return new h(e4[2], e4[3], Math.toDegrees(Math.atan2(Math.sin(radians5), (Math.cos(radians5) * sin) - (Math.tan(radians2) * cos))) + 180.0d, d6, d5);
    }

    static double[] e(double d5) {
        double d6;
        double d7;
        double n4 = n(d5);
        double m4 = m(d5);
        double k4 = k(d5);
        double j4 = j(d5);
        double l4 = l(d5);
        double d10 = 1.0d - (((7.4E-6d * d5) + 0.002516d) * d5);
        double d11 = d10 * d10;
        int length = f82292b.length - 1;
        double d12 = p.f60679p;
        double d13 = 0.0d;
        double d14 = 0.0d;
        while (length >= 0) {
            int i4 = f82293c[length];
            double d15 = d10;
            if (i4 != -2) {
                if (i4 == -1 || i4 == 1) {
                    d7 = d15;
                } else if (i4 != 2) {
                    d7 = 1.0d;
                }
                double radians = Math.toRadians((f82295e[length] * l4) + (f82294d[length] * j4) + (i4 * k4) + (f82292b[length] * m4));
                d13 = b0.a(radians, f82296f[length] * d7, d13);
                d14 = (Math.cos(radians) * f82297g[length] * d7) + d14;
                length--;
                d10 = d15;
                n4 = n4;
            }
            d7 = d11;
            double radians2 = Math.toRadians((f82295e[length] * l4) + (f82294d[length] * j4) + (i4 * k4) + (f82292b[length] * m4));
            d13 = b0.a(radians2, f82296f[length] * d7, d13);
            d14 = (Math.cos(radians2) * f82297g[length] * d7) + d14;
            length--;
            d10 = d15;
            n4 = n4;
        }
        double d16 = n4;
        double d17 = d10;
        int i5 = 1;
        int length2 = f82298h.length - 1;
        while (length2 >= 0) {
            int i6 = f82299i[length2];
            if (i6 != -2) {
                if (i6 == -1 || i6 == i5) {
                    d6 = d17;
                } else if (i6 != 2) {
                    d6 = 1.0d;
                }
                d12 = (Math.sin(Math.toRadians((f82301k[length2] * l4) + (f82300j[length2] * j4) + (i6 * k4) + (f82298h[length2] * m4))) * f82302l[length2] * d6) + d12;
                length2--;
                i5 = 1;
            }
            d6 = d11;
            d12 = (Math.sin(Math.toRadians((f82301k[length2] * l4) + (f82300j[length2] * j4) + (i6 * k4) + (f82298h[length2] * m4))) * f82302l[length2] * d6) + d12;
            length2--;
            i5 = 1;
        }
        double d18 = (131.849d * d5) + 119.75d;
        double sin = (Math.sin(Math.toRadians((479264.29d * d5) + 53.09d)) * 318.0d) + (Math.sin(Math.toRadians(d16 - l4)) * 1962.0d) + (Math.sin(Math.toRadians(d18)) * 3958.0d) + d13;
        double sin2 = (((Math.sin(Math.toRadians(d16 - j4)) * 127.0d) + ((Math.sin(Math.toRadians(d18 + l4)) * 175.0d) + ((Math.sin(Math.toRadians(d18 - l4)) * 175.0d) + ((Math.sin(Math.toRadians((481266.484d * d5) + 313.45d)) * 382.0d) + (Math.sin(Math.toRadians(d16)) * (-2235.0d)))))) - (Math.sin(Math.toRadians(d16 + j4)) * 115.0d)) + d12;
        double[] dArr = {0.0d, r1, a.e(Math.toDegrees(r5)), Math.toDegrees(r3), (d14 / 1000.0d) + 385000.56d};
        k.nutations(d5, dArr);
        double meanObliquity = k.meanObliquity(d5) + dArr[1];
        double radians3 = Math.toRadians(meanObliquity);
        double radians4 = Math.toRadians((sin / 1000000.0d) + d16 + dArr[0]);
        double radians5 = Math.toRadians(sin2 / 1000000.0d);
        double atan2 = Math.atan2((Math.cos(radians3) * Math.sin(radians4)) - (Math.sin(radians3) * Math.tan(radians5)), Math.cos(radians4));
        double asin = Math.asin(b0.a(radians4, Math.sin(radians3) * Math.cos(radians5), Math.cos(radians3) * Math.sin(radians5)));
        return dArr;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static d0 f(int i4, boolean z4) {
        double d5 = i4 + (z4 ? -0.5d : p.f60679p);
        double d6 = d5 / 1325.55d;
        double d7 = d6 * d6;
        double d10 = (((((5.2E-9d * d6) - 1.098E-6d) * d6) - 6.691E-4d) * d7) + (27.55454989d * d5) + 2451534.6698d;
        double u4 = u((((((5.5E-8d * d6) - 1.156E-5d) * d6) - 0.0100383d) * d7) + (335.9106046d * d5) + 171.9179d);
        double u5 = u((((-8.13E-4d) - (1.0E-6d * d6)) * d7) + (27.1577721d * d5) + 347.3477d);
        double u6 = u((((-0.0125053d) - (1.48E-5d * d6)) * d7) + (d5 * 364.5287911d) + 316.6109d);
        int[] iArr = z4 ? f82308r : f82303m;
        int[] iArr2 = z4 ? f82310t : f82305o;
        int[] iArr3 = z4 ? f82309s : f82304n;
        double[] dArr = z4 ? f82311u : f82306p;
        double[] dArr2 = z4 ? f82312v : f82307q;
        int length = iArr.length - 1;
        double d11 = p.f60679p;
        while (length >= 0) {
            double d12 = d10;
            int[] iArr4 = iArr;
            int[] iArr5 = iArr2;
            double d13 = (iArr3[length] * u6) + (iArr2[length] * u5) + (iArr[length] * u4);
            double d14 = dArr[length];
            double d15 = u6;
            if (length < dArr2.length) {
                d14 += dArr2[length] * d6;
            }
            d11 = (Math.sin(Math.toRadians(d13)) * d14) + d11;
            length--;
            iArr2 = iArr5;
            iArr = iArr4;
            d10 = d12;
            u6 = d15;
        }
        return (d0) e.j(d10 + d11).s().M(d0.f82685w, TimeUnit.MINUTES);
    }

    static double j(double d5) {
        return u(((((((1.4347408140719379E-5d - (6.797172376291463E-8d * d5)) * d5) + 0.0087414d) * d5) + 477198.8675055d) * d5) + 134.9633964d);
    }

    static double k(double d5) {
        return u((((((4.083299305839118E-8d * d5) - 1.536E-4d) * d5) + 35999.0502909d) * d5) + 357.5291092d);
    }

    static double l(double d5) {
        return u((((((((1.1583324645839848E-9d * d5) - 2.8360748723766307E-7d) * d5) - 0.0036539d) * d5) + 483202.0175233d) * d5) + 93.272095d);
    }

    static double m(double d5) {
        return u(((((((1.8319447192361523E-6d - (8.844469995135542E-9d * d5)) * d5) - 0.0018819d) * d5) + 445267.1114034d) * d5) + 297.8501921d);
    }

    static double n(double d5) {
        return u(((((((((-1.5338834862103876E-8d) * d5) + 1.855835023689734E-6d) * d5) - 0.0015786d) * d5) + 481267.88123421d) * d5) + 218.3164477d);
    }

    private static int o(double d5) {
        long doubleToLongBits = Double.doubleToLongBits(d5);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public static n.a p(n nVar) {
        return n.a.g('L', nVar);
    }

    public static d0 q(d0 d0Var) {
        return c(d0Var, true);
    }

    public static d0 r(d0 d0Var) {
        return c(d0Var, false);
    }

    public static n.a s(n nVar) {
        return n.a.h('L', nVar);
    }

    static double t(double d5) {
        double d6;
        double d7 = (d5 - 2451545.0d) / 36525.0d;
        double n4 = n(d7);
        double m4 = m(d7);
        double k4 = k(d7);
        double j4 = j(d7);
        double l4 = l(d7);
        double d10 = 1.0d - (((7.4E-6d * d7) + 0.002516d) * d7);
        double d11 = d10 * d10;
        int length = f82292b.length - 1;
        double d12 = 0.0d;
        while (length >= 0) {
            int i4 = f82293c[length];
            double d13 = d10;
            if (i4 != -2) {
                if (i4 != -1 && i4 != 1) {
                    if (i4 != 2) {
                        d6 = 1.0d;
                        d12 = b0.a(Math.toRadians((f82295e[length] * l4) + (f82294d[length] * j4) + (i4 * k4) + (f82292b[length] * m4)), f82296f[length] * d6, d12);
                        length--;
                        d10 = d13;
                        m4 = m4;
                    }
                }
                d6 = d13;
                d12 = b0.a(Math.toRadians((f82295e[length] * l4) + (f82294d[length] * j4) + (i4 * k4) + (f82292b[length] * m4)), f82296f[length] * d6, d12);
                length--;
                d10 = d13;
                m4 = m4;
            }
            d6 = d11;
            d12 = b0.a(Math.toRadians((f82295e[length] * l4) + (f82294d[length] * j4) + (i4 * k4) + (f82292b[length] * m4)), f82296f[length] * d6, d12);
            length--;
            d10 = d13;
            m4 = m4;
        }
        double sin = (Math.sin(Math.toRadians((479264.29d * d7) + 53.09d)) * 318.0d) + (Math.sin(Math.toRadians(n4 - l4)) * 1962.0d) + (Math.sin(Math.toRadians((131.849d * d7) + 119.75d)) * 3958.0d) + d12;
        double[] dArr = new double[5];
        k.nutations(d7, dArr);
        return a.e((sin / 1000000.0d) + n4 + dArr[0]);
    }

    private static double u(double d5) {
        return d5 - (Math.floor(d5 / 360.0d) * 360.0d);
    }

    @Override // net.time4j.calendar.astro.c
    public double a() {
        return this.declination;
    }

    @Override // net.time4j.calendar.astro.c
    public double b() {
        return this.rightAscension;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.rightAscension == hVar.rightAscension && this.declination == hVar.declination && this.azimuth == hVar.azimuth && this.elevation == hVar.elevation && this.distance == hVar.distance;
    }

    public double g() {
        return this.azimuth;
    }

    public double h() {
        return this.distance;
    }

    public int hashCode() {
        return (o(this.distance) * 37) + (o(this.declination) * 31) + o(this.rightAscension);
    }

    public double i() {
        return this.elevation;
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(100, ProtectedSandApp.s("诲\u0001"));
        a5.append(this.rightAscension);
        a5.append(ProtectedSandApp.s("诳\u0001"));
        a5.append(this.declination);
        a5.append(ProtectedSandApp.s("说\u0001"));
        a5.append(this.azimuth);
        a5.append(ProtectedSandApp.s("诵\u0001"));
        a5.append(this.elevation);
        a5.append(ProtectedSandApp.s("诶\u0001"));
        a5.append(this.distance);
        a5.append(']');
        return a5.toString();
    }
}
