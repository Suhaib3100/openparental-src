package com.bumptech.glide.load;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.h0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f43822a = 5242880;

    /* compiled from: ImageHeaderParserUtils.java */
    class a implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f43823a;

        a(InputStream inputStream) {
            this.f43823a = inputStream;
        }

        @Override // com.bumptech.glide.load.e.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f43823a);
            } finally {
                this.f43823a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class b implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f43824a;

        b(ByteBuffer byteBuffer) {
            this.f43824a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.e.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.a(this.f43824a);
            } finally {
                com.bumptech.glide.util.a.d(this.f43824a);
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class c implements h {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f43825a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f43826b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f43825a = parcelFileDescriptorRewinder;
            this.f43826b = bVar;
        }

        @Override // com.bumptech.glide.load.e.h
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            h0 h0Var = null;
            try {
                h0 h0Var2 = new h0(new FileInputStream(this.f43825a.d().getFileDescriptor()), this.f43826b);
                try {
                    ImageHeaderParser.ImageType c5 = imageHeaderParser.c(h0Var2);
                    h0Var2.release();
                    this.f43825a.d();
                    return c5;
                } catch (Throwable th) {
                    th = th;
                    h0Var = h0Var2;
                    if (h0Var != null) {
                        h0Var.release();
                    }
                    this.f43825a.d();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class d implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f43827a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f43828b;

        d(ByteBuffer byteBuffer, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f43827a = byteBuffer;
            this.f43828b = bVar;
        }

        @Override // com.bumptech.glide.load.e.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.b(this.f43827a, this.f43828b);
            } finally {
                com.bumptech.glide.util.a.d(this.f43827a);
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$e, reason: collision with other inner class name */
    class C0734e implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f43829a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f43830b;

        C0734e(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f43829a = inputStream;
            this.f43830b = bVar;
        }

        @Override // com.bumptech.glide.load.e.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f43829a, this.f43830b);
            } finally {
                this.f43829a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    class f implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f43831a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f43832b;

        f(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f43831a = parcelFileDescriptorRewinder;
            this.f43832b = bVar;
        }

        @Override // com.bumptech.glide.load.e.g
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            h0 h0Var = null;
            try {
                h0 h0Var2 = new h0(new FileInputStream(this.f43831a.d().getFileDescriptor()), this.f43832b);
                try {
                    int d5 = imageHeaderParser.d(h0Var2, this.f43832b);
                    h0Var2.release();
                    this.f43831a.d();
                    return d5;
                } catch (Throwable th) {
                    th = th;
                    h0Var = h0Var2;
                    if (h0Var != null) {
                        h0Var.release();
                    }
                    this.f43831a.d();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface g {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface h {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private e() {
    }

    @x0(21)
    public static int a(@o0 List<ImageHeaderParser> list, @o0 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return d(list, new f(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(@o0 List<ImageHeaderParser> list, @q0 InputStream inputStream, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new h0(inputStream, bVar);
        }
        inputStream.mark(f43822a);
        return d(list, new C0734e(inputStream, bVar));
    }

    public static int c(@o0 List<ImageHeaderParser> list, @q0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (byteBuffer == null) {
            return -1;
        }
        return d(list, new d(byteBuffer, bVar));
    }

    private static int d(@o0 List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            int a5 = gVar.a(list.get(i4));
            if (a5 != -1) {
                return a5;
            }
        }
        return -1;
    }

    @o0
    @x0(21)
    public static ImageHeaderParser.ImageType e(@o0 List<ImageHeaderParser> list, @o0 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return h(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    @o0
    public static ImageHeaderParser.ImageType f(@o0 List<ImageHeaderParser> list, @q0 InputStream inputStream, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new h0(inputStream, bVar);
        }
        inputStream.mark(f43822a);
        return h(list, new a(inputStream));
    }

    @o0
    public static ImageHeaderParser.ImageType g(@o0 List<ImageHeaderParser> list, @q0 ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : h(list, new b(byteBuffer));
    }

    @o0
    private static ImageHeaderParser.ImageType h(@o0 List<ImageHeaderParser> list, h hVar) throws IOException {
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            ImageHeaderParser.ImageType a5 = hVar.a(list.get(i4));
            if (a5 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a5;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
