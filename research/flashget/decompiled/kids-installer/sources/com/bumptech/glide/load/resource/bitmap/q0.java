package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.x0;
import com.bumptech.glide.load.h;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* compiled from: VideoDecoder.java */
/* loaded from: classes3.dex */
public class q0<T> implements com.bumptech.glide.load.k<T, Bitmap> {

    /* renamed from: e, reason: collision with root package name */
    public static final long f11768e = -1;

    /* renamed from: f, reason: collision with root package name */
    @m1
    static final int f11769f = 2;

    /* renamed from: a, reason: collision with root package name */
    private final f<T> f11773a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11774b;

    /* renamed from: c, reason: collision with root package name */
    private final e f11775c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f11767d = ProtectedSandApp.s("ᵧ");

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Long> f11770g = com.bumptech.glide.load.h.b(ProtectedSandApp.s("ᵨ"), -1L, new a());

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Integer> f11771h = com.bumptech.glide.load.h.b(ProtectedSandApp.s("ᵩ"), 2, new b());

    /* renamed from: i, reason: collision with root package name */
    private static final e f11772i = new e();

    /* compiled from: VideoDecoder.java */
    class a implements h.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11776a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.o0 byte[] bArr, @androidx.annotation.o0 Long l5, @androidx.annotation.o0 MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f11776a) {
                this.f11776a.position(0);
                messageDigest.update(this.f11776a.putLong(l5.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    class b implements h.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f11777a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.o0 byte[] bArr, @androidx.annotation.o0 Integer num, @androidx.annotation.o0 MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f11777a) {
                this.f11777a.position(0);
                messageDigest.update(this.f11777a.putInt(num.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    private static final class c implements f<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        c(a aVar) {
        }
    }

    /* compiled from: VideoDecoder.java */
    @x0(23)
    static final class d implements f<ByteBuffer> {

        /* compiled from: VideoDecoder.java */
        /* loaded from: classes.dex */
        class a extends MediaDataSource {

            /* renamed from: o, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f11778o;

            a(ByteBuffer byteBuffer) {
                this.f11778o = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f11778o.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j5, byte[] bArr, int i5, int i6) {
                if (j5 >= this.f11778o.limit()) {
                    return -1;
                }
                this.f11778o.position((int) j5);
                int min = Math.min(i6, this.f11778o.remaining());
                this.f11778o.get(bArr, i5, min);
                return min;
            }
        }

        d() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    @m1
    /* loaded from: classes.dex */
    static class e {
        e() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: VideoDecoder.java */
    @m1
    /* loaded from: classes.dex */
    interface f<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t5);
    }

    /* compiled from: VideoDecoder.java */
    static final class g implements f<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.f
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    /* loaded from: classes.dex */
    private static final class h extends RuntimeException {

        /* renamed from: o, reason: collision with root package name */
        private static final long f11780o = -2556382523004027815L;

        h() {
            super(ProtectedSandApp.s("ǂ"));
        }
    }

    q0(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, f<T> fVar) {
        this(eVar, fVar, f11772i);
    }

    public static com.bumptech.glide.load.k<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new q0(eVar, new c(null));
    }

    @x0(api = 23)
    public static com.bumptech.glide.load.k<ByteBuffer, Bitmap> d(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new q0(eVar, new d());
    }

    @androidx.annotation.q0
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, long j5, int i5, int i6, int i7, p pVar) {
        Bitmap g5 = (Build.VERSION.SDK_INT < 27 || i6 == Integer.MIN_VALUE || i7 == Integer.MIN_VALUE || pVar == p.f11763f) ? null : g(mediaMetadataRetriever, j5, i5, i6, i7, pVar);
        if (g5 == null) {
            g5 = mediaMetadataRetriever.getFrameAtTime(j5, i5);
        }
        if (g5 != null) {
            return g5;
        }
        throw new h();
    }

    private static Bitmap f(MediaMetadataRetriever mediaMetadataRetriever, long j5, int i5) {
        return mediaMetadataRetriever.getFrameAtTime(j5, i5);
    }

    @androidx.annotation.q0
    @TargetApi(27)
    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j5, int i5, int i6, int i7, p pVar) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b6 = pVar.b(parseInt, parseInt2, i6, i7);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j5, i5, Math.round(parseInt * b6), Math.round(b6 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable unused) {
            Log.isLoggable(ProtectedSandApp.s("ᵪ"), 3);
            return null;
        }
    }

    public static com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> h(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new q0(eVar, new g());
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 T t5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 T t5, int i5, int i6, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        long longValue = ((Long) iVar.c(f11770g)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(p0.a(ProtectedSandApp.s("ᵫ"), longValue));
        }
        Integer num = (Integer) iVar.c(f11771h);
        if (num == null) {
            num = 2;
        }
        p pVar = (p) iVar.c(p.f11765h);
        if (pVar == null) {
            pVar = p.f11764g;
        }
        p pVar2 = pVar;
        MediaMetadataRetriever a6 = this.f11775c.a();
        try {
            this.f11773a.a(a6, t5);
            Bitmap e6 = e(a6, longValue, num.intValue(), i5, i6, pVar2);
            a6.release();
            return com.bumptech.glide.load.resource.bitmap.g.e(e6, this.f11774b);
        } catch (Throwable th) {
            a6.release();
            throw th;
        }
    }

    @m1
    q0(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, f<T> fVar, e eVar2) {
        this.f11774b = eVar;
        this.f11773a = fVar;
        this.f11775c = eVar2;
    }
}
