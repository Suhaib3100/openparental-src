package com.tencent.cos.xml.utils;

import java.util.zip.Checksum;

/* loaded from: classes7.dex */
public class CRC64 implements Checksum {
    private static final int GF2_DIM = 64;
    private static final long POLY = -3932672073523589310L;
    private static final long[] table = new long[256];
    private long value;

    static {
        for (int i4 = 0; i4 < 256; i4++) {
            long j4 = i4;
            for (int i5 = 0; i5 < 8; i5++) {
                j4 = (j4 & 1) == 1 ? (j4 >>> 1) ^ POLY : j4 >>> 1;
            }
            table[i4] = j4;
        }
    }

    public CRC64() {
        this.value = 0L;
    }

    public static CRC64 combine(CRC64 crc64, CRC64 crc642, long j4) {
        if (j4 == 0) {
            return new CRC64(crc64.getValue());
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j5 = 1;
        for (int i4 = 1; i4 < 64; i4++) {
            jArr2[i4] = j5;
            j5 <<= 1;
        }
        gf2MatrixSquare(jArr, jArr2);
        gf2MatrixSquare(jArr2, jArr);
        long value = crc64.getValue();
        long value2 = crc642.getValue();
        do {
            gf2MatrixSquare(jArr, jArr2);
            if ((j4 & 1) == 1) {
                value = gf2MatrixTimes(jArr, value);
            }
            long j6 = j4 >>> 1;
            if (j6 == 0) {
                break;
            }
            gf2MatrixSquare(jArr2, jArr);
            if ((j6 & 1) == 1) {
                value = gf2MatrixTimes(jArr2, value);
            }
            j4 >>>= 2;
        } while (j4 != 0);
        return new CRC64(value2 ^ value);
    }

    public static CRC64 fromBytes(byte[] bArr) {
        long j4 = 0;
        for (int i4 = 0; i4 < 4; i4++) {
            j4 = (j4 << 8) ^ (bArr[i4] & 255);
        }
        return new CRC64(j4);
    }

    private static void gf2MatrixSquare(long[] jArr, long[] jArr2) {
        for (int i4 = 0; i4 < 64; i4++) {
            jArr[i4] = gf2MatrixTimes(jArr2, jArr2[i4]);
        }
    }

    private static long gf2MatrixTimes(long[] jArr, long j4) {
        int i4 = 0;
        long j5 = 0;
        while (j4 != 0) {
            if ((j4 & 1) == 1) {
                j5 ^= jArr[i4];
            }
            j4 >>>= 1;
            i4++;
        }
        return j5;
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[8];
        for (int i4 = 0; i4 < 8; i4++) {
            bArr[7 - i4] = (byte) (this.value >>> (i4 * 8));
        }
        return bArr;
    }

    @Override // java.util.zip.Checksum
    public long getValue() {
        return this.value;
    }

    @Override // java.util.zip.Checksum
    public void reset() {
        this.value = 0L;
    }

    public void update(byte[] bArr, int i4) {
        this.value = ~this.value;
        int i5 = 0;
        while (i4 > 0) {
            long[] jArr = table;
            long j4 = this.value;
            this.value = (j4 >>> 8) ^ jArr[((int) (bArr[i5] ^ j4)) & 255];
            i5++;
            i4--;
        }
        this.value = ~this.value;
    }

    public CRC64(long j4) {
        this.value = j4;
    }

    public void update(byte b5) {
        long j4 = ~this.value;
        this.value = j4;
        this.value = ~((j4 >>> 8) ^ table[((int) (b5 ^ j4)) & 255]);
    }

    public CRC64(byte[] bArr, int i4) {
        this.value = 0L;
        update(bArr, i4);
    }

    @Override // java.util.zip.Checksum
    public void update(int i4) {
        update((byte) (i4 & 255));
    }

    @Override // java.util.zip.Checksum
    public void update(byte[] bArr, int i4, int i5) {
        while (i5 > 0) {
            update(bArr[i4]);
            i5--;
            i4++;
        }
    }

    public static long combine(long j4, long j5, long j6) {
        if (j6 == 0) {
            return j4;
        }
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        jArr2[0] = -3932672073523589310L;
        long j7 = 1;
        for (int i4 = 1; i4 < 64; i4++) {
            jArr2[i4] = j7;
            j7 <<= 1;
        }
        gf2MatrixSquare(jArr, jArr2);
        gf2MatrixSquare(jArr2, jArr);
        long j10 = j4;
        long j11 = j6;
        do {
            gf2MatrixSquare(jArr, jArr2);
            if ((j11 & 1) == 1) {
                j10 = gf2MatrixTimes(jArr, j10);
            }
            long j12 = j11 >>> 1;
            if (j12 == 0) {
                break;
            }
            gf2MatrixSquare(jArr2, jArr);
            if ((j12 & 1) == 1) {
                j10 = gf2MatrixTimes(jArr2, j10);
            }
            j11 >>>= 2;
        } while (j11 != 0);
        return j10 ^ j5;
    }
}
