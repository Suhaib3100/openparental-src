package com.google.android.material.bottomappbar;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x;
import androidx.appcompat.graphics.drawable.d;
import com.flashget.kidsdownloader.ProtectedSandApp;
import com.google.android.material.shape.g;
import com.google.android.material.shape.q;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes3.dex */
public class a extends g implements Cloneable {

    /* renamed from: u, reason: collision with root package name */
    private static final int f13017u = 90;

    /* renamed from: v, reason: collision with root package name */
    private static final int f13018v = 180;

    /* renamed from: w, reason: collision with root package name */
    private static final int f13019w = 270;

    /* renamed from: x, reason: collision with root package name */
    private static final int f13020x = 180;

    /* renamed from: y, reason: collision with root package name */
    private static final float f13021y = 1.75f;

    /* renamed from: o, reason: collision with root package name */
    private float f13022o;

    /* renamed from: p, reason: collision with root package name */
    private float f13023p;

    /* renamed from: q, reason: collision with root package name */
    private float f13024q;

    /* renamed from: r, reason: collision with root package name */
    private float f13025r;

    /* renamed from: s, reason: collision with root package name */
    private float f13026s;

    /* renamed from: t, reason: collision with root package name */
    private float f13027t = -1.0f;

    public a(float f6, float f7, float f8) {
        this.f13023p = f6;
        this.f13022o = f7;
        l(f8);
        this.f13026s = 0.0f;
    }

    @Override // com.google.android.material.shape.g
    public void b(float f6, float f7, float f8, @o0 q qVar) {
        float f9;
        float f10;
        float f11 = this.f13024q;
        if (f11 == 0.0f) {
            qVar.n(f6, 0.0f);
            return;
        }
        float f12 = ((this.f13023p * 2.0f) + f11) / 2.0f;
        float f13 = f8 * this.f13022o;
        float f14 = f7 + this.f13026s;
        float a6 = d.a(1.0f, f8, f12, this.f13025r * f8);
        if (a6 / f12 >= 1.0f) {
            qVar.n(f6, 0.0f);
            return;
        }
        float f15 = this.f13027t;
        float f16 = f15 * f8;
        boolean z5 = f15 == -1.0f || Math.abs((f15 * 2.0f) - f11) < 0.1f;
        if (z5) {
            f9 = a6;
            f10 = 0.0f;
        } else {
            f10 = f13021y;
            f9 = 0.0f;
        }
        float f17 = f12 + f13;
        float f18 = f9 + f13;
        float sqrt = (float) Math.sqrt((f17 * f17) - (f18 * f18));
        float f19 = f14 - sqrt;
        float f20 = f14 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f18));
        float f21 = (90.0f - degrees) + f10;
        qVar.n(f19, 0.0f);
        float f22 = f13 * 2.0f;
        qVar.a(f19 - f13, 0.0f, f19 + f13, f22, 270.0f, degrees);
        if (z5) {
            qVar.a(f14 - f12, (-f12) - f9, f14 + f12, f12 - f9, 180.0f - f21, (f21 * 2.0f) - 180.0f);
        } else {
            float f23 = this.f13023p;
            float f24 = f16 * 2.0f;
            float f25 = f14 - f12;
            qVar.a(f25, -(f16 + f23), f25 + f23 + f24, f23 + f16, 180.0f - f21, ((f21 * 2.0f) - 180.0f) / 2.0f);
            float f26 = f14 + f12;
            float f27 = this.f13023p;
            qVar.n(f26 - ((f27 / 2.0f) + f16), f27 + f16);
            float f28 = this.f13023p;
            qVar.a(f26 - (f24 + f28), -(f16 + f28), f26, f28 + f16, 90.0f, f21 - 90.0f);
        }
        qVar.a(f20 - f13, 0.0f, f20 + f13, f22, 270.0f - degrees, degrees);
        qVar.n(f6, 0.0f);
    }

    float d() {
        return this.f13025r;
    }

    public float e() {
        return this.f13027t;
    }

    float f() {
        return this.f13023p;
    }

    float i() {
        return this.f13022o;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public float j() {
        return this.f13024q;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public float k() {
        return this.f13026s;
    }

    void l(@x(from = 0.0d) float f6) {
        if (f6 < 0.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("⚎"));
        }
        this.f13025r = f6;
    }

    public void m(float f6) {
        this.f13027t = f6;
    }

    void n(float f6) {
        this.f13023p = f6;
    }

    void o(float f6) {
        this.f13022o = f6;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void p(float f6) {
        this.f13024q = f6;
    }

    void q(float f6) {
        this.f13026s = f6;
    }
}
