package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.v;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes3.dex */
public class k0 implements com.bumptech.glide.load.k<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final v f11732a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f11733b;

    /* compiled from: StreamBitmapDecoder.java */
    static class a implements v.b {

        /* renamed from: a, reason: collision with root package name */
        private final g0 f11734a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.util.e f11735b;

        a(g0 g0Var, com.bumptech.glide.util.e eVar) {
            this.f11734a = g0Var;
            this.f11735b = eVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v.b
        public void a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException {
            IOException b6 = this.f11735b.b();
            if (b6 != null) {
                if (bitmap == null) {
                    throw b6;
                }
                eVar.d(bitmap);
                throw b6;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v.b
        public void b() {
            this.f11734a.b();
        }
    }

    public k0(v vVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f11732a = vVar;
        this.f11733b = bVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 InputStream inputStream, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        boolean z5;
        g0 g0Var;
        if (inputStream instanceof g0) {
            g0Var = (g0) inputStream;
            z5 = false;
        } else {
            z5 = true;
            g0Var = new g0(inputStream, this.f11733b);
        }
        com.bumptech.glide.util.e c6 = com.bumptech.glide.util.e.c(g0Var);
        try {
            return this.f11732a.g(new com.bumptech.glide.util.j(c6), i5, i6, iVar, new a(g0Var, c6));
        } finally {
            c6.release();
            if (z5) {
                g0Var.release();
            }
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        this.f11732a.getClass();
        return true;
    }
}
