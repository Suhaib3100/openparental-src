package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.hardware.HardwareBuffer;
import android.os.Build;

/* compiled from: BitmapCompat.java */
/* loaded from: classes.dex */
public final class a {

    /* compiled from: BitmapCompat.java */
    @androidx.annotation.x0(17)
    /* renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    static class C0038a {
        private C0038a() {
        }

        @androidx.annotation.u
        static boolean a(Bitmap bitmap) {
            return bitmap.hasMipMap();
        }

        @androidx.annotation.u
        static void b(Bitmap bitmap, boolean z5) {
            bitmap.setHasMipMap(z5);
        }
    }

    /* compiled from: BitmapCompat.java */
    @androidx.annotation.x0(19)
    static class b {
        private b() {
        }

        @androidx.annotation.u
        static int a(Bitmap bitmap) {
            return bitmap.getAllocationByteCount();
        }
    }

    /* compiled from: BitmapCompat.java */
    @androidx.annotation.x0(27)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static Bitmap a(Bitmap bitmap) {
            Bitmap.Config config;
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config2 != config) {
                return bitmap;
            }
            Bitmap.Config config3 = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                config3 = e.a(bitmap);
            }
            return bitmap.copy(config3, true);
        }

        @androidx.annotation.u
        static Bitmap b(int i5, int i6, Bitmap bitmap, boolean z5) {
            ColorSpace colorSpace;
            ColorSpace.Named named;
            ColorSpace colorSpace2;
            Bitmap.Config config;
            Bitmap createBitmap;
            ColorSpace colorSpace3;
            boolean equals;
            Bitmap.Config config2 = bitmap.getConfig();
            colorSpace = bitmap.getColorSpace();
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace2 = ColorSpace.get(named);
            if (z5) {
                colorSpace3 = bitmap.getColorSpace();
                equals = colorSpace3.equals(colorSpace2);
                if (!equals) {
                    config2 = Bitmap.Config.RGBA_F16;
                    colorSpace = colorSpace2;
                    createBitmap = Bitmap.createBitmap(i5, i6, config2, bitmap.hasAlpha(), colorSpace);
                    return createBitmap;
                }
            }
            Bitmap.Config config3 = bitmap.getConfig();
            config = Bitmap.Config.HARDWARE;
            if (config3 == config) {
                config2 = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config2 = e.a(bitmap);
                }
            }
            createBitmap = Bitmap.createBitmap(i5, i6, config2, bitmap.hasAlpha(), colorSpace);
            return createBitmap;
        }

        @androidx.annotation.u
        static boolean c(Bitmap bitmap) {
            ColorSpace.Named named;
            ColorSpace colorSpace;
            Bitmap.Config config;
            ColorSpace colorSpace2;
            boolean equals;
            named = ColorSpace.Named.LINEAR_EXTENDED_SRGB;
            colorSpace = ColorSpace.get(named);
            Bitmap.Config config2 = bitmap.getConfig();
            config = Bitmap.Config.RGBA_F16;
            if (config2 == config) {
                colorSpace2 = bitmap.getColorSpace();
                equals = colorSpace2.equals(colorSpace);
                if (equals) {
                    return true;
                }
            }
            return false;
        }
    }

    /* compiled from: BitmapCompat.java */
    @androidx.annotation.x0(29)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static void a(Paint paint) {
            BlendMode blendMode;
            blendMode = BlendMode.SRC;
            paint.setBlendMode(blendMode);
        }
    }

    /* compiled from: BitmapCompat.java */
    @androidx.annotation.x0(31)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static Bitmap.Config a(Bitmap bitmap) {
            HardwareBuffer hardwareBuffer;
            int format;
            Bitmap.Config config;
            hardwareBuffer = bitmap.getHardwareBuffer();
            format = hardwareBuffer.getFormat();
            if (format != 22) {
                return Bitmap.Config.ARGB_8888;
            }
            config = Bitmap.Config.RGBA_F16;
            return config;
        }
    }

    private a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:95:0x01a6, code lost:
    
        if (androidx.core.graphics.a.c.c(r11) == false) goto L122;
     */
    @androidx.annotation.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(@androidx.annotation.o0 android.graphics.Bitmap r21, int r22, int r23, @androidx.annotation.q0 android.graphics.Rect r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.a.a(android.graphics.Bitmap, int, int, android.graphics.Rect, boolean):android.graphics.Bitmap");
    }

    public static int b(@androidx.annotation.o0 Bitmap bitmap) {
        return b.a(bitmap);
    }

    public static boolean c(@androidx.annotation.o0 Bitmap bitmap) {
        return C0038a.a(bitmap);
    }

    public static void d(@androidx.annotation.o0 Bitmap bitmap, boolean z5) {
        C0038a.b(bitmap, z5);
    }

    @androidx.annotation.m1
    public static int e(int i5, int i6, int i7, int i8) {
        return i7 == 0 ? i6 : i7 > 0 ? i5 * (1 << (i8 - i7)) : i6 << ((-i7) - 1);
    }
}
