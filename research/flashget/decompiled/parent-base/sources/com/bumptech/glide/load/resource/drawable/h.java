package com.bumptech.glide.load.resource.drawable;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
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

/* compiled from: AnimatedWebpDecoder.java */
@x0(28)
@Deprecated
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final List<ImageHeaderParser> f44575a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44576b;

    /* compiled from: AnimatedWebpDecoder.java */
    private static final class a implements u<Drawable> {

        /* renamed from: c, reason: collision with root package name */
        private static final int f44577c = 2;

        /* renamed from: b, reason: collision with root package name */
        private final AnimatedImageDrawable f44578b;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.f44578b = animatedImageDrawable;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Class<Drawable> a() {
            return Drawable.class;
        }

        @o0
        public AnimatedImageDrawable b() {
            return this.f44578b;
        }

        @Override // com.bumptech.glide.load.engine.u
        @o0
        public Drawable get() {
            return this.f44578b;
        }

        @Override // com.bumptech.glide.load.engine.u
        public int getSize() {
            int intrinsicWidth;
            int intrinsicHeight;
            intrinsicWidth = this.f44578b.getIntrinsicWidth();
            intrinsicHeight = this.f44578b.getIntrinsicHeight();
            return o.j(Bitmap.Config.ARGB_8888) * intrinsicHeight * intrinsicWidth * 2;
        }

        @Override // com.bumptech.glide.load.engine.u
        public void recycle() {
            this.f44578b.stop();
            this.f44578b.clearAnimationCallbacks();
        }
    }

    /* compiled from: AnimatedWebpDecoder.java */
    private static final class b implements com.bumptech.glide.load.k<ByteBuffer, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final h f44579a;

        b(h hVar) {
            this.f44579a = hVar;
        }

        @Override // com.bumptech.glide.load.k
        public boolean a(@o0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            return this.f44579a.d(byteBuffer);
        }

        @Override // com.bumptech.glide.load.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u<Drawable> b(@o0 ByteBuffer byteBuffer, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(byteBuffer);
            return this.f44579a.b(createSource, i4, i5, iVar);
        }

        public boolean d(@o0 ByteBuffer byteBuffer, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            return this.f44579a.d(byteBuffer);
        }
    }

    /* compiled from: AnimatedWebpDecoder.java */
    private static final class c implements com.bumptech.glide.load.k<InputStream, Drawable> {

        /* renamed from: a, reason: collision with root package name */
        private final h f44580a;

        c(h hVar) {
            this.f44580a = hVar;
        }

        @Override // com.bumptech.glide.load.k
        public boolean a(@o0 InputStream inputStream, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            return this.f44580a.c(inputStream);
        }

        @Override // com.bumptech.glide.load.k
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public u<Drawable> b(@o0 InputStream inputStream, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            ImageDecoder.Source createSource;
            createSource = ImageDecoder.createSource(com.bumptech.glide.util.a.b(inputStream));
            return this.f44580a.b(createSource, i4, i5, iVar);
        }

        public boolean d(@o0 InputStream inputStream, @o0 com.bumptech.glide.load.i iVar) throws IOException {
            return this.f44580a.c(inputStream);
        }
    }

    private h(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f44575a = list;
        this.f44576b = bVar;
    }

    public static com.bumptech.glide.load.k<ByteBuffer, Drawable> a(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return new b(new h(list, bVar));
    }

    private boolean e(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    public static com.bumptech.glide.load.k<InputStream, Drawable> f(List<ImageHeaderParser> list, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        return new c(new h(list, bVar));
    }

    u<Drawable> b(@o0 ImageDecoder.Source source, int i4, int i5, @o0 com.bumptech.glide.load.i iVar) throws IOException {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new com.bumptech.glide.load.resource.i(i4, i5, iVar));
        if (com.bumptech.glide.load.resource.drawable.a.a(decodeDrawable)) {
            return new a(com.bumptech.glide.load.resource.drawable.b.a(decodeDrawable));
        }
        throw new IOException(ProtectedSandApp.s("ਅ") + decodeDrawable);
    }

    boolean c(InputStream inputStream) throws IOException {
        return e(com.bumptech.glide.load.e.f(this.f44575a, inputStream, this.f44576b));
    }

    boolean d(ByteBuffer byteBuffer) throws IOException {
        return e(com.bumptech.glide.load.e.g(this.f44575a, byteBuffer));
    }
}
