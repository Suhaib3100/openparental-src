package com.panda.mecrypt;

import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.UnsupportedEncodingException;
import kotlin.UByte;
import kotlin.io.encoding.Base64;
import okio.r0;

/* compiled from: Base64Helper.java */
/* loaded from: classes5.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static char[] f21481a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', org.apache.commons.io.n.f32060b};

    /* renamed from: b, reason: collision with root package name */
    private static byte[] f21482b = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 62, -1, -1, -1, r0.f31710a, 52, 53, 54, 55, 56, 57, 58, 59, 60, Base64.f23367h, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -1, -1, -1, -1, -1};

    public static byte[] a(String str) {
        try {
            return b(str);
        } catch (UnsupportedEncodingException e6) {
            e6.printStackTrace();
            return new byte[0];
        }
    }

    private static byte[] b(String str) throws UnsupportedEncodingException {
        String s5;
        int i5;
        byte b6;
        int i6;
        byte b7;
        int i7;
        byte b8;
        int i8;
        byte b9;
        StringBuffer stringBuffer = new StringBuffer();
        byte[] bytes = str.getBytes(ProtectedSandApp.s("㗤"));
        int length = bytes.length;
        int i9 = 0;
        while (true) {
            s5 = ProtectedSandApp.s("㗥");
            if (i9 >= length) {
                break;
            }
            while (true) {
                i5 = i9 + 1;
                b6 = f21482b[bytes[i9]];
                if (i5 >= length || b6 != -1) {
                    break;
                }
                i9 = i5;
            }
            if (b6 == -1) {
                break;
            }
            while (true) {
                i6 = i5 + 1;
                b7 = f21482b[bytes[i5]];
                if (i6 >= length || b7 != -1) {
                    break;
                }
                i5 = i6;
            }
            if (b7 == -1) {
                break;
            }
            stringBuffer.append((char) ((b6 << 2) | ((b7 & 48) >>> 4)));
            while (true) {
                i7 = i6 + 1;
                byte b10 = bytes[i6];
                if (b10 == 61) {
                    return stringBuffer.toString().getBytes(s5);
                }
                b8 = f21482b[b10];
                if (i7 >= length || b8 != -1) {
                    break;
                }
                i6 = i7;
            }
            if (b8 == -1) {
                break;
            }
            stringBuffer.append((char) (((b7 & 15) << 4) | ((b8 & 60) >>> 2)));
            while (true) {
                i8 = i7 + 1;
                byte b11 = bytes[i7];
                if (b11 == 61) {
                    return stringBuffer.toString().getBytes(s5);
                }
                b9 = f21482b[b11];
                if (i8 >= length || b9 != -1) {
                    break;
                }
                i7 = i8;
            }
            if (b9 == -1) {
                break;
            }
            stringBuffer.append((char) (b9 | ((b8 & 3) << 6)));
            i9 = i8;
        }
        return stringBuffer.toString().getBytes(s5);
    }

    public static String c(byte[] bArr) {
        StringBuffer stringBuffer = new StringBuffer();
        int length = bArr.length;
        int i5 = 0;
        while (true) {
            if (i5 >= length) {
                break;
            }
            int i6 = i5 + 1;
            int i7 = bArr[i5] & UByte.f27220r;
            if (i6 == length) {
                stringBuffer.append(f21481a[i7 >>> 2]);
                stringBuffer.append(f21481a[(i7 & 3) << 4]);
                stringBuffer.append(ProtectedSandApp.s("㗦"));
                break;
            }
            int i8 = i6 + 1;
            int i9 = bArr[i6] & UByte.f27220r;
            if (i8 == length) {
                stringBuffer.append(f21481a[i7 >>> 2]);
                stringBuffer.append(f21481a[((i7 & 3) << 4) | ((i9 & 240) >>> 4)]);
                stringBuffer.append(f21481a[(i9 & 15) << 2]);
                stringBuffer.append(ProtectedSandApp.s("㗧"));
                break;
            }
            int i10 = i8 + 1;
            int i11 = bArr[i8] & UByte.f27220r;
            stringBuffer.append(f21481a[i7 >>> 2]);
            stringBuffer.append(f21481a[((i7 & 3) << 4) | ((i9 & 240) >>> 4)]);
            stringBuffer.append(f21481a[((i9 & 15) << 2) | ((i11 & 192) >>> 6)]);
            stringBuffer.append(f21481a[i11 & 63]);
            i5 = i10;
        }
        return stringBuffer.toString();
    }
}
