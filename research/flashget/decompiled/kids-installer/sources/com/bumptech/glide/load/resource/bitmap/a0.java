package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: GranularRoundedCorners.java */
/* loaded from: classes3.dex */
public final class a0 extends h {

    /* renamed from: g, reason: collision with root package name */
    private static final String f11670g = ProtectedSandApp.s("ᵓ");

    /* renamed from: h, reason: collision with root package name */
    private static final byte[] f11671h = ProtectedSandApp.s("ᵔ").getBytes(com.bumptech.glide.load.f.f11501b);

    /* renamed from: c, reason: collision with root package name */
    private final float f11672c;

    /* renamed from: d, reason: collision with root package name */
    private final float f11673d;

    /* renamed from: e, reason: collision with root package name */
    private final float f11674e;

    /* renamed from: f, reason: collision with root package name */
    private final float f11675f;

    public a0(float f6, float f7, float f8, float f9) {
        this.f11672c = f6;
        this.f11673d = f7;
        this.f11674e = f8;
        this.f11675f = f9;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f11671h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f11672c).putFloat(this.f11673d).putFloat(this.f11674e).putFloat(this.f11675f).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        return l0.p(eVar, bitmap, this.f11672c, this.f11673d, this.f11674e, this.f11675f);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        return this.f11672c == a0Var.f11672c && this.f11673d == a0Var.f11673d && this.f11674e == a0Var.f11674e && this.f11675f == a0Var.f11675f;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return com.bumptech.glide.util.n.n(this.f11675f, com.bumptech.glide.util.n.n(this.f11674e, com.bumptech.glide.util.n.n(this.f11673d, (com.bumptech.glide.util.n.m(this.f11672c) * 31) - 2013597734)));
    }
}
