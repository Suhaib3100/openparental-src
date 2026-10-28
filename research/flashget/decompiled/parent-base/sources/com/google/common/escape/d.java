package com.google.common.escape;

import androidx.core.graphics.y;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CharEscaper.java */
@f
@d9.b
/* loaded from: classes6.dex */
public abstract class d extends h {

    /* renamed from: b, reason: collision with root package name */
    private static final int f56694b = 2;

    protected d() {
    }

    private static char[] e(char[] cArr, int i4, int i5) {
        if (i5 < 0) {
            throw new AssertionError(ProtectedSandApp.s("\uf58b"));
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
        for (int i4 = 0; i4 < length; i4++) {
            if (c(str.charAt(i4)) != null) {
                return d(str, i4);
            }
        }
        return str;
    }

    @zc.a
    protected abstract char[] c(char c5);

    protected final String d(String str, int i4) {
        int length = str.length();
        char[] a5 = k.a();
        int length2 = a5.length;
        int i5 = 0;
        int i6 = 0;
        while (i4 < length) {
            char[] c5 = c(str.charAt(i4));
            if (c5 != null) {
                int length3 = c5.length;
                int i7 = i4 - i5;
                int i10 = i6 + i7;
                int i11 = i10 + length3;
                if (length2 < i11) {
                    length2 = y.a(length, i4, 2, i11);
                    a5 = e(a5, i6, length2);
                }
                if (i7 > 0) {
                    str.getChars(i5, i4, a5, i6);
                    i6 = i10;
                }
                if (length3 > 0) {
                    System.arraycopy(c5, 0, a5, i6, length3);
                    i6 += length3;
                }
                i5 = i4 + 1;
            }
            i4++;
        }
        int i12 = length - i5;
        if (i12 > 0) {
            int i13 = i12 + i6;
            if (length2 < i13) {
                a5 = e(a5, i6, i13);
            }
            str.getChars(i5, length, a5, i6);
            i6 = i13;
        }
        return new String(a5, 0, i6);
    }
}
