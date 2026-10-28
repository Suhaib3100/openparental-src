package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import androidx.annotation.o0;
import androidx.annotation.x0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.engine.u;
import com.bumptech.glide.util.o;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: AnimatedImageDecoder.java */
@x0(28)
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f44569a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44570b;

    /* compiled from: AnimatedImageDecoder.java */
    private static final class a implements u<Drawable> {

        /* renamed from: c, reason: collision with root package name */
        private static final int f44571c = 2;

        /* renamed from: b, reason: collision with root package name */
        private final AnimatedImageDrawable f44572b;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f44572b = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @o0
        public AnimatedImageDrawable b() {
            return this.f44572b;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Drawable get() {
            return this.f44572b;
        }

        @Override // com.bumptech.glide.load.engine.u
        public int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f44572b.getIntrinsicWidth();
            intrinsicHeight = this.f44572b.getIntrinsicHeight();
            return o.j(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
            this.f44572b.stop();
            this.f44572b.clearAnimationCallbacks();
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    private static final class b implements com.bumptech.glide.load.k<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final g f44573a;

        b(g gVar) {
            this.f44573a = gVar;
        }

        @Override // com.bumptech.glide.load.k
        public boolean a(@o0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            return this.f44573a.d(byteBuffer);
        }

        @Override // com.bumptech.glide.load.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u<Drawable> b(@o0 ByteBuffer byteBuffer, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f44573a.b(createSource, i4, i5, iVar);
        }

        public boolean d(@o0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            return this.f44573a.d(byteBuffer);
        }
    }

    /* compiled from: AnimatedImageDecoder.java */
    private static final class c implements com.bumptech.glide.load.k<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final g f44574a;

        c(g gVar) {
            this.f44574a = gVar;
        }

        @Override // com.bumptech.glide.load.k
        public boolean a(@o0 InputStream inputStream, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            return this.f44574a.c(inputStream);
        }

        @Override // com.bumptech.glide.load.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u<Drawable> b(@o0 InputStream inputStream, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream));
            return this.f44574a.b(createSource, i4, i5, iVar);
        }

        public boolean d(@o0 InputStream inputStream, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            return this.f44574a.c(inputStream);
        }
    }

    private g(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f44569a = list;
        this.f44570b = bVar;
    }

    public static com.bumptech.glide.load.k<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return new b(new g(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP || (Build.VERSION.SDK_INT >= 31 && imageType == ImageHeaderParser.ImageType.ANIMATED_AVIF);
    }

    public static com.bumptech.glide.load.k<InputStream, Drawable> f(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return new c(new g(list, bVar));
    }

    u<Drawable> b(@o0 ImageDecoder.Source source, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new com.bumptech.glide.load.resource.i(i4, i5, iVar));
        if (com.bumptech.glide.load.resource.drawable.a.a(decodeDrawable)) {
            return new a(com.bumptech.glide.load.resource.drawable.b.a(decodeDrawable));
        }
        throw new IOException(ProtectedSandApp.s("\u0a04") + decodeDrawable);
    }

    boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.e.f(this.f44569a, inputStream, this.f44570b));
    }

    boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.e.g(this.f44569a, byteBuffer));
    }
}
