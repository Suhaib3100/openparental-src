package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: RoundedCorners.java */
/* loaded from: classes3.dex */
public final class k0 extends i {

    /* renamed from: d, reason: collision with root package name */
    private static final String f44494d = ProtectedSandApp.s("\u09b4");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f44495e = ProtectedSandApp.s("\u09b4").getBytes(com.bumptech.glide.load.f.f44241b);

    /* renamed from: c, reason: collision with root package name */
    private final int f44496c;

    public k0(int i4) {
        com.bumptech.glide.util.m.b(i4 > 0, ProtectedSandApp.s("\u09b5"));
        this.f44496c = i4;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f44495e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f44496c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.i
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        return m0.q(eVar, bitmap, this.f44496c);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return (obj instanceof k0) && this.f44496c == ((k0) obj).f44496c;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return com.bumptech.glide.util.o.q(-569625254, com.bumptech.glide.util.o.p(this.f44496c));
    }
}
