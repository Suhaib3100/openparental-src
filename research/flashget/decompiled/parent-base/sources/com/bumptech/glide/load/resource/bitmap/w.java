package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.m1;
import androidx.annotation.x0;
import androidx.collection.n1;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import com.bumptech.glide.load.resource.bitmap.d0;
import com.bumptech.glide.load.resource.bitmap.q;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;

/* compiled from: Downsampler.java */
/* loaded from: classes3.dex */
public final class w {

    /* renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Boolean> f44552j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Boolean> f44553k;

    /* renamed from: n, reason: collision with root package name */
    private static final Set<String> f44556n;

    /* renamed from: o, reason: collision with root package name */
    private static final b f44557o;

    /* renamed from: p, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f44558p;

    /* renamed from: q, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f44559q;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f44560a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f44561b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f44562c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f44563d;

    /* renamed from: e, reason: collision with root package name */
    private final c0 f44564e = c0.c();

    /* renamed from: f, reason: collision with root package name */
    static final String f44548f = ProtectedSandApp.s("৩");

    /* renamed from: l, reason: collision with root package name */
    private static final String f44554l = ProtectedSandApp.s("৪");

    /* renamed from: m, reason: collision with root package name */
    private static final String f44555m = ProtectedSandApp.s("৫");

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<com.bumptech.glide.load.b> f44549g = com.bumptech.glide.load.h.g(ProtectedSandApp.s("৬"), com.bumptech.glide.load.b.DEFAULT);

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<com.bumptech.glide.load.j> f44550h = com.bumptech.glide.load.h.f(ProtectedSandApp.s("৭"));

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final com.bumptech.glide.load.h<q> f44551i = q.f44530h;

