package com.google.zxing;

/* compiled from: Binarizer.java */
/* loaded from: classes6.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final h f62645a;

    protected b(h hVar) {
        this.f62645a = hVar;
    }

    public abstract b a(h hVar);

    public abstract com.google.zxing.common.b b() throws NotFoundException;

    public abstract com.google.zxing.common.a c(int i4, com.google.zxing.common.a aVar) throws NotFoundException;

    public final int d() {
        return this.f62645a.b();
    }

    public final h e() {
        return this.f62645a;
    }

    public final int f() {
        return this.f62645a.e();
    }
}
