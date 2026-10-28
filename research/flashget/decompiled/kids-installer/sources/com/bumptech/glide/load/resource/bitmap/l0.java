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
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;
import com.flashget.kidsdownloader.ProtectedSandApp;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: TransformationUtils.java */
/* loaded from: classes.dex */
public final class l0 {

    /* renamed from: b, reason: collision with root package name */
    public static final int f11738b = 6;

    /* renamed from: d, reason: collision with root package name */
    private static final int f11740d = 7;

    /* renamed from: f, reason: collision with root package name */
    private static final Paint f11742f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f11743g;

    /* renamed from: h, reason: collision with root package name */
    private static final Lock f11744h;

    /* renamed from: a, reason: collision with root package name */
    private static final String f11737a = ProtectedSandApp.s("Ɲ");

    /* renamed from: c, reason: collision with root package name */
    private static final Paint f11739c = new Paint(6);

    /* renamed from: e, reason: collision with root package name */
    private static final Paint f11741e = new Paint(7);

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes3.dex */
    class a implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f11745a;

        a(int i5) {
            this.f11745a = i5;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            int i5 = this.f11745a;
            canvas.drawRoundRect(rectF, i5, i5, paint);
        }
    }

    /* compiled from: TransformationUtils.java */
    /* loaded from: classes3.dex */
    class b implements c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f11746a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ float f11747b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ float f11748c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ float f11749d;

        b(float f6, float f7, float f8, float f9) {
            this.f11746a = f6;
            this.f11747b = f7;
            this.f11748c = f8;
            this.f11749d = f9;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.l0.c
        public void a(Canvas canvas, Paint paint, RectF rectF) {
            Path path = new Path();
            float f6 = this.f11746a;
            float f7 = this.f11747b;
            float f8 = this.f11748c;
            float f9 = this.f11749d;
            path.addRoundRect(rectF, new float[]{f6, f6, f7, f7, f8, f8, f9, f9}, Path.Direction.CW);
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
            throw new UnsupportedOperationException(ProtectedSandApp.s("Ɯ"));
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock() {
            return true;
        }

        @Override // java.util.concurrent.locks.Lock
        public void unlock() {
        }

        @Override // java.util.concurrent.locks.Lock
        public boolean tryLock(long j5, @androidx.annotation.o0 TimeUnit timeUnit) throws InterruptedException {
            return true;
        }
    }

    static {
        HashSet hashSet = new HashSet(Arrays.asList(ProtectedSandApp.s("ƞ"), ProtectedSandApp.s("Ɵ"), ProtectedSandApp.s("Ơ"), ProtectedSandApp.s("ơ"), ProtectedSandApp.s("Ƣ"), ProtectedSandApp.s("ƣ"), ProtectedSandApp.s("Ƥ"), ProtectedSandApp.s("ƥ"), ProtectedSandApp.s("Ʀ"), ProtectedSandApp.s("Ƨ"), ProtectedSandApp.s("ƨ"), ProtectedSandApp.s("Ʃ"), ProtectedSandApp.s("ƪ"), ProtectedSandApp.s("ƫ"), ProtectedSandApp.s("Ƭ"), ProtectedSandApp.s("ƭ"), ProtectedSandApp.s("Ʈ"), ProtectedSandApp.s("Ư"), ProtectedSandApp.s("ư"), ProtectedSandApp.s("Ʊ"), ProtectedSandApp.s("Ʋ"), ProtectedSandApp.s("Ƴ"), ProtectedSandApp.s("ƴ"), ProtectedSandApp.s("Ƶ"), ProtectedSandApp.s("ƶ"), ProtectedSandApp.s("Ʒ"), ProtectedSandApp.s("Ƹ"), ProtectedSandApp.s("ƹ"), ProtectedSandApp.s("ƺ")));
        f11743g = hashSet;
        f11744h = hashSet.contains(Build.MODEL) ? new ReentrantLock() : new d();
        Paint paint = new Paint(7);
        f11742f = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    private l0() {
    }

    private static void a(@androidx.annotation.o0 Bitmap bitmap, @androidx.annotation.o0 Bitmap bitmap2, Matrix matrix) {
        Lock lock = f11744h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, f11739c);
            canvas.setBitmap(null);
            lock.unlock();
        } catch (Throwable th) {
            f11744h.unlock();
            throw th;
        }
    }

    public static Bitmap b(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        float width;
        float height;
        if (bitmap.getWidth() == i5 && bitmap.getHeight() == i6) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        float f6 = 0.0f;
        if (bitmap.getWidth() * i6 > bitmap.getHeight() * i5) {
            width = i6 / bitmap.getHeight();
            f6 = (i5 - (bitmap.getWidth() * width)) * 0.5f;
            height = 0.0f;
        } else {
            width = i5 / bitmap.getWidth();
            height = (i6 - (bitmap.getHeight() * width)) * 0.5f;
        }
        matrix.setScale(width, width);
        matrix.postTranslate((int) (f6 + 0.5f), (int) (height + 0.5f));
        Bitmap f7 = eVar.f(i5, i6, k(bitmap));
        t(bitmap, f7);
        a(bitmap, f7, matrix);
        return f7;
    }

    public static Bitmap c(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        int width = bitmap.getWidth();
        String s5 = ProtectedSandApp.s("ƻ");
        if (width > i5 || bitmap.getHeight() > i6) {
            Log.isLoggable(s5, 2);
            return f(eVar, bitmap, i5, i6);
        }
        Log.isLoggable(s5, 2);
        return bitmap;
    }

    public static Bitmap d(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        int min = Math.min(i5, i6);
        float f6 = min;
        float f7 = f6 / 2.0f;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float max = Math.max(f6 / width, f6 / height);
        float f8 = width * max;
        float f9 = max * height;
        float f10 = (f6 - f8) / 2.0f;
        float f11 = (f6 - f9) / 2.0f;
        RectF rectF = new RectF(f10, f11, f8 + f10, f9 + f11);
        Bitmap g5 = g(eVar, bitmap);
        Bitmap f12 = eVar.f(min, min, h(bitmap));
        f12.setHasAlpha(true);
        Lock lock = f11744h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f12);
            canvas.drawCircle(f7, f7, f7, f11741e);
            canvas.drawBitmap(g5, (Rect) null, rectF, f11742f);
            canvas.setBitmap(null);
            lock.unlock();
            if (!g5.equals(bitmap)) {
                eVar.d(g5);
            }
            return f12;
        } catch (Throwable th) {
            f11744h.unlock();
            throw th;
        }
    }

    private static void e(Canvas canvas) {
        canvas.setBitmap(null);
    }

    public static Bitmap f(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6) {
        int width = bitmap.getWidth();
        String s5 = ProtectedSandApp.s("Ƽ");
        if (width == i5 && bitmap.getHeight() == i6) {
            Log.isLoggable(s5, 2);
            return bitmap;
        }
        float min = Math.min(i5 / bitmap.getWidth(), i6 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable(s5, 2);
            return bitmap;
        }
        Bitmap f6 = eVar.f((int) (bitmap.getWidth() * min), (int) (bitmap.getHeight() * min), k(bitmap));
        t(bitmap, f6);
        if (Log.isLoggable(s5, 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            f6.getWidth();
            f6.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        a(bitmap, f6, matrix);
        return f6;
    }

    private static Bitmap g(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap) {
        Bitmap.Config h5 = h(bitmap);
        if (h5.equals(bitmap.getConfig())) {
            return bitmap;
        }
        Bitmap f6 = eVar.f(bitmap.getWidth(), bitmap.getHeight(), h5);
        new Canvas(f6).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
        return f6;
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
        return f11744h;
    }

    public static int j(int i5) {
        switch (i5) {
            case 3:
            case 4:
                return SubsamplingScaleImageView.ORIENTATION_180;
            case 5:
            case 6:
                return 90;
            case 7:
            case 8:
                return SubsamplingScaleImageView.ORIENTATION_270;
            default:
                return 0;
        }
    }

    @androidx.annotation.o0
    private static Bitmap.Config k(@androidx.annotation.o0 Bitmap bitmap) {
        return bitmap.getConfig() != null ? bitmap.getConfig() : Bitmap.Config.ARGB_8888;
    }

    @m1
    static void l(int i5, Matrix matrix) {
        switch (i5) {
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

    public static boolean m(int i5) {
        switch (i5) {
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

    public static Bitmap n(@androidx.annotation.o0 Bitmap bitmap, int i5) {
        if (i5 == 0) {
            return bitmap;
        }
        try {
            Matrix matrix = new Matrix();
            matrix.setRotate(i5);
            return Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
        } catch (Exception unused) {
            Log.isLoggable(ProtectedSandApp.s("ƽ"), 6);
            return bitmap;
        }
    }

    public static Bitmap o(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5) {
        if (!m(i5)) {
            return bitmap;
        }
        Matrix matrix = new Matrix();
        l(i5, matrix);
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        matrix.mapRect(rectF);
        Bitmap f6 = eVar.f(Math.round(rectF.width()), Math.round(rectF.height()), k(bitmap));
        matrix.postTranslate(-rectF.left, -rectF.top);
        f6.setHasAlpha(bitmap.hasAlpha());
        a(bitmap, f6, matrix);
        return f6;
    }

    public static Bitmap p(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, float f6, float f7, float f8, float f9) {
        return s(eVar, bitmap, new b(f6, f7, f8, f9));
    }

    public static Bitmap q(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5) {
        com.bumptech.glide.util.l.a(i5 > 0, ProtectedSandApp.s("ƾ"));
        return s(eVar, bitmap, new a(i5));
    }

    @Deprecated
    public static Bitmap r(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, int i5, int i6, int i7) {
        return q(eVar, bitmap, i7);
    }

    private static Bitmap s(@androidx.annotation.o0 com.bumptech.glide.load.engine.bitmap_recycle.e eVar, @androidx.annotation.o0 Bitmap bitmap, c cVar) {
        Bitmap.Config h5 = h(bitmap);
        Bitmap g5 = g(eVar, bitmap);
        Bitmap f6 = eVar.f(g5.getWidth(), g5.getHeight(), h5);
        f6.setHasAlpha(true);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(g5, tileMode, tileMode);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(0.0f, 0.0f, f6.getWidth(), f6.getHeight());
        Lock lock = f11744h;
        lock.lock();
        try {
            Canvas canvas = new Canvas(f6);
            canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            cVar.a(canvas, paint, rectF);
            canvas.setBitmap(null);
            lock.unlock();
            if (!g5.equals(bitmap)) {
                eVar.d(g5);
            }
            return f6;
        } catch (Throwable th) {
            f11744h.unlock();
            throw th;
        }
    }

    public static void t(Bitmap bitmap, Bitmap bitmap2) {
        bitmap2.setHasAlpha(bitmap.hasAlpha());
    }
}
