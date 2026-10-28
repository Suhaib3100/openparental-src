package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import androidx.annotation.x0;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;

/* compiled from: BitmapImageDecoderResourceDecoder.java */
@x0(api = 28)
/* loaded from: classes3.dex */
public final class f extends com.bumptech.glide.load.resource.j<Bitmap> {

    /* renamed from: d, reason: collision with root package name */
    private static final String f11711d = ProtectedSandApp.s("ᵜ");

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11712c = new com.bumptech.glide.load.engine.bitmap_recycle.f();

    @Override // com.bumptech.glide.load.resource.j
    protected com.bumptech.glide.load.engine.u<Bitmap> c(ImageDecoder.Source source, int i5, int i6, ImageDecoder.OnHeaderDecodedListener onHeaderDecodedListener) throws IOException {
        Bitmap decodeBitmap;
        decodeBitmap = ImageDecoder.decodeBitmap(source, onHeaderDecodedListener);
        if (Log.isLoggable(ProtectedSandApp.s("ᵛ"), 2)) {
            decodeBitmap.getWidth();
            decodeBitmap.getHeight();
        }
        return new g(decodeBitmap, this.f11712c);
    }
}
