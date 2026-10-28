package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.File;

/* compiled from: BitmapDrawableEncoder.java */
/* loaded from: classes3.dex */
public class b implements com.bumptech.glide.load.l<BitmapDrawable> {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11676a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.l<Bitmap> f11677b;

    public b(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.l<Bitmap> lVar) {
        this.f11676a = eVar;
        this.f11677b = lVar;
    }

    @Override // com.bumptech.glide.load.l
    @androidx.annotation.o0
    public com.bumptech.glide.load.c b(@androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return this.f11677b.b(iVar);
    }

    @Override // com.bumptech.glide.load.d
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 com.bumptech.glide.load.engine.u<BitmapDrawable> uVar, @androidx.annotation.o0 File file, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return this.f11677b.a(new g(uVar.get().getBitmap(), this.f11676a), file, iVar);
    }
}
