package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: BitmapDrawableResource.java */
/* loaded from: classes3.dex */
public class c extends com.bumptech.glide.load.resource.drawable.j<BitmapDrawable> implements com.bumptech.glide.load.engine.q {

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44438c;

    public c(BitmapDrawable bitmapDrawable, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(bitmapDrawable);
        this.f44438c = eVar;
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    public Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.resource.drawable.j, com.bumptech.glide.load.engine.q
    public void c() {
        ((BitmapDrawable) this.f44582b).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
        return com.bumptech.glide.util.o.i(((BitmapDrawable) this.f44582b).getBitmap());
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
        this.f44438c.e(((BitmapDrawable) this.f44582b).getBitmap());
    }
}
