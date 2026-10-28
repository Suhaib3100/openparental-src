package org.apache.commons.lang3;

import java.util.Random;

/* compiled from: RandomUtils.java */
/* loaded from: classes6.dex */
public class r0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Random f86077a = new Random();

    public static boolean a() {
        return f86077a.nextBoolean();
    }

    public static byte[] b(int i4) {
        k1.B(i4 >= 0, "Count cannot be negative.", new Object[0]);
        byte[] bArr = new byte[i4];
        f86077a.nextBytes(bArr);
        return bArr;
    }

    public static double c() {
        return d(com.google.firebase.remoteconfig.p.f60679p, Double.MAX_VALUE);
    }

    public static double d(double d5, double d6) {
        k1.B(d6 >= d5, "Start value must be smaller or equal to end value.", new Object[0]);
        k1.B(d5 >= com.google.firebase.remoteconfig.p.f60679p, "Both range values must be non-negative.", new Object[0]);
        if (d5 == d6) {
            return d5;
        }
        return (f86077a.nextDouble() * (d6 - d5)) + d5;
    }

    public static float e() {
        return f(0.0f, Float.MAX_VALUE);
    }

    public static float f(float f4, float f5) {
        k1.B(f5 >= f4, "Start value must be smaller or equal to end value.", new Object[0]);
        k1.B(f4 >= 0.0f, "Both range values must be non-negative.", new Object[0]);
        if (f4 == f5) {
            return f4;
        }
        return (f86077a.nextFloat() * (f5 - f4)) + f4;
    }

    public static int g() {
        return h(0, Integer.MAX_VALUE);
    }

    public static int h(int i4, int i5) {
        k1.B(i5 >= i4, "Start value must be smaller or equal to end value.", new Object[0]);
        k1.B(i4 >= 0, "Both range values must be non-negative.", new Object[0]);
        return i4 == i5 ? i4 : f86077a.nextInt(i5 - i4) + i4;
    }

    public static long i() {
        return j(0L, Long.MAX_VALUE);
    }

    public static long j(long j4, long j5) {
        k1.B(j5 >= j4, "Start value must be smaller or equal to end value.", new Object[0]);
        k1.B(j4 >= 0, "Both range values must be non-negative.", new Object[0]);
        return j4 == j5 ? j4 : (long) d(j4, j5);
    }
}
