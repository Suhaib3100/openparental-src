package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import androidx.annotation.x0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: ImageReader.java */
/* loaded from: classes3.dex */
interface d0 {

    /* compiled from: ImageReader.java */
    public static final class a implements d0 {

        /* renamed from: a, reason: collision with root package name */
        private final byte[] f44453a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f44454b;

        /* renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f44455c;

        a(byte[] bArr, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f44453a = bArr;
            this.f44454b = list;
            this.f44455c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        @androidx.annotation.q0
        public Bitmap a(BitmapFactory.Options options) {
            byte[] bArr = this.f44453a;
            return BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public int c() throws IOException {
            return com.bumptech.glide.load.e.c(this.f44454b, ByteBuffer.wrap(this.f44453a), this.f44455c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.e.g(this.f44454b, ByteBuffer.wrap(this.f44453a));
        }
    }

    /* compiled from: ImageReader.java */
    public static final class b implements d0 {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f44456a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f44457b;

        /* renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f44458c;

        b(ByteBuffer byteBuffer, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f44456a = byteBuffer;
            this.f44457b = list;
            this.f44458c = bVar;
        }

        private InputStream e() {
            return com.bumptech.glide.util.a.g(com.bumptech.glide.util.a.d(this.f44456a));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        @androidx.annotation.q0
        public Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(e(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public int c() throws IOException {
            return com.bumptech.glide.load.e.c(this.f44457b, com.bumptech.glide.util.a.d(this.f44456a), this.f44458c);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.e.g(this.f44457b, com.bumptech.glide.util.a.d(this.f44456a));
        }
    }

    /* compiled from: ImageReader.java */
    public static final class c implements d0 {

        /* renamed from: a, reason: collision with root package name */
        private final File f44459a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f44460b;

        /* renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f44461c;

        c(File file, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            this.f44459a = file;
            this.f44460b = list;
            this.f44461c = bVar;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        @androidx.annotation.q0
        public Bitmap a(BitmapFactory.Options options) throws FileNotFoundException {
            h0 h0Var = null;
            try {
                h0 h0Var2 = new h0(new FileInputStream(this.f44459a), this.f44461c);
                try {
                    Bitmap decodeStream = BitmapFactory.decodeStream(h0Var2, null, options);
                    try {
                        h0Var2.close();
                    } catch (IOException unused) {
                    }
                    return decodeStream;
                } catch (Throwable th) {
                    th = th;
                    h0Var = h0Var2;
                    if (h0Var != null) {
                        try {
                            h0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public int c() throws IOException {
            h0 h0Var;
            Throwable th;
            try {
                h0Var = new h0(new FileInputStream(this.f44459a), this.f44461c);
                try {
                    int b5 = com.bumptech.glide.load.e.b(this.f44460b, h0Var, this.f44461c);
                    try {
                        h0Var.close();
                    } catch (IOException unused) {
                    }
                    return b5;
                } catch (Throwable th2) {
                    th = th2;
                    if (h0Var != null) {
                        try {
                            h0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                h0Var = null;
                th = th3;
            }
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public ImageHeaderParser.ImageType d() throws IOException {
            h0 h0Var;
            Throwable th;
            try {
                h0Var = new h0(new FileInputStream(this.f44459a), this.f44461c);
                try {
                    ImageHeaderParser.ImageType f4 = com.bumptech.glide.load.e.f(this.f44460b, h0Var, this.f44461c);
                    try {
                        h0Var.close();
                    } catch (IOException unused) {
                    }
                    return f4;
                } catch (Throwable th2) {
                    th = th2;
                    if (h0Var != null) {
                        try {
                            h0Var.close();
                        } catch (IOException unused2) {
                        }
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                h0Var = null;
                th = th3;
            }
        }
    }

    /* compiled from: ImageReader.java */
    public static final class d implements d0 {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.data.k f44462a;

        /* renamed from: b, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f44463b;

        /* renamed from: c, reason: collision with root package name */
        private final List<ImageHeaderParser> f44464c;

        d(InputStream inputStream, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            String s4 = ProtectedSandApp.s("ঠ");
            this.f44463b = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.f(bVar, s4);
            this.f44464c = (List) com.bumptech.glide.util.m.f(list, s4);
            this.f44462a = new com.bumptech.glide.load.data.k(inputStream, bVar);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        @androidx.annotation.q0
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.f44462a.a(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public void b() {
            this.f44462a.c();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public int c() throws IOException {
            return com.bumptech.glide.load.e.b(this.f44464c, this.f44462a.a(), this.f44463b);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.e.f(this.f44464c, this.f44462a.a(), this.f44463b);
        }
    }

    /* compiled from: ImageReader.java */
    @x0(21)
    public static final class e implements d0 {

        /* renamed from: a, reason: collision with root package name */
        private final com.bumptech.glide.load.engine.bitmap_recycle.b f44465a;

        /* renamed from: b, reason: collision with root package name */
        private final List<ImageHeaderParser> f44466b;

        /* renamed from: c, reason: collision with root package name */
        private final ParcelFileDescriptorRewinder f44467c;

        e(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
            String s4 = ProtectedSandApp.s("ড");
            this.f44465a = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.f(bVar, s4);
            this.f44466b = (List) com.bumptech.glide.util.m.f(list, s4);
            this.f44467c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        @androidx.annotation.q0
        public Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.f44467c.d().getFileDescriptor(), null, options);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public void b() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public int c() throws IOException {
            return com.bumptech.glide.load.e.a(this.f44466b, this.f44467c, this.f44465a);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.d0
        public ImageHeaderParser.ImageType d() throws IOException {
            return com.bumptech.glide.load.e.e(this.f44466b, this.f44467c, this.f44465a);
        }
    }

    @androidx.annotation.q0
    Bitmap a(BitmapFactory.Options options) throws IOException;

    void b();

    int c() throws IOException;

    ImageHeaderParser.ImageType d() throws IOException;
}
