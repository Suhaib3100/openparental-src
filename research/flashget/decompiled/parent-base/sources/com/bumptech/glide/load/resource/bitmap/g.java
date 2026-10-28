package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.x0;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
@x0(api = 28)
/* loaded from: classes3.dex */
public final class g implements com.bumptech.glide.load.k<ImageDecoder.Source, Bitmap> {

    /* renamed from: b, reason: collision with root package name */
    private static final String f44475b = ProtectedSandApp.s("ফ");

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44476a = new com.bumptech.glide.load.engine.bitmap_recycle.f();

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 ImageDecoder.Source source, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        f.a(source);
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 ImageDecoder.Source source, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return c(f.a(source), i4, i5, iVar);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> c(@androidx.annotation.o0 ImageDecoder.Source source, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, new com.bumptech.glide.load.resource.i(i4, i5, iVar));
        if (Log.isLoggable(ProtectedSandApp.s("ফ"), 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new h(decodeBitmap, this.f44476a);
    }

    public boolean d(@androidx.annotation.o0 ImageDecoder.Source source, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        return true;
    }
}
