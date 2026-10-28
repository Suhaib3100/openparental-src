package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.flashget.kidsdownloader.ProtectedSandApp;

/* compiled from: BitmapResource.java */
/* loaded from: classes3.dex */
public class g implements com.bumptech.glide.load.engine.u<Bitmap>, com.bumptech.glide.load.engine.q {

    /* renamed from: o, reason: collision with root package name */
    private final Bitmap f11714o;

    /* renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11715p;

    public g(@androidx.annotation.o0 Bitmap bitmap, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        this.f11714o = (Bitmap) com.bumptech.glide.util.l.e(bitmap, ProtectedSandApp.s("ᵝ"));
        this.f11715p = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.l.e(eVar, ProtectedSandApp.s("ᵞ"));
    }

    @androidx.annotation.q0
    public static g e(@androidx.annotation.q0 Bitmap bitmap, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        if (bitmap == null) {
            return null;
        }
        return new g(bitmap, eVar);
    }

    @Override // com.bumptech.glide.load.engine.u
    public int a() {
        return com.bumptech.glide.util.n.h(this.f11714o);
    }

    @Override // com.bumptech.glide.load.engine.q
    public void b() {
        this.f11714o.prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    public Class<Bitmap> c() {
        return Bitmap.class;
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public Bitmap get() {
        return this.f11714o;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
        this.f11715p.d(this.f11714o);
    }
}
