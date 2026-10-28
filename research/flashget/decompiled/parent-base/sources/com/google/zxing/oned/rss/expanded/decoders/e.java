package com.google.zxing.oned.rss.expanded.decoders;

import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.google.zxing.NotFoundException;

/* compiled from: AI013x0x1xDecoder.java */
/* loaded from: classes6.dex */
final class e extends i {

    /* renamed from: f, reason: collision with root package name */
    private static final int f63110f = 8;

    /* renamed from: g, reason: collision with root package name */
    private static final int f63111g = 20;

    /* renamed from: h, reason: collision with root package name */
    private static final int f63112h = 16;

    /* renamed from: d, reason: collision with root package name */
    private final String f63113d;

    /* renamed from: e, reason: collision with root package name */
    private final String f63114e;

    e(com.google.zxing.common.a aVar, String str, String str2) {
        super(aVar);
        this.f63113d = str2;
        this.f63114e = str;
    }

    private void k(StringBuilder sb, int i4) {
        int f4 = b().f(i4, 16);
        if (f4 == 38400) {
            return;
        }
        sb.append('(');
        sb.append(this.f63113d);
        sb.append(')');
        int i5 = f4 % 32;
        int i6 = f4 / 32;
        int i7 = (i6 % 12) + 1;
        int i10 = i6 / 12;
        if (i10 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i10);
        if (i7 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i7);
        if (i5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(i5);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.j
    public String d() throws NotFoundException {
        if (c().o() != 84) {
            throw NotFoundException.a();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 8);
        j(sb, 48, 20);
        k(sb, 68);
        return sb.toString();
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected void h(StringBuilder sb, int i4) {
        sb.append('(');
        sb.append(this.f63114e);
        sb.append(i4 / AndroidComposeViewAccessibilityDelegateCompat.Q2);
        sb.append(')');
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected int i(int i4) {
        return i4 % AndroidComposeViewAccessibilityDelegateCompat.Q2;
    }
}
