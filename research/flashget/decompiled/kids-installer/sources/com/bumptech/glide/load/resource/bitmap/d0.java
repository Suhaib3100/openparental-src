package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import androidx.annotation.x0;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: InputStreamBitmapImageDecoderResourceDecoder.java */
@x0(api = 28)
/* loaded from: classes3.dex */
public final class d0 implements com.bumptech.glide.load.k<InputStream, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final f f11704a = new f();

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    @androidx.annotation.q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 InputStream inputStream, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        ImageDecoder.Source createSource;
        createSource = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream));
        return this.f11704a.b(createSource, i5, i6, iVar);
    }

    public boolean d(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }
}
