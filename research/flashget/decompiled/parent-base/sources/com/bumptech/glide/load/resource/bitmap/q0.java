package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaDataSource;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.x0;
import com.bumptech.glide.load.h;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: VideoDecoder.java */
/* loaded from: classes3.dex */
public class q0<T> implements com.bumptech.glide.load.k<T, Bitmap> {

    /* renamed from: e, reason: collision with root package name */
    public static final long f44533e = -1;

    /* renamed from: f, reason: collision with root package name */
    @m1
    static final int f44534f = 2;

    /* renamed from: a, reason: collision with root package name */
    private final e<T> f44540a;

    /* renamed from: b, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44541b;

    /* renamed from: c, reason: collision with root package name */
    private final f f44542c;

    /* renamed from: d, reason: collision with root package name */
    private static final String f44532d = ProtectedSandApp.s("ৗ");

    /* renamed from: k, reason: collision with root package name */
    private static final String f44539k = ProtectedSandApp.s("\u09d8");

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Long> f44535g = com.bumptech.glide.load.h.b(ProtectedSandApp.s("\u09d9"), -1L, new a());

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Integer> f44536h = com.bumptech.glide.load.h.b(ProtectedSandApp.s("\u09da"), 2, new b());

    /* renamed from: i, reason: collision with root package name */
    private static final f f44537i = new f();

    /* renamed from: j, reason: collision with root package name */
    private static final List<String> f44538j = Collections.unmodifiableList(Arrays.asList(ProtectedSandApp.s("\u09db"), ProtectedSandApp.s("ড়")));

    /* compiled from: VideoDecoder.java */
    class a implements h.b<Long> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f44543a = ByteBuffer.allocate(8);

        a() {
        }

