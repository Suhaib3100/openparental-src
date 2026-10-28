package com.bumptech.glide.load;

import androidx.annotation.o0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public interface ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final int f11053a = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z5) {
            this.hasAlpha = z5;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }
    }

    @o0
    ImageType a(@o0 ByteBuffer byteBuffer) throws IOException;

    int b(@o0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;

    @o0
    ImageType c(@o0 InputStream inputStream) throws IOException;

    int d(@o0 InputStream inputStream, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;
}
