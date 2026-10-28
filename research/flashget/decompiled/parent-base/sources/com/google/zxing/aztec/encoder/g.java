package com.google.zxing.aztec.encoder;

/* compiled from: Token.java */
/* loaded from: classes6.dex */
abstract class g {

    /* renamed from: b, reason: collision with root package name */
    static final g f62643b = new e(null, 0, 0);

    /* renamed from: a, reason: collision with root package name */
    private final g f62644a;

    g(g gVar) {
        this.f62644a = gVar;
    }

    final g a(int i4, int i5) {
        return new e(this, i4, i5);
    }

    final g b(int i4, int i5) {
        return new b(this, i4, i5);
    }

    abstract void c(com.google.zxing.common.a aVar, byte[] bArr);

    final g d() {
        return this.f62644a;
    }
}
