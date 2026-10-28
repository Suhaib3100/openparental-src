package com.github.penfeizhou.animation.webp.decode;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: ANMFChunk.java */
/* loaded from: classes5.dex */
public class c extends e {

    /* renamed from: n, reason: collision with root package name */
    static final int f50862n = e.a(ProtectedSandApp.s("쒉"));

    /* renamed from: o, reason: collision with root package name */
    private static final int f50863o = 2;

    /* renamed from: p, reason: collision with root package name */
    private static final int f50864p = 1;

    /* renamed from: q, reason: collision with root package name */
    static final /* synthetic */ boolean f50865q = false;

    /* renamed from: e, reason: collision with root package name */
    int f50866e;

    /* renamed from: f, reason: collision with root package name */
    int f50867f;

    /* renamed from: g, reason: collision with root package name */
    int f50868g;

    /* renamed from: h, reason: collision with root package name */
    int f50869h;

    /* renamed from: i, reason: collision with root package name */
    int f50870i;

    /* renamed from: j, reason: collision with root package name */
    byte f50871j;

    /* renamed from: k, reason: collision with root package name */
    a f50872k;

    /* renamed from: l, reason: collision with root package name */
    i f50873l;

    /* renamed from: m, reason: collision with root package name */
    j f50874m;

    @Override // com.github.penfeizhou.animation.webp.decode.e
    void b(com.github.penfeizhou.animation.webp.io.a aVar) throws IOException {
        int available = aVar.available();
        this.f50866e = aVar.d();
        this.f50867f = aVar.d();
        this.f50868g = aVar.a();
        this.f50869h = aVar.a();
        this.f50870i = aVar.d();
        this.f50871j = aVar.peek();
        long j4 = available - this.f50884b;
        while (aVar.available() > j4) {
            e f4 = m.f(aVar);
            if (f4 instanceof a) {
                this.f50872k = (a) f4;
            } else if (f4 instanceof i) {
                this.f50873l = (i) f4;
            } else if (f4 instanceof j) {
                this.f50874m = (j) f4;
            }
        }
    }

    boolean d() {
        return (this.f50871j & 2) == 2;
    }

    boolean e() {
        return (this.f50871j & 1) == 1;
    }
}
