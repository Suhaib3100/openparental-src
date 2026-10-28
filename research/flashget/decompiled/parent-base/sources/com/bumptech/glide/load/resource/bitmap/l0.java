package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import com.bumptech.glide.load.resource.bitmap.w;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: StreamBitmapDecoder.java */
/* loaded from: classes3.dex */
public class l0 implements com.bumptech.glide.load.k<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final w f44497a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44498b;

    /* compiled from: StreamBitmapDecoder.java */
    static class a implements w.b {

        /* renamed from: a, reason: collision with root package name */
        private final h0 f44499a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.util.e f44500b;

        a(h0 h0Var, com.bumptech.glide.util.e eVar) {
            this.f44499a = h0Var;
            this.f44500b = eVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w.b
        public void a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException {
            IOException b5 = this.f44500b.b();
            if (b5 != null) {
                if (bitmap == null) {
                    throw b5;
                }
                eVar.e(bitmap);
                throw b5;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w.b
        public void b() {
            this.f44499a.b();
        }
    }

    public l0(w wVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f44497a = wVar;
        this.f44498b = bVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 InputStream inputStream, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        boolean z4;
        h0 h0Var;
        if (inputStream instanceof h0) {
            h0Var = (h0) inputStream;
            z4 = false;
        } else {
            z4 = true;
            h0Var = new h0(inputStream, this.f44498b);
        }
        com.bumptech.glide.util.e c5 = com.bumptech.glide.util.e.c(h0Var);
        try {
            return this.f44497a.g(new com.bumptech.glide.util.k(c5), i4, i5, iVar, new a(h0Var, c5));
        } finally {
            c5.release();
            if (z4) {
                h0Var.release();
            }
        }
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        this.f44497a.getClass();
        return true;
    }
}
