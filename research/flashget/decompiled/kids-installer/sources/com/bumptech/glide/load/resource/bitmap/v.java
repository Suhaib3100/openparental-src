package com.bumptech.glide.load.resource.bitmap;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.DisplayMetrics;
import android.util.Log;
import androidx.annotation.x0;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.resource.bitmap.c0;
import com.bumptech.glide.load.resource.bitmap.p;
import com.flashget.kidsdownloader.ProtectedSandApp;
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
/* loaded from: classes.dex */
public final class v {

    /* renamed from: j, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Boolean> f11785j;

    /* renamed from: k, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<Boolean> f11786k;

    /* renamed from: n, reason: collision with root package name */
    private static final Set<String> f11789n;

    /* renamed from: o, reason: collision with root package name */
    private static final b f11790o;

    /* renamed from: p, reason: collision with root package name */
    private static final Set<ImageHeaderParser.ImageType> f11791p;

    /* renamed from: q, reason: collision with root package name */
    private static final Queue<BitmapFactory.Options> f11792q;

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.e f11793a;

    /* renamed from: b, reason: collision with root package name */
    private final DisplayMetrics f11794b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.engine.bitmap_recycle.b f11795c;

    /* renamed from: d, reason: collision with root package name */
    private final List<ImageHeaderParser> f11796d;

    /* renamed from: e, reason: collision with root package name */
    private final b0 f11797e = b0.d();

    /* renamed from: f, reason: collision with root package name */
    static final String f11781f = ProtectedSandApp.s("ǃ");

    /* renamed from: l, reason: collision with root package name */
    private static final String f11787l = ProtectedSandApp.s("Ǆ");

    /* renamed from: m, reason: collision with root package name */
    private static final String f11788m = ProtectedSandApp.s("ǅ");

    /* renamed from: g, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<com.bumptech.glide.load.b> f11782g = com.bumptech.glide.load.h.g(ProtectedSandApp.s("ǆ"), com.bumptech.glide.load.b.DEFAULT);

    /* renamed from: h, reason: collision with root package name */
    public static final com.bumptech.glide.load.h<com.bumptech.glide.load.j> f11783h = com.bumptech.glide.load.h.g(ProtectedSandApp.s("Ǉ"), com.bumptech.glide.load.j.SRGB);

    /* renamed from: i, reason: collision with root package name */
    @Deprecated
    public static final com.bumptech.glide.load.h<p> f11784i = p.f11765h;

    /* compiled from: Downsampler.java */
    /* loaded from: classes3.dex */
    class a implements b {
        a() {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v.b
        public void a(com.bumptech.glide.load.engine.bitmap_recycle.e eVar, Bitmap bitmap) {
        }

        @Override // com.bumptech.glide.load.resource.bitmap.v.b
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
        f11785j = com.bumptech.glide.load.h.g(ProtectedSandApp.s("ǈ"), bool);
        f11786k = com.bumptech.glide.load.h.g(ProtectedSandApp.s("ǉ"), bool);
        f11789n = Collections.unmodifiableSet(new HashSet(Arrays.asList(ProtectedSandApp.s("Ǌ"), ProtectedSandApp.s("ǋ"))));
        f11790o = new a();
        f11791p = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
        f11792q = com.bumptech.glide.util.n.f(0);
    }

    public v(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, com.bumptech.glide.load.engine.bitmap_recycle.b bVar) {
        this.f11796d = list;
        this.f11794b = (DisplayMetrics) com.bumptech.glide.util.l.d(displayMetrics);
        this.f11793a = (com.bumptech.glide.load.engine.bitmap_recycle.e) com.bumptech.glide.util.l.d(eVar);
        this.f11795c = (com.bumptech.glide.load.engine.bitmap_recycle.b) com.bumptech.glide.util.l.d(bVar);
    }

    private static int a(double d6) {
        return (int) (((d6 / (r1 / r0)) * ((int) ((l(d6) * d6) + 0.5d))) + 0.5d);
    }

