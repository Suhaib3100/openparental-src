package org.apache.commons.lang3;

/* compiled from: CharUtils.java */
/* loaded from: classes6.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private static final String[] f86062a = new String[128];

    /* renamed from: b, reason: collision with root package name */
    private static final char[] f86063b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c, reason: collision with root package name */
    public static final char f86064c = '\n';

    /* renamed from: d, reason: collision with root package name */
    public static final char f86065d = '\r';

    /* renamed from: e, reason: collision with root package name */
    public static final char f86066e = 0;

    static {
        char c5 = 0;
        while (true) {
            String[] strArr = f86062a;
            if (c5 >= strArr.length) {
                return;
            }
            strArr[c5] = String.valueOf(c5);
            c5 = (char) (c5 + 1);
        }
    }

    public static int a(char c5, char c6) {
        return c5 - c6;
    }

    public static boolean b(char c5) {
        return c5 < 128;
    }

    public static boolean c(char c5) {
        return e(c5) || d(c5);
    }

    public static boolean d(char c5) {
        return c5 >= 'a' && c5 <= 'z';
    }

    public static boolean e(char c5) {
        return c5 >= 'A' && c5 <= 'Z';
    }

    public static boolean f(char c5) {
        return c(c5) || h(c5);
    }

    public static boolean g(char c5) {
        return c5 < ' ' || c5 == 127;
    }

    public static boolean h(char c5) {
        return c5 >= '0' && c5 <= '9';
    }

    public static boolean i(char c5) {
        return c5 >= ' ' && c5 < 127;
    }

    public static char j(Character ch) {
        k1.b0(ch, "The Character must not be null", new Object[0]);
        return ch.charValue();
    }

    public static char k(Character ch, char c5) {
        return ch == null ? c5 : ch.charValue();
    }

    public static char l(String str) {
        k1.R(str, "The String must not be empty", new Object[0]);
        return str.charAt(0);
    }

    public static char m(String str, char c5) {
        return b1.G0(str) ? c5 : str.charAt(0);
    }

    @Deprecated
    public static Character n(char c5) {
        return Character.valueOf(c5);
    }

    public static Character o(String str) {
        if (b1.G0(str)) {
            return null;
        }
        return Character.valueOf(str.charAt(0));
    }

    public static int p(char c5) {
        if (h(c5)) {
            return c5 - '0';
        }
        throw new IllegalArgumentException("The character " + c5 + " is not in the range '0' - '9'");
    }

    public static int q(char c5, int i4) {
        return !h(c5) ? i4 : c5 - '0';
    }

    public static int r(Character ch) {
        k1.b0(ch, "The character must not be null", new Object[0]);
        return p(ch.charValue());
    }

    public static int s(Character ch, int i4) {
        return ch == null ? i4 : q(ch.charValue(), i4);
    }

    public static String t(char c5) {
        return c5 < 128 ? f86062a[c5] : new String(new char[]{c5});
    }

    public static String u(Character ch) {
        if (ch == null) {
            return null;
        }
        return t(ch.charValue());
    }

    public static String v(char c5) {
        StringBuilder sb = new StringBuilder("\\u");
        char[] cArr = f86063b;
        sb.append(cArr[(c5 >> '\f') & 15]);
        sb.append(cArr[(c5 >> '\b') & 15]);
        sb.append(cArr[(c5 >> 4) & 15]);
        sb.append(cArr[c5 & 15]);
        return sb.toString();
    }

    public static String w(Character ch) {
        if (ch == null) {
            return null;
        }
        return v(ch.charValue());
    }
}
