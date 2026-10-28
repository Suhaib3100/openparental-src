package androidx.constraintlayout.core.motion.utils;

import java.lang.reflect.Array;
import java.util.Arrays;

/* compiled from: MonotonicCurveFit.java */
/* loaded from: classes.dex */
public class l extends c {

    /* renamed from: i, reason: collision with root package name */
    private static final String f22280i = "MonotonicCurveFit";

    /* renamed from: d, reason: collision with root package name */
    private double[] f22281d;

    /* renamed from: e, reason: collision with root package name */
    private double[][] f22282e;

    /* renamed from: f, reason: collision with root package name */
    private double[][] f22283f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f22284g = true;

    /* renamed from: h, reason: collision with root package name */
    double[] f22285h;

    public l(double[] dArr, double[][] dArr2) {
        int length = dArr.length;
        int length2 = dArr2[0].length;
        this.f22285h = new double[length2];
        int i4 = length - 1;
        Class cls = Double.TYPE;
        double[][] dArr3 = (double[][]) Array.newInstance((Class<?>) cls, i4, length2);
        double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, length2);
        for (int i5 = 0; i5 < length2; i5++) {
            int i6 = 0;
            while (i6 < i4) {
                int i7 = i6 + 1;
                double d5 = dArr[i7] - dArr[i6];
                double[] dArr5 = dArr3[i6];
                double d6 = (dArr2[i7][i5] - dArr2[i6][i5]) / d5;
                dArr5[i5] = d6;
                if (i6 == 0) {
                    dArr4[i6][i5] = d6;
                } else {
                    dArr4[i6][i5] = (dArr3[i6 - 1][i5] + d6) * 0.5d;
                }
                i6 = i7;
            }
            dArr4[i4][i5] = dArr3[length - 2][i5];
        }
        for (int i10 = 0; i10 < i4; i10++) {
            for (int i11 = 0; i11 < length2; i11++) {
                double d7 = dArr3[i10][i11];
                if (d7 == com.google.firebase.remoteconfig.p.f60679p) {
                    dArr4[i10][i11] = 0.0d;
                    dArr4[i10 + 1][i11] = 0.0d;
                } else {
                    double d10 = dArr4[i10][i11] / d7;
                    int i12 = i10 + 1;
                    double d11 = dArr4[i12][i11] / d7;
                    double hypot = Math.hypot(d10, d11);
                    if (hypot > 9.0d) {
                        double d12 = 3.0d / hypot;
                        double[] dArr6 = dArr4[i10];
                        double[] dArr7 = dArr3[i10];
                        dArr6[i11] = d10 * d12 * dArr7[i11];
                        dArr4[i12][i11] = d12 * d11 * dArr7[i11];
                    }
                }
            }
        }
        this.f22281d = dArr;
        this.f22282e = dArr2;
        this.f22283f = dArr4;
    }

    public static l i(String str) {
        double[] dArr = new double[str.length() / 2];
        int indexOf = str.indexOf(40) + 1;
        int indexOf2 = str.indexOf(44, indexOf);
        int i4 = 0;
        while (indexOf2 != -1) {
            dArr[i4] = Double.parseDouble(str.substring(indexOf, indexOf2).trim());
            indexOf = indexOf2 + 1;
            indexOf2 = str.indexOf(44, indexOf);
            i4++;
        }
        dArr[i4] = Double.parseDouble(str.substring(indexOf, str.indexOf(41, indexOf)).trim());
        return j(Arrays.copyOf(dArr, i4 + 1));
    }

    private static l j(double[] dArr) {
        int length = (dArr.length * 3) - 2;
        int length2 = dArr.length - 1;
        double d5 = 1.0d / length2;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, length, 1);
        double[] dArr3 = new double[length];
        for (int i4 = 0; i4 < dArr.length; i4++) {
            double d6 = dArr[i4];
            int i5 = i4 + length2;
            dArr2[i5][0] = d6;
            double d7 = i4 * d5;
            dArr3[i5] = d7;
            if (i4 > 0) {
                int i6 = (length2 * 2) + i4;
                dArr2[i6][0] = d6 + 1.0d;
                dArr3[i6] = d7 + 1.0d;
                int i7 = i4 - 1;
                dArr2[i7][0] = (d6 - 1.0d) - d5;
                dArr3[i7] = (d7 - 1.0d) - d5;
            }
        }
        return new l(dArr3, dArr2);
    }

    private static double k(double d5, double d6, double d7, double d10, double d11, double d12) {
        double d13 = d6 * d6;
        double d14 = d6 * 6.0d;
        double d15 = 6.0d * d13 * d7;
        double d16 = 3.0d * d5;
        return (d5 * d11) + (((((d16 * d11) * d13) + (((d16 * d12) * d13) + ((d15 + ((d14 * d10) + (((-6.0d) * d13) * d10))) - (d14 * d7)))) - (((2.0d * d5) * d12) * d6)) - (((4.0d * d5) * d11) * d6));
    }

    private static double l(double d5, double d6, double d7, double d10, double d11, double d12) {
        double d13 = d6 * d6;
        double d14 = d13 * d6;
        double d15 = 3.0d * d13;
        double d16 = d14 * 2.0d * d7;
        double d17 = ((d16 + ((d15 * d10) + (((-2.0d) * d14) * d10))) - (d15 * d7)) + d7;
        double d18 = d5 * d12;
        double d19 = (d18 * d14) + d17;
        double d20 = d5 * d11;
        return (d20 * d6) + ((((d14 * d20) + d19) - (d18 * d13)) - (((2.0d * d5) * d11) * d13));
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double c(double d5, int i4) {
        double[] dArr = this.f22281d;
        int length = dArr.length;
        int i5 = 0;
        if (this.f22284g) {
            double d6 = dArr[0];
            if (d5 <= d6) {
                return (f(d6, i4) * (d5 - d6)) + this.f22282e[0][i4];
            }
            int i6 = length - 1;
            double d7 = dArr[i6];
            if (d5 >= d7) {
                return (f(d7, i4) * (d5 - d7)) + this.f22282e[i6][i4];
            }
        } else {
            if (d5 <= dArr[0]) {
                return this.f22282e[0][i4];
            }
            int i7 = length - 1;
            if (d5 >= dArr[i7]) {
                return this.f22282e[i7][i4];
            }
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.f22281d;
            double d10 = dArr2[i5];
            if (d5 == d10) {
                return this.f22282e[i5][i4];
            }
            int i10 = i5 + 1;
            double d11 = dArr2[i10];
            if (d5 < d11) {
                double d12 = d11 - d10;
                double d13 = (d5 - d10) / d12;
                double[][] dArr3 = this.f22282e;
                double d14 = dArr3[i5][i4];
                double d15 = dArr3[i10][i4];
                double[][] dArr4 = this.f22283f;
                return l(d12, d13, d14, d15, dArr4[i5][i4], dArr4[i10][i4]);
            }
            i5 = i10;
        }
        return com.google.firebase.remoteconfig.p.f60679p;
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public void d(double d5, double[] dArr) {
        double[] dArr2 = this.f22281d;
        int length = dArr2.length;
        int i4 = 0;
        int length2 = this.f22282e[0].length;
        if (this.f22284g) {
            double d6 = dArr2[0];
            if (d5 <= d6) {
                g(d6, this.f22285h);
                for (int i5 = 0; i5 < length2; i5++) {
                    dArr[i5] = ((d5 - this.f22281d[0]) * this.f22285h[i5]) + this.f22282e[0][i5];
                }
                return;
            }
            int i6 = length - 1;
            double d7 = dArr2[i6];
            if (d5 >= d7) {
                g(d7, this.f22285h);
                while (i4 < length2) {
                    dArr[i4] = ((d5 - this.f22281d[i6]) * this.f22285h[i4]) + this.f22282e[i6][i4];
                    i4++;
                }
                return;
            }
        } else {
            if (d5 <= dArr2[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    dArr[i7] = this.f22282e[0][i7];
                }
                return;
            }
            int i10 = length - 1;
            if (d5 >= dArr2[i10]) {
                while (i4 < length2) {
                    dArr[i4] = this.f22282e[i10][i4];
                    i4++;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            if (d5 == this.f22281d[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    dArr[i12] = this.f22282e[i11][i12];
                }
            }
            double[] dArr3 = this.f22281d;
            int i13 = i11 + 1;
            double d10 = dArr3[i13];
            if (d5 < d10) {
                double d11 = dArr3[i11];
                double d12 = d10 - d11;
                double d13 = (d5 - d11) / d12;
                while (i4 < length2) {
                    double[][] dArr4 = this.f22282e;
                    double d14 = dArr4[i11][i4];
                    double d15 = dArr4[i13][i4];
                    double[][] dArr5 = this.f22283f;
                    dArr[i4] = l(d12, d13, d14, d15, dArr5[i11][i4], dArr5[i13][i4]);
                    i4++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public void e(double d5, float[] fArr) {
        double[] dArr = this.f22281d;
        int length = dArr.length;
        int i4 = 0;
        int length2 = this.f22282e[0].length;
        if (this.f22284g) {
            double d6 = dArr[0];
            if (d5 <= d6) {
                g(d6, this.f22285h);
                for (int i5 = 0; i5 < length2; i5++) {
                    fArr[i5] = (float) (((d5 - this.f22281d[0]) * this.f22285h[i5]) + this.f22282e[0][i5]);
                }
                return;
            }
            int i6 = length - 1;
            double d7 = dArr[i6];
            if (d5 >= d7) {
                g(d7, this.f22285h);
                while (i4 < length2) {
                    fArr[i4] = (float) (((d5 - this.f22281d[i6]) * this.f22285h[i4]) + this.f22282e[i6][i4]);
                    i4++;
                }
                return;
            }
        } else {
            if (d5 <= dArr[0]) {
                for (int i7 = 0; i7 < length2; i7++) {
                    fArr[i7] = (float) this.f22282e[0][i7];
                }
                return;
            }
            int i10 = length - 1;
            if (d5 >= dArr[i10]) {
                while (i4 < length2) {
                    fArr[i4] = (float) this.f22282e[i10][i4];
                    i4++;
                }
                return;
            }
        }
        int i11 = 0;
        while (i11 < length - 1) {
            if (d5 == this.f22281d[i11]) {
                for (int i12 = 0; i12 < length2; i12++) {
                    fArr[i12] = (float) this.f22282e[i11][i12];
                }
            }
            double[] dArr2 = this.f22281d;
            int i13 = i11 + 1;
            double d10 = dArr2[i13];
            if (d5 < d10) {
                double d11 = dArr2[i11];
                double d12 = d10 - d11;
                double d13 = (d5 - d11) / d12;
                while (i4 < length2) {
                    double[][] dArr3 = this.f22282e;
                    double d14 = dArr3[i11][i4];
                    double d15 = dArr3[i13][i4];
                    double[][] dArr4 = this.f22283f;
                    fArr[i4] = (float) l(d12, d13, d14, d15, dArr4[i11][i4], dArr4[i13][i4]);
                    i4++;
                }
                return;
            }
            i11 = i13;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double f(double d5, int i4) {
        double[] dArr = this.f22281d;
        int length = dArr.length;
        int i5 = 0;
        double d6 = dArr[0];
        if (d5 >= d6) {
            d6 = dArr[length - 1];
            if (d5 < d6) {
                d6 = d5;
            }
        }
        while (i5 < length - 1) {
            double[] dArr2 = this.f22281d;
            int i6 = i5 + 1;
            double d7 = dArr2[i6];
            if (d6 <= d7) {
                double d10 = dArr2[i5];
                double d11 = d7 - d10;
                double[][] dArr3 = this.f22282e;
                double d12 = dArr3[i5][i4];
                double d13 = dArr3[i6][i4];
                double[][] dArr4 = this.f22283f;
                return k(d11, (d6 - d10) / d11, d12, d13, dArr4[i5][i4], dArr4[i6][i4]) / d11;
            }
            i5 = i6;
        }
        return com.google.firebase.remoteconfig.p.f60679p;
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public void g(double d5, double[] dArr) {
        double[] dArr2 = this.f22281d;
        int length = dArr2.length;
        int length2 = this.f22282e[0].length;
        double d6 = dArr2[0];
        if (d5 > d6) {
            d6 = dArr2[length - 1];
            if (d5 < d6) {
                d6 = d5;
            }
        }
        int i4 = 0;
        while (i4 < length - 1) {
            double[] dArr3 = this.f22281d;
            int i5 = i4 + 1;
            double d7 = dArr3[i5];
            if (d6 <= d7) {
                double d10 = dArr3[i4];
                double d11 = d7 - d10;
                double d12 = (d6 - d10) / d11;
                for (int i6 = 0; i6 < length2; i6++) {
                    double[][] dArr4 = this.f22282e;
                    double d13 = dArr4[i4][i6];
                    double d14 = dArr4[i5][i6];
                    double[][] dArr5 = this.f22283f;
                    dArr[i6] = k(d11, d12, d13, d14, dArr5[i4][i6], dArr5[i5][i6]) / d11;
                }
                return;
            }
            i4 = i5;
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.c
    public double[] h() {
        return this.f22281d;
    }
}
