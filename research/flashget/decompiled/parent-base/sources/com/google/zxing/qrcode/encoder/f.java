package com.google.zxing.qrcode.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.zxing.qrcode.decoder.h;
import com.google.zxing.qrcode.decoder.j;

/* compiled from: QRCode.java */
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: f, reason: collision with root package name */
    public static final int f63356f = 8;

    /* renamed from: a, reason: collision with root package name */
    private h f63357a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.zxing.qrcode.decoder.f f63358b;

    /* renamed from: c, reason: collision with root package name */
    private j f63359c;

    /* renamed from: d, reason: collision with root package name */
    private int f63360d = -1;

    /* renamed from: e, reason: collision with root package name */
    private b f63361e;

    public static boolean f(int i4) {
        return i4 >= 0 && i4 < 8;
    }

    public com.google.zxing.qrcode.decoder.f a() {
        return this.f63358b;
    }

    public int b() {
        return this.f63360d;
    }

    public b c() {
        return this.f63361e;
    }

    public h d() {
        return this.f63357a;
    }

    public j e() {
        return this.f63359c;
    }

    public void g(com.google.zxing.qrcode.decoder.f fVar) {
        this.f63358b = fVar;
    }

    public void h(int i4) {
        this.f63360d = i4;
    }

    public void i(b bVar) {
        this.f63361e = bVar;
    }

    public void j(h hVar) {
        this.f63357a = hVar;
    }

    public void k(j jVar) {
        this.f63359c = jVar;
    }

    public String toString() {
        StringBuilder a5 = androidx.fragment.app.a.a(200, ProtectedSandApp.s("౧\u0001"));
        a5.append(this.f63357a);
        a5.append(ProtectedSandApp.s("౨\u0001"));
        a5.append(this.f63358b);
        a5.append(ProtectedSandApp.s("౩\u0001"));
        a5.append(this.f63359c);
        a5.append(ProtectedSandApp.s("౪\u0001"));
        a5.append(this.f63360d);
        if (this.f63361e == null) {
            a5.append(ProtectedSandApp.s("౫\u0001"));
        } else {
            a5.append(ProtectedSandApp.s("౬\u0001"));
            a5.append(this.f63361e);
        }
        a5.append(ProtectedSandApp.s("౭\u0001"));
        return a5.toString();
    }
}
