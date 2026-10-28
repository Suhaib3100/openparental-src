package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: BitmapResource.java */
/* loaded from: classes3.dex */
public class h implements com.bumptech.glide.load.engine.u<Bitmap>, com.bumptech.glide.load.engine.q {

    /* renamed from: b, reason: collision with root package name */
    private final Bitmap f44479b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44480c;

    public h(@androidx.annotation.o0 Bitmap bitmap, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f44479b = (Bitmap) com.bumptech.glide.util.m.f(bitmap, ProtectedSandApp.s("র"));
        this.f44480c = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.m.f(eVar, ProtectedSandApp.s("\u09b1"));
    }

    @androidx.annotation.q0
    public static h d(@androidx.annotation.q0 Bitmap bitmap, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new h(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    public Class<Bitmap> a() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f44479b;
    }

    @Override // com.bumptech.glide.load.engine.q
    public void c() {
        this.f44479b.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
        return com.bumptech.glide.util.o.i(this.f44479b);
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
        this.f44480c.e(this.f44479b);
    }
}
