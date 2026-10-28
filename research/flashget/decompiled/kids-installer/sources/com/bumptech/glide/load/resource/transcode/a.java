package com.bumptech.glide.load.resource.transcode;

import android.graphics.Bitmap;
import androidx.annotation.o0;
import androidx.annotation.q0;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.load.i;
import java.io.ByteArrayOutputStream;

/* compiled from: BitmapBytesTranscoder.java */
/* loaded from: classes3.dex */
public class a implements e<Bitmap, byte[]> {

    /* renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f11885a;

    /* renamed from: b, reason: collision with root package name */
    private final int f11886b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // com.bumptech.glide.load.resource.transcode.e
    @q0
    public u<byte[]> a(@o0 u<Bitmap> uVar, @o0 i iVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        uVar.get().compress(this.f11885a, this.f11886b, byteArrayOutputStream);
        uVar.recycle();
        return new x0.b(byteArrayOutputStream.toByteArray());
    }

    public a(@o0 Bitmap.CompressFormat compressFormat, int i5) {
        this.f11885a = compressFormat;
        this.f11886b = i5;
    }
}
