package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: Rotate.java */
/* loaded from: classes3.dex */
public class i0 extends h {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11725d = ProtectedSandApp.s("ᵠ");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f11726e = ProtectedSandApp.s("ᵡ").getBytes(com.bumptech.glide.load.f.f11501b);

    /* renamed from: c, reason: collision with root package name */
    private final int f11727c;

    public i0(int i5) {
        this.f11727c = i5;
    }

    @Override // com.bumptech.glide.load.f
    public void a(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f11726e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f11727c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        return l0.n(bitmap, this.f11727c);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return (obj instanceof i0) && this.f11727c == ((i0) obj).f11727c;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return (com.bumptech.glide.util.n.o(this.f11727c) * 31) - 950519196;
    }
}
