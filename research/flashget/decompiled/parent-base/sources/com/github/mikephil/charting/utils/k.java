package com.github.mikephil.charting.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.compose.ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.firebase.remoteconfig.p;
import java.util.List;

/* compiled from: Utils.java */
/* loaded from: classes5.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    private static DisplayMetrics f50658a = null;

    /* renamed from: b, reason: collision with root package name */
    private static int f50659b = 50;

    /* renamed from: c, reason: collision with root package name */
    private static int f50660c = 8000;

    /* renamed from: d, reason: collision with root package name */
    public static final double f50661d = 0.017453292519943295d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f50662e = 0.017453292f;

    /* renamed from: f, reason: collision with root package name */
    public static final double f50663f = Double.longBitsToDouble(1);

    /* renamed from: g, reason: collision with root package name */
    public static final float f50664g = Float.intBitsToFloat(1);

    /* renamed from: h, reason: collision with root package name */
    private static Rect f50665h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    private static Paint.FontMetrics f50666i = new Paint.FontMetrics();

    /* renamed from: j, reason: collision with root package name */
    private static Rect f50667j = new Rect();

    /* renamed from: k, reason: collision with root package name */
    private static final int[] f50668k = {1, 10, 100, 1000, 10000, AndroidComposeViewAccessibilityDelegateCompat.Q2, 1000000, 10000000, 100000000, 1000000000};

    /* renamed from: l, reason: collision with root package name */
    private static com.github.mikephil.charting.formatter.l f50669l = q();

    /* renamed from: m, reason: collision with root package name */
    private static Rect f50670m = new Rect();

    /* renamed from: n, reason: collision with root package name */
    private static Rect f50671n = new Rect();

    /* renamed from: o, reason: collision with root package name */
    private static Paint.FontMetrics f50672o = new Paint.FontMetrics();

    public static g A(g gVar, float f4, float f5) {
        g c5 = g.c(0.0f, 0.0f);
        B(gVar, f4, f5, c5);
        return c5;
    }

    public static void B(g gVar, float f4, float f5, g gVar2) {
        double d5 = f4;
        double d6 = f5;
        gVar2.f50636d = (float) ((Math.cos(Math.toRadians(d6)) * d5) + gVar.f50636d);
        gVar2.f50637e = (float) ((Math.sin(Math.toRadians(d6)) * d5) + gVar.f50637e);
    }

    public static int C() {
        return Build.VERSION.SDK_INT;
    }

    public static c D(float f4, float f5, float f6) {
        return F(f4, f5, f6 * 0.017453292f);
    }

    public static c E(c cVar, float f4) {
        return F(cVar.f50628d, cVar.f50629e, f4 * 0.017453292f);
    }

    public static c F(float f4, float f5, float f6) {
        double d5 = f6;
        return c.b(Math.abs(((float) Math.sin(d5)) * f5) + Math.abs(((float) Math.cos(d5)) * f4), Math.abs(f5 * ((float) Math.cos(d5))) + Math.abs(f4 * ((float) Math.sin(d5))));
    }

    public static c G(c cVar, float f4) {
        return F(cVar.f50628d, cVar.f50629e, f4);
    }

    public static void H(Context context) {
        if (context == null) {
            f50659b = ViewConfiguration.getMinimumFlingVelocity();
            f50660c = ViewConfiguration.getMaximumFlingVelocity();
        } else {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            f50659b = viewConfiguration.getScaledMinimumFlingVelocity();
            f50660c = viewConfiguration.getScaledMaximumFlingVelocity();
            f50658a = context.getResources().getDisplayMetrics();
        }
    }

    @Deprecated
    public static void I(Resources resources) {
        f50658a = resources.getDisplayMetrics();
        f50659b = ViewConfiguration.getMinimumFlingVelocity();
        f50660c = ViewConfiguration.getMaximumFlingVelocity();
    }

    public static double J(double d5) {
        if (d5 == Double.POSITIVE_INFINITY) {
            return d5;
        }
        double d6 = d5 + p.f60679p;
        return Double.longBitsToDouble(Double.doubleToRawLongBits(d6) + (d6 >= p.f60679p ? 1L : -1L));
    }

    @SuppressLint({"NewApi"})
    public static void K(View view) {
        view.postInvalidateOnAnimation();
    }

    public static float L(double d5) {
        if (Double.isInfinite(d5) || Double.isNaN(d5) || d5 == p.f60679p) {
            return 0.0f;
        }
        return Math.round(d5 * r0) / ((float) Math.pow(10.0d, 1 - ((int) Math.ceil((float) Math.log10(d5 < p.f60679p ? -d5 : d5)))));
    }

    public static void M(MotionEvent motionEvent, VelocityTracker velocityTracker) {
        velocityTracker.computeCurrentVelocity(1000, f50660c);
        int actionIndex = motionEvent.getActionIndex();
        int pointerId = motionEvent.getPointerId(actionIndex);
        float xVelocity = velocityTracker.getXVelocity(pointerId);
        float yVelocity = velocityTracker.getYVelocity(pointerId);
        int pointerCount = motionEvent.getPointerCount();
        for (int i4 = 0; i4 < pointerCount; i4++) {
            if (i4 != actionIndex) {
                int pointerId2 = motionEvent.getPointerId(i4);
                if ((velocityTracker.getYVelocity(pointerId2) * yVelocity) + (velocityTracker.getXVelocity(pointerId2) * xVelocity) < 0.0f) {
                    velocityTracker.clear();
                    return;
                }
            }
        }
    }

    public static int a(Paint paint, String str) {
        Rect rect = f50665h;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        return rect.height();
    }

    public static c b(Paint paint, String str) {
        c b5 = c.b(0.0f, 0.0f);
        c(paint, str, b5);
        return b5;
    }

    public static void c(Paint paint, String str, c cVar) {
        Rect rect = f50667j;
        rect.set(0, 0, 0, 0);
        paint.getTextBounds(str, 0, str.length(), rect);
        cVar.f50628d = rect.width();
        cVar.f50629e = rect.height();
    }

    public static int d(Paint paint, String str) {
        return (int) paint.measureText(str);
    }

    public static float e(float f4) {
        DisplayMetrics displayMetrics = f50658a;
        return displayMetrics == null ? f4 : f4 * displayMetrics.density;
    }

    public static int[] f(List<Integer> list) {
        int[] iArr = new int[list.size()];
        i(list, iArr);
        return iArr;
    }

    public static float g(float f4) {
        DisplayMetrics displayMetrics = f50658a;
        return displayMetrics == null ? f4 : f4 / displayMetrics.density;
    }

    public static String[] h(List<String> list) {
        int size = list.size();
        String[] strArr = new String[size];
        for (int i4 = 0; i4 < size; i4++) {
            strArr[i4] = list.get(i4);
        }
        return strArr;
    }

    public static void i(List<Integer> list, int[] iArr) {
        int length = iArr.length < list.size() ? iArr.length : list.size();
        for (int i4 = 0; i4 < length; i4++) {
            iArr[i4] = list.get(i4).intValue();
        }
    }

    public static void j(List<String> list, String[] strArr) {
        int length = strArr.length < list.size() ? strArr.length : list.size();
        for (int i4 = 0; i4 < length; i4++) {
            strArr[i4] = list.get(i4);
        }
    }

    public static void k(Canvas canvas, Drawable drawable, int i4, int i5, int i6, int i7) {
        g b5 = g.b();
        b5.f50636d = i4 - (i6 / 2);
        b5.f50637e = i5 - (i7 / 2);
        drawable.copyBounds(f50670m);
        Rect rect = f50670m;
        int i10 = rect.left;
        int i11 = rect.top;
        drawable.setBounds(i10, i11, i10 + i6, i6 + i11);
        int save = canvas.save();
        canvas.translate(b5.f50636d, b5.f50637e);
        drawable.draw(canvas);
        canvas.restoreToCount(save);
    }

    public static void l(Canvas canvas, StaticLayout staticLayout, float f4, float f5, TextPaint textPaint, g gVar, float f6) {
        float fontMetrics = textPaint.getFontMetrics(f50672o);
        float width = staticLayout.getWidth();
        float lineCount = staticLayout.getLineCount() * fontMetrics;
        float f7 = 0.0f - f50671n.left;
        float f10 = lineCount + 0.0f;
        Paint.Align textAlign = textPaint.getTextAlign();
        textPaint.setTextAlign(Paint.Align.LEFT);
        if (f6 != 0.0f) {
            float f11 = f7 - (width * 0.5f);
            float f12 = f10 - (lineCount * 0.5f);
            if (gVar.f50636d != 0.5f || gVar.f50637e != 0.5f) {
                c D = D(width, lineCount, f6);
                f4 -= (gVar.f50636d - 0.5f) * D.f50628d;
                f5 -= (gVar.f50637e - 0.5f) * D.f50629e;
                c.c(D);
            }
            canvas.save();
            canvas.translate(f4, f5);
            canvas.rotate(f6);
            canvas.translate(f11, f12);
            staticLayout.draw(canvas);
            canvas.restore();
        } else {
            float f13 = gVar.f50636d;
            if (f13 != 0.0f || gVar.f50637e != 0.0f) {
                f7 -= width * f13;
                f10 -= lineCount * gVar.f50637e;
            }
            canvas.save();
            canvas.translate(f7 + f4, f10 + f5);
            staticLayout.draw(canvas);
            canvas.restore();
        }
        textPaint.setTextAlign(textAlign);
    }

    public static void m(Canvas canvas, String str, float f4, float f5, TextPaint textPaint, c cVar, g gVar, float f6) {
        l(canvas, new StaticLayout(str, 0, str.length(), textPaint, (int) Math.max(Math.ceil(cVar.f50628d), 1.0d), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false), f4, f5, textPaint, gVar, f6);
    }

    public static void n(Canvas canvas, String str, float f4, float f5, Paint paint, g gVar, float f6) {
        float fontMetrics = paint.getFontMetrics(f50672o);
        paint.getTextBounds(str, 0, str.length(), f50671n);
        float f7 = 0.0f - f50671n.left;
        float f10 = (-f50672o.ascent) + 0.0f;
        Paint.Align textAlign = paint.getTextAlign();
        paint.setTextAlign(Paint.Align.LEFT);
        if (f6 != 0.0f) {
            float width = f7 - (f50671n.width() * 0.5f);
            float f11 = f10 - (fontMetrics * 0.5f);
            if (gVar.f50636d != 0.5f || gVar.f50637e != 0.5f) {
                c D = D(f50671n.width(), fontMetrics, f6);
                f4 -= (gVar.f50636d - 0.5f) * D.f50628d;
                f5 -= (gVar.f50637e - 0.5f) * D.f50629e;
                c.c(D);
            }
            canvas.save();
            canvas.translate(f4, f5);
            canvas.rotate(f6);
            canvas.drawText(str, width, f11, paint);
            canvas.restore();
        } else {
            if (gVar.f50636d != 0.0f || gVar.f50637e != 0.0f) {
                f7 -= f50671n.width() * gVar.f50636d;
                f10 -= fontMetrics * gVar.f50637e;
            }
            canvas.drawText(str, f7 + f4, f10 + f5, paint);
        }
        paint.setTextAlign(textAlign);
    }

    public static String o(float f4, int i4, boolean z4) {
        return p(f4, i4, z4, '.');
    }

    public static String p(float f4, int i4, boolean z4, char c5) {
        boolean z5;
        float f5 = f4;
        char[] cArr = new char[35];
        if (f5 == 0.0f) {
            return ProtectedSandApp.s("쑦");
        }
        int i5 = 0;
        boolean z6 = f5 < 1.0f && f5 > -1.0f;
        if (f5 < 0.0f) {
            f5 = -f5;
            z5 = true;
        } else {
            z5 = false;
        }
        int[] iArr = f50668k;
        int length = i4 > iArr.length ? iArr.length - 1 : i4;
        long round = Math.round(f5 * iArr[length]);
        int i6 = 34;
        boolean z7 = false;
        while (true) {
            if (round == 0 && i5 >= length + 1) {
                break;
            }
            int i7 = (int) (round % 10);
            round /= 10;
            int i10 = i6 - 1;
            cArr[i6] = (char) (i7 + 48);
            int i11 = i5 + 1;
            if (i11 == length) {
                i6 -= 2;
                cArr[i10] = ',';
                i5 += 2;
                z7 = true;
            } else {
                if (z4 && round != 0 && i11 > length) {
                    if (z7) {
                        if ((i11 - length) % 4 == 0) {
                            i6 -= 2;
                            cArr[i10] = c5;
                            i5 += 2;
                        }
                    } else if ((i11 - length) % 4 == 3) {
                        i6 -= 2;
                        cArr[i10] = c5;
                        i5 += 2;
                    }
                }
                i5 = i11;
                i6 = i10;
            }
        }
        if (z6) {
            cArr[i6] = '0';
            i5++;
            i6--;
        }
        if (z5) {
            cArr[i6] = '-';
            i5++;
        }
        int i12 = 35 - i5;
        return String.valueOf(cArr, i12, 35 - i12);
    }

    private static com.github.mikephil.charting.formatter.l q() {
        return new com.github.mikephil.charting.formatter.d(1);
    }

    public static int r(float f4) {
        float L = L(f4);
        if (Float.isInfinite(L)) {
            return 0;
        }
        return ((int) Math.ceil(-Math.log10(L))) + 2;
    }

    public static com.github.mikephil.charting.formatter.l s() {
        return f50669l;
    }

    public static float t(Paint paint) {
        return u(paint, f50666i);
    }

    public static float u(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return fontMetrics.descent - fontMetrics.ascent;
    }

    public static float v(Paint paint) {
        return w(paint, f50666i);
    }

    public static float w(Paint paint, Paint.FontMetrics fontMetrics) {
        paint.getFontMetrics(fontMetrics);
        return (fontMetrics.ascent - fontMetrics.top) + fontMetrics.bottom;
    }

    public static int x() {
        return f50660c;
    }

    public static int y() {
        return f50659b;
    }

    public static float z(float f4) {
        while (f4 < 0.0f) {
            f4 += 360.0f;
        }
        return f4 % 360.0f;
    }
}
