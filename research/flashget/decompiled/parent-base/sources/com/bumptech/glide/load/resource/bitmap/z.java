package com.bumptech.glide.load.resource.bitmap;

import androidx.annotation.x0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: ExifInterfaceImageHeaderParser.java */
@x0(27)
/* loaded from: classes3.dex */
public final class z implements ImageHeaderParser {
    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.o0
    public ImageHeaderParser.ImageType a(@androidx.annotation.o0 ByteBuffer byteBuffer) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int b(@androidx.annotation.o0 ByteBuffer byteBuffer, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return d(com.bumptech.glide.util.a.g(byteBuffer), bVar);
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    @androidx.annotation.o0
    public ImageHeaderParser.ImageType c(@androidx.annotation.o0 InputStream inputStream) {
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public int d(@androidx.annotation.o0 InputStream inputStream, @androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        int l4 = new androidx.exifinterface.media.a(inputStream, 0).l(ProtectedSandApp.s("ਃ"), 1);
        if (l4 == 0) {
            return -1;
        }
        return l4;
    }
}
