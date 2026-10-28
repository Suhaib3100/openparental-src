package com.bumptech.glide.load.resource.bitmap;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Build;
import android.util.Log;
import androidx.annotation.m1;
import androidx.compose.ui.graphics.x4;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TransformationUtils.java */
/* loaded from: classes3.dex */
public final class m0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f44503b = 6;

    /* renamed from: d, reason: collision with root package name */
    private static final int f44505d = 7;

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f44507f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f44508g;

    /* renamed from: h, reason: collision with root package name */
    private static final Lock f44509h;

    /* renamed from: a, reason: collision with root package name */
    private static final String f44502a = ProtectedSandApp.s("ষ");

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f44504c = new Paint(6);

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f44506e = new Paint(7);

    /* compiled from: TransformationUtils.java */
    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f44510a;

        a(int i4) {
            this.f44510a = i4;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i4 = this.f44510a;
            canvas.drawRoundRect(rectF, i4, i4, paint);
        }
    }

    /* compiled from: TransformationUtils.java */
    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f44511a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f44512b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f44513c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f44514d;

        b(float f4, float f5, float f6, float f7) {
            this.f44511a = f4;
            this.f44512b = f5;
            this.f44513c = f6;
            this.f44514d = f7;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.m0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f4 = this.f44511a;
            float f5 = this.f44512b;
            float f6 = this.f44513c;
            float f7 = this.f44514d;
            path.addRoundRect(rectF, new float[]{f4, f4, f5, f5, f6, f6, f7, f7}, Path.Direction.CW);
            canvas.drawPath(path, paint);
        }
    }

    /* compiled from: TransformationUtils.java */
    private interface c {
        void a(Canvas canvas, Paint paint, RectF rectF);
    }

    /* compiled from: TransformationUtils.java */
    private static final class d implements Lock {
        d() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public void lockInterruptibly() throws InterruptedException {
        }

        @Override // java.util.concurrent.locks.Lock
        @androidx.annotation.o0
        public Condition newCondition() {
            throw new UnsupportedOperationException(ProtectedSandApp.s("শ"));
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j4, @androidx.annotation.o0 TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(ProtectedSandApp.s("\u09ba"), ProtectedSandApp.s("\u09bb"), ProtectedSandApp.s("়"), ProtectedSandApp.s("ঽ"), ProtectedSandApp.s("া"), ProtectedSandApp.s("ি"), ProtectedSandApp.s("ী"), ProtectedSandApp.s("ু"), ProtectedSandApp.s("ূ"), ProtectedSandApp.s("ৃ"), ProtectedSandApp.s("ৄ"), ProtectedSandApp.s("\u09c5"), ProtectedSandApp.s("\u09c6"), ProtectedSandApp.s("ে"), ProtectedSandApp.s("ৈ"), ProtectedSandApp.s("\u09c9"), ProtectedSandApp.s("\u09ca"), ProtectedSandApp.s("ো"), ProtectedSandApp.s("ৌ"), ProtectedSandApp.s("্"), ProtectedSandApp.s("ৎ"), ProtectedSandApp.s("\u09cf"), ProtectedSandApp.s("\u09d0"), ProtectedSandApp.s("\u09d1"), ProtectedSandApp.s("\u09d2"), ProtectedSandApp.s("\u09d3"), ProtectedSandApp.s("\u09d4"), ProtectedSandApp.s("স"), ProtectedSandApp.s("হ")));
        f44508g = hashSet;
        f44509h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f44507f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private m0() {
    }

    private static void a(@androidx.annotation.o0 Bitmap bitmap, @androidx.annotation.o0 Bitmap bitmap2, Matrix matrix) {
        Lock lock = f44509h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f44504c);
            canvas.setBitmap(null);
            lock.unlock();
        } catch (Throwable th) {
            f44509h.unlock();
            throw th;
        }
    }

    public static Bitmap b(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        float width;
        float a5;
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f4 = 0.0f;
        if (bitmap.getWidth() * i5 > bitmap.getHeight() * i4) {
            width = i5 / bitmap.getHeight();
            f4 = x4.a(bitmap.getWidth(), width, i4, 0.5f);
            a5 = 0.0f;
        } else {
            width = i4 / bitmap.getWidth();
            a5 = x4.a(bitmap.getHeight(), width, i5, 0.5f);
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f4 + 0.5f), (int) (a5 + 0.5f));
        Bitmap f5 = eVar.f(i4, i5, k(bitmap));
        t(bitmap, f5);
        a(bitmap, f5, matrix);
        return f5;
    }

    public static Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        int width = bitmap.getWidth();
        String s4 = ProtectedSandApp.s("ষ");
        if (width > i4 || bitmap.getHeight() > i5) {
            Log.isLoggable(s4, 2);
            return f(eVar, bitmap, i4, i5);
        }
        Log.isLoggable(s4, 2);
        return bitmap;
    }

    public static Bitmap d(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        int min = Math.min(i4, i5);
        float f4 = min;
        float f5 = f4 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f4 / width, f4 / height);
        float f6 = width * max;
        float f7 = max * height;
        float f10 = (f4 - f6) / 2.0f;
        float f11 = (f4 - f7) / 2.0f;
        RectF rectF = new RectF(f10, f11, f6 + f10, f7 + f11);
        Bitmap g4 = g(eVar, bitmap);
        Bitmap f12 = eVar.f(min, min, h(bitmap));
        f12.setHasAlpha(true);
        Lock lock = f44509h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f12);
            canvas.drawCircle(f5, f5, f5, f44506e);
            canvas.drawBitmap(g4, (Rect) null, rectF, f44507f);
            canvas.setBitmap(null);
            lock.unlock();
            if (!g4.equals(bitmap)) {
                eVar.e(g4);
            }
            return f12;
        } catch (Throwable th) {
            f44509h.unlock();
            throw th;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5) {
        int width = bitmap.getWidth();
        String s4 = ProtectedSandApp.s("ষ");
        if (width == i4 && bitmap.getHeight() == i5) {
            Log.isLoggable(s4, 2);
            return bitmap;
        }
        float min = Math.min(i4 / bitmap.getWidth(), i5 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable(s4, 2);
            return bitmap;
        }
        Bitmap f4 = eVar.f((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), k(bitmap));
        t(bitmap, f4);
        if (Log.isLoggable(s4, 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            f4.getWidth();
            f4.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, f4, matrix);
        return f4;
    }

    private static Bitmap g(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap) {
        Bitmap.Config h4 = h(bitmap);
        if (h4.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap f4 = eVar.f(bitmap.getWidth(), bitmap.getHeight(), h4);
        new Canvas(f4).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return f4;
    }

    @androidx.annotation.o0
    private static Bitmap.Config h(@androidx.annotation.o0 Bitmap bitmap) {
        Bitmap.Config config;
        Bitmap.Config config2;
        if (Build.VERSION.SDK_INT >= 26) {
            config = Bitmap.Config.RGBA_F16;
            if (config.equals(bitmap.getConfig())) {
                config2 = Bitmap.Config.RGBA_F16;
                return config2;
            }
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static Lock i() {
        return f44509h;
    }

    public static int j(int i4) {
        switch (i4) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return 270;
            default:
                return 0;
        }
    }

    @androidx.annotation.o0
    private static Bitmap.Config k(@androidx.annotation.o0 Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @m1
    static void l(int i4, Matrix matrix) {
        switch (i4) {
            case 2:
                matrix.setScale(-1.0f, 1.0f);
                break;
            case 3:
                matrix.setRotate(180.0f);
                break;
            case 4:
                matrix.setRotate(180.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 5:
                matrix.setRotate(90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 6:
                matrix.setRotate(90.0f);
                break;
            case 7:
                matrix.setRotate(-90.0f);
                matrix.postScale(-1.0f, 1.0f);
                break;
            case 8:
                matrix.setRotate(-90.0f);
                break;
        }
    }

    public static boolean m(int i4) {
        switch (i4) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                return true;
            default:
                return false;
        }
    }

    public static Bitmap n(@androidx.annotation.o0 Bitmap bitmap, int i4) {
        if (i4 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i4);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            Log.isLoggable(ProtectedSandApp.s("ষ"), 6);
            return bitmap;
        }
    }

    public static Bitmap o(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4) {
        switch (i4) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                Matrix matrix = new Matrix();
                l(i4, matrix);
                RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
                matrix.mapRect(rectF);
                Bitmap f4 = eVar.f(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
                matrix.postTranslate(-rectF.left, -rectF.top);
                f4.setHasAlpha(bitmap.hasAlpha());
                a(bitmap, f4, matrix);
                return f4;
            default:
                return bitmap;
        }
    }

    public static Bitmap p(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, float f4, float f5, float f6, float f7) {
        return s(eVar, bitmap, new b(f4, f5, f6, f7));
    }

    public static Bitmap q(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4) {
        com.bumptech.glide.util.m.b(i4 > 0, ProtectedSandApp.s("\u09d5"));
        return s(eVar, bitmap, new a(i4));
    }

    @Deprecated
    public static Bitmap r(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i4, int i5, int i6) {
        return q(eVar, bitmap, i6);
    }

    private static Bitmap s(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, c cVar) {
        Bitmap.Config h4 = h(bitmap);
        Bitmap g4 = g(eVar, bitmap);
        Bitmap f4 = eVar.f(g4.getWidth(), g4.getHeight(), h4);
        f4.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g4, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, f4.getWidth(), f4.getHeight());
        Lock lock = f44509h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f4);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            canvas.setBitmap(null);
            lock.unlock();
            if (!g4.equals(bitmap)) {
                eVar.e(g4);
            }
            return f4;
        } catch (Throwable th) {
            f44509h.unlock();
            throw th;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
