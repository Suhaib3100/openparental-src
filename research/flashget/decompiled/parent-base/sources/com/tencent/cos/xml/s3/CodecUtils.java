package com.tencent.cos.xml.s3;

import androidx.core.app.i0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* loaded from: classes7.dex */
public enum CodecUtils {
    ;

    static int sanitize(String str, byte[] bArr) {
        int length = bArr.length;
        char[] charArray = str.toCharArray();
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char c5 = charArray[i5];
            if (c5 != '\r' && c5 != '\n' && c5 != ' ') {
                if (c5 > 127) {
                    throw new IllegalArgumentException(i0.a(ProtectedSandApp.s("仢\u0001"), i5, ProtectedSandApp.s("代\u0001"), str));
                }
                bArr[i4] = (byte) c5;
                i4++;
            }
        }
        return i4;
    }

    static void sanityCheckLastPos(int i4, int i5) {
        if ((i4 & i5) != 0) {
            throw new IllegalArgumentException(ProtectedSandApp.s("令\u0001"));
        }
    }

    public static byte[] toBytesDirect(String str) {
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        byte[] bArr = new byte[length];
        for (int i4 = 0; i4 < length; i4++) {
            char c5 = charArray[i4];
            if (c5 > 127) {
                throw new IllegalArgumentException(i0.a(ProtectedSandApp.s("仢\u0001"), i4, ProtectedSandApp.s("代\u0001"), str));
            }
            bArr[i4] = (byte) c5;
        }
        return bArr;
    }

    public static String toStringDirect(byte[] bArr) {
        char[] cArr = new char[bArr.length];
        int length = bArr.length;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            cArr[i5] = (char) bArr[i4];
            i4++;
            i5++;
        }
        return new String(cArr);
    }
}
