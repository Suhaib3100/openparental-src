package androidx.core.graphics;

import android.graphics.Color;
import androidx.annotation.m1;
import java.util.Objects;

/* compiled from: ColorUtils.java */
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final double f26319a = 95.047d;

    /* renamed from: b, reason: collision with root package name */
    private static final double f26320b = 100.0d;

    /* renamed from: c, reason: collision with root package name */
    private static final double f26321c = 108.883d;

    /* renamed from: d, reason: collision with root package name */
    private static final double f26322d = 0.008856d;

    /* renamed from: e, reason: collision with root package name */
    private static final double f26323e = 903.3d;

    /* renamed from: f, reason: collision with root package name */
    private static final int f26324f = 10;

    /* renamed from: g, reason: collision with root package name */
    private static final int f26325g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<double[]> f26326h = new ThreadLocal<>();

    /* compiled from: ColorUtils.java */
    @androidx.annotation.x0(26)
    static class a {
        private a() {
        }

        static Color a(Color color, Color color2) {
            if (!Objects.equals(color.getModel(), color2.getModel())) {
                throw new IllegalArgumentException("Color models must match (" + color.getModel() + " vs. " + color2.getModel() + ")");
            }
            if (!Objects.equals(color2.getColorSpace(), color.getColorSpace())) {
                color = color.convert(color2.getColorSpace());
            }
            float[] components = color.getComponents();
            float[] components2 = color2.getComponents();
            float alpha = color.alpha();
            float alpha2 = (1.0f - alpha) * color2.alpha();
            int componentCount = color2.getComponentCount() - 1;
            float f4 = alpha + alpha2;
            components2[componentCount] = f4;
            if (f4 > 0.0f) {
                alpha /= f4;
                alpha2 /= f4;
            }
            for (int i4 = 0; i4 < componentCount; i4++) {
                components2[i4] = (components2[i4] * alpha2) + (components[i4] * alpha);
            }
            return Color.valueOf(components2, color2.getColorSpace());
        }
    }

    private z() {
    }

    public static double A(@androidx.annotation.o0 double[] dArr, @androidx.annotation.o0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    private static double[] B() {
        ThreadLocal<double[]> threadLocal = f26326h;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }

    private static double C(double d5) {
        return d5 > f26322d ? Math.pow(d5, 0.3333333333333333d) : ((d5 * f26323e) + 16.0d) / 116.0d;
    }

    @androidx.annotation.l
    public static int D(@androidx.annotation.l int i4, @androidx.annotation.g0(from = 0, to = 255) int i5) {
        if (i5 < 0 || i5 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i4 & 16777215) | (i5 << 24);
    }

    @androidx.annotation.l
    public static int a(@androidx.annotation.o0 float[] fArr) {
        int round;
        int round2;
        int round3;
        float f4 = fArr[0];
        float f5 = fArr[1];
        float f6 = fArr[2];
        float abs = (1.0f - Math.abs((f6 * 2.0f) - 1.0f)) * f5;
        float f7 = f6 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f4 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f4) / 60) {
            case 0:
                round = Math.round((abs + f7) * 255.0f);
                round2 = Math.round((abs2 + f7) * 255.0f);
                round3 = Math.round(f7 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f7) * 255.0f);
                round2 = Math.round((abs + f7) * 255.0f);
                round3 = Math.round(f7 * 255.0f);
                break;
            case 2:
                round = Math.round(f7 * 255.0f);
                round2 = Math.round((abs + f7) * 255.0f);
                round3 = Math.round((abs2 + f7) * 255.0f);
                break;
            case 3:
                round = Math.round(f7 * 255.0f);
                round2 = Math.round((abs2 + f7) * 255.0f);
                round3 = Math.round((abs + f7) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f7) * 255.0f);
                round2 = Math.round(f7 * 255.0f);
                round3 = Math.round((abs + f7) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f7) * 255.0f);
                round2 = Math.round(f7 * 255.0f);
                round3 = Math.round((abs2 + f7) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(z(round, 0, 255), z(round2, 0, 255), z(round3, 0, 255));
    }

    @androidx.annotation.l
    public static int b(@androidx.annotation.x(from = 0.0d, to = 100.0d) double d5, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d6, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d7) {
        double[] B = B();
        c(d5, d6, d7, B);
        return h(B[0], B[1], B[2]);
    }

    public static void c(@androidx.annotation.x(from = 0.0d, to = 100.0d) double d5, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d6, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d7, @androidx.annotation.o0 double[] dArr) {
        double d10 = (d5 + 16.0d) / 116.0d;
        double d11 = (d6 / 500.0d) + d10;
        double d12 = d10 - (d7 / 200.0d);
        double pow = Math.pow(d11, 3.0d);
        if (pow <= f26322d) {
            pow = ((d11 * 116.0d) - 16.0d) / f26323e;
        }
        double pow2 = d5 > 7.9996247999999985d ? Math.pow(d10, 3.0d) : d5 / f26323e;
        double pow3 = Math.pow(d12, 3.0d);
        if (pow3 <= f26322d) {
            pow3 = ((d12 * 116.0d) - 16.0d) / f26323e;
        }
        dArr[0] = pow * f26319a;
        dArr[1] = pow2 * 100.0d;
        dArr[2] = pow3 * f26321c;
    }

    @androidx.annotation.l
    public static int d(@androidx.annotation.x(from = 0.0d, to = 360.0d, toInclusive = false) float f4, @androidx.annotation.x(from = 0.0d, to = Double.POSITIVE_INFINITY, toInclusive = false) float f5, @androidx.annotation.x(from = 0.0d, to = 100.0d) float f6) {
        return androidx.core.content.res.a.q(f4, f5, f6);
    }

    public static void e(@androidx.annotation.g0(from = 0, to = 255) int i4, @androidx.annotation.g0(from = 0, to = 255) int i5, @androidx.annotation.g0(from = 0, to = 255) int i6, @androidx.annotation.o0 float[] fArr) {
        float f4;
        float abs;
        float f5 = i4 / 255.0f;
        float f6 = i5 / 255.0f;
        float f7 = i6 / 255.0f;
        float max = Math.max(f5, Math.max(f6, f7));
        float min = Math.min(f5, Math.min(f6, f7));
        float f10 = max - min;
        float f11 = (max + min) / 2.0f;
        if (max == min) {
            f4 = 0.0f;
            abs = 0.0f;
        } else {
            f4 = max == f5 ? ((f6 - f7) / f10) % 6.0f : max == f6 ? ((f7 - f5) / f10) + 2.0f : 4.0f + ((f5 - f6) / f10);
            abs = f10 / (1.0f - Math.abs((2.0f * f11) - 1.0f));
        }
        float f12 = (f4 * 60.0f) % 360.0f;
        if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        fArr[0] = y(f12, 0.0f, 360.0f);
        fArr[1] = y(abs, 0.0f, 1.0f);
        fArr[2] = y(f11, 0.0f, 1.0f);
    }

    public static void f(@androidx.annotation.g0(from = 0, to = 255) int i4, @androidx.annotation.g0(from = 0, to = 255) int i5, @androidx.annotation.g0(from = 0, to = 255) int i6, @androidx.annotation.o0 double[] dArr) {
        g(i4, i5, i6, dArr);
        i(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void g(@androidx.annotation.g0(from = 0, to = 255) int i4, @androidx.annotation.g0(from = 0, to = 255) int i5, @androidx.annotation.g0(from = 0, to = 255) int i6, @androidx.annotation.o0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d5 = i4 / 255.0d;
        double pow = d5 < 0.04045d ? d5 / 12.92d : Math.pow((d5 + 0.055d) / 1.055d, 2.4d);
        double d6 = i5 / 255.0d;
        double pow2 = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d7 = i6 / 255.0d;
        double pow3 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * 100.0d;
        dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * 100.0d;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * 100.0d;
    }

    @androidx.annotation.l
    public static int h(@androidx.annotation.x(from = 0.0d, to = 95.047d) double d5, @androidx.annotation.x(from = 0.0d, to = 100.0d) double d6, @androidx.annotation.x(from = 0.0d, to = 108.883d) double d7) {
        double d10 = (((-0.4986d) * d7) + (((-1.5372d) * d6) + (3.2406d * d5))) / 100.0d;
        double d11 = ((0.0415d * d7) + ((1.8758d * d6) + ((-0.9689d) * d5))) / 100.0d;
        double d12 = ((1.057d * d7) + (((-0.204d) * d6) + (0.0557d * d5))) / 100.0d;
        return Color.rgb(z((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), z((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255), z((int) Math.round((d12 > 0.0031308d ? (Math.pow(d12, 0.4166666666666667d) * 1.055d) - 0.055d : d12 * 12.92d) * 255.0d), 0, 255));
    }

    public static void i(@androidx.annotation.x(from = 0.0d, to = 95.047d) double d5, @androidx.annotation.x(from = 0.0d, to = 100.0d) double d6, @androidx.annotation.x(from = 0.0d, to = 108.883d) double d7, @androidx.annotation.o0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double C = C(d5 / f26319a);
        double C2 = C(d6 / 100.0d);
        double C3 = C(d7 / f26321c);
        dArr[0] = Math.max(com.google.firebase.remoteconfig.p.f60679p, (116.0d * C2) - 16.0d);
        dArr[1] = (C - C2) * 500.0d;
        dArr[2] = (C2 - C3) * 200.0d;
    }

    @androidx.annotation.l
    public static int j(@androidx.annotation.l int i4, @androidx.annotation.l int i5, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4) {
        float f5 = 1.0f - f4;
        return Color.argb((int) ((Color.alpha(i5) * f4) + (Color.alpha(i4) * f5)), (int) ((Color.red(i5) * f4) + (Color.red(i4) * f5)), (int) ((Color.green(i5) * f4) + (Color.green(i4) * f5)), (int) ((Color.blue(i5) * f4) + (Color.blue(i4) * f5)));
    }

    public static void k(@androidx.annotation.o0 float[] fArr, @androidx.annotation.o0 float[] fArr2, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f4, @androidx.annotation.o0 float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f5 = 1.0f - f4;
        fArr3[0] = p(fArr[0], fArr2[0], f4);
        fArr3[1] = (fArr2[1] * f4) + (fArr[1] * f5);
        fArr3[2] = (fArr2[2] * f4) + (fArr[2] * f5);
    }

    public static void l(@androidx.annotation.o0 double[] dArr, @androidx.annotation.o0 double[] dArr2, @androidx.annotation.x(from = 0.0d, to = 1.0d) double d5, @androidx.annotation.o0 double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d6 = 1.0d - d5;
        dArr3[0] = (dArr2[0] * d5) + (dArr[0] * d6);
        dArr3[1] = (dArr2[1] * d5) + (dArr[1] * d6);
        dArr3[2] = (dArr2[2] * d5) + (dArr[2] * d6);
    }

    public static double m(@androidx.annotation.l int i4, @androidx.annotation.l int i5) {
        if (Color.alpha(i5) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i5));
        }
        if (Color.alpha(i4) < 255) {
            i4 = v(i4, i5);
        }
        double n4 = n(i4) + 0.05d;
        double n5 = n(i5) + 0.05d;
        return Math.max(n4, n5) / Math.min(n4, n5);
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f60679p, to = 1.0d)
    public static double n(@androidx.annotation.l int i4) {
        double[] B = B();
        t(i4, B);
        return B[1] / 100.0d;
    }

    public static int o(@androidx.annotation.l int i4, @androidx.annotation.l int i5, float f4) {
        int i6 = 255;
        if (Color.alpha(i5) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i5));
        }
        double d5 = f4;
        if (m(D(i4, 255), i5) < d5) {
            return -1;
        }
        int i7 = 0;
        for (int i10 = 0; i10 <= 10 && i6 - i7 > 1; i10++) {
            int i11 = (i7 + i6) / 2;
            if (m(D(i4, i11), i5) < d5) {
                i7 = i11;
            } else {
                i6 = i11;
            }
        }
        return i6;
    }

    @m1
    static float p(float f4, float f5, float f6) {
        if (Math.abs(f5 - f4) > 180.0f) {
            if (f5 > f4) {
                f4 += 360.0f;
            } else {
                f5 += 360.0f;
            }
        }
        return (((f5 - f4) * f6) + f4) % 360.0f;
    }

    public static void q(@androidx.annotation.l int i4, @androidx.annotation.o0 float[] fArr) {
        e(Color.red(i4), Color.green(i4), Color.blue(i4), fArr);
    }

    public static void r(@androidx.annotation.l int i4, @androidx.annotation.o0 double[] dArr) {
        f(Color.red(i4), Color.green(i4), Color.blue(i4), dArr);
    }

    public static void s(@androidx.annotation.l int i4, @androidx.annotation.e1(3) @androidx.annotation.o0 float[] fArr) {
        androidx.core.content.res.a.n(i4, fArr);
    }

    public static void t(@androidx.annotation.l int i4, @androidx.annotation.o0 double[] dArr) {
        g(Color.red(i4), Color.green(i4), Color.blue(i4), dArr);
    }

    private static int u(int i4, int i5) {
        return 255 - (((255 - i4) * (255 - i5)) / 255);
    }

    public static int v(@androidx.annotation.l int i4, @androidx.annotation.l int i5) {
        int alpha = Color.alpha(i5);
        int alpha2 = Color.alpha(i4);
        int u4 = u(alpha2, alpha);
        return Color.argb(u4, x(Color.red(i4), alpha2, Color.red(i5), alpha, u4), x(Color.green(i4), alpha2, Color.green(i5), alpha, u4), x(Color.blue(i4), alpha2, Color.blue(i5), alpha, u4));
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static Color w(@androidx.annotation.o0 Color color, @androidx.annotation.o0 Color color2) {
        return a.a(color, color2);
    }

    private static int x(int i4, int i5, int i6, int i7, int i10) {
        if (i10 == 0) {
            return 0;
        }
        return y.a(255, i5, i6 * i7, (i4 * 255) * i5) / (i10 * 255);
    }

    private static float y(float f4, float f5, float f6) {
        return f4 < f5 ? f5 : Math.min(f4, f6);
    }

    private static int z(int i4, int i5, int i6) {
        return i4 < i5 ? i5 : Math.min(i4, i6);
    }
}
