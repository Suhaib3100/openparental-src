package com.tencent.cos.xml.utils;

import androidx.compose.runtime.snapshots.f0;
import androidx.compose.ui.input.pointer.s;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes7.dex */
public class CRC64Calculator {
    private static final int GF2_DIM = 64;
    private static final long INIT = -1;
    private static final long POLY = -3932672073523589310L;

    public static long combine(long j4, long j5, long j6) {
        if (j6 == 0) {
            return j4;
        }
        long j7 = ~(~j4);
        long j10 = ~j5;
        long[] jArr = new long[64];
        long[] jArr2 = new long[64];
        long[] jArr3 = new long[64];
        jArr[0] = -3932672073523589310L;
        long j11 = 1;
        for (int i4 = 1; i4 < 64; i4++) {
            jArr[i4] = j11;
            j11 <<= 1;
        }
        gf2MatrixSquare(jArr2, jArr);
        gf2MatrixSquare(jArr3, jArr2);
        long j12 = j7;
        long j13 = j6;
        do {
            gf2MatrixSquare(jArr2, jArr3);
            if ((j13 & 1) != 0) {
                j12 = gf2MatrixTimes(jArr2, j12);
            }
            long j14 = j13 >>> 1;
            if (j14 == 0) {
                break;
            }
            gf2MatrixSquare(jArr3, jArr2);
            if ((j14 & 1) != 0) {
                j12 = gf2MatrixTimes(jArr3, j12);
            }
            j13 >>>= 2;
        } while (j13 != 0);
        return ~(j12 ^ j10);
    }

    public static long getCRC64(InputStream inputStream, long j4, long j5) throws IOException {
        int read;
        long j6 = j4;
        while (true) {
            long j7 = 0;
            if (j6 <= 0) {
                CRC64 crc64 = new CRC64();
                byte[] bArr = new byte[8192];
                while (j7 < j5 && (read = inputStream.read(bArr, 0, (int) Math.min(j5 - j7, 8192))) != -1) {
                    crc64.update(bArr, 0, read);
                    j7 += read;
                }
                if (j7 == j5) {
                    return crc64.getValue();
                }
                StringBuilder a5 = f0.a(ProtectedSandApp.s("僠\u0001"), j5, ProtectedSandApp.s("僡\u0001"));
                a5.append(j7);
                throw new IOException(a5.toString());
            }
            long skip = inputStream.skip(j6);
            if (skip <= 0) {
                throw new IOException(s.a(ProtectedSandApp.s("僞\u0001"), j4, ProtectedSandApp.s("僟\u0001")));
            }
            j6 -= skip;
        }
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
            if ((1 & j4) != 0) {
                j5 ^= jArr[i4];
            }
            j4 >>>= 1;
            i4++;
        }
        return j5;
    }
}
