package org.apache.commons.io;

import androidx.collection.s;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: HexDump.java */
/* loaded from: classes4.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public static final String f85542a = System.getProperty("line.separator");

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f85543b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f85544c = {28, 24, 20, 16, 12, 8, 4, 0};

    private static StringBuilder a(StringBuilder sb, byte b5) {
        for (int i4 = 0; i4 < 2; i4++) {
            sb.append(f85543b[(b5 >> f85544c[i4 + 6]) & 15]);
        }
        return sb;
    }

    private static StringBuilder b(StringBuilder sb, long j4) {
        for (int i4 = 0; i4 < 8; i4++) {
            sb.append(f85543b[((int) (j4 >> f85544c[i4])) & 15]);
        }
        return sb;
    }

    public static void c(byte[] bArr, long j4, OutputStream outputStream, int i4) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (i4 < 0 || i4 >= bArr.length) {
            StringBuilder a5 = s.a("illegal index: ", i4, " into array of length ");
            a5.append(bArr.length);
            throw new ArrayIndexOutOfBoundsException(a5.toString());
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
        long j5 = j4 + i4;
        StringBuilder sb = new StringBuilder(74);
        while (i4 < bArr.length) {
            int length = bArr.length - i4;
            if (length > 16) {
                length = 16;
            }
            b(sb, j5).append(' ');
            for (int i5 = 0; i5 < 16; i5++) {
                if (i5 < length) {
                    a(sb, bArr[i5 + i4]);
                } else {
                    sb.append("  ");
                }
                sb.append(' ');
            }
            for (int i6 = 0; i6 < length; i6++) {
                byte b5 = bArr[i6 + i4];
                if (b5 < 32 || b5 >= Byte.MAX_VALUE) {
                    sb.append('.');
                } else {
                    sb.append((char) b5);
                }
            }
            sb.append(f85542a);
            outputStream.write(sb.toString().getBytes());
            outputStream.flush();
            sb.setLength(0);
            j5 += length;
            i4 += 16;
        }
    }
}
