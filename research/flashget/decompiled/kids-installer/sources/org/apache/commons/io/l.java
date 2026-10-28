package org.apache.commons.io;

import androidx.core.app.x;
import java.io.IOException;
import java.io.OutputStream;

/* compiled from: HexDump.java */
/* loaded from: classes5.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public static final String f32032a = System.getProperty("line.separator");

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f32033b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f32034c = {28, 24, 20, 16, 12, 8, 4, 0};

    private static StringBuilder a(StringBuilder sb, byte b6) {
        for (int i5 = 0; i5 < 2; i5++) {
            sb.append(f32033b[(b6 >> f32034c[i5 + 6]) & 15]);
        }
        return sb;
    }

    private static StringBuilder b(StringBuilder sb, long j5) {
        for (int i5 = 0; i5 < 8; i5++) {
            sb.append(f32033b[((int) (j5 >> f32034c[i5])) & 15]);
        }
        return sb;
    }

    public static void c(byte[] bArr, long j5, OutputStream outputStream, int i5) throws IOException, ArrayIndexOutOfBoundsException, IllegalArgumentException {
        if (i5 < 0 || i5 >= bArr.length) {
            StringBuilder a6 = x.a("illegal index: ", i5, " into array of length ");
            a6.append(bArr.length);
            throw new ArrayIndexOutOfBoundsException(a6.toString());
        }
        if (outputStream == null) {
            throw new IllegalArgumentException("cannot write to nullstream");
        }
        long j6 = j5 + i5;
        StringBuilder sb = new StringBuilder(74);
        while (i5 < bArr.length) {
            int length = bArr.length - i5;
            if (length > 16) {
                length = 16;
            }
            b(sb, j6).append(' ');
            for (int i6 = 0; i6 < 16; i6++) {
                if (i6 < length) {
                    a(sb, bArr[i6 + i5]);
                } else {
                    sb.append("  ");
                }
                sb.append(' ');
            }
            for (int i7 = 0; i7 < length; i7++) {
                byte b6 = bArr[i7 + i5];
                if (b6 < 32 || b6 >= Byte.MAX_VALUE) {
                    sb.append(k.f32026a);
                } else {
                    sb.append((char) b6);
                }
            }
            sb.append(f32032a);
            outputStream.write(sb.toString().getBytes());
            outputStream.flush();
            sb.setLength(0);
            j6 += length;
            i5 += 16;
        }
    }
}
