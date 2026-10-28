package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.security.MessageDigest;

/* compiled from: FitCenter.java */
/* loaded from: classes3.dex */
public class a0 extends i {

    /* renamed from: c, reason: collision with root package name */
    private static final String f44428c = ProtectedSandApp.s("ঋ");

    /* renamed from: d, reason: collision with root package name */
    private static final byte[] f44429d = ProtectedSandApp.s("ঋ").getBytes(com.bumptech.glide.load.f.f44241b);

    @Override // com.bumptech.glide.load.f
    public void b(@androidx.annotation.o0 MessageDigest messageDigest) {
        messageDigest.update(f44429d);
    }

    @Override // com.bumptech.glide.load.resource.bitmap.i
    protected Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        return m0.f(eVar, bitmap, i4, i5);
    }

    @Override // com.bumptech.glide.load.f
    public boolean equals(Object obj) {
        return obj instanceof a0;
    }

    @Override // com.bumptech.glide.load.f
    public int hashCode() {
        return 1572326941;
    }
}
