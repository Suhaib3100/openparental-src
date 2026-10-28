package com.googlecode.mp4parser.util;

/* compiled from: Math.java */
/* loaded from: classes6.dex */
public class j {
    public static int a(int i4, int i5) {
        while (true) {
            int i6 = i5;
            int i7 = i4;
            i4 = i6;
            if (i4 <= 0) {
                return i7;
            }
            i5 = i7 % i4;
        }
    }

    public static long b(long j4, long j5) {
        while (true) {
            long j6 = j4;
            j4 = j5;
            if (j4 <= 0) {
                return j6;
            }
            j5 = j6 % j4;
        }
    }

    public static int c(int i4, int i5) {
        return (i5 / a(i4, i5)) * i4;
    }

    public static long d(long j4, long j5) {
        return (j5 / b(j4, j5)) * j4;
    }

    public static long e(long[] jArr) {
        long j4 = jArr[0];
        for (int i4 = 1; i4 < jArr.length; i4++) {
            j4 = d(j4, jArr[i4]);
        }
        return j4;
    }
}
