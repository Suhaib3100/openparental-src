package com.bumptech.glide.load.resource.bitmap;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* compiled from: LazyBitmapDrawableResource.java */
/* loaded from: classes3.dex */
public final class e0 implements com.bumptech.glide.load.engine.u<BitmapDrawable>, com.bumptech.glide.load.engine.q {

    /* renamed from: o, reason: collision with root package name */
    private final Resources f11709o;

    /* renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.u<Bitmap> f11710p;

    private e0(@androidx.annotation.o0 Resources resources, @androidx.annotation.o0 com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        this.f11709o = (Resources) com.bumptech.glide.util.l.d(resources);
        this.f11710p = (com.bumptech.glide.load.engine.u) com.bumptech.glide.util.l.d(uVar);
    }

    @androidx.annotation.q0
    public static com.bumptech.glide.load.engine.u<BitmapDrawable> e(@androidx.annotation.o0 Resources resources, @androidx.annotation.q0 com.bumptech.glide.load.engine.u<Bitmap> uVar) {
        if (uVar == null) {
            return null;
        }
        return new e0(resources, uVar);
    }

    @Deprecated
    public static e0 f(Context context, Bitmap bitmap) {
        return (e0) e(context.getResources(), g.e(bitmap, com.bumptech.glide.b.e(context).h()));
    }

    @Deprecated
    public static e0 g(Resources resources, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        return (e0) e(resources, g.e(bitmap, eVar));
    }

    @Override // com.bumptech.glide.load.engine.u
    public int a() {
        return this.f11710p.a();
    }

    @Override // com.bumptech.glide.load.engine.q
    public void b() {
        com.bumptech.glide.load.engine.u<Bitmap> uVar = this.f11710p;
        if (uVar instanceof com.bumptech.glide.load.engine.q) {
            ((com.bumptech.glide.load.engine.q) uVar).b();
        }
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public BitmapDrawable get() {
        return new BitmapDrawable(this.f11709o, this.f11710p.get());
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
        this.f11710p.recycle();
    }
}
