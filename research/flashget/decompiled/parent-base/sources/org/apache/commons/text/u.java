package org.apache.commons.text;

import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.b1;
import org.apache.commons.lang3.k1;

/* compiled from: WordUtils.java */
/* loaded from: classes3.dex */
public class u {
    public static String a(String str, int i4, int i5, String str2) {
        boolean z4 = true;
        k1.B(i5 >= -1, "upper value cannot be less than -1", new Object[0]);
        if (i5 < i4 && i5 != -1) {
            z4 = false;
        }
        k1.B(z4, "upper value is less than lower value", new Object[0]);
        if (b1.G0(str)) {
            return str;
        }
        if (i4 > str.length()) {
            i4 = str.length();
        }
        if (i5 == -1 || i5 > str.length()) {
            i5 = str.length();
        }
        StringBuilder sb = new StringBuilder();
        int k02 = b1.k0(str, " ", i4);
        if (k02 == -1) {
            sb.append((CharSequence) str, 0, i5);
            if (i5 != str.length()) {
                if (str2 == null) {
                    str2 = "";
                }
                sb.append(str2);
            }
        } else if (k02 > i5) {
            sb.append((CharSequence) str, 0, i5);
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
        } else {
            sb.append((CharSequence) str, 0, k02);
            if (str2 == null) {
                str2 = "";
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    public static String b(String str) {
        return c(str, null);
    }

    public static String c(String str, char... cArr) {
        int codePointAt;
        if (b1.G0(str)) {
            return str;
        }
        Set<Integer> g4 = g(cArr);
        int length = str.length();
        int[] iArr = new int[length];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            while (i4 < length) {
                codePointAt = str.codePointAt(i4);
                if (g4.contains(Integer.valueOf(codePointAt))) {
                    break;
                }
                if (z4) {
                    int titleCase = Character.toTitleCase(codePointAt);
                    int i6 = i5 + 1;
                    iArr[i5] = titleCase;
                    int charCount = Character.charCount(titleCase) + i4;
                    z4 = false;
                    i4 = charCount;
                    i5 = i6;
                } else {
                    iArr[i5] = codePointAt;
                    i4 = Character.charCount(codePointAt) + i4;
                    i5++;
                }
            }
            return new String(iArr, 0, i5);
            iArr[i5] = codePointAt;
            i4 = Character.charCount(codePointAt) + i4;
            i5++;
        }
    }

    public static String d(String str) {
        return e(str, null);
    }

    public static String e(String str, char... cArr) {
        return b1.G0(str) ? str : c(str.toLowerCase(), cArr);
    }

    public static boolean f(CharSequence charSequence, CharSequence... charSequenceArr) {
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

    private static Set<Integer> g(char[] cArr) {
        HashSet hashSet = new HashSet();
        if (cArr == null || cArr.length == 0) {
            if (cArr == null) {
                hashSet.add(Integer.valueOf(Character.codePointAt(new char[]{' '}, 0)));
            }
            return hashSet;
        }
        for (int i4 = 0; i4 < cArr.length; i4++) {
            hashSet.add(Integer.valueOf(Character.codePointAt(cArr, i4)));
        }
        return hashSet;
    }

    public static String h(String str) {
        return i(str, null);
    }

    public static String i(String str, char... cArr) {
        if (b1.G0(str)) {
            return str;
        }
        if (cArr != null && cArr.length == 0) {
            return "";
        }
        Set<Integer> g4 = g(cArr);
        int length = str.length();
        int[] iArr = new int[(length / 2) + 1];
        boolean z4 = true;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int codePointAt = str.codePointAt(i4);
            if (g4.contains(Integer.valueOf(codePointAt)) || (cArr == null && Character.isWhitespace(codePointAt))) {
                z4 = true;
            } else if (z4) {
                iArr[i5] = codePointAt;
                i5++;
                z4 = false;
            }
            i4 += Character.charCount(codePointAt);
        }
        return new String(iArr, 0, i5);
    }

    @Deprecated
    public static boolean j(char c5, char[] cArr) {
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

    @Deprecated
    public static boolean k(int i4, char[] cArr) {
        if (cArr == null) {
            return Character.isWhitespace(i4);
        }
        for (int i5 = 0; i5 < cArr.length; i5++) {
            if (Character.codePointAt(cArr, i5) == i4) {
                return true;
            }
        }
        return false;
    }

    public static String l(String str) {
        if (b1.G0(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        boolean z4 = true;
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int codePointAt = str.codePointAt(i4);
            if (Character.isUpperCase(codePointAt) || Character.isTitleCase(codePointAt)) {
                codePointAt = Character.toLowerCase(codePointAt);
            } else {
                if (!Character.isLowerCase(codePointAt)) {
                    z4 = Character.isWhitespace(codePointAt);
                } else if (z4) {
                    codePointAt = Character.toTitleCase(codePointAt);
                } else {
                    codePointAt = Character.toUpperCase(codePointAt);
                }
                iArr[i5] = codePointAt;
                i4 += Character.charCount(codePointAt);
                i5++;
            }
            z4 = false;
            iArr[i5] = codePointAt;
            i4 += Character.charCount(codePointAt);
            i5++;
        }
        return new String(iArr, 0, i5);
    }

    public static String m(String str) {
        return n(str, null);
    }

    public static String n(String str, char... cArr) {
        int codePointAt;
        if (b1.G0(str)) {
            return str;
        }
        Set<Integer> g4 = g(cArr);
        int length = str.length();
        int[] iArr = new int[length];
        int i4 = 0;
        int i5 = 0;
        while (true) {
            boolean z4 = true;
            while (i4 < length) {
                codePointAt = str.codePointAt(i4);
                if (g4.contains(Integer.valueOf(codePointAt))) {
                    break;
                }
                if (z4) {
                    int lowerCase = Character.toLowerCase(codePointAt);
                    int i6 = i5 + 1;
                    iArr[i5] = lowerCase;
                    int charCount = Character.charCount(lowerCase) + i4;
                    z4 = false;
                    i4 = charCount;
                    i5 = i6;
                } else {
                    iArr[i5] = codePointAt;
                    i4 = Character.charCount(codePointAt) + i4;
                    i5++;
                }
            }
            return new String(iArr, 0, i5);
            iArr[i5] = codePointAt;
            i4 = Character.charCount(codePointAt) + i4;
            i5++;
        }
    }

    public static String o(String str, int i4) {
        return q(str, i4, null, false, " ");
    }

    public static String p(String str, int i4, String str2, boolean z4) {
        return q(str, i4, str2, z4, " ");
    }

    public static String q(String str, int i4, String str2, boolean z4, String str3) {
        int i5;
        int i6;
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
        int i7 = 0;
        loop0: while (true) {
            i5 = -1;
            while (i7 < length) {
                Matcher matcher = compile.matcher(str.substring(i7, Math.min((int) Math.min(2147483647L, i7 + i4 + 1), length)));
                if (matcher.find()) {
                    if (matcher.start() == 0) {
                        i5 = matcher.end() - matcher.start();
                        if (i5 != 0) {
                            i7 += matcher.end();
                        } else {
                            i7++;
                        }
                    }
                    i6 = matcher.start() + i7;
                } else {
                    i6 = -1;
                }
                if (length - i7 <= i4) {
                    break loop0;
                }
                while (matcher.find()) {
                    i6 = matcher.start() + i7;
                }
                if (i6 >= i7) {
                    sb.append((CharSequence) str, i7, i6);
                    sb.append(str2);
                } else if (z4) {
                    if (i5 == 0) {
                        i7--;
                    }
                    int i10 = i4 + i7;
                    sb.append((CharSequence) str, i7, i10);
                    sb.append(str2);
                    i7 = i10;
                } else {
                    Matcher matcher2 = compile.matcher(str.substring(i7 + i4));
                    if (matcher2.find()) {
                        i5 = matcher2.end() - matcher2.start();
                        i6 = matcher2.start() + i7 + i4;
                    }
                    if (i6 >= 0) {
                        if (i5 == 0 && i7 != 0) {
                            i7--;
                        }
                        sb.append((CharSequence) str, i7, i6);
                        sb.append(str2);
                    } else {
                        if (i5 == 0 && i7 != 0) {
                            i7--;
                        }
                        sb.append((CharSequence) str, i7, str.length());
                        i7 = length;
                    }
                }
                i7 = i6 + 1;
            }
            break loop0;
        }
        if (i5 == 0 && i7 < length) {
            i7--;
        }
        sb.append((CharSequence) str, i7, str.length());
        return sb.toString();
    }
}
