package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* compiled from: UPCEWriter.java */
/* loaded from: classes6.dex */
public final class b0 extends z {

    /* renamed from: b, reason: collision with root package name */
    private static final int f62985b = 51;

    @Override // com.google.zxing.oned.s
    public boolean[] e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(a0.s(str));
            } catch (FormatException e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\u0ade\u0001").concat(String.valueOf(length)));
            }
            try {
                if (!y.i(a0.s(str))) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("\u0adc\u0001"));
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\u0add\u0001"));
            }
        }
        s.d(str);
        int digit = Character.digit(str.charAt(0), 10);
        if (digit != 0 && digit != 1) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0adf\u0001"));
        }
        int i4 = a0.f62979m[digit][Character.digit(str.charAt(7), 10)];
        boolean[] zArr = new boolean[51];
        int c5 = s.c(zArr, 0, y.f63156f, true);
        for (int i5 = 1; i5 <= 6; i5++) {
            int digit2 = Character.digit(str.charAt(i5), 10);
            if (((i4 >> (6 - i5)) & 1) == 1) {
                digit2 += 10;
            }
            c5 += s.c(zArr, c5, y.f63160j[digit2], false);
        }
        s.c(zArr, c5, y.f63158h, false);
        return zArr;
    }

    @Override // com.google.zxing.oned.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.UPC_E);
    }
}
