package com.google.zxing.client.result;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.regex.Pattern;

/* compiled from: VINResultParser.java */
/* loaded from: classes6.dex */
public final class i0 extends u {

    /* renamed from: g, reason: collision with root package name */
    private static final Pattern f62711g = Pattern.compile(ProtectedSandApp.s("\u09a9\u0001"));

    /* renamed from: h, reason: collision with root package name */
    private static final Pattern f62712h = Pattern.compile(ProtectedSandApp.s("প\u0001"));

    private static char q(int i4) {
        if (i4 < 10) {
            return (char) (i4 + 48);
        }
        if (i4 == 10) {
            return 'X';
        }
        throw new IllegalArgumentException();
    }

    private static boolean r(CharSequence charSequence) {
        int i4 = 0;
        int i5 = 0;
        while (i4 < charSequence.length()) {
            int i6 = i4 + 1;
            i5 += w(i6) * v(charSequence.charAt(i4));
            i4 = i6;
        }
        return charSequence.charAt(8) == q(i5 % 11);
    }

    private static String s(CharSequence charSequence) {
        char charAt = charSequence.charAt(0);
        char charAt2 = charSequence.charAt(1);
        if (charAt == '9') {
            if ((charAt2 < 'A' || charAt2 > 'E') && (charAt2 < '3' || charAt2 > '9')) {
                return null;
            }
            return ProtectedSandApp.s("স\u0001");
        }
        String s4 = ProtectedSandApp.s("ফ\u0001");
        if (charAt == 'S') {
            if (charAt2 >= 'A' && charAt2 <= 'M') {
                return ProtectedSandApp.s("ষ\u0001");
            }
            if (charAt2 < 'N' || charAt2 > 'T') {
                return null;
            }
            return s4;
        }
        if (charAt == 'Z') {
            if (charAt2 < 'A' || charAt2 > 'R') {
                return null;
            }
            return ProtectedSandApp.s("শ\u0001");
        }
        switch (charAt) {
            case '1':
            case '4':
            case '5':
                return ProtectedSandApp.s("\u09b5\u0001");
            case '2':
                return ProtectedSandApp.s("\u09b4\u0001");
            case '3':
                if (charAt2 < 'A' || charAt2 > 'W') {
                    return null;
                }
                return ProtectedSandApp.s("\u09b3\u0001");
            default:
                switch (charAt) {
                    case 'J':
                        if (charAt2 < 'A' || charAt2 > 'T') {
                            return null;
                        }
                        return ProtectedSandApp.s("ল\u0001");
                    case 'K':
                        if (charAt2 < 'L' || charAt2 > 'R') {
                            return null;
                        }
                        return ProtectedSandApp.s("\u09b1\u0001");
                    case 'L':
                        return ProtectedSandApp.s("র\u0001");
                    case 'M':
                        if (charAt2 < 'A' || charAt2 > 'E') {
                            return null;
                        }
                        return ProtectedSandApp.s("য\u0001");
                    default:
                        switch (charAt) {
                            case 'V':
                                if (charAt2 >= 'F' && charAt2 <= 'R') {
                                    return ProtectedSandApp.s("ভ\u0001");
                                }
                                if (charAt2 < 'S' || charAt2 > 'W') {
                                    return null;
                                }
                                return ProtectedSandApp.s("ম\u0001");
                            case 'W':
                                return s4;
                            case 'X':
                                if (charAt2 == '0' || (charAt2 >= '3' && charAt2 <= '9')) {
                                    return ProtectedSandApp.s("ব\u0001");
                                }
                                return null;
                            default:
                                return null;
                        }
                }
        }
    }

    private static int t(char c5) {
        if (c5 >= 'E' && c5 <= 'H') {
            return c5 + 1915;
        }
        if (c5 >= 'J' && c5 <= 'N') {
            return c5 + 1914;
        }
        if (c5 == 'P') {
            return 1993;
        }
        if (c5 >= 'R' && c5 <= 'T') {
            return c5 + 1912;
        }
        if (c5 >= 'V' && c5 <= 'Y') {
            return c5 + 1911;
        }
        if (c5 >= '1' && c5 <= '9') {
            return c5 + 1952;
        }
        if (c5 < 'A' || c5 > 'D') {
            throw new IllegalArgumentException();
        }
        return c5 + 1945;
    }

    private static int v(char c5) {
        if (c5 >= 'A' && c5 <= 'I') {
            return c5 - '@';
        }
        if (c5 >= 'J' && c5 <= 'R') {
            return c5 - 'I';
        }
        if (c5 >= 'S' && c5 <= 'Z') {
            return c5 - 'Q';
        }
        if (c5 < '0' || c5 > '9') {
            throw new IllegalArgumentException();
        }
        return c5 - '0';
    }

    private static int w(int i4) {
        if (i4 > 0 && i4 <= 7) {
            return 9 - i4;
        }
        if (i4 == 8) {
            return 10;
        }
        if (i4 == 9) {
            return 0;
        }
        if (i4 < 10 || i4 > 17) {
            throw new IllegalArgumentException();
        }
        return 19 - i4;
    }

    @Override // com.google.zxing.client.result.u
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public h0 k(com.google.zxing.n nVar) {
        if (nVar.b() != com.google.zxing.a.CODE_39) {
            return null;
        }
        String trim = f62711g.matcher(nVar.g()).replaceAll("").trim();
        if (!f62712h.matcher(trim).matches()) {
            return null;
        }
        try {
            if (!r(trim)) {
                return null;
            }
            String substring = trim.substring(0, 3);
            return new h0(trim, substring, trim.substring(3, 9), trim.substring(9, 17), s(substring), trim.substring(3, 8), t(trim.charAt(9)), trim.charAt(10), trim.substring(11));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }
}
