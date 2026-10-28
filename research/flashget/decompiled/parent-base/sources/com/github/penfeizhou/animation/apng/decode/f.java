package com.github.penfeizhou.animation.apng.decode;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: FCTLChunk.java */
/* loaded from: classes5.dex */
class f extends e {

    /* renamed from: n, reason: collision with root package name */
    static final int f50727n = e.a(ProtectedSandApp.s("쑰"));

    /* renamed from: o, reason: collision with root package name */
    static final int f50728o = 0;

    /* renamed from: p, reason: collision with root package name */
    static final int f50729p = 1;

    /* renamed from: q, reason: collision with root package name */
    static final int f50730q = 2;

    /* renamed from: r, reason: collision with root package name */
    static final int f50731r = 0;

    /* renamed from: s, reason: collision with root package name */
    static final int f50732s = 1;

    /* renamed from: e, reason: collision with root package name */
    int f50733e;

    /* renamed from: f, reason: collision with root package name */
    int f50734f;

    /* renamed from: g, reason: collision with root package name */
    int f50735g;

    /* renamed from: h, reason: collision with root package name */
    int f50736h;

    /* renamed from: i, reason: collision with root package name */
    int f50737i;

    /* renamed from: j, reason: collision with root package name */
    short f50738j;

    /* renamed from: k, reason: collision with root package name */
    short f50739k;

    /* renamed from: l, reason: collision with root package name */
    byte f50740l;

    /* renamed from: m, reason: collision with root package name */
    byte f50741m;

    f() {
    }

    @Override // com.github.penfeizhou.animation.apng.decode.e
    void b(com.github.penfeizhou.animation.apng.io.a aVar) throws IOException {
        this.f50733e = aVar.c();
        this.f50734f = aVar.c();
        this.f50735g = aVar.c();
        this.f50736h = aVar.c();
        this.f50737i = aVar.c();
        this.f50738j = aVar.d();
        this.f50739k = aVar.d();
        this.f50740l = aVar.peek();
        this.f50741m = aVar.peek();
    }
}
