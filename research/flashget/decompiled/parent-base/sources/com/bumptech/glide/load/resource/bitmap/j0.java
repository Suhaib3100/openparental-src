package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: Rotate.java */
/* loaded from: classes3.dex */
public class j0 extends i {

    /* renamed from: d, reason: collision with root package name */
    private static final String f44490d = ProtectedSandApp.s("\u09b3");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f44491e = ProtectedSandApp.s("\u09b3").getBytes(com.bumptech.glide.load.f.f44241b);

    /* renamed from: c, reason: collision with root package name */
    private final int f44492c;

    public j0(int i4) {
        this.f44492c = i4;
    }

    @Override // com.bumptech.glide.load.f
    public void b(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f44491e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f44492c).array());
    }

    @Override // com.bumptech.glide.load.resource.bitmap.i
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        return m0.n(bitmap, this.f44492c);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return (obj instanceof j0) && this.f44492c == ((j0) obj).f44492c;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return com.bumptech.glide.util.o.q(-950519196, com.bumptech.glide.util.o.p(this.f44492c));
    }
}
