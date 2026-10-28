package com.google.zxing.oned;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Map;

/* compiled from: UPCAWriter.java */
/* loaded from: classes6.dex */
public final class u implements com.google.zxing.r {

    /* renamed from: a, reason: collision with root package name */
    private final j f63145a = new j();

    @Override // com.google.zxing.r
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i4, int i5, Map<com.google.zxing.f, ?> map) {
        if (aVar != com.google.zxing.a.UPC_A) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\u0bff\u0001").concat(String.valueOf(aVar)));
        }
        return this.f63145a.a(ProtectedSandApp.s("\u0bfe\u0001").concat(String.valueOf(str)), com.google.zxing.a.EAN_13, i4, i5, map);
    }

    @Override // com.google.zxing.r
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i4, int i5) {
        return a(str, aVar, i4, i5, null);
    }
}
