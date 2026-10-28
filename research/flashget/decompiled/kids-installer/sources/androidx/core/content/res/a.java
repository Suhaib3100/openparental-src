package androidx.core.content.res;

import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.core.graphics.r1;
import kotlin.jvm.internal.DoubleCompanionObject;

/* compiled from: CamColor.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: j, reason: collision with root package name */
    private static final float f4601j = 0.2f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f4602k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f4603l = 0.4f;

    /* renamed from: m, reason: collision with root package name */
    private static final float f4604m = 0.01f;

    /* renamed from: a, reason: collision with root package name */
    private final float f4605a;

    /* renamed from: b, reason: collision with root package name */
    private final float f4606b;

    /* renamed from: c, reason: collision with root package name */
    private final float f4607c;

    /* renamed from: d, reason: collision with root package name */
    private final float f4608d;

    /* renamed from: e, reason: collision with root package name */
    private final float f4609e;

    /* renamed from: f, reason: collision with root package name */
    private final float f4610f;

    /* renamed from: g, reason: collision with root package name */
    private final float f4611g;

    /* renamed from: h, reason: collision with root package name */
    private final float f4612h;

    /* renamed from: i, reason: collision with root package name */
    private final float f4613i;

    a(float f6, float f7, float f8, float f9, float f10, float f11, float f12, float f13, float f14) {
        this.f4605a = f6;
        this.f4606b = f7;
        this.f4607c = f8;
        this.f4608d = f9;
        this.f4609e = f10;
        this.f4610f = f11;
        this.f4611g = f12;
        this.f4612h = f13;
        this.f4613i = f14;
    }

    @q0
    private static a b(@x(from = 0.0d, to = 360.0d) float f6, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f7, @x(from = 0.0d, to = 100.0d) float f8) {
        float f9 = 100.0f;
        float f10 = 1000.0f;
        float f11 = 0.0f;
        a aVar = null;
        float f12 = 1000.0f;
        while (Math.abs(f11 - f9) > f4604m) {
            float f13 = ((f9 - f11) / 2.0f) + f11;
            int s5 = e(f13, f7, f6).s();
            float b6 = b.b(s5);
            float abs = Math.abs(f8 - b6);
            if (abs < 0.2f) {
                a c6 = c(s5);
                float a6 = c6.a(e(c6.k(), c6.i(), f6));
                if (a6 <= 1.0f) {
                    aVar = c6;
                    f10 = abs;
                    f12 = a6;
                }
            }
            if (f10 == 0.0f && f12 == 0.0f) {
                break;
            }
            if (b6 < f8) {
                f11 = f13;
            } else {
                f9 = f13;
            }
        }
        return aVar;
    }

    @o0
    static a c(@androidx.annotation.l int i5) {
        return d(i5, q.f4663k);
    }

    @o0
    static a d(@androidx.annotation.l int i5, @o0 q qVar) {
        float[] f6 = b.f(i5);
        float[][] fArr = b.f4614a;
        float f7 = f6[0];
        float[] fArr2 = fArr[0];
        float f8 = fArr2[0] * f7;
        float f9 = f6[1];
        float f10 = (fArr2[1] * f9) + f8;
        float f11 = f6[2];
        float f12 = (fArr2[2] * f11) + f10;
        float[] fArr3 = fArr[1];
        float f13 = (fArr3[2] * f11) + (fArr3[1] * f9) + (fArr3[0] * f7);
        float[] fArr4 = fArr[2];
        float f14 = (f11 * fArr4[2]) + (f9 * fArr4[1]) + (f7 * fArr4[0]);
        float f15 = qVar.i()[0] * f12;
        float f16 = qVar.i()[1] * f13;
        float f17 = qVar.i()[2] * f14;
        float pow = (float) Math.pow((Math.abs(f15) * qVar.c()) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f16) * qVar.c()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f17) * qVar.c()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f15) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f16) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f17) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d6 = signum3;
        float f18 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d6)) / 11.0f;
        float f19 = ((float) ((signum + signum2) - (d6 * 2.0d))) / 9.0f;
        float f20 = signum2 * 20.0f;
        float f21 = ((21.0f * signum3) + ((signum * 20.0f) + f20)) / 20.0f;
        float f22 = (((signum * 40.0f) + f20) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f19, f18)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f23 = atan2;
        float f24 = (3.1415927f * f23) / 180.0f;
        float pow4 = ((float) Math.pow((f22 * qVar.f()) / qVar.a(), qVar.b() * qVar.j())) * 100.0f;
        float a6 = (qVar.a() + 4.0f) * (4.0f / qVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * qVar.d();
        float pow5 = ((float) Math.pow(1.64d - Math.pow(0.29d, qVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) f23) < 20.14d ? 360.0f + f23 : f23) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * qVar.g()) * qVar.h()) * ((float) Math.sqrt((f19 * f19) + (f18 * f18)))) / (f21 + 0.305f), 0.9d)) * ((float) Math.sqrt(pow4 / 100.0d));
        float d7 = pow5 * qVar.d();
        float sqrt = ((float) Math.sqrt((r2 * qVar.b()) / (qVar.a() + 4.0f))) * 50.0f;
        float f25 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d7) + 1.0f)) * 43.85965f;
        double d8 = f24;
        return new a(f23, pow5, pow4, a6, d7, sqrt, f25, log * ((float) Math.cos(d8)), log * ((float) Math.sin(d8)));
    }

    @o0
    private static a e(@x(from = 0.0d, to = 100.0d) float f6, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f7, @x(from = 0.0d, to = 360.0d) float f8) {
        return f(f6, f7, f8, q.f4663k);
    }

    @o0
    private static a f(@x(from = 0.0d, to = 100.0d) float f6, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f7, @x(from = 0.0d, to = 360.0d) float f8, q qVar) {
        float a6 = (qVar.a() + 4.0f) * (4.0f / qVar.b()) * ((float) Math.sqrt(f6 / 100.0d)) * qVar.d();
        float d6 = f7 * qVar.d();
        float sqrt = ((float) Math.sqrt(((f7 / ((float) Math.sqrt(r4))) * qVar.b()) / (qVar.a() + 4.0f))) * 50.0f;
        float f9 = (1.7f * f6) / ((0.007f * f6) + 1.0f);
        float log = ((float) Math.log((d6 * 0.0228d) + 1.0d)) * 43.85965f;
        double d7 = (3.1415927f * f8) / 180.0f;
        return new a(f8, f7, f6, a6, d6, sqrt, f9, log * ((float) Math.cos(d7)), log * ((float) Math.sin(d7)));
    }

    static int p(@x(from = 0.0d, to = 360.0d) float f6, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f7, @x(from = 0.0d, to = 100.0d) float f8) {
        return q(f6, f7, f8, q.f4663k);
    }

    @androidx.annotation.l
    static int q(@x(from = 0.0d, to = 360.0d) float f6, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f7, @x(from = 0.0d, to = 100.0d) float f8, @o0 q qVar) {
        if (f7 < 1.0d || Math.round(f8) <= com.google.firebase.remoteconfig.p.f18289o || Math.round(f8) >= 100.0d) {
            return b.a(f8);
        }
        float min = f6 < 0.0f ? 0.0f : Math.min(360.0f, f6);
        a aVar = null;
        boolean z5 = true;
        float f9 = 0.0f;
        float f10 = f7;
        while (Math.abs(f9 - f7) >= f4603l) {
            a b6 = b(min, f10, f8);
            if (!z5) {
                if (b6 == null) {
                    f7 = f10;
                } else {
                    f9 = f10;
                    aVar = b6;
                }
                f10 = ((f7 - f9) / 2.0f) + f9;
            } else {
                if (b6 != null) {
                    return b6.r(qVar);
                }
                f10 = ((f7 - f9) / 2.0f) + f9;
                z5 = false;
            }
        }
        return aVar == null ? b.a(f8) : aVar.r(qVar);
    }

    float a(@o0 a aVar) {
        float l5 = l() - aVar.l();
        float g5 = g() - aVar.g();
        float h5 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((h5 * h5) + (g5 * g5) + (l5 * l5)), 0.63d) * 1.41d);
    }

    @x(from = DoubleCompanionObject.f23653e, fromInclusive = false, to = DoubleCompanionObject.f23652d, toInclusive = false)
    float g() {
        return this.f4612h;
    }

    @x(from = DoubleCompanionObject.f23653e, fromInclusive = false, to = DoubleCompanionObject.f23652d, toInclusive = false)
    float h() {
        return this.f4613i;
    }

    @x(from = com.google.firebase.remoteconfig.p.f18289o, to = DoubleCompanionObject.f23652d, toInclusive = false)
    float i() {
        return this.f4606b;
    }

    @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 360.0d, toInclusive = false)
    float j() {
        return this.f4605a;
    }

    @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 100.0d)
    float k() {
        return this.f4607c;
    }

    @x(from = com.google.firebase.remoteconfig.p.f18289o, to = 100.0d)
    float l() {
        return this.f4611g;
    }

    @x(from = com.google.firebase.remoteconfig.p.f18289o, to = DoubleCompanionObject.f23652d, toInclusive = false)
    float m() {
        return this.f4609e;
    }

    @x(from = com.google.firebase.remoteconfig.p.f18289o, to = DoubleCompanionObject.f23652d, toInclusive = false)
    float n() {
        return this.f4608d;
    }

    @x(from = com.google.firebase.remoteconfig.p.f18289o, to = DoubleCompanionObject.f23652d, toInclusive = false)
    float o() {
        return this.f4610f;
    }

    @androidx.annotation.l
    int r(@o0 q qVar) {
        float pow = (float) Math.pow(((((double) i()) == com.google.firebase.remoteconfig.p.f18289o || ((double) k()) == com.google.firebase.remoteconfig.p.f18289o) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, qVar.e()), 0.73d), 1.1111111111111112d);
        double j5 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j5) + 3.8d)) * 0.25f;
        float a6 = qVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / qVar.b()) / qVar.j()));
        float g5 = cos * 3846.1538f * qVar.g() * qVar.h();
        float f6 = a6 / qVar.f();
        float sin = (float) Math.sin(j5);
        float cos2 = (float) Math.cos(j5);
        float f7 = (((0.305f + f6) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (g5 * 23.0f)));
        float f8 = cos2 * f7;
        float f9 = f7 * sin;
        float f10 = f6 * 460.0f;
        float f11 = ((288.0f * f9) + ((451.0f * f8) + f10)) / 1403.0f;
        float f12 = ((f10 - (891.0f * f8)) - (261.0f * f9)) / 1403.0f;
        float f13 = ((f10 - (f8 * 220.0f)) - (f9 * 6300.0f)) / 1403.0f;
        float c6 = (100.0f / qVar.c()) * Math.signum(f11) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.p.f18289o, (Math.abs(f11) * 27.13d) / (400.0d - Math.abs(f11))), 2.380952380952381d));
        float c7 = (100.0f / qVar.c()) * Math.signum(f12) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.p.f18289o, (Math.abs(f12) * 27.13d) / (400.0d - Math.abs(f12))), 2.380952380952381d));
        float c8 = (100.0f / qVar.c()) * Math.signum(f13) * ((float) Math.pow((float) Math.max(com.google.firebase.remoteconfig.p.f18289o, (Math.abs(f13) * 27.13d) / (400.0d - Math.abs(f13))), 2.380952380952381d));
        float f14 = c6 / qVar.i()[0];
        float f15 = c7 / qVar.i()[1];
        float f16 = c8 / qVar.i()[2];
        float[][] fArr = b.f4615b;
        float[] fArr2 = fArr[0];
        float f17 = (fArr2[2] * f16) + (fArr2[1] * f15) + (fArr2[0] * f14);
        float[] fArr3 = fArr[1];
        float f18 = (fArr3[2] * f16) + (fArr3[1] * f15) + (fArr3[0] * f14);
        float[] fArr4 = fArr[2];
        return r1.g(f17, f18, (f16 * fArr4[2]) + (f15 * fArr4[1]) + (f14 * fArr4[0]));
    }

    @androidx.annotation.l
    int s() {
        return r(q.f4663k);
    }
}