    private void b(c0 c0Var, com.bumptech.glide.load.b bVar, boolean z5, boolean z6, BitmapFactory.Options options, int i5, int i6) {
        boolean z7;
        if (this.f11797e.k(i5, i6, options, z5, z6)) {
            return;
        }
        if (bVar == com.bumptech.glide.load.b.PREFER_ARGB_8888) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
            return;
        }
        try {
            z7 = c0Var.d().hasAlpha();
        } catch (IOException unused) {
            if (Log.isLoggable(ProtectedSandApp.s("ǌ"), 3)) {
                Objects.toString(bVar);
            }
            z7 = false;
        }
        Bitmap.Config config = z7 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565;
        options.inPreferredConfig = config;
        if (config == Bitmap.Config.RGB_565) {
            options.inDither = true;
        }
    }

    private static void c(ImageHeaderParser.ImageType imageType, c0 c0Var, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, p pVar, int i5, int i6, int i7, int i8, int i9, BitmapFactory.Options options) throws IOException {
        int i10;
        int i11;
        int floor;
        int floor2;
        String s5 = ProtectedSandApp.s("Ǎ");
        if (i6 <= 0 || i7 <= 0) {
            if (Log.isLoggable(s5, 3)) {
                Objects.toString(imageType);
                return;
            }
            return;
        }
        if (r(i5)) {
            i11 = i6;
            i10 = i7;
        } else {
            i10 = i6;
            i11 = i7;
        }
        float b6 = pVar.b(i10, i11, i8, i9);
        if (b6 <= 0.0f) {
            StringBuilder sb = new StringBuilder(ProtectedSandApp.s("Ǐ"));
            sb.append(b6);
            sb.append(ProtectedSandApp.s("ǐ"));
            sb.append(pVar);
            sb.append(ProtectedSandApp.s("Ǒ"));
            sb.append(i6);
            String s6 = ProtectedSandApp.s("ǒ");
            sb.append(s6);
            sb.append(i7);
            sb.append(ProtectedSandApp.s("Ǔ"));
            sb.append(i8);
            sb.append(s6);
            sb.append(i9);
            sb.append(ProtectedSandApp.s("ǔ"));
            throw new IllegalArgumentException(sb.toString());
        }
        p.g a6 = pVar.a(i10, i11, i8, i9);
        if (a6 == null) {
            throw new IllegalArgumentException(ProtectedSandApp.s("ǎ"));
        }
        float f6 = i10;
        float f7 = i11;
        int i12 = i10 / ((int) ((b6 * f6) + 0.5d));
        int i13 = i11 / ((int) ((b6 * f7) + 0.5d));
        p.g gVar = p.g.MEMORY;
        int max = Math.max(1, Integer.highestOneBit(a6 == gVar ? Math.max(i12, i13) : Math.min(i12, i13)));
        if (a6 == gVar && max < 1.0f / b6) {
            max <<= 1;
        }
        options.inSampleSize = max;
        if (imageType == ImageHeaderParser.ImageType.JPEG) {
            float min = Math.min(max, 8);
            floor = (int) Math.ceil(f6 / min);
            floor2 = (int) Math.ceil(f7 / min);
            int i14 = max / 8;
            if (i14 > 0) {
                floor /= i14;
                floor2 /= i14;
            }
        } else if (imageType == ImageHeaderParser.ImageType.PNG || imageType == ImageHeaderParser.ImageType.PNG_A) {
            float f8 = max;
            floor = (int) Math.floor(f6 / f8);
            floor2 = (int) Math.floor(f7 / f8);
        } else if (imageType == ImageHeaderParser.ImageType.WEBP || imageType == ImageHeaderParser.ImageType.WEBP_A) {
            float f9 = max;
            floor = Math.round(f6 / f9);
            floor2 = Math.round(f7 / f9);
        } else if (i10 % max == 0 && i11 % max == 0) {
            floor = i10 / max;
            floor2 = i11 / max;
        } else {
            int[] m5 = m(c0Var, options, bVar, eVar);
            floor = m5[0];
            floor2 = m5[1];
        }
        double b7 = pVar.b(floor, floor2, i8, i9);
        options.inTargetDensity = a(b7);
        options.inDensity = l(b7);
        if (s(options)) {
            options.inScaled = true;
        } else {
            options.inTargetDensity = 0;
            options.inDensity = 0;
        }
        Log.isLoggable(s5, 2);
    }

