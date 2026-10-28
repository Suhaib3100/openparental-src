package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;

/* compiled from: Fingerprint2011.java */
@k
/* loaded from: classes6.dex */
final class m extends e {

    /* renamed from: b, reason: collision with root package name */
    static final q f57016b = new m();

    /* renamed from: c, reason: collision with root package name */
    private static final long f57017c = -6505348102511208375L;

    /* renamed from: d, reason: collision with root package name */
    private static final long f57018d = -8261664234251669945L;

    /* renamed from: e, reason: collision with root package name */
    private static final long f57019e = -4288712594273399085L;

    /* renamed from: f, reason: collision with root package name */
    private static final long f57020f = -4132994306676758123L;

    m() {
    }

    @d9.d
    static long l(byte[] bArr, int i4, int i5) {
        long p4 = i5 <= 32 ? p(bArr, i4, i5, -1397348546323613475L) : i5 <= 64 ? o(bArr, i4, i5) : m(bArr, i4, i5);
        long j4 = f57017c;
        long b5 = i5 >= 8 ? x.b(bArr, i4) : -6505348102511208375L;
        if (i5 >= 9) {
            j4 = x.b(bArr, (i4 + i5) - 8);
        }
        long n4 = n(p4 + j4, b5);
        return (n4 == 0 || n4 == 1) ? n4 - 2 : n4;
    }

    private static long m(byte[] bArr, int i4, int i5) {
        long b5 = x.b(bArr, i4);
        int i6 = i4 + i5;
        long b6 = x.b(bArr, i6 - 16) ^ f57018d;
        long b7 = x.b(bArr, i6 - 56) ^ f57017c;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long j4 = i5;
        r(bArr, i6 - 64, j4, b6, jArr);
        r(bArr, i6 - 32, j4 * f57018d, f57017c, jArr2);
        long q4 = (q(jArr[1]) * f57018d) + b7;
        long rotateRight = Long.rotateRight(b5 + q4, 39) * f57018d;
        long rotateRight2 = Long.rotateRight(b6, 33) * f57018d;
        int i7 = i4;
        int i10 = (i5 - 1) & (-64);
        while (true) {
            long rotateRight3 = Long.rotateRight(rotateRight + rotateRight2 + jArr[0] + x.b(bArr, i7 + 16), 37) * f57018d;
            long rotateRight4 = Long.rotateRight(rotateRight2 + jArr[1] + x.b(bArr, i7 + 48), 42) * f57018d;
            long j5 = jArr2[1] ^ rotateRight3;
            long j6 = rotateRight4 ^ jArr[0];
            long rotateRight5 = Long.rotateRight(q4 ^ jArr2[0], 33);
            r(bArr, i7, jArr[1] * f57018d, j5 + jArr2[0], jArr);
            r(bArr, i7 + 32, rotateRight5 + jArr2[1], j6, jArr2);
            i7 += 64;
            i10 -= 64;
            if (i10 == 0) {
                return n((q(j6) * f57018d) + n(jArr[0], jArr2[0]) + j5, n(jArr[1], jArr2[1]) + rotateRight5);
            }
            q4 = j5;
            rotateRight2 = j6;
            rotateRight = rotateRight5;
        }
    }

    @d9.d
    static long n(long j4, long j5) {
        long j6 = (j5 ^ j4) * f57020f;
        long j7 = (j4 ^ (j6 ^ (j6 >>> 47))) * f57020f;
        return (j7 ^ (j7 >>> 47)) * f57020f;
    }

    private static long o(byte[] bArr, int i4, int i5) {
        long b5 = x.b(bArr, i4 + 24);
        int i6 = i4 + i5;
        int i7 = i6 - 16;
        long b6 = ((i5 + x.b(bArr, i7)) * f57017c) + x.b(bArr, i4);
        long rotateRight = Long.rotateRight(b6 + b5, 52);
        long rotateRight2 = Long.rotateRight(b6, 37);
        long b7 = b6 + x.b(bArr, i4 + 8);
        long rotateRight3 = Long.rotateRight(b7, 7) + rotateRight2;
        int i10 = i4 + 16;
        long b10 = b7 + x.b(bArr, i10);
        long j4 = b5 + b10;
        long rotateRight4 = Long.rotateRight(b10, 31) + rotateRight + rotateRight3;
        long b11 = x.b(bArr, i10) + x.b(bArr, i6 - 32);
        long b12 = x.b(bArr, i6 - 8);
        long rotateRight5 = Long.rotateRight(b11 + b12, 52);
        long rotateRight6 = Long.rotateRight(b11, 37);
        long b13 = b11 + x.b(bArr, i6 - 24);
        long rotateRight7 = Long.rotateRight(b13, 7) + rotateRight6;
        long b14 = b13 + x.b(bArr, i7);
        return q((q(((b14 + b12 + rotateRight4) * f57017c) + ((Long.rotateRight(b14, 31) + rotateRight5 + rotateRight7 + j4) * f57019e)) * f57017c) + rotateRight4) * f57019e;
    }

    @d9.d
    static long p(byte[] bArr, int i4, int i5, long j4) {
        int i6 = i5 & (-8);
        int i7 = i5 & 7;
        long j5 = j4 ^ (i5 * f57020f);
        for (int i10 = 0; i10 < i6; i10 += 8) {
            j5 = (j5 ^ (q(x.b(bArr, i4 + i10) * f57020f) * f57020f)) * f57020f;
        }
        if (i7 != 0) {
            j5 = (x.c(bArr, i4 + i6, i7) ^ j5) * f57020f;
        }
        return q(q(j5) * f57020f);
    }

    private static long q(long j4) {
        return j4 ^ (j4 >>> 47);
    }

    private static void r(byte[] bArr, int i4, long j4, long j5, long[] jArr) {
        long b5 = x.b(bArr, i4);
        long b6 = x.b(bArr, i4 + 8);
        long b7 = x.b(bArr, i4 + 16);
        long b10 = x.b(bArr, i4 + 24);
        long j6 = j4 + b5;
        long j7 = b6 + j6 + b7;
        long rotateRight = Long.rotateRight(j7, 23) + Long.rotateRight(j5 + j6 + b10, 51);
        jArr[0] = j7 + b10;
        jArr[1] = rotateRight + j6;
    }

    @Override // com.google.common.hash.q
    public int c() {
        return 64;
    }

    @Override // com.google.common.hash.e, com.google.common.hash.c, com.google.common.hash.q
    public p k(byte[] bArr, int i4, int i5) {
        l0.f0(i4, i4 + i5, bArr.length);
        return p.j(l(bArr, i4, i5));
    }

    public String toString() {
        return ProtectedSandApp.s("\uf618");
    }
}
