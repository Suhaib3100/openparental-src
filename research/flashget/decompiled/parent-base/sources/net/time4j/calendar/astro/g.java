package net.time4j.calendar.astro;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import java.util.concurrent.TimeUnit;
import net.time4j.d0;
import net.time4j.n0;
import net.time4j.tz.p;

/* compiled from: MoonPhase.java */
/* loaded from: classes7.dex */
public enum g {
    NEW_MOON(0),
    FIRST_QUARTER(90),
    FULL_MOON(180),
    LAST_QUARTER(270);

    private static final int[] FACTORS = {100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.Q2};
    private static final double MEAN_SYNODIC_MONTH = 29.530588861d;
    private static final double[] V_FULL;
    private static final double[] V_NEW;
    private static final double[] V_QUARTER;
    private static final int[] W_NEW_FULL;
    private static final int[] W_QUARTER;
    private static final int[] X_NEW_FULL;
    private static final int[] X_QUARTER;
    private static final int[] Y_NEW_FULL;
    private static final int[] Y_QUARTER;
    private static final d0 ZERO_REF;
    private static final int[] Z_NEW_FULL;
    private static final int[] Z_QUARTER;
    private final transient int phase;

    static {
        n0 A0 = n0.A0(2000, 1, 6, 18, 13, 42);
        A0.getClass();
        ZERO_REF = A0.e0(p.f83649l);
        W_NEW_FULL = new int[]{0, 1, 0, 0, 1, 1, 2, 0, 0, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        W_QUARTER = new int[]{0, 1, 1, 0, 0, 1, 2, 0, 0, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        X_NEW_FULL = new int[]{0, 1, 0, 0, -1, 1, 2, 0, 0, 1, 0, 1, 1, -1, 2, 0, 3, 1, 0, 1, -1, -1, 1, 0};
        X_QUARTER = new int[]{0, 1, 1, 0, 0, -1, 2, 0, 0, 0, -1, 1, 1, 2, 1, -1, 0, 1, -2, 1, 3, 0, -1, 1};
        Y_NEW_FULL = new int[]{1, 0, 2, 0, 1, 1, 0, 1, 1, 2, 3, 0, 0, 2, 1, 2, 0, 1, 2, 1, 1, 1, 3, 4};
        Y_QUARTER = new int[]{1, 0, 1, 2, 0, 1, 0, 1, 1, 3, 2, 0, 0, 1, 2, 1, 2, 1, 1, 1, 0, 2, 1, 3};
        Z_NEW_FULL = new int[]{0, 0, 0, 2, 0, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 0, -2, 2, 2, 2, -2, 0, 0};
        Z_QUARTER = new int[]{0, 0, 0, 0, 2, 0, 0, -2, 2, 0, 0, 2, -2, 0, 0, -2, 2, 2, 0, -2, 0, -2, 2, 0};
        V_NEW = new double[]{-0.4072d, 0.17241d, 0.01608d, 0.01039d, 0.00739d, -0.00514d, 0.00208d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};
        V_FULL = new double[]{-0.40614d, 0.17302d, 0.01614d, 0.01043d, 0.00734d, -0.00515d, 0.00209d, -0.00111d, -5.7E-4d, 5.6E-4d, -4.2E-4d, 4.2E-4d, 3.8E-4d, -2.4E-4d, -7.0E-5d, 4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, -3.0E-5d, 3.0E-5d, -2.0E-5d, -2.0E-5d, 2.0E-5d};
        V_QUARTER = new double[]{-0.62801d, 0.17172d, -0.01183d, 0.00862d, 0.00804d, 0.00454d, 0.00204d, -0.0018d, -7.0E-4d, -4.0E-4d, -3.4E-4d, 3.2E-4d, 3.2E-4d, -2.8E-4d, 2.7E-4d, -5.0E-5d, 4.0E-5d, -4.0E-5d, 4.0E-5d, 3.0E-5d, 3.0E-5d, 2.0E-5d, 2.0E-5d, -2.0E-5d};
    }

    g(int i4) {
        this.phase = i4;
    }

    private static double corrQuarter(double d5, double d6, double d7, double d10) {
        return (cos(d10 * 2.0d) * 2.0E-5d) + (cos(d7 + d6) * 2.0E-5d) + (((cos(d7) * 2.6E-4d) + (0.00306d - ((d5 * 3.8E-4d) * cos(d6)))) - (cos(d7 - d6) * 2.0E-5d));
    }

    private static double cos(double d5) {
        return Math.cos((d5 * 3.141592653589793d) / 180.0d);
    }

    private int getEstimatedLunations(d0 d0Var) {
        return net.time4j.base.c.g(Math.round((ZERO_REF.Y(d0Var, TimeUnit.DAYS) / MEAN_SYNODIC_MONTH) - (this.phase / 360.0d)));
    }

    public static double getIllumination(d0 d0Var) {
        return getIllumination(d0Var, 0);
    }

    public static int maxLunation() {
        return 12379;
    }

    public static int minLunation() {
        return -49473;
    }

    private double periodic24(double d5, double d6, double d7, double d10) {
        g gVar = NEW_MOON;
        double[] dArr = this == gVar ? V_NEW : this == FULL_MOON ? V_FULL : V_QUARTER;
        int[] iArr = (this == gVar || this == FULL_MOON) ? W_NEW_FULL : W_QUARTER;
        int[] iArr2 = (this == gVar || this == FULL_MOON) ? X_NEW_FULL : X_QUARTER;
        int[] iArr3 = (this == gVar || this == FULL_MOON) ? Y_NEW_FULL : Y_QUARTER;
        int[] iArr4 = (this == gVar || this == FULL_MOON) ? Z_NEW_FULL : Z_QUARTER;
        double d11 = com.google.firebase.remoteconfig.p.f60679p;
        for (int i4 = 23; i4 >= 0; i4--) {
            double d12 = dArr[i4];
            int i5 = iArr[i4];
            if (i5 != 1) {
                if (i5 == 2) {
                    d12 *= d5;
                } else {
                    d11 += d12 * sin((iArr4[i4] * d10) + (iArr3[i4] * d7) + (iArr2[i4] * d6));
                }
            }
            d12 *= d5;
            d11 += d12 * sin((iArr4[i4] * d10) + (iArr3[i4] * d7) + (iArr2[i4] * d6));
        }
        return d11;
    }

    private static double sin(double d5) {
        return Math.sin((d5 * 3.141592653589793d) / 180.0d);
    }

    public d0 after(d0 d0Var) {
        int estimatedLunations = getEstimatedLunations(d0Var);
        d0 atLunation = atLunation(estimatedLunations);
        int i4 = estimatedLunations;
        while (!atLunation.s(d0Var)) {
            i4++;
            atLunation = atLunation(i4);
        }
        if (i4 <= estimatedLunations) {
            while (true) {
                i4--;
                d0 atLunation2 = atLunation(i4);
                if (!atLunation2.s(d0Var)) {
                    break;
                }
                atLunation = atLunation2;
            }
        }
        return atLunation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0 atLunation(int i4) {
        double d5 = (this.phase / 360.0d) + i4;
        double d6 = d5 / 1236.85d;
        double d7 = d6 * d6;
        double d10 = 1.0d - (((7.4E-6d * d6) + 0.002516d) * d6);
        double d11 = ((29.1053567d * d5) + 2.5534d) - (((1.1E-7d * d6) + 1.4E-6d) * d7);
        double d12 = ((((1.238E-5d - (5.8E-8d * d6)) * d6) + 0.0107582d) * d7) + (385.81693528d * d5) + 201.5643d;
        double d13 = (((((1.1E-8d * d6) - 2.27E-6d) * d6) - 0.0016118d) * d7) + (390.67050284d * d5) + 160.7108d;
        double sin = (((((((7.3E-10d * d6) - 1.5E-7d) * d6) + 1.5437E-4d) * d7) + ((MEAN_SYNODIC_MONTH * d5) + 2451550.09766d)) - (Math.sin(Math.toRadians((((2.15E-6d * d6) + 0.0020672d) * d7) + (124.7746d - (1.56375588d * d5)))) * 1.7E-4d)) + periodic24(d10, d11, d12, d13);
        if (this == FIRST_QUARTER) {
            sin += corrQuarter(d10, d11, d12, d13);
        } else if (this == LAST_QUARTER) {
            sin -= corrQuarter(d10, d11, d12, d13);
        }
        double[] dArr = {((0.107408d * d5) + 299.77d) - (d7 * 0.009173d), 3.25E-4d, (0.016321d * d5) + 251.88d, 1.65E-4d, (26.651886d * d5) + 251.83d, 1.64E-4d, (36.412478d * d5) + 349.42d, 1.26E-4d, (18.206239d * d5) + 84.66d, 1.1E-4d, (53.303771d * d5) + 141.74d, 6.2E-5d, (2.453732d * d5) + 207.14d, 6.0E-5d, (7.30686d * d5) + 154.84d, 5.6E-5d, (27.261239d * d5) + 34.52d, 4.7E-5d, (0.121824d * d5) + 207.19d, 4.2E-5d, (1.844379d * d5) + 291.34d, 4.0E-5d, (24.198154d * d5) + 161.72d, 3.7E-5d, (25.513099d * d5) + 239.56d, 3.5E-5d, (d5 * 3.592518d) + 331.55d, 2.3E-5d};
        for (int i5 = 0; i5 < 28; i5 += 2) {
            sin = (Math.sin(Math.toRadians(dArr[i5])) * dArr[i5 + 1]) + sin;
        }
        return (d0) e.j(sin).s().M(d0.f82685w, TimeUnit.SECONDS);
    }

    public d0 atOrAfter(d0 d0Var) {
        int estimatedLunations = getEstimatedLunations(d0Var);
        d0 atLunation = atLunation(estimatedLunations);
        int i4 = estimatedLunations;
        while (atLunation.f(d0Var)) {
            i4++;
            atLunation = atLunation(i4);
        }
        if (i4 <= estimatedLunations) {
            while (true) {
                i4--;
                d0 atLunation2 = atLunation(i4);
                if (atLunation2.f(d0Var)) {
                    break;
                }
                atLunation = atLunation2;
            }
        }
        return atLunation;
    }

    public d0 before(d0 d0Var) {
        int estimatedLunations = getEstimatedLunations(d0Var);
        d0 atLunation = atLunation(estimatedLunations);
        int i4 = estimatedLunations;
        while (!atLunation.f(d0Var)) {
            i4--;
            atLunation = atLunation(i4);
        }
        if (i4 >= estimatedLunations) {
            while (atLunation.W(29L, TimeUnit.DAYS).f(d0Var)) {
                i4++;
                d0 atLunation2 = atLunation(i4);
                if (!atLunation2.f(d0Var)) {
                    break;
                }
                atLunation = atLunation2;
            }
        }
        return atLunation;
    }

    public static double getIllumination(d0 d0Var, int i4) {
        double b5 = e.k(d0Var).b();
        double m4 = h.m(b5);
        double k4 = h.k(b5);
        double j4 = h.j(b5);
        double d5 = m4 * 2.0d;
        double cos = (cos((((((sin(k4) * 2.1d) + ((180.0d - m4) - (sin(j4) * 6.289d))) - (sin(d5 - j4) * 1.274d)) - (sin(d5) * 0.658d)) - (sin(j4 * 2.0d) * 0.214d)) - (sin(m4) * 0.11d)) + 1.0d) / 2.0d;
        double d6 = FACTORS[i4];
        double d7 = cos * d6;
        if (d6 - d7 <= 0.5d) {
            return 1.0d;
        }
        return Math.floor(d7) / d6;
    }
}
