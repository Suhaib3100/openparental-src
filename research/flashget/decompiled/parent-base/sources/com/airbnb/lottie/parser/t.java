package com.airbnb.lottie.parser;

import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import androidx.annotation.q0;
import androidx.collection.c3;
import com.airbnb.lottie.parser.moshi.c;
import com.flashget.parentalcontrol.ProtectedSandApp;
import java.io.IOException;
import java.lang.ref.WeakReference;

/* compiled from: KeyframeParser.java */
/* loaded from: classes3.dex */
class t {

    /* renamed from: a, reason: collision with root package name */
    private static final float f39318a = 100.0f;

    /* renamed from: c, reason: collision with root package name */
    private static c3<WeakReference<Interpolator>> f39320c;

    /* renamed from: b, reason: collision with root package name */
    private static final Interpolator f39319b = new LinearInterpolator();

    /* renamed from: d, reason: collision with root package name */
    static c.a f39321d = c.a.a(ProtectedSandApp.s("ʟ"), ProtectedSandApp.s("ʠ"), ProtectedSandApp.s("ʡ"), ProtectedSandApp.s("ʢ"), ProtectedSandApp.s("ʣ"), ProtectedSandApp.s("ʤ"), ProtectedSandApp.s("ʝ"), ProtectedSandApp.s("ʞ"));

    /* renamed from: e, reason: collision with root package name */
    static c.a f39322e = c.a.a(ProtectedSandApp.s("ʥ"), ProtectedSandApp.s("ʦ"));

    t() {
    }

    @q0
    private static WeakReference<Interpolator> a(int i4) {
        WeakReference<Interpolator> i5;
        synchronized (t.class) {
            i5 = g().i(i4);
        }
        return i5;
    }

