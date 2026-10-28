package net.time4j.calendar.astro;

import com.android.internal.telephony.cdma.UserData;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;
import net.time4j.calendar.astro.j;
import net.time4j.d0;
import net.time4j.engine.b0;
import net.time4j.l0;
import net.time4j.m0;
import net.time4j.n0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StdSolarCalculator.java */
/* loaded from: classes7.dex */
public abstract class k implements j.p {
    private static final /* synthetic */ k[] $VALUES;
    public static final k CC;
    private static final int[] DG_X;
    private static final double[] DG_Y;
    private static final double[] DG_Z;
    private static final double EQUATORIAL_RADIUS = 6378137.0d;
    private static final int MEAN_EARTH_RADIUS = 6372000;
    public static final k NOAA;
    private static final double POLAR_RADIUS = 6356752.3d;
    public static final k SIMPLE;
    private static final double[][] TABLE_22A;
    public static final k TIME4J;

    /* compiled from: StdSolarCalculator.java */
    enum a extends k {
        a(String str, int i4) {
            super(str, i4, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        private d0 event(net.time4j.engine.h hVar, double d5, double d6, double d7, boolean z4) {
            l0 U = j.U(hVar);
            double e12 = (((z4 ? 6 : 18) - (d6 / 15.0d)) / 24.0d) + U.e1();
            double trueLongitudeOfSunInDegrees = trueLongitudeOfSunInDegrees(e12);
            double e4 = net.time4j.calendar.astro.a.e(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(trueLongitudeOfSunInDegrees)) * 0.91764d)));
            double floor = (((Math.floor(trueLongitudeOfSunInDegrees / 90.0d) * 90.0d) - (Math.floor(e4 / 90.0d) * 90.0d)) + e4) / 15.0d;
            double sin = Math.sin(Math.toRadians(trueLongitudeOfSunInDegrees)) * 0.39782d;
            double cos = Math.cos(Math.asin(sin));
            double radians = Math.toRadians(d5);
            double cos2 = (Math.cos(Math.toRadians(d7)) - (Math.sin(radians) * sin)) / (Math.cos(radians) * cos);
            if (Double.compare(cos2, 1.0d) > 0 || Double.compare(cos2, -1.0d) < 0) {
                return null;
            }
            double degrees = Math.toDegrees(Math.acos(cos2));
            if (z4) {
                degrees = 360.0d - degrees;
            }
            double d10 = (((degrees / 15.0d) + floor) - (e12 * 0.06571d)) - 6.622d;
            if (Double.compare(p.f60679p, d10) > 0) {
                d10 += 24.0d;
            } else if (Double.compare(24.0d, d10) <= 0) {
                d10 -= 24.0d;
            }
            long longValue = (((Long) U.r(b0.UTC)).longValue() * 86400) + ((int) Math.floor((d10 - r4) * 3600.0d));
            net.time4j.scale.f fVar = net.time4j.scale.f.UT;
            if (!net.time4j.scale.d.u0().z0()) {
                longValue += 63072000;
                fVar = net.time4j.scale.f.POSIX;
            }
            return (d0) d0.W0(Math.round(longValue / 60.0d) * 60, fVar).M(d0.f82685w, TimeUnit.MINUTES);
        }

        private double time0(double d5) {
            n0 j12 = e.j(d5).s().j1(net.time4j.tz.p.f83649l);
            return (((Integer) j12.m0().r(m0.D)).intValue() / 86400.0d) + j12.k0().e1();
        }

        private double trueLongitudeOfSunInDegrees(double d5) {
            double d6 = (d5 * 0.9856d) - 3.289d;
            return net.time4j.calendar.astro.a.e((Math.sin(Math.toRadians(d6) * 2.0d) * 0.02d) + (Math.sin(Math.toRadians(d6)) * 1.916d) + d6 + 282.634d);
        }

        @Override // net.time4j.calendar.astro.k
        public double declination(double d5) {
            return Math.toDegrees(Math.asin(Math.sin(Math.toRadians(trueLongitudeOfSunInDegrees(time0(d5)))) * 0.39782d));
        }

        @Override // net.time4j.calendar.astro.j.p
        public double equationOfTime(double d5) {
            double time0 = time0(d5);
            return ((Math.sin(Math.toRadians((0.9856d * time0) - 3.8d)) * (-7.66d)) - (Math.sin(Math.toRadians((time0 * 1.9712d) + 17.96d)) * 9.78d)) * 60.0d;
        }

        @Override // net.time4j.calendar.astro.j.p
        public double getGeodeticAngle(double d5, int i4) {
            return p.f60679p;
        }

        @Override // net.time4j.calendar.astro.j.p
        public double getZenithAngle(double d5, int i4) {
            return getGeodeticAngle(d5, i4) + 90.83333333333333d;
        }

        @Override // net.time4j.calendar.astro.k
        public double rightAscension(double d5) {
            double trueLongitudeOfSunInDegrees = trueLongitudeOfSunInDegrees(time0(d5));
            double e4 = net.time4j.calendar.astro.a.e(Math.toDegrees(Math.atan(Math.tan(Math.toRadians(trueLongitudeOfSunInDegrees)) * 0.91764d)));
            double floor = Math.floor(trueLongitudeOfSunInDegrees / 90.0d) * 90.0d;
            return (e4 + floor) - (Math.floor(e4 / 90.0d) * 90.0d);
        }

