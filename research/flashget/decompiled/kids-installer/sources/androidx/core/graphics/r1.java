package androidx.core.graphics;

import android.graphics.Color;
import android.graphics.ColorSpace;
import java.util.Objects;

/* compiled from: ColorUtils.java */
/* loaded from: classes.dex */
public final class r1 {

    /* renamed from: a, reason: collision with root package name */
    private static final double f4788a = 95.047d;

    /* renamed from: b, reason: collision with root package name */
    private static final double f4789b = 100.0d;

    /* renamed from: c, reason: collision with root package name */
    private static final double f4790c = 108.883d;

    /* renamed from: d, reason: collision with root package name */
    private static final double f4791d = 0.008856d;

    /* renamed from: e, reason: collision with root package name */
    private static final double f4792e = 903.3d;

    /* renamed from: f, reason: collision with root package name */
    private static final int f4793f = 10;

    /* renamed from: g, reason: collision with root package name */
    private static final int f4794g = 1;

    /* renamed from: h, reason: collision with root package name */
    private static final ThreadLocal<double[]> f4795h = new ThreadLocal<>();

    /* compiled from: ColorUtils.java */
    @androidx.annotation.x0(26)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static Color a(Color color, Color color2) {
            ColorSpace.Model model;
            ColorSpace.Model model2;
            ColorSpace.Model model3;
            ColorSpace.Model model4;
            ColorSpace colorSpace;
            ColorSpace colorSpace2;
            float[] components;
            float[] components2;
            float alpha;
            float alpha2;
            int componentCount;
            ColorSpace colorSpace3;
            Color valueOf;
            ColorSpace colorSpace4;
            model = color.getModel();
            model2 = color2.getModel();
            if (!Objects.equals(model, model2)) {
                StringBuilder sb = new StringBuilder("Color models must match (");
                model3 = color.getModel();
                sb.append(model3);
                sb.append(" vs. ");
                model4 = color2.getModel();
                sb.append(model4);
                sb.append(")");
                throw new IllegalArgumentException(sb.toString());
            }
            colorSpace = color2.getColorSpace();
            colorSpace2 = color.getColorSpace();
            if (!Objects.equals(colorSpace, colorSpace2)) {
                colorSpace4 = color2.getColorSpace();
                color = color.convert(colorSpace4);
            }
            components = color.getComponents();
            components2 = color2.getComponents();
            alpha = color.alpha();
            alpha2 = color2.alpha();
            float f6 = (1.0f - alpha) * alpha2;
            componentCount = color2.getComponentCount();
            int i5 = componentCount - 1;
            float f7 = alpha + f6;
            components2[i5] = f7;
            if (f7 > 0.0f) {
                alpha /= f7;
                f6 /= f7;
            }
            for (int i6 = 0; i6 < i5; i6++) {
                components2[i6] = (components2[i6] * f6) + (components[i6] * alpha);
            }
            colorSpace3 = color2.getColorSpace();
            valueOf = Color.valueOf(components2, colorSpace3);
            return valueOf;
        }
    }

    private r1() {
    }

    private static double A(double d6) {
        return d6 > f4791d ? Math.pow(d6, 0.3333333333333333d) : ((d6 * f4792e) + 16.0d) / 116.0d;
    }

    @androidx.annotation.l
    public static int B(@androidx.annotation.l int i5, @androidx.annotation.g0(from = 0, to = 255) int i6) {
        if (i6 < 0 || i6 > 255) {
            throw new IllegalArgumentException("alpha must be between 0 and 255.");
        }
        return (i5 & androidx.core.view.y1.f5757s) | (i6 << 24);
    }

    @androidx.annotation.l
    public static int a(@androidx.annotation.o0 float[] fArr) {
        int round;
        int round2;
        int round3;
        float f6 = fArr[0];
        float f7 = fArr[1];
        float f8 = fArr[2];
        float abs = (1.0f - Math.abs((f8 * 2.0f) - 1.0f)) * f7;
        float f9 = f8 - (0.5f * abs);
        float abs2 = (1.0f - Math.abs(((f6 / 60.0f) % 2.0f) - 1.0f)) * abs;
        switch (((int) f6) / 60) {
            case 0:
                round = Math.round((abs + f9) * 255.0f);
                round2 = Math.round((abs2 + f9) * 255.0f);
                round3 = Math.round(f9 * 255.0f);
                break;
            case 1:
                round = Math.round((abs2 + f9) * 255.0f);
                round2 = Math.round((abs + f9) * 255.0f);
                round3 = Math.round(f9 * 255.0f);
                break;
            case 2:
                round = Math.round(f9 * 255.0f);
                round2 = Math.round((abs + f9) * 255.0f);
                round3 = Math.round((abs2 + f9) * 255.0f);
                break;
            case 3:
                round = Math.round(f9 * 255.0f);
                round2 = Math.round((abs2 + f9) * 255.0f);
                round3 = Math.round((abs + f9) * 255.0f);
                break;
            case 4:
                round = Math.round((abs2 + f9) * 255.0f);
                round2 = Math.round(f9 * 255.0f);
                round3 = Math.round((abs + f9) * 255.0f);
                break;
            case 5:
            case 6:
                round = Math.round((abs + f9) * 255.0f);
                round2 = Math.round(f9 * 255.0f);
                round3 = Math.round((abs2 + f9) * 255.0f);
                break;
            default:
                round3 = 0;
                round = 0;
                round2 = 0;
                break;
        }
        return Color.rgb(x(round, 0, 255), x(round2, 0, 255), x(round3, 0, 255));
    }

    @androidx.annotation.l
    public static int b(@androidx.annotation.x(from = 0.0d, to = 100.0d) double d6, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d7, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d8) {
        double[] z5 = z();
        c(d6, d7, d8, z5);
        return g(z5[0], z5[1], z5[2]);
    }

    public static void c(@androidx.annotation.x(from = 0.0d, to = 100.0d) double d6, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d7, @androidx.annotation.x(from = -128.0d, to = 127.0d) double d8, @androidx.annotation.o0 double[] dArr) {
        double d9 = (d6 + 16.0d) / 116.0d;
        double d10 = (d7 / 500.0d) + d9;
        double d11 = d9 - (d8 / 200.0d);
        double pow = Math.pow(d10, 3.0d);
        if (pow <= f4791d) {
            pow = ((d10 * 116.0d) - 16.0d) / f4792e;
        }
        double pow2 = d6 > 7.9996247999999985d ? Math.pow(d9, 3.0d) : d6 / f4792e;
        double pow3 = Math.pow(d11, 3.0d);
        if (pow3 <= f4791d) {
            pow3 = ((d11 * 116.0d) - 16.0d) / f4792e;
        }
        dArr[0] = pow * f4788a;
        dArr[1] = pow2 * f4789b;
        dArr[2] = pow3 * f4790c;
    }

    public static void d(@androidx.annotation.g0(from = 0, to = 255) int i5, @androidx.annotation.g0(from = 0, to = 255) int i6, @androidx.annotation.g0(from = 0, to = 255) int i7, @androidx.annotation.o0 float[] fArr) {
        float f6;
        float abs;
        float f7 = i5 / 255.0f;
        float f8 = i6 / 255.0f;
        float f9 = i7 / 255.0f;
        float max = Math.max(f7, Math.max(f8, f9));
        float min = Math.min(f7, Math.min(f8, f9));
        float f10 = max - min;
        float f11 = (max + min) / 2.0f;
        if (max == min) {
            f6 = 0.0f;
            abs = 0.0f;
        } else {
            f6 = max == f7 ? ((f8 - f9) / f10) % 6.0f : max == f8 ? ((f9 - f7) / f10) + 2.0f : 4.0f + ((f7 - f8) / f10);
            abs = f10 / (1.0f - Math.abs((2.0f * f11) - 1.0f));
        }
        float f12 = (f6 * 60.0f) % 360.0f;
        if (f12 < 0.0f) {
            f12 += 360.0f;
        }
        fArr[0] = w(f12, 0.0f, 360.0f);
        fArr[1] = w(abs, 0.0f, 1.0f);
        fArr[2] = w(f11, 0.0f, 1.0f);
    }

    public static void e(@androidx.annotation.g0(from = 0, to = 255) int i5, @androidx.annotation.g0(from = 0, to = 255) int i6, @androidx.annotation.g0(from = 0, to = 255) int i7, @androidx.annotation.o0 double[] dArr) {
        f(i5, i6, i7, dArr);
        h(dArr[0], dArr[1], dArr[2], dArr);
    }

    public static void f(@androidx.annotation.g0(from = 0, to = 255) int i5, @androidx.annotation.g0(from = 0, to = 255) int i6, @androidx.annotation.g0(from = 0, to = 255) int i7, @androidx.annotation.o0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outXyz must have a length of 3.");
        }
        double d6 = i5 / 255.0d;
        double pow = d6 < 0.04045d ? d6 / 12.92d : Math.pow((d6 + 0.055d) / 1.055d, 2.4d);
        double d7 = i6 / 255.0d;
        double pow2 = d7 < 0.04045d ? d7 / 12.92d : Math.pow((d7 + 0.055d) / 1.055d, 2.4d);
        double d8 = i7 / 255.0d;
        double pow3 = d8 < 0.04045d ? d8 / 12.92d : Math.pow((d8 + 0.055d) / 1.055d, 2.4d);
        dArr[0] = ((0.1805d * pow3) + (0.3576d * pow2) + (0.4124d * pow)) * f4789b;
        dArr[1] = ((0.0722d * pow3) + (0.7152d * pow2) + (0.2126d * pow)) * f4789b;
        dArr[2] = ((pow3 * 0.9505d) + (pow2 * 0.1192d) + (pow * 0.0193d)) * f4789b;
    }

    @androidx.annotation.l
    public static int g(@androidx.annotation.x(from = 0.0d, to = 95.047d) double d6, @androidx.annotation.x(from = 0.0d, to = 100.0d) double d7, @androidx.annotation.x(from = 0.0d, to = 108.883d) double d8) {
        double d9 = (((-0.4986d) * d8) + (((-1.5372d) * d7) + (3.2406d * d6))) / f4789b;
        double d10 = ((0.0415d * d8) + ((1.8758d * d7) + ((-0.9689d) * d6))) / f4789b;
        double d11 = ((1.057d * d8) + (((-0.204d) * d7) + (0.0557d * d6))) / f4789b;
        return Color.rgb(x((int) Math.round((d9 > 0.0031308d ? (Math.pow(d9, 0.4166666666666667d) * 1.055d) - 0.055d : d9 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d10 > 0.0031308d ? (Math.pow(d10, 0.4166666666666667d) * 1.055d) - 0.055d : d10 * 12.92d) * 255.0d), 0, 255), x((int) Math.round((d11 > 0.0031308d ? (Math.pow(d11, 0.4166666666666667d) * 1.055d) - 0.055d : d11 * 12.92d) * 255.0d), 0, 255));
    }

    public static void h(@androidx.annotation.x(from = 0.0d, to = 95.047d) double d6, @androidx.annotation.x(from = 0.0d, to = 100.0d) double d7, @androidx.annotation.x(from = 0.0d, to = 108.883d) double d8, @androidx.annotation.o0 double[] dArr) {
        if (dArr.length != 3) {
            throw new IllegalArgumentException("outLab must have a length of 3.");
        }
        double A = A(d6 / f4788a);
        double A2 = A(d7 / f4789b);
        double A3 = A(d8 / f4790c);
        dArr[0] = Math.max(com.google.firebase.remoteconfig.p.f18289o, (116.0d * A2) - 16.0d);
        dArr[1] = (A - A2) * 500.0d;
        dArr[2] = (A2 - A3) * 200.0d;
    }

    @androidx.annotation.l
    public static int i(@androidx.annotation.l int i5, @androidx.annotation.l int i6, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f6) {
        float f7 = 1.0f - f6;
        return Color.argb((int) ((Color.alpha(i6) * f6) + (Color.alpha(i5) * f7)), (int) ((Color.red(i6) * f6) + (Color.red(i5) * f7)), (int) ((Color.green(i6) * f6) + (Color.green(i5) * f7)), (int) ((Color.blue(i6) * f6) + (Color.blue(i5) * f7)));
    }

    public static void j(@androidx.annotation.o0 float[] fArr, @androidx.annotation.o0 float[] fArr2, @androidx.annotation.x(from = 0.0d, to = 1.0d) float f6, @androidx.annotation.o0 float[] fArr3) {
        if (fArr3.length != 3) {
            throw new IllegalArgumentException("result must have a length of 3.");
        }
        float f7 = 1.0f - f6;
        fArr3[0] = o(fArr[0], fArr2[0], f6);
        fArr3[1] = (fArr2[1] * f6) + (fArr[1] * f7);
        fArr3[2] = (fArr2[2] * f6) + (fArr[2] * f7);
    }

    public static void k(@androidx.annotation.o0 double[] dArr, @androidx.annotation.o0 double[] dArr2, @androidx.annotation.x(from = 0.0d, to = 1.0d) double d6, @androidx.annotation.o0 double[] dArr3) {
        if (dArr3.length != 3) {
            throw new IllegalArgumentException("outResult must have a length of 3.");
        }
        double d7 = 1.0d - d6;
        dArr3[0] = (dArr2[0] * d6) + (dArr[0] * d7);
        dArr3[1] = (dArr2[1] * d6) + (dArr[1] * d7);
        dArr3[2] = (dArr2[2] * d6) + (dArr[2] * d7);
    }

    public static double l(@androidx.annotation.l int i5, @androidx.annotation.l int i6) {
        if (Color.alpha(i6) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i6));
        }
        if (Color.alpha(i5) < 255) {
            i5 = t(i5, i6);
        }
        double m5 = m(i5) + 0.05d;
        double m6 = m(i6) + 0.05d;
        return Math.max(m5, m6) / Math.min(m5, m6);
    }

    @androidx.annotation.x(from = com.google.firebase.remoteconfig.p.f18289o, to = 1.0d)
    public static double m(@androidx.annotation.l int i5) {
        double[] z5 = z();
        r(i5, z5);
        return z5[1] / f4789b;
    }

    public static int n(@androidx.annotation.l int i5, @androidx.annotation.l int i6, float f6) {
        int i7 = 255;
        if (Color.alpha(i6) != 255) {
            throw new IllegalArgumentException("background can not be translucent: #" + Integer.toHexString(i6));
        }
        double d6 = f6;
        if (l(B(i5, 255), i6) < d6) {
            return -1;
        }
        int i8 = 0;
        for (int i9 = 0; i9 <= 10 && i7 - i8 > 1; i9++) {
            int i10 = (i8 + i7) / 2;
            if (l(B(i5, i10), i6) < d6) {
                i8 = i10;
            } else {
                i7 = i10;
            }
        }
        return i7;
    }

    @androidx.annotation.m1
    static float o(float f6, float f7, float f8) {
        if (Math.abs(f7 - f6) > 180.0f) {
            if (f7 > f6) {
                f6 += 360.0f;
            } else {
                f7 += 360.0f;
            }
        }
        return (((f7 - f6) * f8) + f6) % 360.0f;
    }

    public static void p(@androidx.annotation.l int i5, @androidx.annotation.o0 float[] fArr) {
        d(Color.red(i5), Color.green(i5), Color.blue(i5), fArr);
    }

    public static void q(@androidx.annotation.l int i5, @androidx.annotation.o0 double[] dArr) {
        e(Color.red(i5), Color.green(i5), Color.blue(i5), dArr);
    }

    public static void r(@androidx.annotation.l int i5, @androidx.annotation.o0 double[] dArr) {
        f(Color.red(i5), Color.green(i5), Color.blue(i5), dArr);
    }

    private static int s(int i5, int i6) {
        return 255 - (((255 - i5) * (255 - i6)) / 255);
    }

    public static int t(@androidx.annotation.l int i5, @androidx.annotation.l int i6) {
        int alpha = Color.alpha(i6);
        int alpha2 = Color.alpha(i5);
        int s5 = s(alpha2, alpha);
        return Color.argb(s5, v(Color.red(i5), alpha2, Color.red(i6), alpha, s5), v(Color.green(i5), alpha2, Color.green(i6), alpha, s5), v(Color.blue(i5), alpha2, Color.blue(i6), alpha, s5));
    }

    @androidx.annotation.o0
    @androidx.annotation.x0(26)
    public static Color u(@androidx.annotation.o0 Color color, @androidx.annotation.o0 Color color2) {
        return a.a(color, color2);
    }

    private static int v(int i5, int i6, int i7, int i8, int i9) {
        if (i9 == 0) {
            return 0;
        }
        return (((255 - i6) * (i7 * i8)) + ((i5 * 255) * i6)) / (i9 * 255);
    }

    private static float w(float f6, float f7, float f8) {
        return f6 < f7 ? f7 : Math.min(f6, f8);
    }

    private static int x(int i5, int i6, int i7) {
        return i5 < i6 ? i6 : Math.min(i5, i7);
    }

    public static double y(@androidx.annotation.o0 double[] dArr, @androidx.annotation.o0 double[] dArr2) {
        return Math.sqrt(Math.pow(dArr[2] - dArr2[2], 2.0d) + Math.pow(dArr[1] - dArr2[1], 2.0d) + Math.pow(dArr[0] - dArr2[0], 2.0d));
    }

    private static double[] z() {
        ThreadLocal<double[]> threadLocal = f4795h;
        double[] dArr = threadLocal.get();
        if (dArr != null) {
            return dArr;
        }
        double[] dArr2 = new double[3];
        threadLocal.set(dArr2);
        return dArr2;
    }
}
