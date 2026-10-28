package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: CenterInside.java */
/* loaded from: classes3.dex */
public class o extends i {

    /* renamed from: c, reason: collision with root package name */
    private static final String f44518c = ProtectedSandApp.s("ৣ");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f44519d = ProtectedSandApp.s("ৣ").getBytes(com.bumptech.glide.load.f.f44241b);

    @Override // com.bumptech.glide.load.f
    public void b(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f44519d);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.i
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        return m0.c(eVar, bitmap, i4, i5);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return obj instanceof o;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return -670243078;
    }
}
