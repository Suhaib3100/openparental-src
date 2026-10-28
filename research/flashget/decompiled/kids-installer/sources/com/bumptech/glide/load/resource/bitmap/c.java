package com.bumptech.glide.load.resource.bitmap;

import android.graphics.drawable.BitmapDrawable;

/* compiled from: BitmapDrawableResource.java */
/* loaded from: classes3.dex */
public class c extends com.bumptech.glide.load.resource.drawable.b<BitmapDrawable> implements com.bumptech.glide.load.engine.q {

    /* renamed from: p, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11696p;

    public c(BitmapDrawable bitmapDrawable, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        super(bitmapDrawable);
        this.f11696p = eVar;
    }

    @Override // com.bumptech.glide.load.engine.u
    public int a() {
        return com.bumptech.glide.util.n.h(((BitmapDrawable) this.f11805o).getBitmap());
    }

    @Override // com.bumptech.glide.load.resource.drawable.b, com.bumptech.glide.load.engine.q
    public void b() {
        ((BitmapDrawable) this.f11805o).getBitmap().prepareToDraw();
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.o0
    public Class<BitmapDrawable> c() {
        return BitmapDrawable.class;
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
        this.f11696p.d(((BitmapDrawable) this.f11805o).getBitmap());
    }
}
