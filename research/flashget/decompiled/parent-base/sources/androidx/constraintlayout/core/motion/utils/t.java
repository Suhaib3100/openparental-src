package androidx.constraintlayout.core.motion.utils;

import androidx.compose.material3.z3;

/* compiled from: StopLogicEngine.java */
/* loaded from: classes.dex */
public class t implements s {

    /* renamed from: p, reason: collision with root package name */
    private static final float f22339p = 1.0E-5f;

    /* renamed from: a, reason: collision with root package name */
    private float f22340a;

    /* renamed from: b, reason: collision with root package name */
    private float f22341b;

    /* renamed from: c, reason: collision with root package name */
    private float f22342c;

    /* renamed from: d, reason: collision with root package name */
    private float f22343d;

    /* renamed from: e, reason: collision with root package name */
    private float f22344e;

    /* renamed from: f, reason: collision with root package name */
    private float f22345f;

    /* renamed from: g, reason: collision with root package name */
    private float f22346g;

    /* renamed from: h, reason: collision with root package name */
    private float f22347h;

    /* renamed from: i, reason: collision with root package name */
    private float f22348i;

    /* renamed from: j, reason: collision with root package name */
    private int f22349j;

    /* renamed from: k, reason: collision with root package name */
    private String f22350k;

    /* renamed from: m, reason: collision with root package name */
    private float f22352m;

    /* renamed from: n, reason: collision with root package name */
    private float f22353n;

    /* renamed from: l, reason: collision with root package name */
    private boolean f22351l = false;

    /* renamed from: o, reason: collision with root package name */
    private boolean f22354o = false;

    private float b(float f4) {
        this.f22354o = false;
        float f5 = this.f22343d;
        if (f4 <= f5) {
            float f6 = this.f22340a;
            return ((((this.f22341b - f6) * f4) * f4) / (f5 * 2.0f)) + (f6 * f4);
        }
        int i4 = this.f22349j;
        if (i4 == 1) {
            return this.f22346g;
        }
        float f7 = f4 - f5;
        float f10 = this.f22344e;
        if (f7 < f10) {
            float f11 = this.f22346g;
            float f12 = this.f22341b;
            return ((((this.f22342c - f12) * f7) * f7) / (f10 * 2.0f)) + (f12 * f7) + f11;
        }
        if (i4 == 2) {
            return this.f22347h;
        }
        float f13 = f7 - f10;
        float f14 = this.f22345f;
        if (f13 > f14) {
            this.f22354o = true;
            return this.f22348i;
        }
        float f15 = this.f22347h;
        float f16 = this.f22342c;
        return ((f16 * f13) + f15) - (((f16 * f13) * f13) / (f14 * 2.0f));
    }

