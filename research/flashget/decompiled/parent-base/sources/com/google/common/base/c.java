package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Ascii.java */
@o
@d9.b
/* loaded from: classes6.dex */
public final class c {
    public static final byte A = 23;
    public static final byte B = 24;
    public static final byte C = 25;
    public static final byte D = 26;
    public static final byte E = 27;
    public static final byte F = 28;
    public static final byte G = 29;
    public static final byte H = 30;
    public static final byte I = 31;
    public static final byte J = 32;
    public static final byte K = 32;
    public static final byte L = Byte.MAX_VALUE;
    public static final char M = 0;
    public static final char N = 127;
    private static final char O = ' ';

    /* renamed from: a, reason: collision with root package name */
    public static final byte f54855a = 0;

    /* renamed from: b, reason: collision with root package name */
    public static final byte f54856b = 1;

    /* renamed from: c, reason: collision with root package name */
    public static final byte f54857c = 2;

    /* renamed from: d, reason: collision with root package name */
    public static final byte f54858d = 3;

    /* renamed from: e, reason: collision with root package name */
    public static final byte f54859e = 4;

    /* renamed from: f, reason: collision with root package name */
    public static final byte f54860f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final byte f54861g = 6;

    /* renamed from: h, reason: collision with root package name */
    public static final byte f54862h = 7;

    /* renamed from: i, reason: collision with root package name */
    public static final byte f54863i = 8;

    /* renamed from: j, reason: collision with root package name */
    public static final byte f54864j = 9;

    /* renamed from: k, reason: collision with root package name */
    public static final byte f54865k = 10;

    /* renamed from: l, reason: collision with root package name */
    public static final byte f54866l = 10;

    /* renamed from: m, reason: collision with root package name */
    public static final byte f54867m = 11;

    /* renamed from: n, reason: collision with root package name */
    public static final byte f54868n = 12;

    /* renamed from: o, reason: collision with root package name */
    public static final byte f54869o = 13;

    /* renamed from: p, reason: collision with root package name */
    public static final byte f54870p = 14;

    /* renamed from: q, reason: collision with root package name */
    public static final byte f54871q = 15;

    /* renamed from: r, reason: collision with root package name */
    public static final byte f54872r = 16;

    /* renamed from: s, reason: collision with root package name */
    public static final byte f54873s = 17;

    /* renamed from: t, reason: collision with root package name */
    public static final byte f54874t = 17;

    /* renamed from: u, reason: collision with root package name */
    public static final byte f54875u = 18;

    /* renamed from: v, reason: collision with root package name */
    public static final byte f54876v = 19;

    /* renamed from: w, reason: collision with root package name */
    public static final byte f54877w = 19;

    /* renamed from: x, reason: collision with root package name */
    public static final byte f54878x = 20;

    /* renamed from: y, reason: collision with root package name */
    public static final byte f54879y = 21;

    /* renamed from: z, reason: collision with root package name */
    public static final byte f54880z = 22;

    private c() {
    }

    public static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        int b5;
        int length = charSequence.length();
        if (charSequence == charSequence2) {
            return true;
        }
        if (length != charSequence2.length()) {
            return false;
        }
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = charSequence.charAt(i4);
            char charAt2 = charSequence2.charAt(i4);
            if (charAt != charAt2 && ((b5 = b(charAt)) >= 26 || b5 != b(charAt2))) {
                return false;
            }
        }
        return true;
    }

    private static int b(char c5) {
        return (char) ((c5 | O) - 97);
    }

    public static boolean c(char c5) {
        return c5 >= 'a' && c5 <= 'z';
    }

    public static boolean d(char c5) {
        return c5 >= 'A' && c5 <= 'Z';
    }

    public static char e(char c5) {
        return d(c5) ? (char) (c5 ^ O) : c5;
    }

    public static String f(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return g((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = e(charSequence.charAt(i4));
        }
        return String.valueOf(cArr);
    }

    public static String g(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            if (d(str.charAt(i4))) {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c5 = charArray[i4];
                    if (d(c5)) {
                        charArray[i4] = (char) (c5 ^ O);
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static char h(char c5) {
        return c(c5) ? (char) (c5 ^ O) : c5;
    }

    public static String i(CharSequence charSequence) {
        if (charSequence instanceof String) {
            return j((String) charSequence);
        }
        int length = charSequence.length();
        char[] cArr = new char[length];
        for (int i4 = 0; i4 < length; i4++) {
            cArr[i4] = h(charSequence.charAt(i4));
        }
        return String.valueOf(cArr);
    }

    public static String j(String str) {
        int length = str.length();
        int i4 = 0;
        while (i4 < length) {
            if (c(str.charAt(i4))) {
                char[] charArray = str.toCharArray();
                while (i4 < length) {
                    char c5 = charArray[i4];
                    if (c(c5)) {
                        charArray[i4] = (char) (c5 ^ O);
                    }
                    i4++;
                }
                return String.valueOf(charArray);
            }
            i4++;
        }
        return str;
    }

    public static String k(CharSequence charSequence, int i4, String str) {
        charSequence.getClass();
        int length = i4 - str.length();
        l0.m(length >= 0, ProtectedSandApp.s("\uf2c3"), i4, str.length());
        int length2 = charSequence.length();
        String str2 = charSequence;
        if (length2 <= i4) {
            String charSequence2 = charSequence.toString();
            int length3 = charSequence2.length();
            str2 = charSequence2;
            if (length3 <= i4) {
                return charSequence2;
            }
        }
        StringBuilder sb = new StringBuilder(i4);
        sb.append((CharSequence) str2, 0, length);
        sb.append(str);
        return sb.toString();
    }
}
