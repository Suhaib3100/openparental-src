package com.google.zxing.oned.rss.expanded.decoders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: AI01393xDecoder.java */
/* loaded from: classes6.dex */
final class d extends h {

    /* renamed from: d, reason: collision with root package name */
    private static final int f63107d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63108e = 2;

    /* renamed from: f, reason: collision with root package name */
    private static final int f63109f = 10;

    d(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.j
    public String d() throws NotFoundException, FormatException {
        if (c().o() < 48) {
            throw NotFoundException.a();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 8);
        int f4 = b().f(48, 2);
        sb.append(ProtectedSandApp.s("\u0b7d\u0001"));
        sb.append(f4);
        sb.append(')');
        int f5 = b().f(50, 10);
        if (f5 / 100 == 0) {
            sb.append('0');
        }
        if (f5 / 10 == 0) {
            sb.append('0');
        }
        sb.append(f5);
        sb.append(b().c(60, null).b());
        return sb.toString();
    }
}
