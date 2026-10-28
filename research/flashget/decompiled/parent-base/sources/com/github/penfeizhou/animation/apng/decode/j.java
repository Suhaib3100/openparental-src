package com.github.penfeizhou.animation.apng.decode;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: IHDRChunk.java */
/* loaded from: classes5.dex */
class j extends e {

    /* renamed from: h, reason: collision with root package name */
    static final int f50746h = e.a(ProtectedSandApp.s("쑴"));

    /* renamed from: e, reason: collision with root package name */
    int f50747e;

    /* renamed from: f, reason: collision with root package name */
    int f50748f;

    /* renamed from: g, reason: collision with root package name */
    byte[] f50749g = new byte[5];

    j() {
    }

    @Override // com.github.penfeizhou.animation.apng.decode.e
    void b(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        this.f50747e = aVar.c();
        this.f50748f = aVar.c();
        byte[] bArr = this.f50749g;
        aVar.read(bArr, 0, bArr.length);
    }
}
