package com.google.android.material.bottomappbar;

import androidx.annotation.c1;
import androidx.annotation.o0;
import androidx.annotation.x;
import androidx.appcompat.graphics.drawable.d;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.google.android.material.shape.g;
import com.google.android.material.shape.q;

/* compiled from: BottomAppBarTopEdgeTreatment.java */
/* loaded from: classes6.dex */
public class a extends g implements Cloneable {

    /* renamed from: h, reason: collision with root package name */
    private static final int f52737h = 90;

    /* renamed from: i, reason: collision with root package name */
    private static final int f52738i = 180;

    /* renamed from: j, reason: collision with root package name */
    private static final int f52739j = 270;

    /* renamed from: k, reason: collision with root package name */
    private static final int f52740k = 180;

    /* renamed from: l, reason: collision with root package name */
    private static final float f52741l = 1.75f;

    /* renamed from: b, reason: collision with root package name */
    private float f52742b;

    /* renamed from: c, reason: collision with root package name */
    private float f52743c;

    /* renamed from: d, reason: collision with root package name */
    private float f52744d;

    /* renamed from: e, reason: collision with root package name */
    private float f52745e;

    /* renamed from: f, reason: collision with root package name */
    private float f52746f;

    /* renamed from: g, reason: collision with root package name */
    private float f52747g = -1.0f;

    public a(float f4, float f5, float f6) {
        this.f52743c = f4;
        this.f52742b = f5;
        m(f6);
        this.f52746f = 0.0f;
    }

    @Override // com.google.android.material.shape.g
    public void c(float f4, float f5, float f6, @o0 q qVar) {
        float f7;
        float f10;
        float f11 = this.f52744d;
        if (f11 == 0.0f) {
            qVar.n(f4, 0.0f);
            return;
        }
        float f12 = ((this.f52743c * 2.0f) + f11) / 2.0f;
        float f13 = f6 * this.f52742b;
        float f14 = f5 + this.f52746f;
        float a5 = d.a(1.0f, f6, f12, this.f52745e * f6);
        if (a5 / f12 >= 1.0f) {
            qVar.n(f4, 0.0f);
            return;
        }
        float f15 = this.f52747g;
        float f16 = f15 * f6;
        boolean z4 = f15 == -1.0f || Math.abs((f15 * 2.0f) - f11) < 0.1f;
        if (z4) {
            f7 = a5;
            f10 = 0.0f;
        } else {
            f10 = f52741l;
            f7 = 0.0f;
        }
        float f17 = f12 + f13;
        float f18 = f7 + f13;
        float sqrt = (float) Math.sqrt((f17 * f17) - (f18 * f18));
        float f19 = f14 - sqrt;
        float f20 = f14 + sqrt;
        float degrees = (float) Math.toDegrees(Math.atan(sqrt / f18));
        float f21 = (90.0f - degrees) + f10;
        qVar.n(f19, 0.0f);
        float f22 = f13 * 2.0f;
        qVar.a(f19 - f13, 0.0f, f19 + f13, f22, 270.0f, degrees);
        if (z4) {
            qVar.a(f14 - f12, (-f12) - f7, f14 + f12, f12 - f7, 180.0f - f21, (f21 * 2.0f) - 180.0f);
        } else {
            float f23 = this.f52743c;
            float f24 = f16 * 2.0f;
            float f25 = f14 - f12;
            qVar.a(f25, -(f16 + f23), f25 + f23 + f24, f23 + f16, 180.0f - f21, ((f21 * 2.0f) - 180.0f) / 2.0f);
            float f26 = f14 + f12;
            float f27 = this.f52743c;
            qVar.n(f26 - ((f27 / 2.0f) + f16), f27 + f16);
            float f28 = this.f52743c;
            qVar.a(f26 - (f24 + f28), -(f16 + f28), f26, f28 + f16, 90.0f, f21 - 90.0f);
        }
        qVar.a(f20 - f13, 0.0f, f20 + f13, f22, 270.0f - degrees, degrees);
        qVar.n(f4, 0.0f);
    }

    float e() {
        return this.f52745e;
    }

    public float f() {
        return this.f52747g;
    }

    float g() {
        return this.f52743c;
    }

    float i() {
        return this.f52742b;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public float k() {
        return this.f52744d;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public float l() {
        return this.f52746f;
    }

    void m(@x(from = 0.0d) float f4) {
        if (f4 < 0.0f) {
            throw new IllegalArgumentException(ProtectedSandApp.s("\uf156"));
        }
        this.f52745e = f4;
    }

    public void n(float f4) {
        this.f52747g = f4;
    }

    void o(float f4) {
        this.f52743c = f4;
    }

    void p(float f4) {
        this.f52742b = f4;
    }

    @c1({c1.a.LIBRARY_GROUP})
    public void q(float f4) {
        this.f52744d = f4;
    }

    void r(float f4) {
        this.f52746f = f4;
    }
}