    /* compiled from: Downsampler.java */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w.b
        public void a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.w.b
        public void b() {
        }
    }

    /* compiled from: Downsampler.java */
    public interface b {
        void a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) throws IOException;

        void b();
    }

    static {
        Boolean bool = Boolean.FALSE;
        f44552j = com.bumptech.glide.load.h.g(ProtectedSandApp.s("৮"), bool);
        f44553k = com.bumptech.glide.load.h.g(ProtectedSandApp.s("৯"), bool);
        f44556n = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProtectedSandApp.s("৪"), ProtectedSandApp.s("৫"))));
        f44557o = new a();
        f44558p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f44559q = com.bumptech.glide.util.o.g(0);
    }

    public w(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f44563d = list;
        String s4 = ProtectedSandApp.s("ৰ");
        this.f44561b = (DisplayMetrics) com.bumptech.glide.util.m.f(displayMetrics, s4);
        this.f44560a = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.m.f(eVar, s4);
        this.f44562c = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.m.f(bVar, s4);
    }

    private static int A(double d5) {
        return (int) (d5 + 0.5d);
    }

    @TargetApi(26)
    private static void B(BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, int i4, int i5) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            Bitmap.Config config3 = options.inPreferredConfig;
            config2 = Bitmap.Config.HARDWARE;
            if (config3 == config2) {
                return;
            } else {
                config = options.outConfig;
            }
        } else {
            config = null;
        }
        if (config == null) {
            config = options.inPreferredConfig;
        }
        options.inBitmap = eVar.g(i4, i5, config);
    }

    private boolean C(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    private static int a(double d5) {
        return (int) (((d5 / (r1 / r0)) * ((int) ((o(d5) * d5) + 0.5d))) + 0.5d);
    }

    private void b(d0 d0Var, com.bumptech.glide.load.b bVar, boolean z4, boolean z5, BitmapFactory.Options options, int i4, int i5) {
        boolean z6;
        if (this.f44564e.h(i4, i5, options, z4, z5)) {
            return;
        }
        if (bVar == com.bumptech.glide.load.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z6 = d0Var.d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable(ProtectedSandApp.s("৩"), 3)) {
                Objects.toString(bVar);
            }
            z6 = false;
        }
        Bitmap.Config config = z6 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, d0 d0Var, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, q qVar, int i4, int i5, int i6, int i7, int i10, BitmapFactory.Options options) throws IOException {
        int i11;
        int i12;
        int floor;
        int floor2;
        String s4 = ProtectedSandApp.s("৩");
        if (i5 <= 0 || i6 <= 0) {
            if (Log.isLoggable(s4, 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (u(i4)) {
            i12 = i5;
            i11 = i6;
        } else {
            i11 = i5;
            i12 = i6;
        }
        float b5 = qVar.b(i11, i12, i7, i10);
        if (b5 <= 0.0f) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("৲"));
            sb.append(b5);
            sb.append(ProtectedSandApp.s("৳"));
            sb.append(qVar);
            sb.append(ProtectedSandApp.s("৴"));
            String s5 = ProtectedSandApp.s("৵");
            androidx.paging.l.a(sb, i5, s5, i6, ProtectedSandApp.s("৶"));
            sb.append(i7);
            sb.append(s5);
            sb.append(i10);
            sb.append(ProtectedSandApp.s("৷"));
            throw new IllegalArgumentException(sb.toString());
        }
        q.g a5 = qVar.a(i11, i12, i7, i10);
        if (a5 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ৱ"));
        }
        float f4 = i11;
        float f5 = i12;
        int i13 = i11 / ((int) ((b5 * f4) + 0.5d));
        int i14 = i12 / ((int) ((b5 * f5) + 0.5d));
        q.g gVar = q.g.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(a5 == gVar ? Math.max(i13, i14) : Math.min(i13, i14)));
        if (a5 == gVar && max < 1.0f / b5) {
            max <<= 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            floor = (int) Math.ceil(f4 / min);
            floor2 = (int) Math.ceil(f5 / min);
            int i15 = max / 8;
            if (i15 > 0) {
                floor /= i15;
                floor2 /= i15;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f6 = max;
            floor = (int) Math.floor(f4 / f6);
            floor2 = (int) Math.floor(f5 / f6);
        } else if (imageType.isWebp()) {
            float f7 = max;
            floor = Math.round(f4 / f7);
            floor2 = Math.round(f5 / f7);
        } else if (i11 % max == 0 && i12 % max == 0) {
            floor = i11 / max;
            floor2 = i12 / max;
        } else {
            int[] p4 = p(d0Var, options, bVar, eVar);
            floor = p4[0];
            floor2 = p4[1];
        }
        double b6 = qVar.b(floor, floor2, i7, i10);
        options.inTargetDensity = a(b6);
        options.inDensity = o(b6);
        if (v(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        Log.isLoggable(s4, 2);
    }

    private com.bumptech.glide.load.engine.u<Bitmap> e(d0 d0Var, int i4, int i5, com.bumptech.glide.load.i iVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f44562c.d(65536, byte[].class);
        BitmapFactory.Options n4 = n();
        n4.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) iVar.c(f44549g);
        com.bumptech.glide.load.j jVar = (com.bumptech.glide.load.j) iVar.c(f44550h);
        q qVar = (q) iVar.c(q.f44530h);
        boolean booleanValue = ((Boolean) iVar.c(f44552j)).booleanValue();
        com.bumptech.glide.load.h<Boolean> hVar = f44553k;
        try {
            return h.d(k(d0Var, n4, qVar, bVar2, jVar, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), i4, i5, booleanValue, bVar), this.f44560a);
        } finally {
            y(n4);
            this.f44562c.put(bArr);
        }
    }

    private Bitmap k(d0 d0Var, BitmapFactory.Options options, q qVar, com.bumptech.glide.load.b bVar, com.bumptech.glide.load.j jVar, boolean z4, int i4, int i5, boolean z5, b bVar2) throws IOException {
        boolean z6;
        int i6;
        int i7;
        int i10;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        ColorSpace.Named named2;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        long b5 = com.bumptech.glide.util.i.b();
        int[] p4 = p(d0Var, options, bVar2, this.f44560a);
        int i11 = p4[0];
        int i12 = p4[1];
        String str = options.outMimeType;
        boolean z7 = (i11 == -1 || i12 == -1) ? false : z4;
        int c5 = d0Var.c();
        int j4 = m0.j(c5);
        switch (c5) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z6 = true;
                break;
            default:
                z6 = false;
                break;
        }
        if (i4 == Integer.MIN_VALUE) {
            i6 = i5;
            i7 = u(j4) ? i12 : i11;
        } else {
            i6 = i5;
            i7 = i4;
        }
        int i13 = i6 == Integer.MIN_VALUE ? u(j4) ? i11 : i12 : i6;
        c(d0Var.d(), d0Var, bVar2, this.f44560a, qVar, j4, i11, i12, i7, i13, options);
        b(d0Var, bVar, z7, z6, options, i7, i13);
        int i14 = Build.VERSION.SDK_INT;
        String s4 = ProtectedSandApp.s("৩");
        if (i11 < 0 || i12 < 0 || !z5) {
            float f4 = v(options) ? options.inTargetDensity / options.inDensity : 1.0f;
            float f5 = options.inSampleSize;
            int ceil = (int) Math.ceil(i11 / f5);
            int ceil2 = (int) Math.ceil(i12 / f5);
            i7 = Math.round(ceil * f4);
            i13 = Math.round(ceil2 * f4);
            Log.isLoggable(s4, 2);
        }
        int i15 = i7;
        int i16 = i13;
        if (i15 > 0 && i16 > 0) {
            B(options, this.f44560a, i15, i16);
        }
        if (jVar != null) {
            if (i14 >= 28) {
                if (jVar == com.bumptech.glide.load.j.DISPLAY_P3) {
                    colorSpace3 = options.outColorSpace;
                    if (colorSpace3 != null) {
                        colorSpace4 = options.outColorSpace;
                        isWideGamut = colorSpace4.isWideGamut();
                        if (isWideGamut) {
                            named2 = ColorSpace.Named.DISPLAY_P3;
                            colorSpace2 = ColorSpace.get(named2);
                            options.inPreferredColorSpace = colorSpace2;
                        }
                    }
                }
                named2 = ColorSpace.Named.SRGB;
                colorSpace2 = ColorSpace.get(named2);
                options.inPreferredColorSpace = colorSpace2;
            } else if (i14 >= 26) {
                named = ColorSpace.Named.SRGB;
                colorSpace = ColorSpace.get(named);
                options.inPreferredColorSpace = colorSpace;
            }
        }
        Bitmap l4 = l(d0Var, options, bVar2, this.f44560a);
        bVar2.a(this.f44560a, l4);
        if (Log.isLoggable(s4, 2)) {
            i10 = c5;
            w(i11, i12, str, options, l4, i4, i5, b5);
        } else {
            i10 = c5;
        }
        if (l4 == null) {
            return null;
        }
        l4.setDensity(this.f44561b.densityDpi);
        Bitmap o4 = m0.o(this.f44560a, l4, i10);
        if (l4.equals(o4)) {
            return o4;
        }
        this.f44560a.e(l4);
        return o4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap l(com.bumptech.glide.load.resource.bitmap.d0 r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.w.b r6, com.bumptech.glide.load.engine.bitmap_recycle.e r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.b()
            r4.b()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.m0.i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L25
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.m0.i()
            r5.unlock()
            return r4
        L23:
            r4 = move-exception
            goto L4c
        L25:
            r3 = move-exception
            java.io.IOException r0 = x(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "৩"
            java.lang.String r1 = com.flashget.parentalcontrol.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L23
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L4b
            r7.e(r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L4a
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L4a
            android.graphics.Bitmap r4 = l(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L4a
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.m0.i()
            r5.unlock()
            return r4
        L4a:
            throw r0     // Catch: java.lang.Throwable -> L23
        L4b:
            throw r0     // Catch: java.lang.Throwable -> L23
        L4c:
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.m0.i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.w.l(com.bumptech.glide.load.resource.bitmap.d0, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.w$b, com.bumptech.glide.load.engine.bitmap_recycle.e):android.graphics.Bitmap");
    }

    @androidx.annotation.q0
    @TargetApi(19)
    private static String m(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return ProtectedSandApp.s("৺") + bitmap.getWidth() + ProtectedSandApp.s("৵") + bitmap.getHeight() + ProtectedSandApp.s("৻") + bitmap.getConfig() + (ProtectedSandApp.s("৸") + bitmap.getAllocationByteCount() + ProtectedSandApp.s("৹"));
    }

    private static synchronized BitmapFactory.Options n() {
        BitmapFactory.Options poll;
        synchronized (w.class) {
            Queue<BitmapFactory.Options> queue = f44559q;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                z(poll);
            }
        }
        return poll;
    }

    private static int o(double d5) {
        if (d5 > 1.0d) {
            d5 = 1.0d / d5;
        }
        return (int) Math.round(d5 * 2.147483647E9d);
    }

    private static int[] p(d0 d0Var, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        l(d0Var, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String q(BitmapFactory.Options options) {
        return m(options.inBitmap);
    }

    private static boolean u(int i4) {
        return i4 == 90 || i4 == 270;
    }

    private static boolean v(BitmapFactory.Options options) {
        int i4;
        int i5 = options.inTargetDensity;
        return i5 > 0 && (i4 = options.inDensity) > 0 && i5 != i4;
    }

    private static void w(int i4, int i5, String str, BitmapFactory.Options options, Bitmap bitmap, int i6, int i7, long j4) {
        m(bitmap);
        m(options.inBitmap);
        Thread.currentThread().getName();
        com.bumptech.glide.util.i.a(j4);
    }

    private static IOException x(IllegalArgumentException illegalArgumentException, int i4, int i5, String str, BitmapFactory.Options options) {
        StringBuilder a5 = n1.a(ProtectedSandApp.s("ৼ"), i4, ProtectedSandApp.s("৽"), i5, ProtectedSandApp.s("৾"));
        a5.append(str);
        a5.append(ProtectedSandApp.s("\u09ff"));
        a5.append(m(options.inBitmap));
        return new IOException(a5.toString(), illegalArgumentException);
    }

    private static void y(BitmapFactory.Options options) {
        z(options);
        Queue<BitmapFactory.Options> queue = f44559q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void z(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }

    @x0(21)
    public com.bumptech.glide.load.engine.u<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i4, int i5, com.bumptech.glide.load.i iVar) throws IOException {
        return e(new d0.e(parcelFileDescriptor, this.f44563d, this.f44562c), i4, i5, iVar, f44557o);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> f(InputStream inputStream, int i4, int i5, com.bumptech.glide.load.i iVar) throws IOException {
        return g(inputStream, i4, i5, iVar, f44557o);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> g(InputStream inputStream, int i4, int i5, com.bumptech.glide.load.i iVar, b bVar) throws IOException {
        return e(new d0.d(inputStream, this.f44563d, this.f44562c), i4, i5, iVar, bVar);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> h(ByteBuffer byteBuffer, int i4, int i5, com.bumptech.glide.load.i iVar) throws IOException {
        return e(new d0.b(byteBuffer, this.f44563d, this.f44562c), i4, i5, iVar, f44557o);
    }

    @m1
    void i(File file, int i4, int i5, com.bumptech.glide.load.i iVar) throws IOException {
        e(new d0.c(file, this.f44563d, this.f44562c), i4, i5, iVar, f44557o);
    }

    @m1
    void j(byte[] bArr, int i4, int i5, com.bumptech.glide.load.i iVar) throws IOException {
        e(new d0.a(bArr, this.f44563d, this.f44562c), i4, i5, iVar, f44557o);
    }

    public boolean r(ParcelFileDescriptor parcelFileDescriptor) {
        return ParcelFileDescriptorRewinder.c();
    }

    public boolean s(InputStream inputStream) {
        return true;
    }

    public boolean t(ByteBuffer byteBuffer) {
        return true;
    }
}
