package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import java.lang.Comparable;
import java.lang.Number;
import java.math.RoundingMode;

/* compiled from: ToDoubleRounder.java */
@e
@d9.c
/* loaded from: classes6.dex */
abstract class p<X extends Number & Comparable<X>> {

    /* compiled from: ToDoubleRounder.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f57253a;

        static {
            int[] iArr = new int[RoundingMode.values().length];
            f57253a = iArr;
            try {
                iArr[RoundingMode.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57253a[RoundingMode.HALF_EVEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f57253a[RoundingMode.HALF_DOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57253a[RoundingMode.HALF_UP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57253a[RoundingMode.FLOOR.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f57253a[RoundingMode.CEILING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f57253a[RoundingMode.UP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f57253a[RoundingMode.UNNECESSARY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    p() {
    }

    abstract X a(X x4, X x5);

    final double b(X x4, RoundingMode roundingMode) {
        X x5;
        double d5;
        l0.F(x4, ProtectedSandApp.s("\uf6db"));
        l0.F(roundingMode, ProtectedSandApp.s("\uf6dc"));
        double c5 = c(x4);
        if (Double.isInfinite(c5)) {
            switch (a.f57253a[roundingMode.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    return d(x4) * Double.MAX_VALUE;
                case 5:
                    return c5 == Double.POSITIVE_INFINITY ? Double.MAX_VALUE : Double.NEGATIVE_INFINITY;
                case 6:
                    return c5 == Double.POSITIVE_INFINITY ? Double.POSITIVE_INFINITY : -1.7976931348623157E308d;
                case 7:
                    return c5;
                case 8:
                    String valueOf = String.valueOf(x4);
                    throw new ArithmeticException(com.google.common.base.i.a(valueOf.length() + 44, valueOf, ProtectedSandApp.s("\uf6dd")));
            }
        }
        X e4 = e(c5, RoundingMode.UNNECESSARY);
        int compareTo = ((Comparable) x4).compareTo(e4);
        int[] iArr = a.f57253a;
        int i4 = iArr[roundingMode.ordinal()];
        String s4 = ProtectedSandApp.s("\uf6de");
        switch (i4) {
            case 1:
                return d(x4) >= 0 ? compareTo >= 0 ? c5 : -Math.nextUp(-c5) : compareTo <= 0 ? c5 : Math.nextUp(c5);
            case 2:
            case 3:
            case 4:
                if (compareTo >= 0) {
                    d5 = Math.nextUp(c5);
                    if (d5 == Double.POSITIVE_INFINITY) {
                        return c5;
                    }
                    x5 = e(d5, RoundingMode.CEILING);
                } else {
                    double d6 = -Math.nextUp(-c5);
                    if (d6 == Double.NEGATIVE_INFINITY) {
                        return c5;
                    }
                    X e5 = e(d6, RoundingMode.FLOOR);
                    x5 = e4;
                    e4 = e5;
                    d5 = c5;
                    c5 = d6;
                }
                int compareTo2 = ((Comparable) a(x4, e4)).compareTo(a(x5, x4));
                if (compareTo2 < 0) {
                    return c5;
                }
                if (compareTo2 > 0) {
                    return d5;
                }
                int i5 = iArr[roundingMode.ordinal()];
                if (i5 == 2) {
                    return (Double.doubleToRawLongBits(c5) & 1) == 0 ? c5 : d5;
                }
                if (i5 == 3) {
                    return d(x4) >= 0 ? c5 : d5;
                }
                if (i5 == 4) {
                    return d(x4) >= 0 ? d5 : c5;
                }
                throw new AssertionError(s4);
            case 5:
                return compareTo >= 0 ? c5 : -Math.nextUp(-c5);
            case 6:
                return compareTo <= 0 ? c5 : Math.nextUp(c5);
            case 7:
                return d(x4) >= 0 ? compareTo <= 0 ? c5 : Math.nextUp(c5) : compareTo >= 0 ? c5 : -Math.nextUp(-c5);
            case 8:
                i.k(compareTo == 0);
                return c5;
            default:
                throw new AssertionError(s4);
        }
    }

    abstract double c(X x4);

    abstract int d(X x4);

    abstract X e(double d5, RoundingMode roundingMode);
}
