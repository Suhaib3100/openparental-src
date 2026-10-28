package com.google.zxing.qrcode.decoder;

import com.google.zxing.p;

/* compiled from: QRCodeDecoderMetaData.java */
/* loaded from: classes6.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f63300a;

    i(boolean z4) {
        this.f63300a = z4;
    }

    public void a(p[] pVarArr) {
        if (!this.f63300a || pVarArr == null || pVarArr.length < 3) {
            return;
        }
        p pVar = pVarArr[0];
        pVarArr[0] = pVarArr[2];
        pVarArr[2] = pVar;
    }

    public boolean b() {
        return this.f63300a;
    }
}
