package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.x0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
@x0(api = 28)
/* loaded from: classes3.dex */
public final class m implements com.bumptech.glide.load.k<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final g f44501a = new g();

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 ByteBuffer byteBuffer, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f44501a.c(createSource, i4, i5, iVar);
    }

    public boolean d(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }
}
