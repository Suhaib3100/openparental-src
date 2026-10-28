package org.eclipse.paho.client.mqttv3.internal.security;

/* loaded from: classes5.dex */
public class SimpleBase64Encoder {
    private static final String PWDCHARS_STRING = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    private static final char[] PWDCHARS_ARRAY = "./0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz".toCharArray();

    public static byte[] decode(String str) {
        byte[] bytes = str.getBytes();
        int length = bytes.length;
        byte[] bArr = new byte[(length * 3) / 4];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (length < 4) {
                break;
            }
            long from64 = from64(bytes, i4, 4);
            length -= 4;
            i4 += 4;
            for (int i6 = 2; i6 >= 0; i6--) {
                bArr[i5 + i6] = (byte) (from64 & 255);
                from64 >>= 8;
            }
            i5 += 3;
        }
        if (length == 3) {
            long from642 = from64(bytes, i4, 3);
            for (int i7 = 1; i7 >= 0; i7--) {
                bArr[i5 + i7] = (byte) (from642 & 255);
                from642 >>= 8;
            }
        }
        if (length == 2) {
            bArr[i5] = (byte) (from64(bytes, i4, 2) & 255);
        }
        return bArr;
    }

    public static String encode(byte[] bArr) {
        int length = bArr.length;
        StringBuffer stringBuffer = new StringBuffer(((length + 2) / 3) * 4);
        int i4 = 0;
        while (length >= 3) {
            stringBuffer.append(to64(((bArr[i4] & 255) << 16) | ((bArr[i4 + 1] & 255) << 8) | (bArr[i4 + 2] & 255), 4));
            i4 += 3;
            length -= 3;
        }
        if (length == 2) {
            stringBuffer.append(to64(((bArr[i4] & 255) << 8) | (bArr[i4 + 1] & 255), 3));
        }
        if (length == 1) {
            stringBuffer.append(to64(bArr[i4] & 255, 2));
        }
        return stringBuffer.toString();
    }

    private static final long from64(byte[] bArr, int i4, int i5) {
        int i6 = 0;
        long j4 = 0;
        while (i5 > 0) {
            i5--;
            int i7 = i4 + 1;
            byte b5 = bArr[i4];
            long j5 = b5 == 47 ? 1L : 0L;
            if (b5 >= 48 && b5 <= 57) {
                j5 = b5 - 46;
            }
            if (b5 >= 65 && b5 <= 90) {
                j5 = b5 - 53;
            }
            if (b5 >= 97 && b5 <= 122) {
                j5 = b5 - 59;
            }
            j4 += j5 << i6;
            i6 += 6;
            i4 = i7;
        }
        return j4;
    }

    private static final String to64(long j4, int i4) {
        StringBuffer stringBuffer = new StringBuffer(i4);
        while (i4 > 0) {
            i4--;
            stringBuffer.append(PWDCHARS_ARRAY[(int) (63 & j4)]);
            j4 >>= 6;
        }
        return stringBuffer.toString();
    }
}