        @Override // net.time4j.calendar.astro.j.p
        public d0 sunrise(net.time4j.engine.h hVar, double d5, double d6, double d7) {
            return event(hVar, d5, d6, d7, true);
        }

        @Override // net.time4j.calendar.astro.j.p
        public d0 sunset(net.time4j.engine.h hVar, double d5, double d6, double d7) {
            return event(hVar, d5, d6, d7, false);
        }
    }

    static {
        a aVar = new a(ProtectedSandApp.s("谥\u0001"), 0);
        SIMPLE = aVar;
        k kVar = new k(ProtectedSandApp.s("谦\u0001"), 1) { // from class: net.time4j.calendar.astro.k.b
            {
                a aVar2 = null;
            }

            private double declinationRad(double d5) {
                return Math.asin(Math.sin(Math.toRadians(solarLongitude(d5))) * Math.sin(Math.toRadians(obliquity(d5))));
            }

            private double equationOfCenter(double d5) {
                double radians = Math.toRadians(meanAnomaly(d5));
                return (Math.sin(radians * 3.0d) * 2.89E-4d) + ((0.019993d - (d5 * 1.01E-4d)) * Math.sin(2.0d * radians)) + ((1.914602d - (((1.4E-5d * d5) + 0.004817d) * d5)) * Math.sin(radians));
            }

            /* JADX WARN: Multi-variable type inference failed */
            private d0 event(boolean z4, net.time4j.engine.h hVar, double d5, double d6, double d7) {
                d0 v4 = j.v(hVar, 12, d6, name());
                double f4 = e.f(v4, net.time4j.scale.f.TT);
                double localHourAngle = localHourAngle(z4, f4, d5, d7);
                if (Double.isNaN(localHourAngle)) {
                    return null;
                }
                double localHourAngle2 = localHourAngle(z4, (localHourAngle / 86400.0d) + f4, d5, d7);
                if (Double.isNaN(localHourAngle2)) {
                    return null;
                }
                long floor = (long) Math.floor(localHourAngle2);
                TimeUnit timeUnit = TimeUnit.SECONDS;
                return (d0) v4.W(floor, timeUnit).W((int) ((localHourAngle2 - floor) * 1.0E9d), TimeUnit.NANOSECONDS).M(d0.f82685w, timeUnit);
            }

            private double excentricity(double d5) {
                return 0.016708634d - (((1.267E-7d * d5) + 4.2037E-5d) * d5);
            }

            private double localHourAngle(boolean z4, double d5, double d6, double d7) {
                double localHourAngle = localHourAngle(k.toJulianCenturies(d5), d6, d7);
                if (Double.isNaN(localHourAngle)) {
                    return Double.NaN;
                }
                return z4 ? -localHourAngle : localHourAngle;
            }

            private double meanAnomaly(double d5) {
                return ((35999.05029d - (1.537E-4d * d5)) * d5) + 357.52911d;
            }

            private double meanLongitude(double d5) {
                return ((((3.032E-4d * d5) + 36000.76983d) * d5) + 280.46646d) % 360.0d;
            }

            private double obliquity(double d5) {
                return (Math.cos(Math.toRadians(125.04d - (d5 * 1934.136d))) * 0.00256d) + (((((((0.001813d * d5) - 5.9E-4d) * d5) - 46.815d) * d5) + 21.448d) / 3600.0d) + 23.433333333333334d;
            }

            private double solarLongitude(double d5) {
                return ((meanLongitude(d5) + equationOfCenter(d5)) - 0.00569d) - (Math.sin(Math.toRadians(125.04d - (d5 * 1934.136d))) * 0.00478d);
            }

            @Override // net.time4j.calendar.astro.k
            public double declination(double d5) {
                return Math.toDegrees(declinationRad(k.toJulianCenturies(d5)));
            }

            @Override // net.time4j.calendar.astro.j.p
            public double equationOfTime(double d5) {
                double julianCenturies = k.toJulianCenturies(d5);
                double tan = Math.tan(Math.toRadians(obliquity(julianCenturies) / 2.0d));
                double d6 = tan * tan;
                double radians = Math.toRadians(meanLongitude(julianCenturies) * 2.0d);
                double excentricity = excentricity(julianCenturies);
                double radians2 = Math.toRadians(meanAnomaly(julianCenturies));
                double sin = Math.sin(radians2);
                return Math.toDegrees((((Math.cos(radians) * (((excentricity * 4.0d) * d6) * sin)) + ((Math.sin(radians) * d6) - ((excentricity * 2.0d) * sin))) - ((Math.sin(radians * 2.0d) * (d6 * d6)) / 2.0d)) - ((Math.sin(radians2 * 2.0d) * ((5.0d * excentricity) * excentricity)) / 4.0d)) * 240.0d;
            }

            @Override // net.time4j.calendar.astro.j.p
            public double getGeodeticAngle(double d5, int i4) {
                return p.f60679p;
            }

            @Override // net.time4j.calendar.astro.j.p
            public double getZenithAngle(double d5, int i4) {
                return getGeodeticAngle(d5, i4) + 90.83333333333333d;
            }

            @Override // net.time4j.calendar.astro.k
            public double rightAscension(double d5) {
                double julianCenturies = k.toJulianCenturies(d5);
                double radians = Math.toRadians(solarLongitude(julianCenturies));
                return net.time4j.calendar.astro.a.e(Math.toDegrees(Math.atan2(Math.sin(radians) * Math.cos(Math.toRadians(obliquity(julianCenturies))), Math.cos(radians))));
            }

            @Override // net.time4j.calendar.astro.j.p
            public d0 sunrise(net.time4j.engine.h hVar, double d5, double d6, double d7) {
                return event(true, hVar, d5, d6, d7);
            }

            @Override // net.time4j.calendar.astro.j.p
            public d0 sunset(net.time4j.engine.h hVar, double d5, double d6, double d7) {
                return event(false, hVar, d5, d6, d7);
            }

            private double localHourAngle(double d5, double d6, double d7) {
                double radians = Math.toRadians(d6);
                double declinationRad = declinationRad(d5);
                double cos = (Math.cos(Math.toRadians(d7)) - (Math.sin(radians) * Math.sin(declinationRad))) / (Math.cos(radians) * Math.cos(declinationRad));
                if (Double.compare(cos, 1.0d) > 0 || Double.compare(cos, -1.0d) < 0) {
                    return Double.NaN;
                }
                return Math.toDegrees(Math.acos(cos)) * 240.0d;
            }
        };
        NOAA = kVar;
        k kVar2 = new k(ProtectedSandApp.s("谧\u0001"), 2) { // from class: net.time4j.calendar.astro.k.c
            {
                a aVar2 = null;
            }

            private double approxMomentOfDepression(double d5, double d6, double d7, double d10, boolean z4) {
                double d11;
                long floor = (long) Math.floor(d5);
                double sineOffset = sineOffset(d5 - d7, d6, d10);
                if (d10 >= p.f60679p) {
                    d11 = z4 ? floor : 1 + floor;
                } else {
                    d11 = floor + 0.5d;
                }
                if (Math.abs(sineOffset) > 1.0d) {
                    sineOffset = sineOffset(d11 - d7, d6, d10);
                }
                if (Math.abs(sineOffset) > 1.0d) {
                    return Double.NaN;
                }
                double degrees = (((((Math.toDegrees(Math.asin(sineOffset)) / 360.0d) + 0.5d) % 1.0d) - 0.25d) * (z4 ? -1 : 1)) + floor + 0.5d;
                return degrees - (equationOfTime(degrees - d7) / 86400.0d);
            }

            private double declinationRad(double d5) {
                return Math.asin(Math.sin(Math.toRadians(k.apparentSolarLongitude(d5, nutation(d5)))) * Math.sin(Math.toRadians(obliquity(d5))));
            }

            /* JADX WARN: Multi-variable type inference failed */
            private d0 event(boolean z4, net.time4j.engine.h hVar, double d5, double d6, double d7) {
                double transform = b0.JULIAN_DAY_NUMBER.transform(hVar.b(), b0.UTC) + (z4 ? 0.25d : 0.75d);
                double i4 = (net.time4j.tz.p.a(new BigDecimal(d6)).i() - (net.time4j.scale.f.deltaT(j.U(hVar)) - 43200.0d)) / 86400.0d;
                double momentOfDepression = momentOfDepression(transform, d5, i4, d7 - 90.0d, z4);
                if (Double.isNaN(momentOfDepression)) {
                    return null;
                }
                return (d0) e.j(momentOfDepression - i4).s().M(d0.f82685w, TimeUnit.SECONDS);
            }

            private double excentricity(double d5) {
                return 0.016708617d - (((1.236E-7d * d5) + 4.2037E-5d) * d5);
            }

            private double meanAnomaly(double d5) {
                return (((((4.8E-7d * d5) - 1.559E-4d) * d5) + 35999.0503d) * d5) + 357.5291d;
            }

            private double meanLongitude(double d5) {
                return ((((3.032E-4d * d5) + 36000.76983d) * d5) + 280.46645d) % 360.0d;
            }

            private double momentOfDepression(double d5, double d6, double d7, double d10, boolean z4) {
                double approxMomentOfDepression = approxMomentOfDepression(d5, d6, d7, d10, z4);
                if (Double.isNaN(approxMomentOfDepression)) {
                    return Double.NaN;
                }
                return Math.abs(d5 - approxMomentOfDepression) * 86400.0d < 30.0d ? approxMomentOfDepression : momentOfDepression(approxMomentOfDepression, d6, d7, d10, z4);
            }

            private double nutation(double d5) {
                return (Math.sin(Math.toRadians((((0.002063d * d5) - 1934.134d) * d5) + 124.9d)) * (-0.004778d)) - (Math.sin(Math.toRadians((((5.7E-4d * d5) + 72001.5377d) * d5) + 201.11d)) * 3.667E-4d);
            }

            private double obliquity(double d5) {
                return (((((((0.001813d * d5) - 5.9E-4d) * d5) - 46.815d) * d5) + 21.448d) / 3600.0d) + 23.433333333333334d;
            }

            private double sineOffset(double d5, double d6, double d7) {
                double julianCenturies = k.toJulianCenturies(d5);
                double radians = Math.toRadians(d6);
                double declinationRad = declinationRad(julianCenturies);
                return (Math.sin(Math.toRadians(d7)) / (Math.cos(radians) * Math.cos(declinationRad))) + (Math.tan(declinationRad) * Math.tan(radians));
            }

            @Override // net.time4j.calendar.astro.k
            public double declination(double d5) {
                return getFeature(d5, ProtectedSandApp.s("谫\u0001"));
            }

            @Override // net.time4j.calendar.astro.j.p
            public double equationOfTime(double d5) {
                double julianCenturies = k.toJulianCenturies(d5);
                double tan = Math.tan(Math.toRadians(obliquity(julianCenturies) / 2.0d));
                double d6 = tan * tan;
                double radians = Math.toRadians(meanLongitude(julianCenturies) * 2.0d);
                double excentricity = excentricity(julianCenturies);
                double radians2 = Math.toRadians(meanAnomaly(julianCenturies));
                double sin = Math.sin(radians2);
                return Math.toDegrees((((Math.cos(radians) * (((excentricity * 4.0d) * d6) * sin)) + ((Math.sin(radians) * d6) - ((excentricity * 2.0d) * sin))) - ((Math.sin(radians * 2.0d) * (d6 * d6)) / 2.0d)) - ((Math.sin(radians2 * 2.0d) * ((5.0d * excentricity) * excentricity)) / 4.0d)) * 240.0d;
            }

            @Override // net.time4j.calendar.astro.k, net.time4j.calendar.astro.j.p
            public double getFeature(double d5, String str) {
                double julianCenturies = k.toJulianCenturies(d5);
                if (str.equals(ProtectedSandApp.s("谫\u0001"))) {
                    return Math.toDegrees(declinationRad(julianCenturies));
                }
                if (str.equals(ProtectedSandApp.s("谬\u0001"))) {
                    double radians = Math.toRadians(k.apparentSolarLongitude(julianCenturies, nutation(julianCenturies)));
                    return net.time4j.calendar.astro.a.e(Math.toDegrees(Math.atan2(Math.sin(radians) * Math.cos(Math.toRadians(obliquity(julianCenturies))), Math.cos(radians))));
                }
                if (str.equals(ProtectedSandApp.s("谭\u0001"))) {
                    return nutation(julianCenturies);
                }
                if (str.equals(ProtectedSandApp.s("谮\u0001"))) {
                    return obliquity(julianCenturies);
                }
                if (str.equals(ProtectedSandApp.s("谯\u0001"))) {
                    return meanAnomaly(julianCenturies);
                }
                if (str.equals(ProtectedSandApp.s("谰\u0001"))) {
                    return k.apparentSolarLongitude(julianCenturies, nutation(julianCenturies));
                }
                if (str.equals(ProtectedSandApp.s("谱\u0001"))) {
                    return p.f60679p;
                }
                return Double.NaN;
            }

            @Override // net.time4j.calendar.astro.j.p
            public double getGeodeticAngle(double d5, int i4) {
                if (i4 == 0) {
                    return p.f60679p;
                }
                double d6 = i4;
                return (Math.sqrt(d6) * 0.005277777777777778d) + Math.toDegrees(Math.acos(6372000.0d / (d6 + 6372000.0d)));
            }

            @Override // net.time4j.calendar.astro.j.p
            public double getZenithAngle(double d5, int i4) {
                return getGeodeticAngle(d5, i4) + 90.83333333333333d;
            }

            @Override // net.time4j.calendar.astro.k
            public double rightAscension(double d5) {
                return getFeature(d5, ProtectedSandApp.s("谬\u0001"));
            }

            @Override // net.time4j.calendar.astro.j.p
            public d0 sunrise(net.time4j.engine.h hVar, double d5, double d6, double d7) {
                return event(true, hVar, d5, d6, d7);
            }

            @Override // net.time4j.calendar.astro.j.p
            public d0 sunset(net.time4j.engine.h hVar, double d5, double d6, double d7) {
                return event(false, hVar, d5, d6, d7);
            }
        };
        CC = kVar2;
        k kVar3 = new k(ProtectedSandApp.s("谨\u0001"), 3) { // from class: net.time4j.calendar.astro.k.d
            {
                a aVar2 = null;
            }

            private double declinationRad(double d5) {
                double[] dArr = new double[2];
                k.nutations(d5, dArr);
                return Math.asin(Math.sin(Math.toRadians(k.apparentSolarLongitude(d5, dArr[0]))) * Math.sin(Math.toRadians(k.meanObliquity(d5) + dArr[1])));
            }

            /* JADX WARN: Multi-variable type inference failed */
            private d0 event(boolean z4, net.time4j.engine.h hVar, double d5, double d6, double d7) {
                d0 v4 = j.v(hVar, 12, d6, name());
                double f4 = e.f(v4, net.time4j.scale.f.TT);
                double d10 = p.f60679p;
                while (true) {
                    double localHourAngle = localHourAngle(z4, (d10 / 86400.0d) + f4, d5, d7);
                    if (Double.isNaN(localHourAngle)) {
                        return null;
                    }
                    if (Math.abs(localHourAngle - d10) < 15.0d) {
                        long floor = (long) Math.floor(localHourAngle);
                        TimeUnit timeUnit = TimeUnit.SECONDS;
                        return (d0) v4.W(floor, timeUnit).W((int) ((localHourAngle - floor) * 1.0E9d), TimeUnit.NANOSECONDS).M(d0.f82685w, timeUnit);
                    }
                    d10 = localHourAngle;
                }
            }

            private double excentricity(double d5) {
                return 0.016708634d - (((1.267E-7d * d5) + 4.2037E-5d) * d5);
            }

            private double localHourAngle(boolean z4, double d5, double d6, double d7) {
                double julianCenturies = k.toJulianCenturies(d5);
                double radians = Math.toRadians(d6);
                double declinationRad = declinationRad(julianCenturies);
                double cos = (Math.cos(Math.toRadians(d7)) - (Math.sin(radians) * Math.sin(declinationRad))) / (Math.cos(radians) * Math.cos(declinationRad));
                if (Double.compare(cos, 1.0d) > 0 || Double.compare(cos, -1.0d) < 0) {
                    return Double.NaN;
                }
                double degrees = Math.toDegrees(Math.acos(cos)) * 240.0d;
                return z4 ? -degrees : degrees;
            }

            private double meanAnomaly(double d5) {
                return ((35999.05029d - (1.537E-4d * d5)) * d5) + 357.52911d;
            }

            private double meanLongitude(double d5) {
                return ((((3.032E-4d * d5) + 36000.76983d) * d5) + 280.46646d) % 360.0d;
            }

            private double trueObliquity(double d5) {
                return (Math.cos(Math.toRadians(125.04d - (d5 * 1934.136d))) * 0.00256d) + k.meanObliquity(d5);
            }

            @Override // net.time4j.calendar.astro.k
            public double declination(double d5) {
                return getFeature(d5, ProtectedSandApp.s("谲\u0001"));
            }

            @Override // net.time4j.calendar.astro.j.p
            public double equationOfTime(double d5) {
                double julianCenturies = k.toJulianCenturies(d5);
                double tan = Math.tan(Math.toRadians(trueObliquity(julianCenturies) / 2.0d));
                double d6 = tan * tan;
                double radians = Math.toRadians(meanLongitude(julianCenturies) * 2.0d);
                double excentricity = excentricity(julianCenturies);
                double radians2 = Math.toRadians(meanAnomaly(julianCenturies));
                double sin = Math.sin(radians2);
                return Math.toDegrees((((Math.cos(radians) * (((excentricity * 4.0d) * d6) * sin)) + ((Math.sin(radians) * d6) - ((excentricity * 2.0d) * sin))) - ((Math.sin(radians * 2.0d) * (d6 * d6)) / 2.0d)) - ((Math.sin(radians2 * 2.0d) * ((5.0d * excentricity) * excentricity)) / 4.0d)) * 240.0d;
            }

            @Override // net.time4j.calendar.astro.k, net.time4j.calendar.astro.j.p
            public double getFeature(double d5, String str) {
                double julianCenturies = k.toJulianCenturies(d5);
                if (str.equals(ProtectedSandApp.s("谲\u0001"))) {
                    return Math.toDegrees(declinationRad(julianCenturies));
                }
                if (str.equals(ProtectedSandApp.s("谳\u0001"))) {
                    double[] dArr = new double[2];
                    k.nutations(julianCenturies, dArr);
                    double radians = Math.toRadians(k.apparentSolarLongitude(julianCenturies, dArr[0]));
                    return net.time4j.calendar.astro.a.e(Math.toDegrees(Math.atan2(Math.sin(radians) * Math.cos(Math.toRadians(k.meanObliquity(julianCenturies) + dArr[1])), Math.cos(radians))));
                }
                if (str.equals(ProtectedSandApp.s("谴\u0001"))) {
                    double[] dArr2 = new double[2];
                    k.nutations(julianCenturies, dArr2);
                    return dArr2[0];
                }
                if (str.equals(ProtectedSandApp.s("谵\u0001"))) {
                    double[] dArr3 = new double[2];
                    k.nutations(julianCenturies, dArr3);
                    return k.meanObliquity(julianCenturies) + dArr3[1];
                }
                if (str.equals(ProtectedSandApp.s("谶\u0001"))) {
                    return meanAnomaly(julianCenturies);
                }
                if (str.equals(ProtectedSandApp.s("谷\u0001"))) {
                    double[] dArr4 = new double[2];
                    k.nutations(julianCenturies, dArr4);
                    return k.apparentSolarLongitude(julianCenturies, dArr4[0]);
                }
                if (str.equals(ProtectedSandApp.s("谸\u0001"))) {
                    return p.f60679p;
                }
                return Double.NaN;
            }

            @Override // net.time4j.calendar.astro.j.p
            public double getGeodeticAngle(double d5, int i4) {
                if (i4 == 0) {
                    return p.f60679p;
                }
                double radians = Math.toRadians(d5);
                double cos = Math.cos(radians) * k.EQUATORIAL_RADIUS;
                double sin = Math.sin(radians) * k.POLAR_RADIUS;
                double sqrt = 4.0680631590769E13d / Math.sqrt((sin * sin) + (cos * cos));
                return Math.toDegrees(Math.acos(sqrt / (i4 + sqrt)));
            }

            @Override // net.time4j.calendar.astro.j.p
            public double getZenithAngle(double d5, int i4) {
                if (i4 == 0) {
                    return 90.83333333333333d;
                }
                return (((net.time4j.calendar.astro.a.d(i4) * 34.0d) + 16.0d) / 60.0d) + getGeodeticAngle(d5, i4) + 90.0d;
            }

            @Override // net.time4j.calendar.astro.k
            public double rightAscension(double d5) {
                return getFeature(d5, ProtectedSandApp.s("谳\u0001"));
            }

            @Override // net.time4j.calendar.astro.j.p
            public d0 sunrise(net.time4j.engine.h hVar, double d5, double d6, double d7) {
                return event(true, hVar, d5, d6, d7);
            }

            @Override // net.time4j.calendar.astro.j.p
            public d0 sunset(net.time4j.engine.h hVar, double d5, double d6, double d7) {
                return event(false, hVar, d5, d6, d7);
            }
        };
        TIME4J = kVar3;
        $VALUES = new k[]{aVar, kVar, kVar2, kVar3};
        DG_X = new int[]{403406, 195207, 119433, 112392, 3891, 2819, 1721, 660, 350, 334, 314, 268, 242, 234, 158, UserData.IS91_MSG_TYPE_CLI, 129, 114, 99, 93, 86, 78, 72, 68, 64, 46, 38, 37, 32, 29, 28, 27, 27, 25, 24, 21, 21, 20, 18, 17, 14, 13, 13, 13, 12, 10, 10, 10, 10};
        DG_Y = new double[]{270.54861d, 340.19128d, 63.91854d, 331.2622d, 317.843d, 86.631d, 240.052d, 310.26d, 247.23d, 260.87d, 297.82d, 343.14d, 166.79d, 81.53d, 3.5d, 132.75d, 182.95d, 162.03d, 29.8d, 266.4d, 249.2d, 157.6d, 257.8d, 185.1d, 69.9d, 8.0d, 197.1d, 250.4d, 65.3d, 162.7d, 341.5d, 291.6d, 98.5d, 146.7d, 110.0d, 5.2d, 342.6d, 230.9d, 256.1d, 45.3d, 242.9d, 115.2d, 151.8d, 285.3d, 53.3d, 126.6d, 205.7d, 85.9d, 146.1d};
        DG_Z = new double[]{0.9287892d, 35999.1376958d, 35999.4089666d, 35998.7287385d, 71998.20261d, 71998.4403d, 36000.35726d, 71997.4812d, 32964.4678d, -19.441d, 445267.1117d, 45036.884d, 3.1008d, 22518.4434d, -19.9739d, 65928.9345d, 9038.0293d, 3034.7684d, 33718.148d, 3034.448d, -2280.773d, 29929.992d, 31556.493d, 149.588d, 9037.75d, 107997.405d, -4444.176d, 151.771d, 67555.316d, 31556.08d, -4561.54d, 107996.706d, 1221.655d, 62894.167d, 31437.369d, 14578.298d, -31931.757d, 34777.243d, 1221.999d, 62894.511d, -4442.039d, 107997.909d, 119.066d, 16859.071d, -4.578d, 26895.292d, -39.127d, 12297.536d, 90073.778d};
        double[] dArr = new double[9];
        // fill-array-data instruction
        dArr[0] = 0.0d;
        dArr[1] = 0.0d;
        dArr[2] = 1.0d;
        dArr[3] = 0.0d;
        dArr[4] = 1.0d;
        dArr[5] = 63.0d;
        dArr[6] = 0.1d;
        dArr[7] = -33.0d;
        dArr[8] = 0.0d;
        TABLE_22A = new double[][]{new double[]{p.f60679p, p.f60679p, p.f60679p, p.f60679p, 1.0d, -171996.0d, -174.2d, 92025.0d, 8.9d}, new double[]{-2.0d, p.f60679p, p.f60679p, 2.0d, 2.0d, -13187.0d, -1.6d, 5736.0d, -3.1d}, new double[]{p.f60679p, p.f60679p, p.f60679p, 2.0d, 2.0d, -2274.0d, -0.2d, 977.0d, -0.5d}, new double[]{p.f60679p, p.f60679p, p.f60679p, p.f60679p, 2.0d, 2062.0d, 0.2d, -895.0d, 0.5d}, new double[]{p.f60679p, 1.0d, p.f60679p, p.f60679p, p.f60679p, 1426.0d, -3.4d, 54.0d, -0.1d}, new double[]{p.f60679p, p.f60679p, 1.0d, p.f60679p, p.f60679p, 712.0d, 0.1d, -7.0d, p.f60679p}, new double[]{-2.0d, 1.0d, p.f60679p, 2.0d, 2.0d, -517.0d, 1.2d, 224.0d, -0.6d}, new double[]{p.f60679p, p.f60679p, p.f60679p, 2.0d, 1.0d, -386.0d, -0.4d, 200.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, 1.0d, 2.0d, 2.0d, -301.0d, p.f60679p, 129.0d, -0.1d}, new double[]{-2.0d, -1.0d, p.f60679p, 2.0d, 2.0d, 217.0d, -0.5d, -95.0d, 0.3d}, new double[]{-2.0d, p.f60679p, 1.0d, p.f60679p, p.f60679p, -158.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-2.0d, p.f60679p, p.f60679p, 2.0d, 1.0d, 129.0d, 0.1d, -70.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, -1.0d, 2.0d, 2.0d, 123.0d, p.f60679p, -53.0d, p.f60679p}, new double[]{2.0d, p.f60679p, p.f60679p, p.f60679p, p.f60679p, 63.0d, p.f60679p, p.f60679p, p.f60679p}, dArr, new double[]{2.0d, p.f60679p, -1.0d, 2.0d, 2.0d, -59.0d, p.f60679p, 26.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, -1.0d, p.f60679p, 1.0d, -58.0d, -0.1d, 32.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, 1.0d, 2.0d, 1.0d, -51.0d, p.f60679p, 27.0d, p.f60679p}, new double[]{-2.0d, p.f60679p, 2.0d, p.f60679p, p.f60679p, 48.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, p.f60679p, -2.0d, 2.0d, 1.0d, 46.0d, p.f60679p, -24.0d, p.f60679p}, new double[]{2.0d, p.f60679p, p.f60679p, 2.0d, 2.0d, -38.0d, p.f60679p, 16.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, 2.0d, 2.0d, 2.0d, -31.0d, p.f60679p, 13.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, 2.0d, p.f60679p, p.f60679p, 29.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-2.0d, p.f60679p, 1.0d, 2.0d, 2.0d, 29.0d, p.f60679p, -12.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, p.f60679p, 2.0d, p.f60679p, 26.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-2.0d, p.f60679p, p.f60679p, 2.0d, p.f60679p, -22.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, p.f60679p, -1.0d, 2.0d, 1.0d, 21.0d, p.f60679p, -10.0d, p.f60679p}, new double[]{p.f60679p, 2.0d, p.f60679p, p.f60679p, p.f60679p, 17.0d, -0.1d, p.f60679p, p.f60679p}, new double[]{2.0d, p.f60679p, -1.0d, p.f60679p, 1.0d, 16.0d, p.f60679p, -8.0d, p.f60679p}, new double[]{-2.0d, 2.0d, p.f60679p, 2.0d, 2.0d, -16.0d, 0.1d, 7.0d, p.f60679p}, new double[]{p.f60679p, 1.0d, p.f60679p, p.f60679p, 1.0d, -15.0d, p.f60679p, 9.0d, p.f60679p}, new double[]{-2.0d, p.f60679p, 1.0d, p.f60679p, 1.0d, -13.0d, p.f60679p, 7.0d, p.f60679p}, new double[]{p.f60679p, -1.0d, p.f60679p, p.f60679p, 1.0d, -12.0d, p.f60679p, 6.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, 2.0d, -2.0d, p.f60679p, 11.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{2.0d, p.f60679p, -1.0d, 2.0d, 1.0d, -10.0d, p.f60679p, 5.0d, p.f60679p}, new double[]{2.0d, p.f60679p, 1.0d, 2.0d, 2.0d, -8.0d, p.f60679p, 3.0d, p.f60679p}, new double[]{p.f60679p, 1.0d, p.f60679p, 2.0d, 2.0d, 7.0d, p.f60679p, -3.0d, p.f60679p}, new double[]{-2.0d, 1.0d, 1.0d, p.f60679p, p.f60679p, -7.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, -1.0d, p.f60679p, 2.0d, 2.0d, -7.0d, p.f60679p, 3.0d, p.f60679p}, new double[]{2.0d, p.f60679p, p.f60679p, 2.0d, 1.0d, -7.0d, p.f60679p, 3.0d, p.f60679p}, new double[]{2.0d, p.f60679p, 1.0d, p.f60679p, p.f60679p, 6.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-2.0d, p.f60679p, 2.0d, 2.0d, 2.0d, 6.0d, p.f60679p, -3.0d, p.f60679p}, new double[]{-2.0d, p.f60679p, 1.0d, 2.0d, 1.0d, 6.0d, p.f60679p, -3.0d, p.f60679p}, new double[]{2.0d, p.f60679p, -2.0d, p.f60679p, 1.0d, -6.0d, p.f60679p, 3.0d, p.f60679p}, new double[]{2.0d, p.f60679p, p.f60679p, p.f60679p, 1.0d, -6.0d, p.f60679p, 3.0d, p.f60679p}, new double[]{p.f60679p, -1.0d, 1.0d, p.f60679p, p.f60679p, 5.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-2.0d, -1.0d, p.f60679p, 2.0d, 1.0d, -5.0d, p.f60679p, 3.0d, p.f60679p}, new double[]{-2.0d, p.f60679p, p.f60679p, p.f60679p, 1.0d, -5.0d, p.f60679p, 3.0d, p.f60679p}, new double[]{p.f60679p, p.f60679p, 2.0d, 2.0d, 1.0d, -5.0d, p.f60679p, 3.0d, p.f60679p}, new double[]{-2.0d, p.f60679p, 2.0d, p.f60679p, 1.0d, 4.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-2.0d, 1.0d, p.f60679p, 2.0d, 1.0d, 4.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, p.f60679p, 1.0d, -2.0d, p.f60679p, 4.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-1.0d, p.f60679p, 1.0d, p.f60679p, p.f60679p, -4.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-2.0d, 1.0d, p.f60679p, p.f60679p, p.f60679p, -4.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{1.0d, p.f60679p, p.f60679p, p.f60679p, p.f60679p, -4.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, p.f60679p, 1.0d, 2.0d, p.f60679p, 3.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, p.f60679p, -2.0d, 2.0d, 2.0d, -3.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{-1.0d, -1.0d, 1.0d, p.f60679p, p.f60679p, -3.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, 1.0d, 1.0d, p.f60679p, p.f60679p, -3.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, -1.0d, 1.0d, 2.0d, 2.0d, -3.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{2.0d, -1.0d, -1.0d, 2.0d, 2.0d, -3.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{p.f60679p, p.f60679p, 3.0d, 2.0d, 2.0d, -3.0d, p.f60679p, p.f60679p, p.f60679p}, new double[]{2.0d, -1.0d, p.f60679p, 2.0d, 2.0d, -3.0d, p.f60679p, p.f60679p, p.f60679p}};
    }

    private k(String str, int i4) {
    }

    private static double aberration(double d5) {
        return (Math.cos(Math.toRadians((d5 * 35999.01848d) + 177.63d)) * 9.74E-5d) - 0.005575d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double apparentSolarLongitude(double d5, double d6) {
        double d7 = p.f60679p;
        for (int length = DG_X.length - 1; length >= 0; length--) {
            d7 += Math.sin(Math.toRadians((DG_Z[length] * d5) + DG_Y[length])) * DG_X[length];
        }
        double aberration = (((((d7 * 5.729577951308232d) / 1000000.0d) + ((36000.76953744d * d5) + 282.7771834d)) + aberration(d5)) + d6) / 360.0d;
        return (aberration - Math.floor(aberration)) * 360.0d;
    }

    static double meanObliquity(double d5) {
        return (((((((0.001813d * d5) - 5.9E-4d) * d5) - 46.815d) * d5) + 21.448d) / 3600.0d) + 23.433333333333334d;
    }

    static void nutations(double d5, double[] dArr) {
        double radians = Math.toRadians((((((5.277768981496142E-6d * d5) - 0.0019142d) * d5) + 445267.11148d) * d5) + 297.85036d);
        double radians2 = Math.toRadians(((((((-3.3333333333333333E-6d) * d5) - 1.603E-4d) * d5) + 35999.05034d) * d5) + 357.52772d);
        double radians3 = Math.toRadians((((((1.7777777777777779E-4d * d5) + 0.0086972d) * d5) + 477198.867398d) * d5) + 134.96298d);
        double radians4 = Math.toRadians((((((3.0555810187307116E-6d * d5) - 0.0036825d) * d5) + 483202.017538d) * d5) + 93.27191d);
        double radians5 = Math.toRadians((((((2.222222222222222E-6d * d5) + 0.0020708d) * d5) - 1934.136261d) * d5) + 125.04452d);
        double d6 = p.f60679p;
        double d7 = 0.0d;
        for (int length = TABLE_22A.length - 1; length >= 0; length--) {
            double[] dArr2 = TABLE_22A[length];
            double d10 = (dArr2[4] * radians5) + (dArr2[3] * radians4) + (dArr2[2] * radians3) + (dArr2[1] * radians2) + (dArr2[0] * radians);
            d6 = (((dArr2[6] * d5) + dArr2[5]) * Math.sin(d10)) + d6;
            d7 = (((dArr2[8] * d5) + dArr2[7]) * Math.cos(d10)) + d7;
        }
        dArr[0] = (d6 * 1.0E-4d) / 3600.0d;
        dArr[1] = (d7 * 1.0E-4d) / 3600.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double toJulianCenturies(double d5) {
        return (d5 - 2451545.0d) / 36525.0d;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }

    public double declination(double d5) {
        throw new AbstractMethodError();
    }

    @Override // net.time4j.calendar.astro.j.p
    public double getFeature(double d5, String str) {
        if (str.equals(ProtectedSandApp.s("谩\u0001"))) {
            return declination(d5);
        }
        if (str.equals(ProtectedSandApp.s("谪\u0001"))) {
            return rightAscension(d5);
        }
        return Double.NaN;
    }

    public double rightAscension(double d5) {
        throw new AbstractMethodError();
    }

    /* synthetic */ k(String str, int i4, a aVar) {
        this(str, i4);
    }
}
