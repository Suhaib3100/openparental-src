package org.apache.commons.lang3;

import androidx.compose.material3.j4;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.function.Supplier;
import java.util.regex.Pattern;

/* compiled from: StringUtils.java */
/* loaded from: classes6.dex */
public class b1 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f85658a = 256;

    /* renamed from: f, reason: collision with root package name */
    public static final int f85663f = -1;

    /* renamed from: g, reason: collision with root package name */
    private static final int f85664g = 8192;

    /* renamed from: b, reason: collision with root package name */
    public static final String f85659b = " ";

    /* renamed from: c, reason: collision with root package name */
    public static final String f85660c = "";

    /* renamed from: d, reason: collision with root package name */
    public static final String f85661d = "\n";

    /* renamed from: e, reason: collision with root package name */
    public static final String f85662e = "\r";

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f85665h = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    public static boolean A(CharSequence charSequence, char... cArr) {
        if (charSequence != null && cArr != null) {
            int length = charSequence.length();
            int i4 = length - 1;
            int length2 = cArr.length;
            int i5 = length2 - 1;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                for (int i7 = 0; i7 < length2; i7++) {
                    if (cArr[i7] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i7 == i5) {
                            return false;
                        }
                        if (i6 < i4 && cArr[i7 + 1] == charSequence.charAt(i6 + 1)) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static boolean A0(CharSequence charSequence) {
        if (G0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String A1(String str, int i4, String str2) {
        if (str == null) {
            return null;
        }
        if (G0(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i4 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return z1(str, i4, str2.charAt(0));
        }
        if (length2 == length) {
            return str2.concat(str);
        }
        if (length2 < length) {
            return str2.substring(0, length2).concat(str);
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i5 = 0; i5 < length2; i5++) {
            cArr[i5] = charArray[i5 % length];
        }
        return new String(cArr).concat(str);
    }

    public static String[] A2(String str, String str2, int i4) {
        return O2(str, str2, i4, false);
    }

    public static String A3(String str, String str2) {
        if (G0(str) || G0(str2) || str.length() == 1 || !Q2(str, str2, false) || !O(str, str2, false)) {
            return str;
        }
        int indexOf = str.indexOf(str2);
        int lastIndexOf = str.lastIndexOf(str2);
        return (indexOf == -1 || lastIndexOf == -1) ? str : str.substring(indexOf + str2.length(), lastIndexOf);
    }

    public static boolean B(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return false;
        }
        return C(charSequence, str.toCharArray());
    }

    public static boolean B0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetterOrDigit(charSequence.charAt(i4)) && charSequence.charAt(i4) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static int B1(CharSequence charSequence) {
        if (charSequence == null) {
            return 0;
        }
        return charSequence.length();
    }

    public static String[] B2(String str) {
        return C2(str, false);
    }

    public static String B3(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase();
    }

    public static boolean C(CharSequence charSequence, char... cArr) {
        if (cArr == null || charSequence == null) {
            return false;
        }
        if (charSequence.length() == 0) {
            return true;
        }
        return cArr.length != 0 && p0(charSequence, cArr) == -1;
    }

    public static boolean C0(CharSequence... charSequenceArr) {
        if (e.n1(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (F0(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static String C1(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase();
    }

    private static String[] C2(String str, boolean z4) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return e.f85969u;
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        int type = Character.getType(charArray[0]);
        for (int i5 = 1; i5 < charArray.length; i5++) {
            int type2 = Character.getType(charArray[i5]);
            if (type2 != type) {
                if (z4 && type2 == 2 && type == 1) {
                    int i6 = i5 - 1;
                    if (i6 != i4) {
                        arrayList.add(new String(charArray, i4, i6 - i4));
                        i4 = i6;
                    }
                } else {
                    arrayList.add(new String(charArray, i4, i5 - i4));
                    i4 = i5;
                }
                type = type2;
            }
        }
        arrayList.add(new String(charArray, i4, charArray.length - i4));
        return (String[]) arrayList.toArray(e.f85969u);
    }

    public static String C3(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(locale);
    }

    public static boolean D(CharSequence charSequence) {
        if (G0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (Character.isWhitespace(charSequence.charAt(i4))) {
                return true;
            }
        }
        return false;
    }

    public static boolean D0(CharSequence... charSequenceArr) {
        if (e.n1(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (G0(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static String D1(String str, Locale locale) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(locale);
    }

    public static String[] D2(String str) {
        return C2(str, true);
    }

    public static String D3(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        return String.valueOf(cArr);
    }

    private static void E(StringBuilder sb) {
        for (int i4 = 0; i4 < sb.length(); i4++) {
            if (sb.charAt(i4) == 321) {
                sb.deleteCharAt(i4);
                sb.insert(i4, 'L');
            } else if (sb.charAt(i4) == 322) {
                sb.deleteCharAt(i4);
                sb.insert(i4, 'l');
            }
        }
    }

    public static boolean E0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!m.i(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    private static int[] E1(CharSequence charSequence, CharSequence charSequence2) {
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence.length() > charSequence2.length()) {
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int max = Math.max((charSequence4.length() / 2) - 1, 0);
        int[] iArr = new int[charSequence3.length()];
        Arrays.fill(iArr, -1);
        boolean[] zArr = new boolean[charSequence4.length()];
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence3.length(); i5++) {
            char charAt = charSequence3.charAt(i5);
            int max2 = Math.max(i5 - max, 0);
            int min = Math.min(i5 + max + 1, charSequence4.length());
            while (true) {
                if (max2 >= min) {
                    break;
                }
                if (!zArr[max2] && charAt == charSequence4.charAt(max2)) {
                    iArr[i5] = max2;
                    zArr[max2] = true;
                    i4++;
                    break;
                }
                max2++;
            }
        }
        char[] cArr = new char[i4];
        char[] cArr2 = new char[i4];
        int i6 = 0;
        for (int i7 = 0; i7 < charSequence3.length(); i7++) {
            if (iArr[i7] != -1) {
                cArr[i6] = charSequence3.charAt(i7);
                i6++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < charSequence4.length(); i11++) {
            if (zArr[i11]) {
                cArr2[i10] = charSequence4.charAt(i11);
                i10++;
            }
        }
        int i12 = 0;
        for (int i13 = 0; i13 < i4; i13++) {
            if (cArr[i13] != cArr2[i13]) {
                i12++;
            }
        }
        int i14 = 0;
        for (int i15 = 0; i15 < charSequence3.length() && charSequence.charAt(i15) == charSequence2.charAt(i15); i15++) {
            i14++;
        }
        return new int[]{i4, i12 / 2, i14, charSequence4.length()};
    }

    public static String[] E2(String str, String str2) {
        return I2(str, str2, -1, false);
    }

    public static String E3(String str, char c5) {
        if (G0(str) || c5 == 0) {
            return str;
        }
        return c5 + str + c5;
    }

    public static int F(CharSequence charSequence, char c5) {
        if (G0(charSequence)) {
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < charSequence.length(); i5++) {
            if (c5 == charSequence.charAt(i5)) {
                i4++;
            }
        }
        return i4;
    }

    public static boolean F0(CharSequence charSequence) {
        int B1 = B1(charSequence);
        if (B1 == 0) {
            return true;
        }
        for (int i4 = 0; i4 < B1; i4++) {
            if (!Character.isWhitespace(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String F1(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        if (i5 < 0 || i4 > str.length()) {
            return "";
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i6 = i5 + i4;
        return str.length() <= i6 ? str.substring(i4) : str.substring(i4, i6);
    }

    public static String[] F2(String str, String str2, int i4) {
        return I2(str, str2, i4, false);
    }

    public static String F3(String str, String str2) {
        return (G0(str) || G0(str2)) ? str : str2.concat(str).concat(str2);
    }

    public static int G(CharSequence charSequence, CharSequence charSequence2) {
        int i4 = 0;
        if (G0(charSequence) || G0(charSequence2)) {
            return 0;
        }
        int i5 = 0;
        while (true) {
            int c5 = j.c(charSequence, charSequence2, i4);
            if (c5 == -1) {
                return i5;
            }
            i5++;
            i4 = c5 + charSequence2.length();
        }
    }

    public static boolean G0(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    private static StringBuilder G1(int i4) {
        return new StringBuilder(i4 * 16);
    }

    public static String[] G2(String str, String str2) {
        return I2(str, str2, -1, true);
    }

    public static String G3(String str, char c5) {
        if (G0(str) || c5 == 0) {
            return str;
        }
        boolean z4 = str.charAt(0) != c5;
        boolean z5 = str.charAt(str.length() - 1) != c5;
        if (!z4 && !z5) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length() + 2);
        if (z4) {
            sb.append(c5);
        }
        sb.append(str);
        if (z5) {
            sb.append(c5);
        }
        return sb.toString();
    }

    public static <T extends CharSequence> T H(T t4, T t5) {
        return F0(t4) ? t5 : t4;
    }

    public static boolean H0(CharSequence charSequence) {
        if (G0(charSequence) || charSequence.length() == 1) {
            return false;
        }
        int length = charSequence.length();
        boolean z4 = false;
        boolean z5 = false;
        for (int i4 = 0; i4 < length; i4++) {
            if (z4 && z5) {
                return true;
            }
            if (Character.isUpperCase(charSequence.charAt(i4))) {
                z4 = true;
            } else if (Character.isLowerCase(charSequence.charAt(i4))) {
                z5 = true;
            }
        }
        return z4 && z5;
    }

    public static String H1(String str) {
        if (G0(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        boolean z4 = true;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < length; i6++) {
            char charAt = str.charAt(i6);
            if (Character.isWhitespace(charAt)) {
                if (i5 == 0 && !z4) {
                    cArr[i4] = " ".charAt(0);
                    i4++;
                }
                i5++;
            } else {
                int i7 = i4 + 1;
                if (charAt == 160) {
                    charAt = ' ';
                }
                cArr[i4] = charAt;
                i5 = 0;
                i4 = i7;
                z4 = false;
            }
        }
        if (z4) {
            return "";
        }
        return new String(cArr, 0, i4 - (i5 <= 0 ? 0 : 1)).trim();
    }

    public static String[] H2(String str, String str2, int i4) {
        return I2(str, str2, i4, true);
    }

    public static String H3(String str, String str2) {
        if (G0(str) || G0(str2)) {
            return str;
        }
        boolean startsWith = str.startsWith(str2);
        boolean endsWith = str.endsWith(str2);
        if (startsWith && endsWith) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str2.length() + str2.length() + str.length());
        if (!startsWith) {
            sb.append(str2);
        }
        sb.append(str);
        if (!endsWith) {
            sb.append(str2);
        }
        return sb.toString();
    }

    public static <T extends CharSequence> T I(T t4, T t5) {
        return G0(t4) ? t5 : t4;
    }

    public static boolean I0(CharSequence... charSequenceArr) {
        return !C0(charSequenceArr);
    }

    public static int I1(CharSequence charSequence, CharSequence charSequence2, int i4) {
        return J1(charSequence, charSequence2, i4, false);
    }

    private static String[] I2(String str, String str2, int i4, boolean z4) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return e.f85969u;
        }
        if (str2 == null || "".equals(str2)) {
            return O2(str, null, i4, z4);
        }
        int length2 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i5 < length) {
            i5 = str.indexOf(str2, i6);
            if (i5 > -1) {
                if (i5 > i6) {
                    i7++;
                    if (i7 == i4) {
                        arrayList.add(str.substring(i6));
                    } else {
                        arrayList.add(str.substring(i6, i5));
                    }
                } else if (z4) {
                    i7++;
                    if (i7 == i4) {
                        arrayList.add(str.substring(i6));
                        i5 = length;
                    } else {
                        arrayList.add("");
                    }
                }
                i6 = i5 + length2;
            } else {
                arrayList.add(str.substring(i6));
            }
            i5 = length;
        }
        return (String[]) arrayList.toArray(e.f85969u);
    }

    public static String J(String str) {
        return str == null ? "" : str;
    }

    public static boolean J0(CharSequence... charSequenceArr) {
        return !D0(charSequenceArr);
    }

    private static int J1(CharSequence charSequence, CharSequence charSequence2, int i4, boolean z4) {
        if (charSequence != null && charSequence2 != null && i4 > 0) {
            int i5 = 0;
            if (charSequence2.length() == 0) {
                if (z4) {
                    return charSequence.length();
                }
                return 0;
            }
            r0 = z4 ? charSequence.length() : -1;
            do {
                r0 = z4 ? j.e(charSequence, charSequence2, r0 - 1) : j.c(charSequence, charSequence2, r0 + 1);
                if (r0 < 0) {
                    return r0;
                }
                i5++;
            } while (i5 < i4);
        }
        return r0;
    }

    public static String[] J2(String str) {
        return O2(str, null, -1, true);
    }

    public static String K(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static boolean K0(CharSequence charSequence) {
        return !F0(charSequence);
    }

    public static String K1(String str, String str2, int i4, int i5) {
        if (str == null) {
            return null;
        }
        if (str2 == null) {
            str2 = "";
        }
        int length = str.length();
        if (i4 < 0) {
            i4 = 0;
        }
        if (i4 > length) {
            i4 = length;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        if (i5 <= length) {
            length = i5;
        }
        if (i4 > length) {
            int i6 = length;
            length = i4;
            i4 = i6;
        }
        return str.substring(0, i4) + str2 + str.substring(length);
    }

    public static String[] K2(String str, char c5) {
        return N2(str, c5, true);
    }

    public static String L(String str) {
        if (G0(str)) {
            return str;
        }
        int length = str.length();
        char[] cArr = new char[length];
        int i4 = 0;
        for (int i5 = 0; i5 < length; i5++) {
            if (!Character.isWhitespace(str.charAt(i5))) {
                cArr[i4] = str.charAt(i5);
                i4++;
            }
        }
        return i4 == length ? str : new String(cArr, 0, i4);
    }

    public static boolean L0(CharSequence charSequence) {
        return !G0(charSequence);
    }

    private static String L1(String str, CharSequence charSequence, boolean z4, CharSequence... charSequenceArr) {
        if (str == null || G0(charSequence) || Q2(str, charSequence, z4)) {
            return str;
        }
        if (e.x1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (Q2(str, charSequence2, z4)) {
                    return str;
                }
            }
        }
        return charSequence.toString() + str;
    }

    public static String[] L2(String str, String str2) {
        return O2(str, str2, -1, true);
    }

    public static String M(String str, String str2) {
        if (str == null) {
            return str2;
        }
        if (str2 == null) {
            return str;
        }
        int q02 = q0(str, str2);
        return q02 == -1 ? "" : str2.substring(q02);
    }

    public static boolean M0(CharSequence charSequence) {
        if (G0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isDigit(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String M1(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return L1(str, charSequence, false, charSequenceArr);
    }

    public static String[] M2(String str, String str2, int i4) {
        return O2(str, str2, i4, true);
    }

    public static boolean N(CharSequence charSequence, CharSequence charSequence2) {
        return O(charSequence, charSequence2, false);
    }

    public static boolean N0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isDigit(charSequence.charAt(i4)) && charSequence.charAt(i4) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String N1(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return L1(str, charSequence, true, charSequenceArr);
    }

    private static String[] N2(String str, char c5, boolean z4) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return e.f85969u;
        }
        ArrayList arrayList = new ArrayList();
        int i4 = 0;
        boolean z5 = false;
        boolean z6 = false;
        int i5 = 0;
        while (i4 < length) {
            if (str.charAt(i4) == c5) {
                if (z5 || z4) {
                    arrayList.add(str.substring(i5, i4));
                    z5 = false;
                    z6 = true;
                }
                i5 = i4 + 1;
                i4 = i5;
            } else {
                i4++;
                z6 = false;
                z5 = true;
            }
        }
        if (z5 || (z4 && z6)) {
            arrayList.add(str.substring(i5, i4));
        }
        return (String[]) arrayList.toArray(e.f85969u);
    }

    private static boolean O(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return j.f(charSequence, z4, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length());
    }

    public static boolean O0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isWhitespace(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String O1(String str, char c5) {
        if (G0(str) || str.indexOf(c5) == -1) {
            return str;
        }
        char[] charArray = str.toCharArray();
        int i4 = 0;
        for (char c6 : charArray) {
            if (c6 != c5) {
                charArray[i4] = c6;
                i4++;
            }
        }
        return new String(charArray, 0, i4);
    }

    private static String[] O2(String str, String str2, int i4, boolean z4) {
        int i5;
        boolean z5;
        boolean z6;
        int i6;
        int i7;
        boolean z7;
        boolean z10;
        int i10;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return e.f85969u;
        }
        ArrayList arrayList = new ArrayList();
        if (str2 == null) {
            i7 = 0;
            z7 = false;
            z10 = false;
            i10 = 0;
            int i11 = 1;
            while (i7 < length) {
                if (Character.isWhitespace(str.charAt(i7))) {
                    if (z7 || z4) {
                        int i12 = i11 + 1;
                        if (i11 == i4) {
                            i7 = length;
                            z10 = false;
                        } else {
                            z10 = true;
                        }
                        arrayList.add(str.substring(i10, i7));
                        i11 = i12;
                        z7 = false;
                    }
                    i10 = i7 + 1;
                    i7 = i10;
                } else {
                    i7++;
                    z10 = false;
                    z7 = true;
                }
            }
        } else {
            if (str2.length() == 1) {
                char charAt = str2.charAt(0);
                i5 = 0;
                z5 = false;
                z6 = false;
                i6 = 0;
                int i13 = 1;
                while (i5 < length) {
                    if (str.charAt(i5) == charAt) {
                        if (z5 || z4) {
                            int i14 = i13 + 1;
                            if (i13 == i4) {
                                i5 = length;
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            arrayList.add(str.substring(i6, i5));
                            i13 = i14;
                            z5 = false;
                        }
                        i6 = i5 + 1;
                        i5 = i6;
                    } else {
                        i5++;
                        z6 = false;
                        z5 = true;
                    }
                }
            } else {
                i5 = 0;
                z5 = false;
                z6 = false;
                i6 = 0;
                int i15 = 1;
                while (i5 < length) {
                    if (str2.indexOf(str.charAt(i5)) >= 0) {
                        if (z5 || z4) {
                            int i16 = i15 + 1;
                            if (i15 == i4) {
                                i5 = length;
                                z6 = false;
                            } else {
                                z6 = true;
                            }
                            arrayList.add(str.substring(i6, i5));
                            i15 = i16;
                            z5 = false;
                        }
                        i6 = i5 + 1;
                        i5 = i6;
                    } else {
                        i5++;
                        z6 = false;
                        z5 = true;
                    }
                }
            }
            i7 = i5;
            z7 = z5;
            z10 = z6;
            i10 = i6;
        }
        if (z7 || (z4 && z10)) {
            arrayList.add(str.substring(i10, i7));
        }
        return (String[]) arrayList.toArray(e.f85969u);
    }

    public static boolean P(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!G0(charSequence) && !e.n1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (O(charSequence, charSequence2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String P0(Iterable<?> iterable, char c5) {
        if (iterable == null) {
            return null;
        }
        return R0(iterable.iterator(), c5);
    }

    public static String P1(String str, String str2) {
        return (G0(str) || G0(str2)) ? str : d2(str, str2, "", -1, false);
    }

    public static boolean P2(CharSequence charSequence, CharSequence charSequence2) {
        return Q2(charSequence, charSequence2, false);
    }

    public static boolean Q(CharSequence charSequence, CharSequence charSequence2) {
        return O(charSequence, charSequence2, true);
    }

    public static String Q0(Iterable<?> iterable, String str) {
        if (iterable == null) {
            return null;
        }
        return S0(iterable.iterator(), str);
    }

    @Deprecated
    public static String Q1(String str, String str2) {
        return t0.f(str, str2, "");
    }

    private static boolean Q2(CharSequence charSequence, CharSequence charSequence2, boolean z4) {
        if (charSequence == null || charSequence2 == null) {
            return charSequence == charSequence2;
        }
        if (charSequence2.length() > charSequence.length()) {
            return false;
        }
        return j.f(charSequence, z4, 0, charSequence2, 0, charSequence2.length());
    }

    public static boolean R(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        if ((charSequence instanceof String) && (charSequence2 instanceof String)) {
            return charSequence.equals(charSequence2);
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (charSequence.charAt(i4) != charSequence2.charAt(i4)) {
                return false;
            }
        }
        return true;
    }

    public static String R0(Iterator<?> it, char c5) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            sb.append(c5);
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String R1(String str, String str2) {
        return (G0(str) || G0(str2) || !str.endsWith(str2)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static boolean R2(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!G0(charSequence) && !e.n1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (Q2(charSequence, charSequence2, false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean S(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (e.x1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (R(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String S0(Iterator<?> it, String str) {
        if (it == null) {
            return null;
        }
        if (!it.hasNext()) {
            return "";
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Objects.toString(next, "");
        }
        StringBuilder sb = new StringBuilder(256);
        if (next != null) {
            sb.append(next);
        }
        while (it.hasNext()) {
            if (str != null) {
                sb.append(str);
            }
            Object next2 = it.next();
            if (next2 != null) {
                sb.append(next2);
            }
        }
        return sb.toString();
    }

    public static String S1(String str, String str2) {
        return (G0(str) || G0(str2) || !O(str, str2, true)) ? str : str.substring(0, str.length() - str2.length());
    }

    public static boolean S2(CharSequence charSequence, CharSequence charSequence2) {
        return Q2(charSequence, charSequence2, true);
    }

    public static boolean T(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (e.x1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (U(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String T0(List<?> list, char c5, int i4, int i5) {
        if (list == null) {
            return null;
        }
        return i5 - i4 <= 0 ? "" : R0(list.subList(i4, i5).iterator(), c5);
    }

    @Deprecated
    public static String T1(String str, String str2) {
        return t0.h(str, str2, "");
    }

    public static String T2(String str) {
        return U2(str, null);
    }

    public static boolean U(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return true;
        }
        if (charSequence == null || charSequence2 == null || charSequence.length() != charSequence2.length()) {
            return false;
        }
        return j.f(charSequence, true, 0, charSequence2, 0, charSequence.length());
    }

    public static String U0(List<?> list, String str, int i4, int i5) {
        if (list == null) {
            return null;
        }
        return i5 - i4 <= 0 ? "" : S0(list.subList(i4, i5).iterator(), str);
    }

    public static String U1(String str, String str2) {
        return (G0(str) || G0(str2)) ? str : d2(str, str2, "", -1, true);
    }

    public static String U2(String str, String str2) {
        return G0(str) ? str : Y2(Z2(str, str2), str2);
    }

    @SafeVarargs
    public static <T extends CharSequence> T V(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t4 : tArr) {
            if (K0(t4)) {
                return t4;
            }
        }
        return null;
    }

    public static String V0(byte[] bArr, char c5) {
        if (bArr == null) {
            return null;
        }
        return W0(bArr, c5, 0, bArr.length);
    }

    @Deprecated
    public static String V1(String str, String str2) {
        return t0.j(str, str2, "");
    }

    public static String V2(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(Normalizer.normalize(str, Normalizer.Form.NFD));
        E(sb);
        return f85665h.matcher(sb).replaceAll("");
    }

    @SafeVarargs
    public static <T extends CharSequence> T W(T... tArr) {
        if (tArr == null) {
            return null;
        }
        for (T t4 : tArr) {
            if (L0(t4)) {
                return t4;
            }
        }
        return null;
    }

    public static String W0(byte[] bArr, char c5, int i4, int i5) {
        if (bArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        G1.append((int) bArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(c5);
            G1.append((int) bArr[i4]);
        }
    }

    public static String W1(String str, String str2) {
        return (G0(str) || G0(str2) || !str.startsWith(str2)) ? str : str.substring(str2.length());
    }

    public static String[] W2(String... strArr) {
        return X2(strArr, null);
    }

    public static byte[] X(String str, String str2) throws UnsupportedEncodingException {
        return str == null ? e.f85951c : str.getBytes(n.c(str2));
    }

    public static String X0(char[] cArr, char c5) {
        if (cArr == null) {
            return null;
        }
        return Y0(cArr, c5, 0, cArr.length);
    }

    public static String X1(String str, String str2) {
        return (G0(str) || G0(str2) || !Q2(str, str2, true)) ? str : str.substring(str2.length());
    }

    public static String[] X2(String[] strArr, String str) {
        int h02 = e.h0(strArr);
        if (h02 == 0) {
            return strArr;
        }
        String[] strArr2 = new String[h02];
        for (int i4 = 0; i4 < h02; i4++) {
            strArr2[i4] = U2(strArr[i4], str);
        }
        return strArr2;
    }

    public static byte[] Y(String str, Charset charset) {
        return str == null ? e.f85951c : str.getBytes(n.b(charset));
    }

    public static String Y0(char[] cArr, char c5, int i4, int i5) {
        if (cArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        G1.append(cArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(c5);
            G1.append(cArr[i4]);
        }
    }

    public static String Y1(char c5, int i4) {
        if (i4 <= 0) {
            return "";
        }
        char[] cArr = new char[i4];
        for (int i5 = i4 - 1; i5 >= 0; i5--) {
            cArr[i5] = c5;
        }
        return new String(cArr);
    }

    public static String Y2(String str, String str2) {
        int B1 = B1(str);
        if (B1 == 0) {
            return str;
        }
        if (str2 == null) {
            while (B1 != 0 && Character.isWhitespace(str.charAt(B1 - 1))) {
                B1--;
            }
        } else {
            if (str2.isEmpty()) {
                return str;
            }
            while (B1 != 0 && str2.indexOf(str.charAt(B1 - 1)) != -1) {
                B1--;
            }
        }
        return str.substring(0, B1);
    }

    public static String Z(String... strArr) {
        if (e.n1(strArr)) {
            return "";
        }
        int r02 = r0(strArr);
        if (r02 != -1) {
            return r02 == 0 ? "" : strArr[0].substring(0, r02);
        }
        String str = strArr[0];
        return str == null ? "" : str;
    }

    public static String Z0(double[] dArr, char c5) {
        if (dArr == null) {
            return null;
        }
        return a1(dArr, c5, 0, dArr.length);
    }

    public static String Z1(String str, int i4) {
        if (str == null) {
            return null;
        }
        if (i4 <= 0) {
            return "";
        }
        int length = str.length();
        if (i4 == 1 || length == 0) {
            return str;
        }
        if (length == 1 && i4 <= 8192) {
            return Y1(str.charAt(0), i4);
        }
        int i5 = length * i4;
        if (length == 1) {
            return Y1(str.charAt(0), i4);
        }
        if (length != 2) {
            StringBuilder sb = new StringBuilder(i5);
            for (int i6 = 0; i6 < i4; i6++) {
                sb.append(str);
            }
            return sb.toString();
        }
        char charAt = str.charAt(0);
        char charAt2 = str.charAt(1);
        char[] cArr = new char[i5];
        for (int i7 = (i4 * 2) - 2; i7 >= 0; i7 -= 2) {
            cArr[i7] = charAt;
            cArr[i7 + 1] = charAt2;
        }
        return new String(cArr);
    }

    public static String Z2(String str, String str2) {
        int B1 = B1(str);
        if (B1 == 0) {
            return str;
        }
        int i4 = 0;
        if (str2 == null) {
            while (i4 != B1 && Character.isWhitespace(str.charAt(i4))) {
                i4++;
            }
        } else {
            if (str2.isEmpty()) {
                return str;
            }
            while (i4 != B1 && str2.indexOf(str.charAt(i4)) != -1) {
                i4++;
            }
        }
        return str.substring(i4);
    }

    public static String a(String str, int i4) {
        return d(str, "...", 0, i4);
    }

    public static String a0(String str) {
        if (G0(str)) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = str.charAt(i4);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        return sb.toString();
    }

    public static String a1(double[] dArr, char c5, int i4, int i5) {
        if (dArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        G1.append(dArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(c5);
            G1.append(dArr[i4]);
        }
    }

    public static String a2(String str, String str2, int i4) {
        return (str == null || str2 == null) ? Z1(str, i4) : R1(Z1(str.concat(str2), i4), str2);
    }

    public static String a3(String str) {
        return str == null ? "" : U2(str, null);
    }

    public static String b(String str, int i4, int i5) {
        return d(str, "...", i4, i5);
    }

    @Deprecated
    public static int b0(CharSequence charSequence, CharSequence charSequence2, Locale locale) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (locale == null) {
            throw new IllegalArgumentException("Locale must not be null");
        }
        String lowerCase = charSequence.toString().toLowerCase(locale);
        String lowerCase2 = charSequence2.toString().toLowerCase(locale);
        int i4 = Integer.MIN_VALUE;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < lowerCase2.length(); i7++) {
            char charAt = lowerCase2.charAt(i7);
            boolean z4 = false;
            while (i6 < lowerCase.length() && !z4) {
                if (charAt == lowerCase.charAt(i6)) {
                    int i10 = i5 + 1;
                    if (i4 + 1 == i6) {
                        i10 = i5 + 3;
                    }
                    i5 = i10;
                    z4 = true;
                    i4 = i6;
                }
                i6++;
            }
        }
        return i5;
    }

    public static String b1(float[] fArr, char c5) {
        if (fArr == null) {
            return null;
        }
        return c1(fArr, c5, 0, fArr.length);
    }

    public static String b2(String str, String str2, String str3) {
        return d2(str, str2, str3, -1, false);
    }

    public static String b3(String str) {
        if (str == null) {
            return null;
        }
        String U2 = U2(str, null);
        if (U2.isEmpty()) {
            return null;
        }
        return U2;
    }

    public static String c(String str, String str2, int i4) {
        return d(str, str2, 0, i4);
    }

    public static <T extends CharSequence> T c0(T t4, Supplier<T> supplier) {
        if (!F0(t4)) {
            return t4;
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    public static String c1(float[] fArr, char c5, int i4, int i5) {
        if (fArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        G1.append(fArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(c5);
            G1.append(fArr[i4]);
        }
    }

    public static String c2(String str, String str2, String str3, int i4) {
        return d2(str, str2, str3, i4, false);
    }

    public static String c3(String str, int i4) {
        if (str == null) {
            return null;
        }
        if (i4 < 0) {
            i4 += str.length();
        }
        if (i4 < 0) {
            i4 = 0;
        }
        return i4 > str.length() ? "" : str.substring(i4);
    }

    public static String d(String str, String str2, int i4, int i5) {
        if (L0(str) && "".equals(str2) && i5 > 0) {
            return d3(str, 0, i5);
        }
        if (D0(str, str2)) {
            return str;
        }
        int length = str2.length();
        int i6 = length + 1;
        int i7 = length + length + 1;
        if (i5 < i6) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", Integer.valueOf(i6)));
        }
        if (str.length() <= i5) {
            return str;
        }
        if (i4 > str.length()) {
            i4 = str.length();
        }
        int i10 = i5 - length;
        if (str.length() - i4 < i10) {
            i4 = str.length() - i10;
        }
        if (i4 <= i6) {
            return str.substring(0, i10) + str2;
        }
        if (i5 < i7) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", Integer.valueOf(i7)));
        }
        if ((i5 + i4) - length < str.length()) {
            StringBuilder a5 = j4.a(str2);
            a5.append(d(str.substring(i4), str2, 0, i10));
            return a5.toString();
        }
        StringBuilder a6 = j4.a(str2);
        a6.append(str.substring(str.length() - i10));
        return a6.toString();
    }

    public static <T extends CharSequence> T d0(T t4, Supplier<T> supplier) {
        if (!G0(t4)) {
            return t4;
        }
        if (supplier == null) {
            return null;
        }
        return supplier.get();
    }

    public static String d1(int[] iArr, char c5) {
        if (iArr == null) {
            return null;
        }
        return e1(iArr, c5, 0, iArr.length);
    }

    private static String d2(String str, String str2, String str3, int i4, boolean z4) {
        if (G0(str) || G0(str2) || str3 == null || i4 == 0) {
            return str;
        }
        if (z4) {
            str2 = str2.toLowerCase();
        }
        int i5 = 0;
        int t02 = z4 ? t0(str, str2, 0) : k0(str, str2, 0);
        if (t02 == -1) {
            return str;
        }
        int length = str2.length();
        StringBuilder sb = new StringBuilder(str.length() + (Math.max(str3.length() - length, 0) * (i4 < 0 ? 16 : Math.min(i4, 64))));
        while (t02 != -1) {
            sb.append((CharSequence) str, i5, t02);
            sb.append(str3);
            i5 = t02 + length;
            i4--;
            if (i4 == 0) {
                break;
            }
            t02 = z4 ? t0(str, str2, i5) : k0(str, str2, i5);
        }
        sb.append((CharSequence) str, i5, str.length());
        return sb.toString();
    }

    public static String d3(String str, int i4, int i5) {
        if (str == null) {
            return null;
        }
        if (i5 < 0) {
            i5 += str.length();
        }
        if (i4 < 0) {
            i4 += str.length();
        }
        if (i5 > str.length()) {
            i5 = str.length();
        }
        if (i4 > i5) {
            return "";
        }
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        return str.substring(i4, i5);
    }

    public static String e(String str, String str2, int i4) {
        if (D0(str, str2) || i4 >= str.length() || i4 < str2.length() + 2) {
            return str;
        }
        int length = i4 - str2.length();
        int i5 = length / 2;
        return str.substring(0, (length % 2) + i5) + str2 + str.substring(str.length() - i5);
    }

    @Deprecated
    public static double e0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        double d5 = E1(charSequence, charSequence2)[0];
        if (d5 == com.google.firebase.remoteconfig.p.f60679p) {
            return com.google.firebase.remoteconfig.p.f60679p;
        }
        double length = (((d5 - r0[1]) / d5) + ((d5 / charSequence2.length()) + (d5 / charSequence.length()))) / 3.0d;
        if (length >= 0.7d) {
            length = androidx.constraintlayout.core.motion.utils.a.a(1.0d, length, Math.min(0.1d, 1.0d / r0[3]) * r0[2], length);
        }
        return Math.round(length * 100.0d) / 100.0d;
    }

    public static String e1(int[] iArr, char c5, int i4, int i5) {
        if (iArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        G1.append(iArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(c5);
            G1.append(iArr[i4]);
        }
    }

    @Deprecated
    public static String e2(String str, String str2, String str3) {
        return t0.f(str, str2, str3);
    }

    public static String e3(String str, int i4) {
        if (G0(str)) {
            return str;
        }
        int indexOf = str.indexOf(i4);
        return indexOf == -1 ? "" : str.substring(indexOf + 1);
    }

    private static String f(String str, CharSequence charSequence, boolean z4, CharSequence... charSequenceArr) {
        if (str == null || G0(charSequence) || O(str, charSequence, z4)) {
            return str;
        }
        if (e.x1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (O(str, charSequence2, z4)) {
                    return str;
                }
            }
        }
        StringBuilder a5 = j4.a(str);
        a5.append(charSequence.toString());
        return a5.toString();
    }

    @Deprecated
    public static int f0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            return length2;
        }
        if (length2 == 0) {
            return length;
        }
        if (length > length2) {
            length2 = charSequence.length();
            length = length2;
        } else {
            charSequence2 = charSequence;
            charSequence = charSequence2;
        }
        int[] iArr = new int[length + 1];
        for (int i4 = 0; i4 <= length; i4++) {
            iArr[i4] = i4;
        }
        for (int i5 = 1; i5 <= length2; i5++) {
            int i6 = iArr[0];
            char charAt = charSequence.charAt(i5 - 1);
            iArr[0] = i5;
            int i7 = 1;
            while (i7 <= length) {
                int i10 = iArr[i7];
                int i11 = i7 - 1;
                iArr[i7] = Math.min(Math.min(iArr[i11] + 1, iArr[i7] + 1), i6 + (charSequence2.charAt(i11) == charAt ? 0 : 1));
                i7++;
                i6 = i10;
            }
        }
        return iArr[length];
    }

    public static String f1(long[] jArr, char c5) {
        if (jArr == null) {
            return null;
        }
        return g1(jArr, c5, 0, jArr.length);
    }

    public static String f2(String str, char c5, char c6) {
        if (str == null) {
            return null;
        }
        return str.replace(c5, c6);
    }

    public static String f3(String str, String str2) {
        int indexOf;
        return G0(str) ? str : (str2 == null || (indexOf = str.indexOf(str2)) == -1) ? "" : str.substring(str2.length() + indexOf);
    }

    public static String g(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return f(str, charSequence, false, charSequenceArr);
    }

    @Deprecated
    public static int g0(CharSequence charSequence, CharSequence charSequence2, int i4) {
        int i5;
        int i6;
        CharSequence charSequence3;
        CharSequence charSequence4;
        if (charSequence == null || charSequence2 == null) {
            throw new IllegalArgumentException("Strings must not be null");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("Threshold must not be negative");
        }
        int length = charSequence.length();
        int length2 = charSequence2.length();
        if (length == 0) {
            if (length2 <= i4) {
                return length2;
            }
            return -1;
        }
        if (length2 == 0) {
            if (length <= i4) {
                return length;
            }
            return -1;
        }
        if (Math.abs(length - length2) > i4) {
            return -1;
        }
        if (length > length2) {
            i6 = charSequence.length();
            i5 = length2;
            charSequence4 = charSequence;
            charSequence3 = charSequence2;
        } else {
            i5 = length;
            i6 = length2;
            charSequence3 = charSequence;
            charSequence4 = charSequence2;
        }
        int i7 = i5 + 1;
        int[] iArr = new int[i7];
        int[] iArr2 = new int[i7];
        int min = Math.min(i5, i4) + 1;
        char c5 = 0;
        for (int i10 = 0; i10 < min; i10++) {
            iArr[i10] = i10;
        }
        int i11 = Integer.MAX_VALUE;
        Arrays.fill(iArr, min, i7, Integer.MAX_VALUE);
        Arrays.fill(iArr2, Integer.MAX_VALUE);
        int i12 = 1;
        while (i12 <= i6) {
            char charAt = charSequence4.charAt(i12 - 1);
            iArr2[c5] = i12;
            int max = Math.max(1, i12 - i4);
            int min2 = i12 > i11 - i4 ? i5 : Math.min(i5, i12 + i4);
            if (max > min2) {
                return -1;
            }
            if (max > 1) {
                iArr2[max - 1] = i11;
            }
            while (max <= min2) {
                int i13 = max - 1;
                if (charSequence3.charAt(i13) == charAt) {
                    iArr2[max] = iArr[i13];
                } else {
                    iArr2[max] = Math.min(Math.min(iArr2[i13], iArr[max]), iArr[i13]) + 1;
                }
                max++;
            }
            i12++;
            c5 = 0;
            i11 = Integer.MAX_VALUE;
            int[] iArr3 = iArr2;
            iArr2 = iArr;
            iArr = iArr3;
        }
        int i14 = iArr[i5];
        if (i14 <= i4) {
            return i14;
        }
        return -1;
    }

    public static String g1(long[] jArr, char c5, int i4, int i5) {
        if (jArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        G1.append(jArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(c5);
            G1.append(jArr[i4]);
        }
    }

    public static String g2(String str, String str2, String str3) {
        if (G0(str) || G0(str2)) {
            return str;
        }
        if (str3 == null) {
            str3 = "";
        }
        int length = str3.length();
        int length2 = str.length();
        StringBuilder sb = new StringBuilder(length2);
        boolean z4 = false;
        for (int i4 = 0; i4 < length2; i4++) {
            char charAt = str.charAt(i4);
            int indexOf = str2.indexOf(charAt);
            if (indexOf >= 0) {
                if (indexOf < length) {
                    sb.append(str3.charAt(indexOf));
                }
                z4 = true;
            } else {
                sb.append(charAt);
            }
        }
        return z4 ? sb.toString() : str;
    }

    public static String g3(String str, int i4) {
        if (G0(str)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(i4);
        return (lastIndexOf == -1 || lastIndexOf == str.length() + (-1)) ? "" : str.substring(lastIndexOf + 1);
    }

    public static String h(String str, CharSequence charSequence, CharSequence... charSequenceArr) {
        return f(str, charSequence, true, charSequenceArr);
    }

    public static int h0(CharSequence charSequence, int i4) {
        if (G0(charSequence)) {
            return -1;
        }
        return j.b(charSequence, i4, 0);
    }

    @SafeVarargs
    public static <T> String h1(T... tArr) {
        return k1(tArr, null);
    }

    public static String h2(String str, String[] strArr, String[] strArr2) {
        return i2(str, strArr, strArr2, false, 0);
    }

    public static String h3(String str, String str2) {
        int lastIndexOf;
        return G0(str) ? str : (G0(str2) || (lastIndexOf = str.lastIndexOf(str2)) == -1 || lastIndexOf == str.length() - str2.length()) ? "" : str.substring(str2.length() + lastIndexOf);
    }

    public static String i(String str) {
        int B1 = B1(str);
        if (B1 == 0) {
            return str;
        }
        int codePointAt = str.codePointAt(0);
        int titleCase = Character.toTitleCase(codePointAt);
        if (codePointAt == titleCase) {
            return str;
        }
        int[] iArr = new int[B1];
        iArr[0] = titleCase;
        int charCount = Character.charCount(codePointAt);
        int i4 = 1;
        while (charCount < B1) {
            int codePointAt2 = str.codePointAt(charCount);
            iArr[i4] = codePointAt2;
            charCount += Character.charCount(codePointAt2);
            i4++;
        }
        return new String(iArr, 0, i4);
    }

    public static int i0(CharSequence charSequence, int i4, int i5) {
        if (G0(charSequence)) {
            return -1;
        }
        return j.b(charSequence, i4, i5);
    }

    public static String i1(Object[] objArr, char c5) {
        if (objArr == null) {
            return null;
        }
        return j1(objArr, c5, 0, objArr.length);
    }

    private static String i2(String str, String[] strArr, String[] strArr2, boolean z4, int i4) {
        String str2;
        String str3;
        int length;
        if (i4 < 0) {
            HashSet hashSet = new HashSet(Arrays.asList(strArr));
            hashSet.retainAll(new HashSet(Arrays.asList(strArr2)));
            if (hashSet.size() > 0) {
                throw new IllegalStateException("Aborting to protect against StackOverflowError - output of one loop is the input of another");
            }
        }
        if (G0(str) || e.n1(strArr) || e.n1(strArr2) || (e.x1(strArr) && i4 == -1)) {
            return str;
        }
        int length2 = strArr.length;
        int length3 = strArr2.length;
        if (length2 != length3) {
            throw new IllegalArgumentException(androidx.compose.foundation.text.q.a("Search and Replace array lengths don't match: ", length2, " vs ", length3));
        }
        boolean[] zArr = new boolean[length2];
        int i5 = -1;
        int i6 = -1;
        for (int i7 = 0; i7 < length2; i7++) {
            if (!zArr[i7] && !G0(strArr[i7]) && strArr2[i7] != null) {
                int indexOf = str.indexOf(strArr[i7]);
                if (indexOf == -1) {
                    zArr[i7] = true;
                } else if (i5 == -1 || indexOf < i5) {
                    i6 = i7;
                    i5 = indexOf;
                }
            }
        }
        if (i5 == -1) {
            return str;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (strArr[i11] != null && (str3 = strArr2[i11]) != null && (length = str3.length() - strArr[i11].length()) > 0) {
                i10 += length * 3;
            }
        }
        StringBuilder sb = new StringBuilder(str.length() + Math.min(i10, str.length() / 5));
        int i12 = 0;
        while (i5 != -1) {
            while (i12 < i5) {
                sb.append(str.charAt(i12));
                i12++;
            }
            sb.append(strArr2[i6]);
            i12 = strArr[i6].length() + i5;
            i5 = -1;
            i6 = -1;
            for (int i13 = 0; i13 < length2; i13++) {
                if (!zArr[i13] && (str2 = strArr[i13]) != null && !str2.isEmpty() && strArr2[i13] != null) {
                    int indexOf2 = str.indexOf(strArr[i13], i12);
                    if (indexOf2 == -1) {
                        zArr[i13] = true;
                    } else if (i5 == -1 || indexOf2 < i5) {
                        i6 = i13;
                        i5 = indexOf2;
                    }
                }
            }
        }
        int length4 = str.length();
        while (i12 < length4) {
            sb.append(str.charAt(i12));
            i12++;
        }
        String sb2 = sb.toString();
        return !z4 ? sb2 : i2(sb2, strArr, strArr2, z4, i4 - 1);
    }

    public static String i3(String str, String str2) {
        if (G0(str) || str2 == null) {
            return str;
        }
        if (str2.isEmpty()) {
            return "";
        }
        int indexOf = str.indexOf(str2);
        return indexOf == -1 ? str : str.substring(0, indexOf);
    }

    public static String j(String str, int i4) {
        return k(str, i4, ' ');
    }

    public static int j0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return j.c(charSequence, charSequence2, 0);
    }

    public static String j1(Object[] objArr, char c5, int i4, int i5) {
        if (objArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        Object obj = objArr[i4];
        if (obj != null) {
            G1.append(obj);
        }
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(c5);
            Object obj2 = objArr[i4];
            if (obj2 != null) {
                G1.append(obj2);
            }
        }
    }

    public static String j2(String str, String[] strArr, String[] strArr2) {
        return i2(str, strArr, strArr2, true, strArr == null ? 0 : strArr.length);
    }

    public static String j3(String str, String str2) {
        if (G0(str) || G0(str2)) {
            return str;
        }
        int lastIndexOf = str.lastIndexOf(str2);
        return lastIndexOf == -1 ? str : str.substring(0, lastIndexOf);
    }

    public static String k(String str, int i4, char c5) {
        if (str == null || i4 <= 0) {
            return str;
        }
        int length = str.length();
        int i5 = i4 - length;
        return i5 <= 0 ? str : u2(z1(str, (i5 / 2) + length, c5), i4, c5);
    }

    public static int k0(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return j.c(charSequence, charSequence2, i4);
    }

    public static String k1(Object[] objArr, String str) {
        if (objArr == null) {
            return null;
        }
        return l1(objArr, str, 0, objArr.length);
    }

    @Deprecated
    public static String k2(String str, String str2, String str3) {
        return t0.h(str, str2, str3);
    }

    public static String k3(String str, String str2) {
        return l3(str, str2, str2);
    }

    public static String l(String str, int i4, String str2) {
        if (str == null || i4 <= 0) {
            return str;
        }
        if (G0(str2)) {
            str2 = " ";
        }
        int length = str.length();
        int i5 = i4 - length;
        return i5 <= 0 ? str : v2(A1(str, (i5 / 2) + length, str2), i4, str2);
    }

    public static int l0(CharSequence charSequence, String str) {
        if (G0(charSequence) || G0(str)) {
            return -1;
        }
        return m0(charSequence, str.toCharArray());
    }

    public static String l1(Object[] objArr, String str, int i4, int i5) {
        if (objArr == null) {
            return null;
        }
        if (str == null) {
            str = "";
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        Object obj = objArr[i4];
        if (obj != null) {
            G1.append(obj);
        }
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(str);
            Object obj2 = objArr[i4];
            if (obj2 != null) {
                G1.append(obj2);
            }
        }
    }

    public static String l2(String str, String str2, String str3) {
        return d2(str, str2, str3, -1, true);
    }

    public static String l3(String str, String str2, String str3) {
        int indexOf;
        int indexOf2;
        if (!p0.l(str, str2, str3) || (indexOf = str.indexOf(str2)) == -1 || (indexOf2 = str.indexOf(str3, str2.length() + indexOf)) == -1) {
            return null;
        }
        return str.substring(str2.length() + indexOf, indexOf2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0037, code lost:
    
        if (r5 != '\r') goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m(java.lang.String r6) {
        /*
            boolean r0 = G0(r6)
            if (r0 == 0) goto L7
            return r6
        L7:
            int r0 = r6.length()
            r1 = 10
            r2 = 0
            r3 = 1
            r4 = 13
            if (r0 != r3) goto L20
            char r0 = r6.charAt(r2)
            if (r0 == r4) goto L1d
            if (r0 != r1) goto L1c
            goto L1d
        L1c:
            return r6
        L1d:
            java.lang.String r6 = ""
            return r6
        L20:
            int r0 = r6.length()
            int r3 = r0 + (-1)
            char r5 = r6.charAt(r3)
            if (r5 != r1) goto L37
            int r1 = r0 + (-2)
            char r1 = r6.charAt(r1)
            if (r1 != r4) goto L3a
            int r0 = r0 + (-2)
            goto L3b
        L37:
            if (r5 == r4) goto L3a
            goto L3b
        L3a:
            r0 = r3
        L3b:
            java.lang.String r6 = r6.substring(r2, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.apache.commons.lang3.b1.m(java.lang.String):java.lang.String");
    }

    public static int m0(CharSequence charSequence, char... cArr) {
        if (!G0(charSequence) && !e.i1(cArr)) {
            int length = charSequence.length();
            int i4 = length - 1;
            int length2 = cArr.length;
            int i5 = length2 - 1;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                for (int i7 = 0; i7 < length2; i7++) {
                    if (cArr[i7] == charAt && (i6 >= i4 || i7 >= i5 || !Character.isHighSurrogate(charAt) || cArr[i7 + 1] == charSequence.charAt(i6 + 1))) {
                        return i6;
                    }
                }
            }
        }
        return -1;
    }

    public static String m1(short[] sArr, char c5) {
        if (sArr == null) {
            return null;
        }
        return n1(sArr, c5, 0, sArr.length);
    }

    public static String m2(String str, String str2, String str3, int i4) {
        return d2(str, str2, str3, i4, true);
    }

    public static String[] m3(String str, String str2, String str3) {
        int indexOf;
        int i4;
        int indexOf2;
        if (str == null || G0(str2) || G0(str3)) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return e.f85969u;
        }
        int length2 = str3.length();
        int length3 = str2.length();
        ArrayList arrayList = new ArrayList();
        int i5 = 0;
        while (i5 < length - length2 && (indexOf = str.indexOf(str2, i5)) >= 0 && (indexOf2 = str.indexOf(str3, (i4 = indexOf + length3))) >= 0) {
            arrayList.add(str.substring(i4, indexOf2));
            i5 = indexOf2 + length2;
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return (String[]) arrayList.toArray(e.f85969u);
    }

    @Deprecated
    public static String n(String str, String str2) {
        return R1(str, str2);
    }

    public static int n0(CharSequence charSequence, CharSequence... charSequenceArr) {
        int c5;
        if (charSequence == null || charSequenceArr == null) {
            return -1;
        }
        int i4 = Integer.MAX_VALUE;
        for (CharSequence charSequence2 : charSequenceArr) {
            if (charSequence2 != null && (c5 = j.c(charSequence, charSequence2, 0)) != -1 && c5 < i4) {
                i4 = c5;
            }
        }
        if (i4 == Integer.MAX_VALUE) {
            return -1;
        }
        return i4;
    }

    public static String n1(short[] sArr, char c5, int i4, int i5) {
        if (sArr == null) {
            return null;
        }
        int i6 = i5 - i4;
        if (i6 <= 0) {
            return "";
        }
        StringBuilder G1 = G1(i6);
        G1.append((int) sArr[i4]);
        while (true) {
            i4++;
            if (i4 >= i5) {
                return G1.toString();
            }
            G1.append(c5);
            G1.append((int) sArr[i4]);
        }
    }

    public static String n2(String str, String str2, String str3) {
        return d2(str, str2, str3, 1, false);
    }

    public static String n3(String str) {
        if (G0(str)) {
            return str;
        }
        int length = str.length();
        int[] iArr = new int[length];
        int i4 = 0;
        int i5 = 0;
        while (i4 < length) {
            int codePointAt = str.codePointAt(i4);
            if (Character.isUpperCase(codePointAt) || Character.isTitleCase(codePointAt)) {
                codePointAt = Character.toLowerCase(codePointAt);
            } else if (Character.isLowerCase(codePointAt)) {
                codePointAt = Character.toUpperCase(codePointAt);
            }
            iArr[i5] = codePointAt;
            i4 += Character.charCount(codePointAt);
            i5++;
        }
        return new String(iArr, 0, i5);
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length < 2) {
            return "";
        }
        int i4 = length - 1;
        String substring = str.substring(0, i4);
        if (str.charAt(i4) == '\n') {
            int i5 = length - 2;
            if (substring.charAt(i5) == '\r') {
                return substring.substring(0, i5);
            }
        }
        return substring;
    }

    public static int o0(CharSequence charSequence, CharSequence charSequence2) {
        if (!G0(charSequence) && !G0(charSequence2)) {
            int length = charSequence.length();
            int i4 = 0;
            while (i4 < length) {
                char charAt = charSequence.charAt(i4);
                boolean z4 = j.b(charSequence2, charAt, 0) >= 0;
                int i5 = i4 + 1;
                if (i5 < length && Character.isHighSurrogate(charAt)) {
                    char charAt2 = charSequence.charAt(i5);
                    if (z4 && j.b(charSequence2, charAt2, 0) < 0) {
                        return i4;
                    }
                } else if (!z4) {
                    return i4;
                }
                i4 = i5;
            }
        }
        return -1;
    }

    public static String o1(String str, Object... objArr) {
        if (objArr == null) {
            throw new IllegalArgumentException("Object varargs must not be null");
        }
        if (str == null) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = Arrays.asList(objArr).iterator();
        while (it.hasNext()) {
            sb.append(Objects.toString(it.next(), ""));
            if (it.hasNext()) {
                sb.append(str);
            }
        }
        return sb.toString();
    }

    public static String o2(String str, String str2, String str3) {
        return d2(str, str2, str3, 1, true);
    }

    public static int[] o3(CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        if (charSequence.length() == 0) {
            return e.f85961m;
        }
        String charSequence2 = charSequence.toString();
        int codePointCount = charSequence2.codePointCount(0, charSequence2.length());
        int[] iArr = new int[codePointCount];
        int i4 = 0;
        for (int i5 = 0; i5 < codePointCount; i5++) {
            int codePointAt = charSequence2.codePointAt(i4);
            iArr[i5] = codePointAt;
            i4 += Character.charCount(codePointAt);
        }
        return iArr;
    }

    public static int p(String str, String str2) {
        return q(str, str2, true);
    }

    public static int p0(CharSequence charSequence, char... cArr) {
        if (!G0(charSequence) && !e.i1(cArr)) {
            int length = charSequence.length();
            int i4 = length - 1;
            int length2 = cArr.length;
            int i5 = length2 - 1;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                for (int i7 = 0; i7 < length2; i7++) {
                    if (cArr[i7] != charAt || (i6 < i4 && i7 < i5 && Character.isHighSurrogate(charAt) && cArr[i7 + 1] != charSequence.charAt(i6 + 1))) {
                    }
                }
                return i6;
            }
        }
        return -1;
    }

    public static int p1(CharSequence charSequence, int i4) {
        if (G0(charSequence)) {
            return -1;
        }
        return j.d(charSequence, i4, charSequence.length());
    }

    @Deprecated
    public static String p2(String str, String str2, String str3) {
        return t0.j(str, str2, str3);
    }

    public static String p3(byte[] bArr, Charset charset) {
        return new String(bArr, n.b(charset));
    }

    public static int q(String str, String str2, boolean z4) {
        if (str == str2) {
            return 0;
        }
        return str == null ? z4 ? -1 : 1 : str2 == null ? z4 ? 1 : -1 : str.compareTo(str2);
    }

    public static int q0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == charSequence2) {
            return -1;
        }
        int i4 = 0;
        if (charSequence != null && charSequence2 != null) {
            while (i4 < charSequence.length() && i4 < charSequence2.length() && charSequence.charAt(i4) == charSequence2.charAt(i4)) {
                i4++;
            }
            if (i4 >= charSequence2.length() && i4 >= charSequence.length()) {
                return -1;
            }
        }
        return i4;
    }

    public static int q1(CharSequence charSequence, int i4, int i5) {
        if (G0(charSequence)) {
            return -1;
        }
        return j.d(charSequence, i4, i5);
    }

    public static String q2(String str) {
        if (str == null) {
            return null;
        }
        return new StringBuilder(str).reverse().toString();
    }

    public static String q3(String str) {
        if (str == null) {
            return null;
        }
        return str.toLowerCase(Locale.ROOT);
    }

    public static int r(String str, String str2) {
        return s(str, str2, true);
    }

    public static int r0(CharSequence... charSequenceArr) {
        if (e.h0(charSequenceArr) <= 1) {
            return -1;
        }
        int length = charSequenceArr.length;
        int i4 = Integer.MAX_VALUE;
        boolean z4 = true;
        int i5 = 0;
        boolean z5 = false;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence == null) {
                z5 = true;
                i4 = 0;
            } else {
                i4 = Math.min(charSequence.length(), i4);
                i5 = Math.max(charSequence.length(), i5);
                z4 = false;
            }
        }
        if (z4 || (i5 == 0 && !z5)) {
            return -1;
        }
        if (i4 == 0) {
            return 0;
        }
        int i6 = -1;
        for (int i7 = 0; i7 < i4; i7++) {
            char charAt = charSequenceArr[0].charAt(i7);
            int i10 = 1;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                if (charSequenceArr[i10].charAt(i7) != charAt) {
                    i6 = i7;
                    break;
                }
                i10++;
            }
            if (i6 != -1) {
                break;
            }
        }
        return (i6 != -1 || i4 == i5) ? i6 : i4;
    }

    public static int r1(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return j.e(charSequence, charSequence2, charSequence.length());
    }

    public static String r2(String str, char c5) {
        if (str == null) {
            return null;
        }
        String[] N2 = N2(str, c5, false);
        e.a4(N2);
        return i1(N2, c5);
    }

    public static String r3(String str) {
        if (str == null) {
            return null;
        }
        return str.toUpperCase(Locale.ROOT);
    }

    public static int s(String str, String str2, boolean z4) {
        if (str == str2) {
            return 0;
        }
        return str == null ? z4 ? -1 : 1 : str2 == null ? z4 ? 1 : -1 : str.compareToIgnoreCase(str2);
    }

    public static int s0(CharSequence charSequence, CharSequence charSequence2) {
        return t0(charSequence, charSequence2, 0);
    }

    public static int s1(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return j.e(charSequence, charSequence2, i4);
    }

    public static String s2(String str, int i4) {
        if (str == null) {
            return null;
        }
        return i4 < 0 ? "" : str.length() <= i4 ? str : str.substring(str.length() - i4);
    }

    @Deprecated
    public static String s3(byte[] bArr, String str) throws UnsupportedEncodingException {
        return str != null ? new String(bArr, str) : new String(bArr, Charset.defaultCharset());
    }

    public static boolean t(CharSequence charSequence, int i4) {
        return !G0(charSequence) && j.b(charSequence, i4, 0) >= 0;
    }

    public static int t0(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence != null && charSequence2 != null) {
            if (i4 < 0) {
                i4 = 0;
            }
            int length = (charSequence.length() - charSequence2.length()) + 1;
            if (i4 > length) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i4;
            }
            while (i4 < length) {
                if (j.f(charSequence, true, i4, charSequence2, 0, charSequence2.length())) {
                    return i4;
                }
                i4++;
            }
        }
        return -1;
    }

    public static int t1(CharSequence charSequence, CharSequence... charSequenceArr) {
        int e4;
        int i4 = -1;
        if (charSequence != null && charSequenceArr != null) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (charSequence2 != null && (e4 = j.e(charSequence, charSequence2, charSequence.length())) > i4) {
                    i4 = e4;
                }
            }
        }
        return i4;
    }

    public static String t2(String str, int i4) {
        return u2(str, i4, ' ');
    }

    public static String t3(String str) {
        if (str == null) {
            return null;
        }
        return str.trim();
    }

    public static boolean u(CharSequence charSequence, CharSequence charSequence2) {
        return (charSequence == null || charSequence2 == null || j.c(charSequence, charSequence2, 0) < 0) ? false : true;
    }

    public static boolean u0(CharSequence... charSequenceArr) {
        if (e.n1(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (K0(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static int u1(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null || charSequence2 == null) {
            return -1;
        }
        return v1(charSequence, charSequence2, charSequence.length());
    }

    public static String u2(String str, int i4, char c5) {
        if (str == null) {
            return null;
        }
        int length = i4 - str.length();
        return length <= 0 ? str : length > 8192 ? v2(str, i4, String.valueOf(c5)) : str.concat(Y1(c5, length));
    }

    public static String u3(String str) {
        return str == null ? "" : str.trim();
    }

    public static boolean v(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence2 == null) {
            return false;
        }
        return w(charSequence, j.h(charSequence2));
    }

    public static boolean v0(CharSequence... charSequenceArr) {
        if (e.n1(charSequenceArr)) {
            return true;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (L0(charSequence)) {
                return false;
            }
        }
        return true;
    }

    public static int v1(CharSequence charSequence, CharSequence charSequence2, int i4) {
        if (charSequence != null && charSequence2 != null) {
            if (i4 > charSequence.length() - charSequence2.length()) {
                i4 = charSequence.length() - charSequence2.length();
            }
            if (i4 < 0) {
                return -1;
            }
            if (charSequence2.length() == 0) {
                return i4;
            }
            while (i4 >= 0) {
                if (j.f(charSequence, true, i4, charSequence2, 0, charSequence2.length())) {
                    return i4;
                }
                i4--;
            }
        }
        return -1;
    }

    public static String v2(String str, int i4, String str2) {
        if (str == null) {
            return null;
        }
        if (G0(str2)) {
            str2 = " ";
        }
        int length = str2.length();
        int length2 = i4 - str.length();
        if (length2 <= 0) {
            return str;
        }
        if (length == 1 && length2 <= 8192) {
            return u2(str, i4, str2.charAt(0));
        }
        if (length2 == length) {
            return str.concat(str2);
        }
        if (length2 < length) {
            return str.concat(str2.substring(0, length2));
        }
        char[] cArr = new char[length2];
        char[] charArray = str2.toCharArray();
        for (int i5 = 0; i5 < length2; i5++) {
            cArr[i5] = charArray[i5 % length];
        }
        return str.concat(new String(cArr));
    }

    public static String v3(String str) {
        String t32 = t3(str);
        if (G0(t32)) {
            return null;
        }
        return t32;
    }

    public static boolean w(CharSequence charSequence, char... cArr) {
        if (!G0(charSequence) && !e.i1(cArr)) {
            int length = charSequence.length();
            int length2 = cArr.length;
            int i4 = length - 1;
            int i5 = length2 - 1;
            for (int i6 = 0; i6 < length; i6++) {
                char charAt = charSequence.charAt(i6);
                for (int i7 = 0; i7 < length2; i7++) {
                    if (cArr[i7] == charAt) {
                        if (!Character.isHighSurrogate(charAt) || i7 == i5) {
                            return true;
                        }
                        if (i6 < i4 && cArr[i7 + 1] == charSequence.charAt(i6 + 1)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public static boolean w0(CharSequence charSequence) {
        if (G0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLowerCase(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static int w1(CharSequence charSequence, CharSequence charSequence2, int i4) {
        return J1(charSequence, charSequence2, i4, true);
    }

    public static String w2(String str, int i4) {
        int i5;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (i4 == 0 || length == 0 || (i5 = i4 % length) == 0) {
            return str;
        }
        StringBuilder sb = new StringBuilder(length);
        int i6 = -i5;
        sb.append(c3(str, i6));
        sb.append(d3(str, 0, i6));
        return sb.toString();
    }

    public static String w3(String str, int i4) {
        return x3(str, 0, i4);
    }

    public static boolean x(CharSequence charSequence, CharSequence... charSequenceArr) {
        if (!G0(charSequence) && !e.n1(charSequenceArr)) {
            for (CharSequence charSequence2 : charSequenceArr) {
                if (u(charSequence, charSequence2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean x0(CharSequence charSequence) {
        if (G0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isUpperCase(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String x1(String str, int i4) {
        if (str == null) {
            return null;
        }
        return i4 < 0 ? "" : str.length() <= i4 ? str : str.substring(0, i4);
    }

    public static String[] x2(String str) {
        return O2(str, null, -1, false);
    }

    public static String x3(String str, int i4, int i5) {
        if (i4 < 0) {
            throw new IllegalArgumentException("offset cannot be negative");
        }
        if (i5 < 0) {
            throw new IllegalArgumentException("maxWith cannot be negative");
        }
        if (str == null) {
            return null;
        }
        return i4 > str.length() ? "" : str.length() > i5 ? str.substring(i4, Math.min(i5 + i4, str.length())) : str.substring(i4);
    }

    public static boolean y(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence != null && charSequence2 != null) {
            int length = charSequence2.length();
            int length2 = charSequence.length() - length;
            for (int i4 = 0; i4 <= length2; i4++) {
                if (j.f(charSequence, true, i4, charSequence2, 0, length)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean y0(CharSequence charSequence) {
        if (G0(charSequence)) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetter(charSequence.charAt(i4))) {
                return false;
            }
        }
        return true;
    }

    public static String y1(String str, int i4) {
        return z1(str, i4, ' ');
    }

    public static String[] y2(String str, char c5) {
        return N2(str, c5, false);
    }

    public static String y3(String str) {
        int B1 = B1(str);
        if (B1 == 0) {
            return str;
        }
        int codePointAt = str.codePointAt(0);
        int lowerCase = Character.toLowerCase(codePointAt);
        if (codePointAt == lowerCase) {
            return str;
        }
        int[] iArr = new int[B1];
        iArr[0] = lowerCase;
        int charCount = Character.charCount(codePointAt);
        int i4 = 1;
        while (charCount < B1) {
            int codePointAt2 = str.codePointAt(charCount);
            iArr[i4] = codePointAt2;
            charCount += Character.charCount(codePointAt2);
            i4++;
        }
        return new String(iArr, 0, i4);
    }

    public static boolean z(CharSequence charSequence, String str) {
        if (charSequence == null || str == null) {
            return true;
        }
        return A(charSequence, str.toCharArray());
    }

    public static boolean z0(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i4 = 0; i4 < length; i4++) {
            if (!Character.isLetter(charSequence.charAt(i4)) && charSequence.charAt(i4) != ' ') {
                return false;
            }
        }
        return true;
    }

    public static String z1(String str, int i4, char c5) {
        if (str == null) {
            return null;
        }
        int length = i4 - str.length();
        return length <= 0 ? str : length > 8192 ? A1(str, i4, String.valueOf(c5)) : Y1(c5, length).concat(str);
    }

    public static String[] z2(String str, String str2) {
        return O2(str, str2, -1, false);
    }

    public static String z3(String str, char c5) {
        return (G0(str) || c5 == 0 || str.length() == 1 || str.charAt(0) != c5 || str.charAt(str.length() - 1) != c5) ? str : androidx.core.content.f.a(str, 1, 1);
    }
}
