package com.github.pengrad.mapscaleview;

import com.flashget.parentalcontrol.ProtectedSandApp;
import org.apache.log4j.Logger;

/* compiled from: MapScaleModel.java */
/* loaded from: classes5.dex */
class c {

    /* renamed from: g, reason: collision with root package name */
    private static final double f50922g = 4.0075016686E7d;

    /* renamed from: h, reason: collision with root package name */
    private static final double f50923h = 1.31479713537E8d;

    /* renamed from: j, reason: collision with root package name */
    private static final int f50925j = 5280;

    /* renamed from: a, reason: collision with root package name */
    private final float f50928a;

    /* renamed from: b, reason: collision with root package name */
    private int f50929b;

    /* renamed from: c, reason: collision with root package name */
    private float f50930c = -1.0f;

    /* renamed from: d, reason: collision with root package name */
    private double f50931d = -100.0d;

    /* renamed from: e, reason: collision with root package name */
    private double f50932e = 156543.0339296875d;

    /* renamed from: f, reason: collision with root package name */
    private double f50933f = 513592.63100390625d;

    /* renamed from: i, reason: collision with root package name */
    private static final Logger f50924i = Logger.getLogger(ProtectedSandApp.s("쒜"));

    /* renamed from: k, reason: collision with root package name */
    private static final float[] f50926k = {0.2f, 0.5f, 1.0f, 2.0f, 5.0f, 10.0f, 20.0f, 50.0f, 100.0f, 200.0f, 500.0f, 1000.0f, 2000.0f, 5000.0f, 10000.0f, 20000.0f, 50000.0f, 100000.0f, 200000.0f, 500000.0f, 1000000.0f, 2000000.0f};

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f50927l = {1.0f, 2.0f, 5.0f, 10.0f, 20.0f, 50.0f, 100.0f, 200.0f, 500.0f, 1000.0f, 2000.0f, 5280.0f, 10560.0f, 26400.0f, 52800.0f, 105600.0f, 264000.0f, 528000.0f, 1056000.0f, 2640000.0f, 5280000.0f, 1.056E7f};

    c(float f4) {
        this.f50928a = f4;
    }

    private String c(float f4, boolean z4) {
        if (!z4) {
            if (f4 < 5280.0f) {
                return android.support.v4.media.b.a(new StringBuilder(), (int) f4, ProtectedSandApp.s("쒠"));
            }
            return (((int) f4) / f50925j) + ProtectedSandApp.s("쒡");
        }
        if (f4 < 1.0f) {
            return android.support.v4.media.b.a(new StringBuilder(), (int) (f4 * 100.0f), ProtectedSandApp.s("쒝"));
        }
        if (f4 < 1000.0f) {
            return android.support.v4.media.b.a(new StringBuilder(), (int) f4, ProtectedSandApp.s("쒞"));
        }
        return (((int) f4) / 1000) + ProtectedSandApp.s("쒟");
    }

    void a(float f4, double d5) {
        this.f50930c = f4;
        this.f50931d = d5;
    }

    void b(int i4) {
        double d5 = i4;
        this.f50932e = f50922g / d5;
        this.f50933f = f50923h / d5;
    }

    e d(boolean z4) {
        float f4 = this.f50930c;
        double d5 = this.f50931d;
        float f5 = 0.0f;
        if (f4 < 0.0f || Math.abs(d5) > 90.0d) {
            return null;
        }
        double d6 = z4 ? this.f50932e : this.f50933f;
        float[] fArr = z4 ? f50926k : f50927l;
        double cos = (Math.cos((3.141592653589793d * d5) / 180.0d) * (d6 / this.f50928a)) / Math.pow(2.0d, f4);
        int length = fArr.length;
        double d7 = this.f50929b + 1;
        while (d7 > this.f50929b && length > 0) {
            length--;
            f5 = fArr[length];
            d7 = Math.abs(f5 / cos);
        }
        this.f50930c = f4;
        this.f50931d = d5;
        return new e(c(f5, z4), (float) d7);
    }

    boolean e(int i4) {
        if (this.f50929b == i4) {
            return false;
        }
        this.f50929b = i4;
        return true;
    }
}
