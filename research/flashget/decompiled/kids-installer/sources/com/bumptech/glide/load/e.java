package com.bumptech.glide.load;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.g0;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageHeaderParserUtils.java */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int f11116a = 5242880;

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes3.dex */
    class a implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f11117a;

        a(InputStream inputStream) {
            this.f11117a = inputStream;
        }

        @Override // com.bumptech.glide.load.e.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.c(this.f11117a);
            } finally {
                this.f11117a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes3.dex */
    class b implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ByteBuffer f11118a;

        b(ByteBuffer byteBuffer) {
            this.f11118a = byteBuffer;
        }

        @Override // com.bumptech.glide.load.e.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            return imageHeaderParser.a(this.f11118a);
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes3.dex */
    class c implements g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f11119a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f11120b;

        c(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f11119a = parcelFileDescriptorRewinder;
            this.f11120b = bVar;
        }

        @Override // com.bumptech.glide.load.e.g
        public ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
            g0 g0Var = null;
            try {
                g0 g0Var2 = new g0(new FileInputStream(this.f11119a.a().getFileDescriptor()), this.f11120b);
                try {
                    ImageHeaderParser.ImageType c6 = imageHeaderParser.c(g0Var2);
                    try {
                        g0Var2.close();
                    } catch (IOException unused) {
                    }
                    this.f11119a.a();
                    return c6;
                } catch (Throwable th) {
                    th = th;
                    g0Var = g0Var2;
                    if (g0Var != null) {
                        try {
                            g0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f11119a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* loaded from: classes3.dex */
    class d implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InputStream f11121a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f11122b;

        d(InputStream inputStream, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f11121a = inputStream;
            this.f11122b = bVar;
        }

        @Override // com.bumptech.glide.load.e.f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            try {
                return imageHeaderParser.d(this.f11121a, this.f11122b);
            } finally {
                this.f11121a.reset();
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    /* renamed from: com.bumptech.glide.load.e$e, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0135e implements f {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ParcelFileDescriptorRewinder f11123a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.engine.bitmap_recycle.b f11124b;

        C0135e(ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f11123a = parcelFileDescriptorRewinder;
            this.f11124b = bVar;
        }

        @Override // com.bumptech.glide.load.e.f
        public int a(ImageHeaderParser imageHeaderParser) throws IOException {
            g0 g0Var = null;
            try {
                g0 g0Var2 = new g0(new FileInputStream(this.f11123a.a().getFileDescriptor()), this.f11124b);
                try {
                    int d6 = imageHeaderParser.d(g0Var2, this.f11124b);
                    try {
                        g0Var2.close();
                    } catch (IOException unused) {
                    }
                    this.f11123a.a();
                    return d6;
                } catch (Throwable th) {
                    th = th;
                    g0Var = g0Var2;
                    if (g0Var != null) {
                        try {
                            g0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    this.f11123a.a();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface f {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* compiled from: ImageHeaderParserUtils.java */
    private interface g {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private e() {
    }

    @x0(21)
    public static int a(@o0 List<ImageHeaderParser> list, @o0 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return c(list, new C0135e(parcelFileDescriptorRewinder, bVar));
    }

    public static int b(@o0 List<ImageHeaderParser> list, @q0 InputStream inputStream, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new g0(inputStream, bVar);
        }
        inputStream.mark(f11116a);
        return c(list, new d(inputStream, bVar));
    }

    private static int c(@o0 List<ImageHeaderParser> list, f fVar) throws IOException {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            int a6 = fVar.a(list.get(i5));
            if (a6 != -1) {
                return a6;
            }
        }
        return -1;
    }

    @o0
    @x0(21)
    public static ImageHeaderParser.ImageType d(@o0 List<ImageHeaderParser> list, @o0 ParcelFileDescriptorRewinder parcelFileDescriptorRewinder, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        return g(list, new c(parcelFileDescriptorRewinder, bVar));
    }

    @o0
    public static ImageHeaderParser.ImageType e(@o0 List<ImageHeaderParser> list, @q0 InputStream inputStream, @o0 com.bumptech.glide.load.engine.bitmap_recycle.b bVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new g0(inputStream, bVar);
        }
        inputStream.mark(f11116a);
        return g(list, new a(inputStream));
    }

    @o0
    public static ImageHeaderParser.ImageType f(@o0 List<ImageHeaderParser> list, @q0 ByteBuffer byteBuffer) throws IOException {
        return byteBuffer == null ? ImageHeaderParser.ImageType.UNKNOWN : g(list, new b(byteBuffer));
    }

    @o0
    private static ImageHeaderParser.ImageType g(@o0 List<ImageHeaderParser> list, g gVar) throws IOException {
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            ImageHeaderParser.ImageType a6 = gVar.a(list.get(i5));
            if (a6 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a6;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }
}
