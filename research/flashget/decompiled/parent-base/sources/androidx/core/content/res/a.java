package androidx.core.content.res;

import androidx.annotation.c1;
import androidx.annotation.e1;
import androidx.annotation.o0;
import androidx.annotation.q0;
import androidx.annotation.x;
import androidx.compose.material3.f4;
import androidx.core.graphics.z;
import com.google.firebase.remoteconfig.p;

/* compiled from: CamColor.java */
@c1({c1.a.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class a {

    /* renamed from: j, reason: collision with root package name */
    private static final float f26089j = 0.2f;

    /* renamed from: k, reason: collision with root package name */
    private static final float f26090k = 1.0f;

    /* renamed from: l, reason: collision with root package name */
    private static final float f26091l = 0.4f;

    /* renamed from: m, reason: collision with root package name */
    private static final float f26092m = 0.01f;

    /* renamed from: a, reason: collision with root package name */
    private final float f26093a;

    /* renamed from: b, reason: collision with root package name */
    private final float f26094b;

    /* renamed from: c, reason: collision with root package name */
    private final float f26095c;

    /* renamed from: d, reason: collision with root package name */
    private final float f26096d;

    /* renamed from: e, reason: collision with root package name */
    private final float f26097e;

    /* renamed from: f, reason: collision with root package name */
    private final float f26098f;

    /* renamed from: g, reason: collision with root package name */
    private final float f26099g;

    /* renamed from: h, reason: collision with root package name */
    private final float f26100h;

    /* renamed from: i, reason: collision with root package name */
    private final float f26101i;

    a(float f4, float f5, float f6, float f7, float f10, float f11, float f12, float f13, float f14) {
        this.f26093a = f4;
        this.f26094b = f5;
        this.f26095c = f6;
        this.f26096d = f7;
        this.f26097e = f10;
        this.f26098f = f11;
        this.f26099g = f12;
        this.f26100h = f13;
        this.f26101i = f14;
    }

    @q0
    private static a b(@x(from = 0.0d, to = 360.0d) float f4, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @x(from = 0.0d, to = 100.0d) float f6) {
        float f7 = 100.0f;
        float f10 = 1000.0f;
        float f11 = 0.0f;
        a aVar = null;
        float f12 = 1000.0f;
        while (Math.abs(f11 - f7) > 0.01f) {
            float f13 = ((f7 - f11) / 2.0f) + f11;
            o oVar = o.f26153k;
            int t4 = f(f13, f5, f4, oVar).t();
            float b5 = b.b(t4);
            float abs = Math.abs(f6 - b5);
            if (abs < 0.2f) {
                a c5 = c(t4);
                float a5 = c5.a(f(c5.k(), c5.i(), f4, oVar));
                if (a5 <= 1.0f) {
                    f12 = a5;
                    aVar = c5;
                    f10 = abs;
                }
            }
            if (f10 == 0.0f && f12 == 0.0f) {
                break;
            }
            if (b5 < f6) {
                f11 = f13;
            } else {
                f7 = f13;
            }
        }
        return aVar;
    }

    @o0
    static a c(@androidx.annotation.l int i4) {
        float[] fArr = new float[7];
        float[] fArr2 = new float[3];
        d(i4, o.f26153k, fArr, fArr2);
        return new a(fArr2[0], fArr2[1], fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6]);
    }

    static void d(@androidx.annotation.l int i4, @o0 o oVar, @e1(7) @q0 float[] fArr, @e1(3) @o0 float[] fArr2) {
        b.f(i4, fArr2);
        float[][] fArr3 = b.f26102a;
        float f4 = fArr2[0];
        float[] fArr4 = fArr3[0];
        float f5 = fArr4[0] * f4;
        float f6 = fArr2[1];
        float f7 = (fArr4[1] * f6) + f5;
        float f10 = fArr2[2];
        float f11 = (fArr4[2] * f10) + f7;
        float[] fArr5 = fArr3[1];
        float f12 = (fArr5[2] * f10) + (fArr5[1] * f6) + (fArr5[0] * f4);
        float[] fArr6 = fArr3[2];
        float f13 = (f10 * fArr6[2]) + (f6 * fArr6[1]) + (f4 * fArr6[0]);
        float f14 = oVar.i()[0] * f11;
        float f15 = oVar.i()[1] * f12;
        float f16 = oVar.i()[2] * f13;
        float pow = (float) Math.pow((Math.abs(f14) * oVar.c()) / 100.0d, 0.42d);
        float pow2 = (float) Math.pow((Math.abs(f15) * oVar.c()) / 100.0d, 0.42d);
        float pow3 = (float) Math.pow((Math.abs(f16) * oVar.c()) / 100.0d, 0.42d);
        float signum = ((Math.signum(f14) * 400.0f) * pow) / (pow + 27.13f);
        float signum2 = ((Math.signum(f15) * 400.0f) * pow2) / (pow2 + 27.13f);
        float signum3 = ((Math.signum(f16) * 400.0f) * pow3) / (pow3 + 27.13f);
        double d5 = signum3;
        float f17 = ((float) (((signum2 * (-12.0d)) + (signum * 11.0d)) + d5)) / 11.0f;
        float f18 = ((float) ((signum + signum2) - (d5 * 2.0d))) / 9.0f;
        float f19 = signum2 * 20.0f;
        float f20 = ((21.0f * signum3) + ((signum * 20.0f) + f19)) / 20.0f;
        float f21 = (((signum * 40.0f) + f19) + signum3) / 20.0f;
        float atan2 = (((float) Math.atan2(f18, f17)) * 180.0f) / 3.1415927f;
        if (atan2 < 0.0f) {
            atan2 += 360.0f;
        } else if (atan2 >= 360.0f) {
            atan2 -= 360.0f;
        }
        float f22 = (3.1415927f * atan2) / 180.0f;
        float pow4 = ((float) Math.pow((f21 * oVar.f()) / oVar.a(), oVar.b() * oVar.j())) * 100.0f;
        float a5 = (oVar.a() + 4.0f) * (4.0f / oVar.b()) * ((float) Math.sqrt(pow4 / 100.0f)) * oVar.d();
        float sqrt = ((float) Math.sqrt(pow4 / 100.0d)) * ((float) Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d)) * ((float) Math.pow((((((((float) (Math.cos((((((double) atan2) < 20.14d ? 360.0f + atan2 : atan2) * 3.141592653589793d) / 180.0d) + 2.0d) + 3.8d)) * 0.25f) * 3846.1538f) * oVar.g()) * oVar.h()) * ((float) Math.sqrt((f18 * f18) + (f17 * f17)))) / (f20 + 0.305f), 0.9d));
        float d6 = oVar.d() * sqrt;
        float sqrt2 = ((float) Math.sqrt((r7 * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f23 = (1.7f * pow4) / ((0.007f * pow4) + 1.0f);
        float log = ((float) Math.log((0.0228f * d6) + 1.0f)) * 43.85965f;
        double d7 = f22;
        float cos = ((float) Math.cos(d7)) * log;
        float sin = log * ((float) Math.sin(d7));
        fArr2[0] = atan2;
        fArr2[1] = sqrt;
        if (fArr != null) {
            fArr[0] = pow4;
            fArr[1] = a5;
            fArr[2] = d6;
            fArr[3] = sqrt2;
            fArr[4] = f23;
            fArr[5] = cos;
            fArr[6] = sin;
        }
    }

    @o0
    private static a e(@x(from = 0.0d, to = 100.0d) float f4, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @x(from = 0.0d, to = 360.0d) float f6) {
        return f(f4, f5, f6, o.f26153k);
    }

    @o0
    private static a f(@x(from = 0.0d, to = 100.0d) float f4, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @x(from = 0.0d, to = 360.0d) float f6, o oVar) {
        float a5 = (oVar.a() + 4.0f) * (4.0f / oVar.b()) * ((float) Math.sqrt(f4 / 100.0d)) * oVar.d();
        float d5 = f5 * oVar.d();
        float sqrt = ((float) Math.sqrt(((f5 / ((float) Math.sqrt(r4))) * oVar.b()) / (oVar.a() + 4.0f))) * 50.0f;
        float f7 = (1.7f * f4) / ((0.007f * f4) + 1.0f);
        float log = ((float) Math.log((d5 * 0.0228d) + 1.0d)) * 43.85965f;
        double d6 = (3.1415927f * f6) / 180.0f;
        return new a(f6, f5, f4, a5, d5, sqrt, f7, log * ((float) Math.cos(d6)), log * ((float) Math.sin(d6)));
    }

    public static void n(@androidx.annotation.l int i4, @e1(3) @o0 float[] fArr) {
        d(i4, o.f26153k, null, fArr);
        fArr[2] = b.b(i4);
    }

    public static int q(@x(from = 0.0d, to = 360.0d) float f4, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @x(from = 0.0d, to = 100.0d) float f6) {
        return r(f4, f5, f6, o.f26153k);
    }

    @androidx.annotation.l
    static int r(@x(from = 0.0d, to = 360.0d) float f4, @x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @x(from = 0.0d, to = 100.0d) float f6, @o0 o oVar) {
        if (f5 < 1.0d || Math.round(f6) <= p.f60679p || Math.round(f6) >= 100.0d) {
            return b.a(f6);
        }
        float min = f4 < 0.0f ? 0.0f : Math.min(360.0f, f4);
        a aVar = null;
        boolean z4 = true;
        float f7 = 0.0f;
        float f10 = f5;
        while (Math.abs(f7 - f5) >= 0.4f) {
            a b5 = b(min, f10, f6);
            if (!z4) {
                if (b5 == null) {
                    f5 = f10;
                } else {
                    f7 = f10;
                    aVar = b5;
                }
                f10 = ((f5 - f7) / 2.0f) + f7;
            } else {
                if (b5 != null) {
                    return b5.s(oVar);
                }
                f10 = ((f5 - f7) / 2.0f) + f7;
                z4 = false;
            }
        }
        return aVar == null ? b.a(f6) : aVar.s(oVar);
    }

    float a(@o0 a aVar) {
        float l4 = l() - aVar.l();
        float g4 = g() - aVar.g();
        float h4 = h() - aVar.h();
        return (float) (Math.pow(Math.sqrt((h4 * h4) + (g4 * g4) + (l4 * l4)), 0.63d) * 1.41d);
    }

    @x(from = kotlin.jvm.internal.x.NEGATIVE_INFINITY, fromInclusive = false, to = kotlin.jvm.internal.x.POSITIVE_INFINITY, toInclusive = false)
    float g() {
        return this.f26100h;
    }

    @x(from = kotlin.jvm.internal.x.NEGATIVE_INFINITY, fromInclusive = false, to = kotlin.jvm.internal.x.POSITIVE_INFINITY, toInclusive = false)
    float h() {
        return this.f26101i;
    }

    @x(from = p.f60679p, to = kotlin.jvm.internal.x.POSITIVE_INFINITY, toInclusive = false)
    float i() {
        return this.f26094b;
    }

    @x(from = p.f60679p, to = 360.0d, toInclusive = false)
    float j() {
        return this.f26093a;
    }

    @x(from = p.f60679p, to = 100.0d)
    float k() {
        return this.f26095c;
    }

    @x(from = p.f60679p, to = 100.0d)
    float l() {
        return this.f26099g;
    }

    @x(from = p.f60679p, to = kotlin.jvm.internal.x.POSITIVE_INFINITY, toInclusive = false)
    float m() {
        return this.f26097e;
    }

    @x(from = p.f60679p, to = kotlin.jvm.internal.x.POSITIVE_INFINITY, toInclusive = false)
    float o() {
        return this.f26096d;
    }

    @x(from = p.f60679p, to = kotlin.jvm.internal.x.POSITIVE_INFINITY, toInclusive = false)
    float p() {
        return this.f26098f;
    }

    @androidx.annotation.l
    int s(@o0 o oVar) {
        float pow = (float) Math.pow(((((double) i()) == p.f60679p || ((double) k()) == p.f60679p) ? 0.0f : i() / ((float) Math.sqrt(k() / 100.0d))) / Math.pow(1.64d - Math.pow(0.29d, oVar.e()), 0.73d), 1.1111111111111112d);
        double j4 = (j() * 3.1415927f) / 180.0f;
        float cos = ((float) (Math.cos(2.0d + j4) + 3.8d)) * 0.25f;
        float a5 = oVar.a() * ((float) Math.pow(k() / 100.0d, (1.0d / oVar.b()) / oVar.j()));
        float g4 = cos * 3846.1538f * oVar.g() * oVar.h();
        float f4 = a5 / oVar.f();
        float sin = (float) Math.sin(j4);
        float cos2 = (float) Math.cos(j4);
        float f5 = (((0.305f + f4) * 23.0f) * pow) / (((pow * 108.0f) * sin) + (((11.0f * pow) * cos2) + (g4 * 23.0f)));
        float f6 = cos2 * f5;
        float f7 = f5 * sin;
        float f10 = f4 * 460.0f;
        float a6 = f4.a(f7, 261.0f, f10 - (891.0f * f6), 1403.0f);
        float a7 = f4.a(f7, 6300.0f, f10 - (f6 * 220.0f), 1403.0f);
        float c5 = (100.0f / oVar.c()) * Math.signum(((288.0f * f7) + ((451.0f * f6) + f10)) / 1403.0f) * ((float) Math.pow((float) Math.max(p.f60679p, (Math.abs(r1) * 27.13d) / (400.0d - Math.abs(r1))), 2.380952380952381d));
        float c6 = (100.0f / oVar.c()) * Math.signum(a6) * ((float) Math.pow((float) Math.max(p.f60679p, (Math.abs(a6) * 27.13d) / (400.0d - Math.abs(a6))), 2.380952380952381d));
        float c7 = (100.0f / oVar.c()) * Math.signum(a7) * ((float) Math.pow((float) Math.max(p.f60679p, (Math.abs(a7) * 27.13d) / (400.0d - Math.abs(a7))), 2.380952380952381d));
        float f11 = c5 / oVar.i()[0];
        float f12 = c6 / oVar.i()[1];
        float f13 = c7 / oVar.i()[2];
        float[][] fArr = b.f26103b;
        float[] fArr2 = fArr[0];
        float f14 = (fArr2[2] * f13) + (fArr2[1] * f12) + (fArr2[0] * f11);
        float[] fArr3 = fArr[1];
        float f15 = (fArr3[2] * f13) + (fArr3[1] * f12) + (fArr3[0] * f11);
        float[] fArr4 = fArr[2];
        return z.h(f14, f15, (f13 * fArr4[2]) + (f12 * fArr4[1]) + (f11 * fArr4[0]));
    }

    @androidx.annotation.l
    int t() {
        return s(o.f26153k);
    }
}
