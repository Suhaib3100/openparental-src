package net.time4j.scale;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;

/* compiled from: TimeScale.java */
/* loaded from: classes7.dex */
public enum f {
    POSIX,
    UTC,
    TAI,
    GPS,
    TT,
    UT;

    public static double deltaT(int i4, int i5) {
        if (i5 < 1 || i5 > 12) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("顥\u0001"), i5));
        }
        return deltaT(i4, ((i5 - 0.5d) / 12.0d) + i4);
    }

    public static double deltaT(net.time4j.base.a aVar) {
        int o4 = aVar.o();
        int i4 = net.time4j.base.b.e(o4) ? 366 : 365;
        int q4 = aVar.q();
        int i5 = 1;
        int i6 = 0;
        for (int i7 = 1; i7 < q4; i7++) {
            i6 += net.time4j.base.b.d(o4, i7);
        }
        int t4 = aVar.t() + i6;
        if (t4 <= i4) {
            if (o4 == -2001 && t4 == 365) {
                o4 = -2000;
            } else {
                i5 = t4;
            }
            return deltaT(o4, ((i5 - 1.0d) / i4) + o4);
        }
        throw new IllegalArgumentException(aVar.toString());
    }

    private static double deltaT(int i4, double d5) {
        double d6;
        double d7;
        if (i4 < -2000 || i4 > 3000) {
            throw new IllegalArgumentException(android.support.v4.media.a.a(ProtectedSandApp.s("顤\u0001"), i4));
        }
        if (i4 <= 2050) {
            if (i4 >= 2018) {
                double d10 = d5 - 2000.0d;
                d6 = ((0.012125d * d10) + 0.0533d) * d10;
                d7 = 64.16d;
            } else if (i4 >= 2005) {
                double d11 = d5 - 2000.0d;
                d6 = ((((((4.2060317E-5d * d11) - 0.00112745d) * d11) + 0.014201d) * d11) + 0.171417d) * d11;
                d7 = 63.5934d;
            } else if (i4 >= 1986) {
                double d12 = d5 - 2000.0d;
                d6 = ((((((((2.373599E-5d * d12) + 6.51814E-4d) * d12) + 0.0017275d) * d12) - 0.060374d) * d12) + 0.3345d) * d12;
                d7 = 63.86d;
            } else {
                if (i4 >= 1961) {
                    double d13 = d5 - 1975.0d;
                    return ((((p.f60679p - (d13 / 718.0d)) * d13) + 1.067d) * d13) + 45.45d;
                }
                if (i4 >= 1941) {
                    double d14 = d5 - 1950.0d;
                    d6 = ((((d14 / 2547.0d) + p.f60679p) * d14) + 0.407d) * d14;
                    d7 = 29.07d;
                } else if (i4 >= 1920) {
                    double d15 = d5 - 1920.0d;
                    d6 = ((((0.0020936d * d15) - 0.0761d) * d15) + 0.84493d) * d15;
                    d7 = 21.2d;
                } else {
                    if (i4 >= 1900) {
                        double d16 = d5 - 1900.0d;
                        return ((((((0.0061966d - (1.97E-4d * d16)) * d16) - 0.0598939d) * d16) + 1.494119d) * d16) - 2.79d;
                    }
                    if (i4 >= 1860) {
                        double d17 = d5 - 1860.0d;
                        d6 = ((((((((d17 / 233174.0d) - 4.473624E-4d) * d17) + 0.01680668d) * d17) - 0.251754d) * d17) + 0.5737d) * d17;
                        d7 = 7.62d;
                    } else if (i4 >= 1800) {
                        d6 = ((((((((((((8.75E-10d * r12) - 1.699E-7d) * r12) + 1.21272E-5d) * r12) - 3.7436E-4d) * r12) + 0.0041116d) * r12) + 0.0068612d) * r12) - 0.332447d) * (d5 - 1800.0d);
                        d7 = 13.72d;
                    } else if (i4 >= 1700) {
                        double d18 = d5 - 1700.0d;
                        d6 = ((((((d18 / 1174000.0d) + 1.3336E-4d) * d18) - 0.0059285d) * d18) + 0.1603d) * d18;
                        d7 = 8.83d;
                    } else if (i4 >= 1600) {
                        d6 = ((((r12 / 7129.0d) - 0.01532d) * r12) - 0.9808d) * (d5 - 1600.0d);
                        d7 = 120.0d;
                    } else if (i4 >= 500) {
                        d6 = ((((((((((0.0083572073d * r12) - 0.005050998d) * r12) - 0.8503463d) * r12) + 0.319781d) * r12) + 71.23472d) * r12) - 556.01d) * ((d5 - 1000.0d) / 100.0d);
                        d7 = 1574.2d;
                    } else if (i4 >= -500) {
                        d6 = ((((((((((0.0090316521d * r12) + 0.022174192d) * r12) - 0.1798452d) * r12) - 5.952053d) * r12) + 33.78311d) * r12) - 1014.41d) * (d5 / 100.0d);
                        d7 = 10583.6d;
                    }
                }
            }
            return d6 + d7;
        }
        double d19 = (d5 - 1820.0d) / 100.0d;
        return ((32.0d * d19) * d19) - 20.0d;
    }
}
