package com.google.common.escape;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: UnicodeEscaper.java */
@f
@d9.b
/* loaded from: classes6.dex */
public abstract class l extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final int f56710b = 32;

    protected l() {
    }

    protected static int c(CharSequence charSequence, int i4, int i5) {
        charSequence.getClass();
        if (i4 >= i5) {
            throw new IndexOutOfBoundsException(ProtectedSandApp.s("\uf592"));
        }
        int i6 = i4 + 1;
        char charAt = charSequence.charAt(i4);
        if (charAt < 55296 || charAt > 57343) {
            return charAt;
        }
        String s4 = ProtectedSandApp.s("\uf58c");
        String s5 = ProtectedSandApp.s("\uf58d");
        String s6 = ProtectedSandApp.s("\uf58e");
        String s7 = ProtectedSandApp.s("\uf58f");
        if (charAt > 56319) {
            String valueOf = String.valueOf(charSequence);
            StringBuilder sb = new StringBuilder(valueOf.length() + 88);
            sb.append(ProtectedSandApp.s("\uf591"));
            sb.append(charAt);
            sb.append(s7);
            sb.append((int) charAt);
            sb.append(s6);
            sb.append(i4);
            sb.append(s5);
            sb.append(valueOf);
            sb.append(s4);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i6 == i5) {
            return -charAt;
        }
        char charAt2 = charSequence.charAt(i6);
        if (Character.isLowSurrogate(charAt2)) {
            return Character.toCodePoint(charAt, charAt2);
        }
        String valueOf2 = String.valueOf(charSequence);
        StringBuilder sb2 = new StringBuilder(valueOf2.length() + 89);
        sb2.append(ProtectedSandApp.s("\uf590"));
        sb2.append(charAt2);
        sb2.append(s7);
        sb2.append((int) charAt2);
        sb2.append(s6);
        sb2.append(i6);
        sb2.append(s5);
        sb2.append(valueOf2);
        sb2.append(s4);
        throw new IllegalArgumentException(sb2.toString());
    }

    private static char[] f(char[] cArr, int i4, int i5) {
        if (i5 < 0) {
            throw new AssertionError(ProtectedSandApp.s("\uf593"));
        }
        char[] cArr2 = new char[i5];
        if (i4 > 0) {
            System.arraycopy(cArr, 0, cArr2, 0, i4);
        }
        return cArr2;
    }

    @Override // com.google.common.escape.h
    public String b(String str) {
        str.getClass();
        int length = str.length();
        int g4 = g(str, 0, length);
        return g4 == length ? str : e(str, g4);
    }

    @zc.a
    protected abstract char[] d(int i4);

    protected final String e(String str, int i4) {
        int length = str.length();
        char[] a5 = k.a();
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            int c5 = c(str, i4, length);
            if (c5 < 0) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\uf594"));
            }
            char[] d5 = d(c5);
            int i7 = (Character.isSupplementaryCodePoint(c5) ? 2 : 1) + i4;
            if (d5 != null) {
                int i10 = i4 - i5;
                int i11 = i6 + i10;
                int length2 = d5.length + i11;
                if (a5.length < length2) {
                    a5 = f(a5, i6, (length - i4) + length2 + 32);
                }
                if (i10 > 0) {
                    str.getChars(i5, i4, a5, i6);
                    i6 = i11;
                }
                if (d5.length > 0) {
                    System.arraycopy(d5, 0, a5, i6, d5.length);
                    i6 += d5.length;
                }
                i5 = i7;
            }
            i4 = g(str, i7, length);
        }
        int i12 = length - i5;
        if (i12 > 0) {
            int i13 = i12 + i6;
            if (a5.length < i13) {
                a5 = f(a5, i6, i13);
            }
            str.getChars(i5, length, a5, i6);
            i6 = i13;
        }
        return new String(a5, 0, i6);
    }

    protected int g(CharSequence charSequence, int i4, int i5) {
        while (i4 < i5) {
            int c5 = c(charSequence, i4, i5);
            if (c5 < 0 || d(c5) != null) {
                break;
            }
            i4 += Character.isSupplementaryCodePoint(c5) ? 2 : 1;
        }
        return i4;
    }
}
