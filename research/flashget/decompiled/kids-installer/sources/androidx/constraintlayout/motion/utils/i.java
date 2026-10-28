package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.motion.widget.k;
import androidx.constraintlayout.motion.widget.x;

/* compiled from: VelocityMatrix.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: g, reason: collision with root package name */
    private static String f1683g = "VelocityMatrix";

    /* renamed from: a, reason: collision with root package name */
    float f1684a;

    /* renamed from: b, reason: collision with root package name */
    float f1685b;

    /* renamed from: c, reason: collision with root package name */
    float f1686c;

    /* renamed from: d, reason: collision with root package name */
    float f1687d;

    /* renamed from: e, reason: collision with root package name */
    float f1688e;

    /* renamed from: f, reason: collision with root package name */
    float f1689f;

    public void a(float f6, float f7, int i5, int i6, float[] fArr) {
        float f8 = fArr[0];
        float f9 = fArr[1];
        float f10 = (f7 - 0.5f) * 2.0f;
        float f11 = f8 + this.f1686c;
        float f12 = f9 + this.f1687d;
        float f13 = (this.f1684a * (f6 - 0.5f) * 2.0f) + f11;
        float f14 = (this.f1685b * f10) + f12;
        float radians = (float) Math.toRadians(this.f1689f);
        float radians2 = (float) Math.toRadians(this.f1688e);
        double d6 = radians;
        double d7 = i6 * f10;
        float sin = (((float) ((Math.sin(d6) * ((-i5) * r7)) - (Math.cos(d6) * d7))) * radians2) + f13;
        float cos = (radians2 * ((float) ((Math.cos(d6) * (i5 * r7)) - (Math.sin(d6) * d7)))) + f14;
        fArr[0] = sin;
        fArr[1] = cos;
    }

    public void b() {
        this.f1688e = 0.0f;
        this.f1687d = 0.0f;
        this.f1686c = 0.0f;
        this.f1685b = 0.0f;
        this.f1684a = 0.0f;
    }

    public void c(k kVar, float f6) {
        if (kVar != null) {
            this.f1688e = kVar.c(f6);
        }
    }

    public void d(x xVar, float f6) {
        if (xVar != null) {
            this.f1688e = xVar.c(f6);
            this.f1689f = xVar.a(f6);
        }
    }

    public void e(k kVar, k kVar2, float f6) {
        if (kVar == null && kVar2 == null) {
            return;
        }
        if (kVar == null) {
            this.f1684a = kVar.c(f6);
        }
        if (kVar2 == null) {
            this.f1685b = kVar2.c(f6);
        }
    }

    public void f(x xVar, x xVar2, float f6) {
        if (xVar != null) {
            this.f1684a = xVar.c(f6);
        }
        if (xVar2 != null) {
            this.f1685b = xVar2.c(f6);
        }
    }

    public void g(k kVar, k kVar2, float f6) {
        if (kVar != null) {
            this.f1686c = kVar.c(f6);
        }
        if (kVar2 != null) {
            this.f1687d = kVar2.c(f6);
        }
    }

    public void h(x xVar, x xVar2, float f6) {
        if (xVar != null) {
            this.f1686c = xVar.c(f6);
        }
        if (xVar2 != null) {
            this.f1687d = xVar2.c(f6);
        }
    }
}
