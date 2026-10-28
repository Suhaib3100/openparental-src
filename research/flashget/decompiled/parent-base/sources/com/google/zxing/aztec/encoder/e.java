package com.google.zxing.aztec.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import kotlin.text.m0;

/* compiled from: SimpleToken.java */
/* loaded from: classes6.dex */
final class e extends g {

    /* renamed from: c, reason: collision with root package name */
    private final short f62636c;

    /* renamed from: d, reason: collision with root package name */
    private final short f62637d;

    e(g gVar, int i4, int i5) {
        super(gVar);
        this.f62636c = (short) i4;
        this.f62637d = (short) i5;
    }

    @Override // com.google.zxing.aztec.encoder.g
    void c(com.google.zxing.common.a aVar, byte[] bArr) {
        aVar.d(this.f62636c, this.f62637d);
    }

    public String toString() {
        short s4 = this.f62636c;
        short s5 = this.f62637d;
        return ProtectedSandApp.s("ी\u0001") + Integer.toBinaryString((s4 & ((1 << s5) - 1)) | (1 << s5) | (1 << this.f62637d)).substring(1) + m0.greater;
    }
}
