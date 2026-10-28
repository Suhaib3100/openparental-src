package com.google.zxing.pdf417.decoder;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: Codeword.java */
/* loaded from: classes6.dex */
final class d {

    /* renamed from: f, reason: collision with root package name */
    private static final int f63181f = -1;

    /* renamed from: a, reason: collision with root package name */
    private final int f63182a;

    /* renamed from: b, reason: collision with root package name */
    private final int f63183b;

    /* renamed from: c, reason: collision with root package name */
    private final int f63184c;

    /* renamed from: d, reason: collision with root package name */
    private final int f63185d;

    /* renamed from: e, reason: collision with root package name */
    private int f63186e = -1;

    d(int i4, int i5, int i6, int i7) {
        this.f63182a = i4;
        this.f63183b = i5;
        this.f63184c = i6;
        this.f63185d = i7;
    }

    int a() {
        return this.f63184c;
    }

    int b() {
        return this.f63183b;
    }

    int c() {
        return this.f63186e;
    }

    int d() {
        return this.f63182a;
    }

    int e() {
        return this.f63185d;
    }

    int f() {
        return this.f63183b - this.f63182a;
    }

    boolean g() {
        return h(this.f63186e);
    }

    boolean h(int i4) {
        return i4 != -1 && this.f63184c == (i4 % 3) * 3;
    }

    void i(int i4) {
        this.f63186e = i4;
    }

    void j() {
        this.f63186e = (this.f63184c / 3) + ((this.f63185d / 30) * 3);
    }

    public String toString() {
        return this.f63186e + ProtectedSandApp.s("ఉ\u0001") + this.f63185d;
    }
}
