package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* compiled from: EAN8Writer.java */
/* loaded from: classes6.dex */
public final class l extends z {

    /* renamed from: b, reason: collision with root package name */
    private static final int f63035b = 67;

    @Override // com.google.zxing.oned.s
    public boolean[] e(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(str);
            } catch (FormatException e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException(ProtectedSandApp.s("\u0b00\u0001").concat(String.valueOf(length)));
            }
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("૾\u0001"));
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException(ProtectedSandApp.s("૿\u0001"));
            }
        }
        s.d(str);
        boolean[] zArr = new boolean[67];
        int c5 = s.c(zArr, 0, y.f63156f, true);
        for (int i4 = 0; i4 <= 3; i4++) {
            c5 += s.c(zArr, c5, y.f63159i[Character.digit(str.charAt(i4), 10)], false);
        }
        int c6 = c5 + s.c(zArr, c5, y.f63157g, false);
        for (int i5 = 4; i5 <= 7; i5++) {
            c6 += s.c(zArr, c6, y.f63159i[Character.digit(str.charAt(i5), 10)], true);
        }
        s.c(zArr, c6, y.f63156f, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.EAN_8);
    }
}
