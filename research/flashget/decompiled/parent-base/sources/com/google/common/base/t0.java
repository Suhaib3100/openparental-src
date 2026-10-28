package com.google.common.base;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: Strings.java */
@o
@d9.b
/* loaded from: classes6.dex */
public final class t0 {
    private t0() {
    }

    public static String a(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i4 = 0;
        while (i4 < min && charSequence.charAt(i4) == charSequence2.charAt(i4)) {
            i4++;
        }
        int i5 = i4 - 1;
        if (k(charSequence, i5) || k(charSequence2, i5)) {
            i4--;
        }
        return charSequence.subSequence(0, i4).toString();
    }

    public static String b(CharSequence charSequence, CharSequence charSequence2) {
        charSequence.getClass();
        charSequence2.getClass();
        int min = Math.min(charSequence.length(), charSequence2.length());
        int i4 = 0;
        while (i4 < min && charSequence.charAt((charSequence.length() - i4) - 1) == charSequence2.charAt((charSequence2.length() - i4) - 1)) {
            i4++;
        }
        if (k(charSequence, (charSequence.length() - i4) - 1) || k(charSequence2, (charSequence2.length() - i4) - 1)) {
            i4--;
        }
        return charSequence.subSequence(charSequence.length() - i4, charSequence.length()).toString();
    }

    @zc.a
    public static String c(@zc.a String str) {
        return k0.c(str);
    }

    public static boolean d(@zc.a String str) {
        return k0.k(str);
    }

    public static String e(@zc.a String str, @zc.a Object... objArr) {
        int indexOf;
        String valueOf = String.valueOf(str);
        int i4 = 0;
        if (objArr == null) {
            objArr = new Object[]{ProtectedSandApp.s("\uf385")};
        } else {
            for (int i5 = 0; i5 < objArr.length; i5++) {
                objArr[i5] = f(objArr[i5]);
            }
        }
        StringBuilder sb = new StringBuilder((objArr.length * 16) + valueOf.length());
        int i6 = 0;
        while (i4 < objArr.length && (indexOf = valueOf.indexOf(ProtectedSandApp.s("\uf386"), i6)) != -1) {
            sb.append((CharSequence) valueOf, i6, indexOf);
            sb.append(objArr[i4]);
            i6 = indexOf + 2;
            i4++;
        }
        sb.append((CharSequence) valueOf, i6, valueOf.length());
        if (i4 < objArr.length) {
            sb.append(ProtectedSandApp.s("\uf387"));
            sb.append(objArr[i4]);
            for (int i7 = i4 + 1; i7 < objArr.length; i7++) {
                sb.append(ProtectedSandApp.s("\uf388"));
                sb.append(objArr[i7]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    private static String f(@zc.a Object obj) {
        if (obj == null) {
            return ProtectedSandApp.s("\uf389");
        }
        try {
            return obj.toString();
        } catch (Exception e4) {
            String name = obj.getClass().getName();
            String hexString = Integer.toHexString(System.identityHashCode(obj));
            StringBuilder sb = new StringBuilder(com.google.android.gms.common.internal.b.a(hexString, name.length() + 1));
            sb.append(name);
            sb.append('@');
            sb.append(hexString);
            String sb2 = sb.toString();
            Logger logger = Logger.getLogger(ProtectedSandApp.s("\uf38a"));
            Level level = Level.WARNING;
            String valueOf = String.valueOf(sb2);
            int length = valueOf.length();
            String s4 = ProtectedSandApp.s("\uf38b");
            logger.log(level, length != 0 ? s4.concat(valueOf) : new String(s4), (Throwable) e4);
            String name2 = e4.getClass().getName();
            StringBuilder a5 = g.a(name2.length() + com.google.android.gms.common.internal.b.a(sb2, 9), ProtectedSandApp.s("\uf38c"), sb2, ProtectedSandApp.s("\uf38d"), name2);
            a5.append(ProtectedSandApp.s("\uf38e"));
            return a5.toString();
        }
    }

    public static String g(@zc.a String str) {
        return k0.h(str);
    }

    public static String h(String str, int i4, char c5) {
        str.getClass();
        if (str.length() >= i4) {
            return str;
        }
        StringBuilder a5 = androidx.fragment.app.a.a(i4, str);
        for (int length = str.length(); length < i4; length++) {
            a5.append(c5);
        }
        return a5.toString();
    }

    public static String i(String str, int i4, char c5) {
        str.getClass();
        if (str.length() >= i4) {
            return str;
        }
        StringBuilder sb = new StringBuilder(i4);
        for (int length = str.length(); length < i4; length++) {
            sb.append(c5);
        }
        sb.append(str);
        return sb.toString();
    }

    public static String j(String str, int i4) {
        str.getClass();
        if (i4 <= 1) {
            l0.k(i4 >= 0, ProtectedSandApp.s("\uf38f"), i4);
            return i4 == 0 ? "" : str;
        }
        int length = str.length();
        long j4 = length * i4;
        int i5 = (int) j4;
        if (i5 != j4) {
            StringBuilder sb = new StringBuilder(51);
            sb.append(ProtectedSandApp.s("\uf390"));
            sb.append(j4);
            throw new ArrayIndexOutOfBoundsException(sb.toString());
        }
        char[] cArr = new char[i5];
        str.getChars(0, length, cArr, 0);
        while (true) {
            int i6 = i5 - length;
            if (length >= i6) {
                System.arraycopy(cArr, 0, cArr, length, i6);
                return new String(cArr);
            }
            System.arraycopy(cArr, 0, cArr, length, length);
            length <<= 1;
        }
    }

    @d9.d
    static boolean k(CharSequence charSequence, int i4) {
        return i4 >= 0 && i4 <= charSequence.length() + (-2) && Character.isHighSurrogate(charSequence.charAt(i4)) && Character.isLowSurrogate(charSequence.charAt(i4 + 1));
    }
}