    private com.bumptech.glide.load.engine.u<Bitmap> e(c0 c0Var, int i5, int i6, com.bumptech.glide.load.i iVar, b bVar) throws IOException {
        byte[] bArr = (byte[]) this.f11795c.e(65536, byte[].class);
        BitmapFactory.Options k5 = k();
        k5.inTempStorage = bArr;
        com.bumptech.glide.load.b bVar2 = (com.bumptech.glide.load.b) iVar.c(f11782g);
        com.bumptech.glide.load.j jVar = (com.bumptech.glide.load.j) iVar.c(f11783h);
        p pVar = (p) iVar.c(p.f11765h);
        boolean booleanValue = ((Boolean) iVar.c(f11785j)).booleanValue();
        com.bumptech.glide.load.h<Boolean> hVar = f11786k;
        try {
            return g.e(h(c0Var, k5, pVar, bVar2, jVar, iVar.c(hVar) != null && ((Boolean) iVar.c(hVar)).booleanValue(), i5, i6, booleanValue, bVar), this.f11793a);
        } finally {
            v(k5);
            this.f11795c.put(bArr);
        }
    }

    private Bitmap h(c0 c0Var, BitmapFactory.Options options, p pVar, com.bumptech.glide.load.b bVar, com.bumptech.glide.load.j jVar, boolean z5, int i5, int i6, boolean z6, b bVar2) throws IOException {
        int i7;
        int i8;
        ColorSpace.Named named;
        ColorSpace colorSpace;
        int i9;
        ColorSpace colorSpace2;
        ColorSpace colorSpace3;
        ColorSpace colorSpace4;
        boolean isWideGamut;
        long b6 = com.bumptech.glide.util.h.b();
        int[] m5 = m(c0Var, options, bVar2, this.f11793a);
        boolean z7 = false;
        int i10 = m5[0];
        int i11 = m5[1];
        String str = options.outMimeType;
        boolean z8 = (i10 == -1 || i11 == -1) ? false : z5;
        int a6 = c0Var.a();
        int j5 = l0.j(a6);
        boolean m6 = l0.m(a6);
        if (i5 == Integer.MIN_VALUE) {
            i7 = i6;
            i8 = r(j5) ? i11 : i10;
        } else {
            i7 = i6;
            i8 = i5;
        }
        int i12 = i7 == Integer.MIN_VALUE ? r(j5) ? i10 : i11 : i7;
        c(c0Var.d(), c0Var, bVar2, this.f11793a, pVar, j5, i10, i11, i8, i12, options);
        b(c0Var, bVar, z8, m6, options, i8, i12);
        int i13 = Build.VERSION.SDK_INT;
        int i14 = options.inSampleSize;
        String s5 = ProtectedSandApp.s("Ǖ");
        if (i10 < 0 || i11 < 0 || !z6) {
            float f6 = s(options) ? options.inTargetDensity / options.inDensity : 1.0f;
            float f7 = i10;
            float f8 = options.inSampleSize;
            int ceil = (int) Math.ceil(f7 / f8);
            int ceil2 = (int) Math.ceil(i11 / f8);
            i8 = Math.round(ceil * f6);
            i12 = Math.round(ceil2 * f6);
            Log.isLoggable(s5, 2);
        }
        int i15 = i8;
        int i16 = i12;
        if (i15 > 0 && i16 > 0) {
            y(options, this.f11793a, i15, i16);
        }
        if (i13 >= 28) {
            if (jVar == com.bumptech.glide.load.j.DISPLAY_P3) {
                colorSpace3 = options.outColorSpace;
                if (colorSpace3 != null) {
                    colorSpace4 = options.outColorSpace;
                    isWideGamut = colorSpace4.isWideGamut();
                    if (isWideGamut) {
                        z7 = true;
                    }
                }
            }
            colorSpace2 = ColorSpace.get(z7 ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB);
            options.inPreferredColorSpace = colorSpace2;
        } else if (i13 >= 26) {
            named = ColorSpace.Named.SRGB;
            colorSpace = ColorSpace.get(named);
            options.inPreferredColorSpace = colorSpace;
        }
        Bitmap i17 = i(c0Var, options, bVar2, this.f11793a);
        bVar2.a(this.f11793a, i17);
        if (Log.isLoggable(s5, 2)) {
            i9 = a6;
            t(i10, i11, str, options, i17, i5, i6, b6);
        } else {
            i9 = a6;
        }
        if (i17 == null) {
            return null;
        }
        i17.setDensity(this.f11794b.densityDpi);
        Bitmap o5 = l0.o(this.f11793a, i17, i9);
        if (i17.equals(o5)) {
            return o5;
        }
        this.f11793a.d(i17);
        return o5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        throw r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static android.graphics.Bitmap i(com.bumptech.glide.load.resource.bitmap.c0 r4, android.graphics.BitmapFactory.Options r5, com.bumptech.glide.load.resource.bitmap.v.b r6, com.bumptech.glide.load.engine.bitmap_recycle.e r7) throws java.io.IOException {
        /*
            boolean r0 = r5.inJustDecodeBounds
            if (r0 != 0) goto La
            r6.b()
            r4.c()
        La:
            int r0 = r5.outWidth
            int r1 = r5.outHeight
            java.lang.String r2 = r5.outMimeType
            java.util.concurrent.locks.Lock r3 = com.bumptech.glide.load.resource.bitmap.l0.i()
            r3.lock()
            android.graphics.Bitmap r4 = r4.b(r5)     // Catch: java.lang.Throwable -> L23 java.lang.IllegalArgumentException -> L25
        L1b:
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.l0.i()
            r5.unlock()
            return r4
        L23:
            r4 = move-exception
            goto L45
        L25:
            r3 = move-exception
            java.io.IOException r0 = u(r3, r0, r1, r2, r5)     // Catch: java.lang.Throwable -> L23
            java.lang.String r1 = "ǖ"
            java.lang.String r1 = com.flashget.kidsdownloader.ProtectedSandApp.s(r1)     // Catch: java.lang.Throwable -> L23
            r2 = 3
            android.util.Log.isLoggable(r1, r2)     // Catch: java.lang.Throwable -> L23
            android.graphics.Bitmap r1 = r5.inBitmap     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L44
            r7.d(r1)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L43
            r1 = 0
            r5.inBitmap = r1     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L43
            android.graphics.Bitmap r4 = i(r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L43
            goto L1b
        L43:
            throw r0     // Catch: java.lang.Throwable -> L23
        L44:
            throw r0     // Catch: java.lang.Throwable -> L23
        L45:
            java.util.concurrent.locks.Lock r5 = com.bumptech.glide.load.resource.bitmap.l0.i()
            r5.unlock()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.v.i(com.bumptech.glide.load.resource.bitmap.c0, android.graphics.BitmapFactory$Options, com.bumptech.glide.load.resource.bitmap.v$b, com.bumptech.glide.load.engine.bitmap_recycle.e):android.graphics.Bitmap");
    }

    @androidx.annotation.q0
    @TargetApi(19)
    private static String j(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return ProtectedSandApp.s("Ǚ") + bitmap.getWidth() + ProtectedSandApp.s("ǚ") + bitmap.getHeight() + ProtectedSandApp.s("Ǜ") + bitmap.getConfig() + (ProtectedSandApp.s("Ǘ") + bitmap.getAllocationByteCount() + ProtectedSandApp.s("ǘ"));
    }

    private static synchronized BitmapFactory.Options k() {
        BitmapFactory.Options poll;
        synchronized (v.class) {
            Queue<BitmapFactory.Options> queue = f11792q;
            synchronized (queue) {
                poll = queue.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                w(poll);
            }
        }
        return poll;
    }

    private static int l(double d6) {
        if (d6 > 1.0d) {
            d6 = 1.0d / d6;
        }
        return (int) Math.round(d6 * 2.147483647E9d);
    }

    private static int[] m(c0 c0Var, BitmapFactory.Options options, b bVar, com.bumptech.glide.load.engine.bitmap_recycle.e eVar) throws IOException {
        options.inJustDecodeBounds = true;
        i(c0Var, options, bVar, eVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static String n(BitmapFactory.Options options) {
        return j(options.inBitmap);
    }

    private static boolean r(int i5) {
        return i5 == 90 || i5 == 270;
    }

    private static boolean s(BitmapFactory.Options options) {
        int i5;
        int i6 = options.inTargetDensity;
        return i6 > 0 && (i5 = options.inDensity) > 0 && i6 != i5;
    }

    private static void t(int i5, int i6, String str, BitmapFactory.Options options, Bitmap bitmap, int i7, int i8, long j5) {
        j(bitmap);
        n(options);
        int i9 = options.inSampleSize;
        Thread.currentThread().getName();
        com.bumptech.glide.util.h.a(j5);
    }

    private static IOException u(IllegalArgumentException illegalArgumentException, int i5, int i6, String str, BitmapFactory.Options options) {
        return new IOException(ProtectedSandApp.s("ǜ") + i5 + ProtectedSandApp.s("ǝ") + i6 + ProtectedSandApp.s("Ǟ") + str + ProtectedSandApp.s("ǟ") + n(options), illegalArgumentException);
    }

    private static void v(BitmapFactory.Options options) {
        w(options);
        Queue<BitmapFactory.Options> queue = f11792q;
        synchronized (queue) {
            queue.offer(options);
        }
    }

    private static void w(BitmapFactory.Options options) {
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

    private static int x(double d6) {
        return (int) (d6 + 0.5d);
    }

    @TargetApi(26)
    private static void y(BitmapFactory.Options options, com.bumptech.glide.load.engine.bitmap_recycle.e eVar, int i5, int i6) {
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
        options.inBitmap = eVar.g(i5, i6, config);
    }

    private boolean z(ImageHeaderParser.ImageType imageType) {
        return true;
    }

    @x0(21)
    public com.bumptech.glide.load.engine.u<Bitmap> d(ParcelFileDescriptor parcelFileDescriptor, int i5, int i6, com.bumptech.glide.load.i iVar) throws IOException {
        return e(new c0.b(parcelFileDescriptor, this.f11796d, this.f11795c), i5, i6, iVar, f11790o);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> f(InputStream inputStream, int i5, int i6, com.bumptech.glide.load.i iVar) throws IOException {
        return g(inputStream, i5, i6, iVar, f11790o);
    }

    public com.bumptech.glide.load.engine.u<Bitmap> g(InputStream inputStream, int i5, int i6, com.bumptech.glide.load.i iVar, b bVar) throws IOException {
        return e(new c0.a(inputStream, this.f11796d, this.f11795c), i5, i6, iVar, bVar);
    }

    public boolean o(ParcelFileDescriptor parcelFileDescriptor) {
        return true;
    }

    public boolean p(InputStream inputStream) {
        return true;
    }

    public boolean q(ByteBuffer byteBuffer) {
        return true;
    }
}
