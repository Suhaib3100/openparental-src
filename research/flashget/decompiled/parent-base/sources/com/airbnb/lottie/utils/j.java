package com.airbnb.lottie.utils;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import android.provider.Settings;
import androidx.annotation.q0;
import com.airbnb.lottie.animation.content.v;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.Closeable;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.nio.channels.ClosedChannelException;
import javax.net.ssl.SSLException;

/* compiled from: Utils.java */
/* loaded from: classes3.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public static final int f39388a = 1000000000;

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<PathMeasure> f39389b = new a();

    /* renamed from: c, reason: collision with root package name */
    private static final ThreadLocal<Path> f39390c = new b();

    /* renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<Path> f39391d = new c();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<float[]> f39392e = new d();

    /* renamed from: f, reason: collision with root package name */
    private static final float f39393f = (float) (Math.sqrt(2.0d) / 2.0d);

    /* compiled from: Utils.java */
    class a extends ThreadLocal<PathMeasure> {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PathMeasure initialValue() {
            return new PathMeasure();
        }
    }

    /* compiled from: Utils.java */
    class b extends ThreadLocal<Path> {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    class c extends ThreadLocal<Path> {
        c() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Path initialValue() {
            return new Path();
        }
    }

    /* compiled from: Utils.java */
    class d extends ThreadLocal<float[]> {
        d() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // java.lang.ThreadLocal
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float[] initialValue() {
            return new float[4];
        }
    }

    private j() {
    }

    public static void a(Path path, float f4, float f5, float f6) {
        String s4 = ProtectedSandApp.s("˸");
        com.airbnb.lottie.e.a(s4);
        PathMeasure pathMeasure = f39389b.get();
        Path path2 = f39390c.get();
        Path path3 = f39391d.get();
        pathMeasure.setPath(path, false);
        float length = pathMeasure.getLength();
        if (f4 == 1.0f && f5 == 0.0f) {
            com.airbnb.lottie.e.b(s4);
            return;
        }
        if (length < 1.0f || Math.abs((f5 - f4) - 1.0f) < 0.01d) {
            com.airbnb.lottie.e.b(s4);
            return;
        }
        float f7 = f4 * length;
        float f10 = f5 * length;
        float f11 = f6 * length;
        float min = Math.min(f7, f10) + f11;
        float max = Math.max(f7, f10) + f11;
        if (min >= length && max >= length) {
            min = i.g(min, length);
            max = i.g(max, length);
        }
        if (min < 0.0f) {
            min = i.g(min, length);
        }
        if (max < 0.0f) {
            max = i.g(max, length);
        }
        if (min == max) {
            path.reset();
            com.airbnb.lottie.e.b(s4);
            return;
        }
        if (min >= max) {
            min -= length;
        }
        path2.reset();
        pathMeasure.getSegment(min, max, path2, true);
        if (max > length) {
            path3.reset();
            pathMeasure.getSegment(0.0f, max % length, path3, true);
            path2.addPath(path3);
        } else if (min < 0.0f) {
            path3.reset();
            pathMeasure.getSegment(min + length, length, path3, true);
            path2.addPath(path3);
        }
        path.set(path2);
        com.airbnb.lottie.e.b(s4);
    }

    public static void b(Path path, @q0 v vVar) {
        if (vVar == null || vVar.k()) {
            return;
        }
        a(path, ((com.airbnb.lottie.animation.keyframe.d) vVar.i()).p() / 100.0f, ((com.airbnb.lottie.animation.keyframe.d) vVar.e()).p() / 100.0f, ((com.airbnb.lottie.animation.keyframe.d) vVar.g()).p() / 360.0f);
    }

    public static void c(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e4) {
                throw e4;
            } catch (Exception unused) {
            }
        }
    }

    public static Path d(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        Path path = new Path();
        path.moveTo(pointF.x, pointF.y);
        if (pointF3 == null || pointF4 == null || (pointF3.length() == 0.0f && pointF4.length() == 0.0f)) {
            path.lineTo(pointF2.x, pointF2.y);
        } else {
            float f4 = pointF3.x + pointF.x;
            float f5 = pointF.y + pointF3.y;
            float f6 = pointF2.x;
            float f7 = f6 + pointF4.x;
            float f10 = pointF2.y;
            path.cubicTo(f4, f5, f7, f10 + pointF4.y, f6, f10);
        }
        return path;
    }

    public static float e() {
        return Resources.getSystem().getDisplayMetrics().density;
    }

    public static float f(Context context) {
        return Settings.Global.getFloat(context.getContentResolver(), ProtectedSandApp.s("˹"), 1.0f);
    }

    public static float g(Matrix matrix) {
        float[] fArr = f39392e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        float f4 = f39393f;
        fArr[2] = f4;
        fArr[3] = f4;
        matrix.mapPoints(fArr);
        return (float) Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
    }

    public static boolean h(Matrix matrix) {
        float[] fArr = f39392e.get();
        fArr[0] = 0.0f;
        fArr[1] = 0.0f;
        fArr[2] = 37394.73f;
        fArr[3] = 39575.234f;
        matrix.mapPoints(fArr);
        return fArr[0] == fArr[2] || fArr[1] == fArr[3];
    }

    public static int i(float f4, float f5, float f6, float f7) {
        int i4 = f4 != 0.0f ? (int) (527 * f4) : 17;
        if (f5 != 0.0f) {
            i4 = (int) (i4 * 31 * f5);
        }
        if (f6 != 0.0f) {
            i4 = (int) (i4 * 31 * f6);
        }
        return f7 != 0.0f ? (int) (i4 * 31 * f7) : i4;
    }

    public static boolean j(int i4, int i5, int i6, int i7, int i10, int i11) {
        if (i4 < i7) {
            return false;
        }
        if (i4 > i7) {
            return true;
        }
        if (i5 < i10) {
            return false;
        }
        return i5 > i10 || i6 >= i11;
    }

    public static boolean k(Throwable th) {
        return (th instanceof SocketException) || (th instanceof ClosedChannelException) || (th instanceof InterruptedIOException) || (th instanceof ProtocolException) || (th instanceof SSLException) || (th instanceof UnknownHostException) || (th instanceof UnknownServiceException);
    }

    public static Bitmap l(Path path) {
        RectF rectF = new RectF();
        path.computeBounds(rectF, false);
        Bitmap createBitmap = Bitmap.createBitmap((int) rectF.right, (int) rectF.bottom, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        com.airbnb.lottie.animation.a aVar = new com.airbnb.lottie.animation.a();
        aVar.setAntiAlias(true);
        aVar.setColor(-16776961);
        canvas.drawPath(path, aVar);
        return createBitmap;
    }

    public static Bitmap m(Bitmap bitmap, int i4, int i5) {
        if (bitmap.getWidth() == i4 && bitmap.getHeight() == i5) {
            return bitmap;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, i4, i5, true);
        bitmap.recycle();
        return createScaledBitmap;
    }

    public static void n(Canvas canvas, RectF rectF, Paint paint) {
        o(canvas, rectF, paint, 31);
    }

    public static void o(Canvas canvas, RectF rectF, Paint paint, int i4) {
        String s4 = ProtectedSandApp.s("˺");
        com.airbnb.lottie.e.a(s4);
        canvas.saveLayer(rectF, paint);
        com.airbnb.lottie.e.b(s4);
    }
}
