package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: CircleCrop.java */
/* loaded from: classes3.dex */
public class o extends h {

    /* renamed from: c, reason: collision with root package name */
    private static final int f11755c = 1;

    /* renamed from: d, reason: collision with root package name */
    private static final String f11756d = ProtectedSandApp.s("ᵮ");

    /* renamed from: e, reason: collision with root package name */
    private static final byte[] f11757e = ProtectedSandApp.s("ᵯ").getBytes(com.bumptech.glide.load.f.f11501b);

    @Override // com.bumptech.glide.load.f
    public void a(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f11757e);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        return l0.d(eVar, bitmap, i5, i6);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return obj instanceof o;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return 1101716364;
    }
}
