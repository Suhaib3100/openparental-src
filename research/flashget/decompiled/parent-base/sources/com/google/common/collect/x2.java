package com.google.common.collect;

/* compiled from: Hashing.java */
@w0
@d9.b
/* loaded from: classes6.dex */
final class x2 {

    /* renamed from: a, reason: collision with root package name */
    private static final long f56629a = -862048943;

    /* renamed from: b, reason: collision with root package name */
    private static final long f56630b = 461845907;

    /* renamed from: c, reason: collision with root package name */
    private static final int f56631c = 1073741824;

    private x2() {
    }

    static int a(int i4, double d5) {
        int max = Math.max(i4, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max <= ((int) (d5 * highestOneBit))) {
            return highestOneBit;
        }
        int i5 = highestOneBit << 1;
        if (i5 > 0) {
            return i5;
        }
        return 1073741824;
    }

    static boolean b(int i4, int i5, double d5) {
        return ((double) i4) > d5 * ((double) i5) && i5 < 1073741824;
    }

    static int c(int i4) {
        return (int) (Integer.rotateLeft((int) (i4 * f56629a), 15) * f56630b);
    }

    static int d(@zc.a Object obj) {
        return c(obj == null ? 0 : obj.hashCode());
    }
}
