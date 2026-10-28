package com.google.zxing.oned;

import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;

/* compiled from: UPCEANExtensionSupport.java */
/* loaded from: classes6.dex */
final class x {

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f63151c = {1, 1, 2};

    /* renamed from: a, reason: collision with root package name */
    private final v f63152a = new v();

    /* renamed from: b, reason: collision with root package name */
    private final w f63153b = new w();

    x() {
    }

    com.google.zxing.n a(int i4, com.google.zxing.common.a aVar, int i5) throws NotFoundException {
        int[] n4 = y.n(aVar, i5, false, f63151c);
        try {
            return this.f63153b.b(i4, aVar, n4);
        } catch (ReaderException unused) {
            return this.f63152a.b(i4, aVar, n4);
        }
    }
}
