package com.airbnb.lottie.utils;

import android.graphics.Path;
import android.graphics.PointF;
import androidx.annotation.x;
import com.airbnb.lottie.model.content.n;
import java.util.List;

/* compiled from: MiscUtils.java */
/* loaded from: classes3.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private static final PointF f39387a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static double b(double d5, double d6, double d7) {
        return Math.max(d6, Math.min(d7, d5));
    }

    public static float c(float f4, float f5, float f6) {
        return Math.max(f5, Math.min(f6, f4));
    }

    public static int d(int i4, int i5, int i6) {
        return Math.max(i5, Math.min(i6, i4));
    }

    public static boolean e(float f4, float f5, float f6) {
        return f4 >= f5 && f4 <= f6;
    }

    private static int f(int i4, int i5) {
        int i6 = i4 / i5;
        return (((i4 ^ i5) >= 0) || i4 % i5 == 0) ? i6 : i6 - 1;
    }

    static int g(float f4, float f5) {
        return h((int) f4, (int) f5);
    }

    private static int h(int i4, int i5) {
        return i4 - (i5 * f(i4, i5));
    }

    public static void i(n nVar, Path path) {
        path.reset();
        PointF b5 = nVar.b();
        path.moveTo(b5.x, b5.y);
        f39387a.set(b5.x, b5.y);
        for (int i4 = 0; i4 < nVar.a().size(); i4++) {
            com.airbnb.lottie.model.a aVar = nVar.a().get(i4);
            PointF a5 = aVar.a();
            PointF b6 = aVar.b();
            PointF c5 = aVar.c();
            PointF pointF = f39387a;
            if (a5.equals(pointF) && b6.equals(c5)) {
                path.lineTo(c5.x, c5.y);
            } else {
                path.cubicTo(a5.x, a5.y, b6.x, b6.y, c5.x, c5.y);
            }
            pointF.set(c5.x, c5.y);
        }
        if (nVar.d()) {
            path.close();
        }
    }

    public static double j(double d5, double d6, @x(from = 0.0d, to = 1.0d) double d7) {
        return androidx.constraintlayout.core.motion.utils.a.a(d6, d5, d7, d5);
    }

    public static float k(float f4, float f5, @x(from = 0.0d, to = 1.0d) float f6) {
        return androidx.appcompat.graphics.drawable.d.a(f5, f4, f6, f4);
    }

    public static int l(int i4, int i5, @x(from = 0.0d, to = 1.0d) float f4) {
        return (int) ((f4 * (i5 - i4)) + i4);
    }

    public static void m(com.airbnb.lottie.model.e eVar, int i4, List<com.airbnb.lottie.model.e> list, com.airbnb.lottie.model.e eVar2, com.airbnb.lottie.animation.content.k kVar) {
        if (eVar.c(kVar.getName(), i4)) {
            list.add(eVar2.a(kVar.getName()).j(kVar));
        }
    }
}
