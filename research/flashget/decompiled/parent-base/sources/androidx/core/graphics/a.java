package androidx.core.graphics;

import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.ColorSpace;
import android.graphics.Paint;
import android.os.Build;
import androidx.annotation.m1;

/* compiled from: BitmapCompat.java */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: BitmapCompat.java */
    @androidx.annotation.x0(27)
    /* renamed from: androidx.core.graphics.a$a, reason: collision with other inner class name */
    static class C0414a {
        private C0414a() {
        }

        static Bitmap a(Bitmap bitmap) {
            if (bitmap.getConfig() != Bitmap.Config.HARDWARE) {
                return bitmap;
            }
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            if (Build.VERSION.SDK_INT >= 31) {
                config = c.a(bitmap);
            }
            return bitmap.copy(config, true);
        }

        static Bitmap b(int i4, int i5, Bitmap bitmap, boolean z4) {
            Bitmap.Config config = bitmap.getConfig();
            ColorSpace colorSpace = bitmap.getColorSpace();
            ColorSpace colorSpace2 = ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
            if (z4 && !bitmap.getColorSpace().equals(colorSpace2)) {
                config = Bitmap.Config.RGBA_F16;
                colorSpace = colorSpace2;
            } else if (bitmap.getConfig() == Bitmap.Config.HARDWARE) {
                config = Bitmap.Config.ARGB_8888;
                if (Build.VERSION.SDK_INT >= 31) {
                    config = c.a(bitmap);
                }
            }
            return Bitmap.createBitmap(i4, i5, config, bitmap.hasAlpha(), colorSpace);
        }

        static boolean c(Bitmap bitmap) {
            return bitmap.getConfig() == Bitmap.Config.RGBA_F16 && bitmap.getColorSpace().equals(ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB));
        }
    }

    /* compiled from: BitmapCompat.java */
    @androidx.annotation.x0(29)
    static class b {
        private b() {
        }

        static void a(Paint paint) {
            paint.setBlendMode(BlendMode.SRC);
        }
    }

    /* compiled from: BitmapCompat.java */
    @androidx.annotation.x0(31)
    static class c {
        private c() {
        }

        static Bitmap.Config a(Bitmap bitmap) {
            return bitmap.getHardwareBuffer().getFormat() == 22 ? Bitmap.Config.RGBA_F16 : Bitmap.Config.ARGB_8888;
        }
    }

    private a() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x01a9, code lost:
    
        if (androidx.core.graphics.a.C0414a.c(r11) == false) goto L124;
     */
    @androidx.annotation.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.graphics.Bitmap a(@androidx.annotation.o0 android.graphics.Bitmap r21, int r22, int r23, @androidx.annotation.q0 android.graphics.Rect r24, boolean r25) {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.graphics.a.a(android.graphics.Bitmap, int, int, android.graphics.Rect, boolean):android.graphics.Bitmap");
    }

    @androidx.annotation.w0(expression = "bitmap.getAllocationByteCount()")
    @Deprecated
    public static int b(@androidx.annotation.o0 Bitmap bitmap) {
        return bitmap.getAllocationByteCount();
    }

    @androidx.annotation.w0(expression = "bitmap.hasMipMap()")
    @Deprecated
    public static boolean c(@androidx.annotation.o0 Bitmap bitmap) {
        return bitmap.hasMipMap();
    }

    @androidx.annotation.w0(expression = "bitmap.setHasMipMap(hasMipMap)")
    @Deprecated
    public static void d(@androidx.annotation.o0 Bitmap bitmap, boolean z4) {
        bitmap.setHasMipMap(z4);
    }

    @m1
    static int e(int i4, int i5, int i6, int i7) {
        return i6 == 0 ? i5 : i6 > 0 ? i4 * (1 << (i7 - i6)) : i5 << ((-i6) - 1);
    }
}
