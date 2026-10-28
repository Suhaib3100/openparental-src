package com.google.zxing.oned.rss.expanded.decoders;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: AI01320xDecoder.java */
/* loaded from: classes6.dex */
final class b extends f {
    b(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected void h(StringBuilder sb, int i4) {
        if (i4 < 10000) {
            sb.append(ProtectedSandApp.s("\u0b7a\u0001"));
        } else {
            sb.append(ProtectedSandApp.s("\u0b7b\u0001"));
        }
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected int i(int i4) {
        return i4 < 10000 ? i4 : i4 - 10000;
    }
}
