package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes3.dex */
public final class f0 implements com.bumptech.glide.load.engine.u<BitmapDrawable>, com.bumptech.glide.load.engine.q {

    /* renamed from: b, reason: collision with root package name */
    private final Resources f44473b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.u<Bitmap> f44474c;

    private f0(@androidx.annotation.o0 Resources resources, @androidx.annotation.o0 com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        String s4 = ProtectedSandApp.s("ন");
        this.f44473b = (Resources) com.bumptech.glide.util.m.f(resources, s4);
        this.f44474c = (com.bumptech.glide.load.engine.u) com.bumptech.glide.util.m.f(uVar, s4);
    }

    @androidx.annotation.q0
    public static com.bumptech.glide.load.engine.u<BitmapDrawable> d(@androidx.annotation.o0 Resources resources, @androidx.annotation.q0 com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new f0(resources, uVar);
    }

    @Deprecated
    public static f0 e(Context context, Bitmap bitmap) {
        return (f0) d(context.getResources(), h.d(bitmap, com.bumptech.glide.c.e(context).h()));
    }

    @Deprecated
    public static f0 f(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        return (f0) d(resources, h.d(bitmap, eVar));
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    public Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f44473b, this.f44474c.get());
    }

    @Override // com.bumptech.glide.load.engine.q
    public void c() {
        com.bumptech.glide.load.engine.u<Bitmap> uVar = this.f44474c;
        if (uVar instanceof com.bumptech.glide.load.engine.q) {
            ((com.bumptech.glide.load.engine.q) uVar).c();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
        return this.f44474c.getSize();
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
        this.f44474c.recycle();
    }
}
