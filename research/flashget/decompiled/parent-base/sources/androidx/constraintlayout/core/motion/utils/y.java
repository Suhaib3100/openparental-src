package androidx.constraintlayout.core.motion.utils;

/* compiled from: VelocityMatrix.java */
/* loaded from: classes.dex */
public class y {

    /* renamed from: g, reason: collision with root package name */
    private static String f22590g = "VelocityMatrix";

    /* renamed from: a, reason: collision with root package name */
    float f22591a;

    /* renamed from: b, reason: collision with root package name */
    float f22592b;

    /* renamed from: c, reason: collision with root package name */
    float f22593c;

    /* renamed from: d, reason: collision with root package name */
    float f22594d;

    /* renamed from: e, reason: collision with root package name */
    float f22595e;

    /* renamed from: f, reason: collision with root package name */
    float f22596f;

    public void a(float f4, float f5, int i4, int i5, float[] fArr) {
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f10 = (f5 - 0.5f) * 2.0f;
        float f11 = f6 + this.f22593c;
        float f12 = f7 + this.f22594d;
        float f13 = (this.f22591a * (f4 - 0.5f) * 2.0f) + f11;
        float f14 = (this.f22592b * f10) + f12;
        float radians = (float) Math.toRadians(this.f22596f);
        float radians2 = (float) Math.toRadians(this.f22595e);
        double d5 = radians;
        double d6 = i5 * f10;
        float sin = (((float) ((Math.sin(d5) * ((-i4) * r7)) - (Math.cos(d5) * d6))) * radians2) + f13;
        float cos = (radians2 * ((float) ((Math.cos(d5) * (i4 * r7)) - (Math.sin(d5) * d6)))) + f14;
        fArr[0] = sin;
        fArr[1] = cos;
    }

    public void b() {
        this.f22595e = 0.0f;
        this.f22594d = 0.0f;
        this.f22593c = 0.0f;
        this.f22592b = 0.0f;
        this.f22591a = 0.0f;
    }

    public void c(i iVar, float f4) {
        if (iVar != null) {
            this.f22595e = iVar.c(f4);
        }
    }

    public void d(p pVar, float f4) {
        if (pVar != null) {
            this.f22595e = pVar.c(f4);
            this.f22596f = pVar.a(f4);
        }
    }

    public void e(i iVar, i iVar2, float f4) {
        if (iVar != null) {
            this.f22591a = iVar.c(f4);
        }
        if (iVar2 != null) {
            this.f22592b = iVar2.c(f4);
        }
    }

    public void f(p pVar, p pVar2, float f4) {
        if (pVar != null) {
            this.f22591a = pVar.c(f4);
        }
        if (pVar2 != null) {
            this.f22592b = pVar2.c(f4);
        }
    }

    public void g(i iVar, i iVar2, float f4) {
        if (iVar != null) {
            this.f22593c = iVar.c(f4);
        }
        if (iVar2 != null) {
            this.f22594d = iVar2.c(f4);
        }
    }

    public void h(p pVar, p pVar2, float f4) {
        if (pVar != null) {
            this.f22593c = pVar.c(f4);
        }
        if (pVar2 != null) {
            this.f22594d = pVar2.c(f4);
        }
    }
}
