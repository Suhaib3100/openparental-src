package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import androidx.annotation.x0;
import java.io.IOException;

/* compiled from: ParcelFileDescriptorBitmapDecoder.java */
@x0(21)
/* loaded from: classes3.dex */
public final class f0 implements com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> {

    /* renamed from: a, reason: collision with root package name */
    private final v f11713a;

    public f0(v vVar) {
        this.f11713a = vVar;
    }

    @Override // com.bumptech.glide.load.k
    @androidx.annotation.q0
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 ParcelFileDescriptor parcelFileDescriptor, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return this.f11713a.d(parcelFileDescriptor, i5, i6, iVar);
    }

    @Override // com.bumptech.glide.load.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(@androidx.annotation.o0 ParcelFileDescriptor parcelFileDescriptor, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        this.f11713a.getClass();
        return true;
    }
}
