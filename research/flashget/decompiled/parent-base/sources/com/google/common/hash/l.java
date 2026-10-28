package com.google.common.hash;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.l0;

/* compiled from: FarmHashFingerprint64.java */
@k
/* loaded from: classes6.dex */
final class l extends e {

    /* renamed from: b, reason: collision with root package name */
    static final q f57012b = new l();

    /* renamed from: c, reason: collision with root package name */
    private static final long f57013c = -4348849565147123417L;

    /* renamed from: d, reason: collision with root package name */
    private static final long f57014d = -5435081209227447693L;

    /* renamed from: e, reason: collision with root package name */
    private static final long f57015e = -7286425919675154353L;

    l() {
    }

    @d9.d
    static long l(byte[] bArr, int i4, int i5) {
        return i5 <= 32 ? i5 <= 16 ? m(bArr, i4, i5) : o(bArr, i4, i5) : i5 <= 64 ? p(bArr, i4, i5) : q(bArr, i4, i5);
    }

    private static long m(byte[] bArr, int i4, int i5) {
        if (i5 >= 8) {
            long j4 = (i5 * 2) + f57015e;
            long b5 = x.b(bArr, i4) + f57015e;
            long b6 = x.b(bArr, (i4 + i5) - 8);
            return n((Long.rotateRight(b6, 37) * j4) + b5, (Long.rotateRight(b5, 25) + b6) * j4, j4);
        }
        if (i5 >= 4) {
            return n(i5 + ((x.a(bArr, i4) & 4294967295L) << 3), x.a(bArr, (i4 + i5) - 4) & 4294967295L, (i5 * 2) + f57015e);
        }
        if (i5 <= 0) {
            return f57015e;
        }
        return r((((bArr[i4] & 255) + ((bArr[(i5 >> 1) + i4] & 255) << 8)) * f57015e) ^ ((i5 + ((bArr[(i5 - 1) + i4] & 255) << 2)) * f57013c)) * f57015e;
    }

    private static long n(long j4, long j5, long j6) {
        long j7 = (j4 ^ j5) * j6;
        long j10 = ((j7 ^ (j7 >>> 47)) ^ j5) * j6;
        return (j10 ^ (j10 >>> 47)) * j6;
    }

    private static long o(byte[] bArr, int i4, int i5) {
        long j4 = (i5 * 2) + f57015e;
        long b5 = x.b(bArr, i4) * f57014d;
        long b6 = x.b(bArr, i4 + 8);
        int i6 = i4 + i5;
        long b7 = x.b(bArr, i6 - 8) * j4;
        return n((x.b(bArr, i6 - 16) * f57015e) + Long.rotateRight(b7, 30) + Long.rotateRight(b5 + b6, 43), Long.rotateRight(b6 + f57015e, 18) + b5 + b7, j4);
    }

    private static long p(byte[] bArr, int i4, int i5) {
        long j4 = (i5 * 2) + f57015e;
        long b5 = x.b(bArr, i4) * f57015e;
        long b6 = x.b(bArr, i4 + 8);
        int i6 = i4 + i5;
        long b7 = x.b(bArr, i6 - 8) * j4;
        long rotateRight = Long.rotateRight(b7, 30) + Long.rotateRight(b5 + b6, 43) + (x.b(bArr, i6 - 16) * f57015e);
        long n4 = n(rotateRight, b7 + Long.rotateRight(b6 + f57015e, 18) + b5, j4);
        long b10 = x.b(bArr, i4 + 16) * j4;
        long b11 = x.b(bArr, i4 + 24);
        long b12 = (rotateRight + x.b(bArr, i6 - 32)) * j4;
        return n(((n4 + x.b(bArr, i6 - 24)) * j4) + Long.rotateRight(b12, 30) + Long.rotateRight(b10 + b11, 43), Long.rotateRight(b11 + b5, 18) + b10 + b12, j4);
    }

    private static long q(byte[] bArr, int i4, int i5) {
        long j4 = 81;
        long j5 = (j4 * f57014d) + 113;
        long r4 = r((j5 * f57015e) + 113) * f57015e;
        long[] jArr = new long[2];
        long[] jArr2 = new long[2];
        long b5 = (j4 * f57015e) + x.b(bArr, i4);
        int i6 = i5 - 1;
        int i7 = ((i6 / 64) * 64) + i4;
        int i10 = i6 & 63;
        int i11 = i7 + i10;
        int i12 = i11 - 63;
        int i13 = i4;
        while (true) {
            long rotateRight = Long.rotateRight(b5 + j5 + jArr[0] + x.b(bArr, i13 + 8), 37) * f57014d;
            long rotateRight2 = Long.rotateRight(j5 + jArr[1] + x.b(bArr, i13 + 48), 42) * f57014d;
            long j6 = rotateRight ^ jArr2[1];
            long b6 = jArr[0] + x.b(bArr, i13 + 40) + rotateRight2;
            long rotateRight3 = Long.rotateRight(r4 + jArr2[0], 33) * f57014d;
            s(bArr, i13, jArr[1] * f57014d, j6 + jArr2[0], jArr);
            s(bArr, i13 + 32, rotateRight3 + jArr2[1], b6 + x.b(bArr, i13 + 16), jArr2);
            int i14 = i13 + 64;
            if (i14 == i7) {
                long j7 = f57014d + ((j6 & 255) << 1);
                long j10 = jArr2[0] + i10;
                jArr2[0] = j10;
                long j11 = jArr[0] + j10;
                jArr[0] = j11;
                jArr2[0] = jArr2[0] + j11;
                long rotateRight4 = Long.rotateRight(rotateRight3 + b6 + jArr[0] + x.b(bArr, i11 - 55), 37) * j7;
                long rotateRight5 = Long.rotateRight(b6 + jArr[1] + x.b(bArr, i11 - 15), 42) * j7;
                long j12 = rotateRight4 ^ (jArr2[1] * 9);
                long b7 = (jArr[0] * 9) + x.b(bArr, i11 - 23) + rotateRight5;
                long rotateRight6 = Long.rotateRight(j6 + jArr2[0], 33) * j7;
                s(bArr, i12, jArr[1] * j7, j12 + jArr2[0], jArr);
                s(bArr, i11 - 31, rotateRight6 + jArr2[1], b7 + x.b(bArr, i11 - 47), jArr2);
                return n((r(b7) * f57013c) + n(jArr[0], jArr2[0], j7) + j12, n(jArr[1], jArr2[1], j7) + rotateRight6, j7);
            }
            i13 = i14;
            r4 = j6;
            j5 = b6;
            b5 = rotateRight3;
        }
    }

    private static long r(long j4) {
        return j4 ^ (j4 >>> 47);
    }

    private static void s(byte[] bArr, int i4, long j4, long j5, long[] jArr) {
        long b5 = x.b(bArr, i4);
        long b6 = x.b(bArr, i4 + 8);
        long b7 = x.b(bArr, i4 + 16);
        long b10 = x.b(bArr, i4 + 24);
        long j6 = j4 + b5;
        long j7 = b6 + j6 + b7;
        long rotateRight = Long.rotateRight(j7, 44) + Long.rotateRight(j5 + j6 + b10, 21);
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
        return ProtectedSandApp.s("\uf617");
    }
}
