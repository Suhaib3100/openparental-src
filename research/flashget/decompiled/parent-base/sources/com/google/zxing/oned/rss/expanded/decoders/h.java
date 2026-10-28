package com.google.zxing.oned.rss.expanded.decoders;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AI01decoder.java */
/* loaded from: classes6.dex */
abstract class h extends j {

    /* renamed from: c, reason: collision with root package name */
    static final int f63118c = 40;

    h(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    private static void e(StringBuilder sb, int i4) {
        int i5 = 0;
        for (int i6 = 0; i6 < 13; i6++) {
            int charAt = sb.charAt(i6 + i4) - '0';
            if ((i6 & 1) == 0) {
                charAt *= 3;
            }
            i5 += charAt;
        }
        int i7 = 10 - (i5 % 10);
        sb.append(i7 != 10 ? i7 : 0);
    }

    final void f(StringBuilder sb, int i4) {
        sb.append(ProtectedSandApp.s("\u0b78\u0001"));
        int length = sb.length();
        sb.append('9');
        g(sb, i4, length);
    }

    final void g(StringBuilder sb, int i4, int i5) {
        for (int i6 = 0; i6 < 4; i6++) {
            int f4 = b().f((i6 * 10) + i4, 10);
            if (f4 / 100 == 0) {
                sb.append('0');
            }
            if (f4 / 10 == 0) {
                sb.append('0');
            }
            sb.append(f4);
        }
        e(sb, i5);
    }
}
