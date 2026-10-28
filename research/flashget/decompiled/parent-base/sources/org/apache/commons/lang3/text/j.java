package org.apache.commons.lang3.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.b1;

/* compiled from: WordUtils.java */
@Deprecated
/* loaded from: classes6.dex */
public class j {
    public static String a(String str) {
        return b(str, null);
    }

    public static String b(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (b1.G0(str) || length == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z4 = true;
        for (int i4 = 0; i4 < charArray.length; i4++) {
            char c5 = charArray[i4];
            if (h(c5, cArr)) {
                z4 = true;
            } else if (z4) {
                charArray[i4] = Character.toTitleCase(c5);
                z4 = false;
            }
        }
        return new String(charArray);
    }

    public static String c(String str) {
        return d(str, null);
    }

    public static String d(String str, char... cArr) {
        return (b1.G0(str) || (cArr == null ? -1 : cArr.length) == 0) ? str : b(str.toLowerCase(), cArr);
    }

    public static boolean e(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (b1.G0(charSequence) || org.apache.commons.lang3.e.n1(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence2 : charSequenceArr) {
            if (b1.F0(charSequence2)) {
                return false;
            }
            if (!Pattern.compile(".*\\b" + ((Object) charSequence2) + "\\b.*").matcher(charSequence).matches()) {
                return false;
            }
        }
        return true;
    }

    public static String f(String str) {
        return g(str, null);
    }

    public static String g(String str, char... cArr) {
        if (b1.G0(str)) {
            return str;
        }
        if (cArr != null && cArr.length == 0) {
            return "";
        }
        int length = str.length();
        char[] cArr2 = new char[(length / 2) + 1];
        boolean z4 = true;
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = str.charAt(i5);
            if (h(charAt, cArr)) {
                z4 = true;
            } else if (z4) {
                cArr2[i4] = charAt;
                i4++;
                z4 = false;
            }
        }
        return new String(cArr2, 0, i4);
    }

    private static boolean h(char c5, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(c5);
        }
        for (char c6 : cArr) {
            if (c5 == c6) {
                return true;
            }
        }
        return false;
    }

    public static String i(String str) {
        if (b1.G0(str)) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z4 = true;
        for (int i4 = 0; i4 < charArray.length; i4++) {
            char c5 = charArray[i4];
            if (Character.isUpperCase(c5) || Character.isTitleCase(c5)) {
                charArray[i4] = Character.toLowerCase(c5);
            } else {
                if (!Character.isLowerCase(c5)) {
                    z4 = Character.isWhitespace(c5);
                } else if (z4) {
                    charArray[i4] = Character.toTitleCase(c5);
                } else {
                    charArray[i4] = Character.toUpperCase(c5);
                }
            }
            z4 = false;
        }
        return new String(charArray);
    }

    public static String j(String str) {
        return k(str, null);
    }

    public static String k(String str, char... cArr) {
        int length = cArr == null ? -1 : cArr.length;
        if (b1.G0(str) || length == 0) {
            return str;
        }
        char[] charArray = str.toCharArray();
        boolean z4 = true;
        for (int i4 = 0; i4 < charArray.length; i4++) {
            char c5 = charArray[i4];
            if (h(c5, cArr)) {
                z4 = true;
            } else if (z4) {
                charArray[i4] = Character.toLowerCase(c5);
                z4 = false;
            }
        }
        return new String(charArray);
    }

    public static String l(String str, int i4) {
        return n(str, i4, null, false, " ");
    }

    public static String m(String str, int i4, String str2, boolean z4) {
        return n(str, i4, str2, z4, " ");
    }

    public static String n(String str, int i4, String str2, boolean z4, String str3) {
        int i5;
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = System.lineSeparator();
        }
        if (i4 < 1) {
            i4 = 1;
        }
        if (b1.F0(str3)) {
            str3 = " ";
        }
        Pattern compile = Pattern.compile(str3);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 32);
        int i6 = 0;
        while (i6 < length) {
            int i7 = i6 + i4;
            Matcher matcher = compile.matcher(str.substring(i6, Math.min((int) Math.min(2147483647L, i7 + 1), length)));
            if (!matcher.find()) {
                i5 = -1;
            } else if (matcher.start() == 0) {
                i6 += matcher.end();
            } else {
                i5 = matcher.start() + i6;
            }
            if (length - i6 <= i4) {
                break;
            }
            while (matcher.find()) {
                i5 = matcher.start() + i6;
            }
            if (i5 >= i6) {
                sb.append((CharSequence) str, i6, i5);
                sb.append(str2);
            } else if (z4) {
                sb.append((CharSequence) str, i6, i7);
                sb.append(str2);
                i6 = i7;
            } else {
                Matcher matcher2 = compile.matcher(str.substring(i7));
                if (matcher2.find()) {
                    i5 = matcher2.start() + i6 + i4;
                }
                if (i5 >= 0) {
                    sb.append((CharSequence) str, i6, i5);
                    sb.append(str2);
                } else {
                    sb.append((CharSequence) str, i6, str.length());
                    i6 = length;
                }
            }
            i6 = i5 + 1;
        }
        sb.append((CharSequence) str, i6, str.length());
        return sb.toString();
    }
}
