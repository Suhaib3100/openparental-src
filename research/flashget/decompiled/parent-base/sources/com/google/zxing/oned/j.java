package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* compiled from: EAN13Writer.java */
/* loaded from: classes6.dex */
public final class j extends z {

    /* renamed from: b, reason: collision with root package name */
    private static final int f63033b = 95;

    @Override // com.google.zxing.oned.s
    public boolean[] e(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + y.r(str);
            } catch (FormatException e4) {
                throw new IllegalArgumentException(e4);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException(ProtectedSandApp.s("૽\u0001").concat(String.valueOf(length)));
            }
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException(ProtectedSandApp.s("ૻ\u0001"));
                }
            } catch (FormatException unused) {
                throw new IllegalArgumentException(ProtectedSandApp.s("ૼ\u0001"));
            }
        }
        s.d(str);
        int i4 = i.f63031l[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int c5 = s.c(zArr, 0, y.f63156f, true);
        for (int i5 = 1; i5 <= 6; i5++) {
            int digit = Character.digit(str.charAt(i5), 10);
            if (((i4 >> (6 - i5)) & 1) == 1) {
                digit += 10;
            }
            c5 += s.c(zArr, c5, y.f63160j[digit], false);
        }
        int c6 = c5 + s.c(zArr, c5, y.f63157g, false);
        for (int i6 = 7; i6 <= 12; i6++) {
            c6 += s.c(zArr, c6, y.f63159i[Character.digit(str.charAt(i6), 10)], true);
        }
        s.c(zArr, c6, y.f63156f, true);
        return zArr;
    }

    @Override // com.google.zxing.oned.s
    protected Collection<com.google.zxing.a> g() {
        return Collections.singleton(com.google.zxing.a.EAN_13);
    }
}
