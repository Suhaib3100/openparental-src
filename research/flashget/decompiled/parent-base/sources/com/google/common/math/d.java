package com.google.common.math;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;
import com.tencent.rtmp.TXLiveConstants;
import java.math.BigInteger;

/* compiled from: DoubleUtils.java */
@e
@d9.c
/* loaded from: classes6.dex */
final class d {

    /* renamed from: a, reason: collision with root package name */
    static final long f57192a = 4503599627370495L;

    /* renamed from: b, reason: collision with root package name */
    static final long f57193b = 9218868437227405312L;

    /* renamed from: c, reason: collision with root package name */
    static final long f57194c = Long.MIN_VALUE;

    /* renamed from: d, reason: collision with root package name */
    static final int f57195d = 52;

    /* renamed from: e, reason: collision with root package name */
    static final int f57196e = 1023;

    /* renamed from: f, reason: collision with root package name */
    static final long f57197f = 4503599627370496L;

    /* renamed from: g, reason: collision with root package name */
    @d9.d
    static final long f57198g = 4607182418800017408L;

    private d() {
    }

    static double a(BigInteger bigInteger) {
        BigInteger abs = bigInteger.abs();
        int bitLength = abs.bitLength();
        int i4 = bitLength - 1;
        if (i4 < 63) {
            return bigInteger.longValue();
        }
        if (i4 > f57196e) {
            return bigInteger.signum() * Double.POSITIVE_INFINITY;
        }
        int i5 = bitLength - 54;
        long longValue = abs.shiftRight(i5).longValue();
        long j4 = longValue >> 1;
        long j5 = f57192a & j4;
        if ((longValue & 1) != 0 && ((j4 & 1) != 0 || abs.getLowestSetBit() < i5)) {
            j5++;
        }
        return Double.longBitsToDouble((((bitLength + TXLiveConstants.PUSH_EVT_ROOM_IN_FAILED) << 52) + j5) | (bigInteger.signum() & Long.MIN_VALUE));
    }

    static double b(double d5) {
        l0.d(!Double.isNaN(d5));
        return Math.max(d5, com.google.firebase.remoteconfig.p.f60679p);
    }

    static long c(double d5) {
        l0.e(d(d5), ProtectedSandApp.s("\uf6e9"));
        int exponent = Math.getExponent(d5);
        long doubleToRawLongBits = Double.doubleToRawLongBits(d5) & f57192a;
        return exponent == -1023 ? doubleToRawLongBits << 1 : doubleToRawLongBits | f57197f;
    }

    static boolean d(double d5) {
        return Math.getExponent(d5) <= f57196e;
    }

    static boolean e(double d5) {
        return Math.getExponent(d5) >= -1022;
    }

    static double f(double d5) {
        return -Math.nextUp(-d5);
    }

    static double g(double d5) {
        return Double.longBitsToDouble((Double.doubleToRawLongBits(d5) & f57192a) | f57198g);
    }
}
