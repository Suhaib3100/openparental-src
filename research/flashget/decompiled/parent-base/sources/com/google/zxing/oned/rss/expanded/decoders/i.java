package com.google.zxing.oned.rss.expanded.decoders;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;

/* compiled from: AI01weightDecoder.java */
/* loaded from: classes6.dex */
abstract class i extends h {
    i(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    protected abstract void h(StringBuilder sb, int i4);

    protected abstract int i(int i4);

    final void j(StringBuilder sb, int i4, int i5) {
        int f4 = b().f(i4, i5);
        h(sb, f4);
        int i6 = i(f4);
        int i7 = AndroidComposeViewAccessibilityDelegateCompat.Q2;
        for (int i10 = 0; i10 < 5; i10++) {
            if (i6 / i7 == 0) {
                sb.append('0');
            }
            i7 /= 10;
        }
        sb.append(i6);
    }
}
