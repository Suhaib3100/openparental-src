package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import java.io.IOException;
import java.nio.ByteBuffer;

/* compiled from: ByteBufferBitmapDecoder.java */
/* loaded from: classes3.dex */
public class j implements com.bumptech.glide.load.k<ByteBuffer, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final v f11728a;

    public j(v vVar) {
        this.f11728a = vVar;
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 ByteBuffer byteBuffer, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return this.f11728a.f(com.bumptech.glide.util.a.f(byteBuffer), i5, i6, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        this.f11728a.getClass();
        return true;
    }
}
