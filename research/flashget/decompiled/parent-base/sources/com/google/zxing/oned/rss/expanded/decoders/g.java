package com.google.zxing.oned.rss.expanded.decoders;

import androidx.compose.material3.j4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;

/* compiled from: AI01AndOtherAIs.java */
/* loaded from: classes6.dex */
final class g extends h {

    /* renamed from: d, reason: collision with root package name */
    private static final int f63117d = 4;

    g(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.j
    public String d() throws NotFoundException, FormatException {
        StringBuilder a5 = j4.a(ProtectedSandApp.s("\u0b7e\u0001"));
        int length = a5.length();
        a5.append(b().f(4, 4));
        g(a5, 8, length);
        return b().a(a5, 48);
    }
}
