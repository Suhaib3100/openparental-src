package androidx.compose.animation.core;

import kotlin.Metadata;

/* compiled from: SpringEstimation.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a5\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a5\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000b\u001a=\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010\u001a/\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a/\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0016\u001a7\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001a\u001a?\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001d\u001a@\u0010\"\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\t2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001f2\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\u001fH\u0082\b¢\u0006\u0004\b\"\u0010#\u001a\u0014\u0010%\u001a\u00020$*\u00020\tH\u0082\b¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"", "stiffness", "dampingRatio", "initialVelocity", "initialDisplacement", "delta", "", "c", "(FFFFF)J", "", "a", "(DDDDD)J", "springConstant", "dampingCoefficient", "mass", "b", "(DDDDDD)J", "Landroidx/compose/animation/core/v;", "firstRoot", "p0", "v0", "h", "(Landroidx/compose/animation/core/v;DDD)D", "d", "secondRoot", "f", "(Landroidx/compose/animation/core/v;Landroidx/compose/animation/core/v;DDD)D", "initialPosition", "e", "(Landroidx/compose/animation/core/v;Landroidx/compose/animation/core/v;DDDD)J", "x", "Lkotlin/Function1;", "fn", "fnPrime", "j", "(DLld/l;Lld/l;)D", "", "i", "(D)Z", "animation-core_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
@kotlin.jvm.internal.r1({"SMAP\nSpringEstimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n+ 2 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDoubleKt\n+ 3 ComplexDouble.kt\nandroidx/compose/animation/core/ComplexDouble\n*L\n1#1,329:1\n328#1:362\n328#1:363\n324#1:364\n328#1:365\n328#1:366\n324#1:367\n103#2:330\n107#2:336\n103#2:340\n103#2:346\n107#2:352\n103#2:356\n35#3,2:331\n54#3,3:333\n66#3,3:337\n35#3,2:341\n54#3,3:343\n35#3,2:347\n54#3,3:349\n66#3,3:353\n35#3,2:357\n54#3,3:359\n*S KotlinDebug\n*F\n+ 1 SpringEstimation.kt\nandroidx/compose/animation/core/SpringEstimationKt\n*L\n149#1:362\n150#1:363\n188#1:364\n221#1:365\n222#1:366\n266#1:367\n59#1:330\n60#1:336\n60#1:340\n90#1:346\n91#1:352\n91#1:356\n59#1:331,2\n59#1:333,3\n60#1:337,3\n60#1:341,2\n60#1:343,3\n90#1:347,2\n90#1:349,3\n91#1:353,3\n91#1:357,2\n91#1:359,3\n*E\n"})
/* loaded from: classes.dex */
public final class v1 {
    public static final long a(double d5, double d6, double d7, double d10, double d11) {
        double d12;
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double sqrt = Math.sqrt(d5) * 2.0d * d6;
        double d20 = (sqrt * sqrt) - (4.0d * d5);
        double d21 = -sqrt;
        v b5 = w.b(d20);
        d12 = b5._real;
        b5._real = d12 + d21;
        d13 = b5._real;
        b5._real = d13 * 0.5d;
        d14 = b5._imaginary;
        b5._imaginary = d14 * 0.5d;
        v b6 = w.b(d20);
        d15 = b6._real;
        double d22 = -1;
        b6._real = d15 * d22;
        d16 = b6._imaginary;
        b6._imaginary = d16 * d22;
        d17 = b6._real;
        b6._real = d17 + d21;
        d18 = b6._real;
        b6._real = d18 * 0.5d;
        d19 = b6._imaginary;
        b6._imaginary = d19 * 0.5d;
        return e(b5, b6, d6, d7, d10, d11);
    }

    public static final long b(double d5, double d6, double d7, double d10, double d11, double d12) {
        double d13;
        double d14;
        double d15;
        double d16;
        double d17;
        double d18;
        double d19;
        double d20;
        double sqrt = d6 / (Math.sqrt(d5 * d7) * 2.0d);
        double d21 = (d6 * d6) - ((4.0d * d7) * d5);
        double d22 = 1.0d / (2.0d * d7);
        double d23 = -d6;
        v b5 = w.b(d21);
        d13 = b5._real;
        b5._real = d13 + d23;
        d14 = b5._real;
        b5._real = d14 * d22;
        d15 = b5._imaginary;
        b5._imaginary = d15 * d22;
        v b6 = w.b(d21);
        d16 = b6._real;
        double d24 = -1;
        b6._real = d16 * d24;
        d17 = b6._imaginary;
        b6._imaginary = d17 * d24;
        d18 = b6._real;
        b6._real = d18 + d23;
        d19 = b6._real;
        b6._real = d19 * d22;
        d20 = b6._imaginary;
        b6._imaginary = d20 * d22;
        return e(b5, b6, sqrt, d10, d11, d12);
    }

