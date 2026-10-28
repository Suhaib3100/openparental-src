package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: RoundedCorners.java */
/* loaded from: classes3.dex */
public final class j0 extends h {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11729d = ProtectedSandApp.s("ᵢ");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f11730e = ProtectedSandApp.s("ᵣ").getBytes(com.bumptech.glide.load.f.f11501b);

    /* renamed from: c, reason: collision with root package name */
    private final int f11731c;

    public j0(int i5) {
        com.bumptech.glide.util.l.a(i5 > 0, ProtectedSandApp.s("ᵤ"));
        this.f11731c = i5;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f11730e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f11731c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        return l0.q(eVar, bitmap, this.f11731c);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return (obj instanceof j0) && this.f11731c == ((j0) obj).f11731c;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return (com.bumptech.glide.util.n.o(this.f11731c) * 31) - 569625254;
    }
}
