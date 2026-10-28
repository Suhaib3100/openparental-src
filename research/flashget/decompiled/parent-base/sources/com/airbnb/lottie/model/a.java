package com.airbnb.lottie.model;

import android.annotation.SuppressLint;
import android.graphics.PointF;
import androidx.annotation.c1;
import androidx.annotation.o0;
import com.flashget.parentalcontrol.ProtectedSandApp;

/* compiled from: CubicCurveData.java */
@c1({c1.a.LIBRARY})
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private final PointF f38949a;

    /* renamed from: b, reason: collision with root package name */
    private final PointF f38950b;

    /* renamed from: c, reason: collision with root package name */
    private final PointF f38951c;

    public a() {
        this.f38949a = new PointF();
        this.f38950b = new PointF();
        this.f38951c = new PointF();
    }

    public PointF a() {
        return this.f38949a;
    }

    public PointF b() {
        return this.f38950b;
    }

    public PointF c() {
        return this.f38951c;
    }

    public void d(float f4, float f5) {
        this.f38949a.set(f4, f5);
    }

    public void e(float f4, float f5) {
        this.f38950b.set(f4, f5);
    }

    public void f(a aVar) {
        PointF pointF = aVar.f38951c;
        g(pointF.x, pointF.y);
        PointF pointF2 = aVar.f38949a;
        d(pointF2.x, pointF2.y);
        PointF pointF3 = aVar.f38950b;
        e(pointF3.x, pointF3.y);
    }

    public void g(float f4, float f5) {
        this.f38951c.set(f4, f5);
    }

    @o0
    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format(ProtectedSandApp.s("Ģ"), Float.valueOf(this.f38951c.x), Float.valueOf(this.f38951c.y), Float.valueOf(this.f38949a.x), Float.valueOf(this.f38949a.y), Float.valueOf(this.f38950b.x), Float.valueOf(this.f38950b.y));
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f38949a = pointF;
        this.f38950b = pointF2;
        this.f38951c = pointF3;
    }
}
