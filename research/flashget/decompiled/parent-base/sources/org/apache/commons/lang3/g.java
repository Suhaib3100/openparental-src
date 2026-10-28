package org.apache.commons.lang3;

/* compiled from: BooleanUtils.java */
/* loaded from: classes6.dex */
public class g {
    public static Integer A(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? ye.c.f93427e : ye.c.f93426d;
    }

    public static Integer B(Boolean bool, Integer num, Integer num2, Integer num3) {
        return bool == null ? num3 : bool.booleanValue() ? num : num2;
    }

    public static Integer C(boolean z4) {
        return z4 ? ye.c.f93427e : ye.c.f93426d;
    }

    public static Integer D(boolean z4, Integer num, Integer num2) {
        return z4 ? num : num2;
    }

    public static String E(Boolean bool, String str, String str2, String str3) {
        return bool == null ? str3 : bool.booleanValue() ? str : str2;
    }

    public static String F(boolean z4, String str, String str2) {
        return z4 ? str : str2;
    }

    public static String G(Boolean bool) {
        return E(bool, "on", "off", null);
    }

    public static String H(boolean z4) {
        return z4 ? "on" : "off";
    }

    public static String I(Boolean bool) {
        return E(bool, "true", "false", null);
    }

    public static String J(boolean z4) {
        return z4 ? "true" : "false";
    }

    public static String K(Boolean bool) {
        return E(bool, "yes", "no", null);
    }

    public static String L(boolean z4) {
        return z4 ? "yes" : "no";
    }

