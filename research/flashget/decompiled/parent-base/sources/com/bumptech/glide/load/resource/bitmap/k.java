package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes3.dex */
public class k implements com.bumptech.glide.load.k<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final w f44493a;

    public k(w wVar) {
        this.f44493a = wVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 ByteBuffer byteBuffer, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return this.f44493a.h(byteBuffer, i4, i5, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        this.f44493a.getClass();
        return true;
    }
}
