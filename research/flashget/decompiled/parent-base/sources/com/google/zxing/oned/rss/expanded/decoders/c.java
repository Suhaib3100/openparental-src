package com.google.zxing.oned.rss.expanded.decoders;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: AI01392xDecoder.java */
/* loaded from: classes6.dex */
final class c extends h {

    /* renamed from: d, reason: collision with root package name */
    private static final int f63105d = 8;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63106e = 2;

    c(com.google.zxing.common.a aVar) {
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
        sb.append(ProtectedSandApp.s("\u0b7c\u0001"));
        sb.append(f4);
        sb.append(')');
        sb.append(b().c(50, null).b());
        return sb.toString();
    }
}
