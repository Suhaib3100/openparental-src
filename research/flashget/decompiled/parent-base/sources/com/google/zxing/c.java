package com.google.zxing;

import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: BinaryBitmap.java */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f62646a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.zxing.common.b f62647b;

    public c(b bVar) {
        if (bVar == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ू\u0001"));
        }
        this.f62646a = bVar;
    }

    public c a(int i4, int i5, int i6, int i7) {
        return new c(this.f62646a.a(this.f62646a.e().a(i4, i5, i6, i7)));
    }

    public com.google.zxing.common.b b() throws NotFoundException {
        if (this.f62647b == null) {
            this.f62647b = this.f62646a.b();
        }
        return this.f62647b;
    }

    public com.google.zxing.common.a c(int i4, com.google.zxing.common.a aVar) throws NotFoundException {
        return this.f62646a.c(i4, aVar);
    }

    public int d() {
        return this.f62646a.d();
    }

    public int e() {
        return this.f62646a.f();
    }

    public boolean f() {
        return this.f62646a.e().g();
    }

    public boolean g() {
        return this.f62646a.e().h();
    }

    public c h() {
        return new c(this.f62646a.a(this.f62646a.e().i()));
    }

    public c i() {
        return new c(this.f62646a.a(this.f62646a.e().j()));
    }

    public String toString() {
        try {
            return b().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
