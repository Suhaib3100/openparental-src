package org.apache.commons.lang3;

/* compiled from: CharSetUtils.java */
/* loaded from: classes6.dex */
public class l {
    public static boolean a(String str, String... strArr) {
        if (!b1.G0(str) && !c(strArr)) {
            k d5 = k.d(strArr);
            for (char c5 : str.toCharArray()) {
                if (d5.b(c5)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static int b(String str, String... strArr) {
        if (b1.G0(str) || c(strArr)) {
            return 0;
        }
        k d5 = k.d(strArr);
        int i4 = 0;
        for (char c5 : str.toCharArray()) {
            if (d5.b(c5)) {
                i4++;
            }
        }
        return i4;
    }

    private static boolean c(String[] strArr) {
        if (strArr == null) {
            return true;
        }
        for (String str : strArr) {
            if (b1.L0(str)) {
                return false;
            }
        }
        return true;
    }

    public static String d(String str, String... strArr) {
        return (b1.G0(str) || c(strArr)) ? str : f(str, strArr, false);
    }

    public static String e(String str, String... strArr) {
        if (str == null) {
            return null;
        }
        return (str.isEmpty() || c(strArr)) ? "" : f(str, strArr, true);
    }

    private static String f(String str, String[] strArr, boolean z4) {
        k d5 = k.d(strArr);
        StringBuilder sb = new StringBuilder(str.length());
        for (char c5 : str.toCharArray()) {
            if (d5.b(c5) == z4) {
                sb.append(c5);
            }
        }
        return sb.toString();
    }

    public static String g(String str, String... strArr) {
        if (b1.G0(str) || c(strArr)) {
            return str;
        }
        k d5 = k.d(strArr);
        StringBuilder sb = new StringBuilder(str.length());
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        char c5 = charArray[0];
        sb.append(c5);
        Character ch = null;
        Character ch2 = null;
        for (int i4 = 1; i4 < length; i4++) {
            char c6 = charArray[i4];
            if (c6 == c5) {
                if (ch == null || c6 != ch.charValue()) {
                    if (ch2 == null || c6 != ch2.charValue()) {
                        if (d5.b(c6)) {
                            ch = Character.valueOf(c6);
                        } else {
                            ch2 = Character.valueOf(c6);
                        }
                    }
                }
            }
            sb.append(c6);
            c5 = c6;
        }
        return sb.toString();
    }
}
