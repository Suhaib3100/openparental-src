package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes3.dex */
public class n extends h {

    /* renamed from: c, reason: collision with root package name */
    private static final String f11753c = ProtectedSandApp.s("ᵬ");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f11754d = ProtectedSandApp.s("ᵭ").getBytes(com.bumptech.glide.load.f.f11501b);

    @Override // com.bumptech.glide.load.f
    public void a(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f11754d);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.h
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        return l0.c(eVar, bitmap, i5, i6);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return obj instanceof n;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return -670243078;
    }
}