        @Override // com.bumptech.glide.load.h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.o0 byte[] bArr, @androidx.annotation.o0 Long l4, @androidx.annotation.o0 MessageDigest messageDigest) {
            messageDigest.update(bArr);
            synchronized (this.f44543a) {
                this.f44543a.position(0);
                messageDigest.update(this.f44543a.putLong(l4.longValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    class b implements h.b<Integer> {

        /* renamed from: a, reason: collision with root package name */
        private final ByteBuffer f44544a = ByteBuffer.allocate(4);

        b() {
        }

        @Override // com.bumptech.glide.load.h.b
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(@androidx.annotation.o0 byte[] bArr, @androidx.annotation.o0 Integer num, @androidx.annotation.o0 MessageDigest messageDigest) {
            if (num == null) {
                return;
            }
            messageDigest.update(bArr);
            synchronized (this.f44544a) {
                this.f44544a.position(0);
                messageDigest.update(this.f44544a.putInt(num.intValue()).array());
            }
        }
    }

    /* compiled from: VideoDecoder.java */
    @x0(16)
    private static final class c implements e<AssetFileDescriptor> {
        private c() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.e
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, AssetFileDescriptor assetFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
        }

        c(a aVar) {
        }
    }

    /* compiled from: VideoDecoder.java */
    @x0(23)
    static final class d implements e<ByteBuffer> {

        /* compiled from: VideoDecoder.java */
        class a extends MediaDataSource {

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ ByteBuffer f44545b;

            a(ByteBuffer byteBuffer) {
                this.f44545b = byteBuffer;
            }

            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // android.media.MediaDataSource
            public long getSize() {
                return this.f44545b.limit();
            }

            @Override // android.media.MediaDataSource
            public int readAt(long j4, byte[] bArr, int i4, int i5) {
                if (j4 >= this.f44545b.limit()) {
                    return -1;
                }
                this.f44545b.position((int) j4);
                int min = Math.min(i5, this.f44545b.remaining());
                this.f44545b.get(bArr, i4, min);
                return min;
            }
        }

        d() {
        }

        private MediaDataSource c(ByteBuffer byteBuffer) {
            return new a(byteBuffer);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ByteBuffer byteBuffer) throws IOException {
            mediaExtractor.setDataSource(new a(byteBuffer));
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.e
        /* renamed from: e, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            mediaMetadataRetriever.setDataSource(new a(byteBuffer));
        }
    }

    /* compiled from: VideoDecoder.java */
    @m1
    interface e<T> {
        @x0(16)
        void a(MediaExtractor mediaExtractor, T t4) throws IOException;

        void b(MediaMetadataRetriever mediaMetadataRetriever, T t4);
    }

    /* compiled from: VideoDecoder.java */
    @m1
    static class f {
        f() {
        }

        public MediaMetadataRetriever a() {
            return new MediaMetadataRetriever();
        }
    }

    /* compiled from: VideoDecoder.java */
    static final class g implements e<ParcelFileDescriptor> {
        g() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.e
        @x0(16)
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(MediaExtractor mediaExtractor, ParcelFileDescriptor parcelFileDescriptor) throws IOException {
            mediaExtractor.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }

        @Override // com.bumptech.glide.load.resource.bitmap.q0.e
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void b(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* compiled from: VideoDecoder.java */
    private static final class h extends RuntimeException {

        /* renamed from: b, reason: collision with root package name */
        private static final long f44547b = -2556382523004027815L;

        h() {
            super(ProtectedSandApp.s("২"));
        }
    }

    q0(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, e<T> eVar2) {
        this(eVar, eVar2, f44537i);
    }

    @x0(16)
    public static com.bumptech.glide.load.k<AssetFileDescriptor, Bitmap> c(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new q0(eVar, new c());
    }

    @x0(api = 23)
    public static com.bumptech.glide.load.k<ByteBuffer, Bitmap> d(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new q0(eVar, new d());
    }

    @TargetApi(30)
    private static Bitmap e(MediaMetadataRetriever mediaMetadataRetriever, Bitmap bitmap) {
        String s4 = ProtectedSandApp.s("ৗ");
        if (!j()) {
            return bitmap;
        }
        try {
            if (i(mediaMetadataRetriever)) {
                if (Math.abs(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))) == 180) {
                    Log.isLoggable(s4, 3);
                    Matrix matrix = new Matrix();
                    matrix.postRotate(180.0f, bitmap.getWidth() / 2.0f, bitmap.getHeight() / 2.0f);
                    return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                }
            }
        } catch (NumberFormatException unused) {
            Log.isLoggable(s4, 3);
        }
        return bitmap;
    }

    @androidx.annotation.q0
    private Bitmap f(@androidx.annotation.o0 T t4, MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4, int i5, int i6, q qVar) {
        if (l(t4, mediaMetadataRetriever)) {
            throw new IllegalStateException(ProtectedSandApp.s("ঢ়"));
        }
        Bitmap h4 = (Build.VERSION.SDK_INT < 27 || i5 == Integer.MIN_VALUE || i6 == Integer.MIN_VALUE || qVar == q.f44528f) ? null : h(mediaMetadataRetriever, j4, i4, i5, i6, qVar);
        if (h4 == null) {
            h4 = mediaMetadataRetriever.getFrameAtTime(j4, i4);
        }
        Bitmap e4 = e(mediaMetadataRetriever, h4);
        if (e4 != null) {
            return e4;
        }
        throw new h();
    }

    private static Bitmap g(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4) {
        return mediaMetadataRetriever.getFrameAtTime(j4, i4);
    }

    @androidx.annotation.q0
    @TargetApi(27)
    private static Bitmap h(MediaMetadataRetriever mediaMetadataRetriever, long j4, int i4, int i5, int i6, q qVar) {
        Bitmap scaledFrameAtTime;
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float b5 = qVar.b(parseInt, parseInt2, i5, i6);
            scaledFrameAtTime = mediaMetadataRetriever.getScaledFrameAtTime(j4, i4, Math.round(parseInt * b5), Math.round(b5 * parseInt2));
            return scaledFrameAtTime;
        } catch (Throwable unused) {
            Log.isLoggable(ProtectedSandApp.s("ৗ"), 3);
            return null;
        }
    }

    @x0(30)
    private static boolean i(MediaMetadataRetriever mediaMetadataRetriever) throws NumberFormatException {
        String extractMetadata = mediaMetadataRetriever.extractMetadata(36);
        String extractMetadata2 = mediaMetadataRetriever.extractMetadata(35);
        int parseInt = Integer.parseInt(extractMetadata);
        return (parseInt == 7 || parseInt == 6) && Integer.parseInt(extractMetadata2) == 6;
    }

    @m1
    static boolean j() {
        if (Build.MODEL.startsWith(ProtectedSandApp.s("\u09de")) && Build.VERSION.SDK_INT == 33) {
            return k();
        }
        int i4 = Build.VERSION.SDK_INT;
        return i4 >= 30 && i4 < 33;
    }

    private static boolean k() {
        Iterator<String> it = f44538j.iterator();
        while (it.hasNext()) {
            if (Build.ID.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(@androidx.annotation.o0 T t4, MediaMetadataRetriever mediaMetadataRetriever) {
        String str = Build.DEVICE;
        if (str == null || !str.matches(ProtectedSandApp.s("য়"))) {
            return false;
        }
        MediaExtractor mediaExtractor = null;
        try {
        } catch (Throwable unused) {
        }
        if (!ProtectedSandApp.s("\u09d8").equals(mediaMetadataRetriever.extractMetadata(12))) {
            return false;
        }
        MediaExtractor mediaExtractor2 = new MediaExtractor();
        try {
            this.f44540a.a(mediaExtractor2, t4);
            int trackCount = mediaExtractor2.getTrackCount();
            for (int i4 = 0; i4 < trackCount; i4++) {
                if (ProtectedSandApp.s("ৡ").equals(mediaExtractor2.getTrackFormat(i4).getString(ProtectedSandApp.s("ৠ")))) {
                    mediaExtractor2.release();
                    return true;
                }
            }
            mediaExtractor2.release();
        } catch (Throwable unused2) {
            mediaExtractor = mediaExtractor2;
            try {
                Log.isLoggable(ProtectedSandApp.s("ৗ"), 3);
                return false;
            } finally {
                if (mediaExtractor != null) {
                    mediaExtractor.release();
                }
            }
        }
        return false;
    }

    public static com.bumptech.glide.load.k<ParcelFileDescriptor, Bitmap> m(com.bumptech.glide.load.engine.bitmap_recycle.e eVar) {
        return new q0(eVar, new g());
    }

    @Override // com.bumptech.glide.load.k
    public boolean a(@androidx.annotation.o0 T t4, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) {
        return true;
    }

    @Override // com.bumptech.glide.load.k
    public com.bumptech.glide.load.engine.u<Bitmap> b(@androidx.annotation.o0 T t4, int i4, int i5, @androidx.annotation.o0 com.bumptech.glide.load.i iVar) throws IOException {
        long longValue = ((Long) iVar.c(f44535g)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException(androidx.collection.p0.a(ProtectedSandApp.s("ৢ"), longValue));
        }
        Integer num = (Integer) iVar.c(f44536h);
        if (num == null) {
            num = 2;
        }
        q qVar = (q) iVar.c(q.f44530h);
        if (qVar == null) {
            qVar = q.f44529g;
        }
        q qVar2 = qVar;
        MediaMetadataRetriever a5 = this.f44542c.a();
        try {
            this.f44540a.b(a5, t4);
            return com.bumptech.glide.load.resource.bitmap.h.d(f(t4, a5, longValue, num.intValue(), i4, i5, qVar2), this.f44541b);
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                a5.release();
            } else {
                a5.release();
            }
        }
    }

    @m1
    q0(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, e<T> eVar2, f fVar) {
        this.f44541b = eVar;
        this.f44540a = eVar2;
        this.f44542c = fVar;
    }
}
