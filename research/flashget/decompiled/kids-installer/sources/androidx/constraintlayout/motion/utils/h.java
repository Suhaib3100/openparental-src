package androidx.constraintlayout.motion.utils;

import androidx.constraintlayout.motion.widget.t;

/* compiled from: StopLogic.java */
/* loaded from: classes2.dex */
public class h extends t {

    /* renamed from: a, reason: collision with root package name */
    private float f1669a;

    /* renamed from: b, reason: collision with root package name */
    private float f1670b;

    /* renamed from: c, reason: collision with root package name */
    private float f1671c;

    /* renamed from: d, reason: collision with root package name */
    private float f1672d;

    /* renamed from: e, reason: collision with root package name */
    private float f1673e;

    /* renamed from: f, reason: collision with root package name */
    private float f1674f;

    /* renamed from: g, reason: collision with root package name */
    private float f1675g;

    /* renamed from: h, reason: collision with root package name */
    private float f1676h;

    /* renamed from: i, reason: collision with root package name */
    private float f1677i;

    /* renamed from: j, reason: collision with root package name */
    private int f1678j;

    /* renamed from: k, reason: collision with root package name */
    private String f1679k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f1680l = false;

    /* renamed from: m, reason: collision with root package name */
    private float f1681m;

    /* renamed from: n, reason: collision with root package name */
    private float f1682n;

    private float b(float f6) {
        float f7 = this.f1672d;
        if (f6 <= f7) {
            float f8 = this.f1669a;
            return ((((this.f1670b - f8) * f6) * f6) / (f7 * 2.0f)) + (f8 * f6);
        }
        int i5 = this.f1678j;
        if (i5 == 1) {
            return this.f1675g;
        }
        float f9 = f6 - f7;
        float f10 = this.f1673e;
        if (f9 < f10) {
            float f11 = this.f1675g;
            float f12 = this.f1670b;
            return ((((this.f1671c - f12) * f9) * f9) / (f10 * 2.0f)) + (f12 * f9) + f11;
        }
        if (i5 == 2) {
            return this.f1676h;
        }
        float f13 = f9 - f10;
        float f14 = this.f1674f;
        if (f13 >= f14) {
            return this.f1677i;
        }
        float f15 = this.f1676h;
        float f16 = this.f1671c;
        return ((f16 * f13) + f15) - (((f16 * f13) * f13) / (f14 * 2.0f));
    }

    private void f(float f6, float f7, float f8, float f9, float f10) {
        if (f6 == 0.0f) {
            f6 = 1.0E-4f;
        }
        this.f1669a = f6;
        float f11 = f6 / f8;
        float f12 = (f11 * f6) / 2.0f;
        if (f6 < 0.0f) {
            float sqrt = (float) Math.sqrt((f7 - ((((-f6) / f8) * f6) / 2.0f)) * f8);
            if (sqrt < f9) {
                this.f1679k = "backward accelerate, decelerate";
                this.f1678j = 2;
                this.f1669a = f6;
                this.f1670b = sqrt;
                this.f1671c = 0.0f;
                float f13 = (sqrt - f6) / f8;
                this.f1672d = f13;
                this.f1673e = sqrt / f8;
                this.f1675g = ((f6 + sqrt) * f13) / 2.0f;
                this.f1676h = f7;
                this.f1677i = f7;
                return;
            }
            this.f1679k = "backward accelerate cruse decelerate";
            this.f1678j = 3;
            this.f1669a = f6;
            this.f1670b = f9;
            this.f1671c = f9;
            float f14 = (f9 - f6) / f8;
            this.f1672d = f14;
            float f15 = f9 / f8;
            this.f1674f = f15;
            float f16 = ((f6 + f9) * f14) / 2.0f;
            float f17 = (f15 * f9) / 2.0f;
            this.f1673e = ((f7 - f16) - f17) / f9;
            this.f1675g = f16;
            this.f1676h = f7 - f17;
            this.f1677i = f7;
            return;
        }
        if (f12 >= f7) {
            this.f1679k = "hard stop";
            this.f1678j = 1;
            this.f1669a = f6;
            this.f1670b = 0.0f;
            this.f1675g = f7;
            this.f1672d = (2.0f * f7) / f6;
            return;
        }
        float f18 = f7 - f12;
        float f19 = f18 / f6;
        if (f19 + f11 < f10) {
            this.f1679k = "cruse decelerate";
            this.f1678j = 2;
            this.f1669a = f6;
            this.f1670b = f6;
            this.f1671c = 0.0f;
            this.f1675g = f18;
            this.f1676h = f7;
            this.f1672d = f19;
            this.f1673e = f11;
            return;
        }
        float sqrt2 = (float) Math.sqrt(((f6 * f6) / 2.0f) + (f8 * f7));
        float f20 = (sqrt2 - f6) / f8;
        this.f1672d = f20;
        float f21 = sqrt2 / f8;
        this.f1673e = f21;
        if (sqrt2 < f9) {
            this.f1679k = "accelerate decelerate";
            this.f1678j = 2;
            this.f1669a = f6;
            this.f1670b = sqrt2;
            this.f1671c = 0.0f;
            this.f1672d = f20;
            this.f1673e = f21;
            this.f1675g = ((f6 + sqrt2) * f20) / 2.0f;
            this.f1676h = f7;
            return;
        }
        this.f1679k = "accelerate cruse decelerate";
        this.f1678j = 3;
        this.f1669a = f6;
        this.f1670b = f9;
        this.f1671c = f9;
        float f22 = (f9 - f6) / f8;
        this.f1672d = f22;
        float f23 = f9 / f8;
        this.f1674f = f23;
        float f24 = ((f6 + f9) * f22) / 2.0f;
        float f25 = (f23 * f9) / 2.0f;
        this.f1673e = ((f7 - f24) - f25) / f9;
        this.f1675g = f24;
        this.f1676h = f7 - f25;
        this.f1677i = f7;
    }

    @Override // androidx.constraintlayout.motion.widget.t
    public float a() {
        return this.f1680l ? -e(this.f1682n) : e(this.f1682n);
    }

    public void c(float f6, float f7, float f8, float f9, float f10, float f11) {
        this.f1681m = f6;
        boolean z5 = f6 > f7;
        this.f1680l = z5;
        if (z5) {
            f(-f8, f6 - f7, f10, f11, f9);
        } else {
            f(f8, f7 - f6, f10, f11, f9);
        }
    }

    public void d(String str, String str2, float f6) {
    }

    public float e(float f6) {
        float f7;
        float f8;
        float f9 = this.f1672d;
        if (f6 <= f9) {
            f7 = this.f1669a;
            f8 = this.f1670b;
        } else {
            int i5 = this.f1678j;
            if (i5 == 1) {
                return 0.0f;
            }
            f6 -= f9;
            f9 = this.f1673e;
            if (f6 >= f9) {
                if (i5 == 2) {
                    return this.f1676h;
                }
                float f10 = f6 - f9;
                float f11 = this.f1674f;
                if (f10 >= f11) {
                    return this.f1677i;
                }
                float f12 = this.f1671c;
                return f12 - ((f10 * f12) / f11);
            }
            f7 = this.f1670b;
            f8 = this.f1671c;
        }
        return (((f8 - f7) * f6) / f9) + f7;
    }

    @Override // androidx.constraintlayout.motion.widget.t, android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        float b6 = b(f6);
        this.f1682n = f6;
        return this.f1680l ? this.f1681m - b6 : this.f1681m + b6;
    }
}
