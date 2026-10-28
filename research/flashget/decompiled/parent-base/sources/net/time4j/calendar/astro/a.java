package net.time4j.calendar.astro;

import com.google.firebase.remoteconfig.p;

/* compiled from: AstroUtils.java */
/* loaded from: classes7.dex */
class a {
    a() {
    }

    static double a(double d5) {
        return (1.02d / Math.tan(Math.toRadians((10.3d / (5.11d + d5)) + d5))) + 0.0019279d;
    }

    static double b(double d5) {
        double floor = Math.floor(d5);
        double d6 = (d5 - floor) * 86400.0d;
        double d7 = (d5 - 51544.5d) / 36525.0d;
        double d10 = ((((0.093104d - (6.2E-6d * d7)) * d7) * d7) + ((d6 * 1.0027379093d) + ((((floor - 51544.5d) / 36525.0d) * 8640184.812866d) + 24110.54841d))) / 86400.0d;
        return (d10 - Math.floor(d10)) * 2.0d * 3.141592653589793d;
    }

    static int c(double d5) {
        long doubleToLongBits = Double.doubleToLongBits(d5);
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    static double d(int i4) {
        return Math.pow(1.0d - ((i4 * 0.0065d) / 288.15d), 4.255d);
    }

    static double e(double d5) {
        while (Double.compare(p.f60679p, d5) > 0) {
            d5 += 360.0d;
        }
        while (Double.compare(d5, 360.0d) >= 0) {
            d5 -= 360.0d;
        }
        return d5;
    }
}
