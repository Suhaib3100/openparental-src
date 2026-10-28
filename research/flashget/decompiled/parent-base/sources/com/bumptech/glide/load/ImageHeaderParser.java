package com.bumptech.glide.load;

import androidx.annotation.o0;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public interface ImageHeaderParser {

    /* renamed from: a, reason: collision with root package name */
    public static final int f43758a = -1;

    public enum ImageType {
        GIF(true),
        JPEG(false),
        RAW(false),
        PNG_A(true),
        PNG(false),
        WEBP_A(true),
        WEBP(false),
        ANIMATED_WEBP(true),
        AVIF(true),
        ANIMATED_AVIF(true),
        UNKNOWN(false);

        private final boolean hasAlpha;

        ImageType(boolean z4) {
            this.hasAlpha = z4;
        }

        public boolean hasAlpha() {
            return this.hasAlpha;
        }

        public boolean isWebp() {
            int i4 = a.f43759a[ordinal()];
            return i4 == 1 || i4 == 2 || i4 == 3;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f43759a;

        static {
            int[] iArr = new int[ImageType.values().length];
            f43759a = iArr;
            try {
                iArr[ImageType.WEBP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f43759a[ImageType.WEBP_A.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f43759a[ImageType.ANIMATED_WEBP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @o0
    ImageType a(@o0 ByteBuffer byteBuffer) throws IOException;

    int b(@o0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;

    @o0
    ImageType c(@o0 InputStream inputStream) throws IOException;

    int d(@o0 InputStream inputStream, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException;
}
