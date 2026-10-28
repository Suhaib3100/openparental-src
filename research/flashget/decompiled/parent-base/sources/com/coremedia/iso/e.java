package com.coremedia.iso;

import java.io.ByteArrayOutputStream;

/* compiled from: Hex.java */
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final char[] f47636a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    public static byte[] a(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i4 = 0;
        while (i4 < str.length()) {
            int i5 = i4 + 2;
            byteArrayOutputStream.write(Integer.parseInt(str.substring(i4, i5), 16));
            i4 = i5;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static String b(byte[] bArr) {
        return c(bArr, 0);
    }

    public static String c(byte[] bArr, int i4) {
        int length = bArr.length;
        char[] cArr = new char[(length << 1) + (i4 > 0 ? length / i4 : 0)];
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            if (i4 > 0 && i6 % i4 == 0 && i5 > 0) {
                cArr[i5] = '-';
                i5++;
            }
            int i7 = i5 + 1;
            char[] cArr2 = f47636a;
            byte b5 = bArr[i6];
            cArr[i5] = cArr2[(b5 & 240) >>> 4];
            i5 += 2;
            cArr[i7] = cArr2[b5 & com.google.common.base.c.f54871q];
        }
        return new String(cArr);
    }
}