    public static Boolean M(Boolean... boolArr) {
        if (boolArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (boolArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            return N(e.Q5(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean N(boolean... zArr) {
        if (zArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        boolean z4 = false;
        for (boolean z5 : zArr) {
            z4 ^= z5;
        }
        return z4;
    }

    public static Boolean a(Boolean... boolArr) {
        if (boolArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (boolArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            return b(e.Q5(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean b(boolean... zArr) {
        if (zArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (boolean z4 : zArr) {
            if (!z4) {
                return false;
            }
        }
        return true;
    }

    public static int c(boolean z4, boolean z5) {
        if (z4 == z5) {
            return 0;
        }
        return z4 ? 1 : -1;
    }

    public static boolean d(Boolean bool) {
        return Boolean.FALSE.equals(bool);
    }

    public static boolean e(Boolean bool) {
        return !Boolean.FALSE.equals(bool);
    }

    public static boolean f(Boolean bool) {
        return !Boolean.TRUE.equals(bool);
    }

    public static boolean g(Boolean bool) {
        return Boolean.TRUE.equals(bool);
    }

    public static Boolean h(Boolean bool) {
        if (bool == null) {
            return null;
        }
        return bool.booleanValue() ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean i(Boolean... boolArr) {
        if (boolArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (boolArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        try {
            return j(e.Q5(boolArr)) ? Boolean.TRUE : Boolean.FALSE;
        } catch (NullPointerException unused) {
            throw new IllegalArgumentException("The array must not contain any null elements");
        }
    }

    public static boolean j(boolean... zArr) {
        if (zArr == null) {
            throw new IllegalArgumentException("The Array must not be null");
        }
        if (zArr.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }
        for (boolean z4 : zArr) {
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(int i4) {
        return i4 != 0;
    }

    public static boolean l(int i4, int i5, int i6) {
        if (i4 == i5) {
            return true;
        }
        if (i4 == i6) {
            return false;
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean m(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean n(Integer num, Integer num2, Integer num3) {
        if (num == null) {
            if (num2 == null) {
                return true;
            }
            if (num3 == null) {
                return false;
            }
        } else {
            if (num.equals(num2)) {
                return true;
            }
            if (num.equals(num3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The Integer did not match either specified value");
    }

    public static boolean o(String str) {
        return v(str) == Boolean.TRUE;
    }

    public static boolean p(String str, String str2, String str3) {
        if (str == str2) {
            return true;
        }
        if (str == str3) {
            return false;
        }
        if (str != null) {
            if (str.equals(str2)) {
                return true;
            }
            if (str.equals(str3)) {
                return false;
            }
        }
        throw new IllegalArgumentException("The String did not match either specified value");
    }

    public static boolean q(Boolean bool, boolean z4) {
        return bool == null ? z4 : bool.booleanValue();
    }

    public static Boolean r(int i4) {
        return i4 == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean s(int i4, int i5, int i6, int i7) {
        if (i4 == i5) {
            return Boolean.TRUE;
        }
        if (i4 == i6) {
            return Boolean.FALSE;
        }
        if (i4 == i7) {
            return null;
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static Boolean t(Integer num) {
        if (num == null) {
            return null;
        }
        return num.intValue() == 0 ? Boolean.FALSE : Boolean.TRUE;
    }

    public static Boolean u(Integer num, Integer num2, Integer num3, Integer num4) {
        if (num == null) {
            if (num2 == null) {
                return Boolean.TRUE;
            }
            if (num3 == null) {
                return Boolean.FALSE;
            }
            if (num4 == null) {
                return null;
            }
        } else {
            if (num.equals(num2)) {
                return Boolean.TRUE;
            }
            if (num.equals(num3)) {
                return Boolean.FALSE;
            }
            if (num.equals(num4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The Integer did not match any specified value");
    }

    public static Boolean v(String str) {
        if (str == "true") {
            return Boolean.TRUE;
        }
        if (str == null) {
            return null;
        }
        int length = str.length();
        if (length == 1) {
            char charAt = str.charAt(0);
            if (charAt == 'y' || charAt == 'Y' || charAt == 't' || charAt == 'T' || charAt == '1') {
                return Boolean.TRUE;
            }
            if (charAt == 'n' || charAt == 'N' || charAt == 'f' || charAt == 'F' || charAt == '0') {
                return Boolean.FALSE;
            }
            return null;
        }
        if (length == 2) {
            char charAt2 = str.charAt(0);
            char charAt3 = str.charAt(1);
            if ((charAt2 == 'o' || charAt2 == 'O') && (charAt3 == 'n' || charAt3 == 'N')) {
                return Boolean.TRUE;
            }
            if (charAt2 != 'n' && charAt2 != 'N') {
                return null;
            }
            if (charAt3 == 'o' || charAt3 == 'O') {
                return Boolean.FALSE;
            }
            return null;
        }
        if (length == 3) {
            char charAt4 = str.charAt(0);
            char charAt5 = str.charAt(1);
            char charAt6 = str.charAt(2);
            if ((charAt4 == 'y' || charAt4 == 'Y') && ((charAt5 == 'e' || charAt5 == 'E') && (charAt6 == 's' || charAt6 == 'S'))) {
                return Boolean.TRUE;
            }
            if (charAt4 != 'o' && charAt4 != 'O') {
                return null;
            }
            if (charAt5 != 'f' && charAt5 != 'F') {
                return null;
            }
            if (charAt6 == 'f' || charAt6 == 'F') {
                return Boolean.FALSE;
            }
            return null;
        }
        if (length == 4) {
            char charAt7 = str.charAt(0);
            char charAt8 = str.charAt(1);
            char charAt9 = str.charAt(2);
            char charAt10 = str.charAt(3);
            if (charAt7 != 't' && charAt7 != 'T') {
                return null;
            }
            if (charAt8 != 'r' && charAt8 != 'R') {
                return null;
            }
            if (charAt9 != 'u' && charAt9 != 'U') {
                return null;
            }
            if (charAt10 == 'e' || charAt10 == 'E') {
                return Boolean.TRUE;
            }
            return null;
        }
        if (length != 5) {
            return null;
        }
        char charAt11 = str.charAt(0);
        char charAt12 = str.charAt(1);
        char charAt13 = str.charAt(2);
        char charAt14 = str.charAt(3);
        char charAt15 = str.charAt(4);
        if (charAt11 != 'f' && charAt11 != 'F') {
            return null;
        }
        if (charAt12 != 'a' && charAt12 != 'A') {
            return null;
        }
        if (charAt13 != 'l' && charAt13 != 'L') {
            return null;
        }
        if (charAt14 != 's' && charAt14 != 'S') {
            return null;
        }
        if (charAt15 == 'e' || charAt15 == 'E') {
            return Boolean.FALSE;
        }
        return null;
    }

    public static Boolean w(String str, String str2, String str3, String str4) {
        if (str == null) {
            if (str2 == null) {
                return Boolean.TRUE;
            }
            if (str3 == null) {
                return Boolean.FALSE;
            }
            if (str4 == null) {
                return null;
            }
        } else {
            if (str.equals(str2)) {
                return Boolean.TRUE;
            }
            if (str.equals(str3)) {
                return Boolean.FALSE;
            }
            if (str.equals(str4)) {
                return null;
            }
        }
        throw new IllegalArgumentException("The String did not match any specified value");
    }

    public static int x(Boolean bool, int i4, int i5, int i6) {
        return bool == null ? i6 : bool.booleanValue() ? i4 : i5;
    }

    public static int y(boolean z4) {
        return z4 ? 1 : 0;
    }

    public static int z(boolean z4, int i4, int i5) {
        return z4 ? i4 : i5;
    }
}
