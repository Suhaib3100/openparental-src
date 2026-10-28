package com.tencent.qcloud.core.util;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.Charset;

/* loaded from: classes7.dex */
public class QCloudStringUtils {
    public static boolean equals(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || !(charSequence == null || charSequence2 == null || (!((charSequence instanceof String) && (charSequence2 instanceof String)) ? regionMatches(charSequence, false, 0, charSequence2, 0, Math.max(charSequence.length(), charSequence2.length())) : charSequence.equals(charSequence2)));
    }

    public static byte[] getBytesUTF8(String str) {
        return str.getBytes(Charset.forName(ProtectedSandApp.s("嫈\u0001")));
    }

    public static String getExtension(String str) {
        int lastIndexOf;
        if (str != null && (lastIndexOf = str.lastIndexOf(ProtectedSandApp.s("嫉\u0001"))) >= 0) {
            return str.substring(lastIndexOf + 1);
        }
        return null;
    }

    public static boolean isEmpty(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static String newStringUTF8(byte[] bArr) {
        return new String(bArr, Charset.forName(ProtectedSandApp.s("嫈\u0001")));
    }

    static boolean regionMatches(CharSequence charSequence, boolean z4, int i4, CharSequence charSequence2, int i5, int i6) {
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return ((String) charSequence).regionMatches(z4, i4, (String) charSequence2, i5, i6);
        }
        while (true) {
            int i7 = i6 - 1;
            if (i6 <= 0) {
                return true;
            }
            int i10 = i4 + 1;
            char charAt = charSequence.charAt(i4);
            int i11 = i5 + 1;
            char charAt2 = charSequence2.charAt(i5);
            if (charAt != charAt2) {
                if (!z4) {
                    return false;
                }
                if (Character.toUpperCase(charAt) != Character.toUpperCase(charAt2) && Character.toLowerCase(charAt) != Character.toLowerCase(charAt2)) {
                    return false;
                }
            }
            i4 = i10;
            i6 = i7;
            i5 = i11;
        }
    }
}
