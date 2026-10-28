package org.apache.commons.io;

import androidx.compose.runtime.z4;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: FilenameUtils.java */
/* loaded from: classes4.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    public static final char f85536a = '.';

    /* renamed from: c, reason: collision with root package name */
    private static final char f85538c = '/';

    /* renamed from: d, reason: collision with root package name */
    private static final char f85539d = '\\';

    /* renamed from: f, reason: collision with root package name */
    private static final char f85541f;

    /* renamed from: b, reason: collision with root package name */
    public static final String f85537b = Character.toString('.');

    /* renamed from: e, reason: collision with root package name */
    private static final char f85540e = File.separatorChar;

    static {
        if (z()) {
            f85541f = '/';
        } else {
            f85541f = '\\';
        }
    }

    public static String A(String str) {
        return e(str, f85540e, true);
    }

    public static String B(String str, boolean z4) {
        return e(str, z4 ? '/' : '\\', true);
    }

    public static String C(String str) {
        return e(str, f85540e, false);
    }

    public static String D(String str, boolean z4) {
        return e(str, z4 ? '/' : '\\', false);
    }

    public static String E(String str) {
        if (str == null) {
            return null;
        }
        int t4 = t(str);
        return t4 == -1 ? str : str.substring(0, t4);
    }

    public static String F(String str) {
        if (str == null) {
            return null;
        }
        return z() ? H(str) : G(str);
    }

    public static String G(String str) {
        return (str == null || str.indexOf(92) == -1) ? str : str.replace('\\', '/');
    }

    public static String H(String str) {
        return (str == null || str.indexOf(47) == -1) ? str : str.replace('/', '\\');
    }

    static String[] I(String str) {
        if (str.indexOf(63) == -1 && str.indexOf(42) == -1) {
            return new String[]{str};
        }
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        for (int i4 = 0; i4 < charArray.length; i4++) {
            char c5 = charArray[i4];
            if (c5 == '?' || c5 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (charArray[i4] == '?') {
                    arrayList.add("?");
                } else if (arrayList.isEmpty() || (i4 > 0 && !((String) z4.a(arrayList, 1)).equals("*"))) {
                    arrayList.add("*");
                }
            } else {
                sb.append(c5);
            }
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean J(String str, String str2) {
        return K(str, str2, l.f85545d);
    }

    public static boolean K(String str, String str2, l lVar) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (lVar == null) {
                lVar = l.f85545d;
            }
            String[] I = I(str2);
            Stack stack = new Stack();
            boolean z4 = false;
            int i4 = 0;
            int i5 = 0;
            do {
                if (stack.size() > 0) {
                    int[] iArr = (int[]) stack.pop();
                    i5 = iArr[0];
                    i4 = iArr[1];
                    z4 = true;
                }
                while (i5 < I.length) {
                    if (I[i5].equals("?")) {
                        i4++;
                        if (i4 > str.length()) {
                            break;
                        }
                        z4 = false;
                        i5++;
                    } else if (I[i5].equals("*")) {
                        if (i5 == I.length - 1) {
                            i4 = str.length();
                        }
                        z4 = true;
                        i5++;
                    } else {
                        if (z4) {
                            i4 = lVar.d(str, i4, I[i5]);
                            if (i4 == -1) {
                                break;
                            }
                            int d5 = lVar.d(str, i4 + 1, I[i5]);
                            if (d5 >= 0) {
                                stack.push(new int[]{i5, d5});
                            }
                            i4 = I[i5].length() + i4;
                            z4 = false;
                        } else {
                            if (!lVar.e(str, i4, I[i5])) {
                                break;
                            }
                            i4 = I[i5].length() + i4;
                            z4 = false;
                        }
                        i5++;
                    }
                }
                if (i5 == I.length && i4 == str.length()) {
                    return true;
                }
            } while (stack.size() > 0);
        }
        return false;
    }

    public static boolean L(String str, String str2) {
        return K(str, str2, l.f85547f);
    }

    public static String a(String str, String str2) {
        int s4 = s(str2);
        if (s4 < 0) {
            return null;
        }
        if (s4 > 0) {
            return A(str2);
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return A(str2);
        }
        if (y(str.charAt(length - 1))) {
            return A(str + str2);
        }
        return A(str + '/' + str2);
    }

    public static boolean b(String str, String str2) throws IOException {
        if (str == null) {
            throw new IllegalArgumentException("Directory must not be null");
        }
        if (str2 == null) {
            return false;
        }
        l lVar = l.f85547f;
        if (lVar.c(str, str2)) {
            return false;
        }
        return lVar.f(str2, str);
    }

    private static String c(String str, boolean z4) {
        int s4;
        if (str == null || (s4 = s(str)) < 0) {
            return null;
        }
        if (s4 >= str.length()) {
            return z4 ? r(str) : str;
        }
        int u4 = u(str);
        if (u4 < 0) {
            return str.substring(0, s4);
        }
        int i4 = u4 + (z4 ? 1 : 0);
        if (i4 == 0) {
            i4++;
        }
        return str.substring(0, i4);
    }

    private static String d(String str, int i4) {
        int s4;
        if (str == null || (s4 = s(str)) < 0) {
            return null;
        }
        int u4 = u(str);
        int i5 = i4 + u4;
        return (s4 >= str.length() || u4 < 0 || s4 >= i5) ? "" : str.substring(s4, i5);
    }

    private static String e(String str, char c5, boolean z4) {
        boolean z5;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int s4 = s(str);
        if (s4 < 0) {
            return null;
        }
        int i4 = length + 2;
        char[] cArr = new char[i4];
        str.getChars(0, str.length(), cArr, 0);
        char c6 = f85540e;
        if (c5 == c6) {
            c6 = f85541f;
        }
        for (int i5 = 0; i5 < i4; i5++) {
            if (cArr[i5] == c6) {
                cArr[i5] = c5;
            }
        }
        if (cArr[length - 1] != c5) {
            cArr[length] = c5;
            length++;
            z5 = false;
        } else {
            z5 = true;
        }
        int i6 = s4 + 1;
        int i7 = i6;
        while (i7 < length) {
            if (cArr[i7] == c5) {
                int i10 = i7 - 1;
                if (cArr[i10] == c5) {
                    System.arraycopy(cArr, i7, cArr, i10, length - i7);
                    length--;
                    i7--;
                }
            }
            i7++;
        }
        int i11 = i6;
        while (i11 < length) {
            if (cArr[i11] == c5) {
                int i12 = i11 - 1;
                if (cArr[i12] == '.' && (i11 == i6 || cArr[i11 - 2] == c5)) {
                    if (i11 == length - 1) {
                        z5 = true;
                    }
                    System.arraycopy(cArr, i11 + 1, cArr, i12, length - i11);
                    length -= 2;
                    i11--;
                }
            }
            i11++;
        }
        int i13 = s4 + 2;
        int i14 = i13;
        while (i14 < length) {
            if (cArr[i14] == c5 && cArr[i14 - 1] == '.' && cArr[i14 - 2] == '.' && (i14 == i13 || cArr[i14 - 3] == c5)) {
                if (i14 == i13) {
                    return null;
                }
                if (i14 == length - 1) {
                    z5 = true;
                }
                int i15 = i14 - 4;
                while (true) {
                    if (i15 < s4) {
                        int i16 = i14 + 1;
                        System.arraycopy(cArr, i16, cArr, s4, length - i14);
                        length -= i16 - s4;
                        i14 = i6;
                        break;
                    }
                    if (cArr[i15] == c5) {
                        int i17 = i15 + 1;
                        System.arraycopy(cArr, i14 + 1, cArr, i17, length - i14);
                        length -= i14 - i15;
                        i14 = i17;
                        break;
                    }
                    i15--;
                }
            }
            i14++;
        }
        return length <= 0 ? "" : length <= s4 ? new String(cArr, 0, length) : (z5 && z4) ? new String(cArr, 0, length) : new String(cArr, 0, length - 1);
    }

    public static boolean f(String str, String str2) {
        return g(str, str2, false, l.f85545d);
    }

    public static boolean g(String str, String str2, boolean z4, l lVar) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z4) {
            str = A(str);
            str2 = A(str2);
            if (str == null || str2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (lVar == null) {
            lVar = l.f85545d;
        }
        return lVar.c(str, str2);
    }

    public static boolean h(String str, String str2) {
        return g(str, str2, true, l.f85545d);
    }

    public static boolean i(String str, String str2) {
        return g(str, str2, true, l.f85547f);
    }

    public static boolean j(String str, String str2) {
        return g(str, str2, false, l.f85547f);
    }

    public static String k(String str) {
        return E(o(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        int t4 = t(str);
        return t4 == -1 ? "" : str.substring(t4 + 1);
    }

    public static String m(String str) {
        return c(str, true);
    }

    public static String n(String str) {
        return c(str, false);
    }

    public static String o(String str) {
        if (str == null) {
            return null;
        }
        return str.substring(u(str) + 1);
    }

    public static String p(String str) {
        return d(str, 1);
    }

    public static String q(String str) {
        return d(str, 0);
    }

    public static String r(String str) {
        int s4;
        if (str != null && (s4 = s(str)) >= 0) {
            return s4 > str.length() ? str.concat("/") : str.substring(0, s4);
        }
        return null;
    }

    public static int s(String str) {
        int min;
        if (str == null) {
            return -1;
        }
        int length = str.length();
        if (length == 0) {
            return 0;
        }
        char charAt = str.charAt(0);
        if (charAt == ':') {
            return -1;
        }
        if (length == 1) {
            if (charAt == '~') {
                return 2;
            }
            return y(charAt) ? 1 : 0;
        }
        if (charAt == '~') {
            int indexOf = str.indexOf(47, 1);
            int indexOf2 = str.indexOf(92, 1);
            if (indexOf == -1 && indexOf2 == -1) {
                return length + 1;
            }
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            if (indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            min = Math.min(indexOf, indexOf2);
        } else {
            char charAt2 = str.charAt(1);
            if (charAt2 == ':') {
                char upperCase = Character.toUpperCase(charAt);
                if (upperCase < 'A' || upperCase > 'Z') {
                    return -1;
                }
                return (length == 2 || !y(str.charAt(2))) ? 2 : 3;
            }
            if (!y(charAt) || !y(charAt2)) {
                return y(charAt) ? 1 : 0;
            }
            int indexOf3 = str.indexOf(47, 2);
            int indexOf4 = str.indexOf(92, 2);
            if ((indexOf3 == -1 && indexOf4 == -1) || indexOf3 == 2 || indexOf4 == 2) {
                return -1;
            }
            if (indexOf3 == -1) {
                indexOf3 = indexOf4;
            }
            if (indexOf4 == -1) {
                indexOf4 = indexOf3;
            }
            min = Math.min(indexOf3, indexOf4);
        }
        return min + 1;
    }

    public static int t(String str) {
        int lastIndexOf;
        if (str != null && u(str) <= (lastIndexOf = str.lastIndexOf(46))) {
            return lastIndexOf;
        }
        return -1;
    }

    public static int u(String str) {
        if (str == null) {
            return -1;
        }
        return Math.max(str.lastIndexOf(47), str.lastIndexOf(92));
    }

    public static boolean v(String str, String str2) {
        if (str == null) {
            return false;
        }
        return (str2 == null || str2.length() == 0) ? t(str) == -1 : l(str).equals(str2);
    }

    public static boolean w(String str, Collection<String> collection) {
        if (str == null) {
            return false;
        }
        if (collection == null || collection.isEmpty()) {
            return t(str) == -1;
        }
        String l4 = l(str);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (l4.equals(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean x(String str, String[] strArr) {
        if (str == null) {
            return false;
        }
        if (strArr == null || strArr.length == 0) {
            return t(str) == -1;
        }
        String l4 = l(str);
        for (String str2 : strArr) {
            if (l4.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean y(char c5) {
        return c5 == '/' || c5 == '\\';
    }

    static boolean z() {
        return f85540e == '\\';
    }
}
