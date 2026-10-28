package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.x0;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapImageDecoderResourceDecoder.java */
@x0(api = 28)
/* loaded from: classes3.dex */
public final class l implements com.bumptech.glide.load.k<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final f f11736a = new f();

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    @androidx.annotation.q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 ByteBuffer byteBuffer, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(byteBuffer);
        return this.f11736a.b(createSource, i5, i6, iVar);
    }

    public boolean d(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }
}
