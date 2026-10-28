package com.google.zxing.datamatrix.encoder;

import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.charset.StandardCharsets;

/* compiled from: EncoderContext.java */
/* loaded from: classes6.dex */
final class h {

    /* renamed from: a, reason: collision with root package name */
    private final String f62859a;

    /* renamed from: b, reason: collision with root package name */
    private l f62860b;

    /* renamed from: c, reason: collision with root package name */
    private com.google.zxing.e f62861c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.zxing.e f62862d;

    /* renamed from: e, reason: collision with root package name */
    private final StringBuilder f62863e;

    /* renamed from: f, reason: collision with root package name */
    int f62864f;

    /* renamed from: g, reason: collision with root package name */
    private int f62865g;

    /* renamed from: h, reason: collision with root package name */
    private k f62866h;

    /* renamed from: i, reason: collision with root package name */
    private int f62867i;

    h(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.ISO_8859_1);
        StringBuilder sb = new StringBuilder(bytes.length);
        int length = bytes.length;
        for (int i4 = 0; i4 < length; i4++) {
            char c5 = (char) (bytes[i4] & 255);
            if (c5 == '?' && str.charAt(i4) != '?') {
                throw new IllegalArgumentException(ProtectedSandApp.s("છ\u0001"));
            }
            sb.append(c5);
        }
        this.f62859a = sb.toString();
        this.f62860b = l.FORCE_NONE;
        this.f62863e = new StringBuilder(str.length());
        this.f62865g = -1;
    }

    private int i() {
        return this.f62859a.length() - this.f62867i;
    }

    public int a() {
        return this.f62863e.length();
    }

    public StringBuilder b() {
        return this.f62863e;
    }

    public char c() {
        return this.f62859a.charAt(this.f62864f);
    }

    public char d() {
        return this.f62859a.charAt(this.f62864f);
    }

    public String e() {
        return this.f62859a;
    }

    public int f() {
        return this.f62865g;
    }

    public int g() {
        return i() - this.f62864f;
    }

    public k h() {
        return this.f62866h;
    }

    public boolean j() {
        return this.f62864f < i();
    }

    public void k() {
        this.f62865g = -1;
    }

    public void l() {
        this.f62866h = null;
    }

    public void m(com.google.zxing.e eVar, com.google.zxing.e eVar2) {
        this.f62861c = eVar;
        this.f62862d = eVar2;
    }

    public void n(int i4) {
        this.f62867i = i4;
    }

    public void o(l lVar) {
        this.f62860b = lVar;
    }

    public void p(int i4) {
        this.f62865g = i4;
    }

    public void q() {
        r(this.f62863e.length());
    }

    public void r(int i4) {
        k kVar = this.f62866h;
        if (kVar == null || i4 > kVar.b()) {
            this.f62866h = k.o(i4, this.f62860b, this.f62861c, this.f62862d, true);
        }
    }

    public void s(char c5) {
        this.f62863e.append(c5);
    }

    public void t(String str) {
        this.f62863e.append(str);
    }
}
