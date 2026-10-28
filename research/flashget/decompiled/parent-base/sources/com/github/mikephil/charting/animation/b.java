package com.github.mikephil.charting.animation;

import android.animation.TimeInterpolator;
import androidx.annotation.x0;

/* compiled from: Easing.java */
@x0(11)
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final float f50170a = 6.2831855f;

    /* renamed from: b, reason: collision with root package name */
    public static final c0 f50171b = new k();

    /* renamed from: c, reason: collision with root package name */
    public static final c0 f50172c = new u();

    /* renamed from: d, reason: collision with root package name */
    public static final c0 f50173d = new v();

    /* renamed from: e, reason: collision with root package name */
    public static final c0 f50174e = new w();

    /* renamed from: f, reason: collision with root package name */
    public static final c0 f50175f = new x();

    /* renamed from: g, reason: collision with root package name */
    public static final c0 f50176g = new y();

    /* renamed from: h, reason: collision with root package name */
    public static final c0 f50177h = new z();

    /* renamed from: i, reason: collision with root package name */
    public static final c0 f50178i = new a0();

    /* renamed from: j, reason: collision with root package name */
    public static final c0 f50179j = new b0();

    /* renamed from: k, reason: collision with root package name */
    public static final c0 f50180k = new a();

    /* renamed from: l, reason: collision with root package name */
    public static final c0 f50181l = new C0774b();

    /* renamed from: m, reason: collision with root package name */
    public static final c0 f50182m = new c();

    /* renamed from: n, reason: collision with root package name */
    public static final c0 f50183n = new d();

    /* renamed from: o, reason: collision with root package name */
    public static final c0 f50184o = new e();

    /* renamed from: p, reason: collision with root package name */
    public static final c0 f50185p = new f();

    /* renamed from: q, reason: collision with root package name */
    public static final c0 f50186q = new g();

    /* renamed from: r, reason: collision with root package name */
    public static final c0 f50187r = new h();

    /* renamed from: s, reason: collision with root package name */
    public static final c0 f50188s = new i();

    /* renamed from: t, reason: collision with root package name */
    public static final c0 f50189t = new j();

    /* renamed from: u, reason: collision with root package name */
    public static final c0 f50190u = new l();

    /* renamed from: v, reason: collision with root package name */
    public static final c0 f50191v = new m();

    /* renamed from: w, reason: collision with root package name */
    public static final c0 f50192w = new n();

    /* renamed from: x, reason: collision with root package name */
    public static final c0 f50193x = new o();

    /* renamed from: y, reason: collision with root package name */
    public static final c0 f50194y = new p();

    /* renamed from: z, reason: collision with root package name */
    public static final c0 f50195z = new q();
    public static final c0 A = new r();
    public static final c0 B = new s();
    public static final c0 C = new t();

    /* compiled from: Easing.java */
    static class a implements c0 {
        a() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float pow;
            float f5;
            float f6 = f4 * 2.0f;
            if (f6 < 1.0f) {
                pow = (float) Math.pow(f6, 4.0d);
                f5 = 0.5f;
            } else {
                pow = ((float) Math.pow(f6 - 2.0f, 4.0d)) - 2.0f;
                f5 = -0.5f;
            }
            return pow * f5;
        }
    }

    /* compiled from: Easing.java */
    static class a0 implements c0 {
        a0() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (float) Math.pow(f4, 4.0d);
        }
    }

    /* compiled from: Easing.java */
    /* renamed from: com.github.mikephil.charting.animation.b$b, reason: collision with other inner class name */
    static class C0774b implements c0 {
        C0774b() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (-((float) Math.cos(f4 * 1.5707963267948966d))) + 1.0f;
        }
    }

    /* compiled from: Easing.java */
    static class b0 implements c0 {
        b0() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return -(((float) Math.pow(f4 - 1.0f, 4.0d)) - 1.0f);
        }
    }

    /* compiled from: Easing.java */
    static class c implements c0 {
        c() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (float) Math.sin(f4 * 1.5707963267948966d);
        }
    }

    /* compiled from: Easing.java */
    public interface c0 extends TimeInterpolator {
        @Override // android.animation.TimeInterpolator
        float getInterpolation(float f4);
    }

    /* compiled from: Easing.java */
    static class d implements c0 {
        d() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (((float) Math.cos(f4 * 3.141592653589793d)) - 1.0f) * (-0.5f);
        }
    }

    /* compiled from: Easing.java */
    static class e implements c0 {
        e() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            if (f4 == 0.0f) {
                return 0.0f;
            }
            return (float) Math.pow(2.0d, (f4 - 1.0f) * 10.0f);
        }
    }

    /* compiled from: Easing.java */
    static class f implements c0 {
        f() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            if (f4 == 1.0f) {
                return 1.0f;
            }
            return -((float) Math.pow(2.0d, (f4 + 1.0f) * (-10.0f)));
        }
    }

    /* compiled from: Easing.java */
    static class g implements c0 {
        g() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            if (f4 == 0.0f) {
                return 0.0f;
            }
            if (f4 == 1.0f) {
                return 1.0f;
            }
            return (f4 * 2.0f < 1.0f ? (float) Math.pow(2.0d, (r9 - 1.0f) * 10.0f) : (-((float) Math.pow(2.0d, (r9 - 1.0f) * (-10.0f)))) + 2.0f) * 0.5f;
        }
    }

    /* compiled from: Easing.java */
    static class h implements c0 {
        h() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return -(((float) Math.sqrt(1.0f - (f4 * f4))) - 1.0f);
        }
    }

    /* compiled from: Easing.java */
    static class i implements c0 {
        i() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (float) Math.sqrt(1.0f - (f5 * f5));
        }
    }

    /* compiled from: Easing.java */
    static class j implements c0 {
        j() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float sqrt;
            float f5;
            float f6 = f4 * 2.0f;
            if (f6 < 1.0f) {
                sqrt = ((float) Math.sqrt(1.0f - (f6 * f6))) - 1.0f;
                f5 = -0.5f;
            } else {
                float f7 = f6 - 2.0f;
                sqrt = ((float) Math.sqrt(1.0f - (f7 * f7))) + 1.0f;
                f5 = 0.5f;
            }
            return sqrt * f5;
        }
    }

    /* compiled from: Easing.java */
    static class k implements c0 {
        k() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return f4;
        }
    }

    /* compiled from: Easing.java */
    static class l implements c0 {
        l() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            if (f4 == 0.0f) {
                return 0.0f;
            }
            if (f4 == 1.0f) {
                return 1.0f;
            }
            float f5 = f4 - 1.0f;
            return -(((float) Math.pow(2.0d, 10.0f * f5)) * ((float) Math.sin(((f5 - (0.047746483f * ((float) Math.asin(1.0d)))) * b.f50170a) / 0.3f)));
        }
    }

    /* compiled from: Easing.java */
    static class m implements c0 {
        m() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            if (f4 == 0.0f) {
                return 0.0f;
            }
            if (f4 == 1.0f) {
                return 1.0f;
            }
            return (((float) Math.pow(2.0d, (-10.0f) * f4)) * ((float) Math.sin(((f4 - (0.047746483f * ((float) Math.asin(1.0d)))) * b.f50170a) / 0.3f))) + 1.0f;
        }
    }

    /* compiled from: Easing.java */
    static class n implements c0 {
        n() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            if (f4 == 0.0f) {
                return 0.0f;
            }
            float f5 = f4 * 2.0f;
            if (f5 == 2.0f) {
                return 1.0f;
            }
            float asin = ((float) Math.asin(1.0d)) * 0.07161972f;
            if (f5 < 1.0f) {
                float f6 = f5 - 1.0f;
                return ((float) Math.pow(2.0d, 10.0f * f6)) * ((float) Math.sin(((f6 * 1.0f) - asin) * b.f50170a * 2.2222223f)) * (-0.5f);
            }
            float f7 = f5 - 1.0f;
            return (((float) Math.pow(2.0d, (-10.0f) * f7)) * 0.5f * ((float) Math.sin(((f7 * 1.0f) - asin) * b.f50170a * 2.2222223f))) + 1.0f;
        }
    }

    /* compiled from: Easing.java */
    static class o implements c0 {
        o() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return ((f4 * 2.70158f) - 1.70158f) * f4 * f4;
        }
    }

    /* compiled from: Easing.java */
    static class p implements c0 {
        p() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 - 1.0f;
            return (((f5 * 2.70158f) + 1.70158f) * f5 * f5) + 1.0f;
        }
    }

    /* compiled from: Easing.java */
    static class q implements c0 {
        q() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5;
            float f6 = f4 * 2.0f;
            if (f6 < 1.0f) {
                f5 = ((3.5949094f * f6) - 2.5949094f) * f6 * f6;
            } else {
                float f7 = f6 - 2.0f;
                f5 = (((3.5949094f * f7) + 2.5949094f) * f7 * f7) + 2.0f;
            }
            return f5 * 0.5f;
        }
    }

    /* compiled from: Easing.java */
    static class r implements c0 {
        r() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return 1.0f - b.B.getInterpolation(1.0f - f4);
        }
    }

    /* compiled from: Easing.java */
    static class s implements c0 {
        s() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            if (f4 < 0.36363637f) {
                return 7.5625f * f4 * f4;
            }
            if (f4 < 0.72727275f) {
                float f5 = f4 - 0.54545456f;
                return (7.5625f * f5 * f5) + 0.75f;
            }
            if (f4 < 0.90909094f) {
                float f6 = f4 - 0.8181818f;
                return (7.5625f * f6 * f6) + 0.9375f;
            }
            float f7 = f4 - 0.95454544f;
            return (7.5625f * f7 * f7) + 0.984375f;
        }
    }

    /* compiled from: Easing.java */
    static class t implements c0 {
        t() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return f4 < 0.5f ? b.A.getInterpolation(f4 * 2.0f) * 0.5f : (b.B.getInterpolation((f4 * 2.0f) - 1.0f) * 0.5f) + 0.5f;
        }
    }

    /* compiled from: Easing.java */
    static class u implements c0 {
        u() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return f4 * f4;
        }
    }

    /* compiled from: Easing.java */
    static class v implements c0 {
        v() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (f4 - 2.0f) * (-f4);
        }
    }

    /* compiled from: Easing.java */
    static class w implements c0 {
        w() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5;
            float f6 = f4 * 2.0f;
            if (f6 < 1.0f) {
                f5 = 0.5f * f6;
            } else {
                float f7 = f6 - 1.0f;
                f5 = ((f7 - 2.0f) * f7) - 1.0f;
                f6 = -0.5f;
            }
            return f5 * f6;
        }
    }

    /* compiled from: Easing.java */
    static class x implements c0 {
        x() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return (float) Math.pow(f4, 3.0d);
        }
    }

    /* compiled from: Easing.java */
    static class y implements c0 {
        y() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            return ((float) Math.pow(f4 - 1.0f, 3.0d)) + 1.0f;
        }
    }

    /* compiled from: Easing.java */
    static class z implements c0 {
        z() {
        }

        @Override // com.github.mikephil.charting.animation.b.c0, android.animation.TimeInterpolator
        public float getInterpolation(float f4) {
            float f5 = f4 * 2.0f;
            return (f5 < 1.0f ? (float) Math.pow(f5, 3.0d) : ((float) Math.pow(f5 - 2.0f, 3.0d)) + 2.0f) * 0.5f;
        }
    }
}