    public static final long c(float f4, float f5, float f6, float f7, float f10) {
        return a(f4, f5, f6, f7, f10);
    }

    private static final double d(v vVar, double d5, double d6, double d7) {
        double d10;
        int i4;
        double d11 = d7;
        double k4 = vVar.k();
        double d12 = k4 * d5;
        double d13 = d6 - d12;
        double log = Math.log(Math.abs(d11 / d5)) / k4;
        double log2 = Math.log(Math.abs(d11 / d13));
        double d14 = log2;
        for (int i5 = 0; i5 < 6; i5++) {
            d14 = log2 - Math.log(Math.abs(d14 / k4));
        }
        double d15 = d14 / k4;
        if (!((Double.isInfinite(log) || Double.isNaN(log)) ? false : true)) {
            log = d15;
        } else if ((Double.isInfinite(d15) || Double.isNaN(d15)) ? false : true) {
            log = Math.max(log, d15);
        }
        double d16 = (-(d12 + d13)) / (k4 * d13);
        double d17 = k4 * d16;
        double exp = (Math.exp(d17) * d13 * d16) + (Math.exp(d17) * d5);
        if (!Double.isNaN(d16) && d16 > com.google.firebase.remoteconfig.p.f60679p) {
            if (d16 <= com.google.firebase.remoteconfig.p.f60679p || (-exp) >= d11) {
                log = (-(2.0d / k4)) - (d5 / d13);
                d10 = Double.MAX_VALUE;
                i4 = 0;
                while (d10 > 0.001d && i4 < 100) {
                    i4++;
                    double d18 = k4 * log;
                    double exp2 = log - (((Math.exp(d18) * ((d13 * log) + d5)) + d11) / (Math.exp(d18) * (((1 + d18) * d13) + d12)));
                    double abs = Math.abs(log - exp2);
                    log = exp2;
                    d10 = abs;
                }
                return log;
            }
            if (d13 < com.google.firebase.remoteconfig.p.f60679p && d5 > com.google.firebase.remoteconfig.p.f60679p) {
                log = 0.0d;
            }
        }
        d11 = -d11;
        d10 = Double.MAX_VALUE;
        i4 = 0;
        while (d10 > 0.001d) {
            i4++;
            double d182 = k4 * log;
            double exp22 = log - (((Math.exp(d182) * ((d13 * log) + d5)) + d11) / (Math.exp(d182) * (((1 + d182) * d13) + d12)));
            double abs2 = Math.abs(log - exp22);
            log = exp22;
            d10 = abs2;
        }
        return log;
    }

    private static final long e(v vVar, v vVar2, double d5, double d6, double d7, double d10) {
        double d11 = d6;
        if (d7 == com.google.firebase.remoteconfig.p.f60679p && d11 == com.google.firebase.remoteconfig.p.f60679p) {
            return 0L;
        }
        if (d7 < com.google.firebase.remoteconfig.p.f60679p) {
            d11 = -d11;
        }
        double abs = Math.abs(d7);
        return (long) ((d5 > 1.0d ? f(vVar, vVar2, abs, d11, d10) : d5 < 1.0d ? h(vVar, abs, d11, d10) : d(vVar, abs, d11, d10)) * 1000.0d);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00c6 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final double f(androidx.compose.animation.core.v r29, androidx.compose.animation.core.v r30, double r31, double r33, double r35) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.v1.f(androidx.compose.animation.core.v, androidx.compose.animation.core.v, double, double, double):double");
    }

    private static final double g(double d5, double d6, double d7, double d10, double d11) {
        return (Math.exp(d11 * d7) * d10) + (Math.exp(d6 * d7) * d5);
    }

    private static final double h(v vVar, double d5, double d6, double d7) {
        double k4 = vVar.k();
        double j4 = (d6 - (k4 * d5)) / vVar.j();
        return Math.log(d7 / Math.sqrt((j4 * j4) + (d5 * d5))) / k4;
    }

    private static final boolean i(double d5) {
        return !((Double.isInfinite(d5) || Double.isNaN(d5)) ? false : true);
    }

    private static final double j(double d5, ld.l<? super Double, Double> lVar, ld.l<? super Double, Double> lVar2) {
        return d5 - (lVar.invoke(Double.valueOf(d5)).doubleValue() / lVar2.invoke(Double.valueOf(d5)).doubleValue());
    }
}