    private static Interpolator b(PointF pointF, PointF pointF2) {
        pointF.x = com.airbnb.lottie.utils.i.c(pointF.x, -1.0f, 1.0f);
        pointF.y = com.airbnb.lottie.utils.i.c(pointF.y, -100.0f, 100.0f);
        pointF2.x = com.airbnb.lottie.utils.i.c(pointF2.x, -1.0f, 1.0f);
        float c5 = com.airbnb.lottie.utils.i.c(pointF2.y, -100.0f, 100.0f);
        pointF2.y = c5;
        int i4 = com.airbnb.lottie.utils.j.i(pointF.x, pointF.y, pointF2.x, c5);
        WeakReference<Interpolator> a5 = a(i4);
        Interpolator interpolator = a5 != null ? a5.get() : null;
        if (a5 == null || interpolator == null) {
            try {
                interpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
            } catch (IllegalArgumentException e4) {
                interpolator = ProtectedSandApp.s("ʧ").equals(e4.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
            }
            try {
                h(i4, new WeakReference(interpolator));
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return interpolator;
    }

    static <T> com.airbnb.lottie.value.a<T> c(com.airbnb.lottie.parser.moshi.c cVar, com.airbnb.lottie.k kVar, float f4, n0<T> n0Var, boolean z4, boolean z5) throws IOException {
        return (z4 && z5) ? e(kVar, cVar, f4, n0Var) : z4 ? d(kVar, cVar, f4, n0Var) : f(cVar, f4, n0Var);
    }

    private static <T> com.airbnb.lottie.value.a<T> d(com.airbnb.lottie.k kVar, com.airbnb.lottie.parser.moshi.c cVar, float f4, n0<T> n0Var) throws IOException {
        Interpolator b5;
        T t4;
        cVar.c();
        PointF pointF = null;
        T t5 = null;
        T t6 = null;
        PointF pointF2 = null;
        PointF pointF3 = null;
        float f5 = 0.0f;
        boolean z4 = false;
        PointF pointF4 = null;
        while (cVar.f()) {
            switch (cVar.q(f39321d)) {
                case 0:
                    f5 = (float) cVar.h();
                    break;
                case 1:
                    t6 = n0Var.a(cVar, f4);
                    break;
                case 2:
                    t5 = n0Var.a(cVar, f4);
                    break;
                case 3:
                    pointF = s.e(cVar, 1.0f);
                    break;
                case 4:
                    pointF4 = s.e(cVar, 1.0f);
                    break;
                case 5:
                    if (cVar.i() != 1) {
                        z4 = false;
                        break;
                    } else {
                        z4 = true;
                        break;
                    }
                case 6:
                    pointF2 = s.e(cVar, f4);
                    break;
                case 7:
                    pointF3 = s.e(cVar, f4);
                    break;
                default:
                    cVar.t();
                    break;
            }
        }
        cVar.e();
        if (z4) {
            b5 = f39319b;
            t4 = t6;
        } else {
            b5 = (pointF == null || pointF4 == null) ? f39319b : b(pointF, pointF4);
            t4 = t5;
        }
        com.airbnb.lottie.value.a<T> aVar = new com.airbnb.lottie.value.a<>(kVar, t6, t4, b5, f5, null);
        aVar.f39418o = pointF2;
        aVar.f39419p = pointF3;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a<T> e(com.airbnb.lottie.k kVar, com.airbnb.lottie.parser.moshi.c cVar, float f4, n0<T> n0Var) throws IOException {
        Interpolator interpolator;
        Interpolator b5;
        Interpolator b6;
        T t4;
        PointF pointF;
        com.airbnb.lottie.value.a<T> aVar;
        PointF pointF2;
        float f5;
        PointF pointF3;
        cVar.c();
        PointF pointF4 = null;
        boolean z4 = false;
        PointF pointF5 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        T t5 = null;
        PointF pointF8 = null;
        PointF pointF9 = null;
        PointF pointF10 = null;
        float f6 = 0.0f;
        PointF pointF11 = null;
        T t6 = null;
        while (cVar.f()) {
            switch (cVar.q(f39321d)) {
                case 0:
                    pointF2 = pointF4;
                    f6 = (float) cVar.h();
                    pointF4 = pointF2;
                    break;
                case 1:
                    pointF2 = pointF4;
                    t5 = n0Var.a(cVar, f4);
                    pointF4 = pointF2;
                    break;
                case 2:
                    pointF2 = pointF4;
                    t6 = n0Var.a(cVar, f4);
                    pointF4 = pointF2;
                    break;
                case 3:
                    pointF2 = pointF4;
                    f5 = f6;
                    PointF pointF12 = pointF11;
                    if (cVar.n() == c.b.BEGIN_OBJECT) {
                        cVar.c();
                        float f7 = 0.0f;
                        float f10 = 0.0f;
                        float f11 = 0.0f;
                        float f12 = 0.0f;
                        while (cVar.f()) {
                            int q4 = cVar.q(f39322e);
                            if (q4 == 0) {
                                c.b n4 = cVar.n();
                                c.b bVar = c.b.NUMBER;
                                if (n4 == bVar) {
                                    f11 = (float) cVar.h();
                                    f7 = f11;
                                } else {
                                    cVar.b();
                                    f7 = (float) cVar.h();
                                    f11 = cVar.n() == bVar ? (float) cVar.h() : f7;
                                    cVar.d();
                                }
                            } else if (q4 != 1) {
                                cVar.t();
                            } else {
                                c.b n5 = cVar.n();
                                c.b bVar2 = c.b.NUMBER;
                                if (n5 == bVar2) {
                                    f12 = (float) cVar.h();
                                    f10 = f12;
                                } else {
                                    cVar.b();
                                    f10 = (float) cVar.h();
                                    f12 = cVar.n() == bVar2 ? (float) cVar.h() : f10;
                                    cVar.d();
                                }
                            }
                        }
                        PointF pointF13 = new PointF(f7, f10);
                        PointF pointF14 = new PointF(f11, f12);
                        cVar.e();
                        pointF8 = pointF14;
                        pointF7 = pointF13;
                        pointF11 = pointF12;
                        f6 = f5;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF5 = s.e(cVar, f4);
                        f6 = f5;
                        pointF11 = pointF12;
                        pointF4 = pointF2;
                    }
                case 4:
                    if (cVar.n() == c.b.BEGIN_OBJECT) {
                        cVar.c();
                        float f13 = 0.0f;
                        float f14 = 0.0f;
                        float f15 = 0.0f;
                        float f16 = 0.0f;
                        while (cVar.f()) {
                            PointF pointF15 = pointF11;
                            int q5 = cVar.q(f39322e);
                            if (q5 != 0) {
                                pointF3 = pointF4;
                                if (q5 != 1) {
                                    cVar.t();
                                } else {
                                    c.b n6 = cVar.n();
                                    c.b bVar3 = c.b.NUMBER;
                                    if (n6 == bVar3) {
                                        f16 = (float) cVar.h();
                                        f6 = f6;
                                        f14 = f16;
                                    } else {
                                        float f17 = f6;
                                        cVar.b();
                                        float h4 = (float) cVar.h();
                                        float h5 = cVar.n() == bVar3 ? (float) cVar.h() : h4;
                                        cVar.d();
                                        f6 = f17;
                                        pointF11 = pointF15;
                                        pointF4 = pointF3;
                                        f16 = h5;
                                        f14 = h4;
                                    }
                                }
                            } else {
                                pointF3 = pointF4;
                                float f18 = f6;
                                c.b n7 = cVar.n();
                                c.b bVar4 = c.b.NUMBER;
                                if (n7 == bVar4) {
                                    f15 = (float) cVar.h();
                                    f6 = f18;
                                    f13 = f15;
                                } else {
                                    cVar.b();
                                    f13 = (float) cVar.h();
                                    f15 = cVar.n() == bVar4 ? (float) cVar.h() : f13;
                                    cVar.d();
                                    f6 = f18;
                                }
                            }
                            pointF11 = pointF15;
                            pointF4 = pointF3;
                        }
                        pointF2 = pointF4;
                        f5 = f6;
                        PointF pointF16 = new PointF(f13, f14);
                        PointF pointF17 = new PointF(f15, f16);
                        cVar.e();
                        pointF10 = pointF17;
                        pointF9 = pointF16;
                        f6 = f5;
                        pointF4 = pointF2;
                        break;
                    } else {
                        pointF2 = pointF4;
                        pointF6 = s.e(cVar, f4);
                        pointF4 = pointF2;
                    }
                case 5:
                    if (cVar.i() != 1) {
                        z4 = false;
                        break;
                    } else {
                        z4 = true;
                        break;
                    }
                case 6:
                    pointF11 = s.e(cVar, f4);
                    break;
                case 7:
                    pointF4 = s.e(cVar, f4);
                    break;
                default:
                    cVar.t();
                    break;
            }
        }
        PointF pointF18 = pointF4;
        float f19 = f6;
        PointF pointF19 = pointF11;
        cVar.e();
        if (z4) {
            interpolator = f39319b;
            t4 = t5;
        } else {
            if (pointF5 != null && pointF6 != null) {
                interpolator = b(pointF5, pointF6);
            } else {
                if (pointF7 != null && pointF8 != null && pointF9 != null && pointF10 != null) {
                    b5 = b(pointF7, pointF9);
                    b6 = b(pointF8, pointF10);
                    t4 = t6;
                    interpolator = null;
                    if (b5 != null || b6 == null) {
                        pointF = pointF19;
                        aVar = new com.airbnb.lottie.value.a<>(kVar, t5, t4, interpolator, f19, null);
                    } else {
                        pointF = pointF19;
                        aVar = new com.airbnb.lottie.value.a<>(kVar, t5, t4, b5, b6, f19, null);
                    }
                    aVar.f39418o = pointF;
                    aVar.f39419p = pointF18;
                    return aVar;
                }
                interpolator = f39319b;
            }
            t4 = t6;
        }
        b5 = null;
        b6 = null;
        if (b5 != null) {
        }
        pointF = pointF19;
        aVar = new com.airbnb.lottie.value.a<>(kVar, t5, t4, interpolator, f19, null);
        aVar.f39418o = pointF;
        aVar.f39419p = pointF18;
        return aVar;
    }

    private static <T> com.airbnb.lottie.value.a<T> f(com.airbnb.lottie.parser.moshi.c cVar, float f4, n0<T> n0Var) throws IOException {
        return new com.airbnb.lottie.value.a<>(n0Var.a(cVar, f4));
    }

    private static c3<WeakReference<Interpolator>> g() {
        if (f39320c == null) {
            f39320c = new c3<>();
        }
        return f39320c;
    }

    private static void h(int i4, WeakReference<Interpolator> weakReference) {
        synchronized (t.class) {
            f39320c.q(i4, weakReference);
        }
    }
}