    private void d(float f4, float f5, float f6, float f7, float f10) {
        this.f22354o = false;
        if (f4 == 0.0f) {
            f4 = 1.0E-4f;
        }
        this.f22340a = f4;
        float f11 = f4 / f6;
        float f12 = (f11 * f4) / 2.0f;
        if (f4 < 0.0f) {
            float sqrt = (float) Math.sqrt((f5 - ((((-f4) / f6) * f4) / 2.0f)) * f6);
            if (sqrt < f7) {
                this.f22350k = "backward accelerate, decelerate";
                this.f22349j = 2;
                this.f22340a = f4;
                this.f22341b = sqrt;
                this.f22342c = 0.0f;
                float f13 = (sqrt - f4) / f6;
                this.f22343d = f13;
                this.f22344e = sqrt / f6;
                this.f22346g = ((f4 + sqrt) * f13) / 2.0f;
                this.f22347h = f5;
                this.f22348i = f5;
                return;
            }
            this.f22350k = "backward accelerate cruse decelerate";
            this.f22349j = 3;
            this.f22340a = f4;
            this.f22341b = f7;
            this.f22342c = f7;
            float f14 = (f7 - f4) / f6;
            this.f22343d = f14;
            float f15 = f7 / f6;
            this.f22345f = f15;
            float f16 = ((f4 + f7) * f14) / 2.0f;
            float f17 = (f15 * f7) / 2.0f;
            this.f22344e = ((f5 - f16) - f17) / f7;
            this.f22346g = f16;
            this.f22347h = f5 - f17;
            this.f22348i = f5;
            return;
        }
        if (f12 >= f5) {
            this.f22350k = "hard stop";
            this.f22349j = 1;
            this.f22340a = f4;
            this.f22341b = 0.0f;
            this.f22346g = f5;
            this.f22343d = (2.0f * f5) / f4;
            return;
        }
        float f18 = f5 - f12;
        float f19 = f18 / f4;
        if (f19 + f11 < f10) {
            this.f22350k = "cruse decelerate";
            this.f22349j = 2;
            this.f22340a = f4;
            this.f22341b = f4;
            this.f22342c = 0.0f;
            this.f22346g = f18;
            this.f22347h = f5;
            this.f22343d = f19;
            this.f22344e = f11;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f4 * f4) / 2.0f) + (f6 * f5));
        float f20 = (sqrt2 - f4) / f6;
        this.f22343d = f20;
        float f21 = sqrt2 / f6;
        this.f22344e = f21;
        if (sqrt2 < f7) {
            this.f22350k = "accelerate decelerate";
            this.f22349j = 2;
            this.f22340a = f4;
            this.f22341b = sqrt2;
            this.f22342c = 0.0f;
            this.f22343d = f20;
            this.f22344e = f21;
            this.f22346g = ((f4 + sqrt2) * f20) / 2.0f;
            this.f22347h = f5;
            return;
        }
        this.f22350k = "accelerate cruse decelerate";
        this.f22349j = 3;
        this.f22340a = f4;
        this.f22341b = f7;
        this.f22342c = f7;
        float f22 = (f7 - f4) / f6;
        this.f22343d = f22;
        float f23 = f7 / f6;
        this.f22345f = f23;
        float f24 = ((f4 + f7) * f22) / 2.0f;
        float f25 = (f23 * f7) / 2.0f;
        this.f22344e = ((f5 - f24) - f25) / f7;
        this.f22346g = f24;
        this.f22347h = f5 - f25;
        this.f22348i = f5;
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public boolean K() {
        return a() < f22339p && Math.abs(this.f22348i - this.f22353n) < f22339p;
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public float L(float f4) {
        float f5;
        float f6;
        float f7 = this.f22343d;
        if (f4 <= f7) {
            f5 = this.f22340a;
            f6 = this.f22341b;
        } else {
            int i4 = this.f22349j;
            if (i4 == 1) {
                return 0.0f;
            }
            f4 -= f7;
            f7 = this.f22344e;
            if (f4 >= f7) {
                if (i4 == 2) {
                    return this.f22347h;
                }
                float f10 = f4 - f7;
                float f11 = this.f22345f;
                if (f10 >= f11) {
                    return this.f22348i;
                }
                float f12 = this.f22342c;
                return f12 - ((f10 * f12) / f11);
            }
            f5 = this.f22341b;
            f6 = this.f22342c;
        }
        return (((f6 - f5) * f4) / f7) + f5;
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public String M(String str, float f4) {
        StringBuilder a5 = androidx.constraintlayout.core.e.a(android.support.v4.media.c.a(androidx.constraintlayout.core.e.a(str, " ===== "), this.f22350k, "\n"), str);
        a5.append(this.f22351l ? "backwards" : "forward ");
        a5.append(" time = ");
        a5.append(f4);
        a5.append("  stages ");
        String a6 = android.support.v4.media.b.a(a5, this.f22349j, "\n");
        StringBuilder sb = new StringBuilder();
        sb.append(a6);
        sb.append(str);
        sb.append(" dur ");
        sb.append(this.f22343d);
        sb.append(" vel ");
        sb.append(this.f22340a);
        sb.append(" pos ");
        String a7 = androidx.compose.foundation.shape.j.a(sb, this.f22346g, "\n");
        if (this.f22349j > 1) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a7);
            sb2.append(str);
            sb2.append(" dur ");
            sb2.append(this.f22344e);
            sb2.append(" vel ");
            sb2.append(this.f22341b);
            sb2.append(" pos ");
            a7 = androidx.compose.foundation.shape.j.a(sb2, this.f22347h, "\n");
        }
        if (this.f22349j > 2) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(a7);
            sb3.append(str);
            sb3.append(" dur ");
            sb3.append(this.f22345f);
            sb3.append(" vel ");
            sb3.append(this.f22342c);
            sb3.append(" pos ");
            a7 = androidx.compose.foundation.shape.j.a(sb3, this.f22348i, "\n");
        }
        float f5 = this.f22343d;
        if (f4 <= f5) {
            return z3.a(a7, str, "stage 0\n");
        }
        int i4 = this.f22349j;
        if (i4 == 1) {
            return z3.a(a7, str, "end stage 0\n");
        }
        float f6 = f4 - f5;
        float f7 = this.f22344e;
        return f6 < f7 ? z3.a(a7, str, " stage 1\n") : i4 == 2 ? z3.a(a7, str, "end stage 1\n") : f6 - f7 < this.f22345f ? z3.a(a7, str, " stage 2\n") : z3.a(a7, str, " end stage 2\n");
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public float a() {
        return this.f22351l ? -L(this.f22353n) : L(this.f22353n);
    }

    public void c(float f4, float f5, float f6, float f7, float f10, float f11) {
        this.f22354o = false;
        this.f22352m = f4;
        boolean z4 = f4 > f5;
        this.f22351l = z4;
        if (z4) {
            d(-f6, f4 - f5, f10, f11, f7);
        } else {
            d(f6, f5 - f4, f10, f11, f7);
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.s
    public float getInterpolation(float f4) {
        float b5 = b(f4);
        this.f22353n = f4;
        return this.f22351l ? this.f22352m - b5 : this.f22352m + b5;
    }
}
