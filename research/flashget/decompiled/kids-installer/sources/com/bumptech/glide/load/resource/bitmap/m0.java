package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;

/* compiled from: UnitBitmapDecoder.java */
/* loaded from: classes3.dex */
public final class m0 implements com.bumptech.glide.load.k<Bitmap, Bitmap> {

    /* compiled from: UnitBitmapDecoder.java */
    private static final class a implements com.bumptech.glide.load.engine.u<Bitmap> {

        /* renamed from: o, reason: collision with root package name */
        private final Bitmap f11752o;

        a(@androidx.annotation.o0 Bitmap bitmap) {
            this.f11752o = bitmap;
        }

        @Override // com.bumptech.glide.load.engine.u
        public int a() {
            return com.bumptech.glide.util.n.h(this.f11752o);
        }

        @androidx.annotation.o0
        public Bitmap b() {
            return this.f11752o;
        }

        @Override // com.bumptech.glide.load.engine.u
        @androidx.annotation.o0
        public Class<Bitmap> c() {
            return Bitmap.class;
        }

        @Override // com.bumptech.glide.load.engine.u
        @androidx.annotation.o0
        public Bitmap get() {
            return this.f11752o;
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
        }
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 Bitmap bitmap, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 Bitmap bitmap, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return new a(bitmap);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> c(@androidx.annotation.o0 Bitmap bitmap, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return new a(bitmap);
    }

    public boolean d(@androidx.annotation.o0 Bitmap bitmap, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return true;
    }
}
