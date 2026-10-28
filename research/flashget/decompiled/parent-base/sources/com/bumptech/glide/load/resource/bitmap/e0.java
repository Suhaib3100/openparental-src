package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.x0;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
@x0(api = 28)
/* loaded from: classes3.dex */
public final class e0 implements com.bumptech.glide.load.k<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final g f44472a = new g();

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 InputStream inputStream, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream));
        return this.f44472a.c(createSource, i4, i5, iVar);
    }

    public boolean d(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }
}
