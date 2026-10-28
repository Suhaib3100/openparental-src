package net.time4j.calendar.astro;

import androidx.collection.r2;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.beacon.event.open.EventResult;
import net.time4j.d0;
import net.time4j.tz.p;
import org.apache.log4j.net.SyslogAppender;

/* compiled from: AstronomicalSeason.java */
/* loaded from: classes7.dex */
public enum b {
    VERNAL_EQUINOX,
    SUMMER_SOLSTICE,
    AUTUMNAL_EQUINOX,
    WINTER_SOLSTICE;

    private static final int[] A = {485, 203, EventResult.ERROR_CODE_OTHER, 182, 156, SyslogAppender.LOG_LOCAL1, 77, 74, 70, 58, 52, 50, 45, 44, 29, 18, 17, 16, 14, 12, 12, 12, 9, 8};
    private static final double[] B = {324.96d, 337.23d, 342.08d, 27.85d, 73.14d, 171.52d, 222.54d, 296.72d, 243.58d, 119.81d, 297.17d, 21.02d, 247.54d, 325.15d, 60.93d, 155.12d, 288.79d, 198.04d, 199.76d, 95.39d, 287.11d, 320.81d, 227.73d, 15.45d};
    private static final double[] C = {1934.136d, 32964.467d, 20.186d, 445267.112d, 45036.886d, 22518.443d, 65928.934d, 3034.906d, 9037.513d, 33718.147d, 150.678d, 2281.226d, 29929.562d, 31555.956d, 4443.417d, 67555.328d, 4562.452d, 62894.029d, 31436.921d, 14577.848d, 31931.756d, 34777.259d, 1222.114d, 16859.074d};

    /* compiled from: AstronomicalSeason.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f82272a;

        static {
            int[] iArr = new int[b.values().length];
            f82272a = iArr;
            try {
                iArr[b.VERNAL_EQUINOX.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f82272a[b.SUMMER_SOLSTICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f82272a[b.AUTUMNAL_EQUINOX.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f82272a[b.WINTER_SOLSTICE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static void checkYear(int i4) {
        if (i4 < -2000 || i4 > 3000) {
            throw new IllegalArgumentException(r2.a(ProtectedSandApp.s("诇\u0001"), i4, ProtectedSandApp.s("诈\u0001")));
        }
    }

    private static double cos(double d5) {
        return Math.cos((d5 * 3.141592653589793d) / 180.0d);
    }

    private double jdEphemerisDays(int i4) {
        double jdMean = jdMean(i4);
        double d5 = (jdMean - 2451545.0d) / 36525.0d;
        double d6 = (35999.373d * d5) - 2.47d;
        return ((periodic24(d5) * 1.0E-5d) / ((cos(d6 * 2.0d) * 7.0E-4d) + ((cos(d6) * 0.0334d) + 1.0d))) + jdMean;
    }

    private double jdMean(int i4) {
        double d5;
        double d6;
        double d7;
        double d10;
        if (i4 < 1000) {
            double d11 = i4 / 1000.0d;
            int i5 = a.f82272a[ordinal()];
            if (i5 != 1) {
                if (i5 == 2) {
                    d7 = ((((((2.5E-4d * d11) + 0.00907d) * d11) - 0.05323d) * d11) + 365241.72562d) * d11;
                    d10 = 1721233.25401d;
                } else if (i5 == 3) {
                    d7 = ((((((7.4E-4d * d11) - 0.00297d) * d11) - 0.11677d) * d11) + 365242.49558d) * d11;
                    d10 = 1721325.70455d;
                } else {
                    if (i5 != 4) {
                        throw new AssertionError(this);
                    }
                    d5 = ((((((-0.00933d) - (6.0E-5d * d11)) * d11) - 0.00769d) * d11) + 365242.88257d) * d11;
                    d6 = 1721414.39987d;
                }
                return d7 + d10;
            }
            d5 = (((((0.00111d - (7.1E-4d * d11)) * d11) + 0.06134d) * d11) + 365242.1374d) * d11;
            d6 = 1721139.29189d;
            return d5 + d6;
        }
        double d12 = (i4 - 2000) / 1000.0d;
        int i6 = a.f82272a[ordinal()];
        if (i6 == 1) {
            d5 = ((((((-0.00411d) - (5.7E-4d * d12)) * d12) + 0.05169d) * d12) + 365242.37404d) * d12;
            d6 = 2451623.80984d;
        } else {
            if (i6 != 2) {
                if (i6 == 3) {
                    d7 = ((((((7.8E-4d * d12) + 0.00337d) * d12) - 0.11575d) * d12) + 365242.01767d) * d12;
                    d10 = 2451810.21715d;
                } else {
                    if (i6 != 4) {
                        throw new AssertionError(this);
                    }
                    d7 = ((((((3.2E-4d * d12) - 0.00823d) * d12) - 0.06223d) * d12) + 365242.74049d) * d12;
                    d10 = 2451900.05952d;
                }
                return d7 + d10;
            }
            d5 = (((((0.00888d - (3.0E-4d * d12)) * d12) + 0.00325d) * d12) + 365241.62603d) * d12;
            d6 = 2451716.56767d;
        }
        return d5 + d6;
    }

    public static b of(d0 d0Var) {
        int o4 = d0Var.j1(p.f83649l).o();
        checkYear(o4);
        b bVar = VERNAL_EQUINOX;
        if (d0Var.f(bVar.inYear(o4))) {
            return WINTER_SOLSTICE;
        }
        b bVar2 = SUMMER_SOLSTICE;
        if (d0Var.f(bVar2.inYear(o4))) {
            return bVar;
        }
        b bVar3 = AUTUMNAL_EQUINOX;
        if (d0Var.f(bVar3.inYear(o4))) {
            return bVar2;
        }
        b bVar4 = WINTER_SOLSTICE;
        return d0Var.f(bVar4.inYear(o4)) ? bVar3 : bVar4;
    }

    private static double periodic24(double d5) {
        double d6 = com.google.firebase.remoteconfig.p.f60679p;
        for (int i4 = 0; i4 < 24; i4++) {
            d6 += A[i4] * cos((C[i4] * d5) + B[i4]);
        }
        return d6;
    }

    public d0 inYear(int i4) {
        double deltaT;
        net.time4j.scale.f fVar;
        checkYear(i4);
        double jdEphemerisDays = (jdEphemerisDays(i4) - 2441317.5d) * 86400.0d;
        boolean z02 = net.time4j.scale.d.u0().z0();
        if (!z02 || i4 < 1972) {
            deltaT = jdEphemerisDays - net.time4j.scale.f.deltaT(i4, (ordinal() + 1) * 3);
            fVar = net.time4j.scale.f.UT;
        } else {
            deltaT = jdEphemerisDays - 42.184d;
            fVar = net.time4j.scale.f.UTC;
        }
        long floor = (long) Math.floor(deltaT);
        int i5 = (int) ((deltaT - floor) * 1.0E9d);
        if (!z02) {
            floor += 63072000;
            fVar = net.time4j.scale.f.POSIX;
        }
        return d0.V0(floor, i5, fVar);
    }

    public e julianDay(int i4) {
        checkYear(i4);
        return e.j(jdEphemerisDays(i4));
    }

    public b onNorthernHemisphere() {
        return this;
    }

    public b onSouthernHemisphere() {
        return values()[(ordinal() + 2) % 4];
    }
}
