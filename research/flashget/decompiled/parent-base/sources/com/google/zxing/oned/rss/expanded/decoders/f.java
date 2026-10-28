package com.google.zxing.oned.rss.expanded.decoders;

import com.google.zxing.NotFoundException;

/* compiled from: AI013x0xDecoder.java */
/* loaded from: classes6.dex */
abstract class f extends i {

    /* renamed from: d, reason: collision with root package name */
    private static final int f63115d = 5;

    /* renamed from: e, reason: collision with root package name */
    private static final int f63116e = 15;

    f(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.j
    public String d() throws NotFoundException {
        if (c().o() != 60) {
            throw NotFoundException.a();
        }
        StringBuilder sb = new StringBuilder();
        f(sb, 5);
        j(sb, 45, 15);
        return sb.toString();
    }
}
