package com.tencent.qcloud.core.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.common.base.c;
import java.io.UnsupportedEncodingException;
import kotlin.io.encoding.a;
import okio.r0;

/* loaded from: classes7.dex */
public class Base64Utils {
    private static final byte[] MAP = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
    private static final byte[] URL_MAP = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};

    private Base64Utils() {
    }

    public static byte[] decode(String str) {
        int i4;
        char charAt;
        int length = str.length();
        while (length > 0 && ((charAt = str.charAt(length - 1)) == '=' || charAt == '\n' || charAt == '\r' || charAt == ' ' || charAt == '\t')) {
            length--;
        }
        int i5 = (int) ((length * 6) / 8);
        byte[] bArr = new byte[i5];
        int i6 = 0;
        int i7 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt2 = str.charAt(i11);
            if (charAt2 >= 'A' && charAt2 <= 'Z') {
                i4 = charAt2 - 'A';
            } else if (charAt2 >= 'a' && charAt2 <= 'z') {
                i4 = charAt2 - 'G';
            } else if (charAt2 >= '0' && charAt2 <= '9') {
                i4 = charAt2 + 4;
            } else if (charAt2 == '+' || charAt2 == '-') {
                i4 = 62;
            } else if (charAt2 == '/' || charAt2 == '_') {
                i4 = 63;
            } else {
                if (charAt2 != '\n' && charAt2 != '\r' && charAt2 != ' ' && charAt2 != '\t') {
                    return null;
                }
            }
            i7 = (i7 << 6) | ((byte) i4);
            i6++;
            if (i6 % 4 == 0) {
                bArr[i10] = (byte) (i7 >> 16);
                int i12 = i10 + 2;
                bArr[i10 + 1] = (byte) (i7 >> 8);
                i10 += 3;
                bArr[i12] = (byte) i7;
            }
        }
        int i13 = i6 % 4;
        if (i13 == 1) {
            return null;
        }
        if (i13 == 2) {
            bArr[i10] = (byte) ((i7 << 12) >> 16);
            i10++;
        } else if (i13 == 3) {
            int i14 = i7 << 6;
            int i15 = i10 + 1;
            bArr[i10] = (byte) (i14 >> 16);
            i10 += 2;
            bArr[i15] = (byte) (i14 >> 8);
        }
        if (i10 == i5) {
            return bArr;
        }
        byte[] bArr2 = new byte[i10];
        System.arraycopy(bArr, 0, bArr2, 0, i10);
        return bArr2;
    }

    public static String encode(byte[] bArr) {
        return encode(bArr, MAP);
    }

    public static String encodeUrl(byte[] bArr) {
        return encode(bArr, URL_MAP);
    }

    private static String encode(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[((bArr.length + 2) / 3) * 4];
        int length = bArr.length - (bArr.length % 3);
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5 += 3) {
            bArr3[i4] = bArr2[(bArr[i5] & 255) >> 2];
            int i6 = i5 + 1;
            bArr3[i4 + 1] = bArr2[((bArr[i5] & 3) << 4) | ((bArr[i6] & 255) >> 4)];
            int i7 = i4 + 3;
            int i10 = (bArr[i6] & c.f54871q) << 2;
            int i11 = i5 + 2;
            bArr3[i4 + 2] = bArr2[i10 | ((bArr[i11] & 255) >> 6)];
            i4 += 4;
            bArr3[i7] = bArr2[bArr[i11] & r0.f85265a];
        }
        int length2 = bArr.length % 3;
        if (length2 == 1) {
            bArr3[i4] = bArr2[(bArr[length] & 255) >> 2];
            bArr3[i4 + 1] = bArr2[(bArr[length] & 3) << 4];
            bArr3[i4 + 2] = a.f75126h;
            bArr3[i4 + 3] = a.f75126h;
        } else if (length2 == 2) {
            bArr3[i4] = bArr2[(bArr[length] & 255) >> 2];
            int i12 = (bArr[length] & 3) << 4;
            int i13 = length + 1;
            bArr3[i4 + 1] = bArr2[((bArr[i13] & 255) >> 4) | i12];
            bArr3[i4 + 2] = bArr2[(bArr[i13] & c.f54871q) << 2];
            bArr3[i4 + 3] = a.f75126h;
        }
        try {
            return new String(bArr3, ProtectedSandApp.s("媮\u0001"));
        } catch (UnsupportedEncodingException e4) {
            throw new AssertionError(e4);
        }
    }
}
