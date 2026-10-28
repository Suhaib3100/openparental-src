package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.x0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/* compiled from: ImageReader.java */
/* loaded from: classes.dex */
interface c0 {

    /* compiled from: ImageReader.java */
    /* loaded from: classes3.dex */
    public static final class a implements c0 {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f11697a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f11698b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f11699c;

        a(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f11698b = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar);
            this.f11699c = (List) com.bumptech.glide.util.l.d(list);
            this.f11697a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c0
        public int a() throws IOException {
            return com.bumptech.glide.load.e.b(this.f11699c, this.f11697a.a(), this.f11698b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c0
        @androidx.annotation.q0
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f11697a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c0
        public void c() {
            this.f11697a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c0
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.e.e(this.f11699c, this.f11697a.a(), this.f11698b);
        }
    }

    /* compiled from: ImageReader.java */
    @x0(21)
    /* loaded from: classes3.dex */
    public static final class b implements c0 {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f11700a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f11701b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f11702c;

        b(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f11700a = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar);
            this.f11701b = (List) com.bumptech.glide.util.l.d(list);
            this.f11702c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c0
        public int a() throws IOException {
            return com.bumptech.glide.load.e.a(this.f11701b, this.f11702c, this.f11700a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c0
        @androidx.annotation.q0
        public Bitmap b(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f11702c.a().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c0
        public void c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.c0
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.e.d(this.f11701b, this.f11702c, this.f11700a);
        }
    }

    int a() throws IOException;

    @androidx.annotation.q0
    Bitmap b(BitmapFactory.Options options) throws IOException;

    void c();

    ImageHeaderParser.ImageType d() throws IOException;
}
