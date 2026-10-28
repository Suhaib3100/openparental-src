package com.google.zxing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LuminanceSource.java */
/* loaded from: classes6.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    private final int f62906a;

    /* renamed from: b, reason: collision with root package name */
    private final int f62907b;

    protected h(int i4, int i5) {
        this.f62906a = i4;
        this.f62907b = i5;
    }

    public h a(int i4, int i5, int i6, int i7) {
        throw new UnsupportedOperationException(ProtectedSandApp.s("શ\u0001"));
    }

    public final int b() {
        return this.f62907b;
    }

    public abstract byte[] c();

    public abstract byte[] d(int i4, byte[] bArr);

    public final int e() {
        return this.f62906a;
    }

    public h f() {
        return new g(this);
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public h i() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("ષ\u0001"));
    }

    public h j() {
        throw new UnsupportedOperationException(ProtectedSandApp.s("સ\u0001"));
    }

    public final String toString() {
        int i4 = this.f62906a;
        byte[] bArr = new byte[i4];
        StringBuilder sb = new StringBuilder((i4 + 1) * this.f62907b);
        for (int i5 = 0; i5 < this.f62907b; i5++) {
            bArr = d(i5, bArr);
            for (int i6 = 0; i6 < this.f62906a; i6++) {
                int i7 = bArr[i6] & 255;
                sb.append(i7 < 64 ? '#' : i7 < 128 ? '+' : i7 < 192 ? '.' : ' ');
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
