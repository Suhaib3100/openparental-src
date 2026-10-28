package org.apache.commons.io;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Stack;

/* compiled from: FilenameUtils.java */
/* loaded from: classes5.dex */
public class k {

    /* renamed from: c, reason: collision with root package name */
    private static final char f32028c = '/';

    /* renamed from: d, reason: collision with root package name */
    private static final char f32029d = '\\';

    /* renamed from: f, reason: collision with root package name */
    private static final char f32031f;

    /* renamed from: a, reason: collision with root package name */
    public static final char f32026a = '.';

    /* renamed from: b, reason: collision with root package name */
    public static final String f32027b = Character.toString(f32026a);

    /* renamed from: e, reason: collision with root package name */
    private static final char f32030e = File.separatorChar;

    static {
        if (z()) {
            f32031f = '/';
        } else {
            f32031f = '\\';
        }
    }

    public static String A(String str) {
        return e(str, f32030e, true);
    }

    public static String B(String str, boolean z5) {
        return e(str, z5 ? '/' : '\\', true);
    }

    public static String C(String str) {
        return e(str, f32030e, false);
    }

    public static String D(String str, boolean z5) {
        return e(str, z5 ? '/' : '\\', false);
    }

    public static String E(String str) {
        if (str == null) {
            return null;
        }
        int t5 = t(str);
        return t5 == -1 ? str : str.substring(0, t5);
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
        for (int i5 = 0; i5 < charArray.length; i5++) {
            char c6 = charArray[i5];
            if (c6 == '?' || c6 == '*') {
                if (sb.length() != 0) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
                if (charArray[i5] == '?') {
                    arrayList.add("?");
                } else if (arrayList.isEmpty() || (i5 > 0 && !((String) arrayList.get(arrayList.size() - 1)).equals("*"))) {
                    arrayList.add("*");
                }
            } else {
                sb.append(c6);
            }
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean J(String str, String str2) {
        return K(str, str2, m.f32035q);
    }

    public static boolean K(String str, String str2, m mVar) {
        if (str == null && str2 == null) {
            return true;
        }
        if (str != null && str2 != null) {
            if (mVar == null) {
                mVar = m.f32035q;
            }
            String[] I = I(str2);
            Stack stack = new Stack();
            boolean z5 = false;
            int i5 = 0;
            int i6 = 0;
            do {
                if (stack.size() > 0) {
                    int[] iArr = (int[]) stack.pop();
                    i6 = iArr[0];
                    i5 = iArr[1];
                    z5 = true;
                }
                while (i6 < I.length) {
                    if (I[i6].equals("?")) {
                        i5++;
                        if (i5 > str.length()) {
                            break;
                        }
                        z5 = false;
                        i6++;
                    } else if (I[i6].equals("*")) {
                        if (i6 == I.length - 1) {
                            i5 = str.length();
                        }
                        z5 = true;
                        i6++;
                    } else {
                        if (z5) {
                            i5 = mVar.d(str, i5, I[i6]);
                            if (i5 == -1) {
                                break;
                            }
                            int d6 = mVar.d(str, i5 + 1, I[i6]);
                            if (d6 >= 0) {
                                stack.push(new int[]{i6, d6});
                            }
                            i5 = I[i6].length() + i5;
                            z5 = false;
                        } else {
                            if (!mVar.e(str, i5, I[i6])) {
                                break;
                            }
                            i5 = I[i6].length() + i5;
                            z5 = false;
                        }
                        i6++;
                    }
                }
                if (i6 == I.length && i5 == str.length()) {
                    return true;
                }
            } while (stack.size() > 0);
        }
        return false;
    }

    public static boolean L(String str, String str2) {
        return K(str, str2, m.f32037s);
    }

    public static String a(String str, String str2) {
        int s5 = s(str2);
        if (s5 < 0) {
            return null;
        }
        if (s5 > 0) {
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
        m mVar = m.f32037s;
        if (mVar.c(str, str2)) {
            return false;
        }
        return mVar.f(str2, str);
    }

    private static String c(String str, boolean z5) {
        int s5;
        if (str == null || (s5 = s(str)) < 0) {
            return null;
        }
        if (s5 >= str.length()) {
            return z5 ? r(str) : str;
        }
        int u5 = u(str);
        if (u5 < 0) {
            return str.substring(0, s5);
        }
        int i5 = u5 + (z5 ? 1 : 0);
        if (i5 == 0) {
            i5++;
        }
        return str.substring(0, i5);
    }

    private static String d(String str, int i5) {
        int s5;
        if (str == null || (s5 = s(str)) < 0) {
            return null;
        }
        int u5 = u(str);
        int i6 = i5 + u5;
        return (s5 >= str.length() || u5 < 0 || s5 >= i6) ? "" : str.substring(s5, i6);
    }

    private static String e(String str, char c6, boolean z5) {
        boolean z6;
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 0) {
            return str;
        }
        int s5 = s(str);
        if (s5 < 0) {
            return null;
        }
        int i5 = length + 2;
        char[] cArr = new char[i5];
        str.getChars(0, str.length(), cArr, 0);
        char c7 = f32030e;
        if (c6 == c7) {
            c7 = f32031f;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (cArr[i6] == c7) {
                cArr[i6] = c6;
            }
        }
        if (cArr[length - 1] != c6) {
            cArr[length] = c6;
            length++;
            z6 = false;
        } else {
            z6 = true;
        }
        int i7 = s5 + 1;
        int i8 = i7;
        while (i8 < length) {
            if (cArr[i8] == c6) {
                int i9 = i8 - 1;
                if (cArr[i9] == c6) {
                    System.arraycopy(cArr, i8, cArr, i9, length - i8);
                    length--;
                    i8--;
                }
            }
            i8++;
        }
        int i10 = i7;
        while (i10 < length) {
            if (cArr[i10] == c6) {
                int i11 = i10 - 1;
                if (cArr[i11] == '.' && (i10 == i7 || cArr[i10 - 2] == c6)) {
                    if (i10 == length - 1) {
                        z6 = true;
                    }
                    System.arraycopy(cArr, i10 + 1, cArr, i11, length - i10);
                    length -= 2;
                    i10--;
                }
            }
            i10++;
        }
        int i12 = s5 + 2;
        int i13 = i12;
        while (i13 < length) {
            if (cArr[i13] == c6 && cArr[i13 - 1] == '.' && cArr[i13 - 2] == '.' && (i13 == i12 || cArr[i13 - 3] == c6)) {
                if (i13 == i12) {
                    return null;
                }
                if (i13 == length - 1) {
                    z6 = true;
                }
                int i14 = i13 - 4;
                while (true) {
                    if (i14 < s5) {
                        int i15 = i13 + 1;
                        System.arraycopy(cArr, i15, cArr, s5, length - i13);
                        length -= i15 - s5;
                        i13 = i7;
                        break;
                    }
                    if (cArr[i14] == c6) {
                        int i16 = i14 + 1;
                        System.arraycopy(cArr, i13 + 1, cArr, i16, length - i13);
                        length -= i13 - i14;
                        i13 = i16;
                        break;
                    }
                    i14--;
                }
            }
            i13++;
        }
        return length <= 0 ? "" : length <= s5 ? new String(cArr, 0, length) : (z6 && z5) ? new String(cArr, 0, length) : new String(cArr, 0, length - 1);
    }

    public static boolean f(String str, String str2) {
        return g(str, str2, false, m.f32035q);
    }

    public static boolean g(String str, String str2, boolean z5, m mVar) {
        if (str == null || str2 == null) {
            return str == null && str2 == null;
        }
        if (z5) {
            str = A(str);
            str2 = A(str2);
            if (str == null || str2 == null) {
                throw new NullPointerException("Error normalizing one or both of the file names");
            }
        }
        if (mVar == null) {
            mVar = m.f32035q;
        }
        return mVar.c(str, str2);
    }

    public static boolean h(String str, String str2) {
        return g(str, str2, true, m.f32035q);
    }

    public static boolean i(String str, String str2) {
        return g(str, str2, true, m.f32037s);
    }

    public static boolean j(String str, String str2) {
        return g(str, str2, false, m.f32037s);
    }

    public static String k(String str) {
        return E(o(str));
    }

    public static String l(String str) {
        if (str == null) {
            return null;
        }
        int t5 = t(str);
        return t5 == -1 ? "" : str.substring(t5 + 1);
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
        int s5;
        if (str != null && (s5 = s(str)) >= 0) {
            return s5 > str.length() ? str.concat("/") : str.substring(0, s5);
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
        String l5 = l(str);
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            if (l5.equals(it.next())) {
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
        String l5 = l(str);
        for (String str2 : strArr) {
            if (l5.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private static boolean y(char c6) {
        return c6 == '/' || c6 == '\\';
    }

    static boolean z() {
        return f32030e == '\\';
    }
}
