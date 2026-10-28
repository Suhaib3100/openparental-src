package com.github.penfeizhou.animation.webp.decode;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: VP8XChunk.java */
/* loaded from: classes5.dex */
public class k extends e {

    /* renamed from: h, reason: collision with root package name */
    static final int f50891h = e.a(ProtectedSandApp.s("쒐"));

    /* renamed from: i, reason: collision with root package name */
    private static final int f50892i = 2;

    /* renamed from: j, reason: collision with root package name */
    private static final int f50893j = 16;

    /* renamed from: e, reason: collision with root package name */
    byte f50894e;

    /* renamed from: f, reason: collision with root package name */
    public int f50895f;

    /* renamed from: g, reason: collision with root package name */
    public int f50896g;

    @Override // com.github.penfeizhou.animation.webp.decode.e
    void b(com.github.penfeizhou.animation.webp.io.a aVar) throws IOException {
        this.f50894e = aVar.peek();
        aVar.skip(3L);
        this.f50895f = aVar.a();
        this.f50896g = aVar.a();
    }

    boolean d() {
        return (this.f50894e & com.google.common.base.c.f54872r) == 16;
    }

    boolean e() {
        return (this.f50894e & 2) == 2;
    }
}
